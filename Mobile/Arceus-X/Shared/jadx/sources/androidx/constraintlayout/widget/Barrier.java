package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p038c2.C1508a;
import p038c2.C1512e;
import p142g2.C5969d;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends AbstractC0517b {

    /* JADX INFO: renamed from: j */
    public int f1927j;

    /* JADX INFO: renamed from: k */
    public int f1928k;

    /* JADX INFO: renamed from: l */
    public C1508a f1929l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.f1929l.m7671v1();
    }

    public int getMargin() {
        return this.f1929l.m7673x1();
    }

    public int getType() {
        return this.f1927j;
    }

    @Override // androidx.constraintlayout.widget.AbstractC0517b
    /* JADX INFO: renamed from: m */
    public void mo2439m(AttributeSet attributeSet) {
        super.mo2439m(attributeSet);
        this.f1929l = new C1508a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C5969d.f22955V0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == C5969d.f23095l1) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == C5969d.f23086k1) {
                    this.f1929l.m7663A1(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == C5969d.f23104m1) {
                    this.f1929l.m7665C1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f2061d = this.f1929l;
        m2491s();
    }

    @Override // androidx.constraintlayout.widget.AbstractC0517b
    /* JADX INFO: renamed from: n */
    public void mo2440n(C1512e c1512e, boolean z10) {
        m2442t(c1512e, this.f1927j, z10);
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f1929l.m7663A1(z10);
    }

    public void setDpMargin(int i10) {
        this.f1929l.m7665C1((int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i10) {
        this.f1929l.m7665C1(i10);
    }

    public void setType(int i10) {
        this.f1927j = i10;
    }

    /* JADX INFO: renamed from: t */
    public final void m2442t(C1512e c1512e, int i10, boolean z10) {
        this.f1928k = i10;
        if (z10) {
            int i11 = this.f1927j;
            if (i11 == 5) {
                this.f1928k = 1;
            } else if (i11 == 6) {
                this.f1928k = 0;
            }
        } else {
            int i12 = this.f1927j;
            if (i12 == 5) {
                this.f1928k = 0;
            } else if (i12 == 6) {
                this.f1928k = 1;
            }
        }
        if (c1512e instanceof C1508a) {
            ((C1508a) c1512e).m7664B1(this.f1928k);
        }
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
