package h8;

import android.content.Context;
import i8.x;

/* JADX INFO: loaded from: classes.dex */
public final class i implements d8.b<x> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.a<Context> f18731a;
    public final ht.a<j8.d> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ht.a<i8.f> f18732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ht.a<l8.a> f18733d;

    public i(ht.a<Context> aVar, ht.a<j8.d> aVar2, ht.a<i8.f> aVar3, ht.a<l8.a> aVar4) {
        this.f18731a = aVar;
        this.b = aVar2;
        this.f18732c = aVar3;
        this.f18733d = aVar4;
    }

    public static i a(ht.a<Context> aVar, ht.a<j8.d> aVar2, ht.a<i8.f> aVar3, ht.a<l8.a> aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static x c(Context context, j8.d dVar, i8.f fVar, l8.a aVar) {
        return (x) d8.d.c(h.a(context, dVar, fVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c(this.f18731a.get(), this.b.get(), this.f18732c.get(), this.f18733d.get());
    }
}
