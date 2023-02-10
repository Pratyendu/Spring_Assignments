package com.library.LibraryAPP.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Data

public class Library {
    private String libraryName;
    private String libraryAddress;
    private int libraryNumber;
    private List<String> libraryFacilities;
}
