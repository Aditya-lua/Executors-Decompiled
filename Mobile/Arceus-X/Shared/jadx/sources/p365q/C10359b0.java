package p365q;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.graphics.C0558k;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p066d3.C4431i;
import p066d3.InterfaceC4424b;
import p232k.C7399a;
import p505w2.C12293e;

/* JADX INFO: renamed from: q.b0 */
/* JADX INFO: loaded from: classes.dex */
public class C10359b0 extends TextView implements InterfaceC4424b {

    /* JADX INFO: renamed from: a */
    public final C10367e f37243a;

    /* JADX INFO: renamed from: b */
    public final C10356a0 f37244b;

    /* JADX INFO: renamed from: c */
    public final C10413z f37245c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public C10389n f37246d;

    /* JADX INFO: renamed from: e */
    public boolean f37247e;

    /* JADX INFO: renamed from: f */
    public a f37248f;

    /* JADX INFO: renamed from: g */
    public Future<C12293e> f37249g;

    /* JADX INFO: renamed from: q.b0$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo39765a(int[] iArr, int i10);

        /* JADX INFO: renamed from: b */
        void mo39766b(int i10);

        /* JADX INFO: renamed from: c */
        void mo39767c(int i10, float f10);

        /* JADX INFO: renamed from: d */
        int[] mo39768d();

        /* JADX INFO: renamed from: e */
        TextClassifier mo39769e();

        /* JADX INFO: renamed from: f */
        int mo39770f();

        /* JADX INFO: renamed from: g */
        void mo39771g(TextClassifier textClassifier);

        int getAutoSizeMinTextSize();

        int getAutoSizeStepGranularity();

        int getAutoSizeTextType();

        /* JADX INFO: renamed from: h */
        void mo39772h(int i10);

        /* JADX INFO: renamed from: i */
        void mo39773i(int i10);

