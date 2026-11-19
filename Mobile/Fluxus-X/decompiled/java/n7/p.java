package n7;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p<V, O> implements o<V, O> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<u7.a<V>> f25489a;

    public p(List<u7.a<V>> list) {
        this.f25489a = list;
    }

    @Override // n7.o
    public List<u7.a<V>> b() {
        return this.f25489a;
    }

    @Override // n7.o
    public boolean c() {
        return this.f25489a.isEmpty() || (this.f25489a.size() == 1 && this.f25489a.get(0).i());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.f25489a.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.f25489a.toArray()));
        }
        return sb2.toString();
    }
}
