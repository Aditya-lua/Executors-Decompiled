package p306nb;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: renamed from: nb.cf */
/* JADX INFO: loaded from: classes.dex */
public final class C9035cf {

    /* JADX INFO: renamed from: a */
    public final C9094g7 f32831a;

    public C9035cf(C9094g7 c9094g7) {
        this.f32831a = c9094g7;
    }

    /* JADX INFO: renamed from: a */
    public final void m36271a() {
        C9094g7 c9094g7 = this.f32831a;
        c9094g7.mo36322b().mo36088h();
        if (m36275e()) {
            if (m36274d()) {
                c9094g7.m36339x().f33136x.m36370b(null);
                Bundle bundle = new Bundle();
                bundle.putString(Payload.SOURCE, "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                c9094g7.m36307B().m36712t("auto", "_cmpx", bundle);
            } else {
                String strM36369a = c9094g7.m36339x().f33136x.m36369a();
                if (TextUtils.isEmpty(strM36369a)) {
                    c9094g7.mo36321a().m37004p().m36911a("Cache still valid but referrer not found");
                } else {
                    long jM36345a = c9094g7.m36339x().f33137y.m36345a() / 3600000;
                    Uri uri = Uri.parse(strM36369a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri.getPath(), bundle2);
                    for (String str : uri.getQueryParameterNames()) {
                        bundle2.putString(str, uri.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", (jM36345a - 1) * 3600000);
                    Object obj = pair.first;
                    c9094g7.m36307B().m36712t(obj == null ? Payload.TYPE_APP : (String) obj, "_cmp", (Bundle) pair.second);
                }
                c9094g7.m36339x().f33136x.m36370b(null);
            }
            c9094g7.m36339x().f33137y.m36346b(0L);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m36272b(String str, Bundle bundle) {
        String string;
        C9094g7 c9094g7 = this.f32831a;
        c9094g7.mo36322b().mo36088h();
        if (c9094g7.m36327g()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        c9094g7.m36339x().f33136x.m36370b(string);
        c9094g7.m36339x().f33137y.m36346b(c9094g7.mo36325e().mo44175a());
    }

    /* JADX INFO: renamed from: c */
    public final void m36273c() {
        if (m36275e() && m36274d()) {
            this.f32831a.m36339x().f33136x.m36370b(null);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m36274d() {
        if (!m36275e()) {
            return false;
        }
        C9094g7 c9094g7 = this.f32831a;
        return c9094g7.mo36325e().mo44175a() - c9094g7.m36339x().f33137y.m36345a() > c9094g7.m36338w().m36402D(null, C9395z4.f33788k0);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m36275e() {
        return this.f32831a.m36339x().f33137y.m36345a() > 0;
    }
}
