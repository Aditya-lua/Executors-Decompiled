package ae;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements be.y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final be.y0 f445a;

    public l(be.y0 y0Var) {
        this.f445a = y0Var;
    }

    @Override // be.y0
    public final /* bridge */ /* synthetic */ Object zza() {
        File file = (File) this.f445a.zza();
        if (file == null) {
            return null;
        }
        return de.d.a(file);
    }
}
