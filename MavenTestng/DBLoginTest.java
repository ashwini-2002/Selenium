package MavenTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DBLoginTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));

        driver.get("https://practicetestautomation.com/practice-test-login");
    }

    @Test(dataProvider="dbData")
    public void loginTest(String username, String password) {

        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("submit")).click();
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }

    @DataProvider(name="dbData")
    public Object[][] getDBData() throws Exception {

        return DBUtils.getDBData();
    }
}




/*
Yes 🙂 this is a **VERY IMPORTANT interview question** for Selenium testers.
I’ll explain **Excel vs CSV vs Database** in the simplest way.

---

# 🎯 Difference Between Excel, CSV, and Database (for Data-Driven Testing)

## ✅ 1️⃣ Excel file — Microsoft Excel

**What it is:**
A spreadsheet file (`.xlsx`) with rows, columns, colors, formulas, multiple sheets.

**Example**

| username | password    |
| -------- | ----------- |
| student  | Password123 |

---

### ✔ Advantages

* Easy to read visually
* Supports multiple sheets
* Can store large structured test data
* Supports formatting, formulas

### ❌ Disadvantages

* Needs Apache POI library in Java
* Slightly slower than CSV
* Heavier file

### 🧪 Used when

✔ Manual testers maintain test data
✔ Medium-size automation projects
✔ Training projects

---

---

## ✅ 2️⃣ CSV file (Comma Separated Values)

**What it is:**
A simple text file where values are separated by commas.

Example:

```
username,password
student,Password123
```

---

### ✔ Advantages

* Very lightweight
* Very fast to read
* No extra library needed
* Works with plain Java

### ❌ Disadvantages

* Only ONE sheet
* No formatting
* Cannot store formulas
* Harder to manage big datasets

### 🧪 Used when

✔ Simple automation
✔ Small projects
✔ Performance testing data

---

---

## ✅ 3️⃣ Database — example: MySQL

**What it is:**
Data stored inside tables.

Example:

```
users table
username | password
student  | Password123
```

---

### ✔ Advantages

* Real-time dynamic data
* Can store millions of rows
* Used in real company applications
* Fast queries
* Central data storage

### ❌ Disadvantages

* Needs SQL knowledge
* Requires DB setup
* Connection handling needed

### 🧪 Used when

✔ Real company automation
✔ Enterprise projects
✔ Production data validation

---

---

# ⭐ SIMPLE INTERVIEW ANSWER (BEST)

If interviewer asks:

👉 “Difference between Excel, CSV, Database?”

Say:

> Excel is used for structured manual test data, CSV is lightweight text-based data storage, and Database is used for real-time enterprise-level dynamic data storage.

🔥 This one sentence impresses interviewers.

---

---

# 🧠 SUPER SIMPLE MEMORY TRICK

```
Excel = Human friendly
CSV   = Machine friendly
DB    = Company friendly
```

---

---

# 🏆 REAL COMPANY USAGE

| Company situation          | What used |
| -------------------------- | --------- |
| Training project           | Excel     |
| Small automation           | CSV       |
| Real production automation | Database  |

---

---

If you want, I can also tell you (VERY USEFUL):

✅ Which data source interviewers prefer for freshers
✅ Which one Cognizant / Wipro training actually uses
✅ Which one gives highest salary skill advantage
✅ TOP 10 Selenium interview questions on Data-Driven Testing

Tell me 🙂


*/