package ob;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g6 extends ge {
    public g6(ve veVar) {
        super(veVar);
    }

    @Override // ob.ge
    public final boolean l() {
        return false;
    }

    public final boolean m() {
        j();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f27641a.d().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void n(String str, he heVar, com.google.android.gms.internal.measurement.c7 c7Var, d6 d6Var) {
        g6 g6Var;
        String str2;
        h();
        j();
        try {
            URL url = new URI(heVar.a()).toURL();
            this.b.K0();
            byte[] bArrD = c7Var.d();
            g6Var = this;
            str2 = str;
            try {
                this.f27641a.b().w(new f6(g6Var, str2, url, bArrD, heVar.b(), d6Var));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                g6Var.f27641a.a().o().c("Failed to parse URL. Not uploading MeasurementBatch. appId", b6.x(str2), heVar.a());
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            g6Var = this;
            str2 = str;
        }
    }

    public final void o(h6 h6Var, Map map, d6 d6Var) {
        g6 g6Var;
        h();
        j();
        o9.s.l(h6Var);
        o9.s.l(d6Var);
        ie ieVarC0 = this.b.C0();
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) e5.f27238f.b(null)).encodedAuthority((String) e5.f27241g.b(null)).path("config/app/".concat(String.valueOf(h6Var.r0()))).appendQueryParameter("platform", "android");
        ieVarC0.f27641a.w().A();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(133005L)).appendQueryParameter("runtime_version", "0");
        String string = builder.build().toString();
        try {
            URL url = new URI(string).toURL();
            g6Var = this;
            try {
                this.f27641a.b().w(new f6(g6Var, h6Var.o0(), url, null, map, d6Var));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                g6Var.f27641a.a().o().c("Failed to parse config URL. Not fetching. appId", b6.x(h6Var.o0()), string);
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            g6Var = this;
        }
    }
}
