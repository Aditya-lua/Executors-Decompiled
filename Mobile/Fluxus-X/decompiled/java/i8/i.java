package i8;

import android.content.Context;
import j8.x;

/* JADX INFO: loaded from: classes.dex */
public final class i implements e8.b<x> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yt.a<Context> f19288a;
    public final yt.a<k8.d> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yt.a<j8.f> f19289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yt.a<m8.a> f19290d;

    public i(yt.a<Context> aVar, yt.a<k8.d> aVar2, yt.a<j8.f> aVar3, yt.a<m8.a> aVar4) {
        this.f19288a = aVar;
        this.b = aVar2;
        this.f19289c = aVar3;
        this.f19290d = aVar4;
    }

    public static i a(yt.a<Context> aVar, yt.a<k8.d> aVar2, yt.a<j8.f> aVar3, yt.a<m8.a> aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static x c(Context context, k8.d dVar, j8.f fVar, m8.a aVar) {
        return (x) e8.d.c(h.a(context, dVar, fVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c(this.f19288a.get(), this.b.get(), this.f19289c.get(), this.f19290d.get());
    }
}
