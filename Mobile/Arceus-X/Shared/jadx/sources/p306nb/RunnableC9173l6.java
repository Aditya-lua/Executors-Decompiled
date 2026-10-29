package p306nb;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.InterfaceC2310t0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p445t9.C11555a;

/* JADX INFO: renamed from: nb.l6 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9173l6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC2310t0 f33177a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ServiceConnection f33178b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ServiceConnectionC9189m6 f33179c;

    public RunnableC9173l6(ServiceConnectionC9189m6 serviceConnectionC9189m6, InterfaceC2310t0 interfaceC2310t0, ServiceConnection serviceConnection) {
        this.f33177a = interfaceC2310t0;
        this.f33178b = serviceConnection;
        Objects.requireNonNull(serviceConnectionC9189m6);
        this.f33179c = serviceConnectionC9189m6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleMo10586j;
        ServiceConnectionC9189m6 serviceConnectionC9189m6 = this.f33179c;
        C9205n6 c9205n6 = serviceConnectionC9189m6.f33204b;
        C9094g7 c9094g7 = c9205n6.f33261a;
        c9094g7.mo36322b().mo36088h();
        Bundle bundle = new Bundle();
        String strM36478a = serviceConnectionC9189m6.m36478a();
        bundle.putString("package_name", strM36478a);
        try {
            bundleMo10586j = this.f33177a.mo10586j(bundle);
            if (bundleMo10586j == null) {
                c9094g7.mo36321a().m37003o().m36911a("Install Referrer Service returned a null response");
                bundleMo10586j = null;
            }
        } catch (Exception e10) {
            c9205n6.f33261a.mo36321a().m37003o().m36912b("Exception occurred while retrieving the Install Referrer", e10.getMessage());
        }
        C9094g7 c9094g8 = c9205n6.f33261a;
        c9094g8.mo36322b().mo36088h();
        C9094g7.m36301q();
        if (bundleMo10586j != null) {
            long j10 = bundleMo10586j.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j10 == 0) {
                c9094g8.mo36321a().m37006r().m36911a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundleMo10586j.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    c9094g8.mo36321a().m37003o().m36911a("No referrer defined in Install Referrer response");
                } else {
                    c9094g8.mo36321a().m37011w().m36912b("InstallReferrer API result", string);
                    Bundle bundleM36975s0 = c9094g8.m36308C().m36975s0(Uri.parse("?".concat(string)));
                    if (bundleM36975s0 == null) {
                        c9094g8.mo36321a().m37003o().m36911a("No campaign params defined in Install Referrer result");
                    } else {
                        List listAsList = Arrays.asList(((String) C9395z4.f33780h1.m37079b(null)).split(","));
                        Iterator<String> it = bundleM36975s0.keySet().iterator();
                        while (it.hasNext()) {
                            if (listAsList.contains(it.next())) {
                                long j11 = bundleMo10586j.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000;
                                if (j11 <= 0) {
                                    break;
                                }
                                bundleM36975s0.putLong("click_timestamp", j11);
                                break;
                            }
                        }
                        if (j10 == c9094g8.m36339x().f33119g.m36345a()) {
                            c9094g8.mo36321a().m37011w().m36911a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (c9094g8.m36327g()) {
                            c9094g8.m36339x().f33119g.m36346b(j10);
                            c9094g8.mo36321a().m37011w().m36912b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            bundleM36975s0.putString("_cis", "referrer API v2");
                            c9094g8.m36307B().m36718w("auto", "_cmp", bundleM36975s0, strM36478a);
                        }
                    }
                }
            }
        }
        C11555a.m43201b().m43206c(c9094g8.mo36324d(), this.f33178b);
    }
}
