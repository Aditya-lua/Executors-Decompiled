package p305n9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import p268l9.InterfaceC8057n;

/* JADX INFO: renamed from: n9.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8924c0 implements AbstractC8923c.b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC8057n f32557a;

    public C8924c0(InterfaceC8057n interfaceC8057n) {
        this.f32557a = interfaceC8057n;
    }

    @Override // p305n9.AbstractC8923c.b
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.f32557a.onConnectionFailed(connectionResult);
    }
}
