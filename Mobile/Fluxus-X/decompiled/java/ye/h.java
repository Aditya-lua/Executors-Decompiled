package ye;

import java.lang.Enum;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class h<E extends Enum<E>, O> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<E, O> f37764a;
    public final Map<O, E> b;

    public static final class b<E extends Enum<E>, O> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Map<E, O> f37765a;
        public Map<O, E> b;

        public b<E, O> a(E e10, O o10) {
            this.f37765a.put(e10, o10);
            this.b.put(o10, e10);
            return this;
        }

        public h<E, O> b() {
            return new h<>(Collections.unmodifiableMap(this.f37765a), Collections.unmodifiableMap(this.b));
        }

        public b() {
            this.f37765a = new HashMap();
            this.b = new HashMap();
        }
    }

    public static <E extends Enum<E>, O> b<E, O> a() {
        return new b<>();
    }

    public O b(E e10) throws GeneralSecurityException {
        O o10 = this.f37764a.get(e10);
        if (o10 != null) {
            return o10;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: " + e10);
    }

    public E c(O o10) throws GeneralSecurityException {
        E e10 = this.b.get(o10);
        if (e10 != null) {
            return e10;
        }
        throw new GeneralSecurityException("Unable to convert object enum: " + o10);
    }

    public h(Map<E, O> map, Map<O, E> map2) {
        this.f37764a = map;
        this.b = map2;
    }
}
