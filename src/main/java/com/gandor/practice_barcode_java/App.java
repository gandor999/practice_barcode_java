package com.gandor.practice_barcode_java;

import java.awt.Font;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;
import net.sourceforge.barbecue.output.OutputException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws BarcodeException, OutputException, IOException {
        System.out.println("Hello World!");
        RandomStringGenerator randomStringGenerator = new RandomStringGenerator();
        String brandName = "ruales-";
        System.out.println(brandName + randomStringGenerator.getRandomString(13));

        Barcode barcode = BarcodeFactory.createCode39((brandName + randomStringGenerator.getRandomString(10)).toUpperCase(), false);

        
        File file = new File("./outputFile.png");
        ImageIO.write(BarcodeImageHandler.getImage(barcode), "JPEG", file);
    }
}
