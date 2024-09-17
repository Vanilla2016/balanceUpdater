package wds.beans.entity;

//import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import java.util.Date;
//import wds.beans.BalanceId;
//import wds.beans.TradeBean;

@Entity(name = "Balance")
@Table(name = "crypto_value")
public class Balance {

    @EmbeddedId
    private String idcrypto;
    public  String cryptovalue;
    public Date updateddate;

    @Column(
            name = "idcrypto",
            nullable = false,
            columnDefinition = "TEXT"
    )
    public String getIdcrypto() {
        return idcrypto;
    }

    public void setIdcrypto(String idcrypto) {
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
