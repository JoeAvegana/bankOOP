package bankpackage;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*
 * 1. Создать класс "Счет в банке" - Account.
 * У этого класса должно быть поле с текущим балансом на счете.
 * У этого класса должно быть 3 метода:
 * - (put) Пополнить счет - принимат положительное число, увеличивает текубаланс
 * - (take) Вывести средства - принимат положительное число, уменьшает текущий баланщий с
 * - (getAmount) Показать баланс - ничего не принимает, возвращает текущий баланс (getter)
 *
 * 2. Создать несколько наследников.
 * - Кредитный счет (CreditAccount)
 * Особенность: на каждое снятие нужно наложить комиссию в размере 1% от суммы снятия.
 * То есть, если снимаем 100 у.е., то снять нужно 101.
 * - Депозитный счет (DepositAccount) *
 * Особенность: нельзя снимать средства чаще, чем раз в месяц.
 * То есть, нужно завести поле с датой последнего снятия, и использовать его.
 * (Для дат лучше использовать LocalDate, пример в классе Dates в проекте урока)
 */
public class DepositAccount extends Account {
    private LocalDate lastWithdraw;

    @Override
    public void take(double money) {
        LocalDate currentDate = LocalDate.now();
        if (lastWithdraw == null || ChronoUnit.MONTHS.between(currentDate, lastWithdraw) > 1){
            lastWithdraw = currentDate;
            super.take(money);
        }else{
            throw new IllegalArgumentException("Значение должно быть положительным");
        }
    }

}
