package com.study.spring.domain;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Member {
    @Id
    @SequenceGenerator (
        name = "memSEQ",
        sequenceName = "mem_SQ",
        allocationSize = 1
    )	
    @GeneratedValue(generator = "memSEQ")
	private Long mnum;
    @NonNull
	private String id;
    @NonNull
	private String pass;
    @NonNull
	private String nickname;
    @Column(nullable = false, columnDefinition = "VARCHAR(255) DEFAULT 'citizen'")
    private String type = "citizen";
    @Column(nullable = false, columnDefinition = "BOOLEAN DEFAULT false")
    private boolean isDead = false;
	
}
