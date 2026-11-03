package c8;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class j implements d8.b<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.a<Context> f4828a;
    public final ft.a<l8.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.a<l8.a> f4829c;

    public j(ft.a<Context> aVar, ft.a<l8.a> aVar2, ft.a<l8.a> aVar3) {
        this.f4828a = aVar;
        this.b = aVar2;
        this.f4829c = aVar3;
    }

    public static j a(ft.a<Context> aVar, ft.a<l8.a> aVar2, ft.a<l8.a> aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(Context context, l8.a aVar, l8.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f4828a.get(), this.b.get(), this.f4829c.get());
    }
}
