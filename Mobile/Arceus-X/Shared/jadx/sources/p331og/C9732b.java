package p331og;

/* JADX INFO: renamed from: og.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C9732b {

    /* JADX INFO: renamed from: a */
    public final C9731a f35422a;

    /* JADX INFO: renamed from: b */
    public final int[] f35423b;

    public C9732b(C9731a c9731a, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f35422a = c9731a;
        int length = iArr.length;
        int i10 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f35423b = iArr;
            return;
        }
        while (i10 < length && iArr[i10] == 0) {
            i10++;
        }
        if (i10 == length) {
            this.f35423b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i10];
        this.f35423b = iArr2;
        System.arraycopy(iArr, i10, iArr2, 0, iArr2.length);
    }

    /* JADX INFO: renamed from: a */
    public C9732b m38510a(C9732b c9732b) {
        if (!this.f35422a.equals(c9732b.f35422a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (m38515f()) {
            return c9732b;
        }
        if (c9732b.m38515f()) {
            return this;
        }
        int[] iArr = this.f35423b;
        int[] iArr2 = c9732b.f35423b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i10 = length; i10 < iArr.length; i10++) {
            iArr3[i10] = C9731a.m38502a(iArr2[i10 - length], iArr[i10]);
        }
        return new C9732b(this.f35422a, iArr3);
    }

    /* JADX INFO: renamed from: b */
    public C9732b[] m38511b(C9732b c9732b) {
        if (!this.f35422a.equals(c9732b.f35422a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (c9732b.m38515f()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        C9732b c9732bM38506e = this.f35422a.m38506e();
        int iM38507f = this.f35422a.m38507f(c9732b.m38512c(c9732b.m38514e()));
        C9732b c9732bM38510a = this;
        while (c9732bM38510a.m38514e() >= c9732b.m38514e() && !c9732bM38510a.m38515f()) {
            int iM38514e = c9732bM38510a.m38514e() - c9732b.m38514e();
            int iM38509h = this.f35422a.m38509h(c9732bM38510a.m38512c(c9732bM38510a.m38514e()), iM38507f);
            C9732b c9732bM38517h = c9732b.m38517h(iM38514e, iM38509h);
            c9732bM38506e = c9732bM38506e.m38510a(this.f35422a.m38503b(iM38514e, iM38509h));
            c9732bM38510a = c9732bM38510a.m38510a(c9732bM38517h);
        }
        return new C9732b[]{c9732bM38506e, c9732bM38510a};
    }

    /* JADX INFO: renamed from: c */
    public int m38512c(int i10) {
        int[] iArr = this.f35423b;
        return iArr[(iArr.length - 1) - i10];
    }

    /* JADX INFO: renamed from: d */
    public int[] m38513d() {
        return this.f35423b;
    }

    /* JADX INFO: renamed from: e */
    public int m38514e() {
        return this.f35423b.length - 1;
    }

    /* JADX INFO: renamed from: f */
    public boolean m38515f() {
        return this.f35423b[0] == 0;
    }

    /* JADX INFO: renamed from: g */
    public C9732b m38516g(C9732b c9732b) {
        if (!this.f35422a.equals(c9732b.f35422a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (m38515f() || c9732b.m38515f()) {
            return this.f35422a.m38506e();
        }
        int[] iArr = this.f35423b;
        int length = iArr.length;
        int[] iArr2 = c9732b.f35423b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            for (int i12 = 0; i12 < length2; i12++) {
                int i13 = i10 + i12;
                iArr3[i13] = C9731a.m38502a(iArr3[i13], this.f35422a.m38509h(i11, iArr2[i12]));
            }
        }
        return new C9732b(this.f35422a, iArr3);
    }

    /* JADX INFO: renamed from: h */
    public C9732b m38517h(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f35422a.m38506e();
        }
        int length = this.f35423b.length;
        int[] iArr = new int[i10 + length];
        for (int i12 = 0; i12 < length; i12++) {
            iArr[i12] = this.f35422a.m38509h(this.f35423b[i12], i11);
        }
        return new C9732b(this.f35422a, iArr);
    }

    public String toString() {
        if (m38515f()) {
            return "0";
        }
        StringBuilder sb2 = new StringBuilder(m38514e() * 8);
        for (int iM38514e = m38514e(); iM38514e >= 0; iM38514e--) {
            int iM38512c = m38512c(iM38514e);
            if (iM38512c != 0) {
                if (iM38512c < 0) {
                    if (iM38514e == m38514e()) {
                        sb2.append("-");
                    } else {
                        sb2.append(" - ");
                    }
                    iM38512c = -iM38512c;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (iM38514e == 0 || iM38512c != 1) {
                    int iM38508g = this.f35422a.m38508g(iM38512c);
                    if (iM38508g == 0) {
                        sb2.append('1');
                    } else if (iM38508g == 1) {
                        sb2.append('a');
                    } else {
                        sb2.append("a^");
                        sb2.append(iM38508g);
                    }
                }
                if (iM38514e != 0) {
                    if (iM38514e == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(iM38514e);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
