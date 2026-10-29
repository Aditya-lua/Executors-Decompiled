package k6;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: k6.i, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0014R\u0014\u0010%\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0014¨\u0006&"}, d2 = {"Lk6/i;", "Lk6/n;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "shareable", "<init>", "(Landroid/graphics/drawable/Drawable;Z)V", "Landroid/graphics/Canvas;", "Lcoil3/Canvas;", "canvas", "", "b", "(Landroid/graphics/Canvas;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Landroid/graphics/drawable/Drawable;", "c", "()Landroid/graphics/drawable/Drawable;", "Z", "()Z", "", "i", "()J", "size", "getWidth", "width", "getHeight", "height", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DrawableImage implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Drawable drawable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean shareable;

    /* JADX INFO: renamed from: k6.i$a */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lk6/i$a;", "", "", "i", "()J", "size", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        long i();
    }

    public DrawableImage(@NotNull Drawable drawable, boolean z10) {
        this.drawable = drawable;
        this.shareable = z10;
    }

    @Override // k6.n
    /* JADX INFO: renamed from: a, reason: from getter */
    public boolean getShareable() {
        return this.shareable;
    }

    @Override // k6.n
    public void b(@NotNull Canvas canvas) {
        this.drawable.draw(canvas);
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Drawable getDrawable() {
        return this.drawable;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DrawableImage)) {
            return false;
        }
        DrawableImage drawableImage = (DrawableImage) other;
        return Intrinsics.c(this.drawable, drawableImage.drawable) && this.shareable == drawableImage.shareable;
    }

    @Override // k6.n
    public int getHeight() {
        return e7.i0.b(this.drawable);
    }

    @Override // k6.n
    public int getWidth() {
        return e7.i0.g(this.drawable);
    }

    public int hashCode() {
        return (this.drawable.hashCode() * 31) + Boolean.hashCode(this.shareable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k6.n
    public long i() {
        Drawable drawable = this.drawable;
        return kotlin.ranges.d.d(drawable instanceof a ? ((a) drawable).i() : ((long) e7.i0.g(drawable)) * 4 * ((long) e7.i0.b(this.drawable)), 0L);
    }

    @NotNull
    public String toString() {
        return "DrawableImage(drawable=" + this.drawable + ", shareable=" + this.shareable + ')';
    }
}
