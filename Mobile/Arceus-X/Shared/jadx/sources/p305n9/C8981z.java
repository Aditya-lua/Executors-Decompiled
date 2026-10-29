package p305n9;

import android.content.Intent;
import p268l9.InterfaceC8045j;

/* JADX INFO: renamed from: n9.z */
/* JADX INFO: loaded from: classes.dex */
public final class C8981z extends AbstractDialogInterfaceOnClickListenerC8918a0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Intent f32654a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC8045j f32655b;

    public C8981z(Intent intent, InterfaceC8045j interfaceC8045j, int i10) {
        this.f32654a = intent;
        this.f32655b = interfaceC8045j;
    }

    @Override // p305n9.AbstractDialogInterfaceOnClickListenerC8918a0
    /* JADX INFO: renamed from: a */
    public final void mo35954a() {
        Intent intent = this.f32654a;
        if (intent != null) {
            this.f32655b.startActivityForResult(intent, 2);
        }
    }
}
