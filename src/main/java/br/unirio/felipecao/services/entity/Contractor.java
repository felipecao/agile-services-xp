package br.unirio.felipecao.services.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="CONTRACTOR")
@SequenceGenerator(name = "SQ_CONT_ID", sequenceName = "SQ_CONT_ID")
public class Contractor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SQ_CONT_ID")
    @Column(name = "CONT_ID")
    private Integer id;

    @Column(name = "CONT_NAME")
    private String name;

    public Contractor() {
    }

    public Contractor(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contractor that = (Contractor) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
