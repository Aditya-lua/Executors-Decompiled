package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1486j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1487k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c2.a f1488l;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.f1488l.v1();
    }

    public int getMargin() {
        return this.f1488l.x1();
    }

    public int getType() {
        return this.f1486j;
    }

    @Override // androidx.constraintlayout.widget.b
    public void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        this.f1488l = new c2.a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g2.d.V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == g2.d.f17754l1) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == g2.d.f17745k1) {
                    this.f1488l.A1(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == g2.d.f17763m1) {
                    this.f1488l.C1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f1588d = this.f1488l;
        s();
    }

    @Override // androidx.constraintlayout.widget.b
    public void n(c2.e eVar, boolean z10) {
        t(eVar, this.f1486j, z10);
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f1488l.A1(z10);
    }

    public void setDpMargin(int i10) {
        this.f1488l.C1((int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i10) {
        this.f1488l.C1(i10);
    }

    public void setType(int i10) {
        this.f1486j = i10;
    }

    public final void t(c2.e eVar, int i10, boolean z10) {
        this.f1487k = i10;
        if (z10) {
            int i11 = this.f1486j;
            if (i11 == 5) {
                this.f1487k = 1;
            } else if (i11 == 6) {
                this.f1487k = 0;
            }
        } else {
            int i12 = this.f1486j;
            if (i12 == 5) {
                this.f1487k = 0;
            } else if (i12 == 6) {
                this.f1487k = 1;
            }
        }
        if (eVar instanceof c2.a) {
            ((c2.a) eVar).B1(this.f1487k);
        }
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
