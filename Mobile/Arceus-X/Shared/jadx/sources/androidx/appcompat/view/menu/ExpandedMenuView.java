package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p365q.C10357a1;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements C0415e.b, InterfaceC0420j, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: c */
    public static final int[] f1113c = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: a */
    public C0415e f1114a;

    /* JADX INFO: renamed from: b */
    public int f1115b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0420j
    /* JADX INFO: renamed from: a */
    public void mo1545a(C0415e c0415e) {
        this.f1114a = c0415e;
    }

    @Override // androidx.appcompat.view.menu.C0415e.b
    /* JADX INFO: renamed from: b */
    public boolean mo1546b(C0417g c0417g) {
        return this.f1114a.m1612M(c0417g, 0);
    }

    public int getWindowAnimations() {
        return this.f1115b;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        mo1546b((C0417g) getAdapter().getItem(i10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C10357a1 c10357a1M39728v = C10357a1.m39728v(context, attributeSet, f1113c, i10, 0);
        if (c10357a1M39728v.m39747s(0)) {
            setBackgroundDrawable(c10357a1M39728v.m39735g(0));
        }
        if (c10357a1M39728v.m39747s(1)) {
            setDivider(c10357a1M39728v.m39735g(1));
        }
        c10357a1M39728v.m39749x();
    }
}
