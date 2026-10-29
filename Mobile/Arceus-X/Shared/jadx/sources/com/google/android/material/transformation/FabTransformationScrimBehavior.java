package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p216jc.C7138b;
import p216jc.C7145i;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: c */
    public final C7145i f10758c;

    /* JADX INFO: renamed from: d */
    public final C7145i f10759d;

    /* JADX INFO: renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    public class C2887a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f10760a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f10761b;

        public C2887a(boolean z10, View view) {
            this.f10760a = z10;
            this.f10761b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f10760a) {
                return;
            }
            this.f10761b.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f10760a) {
                this.f10761b.setVisibility(0);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FabTransformationScrimBehavior() {
        this.f10758c = new C7145i(75L, 150L);
        this.f10759d = new C7145i(0L, 150L);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: H */
    public boolean mo2604H(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
        return super.mo2604H(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @NonNull
    /* JADX INFO: renamed from: N */
    public AnimatorSet mo13320N(@NonNull View view, @NonNull View view2, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        m13343O(view2, z10, z11, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        C7138b.m29922a(animatorSet, arrayList);
        animatorSet.addListener(new C2887a(z10, view2));
        return animatorSet;
    }

    /* JADX INFO: renamed from: O */
    public final void m13343O(@NonNull View view, boolean z10, boolean z11, @NonNull List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfFloat;
        C7145i c7145i = z10 ? this.f10758c : this.f10759d;
        if (z10) {
            if (!z11) {
                view.setAlpha(0.0f);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        c7145i.m29942a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: i */
    public boolean mo2609i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10758c = new C7145i(75L, 150L);
        this.f10759d = new C7145i(0L, 150L);
    }
}
