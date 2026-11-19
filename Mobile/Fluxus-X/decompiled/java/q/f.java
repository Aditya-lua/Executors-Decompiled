package q;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class f extends Button implements d3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f29517a;
    public final b0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public n f29518c;

    public f(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.f18745r);
    }

    @NonNull
    private n getEmojiTextViewHelper() {
        if (this.f29518c == null) {
            this.f29518c = new n(this);
        }
        return this.f29518c;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f29517a;
        if (eVar != null) {
            eVar.b();
        }
        b0 b0Var = this.b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (h1.f29527c) {
            return super.getAutoSizeMaxTextSize();
        }
        b0 b0Var = this.b;
        if (b0Var != null) {
            return b0Var.e();
        }
        return -1;
    }

    @Override // android.widget.TextView, d3.b
    public int getAutoSizeMinTextSize() {
        if (h1.f29527c) {
            return super.getAutoSizeMinTextSize();
        }
        b0 b0Var = this.b;
        if (b0Var != null) {
            return b0Var.f();
        }
        return -1;
    }

    @Override // android.widget.TextView, d3.b
    public int getAutoSizeStepGranularity() {
        if (h1.f29527c) {
            return super.getAutoSizeStepGranularity();
        }
        b0 b0Var = this.b;
        if (b0Var != null) {
            return b0Var.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (h1.f29527c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        b0 b0Var = this.b;
        return b0Var != null ? b0Var.h() : new int[0];
    }

    @Override // android.widget.TextView, d3.b
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (h1.f29527c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        b0 b0Var = this.b;
        if (b0Var != null) {
            return b0Var.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return d3.i.u(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f29517a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f29517a;
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        b0 b0Var = this.b;
        if (b0Var != null) {
            b0Var.o(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        b0 b0Var = this.b;
        if (b0Var == null || h1.f29527c || !b0Var.l()) {
            return;
        }
        this.b.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.TextView, d3.b
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (h1.f29527c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        b0 b0Var = this.b;
        if (b0Var != null) {
            b0Var.t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i10) {
        if (h1.f29527c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        b0 b0Var = this.b;
        if (b0Var != null) {
            b0Var.u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (h1.f29527c) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        b0 b0Var = this.b;
        if (b0Var != null) {
            b0Var.v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f29517a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f29517a;
        if (eVar != null) {
            eVar.g(i10);
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

    public void setSupportAllCaps(boolean z10) {
        b0 b0Var = this.b;
        if (b0Var != null) {
            b0Var.s(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f29517a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f29517a;
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
        b0 b0Var = this.b;
        if (b0Var != null) {
            b0Var.q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (h1.f29527c) {
            super.setTextSize(i10, f10);
            return;
        }
        b0 b0Var = this.b;
        if (b0Var != null) {
            b0Var.A(i10, f10);
        }
    }

    public f(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(y0.b(context), attributeSet, i10);
        w0.a(this, getContext());
        e eVar = new e(this);
        this.f29517a = eVar;
        eVar.e(attributeSet, i10);
        b0 b0Var = new b0(this);
        this.b = b0Var;
        b0Var.m(attributeSet, i10);
        b0Var.b();
        getEmojiTextViewHelper().c(attributeSet, i10);
    }
}
