package us;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: us.p */
/* JADX INFO: loaded from: classes3.dex */
public class C11950p<T> {

    /* JADX INFO: renamed from: a */
    public final String f42379a;

    public C11950p(@NonNull String str) {
        this.f42379a = str;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static <T> C11950p<T> m44605b(@NonNull String str) {
        return new C11950p<>(str);
    }

    /* JADX INFO: renamed from: a */
    public T m44606a(@NonNull InterfaceC11952r interfaceC11952r) {
        return (T) interfaceC11952r.mo44611a(this);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public T m44607c(@NonNull InterfaceC11952r interfaceC11952r) {
        T tM44606a = m44606a(interfaceC11952r);
        if (tM44606a != null) {
            return tM44606a;
        }
        throw new NullPointerException(this.f42379a);
    }

    /* JADX INFO: renamed from: d */
    public void m44608d(@NonNull InterfaceC11952r interfaceC11952r, T t8) {
        interfaceC11952r.mo44612b(this, t8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f42379a.equals(((C11950p) obj).f42379a);
    }

    public int hashCode() {
        return this.f42379a.hashCode();
    }

    public String toString() {
        return "Prop{name='" + this.f42379a + "'}";
    }
}
