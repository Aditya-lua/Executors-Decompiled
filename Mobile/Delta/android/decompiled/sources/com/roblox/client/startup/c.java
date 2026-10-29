package com.roblox.client.startup;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import e4.k;
import gk.p;
import sg.q0;

/* JADX INFO: loaded from: classes2.dex */
public class c extends k {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public b f9493v0;

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            p.h("FragmentRetry", "... Dialog::onClick:");
            if (c.this.f9493v0 != null) {
                c.this.f9493v0.N();
            }
        }
    }

    public interface b {
        void N();

        void i();
    }

    public static void v2(@NonNull j.b bVar) {
        c cVarW2 = w2(bVar);
        if (cVarW2 != null) {
            p.h("FragmentRetry", "Dismiss the existing Retry UI...");
            cVarW2.f2();
        }
    }

    public static c w2(@NonNull j.b bVar) {
        androidx.fragment.app.c cVarN0 = bVar.l1().n0("FragmentRetry");
        if (cVarN0 instanceof c) {
            return (c) cVarN0;
        }
        return null;
    }

    public static void y2(@NonNull j.b bVar, int i10) {
        p.h("FragmentRetry", "showRetryFragment: ");
        FlagCacheUtils.recordRetryDialogShown();
        c cVarW2 = w2(bVar);
        if (cVarW2 != null) {
            p.h("FragmentRetry", "showRetryFragment: Found an existing Retry fragment.");
            cVarW2.x2(bVar.getString(i10));
            return;
        }
        p.h("FragmentRetry", "showRetryFragment: Create a new FragmentRetry...");
        c cVar = new c();
        Bundle bundle = new Bundle();
        bundle.putInt("message", i10);
        cVar.O1(bundle);
        cVar.t2(bVar.l1(), "FragmentRetry");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e4.k, androidx.fragment.app.c
    public void C0(Context context) {
        super.C0(context);
        if (context instanceof b) {
            this.f9493v0 = (b) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener.");
    }

    @Override // e4.k, androidx.fragment.app.c
    public void N0() {
        super.N0();
        this.f9493v0 = null;
    }

    @Override // e4.k
    @NonNull
    public Dialog k2(Bundle bundle) {
        p.h("FragmentRetry", "onCreateDialog:");
        androidx.appcompat.app.a.C0013a c0013aM = new androidx.appcompat.app.a.C0013a(p()).p(q0.B).g(t().getInt("message")).m(q0.f30969t, new a());
        c0013aM.d(true);
        return c0013aM.a();
    }

    @Override // e4.k, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        p.h("FragmentRetry", "onCancel:");
        b bVar = this.f9493v0;
        if (bVar != null) {
            bVar.i();
        }
    }

    @Override // e4.k, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        p.h("FragmentRetry", "onDismiss: Do nothing.");
    }

    public void x2(CharSequence charSequence) {
        Dialog dialogH2 = h2();
        if (dialogH2 instanceof androidx.appcompat.app.a) {
            ((androidx.appcompat.app.a) dialogH2).u(charSequence);
        }
    }
}
