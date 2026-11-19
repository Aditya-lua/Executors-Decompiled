package ye;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class r {
    public static final r b = a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, String> f37821a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HashMap<String, String> f37822a = new HashMap<>();

        public r a() {
            if (this.f37822a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            r rVar = new r(Collections.unmodifiableMap(this.f37822a));
            this.f37822a = null;
            return rVar;
        }
    }

    public static b a() {
        return new b();
    }

    public Map<String, String> b() {
        return this.f37821a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f37821a.equals(((r) obj).f37821a);
        }
        return false;
    }

    public int hashCode() {
        return this.f37821a.hashCode();
    }

    public String toString() {
        return this.f37821a.toString();
    }

    public r(Map<String, String> map) {
        this.f37821a = map;
    }
}
