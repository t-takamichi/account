package work.takatabook.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import work.takatabook.account.entity.AccountEntity;

import java.util.Optional;


/**
 * アカウントテーブルを操作するための、JPA Repositoryのインターフェース
 *
 * @author t.tanaka
 * @since 2019/08/07
 */
public interface AccountJpaRepository extends JpaRepository<AccountEntity,Integer> {

    /**
     * アカウント情報をaccountIdで検索する
     *
     * @param accoutId アカウントID
     * @return 抽出したアカウント情報
     */
    Optional<AccountEntity> findByAccountId(Integer accoutId);
}
