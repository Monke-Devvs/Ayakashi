package xyz.szymeko.managers;

import xyz.szymeko.data.AdvencedCrash;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileManager {

    private final static File dataFile = new File("data");

    private final static File saved = new File(dataFile, "saved.txt");

    private static Map<String, AdvencedCrash> crash = new HashMap<>();

    public static void CreateDataFile() {
        try {
            new File("data").mkdir();
            if (!saved.exists()) {

                try (FileWriter _fileWriter = new FileWriter(dataFile + "/saved.txt")) {
                    _fileWriter.write("four-digit-code");
                    _fileWriter.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String pin;
    public static String loadPinCode() {
        try {
            final Scanner _scanner = new Scanner(new File("data", "saved.txt"));
            while (_scanner.hasNext()) {
                final String[] _split = _scanner.next().split(":", 2);
                System.out.println(_split[0]);
                pin = _split[0];
            }
            _scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pin;
    }

    public static void addCrash(String _methodName, String _packetName, Integer _pages, Integer _delay, Integer _amount) {
        if (dataFile.exists()) {
            try (FileWriter _fileWriter = new FileWriter(dataFile + "/" + _methodName + ".txt")) {
                _fileWriter.write( /*"\n" +*/ _methodName + ":" + _packetName + ":" + _pages + ":" + _delay + ":" + _amount);
                _fileWriter.flush();
                System.out.println(_methodName + ":" + _packetName + ":" + _pages + ":" + _delay + ":" + _amount);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            CreateDataFile();
        }
    }

    /*public static void loadCrash(String _methodName) {
        try {
            final Scanner _scanner = new Scanner(new File("data", _methodName + ".txt"));
            while (_scanner.hasNext()) {
                final String[] _split = _scanner.next().split(":", 5);
                System.out.println(_split[0]);
                System.out.println(_split[1]);
                System.out.println(_split[2]);
                System.out.println(_split[3]);
                System.out.println(_split[4]);
                crash.put(_split[0], new AdvencedCrash(_split[0], Integer.valueOf(_split[2]), Integer.valueOf(_split[3]), Integer.valueOf(_split[4])));
            }
            _scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void loadmajnenCHUJENCrash(String _methodName) {
        try {
            final Scanner _scanner = new Scanner(new File("data", _methodName + ".txt"));
            while (_scanner.hasNext()) {
                final String[] _split = _scanner.next().split(":", 5);
                System.out.println(_split[0]);
                System.out.println(_split[1]);
                System.out.println(_split[2]);
                System.out.println(_split[3]);
                System.out.println(_split[4]);
            }
            _scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}
