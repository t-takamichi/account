package work.takatabook.account.repository;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import work.takatabook.account.domain.Account;
import work.takatabook.account.entity.AccountEntity;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class AccountRepository {

    /**　アカウント情報を操作するためのインターフェース **/
    @NonNull
    private AccountJpaRepository accountJpaRepository;

    /**
     * アカウント情報をaccountIdで検索する
     *
     * @param accountId　アカウントID
     * @return アカウント情報
     */
    public Optional<Account> findByAccountId(Integer accountId) {

        return accountJpaRepository.findByAccountId(accountId)
                // Accountのドメインオブジェクトに変換をする
                .map(AccountEntity::toAccount);
    }
}
