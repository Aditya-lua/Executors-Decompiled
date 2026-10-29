package p601zd;

import ae.C0151a1;
import ae.C0156c0;
import ae.C0192u0;
import ae.C0194v0;
import ae.EnumC0186r0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import be.C1315d0;
import be.C1329i;
import be.C1338l;
import be.C1344n;
import be.C1350p;
import be.C1355q1;
import be.InterfaceC1347o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p348p1.C10146t;

/* JADX INFO: renamed from: zd.a */
/* JADX INFO: loaded from: classes2.dex */
public class C13772a {

    /* JADX INFO: renamed from: e */
    public static final AtomicReference f48354e = new AtomicReference(null);

    /* JADX INFO: renamed from: a */
    public final C13777f f48355a;

    /* JADX INFO: renamed from: b */
    public final C0156c0 f48356b;

    /* JADX INFO: renamed from: c */
    public final Set f48357c = new HashSet();

    /* JADX INFO: renamed from: d */
    public final C13773b f48358d;

    public C13772a(Context context) {
        try {
            C13777f c13777f = new C13777f(context);
            this.f48355a = c13777f;
            this.f48358d = new C13773b(c13777f);
            this.f48356b = new C0156c0(context);
        } catch (PackageManager.NameNotFoundException e10) {
            throw new C1315d0("Failed to initialize FileStorage", e10);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m50188a(@NonNull Context context) {
        return m50195k(context, false);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m50189b(@NonNull Context context) {
        if (m50196l()) {
            return false;
        }
        C13772a c13772a = (C13772a) f48354e.get();
        if (c13772a != null) {
            return c13772a.f48358d.m50202b(context, c13772a.m50197h());
        }
        if (context.getApplicationContext() != null) {
            m50188a(context.getApplicationContext());
        }
        return m50188a(context);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m50193f(Context context) {
        return m50195k(context, true);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m50194g() {
        return f48354e.get() != null;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m50195k(Context context, boolean z10) {
        boolean z11;
        final Context context2;
        if (m50196l()) {
            return false;
        }
        AtomicReference atomicReference = f48354e;
        C13772a c13772a = new C13772a(context);
        while (true) {
            if (C10146t.m39085a(atomicReference, null, c13772a)) {
                z11 = true;
                break;
            }
            if (atomicReference.get() != null) {
                z11 = false;
                break;
            }
        }
        C13772a c13772a2 = (C13772a) f48354e.get();
        if (z11) {
            context2 = context;
            EnumC0186r0.INSTANCE.m533a(new C1338l(context2, C13776e.m50205a(), new C1344n(context, c13772a2.f48355a, new C1329i()), c13772a2.f48355a, new C13791t()));
            C0192u0.m536b(new C13788q(c13772a2));
            C13776e.m50205a().execute(new Runnable() { // from class: zd.p
                @Override // java.lang.Runnable
                public final void run() {
                    Context context3 = context2;
                    AtomicReference atomicReference2 = C13772a.f48354e;
                    try {
                        C0151a1.m479h(context3).m7196c(true);
                    } catch (SecurityException unused) {
                        Log.e("SplitCompat", "Failed to set broadcast receiver to always on.");
                    }
                }
            });
        } else {
            context2 = context;
        }
        try {
            c13772a2.m50199j(context2, z10);
            return true;
        } catch (Exception e10) {
            Log.e("SplitCompat", "Error installing additional splits", e10);
            return false;
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m50196l() {
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final Set m50197h() {
        HashSet hashSet;
        synchronized (this.f48357c) {
            hashSet = new HashSet(this.f48357c);
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: i */
    public final void m50198i(Set set) throws IOException {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C13777f.m50206l(this.f48355a.m50218g((String) it.next()));
        }
        this.f48356b.m491b();
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m50199j(Context context, boolean z10) {
        ZipFile zipFile;
        try {
            if (z10) {
                this.f48355a.m50222k();
            } else {
                C13776e.m50205a().execute(new RunnableC13789r(this));
            }
            String packageName = context.getPackageName();
            try {
                String[] strArr = context.getPackageManager().getPackageInfo(packageName, 0).splitNames;
                List<String> arrayList = strArr == null ? new ArrayList() : Arrays.asList(strArr);
                Set<AbstractC13792u> setM50221j = this.f48355a.m50221j();
                Set setM490a = this.f48356b.m490a();
                HashSet hashSet = new HashSet();
                Iterator it = setM50221j.iterator();
                while (it.hasNext()) {
                    String strMo50204b = ((AbstractC13792u) it.next()).mo50204b();
                    if (arrayList.contains(strMo50204b) || setM490a.contains(C0194v0.m538b(strMo50204b))) {
                        hashSet.add(strMo50204b);
                        it.remove();
                    }
                }
                if (z10) {
                    m50198i(hashSet);
                } else if (!hashSet.isEmpty()) {
                    C13776e.m50205a().execute(new RunnableC13790s(this, hashSet));
                }
                HashSet hashSet2 = new HashSet();
                Iterator it2 = setM50221j.iterator();
                while (it2.hasNext()) {
                    String strMo50204b2 = ((AbstractC13792u) it2.next()).mo50204b();
                    if (!C0194v0.m539e(strMo50204b2)) {
                        hashSet2.add(strMo50204b2);
                    }
                }
                for (String str : arrayList) {
                    if (!C0194v0.m539e(str)) {
                        hashSet2.add(str);
                    }
                }
                HashSet<AbstractC13792u> hashSet3 = new HashSet(setM50221j.size());
                for (AbstractC13792u abstractC13792u : setM50221j) {
                    String strMo50204b3 = abstractC13792u.mo50204b();
                    C1355q1 c1355q1 = C0194v0.f594c;
                    if (strMo50204b3.startsWith("config.") || hashSet2.contains(C0194v0.m538b(abstractC13792u.mo50204b()))) {
                        hashSet3.add(abstractC13792u);
                    }
                }
                C13786o c13786o = new C13786o(this.f48355a);
                InterfaceC1347o interfaceC1347oM7200a = C1350p.m7200a();
                ClassLoader classLoader = context.getClassLoader();
                if (z10) {
                    interfaceC1347oM7200a.mo7102b(classLoader, c13786o.m50237c());
                } else {
                    Iterator it3 = hashSet3.iterator();
                    while (it3.hasNext()) {
                        Set setM50236b = c13786o.m50236b((AbstractC13792u) it3.next());
                        if (setM50236b == null) {
                            it3.remove();
                        } else {
                            interfaceC1347oM7200a.mo7102b(classLoader, setM50236b);
                        }
                    }
                }
                HashSet hashSet4 = new HashSet();
                for (AbstractC13792u abstractC13792u2 : hashSet3) {
                    try {
                        zipFile = new ZipFile(abstractC13792u2.mo50203a());
                        try {
                            ZipEntry entry = zipFile.getEntry("classes.dex");
                            zipFile.close();
                            if (entry == null || interfaceC1347oM7200a.mo7101a(classLoader, this.f48355a.m50212a(abstractC13792u2.mo50204b()), abstractC13792u2.mo50203a(), z10)) {
                                hashSet4.add(abstractC13792u2.mo50203a());
                            } else {
                                Log.w("SplitCompat", "split was not installed ".concat(abstractC13792u2.mo50203a().toString()));
                            }
                        } catch (IOException e10) {
                            e = e10;
                            if (zipFile != null) {
                                try {
                                    zipFile.close();
                                } catch (IOException e11) {
                                    try {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e11);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            throw e;
                        }
                    } catch (IOException e12) {
                        e = e12;
                        zipFile = null;
                    }
                }
                this.f48358d.m50201a(context, hashSet4);
                HashSet hashSet5 = new HashSet();
                for (AbstractC13792u abstractC13792u3 : hashSet3) {
                    if (hashSet4.contains(abstractC13792u3.mo50203a())) {
                        Log.d("SplitCompat", "Split '" + abstractC13792u3.mo50204b() + "' installation emulated");
                        hashSet5.add(abstractC13792u3.mo50204b());
                    } else {
                        Log.d("SplitCompat", "Split '" + abstractC13792u3.mo50204b() + "' installation not emulated.");
                    }
                }
                synchronized (this.f48357c) {
                    this.f48357c.addAll(hashSet5);
                }
            } catch (PackageManager.NameNotFoundException e13) {
                throw new IOException(String.format("Cannot load data for application '%s'", packageName), e13);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
