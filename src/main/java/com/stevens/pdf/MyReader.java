package com.stevens.pdf;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyReader extends PdfReader {

    public MyReader(String filename) throws IOException {
        super(filename);
    }


    /**
     * @return Answers a PdfReader for the File f.
     */
    private static PdfReader openPdf(File f) throws IOException {
        FileInputStream fIn = new FileInputStream(f);
        PdfReader reader = null;
        try {
            PdfReader.unethicalreading = true;
            reader = new PdfReader(fIn);
        } finally {
            fIn.close();
        }
        return reader;
    }

    public void decryptOnPurpose() {
        encrypted = false;
    }

    public static void main(String[] args) throws Exception {
        PdfReader.unethicalreading = true;
        String src = MyReader.class.getResource("/").getPath() + "03.pdf";

        MyReader reader = new MyReader(src);
        String dest = MyReader.class.getResource("/").getPath() + "04.pdf";
        FileOutputStream outputstream = new FileOutputStream(new File(dest));
        PdfStamper s = new PdfStamper(reader, outputstream);
        s.close();
        reader.close();
    }
}
