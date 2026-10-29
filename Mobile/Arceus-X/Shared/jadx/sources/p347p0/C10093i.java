package p347p0;

import android.os.Build;
import android.util.Pair;
import androidx.camera.core.InterfaceC0494d;
import androidx.core.view.InputDeviceCompat;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.p336ws.WebSocketProtocol;
import p140g0.C5931r1;
import p296n0.EnumC8737d0;
import p533x2.C12637g;

/* JADX INFO: renamed from: p0.i */
/* JADX INFO: loaded from: classes.dex */
public class C10093i {

    /* JADX INFO: renamed from: c */
    public static final String[] f36344c = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: d */
    public static final C10095k[] f36345d;

    /* JADX INFO: renamed from: e */
    public static final C10095k[] f36346e;

    /* JADX INFO: renamed from: f */
    public static final C10095k[] f36347f;

    /* JADX INFO: renamed from: g */
    public static final C10095k[] f36348g;

    /* JADX INFO: renamed from: h */
    public static final C10095k[] f36349h;

    /* JADX INFO: renamed from: i */
    public static final C10095k[][] f36350i;

    /* JADX INFO: renamed from: j */
    public static final HashSet<String> f36351j;

    /* JADX INFO: renamed from: k */
    public static final String f36352k;

    /* JADX INFO: renamed from: a */
    public final List<Map<String, C10092h>> f36353a;

    /* JADX INFO: renamed from: b */
    public final ByteOrder f36354b;

    /* JADX INFO: renamed from: p0.i$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f36355a;

        static {
            int[] iArr = new int[EnumC8737d0.values().length];
            f36355a = iArr;
            try {
                iArr[EnumC8737d0.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36355a[EnumC8737d0.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36355a[EnumC8737d0.FIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: p0.i$b */
    public static final class b {

        /* JADX INFO: renamed from: c */
        public static final Pattern f36356c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

        /* JADX INFO: renamed from: d */
        public static final Pattern f36357d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* JADX INFO: renamed from: e */
        public static final Pattern f36358e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* JADX INFO: renamed from: f */
        public static final List<HashMap<String, C10095k>> f36359f = Collections.list(new a());

        /* JADX INFO: renamed from: a */
        public final List<Map<String, C10092h>> f36360a = Collections.list(new C14229b());

        /* JADX INFO: renamed from: b */
        public final ByteOrder f36361b;

        /* JADX INFO: renamed from: p0.i$b$a */
        public class a implements Enumeration<HashMap<String, C10095k>> {

            /* JADX INFO: renamed from: a */
            public int f36362a = 0;

            /* JADX DEBUG: Method merged with bridge method: nextElement()Ljava/lang/Object; */
            @Override // java.util.Enumeration
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public HashMap<String, C10095k> nextElement() {
                HashMap<String, C10095k> map = new HashMap<>();
                for (C10095k c10095k : C10093i.f36350i[this.f36362a]) {
                    map.put(c10095k.f36378b, c10095k);
                }
                this.f36362a++;
                return map;
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f36362a < C10093i.f36350i.length;
            }
        }

        /* JADX INFO: renamed from: p0.i$b$b, reason: collision with other inner class name */
        public class C14229b implements Enumeration<Map<String, C10092h>> {

            /* JADX INFO: renamed from: a */
            public int f36363a = 0;

            public C14229b() {
            }

            /* JADX DEBUG: Method merged with bridge method: nextElement()Ljava/lang/Object; */
            @Override // java.util.Enumeration
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<String, C10092h> nextElement() {
                this.f36363a++;
                return new HashMap();
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f36363a < C10093i.f36350i.length;
            }
        }

        /* JADX INFO: renamed from: p0.i$b$c */
        public class c implements Enumeration<Map<String, C10092h>> {

            /* JADX INFO: renamed from: a */
            public final Enumeration<Map<String, C10092h>> f36365a;

            public c() {
                this.f36365a = Collections.enumeration(b.this.f36360a);
            }

            /* JADX DEBUG: Method merged with bridge method: nextElement()Ljava/lang/Object; */
            @Override // java.util.Enumeration
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<String, C10092h> nextElement() {
                return new HashMap(this.f36365a.nextElement());
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f36365a.hasMoreElements();
            }
        }

