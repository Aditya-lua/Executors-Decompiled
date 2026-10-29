package sg;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import org.greenrobot.eventbus.ThreadMode;
import p138fv.C5840c;
import p138fv.InterfaceC5847j;
import ph.C10258g;

/* JADX INFO: renamed from: sg.d0 */
/* JADX INFO: loaded from: classes2.dex */
public class C11306d0 extends C11368x0 {

    /* JADX INFO: renamed from: H0 */
    public d f39679H0;

    /* JADX INFO: renamed from: sg.d0$a */
    public class a implements DialogInterface.OnCancelListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            C11356t0.m42534d("logout", "no");
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: renamed from: sg.d0$b */
    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C11356t0.m42534d("logout", "no");
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: renamed from: sg.d0$c */
    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C11356t0.m42534d("logout", "yes");
            dialogInterface.dismiss();
            C11306d0.this.f39679H0.mo42496a();
        }
    }

    /* JADX INFO: renamed from: sg.d0$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo42496a();
    }

    /* JADX INFO: renamed from: B2 */
    public void m42495B2(d dVar) {
        this.f39679H0 = dVar;
    }

    @Override // sg.C11368x0, p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: c1 */
    public void mo4663c1() {
        super.mo4663c1();
        C5840c.m26204d().m26215n(this);
    }

    @Override // sg.C11368x0, p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: d1 */
    public void mo4665d1() {
        C5840c.m26204d().m26217p(this);
        super.mo4665d1();
    }

    @Override // p093e4.DialogInterfaceOnCancelListenerC4819k
    @NonNull
    /* JADX INFO: renamed from: k2 */
    public Dialog mo6459k2(Bundle bundle) {
        return new AlertDialog.Builder(m4693p()).setMessage(C11347q0.f39971g).setPositiveButton(C11347q0.f39968f, new c()).setNegativeButton(C11347q0.f40004r, new b()).setOnCancelListener(new a()).create();
    }

    @InterfaceC5847j(threadMode = ThreadMode.MAIN)
    public void onNavigatToFeatureEvent(C10258g c10258g) {
        if (m23329i2()) {
            m23328h2().dismiss();
        }
    }
}
