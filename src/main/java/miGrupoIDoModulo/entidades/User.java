package miGrupoIDoModulo.entidades;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;

@ApiModel(value = "Info entity", description = "Complete data of a entity Info")
public class User {
    @ApiModelProperty(value = "The id of the user", required = false, position = 1)
    private Long id;
    @ApiModelProperty(value = "The name of the user", required = true, position = 2)
    private String name;
    @ApiModelProperty(value = "The type of the user", required = true, position = 3)
    private Integer type;
    @ApiModelProperty(value = "The phone of the user", required = true, position = 4)
    private String phone;
    @ApiModelProperty(value = "The birth date of the user", required = true, position = 5)
    private LocalDate birthDate;

    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public User setType(Integer type) {
        this.type = type;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public User setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public User setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public User copyFrom(User user) {
        if (user.name != null) {
            this.name = user.name;
        }
        if (user.type != null) {
            this.type = user.type;
        }
        if (user.phone != null) {
            this.phone = user.phone;
        }
        if (user.birthDate != null) {
            this.birthDate = user.birthDate;
        }
        return this;
    }


}
