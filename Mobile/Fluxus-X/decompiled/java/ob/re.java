package ob;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.e7 f27769a;
    public List b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f27770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f27771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ve f27772e;

    public /* synthetic */ re(ve veVar, byte[] bArr) {
        Objects.requireNonNull(veVar);
        this.f27772e = veVar;
    }

    public static final long b(com.google.android.gms.internal.measurement.s6 s6Var) {
        return ((s6Var.K() / 1000) / 60) / 60;
    }

    public final boolean a(long j10, com.google.android.gms.internal.measurement.s6 s6Var) {
        o9.s.l(s6Var);
        if (this.f27770c == null) {
            this.f27770c = new ArrayList();
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        if (!this.f27770c.isEmpty() && b((com.google.android.gms.internal.measurement.s6) this.f27770c.get(0)) != b(s6Var)) {
            return false;
        }
        long jA = this.f27771d + ((long) s6Var.a());
        ve veVar = this.f27772e;
        if (!veVar.B0().H(null, e5.f27237e1)) {
            veVar.B0();
            if (jA >= m.o()) {
                return false;
            }
        } else if (!this.f27770c.isEmpty()) {
            veVar.B0();
            if (jA >= m.o()) {
                return false;
            }
        }
        this.f27771d = jA;
        this.f27770c.add(s6Var);
        this.b.add(Long.valueOf(j10));
        int size = this.f27770c.size();
        veVar.B0();
        return size < Math.max(1, ((Integer) e5.f27253k.b(null)).intValue());
    }
}
