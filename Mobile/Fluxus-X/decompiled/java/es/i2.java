package es;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class i2 implements wt.d<Set<Object>> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i2 f14255a = new i2();
    }

    public static i2 a() {
        return a.f14255a;
    }

    public static Set<Object> c() {
        return (Set) wt.h.e(h2.a());
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<Object> get() {
        return c();
    }
}
