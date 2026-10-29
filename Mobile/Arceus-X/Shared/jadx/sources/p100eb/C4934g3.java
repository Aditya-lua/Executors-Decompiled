package p100eb;

/* JADX INFO: renamed from: eb.g3 */
/* JADX INFO: loaded from: classes.dex */
public final class C4934g3 extends C4952j3 {

    /* JADX INFO: renamed from: f */
    public final int f19651f;

    /* JADX INFO: renamed from: g */
    public final int f19652g;

    public C4934g3(byte[] bArr, int i10, int i11) {
        super(bArr);
        AbstractC4970m3.m23672k(i10, i10 + i11, bArr.length);
        this.f19651f = i10;
        this.f19652g = i11;
    }

    @Override // p100eb.C4952j3, p100eb.AbstractC4970m3
    /* JADX INFO: renamed from: b */
    public final byte mo23598b(int i10) {
        int i11 = this.f19652g;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f19675e[this.f19651f + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
    }

    @Override // p100eb.C4952j3, p100eb.AbstractC4970m3
    /* JADX INFO: renamed from: c */
    public final byte mo23599c(int i10) {
        return this.f19675e[this.f19651f + i10];
    }

    @Override // p100eb.C4952j3, p100eb.AbstractC4970m3
    /* JADX INFO: renamed from: d */
    public final int mo23600d() {
        return this.f19652g;
    }

    @Override // p100eb.C4952j3, p100eb.AbstractC4970m3
    /* JADX INFO: renamed from: e */
    public final void mo23601e(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f19675e, this.f19651f, bArr, 0, i12);
    }

    @Override // p100eb.C4952j3
    /* JADX INFO: renamed from: t */
    public final int mo23602t() {
        return this.f19651f;
    }
}
