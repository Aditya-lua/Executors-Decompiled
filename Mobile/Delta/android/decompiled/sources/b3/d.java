package b3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.graphics.Insets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f3874c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<b> f3875a;
    public c b;

    public class a implements b.a.InterfaceC0069a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FrameLayout.LayoutParams f3876a;
        public final /* synthetic */ View b;

        public a(FrameLayout.LayoutParams layoutParams, View view) {
            this.f3876a = layoutParams;
            this.b = view;
        }

        @Override // b3.b.a.InterfaceC0069a
        public void a(int i10) {
            FrameLayout.LayoutParams layoutParams = this.f3876a;
            layoutParams.height = i10;
            this.b.setLayoutParams(layoutParams);
        }

        @Override // b3.b.a.InterfaceC0069a
        public void b(boolean z10) {
            this.b.setVisibility(z10 ? 0 : 4);
        }

        @Override // b3.b.a.InterfaceC0069a
        public void c(Insets insets) {
            FrameLayout.LayoutParams layoutParams = this.f3876a;
            layoutParams.leftMargin = insets.left;
            layoutParams.topMargin = insets.top;
            layoutParams.rightMargin = insets.right;
            layoutParams.bottomMargin = insets.bottom;
            this.b.setLayoutParams(layoutParams);
        }

        @Override // b3.b.a.InterfaceC0069a
        public void d(float f10) {
            this.b.setAlpha(f10);
        }

        @Override // b3.b.a.InterfaceC0069a
        public void e(int i10) {
            FrameLayout.LayoutParams layoutParams = this.f3876a;
            layoutParams.width = i10;
            this.b.setLayoutParams(layoutParams);
        }

        @Override // b3.b.a.InterfaceC0069a
        public void f(float f10) {
            this.b.setTranslationX(f10);
        }

        @Override // b3.b.a.InterfaceC0069a
        public void g(float f10) {
            this.b.setTranslationY(f10);
        }

        @Override // b3.b.a.InterfaceC0069a
        public void h(Drawable drawable) {
            this.b.setBackground(drawable);
        }
    }

    public d(Context context, List<b> list) {
        super(context);
        this.f3875a = new ArrayList();
        setProtections(list);
    }

    private g getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        int i10 = j2.e.R;
        Object tag = viewGroup.getTag(i10);
        if (tag instanceof g) {
            return (g) tag;
        }
        g gVar = new g(viewGroup);
        viewGroup.setTag(i10, gVar);
        return gVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x008c  */
    public final void a(Context context, int i10, b bVar) {
        int iQ;
        int i11;
        int iM;
        b.a aVarC = bVar.c();
        int iE = bVar.e();
        int i12 = -1;
        if (iE != 1) {
            if (iE == 2) {
                iM = aVarC.m();
                i11 = 48;
            } else if (iE == 4) {
                iQ = aVarC.q();
                i11 = 5;
            } else {
                if (iE != 8) {
                    throw new IllegalArgumentException("Unexpected side: " + bVar.e());
                }
                iM = aVarC.m();
                i11 = 80;
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, iM, i11);
            Insets insetsN = aVarC.n();
            layoutParams.leftMargin = insetsN.left;
            layoutParams.topMargin = insetsN.top;
            layoutParams.rightMargin = insetsN.right;
            layoutParams.bottomMargin = insetsN.bottom;
            View view = new View(context);
            view.setTag(f3874c);
            view.setTranslationX(aVarC.o());
            view.setTranslationY(aVarC.p());
            view.setAlpha(aVarC.k());
            view.setVisibility(aVarC.r() ? 0 : 4);
            view.setBackground(aVarC.l());
            aVarC.t(new a(layoutParams, view));
            addView(view, i10, layoutParams);
        }
        iQ = aVarC.q();
        i11 = 3;
        i12 = iQ;
        iM = -1;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i12, iM, i11);
        Insets insetsN2 = aVarC.n();
        layoutParams2.leftMargin = insetsN2.left;
        layoutParams2.topMargin = insetsN2.top;
        layoutParams2.rightMargin = insetsN2.right;
        layoutParams2.bottomMargin = insetsN2.bottom;
        View view2 = new View(context);
        view2.setTag(f3874c);
        view2.setTranslationX(aVarC.o());
        view2.setTranslationY(aVarC.p());
        view2.setAlpha(aVarC.k());
        view2.setVisibility(aVarC.r() ? 0 : 4);
        view2.setBackground(aVarC.l());
        aVarC.t(new a(layoutParams2, view2));
        addView(view2, i10, layoutParams2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != f3874c) {
            c cVar = this.b;
            int childCount = getChildCount() - (cVar != null ? cVar.i() : 0);
            if (i10 > childCount || i10 < 0) {
                i10 = childCount;
            }
        }
        super.addView(view, i10, layoutParams);
    }

    public final void b() {
        if (this.f3875a.isEmpty()) {
            return;
        }
        this.b = new c(getOrInstallSystemBarStateMonitor(), this.f3875a);
        int childCount = getChildCount();
        int i10 = this.b.i();
        for (int i11 = 0; i11 < i10; i11++) {
            a(getContext(), i11 + childCount, this.b.h(i11));
        }
    }

    public final void c() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        int i10 = j2.e.R;
        Object tag = viewGroup.getTag(i10);
        if (tag instanceof g) {
            g gVar = (g) tag;
            if (gVar.k()) {
                return;
            }
            gVar.h();
            viewGroup.setTag(i10, null);
        }
    }

    public final void d() {
        if (this.b != null) {
            removeViews(getChildCount() - this.b.i(), this.b.i());
            int i10 = this.b.i();
            for (int i11 = 0; i11 < i10; i11++) {
                this.b.h(i11).c().t(null);
            }
            this.b.g();
            this.b = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.b != null) {
            d();
        }
        b();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        c();
    }

    public void setProtections(List<b> list) {
        this.f3875a.clear();
        this.f3875a.addAll(list);
        if (isAttachedToWindow()) {
            d();
            b();
            requestApplyInsets();
        }
    }
}
