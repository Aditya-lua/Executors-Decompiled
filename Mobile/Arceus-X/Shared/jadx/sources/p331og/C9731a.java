package p331og;

import com.google.mlkit.common.MlKitException;

/* JADX INFO: renamed from: og.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C9731a {

    /* JADX INFO: renamed from: h */
    public static final C9731a f35407h = new C9731a(4201, 4096, 1);

    /* JADX INFO: renamed from: i */
    public static final C9731a f35408i = new C9731a(1033, 1024, 1);

    /* JADX INFO: renamed from: j */
    public static final C9731a f35409j;

    /* JADX INFO: renamed from: k */
    public static final C9731a f35410k;

    /* JADX INFO: renamed from: l */
    public static final C9731a f35411l;

    /* JADX INFO: renamed from: m */
    public static final C9731a f35412m;

    /* JADX INFO: renamed from: n */
    public static final C9731a f35413n;

    /* JADX INFO: renamed from: o */
    public static final C9731a f35414o;

    /* JADX INFO: renamed from: a */
    public final int[] f35415a;

    /* JADX INFO: renamed from: b */
    public final int[] f35416b;

    /* JADX INFO: renamed from: c */
    public final C9732b f35417c;

    /* JADX INFO: renamed from: d */
    public final C9732b f35418d;

    /* JADX INFO: renamed from: e */
    public final int f35419e;

    /* JADX INFO: renamed from: f */
    public final int f35420f;

    /* JADX INFO: renamed from: g */
    public final int f35421g;

    static {
        C9731a c9731a = new C9731a(67, 64, 1);
        f35409j = c9731a;
        f35410k = new C9731a(19, 16, 1);
        f35411l = new C9731a(285, 256, 0);
        C9731a c9731a2 = new C9731a(MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE, 256, 1);
        f35412m = c9731a2;
        f35413n = c9731a2;
        f35414o = c9731a;
    }

    public C9731a(int i10, int i11, int i12) {
        this.f35420f = i10;
        this.f35419e = i11;
        this.f35421g = i12;
        this.f35415a = new int[i11];
        this.f35416b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f35415a[i14] = i13;
            i13 *= 2;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f35416b[this.f35415a[i15]] = i15;
        }
        this.f35417c = new C9732b(this, new int[]{0});
        this.f35418d = new C9732b(this, new int[]{1});
    }

    /* JADX INFO: renamed from: a */
    public static int m38502a(int i10, int i11) {
        return i10 ^ i11;
    }

    /* JADX INFO: renamed from: b */
    public C9732b m38503b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f35417c;
        }
        int[] iArr = new int[i10 + 1];
        iArr[0] = i11;
        return new C9732b(this, iArr);
    }

    /* JADX INFO: renamed from: c */
    public int m38504c(int i10) {
        return this.f35415a[i10];
    }

    /* JADX INFO: renamed from: d */
    public int m38505d() {
        return this.f35421g;
    }

    /* JADX INFO: renamed from: e */
    public C9732b m38506e() {
        return this.f35417c;
    }

    /* JADX INFO: renamed from: f */
    public int m38507f(int i10) {
        if (i10 != 0) {
            return this.f35415a[(this.f35419e - this.f35416b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: renamed from: g */
    public int m38508g(int i10) {
        if (i10 != 0) {
            return this.f35416b[i10];
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: h */
    public int m38509h(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f35415a;
        int[] iArr2 = this.f35416b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f35419e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f35420f) + ',' + this.f35419e + ')';
    }
}
