package nn;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class g implements un.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<qn.b0> f26383a;
    public final char b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f26385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f26386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f26387f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f26388g;

    public g(List<qn.b0> list, char c10, boolean z10, boolean z11, g gVar) {
        this.f26383a = list;
        this.b = c10;
        this.f26385d = z10;
        this.f26386e = z11;
        this.f26387f = gVar;
        this.f26384c = list.size();
    }

    @Override // un.b
    public Iterable<qn.b0> a(int i10) {
        if (i10 >= 1 && i10 <= length()) {
            List<qn.b0> list = this.f26383a;
            return list.subList(list.size() - i10, this.f26383a.size());
        }
        throw new IllegalArgumentException("length must be between 1 and " + length() + ", was " + i10);
    }

    @Override // un.b
    public qn.b0 b() {
        return this.f26383a.get(0);
    }

    @Override // un.b
    public boolean c() {
        return this.f26386e;
    }

    @Override // un.b
    public qn.b0 d() {
        List<qn.b0> list = this.f26383a;
        return list.get(list.size() - 1);
    }

    @Override // un.b
    public Iterable<qn.b0> e(int i10) {
        if (i10 >= 1 && i10 <= length()) {
            return this.f26383a.subList(0, i10);
        }
        throw new IllegalArgumentException("length must be between 1 and " + length() + ", was " + i10);
    }

    @Override // un.b
    public int f() {
        return this.f26384c;
    }

    @Override // un.b
    public boolean g() {
        return this.f26385d;
    }

    @Override // un.b
    public int length() {
        return this.f26383a.size();
    }
}
