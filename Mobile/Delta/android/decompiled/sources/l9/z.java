package l9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f23109a = Collections.synchronizedMap(new WeakHashMap());
    public final Map b = Collections.synchronizedMap(new WeakHashMap());

    public final void c(BasePendingResult basePendingResult, boolean z10) {
        this.f23109a.put(basePendingResult, Boolean.valueOf(z10));
        basePendingResult.c(new x(this, basePendingResult));
    }

    public final void d(sb.k kVar, boolean z10) {
        this.b.put(kVar, Boolean.valueOf(z10));
        kVar.a().addOnCompleteListener(new y(this, kVar));
    }

    public final void e(int i10, String str) {
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
        h(true, new Status(20, sb2.toString()));
    }

    public final void f() {
        h(false, f.f23001u);
    }

    public final boolean g() {
        return (this.f23109a.isEmpty() && this.b.isEmpty()) ? false : true;
    }

    public final void h(boolean z10, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.f23109a) {
            map = new HashMap(this.f23109a);
        }
        synchronized (this.b) {
            map2 = new HashMap(this.b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).f(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((sb.k) entry2.getKey()).d(new k9.b(status));
            }
        }
    }
}
