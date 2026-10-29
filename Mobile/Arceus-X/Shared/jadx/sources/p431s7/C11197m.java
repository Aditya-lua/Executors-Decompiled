package p431s7;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import androidx.annotation.NonNull;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;
import p121f7.C5444e;
import p162h7.C6314u;
import p189i7.C6646d;

/* JADX INFO: renamed from: s7.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C11197m {

    /* JADX INFO: renamed from: a */
    public static final Matrix f39524a = new Matrix();

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal<PathMeasure> f39525b = new a();

    /* JADX INFO: renamed from: c */
    public static final ThreadLocal<Path> f39526c = new b();

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal<Path> f39527d = new c();

    /* JADX INFO: renamed from: e */
    public static final ThreadLocal<float[]> f39528e = new d();

    /* JADX INFO: renamed from: f */
    public static final float f39529f = (float) (Math.sqrt(2.0d) / 2.0d);

    /* JADX INFO: renamed from: s7.m$a */
    public class a extends ThreadLocal<PathMeasure> {
        /* JADX DEBUG: Method merged with bridge method: initialValue()Ljava/lang/Object; */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    /* JADX INFO: renamed from: s7.m$b */
    public class b extends ThreadLocal<Path> {
        /* JADX DEBUG: Method merged with bridge method: initialValue()Ljava/lang/Object; */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    }

    /* JADX INFO: renamed from: s7.m$c */
    public class c extends ThreadLocal<Path> {
        /* JADX DEBUG: Method merged with bridge method: initialValue()Ljava/lang/Object; */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    }

    /* JADX INFO: renamed from: s7.m$d */
    public class d extends ThreadLocal<float[]> {
        /* JADX DEBUG: Method merged with bridge method: initialValue()Ljava/lang/Object; */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float[] initialValue() {
            return new float[4];
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m42212a(Path path, float f10, float f11, float f12) {
        if (C5444e.m24929h()) {
            C5444e.m24923b("applyTrimPathIfNeeded");
        }
        PathMeasure pathMeasure = f39525b.get();
        Path path2 = f39526c.get();
        Path path3 = f39527d.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f10 == 1.0f && f11 == 0.0f) {
            if (C5444e.m24929h()) {
                C5444e.m24924c("applyTrimPathIfNeeded");
                return;
            }
            return;
        }
        if (length < 1.0f || Math.abs((f11 - f10) - 1.0f) < 0.01d) {
            if (C5444e.m24929h()) {
                C5444e.m24924c("applyTrimPathIfNeeded");
                return;
            }
            return;
        }
        float f13 = f10 * length;
        float f14 = f11 * length;
        float f15 = f12 * length;
        float fMin = Math.min(f13, f14) + f15;
        float fMax = Math.max(f13, f14) + f15;
        if (fMin >= length && fMax >= length) {
            fMin = C11194j.m42188f(fMin, length);
            fMax = C11194j.m42188f(fMax, length);
        }
        if (fMin < 0.0f) {
            fMin = C11194j.m42188f(fMin, length);
        }
        if (fMax < 0.0f) {
            fMax = C11194j.m42188f(fMax, length);
        }
        if (fMin == fMax) {
            path.reset();
            if (C5444e.m24929h()) {
                C5444e.m24924c("applyTrimPathIfNeeded");
                return;
            }
            return;
        }
        if (fMin >= fMax) {
            fMin -= length;
        }
        path2.reset();
        pathMeasure.getSegment(fMin, fMax, path2, true);
        if (fMax > length) {
            path3.reset();
            pathMeasure.getSegment(0.0f, fMax % length, path3, true);
            path2.addPath(path3);
        } else if (fMin < 0.0f) {
            path3.reset();
            pathMeasure.getSegment(fMin + length, length, path3, true);
            path2.addPath(path3);
        }
        path.set(path2);
        if (C5444e.m24929h()) {
            C5444e.m24924c("applyTrimPathIfNeeded");
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m42213b(Path path, C6314u c6314u) {
        if (c6314u == null || c6314u.m27621l()) {
            return;
        }
        m42212a(path, ((C6646d) c6314u.m27619j()).m28693r() / 100.0f, ((C6646d) c6314u.m27617f()).m28693r() / 100.0f, ((C6646d) c6314u.m27618h()).m28693r() / 360.0f);
    }

    /* JADX INFO: renamed from: c */
    public static void m42214c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static Path m42215d(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
            return path;
        }
        float f10 = pointF.x + pointF3.x;
        float f11 = pointF.y + pointF3.y;
        float f12 = pointF2.x;
        float f13 = f12 + pointF4.x;
        float f14 = pointF2.y;
        path.cubicTo(f10, f11, f13, f14 + pointF4.y, f12, f14);
        return path;
    }

    /* JADX INFO: renamed from: e */
    public static float m42216e() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: f */
    public static float m42217f(@NonNull Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    /* JADX INFO: renamed from: g */
    public static float m42218g(Matrix matrix) {
        float[] fArr = f39528e.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f10 = f39529f;
        fArr[2] = f10;
        fArr[3] = f10;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m42219h(Matrix matrix) {
        float[] fArr = f39528e.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    /* JADX INFO: renamed from: i */
    public static int m42220i(float f10, float f11, float f12, float f13) {
        int i10 = f10 != 0.0f ? (int) (527 * f10) : 17;
        if (f11 != 0.0f) {
            i10 = (int) (i10 * 31 * f11);
        }
        if (f12 != 0.0f) {
            i10 = (int) (i10 * 31 * f12);
        }
        return f13 != 0.0f ? (int) (i10 * 31 * f13) : i10;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m42221j(int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i10 < i13) {
            return false;
        }
        if (i10 > i13) {
            return true;
        }
        if (i11 < i14) {
            return false;
        }
        return i11 > i14 || i12 >= i15;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m42222k(Throwable th2) {
        return (th2 instanceof SocketException) || (th2 instanceof ClosedChannelException) || (th2 instanceof InterruptedIOException) || (th2 instanceof ProtocolException) || (th2 instanceof SSLException) || (th2 instanceof UnknownHostException) || (th2 instanceof UnknownServiceException);
    }

    /* JADX INFO: renamed from: l */
    public static int m42223l(int i10, int i11) {
        return (int) ((((i10 / 255.0f) * i11) / 255.0f) * 255.0f);
    }

    /* JADX INFO: renamed from: m */
    public static Bitmap m42224m(@NonNull Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i11, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    /* JADX INFO: renamed from: n */
    public static void m42225n(Canvas canvas, RectF rectF, Paint paint) {
        m42226o(canvas, rectF, paint, 31);
    }

    /* JADX INFO: renamed from: o */
    public static void m42226o(Canvas canvas, RectF rectF, Paint paint, int i10) {
        if (C5444e.m24929h()) {
            C5444e.m24923b("Utils#saveLayer");
        }
        canvas.saveLayer(rectF, paint);
        if (C5444e.m24929h()) {
            C5444e.m24924c("Utils#saveLayer");
        }
    }
}
