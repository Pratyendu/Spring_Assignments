package com.library.LibraryAPP.controller;

import com.library.LibraryAPP.model.Library;
import com.library.LibraryAPP.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/library-app")
public class LibraryController {
    @Autowired
    private LibraryService libraryService;
    @PostMapping("add-library")
    public void addLibrary(@RequestBody Library library){
        libraryService.addLibrary(library);
    }

    @GetMapping("view-all")
    public List<Library> viewAll(){
        return libraryService.getAll();
    }

    @GetMapping("getByName/name/{name}")
    public Library getByName(@PathVariable String name){
        return libraryService.getLibraryByName(name);
    }

    @DeleteMapping("delete-library/name/{name}")
    public void deleteLibrary(@PathVariable String name){
        libraryService.deleteLibrary(name);
    }

    @PutMapping("update-library/name/{name}")
    public void updateLibrary(@PathVariable String name, @RequestBody Library library){
        libraryService.updateLibrary(name, library);
    }
}
