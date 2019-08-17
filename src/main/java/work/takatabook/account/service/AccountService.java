package work.takatabook.account.service;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import work.takatabook.account.domain.Account;
import work.takatabook.account.repository.AccountRepository;
import work.takatabook.account.response.AccountResponse;

import java.util.Optional;

/**
 * アカウント情報のビジネスロジック
 *
 * @author t.tanaka
 * @since 2019/08/17
 */
@Service
@RequiredArgsConstructor
public class AccountService {

    /** アカウントテーブルを操作するRepository **/
    @NonNull
    private AccountRepository accountRepository;


    /**
     * アカウント情報を取得する
     *
     * @param accountId アカウントID
     * @return アカウント情報
     */
    public AccountResponse serachAccountId(Integer accountId){

        Optional<Account> account = this.accountRepository.findByAccountId(accountId);
        // アカウント情報が空ではないか？
        if(account.isPresent()){
            return AccountResponse
                    .builder()
                    .accountId(account.get().getAccountId())
                    .accountName(account.get().getAccountName())
                    .accountPhoneNumber(account.get().getAccountPhoneNumber())
                    .createdDate(account.get().getCreatedDate())
                    .build();
        }
        return null;
    }
}
