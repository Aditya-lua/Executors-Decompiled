package ao;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class g implements io.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<eo.b0> f3075a;
    public final char b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f3079f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f3080g;

    public g(List<eo.b0> list, char c10, boolean z10, boolean z11, g gVar) {
        this.f3075a = list;
        this.b = c10;
        this.f3077d = z10;
        this.f3078e = z11;
        this.f3079f = gVar;
        this.f3076c = list.size();
    }

    @Override // io.b
    public Iterable<eo.b0> a(int i10) {
        if (i10 >= 1 && i10 <= length()) {
            List<eo.b0> list = this.f3075a;
            return list.subList(list.size() - i10, this.f3075a.size());
        }
        throw new IllegalArgumentException("length must be between 1 and " + length() + ", was " + i10);
    }

    @Override // io.b
    public eo.b0 b() {
        return this.f3075a.get(0);
    }

    @Override // io.b
    public boolean c() {
        return this.f3078e;
    }

    @Override // io.b
    public eo.b0 d() {
        List<eo.b0> list = this.f3075a;
        return list.get(list.size() - 1);
    }

    @Override // io.b
    public Iterable<eo.b0> e(int i10) {
        if (i10 >= 1 && i10 <= length()) {
            return this.f3075a.subList(0, i10);
        }
        throw new IllegalArgumentException("length must be between 1 and " + length() + ", was " + i10);
    }

    @Override // io.b
    public int f() {
        return this.f3076c;
    }

    @Override // io.b
    public boolean g() {
        return this.f3077d;
    }

    @Override // io.b
    public int length() {
        return this.f3075a.size();
    }
}
