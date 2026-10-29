package p7;

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
    public final HttpURLConnection f28376a;

    public a(@NonNull HttpURLConnection httpURLConnection) {
        this.f28376a = httpURLConnection;
    }

    @Override // p7.d
    public String B0() {
        return this.f28376a.getContentType();
    }

    @Override // p7.d
    @NonNull
    public InputStream I0() {
        return this.f28376a.getInputStream();
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
        this.f28376a.disconnect();
    }

    @Override // p7.d
    public boolean isSuccessful() {
        try {
            return this.f28376a.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // p7.d
    public String u2() {
        try {
            if (isSuccessful()) {
                return null;
            }
            return "Unable to fetch " + this.f28376a.getURL() + ". Failed with " + this.f28376a.getResponseCode() + "\n" + a(this.f28376a);
        } catch (IOException e10) {
            s7.e.d("get error failed ", e10);
            return e10.getMessage();
        }
    }
}
