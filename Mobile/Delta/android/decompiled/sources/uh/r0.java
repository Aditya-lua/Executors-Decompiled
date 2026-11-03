package uh;

import android.widget.FrameLayout;
import com.roblox.client.RbxKeyboard;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.model.NativeTextBoxInfo;
import java.util.Objects;
import rg.e2;

/* JADX INFO: loaded from: classes2.dex */
public class r0 extends vh.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public NativeTextBoxInfo f33046c;

    public r0(RbxKeyboard rbxKeyboard) {
        super(rbxKeyboard);
    }

    @Override // uh.x0
    public void a() {
        ek.q.b("rbx.glview.text", "hideKeyboard()");
        this.b.e();
        this.b.setInputType(0);
        this.f33046c = null;
    }

    @Override // uh.x0
    public void b(long j10, boolean z10, String str, NativeTextBoxInfo nativeTextBoxInfo) {
        ek.q.b("rbx.glview.text", "showKeyboard() " + str);
        this.b.setCurrentTextBox(j10);
        if (rh.h.a().I2()) {
            this.b.i(nativeTextBoxInfo, str);
        }
        this.b.setText(str);
        if (z10) {
            this.f33046c = nativeTextBoxInfo;
            k(nativeTextBoxInfo, this.b);
        }
        if (rh.h.a().z1() && nativeTextBoxInfo == null) {
            this.b.setInputType(1);
            this.b.setImeOptions(268435460);
        }
        this.b.setVisibility(0);
        this.b.requestFocus();
        e2.k(this.b, 2);
        this.b.setSelection(str.length());
        j();
    }

    @Override // uh.x0
    public void c() {
        NativeTextBoxInfo nativeTextBoxInfoNativeGetTextBoxInfo = NativeGLInterface.nativeGetTextBoxInfo();
        if (nativeTextBoxInfoNativeGetTextBoxInfo != null) {
            ek.q.b("rbx.glview.text", "onLuaTextBoxPropertyChanged() x:" + nativeTextBoxInfoNativeGetTextBoxInfo.f9735x + " y:" + nativeTextBoxInfoNativeGetTextBoxInfo.f9736y + " width:" + nativeTextBoxInfoNativeGetTextBoxInfo.width + " height:" + nativeTextBoxInfoNativeGetTextBoxInfo.height + " fontSize:" + nativeTextBoxInfoNativeGetTextBoxInfo.fontSize);
        }
        if (Objects.equals(nativeTextBoxInfoNativeGetTextBoxInfo, this.f33046c)) {
            return;
        }
        this.f33046c = nativeTextBoxInfoNativeGetTextBoxInfo;
        k(nativeTextBoxInfoNativeGetTextBoxInfo, this.b);
        this.b.requestFocus();
    }

    @Override // uh.x0
    public void d(String str) {
        i(str);
    }

    @Override // uh.x0
    public void e() {
        RbxKeyboard rbxKeyboard = this.b;
        if (rbxKeyboard != null) {
            rbxKeyboard.h();
        }
    }

    public final void k(NativeTextBoxInfo nativeTextBoxInfo, RbxKeyboard rbxKeyboard) {
        l(nativeTextBoxInfo, rbxKeyboard);
        if (nativeTextBoxInfo != null) {
            rbxKeyboard.l(nativeTextBoxInfo);
            rbxKeyboard.m(nativeTextBoxInfo.font, nativeTextBoxInfo.fontSize, g());
        }
        rbxKeyboard.setVisibility(0);
    }

    public final void l(NativeTextBoxInfo nativeTextBoxInfo, RbxKeyboard rbxKeyboard) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rbxKeyboard.getLayoutParams();
        float fG = g();
        float f10 = (nativeTextBoxInfo != null ? nativeTextBoxInfo.f9735x : 0.0f) * fG;
        float f11 = (nativeTextBoxInfo != null ? nativeTextBoxInfo.f9736y : 0.0f) * fG;
        float f12 = (nativeTextBoxInfo != null ? nativeTextBoxInfo.width : 0.0f) * fG;
        float f13 = nativeTextBoxInfo != null ? nativeTextBoxInfo.height : 0.0f;
        layoutParams.topMargin = (int) f11;
        layoutParams.width = (int) f12;
        layoutParams.height = (int) (f13 * fG);
        layoutParams.leftMargin = (int) f10;
        rbxKeyboard.setLayoutParams(layoutParams);
        if (nativeTextBoxInfo != null) {
            rbxKeyboard.setPadding((int) (nativeTextBoxInfo.paddingLeft * fG), (int) (nativeTextBoxInfo.paddingTop * fG), (int) (nativeTextBoxInfo.paddingRight * fG), (int) (fG * nativeTextBoxInfo.paddingBottom));
        } else {
            rbxKeyboard.setPadding(0, 0, 0, 0);
        }
    }
}
