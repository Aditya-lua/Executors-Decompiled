package t7;

import android.util.Log;
import g7.m0;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class d implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<String> f32147a = new HashSet();

    @Override // g7.m0
    public void a(String str) {
        d(str, null);
    }

    @Override // g7.m0
    public void b(String str, Throwable th2) {
        if (g7.e.f17423a) {
            Log.d("LOTTIE", str, th2);
        }
    }

    @Override // g7.m0
    public void c(String str) {
        e(str, null);
    }

    @Override // g7.m0
    public void d(String str, Throwable th2) {
        Set<String> set = f32147a;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th2);
        set.add(str);
    }

    public void e(String str, Throwable th2) {
        if (g7.e.f17423a) {
            Log.d("LOTTIE", str, th2);
        }
    }
}
