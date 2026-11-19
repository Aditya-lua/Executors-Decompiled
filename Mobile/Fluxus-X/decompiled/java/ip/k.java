package ip;

import android.content.Context;
import sn.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements wt.d<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<Context> f19660a;
    public final wt.i<a0.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<un.c.a> f19661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wt.i<ir.b> f19662d;

    public k(wt.i<Context> iVar, wt.i<a0.a> iVar2, wt.i<un.c.a> iVar3, wt.i<ir.b> iVar4) {
        this.f19660a = iVar;
        this.b = iVar2;
        this.f19661c = iVar3;
        this.f19662d = iVar4;
    }

    public static k a(wt.i<Context> iVar, wt.i<a0.a> iVar2, wt.i<un.c.a> iVar3, wt.i<ir.b> iVar4) {
        return new k(iVar, iVar2, iVar3, iVar4);
    }

    public static j c(Context context, a0.a aVar, un.c.a aVar2, ir.b bVar) {
        return new j(context, aVar, aVar2, bVar);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c(this.f19660a.get(), this.b.get(), this.f19661c.get(), this.f19662d.get());
    }
}
