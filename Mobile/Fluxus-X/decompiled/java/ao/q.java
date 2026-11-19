package ao;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class q implements fo.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<go.b> f3116a;
    public final List<io.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<go.e> f3117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<Character> f3118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f3119e;

    public q(List<go.b> list, List<io.a> list2, List<go.e> list3, Set<Character> set, f fVar) {
        this.f3116a = list;
        this.b = list2;
        this.f3117c = list3;
        this.f3118d = set;
        this.f3119e = fVar;
    }

    @Override // fo.c
    public <D> D a(Class<D> cls, String str) {
        return (D) this.f3119e.b(cls, str);
    }

    @Override // fo.c
    public List<go.e> b() {
        return this.f3117c;
    }

    @Override // fo.c
    public List<io.a> c() {
        return this.b;
    }

    @Override // fo.c
    public Set<Character> d() {
        return this.f3118d;
    }

    @Override // fo.c
    public List<go.b> e() {
        return this.f3116a;
    }
}
