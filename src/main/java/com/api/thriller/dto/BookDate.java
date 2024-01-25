package com.api.thriller.dto;

import com.api.thriller.entity.Types;

public record BookDate(String title, int yearPublication, int pages, String language, Types genre,  AuthorDate author) {
}
