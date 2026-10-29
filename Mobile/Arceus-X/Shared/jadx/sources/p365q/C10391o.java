package p365q;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* JADX INFO: renamed from: q.o */
/* JADX INFO: loaded from: classes.dex */
public class C10391o {
    /* JADX INFO: renamed from: a */
    public static InputConnection m39937a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                if (parent instanceof InterfaceC10378h1) {
                    editorInfo.hintText = ((InterfaceC10378h1) parent).m39844a();
                    return inputConnection;
                }
            }
        }
        return inputConnection;
    }
}
