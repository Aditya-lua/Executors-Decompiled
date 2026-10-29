package com.google.androidgamesdk.gametextinput;

import android.view.inputmethod.EditorInfo;

/* JADX INFO: renamed from: com.google.androidgamesdk.gametextinput.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C2898a {

    /* JADX INFO: renamed from: com.google.androidgamesdk.gametextinput.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public int f10792a;

        /* JADX INFO: renamed from: b */
        public int f10793b;

        public a(int i10, int i11) {
            this.f10792a = i10;
            this.f10793b = i11;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m13368a(EditorInfo editorInfo, EditorInfo editorInfo2) {
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
