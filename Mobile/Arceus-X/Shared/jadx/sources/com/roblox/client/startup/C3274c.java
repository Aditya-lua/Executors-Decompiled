package com.roblox.client.startup;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.DialogInterfaceC0408a;
import androidx.fragment.app.ComponentCallbacksC0929c;
import p093e4.DialogInterfaceOnCancelListenerC4819k;
import p151gk.C6124q;
import p203j.ActivityC6992b;
import sg.C11347q0;

/* JADX INFO: renamed from: com.roblox.client.startup.c */
/* JADX INFO: loaded from: classes2.dex */
public class C3274c extends DialogInterfaceOnCancelListenerC4819k {

    /* JADX INFO: renamed from: v0 */
    public b f12370v0;

    /* JADX INFO: renamed from: com.roblox.client.startup.c$a */
    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C6124q.m27063h("FragmentRetry", "... Dialog::onClick:");
            if (C3274c.this.f12370v0 != null) {
                C3274c.this.f12370v0.mo14752N();
            }
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.startup.c$b */
    public interface b {
        /* JADX INFO: renamed from: N */
        void mo14752N();

        /* JADX INFO: renamed from: i */
        void mo14777i();
    }

    /* JADX INFO: renamed from: v2 */
    public static void m15742v2(@NonNull ActivityC6992b activityC6992b) {
        C3274c c3274cM15743w2 = m15743w2(activityC6992b);
        if (c3274cM15743w2 != null) {
            C6124q.m27063h("FragmentRetry", "Dismiss the existing Retry UI...");
            c3274cM15743w2.m23326f2();
        }
    }

    /* JADX INFO: renamed from: w2 */
    public static C3274c m15743w2(@NonNull ActivityC6992b activityC6992b) {
        ComponentCallbacksC0929c componentCallbacksC0929cM4444n0 = activityC6992b.m23360l1().m4444n0("FragmentRetry");
        if (componentCallbacksC0929cM4444n0 instanceof C3274c) {
            return (C3274c) componentCallbacksC0929cM4444n0;
        }
        return null;
    }

    /* JADX INFO: renamed from: y2 */
    public static void m15744y2(@NonNull ActivityC6992b activityC6992b, int i10) {
        C6124q.m27063h("FragmentRetry", "showRetryFragment: ");
        FlagCacheUtils.recordRetryDialogShown();
        C3274c c3274cM15743w2 = m15743w2(activityC6992b);
        if (c3274cM15743w2 != null) {
            C6124q.m27063h("FragmentRetry", "showRetryFragment: Found an existing Retry fragment.");
            c3274cM15743w2.m15745x2(activityC6992b.getString(i10));
            return;
        }
        C6124q.m27063h("FragmentRetry", "showRetryFragment: Create a new FragmentRetry...");
        C3274c c3274c = new C3274c();
        Bundle bundle = new Bundle();
        bundle.putInt("message", i10);
        c3274c.m4625O1(bundle);
        c3274c.mo23339t2(activityC6992b.m23360l1(), "FragmentRetry");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: C0 */
    public void mo4590C0(Context context) {
        super.mo4590C0(context);
        if (context instanceof b) {
            this.f12370v0 = (b) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener.");
    }

    @Override // p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: N0 */
    public void mo4621N0() {
        super.mo4621N0();
        this.f12370v0 = null;
    }

    @Override // p093e4.DialogInterfaceOnCancelListenerC4819k
    @NonNull
    /* JADX INFO: renamed from: k2 */
    public Dialog mo6459k2(Bundle bundle) {
        C6124q.m27063h("FragmentRetry", "onCreateDialog:");
        DialogInterfaceC0408a.a aVarM1529m = new DialogInterfaceC0408a.a(m4693p()).m1532p(C11347q0.f39899B).m1523g(m4704t().getInt("message")).m1529m(C11347q0.f40010t, new a());
        aVarM1529m.m1520d(true);
        return aVarM1529m.m1517a();
    }

    @Override // p093e4.DialogInterfaceOnCancelListenerC4819k, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        C6124q.m27063h("FragmentRetry", "onCancel:");
        b bVar = this.f12370v0;
        if (bVar != null) {
            bVar.mo14777i();
        }
    }

    @Override // p093e4.DialogInterfaceOnCancelListenerC4819k, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C6124q.m27063h("FragmentRetry", "onDismiss: Do nothing.");
    }

    /* JADX INFO: renamed from: x2 */
    public void m15745x2(CharSequence charSequence) {
        Dialog dialogM23328h2 = m23328h2();
        if (dialogM23328h2 instanceof DialogInterfaceC0408a) {
            ((DialogInterfaceC0408a) dialogM23328h2).m1514u(charSequence);
        }
    }
}
