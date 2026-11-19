package ce;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements de.y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final de.y0 f4992a;

    public l(de.y0 y0Var) {
        this.f4992a = y0Var;
    }

    @Override // de.y0
    public final /* bridge */ /* synthetic */ Object zza() {
        File file = (File) this.f4992a.zza();
        if (file == null) {
            return null;
        }
        return fe.d.a(file);
    }
}
