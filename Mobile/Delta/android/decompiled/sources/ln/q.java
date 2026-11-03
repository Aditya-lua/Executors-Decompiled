package ln;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class q implements pn.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<qn.b> f23713a;
    public final List<sn.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<qn.e> f23714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<Character> f23715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f23716e;

    public q(List<qn.b> list, List<sn.a> list2, List<qn.e> list3, Set<Character> set, f fVar) {
        this.f23713a = list;
        this.b = list2;
        this.f23714c = list3;
        this.f23715d = set;
        this.f23716e = fVar;
    }

    @Override // pn.c
    public <D> D a(Class<D> cls, String str) {
        return (D) this.f23716e.b(cls, str);
    }

    @Override // pn.c
    public List<qn.e> b() {
        return this.f23714c;
    }

    @Override // pn.c
    public List<sn.a> c() {
        return this.b;
    }

    @Override // pn.c
    public Set<Character> d() {
        return this.f23715d;
    }

    @Override // pn.c
    public List<qn.b> e() {
        return this.f23713a;
    }
}
