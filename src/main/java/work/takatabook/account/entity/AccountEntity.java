package work.takatabook.account.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import work.takatabook.account.domain.Account;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * AccountテーブルのEntity
 *
 * @author t.tanaka
 * @since 2019/08/17
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ACCOUNT")
public class AccountEntity {
    /**　アカウントID **/
    @Id
    @Column(name="ACCOUNTID")
    private Integer accountId;

    /**　アカウント名**/
    @Column(name="ACCOUNTNAME")
    private String accountName;
    /**　電話番号 **/
    @Column(name="ACCOUNTPHONENUMBER")
    private String accountPhoneNumber;
    /** 作成日　**/
    @Column(name="CREATED_DATETIME")
    private Date createdDate;
    /** 更新日　**/
    @Column(name="UPDATED_DATETIME")
    private Date updatedDate;


    /**
     * ドメインオブジェクトに変換する
     *
     * @return アカウント情報
     */
    public Account toAccount(){
        return Account.builder()
                .accountId(this.accountId)
                .accountName(this.accountName)
                .accountPhoneNumber(this.accountPhoneNumber)
                .createdDate(this.createdDate)
                .upDatedDate(this.updatedDate)
                .build();
    }
}
