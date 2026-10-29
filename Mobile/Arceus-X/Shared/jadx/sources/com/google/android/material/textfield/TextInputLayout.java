package com.google.android.material.textfield;

import ad.C0129a;
import ad.C0131c;
import ad.C0143o;
import ad.C0146r;
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
import androidx.core.view.C0582a;
import androidx.core.view.C0622n;
import androidx.core.view.C0625o0;
import androidx.customview.view.AbsSavedState;
import cd.C1627h;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import md.C8485a;
import p066d3.C4431i;
import p101ed.C5050c;
import p168hd.C6363g;
import p168hd.C6367k;
import p194ic.C6738b;
import p194ic.C6739c;
import p194ic.C6740d;
import p194ic.C6742f;
import p194ic.C6745i;
import p194ic.C6746j;
import p194ic.C6747k;
import p216jc.C7137a;
import p232k.C7399a;
import p246kd.C7550h;
import p246kd.C7559q;
import p246kd.C7562t;
import p246kd.C7566x;
import p261l2.C7975b;
import p322o5.C9659e;
import p322o5.C9691y;
import p365q.C10357a1;
import p365q.C10359b0;
import p365q.C10383k;
import p365q.C10384k0;
import p368q2.C10425a;
import p463uc.C11840a;
import p505w2.C12289a;
import p564y2.C13017p;

