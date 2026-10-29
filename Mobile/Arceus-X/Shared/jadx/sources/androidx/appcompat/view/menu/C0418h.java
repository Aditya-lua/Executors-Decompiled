package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.core.view.C0614k;
import androidx.core.view.GravityCompat;
import p181i.C6592d;
import p346p.AbstractC10080d;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.h */
/* JADX INFO: loaded from: classes.dex */
public class C0418h {

    /* JADX INFO: renamed from: a */
    public final Context f1260a;

    /* JADX INFO: renamed from: b */
    public final C0415e f1261b;

    /* JADX INFO: renamed from: c */
    public final boolean f1262c;

    /* JADX INFO: renamed from: d */
    public final int f1263d;

    /* JADX INFO: renamed from: e */
    public final int f1264e;

    /* JADX INFO: renamed from: f */
    public View f1265f;

    /* JADX INFO: renamed from: g */
    public int f1266g;

    /* JADX INFO: renamed from: h */
    public boolean f1267h;

    /* JADX INFO: renamed from: i */
    public InterfaceC0419i.a f1268i;

    /* JADX INFO: renamed from: j */
    public AbstractC10080d f1269j;

    /* JADX INFO: renamed from: k */
    public PopupWindow.OnDismissListener f1270k;

    /* JADX INFO: renamed from: l */
    public final PopupWindow.OnDismissListener f1271l;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.h$a */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C0418h.this.mo1694e();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0418h(@NonNull Context context, @NonNull C0415e c0415e, @NonNull View view, boolean z10, int i10) {
        this(context, c0415e, view, z10, i10, 0);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public final AbstractC10080d m1690a() {
        Display defaultDisplay = ((WindowManager) this.f1260a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        AbstractC10080d viewOnKeyListenerC0412b = Math.min(point.x, point.y) >= this.f1260a.getResources().getDimensionPixelSize(C6592d.f25059c) ? new ViewOnKeyListenerC0412b(this.f1260a, this.f1265f, this.f1263d, this.f1264e, this.f1262c) : new ViewOnKeyListenerC0421k(this.f1260a, this.f1261b, this.f1265f, this.f1263d, this.f1264e, this.f1262c);
        viewOnKeyListenerC0412b.mo1576j(this.f1261b);
        viewOnKeyListenerC0412b.mo1583t(this.f1271l);
        viewOnKeyListenerC0412b.mo1578n(this.f1265f);
        viewOnKeyListenerC0412b.mo1555d(this.f1268i);
        viewOnKeyListenerC0412b.mo1580q(this.f1267h);
        viewOnKeyListenerC0412b.mo1581r(this.f1266g);
        return viewOnKeyListenerC0412b;
    }

    /* JADX INFO: renamed from: b */
    public void m1691b() {
        if (m1693d()) {
            this.f1269j.dismiss();
        }
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public AbstractC10080d m1692c() {
        if (this.f1269j == null) {
            this.f1269j = m1690a();
        }
        return this.f1269j;
    }

    /* JADX INFO: renamed from: d */
    public boolean m1693d() {
        AbstractC10080d abstractC10080d = this.f1269j;
        return abstractC10080d != null && abstractC10080d.mo1574a();
    }

    /* JADX INFO: renamed from: e */
    public void mo1694e() {
        this.f1269j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1270k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m1695f(@NonNull View view) {
        this.f1265f = view;
    }

    /* JADX INFO: renamed from: g */
    public void m1696g(boolean z10) {
        this.f1267h = z10;
        AbstractC10080d abstractC10080d = this.f1269j;
        if (abstractC10080d != null) {
            abstractC10080d.mo1580q(z10);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m1697h(int i10) {
        this.f1266g = i10;
    }

    /* JADX INFO: renamed from: i */
    public void m1698i(PopupWindow.OnDismissListener onDismissListener) {
        this.f1270k = onDismissListener;
    }

    /* JADX INFO: renamed from: j */
    public void m1699j(InterfaceC0419i.a aVar) {
        this.f1268i = aVar;
        AbstractC10080d abstractC10080d = this.f1269j;
        if (abstractC10080d != null) {
            abstractC10080d.mo1555d(aVar);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m1700k() {
        if (!m1702m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1701l(int i10, int i11, boolean z10, boolean z11) {
        AbstractC10080d abstractC10080dM1692c = m1692c();
        abstractC10080dM1692c.mo1584u(z11);
        if (z10) {
            if ((C0614k.m2930b(this.f1266g, this.f1265f.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f1265f.getWidth();
            }
            abstractC10080dM1692c.mo1582s(i10);
            abstractC10080dM1692c.mo1585v(i11);
            int i12 = (int) ((this.f1260a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC10080dM1692c.m38863p(new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12));
        }
        abstractC10080dM1692c.show();
    }

    /* JADX INFO: renamed from: m */
    public boolean m1702m() {
        if (m1693d()) {
            return true;
        }
        if (this.f1265f == null) {
            return false;
        }
        m1701l(0, 0, false, false);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public boolean m1703n(int i10, int i11) {
        if (m1693d()) {
            return true;
        }
        if (this.f1265f == null) {
            return false;
        }
        m1701l(i10, i11, true, true);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0418h(@NonNull Context context, @NonNull C0415e c0415e, @NonNull View view, boolean z10, int i10, int i11) {
        this.f1266g = GravityCompat.START;
        this.f1271l = new a();
        this.f1260a = context;
        this.f1261b = c0415e;
        this.f1265f = view;
        this.f1262c = z10;
        this.f1263d = i10;
        this.f1264e = i11;
    }
}
