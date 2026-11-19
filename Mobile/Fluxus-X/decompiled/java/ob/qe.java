package ob;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class qe implements ef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ve f27749a;

    public qe(ve veVar) {
        Objects.requireNonNull(veVar);
        this.f27749a = veVar;
    }

    @Override // ob.ef
    public final void a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f27749a.b().t(new pe(this, str, str2, bundle));
            return;
        }
        ve veVar = this.f27749a;
        if (veVar.x0() != null) {
            veVar.x0().a().o().b("AppId not known when logging event", str2);
        }
    }
}
