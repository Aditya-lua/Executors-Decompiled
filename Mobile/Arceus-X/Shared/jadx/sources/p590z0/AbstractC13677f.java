package p590z0;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;
import p347p0.C10085a0;
import p531x0.C12602n0;

/* JADX INFO: renamed from: z0.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13677f {
    /* JADX INFO: renamed from: h */
    public static AbstractC13677f m49903h(int i10, int i11, Rect rect, Size size, int i12, boolean z10) {
        return m49904i(i10, i11, rect, size, i12, z10, false);
    }

    /* JADX INFO: renamed from: i */
    public static AbstractC13677f m49904i(int i10, int i11, Rect rect, Size size, int i12, boolean z10, boolean z11) {
        return new C13673b(UUID.randomUUID(), i10, i11, rect, size, i12, z10, z11);
    }

    /* JADX INFO: renamed from: j */
    public static AbstractC13677f m49905j(C12602n0 c12602n0) {
        return m49903h(c12602n0.m46962t(), c12602n0.m46958p(), c12602n0.m46956n(), C10085a0.m38878f(c12602n0.m46956n(), c12602n0.m46959q()), c12602n0.m46959q(), c12602n0.m46965w());
    }

    /* JADX INFO: renamed from: a */
    public abstract Rect mo49855a();

    /* JADX INFO: renamed from: b */
    public abstract int mo49856b();

    /* JADX INFO: renamed from: c */
    public abstract int mo49857c();

    /* JADX INFO: renamed from: d */
    public abstract Size mo49858d();

    /* JADX INFO: renamed from: e */
    public abstract int mo49859e();

    /* JADX INFO: renamed from: f */
    public abstract UUID mo49860f();

    /* JADX INFO: renamed from: g */
    public abstract boolean mo49861g();

    /* JADX INFO: renamed from: k */
    public abstract boolean mo49862k();
}
