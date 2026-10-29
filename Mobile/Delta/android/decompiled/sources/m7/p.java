package m7;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p<V, O> implements o<V, O> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<t7.a<V>> f24039a;

    public p(List<t7.a<V>> list) {
        this.f24039a = list;
    }

    @Override // m7.o
    public List<t7.a<V>> b() {
        return this.f24039a;
    }

    @Override // m7.o
    public boolean c() {
        return this.f24039a.isEmpty() || (this.f24039a.size() == 1 && this.f24039a.get(0).i());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.f24039a.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.f24039a.toArray()));
        }
        return sb2.toString();
    }
}
