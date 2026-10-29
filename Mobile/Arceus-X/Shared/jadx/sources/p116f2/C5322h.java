package p116f2;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.AbstractC0517b;
import androidx.constraintlayout.widget.ConstraintLayout;
import p142g2.C5969d;

/* JADX INFO: renamed from: f2.h */
/* JADX INFO: loaded from: classes.dex */
public class C5322h extends AbstractC0517b implements C5324j.c {

    /* JADX INFO: renamed from: j */
    public boolean f20706j;

    /* JADX INFO: renamed from: k */
    public boolean f20707k;

    /* JADX INFO: renamed from: l */
    public float f20708l;

    /* JADX INFO: renamed from: m */
    public View[] f20709m;

    @Override // p116f2.C5324j.c
    /* JADX INFO: renamed from: a */
    public void mo24632a(C5324j c5324j, int i10, int i11) {
    }

    @Override // p116f2.C5324j.c
    /* JADX INFO: renamed from: b */
    public void mo24633b(C5324j c5324j, int i10) {
    }

    @Override // p116f2.C5324j.c
    /* JADX INFO: renamed from: c */
    public void mo24634c(C5324j c5324j, int i10, int i11, float f10) {
    }

    public float getProgress() {
        return this.f20708l;
    }

    @Override // androidx.constraintlayout.widget.AbstractC0517b
    /* JADX INFO: renamed from: m */
    public void mo2439m(AttributeSet attributeSet) {
        super.mo2439m(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C5969d.f22801B6);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == C5969d.f22817D6) {
                    this.f20706j = typedArrayObtainStyledAttributes.getBoolean(index, this.f20706j);
                } else if (index == C5969d.f22809C6) {
                    this.f20707k = typedArrayObtainStyledAttributes.getBoolean(index, this.f20707k);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f10) {
        this.f20708l = f10;
        int i10 = 0;
        if (this.f2059b > 0) {
            this.f20709m = m2486l((ConstraintLayout) getParent());
            while (i10 < this.f2059b) {
                m24639x(this.f20709m[i10], f10);
                i10++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i10 < childCount) {
            View childAt = viewGroup.getChildAt(i10);
            if (!(childAt instanceof C5322h)) {
                m24639x(childAt, f10);
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: t */
    public boolean m24635t() {
        return false;
    }

    /* JADX INFO: renamed from: u */
    public boolean m24636u() {
        return this.f20707k;
    }

    /* JADX INFO: renamed from: v */
    public boolean m24637v() {
        return this.f20706j;
    }

    /* JADX INFO: renamed from: w */
    public void m24638w(Canvas canvas) {
    }

    /* JADX INFO: renamed from: x */
    public void m24639x(View view, float f10) {
    }
}
