package in;

import android.media.Image;
import com.appsflyer.sdk_base.referrer.Payload;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ/\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u000f¨\u0006\u0014"}, d2 = {"Lin/g;", "", "<init>", "()V", "Landroid/media/Image;", Payload.SOURCE, "destination", "", "d", "(Landroid/media/Image;Landroid/media/Image;)V", "Landroid/media/Image$Plane;", "", "planeWidth", "planeHeight", "a", "(Landroid/media/Image$Plane;Landroid/media/Image$Plane;II)V", "c", "rowLength", "rowCount", "b", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f20583a = new g();

    public final void a(Image.Plane source, Image.Plane destination, int planeWidth, int planeHeight) {
        if (source.getPixelStride() == 1 && destination.getPixelStride() == 1) {
            b(source, destination, planeWidth, planeHeight);
        } else if (source.getPixelStride() == 2 && destination.getPixelStride() == 2) {
            b(source, destination, (planeWidth * 2) - 1, planeHeight);
        } else {
            c(source, destination, planeWidth, planeHeight);
        }
    }

    public final void b(Image.Plane source, Image.Plane destination, int rowLength, int rowCount) {
        ByteBuffer byteBufferDuplicate = source.getBuffer().duplicate();
        ByteBuffer byteBufferDuplicate2 = destination.getBuffer().duplicate();
        int iPosition = byteBufferDuplicate.position();
        int iPosition2 = byteBufferDuplicate2.position();
        if (source.getRowStride() == rowLength && destination.getRowStride() == rowLength) {
            byteBufferDuplicate.limit(iPosition + (rowLength * rowCount));
            byteBufferDuplicate2.put(byteBufferDuplicate);
            return;
        }
        for (int i10 = 0; i10 < rowCount; i10++) {
            int rowStride = (source.getRowStride() * i10) + iPosition;
            byteBufferDuplicate.limit(rowStride + rowLength);
            byteBufferDuplicate.position(rowStride);
            byteBufferDuplicate2.position((destination.getRowStride() * i10) + iPosition2);
            byteBufferDuplicate2.put(byteBufferDuplicate);
        }
    }

    public final void c(Image.Plane source, Image.Plane destination, int planeWidth, int planeHeight) {
        ByteBuffer byteBufferDuplicate = source.getBuffer().duplicate();
        ByteBuffer byteBufferDuplicate2 = destination.getBuffer().duplicate();
        int iPosition = byteBufferDuplicate.position();
        int iPosition2 = byteBufferDuplicate2.position();
        for (int i10 = 0; i10 < planeHeight; i10++) {
            int rowStride = (source.getRowStride() * i10) + iPosition;
            int rowStride2 = (destination.getRowStride() * i10) + iPosition2;
            for (int i11 = 0; i11 < planeWidth; i11++) {
                byteBufferDuplicate2.put(rowStride2, byteBufferDuplicate.get(rowStride));
                rowStride += source.getPixelStride();
                rowStride2 += destination.getPixelStride();
            }
        }
    }

    public final void d(@NotNull Image source, @NotNull Image destination) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        int width = source.getWidth() / 2;
        int height = source.getHeight() / 2;
        Image.Plane plane = source.getPlanes()[0];
        Intrinsics.checkNotNullExpressionValue(plane, "get(...)");
        Image.Plane plane2 = destination.getPlanes()[0];
        Intrinsics.checkNotNullExpressionValue(plane2, "get(...)");
        a(plane, plane2, source.getWidth(), source.getHeight());
        Image.Plane plane3 = source.getPlanes()[1];
        Intrinsics.checkNotNullExpressionValue(plane3, "get(...)");
        Image.Plane plane4 = destination.getPlanes()[1];
        Intrinsics.checkNotNullExpressionValue(plane4, "get(...)");
        a(plane3, plane4, width, height);
        Image.Plane plane5 = source.getPlanes()[2];
        Intrinsics.checkNotNullExpressionValue(plane5, "get(...)");
        Image.Plane plane6 = destination.getPlanes()[2];
        Intrinsics.checkNotNullExpressionValue(plane6, "get(...)");
        a(plane5, plane6, width, height);
    }
}
