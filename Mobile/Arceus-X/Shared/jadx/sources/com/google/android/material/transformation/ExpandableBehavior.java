package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0625o0;
import java.util.List;
import p573yc.InterfaceC13170a;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.AbstractC0524c<View> {

    /* JADX INFO: renamed from: a */
    public int f10732a;

    /* JADX INFO: renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    public class ViewTreeObserverOnPreDrawListenerC2880a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f10733a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f10734b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC13170a f10735c;

        public ViewTreeObserverOnPreDrawListenerC2880a(View view, int i10, InterfaceC13170a interfaceC13170a) {
            this.f10733a = view;
            this.f10734b = i10;
            this.f10735c = interfaceC13170a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: yc.a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f10733a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f10732a == this.f10734b) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                InterfaceC13170a interfaceC13170a = this.f10735c;
                expandableBehavior.mo13318L((View) interfaceC13170a, this.f10733a, interfaceC13170a.mo12744a(), false);
            }
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ExpandableBehavior() {
        this.f10732a = 0;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m13316J(boolean z10) {
        if (!z10) {
            return this.f10732a == 1;
        }
        int i10 = this.f10732a;
        return i10 == 0 || i10 == 2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public InterfaceC13170a m13317K(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
        List<View> listM2585r = coordinatorLayout.m2585r(view);
        int size = listM2585r.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = listM2585r.get(i10);
            if (mo2609i(coordinatorLayout, view, view2)) {
                return (InterfaceC13170a) view2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: L */
    public abstract boolean mo13318L(View view, View view2, boolean z10, boolean z11);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: i */
    public abstract boolean mo2609i(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: android.view.View */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: yc.a */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: l */
    public boolean mo2612l(CoordinatorLayout coordinatorLayout, View view, View view2) {
        InterfaceC13170a interfaceC13170a = (InterfaceC13170a) view2;
        if (!m13316J(interfaceC13170a.mo12744a())) {
            return false;
        }
        this.f10732a = interfaceC13170a.mo12744a() ? 1 : 2;
        return mo13318L((View) interfaceC13170a, view, interfaceC13170a.mo12744a(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: p */
    public boolean mo2616p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i10) {
        InterfaceC13170a interfaceC13170aM13317K;
        if (C0625o0.m3006R(view) || (interfaceC13170aM13317K = m13317K(coordinatorLayout, view)) == null || !m13316J(interfaceC13170aM13317K.mo12744a())) {
            return false;
        }
        int i11 = interfaceC13170aM13317K.mo12744a() ? 1 : 2;
        this.f10732a = i11;
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC2880a(view, i11, interfaceC13170aM13317K));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10732a = 0;
    }
}