        void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13);
    }

    /* JADX INFO: renamed from: q.b0$b */
    public class b implements a {
        public b() {
        }

        @Override // p365q.C10359b0.a
        /* JADX INFO: renamed from: a */
        public void mo39765a(int[] iArr, int i10) {
            C10359b0.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        @Override // p365q.C10359b0.a
        /* JADX INFO: renamed from: b */
        public void mo39766b(int i10) {
        }

        @Override // p365q.C10359b0.a
        /* JADX INFO: renamed from: c */
        public void mo39767c(int i10, float f10) {
        }

        @Override // p365q.C10359b0.a
        /* JADX INFO: renamed from: d */
        public int[] mo39768d() {
            return C10359b0.super.getAutoSizeTextAvailableSizes();
        }

        @Override // p365q.C10359b0.a
        /* JADX INFO: renamed from: e */
        public TextClassifier mo39769e() {
            return C10359b0.super.getTextClassifier();
        }

        @Override // p365q.C10359b0.a
        /* JADX INFO: renamed from: f */
        public int mo39770f() {
            return C10359b0.super.getAutoSizeMaxTextSize();
        }

        @Override // p365q.C10359b0.a
        /* JADX INFO: renamed from: g */
        public void mo39771g(TextClassifier textClassifier) {
            C10359b0.super.setTextClassifier(textClassifier);
        }

        @Override // p365q.C10359b0.a
        public int getAutoSizeMinTextSize() {
            return C10359b0.super.getAutoSizeMinTextSize();
        }

        @Override // p365q.C10359b0.a
        public int getAutoSizeStepGranularity() {
            return C10359b0.super.getAutoSizeStepGranularity();
        }

        @Override // p365q.C10359b0.a
        public int getAutoSizeTextType() {
            return C10359b0.super.getAutoSizeTextType();
        }

        @Override // p365q.C10359b0.a
        /* JADX INFO: renamed from: h */
        public void mo39772h(int i10) {
        }

        @Override // p365q.C10359b0.a
        /* JADX INFO: renamed from: i */
        public void mo39773i(int i10) {
            C10359b0.super.setAutoSizeTextTypeWithDefaults(i10);
        }

        @Override // p365q.C10359b0.a
        public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
            C10359b0.super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }
    }

    /* JADX INFO: renamed from: q.b0$c */
    public class c extends b {
        public c() {
            super();
        }

        @Override // p365q.C10359b0.b, p365q.C10359b0.a
        /* JADX INFO: renamed from: b */
        public void mo39766b(int i10) {
            C10359b0.super.setLastBaselineToBottomHeight(i10);
        }

        @Override // p365q.C10359b0.b, p365q.C10359b0.a
        /* JADX INFO: renamed from: h */
        public void mo39772h(int i10) {
            C10359b0.super.setFirstBaselineToTopHeight(i10);
        }
    }

    /* JADX INFO: renamed from: q.b0$d */
    public class d extends c {
        public d() {
            super();
        }

        @Override // p365q.C10359b0.b, p365q.C10359b0.a
        /* JADX INFO: renamed from: c */
        public void mo39767c(int i10, float f10) {
            C10359b0.super.setLineHeight(i10, f10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C10359b0(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private C10389n getEmojiTextViewHelper() {
        if (this.f37246d == null) {
            this.f37246d = new C10389n(this);
        }
        return this.f37246d;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C10367e c10367e = this.f37243a;
        if (c10367e != null) {
            c10367e.m39824b();
        }
        C10356a0 c10356a0 = this.f37244b;
        if (c10356a0 != null) {
            c10356a0.m39695b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (C10375g1.f37315c) {
            return getSuperCaller().mo39770f();
        }
        C10356a0 c10356a0 = this.f37244b;
        if (c10356a0 != null) {
            return c10356a0.m39697e();
        }
        return -1;
    }

    @Override // android.widget.TextView, p066d3.InterfaceC4424b
    public int getAutoSizeMinTextSize() {
        if (C10375g1.f37315c) {
            return getSuperCaller().getAutoSizeMinTextSize();
        }
        C10356a0 c10356a0 = this.f37244b;
        if (c10356a0 != null) {
            return c10356a0.m39698f();
        }
        return -1;
    }

    @Override // android.widget.TextView, p066d3.InterfaceC4424b
    public int getAutoSizeStepGranularity() {
        if (C10375g1.f37315c) {
            return getSuperCaller().getAutoSizeStepGranularity();
        }
        C10356a0 c10356a0 = this.f37244b;
        if (c10356a0 != null) {
            return c10356a0.m39699g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (C10375g1.f37315c) {
            return getSuperCaller().mo39768d();
        }
        C10356a0 c10356a0 = this.f37244b;
        return c10356a0 != null ? c10356a0.m39700h() : new int[0];
    }

    @Override // android.widget.TextView, p066d3.InterfaceC4424b
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (C10375g1.f37315c) {
            return getSuperCaller().getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C10356a0 c10356a0 = this.f37244b;
        if (c10356a0 != null) {
            return c10356a0.m39701i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C4431i.m22314u(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return C4431i.m22298e(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return C4431i.m22299f(this);
    }

    public a getSuperCaller() {
        if (this.f37248f == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.f37248f = new d();
            } else if (i10 >= 28) {
                this.f37248f = new c();
            } else {
                this.f37248f = new b();
            }
        }
        return this.f37248f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C10367e c10367e = this.f37243a;
        if (c10367e != null) {
            return c10367e.m39825c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C10367e c10367e = this.f37243a;
        if (c10367e != null) {
            return c10367e.m39826d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f37244b.m39702j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f37244b.m39703k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m39764r();
        return super.getText();
    }

    @Override // android.widget.TextView
    @NonNull
    public TextClassifier getTextClassifier() {
        C10413z c10413z;
        return (Build.VERSION.SDK_INT >= 28 || (c10413z = this.f37245c) == null) ? getSuperCaller().mo39769e() : c10413z.m40075a();
    }

    @NonNull
    public C12293e.a getTextMetricsParamsCompat() {
        return C4431i.m22302i(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f37244b.m39710r(this, inputConnectionOnCreateInputConnection, editorInfo);
        return C10391o.m39937a(inputConnectionOnCreateInputConnection, editorInfo, this);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        C10356a0 c10356a0 = this.f37244b;
        if (c10356a0 != null) {
            c10356a0.m39707o(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        m39764r();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        C10356a0 c10356a0 = this.f37244b;
        if (c10356a0 == null || C10375g1.f37315c || !c10356a0.m39704l()) {
            return;
        }
        this.f37244b.m39696c();
    }

    /* JADX INFO: renamed from: r */
    public final void m39764r() {
        Future<C12293e> future = this.f37249g;
        if (future != null) {
            try {
                this.f37249g = null;
                C4431i.m22311r(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().m39927d(z10);
    }

    @Override // android.widget.TextView, p066d3.InterfaceC4424b
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (C10375g1.f37315c) {
            getSuperCaller().setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        C10356a0 c10356a0 = this.f37244b;
        if (c10356a0 != null) {
            c10356a0.m39712t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i10) {
        if (C10375g1.f37315c) {
            getSuperCaller().mo39765a(iArr, i10);
            return;
        }
        C10356a0 c10356a0 = this.f37244b;
        if (c10356a0 != null) {
            c10356a0.m39713u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (C10375g1.f37315c) {
            getSuperCaller().mo39773i(i10);
            return;
        }
        C10356a0 c10356a0 = this.f37244b;
        if (c10356a0 != null) {
            c10356a0.m39714v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C10367e c10367e = this.f37243a;
        if (c10367e != null) {
            c10367e.m39828f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C10367e c10367e = this.f37243a;
        if (c10367e != null) {
            c10367e.m39829g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C10356a0 c10356a0 = this.f37244b;
        if (c10356a0 != null) {
            c10356a0.m39708p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C10356a0 c10356a0 = this.f37244b;
        if (c10356a0 != null) {
            c10356a0.m39708p();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C10356a0 c10356a0 = this.f37244b;
        if (c10356a0 != null) {
            c10356a0.m39708p();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C10356a0 c10356a0 = this.f37244b;
        if (c10356a0 != null) {
            c10356a0.m39708p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C4431i.m22315v(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().m39928e(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m39924a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo39772h(i10);
        } else {
            C4431i.m22307n(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo39766b(i10);
        } else {
            C4431i.m22308o(this, i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        C4431i.m22309p(this, i10);
    }

    public void setPrecomputedText(@NonNull C12293e c12293e) {
        C4431i.m22311r(this, c12293e);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C10367e c10367e = this.f37243a;
        if (c10367e != null) {
            c10367e.m39831i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C10367e c10367e = this.f37243a;
        if (c10367e != null) {
            c10367e.m39832j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f37244b.m39715w(colorStateList);
        this.f37244b.m39695b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f37244b.m39716x(mode);
        this.f37244b.m39695b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C10356a0 c10356a0 = this.f37244b;
        if (c10356a0 != null) {
            c10356a0.m39709q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C10413z c10413z;
        if (Build.VERSION.SDK_INT >= 28 || (c10413z = this.f37245c) == null) {
            getSuperCaller().mo39771g(textClassifier);
        } else {
            c10413z.m40076b(textClassifier);
        }
    }

    public void setTextFuture(Future<C12293e> future) {
        this.f37249g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@NonNull C12293e.a aVar) {
        C4431i.m22313t(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (C10375g1.f37315c) {
            super.setTextSize(i10, f10);
            return;
        }
        C10356a0 c10356a0 = this.f37244b;
        if (c10356a0 != null) {
            c10356a0.m39691A(i10, f10);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i10) {
        if (this.f37247e) {
            return;
        }
        Typeface typefaceM2735a = (typeface == null || i10 <= 0) ? null : C0558k.m2735a(getContext(), typeface, i10);
        this.f37247e = true;
        if (typefaceM2735a != null) {
            typeface = typefaceM2735a;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f37247e = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C10359b0(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.widget.TextView
    public void setLineHeight(int i10, float f10) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().mo39767c(i10, f10);
        } else {
            C4431i.m22310q(this, i10, f10);
        }
    }

    public C10359b0(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(C10410x0.m40068b(context), attributeSet, i10);
        this.f37247e = false;
        this.f37248f = null;
        C10406v0.m40056a(this, getContext());
        C10367e c10367e = new C10367e(this);
        this.f37243a = c10367e;
        c10367e.m39827e(attributeSet, i10);
        C10356a0 c10356a0 = new C10356a0(this);
        this.f37244b = c10356a0;
        c10356a0.m39705m(attributeSet, i10);
        c10356a0.m39695b();
        this.f37245c = new C10413z(this);
        getEmojiTextViewHelper().m39926c(attributeSet, i10);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? C7399a.m30679b(context, i10) : null, i11 != 0 ? C7399a.m30679b(context, i11) : null, i12 != 0 ? C7399a.m30679b(context, i12) : null, i13 != 0 ? C7399a.m30679b(context, i13) : null);
        C10356a0 c10356a0 = this.f37244b;
        if (c10356a0 != null) {
            c10356a0.m39708p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? C7399a.m30679b(context, i10) : null, i11 != 0 ? C7399a.m30679b(context, i11) : null, i12 != 0 ? C7399a.m30679b(context, i12) : null, i13 != 0 ? C7399a.m30679b(context, i13) : null);
        C10356a0 c10356a0 = this.f37244b;
        if (c10356a0 != null) {
            c10356a0.m39708p();
        }
    }
}
