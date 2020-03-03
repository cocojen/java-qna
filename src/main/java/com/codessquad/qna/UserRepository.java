package com.codessquad.qna;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByGivenNumber(Long givenNumber);

}
