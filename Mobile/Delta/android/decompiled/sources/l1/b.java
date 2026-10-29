package l1;

import android.util.Range;
import android.util.Rational;
import f1.s;
import g0.r1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import n0.a2;
import n0.a4;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static /* synthetic */ int a(int i10, Integer num, Integer num2) {
        int iAbs = Math.abs(num.intValue() - i10) - Math.abs(num2.intValue() - i10);
        return (int) (iAbs == 0 ? Math.signum(num.intValue() - num2.intValue()) : Math.signum(iAbs));
    }

    public static m1.a b(e eVar, a4 a4Var, i1.a aVar, f1.a aVar2) {
        a2.a aVarD = eVar.d();
        return (m1.a) (aVarD != null ? new c(eVar.a(), eVar.b(), a4Var, aVar2, aVar, aVarD) : new d(eVar.a(), eVar.b(), a4Var, aVar2, aVar)).get();
    }

    public static e c(s sVar, h1.i iVar) {
        a2.a aVarJ;
        String strE = s.e(sVar.c());
        int iF = s.f(sVar.c());
        if (iVar == null || iVar.j() == null) {
            aVarJ = null;
        } else {
            aVarJ = iVar.j();
            String strE2 = aVarJ.e();
            int iF2 = aVarJ.f();
            if (Objects.equals(strE2, "audio/none")) {
                r1.a("AudioConfigUtil", "EncoderProfiles contains undefined AUDIO mime type so cannot be used. May rely on fallback defaults to derive settings [chosen mime type: " + strE + "(profile: " + iF + ")]");
            } else if (sVar.c() == -1) {
                r1.a("AudioConfigUtil", "MediaSpec contains OUTPUT_FORMAT_AUTO. Using EncoderProfiles to derive AUDIO settings [mime type: " + strE2 + "(profile: " + iF2 + ")]");
                strE = strE2;
                iF = iF2;
            } else if (Objects.equals(strE, strE2) && iF == iF2) {
                r1.a("AudioConfigUtil", "MediaSpec audio mime/profile matches EncoderProfiles. Using EncoderProfiles to derive AUDIO settings [mime type: " + strE2 + "(profile: " + iF + ")]");
                strE = strE2;
            } else {
                r1.a("AudioConfigUtil", "MediaSpec audio mime or profile does not match EncoderProfiles, so EncoderProfiles settings cannot be used. May rely on fallback defaults to derive AUDIO settings [EncoderProfiles mime type: " + strE2 + "(profile: " + iF2 + "), chosen mime type: " + strE + "(profile: " + iF + ")]");
            }
            aVarJ = null;
        }
        e.a aVarA = e.c(strE).a(iF);
        if (aVarJ != null) {
            aVarA.c(aVarJ);
        }
        return aVarA.b();
    }

    public static i1.a d(e eVar, f1.a aVar, Rational rational) {
        a2.a aVarD = eVar.d();
        return (i1.a) (aVarD != null ? new f(aVar, aVarD, rational) : new g(aVar, rational)).get();
    }

    public static int e(f1.a aVar) {
        int iE = aVar.e();
        if (iE == -1) {
            r1.a("AudioConfigUtil", "Using default AUDIO source: 5");
            return 5;
        }
        r1.a("AudioConfigUtil", "Using provided AUDIO source: " + iE);
        return iE;
    }

    public static int f(f1.a aVar) {
        int iF = aVar.f();
        if (iF == -1) {
            r1.a("AudioConfigUtil", "Using default AUDIO source format: 2");
            return 2;
        }
        r1.a("AudioConfigUtil", "Using provided AUDIO source format: " + iF);
        return iF;
    }

    public static CaptureEncodeRates g(Range<Integer> range, int i10, int i11, int i12, Rational rational) {
        int i13;
        int iC;
        if (rational == null) {
            i13 = i(range, i11, i12, i10);
            iC = i13;
        } else {
            Range<Integer> rangeCreate = f1.a.b;
            if (!range.equals(rangeCreate)) {
                rangeCreate = Range.create(Integer.valueOf(k.b(((Integer) range.getLower()).intValue(), rational)), Integer.valueOf(k.b(((Integer) range.getUpper()).intValue(), rational)));
            }
            i13 = i(rangeCreate, i11, i12, k.b(i10, rational));
            iC = k.c(i13, rational);
        }
        r1.a("AudioConfigUtil", String.format(Locale.ENGLISH, "Resolved capture/encode sample rate %dHz/%dHz, [target sample rate range: %s, target sample rate: %d, channel count: %d, source format: %d, capture to encode sample rate ratio: %s]", Integer.valueOf(i13), Integer.valueOf(iC), range, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), rational));
        return new CaptureEncodeRates(i13, iC);
    }

    public static int h(int i10, int i11, int i12, int i13, int i14, Range<Integer> range) {
        int iDoubleValue = (int) (((double) i10) * new Rational(i11, i12).doubleValue() * new Rational(i13, i14).doubleValue());
        String str = r1.f("AudioConfigUtil") ? String.format("Base Bitrate(%dbps) * Channel Count Ratio(%d / %d) * Sample Rate Ratio(%d / %d) = %d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(iDoubleValue)) : "";
        if (!f1.a.f15800a.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(iDoubleValue));
            iDoubleValue = num.intValue();
            if (r1.f("AudioConfigUtil")) {
                str = str + String.format("\nClamped to range %s -> %dbps", range, num);
            }
        }
        r1.a("AudioConfigUtil", str);
        return iDoubleValue;
    }

    public static int i(Range<Integer> range, int i10, int i11, final int i12) {
        ArrayList arrayList = null;
        int i13 = 0;
        int iIntValue = i12;
        while (true) {
            if (!range.contains(Integer.valueOf(iIntValue))) {
                r1.a("AudioConfigUtil", "Sample rate " + iIntValue + "Hz is not in target range " + range);
            } else {
                if (i1.n.o(iIntValue, i10, i11)) {
                    return iIntValue;
                }
                r1.a("AudioConfigUtil", "Sample rate " + iIntValue + "Hz is not supported by audio source with channel count " + i10 + " and source format " + i11);
            }
            if (arrayList == null) {
                r1.a("AudioConfigUtil", "Trying common sample rates in proximity order to target " + i12 + "Hz");
                arrayList = new ArrayList(i1.a.f20154a);
                Collections.sort(arrayList, new Comparator() { // from class: l1.a
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return b.a(i12, (Integer) obj, (Integer) obj2);
                    }
                });
            }
            if (i13 >= arrayList.size()) {
                r1.a("AudioConfigUtil", "No sample rate found in target range or supported by audio source. Falling back to default sample rate of 44100Hz");
                return 44100;
            }
            iIntValue = ((Integer) arrayList.get(i13)).intValue();
            i13++;
        }
    }
}
