package p597z7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
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
import p009a8.AbstractC0083a;
import p009a8.AbstractC0092j;
import p009a8.AbstractC0093k;
import p009a8.AbstractC0094l;
import p009a8.AbstractC0095m;
import p009a8.AbstractC0096n;
import p009a8.AbstractC0097o;
import p009a8.EnumC0098p;
import p028b8.AbstractC1261i;
import p028b8.C1260h;
import p044c8.AbstractC1560f;
import p044c8.AbstractC1561g;
import p044c8.InterfaceC1567m;
import p122f8.C5488a;
import p148g8.C6049b;
import p148g8.InterfaceC6048a;
import p148g8.InterfaceC6050c;
import p267l8.InterfaceC8011a;
import p410rf.C10867c;
import p410rf.InterfaceC10865a;
import p569y7.C13116c;

/* JADX INFO: renamed from: z7.d */
/* JADX INFO: loaded from: classes.dex */
public final class C13735d implements InterfaceC1567m {

    /* JADX INFO: renamed from: a */
    public final InterfaceC10865a f48310a;

    /* JADX INFO: renamed from: b */
    public final ConnectivityManager f48311b;

    /* JADX INFO: renamed from: c */
    public final Context f48312c;

    /* JADX INFO: renamed from: d */
    public final URL f48313d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC8011a f48314e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC8011a f48315f;

    /* JADX INFO: renamed from: g */
    public final int f48316g;

    /* JADX INFO: renamed from: z7.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final URL f48317a;

        /* JADX INFO: renamed from: b */
        public final AbstractC0092j f48318b;

        /* JADX INFO: renamed from: c */
        public final String f48319c;

        public a(URL url, AbstractC0092j abstractC0092j, String str) {
            this.f48317a = url;
            this.f48318b = abstractC0092j;
            this.f48319c = str;
        }

