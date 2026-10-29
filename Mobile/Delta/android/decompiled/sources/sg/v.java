package sg;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f31070a = new String[0];
    public static String b;

    public static final String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = "";
        boolean z10 = true;
        for (char c10 : str.toCharArray()) {
            if (z10 && Character.isLetter(c10)) {
                str2 = str2 + Character.toUpperCase(c10);
                z10 = false;
            } else {
                if (Character.isWhitespace(c10)) {
                    z10 = true;
                }
                str2 = str2 + c10;
            }
        }
        return str2;
    }

    public static String b() {
        String str = b;
        if (str != null) {
            return str;
        }
        String str2 = Build.DEVICE + "|" + Build.MODEL;
        for (String str3 : f31070a) {
            if (str3.endsWith(str2)) {
                String[] strArrSplit = str3.split("\\|");
                String str4 = strArrSplit[0];
                String str5 = strArrSplit[1];
                if (str5.startsWith(str4)) {
                    b = str5;
                } else {
                    b = str4 + " " + str5;
                }
                return b;
            }
        }
        String str6 = Build.MANUFACTURER;
        String str7 = Build.MODEL;
        if (a1.q0()) {
            b = a(str6) + " " + str7 + Build.DEVICE;
        } else if (str7.startsWith(str6)) {
            b = a(str7);
        } else if (str6.equalsIgnoreCase("HTC")) {
            b = "HTC " + str7;
        } else {
            b = a(str6) + " " + str7;
        }
        return b;
    }

    public static String c(Context context) {
        String string = Settings.Global.getString(context.getContentResolver(), "device_name");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        return "RobloxPerfTestUnknownDevice" + Build.MANUFACTURER + Build.MODEL;
    }
}
