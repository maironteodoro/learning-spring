package learningspring.course.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity //identifica essa entidade como uma entidade para o banco
@Table(name="tb_user") // identifica a tabela dessa entidade no banco obs: "User" é palavra reservada do banco h2


public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id //identifica quem é a chave primaria para o banco
    @GeneratedValue(strategy = GenerationType.IDENTITY)//torna o ID alto incrementavel
    //define o tipo de estategia que sera tomada que seria a de incremento tornando o valor unico
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;

    public User(){}

    public User(Long id,String name, String email, String phone, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
