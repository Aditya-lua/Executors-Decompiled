package nb;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class l6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.t0 f25724a;
    public final /* synthetic */ ServiceConnection b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m6 f25725c;

    public l6(m6 m6Var, com.google.android.gms.internal.measurement.t0 t0Var, ServiceConnection serviceConnection) {
        this.f25724a = t0Var;
        this.b = serviceConnection;
        Objects.requireNonNull(m6Var);
        this.f25725c = m6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleJ;
        m6 m6Var = this.f25725c;
        n6 n6Var = m6Var.b;
        g7 g7Var = n6Var.f25786a;
        g7Var.b().h();
        Bundle bundle = new Bundle();
        String strA = m6Var.a();
        bundle.putString("package_name", strA);
        try {
            bundleJ = this.f25724a.j(bundle);
            if (bundleJ == null) {
                g7Var.a().o().a("Install Referrer Service returned a null response");
                bundleJ = null;
            }
        } catch (Exception e10) {
            n6Var.f25786a.a().o().b("Exception occurred while retrieving the Install Referrer", e10.getMessage());
        }
        g7 g7Var2 = n6Var.f25786a;
        g7Var2.b().h();
        g7.q();
        if (bundleJ != null) {
            long j10 = bundleJ.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j10 == 0) {
                g7Var2.a().r().a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundleJ.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    g7Var2.a().o().a("No referrer defined in Install Referrer response");
                } else {
                    g7Var2.a().w().b("InstallReferrer API result", string);
                    Bundle bundleS0 = g7Var2.C().s0(Uri.parse("?".concat(string)));
                    if (bundleS0 == null) {
                        g7Var2.a().o().a("No campaign params defined in Install Referrer result");
                    } else {
                        List listAsList = Arrays.asList(((String) z4.f26171h1.b(null)).split(","));
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
                        if (j10 == g7Var2.x().f25672g.a()) {
                            g7Var2.a().w().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (g7Var2.g()) {
                            g7Var2.x().f25672g.b(j10);
                            g7Var2.a().w().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            bundleS0.putString("_cis", "referrer API v2");
                            g7Var2.B().w("auto", "_cmp", bundleS0, strA);
                        }
                    }
                }
            }
        }
        t9.a.b().c(g7Var2.d(), this.b);
    }
}
