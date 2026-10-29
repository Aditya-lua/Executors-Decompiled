package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q.p0;
import q.q0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends p.d implements i, View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int B = i.g.f19984g;
    public boolean A;
    public final Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f872g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f880o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f881p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f883r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f884s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f885t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f886u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f888w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public i.a f889x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ViewTreeObserver f890y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public PopupWindow.OnDismissListener f891z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<e> f873h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<d> f874i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f875j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f876k = new ViewOnAttachStateChangeListenerC0014b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p0 f877l = new c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f878m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f879n = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f887v = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f882q = C();

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.a() || b.this.f874i.size() <= 0 || b.this.f874i.get(0).f898a.A()) {
                return;
            }
            View view = b.this.f881p;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator<d> it = b.this.f874i.iterator();
            while (it.hasNext()) {
                it.next().f898a.show();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    public class ViewOnAttachStateChangeListenerC0014b implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC0014b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f890y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f890y = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f890y.removeGlobalOnLayoutListener(bVar.f875j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class c implements p0 {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f895a;
            public final /* synthetic */ MenuItem b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e f896c;

            public a(d dVar, MenuItem menuItem, e eVar) {
                this.f895a = dVar;
                this.b = menuItem;
                this.f896c = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f895a;
                if (dVar != null) {
                    b.this.A = true;
                    dVar.b.e(false);
                    b.this.A = false;
                }
                if (this.b.isEnabled() && this.b.hasSubMenu()) {
                    this.f896c.M(this.b, 4);
                }
            }
        }

        public c() {
        }

        @Override // q.p0
        public void d(@NonNull e eVar, @NonNull MenuItem menuItem) {
            b.this.f872g.removeCallbacksAndMessages(null);
            int size = b.this.f874i.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (eVar == b.this.f874i.get(i10).b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            b.this.f872g.postAtTime(new a(i11 < b.this.f874i.size() ? b.this.f874i.get(i11) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // q.p0
        public void n(@NonNull e eVar, @NonNull MenuItem menuItem) {
            b.this.f872g.removeCallbacksAndMessages(eVar);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q0 f898a;
        public final e b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f899c;

        public d(@NonNull q0 q0Var, @NonNull e eVar, int i10) {
            this.f898a = q0Var;
            this.b = eVar;
            this.f899c = i10;
        }

        public ListView a() {
            return this.f898a.o();
        }
    }

    public b(@NonNull Context context, @NonNull View view, int i10, int i11, boolean z10) {
        this.b = context;
        this.f880o = view;
        this.f869d = i10;
        this.f870e = i11;
        this.f871f = z10;
        Resources resources = context.getResources();
        this.f868c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(i.d.f19921d));
        this.f872g = new Handler();
    }

    public final MenuItem A(@NonNull e eVar, @NonNull e eVar2) {
        int size = eVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = eVar.getItem(i10);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    public final View B(@NonNull d dVar, @NonNull e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemA = A(dVar.b, eVar);
        if (menuItemA == null) {
            return null;
        }
        ListView listViewA = dVar.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i10 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            headersCount = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i10 >= count) {
                i10 = -1;
                break;
            }
            if (menuItemA == dVar2.getItem(i10)) {
                break;
            }
            i10++;
        }
        if (i10 != -1 && (firstVisiblePosition = (i10 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    public final int C() {
        return this.f880o.getLayoutDirection() == 1 ? 0 : 1;
    }

    public final int D(int i10) {
        List<d> list = this.f874i;
        ListView listViewA = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f881p.getWindowVisibleDisplayFrame(rect);
        if (this.f882q == 1) {
            return (iArr[0] + listViewA.getWidth()) + i10 > rect.right ? 0 : 1;
        }
        return iArr[0] - i10 < 0 ? 1 : 0;
    }

    public final void E(@NonNull e eVar) {
        d dVar;
        View viewB;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.b);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, layoutInflaterFrom, this.f871f, B);
        if (!a() && this.f887v) {
            dVar2.d(true);
        } else if (a()) {
            dVar2.d(p.d.w(eVar));
        }
        int iM = p.d.m(dVar2, null, this.b, this.f868c);
        q0 q0VarY = y();
        q0VarY.m(dVar2);
        q0VarY.E(iM);
        q0VarY.F(this.f879n);
        if (this.f874i.size() > 0) {
            List<d> list = this.f874i;
            dVar = list.get(list.size() - 1);
            viewB = B(dVar, eVar);
        } else {
            dVar = null;
            viewB = null;
        }
        if (viewB != null) {
            q0VarY.U(false);
            q0VarY.R(null);
            int iD = D(iM);
            boolean z10 = iD == 1;
            this.f882q = iD;
            q0VarY.C(viewB);
            if ((this.f879n & 5) != 5) {
                iM = z10 ? viewB.getWidth() : 0 - iM;
            } else if (!z10) {
                iM = 0 - viewB.getWidth();
            }
            q0VarY.e(iM);
            q0VarY.M(true);
            q0VarY.i(0);
        } else {
            if (this.f883r) {
                q0VarY.e(this.f885t);
            }
            if (this.f884s) {
                q0VarY.i(this.f886u);
            }
            q0VarY.G(l());
        }
        this.f874i.add(new d(q0VarY, eVar, this.f882q));
        q0VarY.show();
        ListView listViewO = q0VarY.o();
        listViewO.setOnKeyListener(this);
        if (dVar == null && this.f888w && eVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(i.g.f19991n, (ViewGroup) listViewO, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(eVar.x());
            listViewO.addHeaderView(frameLayout, null, false);
            q0VarY.show();
        }
    }

    @Override // p.f
    public boolean a() {
        return this.f874i.size() > 0 && this.f874i.get(0).f898a.a();
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z10) {
        int iZ = z(eVar);
        if (iZ < 0) {
            return;
        }
        int i10 = iZ + 1;
        if (i10 < this.f874i.size()) {
            this.f874i.get(i10).b.e(false);
        }
        d dVarRemove = this.f874i.remove(iZ);
        dVarRemove.b.P(this);
        if (this.A) {
            dVarRemove.f898a.S(null);
            dVarRemove.f898a.D(0);
        }
        dVarRemove.f898a.dismiss();
        int size = this.f874i.size();
        if (size > 0) {
            this.f882q = this.f874i.get(size - 1).f899c;
        } else {
            this.f882q = C();
        }
        if (size != 0) {
            if (z10) {
                this.f874i.get(0).b.e(false);
                return;
            }
            return;
        }
        dismiss();
        i.a aVar = this.f889x;
        if (aVar != null) {
            aVar.b(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f890y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f890y.removeGlobalOnLayoutListener(this.f875j);
            }
            this.f890y = null;
        }
        this.f881p.removeOnAttachStateChangeListener(this.f876k);
        this.f891z.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.i
    public void d(i.a aVar) {
        this.f889x = aVar;
    }

    @Override // p.f
    public void dismiss() {
        int size = this.f874i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f874i.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f898a.a()) {
                    dVar.f898a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean e(l lVar) {
        for (d dVar : this.f874i) {
            if (lVar == dVar.b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        j(lVar);
        i.a aVar = this.f889x;
        if (aVar != null) {
            aVar.c(lVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.i
    public void f(boolean z10) {
        Iterator<d> it = this.f874i.iterator();
        while (it.hasNext()) {
            p.d.x(it.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean g() {
        return false;
    }

    @Override // p.d
    public void j(e eVar) {
        eVar.c(this, this.b);
        if (a()) {
            E(eVar);
        } else {
            this.f873h.add(eVar);
        }
    }

    @Override // p.d
    public boolean k() {
        return false;
    }

    @Override // p.d
    public void n(@NonNull View view) {
        if (this.f880o != view) {
            this.f880o = view;
            this.f879n = androidx.core.view.k.b(this.f878m, view.getLayoutDirection());
        }
    }

    @Override // p.f
    public ListView o() {
        if (this.f874i.isEmpty()) {
            return null;
        }
        List<d> list = this.f874i;
        return list.get(list.size() - 1).a();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f874i.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f874i.get(i10);
            if (!dVar.f898a.a()) {
                break;
            } else {
                i10++;
            }
        }
        if (dVar != null) {
            dVar.b.e(false);
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
        this.f887v = z10;
    }

    @Override // p.d
    public void r(int i10) {
        if (this.f878m != i10) {
            this.f878m = i10;
            this.f879n = androidx.core.view.k.b(i10, this.f880o.getLayoutDirection());
        }
    }

    @Override // p.d
    public void s(int i10) {
        this.f883r = true;
        this.f885t = i10;
    }

    @Override // p.f
    public void show() {
        if (a()) {
            return;
        }
        Iterator<e> it = this.f873h.iterator();
        while (it.hasNext()) {
            E(it.next());
        }
        this.f873h.clear();
        View view = this.f880o;
        this.f881p = view;
        if (view != null) {
            boolean z10 = this.f890y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f890y = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f875j);
            }
            this.f881p.addOnAttachStateChangeListener(this.f876k);
        }
    }

    @Override // p.d
    public void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f891z = onDismissListener;
    }

    @Override // p.d
    public void u(boolean z10) {
        this.f888w = z10;
    }

    @Override // p.d
    public void v(int i10) {
        this.f884s = true;
        this.f886u = i10;
    }

    public final q0 y() {
        q0 q0Var = new q0(this.b, null, this.f869d, this.f870e);
        q0Var.T(this.f877l);
        q0Var.K(this);
        q0Var.J(this);
        q0Var.C(this.f880o);
        q0Var.F(this.f879n);
        q0Var.I(true);
        q0Var.H(2);
        return q0Var;
    }

    public final int z(@NonNull e eVar) {
        int size = this.f874i.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (eVar == this.f874i.get(i10).b) {
                return i10;
            }
        }
        return -1;
    }
}
