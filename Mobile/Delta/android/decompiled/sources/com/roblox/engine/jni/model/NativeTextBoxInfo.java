package com.roblox.engine.jni.model;

/* JADX INFO: loaded from: classes2.dex */
public class NativeTextBoxInfo {
    public boolean editable;
    public int font;
    public float fontSize;
    public float height;
    public boolean manualFocusRelease;
    public boolean multiline;
    public float paddingBottom;
    public float paddingLeft;
    public float paddingRight;
    public float paddingTop;
    public int returnKeyType;
    public int textColor;
    public int textInputType;
    public boolean textWrapped;
    public float width;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f9655x;
    public int xAlignment;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f9656y;
    public int yAlignment;

    @Deprecated
    public NativeTextBoxInfo(float f10, float f11, float f12, float f13, float f14, boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, boolean z11, boolean z12, boolean z13) {
        this.f9655x = f10;
        this.f9656y = f11;
        this.width = f12;
        this.height = f13;
        this.fontSize = f14;
        this.multiline = z10;
        this.xAlignment = i10;
        this.yAlignment = i11;
        this.textColor = i12;
        this.font = i13;
        this.textInputType = i14;
        this.returnKeyType = i15;
        this.manualFocusRelease = z11;
        this.textWrapped = z12;
        this.editable = z13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeTextBoxInfo)) {
            return false;
        }
        NativeTextBoxInfo nativeTextBoxInfo = (NativeTextBoxInfo) obj;
        return nativeTextBoxInfo.f9655x == this.f9655x && nativeTextBoxInfo.f9656y == this.f9656y && nativeTextBoxInfo.width == this.width && nativeTextBoxInfo.height == this.height && nativeTextBoxInfo.fontSize == this.fontSize && nativeTextBoxInfo.multiline == this.multiline && nativeTextBoxInfo.xAlignment == this.xAlignment && nativeTextBoxInfo.yAlignment == this.yAlignment && nativeTextBoxInfo.textColor == this.textColor && nativeTextBoxInfo.font == this.font && nativeTextBoxInfo.textInputType == this.textInputType && nativeTextBoxInfo.returnKeyType == this.returnKeyType && nativeTextBoxInfo.manualFocusRelease == this.manualFocusRelease && nativeTextBoxInfo.textWrapped == this.textWrapped && nativeTextBoxInfo.editable == this.editable && nativeTextBoxInfo.paddingLeft == this.paddingLeft && nativeTextBoxInfo.paddingTop == this.paddingTop && nativeTextBoxInfo.paddingRight == this.paddingRight && nativeTextBoxInfo.paddingBottom == this.paddingBottom;
    }

    public NativeTextBoxInfo(float f10, float f11, float f12, float f13, float f14, boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, boolean z11, boolean z12, boolean z13, float f15, float f16, float f17, float f18) {
        this.f9655x = f10;
        this.f9656y = f11;
        this.width = f12;
        this.height = f13;
        this.fontSize = f14;
        this.multiline = z10;
        this.xAlignment = i10;
        this.yAlignment = i11;
        this.textColor = i12;
        this.font = i13;
        this.textInputType = i14;
        this.returnKeyType = i15;
        this.manualFocusRelease = z11;
        this.textWrapped = z12;
        this.editable = z13;
        this.paddingLeft = f15;
        this.paddingTop = f16;
        this.paddingRight = f17;
        this.paddingBottom = f18;
    }

    public NativeTextBoxInfo(NativeTextBoxInfo nativeTextBoxInfo) {
        this.f9655x = nativeTextBoxInfo.f9655x;
        this.f9656y = nativeTextBoxInfo.f9656y;
        this.width = nativeTextBoxInfo.width;
        this.height = nativeTextBoxInfo.height;
        this.fontSize = nativeTextBoxInfo.fontSize;
        this.multiline = nativeTextBoxInfo.multiline;
        this.xAlignment = nativeTextBoxInfo.xAlignment;
        this.yAlignment = nativeTextBoxInfo.yAlignment;
        this.textColor = nativeTextBoxInfo.textColor;
        this.font = nativeTextBoxInfo.font;
        this.textInputType = nativeTextBoxInfo.textInputType;
        this.returnKeyType = nativeTextBoxInfo.returnKeyType;
        this.manualFocusRelease = nativeTextBoxInfo.manualFocusRelease;
        this.textWrapped = nativeTextBoxInfo.textWrapped;
        this.editable = nativeTextBoxInfo.editable;
        this.paddingLeft = nativeTextBoxInfo.paddingLeft;
        this.paddingTop = nativeTextBoxInfo.paddingTop;
        this.paddingRight = nativeTextBoxInfo.paddingRight;
        this.paddingBottom = nativeTextBoxInfo.paddingBottom;
    }
}
