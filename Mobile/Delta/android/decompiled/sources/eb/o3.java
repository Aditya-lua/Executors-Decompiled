package eb;

/* JADX INFO: loaded from: classes.dex */
public final class o3 extends r3 {
    public final byte[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15317e;

    public /* synthetic */ o3(byte[] bArr, int i10, int i11, boolean z10, n3 n3Var) {
        super(null);
        this.f15317e = Integer.MAX_VALUE;
        this.b = bArr;
        this.f15315c = 0;
    }

    public final int a(int i10) {
        int i11 = this.f15317e;
        this.f15317e = 0;
        int i12 = this.f15315c + this.f15316d;
        this.f15315c = i12;
        if (i12 <= 0) {
            this.f15316d = 0;
            return i11;
        }
        this.f15316d = i12;
        this.f15315c = 0;
        return i11;
    }
}
