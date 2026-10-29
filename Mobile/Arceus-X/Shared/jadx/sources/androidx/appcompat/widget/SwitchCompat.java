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
import androidx.core.view.C0625o0;
import androidx.emoji2.text.C0900c;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import p066d3.C4431i;
import p181i.C6589a;
import p181i.C6596h;
import p181i.C6598j;
import p232k.C7399a;
import p295n.C8717a;
import p365q.C10356a0;
import p365q.C10357a1;
import p365q.C10375g1;
import p365q.C10384k0;
import p365q.C10389n;
import p365q.C10406v0;
import p368q2.C10425a;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* JADX INFO: renamed from: S */
    public static final Property<SwitchCompat, Float> f1534S = new C0471a(Float.class, "thumbPos");

    /* JADX INFO: renamed from: T */
    public static final int[] f1535T = {R.attr.state_checked};

    /* JADX INFO: renamed from: A */
    public int f1536A;

    /* JADX INFO: renamed from: B */
    public int f1537B;

    /* JADX INFO: renamed from: C */
    public int f1538C;

    /* JADX INFO: renamed from: D */
    public int f1539D;

    /* JADX INFO: renamed from: E */
    public int f1540E;

    /* JADX INFO: renamed from: F */
    public int f1541F;

    /* JADX INFO: renamed from: G */
    public int f1542G;

    /* JADX INFO: renamed from: H */
    public boolean f1543H;

    /* JADX INFO: renamed from: I */
    public final TextPaint f1544I;

    /* JADX INFO: renamed from: J */
    public ColorStateList f1545J;

    /* JADX INFO: renamed from: K */
    public Layout f1546K;

    /* JADX INFO: renamed from: L */
    public Layout f1547L;

    /* JADX INFO: renamed from: M */
    public TransformationMethod f1548M;

    /* JADX INFO: renamed from: N */
    public ObjectAnimator f1549N;

    /* JADX INFO: renamed from: O */
    public final C10356a0 f1550O;

    /* JADX INFO: renamed from: P */
    @NonNull
    public C10389n f1551P;

    /* JADX INFO: renamed from: Q */
    public C0472b f1552Q;

    /* JADX INFO: renamed from: R */
    public final Rect f1553R;

    /* JADX INFO: renamed from: a */
    public Drawable f1554a;

    /* JADX INFO: renamed from: b */
    public ColorStateList f1555b;

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode f1556c;

    /* JADX INFO: renamed from: d */
    public boolean f1557d;

    /* JADX INFO: renamed from: e */
    public boolean f1558e;

    /* JADX INFO: renamed from: f */
    public Drawable f1559f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f1560g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f1561h;

    /* JADX INFO: renamed from: i */
    public boolean f1562i;

    /* JADX INFO: renamed from: j */
    public boolean f1563j;

    /* JADX INFO: renamed from: k */
    public int f1564k;

    /* JADX INFO: renamed from: l */
    public int f1565l;

    /* JADX INFO: renamed from: m */
    public int f1566m;

    /* JADX INFO: renamed from: n */
    public boolean f1567n;

    /* JADX INFO: renamed from: o */
    public CharSequence f1568o;

    /* JADX INFO: renamed from: p */
    public CharSequence f1569p;

    /* JADX INFO: renamed from: q */
    public CharSequence f1570q;

    /* JADX INFO: renamed from: r */
    public CharSequence f1571r;

    /* JADX INFO: renamed from: s */
    public boolean f1572s;

    /* JADX INFO: renamed from: t */
    public int f1573t;

    /* JADX INFO: renamed from: u */
    public int f1574u;

    /* JADX INFO: renamed from: v */
    public float f1575v;

    /* JADX INFO: renamed from: w */
    public float f1576w;

    /* JADX INFO: renamed from: x */
    public VelocityTracker f1577x;

    /* JADX INFO: renamed from: y */
    public int f1578y;

    /* JADX INFO: renamed from: z */
    public float f1579z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.SwitchCompat$a */
    public class C0471a extends Property<SwitchCompat, Float> {
        public C0471a(Class cls, String str) {
            super(cls, str);
        }

        /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f1579z);
        }

        /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f10) {
            switchCompat.setThumbPosition(f10.floatValue());
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SwitchCompat$b */
    public static class C0472b extends C0900c.f {

        /* JADX INFO: renamed from: a */
        public final Reference<SwitchCompat> f1580a;

        public C0472b(SwitchCompat switchCompat) {
            this.f1580a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.C0900c.f
        /* JADX INFO: renamed from: a */
        public void mo1889a(Throwable th2) {
            SwitchCompat switchCompat = this.f1580a.get();
            if (switchCompat != null) {
                switchCompat.m1879j();
            }
        }

        @Override // androidx.emoji2.text.C0900c.f
        /* JADX INFO: renamed from: b */
        public void mo1890b() {
            SwitchCompat switchCompat = this.f1580a.get();
            if (switchCompat != null) {
                switchCompat.m1879j();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SwitchCompat(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6589a.f25018N);
    }

    /* JADX INFO: renamed from: f */
    public static float m1870f(float f10, float f11, float f12) {
        if (f10 < f11) {
            return f11;
        }
        return f10 > f12 ? f12 : f10;
    }

    @NonNull
    private C10389n getEmojiTextViewHelper() {
        if (this.f1551P == null) {
            this.f1551P = new C10389n(this);
        }
        return this.f1551P;
    }

    private boolean getTargetCheckedState() {
        return this.f1579z > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((C10375g1.m39840b(this) ? 1.0f - this.f1579z : this.f1579z) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f1559f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f1553R;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f1554a;
        Rect rectM39886d = drawable2 != null ? C10384k0.m39886d(drawable2) : C10384k0.f37343c;
        return ((((this.f1536A - this.f1538C) - rect.left) - rect.right) - rectM39886d.left) - rectM39886d.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f1570q = charSequence;
        this.f1571r = m1876g(charSequence);
        this.f1547L = null;
        if (this.f1572s) {
            m1885p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f1568o = charSequence;
        this.f1569p = m1876g(charSequence);
        this.f1546K = null;
        if (this.f1572s) {
            m1885p();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1871a(boolean z10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f1534S, z10 ? 1.0f : 0.0f);
        this.f1549N = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.f1549N.setAutoCancel(true);
        this.f1549N.start();
    }

    /* JADX INFO: renamed from: b */
    public final void m1872b() {
        Drawable drawable = this.f1554a;
        if (drawable != null) {
            if (this.f1557d || this.f1558e) {
                Drawable drawableMutate = C10425a.m40121r(drawable).mutate();
                this.f1554a = drawableMutate;
                if (this.f1557d) {
                    C10425a.m40118o(drawableMutate, this.f1555b);
                }
                if (this.f1558e) {
                    C10425a.m40119p(this.f1554a, this.f1556c);
                }
                if (this.f1554a.isStateful()) {
                    this.f1554a.setState(getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1873c() {
        Drawable drawable = this.f1559f;
        if (drawable != null) {
            if (this.f1562i || this.f1563j) {
                Drawable drawableMutate = C10425a.m40121r(drawable).mutate();
                this.f1559f = drawableMutate;
                if (this.f1562i) {
                    C10425a.m40118o(drawableMutate, this.f1560g);
                }
                if (this.f1563j) {
                    C10425a.m40119p(this.f1559f, this.f1561h);
                }
                if (this.f1559f.isStateful()) {
                    this.f1559f.setState(getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1874d() {
        ObjectAnimator objectAnimator = this.f1549N;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        int i10;
        int i11;
        Rect rect = this.f1553R;
        int i12 = this.f1539D;
        int i13 = this.f1540E;
        int i14 = this.f1541F;
        int i15 = this.f1542G;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f1554a;
        Rect rectM39886d = drawable != null ? C10384k0.m39886d(drawable) : C10384k0.f37343c;
        Drawable drawable2 = this.f1559f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i16 = rect.left;
            thumbOffset += i16;
            if (rectM39886d != null) {
                int i17 = rectM39886d.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = rectM39886d.top;
                int i19 = rect.top;
                i10 = i18 > i19 ? (i18 - i19) + i13 : i13;
                int i20 = rectM39886d.right;
                int i21 = rect.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = rectM39886d.bottom;
                int i23 = rect.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                }
                this.f1559f.setBounds(i12, i10, i14, i11);
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f1559f.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f1554a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i24 = thumbOffset - rect.left;
            int i25 = thumbOffset + this.f1538C + rect.right;
            this.f1554a.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                C10425a.m40115l(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f1554a;
        if (drawable != null) {
            C10425a.m40114k(drawable, f10, f11);
        }
        Drawable drawable2 = this.f1559f;
        if (drawable2 != null) {
            C10425a.m40114k(drawable2, f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1554a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f1559f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1875e(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    /* JADX INFO: renamed from: g */
    public final CharSequence m1876g(CharSequence charSequence) {
        TransformationMethod transformationMethodM39929f = getEmojiTextViewHelper().m39929f(this.f1548M);
        return transformationMethodM39929f != null ? transformationMethodM39929f.getTransformation(charSequence, this) : charSequence;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!C10375g1.m39840b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1536A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1566m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (C10375g1.m39840b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1536A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1566m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C4431i.m22314u(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f1572s;
    }

    public boolean getSplitTrack() {
        return this.f1567n;
    }

    public int getSwitchMinWidth() {
        return this.f1565l;
    }

    public int getSwitchPadding() {
        return this.f1566m;
    }

    public CharSequence getTextOff() {
        return this.f1570q;
    }

    public CharSequence getTextOn() {
        return this.f1568o;
    }

    public Drawable getThumbDrawable() {
        return this.f1554a;
    }

    public final float getThumbPosition() {
        return this.f1579z;
    }

    public int getThumbTextPadding() {
        return this.f1564k;
    }

    public ColorStateList getThumbTintList() {
        return this.f1555b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1556c;
    }

    public Drawable getTrackDrawable() {
        return this.f1559f;
    }

    public ColorStateList getTrackTintList() {
        return this.f1560g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1561h;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m1877h(float f10, float f11) {
        if (this.f1554a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f1554a.getPadding(this.f1553R);
        int i10 = this.f1540E;
        int i11 = this.f1574u;
        int i12 = i10 - i11;
        int i13 = (this.f1539D + thumbOffset) - i11;
        int i14 = this.f1538C + i13;
        Rect rect = this.f1553R;
        return f10 > ((float) i13) && f10 < ((float) (((i14 + rect.left) + rect.right) + i11)) && f11 > ((float) i12) && f11 < ((float) (this.f1542G + i11));
    }

    /* JADX INFO: renamed from: i */
    public final Layout m1878i(CharSequence charSequence) {
        TextPaint textPaint = this.f1544I;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* JADX INFO: renamed from: j */
    public void m1879j() {
        setTextOnInternal(this.f1568o);
        setTextOffInternal(this.f1570q);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1554a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1559f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1549N;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f1549N.end();
        this.f1549N = null;
    }

    /* JADX INFO: renamed from: k */
    public final void m1880k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f1570q;
            if (string == null) {
                string = getResources().getString(C6596h.f25184d);
            }
            C0625o0.m2987E0(this, string);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1881l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f1568o;
            if (string == null) {
                string = getResources().getString(C6596h.f25185e);
            }
            C0625o0.m2987E0(this, string);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m1882m(Context context, int i10) {
        C10357a1 c10357a1M39726t = C10357a1.m39726t(context, i10, C6598j.f25305U2);
        ColorStateList colorStateListM39731c = c10357a1M39726t.m39731c(C6598j.f25321Y2);
        if (colorStateListM39731c != null) {
            this.f1545J = colorStateListM39731c;
        } else {
            this.f1545J = getTextColors();
        }
        int iM39734f = c10357a1M39726t.m39734f(C6598j.f25309V2, 0);
        if (iM39734f != 0) {
            float f10 = iM39734f;
            if (f10 != this.f1544I.getTextSize()) {
                this.f1544I.setTextSize(f10);
                requestLayout();
            }
        }
        m1884o(c10357a1M39726t.m39739k(C6598j.f25313W2, -1), c10357a1M39726t.m39739k(C6598j.f25317X2, -1));
        if (c10357a1M39726t.m39729a(C6598j.f25345d3, false)) {
            this.f1548M = new C8717a(getContext());
        } else {
            this.f1548M = null;
        }
        setTextOnInternal(this.f1568o);
        setTextOffInternal(this.f1570q);
        c10357a1M39726t.m39749x();
    }

    /* JADX INFO: renamed from: n */
    public void m1883n(Typeface typeface, int i10) {
        if (i10 <= 0) {
            this.f1544I.setFakeBoldText(false);
            this.f1544I.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i10) : Typeface.create(typeface, i10);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int i11 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i10;
            this.f1544I.setFakeBoldText((i11 & 1) != 0);
            this.f1544I.setTextSkewX((i11 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m1884o(int i10, int i11) {
        Typeface typeface;
        if (i10 == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i10 != 2) {
            typeface = i10 != 3 ? null : Typeface.MONOSPACE;
        } else {
            typeface = Typeface.SERIF;
        }
        m1883n(typeface, i11);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f1535T);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f1553R;
        Drawable drawable = this.f1559f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.f1540E;
        int i11 = this.f1542G;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f1554a;
        if (drawable != null) {
            if (!this.f1567n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectM39886d = C10384k0.m39886d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectM39886d.left;
                rect.right -= rectM39886d.right;
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
        Layout layout = getTargetCheckedState() ? this.f1546K : this.f1547L;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f1545J;
            if (colorStateList != null) {
                this.f1544I.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f1544I.drawableState = drawableState;
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
            CharSequence charSequence = isChecked() ? this.f1568o : this.f1570q;
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
        if (this.f1554a != null) {
            Rect rect = this.f1553R;
            Drawable drawable = this.f1559f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectM39886d = C10384k0.m39886d(this.f1554a);
            iMax = Math.max(0, rectM39886d.left - rect.left);
            iMax2 = Math.max(0, rectM39886d.right - rect.right);
        } else {
            iMax = 0;
        }
        if (C10375g1.m39840b(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f1536A + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f1536A) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                paddingTop = getPaddingTop();
                i14 = this.f1537B;
            } else {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.f1537B;
            }
            this.f1539D = paddingLeft;
            this.f1540E = paddingTop;
            this.f1542G = height;
            this.f1541F = width;
        }
        int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
        i14 = this.f1537B;
        paddingTop = paddingTop2 - (i14 / 2);
        height = i14 + paddingTop;
        this.f1539D = paddingLeft;
        this.f1540E = paddingTop;
        this.f1542G = height;
        this.f1541F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.f1572s) {
            if (this.f1546K == null) {
                this.f1546K = m1878i(this.f1569p);
            }
            if (this.f1547L == null) {
                this.f1547L = m1878i(this.f1571r);
            }
        }
        Rect rect = this.f1553R;
        Drawable drawable = this.f1554a;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f1554a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f1554a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.f1538C = Math.max(this.f1572s ? Math.max(this.f1546K.getWidth(), this.f1547L.getWidth()) + (this.f1564k * 2) : 0, intrinsicWidth);
        Drawable drawable2 = this.f1559f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f1559f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f1554a;
        if (drawable3 != null) {
            Rect rectM39886d = C10384k0.m39886d(drawable3);
            iMax = Math.max(iMax, rectM39886d.left);
            iMax2 = Math.max(iMax2, rectM39886d.right);
        }
        int iMax3 = this.f1543H ? Math.max(this.f1565l, (this.f1538C * 2) + iMax + iMax2) : this.f1565l;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f1536A = iMax3;
        this.f1537B = iMax4;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1568o : this.f1570q;
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
        this.f1577x.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (isEnabled() && m1877h(x10, y10)) {
                this.f1573t = 1;
                this.f1575v = x10;
                this.f1576w = y10;
            }
        } else if (actionMasked == 1) {
            if (this.f1573t == 2) {
                m1886q(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f1573t = 0;
            this.f1577x.clear();
        } else if (actionMasked == 2) {
            int i10 = this.f1573t;
            if (i10 == 1) {
                float x11 = motionEvent.getX();
                float y11 = motionEvent.getY();
                if (Math.abs(x11 - this.f1575v) > this.f1574u || Math.abs(y11 - this.f1576w) > this.f1574u) {
                    this.f1573t = 2;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.f1575v = x11;
                    this.f1576w = y11;
                    return true;
                }
            } else if (i10 == 2) {
                float x12 = motionEvent.getX();
                int thumbScrollRange = getThumbScrollRange();
                float f11 = x12 - this.f1575v;
                if (thumbScrollRange != 0) {
                    f10 = f11 / thumbScrollRange;
                } else {
                    f10 = f11 > 0.0f ? 1.0f : -1.0f;
                }
                if (C10375g1.m39840b(this)) {
                    f10 = -f10;
                }
                float fM1870f = m1870f(this.f1579z + f10, 0.0f, 1.0f);
                if (fM1870f != this.f1579z) {
                    this.f1575v = x12;
                    setThumbPosition(fM1870f);
                }
                return true;
            }
        } else if (actionMasked == 3) {
            if (this.f1573t == 2) {
                m1886q(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f1573t = 0;
            this.f1577x.clear();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: p */
    public final void m1885p() {
        if (this.f1552Q == null && this.f1551P.m39925b() && C0900c.m4274i()) {
            C0900c c0900cM4270c = C0900c.m4270c();
            int iM4276e = c0900cM4270c.m4276e();
            if (iM4276e == 3 || iM4276e == 0) {
                C0472b c0472b = new C0472b(this);
                this.f1552Q = c0472b;
                c0900cM4270c.m4287t(c0472b);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m1886q(MotionEvent motionEvent) {
        this.f1573t = 0;
        boolean targetCheckedState = true;
        boolean z10 = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z10) {
            this.f1577x.computeCurrentVelocity(1000);
            float xVelocity = this.f1577x.getXVelocity();
            if (Math.abs(xVelocity) <= this.f1578y) {
                targetCheckedState = getTargetCheckedState();
            } else if (!C10375g1.m39840b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                targetCheckedState = false;
            }
        } else {
            targetCheckedState = zIsChecked;
        }
        if (targetCheckedState != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(targetCheckedState);
        m1875e(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().m39927d(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            m1881l();
        } else {
            m1880k();
        }
        if (getWindowToken() != null && isLaidOut()) {
            m1871a(zIsChecked);
        } else {
            m1874d();
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C4431i.m22315v(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().m39928e(z10);
        setTextOnInternal(this.f1568o);
        setTextOffInternal(this.f1570q);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z10) {
        this.f1543H = z10;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m39924a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.f1572s != z10) {
            this.f1572s = z10;
            requestLayout();
            if (z10) {
                m1885p();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f1567n = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f1565l = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f1566m = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f1544I.getTypeface() == null || this.f1544I.getTypeface().equals(typeface)) && (this.f1544I.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f1544I.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        m1880k();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            m1881l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1554a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1554a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f10) {
        this.f1579z = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(C7399a.m30679b(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f1564k = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1555b = colorStateList;
        this.f1557d = true;
        m1872b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1556c = mode;
        this.f1558e = true;
        m1872b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1559f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1559f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(C7399a.m30679b(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1560g = colorStateList;
        this.f1562i = true;
        m1873c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1561h = mode;
        this.f1563j = true;
        m1873c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1554a || drawable == this.f1559f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public SwitchCompat(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1555b = null;
        this.f1556c = null;
        this.f1557d = false;
        this.f1558e = false;
        this.f1560g = null;
        this.f1561h = null;
        this.f1562i = false;
        this.f1563j = false;
        this.f1577x = VelocityTracker.obtain();
        this.f1543H = true;
        this.f1553R = new Rect();
        C10406v0.m40056a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f1544I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = C6598j.f25230F2;
        C10357a1 c10357a1M39728v = C10357a1.m39728v(context, attributeSet, iArr, i10, 0);
        C0625o0.m3036k0(this, context, iArr, attributeSet, c10357a1M39728v.m39746r(), i10, 0);
        Drawable drawableM39735g = c10357a1M39728v.m39735g(C6598j.f25245I2);
        this.f1554a = drawableM39735g;
        if (drawableM39735g != null) {
            drawableM39735g.setCallback(this);
        }
        Drawable drawableM39735g2 = c10357a1M39728v.m39735g(C6598j.f25290R2);
        this.f1559f = drawableM39735g2;
        if (drawableM39735g2 != null) {
            drawableM39735g2.setCallback(this);
        }
        setTextOnInternal(c10357a1M39728v.m39744p(C6598j.f25235G2));
        setTextOffInternal(c10357a1M39728v.m39744p(C6598j.f25240H2));
        this.f1572s = c10357a1M39728v.m39729a(C6598j.f25250J2, true);
        this.f1564k = c10357a1M39728v.m39734f(C6598j.f25275O2, 0);
        this.f1565l = c10357a1M39728v.m39734f(C6598j.f25260L2, 0);
        this.f1566m = c10357a1M39728v.m39734f(C6598j.f25265M2, 0);
        this.f1567n = c10357a1M39728v.m39729a(C6598j.f25255K2, false);
        ColorStateList colorStateListM39731c = c10357a1M39728v.m39731c(C6598j.f25280P2);
        if (colorStateListM39731c != null) {
            this.f1555b = colorStateListM39731c;
            this.f1557d = true;
        }
        PorterDuff.Mode modeM39887e = C10384k0.m39887e(c10357a1M39728v.m39739k(C6598j.f25285Q2, -1), null);
        if (this.f1556c != modeM39887e) {
            this.f1556c = modeM39887e;
            this.f1558e = true;
        }
        if (this.f1557d || this.f1558e) {
            m1872b();
        }
        ColorStateList colorStateListM39731c2 = c10357a1M39728v.m39731c(C6598j.f25295S2);
        if (colorStateListM39731c2 != null) {
            this.f1560g = colorStateListM39731c2;
            this.f1562i = true;
        }
        PorterDuff.Mode modeM39887e2 = C10384k0.m39887e(c10357a1M39728v.m39739k(C6598j.f25300T2, -1), null);
        if (this.f1561h != modeM39887e2) {
            this.f1561h = modeM39887e2;
            this.f1563j = true;
        }
        if (this.f1562i || this.f1563j) {
            m1873c();
        }
        int iM39742n = c10357a1M39728v.m39742n(C6598j.f25270N2, 0);
        if (iM39742n != 0) {
            m1882m(context, iM39742n);
        }
        C10356a0 c10356a0 = new C10356a0(this);
        this.f1550O = c10356a0;
        c10356a0.m39705m(attributeSet, i10);
        c10357a1M39728v.m39749x();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1574u = viewConfiguration.getScaledTouchSlop();
        this.f1578y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().m39926c(attributeSet, i10);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
