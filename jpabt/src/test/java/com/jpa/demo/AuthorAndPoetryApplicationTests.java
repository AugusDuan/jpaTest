package com.jpa.demo;

import com.jpa.repository.AuthorRepository;
import com.jpa.repository.PoetryRepository;
import com.jpa.vo.Author;
import com.jpa.vo.Poetry;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthorAndPoetryApplicationTests {

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    PoetryRepository poetryRepository;


    @Test
    public void testSavaData() {
        authorRepository.save(new Author("杜甫", 56));
        authorRepository.save(new Author("李白", 42));
        poetryRepository.save(new Poetry("八阵图", "咏怀诗", "功盖三分国，名高八阵图。江流石不转，遗恨失吞吴。"));
        poetryRepository.save(new Poetry("春望", "爱国诗", "国破山河在，城春草木深。感时花溅泪，恨别鸟惊心。烽火连三月，家书抵万金。白头搔更短，浑欲不胜簪。"));
        poetryRepository.save(new Poetry("静夜思", "思乡诗", "床前明月光，疑是地上霜。举头望明月，低头思故乡"));
    }

    @Test
    public void testfindAuthor(){
        Optional<Author> byId = authorRepository.findById(1);
        System.out.println(byId.get());
    }


}
