package br.com.fiap.epictesck.task;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Task {

    @Id
    UUID id;

    @NotNull
    String title;

    @Size(min = 10)
    String description;

    @Min(1)
    int score;

    @Min(1) @Min(100)
    int status;
}
