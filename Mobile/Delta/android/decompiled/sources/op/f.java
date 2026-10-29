package op;

import an.a0;
import ft.h;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements ft.d<Set<a0<?>>> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f27574a = new f();
    }

    public static f a() {
        return a.f27574a;
    }

    public static Set<a0<?>> c() {
        return (Set) h.e(e.a());
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<a0<?>> get() {
        return c();
    }
}
