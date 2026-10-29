package p287m6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c4.C1523a;
import p096e7.C4848b;
import p560xu.InterfaceC12928g;

/* JADX INFO: renamed from: m6.p */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013¨\u0006\u0015"}, m31665d2 = {"Lm6/p;", "", "<init>", "()V", "", "mimeType", "Lxu/g;", Payload.SOURCE, "Lm6/o;", "strategy", "Lm6/j;", "a", "(Ljava/lang/String;Lxu/g;Lm6/o;)Lm6/j;", "Landroid/graphics/Bitmap;", "inBitmap", "exifData", "b", "(Landroid/graphics/Bitmap;Lm6/j;)Landroid/graphics/Bitmap;", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paint", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8442p {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C8442p f31123a = new C8442p();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Paint paint = new Paint(3);

    @NotNull
    /* JADX INFO: renamed from: a */
    public final C8436j m34209a(@Nullable String mimeType, @NotNull InterfaceC12928g source, @NotNull InterfaceC8441o strategy) {
        if (!strategy.mo34202e(mimeType, source)) {
            return C8436j.f31113d;
        }
        C1523a c1523a = new C1523a(new C8437k(source.peek().mo48051s3()));
        return new C8436j(c1523a.m7970H(), c1523a.m8020w());
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Bitmap m34210b(@NotNull Bitmap inBitmap, @NotNull C8436j exifData) {
        if (!exifData.getIsFlipped() && !C8443q.m34211a(exifData)) {
            return inBitmap;
        }
        Matrix matrix = new Matrix();
        float width = inBitmap.getWidth() / 2.0f;
        float height = inBitmap.getHeight() / 2.0f;
        if (exifData.getIsFlipped()) {
            matrix.postScale(-1.0f, 1.0f, width, height);
        }
        if (C8443q.m34211a(exifData)) {
            matrix.postRotate(exifData.getRotationDegrees(), width, height);
        }
        RectF rectF = new RectF(0.0f, 0.0f, inBitmap.getWidth(), inBitmap.getHeight());
        matrix.mapRect(rectF);
        float f10 = rectF.left;
        if (f10 != 0.0f || rectF.top != 0.0f) {
            matrix.postTranslate(-f10, -rectF.top);
        }
        Bitmap bitmapCreateBitmap = C8443q.m34212b(exifData) ? Bitmap.createBitmap(inBitmap.getHeight(), inBitmap.getWidth(), C4848b.m23411c(inBitmap)) : Bitmap.createBitmap(inBitmap.getWidth(), inBitmap.getHeight(), C4848b.m23411c(inBitmap));
        new Canvas(bitmapCreateBitmap).drawBitmap(inBitmap, matrix, paint);
        inBitmap.recycle();
        return bitmapCreateBitmap;
    }
}