        /* JADX INFO: renamed from: a */
        public a m50154a(URL url) {
            return new a(url, this.f48318b, this.f48319c);
        }
    }

    /* JADX INFO: renamed from: z7.d$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f48320a;

        /* JADX INFO: renamed from: b */
        public final URL f48321b;

        /* JADX INFO: renamed from: c */
        public final long f48322c;

        public b(int i10, URL url, long j10) {
            this.f48320a = i10;
            this.f48321b = url;
            this.f48322c = j10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C13735d(Context context, InterfaceC8011a interfaceC8011a, InterfaceC8011a interfaceC8011a2, int i10) {
        this.f48310a = AbstractC0092j.m282b();
        this.f48312c = context;
        this.f48311b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f48313d = m50151m(C13732a.f48301c);
        this.f48314e = interfaceC8011a2;
        this.f48315f = interfaceC8011a;
        this.f48316g = i10;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ a m50144d(a aVar, b bVar) {
        URL url = bVar.f48321b;
        if (url == null) {
            return null;
        }
        C5488a.m25128a("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.m50154a(bVar.f48321b);
    }

    /* JADX INFO: renamed from: f */
    public static int m50145f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return AbstractC0097o.b.UNKNOWN_MOBILE_SUBTYPE.m294b();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return AbstractC0097o.b.COMBINED.m294b();
        }
        if (AbstractC0097o.b.m293a(subtype) != null) {
            return subtype;
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public static int m50146g(NetworkInfo networkInfo) {
        return networkInfo == null ? AbstractC0097o.c.NONE.m296b() : networkInfo.getType();
    }

    /* JADX INFO: renamed from: h */
    public static int m50147h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            C5488a.m25130c("CctTransportBackend", "Unable to find version code for package", e10);
            return -1;
        }
    }

    /* JADX INFO: renamed from: j */
    public static TelephonyManager m50148j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    /* JADX INFO: renamed from: k */
    public static long m50149k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    /* JADX INFO: renamed from: l */
    public static InputStream m50150l(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    /* JADX INFO: renamed from: m */
    public static URL m50151m(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Invalid url: " + str, e10);
        }
    }

    @Override // p044c8.InterfaceC1567m
    /* JADX INFO: renamed from: a */
    public AbstractC1261i mo8177a(AbstractC1261i abstractC1261i) {
        NetworkInfo activeNetworkInfo = this.f48311b.getActiveNetworkInfo();
        return abstractC1261i.m7027l().m7028a("sdk-version", Build.VERSION.SDK_INT).m7030c("model", Build.MODEL).m7030c("hardware", Build.HARDWARE).m7030c("device", Build.DEVICE).m7030c("product", Build.PRODUCT).m7030c("os-uild", Build.ID).m7030c("manufacturer", Build.MANUFACTURER).m7030c("fingerprint", Build.FINGERPRINT).m7029b("tz-offset", m50149k()).m7028a("net-type", m50146g(activeNetworkInfo)).m7028a("mobile-subtype", m50145f(activeNetworkInfo)).m7030c("country", Locale.getDefault().getCountry()).m7030c("locale", Locale.getDefault().getLanguage()).m7030c("mcc_mnc", m50148j(this.f48312c).getSimOperator()).m7030c("application_build", Integer.toString(m50147h(this.f48312c))).mo6988d();
    }

    @Override // p044c8.InterfaceC1567m
    /* JADX INFO: renamed from: b */
    public AbstractC1561g mo8178b(AbstractC1560f abstractC1560f) {
        AbstractC0092j abstractC0092jM50153i = m50153i(abstractC1560f);
        URL urlM50151m = this.f48313d;
        String strM50141d = null;
        if (abstractC1560f.mo8149c() != null) {
            try {
                C13732a c13732aM50139c = C13732a.m50139c(abstractC1560f.mo8149c());
                strM50141d = c13732aM50139c.m50141d() != null ? c13732aM50139c.m50141d() : null;
                if (c13732aM50139c.m50142e() != null) {
                    urlM50151m = m50151m(c13732aM50139c.m50142e());
                }
            } catch (IllegalArgumentException unused) {
                return AbstractC1561g.m8161a();
            }
        }
        try {
            b bVar = (b) C6049b.m26868a(5, new a(urlM50151m, abstractC0092jM50153i, strM50141d), new InterfaceC6048a() { // from class: z7.b
                @Override // p148g8.InterfaceC6048a
                public final Object apply(Object obj) {
                    return this.f48309a.m50152e((C13735d.a) obj);
                }
            }, new InterfaceC6050c() { // from class: z7.c
                @Override // p148g8.InterfaceC6050c
                /* JADX INFO: renamed from: a */
                public final Object mo26869a(Object obj, Object obj2) {
                    return C13735d.m50144d((C13735d.a) obj, (C13735d.b) obj2);
                }
            });
            int i10 = bVar.f48320a;
            if (i10 == 200) {
                return AbstractC1561g.m8163e(bVar.f48322c);
            }
            if (i10 < 500 && i10 != 404) {
                return i10 == 400 ? AbstractC1561g.m8162d() : AbstractC1561g.m8161a();
            }
            return AbstractC1561g.m8164f();
        } catch (IOException e10) {
            C5488a.m25130c("CctTransportBackend", "Could not make request to the backend", e10);
            return AbstractC1561g.m8164f();
        }
    }

    /* JADX INFO: renamed from: e */
    public final b m50152e(a aVar) throws IOException {
        C5488a.m25132e("CctTransportBackend", "Making request to: %s", aVar.f48317a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f48317a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f48316g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.9"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f48319c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f48310a.mo41318a(aVar.f48318b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    C5488a.m25132e("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    C5488a.m25128a("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    C5488a.m25128a("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream inputStreamM50150l = m50150l(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, AbstractC0096n.m291b(new BufferedReader(new InputStreamReader(inputStreamM50150l))).mo275c());
                            if (inputStreamM50150l != null) {
                                inputStreamM50150l.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } catch (Throwable th2) {
                            if (inputStreamM50150l != null) {
                                try {
                                    inputStreamM50150l.close();
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
            C5488a.m25130c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            C5488a.m25130c("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e12) {
            e = e12;
            C5488a.m25130c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (C10867c e13) {
            e = e13;
            C5488a.m25130c("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    /* JADX INFO: renamed from: i */
    public final AbstractC0092j m50153i(AbstractC1560f abstractC1560f) {
        AbstractC0094l.a aVarM286j;
        HashMap map = new HashMap();
        for (AbstractC1261i abstractC1261i : abstractC1560f.mo8148b()) {
            String strMo6986j = abstractC1261i.mo6986j();
            if (map.containsKey(strMo6986j)) {
                ((List) map.get(strMo6986j)).add(abstractC1261i);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(abstractC1261i);
                map.put(strMo6986j, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            AbstractC1261i abstractC1261i2 = (AbstractC1261i) ((List) entry.getValue()).get(0);
            AbstractC0095m.a aVarMo268b = AbstractC0095m.m287a().mo272f(EnumC0098p.DEFAULT).mo273g(this.f48315f.mo33091a()).mo274h(this.f48314e.mo33091a()).mo268b(AbstractC0093k.m283a().mo244c(AbstractC0093k.b.ANDROID_FIREBASE).mo243b(AbstractC0083a.m207a().mo232m(Integer.valueOf(abstractC1261i2.m7024g("sdk-version"))).mo229j(abstractC1261i2.m7023b("model")).mo225f(abstractC1261i2.m7023b("hardware")).mo223d(abstractC1261i2.m7023b("device")).mo231l(abstractC1261i2.m7023b("product")).mo230k(abstractC1261i2.m7023b("os-uild")).mo227h(abstractC1261i2.m7023b("manufacturer")).mo224e(abstractC1261i2.m7023b("fingerprint")).mo222c(abstractC1261i2.m7023b("country")).mo226g(abstractC1261i2.m7023b("locale")).mo228i(abstractC1261i2.m7023b("mcc_mnc")).mo221b(abstractC1261i2.m7023b("application_build")).mo220a()).mo242a());
            try {
                aVarMo268b.m288i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                aVarMo268b.m289j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (AbstractC1261i abstractC1261i3 : (List) entry.getValue()) {
                C1260h c1260hMo6984e = abstractC1261i3.mo6984e();
                C13116c c13116cM7021b = c1260hMo6984e.m7021b();
                if (c13116cM7021b.equals(C13116c.m48729b("proto"))) {
                    aVarM286j = AbstractC0094l.m286j(c1260hMo6984e.m7020a());
                } else if (c13116cM7021b.equals(C13116c.m48729b("json"))) {
                    aVarM286j = AbstractC0094l.m285i(new String(c1260hMo6984e.m7020a(), Charset.forName("UTF-8")));
                } else {
                    C5488a.m25133f("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", c13116cM7021b);
                }
                aVarM286j.mo254c(abstractC1261i3.mo6985f()).mo255d(abstractC1261i3.mo6987k()).mo259h(abstractC1261i3.m7025h("tz-offset")).mo256e(AbstractC0097o.m292a().mo280c(AbstractC0097o.c.m295a(abstractC1261i3.m7024g("net-type"))).mo279b(AbstractC0097o.b.m293a(abstractC1261i3.m7024g("mobile-subtype"))).mo278a());
                if (abstractC1261i3.mo6983d() != null) {
                    aVarM286j.mo253b(abstractC1261i3.mo6983d());
                }
                arrayList3.add(aVarM286j.mo252a());
            }
            aVarMo268b.mo269c(arrayList3);
            arrayList2.add(aVarMo268b.mo267a());
        }
        return AbstractC0092j.m281a(arrayList2);
    }

    public C13735d(Context context, InterfaceC8011a interfaceC8011a, InterfaceC8011a interfaceC8011a2) {
        this(context, interfaceC8011a, interfaceC8011a2, 130000);
    }
}
