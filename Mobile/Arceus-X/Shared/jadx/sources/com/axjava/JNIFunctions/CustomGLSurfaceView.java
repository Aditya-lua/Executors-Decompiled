package com.axjava.JNIFunctions;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* JADX INFO: loaded from: classes4.dex */
public class CustomGLSurfaceView extends GLSurfaceView {
    private BaseInputConnection inputConnection;

    public CustomGLSurfaceView(Context context) {
        super(context);
        Log.e("sss", "dieieuer3 ");
    }

    /* JADX INFO: renamed from: com.axjava.JNIFunctions.CustomGLSurfaceView$a */
    class C1861a extends BaseInputConnection {
        C1861a(CustomGLSurfaceView this$0, View arg0, boolean arg1) {
            super(arg0, arg1);
        }

        @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
        public boolean commitText(CharSequence text, int newCursorPosition) {
            JNIUtils.handleTextInput(text.toString());
            Log.e("sss", "dieieuer2 " + text.toString());
            return true;
        }
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        if (this.inputConnection == null) {
            this.inputConnection = new C1861a(this, this, false);
        }
        Log.e("sss", "dieieuer");
        outAttrs.actionLabel = null;
        outAttrs.inputType = 0;
        outAttrs.imeOptions = 6;
        return this.inputConnection;
    }
}
