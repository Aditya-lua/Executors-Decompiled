package a8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import b8.j;
import b8.k;
import b8.l;
import b8.n;
import b8.o;
import b8.p;
import c8.h;
import c8.i;
import d8.f;
import d8.g;
import d8.m;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class d implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tf.a f308a;
    public final ConnectivityManager b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final URL f310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m8.a f311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m8.a f312f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f313g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final URL f314a;
        public final j b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f315c;

        public a(URL url, j jVar, String str) {
            this.f314a = url;
            this.b = jVar;
            this.f315c = str;
        }

        public a a(URL url) {
            return new a(url, this.b, this.f315c);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f316a;
        public final URL b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f317c;

        public b(int i10, URL url, long j10) {
            this.f316a = i10;
            this.b = url;
            this.f317c = j10;
        }
    }

    public d(Context context, m8.a aVar, m8.a aVar2, int i10) {
        this.f308a = j.b();
        this.f309c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f310d = m(a8.a.f300c);
        this.f311e = aVar2;
        this.f312f = aVar;
        this.f313g = i10;
    }

    public static /* synthetic */ a d(a aVar, b bVar) {
        URL url = bVar.b;
        if (url == null) {
            return null;
        }
        g8.a.a("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.b);
    }

    public static int f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return o.b.UNKNOWN_MOBILE_SUBTYPE.b();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return o.b.COMBINED.b();
        }
        if (o.b.a(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    public static int g(NetworkInfo networkInfo) {
        return networkInfo == null ? o.c.NONE.b() : networkInfo.getType();
    }

    public static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            g8.a.c("CctTransportBackend", "Unable to find version code for package", e10);
            return -1;
        }
    }

    public static TelephonyManager j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    public static long k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    public static InputStream l(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    public static URL m(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Invalid url: " + str, e10);
        }
    }

    @Override // d8.m
    public g a(f fVar) {
        j jVarI = i(fVar);
        URL urlM = this.f310d;
        String strD = null;
        if (fVar.c() != null) {
            try {
                a8.a aVarC = a8.a.c(fVar.c());
                strD = aVarC.d() != null ? aVarC.d() : null;
                if (aVarC.e() != null) {
                    urlM = m(aVarC.e());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) h8.b.a(5, new a(urlM, jVarI, strD), new h8.a() { // from class: a8.b
                @Override // h8.a
                public final Object apply(Object obj) {
                    return this.f307a.e((d.a) obj);
                }
            }, new h8.c() { // from class: a8.c
                @Override // h8.c
                public final Object a(Object obj, Object obj2) {
                    return d.d((d.a) obj, (d.b) obj2);
                }
            });
            int i10 = bVar.f316a;
            if (i10 == 200) {
                return g.e(bVar.f317c);
            }
            if (i10 < 500 && i10 != 404) {
                return i10 == 400 ? g.d() : g.a();
            }
            return g.f();
        } catch (IOException e10) {
            g8.a.c("CctTransportBackend", "Could not make request to the backend", e10);
            return g.f();
        }
    }

    @Override // d8.m
    public i b(i iVar) {
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        return iVar.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", k()).a("net-type", g(activeNetworkInfo)).a("mobile-subtype", f(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", j(this.f309c).getSimOperator()).c("application_build", Integer.toString(h(this.f309c))).d();
    }

    public final b e(a aVar) throws IOException {
        g8.a.e("CctTransportBackend", "Making request to: %s", aVar.f314a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f314a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f313g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.9"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f315c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f308a.a(aVar.b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    g8.a.e("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    g8.a.a("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    g8.a.a("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamL = l(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, n.b(new BufferedReader(new InputStreamReader(inputStreamL))).c());
                            if (inputStreamL != null) {
                                inputStreamL.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } catch (Throwable th2) {
                            if (inputStreamL != null) {
                                try {
                                    inputStreamL.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                    throw th6;
                }
            } catch (Throwable th8) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th9) {
                        th8.addSuppressed(th9);
                    }
                }
                throw th8;
            }
        } catch (ConnectException e10) {
            e = e10;
            g8.a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            g8.a.c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e12) {
            e = e12;
            g8.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (tf.c e13) {
            e = e13;
            g8.a.c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    public final j i(f fVar) {
        l.a aVarJ;
        HashMap map = new HashMap();
        for (i iVar : fVar.b()) {
            String strJ = iVar.j();
            if (map.containsKey(strJ)) {
                ((List) map.get(strJ)).add(iVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                map.put(strJ, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            i iVar2 = (i) ((List) entry.getValue()).get(0);
            b8.m.a aVarB = b8.m.a().f(p.DEFAULT).g(this.f312f.a()).h(this.f311e.a()).b(k.a().c(k.b.ANDROID_FIREBASE).b(b8.a.a().m(Integer.valueOf(iVar2.g("sdk-version"))).j(iVar2.b("model")).f(iVar2.b("hardware")).d(iVar2.b("device")).l(iVar2.b("product")).k(iVar2.b("os-uild")).h(iVar2.b("manufacturer")).e(iVar2.b("fingerprint")).c(iVar2.b("country")).g(iVar2.b("locale")).i(iVar2.b("mcc_mnc")).b(iVar2.b("application_build")).a()).a());
            try {
                aVarB.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                aVarB.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (i iVar3 : (List) entry.getValue()) {
                h hVarE = iVar3.e();
                z7.c cVarB = hVarE.b();
                if (cVarB.equals(z7.c.b("proto"))) {
                    aVarJ = l.j(hVarE.a());
                } else if (cVarB.equals(z7.c.b("json"))) {
                    aVarJ = l.i(new String(hVarE.a(), Charset.forName("UTF-8")));
                } else {
                    g8.a.f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", cVarB);
                }
                aVarJ.c(iVar3.f()).d(iVar3.k()).h(iVar3.h("tz-offset")).e(o.a().c(o.c.a(iVar3.g("net-type"))).b(o.b.a(iVar3.g("mobile-subtype"))).a());
                if (iVar3.d() != null) {
                    aVarJ.b(iVar3.d());
                }
                arrayList3.add(aVarJ.a());
            }
            aVarB.c(arrayList3);
            arrayList2.add(aVarB.a());
        }
        return j.a(arrayList2);
    }

    public d(Context context, m8.a aVar, m8.a aVar2) {
        this(context, aVar, aVar2, 130000);
    }
}
