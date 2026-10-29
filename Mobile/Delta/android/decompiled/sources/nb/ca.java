package nb;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ca implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f25426a;
    public final /* synthetic */ Uri b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f25427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f25428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ da f25429e;

    public ca(da daVar, boolean z10, Uri uri, String str, String str2) {
        this.f25426a = z10;
        this.b = uri;
        this.f25427c = str;
        this.f25428d = str2;
        Objects.requireNonNull(daVar);
        this.f25429e = daVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleS0;
        Bundle bundleS1;
        da daVar = this.f25429e;
        qa qaVar = daVar.f25454a;
        qaVar.h();
        String str = this.f25428d;
        Uri uri = this.b;
        try {
            g7 g7Var = qaVar.f25625a;
            ve veVarC = g7Var.C();
            if (TextUtils.isEmpty(str)) {
                bundleS0 = null;
            } else if (str.contains("gclid") || str.contains("gbraid") || str.contains("utm_campaign") || str.contains("utm_source") || str.contains("utm_medium") || str.contains("utm_id") || str.contains("dclid") || str.contains("srsltid") || str.contains("sfmc_id")) {
                bundleS0 = veVarC.s0(Uri.parse("https://google.com/search?".concat(str)));
                if (bundleS0 != null) {
                    bundleS0.putString("_cis", Payload.RFR);
                }
            } else {
                veVarC.f25625a.a().v().a("Activity created with data 'referrer' without required params");
                bundleS0 = null;
            }
            String str2 = this.f25427c;
            if (this.f25426a && (bundleS1 = g7Var.C().s0(uri)) != null) {
                bundleS1.putString("_cis", "intent");
                if (!bundleS1.containsKey("gclid") && bundleS0 != null && bundleS0.containsKey("gclid")) {
                    bundleS1.putString("_cer", String.format("gclid=%s", bundleS0.getString("gclid")));
                }
                qaVar.t(str2, "_cmp", bundleS1);
                qaVar.f25906r.b(str2, bundleS1);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            g7Var.a().v().b("Activity created with referrer", str);
            if (g7Var.w().H(null, z4.H0)) {
                if (bundleS0 != null) {
                    qaVar.t(str2, "_cmp", bundleS0);
                    qaVar.f25906r.b(str2, bundleS0);
                } else {
                    g7Var.a().v().b("Referrer does not contain valid parameters", str);
                }
                qaVar.y("auto", "_ldl", null, true);
                return;
            }
            if (!str.contains("gclid") || (!str.contains("utm_campaign") && !str.contains("utm_source") && !str.contains("utm_medium") && !str.contains("utm_term") && !str.contains("utm_content"))) {
                g7Var.a().v().a("Activity created with data 'referrer' without required params");
            } else {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                qaVar.y("auto", "_ldl", str, true);
            }
        } catch (RuntimeException e10) {
            daVar.f25454a.f25625a.a().o().b("Throwable caught in handleReferrerForOnActivityCreated", e10);
        }
    }
}
