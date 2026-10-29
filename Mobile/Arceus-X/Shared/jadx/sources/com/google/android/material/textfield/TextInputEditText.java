package com.google.android.material.textfield;

import ad.C0136h;
import ad.C0143o;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.NonNull;
import md.C8485a;
import p194ic.C6738b;
import p194ic.C6746j;
import p194ic.C6747k;
import p365q.C10385l;

/* JADX INFO: loaded from: classes2.dex */
public class TextInputEditText extends C10385l {

    /* JADX INFO: renamed from: g */
    public final Rect f10545g;

    /* JADX INFO: renamed from: h */
    public boolean f10546h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TextInputEditText(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6738b.f25909p);
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m13095e(TextInputLayout textInputLayout) {
        return textInputLayout != null && this.f10546h;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!m13095e(textInputLayout) || rect == null) {
            return;
        }
        textInputLayout.getFocusedRect(this.f10545g);
        rect.bottom = this.f10545g.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!m13095e(textInputLayout)) {
            return super.getGlobalVisibleRect(rect, point);
        }
        boolean globalVisibleRect = textInputLayout.getGlobalVisibleRect(rect, point);
        if (globalVisibleRect && point != null) {
            point.offset(-getScrollX(), -getScrollY());
        }
        return globalVisibleRect;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.m13124R()) ? super.getHint() : textInputLayout.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.m13124R() && super.getHint() == null && C0136h.m401b()) {
            setHint("");
        }
    }

    @Override // p365q.C10385l, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(@NonNull EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (!m13095e(textInputLayout) || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        this.f10545g.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
        return super.requestRectangleOnScreen(this.f10545g);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z10) {
        this.f10546h = z10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public TextInputEditText(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(C8485a.m34268c(context, attributeSet, i10, 0), attributeSet, i10);
        this.f10545g = new Rect();
        TypedArray typedArrayM436i = C0143o.m436i(context, attributeSet, C6747k.f26550t6, i10, C6746j.f26117i, new int[0]);
        setTextInputLayoutFocusedRectEnabled(typedArrayM436i.getBoolean(C6747k.f26559u6, false));
        typedArrayM436i.recycle();
    }
}
