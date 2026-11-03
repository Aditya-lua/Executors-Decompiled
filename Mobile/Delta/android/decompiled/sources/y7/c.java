package y7;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36616a;

    public c(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f36616a = str;
    }

    public static c b(@NonNull String str) {
        return new c(str);
    }

    public String a() {
        return this.f36616a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f36616a.equals(((c) obj).f36616a);
        }
        return false;
    }

    public int hashCode() {
        return this.f36616a.hashCode() ^ 1000003;
    }

    @NonNull
    public String toString() {
        return "Encoding{name=\"" + this.f36616a + "\"}";
    }
}
