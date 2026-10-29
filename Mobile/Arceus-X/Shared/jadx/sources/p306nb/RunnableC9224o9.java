package p306nb;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzpl;
import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.o9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9224o9 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Bundle f33304a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9257qa f33305b;

    public RunnableC9224o9(C9257qa c9257qa, Bundle bundle) {
        this.f33304a = bundle;
        Objects.requireNonNull(c9257qa);
        this.f33305b = c9257qa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9257qa c9257qa = this.f33305b;
        c9257qa.mo36088h();
        c9257qa.m36121j();
        Bundle bundle = this.f33304a;
        C8953m.m36047l(bundle);
        String strM36041f = C8953m.m36041f(bundle.getString("name"));
        if (!c9257qa.f33067a.m36327g()) {
            c9257qa.f33067a.mo36321a().m37011w().m36911a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            c9257qa.f33067a.m36315J().m36888d0(new zzah(bundle.getString("app_id"), "", new zzpl(strM36041f, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), c9257qa.f33067a.m36308C().m36949R(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
