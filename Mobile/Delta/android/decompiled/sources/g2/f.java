package g2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import c2.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends androidx.constraintlayout.widget.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f17876j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f17877k;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.b
    public void i(ConstraintLayout constraintLayout) {
        h(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.b
    public void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == d.f17673c1) {
                    this.f17876j = true;
                } else if (index == d.f17736j1) {
                    this.f17877k = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f17876j || this.f17877k) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i10 = 0; i10 < this.b; i10++) {
                    View viewQ = constraintLayout.q(this.f1586a[i10]);
                    if (viewQ != null) {
                        if (this.f17876j) {
                            viewQ.setVisibility(visibility);
                        }
                        if (this.f17877k && elevation > 0.0f) {
                            viewQ.setTranslationZ(viewQ.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        g();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        g();
    }

    public void t(l lVar, int i10, int i11) {
    }
}
