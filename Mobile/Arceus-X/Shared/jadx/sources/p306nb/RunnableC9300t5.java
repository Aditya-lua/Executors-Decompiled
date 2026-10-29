package p306nb;

import android.util.Log;
import java.util.Objects;

/* JADX INFO: renamed from: nb.t5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9300t5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33488a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f33489b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f33490c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f33491d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f33492e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C9348w5 f33493f;

    public RunnableC9300t5(C9348w5 c9348w5, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f33488a = i10;
        this.f33489b = str;
        this.f33490c = obj;
        this.f33491d = obj2;
        this.f33492e = obj3;
        Objects.requireNonNull(c9348w5);
        this.f33493f = c9348w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9348w5 c9348w5 = this.f33493f;
        C9157k6 c9157k6M36339x = c9348w5.f33067a.m36339x();
        if (!c9157k6M36339x.m36454k()) {
            Log.println(6, c9348w5.m37013z(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (c9348w5.m36999D() == 0) {
            C9094g7 c9094g7 = c9348w5.f33067a;
            if (c9094g7.m36338w().m36400B()) {
                c9094g7.mo36323c();
                c9348w5.m37000E('C');
            } else {
                c9094g7.mo36323c();
                c9348w5.m37000E('c');
            }
        }
        if (c9348w5.m37001F() < 0) {
            c9348w5.f33067a.m36338w().m36399A();
            c9348w5.m37002G(133005L);
        }
        int i10 = this.f33488a;
        char cM36999D = c9348w5.m36999D();
        long jM37001F = c9348w5.m37001F();
        String str = this.f33489b;
        Object obj = this.f33490c;
        Object obj2 = this.f33491d;
        Object obj3 = this.f33492e;
        char cCharAt = "01VDIWEA?".charAt(i10);
        String strM36995A = C9348w5.m36995A(true, str, obj, obj2, obj3);
        int length = String.valueOf(cCharAt).length();
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(cM36999D).length() + String.valueOf(jM37001F).length() + 1 + strM36995A.length());
        sb2.append("2");
        sb2.append(cCharAt);
        sb2.append(cM36999D);
        sb2.append(jM37001F);
        sb2.append(":");
        sb2.append(strM36995A);
        String string = sb2.toString();
        if (string.length() > 1024) {
            string = str.substring(0, 1024);
        }
        C9125i6 c9125i6 = c9157k6M36339x.f33117e;
        if (c9125i6 != null) {
            c9125i6.m36349a(string, 1L);
        }
    }
}
