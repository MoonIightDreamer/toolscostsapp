package main.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Tool extends AbstractNamedEntity {

    @Column(name="date", nullable = false)
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    @Column(name="cost", nullable = false)
    @NotNull
    @Range(min = 100, max = 10000)
    private Integer cost;

    @Override
    public String toString() {
        return "Tool{" +
                "id=" + id +
                ", name=" + name +
                ", date=" + date +
                ", cost=" + cost + "}";
    }
}
