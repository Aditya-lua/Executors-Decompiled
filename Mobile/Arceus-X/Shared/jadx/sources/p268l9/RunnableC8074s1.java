package p268l9;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import p305n9.C8953m;

/* JADX INFO: renamed from: l9.s1 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8074s1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final C8068q1 f30089a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractDialogInterfaceOnCancelListenerC8077t1 f30090b;

    public RunnableC8074s1(AbstractDialogInterfaceOnCancelListenerC8077t1 abstractDialogInterfaceOnCancelListenerC8077t1, C8068q1 c8068q1) {
        this.f30090b = abstractDialogInterfaceOnCancelListenerC8077t1;
        this.f30089a = c8068q1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f30090b.f30096b) {
            ConnectionResult connectionResultM33271b = this.f30089a.m33271b();
            if (connectionResultM33271b.m9143z3()) {
                AbstractDialogInterfaceOnCancelListenerC8077t1 abstractDialogInterfaceOnCancelListenerC8077t1 = this.f30090b;
                abstractDialogInterfaceOnCancelListenerC8077t1.f30023a.startActivityForResult(GoogleApiActivity.m9160a(abstractDialogInterfaceOnCancelListenerC8077t1.m33178b(), (PendingIntent) C8953m.m36047l(connectionResultM33271b.m9142y3()), this.f30089a.m33270a(), false), 1);
                return;
            }
            AbstractDialogInterfaceOnCancelListenerC8077t1 abstractDialogInterfaceOnCancelListenerC8077t2 = this.f30090b;
            if (abstractDialogInterfaceOnCancelListenerC8077t2.f30099e.mo29851b(abstractDialogInterfaceOnCancelListenerC8077t2.m33178b(), connectionResultM33271b.m9140w3(), null) != null) {
                AbstractDialogInterfaceOnCancelListenerC8077t1 abstractDialogInterfaceOnCancelListenerC8077t3 = this.f30090b;
                abstractDialogInterfaceOnCancelListenerC8077t3.f30099e.m29868x(abstractDialogInterfaceOnCancelListenerC8077t3.m33178b(), abstractDialogInterfaceOnCancelListenerC8077t3.f30023a, connectionResultM33271b.m9140w3(), 2, this.f30090b);
                return;
            }
            if (connectionResultM33271b.m9140w3() != 18) {
                this.f30090b.m33277l(connectionResultM33271b, this.f30089a.m33270a());
                return;
            }
            AbstractDialogInterfaceOnCancelListenerC8077t1 abstractDialogInterfaceOnCancelListenerC8077t4 = this.f30090b;
            Dialog dialogM29863s = abstractDialogInterfaceOnCancelListenerC8077t4.f30099e.m29863s(abstractDialogInterfaceOnCancelListenerC8077t4.m33178b(), abstractDialogInterfaceOnCancelListenerC8077t4);
            AbstractDialogInterfaceOnCancelListenerC8077t1 abstractDialogInterfaceOnCancelListenerC8077t5 = this.f30090b;
            abstractDialogInterfaceOnCancelListenerC8077t5.f30099e.m29864t(abstractDialogInterfaceOnCancelListenerC8077t5.m33178b().getApplicationContext(), new C8071r1(this, dialogM29863s));
        }
    }
}
