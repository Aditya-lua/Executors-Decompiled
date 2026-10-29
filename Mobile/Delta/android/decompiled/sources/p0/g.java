package p0;

import android.location.Location;
import g0.r1;
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

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f28061c = "g";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal<SimpleDateFormat> f28062d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadLocal<SimpleDateFormat> f28063e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ThreadLocal<SimpleDateFormat> f28064f = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List<String> f28065g = n();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List<String> f28066h = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4.a f28067a;
    public boolean b = false;

    public class a extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    public class b extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    }

    public class c extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    public static final class d {

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final double f28068a;

            public a(double d10) {
                this.f28068a = d10;
            }

            public double a() {
                return this.f28068a / 2.23694d;
            }
        }

        public static a a(double d10) {
            return new a(d10 * 0.621371d);
        }

        public static a b(double d10) {
            return new a(d10 * 1.15078d);
        }

        public static a c(double d10) {
            return new a(d10);
        }
    }

    public g(c4.a aVar) {
        this.f28067a = aVar;
    }

    public static Date c(String str) {
        return f28062d.get().parse(str);
    }

    public static Date d(String str) {
        return f28064f.get().parse(str);
    }

    public static Date e(String str) {
        return f28063e.get().parse(str);
    }

    public static String f(long j10) {
        return f28064f.get().format(new Date(j10));
    }

    public static g h(File file) {
        return i(file.toString());
    }

    public static g i(String str) {
        return new g(new c4.a(str));
    }

    public static g j(androidx.camera.core.d dVar) {
        ByteBuffer byteBufferK = dVar.H1()[0].k();
        byteBufferK.rewind();
        byte[] bArr = new byte[byteBufferK.capacity()];
        byteBufferK.get(bArr);
        return k(new ByteArrayInputStream(bArr));
    }

    public static g k(InputStream inputStream) {
        return new g(new c4.a(inputStream));
    }

    public static List<String> n() {
        return Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");
    }

    public void A() throws Throwable {
        if (!this.b) {
            a();
        }
        this.f28067a.c0();
    }

    public final void a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strF = f(jCurrentTimeMillis);
        this.f28067a.h0("DateTime", strF);
        try {
            this.f28067a.h0("SubSecTime", Long.toString(jCurrentTimeMillis - d(strF).getTime()));
        } catch (ParseException unused) {
        }
    }

    public void b(Location location) {
        this.f28067a.i0(location);
    }

    public void g(g gVar) {
        ArrayList arrayList = new ArrayList(f28065g);
        arrayList.removeAll(f28066h);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            String str = (String) obj;
            String strK = this.f28067a.k(str);
            String strK2 = gVar.f28067a.k(str);
            if (strK != null && !strK.equals(strK2)) {
                gVar.f28067a.h0(str, strK);
            }
        }
    }

    public void l() {
        int i10;
        switch (r()) {
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
        this.f28067a.h0("Orientation", String.valueOf(i10));
    }

    public void m() {
        int i10;
        switch (r()) {
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
        this.f28067a.h0("Orientation", String.valueOf(i10));
    }

    public String o() {
        return this.f28067a.k("ImageDescription");
    }

    public int p() {
        return this.f28067a.m("ImageLength", 0);
    }

    public Location q() {
        double dA;
        String strK = this.f28067a.k("GPSProcessingMethod");
        double[] dArrQ = this.f28067a.q();
        double dJ = this.f28067a.j(0.0d);
        double dL = this.f28067a.l("GPSSpeed", 0.0d);
        String strK2 = this.f28067a.k("GPSSpeedRef");
        if (strK2 == null) {
            strK2 = "K";
        }
        long jY = y(this.f28067a.k("GPSDateStamp"), this.f28067a.k("GPSTimeStamp"));
        if (dArrQ == null) {
            return null;
        }
        if (strK == null) {
            strK = f28061c;
        }
        Location location = new Location(strK);
        location.setLatitude(dArrQ[0]);
        location.setLongitude(dArrQ[1]);
        if (dJ != 0.0d) {
            location.setAltitude(dJ);
        }
        if (dL != 0.0d) {
            int iHashCode = strK2.hashCode();
            if (iHashCode != 75) {
                if (iHashCode != 77) {
                    if (iHashCode == 78 && strK2.equals("N")) {
                        dA = d.b(dL).a();
                    }
                } else if (strK2.equals("M")) {
                    dA = d.c(dL).a();
                }
                location.setSpeed((float) dA);
            } else {
                strK2.equals("K");
            }
            dA = d.a(dL).a();
            location.setSpeed((float) dA);
        }
        if (jY != -1) {
            location.setTime(jY);
        }
        return location;
    }

    public int r() {
        return this.f28067a.m("Orientation", 0);
    }

    public int s() {
        switch (r()) {
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

    public long t() {
        long jX = x(this.f28067a.k("DateTimeOriginal"));
        if (jX == -1) {
            return -1L;
        }
        String strK = this.f28067a.k("SubSecTimeOriginal");
        if (strK == null) {
            return jX;
        }
        try {
            long j10 = Long.parseLong(strK);
            while (j10 > 1000) {
                j10 /= 10;
            }
            return jX + j10;
        } catch (NumberFormatException unused) {
            return jX;
        }
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", Integer.valueOf(u()), Integer.valueOf(p()), Integer.valueOf(s()), Boolean.valueOf(w()), Boolean.valueOf(v()), q(), Long.valueOf(t()), o());
    }

    public int u() {
        return this.f28067a.m("ImageWidth", 0);
    }

    public boolean v() {
        return r() == 2;
    }

    public boolean w() {
        int iR = r();
        return iR == 4 || iR == 5 || iR == 7;
    }

    public final long x(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return d(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    public final long y(String str, String str2) {
        if (str == null && str2 == null) {
            return -1L;
        }
        if (str2 == null) {
            try {
                return c(str).getTime();
            } catch (ParseException unused) {
                return -1L;
            }
        }
        if (str == null) {
            try {
                return e(str2).getTime();
            } catch (ParseException unused2) {
                return -1L;
            }
        }
        return x(str + " " + str2);
    }

    public void z(int i10) {
        if (i10 % 90 != 0) {
            r1.l(f28061c, String.format(Locale.US, "Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", Integer.valueOf(i10)));
            this.f28067a.h0("Orientation", String.valueOf(0));
            return;
        }
        int i11 = i10 % 360;
        int iR = r();
        while (i11 < 0) {
            i11 += 90;
            switch (iR) {
                case 2:
                    iR = 5;
                    break;
                case 3:
                case 8:
                    iR = 6;
                    break;
                case 4:
                    iR = 7;
                    break;
                case 5:
                    iR = 4;
                    break;
                case 6:
                    iR = 1;
                    break;
                case 7:
                    iR = 2;
                    break;
                default:
                    iR = 8;
                    break;
            }
        }
        while (i11 > 0) {
            i11 -= 90;
            switch (iR) {
                case 2:
                    iR = 7;
                    break;
                case 3:
                    iR = 8;
                    break;
                case 4:
                    iR = 5;
                    break;
                case 5:
                    iR = 2;
                    break;
                case 6:
                    iR = 3;
                    break;
                case 7:
                    iR = 4;
                    break;
                case 8:
                    iR = 1;
                    break;
                default:
                    iR = 6;
                    break;
            }
        }
        this.f28067a.h0("Orientation", String.valueOf(iR));
    }
}
