package com.google.androidgamesdk.gametextinput;

import android.view.inputmethod.EditorInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: com.google.androidgamesdk.gametextinput.a$a, reason: collision with other inner class name */
    public static final class C0125a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8387a;
        public int b;

        public C0125a(int i10, int i11) {
            this.f8387a = i10;
            this.b = i11;
        }
    }

    public static final void a(EditorInfo editorInfo, EditorInfo editorInfo2) {
        if (editorInfo == null || editorInfo2 == null) {
            return;
        }
        CharSequence charSequence = editorInfo.hintText;
        if (charSequence != null) {
            editorInfo2.hintText = charSequence;
        }
        editorInfo2.inputType = editorInfo.inputType;
        editorInfo2.imeOptions = editorInfo.imeOptions;
        editorInfo2.label = editorInfo.label;
        editorInfo2.initialCapsMode = editorInfo.initialCapsMode;
        editorInfo2.privateImeOptions = editorInfo.privateImeOptions;
        String str = editorInfo.packageName;
        if (str != null) {
            editorInfo2.packageName = str;
        }
        editorInfo2.fieldId = editorInfo.fieldId;
        String str2 = editorInfo.fieldName;
        if (str2 != null) {
            editorInfo2.fieldName = str2;
        }
        editorInfo2.initialSelStart = editorInfo.initialSelStart;
        editorInfo2.initialSelEnd = editorInfo.initialSelEnd;
    }
}
