package p182i0;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p140g0.C5888g2;
import p140g0.C5902k0;
import p229jt.C7342i;
import p229jt.C7345l;
import p229jt.InterfaceC7341h;
import p233k0.DynamicRangeFeature;
import p233k0.EnumC7401b;
import p233k0.FpsRangeFeature;
import p233k0.ImageFormatFeature;
import p233k0.VideoStabilizationFeature;
import p296n0.InterfaceC8799o0;

/* JADX INFO: renamed from: i0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\b'\u0018\u0000 \u00172\u00020\u0001:\u0001\u000fB\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0013\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u000b8aX \u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m31665d2 = {"Li0/b;", "", "<init>", "()V", "Ln0/o0;", "cameraInfoInternal", "Lg0/g2;", "sessionConfig", "", "d", "(Ln0/o0;Lg0/g2;)Z", "Lk0/b;", "", "e", "(Lk0/b;)I", "a", "Ljt/h;", "getFeatureType", "()I", "featureType", "c", "()Lk0/b;", "featureTypeInternal", "b", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public abstract class AbstractC6600b {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final AbstractC6600b f25458c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final AbstractC6600b f25459d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final AbstractC6600b f25460e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final AbstractC6600b f25461f;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h featureType = C7342i.m30456b(new Function0() { // from class: i0.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Integer.valueOf(AbstractC6600b.m28504b(this.f25456a));
        }
    });

    /* JADX INFO: renamed from: i0.b$b */
    @Metadata(m31666k = 3, m31667mv = {2, 0, 0}, m31669xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f25463a;

        static {
            int[] iArr = new int[EnumC7401b.values().length];
            try {
                iArr[EnumC7401b.DYNAMIC_RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7401b.FPS_RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC7401b.VIDEO_STABILIZATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC7401b.IMAGE_FORMAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f25463a = iArr;
        }
    }

    static {
        C5902k0 HLG_10_BIT = C5902k0.f22552f;
        Intrinsics.checkNotNullExpressionValue(HLG_10_BIT, "HLG_10_BIT");
        f25458c = new DynamicRangeFeature(HLG_10_BIT);
        f25459d = new FpsRangeFeature(60, 60);
        f25460e = new VideoStabilizationFeature(VideoStabilizationFeature.b.PREVIEW);
        f25461f = new ImageFormatFeature(1);
    }

    /* JADX INFO: renamed from: b */
    public static final int m28504b(AbstractC6600b abstractC6600b) {
        return abstractC6600b.m28507e(abstractC6600b.getFeatureTypeInternal());
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public abstract EnumC7401b getFeatureTypeInternal();

    /* JADX INFO: renamed from: d */
    public boolean mo28506d(@NotNull InterfaceC8799o0 cameraInfoInternal, @NotNull C5888g2 sessionConfig) {
        Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
        Intrinsics.checkNotNullParameter(sessionConfig, "sessionConfig");
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final int m28507e(EnumC7401b enumC7401b) {
        int i10 = b.f25463a[enumC7401b.ordinal()];
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
        throw new C7345l();
    }
}
