package ng;

import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.barcode.common.Barcode;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f27198h = new a(4201, Barcode.FORMAT_AZTEC, 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f27199i = new a(1033, Barcode.FORMAT_UPC_E, 1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f27200j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f27201k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f27202l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f27203m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f27204n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f27205o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f27206a;
    public final int[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f27207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f27208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f27209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f27210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f27211g;

    static {
        a aVar = new a(67, 64, 1);
        f27200j = aVar;
        f27201k = new a(19, 16, 1);
        f27202l = new a(285, Barcode.FORMAT_QR_CODE, 0);
        a aVar2 = new a(MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE, Barcode.FORMAT_QR_CODE, 1);
        f27203m = aVar2;
        f27204n = aVar2;
        f27205o = aVar;
    }

    public a(int i10, int i11, int i12) {
        this.f27210f = i10;
        this.f27209e = i11;
        this.f27211g = i12;
        this.f27206a = new int[i11];
        this.b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f27206a[i14] = i13;
            i13 *= 2;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.b[this.f27206a[i15]] = i15;
        }
        this.f27207c = new b(this, new int[]{0});
        this.f27208d = new b(this, new int[]{1});
    }

    public static int a(int i10, int i11) {
        return i10 ^ i11;
    }

    public b b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f27207c;
        }
        int[] iArr = new int[i10 + 1];
        iArr[0] = i11;
        return new b(this, iArr);
    }

    public int c(int i10) {
        return this.f27206a[i10];
    }

    public int d() {
        return this.f27211g;
    }

    public b e() {
        return this.f27207c;
    }

    public int f(int i10) {
        if (i10 != 0) {
            return this.f27206a[(this.f27209e - this.b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    public int g(int i10) {
        if (i10 != 0) {
            return this.b[i10];
        }
        throw new IllegalArgumentException();
    }

    public int h(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f27206a;
        int[] iArr2 = this.b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f27209e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f27210f) + ',' + this.f27209e + ')';
    }
}
