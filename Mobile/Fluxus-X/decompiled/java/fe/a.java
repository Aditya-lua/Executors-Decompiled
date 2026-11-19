package fe;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import ce.j0;
import ce.n0;
import ce.r0;
import ce.v0;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.barcode.common.Barcode;
import de.o0;
import de.p1;
import de.s0;
import de.t0;
import de.u0;
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
public class a implements ce.b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f15925p = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f15926q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f15927a;
    public final Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0 f15928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u0 f15929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o0 f15930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p1 f15931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p1 f15932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f15933h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j0 f15934i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final File f15935j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicReference f15936k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Set f15937l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Set f15938m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f15939n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final k f15940o;

    public a(Context context, File file, v0 v0Var, u0 u0Var) {
        Executor executorA = be.e.a();
        o0 o0Var = new o0(context);
        k kVar = new Object() { // from class: fe.k
        };
        this.f15927a = new Handler(Looper.getMainLooper());
        this.f15936k = new AtomicReference();
        this.f15937l = Collections.synchronizedSet(new HashSet());
        this.f15938m = Collections.synchronizedSet(new HashSet());
        this.f15939n = new AtomicBoolean(false);
        this.b = context;
        this.f15935j = file;
        this.f15928c = v0Var;
        this.f15929d = u0Var;
        this.f15933h = executorA;
        this.f15930e = o0Var;
        this.f15940o = kVar;
        this.f15932g = new p1();
        this.f15931f = new p1();
        this.f15934i = r0.INSTANCE;
    }

    public static String s(String str) {
        return str.split("\\.config\\.", 2)[0];
    }

    @Override // ce.b
    public final Task<Void> a(List<String> list) {
        return tb.m.e(new ce.a(-5));
    }

    @Override // ce.b
    public final Set<String> b() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f15928c.c());
        hashSet.addAll(this.f15937l);
        return hashSet;
    }

    @Override // ce.b
    public final void c(ce.f fVar) {
        this.f15932g.a(fVar);
    }

    @Override // ce.b
    public final Task<Integer> d(ce.d dVar) {
        Integer numA;
        int i10;
        File[] fileArr;
        try {
            final ce.d dVar2 = dVar;
            ce.e eVarR = r(new r() { // from class: fe.l
                @Override // fe.r
                public final ce.e a(final ce.e eVar) {
                    final ce.d dVar3 = dVar2;
                    return (ce.e) t0.c(new Callable() { // from class: fe.o
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws ce.a {
                            ce.e eVar2 = eVar;
                            ce.d dVar4 = dVar3;
                            int i11 = a.f15926q;
                            if (eVar2 == null || eVar2.d()) {
                                return ce.e.b(eVar2 != null ? 1 + eVar2.h() : 1, 1, 0, 0L, 0L, dVar4.b(), new ArrayList());
                            }
                            throw new ce.a(-1);
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
            File[] fileArrListFiles = this.f15935j.listFiles(new FileFilter() { // from class: fe.m
                @Override // java.io.FileFilter
                public final boolean accept(File file) {
                    int i11 = a.f15926q;
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
                    HashSet<String> hashSet2 = new HashSet(this.f15930e.a());
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
                    hashSet4.addAll(this.f15938m);
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
                ArrayList arrayList3 = new ArrayList(this.f15937l);
                arrayList3.addAll(Arrays.asList(BuildConfig.FLAVOR, "base"));
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
            if (dVar.b().size() != 1 || (numA = (Integer) ((v) this.f15929d.zza()).b().get(dVar.b().get(0))) == null) {
                numA = ((v) this.f15929d.zza()).a();
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
            this.f15933h.execute(new Runnable() { // from class: fe.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15964a.m(arrayList2, arrayList);
                }
            });
            return tb.m.f(numValueOf);
        } catch (t0 e10) {
            return o(((ce.a) e10.b(ce.a.class)).c());
        }
    }

    @Override // ce.b
    public final Task<Void> e(List<String> list) {
        return tb.m.e(new ce.a(-5));
    }

    @Override // ce.b
    public final void f(ce.f fVar) {
        this.f15932g.b(fVar);
    }

    public final File g() {
        return this.f15935j;
    }

    public final /* synthetic */ void j(final long j10, final List list, final List list2, final List list3) {
        long jMin = 0;
        for (int i10 = 0; i10 < 3; i10++) {
            jMin = Math.min(j10, jMin + (j10 / 3));
            w(2, 0, Long.valueOf(jMin), Long.valueOf(j10), null, null, null);
            SystemClock.sleep(f15925p);
            ce.e eVarQ = q();
            if (eVarQ.i() == 9 || eVarQ.i() == 7 || eVarQ.i() == 6) {
                return;
            }
        }
        this.f15933h.execute(new Runnable() { // from class: fe.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f15946a.l(list, list2, list3, j10);
            }
        });
    }

    public final /* synthetic */ void k(ce.e eVar) {
        this.f15931f.c(eVar);
        this.f15932g.c(eVar);
    }

    public final /* synthetic */ void l(List list, List list2, List list3, long j10) {
        if (this.f15939n.get()) {
            w(6, -6, null, null, null, null, null);
        } else if (this.f15934i.zza() != null) {
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
        ce.e eVarQ = q();
        if (eVarQ == null) {
            return;
        }
        final long j10 = eVarQ.j();
        this.f15933h.execute(new Runnable() { // from class: fe.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f15957a.j(j10, arrayList, arrayList2, list2);
            }
        });
    }

    public final Task o(final int i10) {
        r(new r() { // from class: fe.p
            @Override // fe.r
            public final ce.e a(ce.e eVar) {
                int i11 = i10;
                int i12 = a.f15926q;
                if (eVar == null) {
                    return null;
                }
                return ce.e.b(eVar.h(), 6, i11, eVar.a(), eVar.j(), eVar.f(), eVar.e());
            }
        });
        return tb.m.e(new ce.a(i10));
    }

    public final n0 p() {
        try {
            n0 n0VarA = this.f15928c.a(this.b.getPackageManager().getPackageInfo(this.b.getPackageName(), Barcode.FORMAT_ITF).applicationInfo.metaData);
            if (n0VarA != null) {
                return n0VarA;
            }
            throw new IllegalStateException("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
        } catch (PackageManager.NameNotFoundException e10) {
            throw new IllegalStateException("App is not found in PackageManager", e10);
        }
    }

    public final ce.e q() {
        return (ce.e) this.f15936k.get();
    }

    public final synchronized ce.e r(r rVar) {
        ce.e eVarQ = q();
        ce.e eVarA = rVar.a(eVarQ);
        AtomicReference atomicReference = this.f15936k;
        while (!p1.t.a(atomicReference, eVarQ, eVarA)) {
            if (atomicReference.get() != eVarQ) {
                return null;
            }
        }
        return eVarA;
    }

    public final void t(List list, List list2, List list3, long j10, boolean z10) {
        this.f15934i.zza().a(list, new q(this, list2, list3, j10, z10, list));
    }

    public final void u(final ce.e eVar) {
        this.f15927a.post(new Runnable() { // from class: fe.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f15950a.k(eVar);
            }
        });
    }

    public final void v(List list, List list2, long j10) {
        this.f15937l.addAll(list);
        this.f15938m.addAll(list2);
        Long lValueOf = Long.valueOf(j10);
        w(5, 0, lValueOf, lValueOf, null, null, null);
    }

    public final boolean w(final int i10, final int i11, final Long l10, final Long l11, final List list, final Integer num, final List list2) {
        ce.e eVarR = r(new r() { // from class: fe.i
            @Override // fe.r
            public final ce.e a(ce.e eVar) {
                Integer num2 = num;
                int i12 = i10;
                int i13 = i11;
                Long l12 = l10;
                Long l13 = l11;
                List<String> listF = list;
                List<String> listE = list2;
                int i14 = a.f15926q;
                ce.e eVarB = eVar == null ? ce.e.b(0, 0, 0, 0L, 0L, new ArrayList(), new ArrayList()) : eVar;
                int iH = num2 == null ? eVarB.h() : num2.intValue();
                long jA = l12 == null ? eVarB.a() : l12.longValue();
                long j10 = l13 == null ? eVarB.j() : l13.longValue();
                if (listF == null) {
                    listF = eVarB.f();
                }
                if (listE == null) {
                    listE = eVarB.e();
                }
                return ce.e.b(iH, i12, i13, jA, j10, listF, listE);
            }
        });
        if (eVarR == null) {
            return false;
        }
        u(eVarR);
        return true;
    }
}
