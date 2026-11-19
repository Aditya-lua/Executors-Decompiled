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
    public int f8269a;

    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f8270a;
        public final /* synthetic */ int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ zc.a f8271c;

        public a(View view, int i10, zc.a aVar) {
            this.f8270a = view;
            this.b = i10;
            this.f8271c = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f8270a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f8269a == this.b) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                zc.a aVar = this.f8271c;
                expandableBehavior.L((View) aVar, this.f8270a, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f8269a = 0;
    }

    public final boolean J(boolean z10) {
        if (!z10) {
            return this.f8269a == 1;
        }
        int i10 = this.f8269a;
        return i10 == 0 || i10 == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zc.a K(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
        List<View> listR = coordinatorLayout.r(view);
        int size = listR.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = listR.get(i10);
            if (i(coordinatorLayout, view, view2)) {
                return (zc.a) view2;
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
        zc.a aVar = (zc.a) view2;
        if (!J(aVar.a())) {
            return false;
        }
        this.f8269a = aVar.a() ? 1 : 2;
        return L((View) aVar, view, aVar.a(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i10) {
        zc.a aVarK;
        if (o0.R(view) || (aVarK = K(coordinatorLayout, view)) == null || !J(aVarK.a())) {
            return false;
        }
        int i11 = aVarK.a() ? 1 : 2;
        this.f8269a = i11;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i11, aVarK));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8269a = 0;
    }
}
