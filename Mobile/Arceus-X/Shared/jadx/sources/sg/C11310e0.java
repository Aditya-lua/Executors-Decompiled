package sg;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.roblox.client.C3161c;
import org.greenrobot.eventbus.ThreadMode;
import p138fv.C5840c;
import p138fv.InterfaceC5847j;
import ph.C10257f;
import ph.C10258g;
import vg.C12173c0;

/* JADX INFO: renamed from: sg.e0 */
/* JADX INFO: loaded from: classes2.dex */
public class C11310e0 extends C3161c {
    @Override // com.roblox.client.C3161c
    /* JADX INFO: renamed from: I3 */
    public C12173c0.b mo15001I3() {
        return C12173c0.b.NOTIFICATION_STREAM_WEB_FRAGMENT;
    }

    @Override // com.roblox.client.C3161c, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: J0 */
    public View mo1225J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C11338n0.f39871r, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) viewGroup2.findViewById(C11335m0.f39773E);
        frameLayout.addView(super.mo1225J0(layoutInflater, frameLayout, bundle));
        return viewGroup2;
    }

    @Override // com.roblox.client.C3161c, sg.C11368x0, p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: c1 */
    public void mo4663c1() {
        super.mo4663c1();
        C5840c.m26204d().m26215n(this);
        Dialog dialogM23328h2 = m23328h2();
        if (dialogM23328h2 != null) {
            Window window = dialogM23328h2.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = 0.0f;
            attributes.flags |= 2;
            window.setAttributes(attributes);
        }
    }

    @Override // com.roblox.client.C3161c, sg.C11368x0, p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: d1 */
    public void mo4665d1() {
        C5840c.m26204d().m26217p(this);
        super.mo4665d1();
    }

    @InterfaceC5847j(threadMode = ThreadMode.MAIN)
    public void onNavigateToConversationEvent(C10257f c10257f) {
        if (m23329i2()) {
            m23328h2().dismiss();
        }
    }

    @InterfaceC5847j(threadMode = ThreadMode.MAIN)
    public void onNavigateToFeatureEvent(C10258g c10258g) {
        if (m23329i2()) {
            m23328h2().dismiss();
        }
    }
}
