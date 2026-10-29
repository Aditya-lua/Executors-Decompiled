package ce;

import ae.y0;
import java.io.File;
import zd.v0;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f4799a;
    public final y0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0 f4800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0 f4801d;

    public t(y0 y0Var, y0 y0Var2, y0 y0Var3, y0 y0Var4) {
        this.f4799a = y0Var;
        this.b = y0Var2;
        this.f4800c = y0Var3;
        this.f4801d = y0Var4;
    }

    @Override // ae.y0, ae.u0
    public final /* bridge */ /* synthetic */ Object zza() {
        return new a(((zd.k) this.f4799a).a(), (File) this.b.zza(), (v0) this.f4800c.zza(), ae.v0.a(this.f4801d));
    }
}
