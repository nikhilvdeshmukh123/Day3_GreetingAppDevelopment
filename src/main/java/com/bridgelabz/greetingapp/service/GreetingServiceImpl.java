package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.entity.Greeting;
import com.bridgelabz.greetingapp.entity.User;
import com.bridgelabz.greetingapp.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingServiceImpl implements GreetingService{

    @Autowired
    private GreetingRepository greetingRepository;

    private static final String template = "Hello, %s!";

    private final AtomicLong counter = new AtomicLong();

    @Override
    public Greeting addGreeting(User user) {
        String message = String.format(template, (user.toString().isEmpty()) ? "Hello World" : user.toString());
        return greetingRepository.save(new Greeting(counter.incrementAndGet(), message));
    }

    @Override
    public Greeting getGreetingById(Long id) {
        return greetingRepository.findById(id).get();
    }

    @Override
    public List<Greeting> getAllGreeting() {
        return greetingRepository.findAll();
    }

    @Override
    public Greeting updateGreeting(Greeting greeting) {
        return greetingRepository.save(new Greeting(4L, "Message Updated Successfully!!"));
    }

    @Override
    public String deleteMessageById(Long id) {
        greetingRepository.deleteById(id);
        return "Greeting Message has been Deleted !";
    }
}