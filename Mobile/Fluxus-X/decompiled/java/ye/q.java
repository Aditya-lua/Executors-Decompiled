package ye;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends re.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f37811a;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37812a;

        static {
            int[] iArr = new int[cf.p0.values().length];
            f37812a = iArr;
            try {
                iArr[cf.p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37812a[cf.p0.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37812a[cf.p0.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37812a[cf.p0.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public q(m0 m0Var) {
        this.f37811a = m0Var;
    }

    public static String c(cf.p0 p0Var) {
        int i10 = a.f37812a[p0Var.ordinal()];
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

    @Override // re.x
    public boolean a() {
        return this.f37811a.d().e0() != cf.p0.RAW;
    }

    public m0 b() {
        return this.f37811a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        m0 m0Var = ((q) obj).f37811a;
        return this.f37811a.d().e0().equals(m0Var.d().e0()) && this.f37811a.d().f0().equals(m0Var.d().f0()) && this.f37811a.d().g0().equals(m0Var.d().g0());
    }

    public int hashCode() {
        return Objects.hash(this.f37811a.d(), this.f37811a.a());
    }

    public String toString() {
        return String.format("(typeUrl=%s, outputPrefixType=%s)", this.f37811a.d().f0(), c(this.f37811a.d().e0()));
    }
}
