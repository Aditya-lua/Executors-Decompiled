package q9;

import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Locale;
import n9.g;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29292a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f29293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f29294d;

    public a(@NonNull String str, @NonNull String... strArr) {
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
        this.b = string;
        this.f29292a = str;
        this.f29293c = new g(str);
        int i10 = 2;
        while (i10 <= 7 && !Log.isLoggable(this.f29292a, i10)) {
            i10++;
        }
        this.f29294d = i10;
    }

    public void a(@NonNull String str, @NonNull Object... objArr) {
        if (d(3)) {
            Log.d(this.f29292a, c(str, objArr));
        }
    }

    public void b(@NonNull String str, @NonNull Object... objArr) {
        Log.e(this.f29292a, c(str, objArr));
    }

    @NonNull
    public String c(@NonNull String str, @NonNull Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.b.concat(str);
    }

    public boolean d(int i10) {
        return this.f29294d <= i10;
    }
}
