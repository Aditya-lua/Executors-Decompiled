package p365q;

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
import p066d3.C4431i;
import p066d3.InterfaceC4424b;
import p181i.C6589a;

/* JADX INFO: renamed from: q.f */
/* JADX INFO: loaded from: classes.dex */
public class C10370f extends Button implements InterfaceC4424b {

    /* JADX INFO: renamed from: a */
    public final C10367e f37304a;

    /* JADX INFO: renamed from: b */
    public final C10356a0 f37305b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public C10389n f37306c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C10370f(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6589a.f25039r);
    }

    @NonNull
    private C10389n getEmojiTextViewHelper() {
        if (this.f37306c == null) {
            this.f37306c = new C10389n(this);
        }
        return this.f37306c;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C10367e c10367e = this.f37304a;
        if (c10367e != null) {
            c10367e.m39824b();
        }
        C10356a0 c10356a0 = this.f37305b;
        if (c10356a0 != null) {
            c10356a0.m39695b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (C10375g1.f37315c) {
            return super.getAutoSizeMaxTextSize();
        }
        C10356a0 c10356a0 = this.f37305b;
        if (c10356a0 != null) {
            return c10356a0.m39697e();
        }
        return -1;
    }

    @Override // android.widget.TextView, p066d3.InterfaceC4424b
    public int getAutoSizeMinTextSize() {
        if (C10375g1.f37315c) {
            return super.getAutoSizeMinTextSize();
        }
        C10356a0 c10356a0 = this.f37305b;
        if (c10356a0 != null) {
            return c10356a0.m39698f();
        }
        return -1;
    }

    @Override // android.widget.TextView, p066d3.InterfaceC4424b
    public int getAutoSizeStepGranularity() {
        if (C10375g1.f37315c) {
            return super.getAutoSizeStepGranularity();
        }
        C10356a0 c10356a0 = this.f37305b;
        if (c10356a0 != null) {
            return c10356a0.m39699g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (C10375g1.f37315c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C10356a0 c10356a0 = this.f37305b;
        return c10356a0 != null ? c10356a0.m39700h() : new int[0];
    }

    @Override // android.widget.TextView, p066d3.InterfaceC4424b
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (C10375g1.f37315c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C10356a0 c10356a0 = this.f37305b;
        if (c10356a0 != null) {
            return c10356a0.m39701i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C4431i.m22314u(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C10367e c10367e = this.f37304a;
        if (c10367e != null) {
            return c10367e.m39825c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C10367e c10367e = this.f37304a;
        if (c10367e != null) {
            return c10367e.m39826d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f37305b.m39702j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f37305b.m39703k();
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
        C10356a0 c10356a0 = this.f37305b;
        if (c10356a0 != null) {
            c10356a0.m39707o(z10, i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        C10356a0 c10356a0 = this.f37305b;
        if (c10356a0 == null || C10375g1.f37315c || !c10356a0.m39704l()) {
            return;
        }
        this.f37305b.m39696c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().m39927d(z10);
    }

    @Override // android.widget.TextView, p066d3.InterfaceC4424b
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (C10375g1.f37315c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        C10356a0 c10356a0 = this.f37305b;
        if (c10356a0 != null) {
            c10356a0.m39712t(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i10) {
        if (C10375g1.f37315c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        C10356a0 c10356a0 = this.f37305b;
        if (c10356a0 != null) {
            c10356a0.m39713u(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (C10375g1.f37315c) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        C10356a0 c10356a0 = this.f37305b;
        if (c10356a0 != null) {
            c10356a0.m39714v(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C10367e c10367e = this.f37304a;
        if (c10367e != null) {
            c10367e.m39828f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C10367e c10367e = this.f37304a;
        if (c10367e != null) {
            c10367e.m39829g(i10);
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

    public void setSupportAllCaps(boolean z10) {
        C10356a0 c10356a0 = this.f37305b;
        if (c10356a0 != null) {
            c10356a0.m39711s(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C10367e c10367e = this.f37304a;
        if (c10367e != null) {
            c10367e.m39831i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C10367e c10367e = this.f37304a;
        if (c10367e != null) {
            c10367e.m39832j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f37305b.m39715w(colorStateList);
        this.f37305b.m39695b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f37305b.m39716x(mode);
        this.f37305b.m39695b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C10356a0 c10356a0 = this.f37305b;
        if (c10356a0 != null) {
            c10356a0.m39709q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (C10375g1.f37315c) {
            super.setTextSize(i10, f10);
            return;
        }
        C10356a0 c10356a0 = this.f37305b;
        if (c10356a0 != null) {
            c10356a0.m39691A(i10, f10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C10370f(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(C10410x0.m40068b(context), attributeSet, i10);
        C10406v0.m40056a(this, getContext());
        C10367e c10367e = new C10367e(this);
        this.f37304a = c10367e;
        c10367e.m39827e(attributeSet, i10);
        C10356a0 c10356a0 = new C10356a0(this);
        this.f37305b = c10356a0;
        c10356a0.m39705m(attributeSet, i10);
        c10356a0.m39695b();
        getEmojiTextViewHelper().m39926c(attributeSet, i10);
    }
}
