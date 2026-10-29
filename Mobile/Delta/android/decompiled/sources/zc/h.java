package zc;

import android.os.Build;
import androidx.annotation.NonNull;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class h {
    @NonNull
    public static String a() {
        String str = Build.MANUFACTURER;
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public static boolean b() {
        return a().equals("meizu");
    }
}
