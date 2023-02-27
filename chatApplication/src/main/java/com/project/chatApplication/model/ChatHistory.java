package com.project.chatApplication.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_chat_history")
public class ChatHistory {
    @Id
    @Column(name = "chat_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int chatId;
    @JoinColumn(name = "to_user_id")
    @ManyToOne
    private User to;
    @JoinColumn(name = "from_user_id")
    @ManyToOne
    private User from;
    @Column(name = "message")
    private String message;
    @Column(name = "created_date")
    private Timestamp createdDate;
    @Column(name = "updated_date")
    private Timestamp updatedDate;
}
