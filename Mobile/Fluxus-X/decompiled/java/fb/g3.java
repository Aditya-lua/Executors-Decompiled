package fb;

/* JADX INFO: loaded from: classes.dex */
public final class g3 extends j3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f15739g;

    public g3(byte[] bArr, int i10, int i11) {
        super(bArr);
        m3.j(i10, i10 + i11, bArr.length);
        this.f15738f = i10;
        this.f15739g = i11;
    }

    @Override // fb.j3, fb.m3
    public final byte b(int i10) {
        int i11 = this.f15739g;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f15755e[this.f15738f + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    @Override // fb.j3, fb.m3
    public final byte c(int i10) {
        return this.f15755e[this.f15738f + i10];
    }

    @Override // fb.j3, fb.m3
    public final int d() {
        return this.f15739g;
    }

    @Override // fb.j3, fb.m3
    public final void e(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f15755e, this.f15738f, bArr, 0, i12);
    }

    @Override // fb.j3
    public final int q() {
        return this.f15738f;
    }
}
