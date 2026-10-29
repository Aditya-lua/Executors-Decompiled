package p023b3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.graphics.Insets;
import java.util.ArrayList;
import java.util.List;
import p206j2.C7023e;

/* JADX INFO: renamed from: b3.d */
/* JADX INFO: loaded from: classes.dex */
public class C1211d extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final Object f5064c = new Object();

    /* JADX INFO: renamed from: a */
    public final List<AbstractC1209b> f5065a;

    /* JADX INFO: renamed from: b */
    public C1210c f5066b;

    /* JADX INFO: renamed from: b3.d$a */
    public class a implements AbstractC1209b.a.InterfaceC14090a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FrameLayout.LayoutParams f5067a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f5068b;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(FrameLayout.LayoutParams layoutParams, View view) {
            this.f5067a = layoutParams;
            this.f5068b = view;
        }

        @Override // p023b3.AbstractC1209b.a.InterfaceC14090a
        /* JADX INFO: renamed from: a */
        public void mo6796a(int i10) {
            FrameLayout.LayoutParams layoutParams = this.f5067a;
            layoutParams.height = i10;
            this.f5068b.setLayoutParams(layoutParams);
        }

        @Override // p023b3.AbstractC1209b.a.InterfaceC14090a
        /* JADX INFO: renamed from: b */
        public void mo6797b(boolean z10) {
            this.f5068b.setVisibility(z10 ? 0 : 4);
        }

        @Override // p023b3.AbstractC1209b.a.InterfaceC14090a
        /* JADX INFO: renamed from: c */
        public void mo6798c(Insets insets) {
            FrameLayout.LayoutParams layoutParams = this.f5067a;
            layoutParams.leftMargin = insets.left;
            layoutParams.topMargin = insets.top;
            layoutParams.rightMargin = insets.right;
            layoutParams.bottomMargin = insets.bottom;
            this.f5068b.setLayoutParams(layoutParams);
        }

        @Override // p023b3.AbstractC1209b.a.InterfaceC14090a
        /* JADX INFO: renamed from: d */
        public void mo6799d(float f10) {
            this.f5068b.setAlpha(f10);
        }

        @Override // p023b3.AbstractC1209b.a.InterfaceC14090a
        /* JADX INFO: renamed from: e */
        public void mo6800e(int i10) {
            FrameLayout.LayoutParams layoutParams = this.f5067a;
            layoutParams.width = i10;
            this.f5068b.setLayoutParams(layoutParams);
        }

        @Override // p023b3.AbstractC1209b.a.InterfaceC14090a
        /* JADX INFO: renamed from: f */
        public void mo6801f(float f10) {
            this.f5068b.setTranslationX(f10);
        }

        @Override // p023b3.AbstractC1209b.a.InterfaceC14090a
        /* JADX INFO: renamed from: g */
        public void mo6802g(float f10) {
            this.f5068b.setTranslationY(f10);
        }

        @Override // p023b3.AbstractC1209b.a.InterfaceC14090a
        /* JADX INFO: renamed from: h */
        public void mo6803h(Drawable drawable) {
            this.f5068b.setBackground(drawable);
        }
    }

    public C1211d(Context context, List<AbstractC1209b> list) {
        super(context);
        this.f5065a = new ArrayList();
        setProtections(list);
    }

    private C1214g getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        int i10 = C7023e.f27499R;
        Object tag = viewGroup.getTag(i10);
        if (tag instanceof C1214g) {
            return (C1214g) tag;
        }
        C1214g c1214g = new C1214g(viewGroup);
        viewGroup.setTag(i10, c1214g);
        return c1214g;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x008c  */
    /* JADX INFO: renamed from: a */
    public final void m6814a(Context context, int i10, AbstractC1209b abstractC1209b) {
        int iM6786q;
        int i11;
        int iM6782m;
        AbstractC1209b.a aVarM6757c = abstractC1209b.m6757c();
        int iM6759e = abstractC1209b.m6759e();
        int i12 = -1;
        if (iM6759e != 1) {
            if (iM6759e == 2) {
                iM6782m = aVarM6757c.m6782m();
                i11 = 48;
            } else if (iM6759e == 4) {
                iM6786q = aVarM6757c.m6786q();
                i11 = 5;
            } else {
                if (iM6759e != 8) {
                    throw new IllegalArgumentException("Unexpected side: " + abstractC1209b.m6759e());
                }
                iM6782m = aVarM6757c.m6782m();
                i11 = 80;
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, iM6782m, i11);
            Insets insetsM6783n = aVarM6757c.m6783n();
            layoutParams.leftMargin = insetsM6783n.left;
            layoutParams.topMargin = insetsM6783n.top;
            layoutParams.rightMargin = insetsM6783n.right;
            layoutParams.bottomMargin = insetsM6783n.bottom;
            View view = new View(context);
            view.setTag(f5064c);
            view.setTranslationX(aVarM6757c.m6784o());
            view.setTranslationY(aVarM6757c.m6785p());
            view.setAlpha(aVarM6757c.m6780k());
            view.setVisibility(aVarM6757c.m6787r() ? 0 : 4);
            view.setBackground(aVarM6757c.m6781l());
            aVarM6757c.m6789t(new a(layoutParams, view));
            addView(view, i10, layoutParams);
        }
        iM6786q = aVarM6757c.m6786q();
        i11 = 3;
        i12 = iM6786q;
        iM6782m = -1;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i12, iM6782m, i11);
        Insets insetsM6783n2 = aVarM6757c.m6783n();
        layoutParams2.leftMargin = insetsM6783n2.left;
        layoutParams2.topMargin = insetsM6783n2.top;
        layoutParams2.rightMargin = insetsM6783n2.right;
        layoutParams2.bottomMargin = insetsM6783n2.bottom;
        View view2 = new View(context);
        view2.setTag(f5064c);
        view2.setTranslationX(aVarM6757c.m6784o());
        view2.setTranslationY(aVarM6757c.m6785p());
        view2.setAlpha(aVarM6757c.m6780k());
        view2.setVisibility(aVarM6757c.m6787r() ? 0 : 4);
        view2.setBackground(aVarM6757c.m6781l());
        aVarM6757c.m6789t(new a(layoutParams2, view2));
        addView(view2, i10, layoutParams2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != f5064c) {
            C1210c c1210c = this.f5066b;
            int childCount = getChildCount() - (c1210c != null ? c1210c.m6812i() : 0);
            if (i10 > childCount || i10 < 0) {
                i10 = childCount;
            }
        }
        super.addView(view, i10, layoutParams);
    }

    /* JADX INFO: renamed from: b */
    public final void m6815b() {
        if (this.f5065a.isEmpty()) {
            return;
        }
        this.f5066b = new C1210c(getOrInstallSystemBarStateMonitor(), this.f5065a);
        int childCount = getChildCount();
        int iM6812i = this.f5066b.m6812i();
        for (int i10 = 0; i10 < iM6812i; i10++) {
            m6814a(getContext(), i10 + childCount, this.f5066b.m6811h(i10));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6816c() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        int i10 = C7023e.f27499R;
        Object tag = viewGroup.getTag(i10);
        if (tag instanceof C1214g) {
            C1214g c1214g = (C1214g) tag;
            if (c1214g.m6828k()) {
                return;
            }
            c1214g.m6825h();
            viewGroup.setTag(i10, null);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m6817d() {
        if (this.f5066b != null) {
            removeViews(getChildCount() - this.f5066b.m6812i(), this.f5066b.m6812i());
            int iM6812i = this.f5066b.m6812i();
            for (int i10 = 0; i10 < iM6812i; i10++) {
                this.f5066b.m6811h(i10).m6757c().m6789t(null);
            }
            this.f5066b.m6810g();
            this.f5066b = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5066b != null) {
            m6817d();
        }
        m6815b();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m6817d();
        m6816c();
    }

    public void setProtections(List<AbstractC1209b> list) {
        this.f5065a.clear();
        this.f5065a.addAll(list);
        if (isAttachedToWindow()) {
            m6817d();
            m6815b();
            requestApplyInsets();
        }
    }
}
