package pg;

/* JADX INFO: loaded from: classes3.dex */
public enum a {
    L(1),
    M(0),
    Q(3),
    H(2);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a[] f28701f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28703a;

    static {
        a aVar = L;
        a aVar2 = M;
        a aVar3 = Q;
        f28701f = new a[]{aVar2, aVar, H, aVar3};
    }

    a(int i10) {
        this.f28703a = i10;
    }

    public int a() {
        return this.f28703a;
    }
}
