package main.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@MappedSuperclass
@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AbstractNamedEntity extends AbstractBaseEntity {

    @NotBlank
    @Size(min = 3, max = 50)
    @Column(name="name", nullable = false)
    protected String name;

    @Override
    public String toString() {
        return super.toString() + '(' + name + ')';
    }
}
