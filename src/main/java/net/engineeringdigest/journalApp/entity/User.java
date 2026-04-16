package net.engineeringdigest.journalApp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "users")  //tells sprng -> its a mapped entity from monogdb
@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @Id                         //Id maps to the objid of db
    private ObjectId id;
    @Indexed(unique = true)     //srch for usrnm will be fast & checks 4 unique usrnm
    @NonNull                    //make sure this fields not null; frm lombok
    private String userName;
    private String email;
    private boolean sentimentAnalysis;
    @NonNull
    private String password;

    @DBRef                      //creatng rfrnce inside "users"cllctn of "JournalEntries"
    private List<JournalEntry> journalEntries = new ArrayList<>();
    private List<String> roles;

    public User(String testuser3, String abc) {
    }
}
