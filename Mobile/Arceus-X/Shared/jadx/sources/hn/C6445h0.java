package hn;

import android.util.Range;
import android.util.Size;
import com.withpersona.sdk2.camera.CameraProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: hn.h0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010\u0015R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001f\u0010*\u001a\u0004\b!\u0010+R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b&\u0010,\u001a\u0004\b\u001a\u0010-R\u0017\u00102\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b\u001d\u00101¨\u00063"}, m31665d2 = {"Lhn/h0;", "", "", "id", "Landroid/util/Size;", "size", "", "maxFps", "Landroid/util/Range;", "", "targetFpsRange", "rotation", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "facingMode", "Lhn/n0;", "additionalOptions", "<init>", "(Ljava/lang/String;Landroid/util/Size;DLandroid/util/Range;ILcom/withpersona/sdk2/camera/CameraProperties$b;Lhn/n0;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Landroid/util/Size;", "f", "()Landroid/util/Size;", "c", "D", "getMaxFps", "()D", "Landroid/util/Range;", "g", "()Landroid/util/Range;", "e", "I", "Lcom/withpersona/sdk2/camera/CameraProperties$b;", "()Lcom/withpersona/sdk2/camera/CameraProperties$b;", "Lhn/n0;", "()Lhn/n0;", "Lcom/withpersona/sdk2/camera/CameraProperties;", "h", "Lcom/withpersona/sdk2/camera/CameraProperties;", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class C6445h0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Size size;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final double maxFps;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Range<Integer> targetFpsRange;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int rotation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    public final CameraProperties.EnumC3397b facing;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final ExtraCameraOptions additionalOptions;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final CameraProperties cameraProperties;

    public C6445h0(@NotNull String id2, @NotNull Size size, double d10, @NotNull Range<Integer> targetFpsRange, int i10, @NotNull CameraProperties.EnumC3397b facingMode, @NotNull ExtraCameraOptions additionalOptions) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(targetFpsRange, "targetFpsRange");
        Intrinsics.checkNotNullParameter(facingMode, "facingMode");
        Intrinsics.checkNotNullParameter(additionalOptions, "additionalOptions");
        this.id = id2;
        this.size = size;
        this.maxFps = d10;
        this.targetFpsRange = targetFpsRange;
        this.rotation = i10;
        this.facing = facingMode;
        this.additionalOptions = additionalOptions;
        this.cameraProperties = new CameraProperties(id2, facingMode, size, (int) d10, i10);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ExtraCameraOptions getAdditionalOptions() {
        return this.additionalOptions;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final CameraProperties getCameraProperties() {
        return this.cameraProperties;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final CameraProperties.EnumC3397b getFacing() {
        return this.facing;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getRotation() {
        return this.rotation;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C6445h0)) {
            return false;
        }
        C6445h0 c6445h0 = (C6445h0) other;
        return Intrinsics.m31980c(this.id, c6445h0.id) && Intrinsics.m31980c(this.size, c6445h0.size) && Double.compare(this.maxFps, c6445h0.maxFps) == 0 && Intrinsics.m31980c(this.targetFpsRange, c6445h0.targetFpsRange) && this.rotation == c6445h0.rotation && this.facing == c6445h0.facing && Intrinsics.m31980c(this.additionalOptions, c6445h0.additionalOptions);
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final Range<Integer> m28103g() {
        return this.targetFpsRange;
    }

    public int hashCode() {
        return (((((((((((this.id.hashCode() * 31) + this.size.hashCode()) * 31) + Double.hashCode(this.maxFps)) * 31) + this.targetFpsRange.hashCode()) * 31) + Integer.hashCode(this.rotation)) * 31) + this.facing.hashCode()) * 31) + this.additionalOptions.hashCode();
    }

    @NotNull
    public String toString() {
        return "(id=" + this.id + ", " + this.size.getWidth() + "x" + this.size.getHeight() + ", fps=" + this.targetFpsRange.getLower() + "-" + this.targetFpsRange.getUpper() + ", facing=" + this.facing + ")";
    }
}
