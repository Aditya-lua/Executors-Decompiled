package eb;

/* JADX INFO: loaded from: classes.dex */
public final class g3 extends j3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15882f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f15883g;

    public g3(byte[] bArr, int i10, int i11) {
        super(bArr);
        m3.k(i10, i10 + i11, bArr.length);
        this.f15882f = i10;
        this.f15883g = i11;
    }

    @Override // eb.j3, eb.m3
    public final byte b(int i10) {
        int i11 = this.f15883g;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f15899e[this.f15882f + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    @Override // eb.j3, eb.m3
    public final byte c(int i10) {
        return this.f15899e[this.f15882f + i10];
    }

    @Override // eb.j3, eb.m3
    public final int d() {
        return this.f15883g;
    }

    @Override // eb.j3, eb.m3
    public final void e(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f15899e, this.f15882f, bArr, 0, i12);
    }

    @Override // eb.j3
    public final int t() {
        return this.f15882f;
    }
}
