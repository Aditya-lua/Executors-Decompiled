package p027b7;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.p616lifecycle.InterfaceC0954f;
import androidx.p616lifecycle.InterfaceC0980s;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p070d7.InterfaceC4468e;
import p239k6.C7482v;
import p239k6.InterfaceC7474n;

/* JADX INFO: renamed from: b7.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\bH\u0004¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0018\u001a\u00020\nH\u0004¢\u0006\u0004\b\u0018\u0010\u0007R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u001e\u0010!\u001a\u0004\u0018\u00010\u001c8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, m31665d2 = {"Lb7/a;", "Landroid/view/View;", "T", "Lb7/d;", "Ld7/e;", "Landroidx/lifecycle/f;", "<init>", "()V", "Lk6/n;", "placeholder", "", "b", "(Lk6/n;)V", "error", "a", "result", "c", "Landroidx/lifecycle/s;", "owner", "onStart", "(Landroidx/lifecycle/s;)V", "onStop", "image", "h", "f", "", "Z", "isStarted", "Landroid/graphics/drawable/Drawable;", "d", "()Landroid/graphics/drawable/Drawable;", "e", "(Landroid/graphics/drawable/Drawable;)V", "drawable", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class AbstractC1249a<T extends View> implements InterfaceC1252d<T>, InterfaceC4468e, InterfaceC0954f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean isStarted;

    @Override // p027b7.InterfaceC1251c
    /* JADX INFO: renamed from: a */
    public void mo6967a(@Nullable InterfaceC7474n error) {
        m6973h(error);
    }

    @Override // p027b7.InterfaceC1251c
    /* JADX INFO: renamed from: b */
    public void mo6968b(@Nullable InterfaceC7474n placeholder) {
        m6973h(placeholder);
    }

    @Override // p027b7.InterfaceC1251c
    /* JADX INFO: renamed from: c */
    public void mo6969c(@NotNull InterfaceC7474n result) {
        m6973h(result);
    }

    @Override // p070d7.InterfaceC4468e
    @Nullable
    /* JADX INFO: renamed from: d */
    public abstract Drawable mo6970d();

    /* JADX INFO: renamed from: e */
    public abstract void mo6971e(@Nullable Drawable drawable);

    /* JADX INFO: renamed from: f */
    public final void m6972f() {
        Object objMo6970d = mo6970d();
        Animatable animatable = objMo6970d instanceof Animatable ? (Animatable) objMo6970d : null;
        if (animatable == null) {
            return;
        }
        if (this.isStarted) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m6973h(@Nullable InterfaceC7474n image) {
        Drawable drawableM31086a = image != null ? C7482v.m31086a(image, getView().getResources()) : null;
        Object objMo6970d = mo6970d();
        Animatable animatable = objMo6970d instanceof Animatable ? (Animatable) objMo6970d : null;
        if (animatable != null) {
            animatable.stop();
        }
        mo6971e(drawableM31086a);
        m6972f();
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public void onStart(@NotNull InterfaceC0980s owner) {
        this.isStarted = true;
        m6972f();
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public void onStop(@NotNull InterfaceC0980s owner) {
        this.isStarted = false;
        m6972f();
    }
}
