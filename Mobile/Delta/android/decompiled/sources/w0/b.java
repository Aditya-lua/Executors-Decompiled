package w0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.ImageProcessingUtil;
import g0.r1;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import p0.i;
import p0.j;
import x2.g;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    public static final class a extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EnumC0613a f33579a;

        /* JADX INFO: renamed from: w0.b$a$a, reason: collision with other inner class name */
        public enum EnumC0613a {
            ENCODE_FAILED,
            DECODE_FAILED,
            UNKNOWN
        }

        public a(String str, EnumC0613a enumC0613a) {
            super(str);
            this.f33579a = enumC0613a;
        }
    }

    public static Rect a(Size size, Rational rational) {
        int i10;
        if (!i(rational)) {
            r1.l("ImageUtil", "Invalid view ratio.");
            return null;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        float f10 = width;
        float f11 = height;
        float f12 = f10 / f11;
        int numerator = rational.getNumerator();
        int denominator = rational.getDenominator();
        int i11 = 0;
        if (rational.floatValue() > f12) {
            int iRound = Math.round((f10 / numerator) * denominator);
            i10 = (height - iRound) / 2;
            height = iRound;
        } else {
            int iRound2 = Math.round((f11 / denominator) * numerator);
            int i12 = (width - iRound2) / 2;
            width = iRound2;
            i10 = 0;
            i11 = i12;
        }
        return new Rect(i11, i10, width + i11, height + i10);
    }

    public static Bitmap b(androidx.camera.core.d dVar) {
        int format = dVar.getFormat();
        if (format == 1) {
            return e(dVar);
        }
        if (format == 35) {
            return ImageProcessingUtil.f(dVar);
        }
        if (format == 256 || format == 4101) {
            return c(dVar);
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + dVar.getFormat() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
    }

    public static Bitmap c(androidx.camera.core.d dVar) {
        byte[] bArrL = l(dVar);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrL, 0, bArrL.length, null);
        if (bitmapDecodeByteArray != null) {
            return bitmapDecodeByteArray;
        }
        throw new UnsupportedOperationException("Decode jpeg byte array failed");
    }

    public static Bitmap d(androidx.camera.core.d.a[] aVarArr, int i10, int i11) {
        g.b(aVarArr.length == 1, "Expect a single plane");
        g.b(aVarArr[0].m() == 4, "Expect pixelStride=4");
        g.b(aVarArr[0].l() == i10 * 4, "Expect rowStride=width*4");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        aVarArr[0].k().rewind();
        ImageProcessingUtil.j(bitmapCreateBitmap, aVarArr[0].k(), aVarArr[0].l());
        return bitmapCreateBitmap;
    }

    public static Bitmap e(androidx.camera.core.d dVar) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dVar.getWidth(), dVar.getHeight(), Bitmap.Config.ARGB_8888);
        dVar.H1()[0].k().rewind();
        ImageProcessingUtil.j(bitmapCreateBitmap, dVar.H1()[0].k(), dVar.H1()[0].l());
        return bitmapCreateBitmap;
    }

    public static ByteBuffer f(Bitmap bitmap) {
        g.b(bitmap.getConfig() == Bitmap.Config.ARGB_8888, "Only accept Bitmap with ARGB_8888 format for now.");
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bitmap.getAllocationByteCount());
        ImageProcessingUtil.i(bitmap, byteBufferAllocateDirect, bitmap.getRowBytes());
        byteBufferAllocateDirect.rewind();
        return byteBufferAllocateDirect;
    }

    public static Rational g(int i10, Rational rational) {
        return (i10 == 90 || i10 == 270) ? h(rational) : new Rational(rational.getNumerator(), rational.getDenominator());
    }

    public static Rational h(Rational rational) {
        return rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator());
    }

    public static boolean i(Rational rational) {
        return (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) ? false : true;
    }

    public static boolean j(int i10) {
        return i10 == 256 || i10 == 4101;
    }

    public static boolean k(int i10) {
        return i10 == 32;
    }

    public static byte[] l(androidx.camera.core.d dVar) {
        if (!j(dVar.getFormat())) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + dVar.getFormat());
        }
        ByteBuffer byteBufferK = dVar.H1()[0].k();
        byte[] bArr = new byte[byteBufferK.capacity()];
        byteBufferK.rewind();
        byteBufferK.get(bArr);
        return bArr;
    }

    public static Bitmap m(Bitmap bitmap, int i10) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i10);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static byte[] n(androidx.camera.core.d dVar, Rect rect, int i10, int i11) throws a {
        if (dVar.getFormat() != 35) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + dVar.getFormat());
        }
        YuvImage yuvImage = new YuvImage(o(dVar), 17, dVar.getWidth(), dVar.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        j jVar = new j(byteArrayOutputStream, i.c(dVar, i11));
        if (rect == null) {
            rect = new Rect(0, 0, dVar.getWidth(), dVar.getHeight());
        }
        if (yuvImage.compressToJpeg(rect, i10, jVar)) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new a("YuvImage failed to encode jpeg.", a.EnumC0613a.ENCODE_FAILED);
    }

    public static byte[] o(androidx.camera.core.d dVar) {
        androidx.camera.core.d.a aVar = dVar.H1()[0];
        androidx.camera.core.d.a aVar2 = dVar.H1()[1];
        androidx.camera.core.d.a aVar3 = dVar.H1()[2];
        ByteBuffer byteBufferK = aVar.k();
        ByteBuffer byteBufferK2 = aVar2.k();
        ByteBuffer byteBufferK3 = aVar3.k();
        byteBufferK.rewind();
        byteBufferK2.rewind();
        byteBufferK3.rewind();
        int iRemaining = byteBufferK.remaining();
        byte[] bArr = new byte[((dVar.getWidth() * dVar.getHeight()) / 2) + iRemaining];
        int width = 0;
        for (int i10 = 0; i10 < dVar.getHeight(); i10++) {
            byteBufferK.get(bArr, width, dVar.getWidth());
            width += dVar.getWidth();
            byteBufferK.position(Math.min(iRemaining, (byteBufferK.position() - dVar.getWidth()) + aVar.l()));
        }
        int height = dVar.getHeight() / 2;
        int width2 = dVar.getWidth() / 2;
        int iL = aVar3.l();
        int iL2 = aVar2.l();
        int iM = aVar3.m();
        int iM2 = aVar2.m();
        byte[] bArr2 = new byte[iL];
        byte[] bArr3 = new byte[iL2];
        for (int i11 = 0; i11 < height; i11++) {
            byteBufferK3.get(bArr2, 0, Math.min(iL, byteBufferK3.remaining()));
            byteBufferK2.get(bArr3, 0, Math.min(iL2, byteBufferK2.remaining()));
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < width2; i14++) {
                int i15 = width + 1;
                bArr[width] = bArr2[i12];
                width += 2;
                bArr[i15] = bArr3[i13];
                i12 += iM;
                i13 += iM2;
            }
        }
        return bArr;
    }
}
