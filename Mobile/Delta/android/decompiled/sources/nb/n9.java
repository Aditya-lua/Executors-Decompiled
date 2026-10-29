package nb;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzpl;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class n9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f25795a;
    public final /* synthetic */ qa b;

    public n9(qa qaVar, Bundle bundle) {
        this.f25795a = bundle;
        Objects.requireNonNull(qaVar);
        this.b = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qa qaVar = this.b;
        qaVar.h();
        qaVar.j();
        Bundle bundle = this.f25795a;
        n9.m.l(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        n9.m.f(string);
        n9.m.f(string2);
        n9.m.l(bundle.get("value"));
        if (!qaVar.f25625a.g()) {
            qaVar.f25625a.a().w().a("Conditional property not set since app measurement is disabled");
            return;
        }
        zzpl zzplVar = new zzpl(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            g7 g7Var = qaVar.f25625a;
            zzbg zzbgVarR = g7Var.C().R(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            qaVar.f25625a.J().d0(new zzah(bundle.getString("app_id"), string2, zzplVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), g7Var.C().R(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), zzbgVarR, bundle.getLong("time_to_live"), g7Var.C().R(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
