package l1;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecDefaultDataSpaceQuirk;
import com.google.mlkit.vision.barcode.common.Barcode;
import f1.c2;
import f1.s;
import g0.k0;
import g0.r1;
import g0.v2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import m1.p1;
import m1.q1;
import n0.a2;
import n0.a4;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, Map<Integer, q1>> f22910a;

    static {
        HashMap map = new HashMap();
        f22910a = map;
        HashMap map2 = new HashMap();
        q1 q1Var = q1.f23838a;
        map2.put(1, q1Var);
        q1 q1Var2 = q1.f23840d;
        map2.put(2, q1Var2);
        Integer numValueOf = Integer.valueOf(Barcode.FORMAT_AZTEC);
        q1 q1Var3 = q1.f23841e;
        map2.put(numValueOf, q1Var3);
        map2.put(8192, q1Var3);
        HashMap map3 = new HashMap();
        map3.put(1, q1Var);
        map3.put(2, q1Var2);
        map3.put(numValueOf, q1Var3);
        map3.put(8192, q1Var3);
        HashMap map4 = new HashMap();
        map4.put(1, q1Var);
        map4.put(4, q1Var2);
        map4.put(numValueOf, q1Var3);
        map4.put(Integer.valueOf(Http2.INITIAL_MAX_FRAME_SIZE), q1Var3);
        map4.put(2, q1Var);
        map4.put(8, q1Var2);
        map4.put(8192, q1Var3);
        map4.put(32768, q1Var3);
        HashMap map5 = new HashMap();
        map5.put(Integer.valueOf(Barcode.FORMAT_QR_CODE), q1Var2);
        map5.put(Integer.valueOf(Barcode.FORMAT_UPC_A), q1.b);
        map.put("video/hevc", map2);
        map.put("video/av01", map3);
        map.put("video/x-vnd.on2.vp9", map4);
        map.put("video/dolby-vision", map5);
    }

    public static String a(k0 k0Var) {
        int iB = k0Var.b();
        if (iB == 1) {
            return "video/avc";
        }
        if (iB == 3 || iB == 4 || iB == 5) {
            return "video/hevc";
        }
        if (iB == 6) {
            return "video/dolby-vision";
        }
        throw new UnsupportedOperationException("Unsupported dynamic range: " + k0Var + "\nNo supported default mime type available.");
    }

    public static q1 b(String str, int i10) {
        q1 q1Var;
        Map<Integer, q1> map = f22910a.get(str);
        if (map != null && (q1Var = map.get(Integer.valueOf(i10))) != null) {
            return q1Var;
        }
        r1.l("VideoConfigUtil", String.format("Unsupported mime type %s or profile level %d. Data space is unspecified.", str, Integer.valueOf(i10)));
        return q1.f23838a;
    }

    public static CaptureEncodeRates c(c2 c2Var, Range<Integer> range) {
        Range<Integer> range2 = v2.f17544q;
        int iIntValue = range2.equals(range) ? 30 : ((Integer) range.getUpper()).intValue();
        int iD = c2Var.d() != 0 ? c2Var.d() : iIntValue;
        Locale locale = Locale.ENGLISH;
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer numValueOf2 = Integer.valueOf(iD);
        boolean zEquals = range2.equals(range);
        Object obj = range;
        if (zEquals) {
            obj = "<UNSPECIFIED>";
        }
        r1.a("VideoConfigUtil", String.format(locale, "Resolved capture/encode frame rate %dfps/%dfps, [Expected operating range: %s]", numValueOf, numValueOf2, obj));
        return new CaptureEncodeRates(iIntValue, iD);
    }

    public static p1 d(p pVar, a4 a4Var, c2 c2Var, Size size, k0 k0Var, Range<Integer> range) {
        a2.c cVarD = pVar.d();
        return (p1) (cVarD != null ? new o(pVar.a(), a4Var, c2Var, size, cVarD, k0Var, range) : new n(pVar.a(), a4Var, c2Var, size, k0Var, range)).get();
    }

    public static p e(s sVar, k0 k0Var, h1.i iVar) {
        a2.c next;
        x2.g.j(k0Var.e(), "Dynamic range must be a fully specified dynamic range [provided dynamic range: " + k0Var + "]");
        String strH = s.h(sVar.c());
        if (iVar != null) {
            Set<Integer> setC = n1.b.c(k0Var);
            Set<Integer> setB = n1.b.b(k0Var);
            Iterator<a2.c> it = iVar.b().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (setC.contains(Integer.valueOf(next.g())) && setB.contains(Integer.valueOf(next.b()))) {
                        String strI = next.i();
                        if (Objects.equals(strH, strI)) {
                            r1.a("VideoConfigUtil", "MediaSpec video mime matches EncoderProfiles. Using EncoderProfiles to derive VIDEO settings [mime type: " + strH + "]");
                        } else if (sVar.c() == -1) {
                            r1.a("VideoConfigUtil", "MediaSpec contains OUTPUT_FORMAT_AUTO. Using CamcorderProfile to derive VIDEO settings [mime type: " + strH + ", dynamic range: " + k0Var + "]");
                        }
                        strH = strI;
                    }
                } else {
                    next = null;
                }
            }
        } else {
            next = null;
        }
        if (next == null) {
            if (sVar.c() == -1) {
                strH = a(k0Var);
            }
            if (iVar == null) {
                r1.a("VideoConfigUtil", "No EncoderProfiles present. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + strH + ", dynamic range: " + k0Var + "]");
            } else {
                r1.a("VideoConfigUtil", "No video EncoderProfile is compatible with requested output format and dynamic range. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + strH + ", dynamic range: " + k0Var + "]");
            }
        }
        p.a aVarC = p.c(strH);
        if (next != null) {
            aVarC.c(next);
        }
        return aVarC.b();
    }

    public static int f(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, Range<Integer> range) {
        int iDoubleValue = (int) (((double) i10) * new Rational(i11, i12).doubleValue() * new Rational(i13, i14).doubleValue() * new Rational(i15, i16).doubleValue() * new Rational(i17, i18).doubleValue());
        String str = r1.f("VideoConfigUtil") ? String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i18), Integer.valueOf(iDoubleValue)) : "";
        if (!c2.f15828a.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(iDoubleValue));
            int iIntValue = num.intValue();
            if (r1.f("VideoConfigUtil")) {
                str = str + String.format("\nClamped to range %s -> %dbps", range, num);
            }
            iDoubleValue = iIntValue;
        }
        r1.a("VideoConfigUtil", str);
        return iDoubleValue;
    }

    public static p1 g(p1 p1Var, boolean z10) {
        if (p1Var.h() != q1.f23838a) {
            return p1Var;
        }
        MediaCodecDefaultDataSpaceQuirk mediaCodecDefaultDataSpaceQuirk = (MediaCodecDefaultDataSpaceQuirk) k1.c.b(MediaCodecDefaultDataSpaceQuirk.class);
        if (!z10 || mediaCodecDefaultDataSpaceQuirk == null) {
            return p1Var;
        }
        return p1Var.m().e(mediaCodecDefaultDataSpaceQuirk.g()).a();
    }
}
