package de;

import ae.j0;
import ae.n0;
import ae.r0;
import ae.v0;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import be.o0;
import be.p1;
import be.s0;
import be.t0;
import be.u0;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class a implements ae.b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f14588p = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f14589q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f14590a;
    public final Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0 f14591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u0 f14592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o0 f14593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p1 f14594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p1 f14595g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f14596h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j0 f14597i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final File f14598j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicReference f14599k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Set f14600l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Set f14601m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f14602n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final k f14603o;

    public a(Context context, File file, v0 v0Var, u0 u0Var) {
        Executor executorA = zd.e.a();
        o0 o0Var = new o0(context);
        k kVar = new Object() { // from class: de.k
        };
        this.f14590a = new Handler(Looper.getMainLooper());
        this.f14599k = new AtomicReference();
        this.f14600l = Collections.synchronizedSet(new HashSet());
        this.f14601m = Collections.synchronizedSet(new HashSet());
        this.f14602n = new AtomicBoolean(false);
        this.b = context;
        this.f14598j = file;
        this.f14591c = v0Var;
        this.f14592d = u0Var;
        this.f14596h = executorA;
        this.f14593e = o0Var;
        this.f14603o = kVar;
        this.f14595g = new p1();
        this.f14594f = new p1();
        this.f14597i = r0.INSTANCE;
    }

    public static String s(String str) {
        return str.split("\\.config\\.", 2)[0];
    }

    @Override // ae.b
    public final Task<Integer> a(ae.d dVar) {
        Integer numA;
        int i10;
        File[] fileArr;
        try {
            final ae.d dVar2 = dVar;
            ae.e eVarR = r(new r() { // from class: de.l
                @Override // de.r
                public final ae.e a(final ae.e eVar) {
                    final ae.d dVar3 = dVar2;
                    return (ae.e) t0.c(new Callable() { // from class: de.o
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws ae.a {
                            ae.e eVar2 = eVar;
                            ae.d dVar4 = dVar3;
                            int i11 = a.f14589q;
                            if (eVar2 == null || eVar2.d()) {
                                return ae.e.b(eVar2 != null ? 1 + eVar2.h() : 1, 1, 0, 0L, 0L, dVar4.b(), new ArrayList());
                            }
                            throw new ae.a(-1);
                        }
                    });
                }
            });
            if (eVarR == null) {
                return o(-100);
            }
            int iH = eVarR.h();
            final ArrayList arrayList = new ArrayList();
            Iterator<Locale> it = dVar2.a().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getLanguage());
            }
            HashSet hashSet = new HashSet();
            final ArrayList arrayList2 = new ArrayList();
            File[] fileArrListFiles = this.f14598j.listFiles(new FileFilter() { // from class: de.m
                @Override // java.io.FileFilter
                public final boolean accept(File file) {
                    int i11 = a.f14589q;
                    return file.getName().endsWith(".apk");
                }
            });
            if (fileArrListFiles == null) {
                Log.w("FakeSplitInstallManager", "Specified splits directory does not exist.");
                return o(-5);
            }
            int i11 = 0;
            long length = 0;
            while (i11 < fileArrListFiles.length) {
                File file = fileArrListFiles[i11];
                String strA = s0.a(file);
                String strS = s(strA);
                hashSet.add(strA);
                if (dVar2.b().contains(strS)) {
                    String strS2 = s(strA);
                    HashSet<String> hashSet2 = new HashSet(this.f14593e.a());
                    Map mapA = p().a(Arrays.asList(strS2));
                    HashSet hashSet3 = new HashSet();
                    Iterator it2 = mapA.values().iterator();
                    while (it2.hasNext()) {
                        hashSet3.addAll((Set) it2.next());
                        iH = iH;
                    }
                    i10 = iH;
                    HashSet hashSet4 = new HashSet();
                    for (String str : hashSet2) {
                        File[] fileArr2 = fileArrListFiles;
                        if (str.contains("_")) {
                            str = str.split("_", -1)[0];
                        }
                        hashSet4.add(str);
                        fileArrListFiles = fileArr2;
                        mapA = mapA;
                    }
                    fileArr = fileArrListFiles;
                    hashSet4.addAll(this.f14601m);
                    hashSet4.addAll(arrayList);
                    HashSet hashSet5 = new HashSet();
                    for (Map.Entry entry : mapA.entrySet()) {
                        if (hashSet4.contains(entry.getKey())) {
                            hashSet5.addAll((Collection) entry.getValue());
                        }
                    }
                    if (!hashSet3.contains(strA) || hashSet5.contains(strA)) {
                        length += file.length();
                        arrayList2.add(file);
                        break;
                    }
                    i11++;
                    dVar2 = dVar;
                    fileArrListFiles = fileArr;
                    iH = i10;
                } else {
                    i10 = iH;
                    fileArr = fileArrListFiles;
                }
                List<Locale> listA = dVar.a();
                ArrayList arrayList3 = new ArrayList(this.f14600l);
                arrayList3.addAll(Arrays.asList("", "base"));
                Map mapA2 = p().a(arrayList3);
                for (Locale locale : listA) {
                    if (mapA2.containsKey(locale.getLanguage()) && ((Set) mapA2.get(locale.getLanguage())).contains(strA)) {
                        length += file.length();
                        arrayList2.add(file);
                        break;
                        break;
                    }
                }
                i11++;
                dVar2 = dVar;
                fileArrListFiles = fileArr;
                iH = i10;
            }
            int i12 = iH;
            Log.i("FakeSplitInstallManager", "availableSplits " + hashSet.toString() + " want " + String.valueOf(dVar.b()));
            if (dVar.b().size() != 1 || (numA = (Integer) ((v) this.f14592d.zza()).b().get(dVar.b().get(0))) == null) {
                numA = ((v) this.f14592d.zza()).a();
            }
            if (numA != null) {
                return o(numA.intValue());
            }
            if (!hashSet.containsAll(new HashSet(dVar.b()))) {
                return o(-2);
            }
            Long lValueOf = Long.valueOf(length);
            List<String> listB = dVar.b();
            Integer numValueOf = Integer.valueOf(i12);
            w(1, 0, 0L, lValueOf, listB, numValueOf, arrayList);
            this.f14596h.execute(new Runnable() { // from class: de.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14627a.m(arrayList2, arrayList);
                }
            });
            return sb.m.f(numValueOf);
        } catch (t0 e10) {
            return o(((ae.a) e10.b(ae.a.class)).c());
        }
    }

    @Override // ae.b
    public final void b(ae.f fVar) {
        this.f14595g.b(fVar);
    }

    @Override // ae.b
    public final void c(ae.f fVar) {
        this.f14595g.a(fVar);
    }

    @Override // ae.b
    public final Task<Void> d(List<String> list) {
        return sb.m.e(new ae.a(-5));
    }

    @Override // ae.b
    public final Set<String> e() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f14591c.c());
        hashSet.addAll(this.f14600l);
        return hashSet;
    }

    @Override // ae.b
    public final Task<Void> f(List<String> list) {
        return sb.m.e(new ae.a(-5));
    }

    public final File g() {
        return this.f14598j;
    }

    public final /* synthetic */ void j(final long j10, final List list, final List list2, final List list3) {
        long jMin = 0;
        for (int i10 = 0; i10 < 3; i10++) {
            jMin = Math.min(j10, jMin + (j10 / 3));
            w(2, 0, Long.valueOf(jMin), Long.valueOf(j10), null, null, null);
            SystemClock.sleep(f14588p);
            ae.e eVarQ = q();
            if (eVarQ.i() == 9 || eVarQ.i() == 7 || eVarQ.i() == 6) {
                return;
            }
        }
        this.f14596h.execute(new Runnable() { // from class: de.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f14609a.l(list, list2, list3, j10);
            }
        });
    }

    public final /* synthetic */ void k(ae.e eVar) {
        this.f14594f.c(eVar);
        this.f14595g.c(eVar);
    }

    public final /* synthetic */ void l(List list, List list2, List list3, long j10) {
        if (this.f14602n.get()) {
            w(6, -6, null, null, null, null, null);
        } else if (this.f14597i.zza() != null) {
            t(list, list2, list3, j10, false);
        } else {
            v(list2, list3, j10);
        }
    }

    public final /* synthetic */ void m(List list, final List list2) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            String strA = s0.a(file);
            Uri uriFromFile = Uri.fromFile(file);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriFromFile, this.b.getContentResolver().getType(uriFromFile));
            intent.addFlags(1);
            intent.putExtra("module_name", s(strA));
            intent.putExtra("split_id", strA);
            arrayList.add(intent);
            arrayList2.add(s(s0.a(file)));
        }
        ae.e eVarQ = q();
        if (eVarQ == null) {
            return;
        }
        final long j10 = eVarQ.j();
        this.f14596h.execute(new Runnable() { // from class: de.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f14620a.j(j10, arrayList, arrayList2, list2);
            }
        });
    }

    public final Task o(final int i10) {
        r(new r() { // from class: de.p
            @Override // de.r
            public final ae.e a(ae.e eVar) {
                int i11 = i10;
                int i12 = a.f14589q;
                if (eVar == null) {
                    return null;
                }
                return ae.e.b(eVar.h(), 6, i11, eVar.a(), eVar.j(), eVar.f(), eVar.e());
            }
        });
        return sb.m.e(new ae.a(i10));
    }

    public final n0 p() {
        try {
            n0 n0VarA = this.f14591c.a(this.b.getPackageManager().getPackageInfo(this.b.getPackageName(), 128).applicationInfo.metaData);
            if (n0VarA != null) {
                return n0VarA;
            }
            throw new IllegalStateException("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
        } catch (PackageManager.NameNotFoundException e10) {
            throw new IllegalStateException("App is not found in PackageManager", e10);
        }
    }

    public final ae.e q() {
        return (ae.e) this.f14599k.get();
    }

    public final synchronized ae.e r(r rVar) {
        ae.e eVarQ = q();
        ae.e eVarA = rVar.a(eVarQ);
        AtomicReference atomicReference = this.f14599k;
        while (!p1.t.a(atomicReference, eVarQ, eVarA)) {
            if (atomicReference.get() != eVarQ) {
                return null;
            }
        }
        return eVarA;
    }

    public final void t(List list, List list2, List list3, long j10, boolean z10) {
        this.f14597i.zza().a(list, new q(this, list2, list3, j10, z10, list));
    }

    public final void u(final ae.e eVar) {
        this.f14590a.post(new Runnable() { // from class: de.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f14613a.k(eVar);
            }
        });
    }

    public final void v(List list, List list2, long j10) {
        this.f14600l.addAll(list);
        this.f14601m.addAll(list2);
        Long lValueOf = Long.valueOf(j10);
        w(5, 0, lValueOf, lValueOf, null, null, null);
    }

    public final boolean w(final int i10, final int i11, final Long l10, final Long l11, final List list, final Integer num, final List list2) {
        ae.e eVarR = r(new r() { // from class: de.i
            @Override // de.r
            public final ae.e a(ae.e eVar) {
                Integer num2 = num;
                int i12 = i10;
                int i13 = i11;
                Long l12 = l10;
                Long l13 = l11;
                List<String> listF = list;
                List<String> listE = list2;
                int i14 = a.f14589q;
                ae.e eVarB = eVar == null ? ae.e.b(0, 0, 0, 0L, 0L, new ArrayList(), new ArrayList()) : eVar;
                int iH = num2 == null ? eVarB.h() : num2.intValue();
                long jA = l12 == null ? eVarB.a() : l12.longValue();
                long j10 = l13 == null ? eVarB.j() : l13.longValue();
                if (listF == null) {
                    listF = eVarB.f();
                }
                if (listE == null) {
                    listE = eVarB.e();
                }
                return ae.e.b(iH, i12, i13, jA, j10, listF, listE);
            }
        });
        if (eVarR == null) {
            return false;
        }
        u(eVarR);
        return true;
    }
}
