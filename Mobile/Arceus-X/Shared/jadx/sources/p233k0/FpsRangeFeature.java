package p233k0;

import android.util.Range;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p182i0.AbstractC6600b;

/* JADX INFO: renamed from: k0.c, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000b\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0014\u001a\u00020\u000f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m31665d2 = {"Lk0/c;", "Li0/b;", "", "minFps", "maxFps", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "g", "I", "()I", "h", "f", "Lk0/b;", "i", "Lk0/b;", "c", "()Lk0/b;", "featureTypeInternal", "j", "a", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class FpsRangeFeature extends AbstractC6600b {

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final Range<Integer> f28495k = new Range<>(30, 30);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    public final int minFps;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    public final int maxFps;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final EnumC7401b featureTypeInternal = EnumC7401b.FPS_RANGE;

    public FpsRangeFeature(int i10, int i11) {
        this.minFps = i10;
        this.maxFps = i11;
    }

    @Override // p182i0.AbstractC6600b
    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public EnumC7401b getFeatureTypeInternal() {
        return this.featureTypeInternal;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getMaxFps() {
        return this.maxFps;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getMinFps() {
        return this.minFps;
    }

    @NotNull
    public String toString() {
        return "FpsRangeFeature(minFps=" + this.minFps + ", maxFps=" + this.maxFps + ')';
    }
}
