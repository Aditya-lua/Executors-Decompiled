package q;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public interface f0 {
    boolean a();

    boolean b();

    boolean c();

    void collapseActionView();

    void d(Menu menu, androidx.appcompat.view.menu.i.a aVar);

    boolean e();

    void f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    boolean h();

    void i(int i10);

    int j();

    androidx.core.view.y0 k(int i10, long j10);

    void l(boolean z10);

    void m();

    void n(boolean z10);

    void o();

    void p(androidx.appcompat.widget.c cVar);

    void q(int i10);

    void r(int i10);

    int s();

    void setIcon(int i10);

    void setIcon(Drawable drawable);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t();
}
