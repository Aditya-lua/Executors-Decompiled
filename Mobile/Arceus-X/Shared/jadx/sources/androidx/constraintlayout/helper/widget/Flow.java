package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import p038c2.C1512e;
import p038c2.C1514g;
import p038c2.C1519l;
import p142g2.AbstractC5971f;
import p142g2.C5969d;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends AbstractC5971f {

    /* JADX INFO: renamed from: l */
    public C1514g f1926l;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // p142g2.AbstractC5971f, androidx.constraintlayout.widget.AbstractC0517b
    /* JADX INFO: renamed from: m */
    public void mo2439m(AttributeSet attributeSet) {
        super.mo2439m(attributeSet);
        this.f1926l = new C1514g();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C5969d.f22955V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == C5969d.f22963W0) {
                    this.f1926l.m7878E2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C5969d.f22971X0) {
                    this.f1926l.m7935J1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C5969d.f23059h1) {
                    this.f1926l.m7940O1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C5969d.f23068i1) {
                    this.f1926l.m7937L1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C5969d.f22979Y0) {
                    this.f1926l.m7938M1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C5969d.f22987Z0) {
                    this.f1926l.m7941P1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C5969d.f22996a1) {
                    this.f1926l.m7939N1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C5969d.f23005b1) {
                    this.f1926l.m7936K1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C5969d.f22844H1) {
                    this.f1926l.m7883J2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C5969d.f23196x1) {
                    this.f1926l.m7898y2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C5969d.f22836G1) {
                    this.f1926l.m7882I2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C5969d.f23148r1) {
                    this.f1926l.m7892s2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C5969d.f23212z1) {
                    this.f1926l.m7873A2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C5969d.f23164t1) {
                    this.f1926l.m7894u2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C5969d.f22796B1) {
                    this.f1926l.m7875C2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C5969d.f23180v1) {
                    this.f1926l.m7896w2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C5969d.f23140q1) {
                    this.f1926l.m7891r2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C5969d.f23204y1) {
                    this.f1926l.m7899z2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C5969d.f23156s1) {
                    this.f1926l.m7893t2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C5969d.f22788A1) {
                    this.f1926l.m7874B2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C5969d.f22820E1) {
                    this.f1926l.m7880G2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == C5969d.f23172u1) {
                    this.f1926l.m7895v2(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == C5969d.f22812D1) {
                    this.f1926l.m7879F2(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == C5969d.f23188w1) {
                    this.f1926l.m7897x2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C5969d.f22828F1) {
                    this.f1926l.m7881H2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == C5969d.f22804C1) {
                    this.f1926l.m7877D2(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f2061d = this.f1926l;
        m2491s();
    }

    @Override // androidx.constraintlayout.widget.AbstractC0517b
    /* JADX INFO: renamed from: n */
    public void mo2440n(C1512e c1512e, boolean z10) {
        this.f1926l.m7942u1(z10);
    }

    @Override // androidx.constraintlayout.widget.AbstractC0517b, android.view.View
    @SuppressLint({"WrongCall"})
    public void onMeasure(int i10, int i11) {
        mo2441t(this.f1926l, i10, i11);
    }

    public void setFirstHorizontalBias(float f10) {
        this.f1926l.m7891r2(f10);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f1926l.m7892s2(i10);
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f1926l.m7893t2(f10);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f1926l.m7894u2(i10);
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f1926l.m7895v2(i10);
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f1926l.m7896w2(f10);
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f1926l.m7897x2(i10);
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f1926l.m7898y2(i10);
        requestLayout();
    }

    public void setLastHorizontalBias(float f10) {
        this.f1926l.m7899z2(f10);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i10) {
        this.f1926l.m7873A2(i10);
        requestLayout();
    }

    public void setLastVerticalBias(float f10) {
        this.f1926l.m7874B2(f10);
        requestLayout();
    }

    public void setLastVerticalStyle(int i10) {
        this.f1926l.m7875C2(i10);
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f1926l.m7877D2(i10);
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f1926l.m7878E2(i10);
        requestLayout();
    }

    public void setPadding(int i10) {
        this.f1926l.m7935J1(i10);
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f1926l.m7936K1(i10);
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f1926l.m7938M1(i10);
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f1926l.m7939N1(i10);
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f1926l.m7941P1(i10);
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f1926l.m7879F2(i10);
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f1926l.m7880G2(f10);
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f1926l.m7881H2(i10);
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f1926l.m7882I2(i10);
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f1926l.m7883J2(i10);
        requestLayout();
    }

    @Override // p142g2.AbstractC5971f
    /* JADX INFO: renamed from: t */
    public void mo2441t(C1519l c1519l, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (c1519l == null) {
            setMeasuredDimension(0, 0);
        } else {
            c1519l.mo7876D1(mode, size, mode2, size2);
            setMeasuredDimension(c1519l.m7946y1(), c1519l.m7945x1());
        }
    }
}
