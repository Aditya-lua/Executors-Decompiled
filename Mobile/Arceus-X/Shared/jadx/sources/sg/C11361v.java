package sg;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;

/* JADX INFO: renamed from: sg.v */
/* JADX INFO: loaded from: classes2.dex */
public class C11361v {

    /* JADX INFO: renamed from: a */
    public static final String[] f40172a = new String[0];

    /* JADX INFO: renamed from: b */
    public static String f40173b;

    /* JADX INFO: renamed from: a */
    public static final String m42570a(String str) {
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

    /* JADX INFO: renamed from: b */
    public static String m42571b() {
        String str = f40173b;
        if (str != null) {
            return str;
        }
        String str2 = Build.DEVICE + "|" + Build.MODEL;
        for (String str3 : f40172a) {
            if (str3.endsWith(str2)) {
                String[] strArrSplit = str3.split("\\|");
                String str4 = strArrSplit[0];
                String str5 = strArrSplit[1];
                if (str5.startsWith(str4)) {
                    f40173b = str5;
                } else {
                    f40173b = str4 + " " + str5;
                }
                return f40173b;
            }
        }
        String str6 = Build.MANUFACTURER;
        String str7 = Build.MODEL;
        if (C11295a1.m42471q0()) {
            f40173b = m42570a(str6) + " " + str7 + Build.DEVICE;
        } else if (str7.startsWith(str6)) {
            f40173b = m42570a(str7);
        } else if (str6.equalsIgnoreCase("HTC")) {
            f40173b = "HTC " + str7;
        } else {
            f40173b = m42570a(str6) + " " + str7;
        }
        return f40173b;
    }

    /* JADX INFO: renamed from: c */
    public static String m42572c(Context context) {
        String string = Settings.Global.getString(context.getContentResolver(), "device_name");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        return "RobloxPerfTestUnknownDevice" + Build.MANUFACTURER + Build.MODEL;
    }
}
