package elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static model.ApplicationNumberTwo.driver;



//  cerinta_12:
//          Step 1: Click pe Interactions de pe pagina principala
//          Step 2: Click pe "Sortable" din lista
//          Step 3: Sorteaza lista in formatul urmator Six, One, Five, Three, Four, Two

// de la Andrei: Ai facut bine, dar daca inputul se schimba, ai metode cu moveFourInList etc., incearca sa faci o singura metoda, ce ia ca input o lista de numere,
//maxim 6 , ex. [ 3,4,5,6,1,2 ]. Si poti face cu switch si sa folosesti metodele tale.



public class Sortable {

    public static By one = By.xpath("(//div[text()='One'])[1]");
    public static By two = By.xpath("(//div[text()='Two'])[1]");
    public static By three = By.xpath("(//div[text()='Three'])[1]");
    public static By four = By.xpath("(//div[text()='Four'])[1]");
    public static By five = By.xpath("(//div[text()='Five'])[1]");
    public static By six = By.xpath("(//div[text()='Six'])[1]");
    public static By listContainer = By.xpath("//div[@class='vertical-list-container mt-4']");

    public static void moveElementsInList(WebElement source, WebElement target) {

        Actions action = new Actions(driver());
//        action.clickAndHold(source);
        action.dragAndDrop(source, target).build().perform();


    }

    public static void moveSixInList() throws InterruptedException {

        Thread.sleep(1000);
        WebElement sixWebElement = driver().findElement(six);
        WebElement oneWebElement = driver().findElement(one);
        moveElementsInList(sixWebElement, oneWebElement);

    }

    public static void moveFiveInList() throws InterruptedException {

        Thread.sleep(1000);
        WebElement fiveWebElement = driver().findElement(five);
        WebElement twoWebElement = driver().findElement(two);
        moveElementsInList(fiveWebElement, twoWebElement);

    }

    public static void moveThreeInList() throws InterruptedException {

        Thread.sleep(1000);
        WebElement threeWebElement = driver().findElement(three);
        WebElement twoWebElement = driver().findElement(two);
        moveElementsInList(threeWebElement, twoWebElement);

    }

    public static void moveFourInList() throws InterruptedException {

        Thread.sleep(1000);
        WebElement fourWebElement = driver().findElement(four);
        WebElement twoWebElement = driver().findElement(two);
        moveElementsInList(fourWebElement, twoWebElement);

    }

    public static String checkNumbers() {

        WebElement element = driver().findElement(listContainer);
        return element.getText();

    }

    public static void createArray(){

        // create an ArrayList object of integer type
        ArrayList<Integer> list = new ArrayList<>();
        // insert integer values in ArrayList
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int value = 1;

    }



}































 // Prima incercare:



//    public static void sortNumbers(By elementOne, By elementTwo) throws InterruptedException {
//
//        Thread.sleep(1000);
//        Actions actionThree = new Actions(driver());
//        WebElement drag = driver().findElement(elementOne);
//        WebElement drop = driver().findElement(elementTwo);
//        actionThree.dragAndDrop(drag,drop).perform();
//    }
//
//    public static String verifyNumber() {
//
//        WebElement element = driver().findElement(listContainer);
//        return element.getText();
//
//    }





















