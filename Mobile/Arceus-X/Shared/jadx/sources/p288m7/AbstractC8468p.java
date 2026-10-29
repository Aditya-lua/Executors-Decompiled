package p288m7;

import java.util.Arrays;
import java.util.List;
import p444t7.C11550a;

/* JADX INFO: renamed from: m7.p */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8468p<V, O> implements InterfaceC8467o<V, O> {

    /* JADX INFO: renamed from: a */
    public final List<C11550a<V>> f31179a;

    public AbstractC8468p(List<C11550a<V>> list) {
        this.f31179a = list;
    }

    @Override // p288m7.InterfaceC8467o
    /* JADX INFO: renamed from: b */
    public List<C11550a<V>> mo34234b() {
        return this.f31179a;
    }

    @Override // p288m7.InterfaceC8467o
    /* JADX INFO: renamed from: c */
    public boolean mo34235c() {
        return this.f31179a.isEmpty() || (this.f31179a.size() == 1 && this.f31179a.get(0).m43186i());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.f31179a.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.f31179a.toArray()));
        }
        return sb2.toString();
    }
}
