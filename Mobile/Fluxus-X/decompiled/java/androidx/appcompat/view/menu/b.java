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
import q.q0;
import q.r0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends p.d implements i, View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int B = i.g.f18827g;
    public boolean A;
    public final Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f698g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f706o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f707p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f709r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f710s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f711t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f712u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f714w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public i.a f715x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ViewTreeObserver f716y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public PopupWindow.OnDismissListener f717z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<e> f699h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<d> f700i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f701j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f702k = new ViewOnAttachStateChangeListenerC0022b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q0 f703l = new c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f704m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f705n = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f713v = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f708q = C();

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.a() || b.this.f700i.size() <= 0 || b.this.f700i.get(0).f724a.A()) {
                return;
            }
            View view = b.this.f707p;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator<d> it = b.this.f700i.iterator();
            while (it.hasNext()) {
                it.next().f724a.show();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    public class ViewOnAttachStateChangeListenerC0022b implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC0022b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f716y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f716y = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f716y.removeGlobalOnLayoutListener(bVar.f701j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class c implements q0 {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f721a;
            public final /* synthetic */ MenuItem b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e f722c;

            public a(d dVar, MenuItem menuItem, e eVar) {
                this.f721a = dVar;
                this.b = menuItem;
                this.f722c = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f721a;
                if (dVar != null) {
                    b.this.A = true;
                    dVar.b.e(false);
                    b.this.A = false;
                }
                if (this.b.isEnabled() && this.b.hasSubMenu()) {
                    this.f722c.M(this.b, 4);
                }
            }
        }

        public c() {
        }

        @Override // q.q0
        public void d(@NonNull e eVar, @NonNull MenuItem menuItem) {
            b.this.f698g.removeCallbacksAndMessages(null);
            int size = b.this.f700i.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (eVar == b.this.f700i.get(i10).b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            b.this.f698g.postAtTime(new a(i11 < b.this.f700i.size() ? b.this.f700i.get(i11) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // q.q0
        public void n(@NonNull e eVar, @NonNull MenuItem menuItem) {
            b.this.f698g.removeCallbacksAndMessages(eVar);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r0 f724a;
        public final e b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f725c;

        public d(@NonNull r0 r0Var, @NonNull e eVar, int i10) {
            this.f724a = r0Var;
            this.b = eVar;
            this.f725c = i10;
        }

        public ListView a() {
            return this.f724a.o();
        }
    }

    public b(@NonNull Context context, @NonNull View view, int i10, int i11, boolean z10) {
        this.b = context;
        this.f706o = view;
        this.f695d = i10;
        this.f696e = i11;
        this.f697f = z10;
        Resources resources = context.getResources();
        this.f694c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(i.d.f18764d));
        this.f698g = new Handler();
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
        return this.f706o.getLayoutDirection() == 1 ? 0 : 1;
    }

    public final int D(int i10) {
        List<d> list = this.f700i;
        ListView listViewA = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f707p.getWindowVisibleDisplayFrame(rect);
        if (this.f708q == 1) {
            return (iArr[0] + listViewA.getWidth()) + i10 > rect.right ? 0 : 1;
        }
        return iArr[0] - i10 < 0 ? 1 : 0;
    }

    public final void E(@NonNull e eVar) {
        d dVar;
        View viewB;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.b);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, layoutInflaterFrom, this.f697f, B);
        if (!a() && this.f713v) {
            dVar2.d(true);
        } else if (a()) {
            dVar2.d(p.d.w(eVar));
        }
        int iM = p.d.m(dVar2, null, this.b, this.f694c);
        r0 r0VarY = y();
        r0VarY.m(dVar2);
        r0VarY.E(iM);
        r0VarY.F(this.f705n);
        if (this.f700i.size() > 0) {
            List<d> list = this.f700i;
            dVar = list.get(list.size() - 1);
            viewB = B(dVar, eVar);
        } else {
            dVar = null;
            viewB = null;
        }
        if (viewB != null) {
            r0VarY.U(false);
            r0VarY.R(null);
            int iD = D(iM);
            boolean z10 = iD == 1;
            this.f708q = iD;
            r0VarY.C(viewB);
            if ((this.f705n & 5) != 5) {
                iM = z10 ? viewB.getWidth() : 0 - iM;
            } else if (!z10) {
                iM = 0 - viewB.getWidth();
            }
            r0VarY.e(iM);
            r0VarY.M(true);
            r0VarY.i(0);
        } else {
            if (this.f709r) {
                r0VarY.e(this.f711t);
            }
            if (this.f710s) {
                r0VarY.i(this.f712u);
            }
            r0VarY.G(l());
        }
        this.f700i.add(new d(r0VarY, eVar, this.f708q));
        r0VarY.show();
        ListView listViewO = r0VarY.o();
        listViewO.setOnKeyListener(this);
        if (dVar == null && this.f714w && eVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(i.g.f18834n, (ViewGroup) listViewO, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(eVar.x());
            listViewO.addHeaderView(frameLayout, null, false);
            r0VarY.show();
        }
    }

    @Override // p.f
    public boolean a() {
        return this.f700i.size() > 0 && this.f700i.get(0).f724a.a();
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z10) {
        int iZ = z(eVar);
        if (iZ < 0) {
            return;
        }
        int i10 = iZ + 1;
        if (i10 < this.f700i.size()) {
            this.f700i.get(i10).b.e(false);
        }
        d dVarRemove = this.f700i.remove(iZ);
        dVarRemove.b.P(this);
        if (this.A) {
            dVarRemove.f724a.S(null);
            dVarRemove.f724a.D(0);
        }
        dVarRemove.f724a.dismiss();
        int size = this.f700i.size();
        if (size > 0) {
            this.f708q = this.f700i.get(size - 1).f725c;
        } else {
            this.f708q = C();
        }
        if (size != 0) {
            if (z10) {
                this.f700i.get(0).b.e(false);
                return;
            }
            return;
        }
        dismiss();
        i.a aVar = this.f715x;
        if (aVar != null) {
            aVar.b(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f716y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f716y.removeGlobalOnLayoutListener(this.f701j);
            }
            this.f716y = null;
        }
        this.f707p.removeOnAttachStateChangeListener(this.f702k);
        this.f717z.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.i
    public void d(i.a aVar) {
        this.f715x = aVar;
    }

    @Override // p.f
    public void dismiss() {
        int size = this.f700i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f700i.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f724a.a()) {
                    dVar.f724a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean e(l lVar) {
        for (d dVar : this.f700i) {
            if (lVar == dVar.b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        j(lVar);
        i.a aVar = this.f715x;
        if (aVar != null) {
            aVar.c(lVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.i
    public void f(boolean z10) {
        Iterator<d> it = this.f700i.iterator();
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
            this.f699h.add(eVar);
        }
    }

    @Override // p.d
    public boolean k() {
        return false;
    }

    @Override // p.d
    public void n(@NonNull View view) {
        if (this.f706o != view) {
            this.f706o = view;
            this.f705n = androidx.core.view.k.b(this.f704m, view.getLayoutDirection());
        }
    }

    @Override // p.f
    public ListView o() {
        if (this.f700i.isEmpty()) {
            return null;
        }
        List<d> list = this.f700i;
        return list.get(list.size() - 1).a();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f700i.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f700i.get(i10);
            if (!dVar.f724a.a()) {
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
        this.f713v = z10;
    }

    @Override // p.d
    public void r(int i10) {
        if (this.f704m != i10) {
            this.f704m = i10;
            this.f705n = androidx.core.view.k.b(i10, this.f706o.getLayoutDirection());
        }
    }

    @Override // p.d
    public void s(int i10) {
        this.f709r = true;
        this.f711t = i10;
    }

    @Override // p.f
    public void show() {
        if (a()) {
            return;
        }
        Iterator<e> it = this.f699h.iterator();
        while (it.hasNext()) {
            E(it.next());
        }
        this.f699h.clear();
        View view = this.f706o;
        this.f707p = view;
        if (view != null) {
            boolean z10 = this.f716y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f716y = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f701j);
            }
            this.f707p.addOnAttachStateChangeListener(this.f702k);
        }
    }

    @Override // p.d
    public void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f717z = onDismissListener;
    }

    @Override // p.d
    public void u(boolean z10) {
        this.f714w = z10;
    }

    @Override // p.d
    public void v(int i10) {
        this.f710s = true;
        this.f712u = i10;
    }

    public final r0 y() {
        r0 r0Var = new r0(this.b, null, this.f695d, this.f696e);
        r0Var.T(this.f703l);
        r0Var.K(this);
        r0Var.J(this);
        r0Var.C(this.f706o);
        r0Var.F(this.f705n);
        r0Var.I(true);
        r0Var.H(2);
        return r0Var;
    }

    public final int z(@NonNull e eVar) {
        int size = this.f700i.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (eVar == this.f700i.get(i10).b) {
                return i10;
            }
        }
        return -1;
    }
}
