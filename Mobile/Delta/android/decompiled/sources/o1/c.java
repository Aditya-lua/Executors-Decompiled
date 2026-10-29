package o1;

import android.util.Size;
import com.google.mlkit.vision.barcode.common.Barcode;
import f1.x;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jt.i;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m1.r1;
import n0.a2;
import n0.o0;
import n0.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0004\u0018\u0000 ,2\u00020\u0001:\u0001\u000eB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001b\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010\"\u001a\u00020\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#Jm\u0010,\u001a\u00020\u00152\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\u000b2\b\b\u0002\u0010)\u001a\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010+\u001a\u00020\u000bH\u0002¢\u0006\u0004\b,\u0010-JK\u00101\u001a\u00020 2\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010/\u001a\u00020\u000b2\b\b\u0002\u00100\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\u000bH\u0002¢\u0006\u0004\b1\u00102J\u0013\u00103\u001a\u00020\u000b*\u00020\u0005H\u0002¢\u0006\u0004\b3\u00104J#\u00106\u001a\u0004\u0018\u000105*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b6\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010:R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R=\u0010C\u001a$\u0012\f\u0012\n ?*\u0004\u0018\u00010>0> ?*\u0010\u0012\f\u0012\n ?*\u0004\u0018\u00010>0>0\u00040=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010@\u001a\u0004\bA\u0010BR\"\u0010G\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00100D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006H"}, d2 = {"Lo1/c;", "Ln0/z1;", "Ln0/o0;", "cameraInfo", "", "Lf1/x;", "targetQualities", "Lm1/r1$a;", "videoEncoderInfoFinder", "<init>", "(Ln0/o0;Ljava/util/List;Lm1/r1$a;)V", "", "quality", "", "a", "(I)Z", "Ln0/a2;", "b", "(I)Ln0/a2;", "m", "k", "Ln0/a2$c;", "l", "(I)Ln0/a2$c;", "width", "height", "bitrate", "p", "(III)Ln0/a2$c;", "defaultDurationSeconds", "recommendedFileFormat", "videoProfile", "Ln0/a2$a;", "audioProfile", "f", "(IILn0/a2$c;Ln0/a2$a;)Ln0/a2;", "codec", "", "mimeType", "frameRate", "profile", "bitDepth", "chromaSubsampling", "hdrFormat", "h", "(ILjava/lang/String;IIIIIIII)Ln0/a2$c;", "bitRate", "sampleRate", "channels", "d", "(ILjava/lang/String;IIII)Ln0/a2$a;", "o", "(Lf1/x;)I", "Lf1/x$b;", "j", "(Ljava/util/List;I)Lf1/x$b;", "c", "Ln0/o0;", "Ljava/util/List;", "e", "Lm1/r1$a;", "", "Landroid/util/Size;", "kotlin.jvm.PlatformType", "Ljt/h;", "n", "()Ljava/util/List;", "supportedSizes", "", "g", "Ljava/util/Map;", "encoderProfilesMap", "camera-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c implements z1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final o0 cameraInfo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<x> targetQualities;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final r1.a videoEncoderInfoFinder;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jt.h supportedSizes;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<Integer, a2> encoderProfilesMap;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull o0 cameraInfo, @NotNull List<? extends x> targetQualities, @NotNull r1.a videoEncoderInfoFinder) {
        Intrinsics.checkNotNullParameter(cameraInfo, "cameraInfo");
        Intrinsics.checkNotNullParameter(targetQualities, "targetQualities");
        Intrinsics.checkNotNullParameter(videoEncoderInfoFinder, "videoEncoderInfoFinder");
        this.cameraInfo = cameraInfo;
        this.targetQualities = targetQualities;
        this.videoEncoderInfoFinder = videoEncoderInfoFinder;
        this.supportedSizes = i.b(new Function0() { // from class: o1.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c.q(this.f26982a);
            }
        });
        this.encoderProfilesMap = new LinkedHashMap();
    }

    public static /* synthetic */ a2.a e(c cVar, int i10, String str, int i11, int i12, int i13, int i14, int i15, Object obj) {
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
        return cVar.d(i10, str, i11, i12, i16, i17);
    }

    public static /* synthetic */ a2 g(c cVar, int i10, int i11, a2.c cVar2, a2.a aVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 60;
        }
        if ((i12 & 2) != 0) {
            i11 = 2;
        }
        return cVar.f(i10, i11, cVar2, aVar);
    }

    public static /* synthetic */ a2.c i(c cVar, int i10, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, Object obj) {
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
        if ((i19 & Barcode.FORMAT_QR_CODE) != 0) {
            i17 = 0;
        }
        return cVar.h(i10, str, i11, i12, i13, i14, i15, i16, i17, (i19 & Barcode.FORMAT_UPC_A) != 0 ? 0 : i18);
    }

    public static final List q(c cVar) {
        return cVar.cameraInfo.m(34);
    }

    @Override // n0.z1
    public boolean a(int quality) {
        return m(quality) != null;
    }

    @Override // n0.z1
    @Nullable
    public a2 b(int quality) {
        return m(quality);
    }

    public final a2.a d(int codec, String mimeType, int bitRate, int sampleRate, int channels, int profile) {
        a2.a aVarA = a2.a.a(codec, mimeType, bitRate, sampleRate, channels, profile);
        Intrinsics.checkNotNullExpressionValue(aVarA, "create(...)");
        return aVarA;
    }

    public final a2 f(int defaultDurationSeconds, int recommendedFileFormat, a2.c videoProfile, a2.a audioProfile) {
        a2.b bVarH = a2.b.h(defaultDurationSeconds, recommendedFileFormat, o.d(audioProfile), o.d(videoProfile));
        Intrinsics.checkNotNullExpressionValue(bVarH, "create(...)");
        return bVarH;
    }

    public final a2.c h(int codec, String mimeType, int width, int height, int bitrate, int frameRate, int profile, int bitDepth, int chromaSubsampling, int hdrFormat) {
        a2.c cVarA = a2.c.a(codec, mimeType, bitrate, frameRate, width, height, profile, bitDepth, chromaSubsampling, hdrFormat);
        Intrinsics.checkNotNullExpressionValue(cVarA, "create(...)");
        return cVarA;
    }

    public final x.b j(List<? extends x> list, int i10) {
        Object next;
        x xVar;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            xVar = (x) next;
            Intrinsics.d(xVar, "null cannot be cast to non-null type androidx.camera.video.Quality.ConstantQuality");
        } while (((x.b) xVar).e(1) != i10);
        if (next instanceof x.b) {
            return (x.b) next;
        }
        return null;
    }

    public final a2 k(int quality) {
        a2.c cVarL = l(quality);
        if (cVarL == null) {
            return null;
        }
        return g(this, 0, 0, cVarL, e(this, 0, null, 0, 0, 0, 0, 63, null), 3, null);
    }

    public final a2.c l(int quality) {
        a2.c cVarP;
        x.b bVarJ = j(this.targetQualities, quality);
        if (bVarJ == null) {
            return null;
        }
        for (Size size : bVarJ.f()) {
            if (n().contains(size) && (cVarP = p(size.getWidth(), size.getHeight(), o(bVarJ))) != null) {
                return cVarP;
            }
        }
        return null;
    }

    public final a2 m(int quality) {
        if (this.encoderProfilesMap.containsKey(Integer.valueOf(quality))) {
            return this.encoderProfilesMap.get(Integer.valueOf(quality));
        }
        a2 a2VarK = k(quality);
        this.encoderProfilesMap.put(Integer.valueOf(quality), a2VarK);
        return a2VarK;
    }

    public final List<Size> n() {
        return (List) this.supportedSizes.getValue();
    }

    public final int o(x xVar) {
        if (Intrinsics.c(xVar, x.f16052d)) {
            return 40000000;
        }
        if (Intrinsics.c(xVar, x.f16051c)) {
            return 10000000;
        }
        if (Intrinsics.c(xVar, x.b)) {
            return 4000000;
        }
        if (Intrinsics.c(xVar, x.f16050a)) {
            return 2000000;
        }
        throw new IllegalArgumentException("Undefined bitrate for quality: " + xVar);
    }

    public final a2.c p(int width, int height, int bitrate) {
        a2.c cVarI = i(this, 0, null, width, height, bitrate, 0, 0, 0, 0, 0, 995, null);
        r1 r1VarA = this.videoEncoderInfoFinder.a(cVarI.i());
        if (r1VarA == null || !r1VarA.e(width, height)) {
            return null;
        }
        Integer num = (Integer) r1VarA.g().clamp(Integer.valueOf(bitrate));
        if (num != null && num.intValue() == bitrate) {
            return cVarI;
        }
        Intrinsics.checkNotNull(num);
        return i(this, 0, null, width, height, num.intValue(), 0, 0, 0, 0, 0, 995, null);
    }
}
