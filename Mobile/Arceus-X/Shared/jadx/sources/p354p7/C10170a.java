package p354p7;

import androidx.annotation.NonNull;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import p431s7.C11189e;

/* JADX INFO: renamed from: p7.a */
/* JADX INFO: loaded from: classes3.dex */
public class C10170a implements InterfaceC10173d {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final HttpURLConnection f36738a;

    public C10170a(@NonNull HttpURLConnection httpURLConnection) {
        this.f36738a = httpURLConnection;
    }

    @Override // p354p7.InterfaceC10173d
    /* JADX INFO: renamed from: B0 */
    public String mo39183B0() {
        return this.f36738a.getContentType();
    }

    @Override // p354p7.InterfaceC10173d
    @NonNull
    /* JADX INFO: renamed from: I0 */
    public InputStream mo39184I0() {
        return this.f36738a.getInputStream();
    }

    /* JADX INFO: renamed from: a */
    public final String m39185a(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb2.append(line);
                    sb2.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th2;
            }
        }
        bufferedReader.close();
        return sb2.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f36738a.disconnect();
    }

    @Override // p354p7.InterfaceC10173d
    public boolean isSuccessful() {
        try {
            return this.f36738a.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // p354p7.InterfaceC10173d
    /* JADX INFO: renamed from: u2 */
    public String mo39186u2() {
        try {
            if (isSuccessful()) {
                return null;
            }
            return "Unable to fetch " + this.f36738a.getURL() + ". Failed with " + this.f36738a.getResponseCode() + "\n" + m39185a(this.f36738a);
        } catch (IOException e10) {
            C11189e.m42154d("get error failed ", e10);
            return e10.getMessage();
        }
    }
}
