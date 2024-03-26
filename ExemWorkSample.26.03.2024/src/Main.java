import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Выпускная работа 4

        FinancialAccountingSystem financialAccountingSystem = new FinancialAccountingSystem();
    Wallet wallet1 = new Wallet ("Wallet 1", 500);
    Wallet wallet2 = new Wallet ("Wallet 2", 1000);
    financialAccountingSystem.AddList(wallet1);
    financialAccountingSystem.AddList(wallet2);
    financialAccountingSystem.ShowListWallet();

    CreditCard creditCard1 = new CreditCard("Card 1", 800);
    CreditCard creditCard2 = new CreditCard("Card 2", 800);
    financialAccountingSystem.AddList(creditCard1);
    financialAccountingSystem.AddList(creditCard2);
    financialAccountingSystem.ShowListCreditCard();

    Expenses expenses1 = new Expenses("Expenses 1: ", 2000);
    Expenses expenses2 = new Expenses("Expenses 2: ", 5000);
    financialAccountingSystem.AddList(expenses1);
    financialAccountingSystem.AddList(expenses2);
    financialAccountingSystem.ShowListExpenses();

    ExpensesPotential expensesPotential1 = new ExpensesPotential("ExpensesPotential 1:", 500);
    ExpensesPotential expensesPotential2 = new ExpensesPotential("ExpensesPotential 2:", 500);
    financialAccountingSystem.AddList(expensesPotential1);
    financialAccountingSystem.AddList(expensesPotential2);
    financialAccountingSystem.ShowListExpensesPotential();


    PotentialIncome potentialIncome1 = new PotentialIncome("PotentialIncome 1: ", 800);
    PotentialIncome potentialIncome2 = new PotentialIncome("PotentialIncome 2: ", 700);
    financialAccountingSystem.AddList(potentialIncome1);
    financialAccountingSystem.AddList(potentialIncome2);
    financialAccountingSystem.ShowListExpensesPotential();

    wallet1.dissplayWalletState();
    wallet2.dissplayWalletState();

    creditCard1.dissplayCreditCard();
    creditCard2.dissplayCreditCard();

//////// для остальных дисплей

    }
}

//Класс для кошелька
class Wallet{
    private String name;
    private double amount;
    public Wallet (String name, double amount){
        this.amount = amount;
        this.name = name;
    }
    public double getAmount() {
        return this.amount;
    }

    public String getName() {
        return this.name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void dissplayWalletState() {
        System.out.println("Name a wallet: " + name);
        System.out.println("Summ a wallet: " + amount);
        System.out.println("*********************************");

        //Другая информация о кошельке
    }
    }
//Это класс для кредитной карты
class CreditCard{
    private String name;
    private double amount;
    public CreditCard (String name, double amount){
        this.amount = amount;
        this.name = name;
    }
    public double getAmount() {
        return this.amount;
    }

    public String getName() {
        return this.name;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void dissplayCreditCard() {
        System.out.println("Name a credit cart: " + name);
        System.out.println("Summ on credit card: " + amount);
        System.out.println("*********************************");

        //Другая информация о карте
    }
}

//Расходы
class Expenses {
    private String name;
    private double amount;

    public Expenses(String name, double amount) {
        this.amount = amount;
        this.name = name;
    }

    public double getAmount() {
        return this.amount;
    }

    public String getName() {
        return this.name;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void dissplayExpenses() {
        System.out.println("Expenses cart: " + name);
        System.out.println("Summ expenseson credit card: " + amount);
        System.out.println("*********************************");

        //Другая информация о расходах
    }
}
class ExpensesPotential {
    private String name;
    private double amount;

    public ExpensesPotential(String name, double amount) {
        this.amount = amount;
        this.name = name;
    }

    public double getAmount() {
        return this.amount;
    }

    public String getName() {
        return this.name;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void dissplayExpensesPotential() {
        System.out.println("Name expenses potential cart: " + name);
        System.out.println("Sum potential expenseson : " + amount);
        System.out.println("*********************************");

        //Другая информация о расходах
    }
}

//Потенциальный доход
class PotentialIncome {
    private String name;
    private double amount;

