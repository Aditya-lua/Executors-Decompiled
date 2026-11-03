package we;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends pe.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f34454a;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34455a;

        static {
            int[] iArr = new int[af.p0.values().length];
            f34455a = iArr;
            try {
                iArr[af.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34455a[af.p0.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34455a[af.p0.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34455a[af.p0.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public q(m0 m0Var) {
        this.f34454a = m0Var;
    }

    public static String c(af.p0 p0Var) {
        int i10 = a.f34455a[p0Var.ordinal()];
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

    @Override // pe.x
    public boolean a() {
        return this.f34454a.d().e0() != af.p0.RAW;
    }

    public m0 b() {
        return this.f34454a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        m0 m0Var = ((q) obj).f34454a;
        return this.f34454a.d().e0().equals(m0Var.d().e0()) && this.f34454a.d().f0().equals(m0Var.d().f0()) && this.f34454a.d().g0().equals(m0Var.d().g0());
    }

    public int hashCode() {
        return Objects.hash(this.f34454a.d(), this.f34454a.a());
    }

    public String toString() {
        return String.format("(typeUrl=%s, outputPrefixType=%s)", this.f34454a.d().f0(), c(this.f34454a.d().e0()));
    }
}
