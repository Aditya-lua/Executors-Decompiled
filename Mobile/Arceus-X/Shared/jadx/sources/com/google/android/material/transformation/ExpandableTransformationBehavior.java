package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* JADX INFO: renamed from: b */
    public AnimatorSet f10737b;

    /* JADX INFO: renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    public class C2881a extends AnimatorListenerAdapter {
        public C2881a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f10737b = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    /* JADX INFO: renamed from: L */
    public boolean mo13318L(View view, View view2, boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.f10737b;
        boolean z12 = animatorSet != null;
        if (z12) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetMo13320N = mo13320N(view, view2, z10, z12);
        this.f10737b = animatorSetMo13320N;
        animatorSetMo13320N.addListener(new C2881a());
        this.f10737b.start();
        if (!z11) {
            this.f10737b.end();
        }
        return true;
    }

    @NonNull
    /* JADX INFO: renamed from: N */
    public abstract AnimatorSet mo13320N(View view, View view2, boolean z10, boolean z11);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
