package y7;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35759a;

    public c(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f35759a = str;
    }

    public static c b(@NonNull String str) {
        return new c(str);
    }

    public String a() {
        return this.f35759a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f35759a.equals(((c) obj).f35759a);
        }
        return false;
    }

    public int hashCode() {
        return this.f35759a.hashCode() ^ 1000003;
    }

    @NonNull
    public String toString() {
        return "Encoding{name=\"" + this.f35759a + "\"}";
    }
}
