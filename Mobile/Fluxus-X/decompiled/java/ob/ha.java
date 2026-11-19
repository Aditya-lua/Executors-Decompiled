package ob;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ha implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f27408a;
    public final /* synthetic */ Uri b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f27410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ia f27411e;

    public ha(ia iaVar, boolean z10, Uri uri, String str, String str2) {
        this.f27408a = z10;
        this.b = uri;
        this.f27409c = str;
        this.f27410d = str2;
        Objects.requireNonNull(iaVar);
        this.f27411e = iaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleS0;
        Bundle bundleS1;
        ia iaVar = this.f27411e;
        va vaVar = iaVar.f27470a;
        vaVar.h();
        String str = this.f27410d;
        Uri uri = this.b;
        try {
            l7 l7Var = vaVar.f27641a;
            ff ffVarC = l7Var.C();
            if (TextUtils.isEmpty(str)) {
                bundleS0 = null;
            } else if (str.contains("gclid") || str.contains("gbraid") || str.contains("utm_campaign") || str.contains("utm_source") || str.contains("utm_medium") || str.contains("utm_id") || str.contains("dclid") || str.contains("srsltid") || str.contains("sfmc_id")) {
                bundleS0 = ffVarC.s0(Uri.parse("https://google.com/search?".concat(str)));
                if (bundleS0 != null) {
                    bundleS0.putString("_cis", Payload.RFR);
                }
            } else {
                ffVarC.f27641a.a().v().a("Activity created with data 'referrer' without required params");
                bundleS0 = null;
            }
            String str2 = this.f27409c;
            if (this.f27408a && (bundleS1 = l7Var.C().s0(uri)) != null) {
                bundleS1.putString("_cis", "intent");
                if (!bundleS1.containsKey("gclid") && bundleS0 != null && bundleS0.containsKey("gclid")) {
                    bundleS1.putString("_cer", String.format("gclid=%s", bundleS0.getString("gclid")));
                }
                vaVar.t(str2, "_cmp", bundleS1);
                vaVar.f27889r.b(str2, bundleS1);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            l7Var.a().v().b("Activity created with referrer", str);
            if (l7Var.w().H(null, e5.H0)) {
                if (bundleS0 != null) {
                    vaVar.t(str2, "_cmp", bundleS0);
                    vaVar.f27889r.b(str2, bundleS0);
                } else {
                    l7Var.a().v().b("Referrer does not contain valid parameters", str);
                }
                vaVar.y("auto", "_ldl", null, true);
                return;
            }
            if (!str.contains("gclid") || (!str.contains("utm_campaign") && !str.contains("utm_source") && !str.contains("utm_medium") && !str.contains("utm_term") && !str.contains("utm_content"))) {
                l7Var.a().v().a("Activity created with data 'referrer' without required params");
            } else {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                vaVar.y("auto", "_ldl", str, true);
            }
        } catch (RuntimeException e10) {
            iaVar.f27470a.f27641a.a().o().b("Throwable caught in handleReferrerForOnActivityCreated", e10);
        }
    }
}
