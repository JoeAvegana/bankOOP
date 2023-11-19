package bankpackage;
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

public class Account {
    protected String name;
    protected double money;

    public void put(double money) {
        if (money > 0) {
            this.money += money;
        } else {
            throw new IllegalArgumentException("Значение должно быть опожительным");
        }

    }

    public void take(double money) {
        if (money > 0) {
            this.money -= money;
        } else {
            throw new IllegalArgumentException("Значение должно быть положительным");
        }
    }

    public double getAmount() {
        return money;
    }

}
