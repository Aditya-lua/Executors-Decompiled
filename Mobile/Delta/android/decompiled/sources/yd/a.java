package yd;

import ae.d0;
import ae.q1;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
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
import zd.a1;
import zd.c0;
import zd.r0;
import zd.u0;
import zd.v0;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReference f35829e = new AtomicReference(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f35830a;
    public final c0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f35831c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f35832d;

    public a(Context context) {
        try {
            f fVar = new f(context);
            this.f35830a = fVar;
            this.f35832d = new b(fVar);
            this.b = new c0(context);
        } catch (PackageManager.NameNotFoundException e10) {
            throw new d0("Failed to initialize FileStorage", e10);
        }
    }

    public static boolean a(@NonNull Context context) {
        return k(context, false);
    }

    public static boolean b(@NonNull Context context) {
        if (l()) {
            return false;
        }
        a aVar = (a) f35829e.get();
        if (aVar != null) {
            return aVar.f35832d.b(context, aVar.h());
        }
        if (context.getApplicationContext() != null) {
            a(context.getApplicationContext());
        }
        return a(context);
    }

    public static boolean f(Context context) {
        return k(context, true);
    }

    public static boolean g() {
        return f35829e.get() != null;
    }

    public static boolean k(Context context, boolean z10) {
        boolean z11;
        final Context context2;
        if (l()) {
            return false;
        }
        AtomicReference atomicReference = f35829e;
        a aVar = new a(context);
        while (true) {
            if (p1.t.a(atomicReference, null, aVar)) {
                z11 = true;
                break;
            }
            if (atomicReference.get() != null) {
                z11 = false;
                break;
            }
        }
        a aVar2 = (a) f35829e.get();
        if (z11) {
            context2 = context;
            r0.INSTANCE.a(new ae.l(context2, e.a(), new ae.n(context, aVar2.f35830a, new ae.i()), aVar2.f35830a, new t()));
            u0.b(new q(aVar2));
            e.a().execute(new Runnable() { // from class: yd.p
                @Override // java.lang.Runnable
                public final void run() {
                    Context context3 = context2;
                    AtomicReference atomicReference2 = a.f35829e;
                    try {
                        a1.h(context3).c(true);
                    } catch (SecurityException unused) {
                        Log.e("SplitCompat", "Failed to set broadcast receiver to always on.");
                    }
                }
            });
        } else {
            context2 = context;
        }
        try {
            aVar2.j(context2, z10);
            return true;
        } catch (Exception e10) {
            Log.e("SplitCompat", "Error installing additional splits", e10);
            return false;
        }
    }

    public static boolean l() {
        return false;
    }

    public final Set h() {
        HashSet hashSet;
        synchronized (this.f35831c) {
            hashSet = new HashSet(this.f35831c);
        }
        return hashSet;
    }

    public final void i(Set set) throws IOException {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            f.l(this.f35830a.g((String) it.next()));
        }
        this.b.b();
    }

    public final synchronized void j(Context context, boolean z10) {
        ZipFile zipFile;
        try {
            if (z10) {
                this.f35830a.k();
            } else {
                e.a().execute(new r(this));
            }
            String packageName = context.getPackageName();
            try {
                String[] strArr = context.getPackageManager().getPackageInfo(packageName, 0).splitNames;
                List<String> arrayList = strArr == null ? new ArrayList() : Arrays.asList(strArr);
                Set<u> setJ = this.f35830a.j();
                Set setA = this.b.a();
                HashSet hashSet = new HashSet();
                Iterator it = setJ.iterator();
                while (it.hasNext()) {
                    String strB = ((u) it.next()).b();
                    if (arrayList.contains(strB) || setA.contains(v0.b(strB))) {
                        hashSet.add(strB);
                        it.remove();
                    }
                }
                if (z10) {
                    i(hashSet);
                } else if (!hashSet.isEmpty()) {
                    e.a().execute(new s(this, hashSet));
                }
                HashSet hashSet2 = new HashSet();
                Iterator it2 = setJ.iterator();
                while (it2.hasNext()) {
                    String strB2 = ((u) it2.next()).b();
                    if (!v0.e(strB2)) {
                        hashSet2.add(strB2);
                    }
                }
                for (String str : arrayList) {
                    if (!v0.e(str)) {
                        hashSet2.add(str);
                    }
                }
                HashSet<u> hashSet3 = new HashSet(setJ.size());
                for (u uVar : setJ) {
                    String strB3 = uVar.b();
                    q1 q1Var = v0.f37511c;
                    if (strB3.startsWith("config.") || hashSet2.contains(v0.b(uVar.b()))) {
                        hashSet3.add(uVar);
                    }
                }
                o oVar = new o(this.f35830a);
                ae.o oVarA = ae.p.a();
                ClassLoader classLoader = context.getClassLoader();
                if (z10) {
                    oVarA.b(classLoader, oVar.c());
                } else {
                    Iterator it3 = hashSet3.iterator();
                    while (it3.hasNext()) {
                        Set setB = oVar.b((u) it3.next());
                        if (setB == null) {
                            it3.remove();
                        } else {
                            oVarA.b(classLoader, setB);
                        }
                    }
                }
                HashSet hashSet4 = new HashSet();
                for (u uVar2 : hashSet3) {
                    try {
                        zipFile = new ZipFile(uVar2.a());
                        try {
                            ZipEntry entry = zipFile.getEntry("classes.dex");
                            zipFile.close();
                            if (entry == null || oVarA.a(classLoader, this.f35830a.a(uVar2.b()), uVar2.a(), z10)) {
                                hashSet4.add(uVar2.a());
                            } else {
                                Log.w("SplitCompat", "split was not installed ".concat(uVar2.a().toString()));
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
                this.f35832d.a(context, hashSet4);
                HashSet hashSet5 = new HashSet();
                for (u uVar3 : hashSet3) {
                    if (hashSet4.contains(uVar3.a())) {
                        Log.d("SplitCompat", "Split '" + uVar3.b() + "' installation emulated");
                        hashSet5.add(uVar3.b());
                    } else {
                        Log.d("SplitCompat", "Split '" + uVar3.b() + "' installation not emulated.");
                    }
                }
                synchronized (this.f35831c) {
                    this.f35831c.addAll(hashSet5);
                }
            } catch (PackageManager.NameNotFoundException e13) {
                throw new IOException(String.format("Cannot load data for application '%s'", packageName), e13);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
