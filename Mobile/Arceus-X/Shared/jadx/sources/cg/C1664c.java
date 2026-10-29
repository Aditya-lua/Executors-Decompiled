package cg;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import androidx.annotation.NonNull;
import backtraceio.library.services.BacktraceMetrics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p305n9.C8953m;
import p462u9.C11810a;
import p462u9.C11820k;
import p575yf.InterfaceC13188b;
import p603zf.C13802i;
import sb.C11268m;
import wf.InterfaceC12410i;

/* JADX INFO: renamed from: cg.c */
/* JADX INFO: loaded from: classes2.dex */
public class C1664c {

    /* JADX INFO: renamed from: d */
    public static final Pattern f6420d = Pattern.compile("[0-9]+s");

    /* JADX INFO: renamed from: e */
    public static final Charset f6421e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final Context f6422a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC13188b<InterfaceC12410i> f6423b;

    /* JADX INFO: renamed from: c */
    public final C1666e f6424c = new C1666e();

    public C1664c(@NonNull Context context, @NonNull InterfaceC13188b<InterfaceC12410i> interfaceC13188b) {
        this.f6422a = context;
        this.f6423b = interfaceC13188b;
    }

    /* JADX INFO: renamed from: a */
    public static String m8343a(String str, @NonNull String str2, @NonNull String str3) {
        String str4;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", str2, str3, str4);
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m8344b(String str, @NonNull String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:19.0.1");
            return jSONObject;
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m8345c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:19.0.1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m8346h(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    /* JADX INFO: renamed from: i */
    public static boolean m8347i(int i10) {
        return i10 >= 200 && i10 < 300;
    }

    /* JADX INFO: renamed from: j */
    public static void m8348j() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    /* JADX INFO: renamed from: k */
    public static void m8349k(HttpURLConnection httpURLConnection, String str, @NonNull String str2, @NonNull String str3) {
        String strM8351o = m8351o(httpURLConnection);
        if (TextUtils.isEmpty(strM8351o)) {
            return;
        }
        Log.w("Firebase-Installations", strM8351o);
        Log.w("Firebase-Installations", m8343a(str, str2, str3));
    }

    /* JADX INFO: renamed from: m */
    public static long m8350m(String str) {
        C8953m.m36037b(f6420d.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* JADX INFO: renamed from: o */
    public static String m8351o(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f6421e));
        try {
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb2.append(line);
                    sb2.append('\n');
                    return null;
                }
                String str = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb2);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return str;
            } catch (IOException unused2) {
            }
        } catch (IOException unused3) {
            bufferedReader.close();
            return null;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m8352s(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public AbstractC1665d m8353d(@NonNull String str, String str2, @NonNull String str3, @NonNull String str4, String str5) {
        AbstractC1665d abstractC1665dM8358n;
        if (!this.f6424c.m8367b()) {
            throw new C13802i("Firebase Installations Service is unavailable. Please try again later.", C13802i.a.UNAVAILABLE);
        }
        URL urlM8356g = m8356g(String.format("projects/%s/installations", str3));
        for (int i10 = 0; i10 <= 1; i10++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionM8357l = m8357l(urlM8356g, str);
            try {
                try {
                    httpURLConnectionM8357l.setRequestMethod("POST");
                    httpURLConnectionM8357l.setDoOutput(true);
                    if (str5 != null) {
                        httpURLConnectionM8357l.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    m8360q(httpURLConnectionM8357l, str2, str4);
                    int responseCode = httpURLConnectionM8357l.getResponseCode();
                    this.f6424c.m8369f(responseCode);
                    if (m8347i(responseCode)) {
                        abstractC1665dM8358n = m8358n(httpURLConnectionM8357l);
                    } else {
                        m8349k(httpURLConnectionM8357l, str4, str, str3);
                        if (responseCode == 429) {
                            throw new C13802i("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", C13802i.a.TOO_MANY_REQUESTS);
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            m8348j();
                            abstractC1665dM8358n = AbstractC1665d.m8362a().mo8334e(AbstractC1665d.b.BAD_CONFIG).mo8330a();
                        }
                        httpURLConnectionM8357l.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                    httpURLConnectionM8357l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return abstractC1665dM8358n;
                } catch (IOException | AssertionError unused) {
                }
            } catch (Throwable th2) {
                httpURLConnectionM8357l.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th2;
            }
        }
        throw new C13802i("Firebase Installations Service is unavailable. Please try again later.", C13802i.a.UNAVAILABLE);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public AbstractC1667f m8354e(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) {
        AbstractC1667f abstractC1667fM8359p;
        if (!this.f6424c.m8367b()) {
            throw new C13802i("Firebase Installations Service is unavailable. Please try again later.", C13802i.a.UNAVAILABLE);
        }
        URL urlM8356g = m8356g(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
        for (int i10 = 0; i10 <= 1; i10++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionM8357l = m8357l(urlM8356g, str);
            try {
                try {
                    httpURLConnectionM8357l.setRequestMethod("POST");
                    httpURLConnectionM8357l.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionM8357l.setDoOutput(true);
                    m8361r(httpURLConnectionM8357l);
                    int responseCode = httpURLConnectionM8357l.getResponseCode();
                    this.f6424c.m8369f(responseCode);
                    if (m8347i(responseCode)) {
                        abstractC1667fM8359p = m8359p(httpURLConnectionM8357l);
                    } else {
                        m8349k(httpURLConnectionM8357l, null, str, str3);
                        if (responseCode == 401 || responseCode == 404) {
                            abstractC1667fM8359p = AbstractC1667f.m8370a().mo8340b(AbstractC1667f.b.AUTH_ERROR).mo8339a();
                        } else {
                            if (responseCode == 429) {
                                throw new C13802i("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", C13802i.a.TOO_MANY_REQUESTS);
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                m8348j();
                                abstractC1667fM8359p = AbstractC1667f.m8370a().mo8340b(AbstractC1667f.b.BAD_CONFIG).mo8339a();
                            }
                            httpURLConnectionM8357l.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                    httpURLConnectionM8357l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return abstractC1667fM8359p;
                } catch (Throwable th2) {
                    httpURLConnectionM8357l.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
            } catch (IOException | AssertionError unused) {
            }
        }
        throw new C13802i("Firebase Installations Service is unavailable. Please try again later.", C13802i.a.UNAVAILABLE);
    }

    /* JADX INFO: renamed from: f */
    public final String m8355f() {
        try {
            Context context = this.f6422a;
            byte[] bArrM44167a = C11810a.m44167a(context, context.getPackageName());
            if (bArrM44167a != null) {
                return C11820k.m44191b(bArrM44167a, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f6422a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("ContentValues", "No such package: " + this.f6422a.getPackageName(), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final URL m8356g(String str) throws C13802i {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e10) {
            throw new C13802i(e10.getMessage(), C13802i.a.UNAVAILABLE);
        }
    }

    /* JADX INFO: renamed from: l */
    public final HttpURLConnection m8357l(URL url, String str) throws C13802i {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(BacktraceMetrics.defaultTimeBetweenRetriesMs);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(BacktraceMetrics.defaultTimeBetweenRetriesMs);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f6422a.getPackageName());
            InterfaceC12410i interfaceC12410i = this.f6423b.get();
            if (interfaceC12410i != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) C11268m.m42331a(interfaceC12410i.mo46487a()));
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e10);
                } catch (ExecutionException e11) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e11);
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", m8355f());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new C13802i("Firebase Installations Service is unavailable. Please try again later.", C13802i.a.UNAVAILABLE);
        }
    }

    /* JADX INFO: renamed from: n */
    public final AbstractC1665d m8358n(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f6421e));
        AbstractC1667f.a aVarM8370a = AbstractC1667f.m8370a();
        AbstractC1665d.a aVarM8362a = AbstractC1665d.m8362a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                aVarM8362a.mo8335f(jsonReader.nextString());
            } else if (strNextName.equals("fid")) {
                aVarM8362a.mo8332c(jsonReader.nextString());
            } else if (strNextName.equals("refreshToken")) {
                aVarM8362a.mo8333d(jsonReader.nextString());
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        aVarM8370a.mo8341c(jsonReader.nextString());
                    } else if (strNextName2.equals("expiresIn")) {
                        aVarM8370a.mo8342d(m8350m(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                aVarM8362a.mo8331b(aVarM8370a.mo8339a());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return aVarM8362a.mo8334e(AbstractC1665d.b.OK).mo8330a();
    }

    /* JADX INFO: renamed from: p */
    public final AbstractC1667f m8359p(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f6421e));
        AbstractC1667f.a aVarM8370a = AbstractC1667f.m8370a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                aVarM8370a.mo8341c(jsonReader.nextString());
            } else if (strNextName.equals("expiresIn")) {
                aVarM8370a.mo8342d(m8350m(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return aVarM8370a.mo8340b(AbstractC1667f.b.OK).mo8339a();
    }

    /* JADX INFO: renamed from: q */
    public final void m8360q(HttpURLConnection httpURLConnection, String str, @NonNull String str2) throws IOException {
        m8352s(httpURLConnection, m8346h(m8344b(str, str2)));
    }

    /* JADX INFO: renamed from: r */
    public final void m8361r(HttpURLConnection httpURLConnection) throws IOException {
        m8352s(httpURLConnection, m8346h(m8345c()));
    }
}
