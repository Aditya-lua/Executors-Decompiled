package p260l1;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecDefaultDataSpaceQuirk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p115f1.AbstractC5245c2;
import p115f1.AbstractC5291s;
import p140g0.C5902k0;
import p140g0.C5931r1;
import p140g0.C5948v2;
import p156h1.AbstractC6268i;
import p234k1.C7407c;
import p282m1.AbstractC8383p1;
import p282m1.AbstractC8386q1;
import p296n0.EnumC8723a4;
import p296n0.InterfaceC8721a2;
import p297n1.C8859b;
import p533x2.C12637g;

/* JADX INFO: renamed from: l1.m */
/* JADX INFO: loaded from: classes.dex */
public final class C7970m {

    /* JADX INFO: renamed from: a */
    public static final Map<String, Map<Integer, AbstractC8386q1>> f29870a;

    static {
        HashMap map = new HashMap();
        f29870a = map;
        HashMap map2 = new HashMap();
        AbstractC8386q1 abstractC8386q1 = AbstractC8386q1.f30926a;
        map2.put(1, abstractC8386q1);
        AbstractC8386q1 abstractC8386q2 = AbstractC8386q1.f30929d;
        map2.put(2, abstractC8386q2);
        AbstractC8386q1 abstractC8386q3 = AbstractC8386q1.f30930e;
        map2.put(4096, abstractC8386q3);
        map2.put(8192, abstractC8386q3);
        HashMap map3 = new HashMap();
        map3.put(1, abstractC8386q1);
        map3.put(2, abstractC8386q2);
        map3.put(4096, abstractC8386q3);
        map3.put(8192, abstractC8386q3);
        HashMap map4 = new HashMap();
        map4.put(1, abstractC8386q1);
        map4.put(4, abstractC8386q2);
        map4.put(4096, abstractC8386q3);
        map4.put(16384, abstractC8386q3);
        map4.put(2, abstractC8386q1);
        map4.put(8, abstractC8386q2);
        map4.put(8192, abstractC8386q3);
        map4.put(32768, abstractC8386q3);
        HashMap map5 = new HashMap();
        map5.put(256, abstractC8386q2);
        map5.put(512, AbstractC8386q1.f30927b);
        map.put("video/hevc", map2);
        map.put("video/av01", map3);
        map.put("video/x-vnd.on2.vp9", map4);
        map.put("video/dolby-vision", map5);
    }

