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
    public final Context f813a;
    public final e b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i.a f820i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p.d f821j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f822k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PopupWindow.OnDismissListener f823l;

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
        Display defaultDisplay = ((WindowManager) this.f813a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        p.d bVar = Math.min(point.x, point.y) >= this.f813a.getResources().getDimensionPixelSize(i.d.f20036c) ? new b(this.f813a, this.f817f, this.f815d, this.f816e, this.f814c) : new k(this.f813a, this.b, this.f817f, this.f815d, this.f816e, this.f814c);
        bVar.j(this.b);
        bVar.t(this.f823l);
        bVar.n(this.f817f);
        bVar.d(this.f820i);
        bVar.q(this.f819h);
        bVar.r(this.f818g);
        return bVar;
    }

    public void b() {
        if (d()) {
            this.f821j.dismiss();
        }
    }

    @NonNull
    public p.d c() {
        if (this.f821j == null) {
            this.f821j = a();
        }
        return this.f821j;
    }

    public boolean d() {
        p.d dVar = this.f821j;
        return dVar != null && dVar.a();
    }

    public void e() {
        this.f821j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f822k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(@NonNull View view) {
        this.f817f = view;
    }

    public void g(boolean z10) {
        this.f819h = z10;
        p.d dVar = this.f821j;
        if (dVar != null) {
            dVar.q(z10);
        }
    }

    public void h(int i10) {
        this.f818g = i10;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f822k = onDismissListener;
    }

    public void j(i.a aVar) {
        this.f820i = aVar;
        p.d dVar = this.f821j;
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
            if ((androidx.core.view.k.b(this.f818g, this.f817f.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f817f.getWidth();
            }
            dVarC.s(i10);
            dVarC.v(i11);
            int i12 = (int) ((this.f813a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            dVarC.p(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        dVarC.show();
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f817f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i10, int i11) {
        if (d()) {
            return true;
        }
        if (this.f817f == null) {
            return false;
        }
        l(i10, i11, true, true);
        return true;
    }

    public h(@NonNull Context context, @NonNull e eVar, @NonNull View view, boolean z10, int i10, int i11) {
        this.f818g = 8388611;
        this.f823l = new a();
        this.f813a = context;
        this.b = eVar;
        this.f817f = view;
        this.f814c = z10;
        this.f815d = i10;
        this.f816e = i11;
    }
}
