package p268l9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p242k9.C7492b;
import sb.C11264k;

/* JADX INFO: renamed from: l9.z */
/* JADX INFO: loaded from: classes.dex */
public final class C8093z {

    /* JADX INFO: renamed from: a */
    public final Map f30130a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: b */
    public final Map f30131b = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: c */
    public final void m33298c(BasePendingResult basePendingResult, boolean z10) {
        this.f30130a.put(basePendingResult, Boolean.valueOf(z10));
        basePendingResult.mo9171c(new C8087x(this, basePendingResult));
    }

    /* JADX INFO: renamed from: d */
    public final void m33299d(C11264k c11264k, boolean z10) {
        this.f30131b.put(c11264k, Boolean.valueOf(z10));
        c11264k.m42326a().addOnCompleteListener(new C8090y(this, c11264k));
    }

    /* JADX INFO: renamed from: e */
    public final void m33300e(int i10, String str) {
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (str != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(str);
        }
        m33303h(true, new Status(20, sb2.toString()));
    }

    /* JADX INFO: renamed from: f */
    public final void m33301f() {
        m33303h(false, C8033f.f29990u);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m33302g() {
        return (this.f30130a.isEmpty() && this.f30131b.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public final void m33303h(boolean z10, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.f30130a) {
            map = new HashMap(this.f30130a);
        }
        synchronized (this.f30131b) {
            map2 = new HashMap(this.f30131b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).m9174f(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C11264k) entry2.getKey()).m42329d(new C7492b(status));
            }
        }
    }
}
