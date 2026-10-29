package nb;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b6 extends xd {
    public b6(me meVar) {
        super(meVar);
    }

    @Override // nb.xd
    public final boolean l() {
        return false;
    }

    public final boolean m() {
        j();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f25625a.d().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void n(String str, yd ydVar, com.google.android.gms.internal.measurement.y6 y6Var, y5 y5Var) {
        b6 b6Var;
        String str2;
        h();
        j();
        try {
            URL url = new URI(ydVar.a()).toURL();
            this.b.K0();
            byte[] bArrD = y6Var.d();
            b6Var = this;
            str2 = str;
            try {
                this.f25625a.b().w(new a6(b6Var, str2, url, bArrD, ydVar.b(), y5Var));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                b6Var.f25625a.a().o().c("Failed to parse URL. Not uploading MeasurementBatch. appId", w5.x(str2), ydVar.a());
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            b6Var = this;
            str2 = str;
        }
    }

    public final void o(c6 c6Var, Map map, y5 y5Var) {
        b6 b6Var;
        h();
        j();
        n9.m.l(c6Var);
        n9.m.l(y5Var);
        zd zdVarC0 = this.b.C0();
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) z4.f26163f.b(null)).encodedAuthority((String) z4.f26166g.b(null)).path("config/app/".concat(String.valueOf(c6Var.r0()))).appendQueryParameter("platform", "android");
        zdVarC0.f25625a.w().A();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(133005L)).appendQueryParameter("runtime_version", "0");
        String string = builder.build().toString();
        try {
            URL url = new URI(string).toURL();
            b6Var = this;
            try {
                this.f25625a.b().w(new a6(b6Var, c6Var.o0(), url, null, map, y5Var));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                b6Var.f25625a.a().o().c("Failed to parse config URL. Not fetching. appId", w5.x(c6Var.o0()), string);
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            b6Var = this;
        }
    }
}
