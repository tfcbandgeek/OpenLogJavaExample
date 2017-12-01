package me.jgappsandgames;

import me.jgappsandgames.openlog.Build;
import me.jgappsandgames.openlog.Error;
import me.jgappsandgames.openlog.Exception;
import me.jgappsandgames.openlog.Log;
import me.jgappsandgames.openlog.OpenLog;

public class Main {
    public static void main(String[] args) {
        OpenLog.init();

        // Information
        Log.i("OpenLog", String.valueOf(Build.build));
        Log.i("OpenLogTooLong", Build.version);

        // Exceptions
        Exception.e("Main", "App is Running");

        // Error
        Error.e("Main", "Closing. . . . .");
    }
}