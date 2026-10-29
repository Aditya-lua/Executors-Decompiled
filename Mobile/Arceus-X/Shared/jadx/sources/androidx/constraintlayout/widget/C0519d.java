package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import p142g2.C5969d;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.d */
/* JADX INFO: loaded from: classes.dex */
public class C0519d extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public C0518c f2201a;

    /* JADX DEBUG: Method merged with bridge method: generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public C0518c getConstraintSet() {
        if (this.f2201a == null) {
            this.f2201a = new C0518c();
        }
        this.f2201a.m2510g(this);
        return this.f2201a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.C0513b(layoutParams);
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.d$a */
    public static class a extends ConstraintLayout.C0513b {

        /* JADX INFO: renamed from: A0 */
        public float f2202A0;

        /* JADX INFO: renamed from: B0 */
        public float f2203B0;

        /* JADX INFO: renamed from: C0 */
        public float f2204C0;

        /* JADX INFO: renamed from: D0 */
        public float f2205D0;

        /* JADX INFO: renamed from: E0 */
        public float f2206E0;

        /* JADX INFO: renamed from: F0 */
        public float f2207F0;

        /* JADX INFO: renamed from: G0 */
        public float f2208G0;

        /* JADX INFO: renamed from: H0 */
        public float f2209H0;

        /* JADX INFO: renamed from: I0 */
        public float f2210I0;

        /* JADX INFO: renamed from: J0 */
        public float f2211J0;

        /* JADX INFO: renamed from: x0 */
        public float f2212x0;

        /* JADX INFO: renamed from: y0 */
        public boolean f2213y0;

        /* JADX INFO: renamed from: z0 */
        public float f2214z0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(int i10, int i11) {
            super(i10, i11);
            this.f2212x0 = 1.0f;
            this.f2213y0 = false;
            this.f2214z0 = 0.0f;
            this.f2202A0 = 0.0f;
            this.f2203B0 = 0.0f;
            this.f2204C0 = 0.0f;
            this.f2205D0 = 1.0f;
            this.f2206E0 = 1.0f;
            this.f2207F0 = 0.0f;
            this.f2208G0 = 0.0f;
            this.f2209H0 = 0.0f;
            this.f2210I0 = 0.0f;
            this.f2211J0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2212x0 = 1.0f;
            this.f2213y0 = false;
            this.f2214z0 = 0.0f;
            this.f2202A0 = 0.0f;
            this.f2203B0 = 0.0f;
            this.f2204C0 = 0.0f;
            this.f2205D0 = 1.0f;
            this.f2206E0 = 1.0f;
            this.f2207F0 = 0.0f;
            this.f2208G0 = 0.0f;
            this.f2209H0 = 0.0f;
            this.f2210I0 = 0.0f;
            this.f2211J0 = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5969d.f23159s4);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == C5969d.f23167t4) {
                    this.f2212x0 = typedArrayObtainStyledAttributes.getFloat(index, this.f2212x0);
                } else if (index == C5969d.f22823E4) {
                    this.f2214z0 = typedArrayObtainStyledAttributes.getFloat(index, this.f2214z0);
                    this.f2213y0 = true;
                } else if (index == C5969d.f22799B4) {
                    this.f2203B0 = typedArrayObtainStyledAttributes.getFloat(index, this.f2203B0);
                } else if (index == C5969d.f22807C4) {
                    this.f2204C0 = typedArrayObtainStyledAttributes.getFloat(index, this.f2204C0);
                } else if (index == C5969d.f22791A4) {
                    this.f2202A0 = typedArrayObtainStyledAttributes.getFloat(index, this.f2202A0);
                } else if (index == C5969d.f23207y4) {
                    this.f2205D0 = typedArrayObtainStyledAttributes.getFloat(index, this.f2205D0);
                } else if (index == C5969d.f23215z4) {
                    this.f2206E0 = typedArrayObtainStyledAttributes.getFloat(index, this.f2206E0);
                } else if (index == C5969d.f23175u4) {
                    this.f2207F0 = typedArrayObtainStyledAttributes.getFloat(index, this.f2207F0);
                } else if (index == C5969d.f23183v4) {
                    this.f2208G0 = typedArrayObtainStyledAttributes.getFloat(index, this.f2208G0);
                } else if (index == C5969d.f23191w4) {
                    this.f2209H0 = typedArrayObtainStyledAttributes.getFloat(index, this.f2209H0);
                } else if (index == C5969d.f23199x4) {
                    this.f2210I0 = typedArrayObtainStyledAttributes.getFloat(index, this.f2210I0);
                } else if (index == C5969d.f22815D4) {
                    this.f2211J0 = typedArrayObtainStyledAttributes.getFloat(index, this.f2211J0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
