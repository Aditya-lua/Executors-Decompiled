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
import androidx.core.view.C0582a;
import androidx.core.view.C0625o0;
import java.util.Arrays;
import p101ed.C5050c;
import p194ic.C6738b;
import p194ic.C6739c;
import p194ic.C6740d;
import p194ic.C6742f;
import p194ic.C6744h;
import p194ic.C6746j;
import p194ic.C6747k;
import p232k.C7399a;
import p564y2.C13017p;

/* JADX INFO: loaded from: classes2.dex */
class ClockFaceView extends C2878d implements ClockHandView.InterfaceC2868b {

    /* JADX INFO: renamed from: C */
    public final ClockHandView f10670C;

    /* JADX INFO: renamed from: D */
    public final Rect f10671D;

    /* JADX INFO: renamed from: E */
    public final RectF f10672E;

    /* JADX INFO: renamed from: F */
    public final Rect f10673F;

    /* JADX INFO: renamed from: G */
    public final SparseArray<TextView> f10674G;

    /* JADX INFO: renamed from: H */
    public final C0582a f10675H;

    /* JADX INFO: renamed from: I */
    public final int[] f10676I;

    /* JADX INFO: renamed from: J */
    public final float[] f10677J;

    /* JADX INFO: renamed from: K */
    public final int f10678K;

    /* JADX INFO: renamed from: L */
    public final int f10679L;

    /* JADX INFO: renamed from: M */
    public final int f10680M;

    /* JADX INFO: renamed from: N */
    public final int f10681N;

    /* JADX INFO: renamed from: O */
    public String[] f10682O;

    /* JADX INFO: renamed from: P */
    public float f10683P;

    /* JADX INFO: renamed from: Q */
    public final ColorStateList f10684Q;

