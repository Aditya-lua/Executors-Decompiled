package p140g0;

/* JADX INFO: renamed from: g0.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5902k0 {

    /* JADX INFO: renamed from: c */
    public static final C5902k0 f22549c = new C5902k0(0, 0);

    /* JADX INFO: renamed from: d */
    public static final C5902k0 f22550d = new C5902k0(1, 8);

    /* JADX INFO: renamed from: e */
    public static final C5902k0 f22551e = new C5902k0(2, 10);

    /* JADX INFO: renamed from: f */
    public static final C5902k0 f22552f = new C5902k0(3, 10);

    /* JADX INFO: renamed from: g */
    public static final C5902k0 f22553g = new C5902k0(4, 10);

    /* JADX INFO: renamed from: h */
    public static final C5902k0 f22554h = new C5902k0(5, 10);

    /* JADX INFO: renamed from: i */
    public static final C5902k0 f22555i = new C5902k0(6, 10);

    /* JADX INFO: renamed from: j */
    public static final C5902k0 f22556j = new C5902k0(6, 8);

    /* JADX INFO: renamed from: a */
    public final int f22557a;

    /* JADX INFO: renamed from: b */
    public final int f22558b;

    public C5902k0(int i10, int i11) {
        this.f22557a = i10;
        this.f22558b = i11;
    }

    /* JADX INFO: renamed from: c */
    public static String m26515c(int i10) {
        switch (i10) {
            case 0:
                return "UNSPECIFIED";
            case 1:
                return "SDR";
            case 2:
                return "HDR_UNSPECIFIED";
            case 3:
                return "HLG";
            case 4:
                return "HDR10";
            case 5:
                return "HDR10_PLUS";
            case 6:
                return "DOLBY_VISION";
            default:
                return "<Unknown>";
        }
    }

    /* JADX INFO: renamed from: a */
    public int m26516a() {
        return this.f22558b;
    }

    /* JADX INFO: renamed from: b */
    public int m26517b() {
        return this.f22557a;
    }

    /* JADX INFO: renamed from: d */
    public boolean m26518d() {
        return m26519e() && m26517b() != 1 && m26516a() == 10;
    }

    /* JADX INFO: renamed from: e */
    public boolean m26519e() {
        return (m26517b() == 0 || m26517b() == 2 || m26516a() == 0) ? false : true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5902k0) {
            C5902k0 c5902k0 = (C5902k0) obj;
            if (this.f22557a == c5902k0.m26517b() && this.f22558b == c5902k0.m26516a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f22557a ^ 1000003) * 1000003) ^ this.f22558b;
    }

    public String toString() {
        return "DynamicRange@" + Integer.toHexString(System.identityHashCode(this)) + "{encoding=" + m26515c(this.f22557a) + ", bitDepth=" + this.f22558b + "}";
    }
}
