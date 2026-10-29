package p009a8;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: renamed from: a8.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0086d extends AbstractC0092j {

    /* JADX INFO: renamed from: a */
    public final List<AbstractC0095m> f226a;

    public C0086d(List<AbstractC0095m> list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f226a = list;
    }

    @Override // p009a8.AbstractC0092j
    @NonNull
    /* JADX INFO: renamed from: c */
    public List<AbstractC0095m> mo239c() {
        return this.f226a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0092j) {
            return this.f226a.equals(((AbstractC0092j) obj).mo239c());
        }
        return false;
    }

    public int hashCode() {
        return this.f226a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f226a + "}";
    }
}
