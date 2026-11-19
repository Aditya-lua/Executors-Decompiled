package q7;

import androidx.annotation.NonNull;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes3.dex */
public class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final HttpURLConnection f29936a;

    public a(@NonNull HttpURLConnection httpURLConnection) {
        this.f29936a = httpURLConnection;
    }

    @Override // q7.d
    public String B0() {
        return this.f29936a.getContentType();
    }

    @Override // q7.d
    @NonNull
    public InputStream J0() {
        return this.f29936a.getInputStream();
    }

    public final String a(HttpURLConnection httpURLConnection) {
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
        this.f29936a.disconnect();
    }

    @Override // q7.d
    public boolean isSuccessful() {
        try {
            return this.f29936a.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // q7.d
    public String x2() {
        try {
            if (isSuccessful()) {
                return null;
            }
            return "Unable to fetch " + this.f29936a.getURL() + ". Failed with " + this.f29936a.getResponseCode() + "\n" + a(this.f29936a);
        } catch (IOException e10) {
            t7.e.d("get error failed ", e10);
            return e10.getMessage();
        }
    }
}
