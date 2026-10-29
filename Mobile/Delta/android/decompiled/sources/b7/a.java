package b7;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.p000lifecycle.f;
import androidx.p000lifecycle.s;
import d7.e;
import k6.n;
import k6.v;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\bH\u0004¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0018\u001a\u00020\nH\u0004¢\u0006\u0004\b\u0018\u0010\u0007R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u001e\u0010!\u001a\u0004\u0018\u00010\u001c8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lb7/a;", "Landroid/view/View;", "T", "Lb7/d;", "Ld7/e;", "Landroidx/lifecycle/f;", "<init>", "()V", "Lk6/n;", "placeholder", "", "b", "(Lk6/n;)V", "error", "a", "result", "c", "Landroidx/lifecycle/s;", "owner", "onStart", "(Landroidx/lifecycle/s;)V", "onStop", "image", "h", "f", "", "Z", "isStarted", "Landroid/graphics/drawable/Drawable;", "d", "()Landroid/graphics/drawable/Drawable;", "e", "(Landroid/graphics/drawable/Drawable;)V", "drawable", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a<T extends View> implements d<T>, e, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean isStarted;

    @Override // b7.c
    public void a(@Nullable n error) {
        h(error);
    }

    @Override // b7.c
    public void b(@Nullable n placeholder) {
        h(placeholder);
    }

    @Override // b7.c
    public void c(@NotNull n result) {
        h(result);
    }

    @Override // d7.e
    @Nullable
    public abstract Drawable d();

    public abstract void e(@Nullable Drawable drawable);

    public final void f() {
        Object objD = d();
        Animatable animatable = objD instanceof Animatable ? (Animatable) objD : null;
        if (animatable == null) {
            return;
        }
        if (this.isStarted) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    public final void h(@Nullable n image) {
        Drawable drawableA = image != null ? v.a(image, getView().getResources()) : null;
        Object objD = d();
        Animatable animatable = objD instanceof Animatable ? (Animatable) objD : null;
        if (animatable != null) {
            animatable.stop();
        }
        e(drawableA);
        f();
    }

    @Override // androidx.p000lifecycle.f
    public void onStart(@NotNull s owner) {
        this.isStarted = true;
        f();
    }

    @Override // androidx.p000lifecycle.f
    public void onStop(@NotNull s owner) {
        this.isStarted = false;
        f();
    }
}
