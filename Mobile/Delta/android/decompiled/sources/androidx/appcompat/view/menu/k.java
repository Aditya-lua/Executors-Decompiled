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
    public static final int f825v = i.g.f20108o;
    public final Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f829f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f830g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f831h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q0 f832i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PopupWindow.OnDismissListener f835l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f836m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f837n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i.a f838o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewTreeObserver f839p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f840q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f841r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f842s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f844u;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f833j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f834k = new b();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f843t = 0;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!k.this.a() || k.this.f832i.A()) {
                return;
            }
            View view = k.this.f837n;
            if (view == null || !view.isShown()) {
                k.this.dismiss();
            } else {
                k.this.f832i.show();
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
            ViewTreeObserver viewTreeObserver = k.this.f839p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    k.this.f839p = view.getViewTreeObserver();
                }
                k kVar = k.this;
                kVar.f839p.removeGlobalOnLayoutListener(kVar.f833j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public k(Context context, e eVar, View view, int i10, int i11, boolean z10) {
        this.b = context;
        this.f826c = eVar;
        this.f828e = z10;
        this.f827d = new d(eVar, LayoutInflater.from(context), z10, f825v);
        this.f830g = i10;
        this.f831h = i11;
        Resources resources = context.getResources();
        this.f829f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(i.d.f20037d));
        this.f836m = view;
        this.f832i = new q0(context, null, i10, i11);
        eVar.c(this, context);
    }

    @Override // p.f
    public boolean a() {
        return !this.f840q && this.f832i.a();
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z10) {
        if (eVar != this.f826c) {
            return;
        }
        dismiss();
        i.a aVar = this.f838o;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void d(i.a aVar) {
        this.f838o = aVar;
    }

    @Override // p.f
    public void dismiss() {
        if (a()) {
            this.f832i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean e(l lVar) {
        if (lVar.hasVisibleItems()) {
            h hVar = new h(this.b, lVar, this.f837n, this.f828e, this.f830g, this.f831h);
            hVar.j(this.f838o);
            hVar.g(p.d.w(lVar));
            hVar.i(this.f835l);
            this.f835l = null;
            this.f826c.e(false);
            int iC = this.f832i.c();
            int iL = this.f832i.l();
            if ((Gravity.getAbsoluteGravity(this.f843t, this.f836m.getLayoutDirection()) & 7) == 5) {
                iC += this.f836m.getWidth();
            }
            if (hVar.n(iC, iL)) {
                i.a aVar = this.f838o;
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
        this.f841r = false;
        d dVar = this.f827d;
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
        this.f836m = view;
    }

    @Override // p.f
    public ListView o() {
        return this.f832i.o();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f840q = true;
        this.f826c.close();
        ViewTreeObserver viewTreeObserver = this.f839p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f839p = this.f837n.getViewTreeObserver();
            }
            this.f839p.removeGlobalOnLayoutListener(this.f833j);
            this.f839p = null;
        }
        this.f837n.removeOnAttachStateChangeListener(this.f834k);
        PopupWindow.OnDismissListener onDismissListener = this.f835l;
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
        this.f827d.d(z10);
    }

    @Override // p.d
    public void r(int i10) {
        this.f843t = i10;
    }

    @Override // p.d
    public void s(int i10) {
        this.f832i.e(i10);
    }

    @Override // p.f
    public void show() {
        if (!y()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // p.d
    public void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f835l = onDismissListener;
    }

    @Override // p.d
    public void u(boolean z10) {
        this.f844u = z10;
    }

    @Override // p.d
    public void v(int i10) {
        this.f832i.i(i10);
    }

    public final boolean y() {
        View view;
        if (a()) {
            return true;
        }
        if (this.f840q || (view = this.f836m) == null) {
            return false;
        }
        this.f837n = view;
        this.f832i.J(this);
        this.f832i.K(this);
        this.f832i.I(true);
        View view2 = this.f837n;
        boolean z10 = this.f839p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f839p = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f833j);
        }
        view2.addOnAttachStateChangeListener(this.f834k);
        this.f832i.C(view2);
        this.f832i.F(this.f843t);
        if (!this.f841r) {
            this.f842s = p.d.m(this.f827d, null, this.b, this.f829f);
            this.f841r = true;
        }
        this.f832i.E(this.f842s);
        this.f832i.H(2);
        this.f832i.G(l());
        this.f832i.show();
        ListView listViewO = this.f832i.o();
        listViewO.setOnKeyListener(this);
        if (this.f844u && this.f826c.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.b).inflate(i.g.f20107n, (ViewGroup) listViewO, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f826c.x());
            }
            frameLayout.setEnabled(false);
            listViewO.addHeaderView(frameLayout, null, false);
        }
        this.f832i.m(this.f827d);
        this.f832i.show();
        return true;
    }
}
