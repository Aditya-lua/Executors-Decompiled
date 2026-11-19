package z7;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39158a;

    public c(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f39158a = str;
    }

    public static c b(@NonNull String str) {
        return new c(str);
    }

    public String a() {
        return this.f39158a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f39158a.equals(((c) obj).f39158a);
        }
        return false;
    }

    public int hashCode() {
        return this.f39158a.hashCode() ^ 1000003;
    }

    @NonNull
    public String toString() {
        return "Encoding{name=\"" + this.f39158a + "\"}";
    }
}
