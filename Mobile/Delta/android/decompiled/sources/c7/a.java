package c7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.Metadata;
import kotlin.jvm.internal.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y6.Size;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lc7/a;", "Lc7/c;", "<init>", "()V", "Landroid/graphics/Bitmap;", "input", "Ly6/g;", "size", "b", "(Landroid/graphics/Bitmap;Ly6/g;Lnt/b;)Ljava/lang/Object;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "cacheKey", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String cacheKey = String.valueOf(d0.b(a.class).f());

    @Override // c7.c
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getCacheKey() {
        return this.cacheKey;
    }

    @Override // c7.c
    @Nullable
    public Object b(@NotNull Bitmap bitmap, @NotNull Size size, @NotNull nt.b<? super Bitmap> bVar) {
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, e7.b.c(bitmap));
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paintA = d.a(bitmap, iMin, iMin);
        float f10 = iMin / 2.0f;
        canvas.drawCircle(f10, f10, f10, paintA);
        return bitmapCreateBitmap;
    }
}
