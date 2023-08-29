package ru.netology;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Answer {
    private final String id;
    private final String text;
    private final String type;
    private final String userName;
    private final int upvote;

    public Answer(@JsonProperty("id") String id,
                  @JsonProperty("text") String text,
                  @JsonProperty("type") String type,
                  @JsonProperty("user") String userName,
                  @JsonProperty("upvotes") int upvote) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.userName = userName;
        this.upvote = upvote;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUserName() {
        return userName;
    }

    public int getUpvotes() {
        return upvote;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "\n id=" + id +
                "\n text=" + text +
                "\n type=" + type +
                "\n userName='" + userName + '\'' +
                "\n upvote='" + upvote + '\'' +
                '}';
    }
}
