package p318o1;

import android.util.Size;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7697o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p115f1.C5306x;
import p229jt.C7342i;
import p229jt.InterfaceC7341h;
import p282m1.InterfaceC8389r1;
import p296n0.InterfaceC8721a2;
import p296n0.InterfaceC8799o0;
import p296n0.InterfaceC8855z1;

/* JADX INFO: renamed from: o1.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0004\u0018\u0000 ,2\u00020\u0001:\u0001\u000eB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001b\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010\"\u001a\u00020\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#Jm\u0010,\u001a\u00020\u00152\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u000bH\u0002¢\u0006\u0004\b,\u0010-JK\u00101\u001a\u00020 2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010/\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\u000bH\u0002¢\u0006\u0004\b1\u00102J\u0013\u00103\u001a\u00020\u000b*\u00020\u0005H\u0002¢\u0006\u0004\b3\u00104J#\u00106\u001a\u0004\u0018\u000105*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b6\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010:R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R=\u0010C\u001a$\u0012\f\u0012\n ?*\u0004\u0018\u00010>0> ?*\u0010\u0012\f\u0012\n ?*\u0004\u0018\u00010>0>0\u00040=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010@\u001a\u0004\bA\u0010BR\"\u0010G\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00100D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006H"}, m31665d2 = {"Lo1/c;", "Ln0/z1;", "Ln0/o0;", "cameraInfo", "", "Lf1/x;", "targetQualities", "Lm1/r1$a;", "videoEncoderInfoFinder", "<init>", "(Ln0/o0;Ljava/util/List;Lm1/r1$a;)V", "", "quality", "", "a", "(I)Z", "Ln0/a2;", "b", "(I)Ln0/a2;", "m", "k", "Ln0/a2$c;", "l", "(I)Ln0/a2$c;", "width", "height", "bitrate", "p", "(III)Ln0/a2$c;", "defaultDurationSeconds", "recommendedFileFormat", "videoProfile", "Ln0/a2$a;", "audioProfile", "f", "(IILn0/a2$c;Ln0/a2$a;)Ln0/a2;", "codec", "", "mimeType", "frameRate", "profile", "bitDepth", "chromaSubsampling", "hdrFormat", "h", "(ILjava/lang/String;IIIIIIII)Ln0/a2$c;", "bitRate", "sampleRate", "channels", "d", "(ILjava/lang/String;IIII)Ln0/a2$a;", "o", "(Lf1/x;)I", "Lf1/x$b;", "j", "(Ljava/util/List;I)Lf1/x$b;", "c", "Ln0/o0;", "Ljava/util/List;", "e", "Lm1/r1$a;", "", "Landroid/util/Size;", "kotlin.jvm.PlatformType", "Ljt/h;", "n", "()Ljava/util/List;", "supportedSizes", "", "g", "Ljava/util/Map;", "encoderProfilesMap", "camera-video_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C9623c implements InterfaceC8855z1 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC8799o0 cameraInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final List<C5306x> targetQualities;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC8389r1.a videoEncoderInfoFinder;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h supportedSizes;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Map<Integer, InterfaceC8721a2> encoderProfilesMap;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends f1.x> */
    /* JADX WARN: Multi-variable type inference failed */
    public C9623c(@NotNull InterfaceC8799o0 cameraInfo, @NotNull List<? extends C5306x> targetQualities, @NotNull InterfaceC8389r1.a videoEncoderInfoFinder) {
        Intrinsics.checkNotNullParameter(cameraInfo, "cameraInfo");
        Intrinsics.checkNotNullParameter(targetQualities, "targetQualities");
        Intrinsics.checkNotNullParameter(videoEncoderInfoFinder, "videoEncoderInfoFinder");
        this.cameraInfo = cameraInfo;
        this.targetQualities = targetQualities;
        this.videoEncoderInfoFinder = videoEncoderInfoFinder;
        this.supportedSizes = C7342i.m30456b(new Function0() { // from class: o1.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C9623c.m37972q(this.f34901a);
            }
        });
        this.encoderProfilesMap = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ InterfaceC8721a2.a m37969e(C9623c c9623c, int i10, String str, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i10 = 3;
        }
        if ((i15 & 2) != 0) {
            str = "audio/mp4a-latm";
        }
        if ((i15 & 4) != 0) {
            i11 = 96000;
        }
        if ((i15 & 8) != 0) {
            i12 = 44100;
        }
        if ((i15 & 16) != 0) {
            i13 = 1;
        }
        if ((i15 & 32) != 0) {
            i14 = 2;
        }
        int i16 = i13;
        int i17 = i14;
        return c9623c.m37973d(i10, str, i11, i12, i16, i17);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ InterfaceC8721a2 m37970g(C9623c c9623c, int i10, int i11, InterfaceC8721a2.c cVar, InterfaceC8721a2.a aVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 60;
        }
        if ((i12 & 2) != 0) {
            i11 = 2;
        }
        return c9623c.m37974f(i10, i11, cVar, aVar);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ InterfaceC8721a2.c m37971i(C9623c c9623c, int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, Object obj) {
        if ((i19 & 1) != 0) {
            i10 = 2;
        }
        if ((i19 & 2) != 0) {
            str = "video/avc";
        }
        if ((i19 & 32) != 0) {
            i14 = 30;
        }
        if ((i19 & 64) != 0) {
            i15 = -1;
        }
        if ((i19 & 128) != 0) {
            i16 = 8;
        }
        if ((i19 & 256) != 0) {
            i17 = 0;
        }
        return c9623c.m37975h(i10, str, i11, i12, i13, i14, i15, i16, i17, (i19 & 512) != 0 ? 0 : i18);
    }

    /* JADX INFO: renamed from: q */
    public static final List m37972q(C9623c c9623c) {
        return c9623c.cameraInfo.mo35050m(34);
    }

    @Override // p296n0.InterfaceC8855z1
    /* JADX INFO: renamed from: a */
    public boolean mo27503a(int quality) {
        return m37979m(quality) != null;
    }

    @Override // p296n0.InterfaceC8855z1
    @Nullable
    /* JADX INFO: renamed from: b */
    public InterfaceC8721a2 mo27504b(int quality) {
        return m37979m(quality);
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC8721a2.a m37973d(int codec, String mimeType, int bitRate, int sampleRate, int channels, int profile) {
        InterfaceC8721a2.a aVarM34979a = InterfaceC8721a2.a.m34979a(codec, mimeType, bitRate, sampleRate, channels, profile);
        Intrinsics.checkNotNullExpressionValue(aVarM34979a, "create(...)");
        return aVarM34979a;
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC8721a2 m37974f(int defaultDurationSeconds, int recommendedFileFormat, InterfaceC8721a2.c videoProfile, InterfaceC8721a2.a audioProfile) {
        InterfaceC8721a2.b bVarM34986h = InterfaceC8721a2.b.m34986h(defaultDurationSeconds, recommendedFileFormat, C7697o.m31878d(audioProfile), C7697o.m31878d(videoProfile));
        Intrinsics.checkNotNullExpressionValue(bVarM34986h, "create(...)");
        return bVarM34986h;
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC8721a2.c m37975h(int codec, String mimeType, int width, int height, int bitrate, int frameRate, int profile, int bitDepth, int chromaSubsampling, int hdrFormat) {
        InterfaceC8721a2.c cVarM34987a = InterfaceC8721a2.c.m34987a(codec, mimeType, bitrate, frameRate, width, height, profile, bitDepth, chromaSubsampling, hdrFormat);
        Intrinsics.checkNotNullExpressionValue(cVarM34987a, "create(...)");
        return cVarM34987a;
    }

    /* JADX INFO: renamed from: j */
    public final C5306x.b m37976j(List<? extends C5306x> list, int i10) {
        Object next;
        C5306x c5306x;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            c5306x = (C5306x) next;
            Intrinsics.m31981d(c5306x, "null cannot be cast to non-null type androidx.camera.video.Quality.ConstantQuality");
        } while (((C5306x.b) c5306x).m24595e(1) != i10);
        if (next instanceof C5306x.b) {
            return (C5306x.b) next;
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC8721a2 m37977k(int quality) {
        InterfaceC8721a2.c cVarM37978l = m37978l(quality);
        if (cVarM37978l == null) {
            return null;
        }
        return m37970g(this, 0, 0, cVarM37978l, m37969e(this, 0, null, 0, 0, 0, 0, 63, null), 3, null);
    }

    /* JADX INFO: renamed from: l */
    public final InterfaceC8721a2.c m37978l(int quality) {
        InterfaceC8721a2.c cVarM37982p;
        C5306x.b bVarM37976j = m37976j(this.targetQualities, quality);
        if (bVarM37976j == null) {
            return null;
        }
        for (Size size : bVarM37976j.mo24325f()) {
            if (m37980n().contains(size) && (cVarM37982p = m37982p(size.getWidth(), size.getHeight(), m37981o(bVarM37976j))) != null) {
                return cVarM37982p;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC8721a2 m37979m(int quality) {
        if (this.encoderProfilesMap.containsKey(Integer.valueOf(quality))) {
            return this.encoderProfilesMap.get(Integer.valueOf(quality));
        }
        InterfaceC8721a2 interfaceC8721a2M37977k = m37977k(quality);
        this.encoderProfilesMap.put(Integer.valueOf(quality), interfaceC8721a2M37977k);
        return interfaceC8721a2M37977k;
    }

    /* JADX INFO: renamed from: n */
    public final List<Size> m37980n() {
        return (List) this.supportedSizes.getValue();
    }

    /* JADX INFO: renamed from: o */
    public final int m37981o(C5306x c5306x) {
        if (Intrinsics.m31980c(c5306x, C5306x.f20632d)) {
            return 40000000;
        }
        if (Intrinsics.m31980c(c5306x, C5306x.f20631c)) {
            return 10000000;
        }
        if (Intrinsics.m31980c(c5306x, C5306x.f20630b)) {
            return 4000000;
        }
        if (Intrinsics.m31980c(c5306x, C5306x.f20629a)) {
            return 2000000;
        }
        throw new IllegalArgumentException("Undefined bitrate for quality: " + c5306x);
    }

    /* JADX INFO: renamed from: p */
    public final InterfaceC8721a2.c m37982p(int width, int height, int bitrate) {
        InterfaceC8721a2.c cVarM37971i = m37971i(this, 0, null, width, height, bitrate, 0, 0, 0, 0, 0, 995, null);
        InterfaceC8389r1 interfaceC8389r1Mo34064a = this.videoEncoderInfoFinder.mo34064a(cVarM37971i.mo34995i());
        if (interfaceC8389r1Mo34064a == null || !interfaceC8389r1Mo34064a.m34063e(width, height)) {
            return null;
        }
        Integer num = (Integer) interfaceC8389r1Mo34064a.mo34057g().clamp(Integer.valueOf(bitrate));
        if (num != null && num.intValue() == bitrate) {
            return cVarM37971i;
        }
        Intrinsics.checkNotNull(num);
        return m37971i(this, 0, null, width, height, num.intValue(), 0, 0, 0, 0, 0, 995, null);
    }
}
