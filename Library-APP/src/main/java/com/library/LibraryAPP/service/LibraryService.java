package com.library.LibraryAPP.service;

import com.library.LibraryAPP.LibraryAppApplication;
import com.library.LibraryAPP.model.Library;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService {
    private static List<Library> libraries = new ArrayList<>();

    static {
        libraries.add(new Library("HITK","Anandapur,Kolkata",29 ,
                List.of("Low Annual MemberShip","Due Period of 2months","Huge Collection of Books")));
    }
    public void addLibrary(Library library){
        libraries.add(library);
    }

    public List<Library> getAll(){
        return libraries;
    }

    public Library getLibraryByName(String libraryName){
        for(Library library : libraries){
            if(library.getLibraryName().equals(libraryName)) return library;
        }
        return null;
    }

    public void deleteLibrary(String libraryName){
        for(int idx = 0 ; idx < libraries.size(); idx++){
            if(libraries.get(idx).getLibraryName().equals(libraryName)) libraries.remove(idx);
        }
    }
    public void updateLibrary(String libraryName , Library newLibrary){
        Library library = getLibraryByName(libraryName);

        library.setLibraryName(newLibrary.getLibraryName());
        library.setLibraryAddress(newLibrary.getLibraryAddress());
        library.setLibraryNumber(newLibrary.getLibraryNumber());
        library.setLibraryFacilities(newLibrary.getLibraryFacilities());
    }
}
