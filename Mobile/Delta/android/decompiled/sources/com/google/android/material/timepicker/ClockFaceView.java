package com.google.android.material.timepicker;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.o0;
import hc.f;
import hc.h;
import hc.j;
import hc.k;
import java.util.Arrays;
import y2.p;

/* JADX INFO: loaded from: classes2.dex */
class ClockFaceView extends d implements ClockHandView.b {
    public final ClockHandView C;
    public final Rect D;
    public final RectF E;
    public final Rect F;
    public final SparseArray<TextView> G;
    public final androidx.core.view.a H;
    public final int[] I;
    public final float[] J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public String[] O;
    public float P;
    public final ColorStateList Q;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.H(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.C.i()) - ClockFaceView.this.K);
            return true;
        }
    }

    public class b extends androidx.core.view.a {
        public b() {
        }

        @Override // androidx.core.view.a
        public void g(View view, @NonNull p pVar) {
            super.g(view, pVar);
            int iIntValue = ((Integer) view.getTag(f.f18876r)).intValue();
            if (iIntValue > 0) {
                pVar.L0((View) ClockFaceView.this.G.get(iIntValue - 1));
            }
            pVar.o0(p.g.b(0, 1, iIntValue, 1, false, view.isSelected()));
            pVar.m0(true);
            pVar.b(p.a.f35506i);
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 != 16) {
                return super.j(view, i10, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.D);
            float fCenterX = ClockFaceView.this.D.centerX();
            float fCenterY = ClockFaceView.this.D.centerY();
            ClockFaceView.this.C.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
            ClockFaceView.this.C.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
            return true;
        }
    }

    public ClockFaceView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, hc.b.B);
    }

    public static float S(float f10, float f11, float f12) {
        return Math.max(Math.max(f10, f11), f12);
    }

    @Override // com.google.android.material.timepicker.d
    public void H(int i10) {
        if (i10 != G()) {
            super.H(i10);
            this.C.l(G());
        }
    }

    @Override // com.google.android.material.timepicker.d
    public void J() {
        super.J();
        for (int i10 = 0; i10 < this.G.size(); i10++) {
            this.G.get(i10).setVisibility(0);
        }
    }

    public final void P() {
        RectF rectFE = this.C.e();
        TextView textViewR = R(rectFE);
        for (int i10 = 0; i10 < this.G.size(); i10++) {
            TextView textView = this.G.get(i10);
            if (textView != null) {
                textView.setSelected(textView == textViewR);
                textView.getPaint().setShader(Q(rectFE, textView));
                textView.invalidate();
            }
        }
    }

    public final RadialGradient Q(RectF rectF, TextView textView) {
        textView.getHitRect(this.D);
        this.E.set(this.D);
        textView.getLineBounds(0, this.F);
        RectF rectF2 = this.E;
        Rect rect = this.F;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.E)) {
            return new RadialGradient(rectF.centerX() - this.E.left, rectF.centerY() - this.E.top, rectF.width() * 0.5f, this.I, this.J, Shader.TileMode.CLAMP);
        }
        return null;
    }

    public final TextView R(RectF rectF) {
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i10 = 0; i10 < this.G.size(); i10++) {
            TextView textView2 = this.G.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(this.D);
                this.E.set(this.D);
                this.E.union(rectF);
                float fWidth = this.E.width() * this.E.height();
                if (fWidth < f10) {
                    textView = textView2;
                    f10 = fWidth;
                }
            }
        }
        return textView;
    }

    public void T(String[] strArr, int i10) {
        this.O = strArr;
        U(i10);
    }

    public final void U(int i10) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.G.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < Math.max(this.O.length, size); i11++) {
            TextView textView = this.G.get(i11);
            if (i11 >= this.O.length) {
                removeView(textView);
                this.G.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(h.f18892g, (ViewGroup) this, false);
                    this.G.put(i11, textView);
                    addView(textView);
                }
                textView.setText(this.O[i11]);
                textView.setTag(f.f18876r, Integer.valueOf(i11));
                int i12 = (i11 / 12) + 1;
                textView.setTag(f.f18871m, Integer.valueOf(i12));
                if (i12 > 1) {
                    z10 = true;
                }
                o0.m0(textView, this.H);
                textView.setTextColor(this.Q);
                if (i10 != 0) {
                    textView.setContentDescription(getResources().getString(i10, this.O[i11]));
                }
            }
        }
        this.C.p(z10);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.b
    public void a(float f10, boolean z10) {
        if (Math.abs(this.P - f10) > 0.001f) {
            this.P = f10;
            P();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        p.O0(accessibilityNodeInfo).n0(p.f.b(1, this.O.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        P();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iS = (int) (this.N / S(this.L / displayMetrics.heightPixels, this.M / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iS, 1073741824);
        setMeasuredDimension(iS, iS);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.D = new Rect();
        this.E = new RectF();
        this.F = new Rect();
        this.G = new SparseArray<>();
        this.J = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f19032i1, i10, j.C);
        Resources resources = getResources();
        ColorStateList colorStateListA = dd.c.a(context, typedArrayObtainStyledAttributes, k.f19050k1);
        this.Q = colorStateListA;
        LayoutInflater.from(context).inflate(h.f18893h, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(f.f18870l);
        this.C = clockHandView;
        this.K = resources.getDimensionPixelSize(hc.d.f18844w);
        int colorForState = colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor());
        this.I = new int[]{colorForState, colorForState, colorStateListA.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = k.a.a(context, hc.c.f18806f).getDefaultColor();
        ColorStateList colorStateListA2 = dd.c.a(context, typedArrayObtainStyledAttributes, k.f19041j1);
        setBackgroundColor(colorStateListA2 != null ? colorStateListA2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.H = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        T(strArr, 0);
        this.L = resources.getDimensionPixelSize(hc.d.L);
        this.M = resources.getDimensionPixelSize(hc.d.M);
        this.N = resources.getDimensionPixelSize(hc.d.f18846y);
    }
}
