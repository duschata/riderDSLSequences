package model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@MappedSuperclass
public abstract class CoreEntity {

    public static final String ID = "id";
    public static final String VERSION = "version";
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = ID)
    private Long id;

    @Version
    @Column(name = VERSION, nullable = false)
    private Long version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}
