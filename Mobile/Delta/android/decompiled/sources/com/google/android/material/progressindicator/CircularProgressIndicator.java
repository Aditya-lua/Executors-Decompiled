package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import cd.c;
import cd.e;
import cd.f;
import hc.b;
import hc.j;

/* JADX INFO: loaded from: classes2.dex */
public class CircularProgressIndicator extends a<e> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f8053p = j.f18949t;

    public CircularProgressIndicator(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.f18777f);
    }

    public int getIndicatorDirection() {
        return ((e) this.f8055a).f4719j;
    }

    public int getIndicatorInset() {
        return ((e) this.f8055a).f4718i;
    }

    public int getIndicatorSize() {
        return ((e) this.f8055a).f4717h;
    }

    @Override // com.google.android.material.progressindicator.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public e i(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new e(context, attributeSet);
    }

    public final void s() {
        c cVar = new c((e) this.f8055a);
        setIndeterminateDrawable(cd.j.t(getContext(), (e) this.f8055a, cVar));
        setProgressDrawable(f.v(getContext(), (e) this.f8055a, cVar));
    }

    public void setIndicatorDirection(int i10) {
        ((e) this.f8055a).f4719j = i10;
        invalidate();
    }

    public void setIndicatorInset(int i10) {
        S s8 = this.f8055a;
        if (((e) s8).f4718i != i10) {
            ((e) s8).f4718i = i10;
            invalidate();
        }
    }

    public void setIndicatorSize(int i10) {
        int iMax = Math.max(i10, getTrackThickness() * 2);
        S s8 = this.f8055a;
        if (((e) s8).f4717h != iMax) {
            ((e) s8).f4717h = iMax;
            ((e) s8).e();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.a
    public void setTrackThickness(int i10) {
        super.setTrackThickness(i10);
        ((e) this.f8055a).e();
    }

    public CircularProgressIndicator(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, f8053p);
        s();
    }
}
