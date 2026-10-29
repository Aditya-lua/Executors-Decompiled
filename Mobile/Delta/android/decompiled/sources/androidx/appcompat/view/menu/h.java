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
    public final Context f968a;
    public final e b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f973g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i.a f975i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p.d f976j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f977k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PopupWindow.OnDismissListener f978l;

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
        Display defaultDisplay = ((WindowManager) this.f968a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        p.d bVar = Math.min(point.x, point.y) >= this.f968a.getResources().getDimensionPixelSize(i.d.f19920c) ? new b(this.f968a, this.f972f, this.f970d, this.f971e, this.f969c) : new k(this.f968a, this.b, this.f972f, this.f970d, this.f971e, this.f969c);
        bVar.j(this.b);
        bVar.t(this.f978l);
        bVar.n(this.f972f);
        bVar.d(this.f975i);
        bVar.q(this.f974h);
        bVar.r(this.f973g);
        return bVar;
    }

    public void b() {
        if (d()) {
            this.f976j.dismiss();
        }
    }

    @NonNull
    public p.d c() {
        if (this.f976j == null) {
            this.f976j = a();
        }
        return this.f976j;
    }

    public boolean d() {
        p.d dVar = this.f976j;
        return dVar != null && dVar.a();
    }

    public void e() {
        this.f976j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f977k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(@NonNull View view) {
        this.f972f = view;
    }

    public void g(boolean z10) {
        this.f974h = z10;
        p.d dVar = this.f976j;
        if (dVar != null) {
            dVar.q(z10);
        }
    }

    public void h(int i10) {
        this.f973g = i10;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f977k = onDismissListener;
    }

    public void j(i.a aVar) {
        this.f975i = aVar;
        p.d dVar = this.f976j;
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
            if ((androidx.core.view.k.b(this.f973g, this.f972f.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f972f.getWidth();
            }
            dVarC.s(i10);
            dVarC.v(i11);
            int i12 = (int) ((this.f968a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            dVarC.p(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        dVarC.show();
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f972f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i10, int i11) {
        if (d()) {
            return true;
        }
        if (this.f972f == null) {
            return false;
        }
        l(i10, i11, true, true);
        return true;
    }

    public h(@NonNull Context context, @NonNull e eVar, @NonNull View view, boolean z10, int i10, int i11) {
        this.f973g = 8388611;
        this.f978l = new a();
        this.f968a = context;
        this.b = eVar;
        this.f972f = view;
        this.f969c = z10;
        this.f970d = i10;
        this.f971e = i11;
    }
}
