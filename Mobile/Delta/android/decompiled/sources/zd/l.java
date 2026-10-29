package zd;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements ae.y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ae.y0 f37489a;

    public l(ae.y0 y0Var) {
        this.f37489a = y0Var;
    }

    @Override // ae.y0, ae.u0
    public final /* bridge */ /* synthetic */ Object zza() {
        File file = (File) this.f37489a.zza();
        if (file == null) {
            return null;
        }
        return ce.d.a(file);
    }
}