    public PotentialIncome(String name, double amount) {
        this.amount = amount;
        this.name = name;
    }

    public double getAmount() {
        return this.amount;
    }

    public String getName() {
        return this.name;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void dissplayPotentialIncome() {
        System.out.println("Name potential income: " + name);
        System.out.println("Sum potential income : " + amount);
        System.out.println("*********************************");

        //Другая информация о расходах
    }
}

class FinancialAccountingSystem {
    private List<Wallet> wallets;
    private List<CreditCard> creditCards;
    private List<Expenses> expenses;
    private List<ExpensesPotential> expensesPotentials;
    private List<PotentialIncome> potentialIncomes;

    public FinancialAccountingSystem() {
        wallets = new ArrayList<>();
        creditCards = new ArrayList<>();
        expenses = new ArrayList<>();
        expensesPotentials = new ArrayList<>();
        potentialIncomes = new ArrayList<>();
    }

    public double SumOfAllWalletsAndCreditsCards() {
        double sum1 = 0;
        for (int i = 0; i < wallets.size(); i++) {
            sum1 += wallets.get(i).getAmount();
        }
        double sum2 = 0;
        for (int i = 0; i < wallets.size(); i++) {
            sum2 += wallets.get(i).getAmount();
        }
        return sum1 + sum2;
    }

    public double SumOfAllWallets() {
        double sum = 0;
        for (int i = 0; i < wallets.size(); i++) {
            sum += wallets.get(i).getAmount();
        }
        return sum;
    }

    public double SumOfAllCreditsCards() {
        double sum = 0;
        for (int i = 0; i < creditCards.size(); i++) {
            sum += creditCards.get(i).getAmount();
        }
        return sum;
    }

    public double SumOfAllExpenses() {
        double sum = 0;
        for (int i = 0; i < expenses.size(); i++) {
            sum += expenses.get(i).getAmount();
        }
        return sum;
    }

    public double SumOfAllExpensesPotential() {
        double sum = 0;
        for (int i = 0; i < expensesPotentials.size(); i++) {
            sum += expensesPotentials.get(i).getAmount();
        }
        return sum;
    }

    public double SumOfAllPotentialIncome() {
        double sum = 0;
        for (int i = 0; i < potentialIncomes.size(); i++) {
            sum += potentialIncomes.get(i).getAmount();
        }
        return sum;
    }

    public void EditWallet(String name, double amount) {
        for (int i = 0; i < wallets.size(); i++) {
            if (wallets.get(i).getName().equals(name)) {
                potentialIncomes.get(i).setAmount(amount);
            }
        }
    }

    public void EditCreditCard(String name, double amount) {
        for (int i = 0; i < creditCards.size(); i++) {
            if (creditCards.get(i).getName().equals(name)) {
                creditCards.get(i).setAmount(amount);
            }
        }
    }
//List<Wallet> wallets
    public void ShowListWallet() {
        for (int i = 0; i < wallets.size(); i++) {
            wallets.get(i).dissplayWalletState();
        }
    }

    public void ShowListCreditCard() {
        for (int i = 0; i < creditCards.size(); i++) {
            creditCards.get(i).dissplayCreditCard();
        }
    }

    public void ShowListExpenses() {
        for (int i = 0; i < expenses.size(); i++) {
            expenses.get(i).dissplayExpenses();
        }
    }

    public void ShowListExpensesPotential() {
        for (int i = 0; i < expensesPotentials.size(); i++) {
           expensesPotentials.get(i).dissplayExpensesPotential();
        }
    }

    public void ShowListPotentialIncome() {
        for (int i = 0; i < potentialIncomes.size(); i++) {
            potentialIncomes.get(i).dissplayPotentialIncome();
        }
    }

    public void AddList(Wallet wallet){
        this.wallets.add(wallet);
    }
    public void AddList(CreditCard creditCard){
        this.creditCards.add(creditCard);
    }
    public void AddList(Expenses expenses){
        this.expenses.add(expenses);
    }
    public void AddList(ExpensesPotential expensesPotential){
        this.expensesPotentials.add(expensesPotential);
    }
    public void AddList(PotentialIncome potentialIncome){
        this.potentialIncomes.add(potentialIncome);
    }

}

