package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f794a;
    public final e b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f800h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i.a f801i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p.d f802j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f803k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PopupWindow.OnDismissListener f804l;

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            h.this.e();
        }
    }

    public h(@NonNull Context context, @NonNull e eVar, @NonNull View view, boolean z10, int i10) {
        this(context, eVar, view, z10, i10, 0);
    }

    @NonNull
    public final p.d a() {
        Display defaultDisplay = ((WindowManager) this.f794a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        p.d bVar = Math.min(point.x, point.y) >= this.f794a.getResources().getDimensionPixelSize(i.d.f18763c) ? new b(this.f794a, this.f798f, this.f796d, this.f797e, this.f795c) : new k(this.f794a, this.b, this.f798f, this.f796d, this.f797e, this.f795c);
        bVar.j(this.b);
        bVar.t(this.f804l);
        bVar.n(this.f798f);
        bVar.d(this.f801i);
        bVar.q(this.f800h);
        bVar.r(this.f799g);
        return bVar;
    }

    public void b() {
        if (d()) {
            this.f802j.dismiss();
        }
    }

    @NonNull
    public p.d c() {
        if (this.f802j == null) {
            this.f802j = a();
        }
        return this.f802j;
    }

    public boolean d() {
        p.d dVar = this.f802j;
        return dVar != null && dVar.a();
    }

    public void e() {
        this.f802j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f803k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(@NonNull View view) {
        this.f798f = view;
    }

    public void g(boolean z10) {
        this.f800h = z10;
        p.d dVar = this.f802j;
        if (dVar != null) {
            dVar.q(z10);
        }
    }

    public void h(int i10) {
        this.f799g = i10;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f803k = onDismissListener;
    }

    public void j(i.a aVar) {
        this.f801i = aVar;
        p.d dVar = this.f802j;
        if (dVar != null) {
            dVar.d(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public final void l(int i10, int i11, boolean z10, boolean z11) {
        p.d dVarC = c();
        dVarC.u(z11);
        if (z10) {
            if ((androidx.core.view.k.b(this.f799g, this.f798f.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f798f.getWidth();
            }
            dVarC.s(i10);
            dVarC.v(i11);
            int i12 = (int) ((this.f794a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            dVarC.p(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        dVarC.show();
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f798f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i10, int i11) {
        if (d()) {
            return true;
        }
        if (this.f798f == null) {
            return false;
        }
        l(i10, i11, true, true);
        return true;
    }

    public h(@NonNull Context context, @NonNull e eVar, @NonNull View view, boolean z10, int i10, int i11) {
        this.f799g = 8388611;
        this.f804l = new a();
        this.f794a = context;
        this.b = eVar;
        this.f798f = view;
        this.f795c = z10;
        this.f796d = i10;
        this.f797e = i11;
    }
}