    /* JADX INFO: renamed from: a */
    public static String m32992a(C5902k0 c5902k0) {
        int iM26517b = c5902k0.m26517b();
        if (iM26517b == 1) {
            return "video/avc";
        }
        if (iM26517b == 3 || iM26517b == 4 || iM26517b == 5) {
            return "video/hevc";
        }
        if (iM26517b == 6) {
            return "video/dolby-vision";
        }
        throw new UnsupportedOperationException("Unsupported dynamic range: " + c5902k0 + "\nNo supported default mime type available.");
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC8386q1 m32993b(String str, int i10) {
        AbstractC8386q1 abstractC8386q1;
        Map<Integer, AbstractC8386q1> map = f29870a.get(str);
        if (map != null && (abstractC8386q1 = map.get(Integer.valueOf(i10))) != null) {
            return abstractC8386q1;
        }
        C5931r1.m26572l("VideoConfigUtil", String.format("Unsupported mime type %s or profile level %d. Data space is unspecified.", str, Integer.valueOf(i10)));
        return AbstractC8386q1.f30926a;
    }

    /* JADX INFO: renamed from: c */
    public static CaptureEncodeRates m32994c(AbstractC5245c2 abstractC5245c2, Range<Integer> range) {
        Range<Integer> range2 = C5948v2.f22651q;
        int iIntValue = range2.equals(range) ? 30 : ((Integer) range.getUpper()).intValue();
        int iMo24265d = abstractC5245c2.mo24265d() != 0 ? abstractC5245c2.mo24265d() : iIntValue;
        Locale locale = Locale.ENGLISH;
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer numValueOf2 = Integer.valueOf(iMo24265d);
        boolean zEquals = range2.equals(range);
        Object obj = range;
        if (zEquals) {
            obj = "<UNSPECIFIED>";
        }
        C5931r1.m26561a("VideoConfigUtil", String.format(locale, "Resolved capture/encode frame rate %dfps/%dfps, [Expected operating range: %s]", numValueOf, numValueOf2, obj));
        return new CaptureEncodeRates(iIntValue, iMo24265d);
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC8383p1 m32995d(AbstractC7973p abstractC7973p, EnumC8723a4 enumC8723a4, AbstractC5245c2 abstractC5245c2, Size size, C5902k0 c5902k0, Range<Integer> range) {
        InterfaceC8721a2.c cVarMo32982d = abstractC7973p.mo32982d();
        return (AbstractC8383p1) (cVarMo32982d != null ? new C7972o(abstractC7973p.mo32977a(), enumC8723a4, abstractC5245c2, size, cVarMo32982d, c5902k0, range) : new C7971n(abstractC7973p.mo32977a(), enumC8723a4, abstractC5245c2, size, c5902k0, range)).get();
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC7973p m32996e(AbstractC5291s abstractC5291s, C5902k0 c5902k0, AbstractC6268i abstractC6268i) {
        InterfaceC8721a2.c next;
        C12637g.m47078j(c5902k0.m26519e(), "Dynamic range must be a fully specified dynamic range [provided dynamic range: " + c5902k0 + "]");
        String strM24571h = AbstractC5291s.m24571h(abstractC5291s.mo24305c());
        if (abstractC6268i != null) {
            Set<Integer> setM35571c = C8859b.m35571c(c5902k0);
            Set<Integer> setM35570b = C8859b.m35570b(c5902k0);
            Iterator<InterfaceC8721a2.c> it = abstractC6268i.mo27490b().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (setM35571c.contains(Integer.valueOf(next.mo34993g())) && setM35570b.contains(Integer.valueOf(next.mo34988b()))) {
                        String strMo34995i = next.mo34995i();
                        if (Objects.equals(strM24571h, strMo34995i)) {
                            C5931r1.m26561a("VideoConfigUtil", "MediaSpec video mime matches EncoderProfiles. Using EncoderProfiles to derive VIDEO settings [mime type: " + strM24571h + "]");
                        } else if (abstractC5291s.mo24305c() == -1) {
                            C5931r1.m26561a("VideoConfigUtil", "MediaSpec contains OUTPUT_FORMAT_AUTO. Using CamcorderProfile to derive VIDEO settings [mime type: " + strM24571h + ", dynamic range: " + c5902k0 + "]");
                        }
                        strM24571h = strMo34995i;
                    }
                } else {
                    next = null;
                }
            }
        } else {
            next = null;
        }
        if (next == null) {
            if (abstractC5291s.mo24305c() == -1) {
                strM24571h = m32992a(c5902k0);
            }
            if (abstractC6268i == null) {
                C5931r1.m26561a("VideoConfigUtil", "No EncoderProfiles present. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + strM24571h + ", dynamic range: " + c5902k0 + "]");
            } else {
                C5931r1.m26561a("VideoConfigUtil", "No video EncoderProfile is compatible with requested output format and dynamic range. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + strM24571h + ", dynamic range: " + c5902k0 + "]");
            }
        }
        AbstractC7973p.a aVarM33001c = AbstractC7973p.m33001c(strM24571h);
        if (next != null) {
            aVarM33001c.mo32984c(next);
        }
        return aVarM33001c.mo32983b();
    }

    /* JADX INFO: renamed from: f */
    public static int m32997f(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, Range<Integer> range) {
        int iDoubleValue = (int) (((double) i10) * new Rational(i11, i12).doubleValue() * new Rational(i13, i14).doubleValue() * new Rational(i15, i16).doubleValue() * new Rational(i17, i18).doubleValue());
        String str = C5931r1.m26566f("VideoConfigUtil") ? String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i18), Integer.valueOf(iDoubleValue)) : "";
        if (!AbstractC5245c2.f20322a.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(iDoubleValue));
            int iIntValue = num.intValue();
            if (C5931r1.m26566f("VideoConfigUtil")) {
                str = str + String.format("\nClamped to range %s -> %dbps", range, num);
            }
            iDoubleValue = iIntValue;
        }
        C5931r1.m26561a("VideoConfigUtil", str);
        return iDoubleValue;
    }

    /* JADX INFO: renamed from: g */
    public static AbstractC8383p1 m32998g(AbstractC8383p1 abstractC8383p1, boolean z10) {
        if (abstractC8383p1.mo33909h() != AbstractC8386q1.f30926a) {
            return abstractC8383p1;
        }
        MediaCodecDefaultDataSpaceQuirk mediaCodecDefaultDataSpaceQuirk = (MediaCodecDefaultDataSpaceQuirk) C7407c.m30691b(MediaCodecDefaultDataSpaceQuirk.class);
        if (!z10 || mediaCodecDefaultDataSpaceQuirk == null) {
            return abstractC8383p1;
        }
        return abstractC8383p1.mo33914m().mo33919e(mediaCodecDefaultDataSpaceQuirk.m2300g()).mo33915a();
    }
}
