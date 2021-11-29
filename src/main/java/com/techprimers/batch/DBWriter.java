package com.techprimers.batch;

import com.techprimers.model.User;
import com.techprimers.repository.UserRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author kansanja on 29/11/21.
 */

@Component
public class DBWriter implements ItemWriter<User> {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void write(List<? extends User> users) throws Exception {
        System.out.println("Data saved for users: " + users);
        userRepository.saveAll(users);
    }
}
