package nb;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes.dex */
public final class cf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g7 f25441a;

    public cf(g7 g7Var) {
        this.f25441a = g7Var;
    }

    public final void a() {
        g7 g7Var = this.f25441a;
        g7Var.b().h();
        if (e()) {
            if (d()) {
                g7Var.x().f25689x.b(null);
                Bundle bundle = new Bundle();
                bundle.putString(Payload.SOURCE, "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                g7Var.B().t("auto", "_cmpx", bundle);
            } else {
                String strA = g7Var.x().f25689x.a();
                if (TextUtils.isEmpty(strA)) {
                    g7Var.a().p().a("Cache still valid but referrer not found");
                } else {
                    long jA = g7Var.x().f25690y.a() / 3600000;
                    Uri uri = Uri.parse(strA);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri.getPath(), bundle2);
                    for (String str : uri.getQueryParameterNames()) {
                        bundle2.putString(str, uri.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", (jA - 1) * 3600000);
                    Object obj = pair.first;
                    g7Var.B().t(obj == null ? Payload.TYPE_APP : (String) obj, "_cmp", (Bundle) pair.second);
                }
                g7Var.x().f25689x.b(null);
            }
            g7Var.x().f25690y.b(0L);
        }
    }

    public final void b(String str, Bundle bundle) {
        String string;
        g7 g7Var = this.f25441a;
        g7Var.b().h();
        if (g7Var.g()) {
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
        g7Var.x().f25689x.b(string);
        g7Var.x().f25690y.b(g7Var.e().a());
    }

    public final void c() {
        if (e() && d()) {
            this.f25441a.x().f25689x.b(null);
        }
    }

    public final boolean d() {
        if (!e()) {
            return false;
        }
        g7 g7Var = this.f25441a;
        return g7Var.e().a() - g7Var.x().f25690y.a() > g7Var.w().D(null, z4.f26179k0);
    }

    public final boolean e() {
        return this.f25441a.x().f25690y.a() > 0;
    }
}
