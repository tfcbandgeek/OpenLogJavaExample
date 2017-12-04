package me.jgappsandgames;

import me.jgappsandgames.openlog.*;
import me.jgappsandgames.openlog.Build;
import me.jgappsandgames.openlog.Error;
import me.jgappsandgames.openlog.Exception;

public class Main {
    public static void main(String[] args) {
        FileWriter writer = FileWriter.getInstance();

        Config.getInstance()
                .setSecondaryWriter(FileWriter.getInstance());

        // Information
        Log.i("OpenLog", String.valueOf(Build.build));
        Log.i("OpenLogTooLong", Build.version);

        // Logs
        Log.v("Limited", "Should Only Show On Debug Builds");

        // Exceptions
        Exception.p("Main", "App is Running");
        Exception.f("Limited", "App is Running");

        // Error
        Error.d("Limited", "Closing?");
        Error.e("Main", "Closing. . . . .");

        Config.getInstance()
                .setDebug(false)
                .setPrefix("NonDebug");

        // Information
        Log.i("OpenLog", String.valueOf(Build.build));
        Log.i("OpenLogTooLong", Build.version);

        // Logs
        Log.v("Limited", "Should Only Show On Debug Builds");

        // Exceptions
        Exception.p("Main", "App is Running");
        Exception.f("Limited", "App is Running");

        // Error
        Error.d("Limited", "Closing?");
        Error.e("Main", "Closing. . . . .");
    }
}