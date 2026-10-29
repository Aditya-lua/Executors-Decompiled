package p431s7;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;
import p121f7.C5444e;
import p121f7.InterfaceC5461m0;

/* JADX INFO: renamed from: s7.d */
/* JADX INFO: loaded from: classes3.dex */
public class C11188d implements InterfaceC5461m0 {

    /* JADX INFO: renamed from: a */
    public static final Set<String> f39463a = new HashSet();

    @Override // p121f7.InterfaceC5461m0
    /* JADX INFO: renamed from: a */
    public void mo25067a(String str) {
        mo25070d(str, null);
    }

    @Override // p121f7.InterfaceC5461m0
    /* JADX INFO: renamed from: b */
    public void mo25068b(String str, Throwable th2) {
        if (C5444e.f21031a) {
            Log.d("LOTTIE", str, th2);
        }
    }

    @Override // p121f7.InterfaceC5461m0
    /* JADX INFO: renamed from: c */
    public void mo25069c(String str) {
        m42150e(str, null);
    }

    @Override // p121f7.InterfaceC5461m0
    /* JADX INFO: renamed from: d */
    public void mo25070d(String str, Throwable th2) {
        Set<String> set = f39463a;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th2);
        set.add(str);
    }

    /* JADX INFO: renamed from: e */
    public void m42150e(String str, Throwable th2) {
        if (C5444e.f21031a) {
            Log.d("LOTTIE", str, th2);
        }
    }
}
