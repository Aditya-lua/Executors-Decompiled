package k0;

import g0.g2;
import g0.k0;
import g0.r1;
import g0.w2;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n0.o0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: k0.a, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lk0/a;", "Li0/b;", "Lg0/k0;", "dynamicRange", "<init>", "(Lg0/k0;)V", "Ln0/o0;", "cameraInfoInternal", "Lg0/g2;", "sessionConfig", "", "d", "(Ln0/o0;Lg0/g2;)Z", "", "toString", "()Ljava/lang/String;", "g", "Lg0/k0;", "f", "()Lg0/k0;", "Lk0/b;", "h", "Lk0/b;", "c", "()Lk0/b;", "featureTypeInternal", "i", "a", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DynamicRangeFeature extends i0.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final k0 f21993j;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final k0 dynamicRange;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b featureTypeInternal;

    static {
        k0 SDR = k0.f17470d;
        Intrinsics.checkNotNullExpressionValue(SDR, "SDR");
        f21993j = SDR;
    }

    public DynamicRangeFeature(@NotNull k0 dynamicRange) {
        Intrinsics.checkNotNullParameter(dynamicRange, "dynamicRange");
        this.dynamicRange = dynamicRange;
        this.featureTypeInternal = b.DYNAMIC_RANGE;
    }

    @Override // i0.b
    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public b getFeatureTypeInternal() {
        return this.featureTypeInternal;
    }

    @Override // i0.b
    public boolean d(@NotNull o0 cameraInfoInternal, @NotNull g2 sessionConfig) {
        Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
        Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
        Set<k0> setC = cameraInfoInternal.c();
        Intrinsics.checkNotNullExpressionValue(setC, "getSupportedDynamicRanges(...)");
        r1.a("DynamicRangeFeature", "isSupportedIndividually: cameraInfoSupportedDynamicRanges = " + setC + ", this = " + this);
        if (!setC.contains(this.dynamicRange)) {
            return false;
        }
        for (w2 w2Var : sessionConfig.k()) {
            Set<k0> setA = w2Var.A(cameraInfoInternal);
            r1.a("DynamicRangeFeature", "isSupportedIndividually: useCaseSupportedDynamicRanges = " + setA + ", this = " + this + ", useCases = " + w2Var);
            if (setA != null && !setA.contains(this.dynamicRange)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final k0 getDynamicRange() {
        return this.dynamicRange;
    }

    @NotNull
    public String toString() {
        return "DynamicRangeFeature(dynamicRange=" + this.dynamicRange + ')';
    }
}
