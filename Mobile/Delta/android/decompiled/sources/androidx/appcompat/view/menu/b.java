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
    public static final int B = i.g.f20100g;
    public boolean A;
    public final Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f717g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f725o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f726p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f728r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f729s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f730t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f731u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f733w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public i.a f734x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ViewTreeObserver f735y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public PopupWindow.OnDismissListener f736z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<e> f718h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<d> f719i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f720j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f721k = new ViewOnAttachStateChangeListenerC0010b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p0 f722l = new c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f723m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f724n = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f732v = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f727q = C();

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.a() || b.this.f719i.size() <= 0 || b.this.f719i.get(0).f743a.A()) {
                return;
            }
            View view = b.this.f726p;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator<d> it = b.this.f719i.iterator();
            while (it.hasNext()) {
                it.next().f743a.show();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    public class ViewOnAttachStateChangeListenerC0010b implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC0010b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f735y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f735y = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f735y.removeGlobalOnLayoutListener(bVar.f720j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class c implements p0 {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f740a;
            public final /* synthetic */ MenuItem b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e f741c;

            public a(d dVar, MenuItem menuItem, e eVar) {
                this.f740a = dVar;
                this.b = menuItem;
                this.f741c = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f740a;
                if (dVar != null) {
                    b.this.A = true;
                    dVar.b.e(false);
                    b.this.A = false;
                }
                if (this.b.isEnabled() && this.b.hasSubMenu()) {
                    this.f741c.M(this.b, 4);
                }
            }
        }

        public c() {
        }

        @Override // q.p0
        public void d(@NonNull e eVar, @NonNull MenuItem menuItem) {
            b.this.f717g.removeCallbacksAndMessages(null);
            int size = b.this.f719i.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (eVar == b.this.f719i.get(i10).b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            b.this.f717g.postAtTime(new a(i11 < b.this.f719i.size() ? b.this.f719i.get(i11) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // q.p0
        public void n(@NonNull e eVar, @NonNull MenuItem menuItem) {
            b.this.f717g.removeCallbacksAndMessages(eVar);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q0 f743a;
        public final e b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f744c;

        public d(@NonNull q0 q0Var, @NonNull e eVar, int i10) {
            this.f743a = q0Var;
            this.b = eVar;
            this.f744c = i10;
        }

        public ListView a() {
            return this.f743a.o();
        }
    }

    public b(@NonNull Context context, @NonNull View view, int i10, int i11, boolean z10) {
        this.b = context;
        this.f725o = view;
        this.f714d = i10;
        this.f715e = i11;
        this.f716f = z10;
        Resources resources = context.getResources();
        this.f713c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(i.d.f20037d));
        this.f717g = new Handler();
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
        return this.f725o.getLayoutDirection() == 1 ? 0 : 1;
    }

    public final int D(int i10) {
        List<d> list = this.f719i;
        ListView listViewA = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f726p.getWindowVisibleDisplayFrame(rect);
        if (this.f727q == 1) {
            return (iArr[0] + listViewA.getWidth()) + i10 > rect.right ? 0 : 1;
        }
        return iArr[0] - i10 < 0 ? 1 : 0;
    }

    public final void E(@NonNull e eVar) {
        d dVar;
        View viewB;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.b);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, layoutInflaterFrom, this.f716f, B);
        if (!a() && this.f732v) {
            dVar2.d(true);
        } else if (a()) {
            dVar2.d(p.d.w(eVar));
        }
        int iM = p.d.m(dVar2, null, this.b, this.f713c);
        q0 q0VarY = y();
        q0VarY.m(dVar2);
        q0VarY.E(iM);
        q0VarY.F(this.f724n);
        if (this.f719i.size() > 0) {
            List<d> list = this.f719i;
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
            this.f727q = iD;
            q0VarY.C(viewB);
            if ((this.f724n & 5) != 5) {
                iM = z10 ? viewB.getWidth() : 0 - iM;
            } else if (!z10) {
                iM = 0 - viewB.getWidth();
            }
            q0VarY.e(iM);
            q0VarY.M(true);
            q0VarY.i(0);
        } else {
            if (this.f728r) {
                q0VarY.e(this.f730t);
            }
            if (this.f729s) {
                q0VarY.i(this.f731u);
            }
            q0VarY.G(l());
        }
        this.f719i.add(new d(q0VarY, eVar, this.f727q));
        q0VarY.show();
        ListView listViewO = q0VarY.o();
        listViewO.setOnKeyListener(this);
        if (dVar == null && this.f733w && eVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(i.g.f20107n, (ViewGroup) listViewO, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(eVar.x());
            listViewO.addHeaderView(frameLayout, null, false);
            q0VarY.show();
        }
    }

    @Override // p.f
    public boolean a() {
        return this.f719i.size() > 0 && this.f719i.get(0).f743a.a();
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z10) {
        int iZ = z(eVar);
        if (iZ < 0) {
            return;
        }
        int i10 = iZ + 1;
        if (i10 < this.f719i.size()) {
            this.f719i.get(i10).b.e(false);
        }
        d dVarRemove = this.f719i.remove(iZ);
        dVarRemove.b.P(this);
        if (this.A) {
            dVarRemove.f743a.S(null);
            dVarRemove.f743a.D(0);
        }
        dVarRemove.f743a.dismiss();
        int size = this.f719i.size();
        if (size > 0) {
            this.f727q = this.f719i.get(size - 1).f744c;
        } else {
            this.f727q = C();
        }
        if (size != 0) {
            if (z10) {
                this.f719i.get(0).b.e(false);
                return;
            }
            return;
        }
        dismiss();
        i.a aVar = this.f734x;
        if (aVar != null) {
            aVar.b(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f735y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f735y.removeGlobalOnLayoutListener(this.f720j);
            }
            this.f735y = null;
        }
        this.f726p.removeOnAttachStateChangeListener(this.f721k);
        this.f736z.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.i
    public void d(i.a aVar) {
        this.f734x = aVar;
    }

    @Override // p.f
    public void dismiss() {
        int size = this.f719i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f719i.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f743a.a()) {
                    dVar.f743a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean e(l lVar) {
        for (d dVar : this.f719i) {
            if (lVar == dVar.b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        j(lVar);
        i.a aVar = this.f734x;
        if (aVar != null) {
            aVar.c(lVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.i
    public void f(boolean z10) {
        Iterator<d> it = this.f719i.iterator();
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
            this.f718h.add(eVar);
        }
    }

    @Override // p.d
    public boolean k() {
        return false;
    }

    @Override // p.d
    public void n(@NonNull View view) {
        if (this.f725o != view) {
            this.f725o = view;
            this.f724n = androidx.core.view.k.b(this.f723m, view.getLayoutDirection());
        }
    }

    @Override // p.f
    public ListView o() {
        if (this.f719i.isEmpty()) {
            return null;
        }
        List<d> list = this.f719i;
        return list.get(list.size() - 1).a();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f719i.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f719i.get(i10);
            if (!dVar.f743a.a()) {
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
        this.f732v = z10;
    }

    @Override // p.d
    public void r(int i10) {
        if (this.f723m != i10) {
            this.f723m = i10;
            this.f724n = androidx.core.view.k.b(i10, this.f725o.getLayoutDirection());
        }
    }

    @Override // p.d
    public void s(int i10) {
        this.f728r = true;
        this.f730t = i10;
    }

    @Override // p.f
    public void show() {
        if (a()) {
            return;
        }
        Iterator<e> it = this.f718h.iterator();
        while (it.hasNext()) {
            E(it.next());
        }
        this.f718h.clear();
        View view = this.f725o;
        this.f726p = view;
        if (view != null) {
            boolean z10 = this.f735y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f735y = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f720j);
            }
            this.f726p.addOnAttachStateChangeListener(this.f721k);
        }
    }

    @Override // p.d
    public void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f736z = onDismissListener;
    }

    @Override // p.d
    public void u(boolean z10) {
        this.f733w = z10;
    }

    @Override // p.d
    public void v(int i10) {
        this.f729s = true;
        this.f731u = i10;
    }

    public final q0 y() {
        q0 q0Var = new q0(this.b, null, this.f714d, this.f715e);
        q0Var.T(this.f722l);
        q0Var.K(this);
        q0Var.J(this);
        q0Var.C(this.f725o);
        q0Var.F(this.f724n);
        q0Var.I(true);
        q0Var.H(2);
        return q0Var;
    }

    public final int z(@NonNull e eVar) {
        int size = this.f719i.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (eVar == this.f719i.get(i10).b) {
                return i10;
            }
        }
        return -1;
    }
}