    /* JADX INFO: renamed from: com.google.android.material.timepicker.ClockFaceView$a */
    public class ViewTreeObserverOnPreDrawListenerC2865a implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserverOnPreDrawListenerC2865a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.mo13275H(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f10670C.m13291i()) - ClockFaceView.this.f10678K);
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.ClockFaceView$b */
    public class C2866b extends C0582a {
        public C2866b() {
        }

        @Override // androidx.core.view.C0582a
        /* JADX INFO: renamed from: g */
        public void mo2799g(View view, @NonNull C13017p c13017p) {
            super.mo2799g(view, c13017p);
            int iIntValue = ((Integer) view.getTag(C6742f.f26047r)).intValue();
            if (iIntValue > 0) {
                c13017p.m48372L0((View) ClockFaceView.this.f10674G.get(iIntValue - 1));
            }
            c13017p.m48414o0(C13017p.g.m48455b(0, 1, iIntValue, 1, false, view.isSelected()));
            c13017p.m48410m0(true);
            c13017p.m48388b(C13017p.a.f46067i);
        }

        @Override // androidx.core.view.C0582a
        /* JADX INFO: renamed from: j */
        public boolean mo2802j(View view, int i10, Bundle bundle) {
            if (i10 != 16) {
                return super.mo2802j(view, i10, bundle);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.f10671D);
            float fCenterX = ClockFaceView.this.f10671D.centerX();
            float fCenterY = ClockFaceView.this.f10671D.centerY();
            ClockFaceView.this.f10670C.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
            ClockFaceView.this.f10670C.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
            return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ClockFaceView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6738b.f25860B);
    }

    /* JADX INFO: renamed from: S */
    public static float m13274S(float f10, float f11, float f12) {
        return Math.max(Math.max(f10, f11), f12);
    }

    @Override // com.google.android.material.timepicker.C2878d
    /* JADX INFO: renamed from: H */
    public void mo13275H(int i10) {
        if (i10 != m13313G()) {
            super.mo13275H(i10);
            this.f10670C.m13294l(m13313G());
        }
    }

    @Override // com.google.android.material.timepicker.C2878d
    /* JADX INFO: renamed from: J */
    public void mo13276J() {
        super.mo13276J();
        for (int i10 = 0; i10 < this.f10674G.size(); i10++) {
            this.f10674G.get(i10).setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m13277P() {
        RectF rectFM13287e = this.f10670C.m13287e();
        TextView textViewM13279R = m13279R(rectFM13287e);
        for (int i10 = 0; i10 < this.f10674G.size(); i10++) {
            TextView textView = this.f10674G.get(i10);
            if (textView != null) {
                textView.setSelected(textView == textViewM13279R);
                textView.getPaint().setShader(m13278Q(rectFM13287e, textView));
                textView.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final RadialGradient m13278Q(RectF rectF, TextView textView) {
        textView.getHitRect(this.f10671D);
        this.f10672E.set(this.f10671D);
        textView.getLineBounds(0, this.f10673F);
        RectF rectF2 = this.f10672E;
        Rect rect = this.f10673F;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.f10672E)) {
            return new RadialGradient(rectF.centerX() - this.f10672E.left, rectF.centerY() - this.f10672E.top, rectF.width() * 0.5f, this.f10676I, this.f10677J, Shader.TileMode.CLAMP);
        }
        return null;
    }

    /* JADX INFO: renamed from: R */
    public final TextView m13279R(RectF rectF) {
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i10 = 0; i10 < this.f10674G.size(); i10++) {
            TextView textView2 = this.f10674G.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(this.f10671D);
                this.f10672E.set(this.f10671D);
                this.f10672E.union(rectF);
                float fWidth = this.f10672E.width() * this.f10672E.height();
                if (fWidth < f10) {
                    textView = textView2;
                    f10 = fWidth;
                }
            }
        }
        return textView;
    }

    /* JADX INFO: renamed from: T */
    public void m13280T(String[] strArr, int i10) {
        this.f10682O = strArr;
        m13281U(i10);
    }

    /* JADX INFO: renamed from: U */
    public final void m13281U(int i10) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.f10674G.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < Math.max(this.f10682O.length, size); i11++) {
            TextView textView = this.f10674G.get(i11);
            if (i11 >= this.f10682O.length) {
                removeView(textView);
                this.f10674G.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(C6744h.f26065g, (ViewGroup) this, false);
                    this.f10674G.put(i11, textView);
                    addView(textView);
                }
                textView.setText(this.f10682O[i11]);
                textView.setTag(C6742f.f26047r, Integer.valueOf(i11));
                int i12 = (i11 / 12) + 1;
                textView.setTag(C6742f.f26042m, Integer.valueOf(i12));
                if (i12 > 1) {
                    z10 = true;
                }
                C0625o0.m3040m0(textView, this.f10675H);
                textView.setTextColor(this.f10684Q);
                if (i10 != 0) {
                    textView.setContentDescription(getResources().getString(i10, this.f10682O[i11]));
                }
            }
        }
        this.f10670C.m13298p(z10);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.InterfaceC2868b
    /* JADX INFO: renamed from: a */
    public void mo13282a(float f10, boolean z10) {
        if (Math.abs(this.f10683P - f10) > 0.001f) {
            this.f10683P = f10;
            m13277P();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C13017p.m48342O0(accessibilityNodeInfo).m48412n0(C13017p.f.m48453b(1, this.f10682O.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        m13277P();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iM13274S = (int) (this.f10681N / m13274S(this.f10679L / displayMetrics.heightPixels, this.f10680M / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iM13274S, 1073741824);
        setMeasuredDimension(iM13274S, iM13274S);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f10671D = new Rect();
        this.f10672E = new RectF();
        this.f10673F = new Rect();
        this.f10674G = new SparseArray<>();
        this.f10677J = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6747k.f26446i1, i10, C6746j.f26107C);
        Resources resources = getResources();
        ColorStateList colorStateListM23736a = C5050c.m23736a(context, typedArrayObtainStyledAttributes, C6747k.f26464k1);
        this.f10684Q = colorStateListM23736a;
        LayoutInflater.from(context).inflate(C6744h.f26066h, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(C6742f.f26041l);
        this.f10670C = clockHandView;
        this.f10678K = resources.getDimensionPixelSize(C6740d.f25990w);
        int colorForState = colorStateListM23736a.getColorForState(new int[]{R.attr.state_selected}, colorStateListM23736a.getDefaultColor());
        this.f10676I = new int[]{colorForState, colorForState, colorStateListM23736a.getDefaultColor()};
        clockHandView.m13284b(this);
        int defaultColor = C7399a.m30678a(context, C6739c.f25925f).getDefaultColor();
        ColorStateList colorStateListM23736a2 = C5050c.m23736a(context, typedArrayObtainStyledAttributes, C6747k.f26455j1);
        setBackgroundColor(colorStateListM23736a2 != null ? colorStateListM23736a2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC2865a());
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.f10675H = new C2866b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        m13280T(strArr, 0);
        this.f10679L = resources.getDimensionPixelSize(C6740d.f25941L);
        this.f10680M = resources.getDimensionPixelSize(C6740d.f25942M);
        this.f10681N = resources.getDimensionPixelSize(C6740d.f25992y);
    }
}
