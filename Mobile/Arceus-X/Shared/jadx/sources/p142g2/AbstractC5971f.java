package p142g2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.AbstractC0517b;
import androidx.constraintlayout.widget.ConstraintLayout;
import p038c2.C1519l;

/* JADX INFO: renamed from: g2.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5971f extends AbstractC0517b {

    /* JADX INFO: renamed from: j */
    public boolean f23220j;

    /* JADX INFO: renamed from: k */
    public boolean f23221k;

    public AbstractC5971f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.AbstractC0517b
    /* JADX INFO: renamed from: i */
    public void mo2483i(ConstraintLayout constraintLayout) {
        m2482h(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.AbstractC0517b
    /* JADX INFO: renamed from: m */
    public void mo2439m(AttributeSet attributeSet) {
        super.mo2439m(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C5969d.f22955V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == C5969d.f23014c1) {
                    this.f23220j = true;
                } else if (index == C5969d.f23077j1) {
                    this.f23221k = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.AbstractC0517b, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f23220j || this.f23221k) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i10 = 0; i10 < this.f2059b; i10++) {
                    View viewM2456q = constraintLayout.m2456q(this.f2058a[i10]);
                    if (viewM2456q != null) {
                        if (this.f23220j) {
                            viewM2456q.setVisibility(visibility);
                        }
                        if (this.f23221k && elevation > 0.0f) {
                            viewM2456q.setTranslationZ(viewM2456q.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        m2481g();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        m2481g();
    }

    /* JADX INFO: renamed from: t */
    public void mo2441t(C1519l c1519l, int i10, int i11) {
    }
}
