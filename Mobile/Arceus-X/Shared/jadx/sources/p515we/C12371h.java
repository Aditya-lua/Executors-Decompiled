package p515we;

import java.lang.Enum;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: we.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C12371h<E extends Enum<E>, O> {

    /* JADX INFO: renamed from: a */
    public final Map<E, O> f44264a;

    /* JADX INFO: renamed from: b */
    public final Map<O, E> f44265b;

    /* JADX INFO: renamed from: we.h$b */
    public static final class b<E extends Enum<E>, O> {

        /* JADX INFO: renamed from: a */
        public Map<E, O> f44266a;

        /* JADX INFO: renamed from: b */
        public Map<O, E> f44267b;

        /* JADX INFO: renamed from: a */
        public b<E, O> m46322a(E e10, O o8) {
            this.f44266a.put(e10, o8);
            this.f44267b.put(o8, e10);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C12371h<E, O> m46323b() {
            return new C12371h<>(Collections.unmodifiableMap(this.f44266a), Collections.unmodifiableMap(this.f44267b));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b() {
            this.f44266a = new HashMap();
            this.f44267b = new HashMap();
        }
    }

    /* JADX INFO: renamed from: a */
    public static <E extends Enum<E>, O> b<E, O> m46319a() {
        return new b<>();
    }

    /* JADX INFO: renamed from: b */
    public O m46320b(E e10) throws GeneralSecurityException {
        O o8 = this.f44264a.get(e10);
        if (o8 != null) {
            return o8;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: " + e10);
    }

    /* JADX INFO: renamed from: c */
    public E m46321c(O o8) throws GeneralSecurityException {
        E e10 = this.f44265b.get(o8);
        if (e10 != null) {
            return e10;
        }
        throw new GeneralSecurityException("Unable to convert object enum: " + o8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C12371h(Map<E, O> map, Map<O, E> map2) {
        this.f44264a = map;
        this.f44265b = map2;
    }
}
