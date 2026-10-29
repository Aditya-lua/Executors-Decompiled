package np;

import ft.i;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<b> f26630a;

    public f(i<b> iVar) {
        this.f26630a = iVar;
    }

    public static f a(i<b> iVar) {
        return new f(iVar);
    }

    public static e c(b bVar, String str) {
        return new e(bVar, str);
    }

    public e b(String str) {
        return c(this.f26630a.get(), str);
    }
}
