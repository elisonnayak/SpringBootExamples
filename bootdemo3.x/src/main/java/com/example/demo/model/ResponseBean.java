package com.example.demo.model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseBean {
    private String id;
    private String title;
    private String releaseDate;
}
