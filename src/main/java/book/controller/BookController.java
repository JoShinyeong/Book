package book.controller;

import java.io.File;
import java.io.IOException;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import book.domain.BookVO;
import book.domain.Bookcommand;
import book.service.BookService;

@Controller
public class BookController {
	private BookService bookService;

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	@RequestMapping(value = "/book/list")
	public String list(Model model) {
		model.addAttribute("booklist", bookService.list());
		return "/book/list";
	}

	@RequestMapping(value = "/book/read/{seq}")
	public String read(Model model, @PathVariable int seq) {
		model.addAttribute("bookVO", bookService.read(seq));
		return "/book/read";
	}

	@RequestMapping(value = "/book/add", method = RequestMethod.GET)
	public String write(Model model) {
		model.addAttribute("bookCmd", new Bookcommand());
		return "/book/add";
	}

	@RequestMapping(value = "/book/add", method = RequestMethod.POST)
	public String write(@Valid @ModelAttribute("bookCmd") Bookcommand bookCmd, BindingResult bindingResult,
			MultipartHttpServletRequest request) {
		if (bindingResult.hasErrors()) {
			return "/book/add";
		}

		MultipartFile mf = bookCmd.getImage();
		String path = request.getServletContext().getRealPath("/upload");
		System.out.println(path);
		String fileName = mf.getOriginalFilename();
		File uploadFile = new File(path + "//" + fileName);
		try {
			mf.transferTo(uploadFile);

		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		BookVO vo = new BookVO(bookCmd.getBookisbn(), bookCmd.getBook(), bookCmd.getWriter(), bookCmd.getPublisher(),
				bookCmd.getPrice(), fileName, bookCmd.getContent());

		bookService.write(vo);

		return "redirect:/book/list";
	}
	

}
