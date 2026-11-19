package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class l extends EditText implements androidx.core.view.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f29545a;
    public final b0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f29546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d3.j f29547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final m f29548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f29549f;

    public class a {
        public a() {
        }

        public TextClassifier a() {
            return l.super.getTextClassifier();
        }

        public void b(TextClassifier textClassifier) {
            l.super.setTextClassifier(textClassifier);
        }
    }

    public l(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.D);
    }

    @NonNull
    private a getSuperCaller() {
        if (this.f29549f == null) {
            this.f29549f = new a();
        }
        return this.f29549f;
    }

    @Override // androidx.core.view.a0
    public androidx.core.view.d a(@NonNull androidx.core.view.d dVar) {
        return this.f29547d.a(this, dVar);
    }

    public void d(m mVar) {
        KeyListener keyListener = getKeyListener();
        if (mVar.b(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerA = mVar.a(keyListener);
            if (keyListenerA == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerA);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f29545a;
        if (eVar != null) {
            eVar.b();
        }
        b0 b0Var = this.b;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return d3.i.u(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f29545a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f29545a;
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
    @NonNull
    public TextClassifier getTextClassifier() {
        a0 a0Var;
        return (Build.VERSION.SDK_INT >= 28 || (a0Var = this.f29546c) == null) ? getSuperCaller().a() : a0Var.a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(@NonNull EditorInfo editorInfo) {
        String[] strArrC;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        InputConnection inputConnectionA = o.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionA != null && Build.VERSION.SDK_INT <= 30 && (strArrC = androidx.core.view.o0.C(this)) != null) {
            a3.a.c(editorInfo, strArrC);
            inputConnectionA = a3.c.c(this, inputConnectionA, editorInfo);
        }
        return this.f29548e.d(inputConnectionA, editorInfo);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (w.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (w.b(this, i10)) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f29545a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        e eVar = this.f29545a;
        if (eVar != null) {
            eVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.b;
        if (b0Var != null) {
            b0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.b;
        if (b0Var != null) {
            b0Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(d3.i.v(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f29548e.e(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f29548e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f29545a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f29545a;
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
    public void setTextClassifier(TextClassifier textClassifier) {
        a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.f29546c) == null) {
            getSuperCaller().b(textClassifier);
        } else {
            a0Var.b(textClassifier);
        }
    }

    public l(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(y0.b(context), attributeSet, i10);
        w0.a(this, getContext());
        e eVar = new e(this);
        this.f29545a = eVar;
        eVar.e(attributeSet, i10);
        b0 b0Var = new b0(this);
        this.b = b0Var;
        b0Var.m(attributeSet, i10);
        b0Var.b();
        this.f29546c = new a0(this);
        this.f29547d = new d3.j();
        m mVar = new m(this);
        this.f29548e = mVar;
        mVar.c(attributeSet, i10);
        d(mVar);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
