package p239k6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p096e7.C4848b;

/* JADX INFO: renamed from: k6.a, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0014R\u0014\u0010%\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0014¨\u0006&"}, m31665d2 = {"Lk6/a;", "Lk6/n;", "Landroid/graphics/Bitmap;", "bitmap", "", "shareable", "<init>", "(Landroid/graphics/Bitmap;Z)V", "Landroid/graphics/Canvas;", "Lcoil3/Canvas;", "canvas", "", "b", "(Landroid/graphics/Canvas;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Landroid/graphics/Bitmap;", "c", "()Landroid/graphics/Bitmap;", "Z", "()Z", "", "i", "()J", "size", "getWidth", "width", "getHeight", "height", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class BitmapImage implements InterfaceC7474n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final Bitmap bitmap;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean shareable;

    public BitmapImage(@NotNull Bitmap bitmap, boolean z10) {
        this.bitmap = bitmap;
        this.shareable = z10;
    }

    @Override // p239k6.InterfaceC7474n
    /* JADX INFO: renamed from: a, reason: from getter */
    public boolean getShareable() {
        return this.shareable;
    }

    @Override // p239k6.InterfaceC7474n
    /* JADX INFO: renamed from: b */
    public void mo30969b(@NotNull Canvas canvas) {
        canvas.drawBitmap(this.bitmap, 0.0f, 0.0f, (Paint) null);
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BitmapImage)) {
            return false;
        }
        BitmapImage bitmapImage = (BitmapImage) other;
        return Intrinsics.m31980c(this.bitmap, bitmapImage.bitmap) && this.shareable == bitmapImage.shareable;
    }

    @Override // p239k6.InterfaceC7474n
    public int getHeight() {
        return this.bitmap.getHeight();
    }

    @Override // p239k6.InterfaceC7474n
    public int getWidth() {
        return this.bitmap.getWidth();
    }

    public int hashCode() {
        return (this.bitmap.hashCode() * 31) + Boolean.hashCode(this.shareable);
    }

    @Override // p239k6.InterfaceC7474n
    /* JADX INFO: renamed from: i */
    public long mo30971i() {
        return C4848b.m23409a(this.bitmap);
    }

    @NotNull
    public String toString() {
        return "BitmapImage(bitmap=" + this.bitmap + ", shareable=" + this.shareable + ')';
    }
}
