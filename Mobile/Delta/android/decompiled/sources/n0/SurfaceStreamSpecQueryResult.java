package n0;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: n0.y3, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ \u0010\f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R'\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\rR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Ln0/y3;", "", "", "Ln0/i4;", "Ln0/t3;", "useCaseStreamSpecs", "Ln0/g;", "attachedSurfaceStreamSpecs", "", "maxSupportedFrameRate", "<init>", "(Ljava/util/Map;Ljava/util/Map;I)V", "a", "()Ljava/util/Map;", "b", "c", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getUseCaseStreamSpecs", "getAttachedSurfaceStreamSpecs", "I", "getMaxSupportedFrameRate", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SurfaceStreamSpecQueryResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Map<i4<?>, t3> useCaseStreamSpecs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final Map<g, t3> attachedSurfaceStreamSpecs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final int maxSupportedFrameRate;

    /* JADX WARN: Multi-variable type inference failed */
    public SurfaceStreamSpecQueryResult(@NotNull Map<i4<?>, ? extends t3> useCaseStreamSpecs, @NotNull Map<g, ? extends t3> attachedSurfaceStreamSpecs, int i10) {
        Intrinsics.checkNotNullParameter(useCaseStreamSpecs, "useCaseStreamSpecs");
        Intrinsics.checkNotNullParameter(attachedSurfaceStreamSpecs, "attachedSurfaceStreamSpecs");
        this.useCaseStreamSpecs = useCaseStreamSpecs;
        this.attachedSurfaceStreamSpecs = attachedSurfaceStreamSpecs;
        this.maxSupportedFrameRate = i10;
    }

    @NotNull
    public final Map<i4<?>, t3> a() {
        return this.useCaseStreamSpecs;
    }

    @NotNull
    public final Map<g, t3> b() {
        return this.attachedSurfaceStreamSpecs;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMaxSupportedFrameRate() {
        return this.maxSupportedFrameRate;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SurfaceStreamSpecQueryResult)) {
            return false;
        }
        SurfaceStreamSpecQueryResult surfaceStreamSpecQueryResult = (SurfaceStreamSpecQueryResult) other;
        return Intrinsics.c(this.useCaseStreamSpecs, surfaceStreamSpecQueryResult.useCaseStreamSpecs) && Intrinsics.c(this.attachedSurfaceStreamSpecs, surfaceStreamSpecQueryResult.attachedSurfaceStreamSpecs) && this.maxSupportedFrameRate == surfaceStreamSpecQueryResult.maxSupportedFrameRate;
    }

    public int hashCode() {
        return (((this.useCaseStreamSpecs.hashCode() * 31) + this.attachedSurfaceStreamSpecs.hashCode()) * 31) + Integer.hashCode(this.maxSupportedFrameRate);
    }

    @NotNull
    public String toString() {
        return "SurfaceStreamSpecQueryResult(useCaseStreamSpecs=" + this.useCaseStreamSpecs + ", attachedSurfaceStreamSpecs=" + this.attachedSurfaceStreamSpecs + ", maxSupportedFrameRate=" + this.maxSupportedFrameRate + ')';
    }
}
