package p072d9;

import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import p242k9.AbstractC7499i;
import p242k9.C7500j;
import p268l9.C8075t;
import p305n9.C8953m;
import p375q9.C10484a;

/* JADX INFO: renamed from: d9.e */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4477e implements Runnable {

    /* JADX INFO: renamed from: c */
    public static final C10484a f18516c = new C10484a("RevokeAccessOperation", new String[0]);

    /* JADX INFO: renamed from: a */
    public final String f18517a;

    /* JADX INFO: renamed from: b */
    public final C8075t f18518b = new C8075t(null);

    public RunnableC4477e(String str) {
        this.f18517a = C8953m.m36041f(str);
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC7499i m22435a(String str) {
        if (str == null) {
            return C7500j.m31160a(new Status(4), null);
        }
        RunnableC4477e runnableC4477e = new RunnableC4477e(str);
        new Thread(runnableC4477e).start();
        return runnableC4477e.f18518b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.f7407m;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f18517a).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f7405k;
            } else {
                f18516c.m40291b("Unable to revoke access!", new Object[0]);
            }
            f18516c.m40290a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e10) {
            f18516c.m40291b("IOException when revoking access: ".concat(String.valueOf(e10.toString())), new Object[0]);
        } catch (Exception e11) {
            f18516c.m40291b("Exception when revoking access: ".concat(String.valueOf(e11.toString())), new Object[0]);
        }
        this.f18518b.m9176h(status);
    }
}
