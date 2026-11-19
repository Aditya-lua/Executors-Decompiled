package d8;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class j implements e8.b<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yt.a<Context> f11973a;
    public final yt.a<m8.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yt.a<m8.a> f11974c;

    public j(yt.a<Context> aVar, yt.a<m8.a> aVar2, yt.a<m8.a> aVar3) {
        this.f11973a = aVar;
        this.b = aVar2;
        this.f11974c = aVar3;
    }

    public static j a(yt.a<Context> aVar, yt.a<m8.a> aVar2, yt.a<m8.a> aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(Context context, m8.a aVar, m8.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.f11973a.get(), this.b.get(), this.f11974c.get());
    }
}
