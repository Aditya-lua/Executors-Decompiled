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
import androidx.core.view.C0614k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p181i.C6592d;
import p181i.C6595g;
import p346p.AbstractC10080d;
import p365q.C10396q0;
import p365q.InterfaceC10394p0;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.b */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC0412b extends AbstractC10080d implements InterfaceC0419i, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: B */
    public static final int f1143B = C6595g.f25166g;

    /* JADX INFO: renamed from: A */
    public boolean f1144A;

    /* JADX INFO: renamed from: b */
    public final Context f1145b;

    /* JADX INFO: renamed from: c */
    public final int f1146c;

    /* JADX INFO: renamed from: d */
    public final int f1147d;

    /* JADX INFO: renamed from: e */
    public final int f1148e;

    /* JADX INFO: renamed from: f */
    public final boolean f1149f;

    /* JADX INFO: renamed from: g */
    public final Handler f1150g;

    /* JADX INFO: renamed from: o */
    public View f1158o;

    /* JADX INFO: renamed from: p */
    public View f1159p;

    /* JADX INFO: renamed from: r */
    public boolean f1161r;

    /* JADX INFO: renamed from: s */
    public boolean f1162s;

    /* JADX INFO: renamed from: t */
    public int f1163t;

    /* JADX INFO: renamed from: u */
    public int f1164u;

    /* JADX INFO: renamed from: w */
    public boolean f1166w;

    /* JADX INFO: renamed from: x */
    public InterfaceC0419i.a f1167x;

    /* JADX INFO: renamed from: y */
    public ViewTreeObserver f1168y;

    /* JADX INFO: renamed from: z */
    public PopupWindow.OnDismissListener f1169z;

    /* JADX INFO: renamed from: h */
    public final List<C0415e> f1151h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final List<d> f1152i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public final ViewTreeObserver.OnGlobalLayoutListener f1153j = new a();

    /* JADX INFO: renamed from: k */
    public final View.OnAttachStateChangeListener f1154k = new b();

    /* JADX INFO: renamed from: l */
    public final InterfaceC10394p0 f1155l = new c();

    /* JADX INFO: renamed from: m */
    public int f1156m = 0;

    /* JADX INFO: renamed from: n */
    public int f1157n = 0;

    /* JADX INFO: renamed from: v */
    public boolean f1165v = false;

    /* JADX INFO: renamed from: q */
    public int f1160q = m1571C();

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$a */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!ViewOnKeyListenerC0412b.this.mo1574a() || ViewOnKeyListenerC0412b.this.f1152i.size() <= 0 || ViewOnKeyListenerC0412b.this.f1152i.get(0).f1177a.m39938A()) {
                return;
            }
            View view = ViewOnKeyListenerC0412b.this.f1159p;
            if (view == null || !view.isShown()) {
                ViewOnKeyListenerC0412b.this.dismiss();
                return;
            }
            Iterator<d> it = ViewOnKeyListenerC0412b.this.f1152i.iterator();
            while (it.hasNext()) {
                it.next().f1177a.show();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$b */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC0412b.this.f1168y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC0412b.this.f1168y = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC0412b viewOnKeyListenerC0412b = ViewOnKeyListenerC0412b.this;
                viewOnKeyListenerC0412b.f1168y.removeGlobalOnLayoutListener(viewOnKeyListenerC0412b.f1153j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$c */
    public class c implements InterfaceC10394p0 {

        /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$c$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ d f1173a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ MenuItem f1174b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C0415e f1175c;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public a(d dVar, MenuItem menuItem, C0415e c0415e) {
                this.f1173a = dVar;
                this.f1174b = menuItem;
                this.f1175c = c0415e;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f1173a;
                if (dVar != null) {
                    ViewOnKeyListenerC0412b.this.f1144A = true;
                    dVar.f1178b.m1634e(false);
                    ViewOnKeyListenerC0412b.this.f1144A = false;
                }
                if (this.f1174b.isEnabled() && this.f1174b.hasSubMenu()) {
                    this.f1175c.m1612M(this.f1174b, 4);
                }
            }
        }

        public c() {
        }

        @Override // p365q.InterfaceC10394p0
        /* JADX INFO: renamed from: d */
        public void mo1588d(@NonNull C0415e c0415e, @NonNull MenuItem menuItem) {
            ViewOnKeyListenerC0412b.this.f1150g.removeCallbacksAndMessages(null);
            int size = ViewOnKeyListenerC0412b.this.f1152i.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (c0415e == ViewOnKeyListenerC0412b.this.f1152i.get(i10).f1178b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            ViewOnKeyListenerC0412b.this.f1150g.postAtTime(new a(i11 < ViewOnKeyListenerC0412b.this.f1152i.size() ? ViewOnKeyListenerC0412b.this.f1152i.get(i11) : null, menuItem, c0415e), c0415e, SystemClock.uptimeMillis() + 200);
        }

        @Override // p365q.InterfaceC10394p0
        /* JADX INFO: renamed from: n */
        public void mo1589n(@NonNull C0415e c0415e, @NonNull MenuItem menuItem) {
            ViewOnKeyListenerC0412b.this.f1150g.removeCallbacksAndMessages(c0415e);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public final C10396q0 f1177a;

        /* JADX INFO: renamed from: b */
        public final C0415e f1178b;

        /* JADX INFO: renamed from: c */
        public final int f1179c;

        public d(@NonNull C10396q0 c10396q0, @NonNull C0415e c0415e, int i10) {
            this.f1177a = c10396q0;
            this.f1178b = c0415e;
            this.f1179c = i10;
        }

        /* JADX INFO: renamed from: a */
        public ListView m1590a() {
            return this.f1177a.mo1579o();
        }
    }

    public ViewOnKeyListenerC0412b(@NonNull Context context, @NonNull View view, int i10, int i11, boolean z10) {
        this.f1145b = context;
        this.f1158o = view;
        this.f1147d = i10;
        this.f1148e = i11;
        this.f1149f = z10;
        Resources resources = context.getResources();
        this.f1146c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C6592d.f25060d));
        this.f1150g = new Handler();
    }

    /* JADX INFO: renamed from: A */
    public final MenuItem m1569A(@NonNull C0415e c0415e, @NonNull C0415e c0415e2) {
        int size = c0415e.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = c0415e.getItem(i10);
            if (item.hasSubMenu() && c0415e2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    public final View m1570B(@NonNull d dVar, @NonNull C0415e c0415e) {
        C0414d c0414d;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemM1569A = m1569A(dVar.f1178b, c0415e);
        if (menuItemM1569A == null) {
            return null;
        }
        ListView listViewM1590a = dVar.m1590a();
        ListAdapter adapter = listViewM1590a.getAdapter();
        int i10 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            c0414d = (C0414d) headerViewListAdapter.getWrappedAdapter();
        } else {
            c0414d = (C0414d) adapter;
            headersCount = 0;
        }
        int count = c0414d.getCount();
        while (true) {
            if (i10 >= count) {
                i10 = -1;
                break;
            }
            if (menuItemM1569A == c0414d.getItem(i10)) {
                break;
            }
            i10++;
        }
        if (i10 != -1 && (firstVisiblePosition = (i10 + headersCount) - listViewM1590a.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewM1590a.getChildCount()) {
            return listViewM1590a.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* JADX INFO: renamed from: C */
    public final int m1571C() {
        return this.f1158o.getLayoutDirection() == 1 ? 0 : 1;
    }

    /* JADX INFO: renamed from: D */
    public final int m1572D(int i10) {
        List<d> list = this.f1152i;
        ListView listViewM1590a = list.get(list.size() - 1).m1590a();
        int[] iArr = new int[2];
        listViewM1590a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f1159p.getWindowVisibleDisplayFrame(rect);
        if (this.f1160q == 1) {
            return (iArr[0] + listViewM1590a.getWidth()) + i10 > rect.right ? 0 : 1;
        }
        return iArr[0] - i10 < 0 ? 1 : 0;
    }

    /* JADX INFO: renamed from: E */
    public final void m1573E(@NonNull C0415e c0415e) {
        d dVar;
        View viewM1570B;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f1145b);
        C0414d c0414d = new C0414d(c0415e, layoutInflaterFrom, this.f1149f, f1143B);
        if (!mo1574a() && this.f1165v) {
            c0414d.m1598d(true);
        } else if (mo1574a()) {
            c0414d.m1598d(AbstractC10080d.m38860w(c0415e));
        }
        int iM38859m = AbstractC10080d.m38859m(c0414d, null, this.f1145b, this.f1146c);
        C10396q0 c10396q0M1586y = m1586y();
        c10396q0M1586y.mo1805m(c0414d);
        c10396q0M1586y.m39942E(iM38859m);
        c10396q0M1586y.m39943F(this.f1157n);
        if (this.f1152i.size() > 0) {
            List<d> list = this.f1152i;
            dVar = list.get(list.size() - 1);
            viewM1570B = m1570B(dVar, c0415e);
        } else {
            dVar = null;
            viewM1570B = null;
        }
        if (viewM1570B != null) {
            c10396q0M1586y.m39990U(false);
            c10396q0M1586y.m39987R(null);
            int iM1572D = m1572D(iM38859m);
            boolean z10 = iM1572D == 1;
            this.f1160q = iM1572D;
            c10396q0M1586y.m39940C(viewM1570B);
            if ((this.f1157n & 5) != 5) {
                iM38859m = z10 ? viewM1570B.getWidth() : 0 - iM38859m;
            } else if (!z10) {
                iM38859m = 0 - viewM1570B.getWidth();
            }
            c10396q0M1586y.m39957e(iM38859m);
            c10396q0M1586y.m39950M(true);
            c10396q0M1586y.m39959i(0);
        } else {
            if (this.f1161r) {
                c10396q0M1586y.m39957e(this.f1163t);
            }
            if (this.f1162s) {
                c10396q0M1586y.m39959i(this.f1164u);
            }
            c10396q0M1586y.m39944G(m38862l());
        }
        this.f1152i.add(new d(c10396q0M1586y, c0415e, this.f1160q));
        c10396q0M1586y.show();
        ListView listViewMo1579o = c10396q0M1586y.mo1579o();
        listViewMo1579o.setOnKeyListener(this);
        if (dVar == null && this.f1166w && c0415e.m1653x() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(C6595g.f25173n, (ViewGroup) listViewMo1579o, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(c0415e.m1653x());
            listViewMo1579o.addHeaderView(frameLayout, null, false);
            c10396q0M1586y.show();
        }
    }

    @Override // p346p.InterfaceC10082f
    /* JADX INFO: renamed from: a */
    public boolean mo1574a() {
        return this.f1152i.size() > 0 && this.f1152i.get(0).f1177a.mo1574a();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0419i
    /* JADX INFO: renamed from: b */
    public void mo1553b(C0415e c0415e, boolean z10) {
        int iM1587z = m1587z(c0415e);
        if (iM1587z < 0) {
            return;
        }
        int i10 = iM1587z + 1;
        if (i10 < this.f1152i.size()) {
            this.f1152i.get(i10).f1178b.m1634e(false);
        }
        d dVarRemove = this.f1152i.remove(iM1587z);
        dVarRemove.f1178b.m1615P(this);
        if (this.f1144A) {
            dVarRemove.f1177a.m39988S(null);
            dVarRemove.f1177a.m39941D(0);
        }
        dVarRemove.f1177a.dismiss();
        int size = this.f1152i.size();
        if (size > 0) {
            this.f1160q = this.f1152i.get(size - 1).f1179c;
        } else {
            this.f1160q = m1571C();
        }
        if (size != 0) {
            if (z10) {
                this.f1152i.get(0).f1178b.m1634e(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0419i.a aVar = this.f1167x;
        if (aVar != null) {
            aVar.mo1659b(c0415e, true);
        }
        ViewTreeObserver viewTreeObserver = this.f1168y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f1168y.removeGlobalOnLayoutListener(this.f1153j);
            }
            this.f1168y = null;
        }
        this.f1159p.removeOnAttachStateChangeListener(this.f1154k);
        this.f1169z.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0419i
    /* JADX INFO: renamed from: d */
    public void mo1555d(InterfaceC0419i.a aVar) {
        this.f1167x = aVar;
    }

    @Override // p346p.InterfaceC10082f
    public void dismiss() {
        int size = this.f1152i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f1152i.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f1177a.mo1574a()) {
                    dVar.f1177a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0419i
    /* JADX INFO: renamed from: e */
    public boolean mo1556e(SubMenuC0422l subMenuC0422l) {
        for (d dVar : this.f1152i) {
            if (subMenuC0422l == dVar.f1178b) {
                dVar.m1590a().requestFocus();
                return true;
            }
        }
        if (!subMenuC0422l.hasVisibleItems()) {
            return false;
        }
        mo1576j(subMenuC0422l);
        InterfaceC0419i.a aVar = this.f1167x;
        if (aVar != null) {
            aVar.mo1660c(subMenuC0422l);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0419i
    /* JADX INFO: renamed from: f */
    public void mo1557f(boolean z10) {
        Iterator<d> it = this.f1152i.iterator();
        while (it.hasNext()) {
            AbstractC10080d.m38861x(it.next().m1590a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0419i
    /* JADX INFO: renamed from: g */
    public boolean mo1575g() {
        return false;
    }

    @Override // p346p.AbstractC10080d
    /* JADX INFO: renamed from: j */
    public void mo1576j(C0415e c0415e) {
        c0415e.m1630c(this, this.f1145b);
        if (mo1574a()) {
            m1573E(c0415e);
        } else {
            this.f1151h.add(c0415e);
        }
    }

    @Override // p346p.AbstractC10080d
    /* JADX INFO: renamed from: k */
    public boolean mo1577k() {
        return false;
    }

    @Override // p346p.AbstractC10080d
    /* JADX INFO: renamed from: n */
    public void mo1578n(@NonNull View view) {
        if (this.f1158o != view) {
            this.f1158o = view;
            this.f1157n = C0614k.m2930b(this.f1156m, view.getLayoutDirection());
        }
    }

    @Override // p346p.InterfaceC10082f
    /* JADX INFO: renamed from: o */
    public ListView mo1579o() {
        if (this.f1152i.isEmpty()) {
            return null;
        }
        List<d> list = this.f1152i;
        return list.get(list.size() - 1).m1590a();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f1152i.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f1152i.get(i10);
            if (!dVar.f1177a.mo1574a()) {
                break;
            } else {
                i10++;
            }
        }
        if (dVar != null) {
            dVar.f1178b.m1634e(false);
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

    @Override // p346p.AbstractC10080d
    /* JADX INFO: renamed from: q */
    public void mo1580q(boolean z10) {
        this.f1165v = z10;
    }

    @Override // p346p.AbstractC10080d
    /* JADX INFO: renamed from: r */
    public void mo1581r(int i10) {
        if (this.f1156m != i10) {
            this.f1156m = i10;
            this.f1157n = C0614k.m2930b(i10, this.f1158o.getLayoutDirection());
        }
    }

    @Override // p346p.AbstractC10080d
    /* JADX INFO: renamed from: s */
    public void mo1582s(int i10) {
        this.f1161r = true;
        this.f1163t = i10;
    }

    @Override // p346p.InterfaceC10082f
    public void show() {
        if (mo1574a()) {
            return;
        }
        Iterator<C0415e> it = this.f1151h.iterator();
        while (it.hasNext()) {
            m1573E(it.next());
        }
        this.f1151h.clear();
        View view = this.f1158o;
        this.f1159p = view;
        if (view != null) {
            boolean z10 = this.f1168y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f1168y = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f1153j);
            }
            this.f1159p.addOnAttachStateChangeListener(this.f1154k);
        }
    }

    @Override // p346p.AbstractC10080d
    /* JADX INFO: renamed from: t */
    public void mo1583t(PopupWindow.OnDismissListener onDismissListener) {
        this.f1169z = onDismissListener;
    }

    @Override // p346p.AbstractC10080d
    /* JADX INFO: renamed from: u */
    public void mo1584u(boolean z10) {
        this.f1166w = z10;
    }

    @Override // p346p.AbstractC10080d
    /* JADX INFO: renamed from: v */
    public void mo1585v(int i10) {
        this.f1162s = true;
        this.f1164u = i10;
    }

    /* JADX INFO: renamed from: y */
    public final C10396q0 m1586y() {
        C10396q0 c10396q0 = new C10396q0(this.f1145b, null, this.f1147d, this.f1148e);
        c10396q0.m39989T(this.f1155l);
        c10396q0.m39948K(this);
        c10396q0.m39947J(this);
        c10396q0.m39940C(this.f1158o);
        c10396q0.m39943F(this.f1157n);
        c10396q0.m39946I(true);
        c10396q0.m39945H(2);
        return c10396q0;
    }

    /* JADX INFO: renamed from: z */
    public final int m1587z(@NonNull C0415e c0415e) {
        int size = this.f1152i.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (c0415e == this.f1152i.get(i10).f1178b) {
                return i10;
            }
        }
        return -1;
    }
}
