package p233k0;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p140g0.AbstractC5952w2;
import p140g0.C5888g2;
import p140g0.C5902k0;
import p140g0.C5931r1;
import p182i0.AbstractC6600b;
import p296n0.InterfaceC8799o0;

/* JADX INFO: renamed from: k0.a, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m31665d2 = {"Lk0/a;", "Li0/b;", "Lg0/k0;", "dynamicRange", "<init>", "(Lg0/k0;)V", "Ln0/o0;", "cameraInfoInternal", "Lg0/g2;", "sessionConfig", "", "d", "(Ln0/o0;Lg0/g2;)Z", "", "toString", "()Ljava/lang/String;", "g", "Lg0/k0;", "f", "()Lg0/k0;", "Lk0/b;", "h", "Lk0/b;", "c", "()Lk0/b;", "featureTypeInternal", "i", "a", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class DynamicRangeFeature extends AbstractC6600b {

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final C5902k0 f28485j;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    public final C5902k0 dynamicRange;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final EnumC7401b featureTypeInternal;

    static {
        C5902k0 SDR = C5902k0.f22550d;
        Intrinsics.checkNotNullExpressionValue(SDR, "SDR");
        f28485j = SDR;
    }

    public DynamicRangeFeature(@NotNull C5902k0 dynamicRange) {
        Intrinsics.checkNotNullParameter(dynamicRange, "dynamicRange");
        this.dynamicRange = dynamicRange;
        this.featureTypeInternal = EnumC7401b.DYNAMIC_RANGE;
    }

    @Override // p182i0.AbstractC6600b
    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public EnumC7401b getFeatureTypeInternal() {
        return this.featureTypeInternal;
    }

    @Override // p182i0.AbstractC6600b
    /* JADX INFO: renamed from: d */
    public boolean mo28506d(@NotNull InterfaceC8799o0 cameraInfoInternal, @NotNull C5888g2 sessionConfig) {
        Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
        Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
        Set<C5902k0> setMo35043c = cameraInfoInternal.mo35043c();
        Intrinsics.checkNotNullExpressionValue(setMo35043c, "getSupportedDynamicRanges(...)");
        C5931r1.m26561a("DynamicRangeFeature", "isSupportedIndividually: cameraInfoSupportedDynamicRanges = " + setMo35043c + ", this = " + this);
        if (!setMo35043c.contains(this.dynamicRange)) {
            return false;
        }
        for (AbstractC5952w2 abstractC5952w2 : sessionConfig.m26474k()) {
            Set<C5902k0> setMo6654A = abstractC5952w2.mo6654A(cameraInfoInternal);
            C5931r1.m26561a("DynamicRangeFeature", "isSupportedIndividually: useCaseSupportedDynamicRanges = " + setMo6654A + ", this = " + this + ", useCases = " + abstractC5952w2);
            if (setMo6654A != null && !setMo6654A.contains(this.dynamicRange)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final C5902k0 getDynamicRange() {
        return this.dynamicRange;
    }

    @NotNull
    public String toString() {
        return "DynamicRangeFeature(dynamicRange=" + this.dynamicRange + ')';
    }
}
