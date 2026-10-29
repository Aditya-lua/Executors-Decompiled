package p305n9;

import android.os.Bundle;
import p268l9.InterfaceC8030e;

/* JADX INFO: renamed from: n9.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8921b0 implements AbstractC8923c.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC8030e f32555a;

    public C8921b0(InterfaceC8030e interfaceC8030e) {
        this.f32555a = interfaceC8030e;
    }

    @Override // p305n9.AbstractC8923c.a
    public final void onConnected(Bundle bundle) {
        this.f32555a.onConnected(bundle);
    }

    @Override // p305n9.AbstractC8923c.a
    public final void onConnectionSuspended(int i10) {
        this.f32555a.onConnectionSuspended(i10);
    }
}
