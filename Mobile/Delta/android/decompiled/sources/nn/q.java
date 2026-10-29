package nn;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class q implements rn.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<sn.b> f26424a;
    public final List<un.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<sn.e> f26425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<Character> f26426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f26427e;

    public q(List<sn.b> list, List<un.a> list2, List<sn.e> list3, Set<Character> set, f fVar) {
        this.f26424a = list;
        this.b = list2;
        this.f26425c = list3;
        this.f26426d = set;
        this.f26427e = fVar;
    }

    @Override // rn.c
    public <D> D a(Class<D> cls, String str) {
        return (D) this.f26427e.b(cls, str);
    }

    @Override // rn.c
    public List<sn.e> b() {
        return this.f26425c;
    }

    @Override // rn.c
    public List<un.a> c() {
        return this.b;
    }

    @Override // rn.c
    public Set<Character> d() {
        return this.f26426d;
    }

    @Override // rn.c
    public List<sn.b> e() {
        return this.f26424a;
    }
}
