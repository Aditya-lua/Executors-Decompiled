package p306nb;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzpl;
import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.n9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9208n9 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Bundle f33272a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9257qa f33273b;

    public RunnableC9208n9(C9257qa c9257qa, Bundle bundle) {
        this.f33272a = bundle;
        Objects.requireNonNull(c9257qa);
        this.f33273b = c9257qa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9257qa c9257qa = this.f33273b;
        c9257qa.mo36088h();
        c9257qa.m36121j();
        Bundle bundle = this.f33272a;
        C8953m.m36047l(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        C8953m.m36041f(string);
        C8953m.m36041f(string2);
        C8953m.m36047l(bundle.get("value"));
        if (!c9257qa.f33067a.m36327g()) {
            c9257qa.f33067a.mo36321a().m37011w().m36911a("Conditional property not set since app measurement is disabled");
            return;
        }
        zzpl zzplVar = new zzpl(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            C9094g7 c9094g7 = c9257qa.f33067a;
            zzbg zzbgVarM36949R = c9094g7.m36308C().m36949R(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            c9257qa.f33067a.m36315J().m36888d0(new zzah(bundle.getString("app_id"), string2, zzplVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), c9094g7.m36308C().m36949R(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), zzbgVarM36949R, bundle.getLong("time_to_live"), c9094g7.m36308C().m36949R(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
