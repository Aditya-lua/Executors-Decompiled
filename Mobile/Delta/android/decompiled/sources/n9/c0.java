package n9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l9.n f26056a;

    public c0(l9.n nVar) {
        this.f26056a = nVar;
    }

    @Override // n9.c.b
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.f26056a.onConnectionFailed(connectionResult);
    }
}
