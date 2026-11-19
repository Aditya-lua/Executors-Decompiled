package r9;

import android.util.Log;
import androidx.annotation.NonNull;
import com.github.luben.zstd.BuildConfig;
import java.util.Locale;
import o9.k;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30622a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f30623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f30624d;

    public a(@NonNull String str, @NonNull String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = BuildConfig.FLAVOR;
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
        this.b = string;
        this.f30622a = str;
        this.f30623c = new k(str);
        int i10 = 2;
        while (i10 <= 7 && !Log.isLoggable(this.f30622a, i10)) {
            i10++;
        }
        this.f30624d = i10;
    }

    public void a(@NonNull String str, @NonNull Object... objArr) {
        if (d(3)) {
            Log.d(this.f30622a, c(str, objArr));
        }
    }

    public void b(@NonNull String str, @NonNull Object... objArr) {
        Log.e(this.f30622a, c(str, objArr));
    }

    @NonNull
    public String c(@NonNull String str, @NonNull Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.b.concat(str);
    }

    public boolean d(int i10) {
        return this.f30624d <= i10;
    }
}
