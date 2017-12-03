package me.jgappsandgames;

import me.jgappsandgames.openlog.*;
import me.jgappsandgames.openlog.Build;
import me.jgappsandgames.openlog.Error;
import me.jgappsandgames.openlog.Exception;

public class Main {
    public static void main(String[] args) {
        FileWriter writer = FileWriter.getInstance();

        OpenLog.init();
        Config.getInstance().setSecondaryWriter(FileWriter.getInstance());

        // Information
        Log.i("OpenLog", String.valueOf(Build.build));
        Log.i("OpenLogTooLong", Build.version);

        // Exceptions
        Exception.e("Main", "App is Running");

        // Error
        Error.e("Main", "Closing. . . . .");
    }
}