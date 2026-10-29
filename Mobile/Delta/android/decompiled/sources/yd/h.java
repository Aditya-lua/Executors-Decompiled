package yd;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f35838a;

    public h(i iVar) {
        this.f35838a = iVar;
    }

    @Override // yd.m
    public final void a(n nVar, File file, boolean z10) {
        this.f35838a.b.add(file);
        if (z10) {
            return;
        }
        this.f35838a.f35840c.set(false);
    }
}
