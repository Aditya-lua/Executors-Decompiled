package s7;

import android.util.Log;
import f7.m0;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class d implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<String> f30494a = new HashSet();

    @Override // f7.m0
    public void a(String str) {
        d(str, null);
    }

    @Override // f7.m0
    public void b(String str, Throwable th2) {
        if (f7.e.f16344a) {
            Log.d("LOTTIE", str, th2);
        }
    }

    @Override // f7.m0
    public void c(String str) {
        e(str, null);
    }

    @Override // f7.m0
    public void d(String str, Throwable th2) {
        Set<String> set = f30494a;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th2);
        set.add(str);
    }

    public void e(String str, Throwable th2) {
        if (f7.e.f16344a) {
            Log.d("LOTTIE", str, th2);
        }
    }
}
