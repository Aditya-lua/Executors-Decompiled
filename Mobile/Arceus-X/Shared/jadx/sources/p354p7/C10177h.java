package p354p7;

import android.content.Context;
import android.util.Pair;
import androidx.annotation.NonNull;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import p121f7.C5452i;
import p121f7.C5467p0;
import p121f7.C5468q;
import p431s7.C11189e;

/* JADX INFO: renamed from: p7.h */
/* JADX INFO: loaded from: classes3.dex */
public class C10177h {

    /* JADX INFO: renamed from: a */
    public final C10176g f36745a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final InterfaceC10175f f36746b;

    /* JADX INFO: renamed from: p7.h$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f36747a;

        static {
            int[] iArr = new int[EnumC10172c.values().length];
            f36747a = iArr;
            try {
                iArr[EnumC10172c.ZIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36747a[EnumC10172c.GZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C10177h(C10176g c10176g, @NonNull InterfaceC10175f interfaceC10175f) {
        this.f36745a = c10176g;
        this.f36746b = interfaceC10175f;
    }

    /* JADX INFO: renamed from: a */
    public final C5452i m39197a(Context context, @NonNull String str, String str2) {
        C10176g c10176g;
        Pair<EnumC10172c, InputStream> pairM39192a;
        C5467p0<C5452i> c5467p0M25074B;
        if (str2 == null || (c10176g = this.f36745a) == null || (pairM39192a = c10176g.m39192a(str)) == null) {
            return null;
        }
        EnumC10172c enumC10172c = (EnumC10172c) pairM39192a.first;
        InputStream inputStream = (InputStream) pairM39192a.second;
        int i10 = a.f36747a[enumC10172c.ordinal()];
        if (i10 == 1) {
            c5467p0M25074B = C5468q.m25074B(context, new ZipInputStream(inputStream), str2);
        } else if (i10 != 2) {
            c5467p0M25074B = C5468q.m25098p(inputStream, str2);
        } else {
            try {
                c5467p0M25074B = C5468q.m25098p(new GZIPInputStream(inputStream), str2);
            } catch (IOException e10) {
                c5467p0M25074B = new C5467p0<>(e10);
            }
        }
        if (c5467p0M25074B.m25072b() != null) {
            return c5467p0M25074B.m25072b();
        }
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public final C5467p0<C5452i> m39198b(Context context, @NonNull String str, String str2) {
        C5467p0<C5452i> c5467p0;
        C11189e.m42151a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                InterfaceC10173d interfaceC10173dMo39187a = this.f36746b.mo39187a(str);
                if (interfaceC10173dMo39187a.isSuccessful()) {
                    c5467p0 = m39201e(context, str, interfaceC10173dMo39187a.mo39184I0(), interfaceC10173dMo39187a.mo39183B0(), str2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Completed fetch from network. Success: ");
                    sb2.append(c5467p0.m25072b() != null);
                    C11189e.m42151a(sb2.toString());
                } else {
                    c5467p0 = new C5467p0<>(new IllegalArgumentException(interfaceC10173dMo39187a.mo39186u2()));
                }
                try {
                    interfaceC10173dMo39187a.close();
                    return c5467p0;
                } catch (IOException e10) {
                    C11189e.m42154d("LottieFetchResult close failed ", e10);
                    return c5467p0;
                }
            } catch (Exception e11) {
                C5467p0<C5452i> c5467p1 = new C5467p0<>(e11);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e12) {
                        C11189e.m42154d("LottieFetchResult close failed ", e12);
                    }
                }
                return c5467p1;
            }
        } catch (Throwable th2) {
            if (0 == 0) {
                throw th2;
            }
            try {
                closeable.close();
                throw th2;
            } catch (IOException e13) {
                C11189e.m42154d("LottieFetchResult close failed ", e13);
                throw th2;
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public C5467p0<C5452i> m39199c(Context context, @NonNull String str, String str2) {
        C5452i c5452iM39197a = m39197a(context, str, str2);
        if (c5452iM39197a != null) {
            return new C5467p0<>(c5452iM39197a);
        }
        C11189e.m42151a("Animation for " + str + " not found in cache. Fetching from network.");
        return m39198b(context, str, str2);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public final C5467p0<C5452i> m39200d(@NonNull String str, @NonNull InputStream inputStream, String str2) {
        C10176g c10176g;
        return (str2 == null || (c10176g = this.f36745a) == null) ? C5468q.m25098p(new GZIPInputStream(inputStream), null) : C5468q.m25098p(new GZIPInputStream(new FileInputStream(c10176g.m39196g(str, inputStream, EnumC10172c.GZIP))), str);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public final C5467p0<C5452i> m39201e(Context context, @NonNull String str, @NonNull InputStream inputStream, String str2, String str3) {
        C5467p0<C5452i> c5467p0M39203g;
        EnumC10172c enumC10172c;
        C10176g c10176g;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            C11189e.m42151a("Handling zip response.");
            EnumC10172c enumC10172c2 = EnumC10172c.ZIP;
            c5467p0M39203g = m39203g(context, str, inputStream, str3);
            enumC10172c = enumC10172c2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            C11189e.m42151a("Handling gzip response.");
            enumC10172c = EnumC10172c.GZIP;
            c5467p0M39203g = m39200d(str, inputStream, str3);
        } else {
            C11189e.m42151a("Received json response.");
            enumC10172c = EnumC10172c.JSON;
            c5467p0M39203g = m39202f(str, inputStream, str3);
        }
        if (str3 != null && c5467p0M39203g.m25072b() != null && (c10176g = this.f36745a) != null) {
            c10176g.m39195f(str, enumC10172c);
        }
        return c5467p0M39203g;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public final C5467p0<C5452i> m39202f(@NonNull String str, @NonNull InputStream inputStream, String str2) {
        C10176g c10176g;
        return (str2 == null || (c10176g = this.f36745a) == null) ? C5468q.m25098p(inputStream, null) : C5468q.m25098p(new FileInputStream(c10176g.m39196g(str, inputStream, EnumC10172c.JSON).getAbsolutePath()), str);
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public final C5467p0<C5452i> m39203g(Context context, @NonNull String str, @NonNull InputStream inputStream, String str2) {
        C10176g c10176g;
        return (str2 == null || (c10176g = this.f36745a) == null) ? C5468q.m25074B(context, new ZipInputStream(inputStream), null) : C5468q.m25074B(context, new ZipInputStream(new FileInputStream(c10176g.m39196g(str, inputStream, EnumC10172c.ZIP))), str);
    }
}
