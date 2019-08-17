package work.takatabook.account.domain;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * アカウントのドメインオブジェクト
 *
 * @author t.tanaka
 * @since 2019/
 */
@Data
@Builder
public class Account {
    /** アカウントID **/
    private Integer accountId;
    /** アカウント名 **/
    private String accountName;
    /** 電話番号 **/
    private String accountPhoneNumber;
    /** アカウント作成日  **/
    private Date createdDate;
    /**　アカウント最終更新日 **/
    private Date upDatedDate;
}
