package mp;

import dt.h;
import java.util.Set;
import ym.a0;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements dt.d<Set<a0<?>>> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f24963a = new f();
    }

    public static f a() {
        return a.f24963a;
    }

    public static Set<a0<?>> c() {
        return (Set) h.e(e.a());
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<a0<?>> get() {
        return c();
    }
}
