package com.axjava;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.provider.Settings;
import android.text.Html;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import com.appsflyer.sdk_base.referrer.Payload;
import com.roblox.engine.jni.NativeInputInterface;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class JNIFunctions {
    private static ClipboardService clipboardService;
    private static AlertDialog sUpdateDialog;
    private static final JNIFunctions INSTANCE = new JNIFunctions();
    private static WeakReference<Activity> activityRef = new WeakReference<>(null);
    private static boolean isClipboardServiceStarted = false;
    static List<String> clipboardHistory = new ArrayList();
    private static final Handler sUiHandler = new Handler(Looper.getMainLooper());

    public static native boolean SendButton();

    public static native void SendParamsToArceus(boolean z10, int i10, int i11, boolean z11, int i12);

    public static native void SendParamsToArceusTouch(int i10, float f10, float f11, int i11);

    public static native void handleTextInput(String str);

    public static void setActivity(Activity activity) {
        activityRef = new WeakReference<>(activity);
    }

    public static void JAVA_Test(boolean isGang, int getScanCode, int getKeyCode, boolean getRepeatCount, int event) {
        SendParamsToArceus(isGang, getScanCode, getKeyCode, getRepeatCount, event);
    }

    public static void JAVA_Test2(MotionEvent event) {
        SendParamsToArceusTouch(event.getActionMasked(), event.getX(), event.getY(), event.getPointerCount());
    }

    public static void vibratePhone(Context context, int durationMilliseconds, int type) {
        Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
        Log.e("Arceus X", "Vibrating...");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            VibrationEffect vibrationEffect1 = null;
            if (type == -1) {
                vibrationEffect1 = VibrationEffect.createOneShot(durationMilliseconds, type);
            } else if (i10 >= 29) {
                vibrationEffect1 = VibrationEffect.createPredefined(type);
            }
            vibrator.cancel();
            vibrator.vibrate(vibrationEffect1);
            return;
        }
        vibrator.vibrate(durationMilliseconds);
    }

    public static float getDisplayDensity(Context context) {
        DisplayMetrics dm2 = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getDefaultDisplay().getMetrics(dm2);
        return dm2.density;
    }

    /* JADX INFO: renamed from: com.axjava.JNIFunctions$a */
    class RunnableC1857a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f7194a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f7195b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f7196c;

        RunnableC1857a(Context context, String str, int i10) {
            this.f7194a = context;
            this.f7195b = str;
            this.f7196c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            Toast.makeText(this.f7194a, Html.fromHtml(this.f7195b), this.f7196c).show();
        }
    }

    public static void displayKeyboard(Context context) {
        InputMethodManager keyboard = (InputMethodManager) context.getSystemService("input_method");
        keyboard.restartInput(null);
        keyboard.toggleSoftInput(2, 0);
    }

    public static void hideKeyboard(Context context) {
        InputMethodManager keyboard = (InputMethodManager) context.getSystemService("input_method");
        keyboard.toggleSoftInput(0, 0);
    }

    public static String getInternalStorageDirectoryPath(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            StorageManager storageManager = (StorageManager) context.getSystemService("storage");
            if (storageManager == null) {
                String storageDirectoryPath = Environment.getExternalStorageDirectory().getAbsolutePath();
                return storageDirectoryPath;
            }
            String storageDirectoryPath2 = storageManager.getPrimaryStorageVolume().getDirectory().getAbsolutePath();
            return storageDirectoryPath2;
        }
        String storageDirectoryPath3 = Environment.getExternalStorageDirectory().getAbsolutePath();
        return storageDirectoryPath3;
    }

    public static void openURL(Context context, String url) {
        new Handler(Looper.getMainLooper()).post(new RunnableC1858b(url, context));
    }

    public static String getTextClipboard(Context context) {
        try {
            ClipboardManager clipboard = (ClipboardManager) context.getSystemService("clipboard");
            CharSequence text = clipboard.getPrimaryClip().getItemAt(0).getText();
            Log.e("Arceus X", "text is %s" + text.toString());
            return text.toString();
        } catch (Exception e10) {
            return "Error: AX-1!";
        }
    }

    public static Map<String, String> getAllPreferences(Context context) {
        SharedPreferences settings = context.getSharedPreferences("keys", 0);
        Map<String, ?> allPrefs = settings.getAll();
        Map<String, String> stringPrefs = new HashMap<>();
        for (Map.Entry<String, ?> entry : allPrefs.entrySet()) {
            if (entry.getValue() instanceof String) {
                stringPrefs.put(entry.getKey(), (String) entry.getValue());
            }
        }
        return stringPrefs;
    }

    public static String[] File_listFiles(Context context, String path) {
        File arceusXDirectory = new File(getInternalStorageDirectoryPath(context), "Arceus X");
        arceusXDirectory.mkdirs();
        File dir = new File(arceusXDirectory, path);
        return dir.list();
    }

    public static void savePreference(Context context, String key, String value) {
        SharedPreferences settings = context.getSharedPreferences("keys", 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public static void requestPermission(Context context) {
        if (ContextCompat.checkSelfPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            ActivityCompat.requestPermissions((Activity) context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 112);
        }
        if (Build.VERSION.SDK_INT >= 30 && !Environment.isExternalStorageManager()) {
            try {
                Uri uri = Uri.parse("package:" + context.getPackageName());
                context.startActivity(new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", uri));
            } catch (Exception e10) {
                Intent intent = new Intent();
                intent.setAction("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION");
                context.startActivity(intent);
            }
        }
    }

    public static boolean isPermissionGood(Context context) {
        if (ContextCompat.checkSelfPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            return false;
        }
        return Build.VERSION.SDK_INT < 30 || Environment.isExternalStorageManager();
    }

    public static void ReCallerMouseBtn(int id2, float x10, float y10, int windowWidth, int windowHeight) {
        switch (id2) {
            case 0:
                NativeInputInterface.nativePassInput(0, x10, y10, 0, windowWidth, windowHeight);
                NativeInputInterface.nativePassMouseButton(x10, y10, true, 0);
                NativeInputInterface.nativePassMouseButton(x10, y10, false, 0);
                NativeInputInterface.nativePassInput(0, x10, y10, 2, windowWidth, windowHeight);
                break;
            case 1:
                NativeInputInterface.nativePassInput(0, x10, y10, 0, windowWidth, windowHeight);
                NativeInputInterface.nativePassMouseButton(x10, y10, true, 0);
                NativeInputInterface.nativePassInput(0, x10, y10, 2, windowWidth, windowHeight);
                break;
            case 2:
                NativeInputInterface.nativePassInput(0, x10, y10, 0, windowWidth, windowHeight);
                NativeInputInterface.nativePassMouseButton(x10, y10, false, 0);
                NativeInputInterface.nativePassInput(0, x10, y10, 2, windowWidth, windowHeight);
                break;
            case 3:
                NativeInputInterface.nativePassInput(0, x10, y10, 0, windowWidth, windowHeight);
                NativeInputInterface.nativePassMouseButton(x10, y10, true, 1);
                NativeInputInterface.nativePassMouseButton(x10, y10, false, 1);
                NativeInputInterface.nativePassInput(0, x10, y10, 2, windowWidth, windowHeight);
                break;
            case 4:
                NativeInputInterface.nativePassInput(0, x10, y10, 0, windowWidth, windowHeight);
                NativeInputInterface.nativePassMouseButton(x10, y10, true, 1);
                NativeInputInterface.nativePassInput(0, x10, y10, 2, windowWidth, windowHeight);
                break;
            case 5:
                NativeInputInterface.nativePassInput(0, x10, y10, 0, windowWidth, windowHeight);
                NativeInputInterface.nativePassMouseButton(x10, y10, false, 1);
                NativeInputInterface.nativePassInput(0, x10, y10, 2, windowWidth, windowHeight);
                break;
        }
    }

    /* JADX INFO: renamed from: com.axjava.JNIFunctions$b */
    class RunnableC1858b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f7197a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f7198b;

        RunnableC1858b(Context context, String str) {
            this.f7197a = context;
            this.f7198b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f7197a);
            builder.setMessage(this.f7198b).setCancelable(true).setPositiveButton(Payload.RESPONSE_OK, new b(this));
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }

        /* JADX INFO: renamed from: com.axjava.JNIFunctions$b$b */
        class b implements DialogInterface.OnClickListener {
            b(RunnableC1858b this$0) {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialog, int id2) {
                dialog.dismiss();
            }
        }
    }

    public static void showAlert(Context context, String text, int length) {
        new Handler(Looper.getMainLooper()).post(new RunnableC1858b(context, text));
    }

    public static void loseFocus(Context context) {
        EditText editText = new EditText(context);
        editText.setVisibility(4);
        editText.requestFocus();
    }

    /* JADX INFO: renamed from: com.axjava.JNIFunctions$c */
    class RunnableC1859c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f7199a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f7200b;

        RunnableC1859c(Context context, String str) {
            this.f7199a = context;
            this.f7200b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ClipboardManager clipboard = (ClipboardManager) this.f7199a.getSystemService("clipboard");
            if (clipboard.hasPrimaryClip()) {
                ClipData clip = ClipData.newPlainText("label", this.f7200b);
                clipboard.setPrimaryClip(clip);
            } else {
                clipboard.setText(this.f7200b);
            }
        }
    }

    public static boolean copyText(Context context, String text) {
        try {
            Handler mHandler = new Handler(Looper.getMainLooper());
            mHandler.post(new RunnableC1859c(context, text));
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static JNIFunctions getInstance() {
        return INSTANCE;
    }

    public static String generate(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    private static Activity getActivityOrNull() {
        return activityRef.get();
    }

    public static float getDisplaySize_x(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics metrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(metrics);
        return metrics.widthPixels;
    }

    public static void openWebsite(final Context context, String url) {
        final Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
        final Activity act = getActivityOrNull();
        if (act != null && !act.isFinishing()) {
            act.runOnUiThread(new Runnable() { // from class: com.axjava.a
                @Override // java.lang.Runnable
                public final void run() {
                    JNIFunctions.lambda$openWebsite$0(act, intent);
                }
            });
            return;
        }
        intent.addFlags(268435456);
        Runnable launch = new Runnable() { // from class: com.axjava.b
            @Override // java.lang.Runnable
            public final void run() {
                JNIFunctions.lambda$openWebsite$1(context, intent);
            }
        };
        if (Looper.myLooper() != Looper.getMainLooper()) {
            new Handler(Looper.getMainLooper()).post(launch);
        } else {
            launch.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$openWebsite$0(Activity act, Intent intent) {
        try {
            act.startActivity(intent);
        } catch (Exception e10) {
            Log.e("ArceusX", "Failed to open website: " + e10.getMessage());
        }
    }

    public static float getDisplaySize_y(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics metrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(metrics);
        return metrics.heightPixels;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$openWebsite$1(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Exception e10) {
            Log.e("ArceusX", "Failed to open website: " + e10.getMessage());
        }
    }

    public static boolean File_createFolder(Context context, String fileName) {
        File arceusXDirectory = new File(getInternalStorageDirectoryPath(context), "Arceus X");
        File dir = new File(arceusXDirectory, "Workspace");
        dir.mkdirs();
        File theFile = new File(dir, fileName);
        return theFile.mkdirs();
    }

    public static String[] File_listFiles2(Context context, String fileName) {
        File arceusXDirectory = new File(getInternalStorageDirectoryPath(context), "Arceus X");
        File dir = new File(arceusXDirectory, "Workspace");
        dir.mkdirs();
        File theFile = new File(dir, fileName);
        return theFile.list();
    }

    public static boolean File_doesFileOrFolderExist(Context context, String fileName) {
        File arceusXDirectory = new File(getInternalStorageDirectoryPath(context), "Arceus X");
        File dir = new File(arceusXDirectory, "Workspace");
        dir.mkdirs();
        File theFile = new File(dir, fileName);
        return theFile.exists();
    }

    public static Map<String, Object> Http_request(Context context, String Method, String url, HashMap<String, String> Headers) throws IOException {
        URL website = new URL(url);
        HttpURLConnection connection = (HttpURLConnection) website.openConnection();
        connection.setRequestMethod(Method);
        for (int i10 = 0; i10 < Headers.keySet().size(); i10++) {
            System.out.println(Headers.keySet().toArray()[i10] + " " + Headers.values().toArray()[i10]);
            connection.setRequestProperty(Headers.keySet().toArray()[i10].toString(), Headers.values().toArray()[i10].toString());
        }
        int responseCode = connection.getResponseCode();
        BufferedReader in2 = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        while (true) {
            String inputLine = in2.readLine();
            if (inputLine != null) {
                response.append(inputLine);
            } else {
                in2.close();
                Object headerFields = connection.getHeaderFields();
                Map<String, Object> result = new HashMap<>();
                result.put("statusCode", Integer.valueOf(responseCode));
                result.put("body", response.toString());
                result.put("headers", headerFields);
                return result;
            }
        }
    }

    public static boolean File_isFile(Context context, String fileName) {
        File arceusXDirectory = new File(getInternalStorageDirectoryPath(context), "Arceus X");
        File dir = new File(arceusXDirectory, "Workspace");
        dir.mkdirs();
        File theFile = new File(dir, fileName);
        return theFile.isFile();
    }

    public static void File_WriteFile(Context context, String fileName, String text) {
        File arceusXDirectory = new File(getInternalStorageDirectoryPath(context), "Arceus X");
        File dir = new File(arceusXDirectory, "Workspace");
        dir.mkdirs();
        try {
            File realFile = new File(dir, fileName);
            FileOutputStream writer = new FileOutputStream(realFile.getAbsolutePath());
            writer.write(text.getBytes());
            writer.close();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    public static void deleteDirectory(File theFile) {
        if (theFile.isDirectory()) {
            File[] contents = theFile.listFiles();
            if (contents != null) {
                for (File file : contents) {
                    if (file.isDirectory()) {
                        deleteDirectory(file);
                    } else {
                        file.delete();
                    }
                }
            }
            theFile.delete();
        }
    }

    /* JADX INFO: renamed from: com.axjava.JNIFunctions$d */
    class RunnableC1860d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f7201a;

        RunnableC1860d(Context context) {
            this.f7201a = context;
        }

        /* JADX INFO: renamed from: com.axjava.JNIFunctions$d$a */
        class a implements ClipboardManager.OnPrimaryClipChangedListener {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ ClipboardManager f7202a;

            a(RunnableC1860d this$0, ClipboardManager clipboardManager) {
                this.f7202a = clipboardManager;
            }

            @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
            public void onPrimaryClipChanged() {
                ClipData clipData = this.f7202a.getPrimaryClip();
                ClipData.Item item = clipData.getItemAt(0);
                String text = item.getText().toString();
                JNIFunctions.clipboardHistory.add(text);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ClipboardManager clipBoard = (ClipboardManager) this.f7201a.getSystemService("clipboard");
            clipBoard.addPrimaryClipChangedListener(new a(this, clipBoard));
        }
    }

    public static String[] File_readAutoExec(Context context) {
        File arceusXDirectory = new File(getInternalStorageDirectoryPath(context), "Arceus X");
        File dir = new File(arceusXDirectory, "autoexec");
        if (!dir.exists() && !dir.mkdirs()) {
            Toast.makeText(context, "An error occured while reading autoExec", 1).show();
        }
        File[] files = dir.listFiles();
        List<String> scripts = new ArrayList<>();
        if (files != null) {
            for (File file : files) {
                StringBuilder text = new StringBuilder();
                try {
                    BufferedReader br2 = new BufferedReader(new FileReader(file.getAbsoluteFile()));
                    while (true) {
                        String line = br2.readLine();
                        if (line == null) {
                            break;
                        }
                        text.append(line);
                        text.append('\n');
                    }
                    scripts.add(text.toString());
                    br2.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            }
        }
        String[] heyBro = new String[scripts.size()];
        for (int i10 = 0; i10 < heyBro.length; i10++) {
            heyBro[i10] = (String) scripts.toArray()[i10];
        }
        return heyBro;
    }

    public static String[] getFileClipboardHistory(Context context) {
        new Handler(Looper.getMainLooper()).post(new RunnableC1860d(context));
        List<String> list = clipboardHistory;
        return (String[]) list.toArray(new String[list.size()]);
    }

    public static boolean File_delete(Context context, String fileName) {
        File[] contents;
        File arceusXDirectory = new File(getInternalStorageDirectoryPath(context), "Arceus X");
        File dir = new File(arceusXDirectory, "Workspace");
        dir.mkdirs();
        File theFile = new File(dir, fileName);
        if (theFile.isDirectory() && (contents = theFile.listFiles()) != null) {
            for (File file : contents) {
                if (file.isDirectory()) {
                    deleteDirectory(file);
                } else {
                    file.delete();
                }
            }
        }
        return theFile.delete();
    }

    public static String File_readFile(Context context, String fileName) {
        File arceusXDirectory = new File(getInternalStorageDirectoryPath(context), "Arceus X");
        File dir = new File(arceusXDirectory, "Workspace");
        dir.mkdirs();
        File theFile = new File(dir, fileName);
        StringBuilder text = new StringBuilder();
        try {
            BufferedReader br2 = new BufferedReader(new FileReader(theFile));
            boolean firstLine = true;
            while (true) {
                try {
                    String line = br2.readLine();
                    if (line == null) {
                        break;
                    }
                    if (!firstLine) {
                        text.append('\n');
                    }
                    text.append(line);
                    firstLine = false;
                } catch (Throwable th2) {
                    try {
                        br2.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            br2.close();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        return text.toString();
    }

    public static void handlePasteEvent(Context context) {
        Log.e("PasteEvent", "Handling paste event");
        ClipboardManager clipboard = (ClipboardManager) context.getSystemService("clipboard");
        try {
            CharSequence text = clipboard.getPrimaryClip().getItemAt(0).getText();
            handleTextInput(text.toString());
        } catch (Exception e10) {
            Log.e("Arceus X", "Error while copying.");
            Toast.makeText(context, "Error while pasting...", 0).show();
        }
    }

    /* JADX INFO: renamed from: ez */
    public static boolean m8974ez(Context context, KeyEvent event) {
        if (event.getAction() == 0 && event.isCtrlPressed() && event.getKeyCode() == 50) {
            handlePasteEvent(context);
            return true;
        }
        if (event.getAction() == 0 && event.getKeyCode() == 279) {
            handlePasteEvent(context);
            return true;
        }
        if (event.getAction() == 2 && event.getKeyCode() == 0) {
            handlePasteEvent(context);
            return true;
        }
        return false;
    }

    public static String File_getArceusFolder(Context context, String folder_name) {
        File arceusXDirectory = new File(getInternalStorageDirectoryPath(context), folder_name);
        arceusXDirectory.mkdirs();
        return arceusXDirectory.getAbsolutePath();
    }

    public static float getMaxRefreshRate(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Display display = windowManager.getDefaultDisplay();
        Display.Mode mode = display.getMode();
        return mode.getRefreshRate();
    }

    public static int getWifiSignalStrength(Context context) {
        WifiManager wifi = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        WifiInfo wifiInfo = wifi.getConnectionInfo();
        int level = WifiManager.calculateSignalLevel(wifiInfo.getRssi(), 101);
        return level;
    }

    public static int getBatteryPercentage(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent batteryStatus = context.registerReceiver(null, intentFilter);
        if (batteryStatus == null) {
            throw new AssertionError();
        }
        int level = batteryStatus.getIntExtra("level", -1);
        int scale = batteryStatus.getIntExtra("scale", -1);
        float batteryPercentage = (level / scale) * 100.0f;
        return (int) batteryPercentage;
    }

    public static void AX_UpdatePopupAndMaybeInstall(final Context context, final int mode, final String textOrPath) {
        Runnable task = new Runnable() { // from class: com.axjava.c
            @Override // java.lang.Runnable
            public final void run() {
                JNIFunctions.lambda$AX_UpdatePopupAndMaybeInstall$2(context, mode, textOrPath);
            }
        };
        if (Looper.myLooper() == Looper.getMainLooper()) {
            task.run();
        } else {
            sUiHandler.post(task);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$AX_UpdatePopupAndMaybeInstall$2(Context context, int mode, String textOrPath) {
        String msg;
        try {
            Activity act = getActivityOrNull();
            Context ctx = (act == null || act.isFinishing()) ? context : act;
            if (ctx == null) {
                Log.e("ArceusX", "AX_UpdatePopupAndMaybeInstall: ctx is null");
                return;
            }
            if (mode == 0) {
                if (textOrPath != null && !textOrPath.isEmpty()) {
                    msg = textOrPath;
                } else {
                    msg = "Downloading update...";
                }
                AlertDialog alertDialog = sUpdateDialog;
                if (alertDialog != null && alertDialog.isShowing()) {
                    sUpdateDialog.setMessage(msg);
                    return;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(ctx);
                builder.setTitle("Update");
                builder.setMessage(msg);
                builder.setCancelable(false);
                AlertDialog alertDialogCreate = builder.create();
                sUpdateDialog = alertDialogCreate;
                alertDialogCreate.show();
                return;
            }
            if (mode == 1) {
                AlertDialog alertDialog2 = sUpdateDialog;
                if (alertDialog2 != null && alertDialog2.isShowing()) {
                    sUpdateDialog.setMessage(textOrPath != null ? textOrPath : "");
                    return;
                }
                return;
            }
            if (mode == 2) {
                AlertDialog alertDialog3 = sUpdateDialog;
                if (alertDialog3 != null) {
                    try {
                        alertDialog3.dismiss();
                    } catch (Throwable th2) {
                    }
                    sUpdateDialog = null;
                    return;
                }
                return;
            }
            if (mode == 3) {
                AlertDialog alertDialog4 = sUpdateDialog;
                if (alertDialog4 != null) {
                    try {
                        alertDialog4.dismiss();
                    } catch (Throwable th3) {
                    }
                    sUpdateDialog = null;
                }
                if (textOrPath == null || textOrPath.isEmpty()) {
                    Log.e("ArceusX", "INSTALL: empty apk path");
                    return;
                }
                File apk = new File(textOrPath);
                if (!apk.exists() || apk.length() == 0) {
                    Log.e("ArceusX", "INSTALL: apk missing/empty: " + textOrPath);
                    return;
                }
                try {
                    Uri uri = Build.VERSION.SDK_INT >= 24 ? FileProvider.getUriForFile(ctx, ctx.getPackageName().concat(".fileprovider"), apk) : Uri.fromFile(apk);
                    Intent intent = new Intent(Build.VERSION.SDK_INT >= 24 ? "android.intent.action.INSTALL_PACKAGE" : "android.intent.action.VIEW");
                    intent.setDataAndType(uri, "application/vnd.android.package-archive");
                    intent.addFlags(268435456);
                    intent.addFlags(1);
                    if (Build.VERSION.SDK_INT >= 24) {
                        intent.putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true);
                    }
                    Intent intentCreateChooser = Intent.createChooser(intent, "Choose how to install");
                    intentCreateChooser.addFlags(268435456);
                    ctx.startActivity(intentCreateChooser);
                } catch (Throwable t8) {
                    Log.e("ArceusX", "INSTALL: failed to start installer: " + t8.getMessage(), t8);
                }
            }
        } catch (Throwable t10) {
            Log.e("ArceusX", "AX_UpdatePopupAndMaybeInstall failed: " + t10.getMessage(), t10);
        }
    }
}
