package ob;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.appsflyer.sdk_base.referrer.Payload;

/* JADX INFO: loaded from: classes.dex */
public final class of {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7 f27662a;

    public of(l7 l7Var) {
        this.f27662a = l7Var;
    }

    public final void a() {
        l7 l7Var = this.f27662a;
        l7Var.b().h();
        if (e()) {
            if (d()) {
                l7Var.x().f27704x.b(null);
                Bundle bundle = new Bundle();
                bundle.putString(Payload.SOURCE, "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                l7Var.B().t("auto", "_cmpx", bundle);
            } else {
                String strA = l7Var.x().f27704x.a();
                if (TextUtils.isEmpty(strA)) {
                    l7Var.a().p().a("Cache still valid but referrer not found");
                } else {
                    long jA = l7Var.x().f27705y.a() / 3600000;
                    Uri uri = Uri.parse(strA);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri.getPath(), bundle2);
                    for (String str : uri.getQueryParameterNames()) {
                        bundle2.putString(str, uri.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", (jA - 1) * 3600000);
                    Object obj = pair.first;
                    l7Var.B().t(obj == null ? Payload.TYPE_APP : (String) obj, "_cmp", (Bundle) pair.second);
                }
                l7Var.x().f27704x.b(null);
            }
            l7Var.x().f27705y.b(0L);
        }
    }

    public final void b(String str, Bundle bundle) {
        String string;
        l7 l7Var = this.f27662a;
        l7Var.b().h();
        if (l7Var.g()) {
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
        l7Var.x().f27704x.b(string);
        l7Var.x().f27705y.b(l7Var.e().a());
    }

    public final void c() {
        if (e() && d()) {
            this.f27662a.x().f27704x.b(null);
        }
    }

    public final boolean d() {
        if (!e()) {
            return false;
        }
        l7 l7Var = this.f27662a;
        return l7Var.e().a() - l7Var.x().f27705y.a() > l7Var.w().D(null, e5.f27254k0);
    }

    public final boolean e() {
        return this.f27662a.x().f27705y.a() > 0;
    }
}
