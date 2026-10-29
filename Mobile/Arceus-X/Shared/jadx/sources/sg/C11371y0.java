package sg;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.roblox.client.C3161c;
import nl.C9492a;
import p093e4.ActivityC4831q;
import p151gk.C6124q;
import th.C11659h;
import vg.C12173c0;

/* JADX INFO: renamed from: sg.y0 */
/* JADX INFO: loaded from: classes2.dex */
public class C11371y0 extends C3161c {

    /* JADX INFO: renamed from: g1 */
    public View f40198g1;

    /* JADX INFO: renamed from: sg.y0$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ActivityC4831q activityC4831qM4693p = C11371y0.this.m4693p();
            if (activityC4831qM4693p != null) {
                activityC4831qM4693p.m23360l1().m4416a1();
            }
        }
    }

    @Override // p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: C0 */
    public void mo4590C0(Context context) {
        super.mo4590C0(context);
        C6124q.m27057b("RobloxModalWebFragment", "onAttach.");
    }

    @Override // com.roblox.client.C3161c
    /* JADX INFO: renamed from: D3 */
    public void mo14996D3(boolean z10) {
        super.mo14996D3(z10);
        View view = this.f40198g1;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // com.roblox.client.C3161c, sg.C11368x0, p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: F0 */
    public void mo4599F0(Bundle bundle) {
        super.mo4599F0(bundle);
    }

    @Override // com.roblox.client.C3161c
    /* JADX INFO: renamed from: H3 */
    public void mo15000H3(C9492a c9492a) {
        super.mo15000H3(c9492a);
        C6124q.m27057b("RobloxModalWebFragment", "updateWebView.");
    }

    @Override // com.roblox.client.C3161c
    /* JADX INFO: renamed from: I3 */
    public C12173c0.b mo15001I3() {
        return C12173c0.b.ROBLOX_MODAL_WEB_FRAGMENT;
    }

    @Override // com.roblox.client.C3161c, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: J0 */
    public View mo1225J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewMo1225J0 = super.mo1225J0(layoutInflater, viewGroup, bundle);
        C6124q.m27057b("RobloxModalWebFragment", "onCreate.");
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(2);
        layoutTransition.enableTransitionType(3);
        this.f40198g1 = viewMo1225J0;
        ((LinearLayout) viewMo1225J0).setLayoutTransition(layoutTransition);
        LinearLayout linearLayout = (LinearLayout) viewMo1225J0.findViewById(C11335m0.f39836u0);
        linearLayout.setVisibility(0);
        linearLayout.findViewById(C11335m0.f39834t0).setOnClickListener(new a());
        float f10 = m4637T().getDisplayMetrics().widthPixels;
        float f11 = m4637T().getDisplayMetrics().heightPixels;
        C6124q.m27057b("RobloxModalWebFragment", "widthInPixels: " + f10 + ". heightInPixels: " + f11 + ".");
        int iMo43510P1 = C11659h.m43403a().mo43510P1() + linearLayout.getHeight();
        int iMo43414B2 = C11659h.m43403a().mo43414B2();
        int iApplyDimension = (int) TypedValue.applyDimension(1, (float) iMo43510P1, m4637T().getDisplayMetrics());
        int iApplyDimension2 = (int) TypedValue.applyDimension(1, (float) iMo43414B2, m4637T().getDisplayMetrics());
        C6124q.m27057b("RobloxModalWebFragment", "minWidthInDip: " + iApplyDimension2 + ". minHeightInDip: " + iApplyDimension + ".");
        Point pointM42599J3 = m42599J3(f10, f11, iApplyDimension2, iApplyDimension, iMo43414B2, iMo43510P1);
        if (pointM42599J3 != null) {
            C6124q.m27057b("RobloxModalWebFragment", "width: " + pointM42599J3.x + ". height: " + pointM42599J3.y + ".");
            viewMo1225J0.setLayoutParams(new FrameLayout.LayoutParams(pointM42599J3.x, pointM42599J3.y, 17));
        }
        mo14996D3(this.f11700X0);
        return viewMo1225J0;
    }

    /* JADX INFO: renamed from: J3 */
    public final Point m42599J3(float f10, float f11, int i10, int i11, int i12, int i13) {
        if (f10 < i12 || f11 < i13) {
            return null;
        }
        int i14 = (int) (0.9f * f10);
        if (i14 > i12) {
            i12 = i14;
        }
        int i15 = (int) (0.8f * f11);
        if (i15 > i13) {
            i13 = i15;
        }
        if (i11 > f11) {
            i11 = i13;
        }
        if (i10 > f10) {
            i10 = i12;
        }
        return new Point(i10, i11);
    }

    @Override // p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: N0 */
    public void mo4621N0() {
        super.mo4621N0();
        C6124q.m27057b("RobloxModalWebFragment", "onDetach.");
    }

    @Override // com.roblox.client.C3161c, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: V0 */
    public void mo4643V0() {
        super.mo4643V0();
        C6124q.m27057b("RobloxModalWebFragment", "onPause.");
    }

    @Override // com.roblox.client.C3161c, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: a1 */
    public void mo4658a1() {
        super.mo4658a1();
        C6124q.m27057b("RobloxModalWebFragment", "onResume.");
    }

    @Override // com.roblox.client.C3161c, sg.C11368x0, p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: c1 */
    public void mo4663c1() {
        super.mo4663c1();
    }

    @Override // sg.C11368x0, p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: z0 */
    public void mo4722z0(Bundle bundle) {
        super.mo4722z0(bundle);
        C6124q.m27057b("RobloxModalWebFragment", "onActivityCreated.");
    }
}
