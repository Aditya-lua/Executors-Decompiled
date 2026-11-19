package e9;

import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r9.a f13244c = new r9.a("RevokeAccessOperation", new String[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13245a;
    public final m9.t b = new m9.t(null);

    public f(String str) {
        this.f13245a = o9.s.f(str);
    }

    public static l9.k a(String str) {
        if (str == null) {
            return l9.l.a(new Status(4), null);
        }
        f fVar = new f(str);
        new Thread(fVar).start();
        return fVar.b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.f6110m;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f13245a).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f6108k;
            } else {
                f13244c.b("Unable to revoke access!", new Object[0]);
            }
            f13244c.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e10) {
            f13244c.b("IOException when revoking access: ".concat(String.valueOf(e10.toString())), new Object[0]);
        } catch (Exception e11) {
            f13244c.b("Exception when revoking access: ".concat(String.valueOf(e11.toString())), new Object[0]);
        }
        this.b.h(status);
    }
}
