package zd;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f38077a;

    public h(i iVar) {
        this.f38077a = iVar;
    }

    @Override // zd.m
    public final void a(n nVar, File file, boolean z10) {
        this.f38077a.b.add(file);
        if (z10) {
            return;
        }
        this.f38077a.f38079c.set(false);
    }
}