/* JADX INFO: loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: C0 */
    public static final int f10547C0 = C6746j.f26118j;

    /* JADX INFO: renamed from: D0 */
    public static final int[][] f10548D0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* JADX INFO: renamed from: A */
    public ColorStateList f10549A;

    /* JADX INFO: renamed from: A0 */
    public boolean f10550A0;

    /* JADX INFO: renamed from: B */
    public ColorStateList f10551B;

    /* JADX INFO: renamed from: B0 */
    public boolean f10552B0;

    /* JADX INFO: renamed from: C */
    public boolean f10553C;

    /* JADX INFO: renamed from: D */
    public CharSequence f10554D;

    /* JADX INFO: renamed from: E */
    public boolean f10555E;

    /* JADX INFO: renamed from: F */
    public C6363g f10556F;

    /* JADX INFO: renamed from: G */
    public C6363g f10557G;

    /* JADX INFO: renamed from: H */
    public StateListDrawable f10558H;

    /* JADX INFO: renamed from: I */
    public boolean f10559I;

    /* JADX INFO: renamed from: J */
    public C6363g f10560J;

    /* JADX INFO: renamed from: K */
    public C6363g f10561K;

    /* JADX INFO: renamed from: L */
    @NonNull
    public C6367k f10562L;

    /* JADX INFO: renamed from: M */
    public boolean f10563M;

    /* JADX INFO: renamed from: N */
    public final int f10564N;

    /* JADX INFO: renamed from: O */
    public int f10565O;

    /* JADX INFO: renamed from: P */
    public int f10566P;

    /* JADX INFO: renamed from: Q */
    public int f10567Q;

    /* JADX INFO: renamed from: R */
    public int f10568R;

    /* JADX INFO: renamed from: S */
    public int f10569S;

    /* JADX INFO: renamed from: T */
    public int f10570T;

    /* JADX INFO: renamed from: U */
    public int f10571U;

    /* JADX INFO: renamed from: V */
    public final Rect f10572V;

    /* JADX INFO: renamed from: W */
    public final Rect f10573W;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final FrameLayout f10574a;

    /* JADX INFO: renamed from: a0 */
    public final RectF f10575a0;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C7566x f10576b;

    /* JADX INFO: renamed from: b0 */
    public Typeface f10577b0;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C2862a f10578c;

    /* JADX INFO: renamed from: c0 */
    public Drawable f10579c0;

    /* JADX INFO: renamed from: d */
    public EditText f10580d;

    /* JADX INFO: renamed from: d0 */
    public int f10581d0;

    /* JADX INFO: renamed from: e */
    public CharSequence f10582e;

    /* JADX INFO: renamed from: e0 */
    public final LinkedHashSet<InterfaceC2860f> f10583e0;

    /* JADX INFO: renamed from: f */
    public int f10584f;

    /* JADX INFO: renamed from: f0 */
    public Drawable f10585f0;

    /* JADX INFO: renamed from: g */
    public int f10586g;

    /* JADX INFO: renamed from: g0 */
    public int f10587g0;

    /* JADX INFO: renamed from: h */
    public int f10588h;

    /* JADX INFO: renamed from: h0 */
    public Drawable f10589h0;

    /* JADX INFO: renamed from: i */
    public int f10590i;

    /* JADX INFO: renamed from: i0 */
    public ColorStateList f10591i0;

    /* JADX INFO: renamed from: j */
    public final C7562t f10592j;

    /* JADX INFO: renamed from: j0 */
    public ColorStateList f10593j0;

    /* JADX INFO: renamed from: k */
    public boolean f10594k;

    /* JADX INFO: renamed from: k0 */
    public int f10595k0;

    /* JADX INFO: renamed from: l */
    public int f10596l;

    /* JADX INFO: renamed from: l0 */
    public int f10597l0;

    /* JADX INFO: renamed from: m */
    public boolean f10598m;

    /* JADX INFO: renamed from: m0 */
    public int f10599m0;

    /* JADX INFO: renamed from: n */
    @NonNull
    public InterfaceC2859e f10600n;

    /* JADX INFO: renamed from: n0 */
    public ColorStateList f10601n0;

    /* JADX INFO: renamed from: o */
    public TextView f10602o;

    /* JADX INFO: renamed from: o0 */
    public int f10603o0;

    /* JADX INFO: renamed from: p */
    public int f10604p;

    /* JADX INFO: renamed from: p0 */
    public int f10605p0;

    /* JADX INFO: renamed from: q */
    public int f10606q;

    /* JADX INFO: renamed from: q0 */
    public int f10607q0;

    /* JADX INFO: renamed from: r */
    public CharSequence f10608r;

    /* JADX INFO: renamed from: r0 */
    public int f10609r0;

    /* JADX INFO: renamed from: s */
    public boolean f10610s;

    /* JADX INFO: renamed from: s0 */
    public int f10611s0;

    /* JADX INFO: renamed from: t */
    public TextView f10612t;

    /* JADX INFO: renamed from: t0 */
    public int f10613t0;

    /* JADX INFO: renamed from: u */
    public ColorStateList f10614u;

    /* JADX INFO: renamed from: u0 */
    public boolean f10615u0;

    /* JADX INFO: renamed from: v */
    public int f10616v;

    /* JADX INFO: renamed from: v0 */
    public final C0129a f10617v0;

    /* JADX INFO: renamed from: w */
    public C9659e f10618w;

    /* JADX INFO: renamed from: w0 */
    public boolean f10619w0;

    /* JADX INFO: renamed from: x */
    public C9659e f10620x;

    /* JADX INFO: renamed from: x0 */
    public boolean f10621x0;

    /* JADX INFO: renamed from: y */
    public ColorStateList f10622y;

    /* JADX INFO: renamed from: y0 */
    public ValueAnimator f10623y0;

    /* JADX INFO: renamed from: z */
    public ColorStateList f10624z;

    /* JADX INFO: renamed from: z0 */
    public boolean f10625z0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2854a();

        /* JADX INFO: renamed from: c */
        public CharSequence f10626c;

        /* JADX INFO: renamed from: d */
        public boolean f10627d;

        /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$SavedState$a */
        public class C2854a implements Parcelable.ClassLoaderCreator<SavedState> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @NonNull
        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f10626c) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f10626c, parcel, i10);
            parcel.writeInt(this.f10627d ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10626c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f10627d = parcel.readInt() == 1;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$a */
    public class C2855a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public int f10628a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ EditText f10629b;

        public C2855a(EditText editText) {
            this.f10629b = editText;
            this.f10628a = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@NonNull Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.m13164u0(!textInputLayout.f10550A0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f10594k) {
                textInputLayout2.m13145k0(editable);
            }
            if (TextInputLayout.this.f10610s) {
                TextInputLayout.this.m13172y0(editable);
            }
            int lineCount = this.f10629b.getLineCount();
            int i10 = this.f10628a;
            if (lineCount != i10) {
                if (lineCount < i10) {
                    int iM2978A = C0625o0.m2978A(this.f10629b);
                    int i11 = TextInputLayout.this.f10613t0;
                    if (iM2978A != i11) {
                        this.f10629b.setMinimumHeight(i11);
                    }
                }
                this.f10628a = lineCount;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$b */
    public class RunnableC2856b implements Runnable {
        public RunnableC2856b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f10578c.m13221h();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$c */
    public class C2857c implements ValueAnimator.AnimatorUpdateListener {
        public C2857c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            TextInputLayout.this.f10617v0.m354c0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$d */
    public static class C2858d extends C0582a {

        /* JADX INFO: renamed from: d */
        public final TextInputLayout f10633d;

        public C2858d(@NonNull TextInputLayout textInputLayout) {
            this.f10633d = textInputLayout;
        }

        @Override // androidx.core.view.C0582a
        /* JADX INFO: renamed from: g */
        public void mo2799g(@NonNull View view, @NonNull C13017p c13017p) {
            super.mo2799g(view, c13017p);
            EditText editText = this.f10633d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f10633d.getHint();
            CharSequence error = this.f10633d.getError();
            CharSequence placeholderText = this.f10633d.getPlaceholderText();
            int counterMaxLength = this.f10633d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f10633d.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean zM13122P = this.f10633d.m13122P();
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            boolean z10 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String string = !zIsEmpty2 ? hint.toString() : "";
            this.f10633d.f10576b.m31310A(c13017p);
            if (!zIsEmpty) {
                c13017p.m48370K0(text);
            } else if (!TextUtils.isEmpty(string)) {
                c13017p.m48370K0(string);
                if (!zM13122P && placeholderText != null) {
                    c13017p.m48370K0(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                c13017p.m48370K0(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                c13017p.m48430x0(string);
                c13017p.m48364H0(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            c13017p.m48434z0(counterMaxLength);
            if (z10) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                c13017p.m48421s0(error);
            }
            View viewM31300t = this.f10633d.f10592j.m31300t();
            if (viewM31300t != null) {
                c13017p.m48432y0(viewM31300t);
            }
            this.f10633d.f10578c.m13231m().mo31246o(view, c13017p);
        }

        @Override // androidx.core.view.C0582a
        /* JADX INFO: renamed from: h */
        public void mo2800h(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.mo2800h(view, accessibilityEvent);
            this.f10633d.f10578c.m13231m().mo31247p(view, accessibilityEvent);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$e */
    public interface InterfaceC2859e {
        /* JADX INFO: renamed from: a */
        int mo13178a(Editable editable);
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$f */
    public interface InterfaceC2860f {
        /* JADX INFO: renamed from: a */
        void mo13179a(@NonNull TextInputLayout textInputLayout);
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$g */
    public interface InterfaceC2861g {
        /* JADX INFO: renamed from: a */
        void m13180a(@NonNull TextInputLayout textInputLayout, int i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TextInputLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6738b.f25898g0);
    }

    /* JADX INFO: renamed from: H */
    public static Drawable m13096H(C6363g c6363g, int i10, int i11, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{C11840a.m44234j(i11, i10, 0.1f), i10}), c6363g, c6363g);
    }

    /* JADX INFO: renamed from: K */
    public static Drawable m13097K(Context context, C6363g c6363g, int i10, int[][] iArr) {
        int iM44227c = C11840a.m44227c(context, C6738b.f25908o, "TextInputLayout");
        C6363g c6363g2 = new C6363g(c6363g.m27698E());
        int iM44234j = C11840a.m44234j(i10, iM44227c, 0.1f);
        c6363g2.m27719a0(new ColorStateList(iArr, new int[]{iM44234j, 0}));
        c6363g2.setTint(iM44227c);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iM44234j, iM44227c});
        C6363g c6363g3 = new C6363g(c6363g.m27698E());
        c6363g3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c6363g2, c6363g3), c6363g});
    }

    /* JADX INFO: renamed from: X */
    public static void m13098X(@NonNull ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                m13098X((ViewGroup) childAt, z10);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m13100b(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f10580d;
        if (!(editText instanceof AutoCompleteTextView) || C7559q.m31249a(editText)) {
            return this.f10556F;
        }
        int iM44228d = C11840a.m44228d(this.f10580d, C6738b.f25899h);
        int i10 = this.f10565O;
        if (i10 == 2) {
            return m13097K(getContext(), this.f10556F, iM44228d, f10548D0);
        }
        if (i10 == 1) {
            return m13096H(this.f10556F, this.f10571U, iM44228d, f10548D0);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f10558H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f10558H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f10558H.addState(new int[0], m13115G(false));
        }
        return this.f10558H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f10557G == null) {
            this.f10557G = m13115G(true);
        }
        return this.f10557G;
    }

    /* JADX INFO: renamed from: l0 */
    public static void m13107l0(@NonNull Context context, @NonNull TextView textView, int i10, int i11, boolean z10) {
        textView.setContentDescription(context.getString(z10 ? C6745i.f26084c : C6745i.f26083b, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    private void setEditText(EditText editText) {
        if (this.f10580d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f10580d = editText;
        int i10 = this.f10584f;
        if (i10 != -1) {
            setMinEms(i10);
        } else {
            setMinWidth(this.f10588h);
        }
        int i11 = this.f10586g;
        if (i11 != -1) {
            setMaxEms(i11);
        } else {
            setMaxWidth(this.f10590i);
        }
        this.f10559I = false;
        m13127U();
        setTextInputAccessibilityDelegate(new C2858d(this));
        this.f10617v0.m366i0(this.f10580d.getTypeface());
        this.f10617v0.m350a0(this.f10580d.getTextSize());
        int i12 = Build.VERSION.SDK_INT;
        this.f10617v0.m347X(this.f10580d.getLetterSpacing());
        int gravity = this.f10580d.getGravity();
        this.f10617v0.m342S((gravity & (-113)) | 48);
        this.f10617v0.m349Z(gravity);
        this.f10613t0 = C0625o0.m2978A(editText);
        this.f10580d.addTextChangedListener(new C2855a(editText));
        if (this.f10591i0 == null) {
            this.f10591i0 = this.f10580d.getHintTextColors();
        }
        if (this.f10553C) {
            if (TextUtils.isEmpty(this.f10554D)) {
                CharSequence hint = this.f10580d.getHint();
                this.f10582e = hint;
                setHint(hint);
                this.f10580d.setHint((CharSequence) null);
            }
            this.f10555E = true;
        }
        if (i12 >= 29) {
            m13150n0();
        }
        if (this.f10602o != null) {
            m13145k0(this.f10580d.getText());
        }
        m13154p0();
        this.f10592j.m31286f();
        this.f10576b.bringToFront();
        this.f10578c.bringToFront();
        m13111C();
        this.f10578c.m13254x0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m13166v0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f10554D)) {
            return;
        }
        this.f10554D = charSequence;
        this.f10617v0.m362g0(charSequence);
        if (this.f10615u0) {
            return;
        }
        m13128V();
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f10610s == z10) {
            return;
        }
        if (z10) {
            m13142j();
        } else {
            m13131Z();
            this.f10612t = null;
        }
        this.f10610s = z10;
    }

    /* JADX INFO: renamed from: A */
    public final C9659e m13108A() {
        C9659e c9659e = new C9659e();
        c9659e.mo38142t0(C1627h.m8223f(getContext(), C6738b.f25869K, 87));
        c9659e.mo38144v0(C1627h.m8224g(getContext(), C6738b.f25875Q, C7137a.f27784a));
        return c9659e;
    }

    /* JADX INFO: renamed from: A0 */
    public void m13109A0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f10556F == null || this.f10565O == 0) {
            return;
        }
        boolean z10 = false;
        boolean z11 = isFocused() || ((editText2 = this.f10580d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f10580d) != null && editText.isHovered())) {
            z10 = true;
        }
        if (!isEnabled()) {
            this.f10570T = this.f10611s0;
        } else if (m13135d0()) {
            if (this.f10601n0 != null) {
                m13174z0(z11, z10);
            } else {
                this.f10570T = getErrorCurrentTextColors();
            }
        } else if (!this.f10598m || (textView = this.f10602o) == null) {
            if (z11) {
                this.f10570T = this.f10599m0;
            } else if (z10) {
                this.f10570T = this.f10597l0;
            } else {
                this.f10570T = this.f10595k0;
            }
        } else if (this.f10601n0 != null) {
            m13174z0(z11, z10);
        } else {
            this.f10570T = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            m13150n0();
        }
        this.f10578c.m13195I();
        m13130Y();
        if (this.f10565O == 2) {
            int i10 = this.f10567Q;
            if (z11 && isEnabled()) {
                this.f10567Q = this.f10569S;
            } else {
                this.f10567Q = this.f10568R;
            }
            if (this.f10567Q != i10) {
                m13129W();
            }
        }
        if (this.f10565O == 1) {
            if (!isEnabled()) {
                this.f10571U = this.f10605p0;
            } else if (z10 && !z11) {
                this.f10571U = this.f10609r0;
            } else if (z11) {
                this.f10571U = this.f10607q0;
            } else {
                this.f10571U = this.f10603o0;
            }
        }
        m13147m();
    }

    /* JADX INFO: renamed from: B */
    public final boolean m13110B() {
        return this.f10553C && !TextUtils.isEmpty(this.f10554D) && (this.f10556F instanceof C7550h);
    }

    /* JADX INFO: renamed from: C */
    public final void m13111C() {
        Iterator<InterfaceC2860f> it = this.f10583e0.iterator();
        while (it.hasNext()) {
            it.next().mo13179a(this);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m13112D(Canvas canvas) {
        C6363g c6363g;
        if (this.f10561K == null || (c6363g = this.f10560J) == null) {
            return;
        }
        c6363g.draw(canvas);
        if (this.f10580d.isFocused()) {
            Rect bounds = this.f10561K.getBounds();
            Rect bounds2 = this.f10560J.getBounds();
            float fM382x = this.f10617v0.m382x();
            int iCenterX = bounds2.centerX();
            bounds.left = C7137a.m29921c(iCenterX, bounds2.left, fM382x);
            bounds.right = C7137a.m29921c(iCenterX, bounds2.right, fM382x);
            this.f10561K.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m13113E(@NonNull Canvas canvas) {
        if (this.f10553C) {
            this.f10617v0.m370l(canvas);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m13114F(boolean z10) {
        ValueAnimator valueAnimator = this.f10623y0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f10623y0.cancel();
        }
        if (z10 && this.f10621x0) {
            m13146l(0.0f);
        } else {
            this.f10617v0.m354c0(0.0f);
        }
        if (m13110B() && ((C7550h) this.f10556F).m31219q0()) {
            m13171y();
        }
        this.f10615u0 = true;
        m13118L();
        this.f10576b.m31324l(true);
        this.f10578c.m13194H(true);
    }

    /* JADX INFO: renamed from: G */
    public final C6363g m13115G(boolean z10) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(C6740d.f25969g0);
        float f10 = z10 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f10580d;
        float popupElevation = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).getPopupElevation() : getResources().getDimensionPixelOffset(C6740d.f25985r);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(C6740d.f25957a0);
        C6367k c6367kM27806m = C6367k.m27762a().m27800A(f10).m27804E(f10).m27811s(dimensionPixelOffset).m27815w(dimensionPixelOffset).m27806m();
        EditText editText2 = this.f10580d;
        C6363g c6363gM27693m = C6363g.m27693m(getContext(), popupElevation, editText2 instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText2).getDropDownBackgroundTintList() : null);
        c6363gM27693m.setShapeAppearanceModel(c6367kM27806m);
        c6363gM27693m.m27721c0(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return c6363gM27693m;
    }

    /* JADX INFO: renamed from: I */
    public final int m13116I(int i10, boolean z10) {
        int compoundPaddingLeft;
        if (z10 || getPrefixText() == null) {
            compoundPaddingLeft = (!z10 || getSuffixText() == null) ? this.f10580d.getCompoundPaddingLeft() : this.f10578c.m13255y();
        } else {
            compoundPaddingLeft = this.f10576b.m31315c();
        }
        return i10 + compoundPaddingLeft;
    }

    /* JADX INFO: renamed from: J */
    public final int m13117J(int i10, boolean z10) {
        int compoundPaddingRight;
        if (z10 || getSuffixText() == null) {
            compoundPaddingRight = (!z10 || getPrefixText() == null) ? this.f10580d.getCompoundPaddingRight() : this.f10576b.m31315c();
        } else {
            compoundPaddingRight = this.f10578c.m13255y();
        }
        return i10 - compoundPaddingRight;
    }

    /* JADX INFO: renamed from: L */
    public final void m13118L() {
        TextView textView = this.f10612t;
        if (textView == null || !this.f10610s) {
            return;
        }
        textView.setText((CharSequence) null);
        C9691y.m38301a(this.f10574a, this.f10620x);
        this.f10612t.setVisibility(4);
    }

    /* JADX INFO: renamed from: M */
    public boolean m13119M() {
        return this.f10578c.m13192F();
    }

    /* JADX INFO: renamed from: N */
    public boolean m13120N() {
        return this.f10592j.m31266A();
    }

    /* JADX INFO: renamed from: O */
    public boolean m13121O() {
        return this.f10592j.m31267B();
    }

    /* JADX INFO: renamed from: P */
    public final boolean m13122P() {
        return this.f10615u0;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m13123Q() {
        if (m13135d0()) {
            return true;
        }
        return this.f10602o != null && this.f10598m;
    }

    /* JADX INFO: renamed from: R */
    public boolean m13124R() {
        return this.f10555E;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m13125S() {
        return this.f10565O == 1 && this.f10580d.getMinLines() <= 1;
    }

    /* JADX INFO: renamed from: T */
    public boolean m13126T() {
        return this.f10576b.m31323k();
    }

    /* JADX INFO: renamed from: U */
    public final void m13127U() {
        m13153p();
        m13158r0();
        m13109A0();
        m13139h0();
        m13144k();
        if (this.f10565O != 0) {
            m13162t0();
        }
        m13133b0();
    }

    /* JADX INFO: renamed from: V */
    public final void m13128V() {
        if (m13110B()) {
            RectF rectF = this.f10575a0;
            this.f10617v0.m373o(rectF, this.f10580d.getWidth(), this.f10580d.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            m13151o(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f10567Q);
            ((C7550h) this.f10556F).m31222t0(rectF);
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m13129W() {
        if (!m13110B() || this.f10615u0) {
            return;
        }
        m13171y();
        m13128V();
    }

    /* JADX INFO: renamed from: Y */
    public void m13130Y() {
        this.f10576b.m31325m();
    }

    /* JADX INFO: renamed from: Z */
    public final void m13131Z() {
        TextView textView = this.f10612t;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m13132a0(float f10, float f11, float f12, float f13) {
        boolean zM453h = C0146r.m453h(this);
        this.f10563M = zM453h;
        float f14 = zM453h ? f11 : f10;
        if (!zM453h) {
            f10 = f11;
        }
        float f15 = zM453h ? f13 : f12;
        if (!zM453h) {
            f12 = f13;
        }
        C6363g c6363g = this.f10556F;
        if (c6363g != null && c6363g.m27703J() == f14 && this.f10556F.m27704K() == f10 && this.f10556F.m27744s() == f15 && this.f10556F.m27745t() == f12) {
            return;
        }
        this.f10562L = this.f10562L.m27783v().m27800A(f14).m27804E(f10).m27811s(f15).m27815w(f12).m27806m();
        m13147m();
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view, int i10, @NonNull ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f10574a.addView(view, layoutParams2);
        this.f10574a.setLayoutParams(layoutParams);
        m13162t0();
        setEditText((EditText) view);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m13133b0() {
        EditText editText = this.f10580d;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i10 = this.f10565O;
                if (i10 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i10 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m13134c0(@NonNull TextView textView, int i10) {
        try {
            C4431i.m22312s(textView, i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        C4431i.m22312s(textView, C6746j.f26110b);
        textView.setTextColor(C7975b.m33005c(getContext(), C6739c.f25920a));
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m13135d0() {
        return this.f10592j.m31292l();
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(@NonNull ViewStructure viewStructure, int i10) {
        EditText editText = this.f10580d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f10582e != null) {
            boolean z10 = this.f10555E;
            this.f10555E = false;
            CharSequence hint = editText.getHint();
            this.f10580d.setHint(this.f10582e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f10580d.setHint(hint);
                this.f10555E = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        viewStructure.setChildCount(this.f10574a.getChildCount());
        for (int i11 = 0; i11 < this.f10574a.getChildCount(); i11++) {
            View childAt = this.f10574a.getChildAt(i11);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i10);
            if (childAt == this.f10580d) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
        this.f10550A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f10550A0 = false;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        m13113E(canvas);
        m13112D(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f10625z0) {
            return;
        }
        this.f10625z0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C0129a c0129a = this.f10617v0;
        boolean zM360f0 = c0129a != null ? c0129a.m360f0(drawableState) : false;
        if (this.f10580d != null) {
            m13164u0(C0625o0.m3006R(this) && isEnabled());
        }
        m13154p0();
        m13109A0();
        if (zM360f0) {
            invalidate();
        }
        this.f10625z0 = false;
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m13136e0() {
        return (this.f10578c.m13193G() || ((this.f10578c.m13187A() && m13119M()) || this.f10578c.m13251w() != null)) && this.f10578c.getMeasuredWidth() > 0;
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m13137f0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f10576b.getMeasuredWidth() > 0;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m13138g0() {
        if (this.f10612t == null || !this.f10610s || TextUtils.isEmpty(this.f10608r)) {
            return;
        }
        this.f10612t.setText(this.f10608r);
        C9691y.m38301a(this.f10574a, this.f10618w);
        this.f10612t.setVisibility(0);
        this.f10612t.bringToFront();
        announceForAccessibility(this.f10608r);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f10580d;
        return editText != null ? editText.getBaseline() + getPaddingTop() + m13165v() : super.getBaseline();
    }

    @NonNull
    public C6363g getBoxBackground() {
        int i10 = this.f10565O;
        if (i10 == 1 || i10 == 2) {
            return this.f10556F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f10571U;
    }

    public int getBoxBackgroundMode() {
        return this.f10565O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f10566P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return C0146r.m453h(this) ? this.f10562L.m27772j().mo27683a(this.f10575a0) : this.f10562L.m27774l().mo27683a(this.f10575a0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return C0146r.m453h(this) ? this.f10562L.m27774l().mo27683a(this.f10575a0) : this.f10562L.m27772j().mo27683a(this.f10575a0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return C0146r.m453h(this) ? this.f10562L.m27779r().mo27683a(this.f10575a0) : this.f10562L.m27781t().mo27683a(this.f10575a0);
    }

    public float getBoxCornerRadiusTopStart() {
        return C0146r.m453h(this) ? this.f10562L.m27781t().mo27683a(this.f10575a0) : this.f10562L.m27779r().mo27683a(this.f10575a0);
    }

    public int getBoxStrokeColor() {
        return this.f10599m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f10601n0;
    }

    public int getBoxStrokeWidth() {
        return this.f10568R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f10569S;
    }

    public int getCounterMaxLength() {
        return this.f10596l;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f10594k && this.f10598m && (textView = this.f10602o) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f10624z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f10622y;
    }

    public ColorStateList getCursorColor() {
        return this.f10549A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f10551B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f10591i0;
    }

    public EditText getEditText() {
        return this.f10580d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f10578c.m13229l();
    }

    public Drawable getEndIconDrawable() {
        return this.f10578c.m13233n();
    }

    public int getEndIconMinSize() {
        return this.f10578c.m13235o();
    }

    public int getEndIconMode() {
        return this.f10578c.m13237p();
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.f10578c.m13239q();
    }

    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.f10578c.m13241r();
    }

    public CharSequence getError() {
        if (this.f10592j.m31266A()) {
            return this.f10592j.m31296p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f10592j.m31294n();
    }

    public CharSequence getErrorContentDescription() {
        return this.f10592j.m31295o();
    }

    public int getErrorCurrentTextColors() {
        return this.f10592j.m31297q();
    }

    public Drawable getErrorIconDrawable() {
        return this.f10578c.m13243s();
    }

    public CharSequence getHelperText() {
        if (this.f10592j.m31267B()) {
            return this.f10592j.m31299s();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f10592j.m31301u();
    }

    public CharSequence getHint() {
        if (this.f10553C) {
            return this.f10554D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f10617v0.m375q();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.f10617v0.m378t();
    }

    public ColorStateList getHintTextColor() {
        return this.f10593j0;
    }

    @NonNull
    public InterfaceC2859e getLengthCounter() {
        return this.f10600n;
    }

    public int getMaxEms() {
        return this.f10586g;
    }

    public int getMaxWidth() {
        return this.f10590i;
    }

    public int getMinEms() {
        return this.f10584f;
    }

    public int getMinWidth() {
        return this.f10588h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f10578c.m13247u();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f10578c.m13249v();
    }

    public CharSequence getPlaceholderText() {
        if (this.f10610s) {
            return this.f10608r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f10616v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f10614u;
    }

    public CharSequence getPrefixText() {
        return this.f10576b.m31313a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f10576b.m31314b();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.f10576b.m31316d();
    }

    @NonNull
    public C6367k getShapeAppearanceModel() {
        return this.f10562L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f10576b.m31317e();
    }

    public Drawable getStartIconDrawable() {
        return this.f10576b.m31318f();
    }

    public int getStartIconMinSize() {
        return this.f10576b.m31319g();
    }

    @NonNull
    public ImageView.ScaleType getStartIconScaleType() {
        return this.f10576b.m31320h();
    }

    public CharSequence getSuffixText() {
        return this.f10578c.m13251w();
    }

    public ColorStateList getSuffixTextColor() {
        return this.f10578c.m13253x();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.f10578c.m13257z();
    }

    public Typeface getTypeface() {
        return this.f10577b0;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m13139h0() {
        if (this.f10565O == 1) {
            if (C5050c.m23743h(getContext())) {
                this.f10566P = getResources().getDimensionPixelSize(C6740d.f25936G);
            } else if (C5050c.m23742g(getContext())) {
                this.f10566P = getResources().getDimensionPixelSize(C6740d.f25935F);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void m13140i(@NonNull InterfaceC2860f interfaceC2860f) {
        this.f10583e0.add(interfaceC2860f);
        if (this.f10580d != null) {
            interfaceC2860f.mo13179a(this);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m13141i0(@NonNull Rect rect) {
        C6363g c6363g = this.f10560J;
        if (c6363g != null) {
            int i10 = rect.bottom;
            c6363g.setBounds(rect.left, i10 - this.f10568R, rect.right, i10);
        }
        C6363g c6363g2 = this.f10561K;
        if (c6363g2 != null) {
            int i11 = rect.bottom;
            c6363g2.setBounds(rect.left, i11 - this.f10569S, rect.right, i11);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m13142j() {
        TextView textView = this.f10612t;
        if (textView != null) {
            this.f10574a.addView(textView);
            this.f10612t.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m13143j0() {
        if (this.f10602o != null) {
            EditText editText = this.f10580d;
            m13145k0(editText == null ? null : editText.getText());
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m13144k() {
        if (this.f10580d == null || this.f10565O != 1) {
            return;
        }
        if (C5050c.m23743h(getContext())) {
            EditText editText = this.f10580d;
            C0625o0.m2981B0(editText, C0625o0.m2986E(editText), getResources().getDimensionPixelSize(C6740d.f25934E), C0625o0.m2984D(this.f10580d), getResources().getDimensionPixelSize(C6740d.f25933D));
        } else if (C5050c.m23742g(getContext())) {
            EditText editText2 = this.f10580d;
            C0625o0.m2981B0(editText2, C0625o0.m2986E(editText2), getResources().getDimensionPixelSize(C6740d.f25932C), C0625o0.m2984D(this.f10580d), getResources().getDimensionPixelSize(C6740d.f25931B));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m13145k0(Editable editable) {
        int iMo13178a = this.f10600n.mo13178a(editable);
        boolean z10 = this.f10598m;
        int i10 = this.f10596l;
        if (i10 == -1) {
            this.f10602o.setText(String.valueOf(iMo13178a));
            this.f10602o.setContentDescription(null);
            this.f10598m = false;
        } else {
            this.f10598m = iMo13178a > i10;
            m13107l0(getContext(), this.f10602o, iMo13178a, this.f10596l, this.f10598m);
            if (z10 != this.f10598m) {
                m13148m0();
            }
            this.f10602o.setText(C12289a.m45645c().m45652j(getContext().getString(C6745i.f26085d, Integer.valueOf(iMo13178a), Integer.valueOf(this.f10596l))));
        }
        if (this.f10580d == null || z10 == this.f10598m) {
            return;
        }
        m13164u0(false);
        m13109A0();
        m13154p0();
    }

    /* JADX INFO: renamed from: l */
    public void m13146l(float f10) {
        if (this.f10617v0.m382x() == f10) {
            return;
        }
        if (this.f10623y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f10623y0 = valueAnimator;
            valueAnimator.setInterpolator(C1627h.m8224g(getContext(), C6738b.f25874P, C7137a.f27785b));
            this.f10623y0.setDuration(C1627h.m8223f(getContext(), C6738b.f25867I, 167));
            this.f10623y0.addUpdateListener(new C2857c());
        }
        this.f10623y0.setFloatValues(this.f10617v0.m382x(), f10);
        this.f10623y0.start();
    }

    /* JADX INFO: renamed from: m */
    public final void m13147m() {
        C6363g c6363g = this.f10556F;
        if (c6363g == null) {
            return;
        }
        C6367k c6367kM27698E = c6363g.m27698E();
        C6367k c6367k = this.f10562L;
        if (c6367kM27698E != c6367k) {
            this.f10556F.setShapeAppearanceModel(c6367k);
        }
        if (m13167w()) {
            this.f10556F.m27727g0(this.f10567Q, this.f10570T);
        }
        int iM13155q = m13155q();
        this.f10571U = iM13155q;
        this.f10556F.m27719a0(ColorStateList.valueOf(iM13155q));
        m13149n();
        m13158r0();
    }

    /* JADX INFO: renamed from: m0 */
    public final void m13148m0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f10602o;
        if (textView != null) {
            m13134c0(textView, this.f10598m ? this.f10604p : this.f10606q);
            if (!this.f10598m && (colorStateList2 = this.f10622y) != null) {
                this.f10602o.setTextColor(colorStateList2);
            }
            if (!this.f10598m || (colorStateList = this.f10624z) == null) {
                return;
            }
            this.f10602o.setTextColor(colorStateList);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m13149n() {
        if (this.f10560J == null || this.f10561K == null) {
            return;
        }
        if (m13169x()) {
            this.f10560J.m27719a0(this.f10580d.isFocused() ? ColorStateList.valueOf(this.f10595k0) : ColorStateList.valueOf(this.f10570T));
            this.f10561K.m27719a0(ColorStateList.valueOf(this.f10570T));
        }
        invalidate();
    }

    /* JADX INFO: renamed from: n0 */
    public final void m13150n0() {
        ColorStateList colorStateList;
        ColorStateList colorStateListM44231g = this.f10549A;
        if (colorStateListM44231g == null) {
            colorStateListM44231g = C11840a.m44231g(getContext(), C6738b.f25897g);
        }
        EditText editText = this.f10580d;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = C10425a.m40121r(this.f10580d.getTextCursorDrawable()).mutate();
        if (m13123Q() && (colorStateList = this.f10551B) != null) {
            colorStateListM44231g = colorStateList;
        }
        C10425a.m40118o(drawableMutate, colorStateListM44231g);
    }

    /* JADX INFO: renamed from: o */
    public final void m13151o(@NonNull RectF rectF) {
        float f10 = rectF.left;
        int i10 = this.f10564N;
        rectF.left = f10 - i10;
        rectF.right += i10;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    /* JADX INFO: renamed from: o0 */
    public boolean m13152o0() {
        boolean z10;
        if (this.f10580d == null) {
            return false;
        }
        boolean z11 = true;
        if (m13137f0()) {
            int measuredWidth = this.f10576b.getMeasuredWidth() - this.f10580d.getPaddingLeft();
            if (this.f10579c0 == null || this.f10581d0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f10579c0 = colorDrawable;
                this.f10581d0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrM22297d = C4431i.m22297d(this.f10580d);
            Drawable drawable = drawableArrM22297d[0];
            Drawable drawable2 = this.f10579c0;
            if (drawable != drawable2) {
                C4431i.m22306m(this.f10580d, drawable2, drawableArrM22297d[1], drawableArrM22297d[2], drawableArrM22297d[3]);
                z10 = true;
            } else {
                z10 = false;
            }
        } else if (this.f10579c0 != null) {
            Drawable[] drawableArrM22297d2 = C4431i.m22297d(this.f10580d);
            C4431i.m22306m(this.f10580d, null, drawableArrM22297d2[1], drawableArrM22297d2[2], drawableArrM22297d2[3]);
            this.f10579c0 = null;
            z10 = true;
        } else {
            z10 = false;
        }
        if (m13136e0()) {
            int measuredWidth2 = this.f10578c.m13257z().getMeasuredWidth() - this.f10580d.getPaddingRight();
            CheckableImageButton checkableImageButtonM13227k = this.f10578c.m13227k();
            if (checkableImageButtonM13227k != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButtonM13227k.getMeasuredWidth() + C0622n.m2975b((ViewGroup.MarginLayoutParams) checkableImageButtonM13227k.getLayoutParams());
            }
            Drawable[] drawableArrM22297d3 = C4431i.m22297d(this.f10580d);
            Drawable drawable3 = this.f10585f0;
            if (drawable3 != null && this.f10587g0 != measuredWidth2) {
                this.f10587g0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                C4431i.m22306m(this.f10580d, drawableArrM22297d3[0], drawableArrM22297d3[1], this.f10585f0, drawableArrM22297d3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.f10585f0 = colorDrawable2;
                this.f10587g0 = measuredWidth2;
                colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = drawableArrM22297d3[2];
            Drawable drawable5 = this.f10585f0;
            if (drawable4 != drawable5) {
                this.f10589h0 = drawable4;
                C4431i.m22306m(this.f10580d, drawableArrM22297d3[0], drawableArrM22297d3[1], drawable5, drawableArrM22297d3[3]);
                return true;
            }
        } else if (this.f10585f0 != null) {
            Drawable[] drawableArrM22297d4 = C4431i.m22297d(this.f10580d);
            if (drawableArrM22297d4[2] == this.f10585f0) {
                C4431i.m22306m(this.f10580d, drawableArrM22297d4[0], drawableArrM22297d4[1], this.f10589h0, drawableArrM22297d4[3]);
            } else {
                z11 = z10;
            }
            this.f10585f0 = null;
            return z11;
        }
        return z10;
    }

    @Override // android.view.View
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f10617v0.m332H(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f10578c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f10552B0 = false;
        boolean zM13160s0 = m13160s0();
        boolean zM13152o0 = m13152o0();
        if (zM13160s0 || zM13152o0) {
            this.f10580d.post(new Runnable() { // from class: kd.y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f29007a.f10580d.requestLayout();
                }
            });
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f10580d;
        if (editText != null) {
            Rect rect = this.f10572V;
            C0131c.m387a(this, editText, rect);
            m13141i0(rect);
            if (this.f10553C) {
                this.f10617v0.m350a0(this.f10580d.getTextSize());
                int gravity = this.f10580d.getGravity();
                this.f10617v0.m342S((gravity & (-113)) | 48);
                this.f10617v0.m349Z(gravity);
                this.f10617v0.m338O(m13157r(rect));
                this.f10617v0.m346W(m13163u(rect));
                this.f10617v0.m334J();
                if (!m13110B() || this.f10615u0) {
                    return;
                }
                m13128V();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f10552B0) {
            this.f10578c.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f10552B0 = true;
        }
        m13168w0();
        this.f10578c.m13254x0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m3321a());
        setError(savedState.f10626c);
        if (savedState.f10627d) {
            post(new RunnableC2856b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = i10 == 1;
        if (z10 != this.f10563M) {
            float fMo27683a = this.f10562L.m27779r().mo27683a(this.f10575a0);
            float fMo27683a2 = this.f10562L.m27781t().mo27683a(this.f10575a0);
            C6367k c6367kM27806m = C6367k.m27762a().m27818z(this.f10562L.m27780s()).m27803D(this.f10562L.m27778q()).m27810r(this.f10562L.m27773k()).m27814v(this.f10562L.m27771i()).m27800A(fMo27683a2).m27804E(fMo27683a).m27811s(this.f10562L.m27774l().mo27683a(this.f10575a0)).m27815w(this.f10562L.m27772j().mo27683a(this.f10575a0)).m27806m();
            this.f10563M = z10;
            setShapeAppearanceModel(c6367kM27806m);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (m13135d0()) {
            savedState.f10626c = getError();
        }
        savedState.f10627d = this.f10578c.m13191E();
        return savedState;
    }

    /* JADX INFO: renamed from: p */
    public final void m13153p() {
        int i10 = this.f10565O;
        if (i10 == 0) {
            this.f10556F = null;
            this.f10560J = null;
            this.f10561K = null;
            return;
        }
        if (i10 == 1) {
            this.f10556F = new C6363g(this.f10562L);
            this.f10560J = new C6363g();
            this.f10561K = new C6363g();
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(this.f10565O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f10553C || (this.f10556F instanceof C7550h)) {
                this.f10556F = new C6363g(this.f10562L);
            } else {
                this.f10556F = C7550h.m31217o0(this.f10562L);
            }
            this.f10560J = null;
            this.f10561K = null;
        }
    }

    /* JADX INFO: renamed from: p0 */
    public void m13154p0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f10580d;
        if (editText == null || this.f10565O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (C10384k0.m39883a(background)) {
            background = background.mutate();
        }
        if (m13135d0()) {
            background.setColorFilter(C10383k.m39863e(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f10598m && (textView = this.f10602o) != null) {
            background.setColorFilter(C10383k.m39863e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            C10425a.m40106c(background);
            this.f10580d.refreshDrawableState();
        }
    }

    /* JADX INFO: renamed from: q */
    public final int m13155q() {
        return this.f10565O == 1 ? C11840a.m44233i(C11840a.m44229e(this, C6738b.f25908o, 0), this.f10571U) : this.f10571U;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m13156q0() {
        C0625o0.m3048q0(this.f10580d, getEditTextBoxBackground());
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public final Rect m13157r(@NonNull Rect rect) {
        if (this.f10580d == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f10573W;
        boolean zM453h = C0146r.m453h(this);
        rect2.bottom = rect.bottom;
        int i10 = this.f10565O;
        if (i10 == 1) {
            rect2.left = m13116I(rect.left, zM453h);
            rect2.top = rect.top + this.f10566P;
            rect2.right = m13117J(rect.right, zM453h);
            return rect2;
        }
        if (i10 != 2) {
            rect2.left = m13116I(rect.left, zM453h);
            rect2.top = getPaddingTop();
            rect2.right = m13117J(rect.right, zM453h);
            return rect2;
        }
        rect2.left = rect.left + this.f10580d.getPaddingLeft();
        rect2.top = rect.top - m13165v();
        rect2.right = rect.right - this.f10580d.getPaddingRight();
        return rect2;
    }

    /* JADX INFO: renamed from: r0 */
    public void m13158r0() {
        EditText editText = this.f10580d;
        if (editText == null || this.f10556F == null) {
            return;
        }
        if ((this.f10559I || editText.getBackground() == null) && this.f10565O != 0) {
            m13156q0();
            this.f10559I = true;
        }
    }

    /* JADX INFO: renamed from: s */
    public final int m13159s(@NonNull Rect rect, @NonNull Rect rect2, float f10) {
        return m13125S() ? (int) (rect2.top + f10) : rect.bottom - this.f10580d.getCompoundPaddingBottom();
    }

    /* JADX INFO: renamed from: s0 */
    public final boolean m13160s0() {
        int iMax;
        if (this.f10580d == null || this.f10580d.getMeasuredHeight() >= (iMax = Math.max(this.f10578c.getMeasuredHeight(), this.f10576b.getMeasuredHeight()))) {
            return false;
        }
        this.f10580d.setMinimumHeight(iMax);
        return true;
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f10571U != i10) {
            this.f10571U = i10;
            this.f10603o0 = i10;
            this.f10607q0 = i10;
            this.f10609r0 = i10;
            m13147m();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(C7975b.m33005c(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f10603o0 = defaultColor;
        this.f10571U = defaultColor;
        this.f10605p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f10607q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f10609r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m13147m();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.f10565O) {
            return;
        }
        this.f10565O = i10;
        if (this.f10580d != null) {
            m13127U();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.f10566P = i10;
    }

    public void setBoxCornerFamily(int i10) {
        this.f10562L = this.f10562L.m27783v().m27817y(i10, this.f10562L.m27779r()).m27802C(i10, this.f10562L.m27781t()).m27809q(i10, this.f10562L.m27772j()).m27813u(i10, this.f10562L.m27774l()).m27806m();
        m13147m();
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f10599m0 != i10) {
            this.f10599m0 = i10;
            m13109A0();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f10595k0 = colorStateList.getDefaultColor();
            this.f10611s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f10597l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f10599m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f10599m0 != colorStateList.getDefaultColor()) {
            this.f10599m0 = colorStateList.getDefaultColor();
        }
        m13109A0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f10601n0 != colorStateList) {
            this.f10601n0 = colorStateList;
            m13109A0();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f10568R = i10;
        m13109A0();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f10569S = i10;
        m13109A0();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f10594k != z10) {
            if (z10) {
                C10359b0 c10359b0 = new C10359b0(getContext());
                this.f10602o = c10359b0;
                c10359b0.setId(C6742f.f26022P);
                Typeface typeface = this.f10577b0;
                if (typeface != null) {
                    this.f10602o.setTypeface(typeface);
                }
                this.f10602o.setMaxLines(1);
                this.f10592j.m31285e(this.f10602o, 2);
                C0622n.m2977d((ViewGroup.MarginLayoutParams) this.f10602o.getLayoutParams(), getResources().getDimensionPixelOffset(C6740d.f25979l0));
                m13148m0();
                m13143j0();
            } else {
                this.f10592j.m31268C(this.f10602o, 2);
                this.f10602o = null;
            }
            this.f10594k = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f10596l != i10) {
            if (i10 > 0) {
                this.f10596l = i10;
            } else {
                this.f10596l = -1;
            }
            if (this.f10594k) {
                m13143j0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f10604p != i10) {
            this.f10604p = i10;
            m13148m0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f10624z != colorStateList) {
            this.f10624z = colorStateList;
            m13148m0();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f10606q != i10) {
            this.f10606q = i10;
            m13148m0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f10622y != colorStateList) {
            this.f10622y = colorStateList;
            m13148m0();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f10549A != colorStateList) {
            this.f10549A = colorStateList;
            m13150n0();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f10551B != colorStateList) {
            this.f10551B = colorStateList;
            if (m13123Q()) {
                m13150n0();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f10591i0 = colorStateList;
        this.f10593j0 = colorStateList;
        if (this.f10580d != null) {
            m13164u0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        m13098X(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f10578c.m13200N(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f10578c.m13201O(z10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setEndIconContentDescription(int i10) {
        this.f10578c.m13202P(i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setEndIconDrawable(int i10) {
        this.f10578c.m13204R(i10);
    }

    public void setEndIconMinSize(int i10) {
        this.f10578c.m13206T(i10);
    }

    public void setEndIconMode(int i10) {
        this.f10578c.m13207U(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f10578c.m13208V(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f10578c.m13209W(onLongClickListener);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.f10578c.m13210X(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.f10578c.m13211Y(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.f10578c.m13212Z(mode);
    }

    public void setEndIconVisible(boolean z10) {
        this.f10578c.m13213a0(z10);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f10592j.m31266A()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f10592j.m31303w();
        } else {
            this.f10592j.m31282Q(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        this.f10592j.m31270E(i10);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f10592j.m31271F(charSequence);
    }

    public void setErrorEnabled(boolean z10) {
        this.f10592j.m31272G(z10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setErrorIconDrawable(int i10) {
        this.f10578c.m13214b0(i10);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f10578c.m13216d0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f10578c.m13217e0(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f10578c.m13218f0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.f10578c.m13220g0(mode);
    }

    public void setErrorTextAppearance(int i10) {
        this.f10592j.m31273H(i10);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f10592j.m31274I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.f10619w0 != z10) {
            this.f10619w0 = z10;
            m13164u0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (m13121O()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!m13121O()) {
                setHelperTextEnabled(true);
            }
            this.f10592j.m31283R(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f10592j.m31277L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        this.f10592j.m31276K(z10);
    }

    public void setHelperTextTextAppearance(int i10) {
        this.f10592j.m31275J(i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setHint(CharSequence charSequence) {
        if (this.f10553C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.f10621x0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.f10553C) {
            this.f10553C = z10;
            if (z10) {
                CharSequence hint = this.f10580d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f10554D)) {
                        setHint(hint);
                    }
                    this.f10580d.setHint((CharSequence) null);
                }
                this.f10555E = true;
            } else {
                this.f10555E = false;
                if (!TextUtils.isEmpty(this.f10554D) && TextUtils.isEmpty(this.f10580d.getHint())) {
                    this.f10580d.setHint(this.f10554D);
                }
                setHintInternal(null);
            }
            if (this.f10580d != null) {
                m13162t0();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        this.f10617v0.m339P(i10);
        this.f10593j0 = this.f10617v0.m374p();
        if (this.f10580d != null) {
            m13164u0(false);
            m13162t0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f10593j0 != colorStateList) {
            if (this.f10591i0 == null) {
                this.f10617v0.m341R(colorStateList);
            }
            this.f10593j0 = colorStateList;
            if (this.f10580d != null) {
                m13164u0(false);
            }
        }
    }

    public void setLengthCounter(@NonNull InterfaceC2859e interfaceC2859e) {
        this.f10600n = interfaceC2859e;
    }

    public void setMaxEms(int i10) {
        this.f10586g = i10;
        EditText editText = this.f10580d;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(int i10) {
        this.f10590i = i10;
        EditText editText = this.f10580d;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f10584f = i10;
        EditText editText = this.f10580d;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(int i10) {
        this.f10588h = i10;
        EditText editText = this.f10580d;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        this.f10578c.m13224i0(i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        this.f10578c.m13228k0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        this.f10578c.m13232m0(z10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f10578c.m13234n0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f10578c.m13236o0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f10612t == null) {
            C10359b0 c10359b0 = new C10359b0(getContext());
            this.f10612t = c10359b0;
            c10359b0.setId(C6742f.f26025S);
            C0625o0.m3060w0(this.f10612t, 2);
            C9659e c9659eM13108A = m13108A();
            this.f10618w = c9659eM13108A;
            c9659eM13108A.mo38148y0(67L);
            this.f10620x = m13108A();
            setPlaceholderTextAppearance(this.f10616v);
            setPlaceholderTextColor(this.f10614u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f10610s) {
                setPlaceholderTextEnabled(true);
            }
            this.f10608r = charSequence;
        }
        m13170x0();
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f10616v = i10;
        TextView textView = this.f10612t;
        if (textView != null) {
            C4431i.m22312s(textView, i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f10614u != colorStateList) {
            this.f10614u = colorStateList;
            TextView textView = this.f10612t;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f10576b.m31326n(charSequence);
    }

    public void setPrefixTextAppearance(int i10) {
        this.f10576b.m31327o(i10);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.f10576b.m31328p(colorStateList);
    }

    public void setShapeAppearanceModel(@NonNull C6367k c6367k) {
        C6363g c6363g = this.f10556F;
        if (c6363g == null || c6363g.m27698E() == c6367k) {
            return;
        }
        this.f10562L = c6367k;
        m13147m();
    }

    public void setStartIconCheckable(boolean z10) {
        this.f10576b.m31329q(z10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? C7399a.m30679b(getContext(), i10) : null);
    }

    public void setStartIconMinSize(int i10) {
        this.f10576b.m31332t(i10);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f10576b.m31333u(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f10576b.m31334v(onLongClickListener);
    }

    public void setStartIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.f10576b.m31335w(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f10576b.m31336x(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f10576b.m31337y(mode);
    }

    public void setStartIconVisible(boolean z10) {
        this.f10576b.m31338z(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f10578c.m13238p0(charSequence);
    }

    public void setSuffixTextAppearance(int i10) {
        this.f10578c.m13240q0(i10);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.f10578c.m13242r0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C2858d c2858d) {
        EditText editText = this.f10580d;
        if (editText != null) {
            C0625o0.m3040m0(editText, c2858d);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f10577b0) {
            this.f10577b0 = typeface;
            this.f10617v0.m366i0(typeface);
            this.f10592j.m31279N(typeface);
            TextView textView = this.f10602o;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final int m13161t(@NonNull Rect rect, float f10) {
        return m13125S() ? (int) (rect.centerY() - (f10 / 2.0f)) : rect.top + this.f10580d.getCompoundPaddingTop();
    }

    /* JADX INFO: renamed from: t0 */
    public final void m13162t0() {
        if (this.f10565O != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f10574a.getLayoutParams();
            int iM13165v = m13165v();
            if (iM13165v != layoutParams.topMargin) {
                layoutParams.topMargin = iM13165v;
                this.f10574a.requestLayout();
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: u */
    public final Rect m13163u(@NonNull Rect rect) {
        if (this.f10580d == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f10573W;
        float fM381w = this.f10617v0.m381w();
        rect2.left = rect.left + this.f10580d.getCompoundPaddingLeft();
        rect2.top = m13161t(rect, fM381w);
        rect2.right = rect.right - this.f10580d.getCompoundPaddingRight();
        rect2.bottom = m13159s(rect, rect2, fM381w);
        return rect2;
    }

    /* JADX INFO: renamed from: u0 */
    public void m13164u0(boolean z10) {
        m13166v0(z10, false);
    }

    /* JADX INFO: renamed from: v */
    public final int m13165v() {
        float fM375q;
        if (!this.f10553C) {
            return 0;
        }
        int i10 = this.f10565O;
        if (i10 == 0) {
            fM375q = this.f10617v0.m375q();
        } else {
            if (i10 != 2) {
                return 0;
            }
            fM375q = this.f10617v0.m375q() / 2.0f;
        }
        return (int) fM375q;
    }

    /* JADX INFO: renamed from: v0 */
    public final void m13166v0(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f10580d;
        boolean z12 = false;
        boolean z13 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f10580d;
        if (editText2 != null && editText2.hasFocus()) {
            z12 = true;
        }
        ColorStateList colorStateList2 = this.f10591i0;
        if (colorStateList2 != null) {
            this.f10617v0.m336M(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f10591i0;
            this.f10617v0.m336M(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f10611s0) : this.f10611s0));
        } else if (m13135d0()) {
            this.f10617v0.m336M(this.f10592j.m31298r());
        } else if (this.f10598m && (textView = this.f10602o) != null) {
            this.f10617v0.m336M(textView.getTextColors());
        } else if (z12 && (colorStateList = this.f10593j0) != null) {
            this.f10617v0.m341R(colorStateList);
        }
        if (z13 || !this.f10619w0 || (isEnabled() && z12)) {
            if (z11 || this.f10615u0) {
                m13173z(z10);
                return;
            }
            return;
        }
        if (z11 || !this.f10615u0) {
            m13114F(z10);
        }
    }

    /* JADX INFO: renamed from: w */
    public final boolean m13167w() {
        return this.f10565O == 2 && m13169x();
    }

    /* JADX INFO: renamed from: w0 */
    public final void m13168w0() {
        EditText editText;
        if (this.f10612t == null || (editText = this.f10580d) == null) {
            return;
        }
        this.f10612t.setGravity(editText.getGravity());
        this.f10612t.setPadding(this.f10580d.getCompoundPaddingLeft(), this.f10580d.getCompoundPaddingTop(), this.f10580d.getCompoundPaddingRight(), this.f10580d.getCompoundPaddingBottom());
    }

    /* JADX INFO: renamed from: x */
    public final boolean m13169x() {
        return this.f10567Q > -1 && this.f10570T != 0;
    }

    /* JADX INFO: renamed from: x0 */
    public final void m13170x0() {
        EditText editText = this.f10580d;
        m13172y0(editText == null ? null : editText.getText());
    }

    /* JADX INFO: renamed from: y */
    public final void m13171y() {
        if (m13110B()) {
            ((C7550h) this.f10556F).m31220r0();
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m13172y0(Editable editable) {
        if (this.f10600n.mo13178a(editable) != 0 || this.f10615u0) {
            m13118L();
        } else {
            m13138g0();
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m13173z(boolean z10) {
        ValueAnimator valueAnimator = this.f10623y0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f10623y0.cancel();
        }
        if (z10 && this.f10621x0) {
            m13146l(1.0f);
        } else {
            this.f10617v0.m354c0(1.0f);
        }
        this.f10615u0 = false;
        if (m13110B()) {
            m13128V();
        }
        m13170x0();
        this.f10576b.m31324l(false);
        this.f10578c.m13194H(false);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m13174z0(boolean z10, boolean z11) {
        int defaultColor = this.f10601n0.getDefaultColor();
        int colorForState = this.f10601n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f10601n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z10) {
            this.f10570T = colorForState2;
        } else if (z11) {
            this.f10570T = colorForState;
        } else {
            this.f10570T = defaultColor;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(@NonNull Context context, AttributeSet attributeSet, int i10) {
        int i11 = f10547C0;
        super(C8485a.m34268c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f10584f = -1;
        this.f10586g = -1;
        this.f10588h = -1;
        this.f10590i = -1;
        this.f10592j = new C7562t(this);
        this.f10600n = new InterfaceC2859e() { // from class: kd.z
            @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC2859e
            /* JADX INFO: renamed from: a */
            public final int mo13178a(Editable editable) {
                return TextInputLayout.m13100b(editable);
            }
        };
        this.f10572V = new Rect();
        this.f10573W = new Rect();
        this.f10575a0 = new RectF();
        this.f10583e0 = new LinkedHashSet<>();
        C0129a c0129a = new C0129a(this);
        this.f10617v0 = c0129a;
        this.f10552B0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f10574a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = C7137a.f27784a;
        c0129a.m364h0(timeInterpolator);
        c0129a.m358e0(timeInterpolator);
        c0129a.m342S(8388659);
        int[] iArr = C6747k.f26568v6;
        int i12 = C6747k.f26304S6;
        int i13 = C6747k.f26286Q6;
        int i14 = C6747k.f26470k7;
        int i15 = C6747k.f26515p7;
        int i16 = C6747k.f26551t7;
        C10357a1 c10357a1M437j = C0143o.m437j(context2, attributeSet, iArr, i10, i11, i12, i13, i14, i15, i16);
        C7566x c7566x = new C7566x(this, c10357a1M437j);
        this.f10576b = c7566x;
        this.f10553C = c10357a1M437j.m39729a(C6747k.f26542s7, true);
        setHint(c10357a1M437j.m39744p(C6747k.f26142A6));
        this.f10621x0 = c10357a1M437j.m39729a(C6747k.f26533r7, true);
        this.f10619w0 = c10357a1M437j.m39729a(C6747k.f26488m7, true);
        int i17 = C6747k.f26160C6;
        if (c10357a1M437j.m39747s(i17)) {
            setMinEms(c10357a1M437j.m39739k(i17, -1));
        } else {
            int i18 = C6747k.f26604z6;
            if (c10357a1M437j.m39747s(i18)) {
                setMinWidth(c10357a1M437j.m39734f(i18, -1));
            }
        }
        int i19 = C6747k.f26151B6;
        if (c10357a1M437j.m39747s(i19)) {
            setMaxEms(c10357a1M437j.m39739k(i19, -1));
        } else {
            int i20 = C6747k.f26595y6;
            if (c10357a1M437j.m39747s(i20)) {
                setMaxWidth(c10357a1M437j.m39734f(i20, -1));
            }
        }
        this.f10562L = C6367k.m27766e(context2, attributeSet, i10, i11).m27806m();
        this.f10564N = context2.getResources().getDimensionPixelOffset(C6740d.f25973i0);
        this.f10566P = c10357a1M437j.m39733e(C6747k.f26187F6, 0);
        this.f10568R = c10357a1M437j.m39734f(C6747k.f26250M6, context2.getResources().getDimensionPixelSize(C6740d.f25975j0));
        this.f10569S = c10357a1M437j.m39734f(C6747k.f26259N6, context2.getResources().getDimensionPixelSize(C6740d.f25977k0));
        this.f10567Q = this.f10568R;
        float fM39732d = c10357a1M437j.m39732d(C6747k.f26223J6, -1.0f);
        float fM39732d2 = c10357a1M437j.m39732d(C6747k.f26214I6, -1.0f);
        float fM39732d3 = c10357a1M437j.m39732d(C6747k.f26196G6, -1.0f);
        float fM39732d4 = c10357a1M437j.m39732d(C6747k.f26205H6, -1.0f);
        C6367k.b bVarM27783v = this.f10562L.m27783v();
        if (fM39732d >= 0.0f) {
            bVarM27783v.m27800A(fM39732d);
        }
        if (fM39732d2 >= 0.0f) {
            bVarM27783v.m27804E(fM39732d2);
        }
        if (fM39732d3 >= 0.0f) {
            bVarM27783v.m27815w(fM39732d3);
        }
        if (fM39732d4 >= 0.0f) {
            bVarM27783v.m27811s(fM39732d4);
        }
        this.f10562L = bVarM27783v.m27806m();
        ColorStateList colorStateListM23737b = C5050c.m23737b(context2, c10357a1M437j, C6747k.f26169D6);
        if (colorStateListM23737b != null) {
            int defaultColor = colorStateListM23737b.getDefaultColor();
            this.f10603o0 = defaultColor;
            this.f10571U = defaultColor;
            if (colorStateListM23737b.isStateful()) {
                this.f10605p0 = colorStateListM23737b.getColorForState(new int[]{-16842910}, -1);
                this.f10607q0 = colorStateListM23737b.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f10609r0 = colorStateListM23737b.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f10607q0 = this.f10603o0;
                ColorStateList colorStateListM30678a = C7399a.m30678a(context2, C6739c.f25926g);
                this.f10605p0 = colorStateListM30678a.getColorForState(new int[]{-16842910}, -1);
                this.f10609r0 = colorStateListM30678a.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f10571U = 0;
            this.f10603o0 = 0;
            this.f10605p0 = 0;
            this.f10607q0 = 0;
            this.f10609r0 = 0;
        }
        int i21 = C6747k.f26586x6;
        if (c10357a1M437j.m39747s(i21)) {
            ColorStateList colorStateListM39731c = c10357a1M437j.m39731c(i21);
            this.f10593j0 = colorStateListM39731c;
            this.f10591i0 = colorStateListM39731c;
        }
        int i22 = C6747k.f26232K6;
        ColorStateList colorStateListM23737b2 = C5050c.m23737b(context2, c10357a1M437j, i22);
        this.f10599m0 = c10357a1M437j.m39730b(i22, 0);
        this.f10595k0 = C7975b.m33005c(context2, C6739c.f25927h);
        this.f10611s0 = C7975b.m33005c(context2, C6739c.f25928i);
        this.f10597l0 = C7975b.m33005c(context2, C6739c.f25929j);
        if (colorStateListM23737b2 != null) {
            setBoxStrokeColorStateList(colorStateListM23737b2);
        }
        int i23 = C6747k.f26241L6;
        if (c10357a1M437j.m39747s(i23)) {
            setBoxStrokeErrorColor(C5050c.m23737b(context2, c10357a1M437j, i23));
        }
        if (c10357a1M437j.m39742n(i16, -1) != -1) {
            setHintTextAppearance(c10357a1M437j.m39742n(i16, 0));
        }
        this.f10549A = c10357a1M437j.m39731c(C6747k.f26322U6);
        this.f10551B = c10357a1M437j.m39731c(C6747k.f26331V6);
        int iM39742n = c10357a1M437j.m39742n(i14, 0);
        CharSequence charSequenceM39744p = c10357a1M437j.m39744p(C6747k.f26425f7);
        int iM39739k = c10357a1M437j.m39739k(C6747k.f26416e7, 1);
        boolean zM39729a = c10357a1M437j.m39729a(C6747k.f26434g7, false);
        int iM39742n2 = c10357a1M437j.m39742n(i15, 0);
        boolean zM39729a2 = c10357a1M437j.m39729a(C6747k.f26506o7, false);
        CharSequence charSequenceM39744p2 = c10357a1M437j.m39744p(C6747k.f26497n7);
        int iM39742n3 = c10357a1M437j.m39742n(C6747k.f26152B7, 0);
        CharSequence charSequenceM39744p3 = c10357a1M437j.m39744p(C6747k.f26143A7);
        boolean zM39729a3 = c10357a1M437j.m39729a(C6747k.f26268O6, false);
        setCounterMaxLength(c10357a1M437j.m39739k(C6747k.f26277P6, -1));
        this.f10606q = c10357a1M437j.m39742n(i12, 0);
        this.f10604p = c10357a1M437j.m39742n(i13, 0);
        setBoxBackgroundMode(c10357a1M437j.m39739k(C6747k.f26178E6, 0));
        setErrorContentDescription(charSequenceM39744p);
        setErrorAccessibilityLiveRegion(iM39739k);
        setCounterOverflowTextAppearance(this.f10604p);
        setHelperTextTextAppearance(iM39742n2);
        setErrorTextAppearance(iM39742n);
        setCounterTextAppearance(this.f10606q);
        setPlaceholderText(charSequenceM39744p3);
        setPlaceholderTextAppearance(iM39742n3);
        int i24 = C6747k.f26479l7;
        if (c10357a1M437j.m39747s(i24)) {
            setErrorTextColor(c10357a1M437j.m39731c(i24));
        }
        int i25 = C6747k.f26524q7;
        if (c10357a1M437j.m39747s(i25)) {
            setHelperTextColor(c10357a1M437j.m39731c(i25));
        }
        int i26 = C6747k.f26560u7;
        if (c10357a1M437j.m39747s(i26)) {
            setHintTextColor(c10357a1M437j.m39731c(i26));
        }
        int i27 = C6747k.f26313T6;
        if (c10357a1M437j.m39747s(i27)) {
            setCounterTextColor(c10357a1M437j.m39731c(i27));
        }
        int i28 = C6747k.f26295R6;
        if (c10357a1M437j.m39747s(i28)) {
            setCounterOverflowTextColor(c10357a1M437j.m39731c(i28));
        }
        int i29 = C6747k.f26161C7;
        if (c10357a1M437j.m39747s(i29)) {
            setPlaceholderTextColor(c10357a1M437j.m39731c(i29));
        }
        C2862a c2862a = new C2862a(this, c10357a1M437j);
        this.f10578c = c2862a;
        boolean zM39729a4 = c10357a1M437j.m39729a(C6747k.f26577w6, true);
        c10357a1M437j.m39749x();
        C0625o0.m3060w0(this, 2);
        C0625o0.m3064y0(this, 1);
        frameLayout.addView(c7566x);
        frameLayout.addView(c2862a);
        addView(frameLayout);
        setEnabled(zM39729a4);
        setHelperTextEnabled(zM39729a2);
        setErrorEnabled(zM39729a);
        setCounterEnabled(zM39729a3);
        setHelperText(charSequenceM39744p2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f10578c.m13203Q(charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setEndIconDrawable(Drawable drawable) {
        this.f10578c.m13205S(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setErrorIconDrawable(Drawable drawable) {
        this.f10578c.m13215c0(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f10578c.m13226j0(charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f10578c.m13230l0(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f10576b.m31330r(charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setStartIconDrawable(Drawable drawable) {
        this.f10576b.m31331s(drawable);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }
}
