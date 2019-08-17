package work.takatabook.account.controller;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import work.takatabook.account.response.AccountResponse;
import work.takatabook.account.service.AccountService;


/**
 * Account APIのエンドポイント
 *
 * @author t.tanaka
 * @since 2019/08/17
 */
@RestController
@RequestMapping("/api/v1/account")
@RequiredArgsConstructor
public class AccountContorller {

    /** アカウントのビジネスロジック **/
    @NonNull
    private AccountService accountService;

    /**
     * アカウントIDに紐づく、アカウント情報を取得する
     *
     * @param accountId アカウントID
     * @return アカウント情報
     */
    @RequestMapping(value = "/{accountId}", method = RequestMethod.GET)
    public AccountResponse serachAccount(@PathVariable Integer accountId){
        return this.accountService.serachAccountId(accountId);
    }
}
