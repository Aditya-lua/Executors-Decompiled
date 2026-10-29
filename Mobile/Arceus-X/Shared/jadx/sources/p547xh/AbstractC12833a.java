package p547xh;

import android.content.Context;
import com.roblox.client.RbxKeyboard;
import p107el.C5160a;
import p517wh.InterfaceC12468w0;

/* JADX INFO: renamed from: xh.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC12833a implements InterfaceC12468w0 {

    /* JADX INFO: renamed from: a */
    public final String f45631a = "rbx.glview.text";

    /* JADX INFO: renamed from: b */
    public RbxKeyboard f45632b;

    public AbstractC12833a(RbxKeyboard rbxKeyboard) {
        this.f45632b = rbxKeyboard;
        rbxKeyboard.setVisibility(8);
        this.f45632b.setImeOptions(268435460);
        this.f45632b.setSingleLine(true);
        this.f45632b.setText("");
        this.f45632b.m14825f();
    }

    /* JADX INFO: renamed from: f */
    public Context m47767f() {
        return this.f45632b.getContext();
    }

    /* JADX INFO: renamed from: g */
    public float m47768g() {
        return C5160a.m24001e(m47767f());
    }

    /* JADX INFO: renamed from: h */
    public long m47769h() {
        return this.f45632b.getCurrentTextBox();
    }

    /* JADX INFO: renamed from: i */
    public void m47770i(String str) {
        if (this.f45632b.getText().toString().equals(str)) {
            return;
        }
        this.f45632b.setText(str);
        this.f45632b.setSelection(str.length());
    }

    /* JADX INFO: renamed from: j */
    public void m47771j() {
        this.f45632b.m14830k();
    }
}
