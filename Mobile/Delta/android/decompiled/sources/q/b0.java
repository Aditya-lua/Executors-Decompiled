package q;

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
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class b0 extends TextView implements d3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f28925a;
    public final a0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f28926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public n f28927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f28928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f28929f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Future<w2.e> f28930g;

    public interface a {
        void a(int[] iArr, int i10);

        void b(int i10);

        void c(int i10, float f10);

        int[] d();

        TextClassifier e();

        int f();

        void g(TextClassifier textClassifier);

        int getAutoSizeMinTextSize();

        int getAutoSizeStepGranularity();

        int getAutoSizeTextType();

        void h(int i10);

        void i(int i10);

        void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13);
    }

    public class b implements a {
        public b() {
        }

        @Override // q.b0.a
        public void a(int[] iArr, int i10) {
            b0.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        @Override // q.b0.a
        public void b(int i10) {
        }

        @Override // q.b0.a
        public void c(int i10, float f10) {
        }

        @Override // q.b0.a
        public int[] d() {
            return b0.super.getAutoSizeTextAvailableSizes();
        }

        @Override // q.b0.a
        public TextClassifier e() {
            return b0.super.getTextClassifier();
        }

        @Override // q.b0.a
        public int f() {
            return b0.super.getAutoSizeMaxTextSize();
        }

        @Override // q.b0.a
        public void g(TextClassifier textClassifier) {
            b0.super.setTextClassifier(textClassifier);
        }

        @Override // q.b0.a
        public int getAutoSizeMinTextSize() {
            return b0.super.getAutoSizeMinTextSize();
        }

        @Override // q.b0.a
        public int getAutoSizeStepGranularity() {
            return b0.super.getAutoSizeStepGranularity();
        }

        @Override // q.b0.a
        public int getAutoSizeTextType() {
            return b0.super.getAutoSizeTextType();
        }

        @Override // q.b0.a
        public void h(int i10) {
        }

        @Override // q.b0.a
        public void i(int i10) {
            b0.super.setAutoSizeTextTypeWithDefaults(i10);
        }

        @Override // q.b0.a
        public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
            b0.super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }
    }

    public class c extends b {
        public c() {
            super();
        }

        @Override // q.b0.b, q.b0.a
        public void b(int i10) {
            b0.super.setLastBaselineToBottomHeight(i10);
        }

        @Override // q.b0.b, q.b0.a
        public void h(int i10) {
            b0.super.setFirstBaselineToTopHeight(i10);
        }
    }

    public class d extends c {
        public d() {
            super();
        }

        @Override // q.b0.b, q.b0.a
        public void c(int i10, float f10) {
            b0.super.setLineHeight(i10, f10);
        }
    }

    public b0(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private n getEmojiTextViewHelper() {
        if (this.f28927d == null) {
            this.f28927d = new n(this);
        }
        return this.f28927d;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f28925a;
        if (eVar != null) {
            eVar.b();
        }
        a0 a0Var = this.b;
        if (a0Var != null) {
            a0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (g1.f28984c) {
            return getSuperCaller().f();
        }
        a0 a0Var = this.b;
        if (a0Var != null) {
            return a0Var.e();
        }
        return -1;
    }

    @Override // android.widget.TextView, d3.b
    public int getAutoSizeMinTextSize() {
        if (g1.f28984c) {
            return getSuperCaller().getAutoSizeMinTextSize();
        }
        a0 a0Var = this.b;
        if (a0Var != null) {
            return a0Var.f();
        }
        return -1;
    }

    @Override // android.widget.TextView, d3.b
    public int getAutoSizeStepGranularity() {
        if (g1.f28984c) {
            return getSuperCaller().getAutoSizeStepGranularity();
        }
        a0 a0Var = this.b;
        if (a0Var != null) {
            return a0Var.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (g1.f28984c) {
            return getSuperCaller().d();
        }
        a0 a0Var = this.b;
        return a0Var != null ? a0Var.h() : new int[0];
    }

    @Override // android.widget.TextView, d3.b
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (g1.f28984c) {
            return getSuperCaller().getAutoSizeTextType() == 1 ? 1 : 0;
        }
        a0 a0Var = this.b;
        if (a0Var != null) {
            return a0Var.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return d3.i.u(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return d3.i.e(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return d3.i.f(this);
    }

    public a getSuperCaller() {
        if (this.f28929f == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.f28929f = new d();
            } else if (i10 >= 28) {
                this.f28929f = new c();
            } else {
                this.f28929f = new b();
            }
        }
        return this.f28929f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f28925a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f28925a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        r();
        return super.getText();
    }

    @Override // android.widget.TextView
    @NonNull
    public TextClassifier getTextClassifier() {
        z zVar;
        return (Build.VERSION.SDK_INT >= 28 || (zVar = this.f28926c) == null) ? getSuperCaller().e() : zVar.a();
    }

    @NonNull
    public w2.e.a getTextMetricsParamsCompat() {
        return d3.i.i(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        return o.a(inputConnectionOnCreateInputConnection, editorInfo, this);
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
        a0 a0Var = this.b;
        if (a0Var != null) {
            a0Var.o(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        r();
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        a0 a0Var = this.b;
        if (a0Var == null || g1.f28984c || !a0Var.l()) {
            return;
        }
        this.b.c();
    }

    public final void r() {
        Future<w2.e> future = this.f28930g;
        if (future != null) {
            try {
                this.f28930g = null;
                d3.i.r(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView, d3.b
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (g1.f28984c) {
            getSuperCaller().setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        a0 a0Var = this.b;
        if (a0Var != null) {
            a0Var.t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i10) {
        if (g1.f28984c) {
            getSuperCaller().a(iArr, i10);
            return;
        }
        a0 a0Var = this.b;
        if (a0Var != null) {
            a0Var.u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (g1.f28984c) {
            getSuperCaller().i(i10);
            return;
        }
        a0 a0Var = this.b;
        if (a0Var != null) {
            a0Var.v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f28925a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f28925a;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.b;
        if (a0Var != null) {
            a0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.b;
        if (a0Var != null) {
            a0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.b;
        if (a0Var != null) {
            a0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        a0 a0Var = this.b;
        if (a0Var != null) {
            a0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(d3.i.v(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().h(i10);
        } else {
            d3.i.n(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i10);
        } else {
            d3.i.o(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        d3.i.p(this, i10);
    }

    public void setPrecomputedText(@NonNull w2.e eVar) {
        d3.i.r(this, eVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f28925a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f28925a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.b.w(colorStateList);
        this.b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.b.x(mode);
        this.b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        a0 a0Var = this.b;
        if (a0Var != null) {
            a0Var.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        z zVar;
        if (Build.VERSION.SDK_INT >= 28 || (zVar = this.f28926c) == null) {
            getSuperCaller().g(textClassifier);
        } else {
            zVar.b(textClassifier);
        }
    }

    public void setTextFuture(Future<w2.e> future) {
        this.f28930g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@NonNull w2.e.a aVar) {
        d3.i.t(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (g1.f28984c) {
            super.setTextSize(i10, f10);
            return;
        }
        a0 a0Var = this.b;
        if (a0Var != null) {
            a0Var.A(i10, f10);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i10) {
        if (this.f28928e) {
            return;
        }
        Typeface typefaceA = (typeface == null || i10 <= 0) ? null : androidx.core.graphics.k.a(getContext(), typeface, i10);
        this.f28928e = true;
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f28928e = false;
        }
    }

    public b0(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10, float f10) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().c(i10, f10);
        } else {
            d3.i.q(this, i10, f10);
        }
    }

    public b0(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(x0.b(context), attributeSet, i10);
        this.f28928e = false;
        this.f28929f = null;
        v0.a(this, getContext());
        e eVar = new e(this);
        this.f28925a = eVar;
        eVar.e(attributeSet, i10);
        a0 a0Var = new a0(this);
        this.b = a0Var;
        a0Var.m(attributeSet, i10);
        a0Var.b();
        this.f28926c = new z(this);
        getEmojiTextViewHelper().c(attributeSet, i10);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? k.a.b(context, i10) : null, i11 != 0 ? k.a.b(context, i11) : null, i12 != 0 ? k.a.b(context, i12) : null, i13 != 0 ? k.a.b(context, i13) : null);
        a0 a0Var = this.b;
        if (a0Var != null) {
            a0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? k.a.b(context, i10) : null, i11 != 0 ? k.a.b(context, i11) : null, i12 != 0 ? k.a.b(context, i12) : null, i13 != 0 ? k.a.b(context, i13) : null);
        a0 a0Var = this.b;
        if (a0Var != null) {
            a0Var.p();
        }
    }
}
