package ng;

import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.barcode.common.Barcode;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f26261h = new a(4201, Barcode.FORMAT_AZTEC, 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f26262i = new a(1033, Barcode.FORMAT_UPC_E, 1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f26263j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f26264k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f26265l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f26266m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f26267n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f26268o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f26269a;
    public final int[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f26270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f26271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f26273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f26274g;

    static {
        a aVar = new a(67, 64, 1);
        f26263j = aVar;
        f26264k = new a(19, 16, 1);
        f26265l = new a(285, Barcode.FORMAT_QR_CODE, 0);
        a aVar2 = new a(MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE, Barcode.FORMAT_QR_CODE, 1);
        f26266m = aVar2;
        f26267n = aVar2;
        f26268o = aVar;
    }

    public a(int i10, int i11, int i12) {
        this.f26273f = i10;
        this.f26272e = i11;
        this.f26274g = i12;
        this.f26269a = new int[i11];
        this.b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f26269a[i14] = i13;
            i13 *= 2;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.b[this.f26269a[i15]] = i15;
        }
        this.f26270c = new b(this, new int[]{0});
        this.f26271d = new b(this, new int[]{1});
    }

    public static int a(int i10, int i11) {
        return i10 ^ i11;
    }

    public b b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f26270c;
        }
        int[] iArr = new int[i10 + 1];
        iArr[0] = i11;
        return new b(this, iArr);
    }

    public int c(int i10) {
        return this.f26269a[i10];
    }

    public int d() {
        return this.f26274g;
    }

    public b e() {
        return this.f26270c;
    }

    public int f(int i10) {
        if (i10 != 0) {
            return this.f26269a[(this.f26272e - this.b[i10]) - 1];
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
        int[] iArr = this.f26269a;
        int[] iArr2 = this.b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f26272e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f26273f) + ',' + this.f26272e + ')';
    }
}
