package p100eb;

/* JADX INFO: renamed from: eb.o3 */
/* JADX INFO: loaded from: classes.dex */
public final class C4982o3 extends C5000r3 {

    /* JADX INFO: renamed from: b */
    public final byte[] f19712b;

    /* JADX INFO: renamed from: c */
    public int f19713c;

    /* JADX INFO: renamed from: d */
    public int f19714d;

    /* JADX INFO: renamed from: e */
    public int f19715e;

    public /* synthetic */ C4982o3(byte[] bArr, int i10, int i11, boolean z10, C4976n3 c4976n3) {
        super(null);
        this.f19715e = Integer.MAX_VALUE;
        this.f19712b = bArr;
        this.f19713c = 0;
    }

    /* JADX INFO: renamed from: a */
    public final int m23686a(int i10) {
        int i11 = this.f19715e;
        this.f19715e = 0;
        int i12 = this.f19713c + this.f19714d;
        this.f19713c = i12;
        if (i12 <= 0) {
            this.f19714d = 0;
            return i11;
        }
        this.f19714d = i12;
        this.f19713c = 0;
        return i11;
    }
}
