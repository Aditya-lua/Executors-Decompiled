package ob;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class s9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f27796a;
    public final /* synthetic */ va b;

    public s9(va vaVar, Bundle bundle) {
        this.f27796a = bundle;
        Objects.requireNonNull(vaVar);
        this.b = vaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        va vaVar = this.b;
        vaVar.h();
        vaVar.j();
        Bundle bundle = this.f27796a;
        o9.s.l(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        o9.s.f(string);
        o9.s.f(string2);
        o9.s.l(bundle.get("value"));
        if (!vaVar.f27641a.g()) {
            vaVar.f27641a.a().w().a("Conditional property not set since app measurement is disabled");
            return;
        }
        bf bfVar = new bf(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            l7 l7Var = vaVar.f27641a;
            i0 i0VarR = l7Var.C().R(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            vaVar.f27641a.J().d0(new i(bundle.getString("app_id"), string2, bfVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), l7Var.C().R(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), i0VarR, bundle.getLong("time_to_live"), l7Var.C().R(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
