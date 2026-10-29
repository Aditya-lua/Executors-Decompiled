package p346p;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.C0414d;
import androidx.appcompat.view.menu.C0415e;
import androidx.appcompat.view.menu.C0417g;
import androidx.appcompat.view.menu.InterfaceC0419i;

/* JADX INFO: renamed from: p.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10080d implements InterfaceC10082f, InterfaceC0419i, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public Rect f36311a;

    /* JADX INFO: renamed from: m */
    public static int m38859m(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i10) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i11 = 0;
        int i12 = 0;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = listAdapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i13, view, viewGroup);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i10) {
                return i10;
            }
            if (measuredWidth > i11) {
                i11 = measuredWidth;
            }
        }
        return i11;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m38860w(C0415e c0415e) {
        int size = c0415e.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = c0415e.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public static C0414d m38861x(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0414d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0414d) listAdapter;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0419i
    /* JADX INFO: renamed from: c */
    public boolean mo1554c(C0415e c0415e, C0417g c0417g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0419i
    /* JADX INFO: renamed from: h */
    public boolean mo1558h(C0415e c0415e, C0417g c0417g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0419i
    /* JADX INFO: renamed from: i */
    public void mo1559i(@NonNull Context context, C0415e c0415e) {
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo1576j(C0415e c0415e);

    /* JADX INFO: renamed from: k */
    public boolean mo1577k() {
        return true;
    }

    /* JADX INFO: renamed from: l */
    public Rect m38862l() {
        return this.f36311a;
    }

    /* JADX INFO: renamed from: n */
    public abstract void mo1578n(View view);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m38861x(listAdapter).f1191a.m1613N((MenuItem) listAdapter.getItem(i10), this, mo1577k() ? 0 : 4);
    }

    /* JADX INFO: renamed from: p */
    public void m38863p(Rect rect) {
        this.f36311a = rect;
    }

    /* JADX INFO: renamed from: q */
    public abstract void mo1580q(boolean z10);

    /* JADX INFO: renamed from: r */
    public abstract void mo1581r(int i10);

    /* JADX INFO: renamed from: s */
    public abstract void mo1582s(int i10);

    /* JADX INFO: renamed from: t */
    public abstract void mo1583t(PopupWindow.OnDismissListener onDismissListener);

    /* JADX INFO: renamed from: u */
    public abstract void mo1584u(boolean z10);

    /* JADX INFO: renamed from: v */
    public abstract void mo1585v(int i10);
}
