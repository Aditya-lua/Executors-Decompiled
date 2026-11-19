package ob;

import android.os.Bundle;
import com.github.luben.zstd.BuildConfig;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class t9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f27822a;
    public final /* synthetic */ va b;

    public t9(va vaVar, Bundle bundle) {
        this.f27822a = bundle;
        Objects.requireNonNull(vaVar);
        this.b = vaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        va vaVar = this.b;
        vaVar.h();
        vaVar.j();
        Bundle bundle = this.f27822a;
        o9.s.l(bundle);
        String strF = o9.s.f(bundle.getString("name"));
        if (!vaVar.f27641a.g()) {
            vaVar.f27641a.a().w().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            vaVar.f27641a.J().d0(new i(bundle.getString("app_id"), BuildConfig.FLAVOR, new bf(strF, 0L, null, BuildConfig.FLAVOR), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), vaVar.f27641a.C().R(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), BuildConfig.FLAVOR, bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
