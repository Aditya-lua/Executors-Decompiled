package bh;

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

/* JADX INFO: loaded from: classes2.dex */
public class y0 extends com.roblox.client.c {

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public View f4390g1;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f4.v vVarP = y0.this.p();
            if (vVarP != null) {
                vVarP.l1().a1();
            }
        }
    }

    @Override // f4.o, f4.q
    public void C0(Context context) {
        super.C0(context);
        ok.q.b("RobloxModalWebFragment", "onAttach.");
    }

    @Override // com.roblox.client.c
    public void D3(boolean z10) {
        super.D3(z10);
        View view = this.f4390g1;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // com.roblox.client.c, bh.x0, f4.o, f4.q
    public void F0(Bundle bundle) {
        super.F0(bundle);
    }

    @Override // com.roblox.client.c
    public void H3(bm.a aVar) {
        super.H3(aVar);
        ok.q.b("RobloxModalWebFragment", "updateWebView.");
    }

    @Override // com.roblox.client.c
    public eh.v0.b I3() {
        return eh.v0.b.ROBLOX_MODAL_WEB_FRAGMENT;
    }

    @Override // com.roblox.client.c, f4.q
    public View J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewJ0 = super.J0(layoutInflater, viewGroup, bundle);
        ok.q.b("RobloxModalWebFragment", "onCreate.");
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(2);
        layoutTransition.enableTransitionType(3);
        this.f4390g1 = viewJ0;
        ((LinearLayout) viewJ0).setLayoutTransition(layoutTransition);
        LinearLayout linearLayout = (LinearLayout) viewJ0.findViewById(m0.f4173w0);
        linearLayout.setVisibility(0);
        linearLayout.findViewById(m0.f4171v0).setOnClickListener(new a());
        float f10 = S().getDisplayMetrics().widthPixels;
        float f11 = S().getDisplayMetrics().heightPixels;
        ok.q.b("RobloxModalWebFragment", "widthInPixels: " + f10 + ". heightInPixels: " + f11 + ".");
        int iT1 = bi.h.a().T1() + linearLayout.getHeight();
        int iJ2 = bi.h.a().J2();
        int iApplyDimension = (int) TypedValue.applyDimension(1, (float) iT1, S().getDisplayMetrics());
        int iApplyDimension2 = (int) TypedValue.applyDimension(1, (float) iJ2, S().getDisplayMetrics());
        ok.q.b("RobloxModalWebFragment", "minWidthInDip: " + iApplyDimension2 + ". minHeightInDip: " + iApplyDimension + ".");
        Point pointJ3 = J3(f10, f11, iApplyDimension2, iApplyDimension, iJ2, iT1);
        if (pointJ3 != null) {
            ok.q.b("RobloxModalWebFragment", "width: " + pointJ3.x + ". height: " + pointJ3.y + ".");
            viewJ0.setLayoutParams(new FrameLayout.LayoutParams(pointJ3.x, pointJ3.y, 17));
        }
        D3(this.X0);
        return viewJ0;
    }

    public final Point J3(float f10, float f11, int i10, int i11, int i12, int i13) {
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

    @Override // f4.o, f4.q
    public void N0() {
        super.N0();
        ok.q.b("RobloxModalWebFragment", "onDetach.");
    }

    @Override // com.roblox.client.c, f4.q
    public void V0() {
        super.V0();
        ok.q.b("RobloxModalWebFragment", "onPause.");
    }

    @Override // com.roblox.client.c, f4.q
    public void a1() {
        super.a1();
        ok.q.b("RobloxModalWebFragment", "onResume.");
    }

    @Override // com.roblox.client.c, bh.x0, f4.o, f4.q
    public void c1() {
        super.c1();
    }

    @Override // bh.x0, f4.o, f4.q
    public void z0(Bundle bundle) {
        super.z0(bundle);
        ok.q.b("RobloxModalWebFragment", "onActivityCreated.");
    }
}
