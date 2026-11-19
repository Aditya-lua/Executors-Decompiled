package ea;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13288a = 4368;
    public final ArrayList b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13289c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ha.r f13290d = ha.r.f18150d;

    static {
        new AtomicInteger(0);
    }

    public /* synthetic */ w(byte[] bArr) {
    }

    public final w a(int i10) {
        this.f13288a = 2101523;
        return this;
    }

    public final w b(String str) {
        this.f13289c = str;
        return this;
    }

    public final w c(ha.r rVar) {
        this.f13290d = (ha.r) o9.s.l(rVar);
        return this;
    }

    public final x d() {
        return new x(false, true, 17, false, this.f13288a, null, this.b, false, false, false, null, 0, 9, this.f13289c, this.f13290d, false, null);
    }
}
