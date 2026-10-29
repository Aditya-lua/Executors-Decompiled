package p306nb;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import com.google.android.gms.internal.measurement.C2406y6;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.b6 */
/* JADX INFO: loaded from: classes.dex */
public final class C9009b6 extends AbstractC9372xd {
    public C9009b6(C9197me c9197me) {
        super(c9197me);
    }

    @Override // p306nb.AbstractC9372xd
    /* JADX INFO: renamed from: l */
    public final boolean mo36126l() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m36127m() {
        m37067j();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f33067a.mo36324d().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: renamed from: n */
    public final void m36128n(String str, C9388yd c9388yd, C2406y6 c2406y6, InterfaceC9380y5 interfaceC9380y5) {
        C9009b6 c9009b6;
        String str2;
        mo36088h();
        m37067j();
        try {
            URL url = new URI(c9388yd.m37083a()).toURL();
            this.f33516b.m36515K0();
            byte[] bArrM10628d = c2406y6.m10628d();
            c9009b6 = this;
            str2 = str;
            try {
                this.f33067a.mo36322b().m36266w(new RunnableC8992a6(c9009b6, str2, url, bArrM10628d, c9388yd.m37084b(), interfaceC9380y5));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                c9009b6.f33067a.mo36321a().m37003o().m36913c("Failed to parse URL. Not uploading MeasurementBatch. appId", C9348w5.m36998x(str2), c9388yd.m37083a());
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            c9009b6 = this;
            str2 = str;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m36129o(C9026c6 c9026c6, Map map, InterfaceC9380y5 interfaceC9380y5) {
        C9009b6 c9009b6;
        mo36088h();
        m37067j();
        C8953m.m36047l(c9026c6);
        C8953m.m36047l(interfaceC9380y5);
        C9404zd c9404zdM36502C0 = this.f33516b.m36502C0();
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) C9395z4.f33772f.m37079b(null)).encodedAuthority((String) C9395z4.f33775g.m37079b(null)).path("config/app/".concat(String.valueOf(c9026c6.m36233r0()))).appendQueryParameter("platform", "android");
        c9404zdM36502C0.f33067a.m36338w().m36399A();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(133005L)).appendQueryParameter("runtime_version", "0");
        String string = builder.build().toString();
        try {
            URL url = new URI(string).toURL();
            c9009b6 = this;
            try {
                this.f33067a.mo36322b().m36266w(new RunnableC8992a6(c9009b6, c9026c6.m36227o0(), url, null, map, interfaceC9380y5));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                c9009b6.f33067a.mo36321a().m37003o().m36913c("Failed to parse config URL. Not fetching. appId", C9348w5.m36998x(c9026c6.m36227o0()), string);
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            c9009b6 = this;
        }
    }
}
