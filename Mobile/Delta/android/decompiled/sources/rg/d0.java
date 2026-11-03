package rg;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes2.dex */
public class d0 extends x0 {
    public d H0;

    public class a implements DialogInterface.OnCancelListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            t0.d("logout", "no");
            dialogInterface.dismiss();
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            t0.d("logout", "no");
            dialogInterface.dismiss();
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            t0.d("logout", "yes");
            dialogInterface.dismiss();
            d0.this.H0.a();
        }
    }

    public interface d {
        void a();
    }

    public void B2(d dVar) {
        this.H0 = dVar;
    }

    @Override // rg.x0, e4.k, androidx.fragment.app.c
    public void c1() {
        super.c1();
        dv.c.d().n(this);
    }

    @Override // rg.x0, e4.k, androidx.fragment.app.c
    public void d1() {
        dv.c.d().p(this);
        super.d1();
    }

    @Override // e4.k
    @NonNull
    public Dialog k2(Bundle bundle) {
        return new AlertDialog.Builder(p()).setMessage(q0.f30535g).setPositiveButton(q0.f30532f, new c()).setNegativeButton(q0.f30568r, new b()).setOnCancelListener(new a()).create();
    }

    @dv.j(threadMode = ThreadMode.MAIN)
    public void onNavigatToFeatureEvent(oh.g gVar) {
        if (i2()) {
            h2().dismiss();
        }
    }
}
