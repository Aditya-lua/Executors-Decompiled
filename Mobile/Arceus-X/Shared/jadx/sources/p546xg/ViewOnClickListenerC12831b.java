package p546xg;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.roblox.client.components.RbxTextView;
import p093e4.DialogInterfaceOnCancelListenerC4819k;
import p151gk.C6124q;
import p196ih.C6811a;
import sg.C11335m0;
import sg.C11347q0;
import th.C11659h;

/* JADX INFO: renamed from: xg.b */
/* JADX INFO: loaded from: classes2.dex */
public class ViewOnClickListenerC12831b extends DialogInterfaceOnCancelListenerC4819k implements View.OnClickListener, DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: v0 */
    public a f45628v0;

    /* JADX INFO: renamed from: w0 */
    public C6811a f45629w0;

    /* JADX INFO: renamed from: xg.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo47751a(Activity activity);

        /* JADX INFO: renamed from: b */
        void mo47752b(Context context);

        /* JADX INFO: renamed from: c */
        void mo47753c(Activity activity);

        /* JADX INFO: renamed from: d */
        void mo47754d(boolean z10);
    }

    @Override // p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: F0 */
    public void mo4599F0(Bundle bundle) {
        super.mo4599F0(bundle);
        m4644V1(true);
        m23337r2(1, m23330j2());
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: J0 */
    public View mo1225J0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f45629w0 = C6811a.m29172c(layoutInflater, viewGroup, false);
        m47762u2();
        return this.f45629w0.getRoot();
    }

    @Override // p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: M0 */
    public void mo4618M0() {
        Dialog dialogM23328h2 = m23328h2();
        if (dialogM23328h2 != null && m4642V()) {
            dialogM23328h2.setDismissMessage(null);
        }
        super.mo4618M0();
        this.f45629w0 = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: a1 */
    public void mo4658a1() {
        m47764w2();
        super.mo4658a1();
    }

    @Override // p093e4.DialogInterfaceOnCancelListenerC4819k, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        a aVar = this.f45628v0;
        if (aVar != null) {
            aVar.mo47753c(m4693p());
        } else {
            C6124q.m27060e("RateMeMaybeFragment", "onCancel - mInterface is null");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f45628v0 == null) {
            C6124q.m27060e("RateMeMaybeFragment", "onClick - mInterface is null");
            return;
        }
        if (view.getId() == C11335m0.f39819m) {
            this.f45628v0.mo47753c(m4693p());
        } else if (view.getId() == C11335m0.f39823o) {
            this.f45628v0.mo47751a(m4693p());
        } else if (view.getId() == C11335m0.f39825p) {
            this.f45628v0.mo47752b(mo4715x());
        } else if (view.getId() == C11335m0.f39827q) {
            this.f45628v0.mo47754d(false);
        }
        m47763v2();
    }

    /* JADX INFO: renamed from: u2 */
    public final void m47762u2() {
        if (C11659h.m43403a().mo43554V4()) {
            this.f45629w0.f26755d.setTypeface(Typeface.DEFAULT);
            this.f45629w0.f26755d.setText(C11347q0.f39953a);
            this.f45629w0.f26758g.setVisibility(8);
            if (C11659h.m43403a().mo43714r5()) {
                RbxTextView rbxTextView = this.f45629w0.f26755d;
                rbxTextView.setPadding(rbxTextView.getPaddingLeft(), this.f45629w0.f26755d.getPaddingTop(), this.f45629w0.f26755d.getPaddingRight(), 16);
                this.f45629w0.f26759h.setVisibility(8);
                this.f45629w0.f26753b.setVisibility(8);
            }
            this.f45629w0.f26757f.setTextSize(2, 16.0f);
            this.f45629w0.f26756e.setText(C11347q0.f39956b);
        }
        this.f45629w0.f26757f.setOnClickListener(this);
        this.f45629w0.f26756e.setOnClickListener(this);
        this.f45629w0.f26758g.setOnClickListener(this);
        this.f45629w0.f26754c.setOnClickListener(this);
    }

    /* JADX INFO: renamed from: v2 */
    public final void m47763v2() {
        mo12190e2();
    }

    /* JADX INFO: renamed from: w2 */
    public final void m47764w2() {
        Window window = m23328h2().getWindow();
        Point point = new Point();
        if (window != null) {
            window.getWindowManager().getDefaultDisplay().getSize(point);
            window.setLayout(Math.min(Math.min(point.x, point.y), 950), -2);
            window.setGravity(17);
        }
    }

    /* JADX INFO: renamed from: x2 */
    public void m47765x2(a aVar) {
        this.f45628v0 = aVar;
    }
}
