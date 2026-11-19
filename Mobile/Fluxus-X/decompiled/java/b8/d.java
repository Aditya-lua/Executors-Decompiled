package b8;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<m> f3711a;

    public d(List<m> list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f3711a = list;
    }

    @Override // b8.j
    @NonNull
    public List<m> c() {
        return this.f3711a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f3711a.equals(((j) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f3711a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f3711a + "}";
    }
}
