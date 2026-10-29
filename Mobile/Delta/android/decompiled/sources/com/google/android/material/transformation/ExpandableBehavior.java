package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.o0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8352a;

    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f8353a;
        public final /* synthetic */ int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ xc.a f8354c;

        public a(View view, int i10, xc.a aVar) {
            this.f8353a = view;
            this.b = i10;
            this.f8354c = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f8353a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f8352a == this.b) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                xc.a aVar = this.f8354c;
                expandableBehavior.L((View) aVar, this.f8353a, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f8352a = 0;
    }

    public final boolean J(boolean z10) {
        if (!z10) {
            return this.f8352a == 1;
        }
        int i10 = this.f8352a;
        return i10 == 0 || i10 == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xc.a K(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
        List<View> listR = coordinatorLayout.r(view);
        int size = listR.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = listR.get(i10);
            if (i(coordinatorLayout, view, view2)) {
                return (xc.a) view2;
            }
        }
        return null;
    }

    public abstract boolean L(View view, View view2, boolean z10, boolean z11);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean i(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
        xc.a aVar = (xc.a) view2;
        if (!J(aVar.a())) {
            return false;
        }
        this.f8352a = aVar.a() ? 1 : 2;
        return L((View) aVar, view, aVar.a(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i10) {
        xc.a aVarK;
        if (o0.R(view) || (aVarK = K(coordinatorLayout, view)) == null || !J(aVarK.a())) {
            return false;
        }
        int i11 = aVarK.a() ? 1 : 2;
        this.f8352a = i11;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i11, aVarK));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8352a = 0;
    }
}
