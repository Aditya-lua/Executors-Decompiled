package hn;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: hn.n0, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lhn/n0;", "", "", "dynamicRange", "", "previewStabilization", "<init>", "(JZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Z", "()Z", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExtraCameraOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final long dynamicRange;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean previewStabilization;

    public ExtraCameraOptions(long j10, boolean z10) {
        this.dynamicRange = j10;
        this.previewStabilization = z10;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getDynamicRange() {
        return this.dynamicRange;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getPreviewStabilization() {
        return this.previewStabilization;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtraCameraOptions)) {
            return false;
        }
        ExtraCameraOptions extraCameraOptions = (ExtraCameraOptions) other;
        return this.dynamicRange == extraCameraOptions.dynamicRange && this.previewStabilization == extraCameraOptions.previewStabilization;
    }

    public int hashCode() {
        return (Long.hashCode(this.dynamicRange) * 31) + Boolean.hashCode(this.previewStabilization);
    }

    @NotNull
    public String toString() {
        return "ExtraCameraOptions(dynamicRange=" + this.dynamicRange + ", previewStabilization=" + this.previewStabilization + ")";
    }

    public /* synthetic */ ExtraCameraOptions(long j10, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1L : j10, (i10 & 2) != 0 ? false : z10);
    }
}
