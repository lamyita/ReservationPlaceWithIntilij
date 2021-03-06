package model;

import javax.persistence.*;

@Entity
@Table(name = "place_tabe", schema = "public", catalog = "reservation")
public class PlaceTabeEntity {
    private Long id;
    private int idPlace;
    private Integer nbrPlace;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "id_place", nullable = false)
    public int getIdPlace() {
        return idPlace;
    }

    public void setIdPlace(int idPlace) {
        this.idPlace = idPlace;
    }

    @Basic
    @Column(name = "nbr_place", nullable = true)
    public Integer getNbrPlace() {
        return nbrPlace;
    }

    public void setNbrPlace(Integer nbrPlace) {
        this.nbrPlace = nbrPlace;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlaceTabeEntity that = (PlaceTabeEntity) o;

        if (idPlace != that.idPlace) return false;
        if (nbrPlace != null ? !nbrPlace.equals(that.nbrPlace) : that.nbrPlace != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPlace;
        result = 31 * result + (nbrPlace != null ? nbrPlace.hashCode() : 0);
        return result;
    }
}
