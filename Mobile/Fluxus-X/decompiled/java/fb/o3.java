package fb;

/* JADX INFO: loaded from: classes.dex */
public final class o3 extends r3 {
    public final byte[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15787e;

    public /* synthetic */ o3(byte[] bArr, int i10, int i11, boolean z10, n3 n3Var) {
        super(null);
        this.f15787e = Integer.MAX_VALUE;
        this.b = bArr;
        this.f15785c = 0;
    }

    public final int a(int i10) {
        int i11 = this.f15787e;
        this.f15787e = 0;
        int i12 = this.f15785c + this.f15786d;
        this.f15785c = i12;
        if (i12 <= 0) {
            this.f15786d = 0;
            return i11;
        }
        this.f15786d = i12;
        this.f15785c = 0;
        return i11;
    }
}
