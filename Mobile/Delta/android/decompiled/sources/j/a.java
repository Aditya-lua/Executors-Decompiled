package j;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    public interface b {
        void onMenuVisibilityChanged(boolean z10);
    }

    @Deprecated
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public abstract void h(boolean z10);

    public abstract int i();

    public abstract Context j();

    public abstract void k();

    public boolean l() {
        return false;
    }

    public abstract void m(Configuration configuration);

    public void n() {
    }

    public abstract boolean o(int i10, KeyEvent keyEvent);

    public boolean p(KeyEvent keyEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(boolean z10);

    public abstract void s(boolean z10);

    public abstract void t(CharSequence charSequence);

    public abstract o.b u(o.b.a aVar);

    /* JADX INFO: renamed from: j.a$a, reason: collision with other inner class name */
    public static class C0368a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20874a;

        public C0368a(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f20874a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j.f20112t);
            this.f20874a = typedArrayObtainStyledAttributes.getInt(i.j.f20117u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0368a(int i10, int i11) {
            super(i10, i11);
            this.f20874a = 8388627;
        }

        public C0368a(C0368a c0368a) {
            super((ViewGroup.MarginLayoutParams) c0368a);
            this.f20874a = 0;
            this.f20874a = c0368a.f20874a;
        }

        public C0368a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f20874a = 0;
        }
    }
}
