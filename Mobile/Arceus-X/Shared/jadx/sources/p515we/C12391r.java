package p515we;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: we.r */
/* JADX INFO: loaded from: classes2.dex */
public final class C12391r {

    /* JADX INFO: renamed from: b */
    public static final C12391r f44342b = m46441a().m46443a();

    /* JADX INFO: renamed from: a */
    public final Map<String, String> f44343a;

    /* JADX INFO: renamed from: we.r$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public HashMap<String, String> f44344a = new HashMap<>();

        /* JADX INFO: renamed from: a */
        public C12391r m46443a() {
            if (this.f44344a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            C12391r c12391r = new C12391r(Collections.unmodifiableMap(this.f44344a));
            this.f44344a = null;
            return c12391r;
        }
    }

    /* JADX INFO: renamed from: a */
    public static b m46441a() {
        return new b();
    }

    /* JADX INFO: renamed from: b */
    public Map<String, String> m46442b() {
        return this.f44343a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C12391r) {
            return this.f44343a.equals(((C12391r) obj).f44343a);
        }
        return false;
    }

    public int hashCode() {
        return this.f44343a.hashCode();
    }

    public String toString() {
        return this.f44343a.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C12391r(Map<String, String> map) {
        this.f44343a = map;
    }
}
