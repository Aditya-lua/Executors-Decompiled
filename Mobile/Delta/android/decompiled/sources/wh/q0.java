package wh;

import android.widget.FrameLayout;
import com.roblox.client.RbxKeyboard;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.model.NativeTextBoxInfo;
import java.util.Objects;
import sg.e2;

/* JADX INFO: loaded from: classes2.dex */
public class q0 extends xh.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public NativeTextBoxInfo f34367c;

    public q0(RbxKeyboard rbxKeyboard) {
        super(rbxKeyboard);
    }

    @Override // wh.w0
    public void a() {
        gk.p.b("rbx.glview.text", "hideKeyboard()");
        this.b.e();
        this.b.setInputType(0);
        this.f34367c = null;
    }

    @Override // wh.w0
    public void b(long j10, boolean z10, String str, NativeTextBoxInfo nativeTextBoxInfo) {
        gk.p.b("rbx.glview.text", "showKeyboard() " + str);
        this.b.setCurrentTextBox(j10);
        if (th.h.a().x2()) {
            this.b.i(nativeTextBoxInfo, str);
        }
        this.b.setText(str);
        if (z10) {
            this.f34367c = nativeTextBoxInfo;
            k(nativeTextBoxInfo, this.b);
        }
        if (th.h.a().q1() && nativeTextBoxInfo == null) {
            this.b.setInputType(1);
            this.b.setImeOptions(268435460);
        }
        this.b.setVisibility(0);
        this.b.requestFocus();
        e2.k(this.b, 2);
        this.b.setSelection(str.length());
        j();
    }

    @Override // wh.w0
    public void c() {
        NativeTextBoxInfo nativeTextBoxInfoNativeGetTextBoxInfo = NativeGLInterface.nativeGetTextBoxInfo();
        if (nativeTextBoxInfoNativeGetTextBoxInfo != null) {
            gk.p.b("rbx.glview.text", "onLuaTextBoxPropertyChanged() x:" + nativeTextBoxInfoNativeGetTextBoxInfo.f9655x + " y:" + nativeTextBoxInfoNativeGetTextBoxInfo.f9656y + " width:" + nativeTextBoxInfoNativeGetTextBoxInfo.width + " height:" + nativeTextBoxInfoNativeGetTextBoxInfo.height + " fontSize:" + nativeTextBoxInfoNativeGetTextBoxInfo.fontSize);
        }
        if (Objects.equals(nativeTextBoxInfoNativeGetTextBoxInfo, this.f34367c)) {
            return;
        }
        this.f34367c = nativeTextBoxInfoNativeGetTextBoxInfo;
        k(nativeTextBoxInfoNativeGetTextBoxInfo, this.b);
        this.b.requestFocus();
    }

    @Override // wh.w0
    public void d(String str) {
        i(str);
    }

    @Override // wh.w0
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
        float f10 = (nativeTextBoxInfo != null ? nativeTextBoxInfo.f9655x : 0.0f) * fG;
        float f11 = (nativeTextBoxInfo != null ? nativeTextBoxInfo.f9656y : 0.0f) * fG;
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
