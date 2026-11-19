package xg;

import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.barcode.common.Barcode;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f36667h = new a(4201, Barcode.FORMAT_AZTEC, 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f36668i = new a(1033, Barcode.FORMAT_UPC_E, 1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f36669j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f36670k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f36671l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f36672m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f36673n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f36674o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f36675a;
    public final int[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f36676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f36677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f36678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f36679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f36680g;

    static {
        a aVar = new a(67, 64, 1);
        f36669j = aVar;
        f36670k = new a(19, 16, 1);
        f36671l = new a(285, Barcode.FORMAT_QR_CODE, 0);
        a aVar2 = new a(MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE, Barcode.FORMAT_QR_CODE, 1);
        f36672m = aVar2;
        f36673n = aVar2;
        f36674o = aVar;
    }

    public a(int i10, int i11, int i12) {
        this.f36679f = i10;
        this.f36678e = i11;
        this.f36680g = i12;
        this.f36675a = new int[i11];
        this.b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f36675a[i14] = i13;
            i13 *= 2;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.b[this.f36675a[i15]] = i15;
        }
        this.f36676c = new b(this, new int[]{0});
        this.f36677d = new b(this, new int[]{1});
    }

    public static int a(int i10, int i11) {
        return i10 ^ i11;
    }

    public b b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f36676c;
        }
        int[] iArr = new int[i10 + 1];
        iArr[0] = i11;
        return new b(this, iArr);
    }

    public int c(int i10) {
        return this.f36675a[i10];
    }

    public int d() {
        return this.f36680g;
    }

    public b e() {
        return this.f36676c;
    }

    public int f(int i10) {
        if (i10 != 0) {
            return this.f36675a[(this.f36678e - this.b[i10]) - 1];
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
        int[] iArr = this.f36675a;
        int[] iArr2 = this.b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f36678e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f36679f) + ',' + this.f36678e + ')';
    }
}
