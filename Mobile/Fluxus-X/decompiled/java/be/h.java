package be;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f3969a;

    public h(i iVar) {
        this.f3969a = iVar;
    }

    @Override // be.m
    public final void a(n nVar, File file, boolean z10) {
        this.f3969a.b.add(file);
        if (z10) {
            return;
        }
        this.f3969a.f3971c.set(false);
    }
}
