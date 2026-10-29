package nb;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.a7 f25612a;
    public List b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f25613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f25614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ me f25615e;

    public /* synthetic */ ie(me meVar, byte[] bArr) {
        Objects.requireNonNull(meVar);
        this.f25615e = meVar;
    }

    public static final long b(com.google.android.gms.internal.measurement.o6 o6Var) {
        return ((o6Var.L() / 1000) / 60) / 60;
    }

    public final boolean a(long j10, com.google.android.gms.internal.measurement.o6 o6Var) {
        n9.m.l(o6Var);
        if (this.f25613c == null) {
            this.f25613c = new ArrayList();
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        if (!this.f25613c.isEmpty() && b((com.google.android.gms.internal.measurement.o6) this.f25613c.get(0)) != b(o6Var)) {
            return false;
        }
        long jA = this.f25614d + ((long) o6Var.a());
        me meVar = this.f25615e;
        if (!meVar.B0().H(null, z4.f26162e1)) {
            meVar.B0();
            if (jA >= k.o()) {
                return false;
            }
        } else if (!this.f25613c.isEmpty()) {
            meVar.B0();
            if (jA >= k.o()) {
                return false;
            }
        }
        this.f25614d = jA;
        this.f25613c.add(o6Var);
        this.b.add(Long.valueOf(j10));
        int size = this.f25613c.size();
        meVar.B0();
        return size < Math.max(1, ((Integer) z4.f26178k.b(null)).intValue());
    }
}
