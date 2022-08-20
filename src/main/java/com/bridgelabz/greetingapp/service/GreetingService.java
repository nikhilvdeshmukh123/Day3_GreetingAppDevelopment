package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.entity.Greeting;
import com.bridgelabz.greetingapp.entity.User;

import java.util.List;

public interface GreetingService {
    Greeting addGreeting(User user);

    Greeting getGreetingById(Long id);

    List<Greeting> getAllGreeting();

    Greeting updateGreeting(Greeting greeting);

    String deleteMessageById(Long id);
}
