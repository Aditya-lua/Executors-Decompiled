package fq;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class w1 implements wt.d<Set<nn.b0<?>>> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final w1 f16549a = new w1();
    }

    public static w1 a() {
        return a.f16549a;
    }

    public static Set<nn.b0<?>> c() {
        return (Set) wt.h.e(u1.a());
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<nn.b0<?>> get() {
        return c();
    }
}
