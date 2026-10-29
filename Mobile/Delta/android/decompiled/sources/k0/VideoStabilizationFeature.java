package k0;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: k0.e, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lk0/e;", "Li0/b;", "Lk0/e$b;", "mode", "<init>", "(Lk0/e$b;)V", "", "toString", "()Ljava/lang/String;", "g", "Lk0/e$b;", "f", "()Lk0/e$b;", "Lk0/b;", "h", "Lk0/b;", "c", "()Lk0/b;", "featureTypeInternal", "i", "b", "a", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VideoStabilizationFeature extends i0.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final b f22010j = b.OFF;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b mode;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final k0.b featureTypeInternal;

    /* JADX INFO: renamed from: k0.e$b */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lk0/e$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum b {
        OFF,
        ON,
        PREVIEW;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ qt.a f22016e = qt.b.a(a());
    }

    public VideoStabilizationFeature(@NotNull b mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.mode = mode;
        this.featureTypeInternal = k0.b.VIDEO_STABILIZATION;
    }

    @Override // i0.b
    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public k0.b getFeatureTypeInternal() {
        return this.featureTypeInternal;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final b getMode() {
        return this.mode;
    }

    @NotNull
    public String toString() {
        return "VideoStabilizationFeature(mode=" + this.mode.name() + ')';
    }
}
