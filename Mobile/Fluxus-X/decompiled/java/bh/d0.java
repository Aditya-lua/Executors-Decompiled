package bh;

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

    @Override // bh.x0, f4.o, f4.q
    public void c1() {
        super.c1();
        mw.c.d().n(this);
    }

    @Override // bh.x0, f4.o, f4.q
    public void d1() {
        mw.c.d().p(this);
        super.d1();
    }

    @Override // f4.o
    @NonNull
    public Dialog k2(Bundle bundle) {
        return new AlertDialog.Builder(p()).setMessage(q0.f4237g).setPositiveButton(q0.f4234f, new c()).setNegativeButton(q0.f4270r, new b()).setOnCancelListener(new a()).create();
    }

    @mw.j(threadMode = ThreadMode.MAIN)
    public void onNavigatToFeatureEvent(yh.g gVar) {
        if (i2()) {
            h2().dismiss();
        }
    }
}