        public b(ByteOrder byteOrder) {
            this.f36361b = byteOrder;
        }

        /* JADX INFO: renamed from: b */
        public static Pair<Integer, Integer> m38966b(String str) {
            if (str.contains(",")) {
                String[] strArrSplit = str.split(",", -1);
                Pair<Integer, Integer> pairM38966b = m38966b(strArrSplit[0]);
                if (((Integer) pairM38966b.first).intValue() == 2) {
                    return pairM38966b;
                }
                for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                    Pair<Integer, Integer> pairM38966b2 = m38966b(strArrSplit[i10]);
                    int iIntValue = (((Integer) pairM38966b2.first).equals(pairM38966b.first) || ((Integer) pairM38966b2.second).equals(pairM38966b.first)) ? ((Integer) pairM38966b.first).intValue() : -1;
                    int iIntValue2 = (((Integer) pairM38966b.second).intValue() == -1 || !(((Integer) pairM38966b2.first).equals(pairM38966b.second) || ((Integer) pairM38966b2.second).equals(pairM38966b.second))) ? -1 : ((Integer) pairM38966b.second).intValue();
                    if (iIntValue == -1 && iIntValue2 == -1) {
                        return new Pair<>(2, -1);
                    }
                    if (iIntValue == -1) {
                        pairM38966b = new Pair<>(Integer.valueOf(iIntValue2), -1);
                    } else if (iIntValue2 == -1) {
                        pairM38966b = new Pair<>(Integer.valueOf(iIntValue), -1);
                    }
                }
                return pairM38966b;
            }
            if (!str.contains("/")) {
                try {
                    try {
                        long j10 = Long.parseLong(str);
                        if (j10 < 0 || j10 > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                            return j10 < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1);
                        }
                        return new Pair<>(3, 4);
                    } catch (NumberFormatException unused) {
                        return new Pair<>(2, -1);
                    }
                } catch (NumberFormatException unused2) {
                    Double.parseDouble(str);
                    return new Pair<>(12, -1);
                }
            }
            String[] strArrSplit2 = str.split("/", -1);
            if (strArrSplit2.length == 2) {
                try {
                    long j11 = (long) Double.parseDouble(strArrSplit2[0]);
                    long j12 = (long) Double.parseDouble(strArrSplit2[1]);
                    if (j11 >= 0 && j12 >= 0) {
                        if (j11 <= 2147483647L && j12 <= 2147483647L) {
                            return new Pair<>(10, 5);
                        }
                        return new Pair<>(5, -1);
                    }
                    return new Pair<>(10, -1);
                } catch (NumberFormatException unused3) {
                }
            }
            return new Pair<>(2, -1);
        }

        /* JADX INFO: renamed from: a */
        public C10093i m38967a() {
            ArrayList list = Collections.list(new c());
            if (!list.get(1).isEmpty()) {
                m38969d("ExposureProgram", String.valueOf(0), list);
                m38969d("ExifVersion", "0230", list);
                m38969d("ComponentsConfiguration", C10093i.f36352k, list);
                m38969d("MeteringMode", String.valueOf(0), list);
                m38969d("LightSource", String.valueOf(0), list);
                m38969d("FlashpixVersion", "0100", list);
                m38969d("FocalPlaneResolutionUnit", String.valueOf(2), list);
                m38969d("FileSource", String.valueOf(3), list);
                m38969d("SceneType", String.valueOf(1), list);
                m38969d("CustomRendered", String.valueOf(0), list);
                m38969d("SceneCaptureType", String.valueOf(0), list);
                m38969d("Contrast", String.valueOf(0), list);
                m38969d("Saturation", String.valueOf(0), list);
                m38969d("Sharpness", String.valueOf(0), list);
            }
            if (!list.get(2).isEmpty()) {
                m38969d("GPSVersionID", "2300", list);
                m38969d("GPSSpeedRef", "K", list);
                m38969d("GPSTrackRef", "T", list);
                m38969d("GPSImgDirectionRef", "T", list);
                m38969d("GPSDestBearingRef", "T", list);
                m38969d("GPSDestDistanceRef", "K", list);
            }
            return new C10093i(this.f36361b, list);
        }

        /* JADX INFO: renamed from: c */
        public b m38968c(String str, String str2) {
            m38970e(str, str2, this.f36360a);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public final void m38969d(String str, String str2, List<Map<String, C10092h>> list) {
            Iterator<Map<String, C10092h>> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().containsKey(str)) {
                    return;
                }
            }
            m38970e(str, str2, list);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Switch 'out' block B:44:0x0146 for B:65:0x0195 already processed. Defaulting to fallback option. */
        /* JADX INFO: renamed from: e */
        public final void m38970e(String str, String str2, List<Map<String, C10092h>> list) {
            int i10;
            int i11;
            b bVar = this;
            String str3 = str;
            String strReplaceAll = str2;
            if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && strReplaceAll != null) {
                boolean zFind = f36357d.matcher(strReplaceAll).find();
                boolean zFind2 = f36358e.matcher(strReplaceAll).find();
                if (strReplaceAll.length() != 19 || (!zFind && !zFind2)) {
                    C5931r1.m26572l("ExifData", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
                if (zFind2) {
                    strReplaceAll = strReplaceAll.replaceAll("-", ":");
                }
            }
            if ("ISOSpeedRatings".equals(str3)) {
                str3 = "PhotographicSensitivity";
            }
            String str4 = str3;
            int i12 = 2;
            int i13 = 1;
            if (strReplaceAll != null && C10093i.f36351j.contains(str4)) {
                if (str4.equals("GPSTimeStamp")) {
                    Matcher matcher = f36356c.matcher(strReplaceAll);
                    if (!matcher.find()) {
                        C5931r1.m26572l("ExifData", "Invalid value for " + str4 + " : " + strReplaceAll);
                        return;
                    }
                    strReplaceAll = Integer.parseInt((String) C12637g.m47075g(matcher.group(1))) + "/1," + Integer.parseInt((String) C12637g.m47075g(matcher.group(2))) + "/1," + Integer.parseInt((String) C12637g.m47075g(matcher.group(3))) + "/1";
                } else {
                    try {
                        strReplaceAll = new C10098n(Double.parseDouble(strReplaceAll)).toString();
                    } catch (NumberFormatException e10) {
                        C5931r1.m26573m("ExifData", "Invalid value for " + str4 + " : " + strReplaceAll, e10);
                        return;
                    }
                }
            }
            int i14 = 0;
            while (i14 < C10093i.f36350i.length) {
                C10095k c10095k = f36359f.get(i14).get(str4);
                if (c10095k == null) {
                    i10 = i13;
                } else {
                    if (strReplaceAll != null) {
                        Pair<Integer, Integer> pairM38966b = m38966b(strReplaceAll);
                        int i15 = -1;
                        if (c10095k.f36379c == ((Integer) pairM38966b.first).intValue() || c10095k.f36379c == ((Integer) pairM38966b.second).intValue()) {
                            i11 = c10095k.f36379c;
                        } else {
                            int i16 = c10095k.f36380d;
                            if (i16 == -1 || !(i16 == ((Integer) pairM38966b.first).intValue() || c10095k.f36380d == ((Integer) pairM38966b.second).intValue())) {
                                i11 = c10095k.f36379c;
                                if (i11 == i13 || i11 == 7 || i11 == i12) {
                                }
                            } else {
                                i11 = c10095k.f36380d;
                            }
                        }
                        String str5 = "/";
                        switch (i11) {
                            case 1:
                                i10 = i13;
                                list.get(i14).put(str4, C10092h.m38951a(strReplaceAll));
                                continue;
                            case 2:
                            case 7:
                                i10 = i13;
                                list.get(i14).put(str4, C10092h.m38955e(strReplaceAll));
                                continue;
                            case 3:
                                i10 = i13;
                                String[] strArrSplit = strReplaceAll.split(",", -1);
                                int[] iArr = new int[strArrSplit.length];
                                for (int i17 = 0; i17 < strArrSplit.length; i17++) {
                                    iArr[i17] = Integer.parseInt(strArrSplit[i17]);
                                }
                                list.get(i14).put(str4, C10092h.m38959i(iArr, bVar.f36361b));
                                continue;
                            case 4:
                                i10 = i13;
                                String[] strArrSplit2 = strReplaceAll.split(",", -1);
                                long[] jArr = new long[strArrSplit2.length];
                                for (int i18 = 0; i18 < strArrSplit2.length; i18++) {
                                    jArr[i18] = Long.parseLong(strArrSplit2[i18]);
                                }
                                list.get(i14).put(str4, C10092h.m38957g(jArr, bVar.f36361b));
                                continue;
                            case 5:
                                i10 = i13;
                                int i19 = -1;
                                String[] strArrSplit3 = strReplaceAll.split(",", -1);
                                C10098n[] c10098nArr = new C10098n[strArrSplit3.length];
                                int i20 = 0;
                                while (i20 < strArrSplit3.length) {
                                    String[] strArrSplit4 = strArrSplit3[i20].split("/", i19);
                                    c10098nArr[i20] = new C10098n((long) Double.parseDouble(strArrSplit4[0]), (long) Double.parseDouble(strArrSplit4[i10]));
                                    i20++;
                                    i19 = -1;
                                }
                                bVar = this;
                                list.get(i14).put(str4, C10092h.m38958h(c10098nArr, bVar.f36361b));
                                continue;
                            case 9:
                                i10 = i13;
                                String[] strArrSplit5 = strReplaceAll.split(",", -1);
                                int[] iArr2 = new int[strArrSplit5.length];
                                for (int i21 = 0; i21 < strArrSplit5.length; i21++) {
                                    iArr2[i21] = Integer.parseInt(strArrSplit5[i21]);
                                }
                                list.get(i14).put(str4, C10092h.m38953c(iArr2, bVar.f36361b));
                                continue;
                            case 10:
                                String[] strArrSplit6 = strReplaceAll.split(",", -1);
                                C10098n[] c10098nArr2 = new C10098n[strArrSplit6.length];
                                int i22 = 0;
                                while (i22 < strArrSplit6.length) {
                                    String[] strArrSplit7 = strArrSplit6[i22].split(str5, i15);
                                    int i23 = i13;
                                    c10098nArr2[i22] = new C10098n((long) Double.parseDouble(strArrSplit7[0]), (long) Double.parseDouble(strArrSplit7[i23]));
                                    i22++;
                                    i13 = i23;
                                    str5 = str5;
                                    i15 = -1;
                                }
                                i10 = i13;
                                list.get(i14).put(str4, C10092h.m38954d(c10098nArr2, bVar.f36361b));
                                continue;
                            case 12:
                                String[] strArrSplit8 = strReplaceAll.split(",", -1);
                                double[] dArr = new double[strArrSplit8.length];
                                for (int i24 = 0; i24 < strArrSplit8.length; i24++) {
                                    dArr[i24] = Double.parseDouble(strArrSplit8[i24]);
                                }
                                list.get(i14).put(str4, C10092h.m38952b(dArr, bVar.f36361b));
                                break;
                        }
                    } else {
                        list.get(i14).remove(str4);
                    }
                    i10 = i13;
                }
                i14++;
                i13 = i10;
                i12 = 2;
            }
        }

        /* JADX INFO: renamed from: f */
        public b m38971f(long j10) {
            return m38968c("ExposureTime", String.valueOf(j10 / TimeUnit.SECONDS.toNanos(1L)));
        }

        /* JADX INFO: renamed from: g */
        public b m38972g(EnumC8737d0 enumC8737d0) {
            int i10;
            if (enumC8737d0 == EnumC8737d0.UNKNOWN) {
                return this;
            }
            int i11 = a.f36355a[enumC8737d0.ordinal()];
            if (i11 == 1) {
                i10 = 0;
            } else if (i11 == 2) {
                i10 = 32;
            } else {
                if (i11 != 3) {
                    C5931r1.m26572l("ExifData", "Unknown flash state: " + enumC8737d0);
                    return this;
                }
                i10 = 1;
            }
            if ((i10 & 1) == 1) {
                m38968c("LightSource", String.valueOf(4));
            }
            return m38968c("Flash", String.valueOf(i10));
        }

        /* JADX INFO: renamed from: h */
        public b m38973h(float f10) {
            return m38968c("FocalLength", new C10098n((long) (f10 * 1000.0f), 1000L).toString());
        }

        /* JADX INFO: renamed from: i */
        public b m38974i(int i10) {
            return m38968c("ImageLength", String.valueOf(i10));
        }

        /* JADX INFO: renamed from: j */
        public b m38975j(int i10) {
            return m38968c("ImageWidth", String.valueOf(i10));
        }

        /* JADX INFO: renamed from: k */
        public b m38976k(int i10) {
            return m38968c("SensitivityType", String.valueOf(3)).m38968c("PhotographicSensitivity", String.valueOf(Math.min(65535, i10)));
        }

        /* JADX INFO: renamed from: l */
        public b m38977l(float f10) {
            return m38968c("FNumber", String.valueOf(f10));
        }

        /* JADX INFO: renamed from: m */
        public b m38978m(int i10) {
            int i11;
            if (i10 == 0) {
                i11 = 1;
            } else if (i10 == 90) {
                i11 = 6;
            } else if (i10 == 180) {
                i11 = 3;
            } else if (i10 != 270) {
                C5931r1.m26572l("ExifData", "Unexpected orientation value: " + i10 + ". Must be one of 0, 90, 180, 270.");
                i11 = 0;
            } else {
                i11 = 8;
            }
            return m38968c("Orientation", String.valueOf(i11));
        }

        /* JADX INFO: renamed from: n */
        public b m38979n(c cVar) {
            String strValueOf;
            int iOrdinal = cVar.ordinal();
            if (iOrdinal != 0) {
                strValueOf = iOrdinal != 1 ? null : String.valueOf(1);
            } else {
                strValueOf = String.valueOf(0);
            }
            return m38968c("WhiteBalance", strValueOf);
        }
    }

    /* JADX INFO: renamed from: p0.i$c */
    public enum c {
        AUTO,
        MANUAL
    }

    static {
        C10095k[] c10095kArr = {new C10095k("ImageWidth", 256, 3, 4), new C10095k("ImageLength", InputDeviceCompat.SOURCE_KEYBOARD, 3, 4), new C10095k("Make", 271, 2), new C10095k("Model", 272, 2), new C10095k("Orientation", 274, 3), new C10095k("XResolution", 282, 5), new C10095k("YResolution", 283, 5), new C10095k("ResolutionUnit", 296, 3), new C10095k("Software", 305, 2), new C10095k("DateTime", 306, 2), new C10095k("YCbCrPositioning", 531, 3), new C10095k("SubIFDPointer", 330, 4), new C10095k("ExifIFDPointer", 34665, 4), new C10095k("GPSInfoIFDPointer", 34853, 4)};
        f36345d = c10095kArr;
        C10095k[] c10095kArr2 = {new C10095k("ExposureTime", 33434, 5), new C10095k("FNumber", 33437, 5), new C10095k("ExposureProgram", 34850, 3), new C10095k("PhotographicSensitivity", 34855, 3), new C10095k("SensitivityType", 34864, 3), new C10095k("ExifVersion", 36864, 2), new C10095k("DateTimeOriginal", 36867, 2), new C10095k("DateTimeDigitized", 36868, 2), new C10095k("ComponentsConfiguration", 37121, 7), new C10095k("ShutterSpeedValue", 37377, 10), new C10095k("ApertureValue", 37378, 5), new C10095k("BrightnessValue", 37379, 10), new C10095k("ExposureBiasValue", 37380, 10), new C10095k("MaxApertureValue", 37381, 5), new C10095k("MeteringMode", 37383, 3), new C10095k("LightSource", 37384, 3), new C10095k("Flash", 37385, 3), new C10095k("FocalLength", 37386, 5), new C10095k("SubSecTime", 37520, 2), new C10095k("SubSecTimeOriginal", 37521, 2), new C10095k("SubSecTimeDigitized", 37522, 2), new C10095k("FlashpixVersion", 40960, 7), new C10095k("ColorSpace", 40961, 3), new C10095k("PixelXDimension", 40962, 3, 4), new C10095k("PixelYDimension", 40963, 3, 4), new C10095k("InteroperabilityIFDPointer", 40965, 4), new C10095k("FocalPlaneResolutionUnit", 41488, 3), new C10095k("SensingMethod", 41495, 3), new C10095k("FileSource", 41728, 7), new C10095k("SceneType", 41729, 7), new C10095k("CustomRendered", 41985, 3), new C10095k("ExposureMode", 41986, 3), new C10095k("WhiteBalance", 41987, 3), new C10095k("SceneCaptureType", 41990, 3), new C10095k("Contrast", 41992, 3), new C10095k("Saturation", 41993, 3), new C10095k("Sharpness", 41994, 3)};
        f36346e = c10095kArr2;
        C10095k[] c10095kArr3 = {new C10095k("GPSVersionID", 0, 1), new C10095k("GPSLatitudeRef", 1, 2), new C10095k("GPSLatitude", 2, 5, 10), new C10095k("GPSLongitudeRef", 3, 2), new C10095k("GPSLongitude", 4, 5, 10), new C10095k("GPSAltitudeRef", 5, 1), new C10095k("GPSAltitude", 6, 5), new C10095k("GPSTimeStamp", 7, 5), new C10095k("GPSSpeedRef", 12, 2), new C10095k("GPSTrackRef", 14, 2), new C10095k("GPSImgDirectionRef", 16, 2), new C10095k("GPSDestBearingRef", 23, 2), new C10095k("GPSDestDistanceRef", 25, 2)};
        f36347f = c10095kArr3;
        f36348g = new C10095k[]{new C10095k("SubIFDPointer", 330, 4), new C10095k("ExifIFDPointer", 34665, 4), new C10095k("GPSInfoIFDPointer", 34853, 4), new C10095k("InteroperabilityIFDPointer", 40965, 4)};
        C10095k[] c10095kArr4 = {new C10095k("InteroperabilityIndex", 1, 2)};
        f36349h = c10095kArr4;
        f36350i = new C10095k[][]{c10095kArr, c10095kArr2, c10095kArr3, c10095kArr4};
        f36351j = new HashSet<>(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
        f36352k = new String(new byte[]{1, 2, 3, 0}, StandardCharsets.UTF_8);
    }

    public C10093i(ByteOrder byteOrder, List<Map<String, C10092h>> list) {
        C12637g.m47078j(list.size() == f36350i.length, "Malformed attributes list. Number of IFDs mismatch.");
        this.f36354b = byteOrder;
        this.f36353a = list;
    }

    /* JADX INFO: renamed from: b */
    public static b m38962b() {
        return new b(ByteOrder.BIG_ENDIAN).m38968c("Orientation", String.valueOf(1)).m38968c("XResolution", "72/1").m38968c("YResolution", "72/1").m38968c("ResolutionUnit", String.valueOf(2)).m38968c("YCbCrPositioning", String.valueOf(1)).m38968c("Make", Build.MANUFACTURER).m38968c("Model", Build.MODEL);
    }

    /* JADX INFO: renamed from: c */
    public static C10093i m38963c(InterfaceC0494d interfaceC0494d, int i10) {
        b bVarM38962b = m38962b();
        if (interfaceC0494d.mo2192H2() != null) {
            interfaceC0494d.mo2192H2().mo26498a(bVarM38962b);
        }
        bVarM38962b.m38978m(i10);
        return bVarM38962b.m38975j(interfaceC0494d.getWidth()).m38974i(interfaceC0494d.getHeight()).m38967a();
    }

    /* JADX INFO: renamed from: d */
    public Map<String, C10092h> m38964d(int i10) {
        C12637g.m47071c(i10, 0, f36350i.length, "Invalid IFD index: " + i10 + ". Index should be between [0, EXIF_TAGS.length] ");
        return this.f36353a.get(i10);
    }

    /* JADX INFO: renamed from: e */
    public ByteOrder m38965e() {
        return this.f36354b;
    }
}
