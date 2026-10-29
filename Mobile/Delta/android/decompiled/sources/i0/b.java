package i0;

import g0.g2;
import g0.k0;
import jt.h;
import jt.i;
import jt.l;
import k0.DynamicRangeFeature;
import k0.FpsRangeFeature;
import k0.ImageFormatFeature;
import k0.VideoStabilizationFeature;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import n0.o0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\b'\u0018\u0000 \u00172\u00020\u0001:\u0001\u000fB\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0013\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u000b8aX \u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Li0/b;", "", "<init>", "()V", "Ln0/o0;", "cameraInfoInternal", "Lg0/g2;", "sessionConfig", "", "d", "(Ln0/o0;Lg0/g2;)Z", "Lk0/b;", "", "e", "(Lk0/b;)I", "a", "Ljt/h;", "getFeatureType", "()I", "featureType", "c", "()Lk0/b;", "featureTypeInternal", "b", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final b f20148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final b f20149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final b f20150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final b f20151f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h featureType = i.b(new Function0() { // from class: i0.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(b.b(this.f20147a));
        }
    });

    /* JADX INFO: renamed from: i0.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class C0355b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20153a;

        static {
            int[] iArr = new int[k0.b.values().length];
            try {
                iArr[k0.b.DYNAMIC_RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k0.b.FPS_RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k0.b.VIDEO_STABILIZATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k0.b.IMAGE_FORMAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f20153a = iArr;
        }
    }

    static {
        k0 HLG_10_BIT = k0.f17472f;
        Intrinsics.checkNotNullExpressionValue(HLG_10_BIT, "HLG_10_BIT");
        f20148c = new DynamicRangeFeature(HLG_10_BIT);
        f20149d = new FpsRangeFeature(60, 60);
        f20150e = new VideoStabilizationFeature(VideoStabilizationFeature.b.PREVIEW);
        f20151f = new ImageFormatFeature(1);
    }

    public static final int b(b bVar) {
        return bVar.e(bVar.getFeatureTypeInternal());
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public abstract k0.b getFeatureTypeInternal();

    public boolean d(@NotNull o0 cameraInfoInternal, @NotNull g2 sessionConfig) {
        Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
        Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
        return true;
    }

    public final int e(k0.b bVar) {
        int i10 = C0355b.f20153a[bVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        throw new l();
    }
}
