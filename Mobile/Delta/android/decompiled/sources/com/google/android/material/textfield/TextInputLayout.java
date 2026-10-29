package com.google.android.material.textfield;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.n;
import androidx.core.view.o0;
import androidx.customview.view.AbsSavedState;
import bd.h;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.mlkit.vision.barcode.common.Barcode;
import gd.k;
import hc.i;
import hc.j;
import java.util.Iterator;
import java.util.LinkedHashSet;
import jd.q;
import jd.t;
import jd.x;
import o5.y;
import q.a1;
import q.b0;
import q.k0;
import y2.p;
import zc.o;
import zc.r;

/* JADX INFO: loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int C0 = j.f18939j;
    public static final int[][] D0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public ColorStateList A;
    public boolean A0;
    public ColorStateList B;
    public boolean B0;
    public boolean C;
    public CharSequence D;
    public boolean E;
    public gd.g F;
    public gd.g G;
    public StateListDrawable H;
    public boolean I;
    public gd.g J;
    public gd.g K;

    @NonNull
    public k L;
    public boolean M;
    public final int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public final Rect V;
    public final Rect W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f8224a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final RectF f8225a0;

    @NonNull
    public final x b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Typeface f8226b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final com.google.android.material.textfield.a f8227c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Drawable f8228c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EditText f8229d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f8230d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f8231e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final LinkedHashSet<f> f8232e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8233f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Drawable f8234f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8235g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f8236g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8237h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public Drawable f8238h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8239i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public ColorStateList f8240i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f8241j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public ColorStateList f8242j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8243k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f8244k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8245l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f8246l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f8247m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f8248m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public e f8249n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public ColorStateList f8250n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f8251o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f8252o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8253p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f8254p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8255q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f8256q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f8257r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f8258r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f8259s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f8260s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f8261t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f8262t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ColorStateList f8263u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f8264u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f8265v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final zc.a f8266v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public o5.e f8267w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f8268w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public o5.e f8269x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f8270x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ColorStateList f8271y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public ValueAnimator f8272y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ColorStateList f8273z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f8274z0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f8275c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f8276d;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @NonNull
        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f8275c) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f8275c, parcel, i10);
            parcel.writeInt(this.f8276d ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8275c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f8276d = parcel.readInt() == 1;
        }
    }

    public class a implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8277a;
        public final /* synthetic */ EditText b;

        public a(EditText editText) {
            this.b = editText;
            this.f8277a = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@NonNull Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.u0(!textInputLayout.A0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f8243k) {
                textInputLayout2.k0(editable);
            }
            if (TextInputLayout.this.f8259s) {
                TextInputLayout.this.y0(editable);
            }
            int lineCount = this.b.getLineCount();
            int i10 = this.f8277a;
            if (lineCount != i10) {
                if (lineCount < i10) {
                    int iA = o0.A(this.b);
                    int i11 = TextInputLayout.this.f8262t0;
                    if (iA != i11) {
                        this.b.setMinimumHeight(i11);
                    }
                }
                this.f8277a = lineCount;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f8227c.h();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            TextInputLayout.this.f8266v0.c0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class d extends androidx.core.view.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextInputLayout f8281d;

        public d(@NonNull TextInputLayout textInputLayout) {
            this.f8281d = textInputLayout;
        }

        @Override // androidx.core.view.a
        public void g(@NonNull View view, @NonNull p pVar) {
            super.g(view, pVar);
            EditText editText = this.f8281d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f8281d.getHint();
            CharSequence error = this.f8281d.getError();
            CharSequence placeholderText = this.f8281d.getPlaceholderText();
            int counterMaxLength = this.f8281d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f8281d.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean zP = this.f8281d.P();
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z10 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : "";
            this.f8281d.b.A(pVar);
            if (!zIsEmpty) {
                pVar.K0(text);
            } else if (!TextUtils.isEmpty(string)) {
                pVar.K0(string);
                if (!zP && placeholderText != null) {
                    pVar.K0(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                pVar.K0(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                pVar.x0(string);
                pVar.H0(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            pVar.z0(counterMaxLength);
            if (z10) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                pVar.s0(error);
            }
            View viewT = this.f8281d.f8241j.t();
            if (viewT != null) {
                pVar.y0(viewT);
            }
            this.f8281d.f8227c.m().o(view, pVar);
        }

        @Override // androidx.core.view.a
        public void h(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            this.f8281d.f8227c.m().p(view, accessibilityEvent);
        }
    }

    public interface e {
        int a(Editable editable);
    }

    public interface f {
        void a(@NonNull TextInputLayout textInputLayout);
    }

    public interface g {
        void a(@NonNull TextInputLayout textInputLayout, int i10);
    }

    public TextInputLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, hc.b.f18780g0);
    }

    public static Drawable H(gd.g gVar, int i10, int i11, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{tc.a.j(i11, i10, 0.1f), i10}), gVar, gVar);
    }

    public static Drawable K(Context context, gd.g gVar, int i10, int[][] iArr) {
        int iC = tc.a.c(context, hc.b.f18790o, "TextInputLayout");
        gd.g gVar2 = new gd.g(gVar.E());
        int iJ = tc.a.j(i10, iC, 0.1f);
        gVar2.a0(new ColorStateList(iArr, new int[]{iJ, 0}));
        gVar2.setTint(iC);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iJ, iC});
        gd.g gVar3 = new gd.g(gVar.E());
        gVar3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
    }

    public static void X(@NonNull ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                X((ViewGroup) childAt, z10);
            }
        }
    }

    public static /* synthetic */ int b(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f8229d;
        if (!(editText instanceof AutoCompleteTextView) || q.a(editText)) {
            return this.F;
        }
        int iD = tc.a.d(this.f8229d, hc.b.f18781h);
        int i10 = this.O;
        if (i10 == 2) {
            return K(getContext(), this.F, iD, D0);
        }
        if (i10 == 1) {
            return H(this.F, this.U, iD, D0);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.H.addState(new int[0], G(false));
        }
        return this.H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.G == null) {
            this.G = G(true);
        }
        return this.G;
    }

    public static void l0(@NonNull Context context, @NonNull TextView textView, int i10, int i11, boolean z10) {
        textView.setContentDescription(context.getString(z10 ? i.f18910c : i.b, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    private void setEditText(EditText editText) {
        if (this.f8229d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f8229d = editText;
        int i10 = this.f8233f;
        if (i10 != -1) {
            setMinEms(i10);
        } else {
            setMinWidth(this.f8237h);
        }
        int i11 = this.f8235g;
        if (i11 != -1) {
            setMaxEms(i11);
        } else {
            setMaxWidth(this.f8239i);
        }
        this.I = false;
        U();
        setTextInputAccessibilityDelegate(new d(this));
        this.f8266v0.i0(this.f8229d.getTypeface());
        this.f8266v0.a0(this.f8229d.getTextSize());
        int i12 = Build.VERSION.SDK_INT;
        this.f8266v0.X(this.f8229d.getLetterSpacing());
        int gravity = this.f8229d.getGravity();
        this.f8266v0.S((gravity & (-113)) | 48);
        this.f8266v0.Z(gravity);
        this.f8262t0 = o0.A(editText);
        this.f8229d.addTextChangedListener(new a(editText));
        if (this.f8240i0 == null) {
            this.f8240i0 = this.f8229d.getHintTextColors();
        }
        if (this.C) {
            if (TextUtils.isEmpty(this.D)) {
                CharSequence hint = this.f8229d.getHint();
                this.f8231e = hint;
                setHint(hint);
                this.f8229d.setHint((CharSequence) null);
            }
            this.E = true;
        }
        if (i12 >= 29) {
            n0();
        }
        if (this.f8251o != null) {
            k0(this.f8229d.getText());
        }
        p0();
        this.f8241j.f();
        this.b.bringToFront();
        this.f8227c.bringToFront();
        C();
        this.f8227c.x0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        v0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.D)) {
            return;
        }
        this.D = charSequence;
        this.f8266v0.g0(charSequence);
        if (this.f8264u0) {
            return;
        }
        V();
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f8259s == z10) {
            return;
        }
        if (z10) {
            j();
        } else {
            Z();
            this.f8261t = null;
        }
        this.f8259s = z10;
    }

    public final o5.e A() {
        o5.e eVar = new o5.e();
        eVar.t0(h.f(getContext(), hc.b.K, 87));
        eVar.v0(h.g(getContext(), hc.b.Q, ic.a.f20471a));
        return eVar;
    }

    public void A0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.F == null || this.O == 0) {
            return;
        }
        boolean z10 = false;
        boolean z11 = isFocused() || ((editText2 = this.f8229d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f8229d) != null && editText.isHovered())) {
            z10 = true;
        }
        if (!isEnabled()) {
            this.T = this.f8260s0;
        } else if (d0()) {
            if (this.f8250n0 != null) {
                z0(z11, z10);
            } else {
                this.T = getErrorCurrentTextColors();
            }
        } else if (!this.f8247m || (textView = this.f8251o) == null) {
            if (z11) {
                this.T = this.f8248m0;
            } else if (z10) {
                this.T = this.f8246l0;
            } else {
                this.T = this.f8244k0;
            }
        } else if (this.f8250n0 != null) {
            z0(z11, z10);
        } else {
            this.T = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            n0();
        }
        this.f8227c.I();
        Y();
        if (this.O == 2) {
            int i10 = this.Q;
            if (z11 && isEnabled()) {
                this.Q = this.S;
            } else {
                this.Q = this.R;
            }
            if (this.Q != i10) {
                W();
            }
        }
        if (this.O == 1) {
            if (!isEnabled()) {
                this.U = this.f8254p0;
            } else if (z10 && !z11) {
                this.U = this.f8258r0;
            } else if (z11) {
                this.U = this.f8256q0;
            } else {
                this.U = this.f8252o0;
            }
        }
        m();
    }

    public final boolean B() {
        return this.C && !TextUtils.isEmpty(this.D) && (this.F instanceof jd.h);
    }

    public final void C() {
        Iterator<f> it = this.f8232e0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    public final void D(Canvas canvas) {
        gd.g gVar;
        if (this.K == null || (gVar = this.J) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.f8229d.isFocused()) {
            Rect bounds = this.K.getBounds();
            Rect bounds2 = this.J.getBounds();
            float fX = this.f8266v0.x();
            int iCenterX = bounds2.centerX();
            bounds.left = ic.a.c(iCenterX, bounds2.left, fX);
            bounds.right = ic.a.c(iCenterX, bounds2.right, fX);
            this.K.draw(canvas);
        }
    }

    public final void E(@NonNull Canvas canvas) {
        if (this.C) {
            this.f8266v0.l(canvas);
        }
    }

    public final void F(boolean z10) {
        ValueAnimator valueAnimator = this.f8272y0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f8272y0.cancel();
        }
        if (z10 && this.f8270x0) {
            l(0.0f);
        } else {
            this.f8266v0.c0(0.0f);
        }
        if (B() && ((jd.h) this.F).q0()) {
            y();
        }
        this.f8264u0 = true;
        L();
        this.b.l(true);
        this.f8227c.H(true);
    }

    public final gd.g G(boolean z10) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(hc.d.f18823g0);
        float f10 = z10 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f8229d;
        float popupElevation = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).getPopupElevation() : getResources().getDimensionPixelOffset(hc.d.f18839r);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(hc.d.f18812a0);
        k kVarM = k.a().A(f10).E(f10).s(dimensionPixelOffset).w(dimensionPixelOffset).m();
        EditText editText2 = this.f8229d;
        gd.g gVarM = gd.g.m(getContext(), popupElevation, editText2 instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText2).getDropDownBackgroundTintList() : null);
        gVarM.setShapeAppearanceModel(kVarM);
        gVarM.c0(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return gVarM;
    }

    public final int I(int i10, boolean z10) {
        int compoundPaddingLeft;
        if (z10 || getPrefixText() == null) {
            compoundPaddingLeft = (!z10 || getSuffixText() == null) ? this.f8229d.getCompoundPaddingLeft() : this.f8227c.y();
        } else {
            compoundPaddingLeft = this.b.c();
        }
        return i10 + compoundPaddingLeft;
    }

    public final int J(int i10, boolean z10) {
        int compoundPaddingRight;
        if (z10 || getSuffixText() == null) {
            compoundPaddingRight = (!z10 || getPrefixText() == null) ? this.f8229d.getCompoundPaddingRight() : this.b.c();
        } else {
            compoundPaddingRight = this.f8227c.y();
        }
        return i10 - compoundPaddingRight;
    }

    public final void L() {
        TextView textView = this.f8261t;
        if (textView == null || !this.f8259s) {
            return;
        }
        textView.setText((CharSequence) null);
        y.a(this.f8224a, this.f8269x);
        this.f8261t.setVisibility(4);
    }

    public boolean M() {
        return this.f8227c.F();
    }

    public boolean N() {
        return this.f8241j.A();
    }

    public boolean O() {
        return this.f8241j.B();
    }

    public final boolean P() {
        return this.f8264u0;
    }

    public final boolean Q() {
        if (d0()) {
            return true;
        }
        return this.f8251o != null && this.f8247m;
    }

    public boolean R() {
        return this.E;
    }

    public final boolean S() {
        return this.O == 1 && this.f8229d.getMinLines() <= 1;
    }

    public boolean T() {
        return this.b.k();
    }

    public final void U() {
        p();
        r0();
        A0();
        h0();
        k();
        if (this.O != 0) {
            t0();
        }
        b0();
    }

    public final void V() {
        if (B()) {
            RectF rectF = this.f8225a0;
            this.f8266v0.o(rectF, this.f8229d.getWidth(), this.f8229d.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            o(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.Q);
            ((jd.h) this.F).t0(rectF);
        }
    }

    public final void W() {
        if (!B() || this.f8264u0) {
            return;
        }
        y();
        V();
    }

    public void Y() {
        this.b.m();
    }

    public final void Z() {
        TextView textView = this.f8261t;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public void a0(float f10, float f11, float f12, float f13) {
        boolean zH = r.h(this);
        this.M = zH;
        float f14 = zH ? f11 : f10;
        if (!zH) {
            f10 = f11;
        }
        float f15 = zH ? f13 : f12;
        if (!zH) {
            f12 = f13;
        }
        gd.g gVar = this.F;
        if (gVar != null && gVar.J() == f14 && this.F.K() == f10 && this.F.s() == f15 && this.F.t() == f12) {
            return;
        }
        this.L = this.L.v().A(f14).E(f10).s(f15).w(f12).m();
        m();
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view, int i10, @NonNull ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f8224a.addView(view, layoutParams2);
        this.f8224a.setLayoutParams(layoutParams);
        t0();
        setEditText((EditText) view);
    }

    public final void b0() {
        EditText editText = this.f8229d;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i10 = this.O;
                if (i10 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i10 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public void c0(@NonNull TextView textView, int i10) {
        try {
            d3.i.s(textView, i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        d3.i.s(textView, j.b);
        textView.setTextColor(l2.b.c(getContext(), hc.c.f18802a));
    }

    public boolean d0() {
        return this.f8241j.l();
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(@NonNull ViewStructure viewStructure, int i10) {
        EditText editText = this.f8229d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f8231e != null) {
            boolean z10 = this.E;
            this.E = false;
            CharSequence hint = editText.getHint();
            this.f8229d.setHint(this.f8231e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f8229d.setHint(hint);
                this.E = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        viewStructure.setChildCount(this.f8224a.getChildCount());
        for (int i11 = 0; i11 < this.f8224a.getChildCount(); i11++) {
            View childAt = this.f8224a.getChildAt(i11);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i10);
            if (childAt == this.f8229d) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
        this.A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.A0 = false;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        E(canvas);
        D(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f8274z0) {
            return;
        }
        this.f8274z0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        zc.a aVar = this.f8266v0;
        boolean zF0 = aVar != null ? aVar.f0(drawableState) : false;
        if (this.f8229d != null) {
            u0(o0.R(this) && isEnabled());
        }
        p0();
        A0();
        if (zF0) {
            invalidate();
        }
        this.f8274z0 = false;
    }

    public final boolean e0() {
        return (this.f8227c.G() || ((this.f8227c.A() && M()) || this.f8227c.w() != null)) && this.f8227c.getMeasuredWidth() > 0;
    }

    public final boolean f0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.b.getMeasuredWidth() > 0;
    }

    public final void g0() {
        if (this.f8261t == null || !this.f8259s || TextUtils.isEmpty(this.f8257r)) {
            return;
        }
        this.f8261t.setText(this.f8257r);
        y.a(this.f8224a, this.f8267w);
        this.f8261t.setVisibility(0);
        this.f8261t.bringToFront();
        announceForAccessibility(this.f8257r);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f8229d;
        return editText != null ? editText.getBaseline() + getPaddingTop() + v() : super.getBaseline();
    }

    @NonNull
    public gd.g getBoxBackground() {
        int i10 = this.O;
        if (i10 == 1 || i10 == 2) {
            return this.F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.U;
    }

    public int getBoxBackgroundMode() {
        return this.O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return r.h(this) ? this.L.j().a(this.f8225a0) : this.L.l().a(this.f8225a0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return r.h(this) ? this.L.l().a(this.f8225a0) : this.L.j().a(this.f8225a0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return r.h(this) ? this.L.r().a(this.f8225a0) : this.L.t().a(this.f8225a0);
    }

    public float getBoxCornerRadiusTopStart() {
        return r.h(this) ? this.L.t().a(this.f8225a0) : this.L.r().a(this.f8225a0);
    }

    public int getBoxStrokeColor() {
        return this.f8248m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f8250n0;
    }

    public int getBoxStrokeWidth() {
        return this.R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.S;
    }

    public int getCounterMaxLength() {
        return this.f8245l;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f8243k && this.f8247m && (textView = this.f8251o) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f8273z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f8271y;
    }

    public ColorStateList getCursorColor() {
        return this.A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f8240i0;
    }

    public EditText getEditText() {
        return this.f8229d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f8227c.l();
    }

    public Drawable getEndIconDrawable() {
        return this.f8227c.n();
    }

    public int getEndIconMinSize() {
        return this.f8227c.o();
    }

    public int getEndIconMode() {
        return this.f8227c.p();
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.f8227c.q();
    }

    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.f8227c.r();
    }

    public CharSequence getError() {
        if (this.f8241j.A()) {
            return this.f8241j.p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f8241j.n();
    }

    public CharSequence getErrorContentDescription() {
        return this.f8241j.o();
    }

    public int getErrorCurrentTextColors() {
        return this.f8241j.q();
    }

    public Drawable getErrorIconDrawable() {
        return this.f8227c.s();
    }

    public CharSequence getHelperText() {
        if (this.f8241j.B()) {
            return this.f8241j.s();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f8241j.u();
    }

    public CharSequence getHint() {
        if (this.C) {
            return this.D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f8266v0.q();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.f8266v0.t();
    }

    public ColorStateList getHintTextColor() {
        return this.f8242j0;
    }

    @NonNull
    public e getLengthCounter() {
        return this.f8249n;
    }

    public int getMaxEms() {
        return this.f8235g;
    }

    public int getMaxWidth() {
        return this.f8239i;
    }

    public int getMinEms() {
        return this.f8233f;
    }

    public int getMinWidth() {
        return this.f8237h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f8227c.u();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f8227c.v();
    }

    public CharSequence getPlaceholderText() {
        if (this.f8259s) {
            return this.f8257r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f8265v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f8263u;
    }

    public CharSequence getPrefixText() {
        return this.b.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.b.b();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.b.d();
    }

    @NonNull
    public k getShapeAppearanceModel() {
        return this.L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.b.e();
    }

    public Drawable getStartIconDrawable() {
        return this.b.f();
    }

    public int getStartIconMinSize() {
        return this.b.g();
    }

    @NonNull
    public ImageView.ScaleType getStartIconScaleType() {
        return this.b.h();
    }

    public CharSequence getSuffixText() {
        return this.f8227c.w();
    }

    public ColorStateList getSuffixTextColor() {
        return this.f8227c.x();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.f8227c.z();
    }

    public Typeface getTypeface() {
        return this.f8226b0;
    }

    public final void h0() {
        if (this.O == 1) {
            if (dd.c.h(getContext())) {
                this.P = getResources().getDimensionPixelSize(hc.d.G);
            } else if (dd.c.g(getContext())) {
                this.P = getResources().getDimensionPixelSize(hc.d.F);
            }
        }
    }

    public void i(@NonNull f fVar) {
        this.f8232e0.add(fVar);
        if (this.f8229d != null) {
            fVar.a(this);
        }
    }

    public final void i0(@NonNull Rect rect) {
        gd.g gVar = this.J;
        if (gVar != null) {
            int i10 = rect.bottom;
            gVar.setBounds(rect.left, i10 - this.R, rect.right, i10);
        }
        gd.g gVar2 = this.K;
        if (gVar2 != null) {
            int i11 = rect.bottom;
            gVar2.setBounds(rect.left, i11 - this.S, rect.right, i11);
        }
    }

    public final void j() {
        TextView textView = this.f8261t;
        if (textView != null) {
            this.f8224a.addView(textView);
            this.f8261t.setVisibility(0);
        }
    }

    public final void j0() {
        if (this.f8251o != null) {
            EditText editText = this.f8229d;
            k0(editText == null ? null : editText.getText());
        }
    }

    public final void k() {
        if (this.f8229d == null || this.O != 1) {
            return;
        }
        if (dd.c.h(getContext())) {
            EditText editText = this.f8229d;
            o0.B0(editText, o0.E(editText), getResources().getDimensionPixelSize(hc.d.E), o0.D(this.f8229d), getResources().getDimensionPixelSize(hc.d.D));
        } else if (dd.c.g(getContext())) {
            EditText editText2 = this.f8229d;
            o0.B0(editText2, o0.E(editText2), getResources().getDimensionPixelSize(hc.d.C), o0.D(this.f8229d), getResources().getDimensionPixelSize(hc.d.B));
        }
    }

    public void k0(Editable editable) {
        int iA = this.f8249n.a(editable);
        boolean z10 = this.f8247m;
        int i10 = this.f8245l;
        if (i10 == -1) {
            this.f8251o.setText(String.valueOf(iA));
            this.f8251o.setContentDescription(null);
            this.f8247m = false;
        } else {
            this.f8247m = iA > i10;
            l0(getContext(), this.f8251o, iA, this.f8245l, this.f8247m);
            if (z10 != this.f8247m) {
                m0();
            }
            this.f8251o.setText(w2.a.c().j(getContext().getString(i.f18911d, Integer.valueOf(iA), Integer.valueOf(this.f8245l))));
        }
        if (this.f8229d == null || z10 == this.f8247m) {
            return;
        }
        u0(false);
        A0();
        p0();
    }

    public void l(float f10) {
        if (this.f8266v0.x() == f10) {
            return;
        }
        if (this.f8272y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f8272y0 = valueAnimator;
            valueAnimator.setInterpolator(h.g(getContext(), hc.b.P, ic.a.b));
            this.f8272y0.setDuration(h.f(getContext(), hc.b.I, 167));
            this.f8272y0.addUpdateListener(new c());
        }
        this.f8272y0.setFloatValues(this.f8266v0.x(), f10);
        this.f8272y0.start();
    }

    public final void m() {
        gd.g gVar = this.F;
        if (gVar == null) {
            return;
        }
        k kVarE = gVar.E();
        k kVar = this.L;
        if (kVarE != kVar) {
            this.F.setShapeAppearanceModel(kVar);
        }
        if (w()) {
            this.F.g0(this.Q, this.T);
        }
        int iQ = q();
        this.U = iQ;
        this.F.a0(ColorStateList.valueOf(iQ));
        n();
        r0();
    }

    public final void m0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f8251o;
        if (textView != null) {
            c0(textView, this.f8247m ? this.f8253p : this.f8255q);
            if (!this.f8247m && (colorStateList2 = this.f8271y) != null) {
                this.f8251o.setTextColor(colorStateList2);
            }
            if (!this.f8247m || (colorStateList = this.f8273z) == null) {
                return;
            }
            this.f8251o.setTextColor(colorStateList);
        }
    }

    public final void n() {
        if (this.J == null || this.K == null) {
            return;
        }
        if (x()) {
            this.J.a0(this.f8229d.isFocused() ? ColorStateList.valueOf(this.f8244k0) : ColorStateList.valueOf(this.T));
            this.K.a0(ColorStateList.valueOf(this.T));
        }
        invalidate();
    }

    public final void n0() {
        ColorStateList colorStateList;
        ColorStateList colorStateListG = this.A;
        if (colorStateListG == null) {
            colorStateListG = tc.a.g(getContext(), hc.b.f18779g);
        }
        EditText editText = this.f8229d;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = q2.a.r(this.f8229d.getTextCursorDrawable()).mutate();
        if (Q() && (colorStateList = this.B) != null) {
            colorStateListG = colorStateList;
        }
        q2.a.o(drawableMutate, colorStateListG);
    }

    public final void o(@NonNull RectF rectF) {
        float f10 = rectF.left;
        int i10 = this.N;
        rectF.left = f10 - i10;
        rectF.right += i10;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    public boolean o0() {
        boolean z10;
        if (this.f8229d == null) {
            return false;
        }
        boolean z11 = true;
        if (f0()) {
            int measuredWidth = this.b.getMeasuredWidth() - this.f8229d.getPaddingLeft();
            if (this.f8228c0 == null || this.f8230d0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f8228c0 = colorDrawable;
                this.f8230d0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrD = d3.i.d(this.f8229d);
            Drawable drawable = drawableArrD[0];
            Drawable drawable2 = this.f8228c0;
            if (drawable != drawable2) {
                d3.i.m(this.f8229d, drawable2, drawableArrD[1], drawableArrD[2], drawableArrD[3]);
                z10 = true;
            } else {
                z10 = false;
            }
        } else if (this.f8228c0 != null) {
            Drawable[] drawableArrD2 = d3.i.d(this.f8229d);
            d3.i.m(this.f8229d, null, drawableArrD2[1], drawableArrD2[2], drawableArrD2[3]);
            this.f8228c0 = null;
            z10 = true;
        } else {
            z10 = false;
        }
        if (e0()) {
            int measuredWidth2 = this.f8227c.z().getMeasuredWidth() - this.f8229d.getPaddingRight();
            CheckableImageButton checkableImageButtonK = this.f8227c.k();
            if (checkableImageButtonK != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButtonK.getMeasuredWidth() + n.b((ViewGroup.MarginLayoutParams) checkableImageButtonK.getLayoutParams());
            }
            Drawable[] drawableArrD3 = d3.i.d(this.f8229d);
            Drawable drawable3 = this.f8234f0;
            if (drawable3 != null && this.f8236g0 != measuredWidth2) {
                this.f8236g0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                d3.i.m(this.f8229d, drawableArrD3[0], drawableArrD3[1], this.f8234f0, drawableArrD3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.f8234f0 = colorDrawable2;
                this.f8236g0 = measuredWidth2;
                colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = drawableArrD3[2];
            Drawable drawable5 = this.f8234f0;
            if (drawable4 != drawable5) {
                this.f8238h0 = drawable4;
                d3.i.m(this.f8229d, drawableArrD3[0], drawableArrD3[1], drawable5, drawableArrD3[3]);
                return true;
            }
        } else if (this.f8234f0 != null) {
            Drawable[] drawableArrD4 = d3.i.d(this.f8229d);
            if (drawableArrD4[2] == this.f8234f0) {
                d3.i.m(this.f8229d, drawableArrD4[0], drawableArrD4[1], this.f8238h0, drawableArrD4[3]);
            } else {
                z11 = z10;
            }
            this.f8234f0 = null;
            return z11;
        }
        return z10;
    }

    @Override // android.view.View
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f8266v0.H(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f8227c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.B0 = false;
        boolean zS0 = s0();
        boolean zO0 = o0();
        if (zS0 || zO0) {
            this.f8229d.post(new Runnable() { // from class: jd.y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21348a.f8229d.requestLayout();
                }
            });
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f8229d;
        if (editText != null) {
            Rect rect = this.V;
            zc.c.a(this, editText, rect);
            i0(rect);
            if (this.C) {
                this.f8266v0.a0(this.f8229d.getTextSize());
                int gravity = this.f8229d.getGravity();
                this.f8266v0.S((gravity & (-113)) | 48);
                this.f8266v0.Z(gravity);
                this.f8266v0.O(r(rect));
                this.f8266v0.W(u(rect));
                this.f8266v0.J();
                if (!B() || this.f8264u0) {
                    return;
                }
                V();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.B0) {
            this.f8227c.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.B0 = true;
        }
        w0();
        this.f8227c.x0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setError(savedState.f8275c);
        if (savedState.f8276d) {
            post(new b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = i10 == 1;
        if (z10 != this.M) {
            float fA = this.L.r().a(this.f8225a0);
            float fA2 = this.L.t().a(this.f8225a0);
            k kVarM = k.a().z(this.L.s()).D(this.L.q()).r(this.L.k()).v(this.L.i()).A(fA2).E(fA).s(this.L.l().a(this.f8225a0)).w(this.L.j().a(this.f8225a0)).m();
            this.M = z10;
            setShapeAppearanceModel(kVarM);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (d0()) {
            savedState.f8275c = getError();
        }
        savedState.f8276d = this.f8227c.E();
        return savedState;
    }

    public final void p() {
        int i10 = this.O;
        if (i10 == 0) {
            this.F = null;
            this.J = null;
            this.K = null;
            return;
        }
        if (i10 == 1) {
            this.F = new gd.g(this.L);
            this.J = new gd.g();
            this.K = new gd.g();
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(this.O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.C || (this.F instanceof jd.h)) {
                this.F = new gd.g(this.L);
            } else {
                this.F = jd.h.o0(this.L);
            }
            this.J = null;
            this.K = null;
        }
    }

    public void p0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f8229d;
        if (editText == null || this.O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (k0.a(background)) {
            background = background.mutate();
        }
        if (d0()) {
            background.setColorFilter(q.k.e(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f8247m && (textView = this.f8251o) != null) {
            background.setColorFilter(q.k.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            q2.a.c(background);
            this.f8229d.refreshDrawableState();
        }
    }

    public final int q() {
        return this.O == 1 ? tc.a.i(tc.a.e(this, hc.b.f18790o, 0), this.U) : this.U;
    }

    public final void q0() {
        o0.q0(this.f8229d, getEditTextBoxBackground());
    }

    @NonNull
    public final Rect r(@NonNull Rect rect) {
        if (this.f8229d == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.W;
        boolean zH = r.h(this);
        rect2.bottom = rect.bottom;
        int i10 = this.O;
        if (i10 == 1) {
            rect2.left = I(rect.left, zH);
            rect2.top = rect.top + this.P;
            rect2.right = J(rect.right, zH);
            return rect2;
        }
        if (i10 != 2) {
            rect2.left = I(rect.left, zH);
            rect2.top = getPaddingTop();
            rect2.right = J(rect.right, zH);
            return rect2;
        }
        rect2.left = rect.left + this.f8229d.getPaddingLeft();
        rect2.top = rect.top - v();
        rect2.right = rect.right - this.f8229d.getPaddingRight();
        return rect2;
    }

    public void r0() {
        EditText editText = this.f8229d;
        if (editText == null || this.F == null) {
            return;
        }
        if ((this.I || editText.getBackground() == null) && this.O != 0) {
            q0();
            this.I = true;
        }
    }

    public final int s(@NonNull Rect rect, @NonNull Rect rect2, float f10) {
        return S() ? (int) (rect2.top + f10) : rect.bottom - this.f8229d.getCompoundPaddingBottom();
    }

    public final boolean s0() {
        int iMax;
        if (this.f8229d == null || this.f8229d.getMeasuredHeight() >= (iMax = Math.max(this.f8227c.getMeasuredHeight(), this.b.getMeasuredHeight()))) {
            return false;
        }
        this.f8229d.setMinimumHeight(iMax);
        return true;
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.U != i10) {
            this.U = i10;
            this.f8252o0 = i10;
            this.f8256q0 = i10;
            this.f8258r0 = i10;
            m();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(l2.b.c(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f8252o0 = defaultColor;
        this.U = defaultColor;
        this.f8254p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f8256q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f8258r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.O) {
            return;
        }
        this.O = i10;
        if (this.f8229d != null) {
            U();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.P = i10;
    }

    public void setBoxCornerFamily(int i10) {
        this.L = this.L.v().y(i10, this.L.r()).C(i10, this.L.t()).q(i10, this.L.j()).u(i10, this.L.l()).m();
        m();
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f8248m0 != i10) {
            this.f8248m0 = i10;
            A0();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f8244k0 = colorStateList.getDefaultColor();
            this.f8260s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f8246l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f8248m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f8248m0 != colorStateList.getDefaultColor()) {
            this.f8248m0 = colorStateList.getDefaultColor();
        }
        A0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f8250n0 != colorStateList) {
            this.f8250n0 = colorStateList;
            A0();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.R = i10;
        A0();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.S = i10;
        A0();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f8243k != z10) {
            if (z10) {
                b0 b0Var = new b0(getContext());
                this.f8251o = b0Var;
                b0Var.setId(hc.f.P);
                Typeface typeface = this.f8226b0;
                if (typeface != null) {
                    this.f8251o.setTypeface(typeface);
                }
                this.f8251o.setMaxLines(1);
                this.f8241j.e(this.f8251o, 2);
                n.d((ViewGroup.MarginLayoutParams) this.f8251o.getLayoutParams(), getResources().getDimensionPixelOffset(hc.d.f18833l0));
                m0();
                j0();
            } else {
                this.f8241j.C(this.f8251o, 2);
                this.f8251o = null;
            }
            this.f8243k = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f8245l != i10) {
            if (i10 > 0) {
                this.f8245l = i10;
            } else {
                this.f8245l = -1;
            }
            if (this.f8243k) {
                j0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f8253p != i10) {
            this.f8253p = i10;
            m0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f8273z != colorStateList) {
            this.f8273z = colorStateList;
            m0();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f8255q != i10) {
            this.f8255q = i10;
            m0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f8271y != colorStateList) {
            this.f8271y = colorStateList;
            m0();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            n0();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            if (Q()) {
                n0();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f8240i0 = colorStateList;
        this.f8242j0 = colorStateList;
        if (this.f8229d != null) {
            u0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        X(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f8227c.N(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f8227c.O(z10);
    }

    public void setEndIconContentDescription(int i10) {
        this.f8227c.P(i10);
    }

    public void setEndIconDrawable(int i10) {
        this.f8227c.R(i10);
    }

    public void setEndIconMinSize(int i10) {
        this.f8227c.T(i10);
    }

    public void setEndIconMode(int i10) {
        this.f8227c.U(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f8227c.V(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f8227c.W(onLongClickListener);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.f8227c.X(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.f8227c.Y(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.f8227c.Z(mode);
    }

    public void setEndIconVisible(boolean z10) {
        this.f8227c.a0(z10);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f8241j.A()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f8241j.w();
        } else {
            this.f8241j.Q(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        this.f8241j.E(i10);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f8241j.F(charSequence);
    }

    public void setErrorEnabled(boolean z10) {
        this.f8241j.G(z10);
    }

    public void setErrorIconDrawable(int i10) {
        this.f8227c.b0(i10);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f8227c.d0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f8227c.e0(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f8227c.f0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.f8227c.g0(mode);
    }

    public void setErrorTextAppearance(int i10) {
        this.f8241j.H(i10);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f8241j.I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.f8268w0 != z10) {
            this.f8268w0 = z10;
            u0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (O()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!O()) {
                setHelperTextEnabled(true);
            }
            this.f8241j.R(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f8241j.L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        this.f8241j.K(z10);
    }

    public void setHelperTextTextAppearance(int i10) {
        this.f8241j.J(i10);
    }

    public void setHint(CharSequence charSequence) {
        if (this.C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(Barcode.FORMAT_PDF417);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.f8270x0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.C) {
            this.C = z10;
            if (z10) {
                CharSequence hint = this.f8229d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.D)) {
                        setHint(hint);
                    }
                    this.f8229d.setHint((CharSequence) null);
                }
                this.E = true;
            } else {
                this.E = false;
                if (!TextUtils.isEmpty(this.D) && TextUtils.isEmpty(this.f8229d.getHint())) {
                    this.f8229d.setHint(this.D);
                }
                setHintInternal(null);
            }
            if (this.f8229d != null) {
                t0();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        this.f8266v0.P(i10);
        this.f8242j0 = this.f8266v0.p();
        if (this.f8229d != null) {
            u0(false);
            t0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f8242j0 != colorStateList) {
            if (this.f8240i0 == null) {
                this.f8266v0.R(colorStateList);
            }
            this.f8242j0 = colorStateList;
            if (this.f8229d != null) {
                u0(false);
            }
        }
    }

    public void setLengthCounter(@NonNull e eVar) {
        this.f8249n = eVar;
    }

    public void setMaxEms(int i10) {
        this.f8235g = i10;
        EditText editText = this.f8229d;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(int i10) {
        this.f8239i = i10;
        EditText editText = this.f8229d;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f8233f = i10;
        EditText editText = this.f8229d;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(int i10) {
        this.f8237h = i10;
        EditText editText = this.f8229d;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        this.f8227c.i0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        this.f8227c.k0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        this.f8227c.m0(z10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f8227c.n0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f8227c.o0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f8261t == null) {
            b0 b0Var = new b0(getContext());
            this.f8261t = b0Var;
            b0Var.setId(hc.f.S);
            o0.w0(this.f8261t, 2);
            o5.e eVarA = A();
            this.f8267w = eVarA;
            eVarA.y0(67L);
            this.f8269x = A();
            setPlaceholderTextAppearance(this.f8265v);
            setPlaceholderTextColor(this.f8263u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f8259s) {
                setPlaceholderTextEnabled(true);
            }
            this.f8257r = charSequence;
        }
        x0();
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f8265v = i10;
        TextView textView = this.f8261t;
        if (textView != null) {
            d3.i.s(textView, i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f8263u != colorStateList) {
            this.f8263u = colorStateList;
            TextView textView = this.f8261t;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.b.n(charSequence);
    }

    public void setPrefixTextAppearance(int i10) {
        this.b.o(i10);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.b.p(colorStateList);
    }

    public void setShapeAppearanceModel(@NonNull k kVar) {
        gd.g gVar = this.F;
        if (gVar == null || gVar.E() == kVar) {
            return;
        }
        this.L = kVar;
        m();
    }

    public void setStartIconCheckable(boolean z10) {
        this.b.q(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? k.a.b(getContext(), i10) : null);
    }

    public void setStartIconMinSize(int i10) {
        this.b.t(i10);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.b.u(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.b.v(onLongClickListener);
    }

    public void setStartIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.b.w(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.b.x(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.b.y(mode);
    }

    public void setStartIconVisible(boolean z10) {
        this.b.z(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f8227c.p0(charSequence);
    }

    public void setSuffixTextAppearance(int i10) {
        this.f8227c.q0(i10);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.f8227c.r0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(d dVar) {
        EditText editText = this.f8229d;
        if (editText != null) {
            o0.m0(editText, dVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f8226b0) {
            this.f8226b0 = typeface;
            this.f8266v0.i0(typeface);
            this.f8241j.N(typeface);
            TextView textView = this.f8251o;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public final int t(@NonNull Rect rect, float f10) {
        return S() ? (int) (rect.centerY() - (f10 / 2.0f)) : rect.top + this.f8229d.getCompoundPaddingTop();
    }

    public final void t0() {
        if (this.O != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f8224a.getLayoutParams();
            int iV = v();
            if (iV != layoutParams.topMargin) {
                layoutParams.topMargin = iV;
                this.f8224a.requestLayout();
            }
        }
    }

    @NonNull
    public final Rect u(@NonNull Rect rect) {
        if (this.f8229d == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.W;
        float fW = this.f8266v0.w();
        rect2.left = rect.left + this.f8229d.getCompoundPaddingLeft();
        rect2.top = t(rect, fW);
        rect2.right = rect.right - this.f8229d.getCompoundPaddingRight();
        rect2.bottom = s(rect, rect2, fW);
        return rect2;
    }

    public void u0(boolean z10) {
        v0(z10, false);
    }

    public final int v() {
        float fQ;
        if (!this.C) {
            return 0;
        }
        int i10 = this.O;
        if (i10 == 0) {
            fQ = this.f8266v0.q();
        } else {
            if (i10 != 2) {
                return 0;
            }
            fQ = this.f8266v0.q() / 2.0f;
        }
        return (int) fQ;
    }

    public final void v0(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f8229d;
        boolean z12 = false;
        boolean z13 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f8229d;
        if (editText2 != null && editText2.hasFocus()) {
            z12 = true;
        }
        ColorStateList colorStateList2 = this.f8240i0;
        if (colorStateList2 != null) {
            this.f8266v0.M(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f8240i0;
            this.f8266v0.M(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f8260s0) : this.f8260s0));
        } else if (d0()) {
            this.f8266v0.M(this.f8241j.r());
        } else if (this.f8247m && (textView = this.f8251o) != null) {
            this.f8266v0.M(textView.getTextColors());
        } else if (z12 && (colorStateList = this.f8242j0) != null) {
            this.f8266v0.R(colorStateList);
        }
        if (z13 || !this.f8268w0 || (isEnabled() && z12)) {
            if (z11 || this.f8264u0) {
                z(z10);
                return;
            }
            return;
        }
        if (z11 || !this.f8264u0) {
            F(z10);
        }
    }

    public final boolean w() {
        return this.O == 2 && x();
    }

    public final void w0() {
        EditText editText;
        if (this.f8261t == null || (editText = this.f8229d) == null) {
            return;
        }
        this.f8261t.setGravity(editText.getGravity());
        this.f8261t.setPadding(this.f8229d.getCompoundPaddingLeft(), this.f8229d.getCompoundPaddingTop(), this.f8229d.getCompoundPaddingRight(), this.f8229d.getCompoundPaddingBottom());
    }

    public final boolean x() {
        return this.Q > -1 && this.T != 0;
    }

    public final void x0() {
        EditText editText = this.f8229d;
        y0(editText == null ? null : editText.getText());
    }

    public final void y() {
        if (B()) {
            ((jd.h) this.F).r0();
        }
    }

    public final void y0(Editable editable) {
        if (this.f8249n.a(editable) != 0 || this.f8264u0) {
            L();
        } else {
            g0();
        }
    }

    public final void z(boolean z10) {
        ValueAnimator valueAnimator = this.f8272y0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f8272y0.cancel();
        }
        if (z10 && this.f8270x0) {
            l(1.0f);
        } else {
            this.f8266v0.c0(1.0f);
        }
        this.f8264u0 = false;
        if (B()) {
            V();
        }
        x0();
        this.b.l(false);
        this.f8227c.H(false);
    }

    public final void z0(boolean z10, boolean z11) {
        int defaultColor = this.f8250n0.getDefaultColor();
        int colorForState = this.f8250n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f8250n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z10) {
            this.T = colorForState2;
        } else if (z11) {
            this.T = colorForState;
        } else {
            this.T = defaultColor;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(@NonNull Context context, AttributeSet attributeSet, int i10) {
        int i11 = C0;
        super(ld.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f8233f = -1;
        this.f8235g = -1;
        this.f8237h = -1;
        this.f8239i = -1;
        this.f8241j = new t(this);
        this.f8249n = new e() { // from class: jd.z
            @Override // com.google.android.material.textfield.TextInputLayout.e
            public final int a(Editable editable) {
                return TextInputLayout.b(editable);
            }
        };
        this.V = new Rect();
        this.W = new Rect();
        this.f8225a0 = new RectF();
        this.f8232e0 = new LinkedHashSet<>();
        zc.a aVar = new zc.a(this);
        this.f8266v0 = aVar;
        this.B0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f8224a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = ic.a.f20471a;
        aVar.h0(timeInterpolator);
        aVar.e0(timeInterpolator);
        aVar.S(8388659);
        int[] iArr = hc.k.f19153v6;
        int i12 = hc.k.S6;
        int i13 = hc.k.Q6;
        int i14 = hc.k.f19056k7;
        int i15 = hc.k.f19101p7;
        int i16 = hc.k.f19137t7;
        a1 a1VarJ = o.j(context2, attributeSet, iArr, i10, i11, i12, i13, i14, i15, i16);
        x xVar = new x(this, a1VarJ);
        this.b = xVar;
        this.C = a1VarJ.a(hc.k.f19128s7, true);
        setHint(a1VarJ.p(hc.k.A6));
        this.f8270x0 = a1VarJ.a(hc.k.f19119r7, true);
        this.f8268w0 = a1VarJ.a(hc.k.f19074m7, true);
        int i17 = hc.k.C6;
        if (a1VarJ.s(i17)) {
            setMinEms(a1VarJ.k(i17, -1));
        } else {
            int i18 = hc.k.f19188z6;
            if (a1VarJ.s(i18)) {
                setMinWidth(a1VarJ.f(i18, -1));
            }
        }
        int i19 = hc.k.B6;
        if (a1VarJ.s(i19)) {
            setMaxEms(a1VarJ.k(i19, -1));
        } else {
            int i20 = hc.k.f19179y6;
            if (a1VarJ.s(i20)) {
                setMaxWidth(a1VarJ.f(i20, -1));
            }
        }
        this.L = k.e(context2, attributeSet, i10, i11).m();
        this.N = context2.getResources().getDimensionPixelOffset(hc.d.f18827i0);
        this.P = a1VarJ.e(hc.k.F6, 0);
        this.R = a1VarJ.f(hc.k.M6, context2.getResources().getDimensionPixelSize(hc.d.f18829j0));
        this.S = a1VarJ.f(hc.k.N6, context2.getResources().getDimensionPixelSize(hc.d.f18831k0));
        this.Q = this.R;
        float fD = a1VarJ.d(hc.k.J6, -1.0f);
        float fD2 = a1VarJ.d(hc.k.I6, -1.0f);
        float fD3 = a1VarJ.d(hc.k.G6, -1.0f);
        float fD4 = a1VarJ.d(hc.k.H6, -1.0f);
        k.b bVarV = this.L.v();
        if (fD >= 0.0f) {
            bVarV.A(fD);
        }
        if (fD2 >= 0.0f) {
            bVarV.E(fD2);
        }
        if (fD3 >= 0.0f) {
            bVarV.w(fD3);
        }
        if (fD4 >= 0.0f) {
            bVarV.s(fD4);
        }
        this.L = bVarV.m();
        ColorStateList colorStateListB = dd.c.b(context2, a1VarJ, hc.k.D6);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.f8252o0 = defaultColor;
            this.U = defaultColor;
            if (colorStateListB.isStateful()) {
                this.f8254p0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.f8256q0 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f8258r0 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f8256q0 = this.f8252o0;
                ColorStateList colorStateListA = k.a.a(context2, hc.c.f18807g);
                this.f8254p0 = colorStateListA.getColorForState(new int[]{-16842910}, -1);
                this.f8258r0 = colorStateListA.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.U = 0;
            this.f8252o0 = 0;
            this.f8254p0 = 0;
            this.f8256q0 = 0;
            this.f8258r0 = 0;
        }
        int i21 = hc.k.f19170x6;
        if (a1VarJ.s(i21)) {
            ColorStateList colorStateListC = a1VarJ.c(i21);
            this.f8242j0 = colorStateListC;
            this.f8240i0 = colorStateListC;
        }
        int i22 = hc.k.K6;
        ColorStateList colorStateListB2 = dd.c.b(context2, a1VarJ, i22);
        this.f8248m0 = a1VarJ.b(i22, 0);
        this.f8244k0 = l2.b.c(context2, hc.c.f18808h);
        this.f8260s0 = l2.b.c(context2, hc.c.f18809i);
        this.f8246l0 = l2.b.c(context2, hc.c.f18810j);
        if (colorStateListB2 != null) {
            setBoxStrokeColorStateList(colorStateListB2);
        }
        int i23 = hc.k.L6;
        if (a1VarJ.s(i23)) {
            setBoxStrokeErrorColor(dd.c.b(context2, a1VarJ, i23));
        }
        if (a1VarJ.n(i16, -1) != -1) {
            setHintTextAppearance(a1VarJ.n(i16, 0));
        }
        this.A = a1VarJ.c(hc.k.U6);
        this.B = a1VarJ.c(hc.k.V6);
        int iN = a1VarJ.n(i14, 0);
        CharSequence charSequenceP = a1VarJ.p(hc.k.f19011f7);
        int iK = a1VarJ.k(hc.k.f19002e7, 1);
        boolean zA = a1VarJ.a(hc.k.f19020g7, false);
        int iN2 = a1VarJ.n(i15, 0);
        boolean zA2 = a1VarJ.a(hc.k.f19092o7, false);
        CharSequence charSequenceP2 = a1VarJ.p(hc.k.f19083n7);
        int iN3 = a1VarJ.n(hc.k.B7, 0);
        CharSequence charSequenceP3 = a1VarJ.p(hc.k.A7);
        boolean zA3 = a1VarJ.a(hc.k.O6, false);
        setCounterMaxLength(a1VarJ.k(hc.k.P6, -1));
        this.f8255q = a1VarJ.n(i12, 0);
        this.f8253p = a1VarJ.n(i13, 0);
        setBoxBackgroundMode(a1VarJ.k(hc.k.E6, 0));
        setErrorContentDescription(charSequenceP);
        setErrorAccessibilityLiveRegion(iK);
        setCounterOverflowTextAppearance(this.f8253p);
        setHelperTextTextAppearance(iN2);
        setErrorTextAppearance(iN);
        setCounterTextAppearance(this.f8255q);
        setPlaceholderText(charSequenceP3);
        setPlaceholderTextAppearance(iN3);
        int i24 = hc.k.f19065l7;
        if (a1VarJ.s(i24)) {
            setErrorTextColor(a1VarJ.c(i24));
        }
        int i25 = hc.k.f19110q7;
        if (a1VarJ.s(i25)) {
            setHelperTextColor(a1VarJ.c(i25));
        }
        int i26 = hc.k.f19146u7;
        if (a1VarJ.s(i26)) {
            setHintTextColor(a1VarJ.c(i26));
        }
        int i27 = hc.k.T6;
        if (a1VarJ.s(i27)) {
            setCounterTextColor(a1VarJ.c(i27));
        }
        int i28 = hc.k.R6;
        if (a1VarJ.s(i28)) {
            setCounterOverflowTextColor(a1VarJ.c(i28));
        }
        int i29 = hc.k.C7;
        if (a1VarJ.s(i29)) {
            setPlaceholderTextColor(a1VarJ.c(i29));
        }
        com.google.android.material.textfield.a aVar2 = new com.google.android.material.textfield.a(this, a1VarJ);
        this.f8227c = aVar2;
        boolean zA4 = a1VarJ.a(hc.k.f19161w6, true);
        a1VarJ.x();
        o0.w0(this, 2);
        o0.y0(this, 1);
        frameLayout.addView(xVar);
        frameLayout.addView(aVar2);
        addView(frameLayout);
        setEnabled(zA4);
        setHelperTextEnabled(zA2);
        setErrorEnabled(zA);
        setCounterEnabled(zA3);
        setHelperText(charSequenceP2);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f8227c.Q(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f8227c.S(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f8227c.c0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f8227c.j0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f8227c.l0(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.b.r(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.b.s(drawable);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }
}
