package work.takatabook.account.response;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * アカウント情報のレスポンスクラス
 *
 * @author t.tanaka
 * @since 2019/08/17
 */
@Data
@Builder
public class AccountResponse {
    /** アカウントID **/
    private Integer accountId;
    /** アカウント名 **/
    private String accountName;
    /** 電話番号 **/
    private String accountPhoneNumber;
    /**　アカウンtの作成日 **/
    private Date createdDate;
}