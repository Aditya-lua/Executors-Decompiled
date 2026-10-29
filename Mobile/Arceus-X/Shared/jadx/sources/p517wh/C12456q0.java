package p517wh;

import android.widget.FrameLayout;
import com.roblox.client.RbxKeyboard;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.model.NativeTextBoxInfo;
import java.util.Objects;
import p151gk.C6124q;
import p547xh.AbstractC12833a;
import sg.C11312e2;
import th.C11659h;

/* JADX INFO: renamed from: wh.q0 */
/* JADX INFO: loaded from: classes2.dex */
public class C12456q0 extends AbstractC12833a {

    /* JADX INFO: renamed from: c */
    public NativeTextBoxInfo f44560c;

    public C12456q0(RbxKeyboard rbxKeyboard) {
        super(rbxKeyboard);
    }

    @Override // p517wh.InterfaceC12468w0
    /* JADX INFO: renamed from: a */
    public void mo15256a() {
        C6124q.m27057b("rbx.glview.text", "hideKeyboard()");
        this.f45632b.m14824e();
        this.f45632b.setInputType(0);
        this.f44560c = null;
    }

    @Override // p517wh.InterfaceC12468w0
    /* JADX INFO: renamed from: b */
    public void mo15257b(long j10, boolean z10, String str, NativeTextBoxInfo nativeTextBoxInfo) {
        C6124q.m27057b("rbx.glview.text", "showKeyboard() " + str);
        this.f45632b.setCurrentTextBox(j10);
        if (C11659h.m43403a().mo43428D2()) {
            this.f45632b.m14828i(nativeTextBoxInfo, str);
        }
        this.f45632b.setText(str);
        if (z10) {
            this.f44560c = nativeTextBoxInfo;
            m46693k(nativeTextBoxInfo, this.f45632b);
        }
        if (C11659h.m43403a().mo43738v1() && nativeTextBoxInfo == null) {
            this.f45632b.setInputType(1);
            this.f45632b.setImeOptions(268435460);
        }
        this.f45632b.setVisibility(0);
        this.f45632b.requestFocus();
        C11312e2.m42507k(this.f45632b, 2);
        this.f45632b.setSelection(str.length());
        m47771j();
    }

    @Override // p517wh.InterfaceC12468w0
    /* JADX INFO: renamed from: c */
    public void mo15258c() {
        NativeTextBoxInfo nativeTextBoxInfoNativeGetTextBoxInfo = NativeGLInterface.nativeGetTextBoxInfo();
        if (nativeTextBoxInfoNativeGetTextBoxInfo != null) {
            C6124q.m27057b("rbx.glview.text", "onLuaTextBoxPropertyChanged() x:" + nativeTextBoxInfoNativeGetTextBoxInfo.f12594x + " y:" + nativeTextBoxInfoNativeGetTextBoxInfo.f12595y + " width:" + nativeTextBoxInfoNativeGetTextBoxInfo.width + " height:" + nativeTextBoxInfoNativeGetTextBoxInfo.height + " fontSize:" + nativeTextBoxInfoNativeGetTextBoxInfo.fontSize);
        }
        if (Objects.equals(nativeTextBoxInfoNativeGetTextBoxInfo, this.f44560c)) {
            return;
        }
        this.f44560c = nativeTextBoxInfoNativeGetTextBoxInfo;
        m46693k(nativeTextBoxInfoNativeGetTextBoxInfo, this.f45632b);
        this.f45632b.requestFocus();
    }

    @Override // p517wh.InterfaceC12468w0
    /* JADX INFO: renamed from: d */
    public void mo15259d(String str) {
        m47770i(str);
    }

    @Override // p517wh.InterfaceC12468w0
    /* JADX INFO: renamed from: e */
    public void mo15260e() {
        RbxKeyboard rbxKeyboard = this.f45632b;
        if (rbxKeyboard != null) {
            rbxKeyboard.m14827h();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m46693k(NativeTextBoxInfo nativeTextBoxInfo, RbxKeyboard rbxKeyboard) {
        m46694l(nativeTextBoxInfo, rbxKeyboard);
        if (nativeTextBoxInfo != null) {
            rbxKeyboard.m14831l(nativeTextBoxInfo);
            rbxKeyboard.m14832m(nativeTextBoxInfo.font, nativeTextBoxInfo.fontSize, m47768g());
        }
        rbxKeyboard.setVisibility(0);
    }

    /* JADX INFO: renamed from: l */
    public final void m46694l(NativeTextBoxInfo nativeTextBoxInfo, RbxKeyboard rbxKeyboard) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rbxKeyboard.getLayoutParams();
        float fM47768g = m47768g();
        float f10 = (nativeTextBoxInfo != null ? nativeTextBoxInfo.f12594x : 0.0f) * fM47768g;
        float f11 = (nativeTextBoxInfo != null ? nativeTextBoxInfo.f12595y : 0.0f) * fM47768g;
        float f12 = (nativeTextBoxInfo != null ? nativeTextBoxInfo.width : 0.0f) * fM47768g;
        float f13 = nativeTextBoxInfo != null ? nativeTextBoxInfo.height : 0.0f;
        layoutParams.topMargin = (int) f11;
        layoutParams.width = (int) f12;
        layoutParams.height = (int) (f13 * fM47768g);
        layoutParams.leftMargin = (int) f10;
        rbxKeyboard.setLayoutParams(layoutParams);
        if (nativeTextBoxInfo != null) {
            rbxKeyboard.setPadding((int) (nativeTextBoxInfo.paddingLeft * fM47768g), (int) (nativeTextBoxInfo.paddingTop * fM47768g), (int) (nativeTextBoxInfo.paddingRight * fM47768g), (int) (fM47768g * nativeTextBoxInfo.paddingBottom));
        } else {
            rbxKeyboard.setPadding(0, 0, 0, 0);
        }
    }
}
