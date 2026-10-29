package xh;

import android.content.Context;
import com.roblox.client.RbxKeyboard;
import wh.w0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35193a = "rbx.glview.text";
    public RbxKeyboard b;

    public a(RbxKeyboard rbxKeyboard) {
        this.b = rbxKeyboard;
        rbxKeyboard.setVisibility(8);
        this.b.setImeOptions(268435460);
        this.b.setSingleLine(true);
        this.b.setText("");
        this.b.f();
    }

    public Context f() {
        return this.b.getContext();
    }

    public float g() {
        return el.a.e(f());
    }

    public long h() {
        return this.b.getCurrentTextBox();
    }

    public void i(String str) {
        if (this.b.getText().toString().equals(str)) {
            return;
        }
        this.b.setText(str);
        this.b.setSelection(str.length());
    }

    public void j() {
        this.b.k();
    }
}
