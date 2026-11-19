package p6;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import f7.i0;
import l6.s;
import l6.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import y6.Options;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lp6/h;", "Lp6/j;", "Landroid/graphics/drawable/Drawable;", "data", "Ly6/p;", "options", "<init>", "(Landroid/graphics/drawable/Drawable;Ly6/p;)V", "Lp6/i;", "a", "(Leu/b;)Ljava/lang/Object;", "Landroid/graphics/drawable/Drawable;", "b", "Ly6/p;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Drawable data;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Options options;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lp6/h$a;", "Lp6/j$a;", "Landroid/graphics/drawable/Drawable;", "<init>", "()V", "data", "Ly6/p;", "options", "Ll6/s;", "imageLoader", "Lp6/j;", "b", "(Landroid/graphics/drawable/Drawable;Ly6/p;Ll6/s;)Lp6/j;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements j.a<Drawable> {
        @Override // p6.j.a
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(@NotNull Drawable data, @NotNull Options options, @NotNull s imageLoader) {
            return new h(data, options);
        }
    }

    public h(@NotNull Drawable drawable, @NotNull Options options) {
        this.data = drawable;
        this.options = options;
    }

    @Override // p6.j
    @Nullable
    public Object a(@NotNull eu.b<? super i> bVar) {
        Drawable bitmapDrawable;
        boolean zJ = i0.j(this.data);
        if (zJ) {
            bitmapDrawable = new BitmapDrawable(this.options.getContext().getResources(), f7.i.f15646a.a(this.data, y6.j.j(this.options), this.options.getSize(), this.options.getScale(), this.options.getPrecision() == z6.c.INEXACT));
        } else {
            bitmapDrawable = this.data;
        }
        return new ImageFetchResult(v.c(bitmapDrawable), zJ, n6.f.MEMORY);
    }
}
