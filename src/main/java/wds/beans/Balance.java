package wds.beans;

//import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.persistence.Column;
import org.hibernate.annotations.UuidGenerator;

import java.util.Date;
//import wds.beans.BalanceId;
//import wds.beans.TradeBean;

@Entity(name = "Balance")
@Table(name = "crypto_value")
public class Balance {


    private Integer idcrypto;
    public  String cryptovalue;
    public Date updateddate;

    @Id
    //@UuidGenerator
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
            name = "idcrypto",
            nullable = false,
            columnDefinition = "INTEGER 23"
    )

    public Integer getIdcrypto() {
        return idcrypto;
    }

    public void setIdcrypto(Integer idcrypto) {
        this.idcrypto = idcrypto;
    }

    @Column(
            name = "cryptovalue",
            nullable = false,
            columnDefinition = "FLOAT"
    )
    public String getCrypto_value() {
        return cryptovalue;
    }

    public void setCrypto_value(String cryptovalue) {
        this.cryptovalue = cryptovalue;
    }

    @Column(
            name = "updateddate",
            nullable = false,
            columnDefinition = "DATETIME"
    )
    public Date getUpdatedDate() {
        return updateddate;
    }

    public void setUpdatedDate(Date updateddate) {
        this.updateddate = updateddate;
    }
}
