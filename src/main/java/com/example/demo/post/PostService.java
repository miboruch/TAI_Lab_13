package com.example.demo.post;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    private static ArrayList<Post> posts = new ArrayList<>();
    private static int idCounter = 0;

    static {
        posts.add(new Post(++idCounter,
                "Forest",
                "https://ocdn.eu/images/pulscms/NjY7MDA_/1d95157963f1ea12dfaf6998c722406e.jpg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
                        "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis " +
                        "nostrud exercitation ullamco laboris"));
        posts.add(new Post(++idCounter,
                "Winter",
                "https://ocdn.eu/images/pulscms/NjY7MDA_/1d95157963f1ea12dfaf6998c722406e.jpg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
                        "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis " +
                        "nostrud exercitation ullamco laboris"));
        posts.add(new Post(++idCounter,
                "Summer",
                "https://ocdn.eu/images/pulscms/NjY7MDA_/1d95157963f1ea12dfaf6998c722406e.jpg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
                        "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis " +
                        "nostrud exercitation ullamco laboris"));
        posts.add(new Post(++idCounter,
                "Spring",
                "https://ocdn.eu/images/pulscms/NjY7MDA_/1d95157963f1ea12dfaf6998c722406e.jpg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
                        "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis " +
                        "nostrud exercitation ullamco laboris"));
        posts.add(new Post(++idCounter,
                "Autumn",
                "https://ocdn.eu/images/pulscms/NjY7MDA_/1d95157963f1ea12dfaf6998c722406e.jpg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
                        "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis " +
                        "nostrud exercitation ullamco laboris"));
        posts.add(new Post(++idCounter,
                "Sea",
                "https://ocdn.eu/images/pulscms/NjY7MDA_/1d95157963f1ea12dfaf6998c722406e.jpg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
                        "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis " +
                        "nostrud exercitation ullamco laboris"));
        posts.add(new Post(++idCounter,
                "Hills",
                "https://ocdn.eu/images/pulscms/NjY7MDA_/1d95157963f1ea12dfaf6998c722406e.jpg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
                        "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis " +
                        "nostrud exercitation ullamco laboris"));
        posts.add(new Post(++idCounter,
                "Los Angeles",
                "https://ocdn.eu/images/pulscms/NjY7MDA_/1d95157963f1ea12dfaf6998c722406e.jpg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
                        "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis " +
                        "nostrud exercitation ullamco laboris"));
        posts.add(new Post(++idCounter,
                "Chicago",
                "https://ocdn.eu/images/pulscms/NjY7MDA_/1d95157963f1ea12dfaf6998c722406e.jpg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
                        "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis " +
                        "nostrud exercitation ullamco laboris"));
        posts.add(new Post(++idCounter,
                "Warsaw",
                "https://ocdn.eu/images/pulscms/NjY7MDA_/1d95157963f1ea12dfaf6998c722406e.jpg",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
                        "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis " +
                        "nostrud exercitation ullamco laboris"));
    }


    public List<Post> getAll() {
        return posts;
    }

    public Post get(int id) {
        return posts.get(id);
    }
}