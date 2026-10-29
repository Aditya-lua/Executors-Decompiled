package p306nb;

import com.google.android.gms.internal.measurement.C1968a7;
import com.google.android.gms.internal.measurement.C2226o6;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.ie */
/* JADX INFO: loaded from: classes.dex */
public final class C9133ie {

    /* JADX INFO: renamed from: a */
    public C1968a7 f33051a;

    /* JADX INFO: renamed from: b */
    public List f33052b;

    /* JADX INFO: renamed from: c */
    public List f33053c;

    /* JADX INFO: renamed from: d */
    public long f33054d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C9197me f33055e;

    public /* synthetic */ C9133ie(C9197me c9197me, byte[] bArr) {
        Objects.requireNonNull(c9197me);
        this.f33055e = c9197me;
    }

    /* JADX INFO: renamed from: b */
    public static final long m36367b(C2226o6 c2226o6) {
        return ((c2226o6.m10492M() / 1000) / 60) / 60;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m36368a(long j10, C2226o6 c2226o6) {
        C8953m.m36047l(c2226o6);
        if (this.f33053c == null) {
            this.f33053c = new ArrayList();
        }
        if (this.f33052b == null) {
            this.f33052b = new ArrayList();
        }
        if (!this.f33053c.isEmpty() && m36367b((C2226o6) this.f33053c.get(0)) != m36367b(c2226o6)) {
            return false;
        }
        long jMo10063a = this.f33054d + ((long) c2226o6.mo10063a());
        C9197me c9197me = this.f33055e;
        if (!c9197me.m36500B0().m36406H(null, C9395z4.f33771e1)) {
            c9197me.m36500B0();
            if (jMo10063a >= C9150k.m36395o()) {
                return false;
            }
        } else if (!this.f33053c.isEmpty()) {
            c9197me.m36500B0();
            if (jMo10063a >= C9150k.m36395o()) {
                return false;
            }
        }
        this.f33054d = jMo10063a;
        this.f33053c.add(c2226o6);
        this.f33052b.add(Long.valueOf(j10));
        int size = this.f33053c.size();
        c9197me.m36500B0();
        return size < Math.max(1, ((Integer) C9395z4.f33787k.m37079b(null)).intValue());
    }
}
