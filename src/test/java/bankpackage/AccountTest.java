package bankpackage;
/**
 * Протестировать классы Account, CreditAccount из ДЗ #1.
 * <p>
 * 1. Создать Account. Пополнить его на X рублей. Проверить, что на счету X рублей.
 * 2. Создать Account. Пополнить его на X рублей. Снять с него Y рублей. Проверить, что на счету X-Y рублей.
 * 3. Создать CreditAccount. Пополнить его на X рублей. Снять с него Y рублей. Проверить, что на счету X - 1.01*Y рублей.
 * 4. ** Протестировать DepositAccount. Тест-кейсы придумать самостоятельно.
 * <p>
 * Примерный код:
 * Account testObject = new Account();
 * testObject.put(10);
 * Assertions.assertEquals(10, testObject.getAmount());
 */

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @org.junit.jupiter.api.Test
    void testPut() {
        Account account = new Account();
        account.put(3000);
        int expectedPut = 3000;
        Assertions.assertEquals(expectedPut, account.money);
    }

    @org.junit.jupiter.api.Test
    void testTake() {
        Account account = new Account();
        account.money = 4000;
        account.put(4000);
        account.take(5000);
        int expectedTake = 3000;
        Assertions.assertEquals(expectedTake, account.money);
    }
}