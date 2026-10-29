package gn;

import android.graphics.Rect;
import android.media.Image;
import android.util.Size;
import com.withpersona.sdk2.camera.ImageLightCondition;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p132fn.InterfaceC5719z;
import p229jt.C7347n;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: gn.k */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0015\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010 \u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u00182\b\b\u0002\u0010\u001f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R\u001a\u0010)\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, m31665d2 = {"Lgn/k;", "Lgn/e;", "<init>", "()V", "Lfn/z;", "image", "Landroid/graphics/Rect;", "viewfinderRect", "Ljt/n;", "Lgn/a;", "a", "(Lfn/z;Landroid/graphics/Rect;Lnt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/camera/ImageLightCondition;", "b", "(Lfn/z;Landroid/graphics/Rect;)Lcom/withpersona/sdk2/camera/ImageLightCondition;", "Ljava/nio/ByteBuffer;", "yPlaneBuffer", "", "imageWidth", "imageHeight", "region", "c", "(Ljava/nio/ByteBuffer;IILandroid/graphics/Rect;)Lcom/withpersona/sdk2/camera/ImageLightCondition;", "averageLuma", "", "f", "(Ljava/nio/ByteBuffer;IILandroid/graphics/Rect;)D", "", "histogram", "sampleSize", "lowerPercentile", "higherPercentile", "d", "([JIDD)I", "", "[B", "byteArr", "Landroid/util/Size;", "Landroid/util/Size;", "getPreferredImageSize", "()Landroid/util/Size;", "preferredImageSize", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6147k implements InterfaceC6141e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final byte[] byteArr = new byte[32768];

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Size preferredImageSize = new Size(0, 0);

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m27135e(C6147k c6147k, long[] jArr, int i10, double d10, double d11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            d10 = 1.0d;
        }
        double d12 = d10;
        if ((i11 & 8) != 0) {
            d11 = 99.0d;
        }
        return c6147k.m27138d(jArr, i10, d12, d11);
    }

    @Override // gn.InterfaceC6141e
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo27125a(@NotNull InterfaceC5719z interfaceC5719z, @Nullable Rect rect, @NotNull InterfaceC9557b<? super C7347n<? extends AbstractC6137a>> interfaceC9557b) {
        ImageLightCondition imageLightConditionM27136b = m27136b(interfaceC5719z, rect);
        if (imageLightConditionM27136b == null) {
            C7347n.Companion companion = C7347n.INSTANCE;
            return C7347n.m30460b(AbstractC6137a.b.f23474a);
        }
        C7347n.Companion companion2 = C7347n.INSTANCE;
        return C7347n.m30460b(new AbstractC6137a.e(imageLightConditionM27136b));
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final ImageLightCondition m27136b(@NotNull InterfaceC5719z image, @Nullable Rect viewfinderRect) {
        Image.Plane plane;
        Intrinsics.checkNotNullParameter(image, "image");
        int width = image.mo25783p().getWidth();
        int height = image.mo25783p().getHeight();
        Image.Plane[] planes = image.mo25783p().getPlanes();
        if (planes == null || (plane = planes[0]) == null) {
            return null;
        }
        if (viewfinderRect == null) {
            viewfinderRect = new Rect(0, 0, width, height);
        }
        ByteBuffer buffer = plane.getBuffer();
        Intrinsics.checkNotNullExpressionValue(buffer, "getBuffer(...)");
        ImageLightCondition imageLightConditionM27137c = m27137c(buffer, width, height, viewfinderRect);
        if (imageLightConditionM27137c == null) {
            return null;
        }
        return imageLightConditionM27137c;
    }

    /* JADX INFO: renamed from: c */
    public final ImageLightCondition m27137c(ByteBuffer yPlaneBuffer, int imageWidth, int imageHeight, Rect region) {
        if (imageWidth == 0 || imageHeight == 0) {
            return null;
        }
        long[] jArr = new long[256];
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
        return new ImageLightCondition(d10 / 255.0d, m27139f(yPlaneBuffer, imageWidth, (int) d10, region), ((double) m27135e(this, jArr, iWidth, 0.0d, 0.0d, 12, null)) / 255.0d, iWidth);
    }

    /* JADX INFO: renamed from: d */
    public final int m27138d(long[] histogram, int sampleSize, double lowerPercentile, double higherPercentile) {
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

    /* JADX INFO: renamed from: f */
    public final double m27139f(ByteBuffer yPlaneBuffer, int imageWidth, int averageLuma, Rect region) {
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
