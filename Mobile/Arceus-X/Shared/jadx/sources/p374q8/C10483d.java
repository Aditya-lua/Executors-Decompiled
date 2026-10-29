package p374q8;

import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import ua.C11839i;

/* JADX INFO: renamed from: q8.d */
/* JADX INFO: loaded from: classes.dex */
public final class C10483d {
    /* JADX INFO: renamed from: a */
    public static final void m40289a(String str) {
        try {
            try {
                C11839i.m44224b(263);
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 65);
                        sb2.append("Received non-success response code ");
                        sb2.append(responseCode);
                        sb2.append(" from pinging URL: ");
                        sb2.append(str);
                        Log.w("HttpUrlPinger", sb2.toString());
                    }
                    httpURLConnection.disconnect();
                    C11839i.m44223a();
                } catch (Throwable th2) {
                    httpURLConnection.disconnect();
                    throw th2;
                }
            } catch (Throwable th3) {
                C11839i.m44223a();
                throw th3;
            }
        } catch (IOException e10) {
            e = e10;
            String message = e.getMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
            sb3.append("Error while pinging URL: ");
            sb3.append(str);
            sb3.append(". ");
            sb3.append(message);
            Log.w("HttpUrlPinger", sb3.toString(), e);
            C11839i.m44223a();
        } catch (IndexOutOfBoundsException e11) {
            String message2 = e11.getMessage();
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message2).length());
            sb4.append("Error while parsing ping URL: ");
            sb4.append(str);
            sb4.append(". ");
            sb4.append(message2);
            Log.w("HttpUrlPinger", sb4.toString(), e11);
            C11839i.m44223a();
        } catch (RuntimeException e12) {
            e = e12;
            String message3 = e.getMessage();
            StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message3).length());
            sb5.append("Error while pinging URL: ");
            sb5.append(str);
            sb5.append(". ");
            sb5.append(message3);
            Log.w("HttpUrlPinger", sb5.toString(), e);
            C11839i.m44223a();
        }
    }
}
