package ln;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class g implements sn.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<on.b0> f23672a;
    public final char b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f23674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f23675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f23676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g f23677g;

    public g(List<on.b0> list, char c10, boolean z10, boolean z11, g gVar) {
        this.f23672a = list;
        this.b = c10;
        this.f23674d = z10;
        this.f23675e = z11;
        this.f23676f = gVar;
        this.f23673c = list.size();
    }

    @Override // sn.b
    public Iterable<on.b0> a(int i10) {
        if (i10 >= 1 && i10 <= length()) {
            List<on.b0> list = this.f23672a;
            return list.subList(list.size() - i10, this.f23672a.size());
        }
        throw new IllegalArgumentException("length must be between 1 and " + length() + ", was " + i10);
    }

    @Override // sn.b
    public on.b0 b() {
        return this.f23672a.get(0);
    }

    @Override // sn.b
    public boolean c() {
        return this.f23675e;
    }

    @Override // sn.b
    public on.b0 d() {
        List<on.b0> list = this.f23672a;
        return list.get(list.size() - 1);
    }

    @Override // sn.b
    public Iterable<on.b0> e(int i10) {
        if (i10 >= 1 && i10 <= length()) {
            return this.f23672a.subList(0, i10);
        }
        throw new IllegalArgumentException("length must be between 1 and " + length() + ", was " + i10);
    }

    @Override // sn.b
    public int f() {
        return this.f23673c;
    }

    @Override // sn.b
    public boolean g() {
        return this.f23674d;
    }

    @Override // sn.b
    public int length() {
        return this.f23672a.size();
    }
}
