package ad;

import android.os.Build;
import androidx.annotation.NonNull;
import java.util.Locale;

/* JADX INFO: renamed from: ad.h */
/* JADX INFO: loaded from: classes2.dex */
public class C0136h {
    @NonNull
    /* JADX INFO: renamed from: a */
    public static String m400a() {
        String str = Build.MANUFACTURER;
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    /* JADX INFO: renamed from: b */
    public static boolean m401b() {
        return m400a().equals("meizu");
    }
}
