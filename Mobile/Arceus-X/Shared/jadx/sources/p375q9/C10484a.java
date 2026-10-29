package p375q9;

import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Locale;
import p305n9.C8935g;

/* JADX INFO: renamed from: q9.a */
/* JADX INFO: loaded from: classes.dex */
public class C10484a {

    /* JADX INFO: renamed from: a */
    public final String f37697a;

    /* JADX INFO: renamed from: b */
    public final String f37698b;

    /* JADX INFO: renamed from: c */
    public final C8935g f37699c;

    /* JADX INFO: renamed from: d */
    public final int f37700d;

    public C10484a(@NonNull String str, @NonNull String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            string = sb2.toString();
        }
        this.f37698b = string;
        this.f37697a = str;
        this.f37699c = new C8935g(str);
        int i10 = 2;
        while (i10 <= 7 && !Log.isLoggable(this.f37697a, i10)) {
            i10++;
        }
        this.f37700d = i10;
    }

    /* JADX INFO: renamed from: a */
    public void m40290a(@NonNull String str, @NonNull Object... objArr) {
        if (m40293d(3)) {
            Log.d(this.f37697a, m40292c(str, objArr));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m40291b(@NonNull String str, @NonNull Object... objArr) {
        Log.e(this.f37697a, m40292c(str, objArr));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public String m40292c(@NonNull String str, @NonNull Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f37698b.concat(str);
    }

    /* JADX INFO: renamed from: d */
    public boolean m40293d(int i10) {
        return this.f37700d <= i10;
    }
}
