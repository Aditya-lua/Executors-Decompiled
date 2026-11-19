package ob;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class pe implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f27720a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f27721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe f27722d;

    public pe(qe qeVar, String str, String str2, Bundle bundle) {
        this.f27720a = str;
        this.b = str2;
        this.f27721c = bundle;
        Objects.requireNonNull(qeVar);
        this.f27722d = qeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ve veVar = this.f27722d.f27749a;
        ff ffVarN0 = veVar.N0();
        long jA = veVar.e().a();
        String str = this.f27720a;
        veVar.i((i0) o9.s.l(ffVarN0.R(str, this.b, this.f27721c, "auto", jA, false, true)), str);
    }
}
