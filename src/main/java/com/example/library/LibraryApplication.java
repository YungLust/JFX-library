package com.example.library;

import com.example.library.view.LibraryGUI;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {
		Application.launch(LibraryGUI.class,args);
	}

}
