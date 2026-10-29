package p296n0;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: n0.h3 */
/* JADX INFO: loaded from: classes.dex */
public class C8764h3 {

    /* JADX INFO: renamed from: a */
    public final boolean f31866a;

    /* JADX INFO: renamed from: b */
    public final Set<Class<? extends InterfaceC8758g3>> f31867b;

    /* JADX INFO: renamed from: c */
    public final Set<Class<? extends InterfaceC8758g3>> f31868c;

    /* JADX INFO: renamed from: n0.h3$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public boolean f31869a = true;

        /* JADX INFO: renamed from: b */
        public Set<Class<? extends InterfaceC8758g3>> f31870b;

        /* JADX INFO: renamed from: c */
        public Set<Class<? extends InterfaceC8758g3>> f31871c;

        /* JADX INFO: renamed from: a */
        public C8764h3 m35148a() {
            return new C8764h3(this.f31869a, this.f31870b, this.f31871c);
        }

        /* JADX INFO: renamed from: b */
        public b m35149b(Set<Class<? extends InterfaceC8758g3>> set) {
            this.f31871c = new HashSet(set);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m35150c(Set<Class<? extends InterfaceC8758g3>> set) {
            this.f31870b = new HashSet(set);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m35151d(boolean z10) {
            this.f31869a = z10;
            return this;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C8764h3 m35146b() {
        return new b().m35151d(true).m35148a();
    }

    /* JADX INFO: renamed from: a */
    public boolean m35147a(Class<? extends InterfaceC8758g3> cls, boolean z10) {
        if (this.f31867b.contains(cls)) {
            return true;
        }
        return !this.f31868c.contains(cls) && this.f31866a && z10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8764h3)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C8764h3 c8764h3 = (C8764h3) obj;
        return this.f31866a == c8764h3.f31866a && Objects.equals(this.f31867b, c8764h3.f31867b) && Objects.equals(this.f31868c, c8764h3.f31868c);
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f31866a), this.f31867b, this.f31868c);
    }

    public String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.f31866a + ", forceEnabledQuirks=" + this.f31867b + ", forceDisabledQuirks=" + this.f31868c + '}';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C8764h3(boolean z10, Set<Class<? extends InterfaceC8758g3>> set, Set<Class<? extends InterfaceC8758g3>> set2) {
        this.f31866a = z10;
        this.f31867b = set == null ? Collections.EMPTY_SET : new HashSet<>(set);
        this.f31868c = set2 == null ? Collections.EMPTY_SET : new HashSet<>(set2);
    }
}
