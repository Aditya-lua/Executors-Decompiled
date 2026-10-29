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
import q.a0;
import q.a1;
import q.g1;
import q.k0;
import q.n;
import q.v0;

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
    public final a0 O;

    @NonNull
    public n P;
    public b Q;
    public final Rect R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f1184a;
    public ColorStateList b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f1185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f1188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f1189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f1190h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1191i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1192j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1193k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1194l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1195m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1196n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f1197o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f1198p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f1199q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f1200r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1201s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1202t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f1203u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f1204v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f1205w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public VelocityTracker f1206x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1207y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f1208z;

    public class a extends Property<SwitchCompat, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f1208z);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f10) {
            switchCompat.setThumbPosition(f10.floatValue());
        }
    }

    public static class b extends androidx.emoji2.text.c.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Reference<SwitchCompat> f1209a;

        public b(SwitchCompat switchCompat) {
            this.f1209a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.c.f
        public void a(Throwable th2) {
            SwitchCompat switchCompat = this.f1209a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }

        @Override // androidx.emoji2.text.c.f
        public void b() {
            SwitchCompat switchCompat = this.f1209a.get();
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
        return this.f1208z > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((g1.b(this) ? 1.0f - this.f1208z : this.f1208z) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f1188f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.R;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f1184a;
        Rect rectD = drawable2 != null ? k0.d(drawable2) : k0.f29006c;
        return ((((this.A - this.C) - rect.left) - rect.right) - rectD.left) - rectD.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f1199q = charSequence;
        this.f1200r = g(charSequence);
        this.L = null;
        if (this.f1201s) {
            p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f1197o = charSequence;
        this.f1198p = g(charSequence);
        this.K = null;
        if (this.f1201s) {
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
        Drawable drawable = this.f1184a;
        if (drawable != null) {
            if (this.f1186d || this.f1187e) {
                Drawable drawableMutate = q2.a.r(drawable).mutate();
                this.f1184a = drawableMutate;
                if (this.f1186d) {
                    q2.a.o(drawableMutate, this.b);
                }
                if (this.f1187e) {
                    q2.a.p(this.f1184a, this.f1185c);
                }
                if (this.f1184a.isStateful()) {
                    this.f1184a.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        Drawable drawable = this.f1188f;
        if (drawable != null) {
            if (this.f1191i || this.f1192j) {
                Drawable drawableMutate = q2.a.r(drawable).mutate();
                this.f1188f = drawableMutate;
                if (this.f1191i) {
                    q2.a.o(drawableMutate, this.f1189g);
                }
                if (this.f1192j) {
                    q2.a.p(this.f1188f, this.f1190h);
                }
                if (this.f1188f.isStateful()) {
                    this.f1188f.setState(getDrawableState());
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
        Drawable drawable = this.f1184a;
        Rect rectD = drawable != null ? k0.d(drawable) : k0.f29006c;
        Drawable drawable2 = this.f1188f;
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
                this.f1188f.setBounds(i12, i10, i14, i11);
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f1188f.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f1184a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i24 = thumbOffset - rect.left;
            int i25 = thumbOffset + this.C + rect.right;
            this.f1184a.setBounds(i24, i13, i25, i15);
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
        Drawable drawable = this.f1184a;
        if (drawable != null) {
            q2.a.k(drawable, f10, f11);
        }
        Drawable drawable2 = this.f1188f;
        if (drawable2 != null) {
            q2.a.k(drawable2, f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1184a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f1188f;
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
        if (!g1.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1195m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (g1.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1195m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i.u(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f1201s;
    }

    public boolean getSplitTrack() {
        return this.f1196n;
    }

    public int getSwitchMinWidth() {
        return this.f1194l;
    }

    public int getSwitchPadding() {
        return this.f1195m;
    }

    public CharSequence getTextOff() {
        return this.f1199q;
    }

    public CharSequence getTextOn() {
        return this.f1197o;
    }

    public Drawable getThumbDrawable() {
        return this.f1184a;
    }

    public final float getThumbPosition() {
        return this.f1208z;
    }

    public int getThumbTextPadding() {
        return this.f1193k;
    }

    public ColorStateList getThumbTintList() {
        return this.b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1185c;
    }

    public Drawable getTrackDrawable() {
        return this.f1188f;
    }

    public ColorStateList getTrackTintList() {
        return this.f1189g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1190h;
    }

    public final boolean h(float f10, float f11) {
        if (this.f1184a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f1184a.getPadding(this.R);
        int i10 = this.E;
        int i11 = this.f1203u;
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
        setTextOnInternal(this.f1197o);
        setTextOffInternal(this.f1199q);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1184a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1188f;
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
            CharSequence string = this.f1199q;
            if (string == null) {
                string = getResources().getString(h.f20001d);
            }
            o0.E0(this, string);
        }
    }

    public final void l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f1197o;
            if (string == null) {
                string = getResources().getString(h.f20002e);
            }
            o0.E0(this, string);
        }
    }

    public void m(Context context, int i10) {
        a1 a1VarT = a1.t(context, i10, j.U2);
        ColorStateList colorStateListC = a1VarT.c(j.Y2);
        if (colorStateListC != null) {
            this.J = colorStateListC;
        } else {
            this.J = getTextColors();
        }
        int iF = a1VarT.f(j.V2, 0);
        if (iF != 0) {
            float f10 = iF;
            if (f10 != this.I.getTextSize()) {
                this.I.setTextSize(f10);
                requestLayout();
            }
        }
        o(a1VarT.k(j.W2, -1), a1VarT.k(j.X2, -1));
        if (a1VarT.a(j.f20036d3, false)) {
            this.M = new n.a(getContext());
        } else {
            this.M = null;
        }
        setTextOnInternal(this.f1197o);
        setTextOffInternal(this.f1199q);
        a1VarT.x();
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
        Drawable drawable = this.f1188f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.E;
        int i11 = this.G;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f1184a;
        if (drawable != null) {
            if (!this.f1196n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectD = k0.d(drawable2);
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
            CharSequence charSequence = isChecked() ? this.f1197o : this.f1199q;
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
        if (this.f1184a != null) {
            Rect rect = this.R;
            Drawable drawable = this.f1188f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectD = k0.d(this.f1184a);
            iMax = Math.max(0, rectD.left - rect.left);
            iMax2 = Math.max(0, rectD.right - rect.right);
        } else {
            iMax = 0;
        }
        if (g1.b(this)) {
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
        if (this.f1201s) {
            if (this.K == null) {
                this.K = i(this.f1198p);
            }
            if (this.L == null) {
                this.L = i(this.f1200r);
            }
        }
        Rect rect = this.R;
        Drawable drawable = this.f1184a;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f1184a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f1184a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.C = Math.max(this.f1201s ? Math.max(this.K.getWidth(), this.L.getWidth()) + (this.f1193k * 2) : 0, intrinsicWidth);
        Drawable drawable2 = this.f1188f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f1188f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f1184a;
        if (drawable3 != null) {
            Rect rectD = k0.d(drawable3);
            iMax = Math.max(iMax, rectD.left);
            iMax2 = Math.max(iMax2, rectD.right);
        }
        int iMax3 = this.H ? Math.max(this.f1194l, (this.C * 2) + iMax + iMax2) : this.f1194l;
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
        CharSequence charSequence = isChecked() ? this.f1197o : this.f1199q;
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
        this.f1206x.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (isEnabled() && h(x10, y10)) {
                this.f1202t = 1;
                this.f1204v = x10;
                this.f1205w = y10;
            }
        } else if (actionMasked == 1) {
            if (this.f1202t == 2) {
                q(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f1202t = 0;
            this.f1206x.clear();
        } else if (actionMasked == 2) {
            int i10 = this.f1202t;
            if (i10 == 1) {
                float x11 = motionEvent.getX();
                float y11 = motionEvent.getY();
                if (Math.abs(x11 - this.f1204v) > this.f1203u || Math.abs(y11 - this.f1205w) > this.f1203u) {
                    this.f1202t = 2;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.f1204v = x11;
                    this.f1205w = y11;
                    return true;
                }
            } else if (i10 == 2) {
                float x12 = motionEvent.getX();
                int thumbScrollRange = getThumbScrollRange();
                float f11 = x12 - this.f1204v;
                if (thumbScrollRange != 0) {
                    f10 = f11 / thumbScrollRange;
                } else {
                    f10 = f11 > 0.0f ? 1.0f : -1.0f;
                }
                if (g1.b(this)) {
                    f10 = -f10;
                }
                float f12 = f(this.f1208z + f10, 0.0f, 1.0f);
                if (f12 != this.f1208z) {
                    this.f1204v = x12;
                    setThumbPosition(f12);
                }
                return true;
            }
        } else if (actionMasked == 3) {
            if (this.f1202t == 2) {
                q(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f1202t = 0;
            this.f1206x.clear();
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
        this.f1202t = 0;
        boolean targetCheckedState = true;
        boolean z10 = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z10) {
            this.f1206x.computeCurrentVelocity(1000);
            float xVelocity = this.f1206x.getXVelocity();
            if (Math.abs(xVelocity) <= this.f1207y) {
                targetCheckedState = getTargetCheckedState();
            } else if (!g1.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
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
        setTextOnInternal(this.f1197o);
        setTextOffInternal(this.f1199q);
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
        if (this.f1201s != z10) {
            this.f1201s = z10;
            requestLayout();
            if (z10) {
                p();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f1196n = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f1194l = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f1195m = i10;
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
        Drawable drawable2 = this.f1184a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1184a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f10) {
        this.f1208z = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(k.a.b(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f1193k = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.f1186d = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1185c = mode;
        this.f1187e = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1188f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1188f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(k.a.b(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1189g = colorStateList;
        this.f1191i = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1190h = mode;
        this.f1192j = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1184a || drawable == this.f1188f;
    }

    public SwitchCompat(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.b = null;
        this.f1185c = null;
        this.f1186d = false;
        this.f1187e = false;
        this.f1189g = null;
        this.f1190h = null;
        this.f1191i = false;
        this.f1192j = false;
        this.f1206x = VelocityTracker.obtain();
        this.H = true;
        this.R = new Rect();
        v0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = j.F2;
        a1 a1VarV = a1.v(context, attributeSet, iArr, i10, 0);
        o0.k0(this, context, iArr, attributeSet, a1VarV.r(), i10, 0);
        Drawable drawableG = a1VarV.g(j.I2);
        this.f1184a = drawableG;
        if (drawableG != null) {
            drawableG.setCallback(this);
        }
        Drawable drawableG2 = a1VarV.g(j.R2);
        this.f1188f = drawableG2;
        if (drawableG2 != null) {
            drawableG2.setCallback(this);
        }
        setTextOnInternal(a1VarV.p(j.G2));
        setTextOffInternal(a1VarV.p(j.H2));
        this.f1201s = a1VarV.a(j.J2, true);
        this.f1193k = a1VarV.f(j.O2, 0);
        this.f1194l = a1VarV.f(j.L2, 0);
        this.f1195m = a1VarV.f(j.M2, 0);
        this.f1196n = a1VarV.a(j.K2, false);
        ColorStateList colorStateListC = a1VarV.c(j.P2);
        if (colorStateListC != null) {
            this.b = colorStateListC;
            this.f1186d = true;
        }
        PorterDuff.Mode modeE = k0.e(a1VarV.k(j.Q2, -1), null);
        if (this.f1185c != modeE) {
            this.f1185c = modeE;
            this.f1187e = true;
        }
        if (this.f1186d || this.f1187e) {
            b();
        }
        ColorStateList colorStateListC2 = a1VarV.c(j.S2);
        if (colorStateListC2 != null) {
            this.f1189g = colorStateListC2;
            this.f1191i = true;
        }
        PorterDuff.Mode modeE2 = k0.e(a1VarV.k(j.T2, -1), null);
        if (this.f1190h != modeE2) {
            this.f1190h = modeE2;
            this.f1192j = true;
        }
        if (this.f1191i || this.f1192j) {
            c();
        }
        int iN = a1VarV.n(j.N2, 0);
        if (iN != 0) {
            m(context, iN);
        }
        a0 a0Var = new a0(this);
        this.O = a0Var;
        a0Var.m(attributeSet, i10);
        a1VarV.x();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1203u = viewConfiguration.getScaledTouchSlop();
        this.f1207y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i10);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
