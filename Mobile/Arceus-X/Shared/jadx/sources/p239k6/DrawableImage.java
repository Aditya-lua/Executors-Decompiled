package p239k6;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p096e7.C4863i0;

/* JADX INFO: renamed from: k6.i, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0014R\u0014\u0010%\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0014¨\u0006&"}, m31665d2 = {"Lk6/i;", "Lk6/n;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "shareable", "<init>", "(Landroid/graphics/drawable/Drawable;Z)V", "Landroid/graphics/Canvas;", "Lcoil3/Canvas;", "canvas", "", "b", "(Landroid/graphics/Canvas;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Landroid/graphics/drawable/Drawable;", "c", "()Landroid/graphics/drawable/Drawable;", "Z", "()Z", "", "i", "()J", "size", "getWidth", "width", "getHeight", "height", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class DrawableImage implements InterfaceC7474n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final Drawable drawable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean shareable;

    /* JADX INFO: renamed from: k6.i$a */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m31665d2 = {"Lk6/i$a;", "", "", "i", "()J", "size", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface a {
        /* JADX INFO: renamed from: i */
        long m31021i();
    }

    public DrawableImage(@NotNull Drawable drawable, boolean z10) {
        this.drawable = drawable;
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
        return Intrinsics.m31980c(this.drawable, drawableImage.drawable) && this.shareable == drawableImage.shareable;
    }

    @Override // p239k6.InterfaceC7474n
    public int getHeight() {
        return C4863i0.m23456b(this.drawable);
    }

    @Override // p239k6.InterfaceC7474n
    public int getWidth() {
        return C4863i0.m23461g(this.drawable);
    }

    public int hashCode() {
        return (this.drawable.hashCode() * 31) + Boolean.hashCode(this.shareable);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: android.graphics.drawable.Drawable */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p239k6.InterfaceC7474n
    /* JADX INFO: renamed from: i */
    public long mo30971i() {
        Drawable drawable = this.drawable;
        return C7764d.m32079d(drawable instanceof a ? ((a) drawable).m31021i() : ((long) C4863i0.m23461g(drawable)) * 4 * ((long) C4863i0.m23456b(this.drawable)), 0L);
    }

    @NotNull
    public String toString() {
        return "DrawableImage(drawable=" + this.drawable + ", shareable=" + this.shareable + ')';
    }
}
