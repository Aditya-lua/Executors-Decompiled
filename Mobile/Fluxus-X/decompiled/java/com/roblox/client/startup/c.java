package com.roblox.client.startup;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import bh.q0;
import f4.o;
import ok.q;

/* JADX INFO: loaded from: classes2.dex */
public class c extends o {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public b f9392v0;

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            q.h("FragmentRetry", "... Dialog::onClick:");
            if (c.this.f9392v0 != null) {
                c.this.f9392v0.M();
            }
        }
    }

    public interface b {
        void M();

        void i();
    }

    public static void v2(@NonNull j.b bVar) {
        c cVarW2 = w2(bVar);
        if (cVarW2 != null) {
            q.h("FragmentRetry", "Dismiss the existing Retry UI...");
            cVarW2.f2();
        }
    }

    public static c w2(@NonNull j.b bVar) {
        f4.q qVarN0 = bVar.l1().n0("FragmentRetry");
        if (qVarN0 instanceof c) {
            return (c) qVarN0;
        }
        return null;
    }

    public static void y2(@NonNull j.b bVar, int i10) {
        q.h("FragmentRetry", "showRetryFragment: ");
        FlagCacheUtils.recordRetryDialogShown();
        c cVarW2 = w2(bVar);
        if (cVarW2 != null) {
            q.h("FragmentRetry", "showRetryFragment: Found an existing Retry fragment.");
            cVarW2.x2(bVar.getString(i10));
            return;
        }
        q.h("FragmentRetry", "showRetryFragment: Create a new FragmentRetry...");
        c cVar = new c();
        Bundle bundle = new Bundle();
        bundle.putInt("message", i10);
        cVar.O1(bundle);
        cVar.t2(bVar.l1(), "FragmentRetry");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f4.o, f4.q
    public void C0(Context context) {
        super.C0(context);
        if (context instanceof b) {
            this.f9392v0 = (b) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener.");
    }

    @Override // f4.o, f4.q
    public void N0() {
        super.N0();
        this.f9392v0 = null;
    }

    @Override // f4.o
    @NonNull
    public Dialog k2(Bundle bundle) {
        q.h("FragmentRetry", "onCreateDialog:");
        androidx.appcompat.app.a.C0021a c0021aM = new androidx.appcompat.app.a.C0021a(p()).p(q0.B).g(t().getInt("message")).m(q0.f4276t, new a());
        c0021aM.d(true);
        return c0021aM.a();
    }

    @Override // f4.o, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        q.h("FragmentRetry", "onCancel:");
        b bVar = this.f9392v0;
        if (bVar != null) {
            bVar.i();
        }
    }

    @Override // f4.o, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        q.h("FragmentRetry", "onDismiss: Do nothing.");
    }

    public void x2(CharSequence charSequence) {
        Dialog dialogH2 = h2();
        if (dialogH2 instanceof androidx.appcompat.app.a) {
            ((androidx.appcompat.app.a) dialogH2).u(charSequence);
        }
    }
}
