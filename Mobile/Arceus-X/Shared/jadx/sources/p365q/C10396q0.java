package p365q;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.C0414d;
import androidx.appcompat.view.menu.C0415e;
import androidx.appcompat.view.menu.C0417g;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: q.q0 */
/* JADX INFO: loaded from: classes.dex */
public class C10396q0 extends C10392o0 implements InterfaceC10394p0 {

    /* JADX INFO: renamed from: J */
    public static Method f37441J;

    /* JADX INFO: renamed from: I */
    public InterfaceC10394p0 f37442I;

    /* JADX INFO: renamed from: q.q0$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m39991a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        /* JADX INFO: renamed from: b */
        public static void m39992b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* JADX INFO: renamed from: q.q0$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static void m39993a(PopupWindow popupWindow, boolean z10) {
            popupWindow.setTouchModal(z10);
        }
    }

    /* JADX INFO: renamed from: q.q0$c */
    public static class c extends C10386l0 {

        /* JADX INFO: renamed from: n */
        public final int f37443n;

        /* JADX INFO: renamed from: o */
        public final int f37444o;

        /* JADX INFO: renamed from: p */
        public InterfaceC10394p0 f37445p;

        /* JADX INFO: renamed from: q */
        public MenuItem f37446q;

        public c(Context context, boolean z10) {
            super(context, z10);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f37443n = 21;
                this.f37444o = 22;
            } else {
                this.f37443n = 22;
                this.f37444o = 21;
            }
        }

        @Override // p365q.C10386l0
        /* JADX INFO: renamed from: d */
        public /* bridge */ /* synthetic */ int mo39898d(int i10, int i11, int i12, int i13, int i14) {
            return super.mo39898d(i10, i11, i12, i13, i14);
        }

        @Override // p365q.C10386l0
        /* JADX INFO: renamed from: e */
        public /* bridge */ /* synthetic */ boolean mo39899e(MotionEvent motionEvent, int i10) {
            return super.mo39899e(motionEvent, i10);
        }

        @Override // p365q.C10386l0, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // p365q.C10386l0, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // p365q.C10386l0, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // p365q.C10386l0, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // p365q.C10386l0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            C0414d c0414d;
            int headersCount;
            int iPointToPosition;
            int i10;
            if (this.f37445p != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c0414d = (C0414d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0414d = (C0414d) adapter;
                    headersCount = 0;
                }
                C0417g item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i10 = iPointToPosition - headersCount) < 0 || i10 >= c0414d.getCount()) ? null : c0414d.getItem(i10);
                MenuItem menuItem = this.f37446q;
                if (menuItem != item) {
                    C0415e c0415eM1596b = c0414d.m1596b();
                    if (menuItem != null) {
                        this.f37445p.mo1589n(c0415eM1596b, menuItem);
                    }
                    this.f37446q = item;
                    if (item != null) {
                        this.f37445p.mo1588d(c0415eM1596b, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i10, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.f37443n) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i10 != this.f37444o) {
                return super.onKeyDown(i10, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (C0414d) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0414d) adapter).m1596b().m1634e(false);
            return true;
        }

        @Override // p365q.C10386l0, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(InterfaceC10394p0 interfaceC10394p0) {
            this.f37445p = interfaceC10394p0;
        }

        @Override // p365q.C10386l0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f37441J = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C10396q0(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    /* JADX INFO: renamed from: R */
    public void m39987R(Object obj) {
        a.m39991a(this.f37399F, (Transition) obj);
    }

    /* JADX INFO: renamed from: S */
    public void m39988S(Object obj) {
        a.m39992b(this.f37399F, (Transition) obj);
    }

    /* JADX INFO: renamed from: T */
    public void m39989T(InterfaceC10394p0 interfaceC10394p0) {
        this.f37442I = interfaceC10394p0;
    }

    /* JADX INFO: renamed from: U */
    public void m39990U(boolean z10) {
        if (Build.VERSION.SDK_INT > 28) {
            b.m39993a(this.f37399F, z10);
            return;
        }
        Method method = f37441J;
        if (method != null) {
            try {
                method.invoke(this.f37399F, Boolean.valueOf(z10));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // p365q.InterfaceC10394p0
    /* JADX INFO: renamed from: d */
    public void mo1588d(@NonNull C0415e c0415e, @NonNull MenuItem menuItem) {
        InterfaceC10394p0 interfaceC10394p0 = this.f37442I;
        if (interfaceC10394p0 != null) {
            interfaceC10394p0.mo1588d(c0415e, menuItem);
        }
    }

    @Override // p365q.InterfaceC10394p0
    /* JADX INFO: renamed from: n */
    public void mo1589n(@NonNull C0415e c0415e, @NonNull MenuItem menuItem) {
        InterfaceC10394p0 interfaceC10394p0 = this.f37442I;
        if (interfaceC10394p0 != null) {
            interfaceC10394p0.mo1589n(c0415e, menuItem);
        }
    }

    @Override // p365q.C10392o0
    @NonNull
    /* JADX INFO: renamed from: r */
    public C10386l0 mo39963r(Context context, boolean z10) {
        c cVar = new c(context, z10);
        cVar.setHoverListener(this);
        return cVar;
    }
}
