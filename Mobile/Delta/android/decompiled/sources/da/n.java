package da;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14497a = 4368;
    public final ArrayList b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14498c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ga.q f14499d = ga.q.f18513d;

    static {
        new AtomicInteger(0);
    }

    public /* synthetic */ n(byte[] bArr) {
    }

    public final n a(int i10) {
        this.f14497a = 2101523;
        return this;
    }

    public final n b(String str) {
        this.f14498c = str;
        return this;
    }

    public final n c(ga.q qVar) {
        this.f14499d = (ga.q) n9.m.l(qVar);
        return this;
    }

    public final o d() {
        return new o(false, true, 17, false, this.f14497a, null, this.b, false, false, false, null, 0, 9, this.f14498c, this.f14499d, false, null);
    }
}
