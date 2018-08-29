package com.stevens.pdf;

import com.itextpdf.text.pdf.PdfEncryptor;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

import java.io.FileInputStream;
import java.io.FileOutputStream;


public class JavaAgent {

    public static PdfStamper stamper;

    public static void main(String[] args) {
        try {
            String src = MyReader.class.getResource("/").getPath() + "03.pdf";
            PdfReader reader = new PdfReader(new FileInputStream(src));
            String dest = MyReader.class.getResource("/").getPath() + "04.pdf";
            PdfEncryptor.encrypt(reader, new FileOutputStream(dest), true, "openpsw", "controlpsw", 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
