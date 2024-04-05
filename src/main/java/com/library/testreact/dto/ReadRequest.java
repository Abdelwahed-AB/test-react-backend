package com.library.testreact.dto;

public record ReadRequest(
        Long userId,
        Long bookId
) {
}
