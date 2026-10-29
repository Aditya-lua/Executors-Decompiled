package ve;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends oe.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f33000a;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33001a;

        static {
            int[] iArr = new int[ze.p0.values().length];
            f33001a = iArr;
            try {
                iArr[ze.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33001a[ze.p0.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33001a[ze.p0.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33001a[ze.p0.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public q(m0 m0Var) {
        this.f33000a = m0Var;
    }

    public static String c(ze.p0 p0Var) {
        int i10 = a.f33001a[p0Var.ordinal()];
        if (i10 == 1) {
            return "TINK";
        }
        if (i10 == 2) {
            return "LEGACY";
        }
        if (i10 != 3) {
            return i10 != 4 ? "UNKNOWN" : "CRUNCHY";
        }
        return "RAW";
    }

    @Override // oe.x
    public boolean a() {
        return this.f33000a.d().e0() != ze.p0.RAW;
    }

    public m0 b() {
        return this.f33000a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        m0 m0Var = ((q) obj).f33000a;
        return this.f33000a.d().e0().equals(m0Var.d().e0()) && this.f33000a.d().f0().equals(m0Var.d().f0()) && this.f33000a.d().g0().equals(m0Var.d().g0());
    }

    public int hashCode() {
        return Objects.hash(this.f33000a.d(), this.f33000a.a());
    }

    public String toString() {
        return String.format("(typeUrl=%s, outputPrefixType=%s)", this.f33000a.d().f0(), c(this.f33000a.d().e0()));
    }
}
