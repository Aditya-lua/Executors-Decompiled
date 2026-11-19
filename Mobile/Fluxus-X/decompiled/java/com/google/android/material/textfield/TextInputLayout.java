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
import bd.o;
import bd.r;
import com.github.luben.zstd.BuildConfig;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.mlkit.vision.barcode.common.Barcode;
import id.k;
import java.util.Iterator;
import java.util.LinkedHashSet;
import jc.i;
import jc.j;
import md.q;
import md.t;
import md.x;
import p5.y;
import q.b1;
import q.c0;
import q.l0;
import y2.p;

/* JADX INFO: loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int C0 = j.f20449j;
    public static final int[][] D0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public ColorStateList A;
    public boolean A0;
    public ColorStateList B;
    public boolean B0;
    public boolean C;
    public CharSequence D;
    public boolean E;
    public id.g F;
    public id.g G;
    public StateListDrawable H;
    public boolean I;
    public id.g J;
    public id.g K;

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
    public final FrameLayout f8141a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final RectF f8142a0;

    @NonNull
    public final x b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Typeface f8143b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final com.google.android.material.textfield.a f8144c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Drawable f8145c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EditText f8146d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f8147d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f8148e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final LinkedHashSet<f> f8149e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8150f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Drawable f8151f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8152g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f8153g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8154h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public Drawable f8155h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8156i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public ColorStateList f8157i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f8158j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public ColorStateList f8159j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8160k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f8161k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8162l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f8163l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f8164m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f8165m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public e f8166n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public ColorStateList f8167n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f8168o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f8169o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8170p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f8171p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8172q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f8173q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f8174r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f8175r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f8176s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f8177s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f8178t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f8179t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ColorStateList f8180u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f8181u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f8182v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final bd.a f8183v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p5.e f8184w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f8185w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public p5.e f8186x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f8187x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ColorStateList f8188y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public ValueAnimator f8189y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ColorStateList f8190z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f8191z0;

    public class a implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8192a;
        public final /* synthetic */ EditText b;

        public a(EditText editText) {
            this.b = editText;
            this.f8192a = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@NonNull Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.u0(!textInputLayout.A0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f8160k) {
                textInputLayout2.k0(editable);
            }
            if (TextInputLayout.this.f8176s) {
                TextInputLayout.this.y0(editable);
            }
            int lineCount = this.b.getLineCount();
            int i10 = this.f8192a;
            if (lineCount != i10) {
                if (lineCount < i10) {
                    int iA = o0.A(this.b);
                    int i11 = TextInputLayout.this.f8179t0;
                    if (iA != i11) {
                        this.b.setMinimumHeight(i11);
                    }
                }
                this.f8192a = lineCount;
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
            TextInputLayout.this.f8144c.h();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            TextInputLayout.this.f8183v0.c0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class d extends androidx.core.view.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextInputLayout f8196d;

        public d(@NonNull TextInputLayout textInputLayout) {
            this.f8196d = textInputLayout;
        }

        @Override // androidx.core.view.a
        public void g(@NonNull View view, @NonNull p pVar) {
            super.g(view, pVar);
            EditText editText = this.f8196d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f8196d.getHint();
            CharSequence error = this.f8196d.getError();
            CharSequence placeholderText = this.f8196d.getPlaceholderText();
            int counterMaxLength = this.f8196d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f8196d.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean zP = this.f8196d.P();
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z10 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : BuildConfig.FLAVOR;
            this.f8196d.b.A(pVar);
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
            View viewT = this.f8196d.f8158j.t();
            if (viewT != null) {
                pVar.y0(viewT);
            }
            this.f8196d.f8144c.m().o(view, pVar);
        }

        @Override // androidx.core.view.a
        public void h(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            this.f8196d.f8144c.m().p(view, accessibilityEvent);
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

    public static class h extends r3.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f8197c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f8198d;

        public class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(@NonNull Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        @NonNull
        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f8197c) + "}";
        }

        @Override // r3.a, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f8197c, parcel, i10);
            parcel.writeInt(this.f8198d ? 1 : 0);
        }

        public h(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8197c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f8198d = parcel.readInt() == 1;
        }
    }

    public TextInputLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, jc.b.f20290g0);
    }

    public static Drawable H(id.g gVar, int i10, int i11, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{vc.a.j(i11, i10, 0.1f), i10}), gVar, gVar);
    }

    public static Drawable K(Context context, id.g gVar, int i10, int[][] iArr) {
        int iC = vc.a.c(context, jc.b.f20300o, "TextInputLayout");
        id.g gVar2 = new id.g(gVar.E());
        int iJ = vc.a.j(i10, iC, 0.1f);
        gVar2.a0(new ColorStateList(iArr, new int[]{iJ, 0}));
        gVar2.setTint(iC);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iJ, iC});
        id.g gVar3 = new id.g(gVar.E());
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
        EditText editText = this.f8146d;
        if (!(editText instanceof AutoCompleteTextView) || q.a(editText)) {
            return this.F;
        }
        int iD = vc.a.d(this.f8146d, jc.b.f20291h);
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
        textView.setContentDescription(context.getString(z10 ? i.f20420c : i.b, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    private void setEditText(EditText editText) {
        if (this.f8146d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f8146d = editText;
        int i10 = this.f8150f;
        if (i10 != -1) {
            setMinEms(i10);
        } else {
            setMinWidth(this.f8154h);
        }
        int i11 = this.f8152g;
        if (i11 != -1) {
            setMaxEms(i11);
        } else {
            setMaxWidth(this.f8156i);
        }
        this.I = false;
        U();
        setTextInputAccessibilityDelegate(new d(this));
        this.f8183v0.i0(this.f8146d.getTypeface());
        this.f8183v0.a0(this.f8146d.getTextSize());
        int i12 = Build.VERSION.SDK_INT;
        this.f8183v0.X(this.f8146d.getLetterSpacing());
        int gravity = this.f8146d.getGravity();
        this.f8183v0.S((gravity & (-113)) | 48);
        this.f8183v0.Z(gravity);
        this.f8179t0 = o0.A(editText);
        this.f8146d.addTextChangedListener(new a(editText));
        if (this.f8157i0 == null) {
            this.f8157i0 = this.f8146d.getHintTextColors();
        }
        if (this.C) {
            if (TextUtils.isEmpty(this.D)) {
                CharSequence hint = this.f8146d.getHint();
                this.f8148e = hint;
                setHint(hint);
                this.f8146d.setHint((CharSequence) null);
            }
            this.E = true;
        }
        if (i12 >= 29) {
            n0();
        }
        if (this.f8168o != null) {
            k0(this.f8146d.getText());
        }
        p0();
        this.f8158j.f();
        this.b.bringToFront();
        this.f8144c.bringToFront();
        C();
        this.f8144c.x0();
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
        this.f8183v0.g0(charSequence);
        if (this.f8181u0) {
            return;
        }
        V();
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f8176s == z10) {
            return;
        }
        if (z10) {
            j();
        } else {
            Z();
            this.f8178t = null;
        }
        this.f8176s = z10;
    }

    public final p5.e A() {
        p5.e eVar = new p5.e();
        eVar.x0(dd.h.f(getContext(), jc.b.K, 87));
        eVar.z0(dd.h.g(getContext(), jc.b.Q, kc.a.f21325a));
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
        boolean z11 = isFocused() || ((editText2 = this.f8146d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f8146d) != null && editText.isHovered())) {
            z10 = true;
        }
        if (!isEnabled()) {
            this.T = this.f8177s0;
        } else if (d0()) {
            if (this.f8167n0 != null) {
                z0(z11, z10);
            } else {
                this.T = getErrorCurrentTextColors();
            }
        } else if (!this.f8164m || (textView = this.f8168o) == null) {
            if (z11) {
                this.T = this.f8165m0;
            } else if (z10) {
                this.T = this.f8163l0;
            } else {
                this.T = this.f8161k0;
            }
        } else if (this.f8167n0 != null) {
            z0(z11, z10);
        } else {
            this.T = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            n0();
        }
        this.f8144c.I();
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
                this.U = this.f8171p0;
            } else if (z10 && !z11) {
                this.U = this.f8175r0;
            } else if (z11) {
                this.U = this.f8173q0;
            } else {
                this.U = this.f8169o0;
            }
        }
        m();
    }

    public final boolean B() {
        return this.C && !TextUtils.isEmpty(this.D) && (this.F instanceof md.h);
    }

    public final void C() {
        Iterator<f> it = this.f8149e0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    public final void D(Canvas canvas) {
        id.g gVar;
        if (this.K == null || (gVar = this.J) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.f8146d.isFocused()) {
            Rect bounds = this.K.getBounds();
            Rect bounds2 = this.J.getBounds();
            float fX = this.f8183v0.x();
            int iCenterX = bounds2.centerX();
            bounds.left = kc.a.c(iCenterX, bounds2.left, fX);
            bounds.right = kc.a.c(iCenterX, bounds2.right, fX);
            this.K.draw(canvas);
        }
    }

    public final void E(@NonNull Canvas canvas) {
        if (this.C) {
            this.f8183v0.l(canvas);
        }
    }

    public final void F(boolean z10) {
        ValueAnimator valueAnimator = this.f8189y0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f8189y0.cancel();
        }
        if (z10 && this.f8187x0) {
            l(0.0f);
        } else {
            this.f8183v0.c0(0.0f);
        }
        if (B() && ((md.h) this.F).q0()) {
            y();
        }
        this.f8181u0 = true;
        L();
        this.b.l(true);
        this.f8144c.H(true);
    }

    public final id.g G(boolean z10) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(jc.d.f20333g0);
        float f10 = z10 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f8146d;
        float popupElevation = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).getPopupElevation() : getResources().getDimensionPixelOffset(jc.d.f20349r);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(jc.d.f20322a0);
        k kVarM = k.a().A(f10).E(f10).s(dimensionPixelOffset).w(dimensionPixelOffset).m();
        EditText editText2 = this.f8146d;
        id.g gVarM = id.g.m(getContext(), popupElevation, editText2 instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText2).getDropDownBackgroundTintList() : null);
        gVarM.setShapeAppearanceModel(kVarM);
        gVarM.c0(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return gVarM;
    }

    public final int I(int i10, boolean z10) {
        int compoundPaddingLeft;
        if (z10 || getPrefixText() == null) {
            compoundPaddingLeft = (!z10 || getSuffixText() == null) ? this.f8146d.getCompoundPaddingLeft() : this.f8144c.y();
        } else {
            compoundPaddingLeft = this.b.c();
        }
        return i10 + compoundPaddingLeft;
    }

    public final int J(int i10, boolean z10) {
        int compoundPaddingRight;
        if (z10 || getSuffixText() == null) {
            compoundPaddingRight = (!z10 || getPrefixText() == null) ? this.f8146d.getCompoundPaddingRight() : this.b.c();
        } else {
            compoundPaddingRight = this.f8144c.y();
        }
        return i10 - compoundPaddingRight;
    }

    public final void L() {
        TextView textView = this.f8178t;
        if (textView == null || !this.f8176s) {
            return;
        }
        textView.setText((CharSequence) null);
        y.a(this.f8141a, this.f8186x);
        this.f8178t.setVisibility(4);
    }

    public boolean M() {
        return this.f8144c.F();
    }

    public boolean N() {
        return this.f8158j.A();
    }

    public boolean O() {
        return this.f8158j.B();
    }

    public final boolean P() {
        return this.f8181u0;
    }

    public final boolean Q() {
        if (d0()) {
            return true;
        }
        return this.f8168o != null && this.f8164m;
    }

    public boolean R() {
        return this.E;
    }

    public final boolean S() {
        return this.O == 1 && this.f8146d.getMinLines() <= 1;
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
            RectF rectF = this.f8142a0;
            this.f8183v0.o(rectF, this.f8146d.getWidth(), this.f8146d.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            o(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.Q);
            ((md.h) this.F).t0(rectF);
        }
    }

    public final void W() {
        if (!B() || this.f8181u0) {
            return;
        }
        y();
        V();
    }

    public void Y() {
        this.b.m();
    }

    public final void Z() {
        TextView textView = this.f8178t;
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
        id.g gVar = this.F;
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
        this.f8141a.addView(view, layoutParams2);
        this.f8141a.setLayoutParams(layoutParams);
        t0();
        setEditText((EditText) view);
    }

    public final void b0() {
        EditText editText = this.f8146d;
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
        textView.setTextColor(l2.b.c(getContext(), jc.c.f20312a));
    }

    public boolean d0() {
        return this.f8158j.l();
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(@NonNull ViewStructure viewStructure, int i10) {
        EditText editText = this.f8146d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f8148e != null) {
            boolean z10 = this.E;
            this.E = false;
            CharSequence hint = editText.getHint();
            this.f8146d.setHint(this.f8148e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f8146d.setHint(hint);
                this.E = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        viewStructure.setChildCount(this.f8141a.getChildCount());
        for (int i11 = 0; i11 < this.f8141a.getChildCount(); i11++) {
            View childAt = this.f8141a.getChildAt(i11);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i10);
            if (childAt == this.f8146d) {
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
        if (this.f8191z0) {
            return;
        }
        this.f8191z0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        bd.a aVar = this.f8183v0;
        boolean zF0 = aVar != null ? aVar.f0(drawableState) : false;
        if (this.f8146d != null) {
            u0(o0.R(this) && isEnabled());
        }
        p0();
        A0();
        if (zF0) {
            invalidate();
        }
        this.f8191z0 = false;
    }

    public final boolean e0() {
        return (this.f8144c.G() || ((this.f8144c.A() && M()) || this.f8144c.w() != null)) && this.f8144c.getMeasuredWidth() > 0;
    }

    public final boolean f0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.b.getMeasuredWidth() > 0;
    }

    public final void g0() {
        if (this.f8178t == null || !this.f8176s || TextUtils.isEmpty(this.f8174r)) {
            return;
        }
        this.f8178t.setText(this.f8174r);
        y.a(this.f8141a, this.f8184w);
        this.f8178t.setVisibility(0);
        this.f8178t.bringToFront();
        announceForAccessibility(this.f8174r);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f8146d;
        return editText != null ? editText.getBaseline() + getPaddingTop() + v() : super.getBaseline();
    }

    @NonNull
    public id.g getBoxBackground() {
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
        return r.h(this) ? this.L.j().a(this.f8142a0) : this.L.l().a(this.f8142a0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return r.h(this) ? this.L.l().a(this.f8142a0) : this.L.j().a(this.f8142a0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return r.h(this) ? this.L.r().a(this.f8142a0) : this.L.t().a(this.f8142a0);
    }

    public float getBoxCornerRadiusTopStart() {
        return r.h(this) ? this.L.t().a(this.f8142a0) : this.L.r().a(this.f8142a0);
    }

    public int getBoxStrokeColor() {
        return this.f8165m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f8167n0;
    }

    public int getBoxStrokeWidth() {
        return this.R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.S;
    }

    public int getCounterMaxLength() {
        return this.f8162l;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f8160k && this.f8164m && (textView = this.f8168o) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f8190z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f8188y;
    }

    public ColorStateList getCursorColor() {
        return this.A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f8157i0;
    }

    public EditText getEditText() {
        return this.f8146d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f8144c.l();
    }

    public Drawable getEndIconDrawable() {
        return this.f8144c.n();
    }

    public int getEndIconMinSize() {
        return this.f8144c.o();
    }

    public int getEndIconMode() {
        return this.f8144c.p();
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.f8144c.q();
    }

    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.f8144c.r();
    }

    public CharSequence getError() {
        if (this.f8158j.A()) {
            return this.f8158j.p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f8158j.n();
    }

    public CharSequence getErrorContentDescription() {
        return this.f8158j.o();
    }

    public int getErrorCurrentTextColors() {
        return this.f8158j.q();
    }

    public Drawable getErrorIconDrawable() {
        return this.f8144c.s();
    }

    public CharSequence getHelperText() {
        if (this.f8158j.B()) {
            return this.f8158j.s();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f8158j.u();
    }

    public CharSequence getHint() {
        if (this.C) {
            return this.D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f8183v0.q();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.f8183v0.t();
    }

    public ColorStateList getHintTextColor() {
        return this.f8159j0;
    }

    @NonNull
    public e getLengthCounter() {
        return this.f8166n;
    }

    public int getMaxEms() {
        return this.f8152g;
    }

    public int getMaxWidth() {
        return this.f8156i;
    }

    public int getMinEms() {
        return this.f8150f;
    }

    public int getMinWidth() {
        return this.f8154h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f8144c.u();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f8144c.v();
    }

    public CharSequence getPlaceholderText() {
        if (this.f8176s) {
            return this.f8174r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f8182v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f8180u;
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
        return this.f8144c.w();
    }

    public ColorStateList getSuffixTextColor() {
        return this.f8144c.x();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.f8144c.z();
    }

    public Typeface getTypeface() {
        return this.f8143b0;
    }

    public final void h0() {
        if (this.O == 1) {
            if (fd.c.h(getContext())) {
                this.P = getResources().getDimensionPixelSize(jc.d.G);
            } else if (fd.c.g(getContext())) {
                this.P = getResources().getDimensionPixelSize(jc.d.F);
            }
        }
    }

    public void i(@NonNull f fVar) {
        this.f8149e0.add(fVar);
        if (this.f8146d != null) {
            fVar.a(this);
        }
    }

    public final void i0(@NonNull Rect rect) {
        id.g gVar = this.J;
        if (gVar != null) {
            int i10 = rect.bottom;
            gVar.setBounds(rect.left, i10 - this.R, rect.right, i10);
        }
        id.g gVar2 = this.K;
        if (gVar2 != null) {
            int i11 = rect.bottom;
            gVar2.setBounds(rect.left, i11 - this.S, rect.right, i11);
        }
    }

    public final void j() {
        TextView textView = this.f8178t;
        if (textView != null) {
            this.f8141a.addView(textView);
            this.f8178t.setVisibility(0);
        }
    }

    public final void j0() {
        if (this.f8168o != null) {
            EditText editText = this.f8146d;
            k0(editText == null ? null : editText.getText());
        }
    }

    public final void k() {
        if (this.f8146d == null || this.O != 1) {
            return;
        }
        if (fd.c.h(getContext())) {
            EditText editText = this.f8146d;
            o0.B0(editText, o0.E(editText), getResources().getDimensionPixelSize(jc.d.E), o0.D(this.f8146d), getResources().getDimensionPixelSize(jc.d.D));
        } else if (fd.c.g(getContext())) {
            EditText editText2 = this.f8146d;
            o0.B0(editText2, o0.E(editText2), getResources().getDimensionPixelSize(jc.d.C), o0.D(this.f8146d), getResources().getDimensionPixelSize(jc.d.B));
        }
    }

    public void k0(Editable editable) {
        int iA = this.f8166n.a(editable);
        boolean z10 = this.f8164m;
        int i10 = this.f8162l;
        if (i10 == -1) {
            this.f8168o.setText(String.valueOf(iA));
            this.f8168o.setContentDescription(null);
            this.f8164m = false;
        } else {
            this.f8164m = iA > i10;
            l0(getContext(), this.f8168o, iA, this.f8162l, this.f8164m);
            if (z10 != this.f8164m) {
                m0();
            }
            this.f8168o.setText(w2.a.c().j(getContext().getString(i.f20421d, Integer.valueOf(iA), Integer.valueOf(this.f8162l))));
        }
        if (this.f8146d == null || z10 == this.f8164m) {
            return;
        }
        u0(false);
        A0();
        p0();
    }

    public void l(float f10) {
        if (this.f8183v0.x() == f10) {
            return;
        }
        if (this.f8189y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f8189y0 = valueAnimator;
            valueAnimator.setInterpolator(dd.h.g(getContext(), jc.b.P, kc.a.b));
            this.f8189y0.setDuration(dd.h.f(getContext(), jc.b.I, 167));
            this.f8189y0.addUpdateListener(new c());
        }
        this.f8189y0.setFloatValues(this.f8183v0.x(), f10);
        this.f8189y0.start();
    }

    public final void m() {
        id.g gVar = this.F;
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
        TextView textView = this.f8168o;
        if (textView != null) {
            c0(textView, this.f8164m ? this.f8170p : this.f8172q);
            if (!this.f8164m && (colorStateList2 = this.f8188y) != null) {
                this.f8168o.setTextColor(colorStateList2);
            }
            if (!this.f8164m || (colorStateList = this.f8190z) == null) {
                return;
            }
            this.f8168o.setTextColor(colorStateList);
        }
    }

    public final void n() {
        if (this.J == null || this.K == null) {
            return;
        }
        if (x()) {
            this.J.a0(this.f8146d.isFocused() ? ColorStateList.valueOf(this.f8161k0) : ColorStateList.valueOf(this.T));
            this.K.a0(ColorStateList.valueOf(this.T));
        }
        invalidate();
    }

    public final void n0() {
        ColorStateList colorStateList;
        ColorStateList colorStateListG = this.A;
        if (colorStateListG == null) {
            colorStateListG = vc.a.g(getContext(), jc.b.f20289g);
        }
        EditText editText = this.f8146d;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = q2.a.r(this.f8146d.getTextCursorDrawable()).mutate();
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
        if (this.f8146d == null) {
            return false;
        }
        boolean z11 = true;
        if (f0()) {
            int measuredWidth = this.b.getMeasuredWidth() - this.f8146d.getPaddingLeft();
            if (this.f8145c0 == null || this.f8147d0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f8145c0 = colorDrawable;
                this.f8147d0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrD = d3.i.d(this.f8146d);
            Drawable drawable = drawableArrD[0];
            Drawable drawable2 = this.f8145c0;
            if (drawable != drawable2) {
                d3.i.m(this.f8146d, drawable2, drawableArrD[1], drawableArrD[2], drawableArrD[3]);
                z10 = true;
            } else {
                z10 = false;
            }
        } else if (this.f8145c0 != null) {
            Drawable[] drawableArrD2 = d3.i.d(this.f8146d);
            d3.i.m(this.f8146d, null, drawableArrD2[1], drawableArrD2[2], drawableArrD2[3]);
            this.f8145c0 = null;
            z10 = true;
        } else {
            z10 = false;
        }
        if (e0()) {
            int measuredWidth2 = this.f8144c.z().getMeasuredWidth() - this.f8146d.getPaddingRight();
            CheckableImageButton checkableImageButtonK = this.f8144c.k();
            if (checkableImageButtonK != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButtonK.getMeasuredWidth() + n.b((ViewGroup.MarginLayoutParams) checkableImageButtonK.getLayoutParams());
            }
            Drawable[] drawableArrD3 = d3.i.d(this.f8146d);
            Drawable drawable3 = this.f8151f0;
            if (drawable3 != null && this.f8153g0 != measuredWidth2) {
                this.f8153g0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                d3.i.m(this.f8146d, drawableArrD3[0], drawableArrD3[1], this.f8151f0, drawableArrD3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.f8151f0 = colorDrawable2;
                this.f8153g0 = measuredWidth2;
                colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = drawableArrD3[2];
            Drawable drawable5 = this.f8151f0;
            if (drawable4 != drawable5) {
                this.f8155h0 = drawable4;
                d3.i.m(this.f8146d, drawableArrD3[0], drawableArrD3[1], drawable5, drawableArrD3[3]);
                return true;
            }
        } else if (this.f8151f0 != null) {
            Drawable[] drawableArrD4 = d3.i.d(this.f8146d);
            if (drawableArrD4[2] == this.f8151f0) {
                d3.i.m(this.f8146d, drawableArrD4[0], drawableArrD4[1], this.f8155h0, drawableArrD4[3]);
            } else {
                z11 = z10;
            }
            this.f8151f0 = null;
            return z11;
        }
        return z10;
    }

    @Override // android.view.View
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f8183v0.H(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f8144c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.B0 = false;
        boolean zS0 = s0();
        boolean zO0 = o0();
        if (zS0 || zO0) {
            this.f8146d.post(new Runnable() { // from class: md.y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23214a.f8146d.requestLayout();
                }
            });
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f8146d;
        if (editText != null) {
            Rect rect = this.V;
            bd.c.a(this, editText, rect);
            i0(rect);
            if (this.C) {
                this.f8183v0.a0(this.f8146d.getTextSize());
                int gravity = this.f8146d.getGravity();
                this.f8183v0.S((gravity & (-113)) | 48);
                this.f8183v0.Z(gravity);
                this.f8183v0.O(r(rect));
                this.f8183v0.W(u(rect));
                this.f8183v0.J();
                if (!B() || this.f8181u0) {
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
            this.f8144c.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.B0 = true;
        }
        w0();
        this.f8144c.x0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        setError(hVar.f8197c);
        if (hVar.f8198d) {
            post(new b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = i10 == 1;
        if (z10 != this.M) {
            float fA = this.L.r().a(this.f8142a0);
            float fA2 = this.L.t().a(this.f8142a0);
            k kVarM = k.a().z(this.L.s()).D(this.L.q()).r(this.L.k()).v(this.L.i()).A(fA2).E(fA).s(this.L.l().a(this.f8142a0)).w(this.L.j().a(this.f8142a0)).m();
            this.M = z10;
            setShapeAppearanceModel(kVarM);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (d0()) {
            hVar.f8197c = getError();
        }
        hVar.f8198d = this.f8144c.E();
        return hVar;
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
            this.F = new id.g(this.L);
            this.J = new id.g();
            this.K = new id.g();
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(this.O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.C || (this.F instanceof md.h)) {
                this.F = new id.g(this.L);
            } else {
                this.F = md.h.o0(this.L);
            }
            this.J = null;
            this.K = null;
        }
    }

    public void p0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f8146d;
        if (editText == null || this.O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (l0.a(background)) {
            background = background.mutate();
        }
        if (d0()) {
            background.setColorFilter(q.k.e(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f8164m && (textView = this.f8168o) != null) {
            background.setColorFilter(q.k.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            q2.a.c(background);
            this.f8146d.refreshDrawableState();
        }
    }

    public final int q() {
        return this.O == 1 ? vc.a.i(vc.a.e(this, jc.b.f20300o, 0), this.U) : this.U;
    }

    public final void q0() {
        o0.q0(this.f8146d, getEditTextBoxBackground());
    }

    @NonNull
    public final Rect r(@NonNull Rect rect) {
        if (this.f8146d == null) {
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
        rect2.left = rect.left + this.f8146d.getPaddingLeft();
        rect2.top = rect.top - v();
        rect2.right = rect.right - this.f8146d.getPaddingRight();
        return rect2;
    }

    public void r0() {
        EditText editText = this.f8146d;
        if (editText == null || this.F == null) {
            return;
        }
        if ((this.I || editText.getBackground() == null) && this.O != 0) {
            q0();
            this.I = true;
        }
    }

    public final int s(@NonNull Rect rect, @NonNull Rect rect2, float f10) {
        return S() ? (int) (rect2.top + f10) : rect.bottom - this.f8146d.getCompoundPaddingBottom();
    }

    public final boolean s0() {
        int iMax;
        if (this.f8146d == null || this.f8146d.getMeasuredHeight() >= (iMax = Math.max(this.f8144c.getMeasuredHeight(), this.b.getMeasuredHeight()))) {
            return false;
        }
        this.f8146d.setMinimumHeight(iMax);
        return true;
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.U != i10) {
            this.U = i10;
            this.f8169o0 = i10;
            this.f8173q0 = i10;
            this.f8175r0 = i10;
            m();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(l2.b.c(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f8169o0 = defaultColor;
        this.U = defaultColor;
        this.f8171p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f8173q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f8175r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.O) {
            return;
        }
        this.O = i10;
        if (this.f8146d != null) {
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
        if (this.f8165m0 != i10) {
            this.f8165m0 = i10;
            A0();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f8161k0 = colorStateList.getDefaultColor();
            this.f8177s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f8163l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f8165m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f8165m0 != colorStateList.getDefaultColor()) {
            this.f8165m0 = colorStateList.getDefaultColor();
        }
        A0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f8167n0 != colorStateList) {
            this.f8167n0 = colorStateList;
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
        if (this.f8160k != z10) {
            if (z10) {
                c0 c0Var = new c0(getContext());
                this.f8168o = c0Var;
                c0Var.setId(jc.f.P);
                Typeface typeface = this.f8143b0;
                if (typeface != null) {
                    this.f8168o.setTypeface(typeface);
                }
                this.f8168o.setMaxLines(1);
                this.f8158j.e(this.f8168o, 2);
                n.d((ViewGroup.MarginLayoutParams) this.f8168o.getLayoutParams(), getResources().getDimensionPixelOffset(jc.d.f20343l0));
                m0();
                j0();
            } else {
                this.f8158j.C(this.f8168o, 2);
                this.f8168o = null;
            }
            this.f8160k = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f8162l != i10) {
            if (i10 > 0) {
                this.f8162l = i10;
            } else {
                this.f8162l = -1;
            }
            if (this.f8160k) {
                j0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f8170p != i10) {
            this.f8170p = i10;
            m0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f8190z != colorStateList) {
            this.f8190z = colorStateList;
            m0();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f8172q != i10) {
            this.f8172q = i10;
            m0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f8188y != colorStateList) {
            this.f8188y = colorStateList;
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
        this.f8157i0 = colorStateList;
        this.f8159j0 = colorStateList;
        if (this.f8146d != null) {
            u0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        X(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f8144c.N(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f8144c.O(z10);
    }

    public void setEndIconContentDescription(int i10) {
        this.f8144c.P(i10);
    }

    public void setEndIconDrawable(int i10) {
        this.f8144c.R(i10);
    }

    public void setEndIconMinSize(int i10) {
        this.f8144c.T(i10);
    }

    public void setEndIconMode(int i10) {
        this.f8144c.U(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f8144c.V(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f8144c.W(onLongClickListener);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.f8144c.X(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.f8144c.Y(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.f8144c.Z(mode);
    }

    public void setEndIconVisible(boolean z10) {
        this.f8144c.a0(z10);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f8158j.A()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f8158j.w();
        } else {
            this.f8158j.Q(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        this.f8158j.E(i10);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f8158j.F(charSequence);
    }

    public void setErrorEnabled(boolean z10) {
        this.f8158j.G(z10);
    }

    public void setErrorIconDrawable(int i10) {
        this.f8144c.b0(i10);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f8144c.d0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f8144c.e0(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f8144c.f0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.f8144c.g0(mode);
    }

    public void setErrorTextAppearance(int i10) {
        this.f8158j.H(i10);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f8158j.I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.f8185w0 != z10) {
            this.f8185w0 = z10;
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
            this.f8158j.R(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f8158j.L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        this.f8158j.K(z10);
    }

    public void setHelperTextTextAppearance(int i10) {
        this.f8158j.J(i10);
    }

    public void setHint(CharSequence charSequence) {
        if (this.C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(Barcode.FORMAT_PDF417);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.f8187x0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.C) {
            this.C = z10;
            if (z10) {
                CharSequence hint = this.f8146d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.D)) {
                        setHint(hint);
                    }
                    this.f8146d.setHint((CharSequence) null);
                }
                this.E = true;
            } else {
                this.E = false;
                if (!TextUtils.isEmpty(this.D) && TextUtils.isEmpty(this.f8146d.getHint())) {
                    this.f8146d.setHint(this.D);
                }
                setHintInternal(null);
            }
            if (this.f8146d != null) {
                t0();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        this.f8183v0.P(i10);
        this.f8159j0 = this.f8183v0.p();
        if (this.f8146d != null) {
            u0(false);
            t0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f8159j0 != colorStateList) {
            if (this.f8157i0 == null) {
                this.f8183v0.R(colorStateList);
            }
            this.f8159j0 = colorStateList;
            if (this.f8146d != null) {
                u0(false);
            }
        }
    }

    public void setLengthCounter(@NonNull e eVar) {
        this.f8166n = eVar;
    }

    public void setMaxEms(int i10) {
        this.f8152g = i10;
        EditText editText = this.f8146d;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(int i10) {
        this.f8156i = i10;
        EditText editText = this.f8146d;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f8150f = i10;
        EditText editText = this.f8146d;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(int i10) {
        this.f8154h = i10;
        EditText editText = this.f8146d;
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
        this.f8144c.i0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        this.f8144c.k0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        this.f8144c.m0(z10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f8144c.n0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f8144c.o0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f8178t == null) {
            c0 c0Var = new c0(getContext());
            this.f8178t = c0Var;
            c0Var.setId(jc.f.S);
            o0.w0(this.f8178t, 2);
            p5.e eVarA = A();
            this.f8184w = eVarA;
            eVarA.C0(67L);
            this.f8186x = A();
            setPlaceholderTextAppearance(this.f8182v);
            setPlaceholderTextColor(this.f8180u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f8176s) {
                setPlaceholderTextEnabled(true);
            }
            this.f8174r = charSequence;
        }
        x0();
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f8182v = i10;
        TextView textView = this.f8178t;
        if (textView != null) {
            d3.i.s(textView, i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f8180u != colorStateList) {
            this.f8180u = colorStateList;
            TextView textView = this.f8178t;
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
        id.g gVar = this.F;
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
        this.f8144c.p0(charSequence);
    }

    public void setSuffixTextAppearance(int i10) {
        this.f8144c.q0(i10);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.f8144c.r0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(d dVar) {
        EditText editText = this.f8146d;
        if (editText != null) {
            o0.m0(editText, dVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f8143b0) {
            this.f8143b0 = typeface;
            this.f8183v0.i0(typeface);
            this.f8158j.N(typeface);
            TextView textView = this.f8168o;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public final int t(@NonNull Rect rect, float f10) {
        return S() ? (int) (rect.centerY() - (f10 / 2.0f)) : rect.top + this.f8146d.getCompoundPaddingTop();
    }

    public final void t0() {
        if (this.O != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f8141a.getLayoutParams();
            int iV = v();
            if (iV != layoutParams.topMargin) {
                layoutParams.topMargin = iV;
                this.f8141a.requestLayout();
            }
        }
    }

    @NonNull
    public final Rect u(@NonNull Rect rect) {
        if (this.f8146d == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.W;
        float fW = this.f8183v0.w();
        rect2.left = rect.left + this.f8146d.getCompoundPaddingLeft();
        rect2.top = t(rect, fW);
        rect2.right = rect.right - this.f8146d.getCompoundPaddingRight();
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
            fQ = this.f8183v0.q();
        } else {
            if (i10 != 2) {
                return 0;
            }
            fQ = this.f8183v0.q() / 2.0f;
        }
        return (int) fQ;
    }

    public final void v0(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f8146d;
        boolean z12 = false;
        boolean z13 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f8146d;
        if (editText2 != null && editText2.hasFocus()) {
            z12 = true;
        }
        ColorStateList colorStateList2 = this.f8157i0;
        if (colorStateList2 != null) {
            this.f8183v0.M(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f8157i0;
            this.f8183v0.M(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f8177s0) : this.f8177s0));
        } else if (d0()) {
            this.f8183v0.M(this.f8158j.r());
        } else if (this.f8164m && (textView = this.f8168o) != null) {
            this.f8183v0.M(textView.getTextColors());
        } else if (z12 && (colorStateList = this.f8159j0) != null) {
            this.f8183v0.R(colorStateList);
        }
        if (z13 || !this.f8185w0 || (isEnabled() && z12)) {
            if (z11 || this.f8181u0) {
                z(z10);
                return;
            }
            return;
        }
        if (z11 || !this.f8181u0) {
            F(z10);
        }
    }

    public final boolean w() {
        return this.O == 2 && x();
    }

    public final void w0() {
        EditText editText;
        if (this.f8178t == null || (editText = this.f8146d) == null) {
            return;
        }
        this.f8178t.setGravity(editText.getGravity());
        this.f8178t.setPadding(this.f8146d.getCompoundPaddingLeft(), this.f8146d.getCompoundPaddingTop(), this.f8146d.getCompoundPaddingRight(), this.f8146d.getCompoundPaddingBottom());
    }

    public final boolean x() {
        return this.Q > -1 && this.T != 0;
    }

    public final void x0() {
        EditText editText = this.f8146d;
        y0(editText == null ? null : editText.getText());
    }

    public final void y() {
        if (B()) {
            ((md.h) this.F).r0();
        }
    }

    public final void y0(Editable editable) {
        if (this.f8166n.a(editable) != 0 || this.f8181u0) {
            L();
        } else {
            g0();
        }
    }

    public final void z(boolean z10) {
        ValueAnimator valueAnimator = this.f8189y0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f8189y0.cancel();
        }
        if (z10 && this.f8187x0) {
            l(1.0f);
        } else {
            this.f8183v0.c0(1.0f);
        }
        this.f8181u0 = false;
        if (B()) {
            V();
        }
        x0();
        this.b.l(false);
        this.f8144c.H(false);
    }

    public final void z0(boolean z10, boolean z11) {
        int defaultColor = this.f8167n0.getDefaultColor();
        int colorForState = this.f8167n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f8167n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
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
        super(od.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f8150f = -1;
        this.f8152g = -1;
        this.f8154h = -1;
        this.f8156i = -1;
        this.f8158j = new t(this);
        this.f8166n = new e() { // from class: md.z
            @Override // com.google.android.material.textfield.TextInputLayout.e
            public final int a(Editable editable) {
                return TextInputLayout.b(editable);
            }
        };
        this.V = new Rect();
        this.W = new Rect();
        this.f8142a0 = new RectF();
        this.f8149e0 = new LinkedHashSet<>();
        bd.a aVar = new bd.a(this);
        this.f8183v0 = aVar;
        this.B0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f8141a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = kc.a.f21325a;
        aVar.h0(timeInterpolator);
        aVar.e0(timeInterpolator);
        aVar.S(8388659);
        b1 b1VarJ = o.j(context2, attributeSet, jc.k.f20664v6, i10, i11, jc.k.S6, jc.k.Q6, jc.k.f20566k7, jc.k.f20611p7, jc.k.f20647t7);
        x xVar = new x(this, b1VarJ);
        this.b = xVar;
        this.C = b1VarJ.a(jc.k.f20638s7, true);
        setHint(b1VarJ.p(jc.k.A6));
        this.f8187x0 = b1VarJ.a(jc.k.f20629r7, true);
        this.f8185w0 = b1VarJ.a(jc.k.f20584m7, true);
        if (b1VarJ.s(jc.k.C6)) {
            setMinEms(b1VarJ.k(jc.k.C6, -1));
        } else if (b1VarJ.s(jc.k.f20698z6)) {
            setMinWidth(b1VarJ.f(jc.k.f20698z6, -1));
        }
        if (b1VarJ.s(jc.k.B6)) {
            setMaxEms(b1VarJ.k(jc.k.B6, -1));
        } else if (b1VarJ.s(jc.k.f20689y6)) {
            setMaxWidth(b1VarJ.f(jc.k.f20689y6, -1));
        }
        this.L = k.e(context2, attributeSet, i10, i11).m();
        this.N = context2.getResources().getDimensionPixelOffset(jc.d.f20337i0);
        this.P = b1VarJ.e(jc.k.F6, 0);
        this.R = b1VarJ.f(jc.k.M6, context2.getResources().getDimensionPixelSize(jc.d.f20339j0));
        this.S = b1VarJ.f(jc.k.N6, context2.getResources().getDimensionPixelSize(jc.d.f20341k0));
        this.Q = this.R;
        float fD = b1VarJ.d(jc.k.J6, -1.0f);
        float fD2 = b1VarJ.d(jc.k.I6, -1.0f);
        float fD3 = b1VarJ.d(jc.k.G6, -1.0f);
        float fD4 = b1VarJ.d(jc.k.H6, -1.0f);
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
        ColorStateList colorStateListB = fd.c.b(context2, b1VarJ, jc.k.D6);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.f8169o0 = defaultColor;
            this.U = defaultColor;
            if (colorStateListB.isStateful()) {
                this.f8171p0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.f8173q0 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f8175r0 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f8173q0 = this.f8169o0;
                ColorStateList colorStateListA = k.a.a(context2, jc.c.f20317g);
                this.f8171p0 = colorStateListA.getColorForState(new int[]{-16842910}, -1);
                this.f8175r0 = colorStateListA.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.U = 0;
            this.f8169o0 = 0;
            this.f8171p0 = 0;
            this.f8173q0 = 0;
            this.f8175r0 = 0;
        }
        if (b1VarJ.s(jc.k.f20680x6)) {
            ColorStateList colorStateListC = b1VarJ.c(jc.k.f20680x6);
            this.f8159j0 = colorStateListC;
            this.f8157i0 = colorStateListC;
        }
        ColorStateList colorStateListB2 = fd.c.b(context2, b1VarJ, jc.k.K6);
        this.f8165m0 = b1VarJ.b(jc.k.K6, 0);
        this.f8161k0 = l2.b.c(context2, jc.c.f20318h);
        this.f8177s0 = l2.b.c(context2, jc.c.f20319i);
        this.f8163l0 = l2.b.c(context2, jc.c.f20320j);
        if (colorStateListB2 != null) {
            setBoxStrokeColorStateList(colorStateListB2);
        }
        if (b1VarJ.s(jc.k.L6)) {
            setBoxStrokeErrorColor(fd.c.b(context2, b1VarJ, jc.k.L6));
        }
        if (b1VarJ.n(jc.k.f20647t7, -1) != -1) {
            setHintTextAppearance(b1VarJ.n(jc.k.f20647t7, 0));
        }
        this.A = b1VarJ.c(jc.k.U6);
        this.B = b1VarJ.c(jc.k.V6);
        int iN = b1VarJ.n(jc.k.f20566k7, 0);
        CharSequence charSequenceP = b1VarJ.p(jc.k.f20521f7);
        int iK = b1VarJ.k(jc.k.f20512e7, 1);
        boolean zA = b1VarJ.a(jc.k.f20530g7, false);
        int iN2 = b1VarJ.n(jc.k.f20611p7, 0);
        boolean zA2 = b1VarJ.a(jc.k.f20602o7, false);
        CharSequence charSequenceP2 = b1VarJ.p(jc.k.f20593n7);
        int iN3 = b1VarJ.n(jc.k.B7, 0);
        CharSequence charSequenceP3 = b1VarJ.p(jc.k.A7);
        boolean zA3 = b1VarJ.a(jc.k.O6, false);
        setCounterMaxLength(b1VarJ.k(jc.k.P6, -1));
        this.f8172q = b1VarJ.n(jc.k.S6, 0);
        this.f8170p = b1VarJ.n(jc.k.Q6, 0);
        setBoxBackgroundMode(b1VarJ.k(jc.k.E6, 0));
        setErrorContentDescription(charSequenceP);
        setErrorAccessibilityLiveRegion(iK);
        setCounterOverflowTextAppearance(this.f8170p);
        setHelperTextTextAppearance(iN2);
        setErrorTextAppearance(iN);
        setCounterTextAppearance(this.f8172q);
        setPlaceholderText(charSequenceP3);
        setPlaceholderTextAppearance(iN3);
        if (b1VarJ.s(jc.k.f20575l7)) {
            setErrorTextColor(b1VarJ.c(jc.k.f20575l7));
        }
        if (b1VarJ.s(jc.k.f20620q7)) {
            setHelperTextColor(b1VarJ.c(jc.k.f20620q7));
        }
        if (b1VarJ.s(jc.k.f20656u7)) {
            setHintTextColor(b1VarJ.c(jc.k.f20656u7));
        }
        if (b1VarJ.s(jc.k.T6)) {
            setCounterTextColor(b1VarJ.c(jc.k.T6));
        }
        if (b1VarJ.s(jc.k.R6)) {
            setCounterOverflowTextColor(b1VarJ.c(jc.k.R6));
        }
        if (b1VarJ.s(jc.k.C7)) {
            setPlaceholderTextColor(b1VarJ.c(jc.k.C7));
        }
        com.google.android.material.textfield.a aVar2 = new com.google.android.material.textfield.a(this, b1VarJ);
        this.f8144c = aVar2;
        boolean zA4 = b1VarJ.a(jc.k.f20672w6, true);
        b1VarJ.x();
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
        this.f8144c.Q(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f8144c.S(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f8144c.c0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f8144c.j0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f8144c.l0(drawable);
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
