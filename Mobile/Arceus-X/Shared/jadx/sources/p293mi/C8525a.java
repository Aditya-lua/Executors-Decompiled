package p293mi;

import android.graphics.Rect;
import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.C0625o0;
import androidx.core.view.InterfaceC0644y;
import androidx.core.view.WindowInsetsCompat;
import androidx.p616lifecycle.AbstractC0940a0;
import androidx.p616lifecycle.C0949d0;
import th.C11659h;

/* JADX INFO: renamed from: mi.a */
/* JADX INFO: loaded from: classes2.dex */
public class C8525a implements InterfaceC0644y {

    /* JADX INFO: renamed from: a */
    public C0949d0<Rect> f31319a = new C0949d0<>();

    /* JADX INFO: renamed from: b */
    public C0949d0<Rect> f31320b = new C0949d0<>();

    /* JADX INFO: renamed from: c */
    public C0949d0<Rect> f31321c = new C0949d0<>();

    @Override // androidx.core.view.InterfaceC0644y
    /* JADX INFO: renamed from: K */
    public WindowInsetsCompat mo460K(View view, WindowInsetsCompat windowInsetsCompat) {
        Rect rect = new Rect();
        if (C11659h.m43403a().mo43745w1()) {
            Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime() | WindowInsetsCompat.Type.displayCutout());
            rect.set(insets.left, insets.top, insets.right, insets.bottom);
        } else {
            rect.top = windowInsetsCompat.getSystemWindowInsetTop();
            rect.left = windowInsetsCompat.getSystemWindowInsetLeft();
            rect.right = windowInsetsCompat.getSystemWindowInsetRight();
            rect.bottom = windowInsetsCompat.getSystemWindowInsetBottom();
        }
        this.f31319a.mo4863o(rect);
        if (C11659h.m43403a().mo43571Y0()) {
            Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
            Rect rect2 = new Rect();
            rect2.left = insets2.left;
            rect2.top = insets2.top;
            rect2.right = insets2.right;
            rect2.bottom = insets2.bottom;
            this.f31321c.mo4863o(rect2);
        }
        Insets insets3 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.displayCutout());
        Rect rect3 = new Rect();
        rect3.left = insets3.left;
        rect3.top = insets3.top;
        rect3.right = insets3.right;
        rect3.bottom = insets3.bottom;
        this.f31320b.mo4863o(rect3);
        return windowInsetsCompat;
    }

    /* JADX INFO: renamed from: a */
    public AbstractC0940a0<Rect> m34389a() {
        return this.f31320b;
    }

    /* JADX INFO: renamed from: b */
    public C0949d0<Rect> m34390b() {
        return this.f31319a;
    }

    /* JADX INFO: renamed from: c */
    public Rect m34391c() {
        return this.f31319a.mo4854f();
    }

    /* JADX INFO: renamed from: d */
    public AbstractC0940a0<Rect> m34392d() {
        return this.f31321c;
    }

    /* JADX INFO: renamed from: e */
    public void m34393e(View view) {
        C0625o0.m2979A0(view, this);
    }
}
