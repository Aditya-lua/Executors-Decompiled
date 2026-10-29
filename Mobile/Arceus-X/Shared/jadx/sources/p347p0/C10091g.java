package p347p0;

import android.location.Location;
import androidx.camera.core.InterfaceC0494d;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p040c4.C1523a;
import p140g0.C5931r1;

/* JADX INFO: renamed from: p0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C10091g {

    /* JADX INFO: renamed from: c */
    public static final String f36327c = "g";

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal<SimpleDateFormat> f36328d = new a();

    /* JADX INFO: renamed from: e */
    public static final ThreadLocal<SimpleDateFormat> f36329e = new b();

    /* JADX INFO: renamed from: f */
    public static final ThreadLocal<SimpleDateFormat> f36330f = new c();

    /* JADX INFO: renamed from: g */
    public static final List<String> f36331g = m38925n();

    /* JADX INFO: renamed from: h */
    public static final List<String> f36332h = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    /* JADX INFO: renamed from: a */
    public final C1523a f36333a;

    /* JADX INFO: renamed from: b */
    public boolean f36334b = false;

    /* JADX INFO: renamed from: p0.g$a */
    public class a extends ThreadLocal<SimpleDateFormat> {
        /* JADX DEBUG: Method merged with bridge method: initialValue()Ljava/lang/Object; */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    /* JADX INFO: renamed from: p0.g$b */
    public class b extends ThreadLocal<SimpleDateFormat> {
        /* JADX DEBUG: Method merged with bridge method: initialValue()Ljava/lang/Object; */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    }

    /* JADX INFO: renamed from: p0.g$c */
    public class c extends ThreadLocal<SimpleDateFormat> {
        /* JADX DEBUG: Method merged with bridge method: initialValue()Ljava/lang/Object; */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    /* JADX INFO: renamed from: p0.g$d */
    public static final class d {

        /* JADX INFO: renamed from: p0.g$d$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public final double f36335a;

            public a(double d10) {
                this.f36335a = d10;
            }

            /* JADX INFO: renamed from: a */
            public double m38950a() {
                return this.f36335a / 2.23694d;
            }
        }

        /* JADX INFO: renamed from: a */
        public static a m38947a(double d10) {
            return new a(d10 * 0.621371d);
        }

        /* JADX INFO: renamed from: b */
        public static a m38948b(double d10) {
            return new a(d10 * 1.15078d);
        }

        /* JADX INFO: renamed from: c */
        public static a m38949c(double d10) {
            return new a(d10);
        }
    }

    public C10091g(C1523a c1523a) {
        this.f36333a = c1523a;
    }

    /* JADX INFO: renamed from: c */
    public static Date m38917c(String str) {
        return f36328d.get().parse(str);
    }

    /* JADX INFO: renamed from: d */
    public static Date m38918d(String str) {
        return f36330f.get().parse(str);
    }

    /* JADX INFO: renamed from: e */
    public static Date m38919e(String str) {
        return f36329e.get().parse(str);
    }

    /* JADX INFO: renamed from: f */
    public static String m38920f(long j10) {
        return f36330f.get().format(new Date(j10));
    }

    /* JADX INFO: renamed from: h */
    public static C10091g m38921h(File file) {
        return m38922i(file.toString());
    }

    /* JADX INFO: renamed from: i */
    public static C10091g m38922i(String str) {
        return new C10091g(new C1523a(str));
    }

    /* JADX INFO: renamed from: j */
    public static C10091g m38923j(InterfaceC0494d interfaceC0494d) {
        ByteBuffer byteBufferMo2188k = interfaceC0494d.mo2186H1()[0].mo2188k();
        byteBufferMo2188k.rewind();
        byte[] bArr = new byte[byteBufferMo2188k.capacity()];
        byteBufferMo2188k.get(bArr);
        return m38924k(new ByteArrayInputStream(bArr));
    }

    /* JADX INFO: renamed from: k */
    public static C10091g m38924k(InputStream inputStream) {
        return new C10091g(new C1523a(inputStream));
    }

    /* JADX INFO: renamed from: n */
    public static List<String> m38925n() {
        return Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");
    }

    /* JADX INFO: renamed from: A */
    public void m38926A() throws Throwable {
        if (!this.f36334b) {
            m38927a();
        }
        this.f36333a.m7988c0();
    }

    /* JADX INFO: renamed from: a */
    public final void m38927a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strM38920f = m38920f(jCurrentTimeMillis);
        this.f36333a.m7996h0("DateTime", strM38920f);
        try {
            this.f36333a.m7996h0("SubSecTime", Long.toString(jCurrentTimeMillis - m38918d(strM38920f).getTime()));
        } catch (ParseException unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public void m38928b(Location location) {
        this.f36333a.m7998i0(location);
    }

    /* JADX INFO: renamed from: g */
    public void m38929g(C10091g c10091g) {
        ArrayList arrayList = new ArrayList(f36331g);
        arrayList.removeAll(f36332h);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            String str = (String) obj;
            String strM8001k = this.f36333a.m8001k(str);
            String strM8001k2 = c10091g.f36333a.m8001k(str);
            if (strM8001k != null && !strM8001k.equals(strM8001k2)) {
                c10091g.f36333a.m7996h0(str, strM8001k);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m38930l() {
        int i10;
        switch (m38935r()) {
            case 2:
                i10 = 1;
                break;
            case 3:
                i10 = 4;
                break;
            case 4:
                i10 = 3;
                break;
            case 5:
                i10 = 6;
                break;
            case 6:
                i10 = 5;
                break;
            case 7:
                i10 = 8;
                break;
            case 8:
                i10 = 7;
                break;
            default:
                i10 = 2;
                break;
        }
        this.f36333a.m7996h0("Orientation", String.valueOf(i10));
    }

    /* JADX INFO: renamed from: m */
    public void m38931m() {
        int i10;
        switch (m38935r()) {
            case 2:
                i10 = 3;
                break;
            case 3:
                i10 = 2;
                break;
            case 4:
                i10 = 1;
                break;
            case 5:
                i10 = 8;
                break;
            case 6:
                i10 = 7;
                break;
            case 7:
                i10 = 6;
                break;
            case 8:
                i10 = 5;
                break;
            default:
                i10 = 4;
                break;
        }
        this.f36333a.m7996h0("Orientation", String.valueOf(i10));
    }

    /* JADX INFO: renamed from: o */
    public String m38932o() {
        return this.f36333a.m8001k("ImageDescription");
    }

    /* JADX INFO: renamed from: p */
    public int m38933p() {
        return this.f36333a.m8004m("ImageLength", 0);
    }

    /* JADX INFO: renamed from: q */
    public Location m38934q() {
        double dM38950a;
        String strM8001k = this.f36333a.m8001k("GPSProcessingMethod");
        double[] dArrM8011q = this.f36333a.m8011q();
        double dM7999j = this.f36333a.m7999j(0.0d);
        double dM8003l = this.f36333a.m8003l("GPSSpeed", 0.0d);
        String strM8001k2 = this.f36333a.m8001k("GPSSpeedRef");
        if (strM8001k2 == null) {
            strM8001k2 = "K";
        }
        long jM38942y = m38942y(this.f36333a.m8001k("GPSDateStamp"), this.f36333a.m8001k("GPSTimeStamp"));
        if (dArrM8011q == null) {
            return null;
        }
        if (strM8001k == null) {
            strM8001k = f36327c;
        }
        Location location = new Location(strM8001k);
        location.setLatitude(dArrM8011q[0]);
        location.setLongitude(dArrM8011q[1]);
        if (dM7999j != 0.0d) {
            location.setAltitude(dM7999j);
        }
        if (dM8003l != 0.0d) {
            int iHashCode = strM8001k2.hashCode();
            if (iHashCode != 75) {
                if (iHashCode != 77) {
                    if (iHashCode == 78 && strM8001k2.equals("N")) {
                        dM38950a = d.m38948b(dM8003l).m38950a();
                    }
                } else if (strM8001k2.equals("M")) {
                    dM38950a = d.m38949c(dM8003l).m38950a();
                }
                location.setSpeed((float) dM38950a);
            } else {
                strM8001k2.equals("K");
            }
            dM38950a = d.m38947a(dM8003l).m38950a();
            location.setSpeed((float) dM38950a);
        }
        if (jM38942y != -1) {
            location.setTime(jM38942y);
        }
        return location;
    }

    /* JADX INFO: renamed from: r */
    public int m38935r() {
        return this.f36333a.m8004m("Orientation", 0);
    }

    /* JADX INFO: renamed from: s */
    public int m38936s() {
        switch (m38935r()) {
            case 3:
            case 4:
                return 180;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: t */
    public long m38937t() {
        long jM38941x = m38941x(this.f36333a.m8001k("DateTimeOriginal"));
        if (jM38941x == -1) {
            return -1L;
        }
        String strM8001k = this.f36333a.m8001k("SubSecTimeOriginal");
        if (strM8001k == null) {
            return jM38941x;
        }
        try {
            long j10 = Long.parseLong(strM8001k);
            while (j10 > 1000) {
                j10 /= 10;
            }
            return jM38941x + j10;
        } catch (NumberFormatException unused) {
            return jM38941x;
        }
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", Integer.valueOf(m38938u()), Integer.valueOf(m38933p()), Integer.valueOf(m38936s()), Boolean.valueOf(m38940w()), Boolean.valueOf(m38939v()), m38934q(), Long.valueOf(m38937t()), m38932o());
    }

    /* JADX INFO: renamed from: u */
    public int m38938u() {
        return this.f36333a.m8004m("ImageWidth", 0);
    }

    /* JADX INFO: renamed from: v */
    public boolean m38939v() {
        return m38935r() == 2;
    }

    /* JADX INFO: renamed from: w */
    public boolean m38940w() {
        int iM38935r = m38935r();
        return iM38935r == 4 || iM38935r == 5 || iM38935r == 7;
    }

    /* JADX INFO: renamed from: x */
    public final long m38941x(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return m38918d(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: y */
    public final long m38942y(String str, String str2) {
        if (str == null && str2 == null) {
            return -1L;
        }
        if (str2 == null) {
            try {
                return m38917c(str).getTime();
            } catch (ParseException unused) {
                return -1L;
            }
        }
        if (str == null) {
            try {
                return m38919e(str2).getTime();
            } catch (ParseException unused2) {
                return -1L;
            }
        }
        return m38941x(str + " " + str2);
    }

    /* JADX INFO: renamed from: z */
    public void m38943z(int i10) {
        if (i10 % 90 != 0) {
            C5931r1.m26572l(f36327c, String.format(Locale.US, "Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", Integer.valueOf(i10)));
            this.f36333a.m7996h0("Orientation", String.valueOf(0));
            return;
        }
        int i11 = i10 % 360;
        int iM38935r = m38935r();
        while (i11 < 0) {
            i11 += 90;
            switch (iM38935r) {
                case 2:
                    iM38935r = 5;
                    break;
                case 3:
                case 8:
                    iM38935r = 6;
                    break;
                case 4:
                    iM38935r = 7;
                    break;
                case 5:
                    iM38935r = 4;
                    break;
                case 6:
                    iM38935r = 1;
                    break;
                case 7:
                    iM38935r = 2;
                    break;
                default:
                    iM38935r = 8;
                    break;
            }
        }
        while (i11 > 0) {
            i11 -= 90;
            switch (iM38935r) {
                case 2:
                    iM38935r = 7;
                    break;
                case 3:
                    iM38935r = 8;
                    break;
                case 4:
                    iM38935r = 5;
                    break;
                case 5:
                    iM38935r = 2;
                    break;
                case 6:
                    iM38935r = 3;
                    break;
                case 7:
                    iM38935r = 4;
                    break;
                case 8:
                    iM38935r = 1;
                    break;
                default:
                    iM38935r = 6;
                    break;
            }
        }
        this.f36333a.m7996h0("Orientation", String.valueOf(iM38935r));
    }
}
