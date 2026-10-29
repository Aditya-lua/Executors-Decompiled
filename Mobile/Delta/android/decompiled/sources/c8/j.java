package c8;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class j implements d8.b<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.a<Context> f4662a;
    public final ht.a<l8.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ht.a<l8.a> f4663c;

    public j(ht.a<Context> aVar, ht.a<l8.a> aVar2, ht.a<l8.a> aVar3) {
        this.f4662a = aVar;
        this.b = aVar2;
        this.f4663c = aVar3;
    }

    public static j a(ht.a<Context> aVar, ht.a<l8.a> aVar2, ht.a<l8.a> aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(Context context, l8.a aVar, l8.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f4662a.get(), this.b.get(), this.f4663c.get());
    }
}
