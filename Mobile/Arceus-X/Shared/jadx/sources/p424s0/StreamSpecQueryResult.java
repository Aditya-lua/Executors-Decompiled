package p424s0;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7690k0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p140g0.AbstractC5952w2;
import p296n0.AbstractC8827t3;

/* JADX INFO: renamed from: s0.l, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u0018"}, m31665d2 = {"Ls0/l;", "", "", "Lg0/w2;", "Ln0/t3;", "streamSpecs", "", "maxSupportedFrameRate", "<init>", "(Ljava/util/Map;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "I", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final /* data */ class StreamSpecQueryResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final Map<AbstractC5952w2, AbstractC8827t3> streamSpecs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int maxSupportedFrameRate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public StreamSpecQueryResult() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getMaxSupportedFrameRate() {
        return this.maxSupportedFrameRate;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Map<AbstractC5952w2, AbstractC8827t3> m42014b() {
        return this.streamSpecs;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StreamSpecQueryResult)) {
            return false;
        }
        StreamSpecQueryResult streamSpecQueryResult = (StreamSpecQueryResult) other;
        return Intrinsics.m31980c(this.streamSpecs, streamSpecQueryResult.streamSpecs) && this.maxSupportedFrameRate == streamSpecQueryResult.maxSupportedFrameRate;
    }

    public int hashCode() {
        return (this.streamSpecs.hashCode() * 31) + Integer.hashCode(this.maxSupportedFrameRate);
    }

    @NotNull
    public String toString() {
        return "StreamSpecQueryResult(streamSpecs=" + this.streamSpecs + ", maxSupportedFrameRate=" + this.maxSupportedFrameRate + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<g0.w2, ? extends n0.t3> */
    /* JADX WARN: Multi-variable type inference failed */
    public StreamSpecQueryResult(@NotNull Map<AbstractC5952w2, ? extends AbstractC8827t3> streamSpecs, int i10) {
        Intrinsics.checkNotNullParameter(streamSpecs, "streamSpecs");
        this.streamSpecs = streamSpecs;
        this.maxSupportedFrameRate = i10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
      (wrap java.util.Map:?: TERNARY null = ((wrap int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap java.util.Map:0x0004: INVOKE  STATIC call: kotlin.collections.k0.j():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:5)) : (r1v0 java.util.Map))
      (wrap int:?: TERNARY null = ((wrap int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (Integer.MAX_VALUE int) : (r2v0 int))
     A[MD:(java.util.Map<g0.w2, ? extends n0.t3>, int):void (m)] (LINE:6) call: s0.l.<init>(java.util.Map, int):void type: THIS */
    public /* synthetic */ StreamSpecQueryResult(Map map, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? C7690k0.m31795j() : map, (i11 & 2) != 0 ? Integer.MAX_VALUE : i10);
    }
}
