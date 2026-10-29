package p515we;

import af.EnumC0238p0;
import java.util.Objects;
import pe.AbstractC10243x;

/* JADX INFO: renamed from: we.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C12389q extends AbstractC10243x {

    /* JADX INFO: renamed from: a */
    public final C12382m0 f44328a;

    /* JADX INFO: renamed from: we.q$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f44329a;

        static {
            int[] iArr = new int[EnumC0238p0.values().length];
            f44329a = iArr;
            try {
                iArr[EnumC0238p0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44329a[EnumC0238p0.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44329a[EnumC0238p0.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44329a[EnumC0238p0.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C12389q(C12382m0 c12382m0) {
        this.f44328a = c12382m0;
    }

    /* JADX INFO: renamed from: c */
    public static String m46420c(EnumC0238p0 enumC0238p0) {
        int i10 = a.f44329a[enumC0238p0.ordinal()];
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

    @Override // pe.AbstractC10243x
    /* JADX INFO: renamed from: a */
    public boolean mo7230a() {
        return this.f44328a.m46404d().m762e0() != EnumC0238p0.RAW;
    }

    /* JADX INFO: renamed from: b */
    public C12382m0 m46421b() {
        return this.f44328a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12389q)) {
            return false;
        }
        C12382m0 c12382m0 = ((C12389q) obj).f44328a;
        return this.f44328a.m46404d().m762e0().equals(c12382m0.m46404d().m762e0()) && this.f44328a.m46404d().m763f0().equals(c12382m0.m46404d().m763f0()) && this.f44328a.m46404d().m764g0().equals(c12382m0.m46404d().m764g0());
    }

    public int hashCode() {
        return Objects.hash(this.f44328a.m46404d(), this.f44328a.mo46392a());
    }

    public String toString() {
        return String.format("(typeUrl=%s, outputPrefixType=%s)", this.f44328a.m46404d().m763f0(), m46420c(this.f44328a.m46404d().m762e0()));
    }
}
