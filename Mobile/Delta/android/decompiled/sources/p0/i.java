package p0;

import android.os.Build;
import android.util.Pair;
import com.google.mlkit.vision.barcode.common.Barcode;
import g0.r1;
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
import n0.d0;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f28076c = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k[] f28077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k[] f28078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k[] f28079f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k[] f28080g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k[] f28081h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final k[][] f28082i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HashSet<String> f28083j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f28084k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Map<String, h>> f28085a;
    public final ByteOrder b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28086a;

        static {
            int[] iArr = new int[d0.values().length];
            f28086a = iArr;
            try {
                iArr[d0.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28086a[d0.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28086a[d0.FIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Pattern f28087c = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Pattern f28088d = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Pattern f28089e = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final List<HashMap<String, k>> f28090f = Collections.list(new a());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<Map<String, h>> f28091a = Collections.list(new C0490b());
        public final ByteOrder b;

        public class a implements Enumeration<HashMap<String, k>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f28092a = 0;

            @Override // java.util.Enumeration
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public HashMap<String, k> nextElement() {
                HashMap<String, k> map = new HashMap<>();
                for (k kVar : i.f28082i[this.f28092a]) {
                    map.put(kVar.b, kVar);
                }
                this.f28092a++;
                return map;
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f28092a < i.f28082i.length;
            }
        }

        /* JADX INFO: renamed from: p0.i$b$b, reason: collision with other inner class name */
        public class C0490b implements Enumeration<Map<String, h>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f28093a = 0;

            public C0490b() {
            }

            @Override // java.util.Enumeration
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<String, h> nextElement() {
                this.f28093a++;
                return new HashMap();
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f28093a < i.f28082i.length;
            }
        }

        public class c implements Enumeration<Map<String, h>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Enumeration<Map<String, h>> f28094a;

            public c() {
                this.f28094a = Collections.enumeration(b.this.f28091a);
            }

            @Override // java.util.Enumeration
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<String, h> nextElement() {
                return new HashMap(this.f28094a.nextElement());
            }

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.f28094a.hasMoreElements();
            }
        }

        public b(ByteOrder byteOrder) {
            this.b = byteOrder;
        }

        public static Pair<Integer, Integer> b(String str) {
            if (str.contains(",")) {
                String[] strArrSplit = str.split(",", -1);
                Pair<Integer, Integer> pairB = b(strArrSplit[0]);
                if (((Integer) pairB.first).intValue() == 2) {
                    return pairB;
                }
                for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                    Pair<Integer, Integer> pairB2 = b(strArrSplit[i10]);
                    int iIntValue = (((Integer) pairB2.first).equals(pairB.first) || ((Integer) pairB2.second).equals(pairB.first)) ? ((Integer) pairB.first).intValue() : -1;
                    int iIntValue2 = (((Integer) pairB.second).intValue() == -1 || !(((Integer) pairB2.first).equals(pairB.second) || ((Integer) pairB2.second).equals(pairB.second))) ? -1 : ((Integer) pairB.second).intValue();
                    if (iIntValue == -1 && iIntValue2 == -1) {
                        return new Pair<>(2, -1);
                    }
                    if (iIntValue == -1) {
                        pairB = new Pair<>(Integer.valueOf(iIntValue2), -1);
                    } else if (iIntValue2 == -1) {
                        pairB = new Pair<>(Integer.valueOf(iIntValue), -1);
                    }
                }
                return pairB;
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

        public i a() {
            ArrayList list = Collections.list(new c());
            if (!list.get(1).isEmpty()) {
                d("ExposureProgram", String.valueOf(0), list);
                d("ExifVersion", "0230", list);
                d("ComponentsConfiguration", i.f28084k, list);
                d("MeteringMode", String.valueOf(0), list);
                d("LightSource", String.valueOf(0), list);
                d("FlashpixVersion", "0100", list);
                d("FocalPlaneResolutionUnit", String.valueOf(2), list);
                d("FileSource", String.valueOf(3), list);
                d("SceneType", String.valueOf(1), list);
                d("CustomRendered", String.valueOf(0), list);
                d("SceneCaptureType", String.valueOf(0), list);
                d("Contrast", String.valueOf(0), list);
                d("Saturation", String.valueOf(0), list);
                d("Sharpness", String.valueOf(0), list);
            }
            if (!list.get(2).isEmpty()) {
                d("GPSVersionID", "2300", list);
                d("GPSSpeedRef", "K", list);
                d("GPSTrackRef", "T", list);
                d("GPSImgDirectionRef", "T", list);
                d("GPSDestBearingRef", "T", list);
                d("GPSDestDistanceRef", "K", list);
            }
            return new i(this.b, list);
        }

        public b c(String str, String str2) {
            e(str, str2, this.f28091a);
            return this;
        }

        public final void d(String str, String str2, List<Map<String, h>> list) {
            Iterator<Map<String, h>> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().containsKey(str)) {
                    return;
                }
            }
            e(str, str2, list);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Switch 'out' block B:44:0x0146 for B:65:0x0195 already processed. Defaulting to fallback option. */
        public final void e(String str, String str2, List<Map<String, h>> list) {
            int i10;
            int i11;
            b bVar = this;
            String str3 = str;
            String strReplaceAll = str2;
            if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && strReplaceAll != null) {
                boolean zFind = f28088d.matcher(strReplaceAll).find();
                boolean zFind2 = f28089e.matcher(strReplaceAll).find();
                if (strReplaceAll.length() != 19 || (!zFind && !zFind2)) {
                    r1.l("ExifData", "Invalid value for " + str3 + " : " + strReplaceAll);
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
            if (strReplaceAll != null && i.f28083j.contains(str4)) {
                if (str4.equals("GPSTimeStamp")) {
                    Matcher matcher = f28087c.matcher(strReplaceAll);
                    if (!matcher.find()) {
                        r1.l("ExifData", "Invalid value for " + str4 + " : " + strReplaceAll);
                        return;
                    }
                    strReplaceAll = Integer.parseInt((String) x2.g.g(matcher.group(1))) + "/1," + Integer.parseInt((String) x2.g.g(matcher.group(2))) + "/1," + Integer.parseInt((String) x2.g.g(matcher.group(3))) + "/1";
                } else {
                    try {
                        strReplaceAll = new n(Double.parseDouble(strReplaceAll)).toString();
                    } catch (NumberFormatException e10) {
                        r1.m("ExifData", "Invalid value for " + str4 + " : " + strReplaceAll, e10);
                        return;
                    }
                }
            }
            int i14 = 0;
            while (i14 < i.f28082i.length) {
                k kVar = f28090f.get(i14).get(str4);
                if (kVar == null) {
                    i10 = i13;
                } else {
                    if (strReplaceAll != null) {
                        Pair<Integer, Integer> pairB = b(strReplaceAll);
                        int i15 = -1;
                        if (kVar.f28104c == ((Integer) pairB.first).intValue() || kVar.f28104c == ((Integer) pairB.second).intValue()) {
                            i11 = kVar.f28104c;
                        } else {
                            int i16 = kVar.f28105d;
                            if (i16 == -1 || !(i16 == ((Integer) pairB.first).intValue() || kVar.f28105d == ((Integer) pairB.second).intValue())) {
                                i11 = kVar.f28104c;
                                if (i11 == i13 || i11 == 7 || i11 == i12) {
                                }
                            } else {
                                i11 = kVar.f28105d;
                            }
                        }
                        String str5 = "/";
                        switch (i11) {
                            case 1:
                                i10 = i13;
                                list.get(i14).put(str4, h.a(strReplaceAll));
                                continue;
                            case 2:
                            case 7:
                                i10 = i13;
                                list.get(i14).put(str4, h.e(strReplaceAll));
                                continue;
                            case 3:
                                i10 = i13;
                                String[] strArrSplit = strReplaceAll.split(",", -1);
                                int[] iArr = new int[strArrSplit.length];
                                for (int i17 = 0; i17 < strArrSplit.length; i17++) {
                                    iArr[i17] = Integer.parseInt(strArrSplit[i17]);
                                }
                                list.get(i14).put(str4, h.i(iArr, bVar.b));
                                continue;
                            case 4:
                                i10 = i13;
                                String[] strArrSplit2 = strReplaceAll.split(",", -1);
                                long[] jArr = new long[strArrSplit2.length];
                                for (int i18 = 0; i18 < strArrSplit2.length; i18++) {
                                    jArr[i18] = Long.parseLong(strArrSplit2[i18]);
                                }
                                list.get(i14).put(str4, h.g(jArr, bVar.b));
                                continue;
                            case 5:
                                i10 = i13;
                                int i19 = -1;
                                String[] strArrSplit3 = strReplaceAll.split(",", -1);
                                n[] nVarArr = new n[strArrSplit3.length];
                                int i20 = 0;
                                while (i20 < strArrSplit3.length) {
                                    String[] strArrSplit4 = strArrSplit3[i20].split("/", i19);
                                    nVarArr[i20] = new n((long) Double.parseDouble(strArrSplit4[0]), (long) Double.parseDouble(strArrSplit4[i10]));
                                    i20++;
                                    i19 = -1;
                                }
                                bVar = this;
                                list.get(i14).put(str4, h.h(nVarArr, bVar.b));
                                continue;
                            case 9:
                                i10 = i13;
                                String[] strArrSplit5 = strReplaceAll.split(",", -1);
                                int[] iArr2 = new int[strArrSplit5.length];
                                for (int i21 = 0; i21 < strArrSplit5.length; i21++) {
                                    iArr2[i21] = Integer.parseInt(strArrSplit5[i21]);
                                }
                                list.get(i14).put(str4, h.c(iArr2, bVar.b));
                                continue;
                            case 10:
                                String[] strArrSplit6 = strReplaceAll.split(",", -1);
                                n[] nVarArr2 = new n[strArrSplit6.length];
                                int i22 = 0;
                                while (i22 < strArrSplit6.length) {
                                    String[] strArrSplit7 = strArrSplit6[i22].split(str5, i15);
                                    int i23 = i13;
                                    nVarArr2[i22] = new n((long) Double.parseDouble(strArrSplit7[0]), (long) Double.parseDouble(strArrSplit7[i23]));
                                    i22++;
                                    i13 = i23;
                                    str5 = str5;
                                    i15 = -1;
                                }
                                i10 = i13;
                                list.get(i14).put(str4, h.d(nVarArr2, bVar.b));
                                continue;
                            case 12:
                                String[] strArrSplit8 = strReplaceAll.split(",", -1);
                                double[] dArr = new double[strArrSplit8.length];
                                for (int i24 = 0; i24 < strArrSplit8.length; i24++) {
                                    dArr[i24] = Double.parseDouble(strArrSplit8[i24]);
                                }
                                list.get(i14).put(str4, h.b(dArr, bVar.b));
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

        public b f(long j10) {
            return c("ExposureTime", String.valueOf(j10 / TimeUnit.SECONDS.toNanos(1L)));
        }

        public b g(d0 d0Var) {
            int i10;
            if (d0Var == d0.UNKNOWN) {
                return this;
            }
            int i11 = a.f28086a[d0Var.ordinal()];
            if (i11 == 1) {
                i10 = 0;
            } else if (i11 == 2) {
                i10 = 32;
            } else {
                if (i11 != 3) {
                    r1.l("ExifData", "Unknown flash state: " + d0Var);
                    return this;
                }
                i10 = 1;
            }
            if ((i10 & 1) == 1) {
                c("LightSource", String.valueOf(4));
            }
            return c("Flash", String.valueOf(i10));
        }

        public b h(float f10) {
            return c("FocalLength", new n((long) (f10 * 1000.0f), 1000L).toString());
        }

        public b i(int i10) {
            return c("ImageLength", String.valueOf(i10));
        }

        public b j(int i10) {
            return c("ImageWidth", String.valueOf(i10));
        }

        public b k(int i10) {
            return c("SensitivityType", String.valueOf(3)).c("PhotographicSensitivity", String.valueOf(Math.min(Settings.DEFAULT_INITIAL_WINDOW_SIZE, i10)));
        }

        public b l(float f10) {
            return c("FNumber", String.valueOf(f10));
        }

        public b m(int i10) {
            int i11;
            if (i10 == 0) {
                i11 = 1;
            } else if (i10 == 90) {
                i11 = 6;
            } else if (i10 == 180) {
                i11 = 3;
            } else if (i10 != 270) {
                r1.l("ExifData", "Unexpected orientation value: " + i10 + ". Must be one of 0, 90, 180, 270.");
                i11 = 0;
            } else {
                i11 = 8;
            }
            return c("Orientation", String.valueOf(i11));
        }

        public b n(c cVar) {
            String strValueOf;
            int iOrdinal = cVar.ordinal();
            if (iOrdinal != 0) {
                strValueOf = iOrdinal != 1 ? null : String.valueOf(1);
            } else {
                strValueOf = String.valueOf(0);
            }
            return c("WhiteBalance", strValueOf);
        }
    }

    public enum c {
        AUTO,
        MANUAL
    }

    static {
        k[] kVarArr = {new k("ImageWidth", Barcode.FORMAT_QR_CODE, 3, 4), new k("ImageLength", 257, 3, 4), new k("Make", 271, 2), new k("Model", 272, 2), new k("Orientation", 274, 3), new k("XResolution", 282, 5), new k("YResolution", 283, 5), new k("ResolutionUnit", 296, 3), new k("Software", 305, 2), new k("DateTime", 306, 2), new k("YCbCrPositioning", 531, 3), new k("SubIFDPointer", 330, 4), new k("ExifIFDPointer", 34665, 4), new k("GPSInfoIFDPointer", 34853, 4)};
        f28077d = kVarArr;
        k[] kVarArr2 = {new k("ExposureTime", 33434, 5), new k("FNumber", 33437, 5), new k("ExposureProgram", 34850, 3), new k("PhotographicSensitivity", 34855, 3), new k("SensitivityType", 34864, 3), new k("ExifVersion", 36864, 2), new k("DateTimeOriginal", 36867, 2), new k("DateTimeDigitized", 36868, 2), new k("ComponentsConfiguration", 37121, 7), new k("ShutterSpeedValue", 37377, 10), new k("ApertureValue", 37378, 5), new k("BrightnessValue", 37379, 10), new k("ExposureBiasValue", 37380, 10), new k("MaxApertureValue", 37381, 5), new k("MeteringMode", 37383, 3), new k("LightSource", 37384, 3), new k("Flash", 37385, 3), new k("FocalLength", 37386, 5), new k("SubSecTime", 37520, 2), new k("SubSecTimeOriginal", 37521, 2), new k("SubSecTimeDigitized", 37522, 2), new k("FlashpixVersion", 40960, 7), new k("ColorSpace", 40961, 3), new k("PixelXDimension", 40962, 3, 4), new k("PixelYDimension", 40963, 3, 4), new k("InteroperabilityIFDPointer", 40965, 4), new k("FocalPlaneResolutionUnit", 41488, 3), new k("SensingMethod", 41495, 3), new k("FileSource", 41728, 7), new k("SceneType", 41729, 7), new k("CustomRendered", 41985, 3), new k("ExposureMode", 41986, 3), new k("WhiteBalance", 41987, 3), new k("SceneCaptureType", 41990, 3), new k("Contrast", 41992, 3), new k("Saturation", 41993, 3), new k("Sharpness", 41994, 3)};
        f28078e = kVarArr2;
        k[] kVarArr3 = {new k("GPSVersionID", 0, 1), new k("GPSLatitudeRef", 1, 2), new k("GPSLatitude", 2, 5, 10), new k("GPSLongitudeRef", 3, 2), new k("GPSLongitude", 4, 5, 10), new k("GPSAltitudeRef", 5, 1), new k("GPSAltitude", 6, 5), new k("GPSTimeStamp", 7, 5), new k("GPSSpeedRef", 12, 2), new k("GPSTrackRef", 14, 2), new k("GPSImgDirectionRef", 16, 2), new k("GPSDestBearingRef", 23, 2), new k("GPSDestDistanceRef", 25, 2)};
        f28079f = kVarArr3;
        f28080g = new k[]{new k("SubIFDPointer", 330, 4), new k("ExifIFDPointer", 34665, 4), new k("GPSInfoIFDPointer", 34853, 4), new k("InteroperabilityIFDPointer", 40965, 4)};
        k[] kVarArr4 = {new k("InteroperabilityIndex", 1, 2)};
        f28081h = kVarArr4;
        f28082i = new k[][]{kVarArr, kVarArr2, kVarArr3, kVarArr4};
        f28083j = new HashSet<>(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
        f28084k = new String(new byte[]{1, 2, 3, 0}, StandardCharsets.UTF_8);
    }

    public i(ByteOrder byteOrder, List<Map<String, h>> list) {
        x2.g.j(list.size() == f28082i.length, "Malformed attributes list. Number of IFDs mismatch.");
        this.b = byteOrder;
        this.f28085a = list;
    }

    public static b b() {
        return new b(ByteOrder.BIG_ENDIAN).c("Orientation", String.valueOf(1)).c("XResolution", "72/1").c("YResolution", "72/1").c("ResolutionUnit", String.valueOf(2)).c("YCbCrPositioning", String.valueOf(1)).c("Make", Build.MANUFACTURER).c("Model", Build.MODEL);
    }

    public static i c(androidx.camera.core.d dVar, int i10) {
        b bVarB = b();
        if (dVar.H2() != null) {
            dVar.H2().a(bVarB);
        }
        bVarB.m(i10);
        return bVarB.j(dVar.getWidth()).i(dVar.getHeight()).a();
    }

    public Map<String, h> d(int i10) {
        x2.g.c(i10, 0, f28082i.length, "Invalid IFD index: " + i10 + ". Index should be between [0, EXIF_TAGS.length] ");
        return this.f28085a.get(i10);
    }

    public ByteOrder e() {
        return this.b;
    }
}
