package com.google.android.material.textfield;

import ad.o;
import ad.r;
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
import cd.h;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.mlkit.vision.barcode.common.Barcode;
import hd.k;
import ic.i;
import ic.j;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kd.q;
import kd.t;
import kd.x;
import o5.y;
import q.a1;
import q.b0;
import q.k0;
import y2.p;

/* JADX INFO: loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int C0 = j.f20761j;
    public static final int[][] D0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public ColorStateList A;
    public boolean A0;
    public ColorStateList B;
    public boolean B0;
    public boolean C;
    public CharSequence D;
    public boolean E;
    public hd.g F;
    public hd.g G;
    public StateListDrawable H;
    public boolean I;
    public hd.g J;
    public hd.g K;

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
    public final FrameLayout f8298a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final RectF f8299a0;

    @NonNull
    public final x b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Typeface f8300b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final com.google.android.material.textfield.a f8301c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Drawable f8302c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EditText f8303d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f8304d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f8305e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final LinkedHashSet<f> f8306e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8307f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Drawable f8308f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8309g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f8310g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8311h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public Drawable f8312h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8313i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public ColorStateList f8314i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f8315j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public ColorStateList f8316j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8317k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f8318k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8319l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f8320l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f8321m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f8322m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public e f8323n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public ColorStateList f8324n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f8325o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f8326o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8327p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f8328p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8329q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f8330q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f8331r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f8332r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f8333s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f8334s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f8335t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f8336t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ColorStateList f8337u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f8338u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f8339v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final ad.a f8340v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public o5.e f8341w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f8342w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public o5.e f8343x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f8344x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ColorStateList f8345y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public ValueAnimator f8346y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ColorStateList f8347z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f8348z0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f8349c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f8350d;

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
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f8349c) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f8349c, parcel, i10);
            parcel.writeInt(this.f8350d ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8349c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f8350d = parcel.readInt() == 1;
        }
    }

    public class a implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8351a;
        public final /* synthetic */ EditText b;

        public a(EditText editText) {
            this.b = editText;
            this.f8351a = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@NonNull Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.u0(!textInputLayout.A0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f8317k) {
                textInputLayout2.k0(editable);
            }
            if (TextInputLayout.this.f8333s) {
                TextInputLayout.this.y0(editable);
            }
            int lineCount = this.b.getLineCount();
            int i10 = this.f8351a;
            if (lineCount != i10) {
                if (lineCount < i10) {
                    int iA = o0.A(this.b);
                    int i11 = TextInputLayout.this.f8336t0;
                    if (iA != i11) {
                        this.b.setMinimumHeight(i11);
                    }
                }
                this.f8351a = lineCount;
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
            TextInputLayout.this.f8301c.h();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            TextInputLayout.this.f8340v0.c0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class d extends androidx.core.view.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextInputLayout f8355d;

        public d(@NonNull TextInputLayout textInputLayout) {
            this.f8355d = textInputLayout;
        }

        @Override // androidx.core.view.a
        public void g(@NonNull View view, @NonNull p pVar) {
            super.g(view, pVar);
            EditText editText = this.f8355d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f8355d.getHint();
            CharSequence error = this.f8355d.getError();
            CharSequence placeholderText = this.f8355d.getPlaceholderText();
            int counterMaxLength = this.f8355d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f8355d.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean zP = this.f8355d.P();
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z10 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : "";
            this.f8355d.b.A(pVar);
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
            View viewT = this.f8355d.f8315j.t();
            if (viewT != null) {
                pVar.y0(viewT);
            }
            this.f8355d.f8301c.m().o(view, pVar);
        }

        @Override // androidx.core.view.a
        public void h(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            this.f8355d.f8301c.m().p(view, accessibilityEvent);
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
        this(context, attributeSet, ic.b.f20602g0);
    }

    public static Drawable H(hd.g gVar, int i10, int i11, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{uc.a.j(i11, i10, 0.1f), i10}), gVar, gVar);
    }

    public static Drawable K(Context context, hd.g gVar, int i10, int[][] iArr) {
        int iC = uc.a.c(context, ic.b.f20612o, "TextInputLayout");
        hd.g gVar2 = new hd.g(gVar.E());
        int iJ = uc.a.j(i10, iC, 0.1f);
        gVar2.a0(new ColorStateList(iArr, new int[]{iJ, 0}));
        gVar2.setTint(iC);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iJ, iC});
        hd.g gVar3 = new hd.g(gVar.E());
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
        EditText editText = this.f8303d;
        if (!(editText instanceof AutoCompleteTextView) || q.a(editText)) {
            return this.F;
        }
        int iD = uc.a.d(this.f8303d, ic.b.f20603h);
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
        textView.setContentDescription(context.getString(z10 ? i.f20732c : i.b, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    private void setEditText(EditText editText) {
        if (this.f8303d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f8303d = editText;
        int i10 = this.f8307f;
        if (i10 != -1) {
            setMinEms(i10);
        } else {
            setMinWidth(this.f8311h);
        }
        int i11 = this.f8309g;
        if (i11 != -1) {
            setMaxEms(i11);
        } else {
            setMaxWidth(this.f8313i);
        }
        this.I = false;
        U();
        setTextInputAccessibilityDelegate(new d(this));
        this.f8340v0.i0(this.f8303d.getTypeface());
        this.f8340v0.a0(this.f8303d.getTextSize());
        int i12 = Build.VERSION.SDK_INT;
        this.f8340v0.X(this.f8303d.getLetterSpacing());
        int gravity = this.f8303d.getGravity();
        this.f8340v0.S((gravity & (-113)) | 48);
        this.f8340v0.Z(gravity);
        this.f8336t0 = o0.A(editText);
        this.f8303d.addTextChangedListener(new a(editText));
        if (this.f8314i0 == null) {
            this.f8314i0 = this.f8303d.getHintTextColors();
        }
        if (this.C) {
            if (TextUtils.isEmpty(this.D)) {
                CharSequence hint = this.f8303d.getHint();
                this.f8305e = hint;
                setHint(hint);
                this.f8303d.setHint((CharSequence) null);
            }
            this.E = true;
        }
        if (i12 >= 29) {
            n0();
        }
        if (this.f8325o != null) {
            k0(this.f8303d.getText());
        }
        p0();
        this.f8315j.f();
        this.b.bringToFront();
        this.f8301c.bringToFront();
        C();
        this.f8301c.x0();
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
        this.f8340v0.g0(charSequence);
        if (this.f8338u0) {
            return;
        }
        V();
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f8333s == z10) {
            return;
        }
        if (z10) {
            j();
        } else {
            Z();
            this.f8335t = null;
        }
        this.f8333s = z10;
    }

    public final o5.e A() {
        o5.e eVar = new o5.e();
        eVar.t0(h.f(getContext(), ic.b.K, 87));
        eVar.v0(h.g(getContext(), ic.b.Q, jc.a.f21812a));
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
        boolean z11 = isFocused() || ((editText2 = this.f8303d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f8303d) != null && editText.isHovered())) {
            z10 = true;
        }
        if (!isEnabled()) {
            this.T = this.f8334s0;
        } else if (d0()) {
            if (this.f8324n0 != null) {
                z0(z11, z10);
            } else {
                this.T = getErrorCurrentTextColors();
            }
        } else if (!this.f8321m || (textView = this.f8325o) == null) {
            if (z11) {
                this.T = this.f8322m0;
            } else if (z10) {
                this.T = this.f8320l0;
            } else {
                this.T = this.f8318k0;
            }
        } else if (this.f8324n0 != null) {
            z0(z11, z10);
        } else {
            this.T = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            n0();
        }
        this.f8301c.I();
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
                this.U = this.f8328p0;
            } else if (z10 && !z11) {
                this.U = this.f8332r0;
            } else if (z11) {
                this.U = this.f8330q0;
            } else {
                this.U = this.f8326o0;
            }
        }
        m();
    }

    public final boolean B() {
        return this.C && !TextUtils.isEmpty(this.D) && (this.F instanceof kd.h);
    }

    public final void C() {
        Iterator<f> it = this.f8306e0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    public final void D(Canvas canvas) {
        hd.g gVar;
        if (this.K == null || (gVar = this.J) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.f8303d.isFocused()) {
            Rect bounds = this.K.getBounds();
            Rect bounds2 = this.J.getBounds();
            float fX = this.f8340v0.x();
            int iCenterX = bounds2.centerX();
            bounds.left = jc.a.c(iCenterX, bounds2.left, fX);
            bounds.right = jc.a.c(iCenterX, bounds2.right, fX);
            this.K.draw(canvas);
        }
    }

    public final void E(@NonNull Canvas canvas) {
        if (this.C) {
            this.f8340v0.l(canvas);
        }
    }

    public final void F(boolean z10) {
        ValueAnimator valueAnimator = this.f8346y0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f8346y0.cancel();
        }
        if (z10 && this.f8344x0) {
            l(0.0f);
        } else {
            this.f8340v0.c0(0.0f);
        }
        if (B() && ((kd.h) this.F).q0()) {
            y();
        }
        this.f8338u0 = true;
        L();
        this.b.l(true);
        this.f8301c.H(true);
    }

    public final hd.g G(boolean z10) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(ic.d.f20645g0);
        float f10 = z10 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f8303d;
        float popupElevation = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).getPopupElevation() : getResources().getDimensionPixelOffset(ic.d.f20661r);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(ic.d.f20634a0);
        k kVarM = k.a().A(f10).E(f10).s(dimensionPixelOffset).w(dimensionPixelOffset).m();
        EditText editText2 = this.f8303d;
        hd.g gVarM = hd.g.m(getContext(), popupElevation, editText2 instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText2).getDropDownBackgroundTintList() : null);
        gVarM.setShapeAppearanceModel(kVarM);
        gVarM.c0(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return gVarM;
    }

    public final int I(int i10, boolean z10) {
        int compoundPaddingLeft;
        if (z10 || getPrefixText() == null) {
            compoundPaddingLeft = (!z10 || getSuffixText() == null) ? this.f8303d.getCompoundPaddingLeft() : this.f8301c.y();
        } else {
            compoundPaddingLeft = this.b.c();
        }
        return i10 + compoundPaddingLeft;
    }

    public final int J(int i10, boolean z10) {
        int compoundPaddingRight;
        if (z10 || getSuffixText() == null) {
            compoundPaddingRight = (!z10 || getPrefixText() == null) ? this.f8303d.getCompoundPaddingRight() : this.b.c();
        } else {
            compoundPaddingRight = this.f8301c.y();
        }
        return i10 - compoundPaddingRight;
    }

    public final void L() {
        TextView textView = this.f8335t;
        if (textView == null || !this.f8333s) {
            return;
        }
        textView.setText((CharSequence) null);
        y.a(this.f8298a, this.f8343x);
        this.f8335t.setVisibility(4);
    }

    public boolean M() {
        return this.f8301c.F();
    }

    public boolean N() {
        return this.f8315j.A();
    }

    public boolean O() {
        return this.f8315j.B();
    }

    public final boolean P() {
        return this.f8338u0;
    }

    public final boolean Q() {
        if (d0()) {
            return true;
        }
        return this.f8325o != null && this.f8321m;
    }

    public boolean R() {
        return this.E;
    }

    public final boolean S() {
        return this.O == 1 && this.f8303d.getMinLines() <= 1;
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
            RectF rectF = this.f8299a0;
            this.f8340v0.o(rectF, this.f8303d.getWidth(), this.f8303d.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            o(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.Q);
            ((kd.h) this.F).t0(rectF);
        }
    }

    public final void W() {
        if (!B() || this.f8338u0) {
            return;
        }
        y();
        V();
    }

    public void Y() {
        this.b.m();
    }

    public final void Z() {
        TextView textView = this.f8335t;
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
        hd.g gVar = this.F;
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
        this.f8298a.addView(view, layoutParams2);
        this.f8298a.setLayoutParams(layoutParams);
        t0();
        setEditText((EditText) view);
    }

    public final void b0() {
        EditText editText = this.f8303d;
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
        textView.setTextColor(l2.b.c(getContext(), ic.c.f20624a));
    }

    public boolean d0() {
        return this.f8315j.l();
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(@NonNull ViewStructure viewStructure, int i10) {
        EditText editText = this.f8303d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f8305e != null) {
            boolean z10 = this.E;
            this.E = false;
            CharSequence hint = editText.getHint();
            this.f8303d.setHint(this.f8305e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f8303d.setHint(hint);
                this.E = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        viewStructure.setChildCount(this.f8298a.getChildCount());
        for (int i11 = 0; i11 < this.f8298a.getChildCount(); i11++) {
            View childAt = this.f8298a.getChildAt(i11);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i10);
            if (childAt == this.f8303d) {
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
        if (this.f8348z0) {
            return;
        }
        this.f8348z0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        ad.a aVar = this.f8340v0;
        boolean zF0 = aVar != null ? aVar.f0(drawableState) : false;
        if (this.f8303d != null) {
            u0(o0.R(this) && isEnabled());
        }
        p0();
        A0();
        if (zF0) {
            invalidate();
        }
        this.f8348z0 = false;
    }

    public final boolean e0() {
        return (this.f8301c.G() || ((this.f8301c.A() && M()) || this.f8301c.w() != null)) && this.f8301c.getMeasuredWidth() > 0;
    }

    public final boolean f0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.b.getMeasuredWidth() > 0;
    }

    public final void g0() {
        if (this.f8335t == null || !this.f8333s || TextUtils.isEmpty(this.f8331r)) {
            return;
        }
        this.f8335t.setText(this.f8331r);
        y.a(this.f8298a, this.f8341w);
        this.f8335t.setVisibility(0);
        this.f8335t.bringToFront();
        announceForAccessibility(this.f8331r);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f8303d;
        return editText != null ? editText.getBaseline() + getPaddingTop() + v() : super.getBaseline();
    }

    @NonNull
    public hd.g getBoxBackground() {
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
        return r.h(this) ? this.L.j().a(this.f8299a0) : this.L.l().a(this.f8299a0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return r.h(this) ? this.L.l().a(this.f8299a0) : this.L.j().a(this.f8299a0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return r.h(this) ? this.L.r().a(this.f8299a0) : this.L.t().a(this.f8299a0);
    }

    public float getBoxCornerRadiusTopStart() {
        return r.h(this) ? this.L.t().a(this.f8299a0) : this.L.r().a(this.f8299a0);
    }

    public int getBoxStrokeColor() {
        return this.f8322m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f8324n0;
    }

    public int getBoxStrokeWidth() {
        return this.R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.S;
    }

    public int getCounterMaxLength() {
        return this.f8319l;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f8317k && this.f8321m && (textView = this.f8325o) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f8347z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f8345y;
    }

    public ColorStateList getCursorColor() {
        return this.A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f8314i0;
    }

    public EditText getEditText() {
        return this.f8303d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f8301c.l();
    }

    public Drawable getEndIconDrawable() {
        return this.f8301c.n();
    }

    public int getEndIconMinSize() {
        return this.f8301c.o();
    }

    public int getEndIconMode() {
        return this.f8301c.p();
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.f8301c.q();
    }

    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.f8301c.r();
    }

    public CharSequence getError() {
        if (this.f8315j.A()) {
            return this.f8315j.p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f8315j.n();
    }

    public CharSequence getErrorContentDescription() {
        return this.f8315j.o();
    }

    public int getErrorCurrentTextColors() {
        return this.f8315j.q();
    }

    public Drawable getErrorIconDrawable() {
        return this.f8301c.s();
    }

    public CharSequence getHelperText() {
        if (this.f8315j.B()) {
            return this.f8315j.s();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f8315j.u();
    }

    public CharSequence getHint() {
        if (this.C) {
            return this.D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f8340v0.q();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.f8340v0.t();
    }

    public ColorStateList getHintTextColor() {
        return this.f8316j0;
    }

    @NonNull
    public e getLengthCounter() {
        return this.f8323n;
    }

    public int getMaxEms() {
        return this.f8309g;
    }

    public int getMaxWidth() {
        return this.f8313i;
    }

    public int getMinEms() {
        return this.f8307f;
    }

    public int getMinWidth() {
        return this.f8311h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f8301c.u();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f8301c.v();
    }

    public CharSequence getPlaceholderText() {
        if (this.f8333s) {
            return this.f8331r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f8339v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f8337u;
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
        return this.f8301c.w();
    }

    public ColorStateList getSuffixTextColor() {
        return this.f8301c.x();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.f8301c.z();
    }

    public Typeface getTypeface() {
        return this.f8300b0;
    }

    public final void h0() {
        if (this.O == 1) {
            if (ed.c.h(getContext())) {
                this.P = getResources().getDimensionPixelSize(ic.d.G);
            } else if (ed.c.g(getContext())) {
                this.P = getResources().getDimensionPixelSize(ic.d.F);
            }
        }
    }

    public void i(@NonNull f fVar) {
        this.f8306e0.add(fVar);
        if (this.f8303d != null) {
            fVar.a(this);
        }
    }

    public final void i0(@NonNull Rect rect) {
        hd.g gVar = this.J;
        if (gVar != null) {
            int i10 = rect.bottom;
            gVar.setBounds(rect.left, i10 - this.R, rect.right, i10);
        }
        hd.g gVar2 = this.K;
        if (gVar2 != null) {
            int i11 = rect.bottom;
            gVar2.setBounds(rect.left, i11 - this.S, rect.right, i11);
        }
    }

    public final void j() {
        TextView textView = this.f8335t;
        if (textView != null) {
            this.f8298a.addView(textView);
            this.f8335t.setVisibility(0);
        }
    }

    public final void j0() {
        if (this.f8325o != null) {
            EditText editText = this.f8303d;
            k0(editText == null ? null : editText.getText());
        }
    }

    public final void k() {
        if (this.f8303d == null || this.O != 1) {
            return;
        }
        if (ed.c.h(getContext())) {
            EditText editText = this.f8303d;
            o0.B0(editText, o0.E(editText), getResources().getDimensionPixelSize(ic.d.E), o0.D(this.f8303d), getResources().getDimensionPixelSize(ic.d.D));
        } else if (ed.c.g(getContext())) {
            EditText editText2 = this.f8303d;
            o0.B0(editText2, o0.E(editText2), getResources().getDimensionPixelSize(ic.d.C), o0.D(this.f8303d), getResources().getDimensionPixelSize(ic.d.B));
        }
    }

    public void k0(Editable editable) {
        int iA = this.f8323n.a(editable);
        boolean z10 = this.f8321m;
        int i10 = this.f8319l;
        if (i10 == -1) {
            this.f8325o.setText(String.valueOf(iA));
            this.f8325o.setContentDescription(null);
            this.f8321m = false;
        } else {
            this.f8321m = iA > i10;
            l0(getContext(), this.f8325o, iA, this.f8319l, this.f8321m);
            if (z10 != this.f8321m) {
                m0();
            }
            this.f8325o.setText(w2.a.c().j(getContext().getString(i.f20733d, Integer.valueOf(iA), Integer.valueOf(this.f8319l))));
        }
        if (this.f8303d == null || z10 == this.f8321m) {
            return;
        }
        u0(false);
        A0();
        p0();
    }

    public void l(float f10) {
        if (this.f8340v0.x() == f10) {
            return;
        }
        if (this.f8346y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f8346y0 = valueAnimator;
            valueAnimator.setInterpolator(h.g(getContext(), ic.b.P, jc.a.b));
            this.f8346y0.setDuration(h.f(getContext(), ic.b.I, 167));
            this.f8346y0.addUpdateListener(new c());
        }
        this.f8346y0.setFloatValues(this.f8340v0.x(), f10);
        this.f8346y0.start();
    }

    public final void m() {
        hd.g gVar = this.F;
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
        TextView textView = this.f8325o;
        if (textView != null) {
            c0(textView, this.f8321m ? this.f8327p : this.f8329q);
            if (!this.f8321m && (colorStateList2 = this.f8345y) != null) {
                this.f8325o.setTextColor(colorStateList2);
            }
            if (!this.f8321m || (colorStateList = this.f8347z) == null) {
                return;
            }
            this.f8325o.setTextColor(colorStateList);
        }
    }

    public final void n() {
        if (this.J == null || this.K == null) {
            return;
        }
        if (x()) {
            this.J.a0(this.f8303d.isFocused() ? ColorStateList.valueOf(this.f8318k0) : ColorStateList.valueOf(this.T));
            this.K.a0(ColorStateList.valueOf(this.T));
        }
        invalidate();
    }

    public final void n0() {
        ColorStateList colorStateList;
        ColorStateList colorStateListG = this.A;
        if (colorStateListG == null) {
            colorStateListG = uc.a.g(getContext(), ic.b.f20601g);
        }
        EditText editText = this.f8303d;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = q2.a.r(this.f8303d.getTextCursorDrawable()).mutate();
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
        if (this.f8303d == null) {
            return false;
        }
        boolean z11 = true;
        if (f0()) {
            int measuredWidth = this.b.getMeasuredWidth() - this.f8303d.getPaddingLeft();
            if (this.f8302c0 == null || this.f8304d0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f8302c0 = colorDrawable;
                this.f8304d0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrD = d3.i.d(this.f8303d);
            Drawable drawable = drawableArrD[0];
            Drawable drawable2 = this.f8302c0;
            if (drawable != drawable2) {
                d3.i.m(this.f8303d, drawable2, drawableArrD[1], drawableArrD[2], drawableArrD[3]);
                z10 = true;
            } else {
                z10 = false;
            }
        } else if (this.f8302c0 != null) {
            Drawable[] drawableArrD2 = d3.i.d(this.f8303d);
            d3.i.m(this.f8303d, null, drawableArrD2[1], drawableArrD2[2], drawableArrD2[3]);
            this.f8302c0 = null;
            z10 = true;
        } else {
            z10 = false;
        }
        if (e0()) {
            int measuredWidth2 = this.f8301c.z().getMeasuredWidth() - this.f8303d.getPaddingRight();
            CheckableImageButton checkableImageButtonK = this.f8301c.k();
            if (checkableImageButtonK != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButtonK.getMeasuredWidth() + n.b((ViewGroup.MarginLayoutParams) checkableImageButtonK.getLayoutParams());
            }
            Drawable[] drawableArrD3 = d3.i.d(this.f8303d);
            Drawable drawable3 = this.f8308f0;
            if (drawable3 != null && this.f8310g0 != measuredWidth2) {
                this.f8310g0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                d3.i.m(this.f8303d, drawableArrD3[0], drawableArrD3[1], this.f8308f0, drawableArrD3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.f8308f0 = colorDrawable2;
                this.f8310g0 = measuredWidth2;
                colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = drawableArrD3[2];
            Drawable drawable5 = this.f8308f0;
            if (drawable4 != drawable5) {
                this.f8312h0 = drawable4;
                d3.i.m(this.f8303d, drawableArrD3[0], drawableArrD3[1], drawable5, drawableArrD3[3]);
                return true;
            }
        } else if (this.f8308f0 != null) {
            Drawable[] drawableArrD4 = d3.i.d(this.f8303d);
            if (drawableArrD4[2] == this.f8308f0) {
                d3.i.m(this.f8303d, drawableArrD4[0], drawableArrD4[1], this.f8312h0, drawableArrD4[3]);
            } else {
                z11 = z10;
            }
            this.f8308f0 = null;
            return z11;
        }
        return z10;
    }

    @Override // android.view.View
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f8340v0.H(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f8301c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.B0 = false;
        boolean zS0 = s0();
        boolean zO0 = o0();
        if (zS0 || zO0) {
            this.f8303d.post(new Runnable() { // from class: kd.y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22636a.f8303d.requestLayout();
                }
            });
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f8303d;
        if (editText != null) {
            Rect rect = this.V;
            ad.c.a(this, editText, rect);
            i0(rect);
            if (this.C) {
                this.f8340v0.a0(this.f8303d.getTextSize());
                int gravity = this.f8303d.getGravity();
                this.f8340v0.S((gravity & (-113)) | 48);
                this.f8340v0.Z(gravity);
                this.f8340v0.O(r(rect));
                this.f8340v0.W(u(rect));
                this.f8340v0.J();
                if (!B() || this.f8338u0) {
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
            this.f8301c.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.B0 = true;
        }
        w0();
        this.f8301c.x0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setError(savedState.f8349c);
        if (savedState.f8350d) {
            post(new b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = i10 == 1;
        if (z10 != this.M) {
            float fA = this.L.r().a(this.f8299a0);
            float fA2 = this.L.t().a(this.f8299a0);
            k kVarM = k.a().z(this.L.s()).D(this.L.q()).r(this.L.k()).v(this.L.i()).A(fA2).E(fA).s(this.L.l().a(this.f8299a0)).w(this.L.j().a(this.f8299a0)).m();
            this.M = z10;
            setShapeAppearanceModel(kVarM);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (d0()) {
            savedState.f8349c = getError();
        }
        savedState.f8350d = this.f8301c.E();
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
            this.F = new hd.g(this.L);
            this.J = new hd.g();
            this.K = new hd.g();
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(this.O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.C || (this.F instanceof kd.h)) {
                this.F = new hd.g(this.L);
            } else {
                this.F = kd.h.o0(this.L);
            }
            this.J = null;
            this.K = null;
        }
    }

    public void p0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f8303d;
        if (editText == null || this.O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (k0.a(background)) {
            background = background.mutate();
        }
        if (d0()) {
            background.setColorFilter(q.k.e(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f8321m && (textView = this.f8325o) != null) {
            background.setColorFilter(q.k.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            q2.a.c(background);
            this.f8303d.refreshDrawableState();
        }
    }

    public final int q() {
        return this.O == 1 ? uc.a.i(uc.a.e(this, ic.b.f20612o, 0), this.U) : this.U;
    }

    public final void q0() {
        o0.q0(this.f8303d, getEditTextBoxBackground());
    }

    @NonNull
    public final Rect r(@NonNull Rect rect) {
        if (this.f8303d == null) {
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
        rect2.left = rect.left + this.f8303d.getPaddingLeft();
        rect2.top = rect.top - v();
        rect2.right = rect.right - this.f8303d.getPaddingRight();
        return rect2;
    }

    public void r0() {
        EditText editText = this.f8303d;
        if (editText == null || this.F == null) {
            return;
        }
        if ((this.I || editText.getBackground() == null) && this.O != 0) {
            q0();
            this.I = true;
        }
    }

    public final int s(@NonNull Rect rect, @NonNull Rect rect2, float f10) {
        return S() ? (int) (rect2.top + f10) : rect.bottom - this.f8303d.getCompoundPaddingBottom();
    }

    public final boolean s0() {
        int iMax;
        if (this.f8303d == null || this.f8303d.getMeasuredHeight() >= (iMax = Math.max(this.f8301c.getMeasuredHeight(), this.b.getMeasuredHeight()))) {
            return false;
        }
        this.f8303d.setMinimumHeight(iMax);
        return true;
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.U != i10) {
            this.U = i10;
            this.f8326o0 = i10;
            this.f8330q0 = i10;
            this.f8332r0 = i10;
            m();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(l2.b.c(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f8326o0 = defaultColor;
        this.U = defaultColor;
        this.f8328p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f8330q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f8332r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.O) {
            return;
        }
        this.O = i10;
        if (this.f8303d != null) {
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
        if (this.f8322m0 != i10) {
            this.f8322m0 = i10;
            A0();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f8318k0 = colorStateList.getDefaultColor();
            this.f8334s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f8320l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f8322m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f8322m0 != colorStateList.getDefaultColor()) {
            this.f8322m0 = colorStateList.getDefaultColor();
        }
        A0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f8324n0 != colorStateList) {
            this.f8324n0 = colorStateList;
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
        if (this.f8317k != z10) {
            if (z10) {
                b0 b0Var = new b0(getContext());
                this.f8325o = b0Var;
                b0Var.setId(ic.f.P);
                Typeface typeface = this.f8300b0;
                if (typeface != null) {
                    this.f8325o.setTypeface(typeface);
                }
                this.f8325o.setMaxLines(1);
                this.f8315j.e(this.f8325o, 2);
                n.d((ViewGroup.MarginLayoutParams) this.f8325o.getLayoutParams(), getResources().getDimensionPixelOffset(ic.d.f20655l0));
                m0();
                j0();
            } else {
                this.f8315j.C(this.f8325o, 2);
                this.f8325o = null;
            }
            this.f8317k = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f8319l != i10) {
            if (i10 > 0) {
                this.f8319l = i10;
            } else {
                this.f8319l = -1;
            }
            if (this.f8317k) {
                j0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f8327p != i10) {
            this.f8327p = i10;
            m0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f8347z != colorStateList) {
            this.f8347z = colorStateList;
            m0();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f8329q != i10) {
            this.f8329q = i10;
            m0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f8345y != colorStateList) {
            this.f8345y = colorStateList;
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
        this.f8314i0 = colorStateList;
        this.f8316j0 = colorStateList;
        if (this.f8303d != null) {
            u0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        X(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f8301c.N(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f8301c.O(z10);
    }

    public void setEndIconContentDescription(int i10) {
        this.f8301c.P(i10);
    }

    public void setEndIconDrawable(int i10) {
        this.f8301c.R(i10);
    }

    public void setEndIconMinSize(int i10) {
        this.f8301c.T(i10);
    }

    public void setEndIconMode(int i10) {
        this.f8301c.U(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f8301c.V(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f8301c.W(onLongClickListener);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.f8301c.X(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.f8301c.Y(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.f8301c.Z(mode);
    }

    public void setEndIconVisible(boolean z10) {
        this.f8301c.a0(z10);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f8315j.A()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f8315j.w();
        } else {
            this.f8315j.Q(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        this.f8315j.E(i10);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f8315j.F(charSequence);
    }

    public void setErrorEnabled(boolean z10) {
        this.f8315j.G(z10);
    }

    public void setErrorIconDrawable(int i10) {
        this.f8301c.b0(i10);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f8301c.d0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f8301c.e0(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f8301c.f0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.f8301c.g0(mode);
    }

    public void setErrorTextAppearance(int i10) {
        this.f8315j.H(i10);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f8315j.I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.f8342w0 != z10) {
            this.f8342w0 = z10;
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
            this.f8315j.R(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f8315j.L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        this.f8315j.K(z10);
    }

    public void setHelperTextTextAppearance(int i10) {
        this.f8315j.J(i10);
    }

    public void setHint(CharSequence charSequence) {
        if (this.C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(Barcode.FORMAT_PDF417);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.f8344x0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.C) {
            this.C = z10;
            if (z10) {
                CharSequence hint = this.f8303d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.D)) {
                        setHint(hint);
                    }
                    this.f8303d.setHint((CharSequence) null);
                }
                this.E = true;
            } else {
                this.E = false;
                if (!TextUtils.isEmpty(this.D) && TextUtils.isEmpty(this.f8303d.getHint())) {
                    this.f8303d.setHint(this.D);
                }
                setHintInternal(null);
            }
            if (this.f8303d != null) {
                t0();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        this.f8340v0.P(i10);
        this.f8316j0 = this.f8340v0.p();
        if (this.f8303d != null) {
            u0(false);
            t0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f8316j0 != colorStateList) {
            if (this.f8314i0 == null) {
                this.f8340v0.R(colorStateList);
            }
            this.f8316j0 = colorStateList;
            if (this.f8303d != null) {
                u0(false);
            }
        }
    }

    public void setLengthCounter(@NonNull e eVar) {
        this.f8323n = eVar;
    }

    public void setMaxEms(int i10) {
        this.f8309g = i10;
        EditText editText = this.f8303d;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(int i10) {
        this.f8313i = i10;
        EditText editText = this.f8303d;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f8307f = i10;
        EditText editText = this.f8303d;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(int i10) {
        this.f8311h = i10;
        EditText editText = this.f8303d;
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
        this.f8301c.i0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        this.f8301c.k0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        this.f8301c.m0(z10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f8301c.n0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f8301c.o0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f8335t == null) {
            b0 b0Var = new b0(getContext());
            this.f8335t = b0Var;
            b0Var.setId(ic.f.S);
            o0.w0(this.f8335t, 2);
            o5.e eVarA = A();
            this.f8341w = eVarA;
            eVarA.y0(67L);
            this.f8343x = A();
            setPlaceholderTextAppearance(this.f8339v);
            setPlaceholderTextColor(this.f8337u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f8333s) {
                setPlaceholderTextEnabled(true);
            }
            this.f8331r = charSequence;
        }
        x0();
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f8339v = i10;
        TextView textView = this.f8335t;
        if (textView != null) {
            d3.i.s(textView, i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f8337u != colorStateList) {
            this.f8337u = colorStateList;
            TextView textView = this.f8335t;
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
        hd.g gVar = this.F;
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
        this.f8301c.p0(charSequence);
    }

    public void setSuffixTextAppearance(int i10) {
        this.f8301c.q0(i10);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.f8301c.r0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(d dVar) {
        EditText editText = this.f8303d;
        if (editText != null) {
            o0.m0(editText, dVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f8300b0) {
            this.f8300b0 = typeface;
            this.f8340v0.i0(typeface);
            this.f8315j.N(typeface);
            TextView textView = this.f8325o;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public final int t(@NonNull Rect rect, float f10) {
        return S() ? (int) (rect.centerY() - (f10 / 2.0f)) : rect.top + this.f8303d.getCompoundPaddingTop();
    }

    public final void t0() {
        if (this.O != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f8298a.getLayoutParams();
            int iV = v();
            if (iV != layoutParams.topMargin) {
                layoutParams.topMargin = iV;
                this.f8298a.requestLayout();
            }
        }
    }

    @NonNull
    public final Rect u(@NonNull Rect rect) {
        if (this.f8303d == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.W;
        float fW = this.f8340v0.w();
        rect2.left = rect.left + this.f8303d.getCompoundPaddingLeft();
        rect2.top = t(rect, fW);
        rect2.right = rect.right - this.f8303d.getCompoundPaddingRight();
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
            fQ = this.f8340v0.q();
        } else {
            if (i10 != 2) {
                return 0;
            }
            fQ = this.f8340v0.q() / 2.0f;
        }
        return (int) fQ;
    }

    public final void v0(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f8303d;
        boolean z12 = false;
        boolean z13 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f8303d;
        if (editText2 != null && editText2.hasFocus()) {
            z12 = true;
        }
        ColorStateList colorStateList2 = this.f8314i0;
        if (colorStateList2 != null) {
            this.f8340v0.M(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f8314i0;
            this.f8340v0.M(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f8334s0) : this.f8334s0));
        } else if (d0()) {
            this.f8340v0.M(this.f8315j.r());
        } else if (this.f8321m && (textView = this.f8325o) != null) {
            this.f8340v0.M(textView.getTextColors());
        } else if (z12 && (colorStateList = this.f8316j0) != null) {
            this.f8340v0.R(colorStateList);
        }
        if (z13 || !this.f8342w0 || (isEnabled() && z12)) {
            if (z11 || this.f8338u0) {
                z(z10);
                return;
            }
            return;
        }
        if (z11 || !this.f8338u0) {
            F(z10);
        }
    }

    public final boolean w() {
        return this.O == 2 && x();
    }

    public final void w0() {
        EditText editText;
        if (this.f8335t == null || (editText = this.f8303d) == null) {
            return;
        }
        this.f8335t.setGravity(editText.getGravity());
        this.f8335t.setPadding(this.f8303d.getCompoundPaddingLeft(), this.f8303d.getCompoundPaddingTop(), this.f8303d.getCompoundPaddingRight(), this.f8303d.getCompoundPaddingBottom());
    }

    public final boolean x() {
        return this.Q > -1 && this.T != 0;
    }

    public final void x0() {
        EditText editText = this.f8303d;
        y0(editText == null ? null : editText.getText());
    }

    public final void y() {
        if (B()) {
            ((kd.h) this.F).r0();
        }
    }

    public final void y0(Editable editable) {
        if (this.f8323n.a(editable) != 0 || this.f8338u0) {
            L();
        } else {
            g0();
        }
    }

    public final void z(boolean z10) {
        ValueAnimator valueAnimator = this.f8346y0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f8346y0.cancel();
        }
        if (z10 && this.f8344x0) {
            l(1.0f);
        } else {
            this.f8340v0.c0(1.0f);
        }
        this.f8338u0 = false;
        if (B()) {
            V();
        }
        x0();
        this.b.l(false);
        this.f8301c.H(false);
    }

    public final void z0(boolean z10, boolean z11) {
        int defaultColor = this.f8324n0.getDefaultColor();
        int colorForState = this.f8324n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f8324n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
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
        super(md.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f8307f = -1;
        this.f8309g = -1;
        this.f8311h = -1;
        this.f8313i = -1;
        this.f8315j = new t(this);
        this.f8323n = new e() { // from class: kd.z
            @Override // com.google.android.material.textfield.TextInputLayout.e
            public final int a(Editable editable) {
                return TextInputLayout.b(editable);
            }
        };
        this.V = new Rect();
        this.W = new Rect();
        this.f8299a0 = new RectF();
        this.f8306e0 = new LinkedHashSet<>();
        ad.a aVar = new ad.a(this);
        this.f8340v0 = aVar;
        this.B0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f8298a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = jc.a.f21812a;
        aVar.h0(timeInterpolator);
        aVar.e0(timeInterpolator);
        aVar.S(8388659);
        int[] iArr = ic.k.f20975v6;
        int i12 = ic.k.S6;
        int i13 = ic.k.Q6;
        int i14 = ic.k.f20878k7;
        int i15 = ic.k.f20923p7;
        int i16 = ic.k.f20959t7;
        a1 a1VarJ = o.j(context2, attributeSet, iArr, i10, i11, i12, i13, i14, i15, i16);
        x xVar = new x(this, a1VarJ);
        this.b = xVar;
        this.C = a1VarJ.a(ic.k.f20950s7, true);
        setHint(a1VarJ.p(ic.k.A6));
        this.f8344x0 = a1VarJ.a(ic.k.f20941r7, true);
        this.f8342w0 = a1VarJ.a(ic.k.f20896m7, true);
        int i17 = ic.k.C6;
        if (a1VarJ.s(i17)) {
            setMinEms(a1VarJ.k(i17, -1));
        } else {
            int i18 = ic.k.f21010z6;
            if (a1VarJ.s(i18)) {
                setMinWidth(a1VarJ.f(i18, -1));
            }
        }
        int i19 = ic.k.B6;
        if (a1VarJ.s(i19)) {
            setMaxEms(a1VarJ.k(i19, -1));
        } else {
            int i20 = ic.k.f21001y6;
            if (a1VarJ.s(i20)) {
                setMaxWidth(a1VarJ.f(i20, -1));
            }
        }
        this.L = k.e(context2, attributeSet, i10, i11).m();
        this.N = context2.getResources().getDimensionPixelOffset(ic.d.f20649i0);
        this.P = a1VarJ.e(ic.k.F6, 0);
        this.R = a1VarJ.f(ic.k.M6, context2.getResources().getDimensionPixelSize(ic.d.f20651j0));
        this.S = a1VarJ.f(ic.k.N6, context2.getResources().getDimensionPixelSize(ic.d.f20653k0));
        this.Q = this.R;
        float fD = a1VarJ.d(ic.k.J6, -1.0f);
        float fD2 = a1VarJ.d(ic.k.I6, -1.0f);
        float fD3 = a1VarJ.d(ic.k.G6, -1.0f);
        float fD4 = a1VarJ.d(ic.k.H6, -1.0f);
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
        ColorStateList colorStateListB = ed.c.b(context2, a1VarJ, ic.k.D6);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.f8326o0 = defaultColor;
            this.U = defaultColor;
            if (colorStateListB.isStateful()) {
                this.f8328p0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.f8330q0 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f8332r0 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f8330q0 = this.f8326o0;
                ColorStateList colorStateListA = k.a.a(context2, ic.c.f20629g);
                this.f8328p0 = colorStateListA.getColorForState(new int[]{-16842910}, -1);
                this.f8332r0 = colorStateListA.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.U = 0;
            this.f8326o0 = 0;
            this.f8328p0 = 0;
            this.f8330q0 = 0;
            this.f8332r0 = 0;
        }
        int i21 = ic.k.f20992x6;
        if (a1VarJ.s(i21)) {
            ColorStateList colorStateListC = a1VarJ.c(i21);
            this.f8316j0 = colorStateListC;
            this.f8314i0 = colorStateListC;
        }
        int i22 = ic.k.K6;
        ColorStateList colorStateListB2 = ed.c.b(context2, a1VarJ, i22);
        this.f8322m0 = a1VarJ.b(i22, 0);
        this.f8318k0 = l2.b.c(context2, ic.c.f20630h);
        this.f8334s0 = l2.b.c(context2, ic.c.f20631i);
        this.f8320l0 = l2.b.c(context2, ic.c.f20632j);
        if (colorStateListB2 != null) {
            setBoxStrokeColorStateList(colorStateListB2);
        }
        int i23 = ic.k.L6;
        if (a1VarJ.s(i23)) {
            setBoxStrokeErrorColor(ed.c.b(context2, a1VarJ, i23));
        }
        if (a1VarJ.n(i16, -1) != -1) {
            setHintTextAppearance(a1VarJ.n(i16, 0));
        }
        this.A = a1VarJ.c(ic.k.U6);
        this.B = a1VarJ.c(ic.k.V6);
        int iN = a1VarJ.n(i14, 0);
        CharSequence charSequenceP = a1VarJ.p(ic.k.f20833f7);
        int iK = a1VarJ.k(ic.k.f20824e7, 1);
        boolean zA = a1VarJ.a(ic.k.f20842g7, false);
        int iN2 = a1VarJ.n(i15, 0);
        boolean zA2 = a1VarJ.a(ic.k.f20914o7, false);
        CharSequence charSequenceP2 = a1VarJ.p(ic.k.f20905n7);
        int iN3 = a1VarJ.n(ic.k.B7, 0);
        CharSequence charSequenceP3 = a1VarJ.p(ic.k.A7);
        boolean zA3 = a1VarJ.a(ic.k.O6, false);
        setCounterMaxLength(a1VarJ.k(ic.k.P6, -1));
        this.f8329q = a1VarJ.n(i12, 0);
        this.f8327p = a1VarJ.n(i13, 0);
        setBoxBackgroundMode(a1VarJ.k(ic.k.E6, 0));
        setErrorContentDescription(charSequenceP);
        setErrorAccessibilityLiveRegion(iK);
        setCounterOverflowTextAppearance(this.f8327p);
        setHelperTextTextAppearance(iN2);
        setErrorTextAppearance(iN);
        setCounterTextAppearance(this.f8329q);
        setPlaceholderText(charSequenceP3);
        setPlaceholderTextAppearance(iN3);
        int i24 = ic.k.f20887l7;
        if (a1VarJ.s(i24)) {
            setErrorTextColor(a1VarJ.c(i24));
        }
        int i25 = ic.k.f20932q7;
        if (a1VarJ.s(i25)) {
            setHelperTextColor(a1VarJ.c(i25));
        }
        int i26 = ic.k.f20968u7;
        if (a1VarJ.s(i26)) {
            setHintTextColor(a1VarJ.c(i26));
        }
        int i27 = ic.k.T6;
        if (a1VarJ.s(i27)) {
            setCounterTextColor(a1VarJ.c(i27));
        }
        int i28 = ic.k.R6;
        if (a1VarJ.s(i28)) {
            setCounterOverflowTextColor(a1VarJ.c(i28));
        }
        int i29 = ic.k.C7;
        if (a1VarJ.s(i29)) {
            setPlaceholderTextColor(a1VarJ.c(i29));
        }
        com.google.android.material.textfield.a aVar2 = new com.google.android.material.textfield.a(this, a1VarJ);
        this.f8301c = aVar2;
        boolean zA4 = a1VarJ.a(ic.k.f20983w6, true);
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
        this.f8301c.Q(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f8301c.S(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f8301c.c0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f8301c.j0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f8301c.l0(drawable);
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
