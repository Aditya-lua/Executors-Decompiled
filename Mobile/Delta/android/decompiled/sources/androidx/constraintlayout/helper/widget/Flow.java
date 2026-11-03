package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import c2.e;
import c2.g;
import c2.l;
import g2.d;
import g2.f;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public g f1330l;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // g2.f, androidx.constraintlayout.widget.b
    public void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        this.f1330l = new g();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == d.W0) {
                    this.f1330l.E2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == d.X0) {
                    this.f1330l.J1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == d.f18257h1) {
                    this.f1330l.O1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == d.f18266i1) {
                    this.f1330l.L1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == d.Y0) {
                    this.f1330l.M1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == d.Z0) {
                    this.f1330l.P1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == d.f18195a1) {
                    this.f1330l.N1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == d.f18203b1) {
                    this.f1330l.K1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == d.H1) {
                    this.f1330l.J2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == d.f18392x1) {
                    this.f1330l.y2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == d.G1) {
                    this.f1330l.I2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == d.f18346r1) {
                    this.f1330l.s2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == d.f18408z1) {
                    this.f1330l.A2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == d.f18362t1) {
                    this.f1330l.u2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == d.B1) {
                    this.f1330l.C2(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == d.f18378v1) {
                    this.f1330l.w2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == d.f18338q1) {
                    this.f1330l.r2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == d.f18400y1) {
                    this.f1330l.z2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == d.f18354s1) {
                    this.f1330l.t2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == d.A1) {
                    this.f1330l.B2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == d.E1) {
                    this.f1330l.G2(typedArrayObtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == d.f18370u1) {
                    this.f1330l.v2(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == d.D1) {
                    this.f1330l.F2(typedArrayObtainStyledAttributes.getInt(index, 2));
                } else if (index == d.f18385w1) {
                    this.f1330l.x2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == d.F1) {
                    this.f1330l.H2(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == d.C1) {
                    this.f1330l.D2(typedArrayObtainStyledAttributes.getInt(index, -1));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f1433d = this.f1330l;
        s();
    }

    @Override // androidx.constraintlayout.widget.b
    public void n(e eVar, boolean z10) {
        this.f1330l.u1(z10);
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    @SuppressLint({"WrongCall"})
    public void onMeasure(int i10, int i11) {
        t(this.f1330l, i10, i11);
    }

    public void setFirstHorizontalBias(float f10) {
        this.f1330l.r2(f10);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f1330l.s2(i10);
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f1330l.t2(f10);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f1330l.u2(i10);
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f1330l.v2(i10);
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f1330l.w2(f10);
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f1330l.x2(i10);
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f1330l.y2(i10);
        requestLayout();
    }

    public void setLastHorizontalBias(float f10) {
        this.f1330l.z2(f10);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i10) {
        this.f1330l.A2(i10);
        requestLayout();
    }

    public void setLastVerticalBias(float f10) {
        this.f1330l.B2(f10);
        requestLayout();
    }

    public void setLastVerticalStyle(int i10) {
        this.f1330l.C2(i10);
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f1330l.D2(i10);
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f1330l.E2(i10);
        requestLayout();
    }

    public void setPadding(int i10) {
        this.f1330l.J1(i10);
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f1330l.K1(i10);
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f1330l.M1(i10);
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f1330l.N1(i10);
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f1330l.P1(i10);
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f1330l.F2(i10);
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f1330l.G2(f10);
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f1330l.H2(i10);
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f1330l.I2(i10);
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f1330l.J2(i10);
        requestLayout();
    }

    @Override // g2.f
    public void t(l lVar, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (lVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            lVar.D1(mode, size, mode2, size2);
            setMeasuredDimension(lVar.y1(), lVar.x1());
        }
    }
}
