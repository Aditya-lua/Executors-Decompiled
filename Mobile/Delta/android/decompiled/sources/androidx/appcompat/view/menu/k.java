package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import q.q0;

/* JADX INFO: loaded from: classes.dex */
public final class k extends p.d implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, i, View.OnKeyListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f980v = i.g.f19992o;
    public final Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f986h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q0 f987i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PopupWindow.OnDismissListener f990l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f991m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f992n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i.a f993o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewTreeObserver f994p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f995q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f996r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f997s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f999u;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f988j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f989k = new b();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f998t = 0;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!k.this.a() || k.this.f987i.A()) {
                return;
            }
            View view = k.this.f992n;
            if (view == null || !view.isShown()) {
                k.this.dismiss();
            } else {
                k.this.f987i.show();
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = k.this.f994p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    k.this.f994p = view.getViewTreeObserver();
                }
                k kVar = k.this;
                kVar.f994p.removeGlobalOnLayoutListener(kVar.f988j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public k(Context context, e eVar, View view, int i10, int i11, boolean z10) {
        this.b = context;
        this.f981c = eVar;
        this.f983e = z10;
        this.f982d = new d(eVar, LayoutInflater.from(context), z10, f980v);
        this.f985g = i10;
        this.f986h = i11;
        Resources resources = context.getResources();
        this.f984f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(i.d.f19921d));
        this.f991m = view;
        this.f987i = new q0(context, null, i10, i11);
        eVar.c(this, context);
    }

    @Override // p.f
    public boolean a() {
        return !this.f995q && this.f987i.a();
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z10) {
        if (eVar != this.f981c) {
            return;
        }
        dismiss();
        i.a aVar = this.f993o;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void d(i.a aVar) {
        this.f993o = aVar;
    }

    @Override // p.f
    public void dismiss() {
        if (a()) {
            this.f987i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean e(l lVar) {
        if (lVar.hasVisibleItems()) {
            h hVar = new h(this.b, lVar, this.f992n, this.f983e, this.f985g, this.f986h);
            hVar.j(this.f993o);
            hVar.g(p.d.w(lVar));
            hVar.i(this.f990l);
            this.f990l = null;
            this.f981c.e(false);
            int iC = this.f987i.c();
            int iL = this.f987i.l();
            if ((Gravity.getAbsoluteGravity(this.f998t, this.f991m.getLayoutDirection()) & 7) == 5) {
                iC += this.f991m.getWidth();
            }
            if (hVar.n(iC, iL)) {
                i.a aVar = this.f993o;
                if (aVar == null) {
                    return true;
                }
                aVar.c(lVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void f(boolean z10) {
        this.f996r = false;
        d dVar = this.f982d;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean g() {
        return false;
    }

    @Override // p.d
    public void j(e eVar) {
    }

    @Override // p.d
    public void n(View view) {
        this.f991m = view;
    }

    @Override // p.f
    public ListView o() {
        return this.f987i.o();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f995q = true;
        this.f981c.close();
        ViewTreeObserver viewTreeObserver = this.f994p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f994p = this.f992n.getViewTreeObserver();
            }
            this.f994p.removeGlobalOnLayoutListener(this.f988j);
            this.f994p = null;
        }
        this.f992n.removeOnAttachStateChangeListener(this.f989k);
        PopupWindow.OnDismissListener onDismissListener = this.f990l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p.d
    public void q(boolean z10) {
        this.f982d.d(z10);
    }

    @Override // p.d
    public void r(int i10) {
        this.f998t = i10;
    }

    @Override // p.d
    public void s(int i10) {
        this.f987i.e(i10);
    }

    @Override // p.f
    public void show() {
        if (!y()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // p.d
    public void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f990l = onDismissListener;
    }

    @Override // p.d
    public void u(boolean z10) {
        this.f999u = z10;
    }

    @Override // p.d
    public void v(int i10) {
        this.f987i.i(i10);
    }

    public final boolean y() {
        View view;
        if (a()) {
            return true;
        }
        if (this.f995q || (view = this.f991m) == null) {
            return false;
        }
        this.f992n = view;
        this.f987i.J(this);
        this.f987i.K(this);
        this.f987i.I(true);
        View view2 = this.f992n;
        boolean z10 = this.f994p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f994p = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f988j);
        }
        view2.addOnAttachStateChangeListener(this.f989k);
        this.f987i.C(view2);
        this.f987i.F(this.f998t);
        if (!this.f996r) {
            this.f997s = p.d.m(this.f982d, null, this.b, this.f984f);
            this.f996r = true;
        }
        this.f987i.E(this.f997s);
        this.f987i.H(2);
        this.f987i.G(l());
        this.f987i.show();
        ListView listViewO = this.f987i.o();
        listViewO.setOnKeyListener(this);
        if (this.f999u && this.f981c.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.b).inflate(i.g.f19991n, (ViewGroup) listViewO, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f981c.x());
            }
            frameLayout.setEnabled(false);
            listViewO.addHeaderView(frameLayout, null, false);
        }
        this.f987i.m(this.f982d);
        this.f987i.show();
        return true;
    }
}
