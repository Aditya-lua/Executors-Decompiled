package p7;

import android.content.Context;
import android.util.Pair;
import androidx.annotation.NonNull;
import f7.i;
import f7.p0;
import f7.q;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f28382a;

    @NonNull
    public final f b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28383a;

        static {
            int[] iArr = new int[c.values().length];
            f28383a = iArr;
            try {
                iArr[c.ZIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28383a[c.GZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public h(g gVar, @NonNull f fVar) {
        this.f28382a = gVar;
        this.b = fVar;
    }

    public final i a(Context context, @NonNull String str, String str2) {
        g gVar;
        Pair<c, InputStream> pairA;
        p0<i> p0VarB;
        if (str2 == null || (gVar = this.f28382a) == null || (pairA = gVar.a(str)) == null) {
            return null;
        }
        c cVar = (c) pairA.first;
        InputStream inputStream = (InputStream) pairA.second;
        int i10 = a.f28383a[cVar.ordinal()];
        if (i10 == 1) {
            p0VarB = q.B(context, new ZipInputStream(inputStream), str2);
        } else if (i10 != 2) {
            p0VarB = q.p(inputStream, str2);
        } else {
            try {
                p0VarB = q.p(new GZIPInputStream(inputStream), str2);
            } catch (IOException e10) {
                p0VarB = new p0<>(e10);
            }
        }
        if (p0VarB.b() != null) {
            return p0VarB.b();
        }
        return null;
    }

    @NonNull
    public final p0<i> b(Context context, @NonNull String str, String str2) {
        p0<i> p0Var;
        s7.e.a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                d dVarA = this.b.a(str);
                if (dVarA.isSuccessful()) {
                    p0Var = e(context, str, dVarA.I0(), dVarA.B0(), str2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Completed fetch from network. Success: ");
                    sb2.append(p0Var.b() != null);
                    s7.e.a(sb2.toString());
                } else {
                    p0Var = new p0<>(new IllegalArgumentException(dVarA.u2()));
                }
                try {
                    dVarA.close();
                    return p0Var;
                } catch (IOException e10) {
                    s7.e.d("LottieFetchResult close failed ", e10);
                    return p0Var;
                }
            } catch (Exception e11) {
                p0<i> p0Var2 = new p0<>(e11);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e12) {
                        s7.e.d("LottieFetchResult close failed ", e12);
                    }
                }
                return p0Var2;
            }
        } catch (Throwable th2) {
            if (0 == 0) {
                throw th2;
            }
            try {
                closeable.close();
                throw th2;
            } catch (IOException e13) {
                s7.e.d("LottieFetchResult close failed ", e13);
                throw th2;
            }
        }
    }

    @NonNull
    public p0<i> c(Context context, @NonNull String str, String str2) {
        i iVarA = a(context, str, str2);
        if (iVarA != null) {
            return new p0<>(iVarA);
        }
        s7.e.a("Animation for " + str + " not found in cache. Fetching from network.");
        return b(context, str, str2);
    }

    @NonNull
    public final p0<i> d(@NonNull String str, @NonNull InputStream inputStream, String str2) {
        g gVar;
        return (str2 == null || (gVar = this.f28382a) == null) ? q.p(new GZIPInputStream(inputStream), null) : q.p(new GZIPInputStream(new FileInputStream(gVar.g(str, inputStream, c.GZIP))), str);
    }

    @NonNull
    public final p0<i> e(Context context, @NonNull String str, @NonNull InputStream inputStream, String str2, String str3) {
        p0<i> p0VarG;
        c cVar;
        g gVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            s7.e.a("Handling zip response.");
            c cVar2 = c.ZIP;
            p0VarG = g(context, str, inputStream, str3);
            cVar = cVar2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            s7.e.a("Handling gzip response.");
            cVar = c.GZIP;
            p0VarG = d(str, inputStream, str3);
        } else {
            s7.e.a("Received json response.");
            cVar = c.JSON;
            p0VarG = f(str, inputStream, str3);
        }
        if (str3 != null && p0VarG.b() != null && (gVar = this.f28382a) != null) {
            gVar.f(str, cVar);
        }
        return p0VarG;
    }

    @NonNull
    public final p0<i> f(@NonNull String str, @NonNull InputStream inputStream, String str2) {
        g gVar;
        return (str2 == null || (gVar = this.f28382a) == null) ? q.p(inputStream, null) : q.p(new FileInputStream(gVar.g(str, inputStream, c.JSON).getAbsolutePath()), str);
    }

    @NonNull
    public final p0<i> g(Context context, @NonNull String str, @NonNull InputStream inputStream, String str2) {
        g gVar;
        return (str2 == null || (gVar = this.f28382a) == null) ? q.B(context, new ZipInputStream(inputStream), null) : q.B(context, new ZipInputStream(new FileInputStream(gVar.g(str, inputStream, c.ZIP))), str);
    }
}
