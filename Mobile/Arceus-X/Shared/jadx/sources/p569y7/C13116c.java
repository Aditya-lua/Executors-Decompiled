package p569y7;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: y7.c */
/* JADX INFO: loaded from: classes.dex */
public final class C13116c {

    /* JADX INFO: renamed from: a */
    public final String f46363a;

    public C13116c(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f46363a = str;
    }

    /* JADX INFO: renamed from: b */
    public static C13116c m48729b(@NonNull String str) {
        return new C13116c(str);
    }

    /* JADX INFO: renamed from: a */
    public String m48730a() {
        return this.f46363a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13116c) {
            return this.f46363a.equals(((C13116c) obj).f46363a);
        }
        return false;
    }

    public int hashCode() {
        return this.f46363a.hashCode() ^ 1000003;
    }

    @NonNull
    public String toString() {
        return "Encoding{name=\"" + this.f46363a + "\"}";
    }
}
