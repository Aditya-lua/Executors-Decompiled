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
import q.r0;

/* JADX INFO: loaded from: classes.dex */
public final class k extends p.d implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, i, View.OnKeyListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f806v = i.g.f18835o;
    public final Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f811g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f812h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r0 f813i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PopupWindow.OnDismissListener f816l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f817m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f818n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i.a f819o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewTreeObserver f820p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f821q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f822r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f823s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f825u;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f814j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f815k = new b();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f824t = 0;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!k.this.a() || k.this.f813i.A()) {
                return;
            }
            View view = k.this.f818n;
            if (view == null || !view.isShown()) {
                k.this.dismiss();
            } else {
                k.this.f813i.show();
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
            ViewTreeObserver viewTreeObserver = k.this.f820p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    k.this.f820p = view.getViewTreeObserver();
                }
                k kVar = k.this;
                kVar.f820p.removeGlobalOnLayoutListener(kVar.f814j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public k(Context context, e eVar, View view, int i10, int i11, boolean z10) {
        this.b = context;
        this.f807c = eVar;
        this.f809e = z10;
        this.f808d = new d(eVar, LayoutInflater.from(context), z10, f806v);
        this.f811g = i10;
        this.f812h = i11;
        Resources resources = context.getResources();
        this.f810f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(i.d.f18764d));
        this.f817m = view;
        this.f813i = new r0(context, null, i10, i11);
        eVar.c(this, context);
    }

    @Override // p.f
    public boolean a() {
        return !this.f821q && this.f813i.a();
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z10) {
        if (eVar != this.f807c) {
            return;
        }
        dismiss();
        i.a aVar = this.f819o;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void d(i.a aVar) {
        this.f819o = aVar;
    }

    @Override // p.f
    public void dismiss() {
        if (a()) {
            this.f813i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean e(l lVar) {
        if (lVar.hasVisibleItems()) {
            h hVar = new h(this.b, lVar, this.f818n, this.f809e, this.f811g, this.f812h);
            hVar.j(this.f819o);
            hVar.g(p.d.w(lVar));
            hVar.i(this.f816l);
            this.f816l = null;
            this.f807c.e(false);
            int iC = this.f813i.c();
            int iL = this.f813i.l();
            if ((Gravity.getAbsoluteGravity(this.f824t, this.f817m.getLayoutDirection()) & 7) == 5) {
                iC += this.f817m.getWidth();
            }
            if (hVar.n(iC, iL)) {
                i.a aVar = this.f819o;
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
        this.f822r = false;
        d dVar = this.f808d;
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
        this.f817m = view;
    }

    @Override // p.f
    public ListView o() {
        return this.f813i.o();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f821q = true;
        this.f807c.close();
        ViewTreeObserver viewTreeObserver = this.f820p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f820p = this.f818n.getViewTreeObserver();
            }
            this.f820p.removeGlobalOnLayoutListener(this.f814j);
            this.f820p = null;
        }
        this.f818n.removeOnAttachStateChangeListener(this.f815k);
        PopupWindow.OnDismissListener onDismissListener = this.f816l;
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
        this.f808d.d(z10);
    }

    @Override // p.d
    public void r(int i10) {
        this.f824t = i10;
    }

    @Override // p.d
    public void s(int i10) {
        this.f813i.e(i10);
    }

    @Override // p.f
    public void show() {
        if (!y()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // p.d
    public void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f816l = onDismissListener;
    }

    @Override // p.d
    public void u(boolean z10) {
        this.f825u = z10;
    }

    @Override // p.d
    public void v(int i10) {
        this.f813i.i(i10);
    }

    public final boolean y() {
        View view;
        if (a()) {
            return true;
        }
        if (this.f821q || (view = this.f817m) == null) {
            return false;
        }
        this.f818n = view;
        this.f813i.J(this);
        this.f813i.K(this);
        this.f813i.I(true);
        View view2 = this.f818n;
        boolean z10 = this.f820p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f820p = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f814j);
        }
        view2.addOnAttachStateChangeListener(this.f815k);
        this.f813i.C(view2);
        this.f813i.F(this.f824t);
        if (!this.f822r) {
            this.f823s = p.d.m(this.f808d, null, this.b, this.f810f);
            this.f822r = true;
        }
        this.f813i.E(this.f823s);
        this.f813i.H(2);
        this.f813i.G(l());
        this.f813i.show();
        ListView listViewO = this.f813i.o();
        listViewO.setOnKeyListener(this);
        if (this.f825u && this.f807c.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.b).inflate(i.g.f18834n, (ViewGroup) listViewO, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f807c.x());
            }
            frameLayout.setEnabled(false);
            listViewO.addHeaderView(frameLayout, null, false);
        }
        this.f813i.m(this.f808d);
        this.f813i.show();
        return true;
    }
}
