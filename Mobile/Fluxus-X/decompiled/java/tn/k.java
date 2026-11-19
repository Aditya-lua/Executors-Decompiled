package tn;

import android.graphics.Rect;
import android.media.Image;
import android.util.Size;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import sn.ImageLightCondition;
import sn.l0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0015\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010 \u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u00182\b\b\u0002\u0010\u001f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R\u001a\u0010)\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Ltn/k;", "Ltn/e;", "<init>", "()V", "Lsn/l0;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "Lzt/n;", "Ltn/a;", "a", "(Lsn/l0;Landroid/graphics/Rect;Leu/b;)Ljava/lang/Object;", "Lsn/k0;", "b", "(Lsn/l0;Landroid/graphics/Rect;)Lsn/k0;", "Ljava/nio/ByteBuffer;", "yPlaneBuffer", BuildConfig.FLAVOR, "imageWidth", "imageHeight", "region", "c", "(Ljava/nio/ByteBuffer;IILandroid/graphics/Rect;)Lsn/k0;", "averageLuma", BuildConfig.FLAVOR, "f", "(Ljava/nio/ByteBuffer;IILandroid/graphics/Rect;)D", BuildConfig.FLAVOR, "histogram", "sampleSize", "lowerPercentile", "higherPercentile", "d", "([JIDD)I", BuildConfig.FLAVOR, "[B", "byteArr", "Landroid/util/Size;", "Landroid/util/Size;", "getPreferredImageSize", "()Landroid/util/Size;", "preferredImageSize", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] byteArr = new byte[32768];

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Size preferredImageSize = new Size(0, 0);

    public static /* synthetic */ int e(k kVar, long[] jArr, int i10, double d10, double d11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            d10 = 1.0d;
        }
        double d12 = d10;
        if ((i11 & 8) != 0) {
            d11 = 99.0d;
        }
        return kVar.d(jArr, i10, d12, d11);
    }

    @Override // tn.e
    @Nullable
    public Object a(@NotNull l0 l0Var, @Nullable Rect rect, @NotNull eu.b<? super zt.n<? extends a>> bVar) {
        ImageLightCondition imageLightConditionB = b(l0Var, rect);
        if (imageLightConditionB == null) {
            zt.n.Companion companion = zt.n.INSTANCE;
            return zt.n.b(a.b.f32571a);
        }
        zt.n.Companion companion2 = zt.n.INSTANCE;
        return zt.n.b(new a.e(imageLightConditionB));
    }

    @Nullable
    public final ImageLightCondition b(@NotNull l0 image, @Nullable Rect viewfinderRect) {
        Image.Plane plane;
        Intrinsics.checkNotNullParameter(image, "image");
        int width = image.q().getWidth();
        int height = image.q().getHeight();
        Image.Plane[] planes = image.q().getPlanes();
        if (planes == null || (plane = planes[0]) == null) {
            return null;
        }
        if (viewfinderRect == null) {
            viewfinderRect = new Rect(0, 0, width, height);
        }
        ByteBuffer buffer = plane.getBuffer();
        Intrinsics.checkNotNullExpressionValue(buffer, "getBuffer(...)");
        ImageLightCondition imageLightConditionC = c(buffer, width, height, viewfinderRect);
        if (imageLightConditionC == null) {
            return null;
        }
        return imageLightConditionC;
    }

    public final ImageLightCondition c(ByteBuffer yPlaneBuffer, int imageWidth, int imageHeight, Rect region) {
        if (imageWidth == 0 || imageHeight == 0) {
            return null;
        }
        long[] jArr = new long[Barcode.FORMAT_QR_CODE];
        yPlaneBuffer.rewind();
        int iWidth = region.width() * region.height();
        int iWidth2 = region.width();
        if (iWidth2 > 32768) {
            return null;
        }
        int i10 = region.bottom;
        long j10 = 0;
        for (int i11 = region.top; i11 < i10; i11++) {
            yPlaneBuffer.position((i11 * imageWidth) + region.left);
            yPlaneBuffer.get(this.byteArr, 0, iWidth2);
            for (int i12 = 0; i12 < iWidth2; i12++) {
                int i13 = this.byteArr[i12] & 255;
                j10 += (long) i13;
                jArr[i13] = jArr[i13] + 1;
            }
        }
        double d10 = j10 / ((double) iWidth);
        return new ImageLightCondition(d10 / 255.0d, f(yPlaneBuffer, imageWidth, (int) d10, region), ((double) e(this, jArr, iWidth, 0.0d, 0.0d, 12, null)) / 255.0d, iWidth);
    }

    public final int d(long[] histogram, int sampleSize, double lowerPercentile, double higherPercentile) {
        double d10 = 100;
        double d11 = sampleSize;
        double dFloor = Math.floor((lowerPercentile / d10) * d11);
        double dFloor2 = Math.floor((higherPercentile / d10) * d11);
        int length = histogram.length;
        int i10 = 0;
        long j10 = 0;
        int i11 = 0;
        long j11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = 0;
                break;
            }
            j11 += histogram[i11];
            if (j11 > dFloor) {
                break;
            }
            i11++;
        }
        double d12 = d11 - dFloor2;
        int length2 = histogram.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i12 = length2 - 1;
                j10 += histogram[length2];
                if (j10 > d12) {
                    i10 = length2;
                    break;
                }
                if (i12 < 0) {
                    break;
                }
                length2 = i12;
            }
        }
        return i10 - i11;
    }

    public final double f(ByteBuffer yPlaneBuffer, int imageWidth, int averageLuma, Rect region) {
        int iWidth = region.width() * region.height();
        int iWidth2 = region.width();
        int i10 = region.bottom;
        long j10 = 0;
        for (int i11 = region.top; i11 < i10; i11++) {
            yPlaneBuffer.position((i11 * imageWidth) + region.left);
            yPlaneBuffer.get(this.byteArr, 0, iWidth2);
            for (int i12 = 0; i12 < iWidth2; i12++) {
                int i13 = (this.byteArr[i12] & 255) - averageLuma;
                j10 += (long) (i13 * i13);
            }
        }
        return Math.sqrt(j10 / ((double) iWidth)) / 128.0d;
    }
}
