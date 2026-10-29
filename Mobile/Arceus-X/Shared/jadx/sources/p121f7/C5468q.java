package p121f7;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.google.mlkit.common.sdkinternal.Constants;
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
import p266l7.C8004c;
import p266l7.C8008g;
import p373q7.C10476w;
import p404r7.AbstractC10794c;
import p431s7.C11189e;
import p431s7.C11197m;
import p560xu.C12919b0;
import p560xu.InterfaceC12928g;
import p560xu.InterfaceC12951r0;

/* JADX INFO: renamed from: f7.q */
/* JADX INFO: loaded from: classes3.dex */
public class C5468q {

    /* JADX INFO: renamed from: a */
    public static final Map<String, C5473s0<C5452i>> f21193a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static final Set<InterfaceC5475t0> f21194b = new HashSet();

    /* JADX INFO: renamed from: c */
    public static final byte[] f21195c = {80, 75, 3, 4};

    /* JADX INFO: renamed from: d */
    public static final byte[] f21196d = {31, -117, 8};

    /* JADX INFO: renamed from: A */
    public static C5473s0<C5452i> m25073A(final Context context, final String str, final String str2) {
        return m25090h(str2, new Callable() { // from class: f7.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C5468q.m25084b(context, str, str2);
            }
        }, null);
    }

    /* JADX INFO: renamed from: B */
    public static C5467p0<C5452i> m25074B(Context context, ZipInputStream zipInputStream, String str) {
        return m25075C(context, zipInputStream, str, true);
    }

    /* JADX INFO: renamed from: C */
    public static C5467p0<C5452i> m25075C(Context context, ZipInputStream zipInputStream, String str, boolean z10) {
        try {
            return m25076D(context, zipInputStream, str);
        } finally {
            if (z10) {
                C11197m.m42214c(zipInputStream);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x014b A[Catch: IOException -> 0x02b0, TryCatch #4 {IOException -> 0x02b0, blocks: (B:7:0x0019, B:9:0x001f, B:12:0x0028, B:14:0x0034, B:75:0x017b, B:15:0x0039, B:17:0x0045, B:18:0x004a, B:20:0x0056, B:21:0x006f, B:24:0x0079, B:26:0x0081, B:28:0x0089, B:31:0x0093, B:33:0x009b, B:36:0x00a4, B:37:0x00a9, B:39:0x00bb, B:41:0x00dc, B:70:0x0141, B:72:0x014b, B:73:0x0168, B:69:0x0120, B:74:0x016c, B:5:0x000f, B:42:0x00e5, B:53:0x0106, B:68:0x011f, B:67:0x011c, B:64:0x0117, B:43:0x00ea, B:52:0x0103, B:63:0x0116, B:62:0x0113), top: B:131:0x000f, inners: #2 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x014b, please report this as an issue */
    /* JADX INFO: renamed from: D */
    public static C5467p0<C5452i> m25076D(Context context, ZipInputStream zipInputStream, String str) {
        C5452i c5452iM33086a;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            c5452iM33086a = null;
        } else {
            try {
                c5452iM33086a = C8008g.m33085b().m33086a(str);
            } catch (IOException e10) {
                return new C5467p0<>((Throwable) e10);
            }
        }
        if (c5452iM33086a != null) {
            return new C5467p0<>(c5452iM33086a);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        C5452i c5452iM25072b = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase(Constants.AUTOML_IMAGE_LABELING_MANIFEST_JSON_FILE_NAME)) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                c5452iM25072b = m25102t(AbstractC10794c.m41125n(C12919b0.m47961c(C12919b0.m47968j(zipInputStream))), null, false).m25072b();
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new C5467p0<>((Throwable) new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
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
                                C11189e.m42153c("Failed to delete temp font file " + file.getAbsolutePath() + ".");
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
                    C11189e.m42154d("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th6);
                    Typeface typefaceCreateFromFile2 = Typeface.createFromFile(file);
                    if (!file.delete()) {
                        C11189e.m42153c("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                    }
                    map2.put(str3, typefaceCreateFromFile2);
                    nextEntry = zipInputStream.getNextEntry();
                }
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (c5452iM25072b == null) {
            return new C5467p0<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            C5457k0 c5457k0M25091i = m25091i(c5452iM25072b, (String) entry.getKey());
            if (c5457k0M25091i != null) {
                c5457k0M25091i.m25066g(C11197m.m42224m((Bitmap) entry.getValue(), c5457k0M25091i.m25065f(), c5457k0M25091i.m25063d()));
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z10 = false;
            for (C8004c c8004c : c5452iM25072b.m25041g().values()) {
                if (c8004c.m33068a().equals(entry2.getKey())) {
                    c8004c.m33072e((Typeface) entry2.getValue());
                    z10 = true;
                }
            }
            if (!z10) {
                C11189e.m42153c("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator<Map.Entry<String, C5457k0>> it = c5452iM25072b.m25044j().entrySet().iterator();
            while (it.hasNext()) {
                C5457k0 value = it.next().getValue();
                if (value == null) {
                    return null;
                }
                String strM25062c = value.m25062c();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (strM25062c.startsWith("data:") && strM25062c.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(strM25062c.substring(strM25062c.indexOf(44) + 1), 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        if (bitmapDecodeByteArray != null) {
                            value.m25066g(C11197m.m42224m(bitmapDecodeByteArray, value.m25065f(), value.m25063d()));
                        }
                    } catch (IllegalArgumentException e11) {
                        C11189e.m42154d("data URL did not have correct base64 format.", e11);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            C8008g.m33085b().m33087c(str, c5452iM25072b);
        }
        return new C5467p0<>(c5452iM25072b);
    }

    /* JADX INFO: renamed from: E */
    public static Boolean m25077E(InterfaceC12928g interfaceC12928g) {
        return m25080H(interfaceC12928g, f21196d);
    }

    /* JADX INFO: renamed from: F */
    public static boolean m25078F(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* JADX INFO: renamed from: G */
    public static Boolean m25079G(InterfaceC12928g interfaceC12928g) {
        return m25080H(interfaceC12928g, f21195c);
    }

    /* JADX INFO: renamed from: H */
    public static Boolean m25080H(InterfaceC12928g interfaceC12928g, byte[] bArr) {
        try {
            InterfaceC12928g interfaceC12928gPeek = interfaceC12928g.peek();
            for (byte b : bArr) {
                if (interfaceC12928gPeek.readByte() != b) {
                    return Boolean.FALSE;
                }
            }
            interfaceC12928gPeek.close();
            return Boolean.TRUE;
        } catch (Exception e10) {
            C11189e.m42152b("Failed to check zip file header", e10);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m25081I(boolean z10) {
        ArrayList arrayList = new ArrayList(f21194b);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((InterfaceC5475t0) arrayList.get(i10)).m25121a(z10);
        }
    }

    /* JADX INFO: renamed from: J */
    public static String m25082J(Context context, int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("rawRes");
        sb2.append(m25078F(context) ? "_night_" : "_day_");
        sb2.append(i10);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m25083a(String str, AtomicBoolean atomicBoolean, Throwable th2) {
        Map<String, C5473s0<C5452i>> map = f21193a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            m25081I(true);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C5467p0 m25084b(Context context, String str, String str2) {
        C5467p0<C5452i> c5467p0M39199c = C5444e.m24931j(context).m39199c(context, str, str2);
        if (str2 != null && c5467p0M39199c.m25072b() != null) {
            C8008g.m33085b().m33087c(str2, c5467p0M39199c.m25072b());
        }
        return c5467p0M39199c;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C5467p0 m25085c(WeakReference weakReference, Context context, int i10, String str) {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return m25107y(context, i10, str);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m25089g(String str, AtomicBoolean atomicBoolean, C5452i c5452i) {
        Map<String, C5473s0<C5452i>> map = f21193a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            m25081I(true);
        }
    }

    /* JADX INFO: renamed from: h */
    public static C5473s0<C5452i> m25090h(final String str, Callable<C5467p0<C5452i>> callable, Runnable runnable) {
        C5452i c5452iM33086a = str == null ? null : C8008g.m33085b().m33086a(str);
        C5473s0<C5452i> c5473s0 = c5452iM33086a != null ? new C5473s0<>(c5452iM33086a) : null;
        if (str != null) {
            Map<String, C5473s0<C5452i>> map = f21193a;
            if (map.containsKey(str)) {
                c5473s0 = map.get(str);
            }
        }
        if (c5473s0 != null) {
            if (runnable != null) {
                runnable.run();
            }
            return c5473s0;
        }
        C5473s0<C5452i> c5473s1 = new C5473s0<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            c5473s1.m25112d(new InterfaceC5459l0() { // from class: f7.n
                @Override // p121f7.InterfaceC5459l0
                public final void onResult(Object obj) {
                    C5468q.m25089g(str, atomicBoolean, (C5452i) obj);
                }
            });
            c5473s1.m25111c(new InterfaceC5459l0() { // from class: f7.o
                @Override // p121f7.InterfaceC5459l0
                public final void onResult(Object obj) {
                    C5468q.m25083a(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, C5473s0<C5452i>> map2 = f21193a;
                map2.put(str, c5473s1);
                if (map2.size() == 1) {
                    m25081I(false);
                }
            }
        }
        return c5473s1;
    }

    /* JADX INFO: renamed from: i */
    public static C5457k0 m25091i(C5452i c5452i, String str) {
        for (C5457k0 c5457k0 : c5452i.m25044j().values()) {
            if (c5457k0.m25062c().equals(str)) {
                return c5457k0;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static C5473s0<C5452i> m25092j(Context context, String str) {
        return m25093k(context, str, "asset_" + str);
    }

    /* JADX INFO: renamed from: k */
    public static C5473s0<C5452i> m25093k(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return m25090h(str2, new Callable() { // from class: f7.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C5468q.m25095m(applicationContext, str, str2);
            }
        }, null);
    }

    /* JADX INFO: renamed from: l */
    public static C5467p0<C5452i> m25094l(Context context, String str) {
        return m25095m(context, str, "asset_" + str);
    }

    /* JADX INFO: renamed from: m */
    public static C5467p0<C5452i> m25095m(Context context, String str, String str2) {
        C5452i c5452iM33086a = str2 == null ? null : C8008g.m33085b().m33086a(str2);
        if (c5452iM33086a != null) {
            return new C5467p0<>(c5452iM33086a);
        }
        try {
            return m25096n(context, context.getAssets().open(str), str2);
        } catch (IOException e10) {
            return new C5467p0<>((Throwable) e10);
        }
    }

    /* JADX INFO: renamed from: n */
    public static C5467p0<C5452i> m25096n(Context context, InputStream inputStream, String str) {
        C5452i c5452iM33086a = str == null ? null : C8008g.m33085b().m33086a(str);
        if (c5452iM33086a != null) {
            return new C5467p0<>(c5452iM33086a);
        }
        try {
            InterfaceC12928g interfaceC12928gM47961c = C12919b0.m47961c(C12919b0.m47968j(inputStream));
            if (m25079G(interfaceC12928gM47961c).booleanValue()) {
                return m25074B(context, new ZipInputStream(interfaceC12928gM47961c.mo48051s3()), str);
            }
            return m25077E(interfaceC12928gM47961c).booleanValue() ? m25098p(new GZIPInputStream(interfaceC12928gM47961c.mo48051s3()), str) : m25100r(AbstractC10794c.m41125n(interfaceC12928gM47961c), str);
        } catch (IOException e10) {
            return new C5467p0<>((Throwable) e10);
        }
    }

    /* JADX INFO: renamed from: o */
    public static C5473s0<C5452i> m25097o(final InputStream inputStream, final String str) {
        return m25090h(str, new Callable() { // from class: f7.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C5468q.m25098p(inputStream, str);
            }
        }, new Runnable() { // from class: f7.l
            @Override // java.lang.Runnable
            public final void run() {
                C11197m.m42214c(inputStream);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static C5467p0<C5452i> m25098p(InputStream inputStream, String str) {
        return m25099q(inputStream, str, true);
    }

    /* JADX INFO: renamed from: q */
    public static C5467p0<C5452i> m25099q(InputStream inputStream, String str, boolean z10) {
        return m25103u(C12919b0.m47968j(inputStream), str, z10);
    }

    /* JADX INFO: renamed from: r */
    public static C5467p0<C5452i> m25100r(AbstractC10794c abstractC10794c, String str) {
        return m25101s(abstractC10794c, str, true);
    }

    /* JADX INFO: renamed from: s */
    public static C5467p0<C5452i> m25101s(AbstractC10794c abstractC10794c, String str, boolean z10) {
        return m25102t(abstractC10794c, str, z10);
    }

    /* JADX INFO: renamed from: t */
    public static C5467p0<C5452i> m25102t(AbstractC10794c abstractC10794c, String str, boolean z10) {
        try {
            C5452i c5452iM33086a = str == null ? null : C8008g.m33085b().m33086a(str);
            if (c5452iM33086a != null) {
                return new C5467p0<>(c5452iM33086a);
            }
            C5452i c5452iM40270a = C10476w.m40270a(abstractC10794c);
            if (str != null) {
                C8008g.m33085b().m33087c(str, c5452iM40270a);
            }
            return new C5467p0<>(c5452iM40270a);
        } catch (Exception e10) {
            return new C5467p0<>((Throwable) e10);
        } finally {
            if (z10) {
                C11197m.m42214c(abstractC10794c);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public static C5467p0<C5452i> m25103u(InterfaceC12951r0 interfaceC12951r0, String str, boolean z10) {
        return m25102t(AbstractC10794c.m41125n(C12919b0.m47961c(interfaceC12951r0)), str, z10);
    }

    /* JADX INFO: renamed from: v */
    public static C5473s0<C5452i> m25104v(Context context, int i10) {
        return m25105w(context, i10, m25082J(context, i10));
    }

    /* JADX INFO: renamed from: w */
    public static C5473s0<C5452i> m25105w(Context context, final int i10, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return m25090h(str, new Callable() { // from class: f7.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C5468q.m25085c(weakReference, applicationContext, i10, str);
            }
        }, null);
    }

    /* JADX INFO: renamed from: x */
    public static C5467p0<C5452i> m25106x(Context context, int i10) {
        return m25107y(context, i10, m25082J(context, i10));
    }

    /* JADX INFO: renamed from: y */
    public static C5467p0<C5452i> m25107y(Context context, int i10, String str) {
        C5452i c5452iM33086a = str == null ? null : C8008g.m33085b().m33086a(str);
        if (c5452iM33086a != null) {
            return new C5467p0<>(c5452iM33086a);
        }
        try {
            InterfaceC12928g interfaceC12928gM47961c = C12919b0.m47961c(C12919b0.m47968j(context.getResources().openRawResource(i10)));
            if (m25079G(interfaceC12928gM47961c).booleanValue()) {
                return m25074B(context, new ZipInputStream(interfaceC12928gM47961c.mo48051s3()), str);
            }
            if (!m25077E(interfaceC12928gM47961c).booleanValue()) {
                return m25100r(AbstractC10794c.m41125n(interfaceC12928gM47961c), str);
            }
            try {
                return m25098p(new GZIPInputStream(interfaceC12928gM47961c.mo48051s3()), str);
            } catch (IOException e10) {
                return new C5467p0<>((Throwable) e10);
            }
        } catch (Resources.NotFoundException e11) {
            return new C5467p0<>((Throwable) e11);
        }
    }

    /* JADX INFO: renamed from: z */
    public static C5473s0<C5452i> m25108z(Context context, String str) {
        return m25073A(context, str, "url_" + str);
    }
}
