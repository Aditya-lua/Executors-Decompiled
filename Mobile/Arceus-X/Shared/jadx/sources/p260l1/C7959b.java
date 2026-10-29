package p260l1;

import android.util.Range;
import android.util.Rational;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import p115f1.AbstractC5234a;
import p115f1.AbstractC5291s;
import p140g0.C5931r1;
import p156h1.AbstractC6268i;
import p183i1.AbstractC6601a;
import p183i1.C6619n;
import p282m1.AbstractC8336a;
import p296n0.EnumC8723a4;
import p296n0.InterfaceC8721a2;

/* JADX INFO: renamed from: l1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7959b {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m32960a(int i10, Integer num, Integer num2) {
        int iAbs = Math.abs(num.intValue() - i10) - Math.abs(num2.intValue() - i10);
        return (int) (iAbs == 0 ? Math.signum(num.intValue() - num2.intValue()) : Math.signum(iAbs));
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC8336a m32961b(AbstractC7962e abstractC7962e, EnumC8723a4 enumC8723a4, AbstractC6601a abstractC6601a, AbstractC5234a abstractC5234a) {
        InterfaceC8721a2.a aVarMo32972d = abstractC7962e.mo32972d();
        return (AbstractC8336a) (aVarMo32972d != null ? new C7960c(abstractC7962e.mo32977a(), abstractC7962e.mo32978b(), enumC8723a4, abstractC5234a, abstractC6601a, aVarMo32972d) : new C7961d(abstractC7962e.mo32977a(), abstractC7962e.mo32978b(), enumC8723a4, abstractC5234a, abstractC6601a)).get();
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC7962e m32962c(AbstractC5291s abstractC5291s, AbstractC6268i abstractC6268i) {
        InterfaceC8721a2.a aVarMo27493j;
        String strM24568e = AbstractC5291s.m24568e(abstractC5291s.mo24305c());
        int iM24569f = AbstractC5291s.m24569f(abstractC5291s.mo24305c());
        if (abstractC6268i == null || abstractC6268i.mo27493j() == null) {
            aVarMo27493j = null;
        } else {
            aVarMo27493j = abstractC6268i.mo27493j();
            String strMo34983e = aVarMo27493j.mo34983e();
            int iMo34984f = aVarMo27493j.mo34984f();
            if (Objects.equals(strMo34983e, "audio/none")) {
                C5931r1.m26561a("AudioConfigUtil", "EncoderProfiles contains undefined AUDIO mime type so cannot be used. May rely on fallback defaults to derive settings [chosen mime type: " + strM24568e + "(profile: " + iM24569f + ")]");
            } else if (abstractC5291s.mo24305c() == -1) {
                C5931r1.m26561a("AudioConfigUtil", "MediaSpec contains OUTPUT_FORMAT_AUTO. Using EncoderProfiles to derive AUDIO settings [mime type: " + strMo34983e + "(profile: " + iMo34984f + ")]");
                strM24568e = strMo34983e;
                iM24569f = iMo34984f;
            } else if (Objects.equals(strM24568e, strMo34983e) && iM24569f == iMo34984f) {
                C5931r1.m26561a("AudioConfigUtil", "MediaSpec audio mime/profile matches EncoderProfiles. Using EncoderProfiles to derive AUDIO settings [mime type: " + strMo34983e + "(profile: " + iM24569f + ")]");
                strM24568e = strMo34983e;
            } else {
                C5931r1.m26561a("AudioConfigUtil", "MediaSpec audio mime or profile does not match EncoderProfiles, so EncoderProfiles settings cannot be used. May rely on fallback defaults to derive AUDIO settings [EncoderProfiles mime type: " + strMo34983e + "(profile: " + iMo34984f + "), chosen mime type: " + strM24568e + "(profile: " + iM24569f + ")]");
            }
            aVarMo27493j = null;
        }
        AbstractC7962e.a aVarMo32979a = AbstractC7962e.m32971c(strM24568e).mo32979a(iM24569f);
        if (aVarMo27493j != null) {
            aVarMo32979a.mo32974c(aVarMo27493j);
        }
        return aVarMo32979a.mo32973b();
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC6601a m32963d(AbstractC7962e abstractC7962e, AbstractC5234a abstractC5234a, Rational rational) {
        InterfaceC8721a2.a aVarMo32972d = abstractC7962e.mo32972d();
        return (AbstractC6601a) (aVarMo32972d != null ? new C7963f(abstractC5234a, aVarMo32972d, rational) : new C7964g(abstractC5234a, rational)).get();
    }

    /* JADX INFO: renamed from: e */
    public static int m32964e(AbstractC5234a abstractC5234a) {
        int iMo24222e = abstractC5234a.mo24222e();
        if (iMo24222e == -1) {
            C5931r1.m26561a("AudioConfigUtil", "Using default AUDIO source: 5");
            return 5;
        }
        C5931r1.m26561a("AudioConfigUtil", "Using provided AUDIO source: " + iMo24222e);
        return iMo24222e;
    }

    /* JADX INFO: renamed from: f */
    public static int m32965f(AbstractC5234a abstractC5234a) {
        int iMo24223f = abstractC5234a.mo24223f();
        if (iMo24223f == -1) {
            C5931r1.m26561a("AudioConfigUtil", "Using default AUDIO source format: 2");
            return 2;
        }
        C5931r1.m26561a("AudioConfigUtil", "Using provided AUDIO source format: " + iMo24223f);
        return iMo24223f;
    }

    /* JADX INFO: renamed from: g */
    public static CaptureEncodeRates m32966g(Range<Integer> range, int i10, int i11, int i12, Rational rational) {
        int iM32968i;
        int iM32991c;
        if (rational == null) {
            iM32968i = m32968i(range, i11, i12, i10);
            iM32991c = iM32968i;
        } else {
            Range<Integer> rangeCreate = AbstractC5234a.f20288b;
            if (!range.equals(rangeCreate)) {
                rangeCreate = Range.create(Integer.valueOf(C7968k.m32990b(((Integer) range.getLower()).intValue(), rational)), Integer.valueOf(C7968k.m32990b(((Integer) range.getUpper()).intValue(), rational)));
            }
            iM32968i = m32968i(rangeCreate, i11, i12, C7968k.m32990b(i10, rational));
            iM32991c = C7968k.m32991c(iM32968i, rational);
        }
        C5931r1.m26561a("AudioConfigUtil", String.format(Locale.ENGLISH, "Resolved capture/encode sample rate %dHz/%dHz, [target sample rate range: %s, target sample rate: %d, channel count: %d, source format: %d, capture to encode sample rate ratio: %s]", Integer.valueOf(iM32968i), Integer.valueOf(iM32991c), range, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), rational));
        return new CaptureEncodeRates(iM32968i, iM32991c);
    }

    /* JADX INFO: renamed from: h */
    public static int m32967h(int i10, int i11, int i12, int i13, int i14, Range<Integer> range) {
        int iDoubleValue = (int) (((double) i10) * new Rational(i11, i12).doubleValue() * new Rational(i13, i14).doubleValue());
        String str = C5931r1.m26566f("AudioConfigUtil") ? String.format("Base Bitrate(%dbps) * Channel Count Ratio(%d / %d) * Sample Rate Ratio(%d / %d) = %d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(iDoubleValue)) : "";
        if (!AbstractC5234a.f20287a.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(iDoubleValue));
            iDoubleValue = num.intValue();
            if (C5931r1.m26566f("AudioConfigUtil")) {
                str = str + String.format("\nClamped to range %s -> %dbps", range, num);
            }
        }
        C5931r1.m26561a("AudioConfigUtil", str);
        return iDoubleValue;
    }

    /* JADX INFO: renamed from: i */
    public static int m32968i(Range<Integer> range, int i10, int i11, final int i12) {
        ArrayList arrayList = null;
        int i13 = 0;
        int iIntValue = i12;
        while (true) {
            if (!range.contains(Integer.valueOf(iIntValue))) {
                C5931r1.m26561a("AudioConfigUtil", "Sample rate " + iIntValue + "Hz is not in target range " + range);
            } else {
                if (C6619n.m28559o(iIntValue, i10, i11)) {
                    return iIntValue;
                }
                C5931r1.m26561a("AudioConfigUtil", "Sample rate " + iIntValue + "Hz is not supported by audio source with channel count " + i10 + " and source format " + i11);
            }
            if (arrayList == null) {
                C5931r1.m26561a("AudioConfigUtil", "Trying common sample rates in proximity order to target " + i12 + "Hz");
                arrayList = new ArrayList(AbstractC6601a.f25464a);
                Collections.sort(arrayList, new Comparator() { // from class: l1.a
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return C7959b.m32960a(i12, (Integer) obj, (Integer) obj2);
                    }
                });
            }
            if (i13 >= arrayList.size()) {
                C5931r1.m26561a("AudioConfigUtil", "No sample rate found in target range or supported by audio source. Falling back to default sample rate of 44100Hz");
                return 44100;
            }
            iIntValue = ((Integer) arrayList.get(i13)).intValue();
            i13++;
        }
    }
}
