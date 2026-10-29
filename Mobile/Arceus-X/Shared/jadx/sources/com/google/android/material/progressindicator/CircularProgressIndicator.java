package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import p075dd.C4543c;
import p075dd.C4545e;
import p075dd.C4546f;
import p075dd.C4550j;
import p194ic.C6738b;
import p194ic.C6746j;

/* JADX INFO: loaded from: classes2.dex */
public class CircularProgressIndicator extends AbstractC2820a<C4545e> {

    /* JADX INFO: renamed from: p */
    public static final int f10342p = C6746j.f26128t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CircularProgressIndicator(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6738b.f25895f);
    }

    public int getIndicatorDirection() {
        return ((C4545e) this.f10344a).f18614j;
    }

    public int getIndicatorInset() {
        return ((C4545e) this.f10344a).f18613i;
    }

    public int getIndicatorSize() {
        return ((C4545e) this.f10344a).f18612h;
    }

    /* JADX DEBUG: Method merged with bridge method: i(Landroid/content/Context;Landroid/util/AttributeSet;)Ldd/b; */
    @Override // com.google.android.material.progressindicator.AbstractC2820a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public C4545e mo12860i(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new C4545e(context, attributeSet);
    }

    /* JADX INFO: renamed from: s */
    public final void m12862s() {
        C4543c c4543c = new C4543c((C4545e) this.f10344a);
        setIndeterminateDrawable(C4550j.m22592t(getContext(), (C4545e) this.f10344a, c4543c));
        setProgressDrawable(C4546f.m22558v(getContext(), (C4545e) this.f10344a, c4543c));
    }

    public void setIndicatorDirection(int i10) {
        ((C4545e) this.f10344a).f18614j = i10;
        invalidate();
    }

    public void setIndicatorInset(int i10) {
        S s8 = this.f10344a;
        if (((C4545e) s8).f18613i != i10) {
            ((C4545e) s8).f18613i = i10;
            invalidate();
        }
    }

    public void setIndicatorSize(int i10) {
        int iMax = Math.max(i10, getTrackThickness() * 2);
        S s8 = this.f10344a;
        if (((C4545e) s8).f18612h != iMax) {
            ((C4545e) s8).f18612h = iMax;
            ((C4545e) s8).m22521e();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC2820a
    public void setTrackThickness(int i10) {
        super.setTrackThickness(i10);
        ((C4545e) this.f10344a).m22521e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public CircularProgressIndicator(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, f10342p);
        m12862s();
    }
}
