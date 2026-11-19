package bh;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes2.dex */
public class e0 extends com.roblox.client.c {
    @Override // com.roblox.client.c
    public eh.v0.b I3() {
        return eh.v0.b.NOTIFICATION_STREAM_WEB_FRAGMENT;
    }

    @Override // com.roblox.client.c, f4.q
    public View J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(n0.f4199r, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) viewGroup2.findViewById(m0.E);
        frameLayout.addView(super.J0(layoutInflater, frameLayout, bundle));
        return viewGroup2;
    }

    @Override // com.roblox.client.c, bh.x0, f4.o, f4.q
    public void c1() {
        super.c1();
        mw.c.d().n(this);
        Dialog dialogH2 = h2();
        if (dialogH2 != null) {
            Window window = dialogH2.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = 0.0f;
            attributes.flags |= 2;
            window.setAttributes(attributes);
        }
    }

    @Override // com.roblox.client.c, bh.x0, f4.o, f4.q
    public void d1() {
        mw.c.d().p(this);
        super.d1();
    }

    @mw.j(threadMode = ThreadMode.MAIN)
    public void onNavigateToConversationEvent(yh.f fVar) {
        if (i2()) {
            h2().dismiss();
        }
    }

    @mw.j(threadMode = ThreadMode.MAIN)
    public void onNavigateToFeatureEvent(yh.g gVar) {
        if (i2()) {
            h2().dismiss();
        }
    }
}
