package n0;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25494a;
    public final Set<Class<? extends g3>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<Class<? extends g3>> f25495c;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f25496a = true;
        public Set<Class<? extends g3>> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Set<Class<? extends g3>> f25497c;

        public h3 a() {
            return new h3(this.f25496a, this.b, this.f25497c);
        }

        public b b(Set<Class<? extends g3>> set) {
            this.f25497c = new HashSet(set);
            return this;
        }

        public b c(Set<Class<? extends g3>> set) {
            this.b = new HashSet(set);
            return this;
        }

        public b d(boolean z10) {
            this.f25496a = z10;
            return this;
        }
    }

    public static h3 b() {
        return new b().d(true).a();
    }

    public boolean a(Class<? extends g3> cls, boolean z10) {
        if (this.b.contains(cls)) {
            return true;
        }
        return !this.f25495c.contains(cls) && this.f25494a && z10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h3)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        h3 h3Var = (h3) obj;
        return this.f25494a == h3Var.f25494a && Objects.equals(this.b, h3Var.b) && Objects.equals(this.f25495c, h3Var.f25495c);
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f25494a), this.b, this.f25495c);
    }

    public String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.f25494a + ", forceEnabledQuirks=" + this.b + ", forceDisabledQuirks=" + this.f25495c + '}';
    }

    public h3(boolean z10, Set<Class<? extends g3>> set, Set<Class<? extends g3>> set2) {
        this.f25494a = z10;
        this.b = set == null ? Collections.EMPTY_SET : new HashSet<>(set);
        this.f25495c = set2 == null ? Collections.EMPTY_SET : new HashSet<>(set2);
    }
}
