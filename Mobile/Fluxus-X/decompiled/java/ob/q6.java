package ob;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class q6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.t0 f27736a;
    public final /* synthetic */ ServiceConnection b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r6 f27737c;

    public q6(r6 r6Var, com.google.android.gms.internal.measurement.t0 t0Var, ServiceConnection serviceConnection) {
        this.f27736a = t0Var;
        this.b = serviceConnection;
        Objects.requireNonNull(r6Var);
        this.f27737c = r6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleJ;
        r6 r6Var = this.f27737c;
        s6 s6Var = r6Var.b;
        l7 l7Var = s6Var.f27787a;
        l7Var.b().h();
        Bundle bundle = new Bundle();
        String strA = r6Var.a();
        bundle.putString("package_name", strA);
        try {
            bundleJ = this.f27736a.j(bundle);
            if (bundleJ == null) {
                l7Var.a().o().a("Install Referrer Service returned a null response");
                bundleJ = null;
            }
        } catch (Exception e10) {
            s6Var.f27787a.a().o().b("Exception occurred while retrieving the Install Referrer", e10.getMessage());
        }
        l7 l7Var2 = s6Var.f27787a;
        l7Var2.b().h();
        l7.q();
        if (bundleJ != null) {
            long j10 = bundleJ.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j10 == 0) {
                l7Var2.a().r().a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundleJ.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    l7Var2.a().o().a("No referrer defined in Install Referrer response");
                } else {
                    l7Var2.a().w().b("InstallReferrer API result", string);
                    Bundle bundleS0 = l7Var2.C().s0(Uri.parse("?".concat(string)));
                    if (bundleS0 == null) {
                        l7Var2.a().o().a("No campaign params defined in Install Referrer result");
                    } else {
                        List listAsList = Arrays.asList(((String) e5.f27246h1.b(null)).split(","));
                        Iterator<String> it = bundleS0.keySet().iterator();
                        while (it.hasNext()) {
                            if (listAsList.contains(it.next())) {
                                long j11 = bundleJ.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000;
                                if (j11 <= 0) {
                                    break;
                                }
                                bundleS0.putLong("click_timestamp", j11);
                                break;
                            }
                        }
                        if (j10 == l7Var2.x().f27687g.a()) {
                            l7Var2.a().w().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (l7Var2.g()) {
                            l7Var2.x().f27687g.b(j10);
                            l7Var2.a().w().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            bundleS0.putString("_cis", "referrer API v2");
                            l7Var2.B().w("auto", "_cmp", bundleS0, strA);
                        }
                    }
                }
            }
        }
        u9.a.b().c(l7Var2.d(), this.b);
    }
}
