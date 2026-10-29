package p306nb;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Objects;

/* JADX INFO: renamed from: nb.ca */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9030ca implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f32811a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Uri f32812b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f32813c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f32814d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C9047da f32815e;

    public RunnableC9030ca(C9047da c9047da, boolean z10, Uri uri, String str, String str2) {
        this.f32811a = z10;
        this.f32812b = uri;
        this.f32813c = str;
        this.f32814d = str2;
        Objects.requireNonNull(c9047da);
        this.f32815e = c9047da;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleM36975s0;
        Bundle bundleM36975s1;
        C9047da c9047da = this.f32815e;
        C9257qa c9257qa = c9047da.f32848a;
        c9257qa.mo36088h();
        String str = this.f32814d;
        Uri uri = this.f32812b;
        try {
            C9094g7 c9094g7 = c9257qa.f33067a;
            C9341ve c9341veM36308C = c9094g7.m36308C();
            if (TextUtils.isEmpty(str)) {
                bundleM36975s0 = null;
            } else if (str.contains("gclid") || str.contains("gbraid") || str.contains("utm_campaign") || str.contains("utm_source") || str.contains("utm_medium") || str.contains("utm_id") || str.contains("dclid") || str.contains("srsltid") || str.contains("sfmc_id")) {
                bundleM36975s0 = c9341veM36308C.m36975s0(Uri.parse("https://google.com/search?".concat(str)));
                if (bundleM36975s0 != null) {
                    bundleM36975s0.putString("_cis", Payload.RFR);
                }
            } else {
                c9341veM36308C.f33067a.mo36321a().m37010v().m36911a("Activity created with data 'referrer' without required params");
                bundleM36975s0 = null;
            }
            String str2 = this.f32813c;
            if (this.f32811a && (bundleM36975s1 = c9094g7.m36308C().m36975s0(uri)) != null) {
                bundleM36975s1.putString("_cis", "intent");
                if (!bundleM36975s1.containsKey("gclid") && bundleM36975s0 != null && bundleM36975s0.containsKey("gclid")) {
                    bundleM36975s1.putString("_cer", String.format("gclid=%s", bundleM36975s0.getString("gclid")));
                }
                c9257qa.m36712t(str2, "_cmp", bundleM36975s1);
                c9257qa.f33407r.m36272b(str2, bundleM36975s1);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            c9094g7.mo36321a().m37010v().m36912b("Activity created with referrer", str);
            if (c9094g7.m36338w().m36406H(null, C9395z4.f33720H0)) {
                if (bundleM36975s0 != null) {
                    c9257qa.m36712t(str2, "_cmp", bundleM36975s0);
                    c9257qa.f33407r.m36272b(str2, bundleM36975s0);
                } else {
                    c9094g7.mo36321a().m37010v().m36912b("Referrer does not contain valid parameters", str);
                }
                c9257qa.m36722y("auto", "_ldl", null, true);
                return;
            }
            if (!str.contains("gclid") || (!str.contains("utm_campaign") && !str.contains("utm_source") && !str.contains("utm_medium") && !str.contains("utm_term") && !str.contains("utm_content"))) {
                c9094g7.mo36321a().m37010v().m36911a("Activity created with data 'referrer' without required params");
            } else {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                c9257qa.m36722y("auto", "_ldl", str, true);
            }
        } catch (RuntimeException e10) {
            c9047da.f32848a.f33067a.mo36321a().m37003o().m36912b("Throwable caught in handleReferrerForOnActivityCreated", e10);
        }
    }
}
