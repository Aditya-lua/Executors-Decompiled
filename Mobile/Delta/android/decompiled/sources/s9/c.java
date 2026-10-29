package s9;

import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;

/* JADX INFO: loaded from: classes.dex */
public final class c extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l9.k f30553a;

    public c(l9.k kVar) {
        this.f30553a = kVar;
    }

    @Override // s9.j
    public final void P1(ModuleInstallStatusUpdate moduleInstallStatusUpdate) {
        this.f30553a.c(new b(this, moduleInstallStatusUpdate));
    }
}
