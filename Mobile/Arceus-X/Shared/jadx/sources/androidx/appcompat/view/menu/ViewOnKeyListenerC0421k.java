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
import p181i.C6592d;
import p181i.C6595g;
import p346p.AbstractC10080d;
import p365q.C10396q0;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.k */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC0421k extends AbstractC10080d implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, InterfaceC0419i, View.OnKeyListener {

    /* JADX INFO: renamed from: v */
    public static final int f1273v = C6595g.f25174o;

    /* JADX INFO: renamed from: b */
    public final Context f1274b;

    /* JADX INFO: renamed from: c */
    public final C0415e f1275c;

    /* JADX INFO: renamed from: d */
    public final C0414d f1276d;

    /* JADX INFO: renamed from: e */
    public final boolean f1277e;

    /* JADX INFO: renamed from: f */
    public final int f1278f;

    /* JADX INFO: renamed from: g */
    public final int f1279g;

    /* JADX INFO: renamed from: h */
    public final int f1280h;

    /* JADX INFO: renamed from: i */
    public final C10396q0 f1281i;

    /* JADX INFO: renamed from: l */
    public PopupWindow.OnDismissListener f1284l;

    /* JADX INFO: renamed from: m */
    public View f1285m;

    /* JADX INFO: renamed from: n */
    public View f1286n;

    /* JADX INFO: renamed from: o */
    public InterfaceC0419i.a f1287o;

    /* JADX INFO: renamed from: p */
    public ViewTreeObserver f1288p;

    /* JADX INFO: renamed from: q */
    public boolean f1289q;

    /* JADX INFO: renamed from: r */
    public boolean f1290r;

    /* JADX INFO: renamed from: s */
    public int f1291s;

    /* JADX INFO: renamed from: u */
    public boolean f1293u;

    /* JADX INFO: renamed from: j */
    public final ViewTreeObserver.OnGlobalLayoutListener f1282j = new a();

    /* JADX INFO: renamed from: k */
    public final View.OnAttachStateChangeListener f1283k = new b();

    /* JADX INFO: renamed from: t */
    public int f1292t = 0;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.k$a */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!ViewOnKeyListenerC0421k.this.mo1574a() || ViewOnKeyListenerC0421k.this.f1281i.m39938A()) {
                return;
            }
            View view = ViewOnKeyListenerC0421k.this.f1286n;
            if (view == null || !view.isShown()) {
                ViewOnKeyListenerC0421k.this.dismiss();
            } else {
                ViewOnKeyListenerC0421k.this.f1281i.show();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.k$b */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC0421k.this.f1288p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC0421k.this.f1288p = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC0421k viewOnKeyListenerC0421k = ViewOnKeyListenerC0421k.this;
                viewOnKeyListenerC0421k.f1288p.removeGlobalOnLayoutListener(viewOnKeyListenerC0421k.f1282j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public ViewOnKeyListenerC0421k(Context context, C0415e c0415e, View view, int i10, int i11, boolean z10) {
        this.f1274b = context;
        this.f1275c = c0415e;
        this.f1277e = z10;
        this.f1276d = new C0414d(c0415e, LayoutInflater.from(context), z10, f1273v);
        this.f1279g = i10;
        this.f1280h = i11;
        Resources resources = context.getResources();
        this.f1278f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C6592d.f25060d));
        this.f1285m = view;
        this.f1281i = new C10396q0(context, null, i10, i11);
        c0415e.m1630c(this, context);
    }

    @Override // p346p.InterfaceC10082f
    /* JADX INFO: renamed from: a */
    public boolean mo1574a() {
        return !this.f1289q && this.f1281i.mo1574a();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0419i
    /* JADX INFO: renamed from: b */
    public void mo1553b(C0415e c0415e, boolean z10) {
        if (c0415e != this.f1275c) {
            return;
        }
        dismiss();
        InterfaceC0419i.a aVar = this.f1287o;
        if (aVar != null) {
            aVar.mo1659b(c0415e, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0419i
    /* JADX INFO: renamed from: d */
    public void mo1555d(InterfaceC0419i.a aVar) {
        this.f1287o = aVar;
    }

    @Override // p346p.InterfaceC10082f
    public void dismiss() {
        if (mo1574a()) {
            this.f1281i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0419i
    /* JADX INFO: renamed from: e */
    public boolean mo1556e(SubMenuC0422l subMenuC0422l) {
        if (subMenuC0422l.hasVisibleItems()) {
            C0418h c0418h = new C0418h(this.f1274b, subMenuC0422l, this.f1286n, this.f1277e, this.f1279g, this.f1280h);
            c0418h.m1699j(this.f1287o);
            c0418h.m1696g(AbstractC10080d.m38860w(subMenuC0422l));
            c0418h.m1698i(this.f1284l);
            this.f1284l = null;
            this.f1275c.m1634e(false);
            int iM39956c = this.f1281i.m39956c();
            int iM39960l = this.f1281i.m39960l();
            if ((Gravity.getAbsoluteGravity(this.f1292t, this.f1285m.getLayoutDirection()) & 7) == 5) {
                iM39956c += this.f1285m.getWidth();
            }
            if (c0418h.m1703n(iM39956c, iM39960l)) {
                InterfaceC0419i.a aVar = this.f1287o;
                if (aVar == null) {
                    return true;
                }
                aVar.mo1660c(subMenuC0422l);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0419i
    /* JADX INFO: renamed from: f */
    public void mo1557f(boolean z10) {
        this.f1290r = false;
        C0414d c0414d = this.f1276d;
        if (c0414d != null) {
            c0414d.notifyDataSetChanged();
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
    }

    @Override // p346p.AbstractC10080d
    /* JADX INFO: renamed from: n */
    public void mo1578n(View view) {
        this.f1285m = view;
    }

    @Override // p346p.InterfaceC10082f
    /* JADX INFO: renamed from: o */
    public ListView mo1579o() {
        return this.f1281i.mo1579o();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f1289q = true;
        this.f1275c.close();
        ViewTreeObserver viewTreeObserver = this.f1288p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1288p = this.f1286n.getViewTreeObserver();
            }
            this.f1288p.removeGlobalOnLayoutListener(this.f1282j);
            this.f1288p = null;
        }
        this.f1286n.removeOnAttachStateChangeListener(this.f1283k);
        PopupWindow.OnDismissListener onDismissListener = this.f1284l;
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

    @Override // p346p.AbstractC10080d
    /* JADX INFO: renamed from: q */
    public void mo1580q(boolean z10) {
        this.f1276d.m1598d(z10);
    }

    @Override // p346p.AbstractC10080d
    /* JADX INFO: renamed from: r */
    public void mo1581r(int i10) {
        this.f1292t = i10;
    }

    @Override // p346p.AbstractC10080d
    /* JADX INFO: renamed from: s */
    public void mo1582s(int i10) {
        this.f1281i.m39957e(i10);
    }

    @Override // p346p.InterfaceC10082f
    public void show() {
        if (!m1704y()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // p346p.AbstractC10080d
    /* JADX INFO: renamed from: t */
    public void mo1583t(PopupWindow.OnDismissListener onDismissListener) {
        this.f1284l = onDismissListener;
    }

    @Override // p346p.AbstractC10080d
    /* JADX INFO: renamed from: u */
    public void mo1584u(boolean z10) {
        this.f1293u = z10;
    }

    @Override // p346p.AbstractC10080d
    /* JADX INFO: renamed from: v */
    public void mo1585v(int i10) {
        this.f1281i.m39959i(i10);
    }

    /* JADX INFO: renamed from: y */
    public final boolean m1704y() {
        View view;
        if (mo1574a()) {
            return true;
        }
        if (this.f1289q || (view = this.f1285m) == null) {
            return false;
        }
        this.f1286n = view;
        this.f1281i.m39947J(this);
        this.f1281i.m39948K(this);
        this.f1281i.m39946I(true);
        View view2 = this.f1286n;
        boolean z10 = this.f1288p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f1288p = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f1282j);
        }
        view2.addOnAttachStateChangeListener(this.f1283k);
        this.f1281i.m39940C(view2);
        this.f1281i.m39943F(this.f1292t);
        if (!this.f1290r) {
            this.f1291s = AbstractC10080d.m38859m(this.f1276d, null, this.f1274b, this.f1278f);
            this.f1290r = true;
        }
        this.f1281i.m39942E(this.f1291s);
        this.f1281i.m39945H(2);
        this.f1281i.m39944G(m38862l());
        this.f1281i.show();
        ListView listViewMo1579o = this.f1281i.mo1579o();
        listViewMo1579o.setOnKeyListener(this);
        if (this.f1293u && this.f1275c.m1653x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1274b).inflate(C6595g.f25173n, (ViewGroup) listViewMo1579o, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f1275c.m1653x());
            }
            frameLayout.setEnabled(false);
            listViewMo1579o.addHeaderView(frameLayout, null, false);
        }
        this.f1281i.mo1805m(this.f1276d);
        this.f1281i.show();
        return true;
    }
}
