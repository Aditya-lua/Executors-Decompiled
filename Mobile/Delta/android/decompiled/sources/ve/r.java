package ve;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class r {
    public static final r b = a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, String> f33010a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HashMap<String, String> f33011a = new HashMap<>();

        public r a() {
            if (this.f33011a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            r rVar = new r(Collections.unmodifiableMap(this.f33011a));
            this.f33011a = null;
            return rVar;
        }
    }

    public static b a() {
        return new b();
    }

    public Map<String, String> b() {
        return this.f33010a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f33010a.equals(((r) obj).f33010a);
        }
        return false;
    }

    public int hashCode() {
        return this.f33010a.hashCode();
    }

    public String toString() {
        return this.f33010a.toString();
    }

    public r(Map<String, String> map) {
        this.f33010a = map;
    }
}
