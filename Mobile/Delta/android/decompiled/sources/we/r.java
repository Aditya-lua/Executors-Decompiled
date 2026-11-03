package we;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class r {
    public static final r b = a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, String> f34464a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HashMap<String, String> f34465a = new HashMap<>();

        public r a() {
            if (this.f34465a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            r rVar = new r(Collections.unmodifiableMap(this.f34465a));
            this.f34465a = null;
            return rVar;
        }
    }

    public static b a() {
        return new b();
    }

    public Map<String, String> b() {
        return this.f34464a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f34464a.equals(((r) obj).f34464a);
        }
        return false;
    }

    public int hashCode() {
        return this.f34464a.hashCode();
    }

    public String toString() {
        return this.f34464a.toString();
    }

    public r(Map<String, String> map) {
        this.f34464a = map;
    }
}
