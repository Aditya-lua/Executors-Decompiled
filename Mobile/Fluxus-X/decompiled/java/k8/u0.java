package k8;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class u0 implements e8.b<t0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yt.a<Context> f21208a;
    public final yt.a<String> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yt.a<Integer> f21209c;

    public u0(yt.a<Context> aVar, yt.a<String> aVar2, yt.a<Integer> aVar3) {
        this.f21208a = aVar;
        this.b = aVar2;
        this.f21209c = aVar3;
    }

    public static u0 a(yt.a<Context> aVar, yt.a<String> aVar2, yt.a<Integer> aVar3) {
        return new u0(aVar, aVar2, aVar3);
    }

    public static t0 c(Context context, String str, int i10) {
        return new t0(context, str, i10);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t0 get() {
        return c(this.f21208a.get(), this.b.get(), this.f21209c.get().intValue());
    }
}
