package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.core.view.o0;
import d3.i;
import i.h;
import i.j;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import q.b0;
import q.b1;
import q.h1;
import q.l0;
import q.n;
import q.w0;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final Property<SwitchCompat, Float> S = new a(Float.class, "thumbPos");
    public static final int[] T = {R.attr.state_checked};
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final TextPaint I;
    public ColorStateList J;
    public Layout K;
    public Layout L;
    public TransformationMethod M;
    public ObjectAnimator N;
    public final b0 O;

    @NonNull
    public n P;
    public b Q;
    public final Rect R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f991a;
    public ColorStateList b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f997h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f998i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f999j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1000k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1001l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1002m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1003n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f1004o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f1005p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f1006q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f1007r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1008s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1009t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f1010u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f1011v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f1012w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public VelocityTracker f1013x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1014y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f1015z;

    public class a extends Property<SwitchCompat, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f1015z);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f10) {
            switchCompat.setThumbPosition(f10.floatValue());
        }
    }

    public static class b extends androidx.emoji2.text.c.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Reference<SwitchCompat> f1016a;

        public b(SwitchCompat switchCompat) {
            this.f1016a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.c.f
        public void a(Throwable th2) {
            SwitchCompat switchCompat = this.f1016a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }

        @Override // androidx.emoji2.text.c.f
        public void b() {
            SwitchCompat switchCompat = this.f1016a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }
    }

    public SwitchCompat(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.N);
    }

    public static float f(float f10, float f11, float f12) {
        if (f10 < f11) {
            return f11;
        }
        return f10 > f12 ? f12 : f10;
    }

    @NonNull
    private n getEmojiTextViewHelper() {
        if (this.P == null) {
            this.P = new n(this);
        }
        return this.P;
    }

    private boolean getTargetCheckedState() {
        return this.f1015z > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((h1.b(this) ? 1.0f - this.f1015z : this.f1015z) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f995f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.R;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f991a;
        Rect rectD = drawable2 != null ? l0.d(drawable2) : l0.f29552c;
        return ((((this.A - this.C) - rect.left) - rect.right) - rectD.left) - rectD.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f1006q = charSequence;
        this.f1007r = g(charSequence);
        this.L = null;
        if (this.f1008s) {
            p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f1004o = charSequence;
        this.f1005p = g(charSequence);
        this.K = null;
        if (this.f1008s) {
            p();
        }
    }

    public final void a(boolean z10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, S, z10 ? 1.0f : 0.0f);
        this.N = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.N.setAutoCancel(true);
        this.N.start();
    }

    public final void b() {
        Drawable drawable = this.f991a;
        if (drawable != null) {
            if (this.f993d || this.f994e) {
                Drawable drawableMutate = q2.a.r(drawable).mutate();
                this.f991a = drawableMutate;
                if (this.f993d) {
                    q2.a.o(drawableMutate, this.b);
                }
                if (this.f994e) {
                    q2.a.p(this.f991a, this.f992c);
                }
                if (this.f991a.isStateful()) {
                    this.f991a.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        Drawable drawable = this.f995f;
        if (drawable != null) {
            if (this.f998i || this.f999j) {
                Drawable drawableMutate = q2.a.r(drawable).mutate();
                this.f995f = drawableMutate;
                if (this.f998i) {
                    q2.a.o(drawableMutate, this.f996g);
                }
                if (this.f999j) {
                    q2.a.p(this.f995f, this.f997h);
                }
                if (this.f995f.isStateful()) {
                    this.f995f.setState(getDrawableState());
                }
            }
        }
    }

    public final void d() {
        ObjectAnimator objectAnimator = this.N;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        int i10;
        int i11;
        Rect rect = this.R;
        int i12 = this.D;
        int i13 = this.E;
        int i14 = this.F;
        int i15 = this.G;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f991a;
        Rect rectD = drawable != null ? l0.d(drawable) : l0.f29552c;
        Drawable drawable2 = this.f995f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i16 = rect.left;
            thumbOffset += i16;
            if (rectD != null) {
                int i17 = rectD.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = rectD.top;
                int i19 = rect.top;
                i10 = i18 > i19 ? (i18 - i19) + i13 : i13;
                int i20 = rectD.right;
                int i21 = rect.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = rectD.bottom;
                int i23 = rect.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                }
                this.f995f.setBounds(i12, i10, i14, i11);
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f995f.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f991a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i24 = thumbOffset - rect.left;
            int i25 = thumbOffset + this.C + rect.right;
            this.f991a.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                q2.a.l(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f991a;
        if (drawable != null) {
            q2.a.k(drawable, f10, f11);
        }
        Drawable drawable2 = this.f995f;
        if (drawable2 != null) {
            q2.a.k(drawable2, f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f991a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f995f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public final CharSequence g(CharSequence charSequence) {
        TransformationMethod transformationMethodF = getEmojiTextViewHelper().f(this.M);
        return transformationMethodF != null ? transformationMethodF.getTransformation(charSequence, this) : charSequence;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!h1.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1002m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (h1.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1002m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i.u(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f1008s;
    }

    public boolean getSplitTrack() {
        return this.f1003n;
    }

    public int getSwitchMinWidth() {
        return this.f1001l;
    }

    public int getSwitchPadding() {
        return this.f1002m;
    }

    public CharSequence getTextOff() {
        return this.f1006q;
    }

    public CharSequence getTextOn() {
        return this.f1004o;
    }

    public Drawable getThumbDrawable() {
        return this.f991a;
    }

    public final float getThumbPosition() {
        return this.f1015z;
    }

    public int getThumbTextPadding() {
        return this.f1000k;
    }

    public ColorStateList getThumbTintList() {
        return this.b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f992c;
    }

    public Drawable getTrackDrawable() {
        return this.f995f;
    }

    public ColorStateList getTrackTintList() {
        return this.f996g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f997h;
    }

    public final boolean h(float f10, float f11) {
        if (this.f991a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f991a.getPadding(this.R);
        int i10 = this.E;
        int i11 = this.f1010u;
        int i12 = i10 - i11;
        int i13 = (this.D + thumbOffset) - i11;
        int i14 = this.C + i13;
        Rect rect = this.R;
        return f10 > ((float) i13) && f10 < ((float) (((i14 + rect.left) + rect.right) + i11)) && f11 > ((float) i12) && f11 < ((float) (this.G + i11));
    }

    public final Layout i(CharSequence charSequence) {
        TextPaint textPaint = this.I;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public void j() {
        setTextOnInternal(this.f1004o);
        setTextOffInternal(this.f1006q);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f991a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f995f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.N;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.N.end();
        this.N = null;
    }

    public final void k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f1006q;
            if (string == null) {
                string = getResources().getString(h.f18844d);
            }
            o0.E0(this, string);
        }
    }

    public final void l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f1004o;
            if (string == null) {
                string = getResources().getString(h.f18845e);
            }
            o0.E0(this, string);
        }
    }

    public void m(Context context, int i10) {
        b1 b1VarT = b1.t(context, i10, j.U2);
        ColorStateList colorStateListC = b1VarT.c(j.Y2);
        if (colorStateListC != null) {
            this.J = colorStateListC;
        } else {
            this.J = getTextColors();
        }
        int iF = b1VarT.f(j.V2, 0);
        if (iF != 0) {
            float f10 = iF;
            if (f10 != this.I.getTextSize()) {
                this.I.setTextSize(f10);
                requestLayout();
            }
        }
        o(b1VarT.k(j.W2, -1), b1VarT.k(j.X2, -1));
        if (b1VarT.a(j.f18879d3, false)) {
            this.M = new n.a(getContext());
        } else {
            this.M = null;
        }
        setTextOnInternal(this.f1004o);
        setTextOffInternal(this.f1006q);
        b1VarT.x();
    }

    public void n(Typeface typeface, int i10) {
        if (i10 <= 0) {
            this.I.setFakeBoldText(false);
            this.I.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i10) : Typeface.create(typeface, i10);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int i11 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i10;
            this.I.setFakeBoldText((i11 & 1) != 0);
            this.I.setTextSkewX((i11 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public final void o(int i10, int i11) {
        Typeface typeface;
        if (i10 == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i10 != 2) {
            typeface = i10 != 3 ? null : Typeface.MONOSPACE;
        } else {
            typeface = Typeface.SERIF;
        }
        n(typeface, i11);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, T);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.R;
        Drawable drawable = this.f995f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.E;
        int i11 = this.G;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f991a;
        if (drawable != null) {
            if (!this.f1003n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectD = l0.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectD.left;
                rect.right -= rectD.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.K : this.L;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.J;
            if (colorStateList != null) {
                this.I.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.I.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i12 + i13) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f1004o : this.f1006q;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(text);
            sb2.append(' ');
            sb2.append(charSequence);
            accessibilityNodeInfo.setText(sb2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iMax;
        int width;
        int paddingLeft;
        int i14;
        int paddingTop;
        int height;
        super.onLayout(z10, i10, i11, i12, i13);
        int iMax2 = 0;
        if (this.f991a != null) {
            Rect rect = this.R;
            Drawable drawable = this.f995f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectD = l0.d(this.f991a);
            iMax = Math.max(0, rectD.left - rect.left);
            iMax2 = Math.max(0, rectD.right - rect.right);
        } else {
            iMax = 0;
        }
        if (h1.b(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.A + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.A) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                paddingTop = getPaddingTop();
                i14 = this.B;
            } else {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.B;
            }
            this.D = paddingLeft;
            this.E = paddingTop;
            this.G = height;
            this.F = width;
        }
        int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
        i14 = this.B;
        paddingTop = paddingTop2 - (i14 / 2);
        height = i14 + paddingTop;
        this.D = paddingLeft;
        this.E = paddingTop;
        this.G = height;
        this.F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.f1008s) {
            if (this.K == null) {
                this.K = i(this.f1005p);
            }
            if (this.L == null) {
                this.L = i(this.f1007r);
            }
        }
        Rect rect = this.R;
        Drawable drawable = this.f991a;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f991a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f991a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.C = Math.max(this.f1008s ? Math.max(this.K.getWidth(), this.L.getWidth()) + (this.f1000k * 2) : 0, intrinsicWidth);
        Drawable drawable2 = this.f995f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f995f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f991a;
        if (drawable3 != null) {
            Rect rectD = l0.d(drawable3);
            iMax = Math.max(iMax, rectD.left);
            iMax2 = Math.max(iMax2, rectD.right);
        }
        int iMax3 = this.H ? Math.max(this.f1001l, (this.C * 2) + iMax + iMax2) : this.f1001l;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.A = iMax3;
        this.B = iMax4;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1004o : this.f1006q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0089  */
    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0094  */
    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f10;
        this.f1013x.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x5 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (isEnabled() && h(x5, y10)) {
                this.f1009t = 1;
                this.f1011v = x5;
                this.f1012w = y10;
            }
        } else if (actionMasked == 1) {
            if (this.f1009t == 2) {
                q(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f1009t = 0;
            this.f1013x.clear();
        } else if (actionMasked == 2) {
            int i10 = this.f1009t;
            if (i10 == 1) {
                float x10 = motionEvent.getX();
                float y11 = motionEvent.getY();
                if (Math.abs(x10 - this.f1011v) > this.f1010u || Math.abs(y11 - this.f1012w) > this.f1010u) {
                    this.f1009t = 2;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.f1011v = x10;
                    this.f1012w = y11;
                    return true;
                }
            } else if (i10 == 2) {
                float x11 = motionEvent.getX();
                int thumbScrollRange = getThumbScrollRange();
                float f11 = x11 - this.f1011v;
                if (thumbScrollRange != 0) {
                    f10 = f11 / thumbScrollRange;
                } else {
                    f10 = f11 > 0.0f ? 1.0f : -1.0f;
                }
                if (h1.b(this)) {
                    f10 = -f10;
                }
                float f12 = f(this.f1015z + f10, 0.0f, 1.0f);
                if (f12 != this.f1015z) {
                    this.f1011v = x11;
                    setThumbPosition(f12);
                }
                return true;
            }
        } else if (actionMasked == 3) {
            if (this.f1009t == 2) {
                q(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f1009t = 0;
            this.f1013x.clear();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        if (this.Q == null && this.P.b() && androidx.emoji2.text.c.i()) {
            androidx.emoji2.text.c cVarC = androidx.emoji2.text.c.c();
            int iE = cVarC.e();
            if (iE == 3 || iE == 0) {
                b bVar = new b(this);
                this.Q = bVar;
                cVarC.t(bVar);
            }
        }
    }

    public final void q(MotionEvent motionEvent) {
        this.f1009t = 0;
        boolean targetCheckedState = true;
        boolean z10 = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z10) {
            this.f1013x.computeCurrentVelocity(1000);
            float xVelocity = this.f1013x.getXVelocity();
            if (Math.abs(xVelocity) <= this.f1014y) {
                targetCheckedState = getTargetCheckedState();
            } else if (!h1.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                targetCheckedState = false;
            }
        } else {
            targetCheckedState = zIsChecked;
        }
        if (targetCheckedState != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(targetCheckedState);
        e(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            l();
        } else {
            k();
        }
        if (getWindowToken() != null && isLaidOut()) {
            a(zIsChecked);
        } else {
            d();
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i.v(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
        setTextOnInternal(this.f1004o);
        setTextOffInternal(this.f1006q);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z10) {
        this.H = z10;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.f1008s != z10) {
            this.f1008s = z10;
            requestLayout();
            if (z10) {
                p();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f1003n = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f1001l = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f1002m = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.I.getTypeface() == null || this.I.getTypeface().equals(typeface)) && (this.I.getTypeface() != null || typeface == null)) {
            return;
        }
        this.I.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        k();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f991a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f991a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f10) {
        this.f1015z = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(k.a.b(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f1000k = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.f993d = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f992c = mode;
        this.f994e = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f995f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f995f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(k.a.b(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f996g = colorStateList;
        this.f998i = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f997h = mode;
        this.f999j = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f991a || drawable == this.f995f;
    }

    public SwitchCompat(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.b = null;
        this.f992c = null;
        this.f993d = false;
        this.f994e = false;
        this.f996g = null;
        this.f997h = null;
        this.f998i = false;
        this.f999j = false;
        this.f1013x = VelocityTracker.obtain();
        this.H = true;
        this.R = new Rect();
        w0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        b1 b1VarV = b1.v(context, attributeSet, j.F2, i10, 0);
        o0.k0(this, context, j.F2, attributeSet, b1VarV.r(), i10, 0);
        Drawable drawableG = b1VarV.g(j.I2);
        this.f991a = drawableG;
        if (drawableG != null) {
            drawableG.setCallback(this);
        }
        Drawable drawableG2 = b1VarV.g(j.R2);
        this.f995f = drawableG2;
        if (drawableG2 != null) {
            drawableG2.setCallback(this);
        }
        setTextOnInternal(b1VarV.p(j.G2));
        setTextOffInternal(b1VarV.p(j.H2));
        this.f1008s = b1VarV.a(j.J2, true);
        this.f1000k = b1VarV.f(j.O2, 0);
        this.f1001l = b1VarV.f(j.L2, 0);
        this.f1002m = b1VarV.f(j.M2, 0);
        this.f1003n = b1VarV.a(j.K2, false);
        ColorStateList colorStateListC = b1VarV.c(j.P2);
        if (colorStateListC != null) {
            this.b = colorStateListC;
            this.f993d = true;
        }
        PorterDuff.Mode modeE = l0.e(b1VarV.k(j.Q2, -1), null);
        if (this.f992c != modeE) {
            this.f992c = modeE;
            this.f994e = true;
        }
        if (this.f993d || this.f994e) {
            b();
        }
        ColorStateList colorStateListC2 = b1VarV.c(j.S2);
        if (colorStateListC2 != null) {
            this.f996g = colorStateListC2;
            this.f998i = true;
        }
        PorterDuff.Mode modeE2 = l0.e(b1VarV.k(j.T2, -1), null);
        if (this.f997h != modeE2) {
            this.f997h = modeE2;
            this.f999j = true;
        }
        if (this.f998i || this.f999j) {
            c();
        }
        int iN = b1VarV.n(j.N2, 0);
        if (iN != 0) {
            m(context, iN);
        }
        b0 b0Var = new b0(this);
        this.O = b0Var;
        b0Var.m(attributeSet, i10);
        b1VarV.x();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1010u = viewConfiguration.getScaledTouchSlop();
        this.f1014y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i10);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
