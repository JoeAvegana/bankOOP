package bankpackage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Протестировать классы Account, CreditAccount из ДЗ #1.
 *
 * 1. Создать Account. Пополнить его на X рублей. Проверить, что на счету X рублей.
 * 2. Создать Account. Пополнить его на X рублей. Снять с него Y рублей. Проверить, что на счету X-Y рублей.
 * 3. Создать CreditAccount. Пополнить его на X рублей. Снять с него Y рублей. Проверить, что на счету X - 1.01*Y рублей.
 * 4. ** Протестировать DepositAccount. Тест-кейсы придумать самостоятельно.
 *
 * Примерный код:
 * Account testObject = new Account();
 * testObject.put(10);
 * Assertions.assertEquals(10, testObject.getAmount());
 *
 */
class CreditAccountTest {
    @Test
    void creditTest(){
        Account cred = new CreditAccount();
        cred.money = 5000;
        cred.put(5000);
        cred.take(1000);
        int expectedSum = 8990;
        Assertions.assertEquals(expectedSum, cred.money);
    }

}