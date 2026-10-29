package f7;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.google.mlkit.common.sdkinternal.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes3.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, s0<i>> f16449a = new HashMap();
    public static final Set<t0> b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f16450c = {80, 75, 3, 4};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f16451d = {31, -117, 8};

    public static s0<i> A(final Context context, final String str, final String str2) {
        return h(str2, new Callable() { // from class: f7.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return q.b(context, str, str2);
            }
        }, null);
    }

    public static p0<i> B(Context context, ZipInputStream zipInputStream, String str) {
        return C(context, zipInputStream, str, true);
    }

    public static p0<i> C(Context context, ZipInputStream zipInputStream, String str, boolean z10) {
        try {
            return D(context, zipInputStream, str);
        } finally {
            if (z10) {
                s7.m.c(zipInputStream);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x014b A[Catch: IOException -> 0x02b0, TryCatch #4 {IOException -> 0x02b0, blocks: (B:7:0x0019, B:9:0x001f, B:12:0x0028, B:14:0x0034, B:75:0x017b, B:15:0x0039, B:17:0x0045, B:18:0x004a, B:20:0x0056, B:21:0x006f, B:24:0x0079, B:26:0x0081, B:28:0x0089, B:31:0x0093, B:33:0x009b, B:36:0x00a4, B:37:0x00a9, B:39:0x00bb, B:41:0x00dc, B:70:0x0141, B:72:0x014b, B:73:0x0168, B:69:0x0120, B:74:0x016c, B:5:0x000f, B:42:0x00e5, B:53:0x0106, B:68:0x011f, B:67:0x011c, B:64:0x0117, B:43:0x00ea, B:52:0x0103, B:63:0x0116, B:62:0x0113), top: B:131:0x000f, inners: #2 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x014b, please report this as an issue */
    public static p0<i> D(Context context, ZipInputStream zipInputStream, String str) {
        i iVarA;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            iVarA = null;
        } else {
            try {
                iVarA = l7.g.b().a(str);
            } catch (IOException e10) {
                return new p0<>((Throwable) e10);
            }
        }
        if (iVarA != null) {
            return new p0<>(iVarA);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        i iVarB = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase(Constants.AUTOML_IMAGE_LABELING_MANIFEST_JSON_FILE_NAME)) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                iVarB = t(r7.c.n(xu.b0.c(xu.b0.j(zipInputStream))), null, false).b();
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new p0<>((Throwable) new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[Barcode.FORMAT_AZTEC];
                            while (true) {
                                int i10 = zipInputStream.read(bArr);
                                if (i10 == -1) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, i10);
                            }
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            fileOutputStream.close();
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                            if (!file.delete()) {
                                s7.e.c("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                            }
                            map2.put(str3, typefaceCreateFromFile);
                        } catch (Throwable th2) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    s7.e.d("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th6);
                    Typeface typefaceCreateFromFile2 = Typeface.createFromFile(file);
                    if (!file.delete()) {
                        s7.e.c("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                    }
                    map2.put(str3, typefaceCreateFromFile2);
                    nextEntry = zipInputStream.getNextEntry();
                }
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (iVarB == null) {
            return new p0<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            k0 k0VarI = i(iVarB, (String) entry.getKey());
            if (k0VarI != null) {
                k0VarI.g(s7.m.m((Bitmap) entry.getValue(), k0VarI.f(), k0VarI.d()));
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z10 = false;
            for (l7.c cVar : iVarB.g().values()) {
                if (cVar.a().equals(entry2.getKey())) {
                    cVar.e((Typeface) entry2.getValue());
                    z10 = true;
                }
            }
            if (!z10) {
                s7.e.c("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator<Map.Entry<String, k0>> it = iVarB.j().entrySet().iterator();
            while (it.hasNext()) {
                k0 value = it.next().getValue();
                if (value == null) {
                    return null;
                }
                String strC = value.c();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (strC.startsWith("data:") && strC.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(strC.substring(strC.indexOf(44) + 1), 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        if (bitmapDecodeByteArray != null) {
                            value.g(s7.m.m(bitmapDecodeByteArray, value.f(), value.d()));
                        }
                    } catch (IllegalArgumentException e11) {
                        s7.e.d("data URL did not have correct base64 format.", e11);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            l7.g.b().c(str, iVarB);
        }
        return new p0<>(iVarB);
    }

    public static Boolean E(xu.g gVar) {
        return H(gVar, f16451d);
    }

    public static boolean F(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static Boolean G(xu.g gVar) {
        return H(gVar, f16450c);
    }

    public static Boolean H(xu.g gVar, byte[] bArr) {
        try {
            xu.g gVarPeek = gVar.peek();
            for (byte b10 : bArr) {
                if (gVarPeek.readByte() != b10) {
                    return Boolean.FALSE;
                }
            }
            gVarPeek.close();
            return Boolean.TRUE;
        } catch (Exception e10) {
            s7.e.b("Failed to check zip file header", e10);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    public static void I(boolean z10) {
        ArrayList arrayList = new ArrayList(b);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((t0) arrayList.get(i10)).a(z10);
        }
    }

    public static String J(Context context, int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("rawRes");
        sb2.append(F(context) ? "_night_" : "_day_");
        sb2.append(i10);
        return sb2.toString();
    }

    public static /* synthetic */ void a(String str, AtomicBoolean atomicBoolean, Throwable th2) {
        Map<String, s0<i>> map = f16449a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            I(true);
        }
    }

    public static /* synthetic */ p0 b(Context context, String str, String str2) {
        p0<i> p0VarC = e.j(context).c(context, str, str2);
        if (str2 != null && p0VarC.b() != null) {
            l7.g.b().c(str2, p0VarC.b());
        }
        return p0VarC;
    }

    public static /* synthetic */ p0 c(WeakReference weakReference, Context context, int i10, String str) {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return y(context, i10, str);
    }

    public static /* synthetic */ void g(String str, AtomicBoolean atomicBoolean, i iVar) {
        Map<String, s0<i>> map = f16449a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            I(true);
        }
    }

    public static s0<i> h(final String str, Callable<p0<i>> callable, Runnable runnable) {
        i iVarA = str == null ? null : l7.g.b().a(str);
        s0<i> s0Var = iVarA != null ? new s0<>(iVarA) : null;
        if (str != null) {
            Map<String, s0<i>> map = f16449a;
            if (map.containsKey(str)) {
                s0Var = map.get(str);
            }
        }
        if (s0Var != null) {
            if (runnable != null) {
                runnable.run();
            }
            return s0Var;
        }
        s0<i> s0Var2 = new s0<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            s0Var2.d(new l0() { // from class: f7.n
                @Override // f7.l0
                public final void onResult(Object obj) {
                    q.g(str, atomicBoolean, (i) obj);
                }
            });
            s0Var2.c(new l0() { // from class: f7.o
                @Override // f7.l0
                public final void onResult(Object obj) {
                    q.a(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, s0<i>> map2 = f16449a;
                map2.put(str, s0Var2);
                if (map2.size() == 1) {
                    I(false);
                }
            }
        }
        return s0Var2;
    }

    public static k0 i(i iVar, String str) {
        for (k0 k0Var : iVar.j().values()) {
            if (k0Var.c().equals(str)) {
                return k0Var;
            }
        }
        return null;
    }

    public static s0<i> j(Context context, String str) {
        return k(context, str, "asset_" + str);
    }

    public static s0<i> k(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return h(str2, new Callable() { // from class: f7.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return q.m(applicationContext, str, str2);
            }
        }, null);
    }

    public static p0<i> l(Context context, String str) {
        return m(context, str, "asset_" + str);
    }

    public static p0<i> m(Context context, String str, String str2) {
        i iVarA = str2 == null ? null : l7.g.b().a(str2);
        if (iVarA != null) {
            return new p0<>(iVarA);
        }
        try {
            return n(context, context.getAssets().open(str), str2);
        } catch (IOException e10) {
            return new p0<>((Throwable) e10);
        }
    }

    public static p0<i> n(Context context, InputStream inputStream, String str) {
        i iVarA = str == null ? null : l7.g.b().a(str);
        if (iVarA != null) {
            return new p0<>(iVarA);
        }
        try {
            xu.g gVarC = xu.b0.c(xu.b0.j(inputStream));
            if (G(gVarC).booleanValue()) {
                return B(context, new ZipInputStream(gVarC.s3()), str);
            }
            return E(gVarC).booleanValue() ? p(new GZIPInputStream(gVarC.s3()), str) : r(r7.c.n(gVarC), str);
        } catch (IOException e10) {
            return new p0<>((Throwable) e10);
        }
    }

    public static s0<i> o(final InputStream inputStream, final String str) {
        return h(str, new Callable() { // from class: f7.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return q.p(inputStream, str);
            }
        }, new Runnable() { // from class: f7.l
            @Override // java.lang.Runnable
            public final void run() {
                s7.m.c(inputStream);
            }
        });
    }

    public static p0<i> p(InputStream inputStream, String str) {
        return q(inputStream, str, true);
    }

    public static p0<i> q(InputStream inputStream, String str, boolean z10) {
        return u(xu.b0.j(inputStream), str, z10);
    }

    public static p0<i> r(r7.c cVar, String str) {
        return s(cVar, str, true);
    }

    public static p0<i> s(r7.c cVar, String str, boolean z10) {
        return t(cVar, str, z10);
    }

    public static p0<i> t(r7.c cVar, String str, boolean z10) {
        try {
            i iVarA = str == null ? null : l7.g.b().a(str);
            if (iVarA != null) {
                return new p0<>(iVarA);
            }
            i iVarA2 = q7.w.a(cVar);
            if (str != null) {
                l7.g.b().c(str, iVarA2);
            }
            return new p0<>(iVarA2);
        } catch (Exception e10) {
            return new p0<>((Throwable) e10);
        } finally {
            if (z10) {
                s7.m.c(cVar);
            }
        }
    }

    public static p0<i> u(xu.r0 r0Var, String str, boolean z10) {
        return t(r7.c.n(xu.b0.c(r0Var)), str, z10);
    }

    public static s0<i> v(Context context, int i10) {
        return w(context, i10, J(context, i10));
    }

    public static s0<i> w(Context context, final int i10, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return h(str, new Callable() { // from class: f7.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return q.c(weakReference, applicationContext, i10, str);
            }
        }, null);
    }

    public static p0<i> x(Context context, int i10) {
        return y(context, i10, J(context, i10));
    }

    public static p0<i> y(Context context, int i10, String str) {
        i iVarA = str == null ? null : l7.g.b().a(str);
        if (iVarA != null) {
            return new p0<>(iVarA);
        }
        try {
            xu.g gVarC = xu.b0.c(xu.b0.j(context.getResources().openRawResource(i10)));
            if (G(gVarC).booleanValue()) {
                return B(context, new ZipInputStream(gVarC.s3()), str);
            }
            if (!E(gVarC).booleanValue()) {
                return r(r7.c.n(gVarC), str);
            }
            try {
                return p(new GZIPInputStream(gVarC.s3()), str);
            } catch (IOException e10) {
                return new p0<>((Throwable) e10);
            }
        } catch (Resources.NotFoundException e11) {
            return new p0<>((Throwable) e11);
        }
    }

    public static s0<i> z(Context context, String str) {
        return A(context, str, "url_" + str);
    }
}
