package sn;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.Image;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.common.InputImage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lsn/l0;", BuildConfig.FLAVOR, "Landroid/graphics/Rect;", "cropRect", "Landroid/graphics/Bitmap;", "b", "(Landroid/graphics/Rect;)Landroid/graphics/Bitmap;", "Landroid/media/Image;", "q", "()Landroid/media/Image;", "image", "Lcom/google/mlkit/vision/common/InputImage;", "c", "()Lcom/google/mlkit/vision/common/InputImage;", "inputImage", "a", "()Landroid/graphics/Bitmap;", "bitmap", BuildConfig.FLAVOR, "getWidth", "()I", "width", "getHeight", "height", "d", "rotationDegrees", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface l0 {
    @Nullable
    Bitmap a();

    @Nullable
    Bitmap b(@NotNull Rect cropRect);

    @NotNull
    InputImage c();

    int d();

    int getHeight();

    int getWidth();

    @NotNull
    Image q();
}
