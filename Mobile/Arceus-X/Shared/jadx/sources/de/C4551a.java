package de;

import ae.AbstractC0159e;
import ae.C0149a;
import ae.C0157d;
import ae.C0178n0;
import ae.C0194v0;
import ae.EnumC0186r0;
import ae.InterfaceC0152b;
import ae.InterfaceC0161f;
import ae.InterfaceC0170j0;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import be.C1348o0;
import be.C1352p1;
import be.C1360s0;
import be.C1363t0;
import be.InterfaceC1366u0;
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
import p348p1.C10146t;
import p601zd.C13776e;
import sb.C11268m;

/* JADX INFO: renamed from: de.a */
/* JADX INFO: loaded from: classes2.dex */
public class C4551a implements InterfaceC0152b {

    /* JADX INFO: renamed from: p */
    public static final long f18648p = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ int f18649q = 0;

    /* JADX INFO: renamed from: a */
    public final Handler f18650a;

    /* JADX INFO: renamed from: b */
    public final Context f18651b;

    /* JADX INFO: renamed from: c */
    public final C0194v0 f18652c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1366u0 f18653d;

    /* JADX INFO: renamed from: e */
    public final C1348o0 f18654e;

    /* JADX INFO: renamed from: f */
    public final C1352p1 f18655f;

    /* JADX INFO: renamed from: g */
    public final C1352p1 f18656g;

    /* JADX INFO: renamed from: h */
    public final Executor f18657h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC0170j0 f18658i;

    /* JADX INFO: renamed from: j */
    public final File f18659j;

    /* JADX INFO: renamed from: k */
    public final AtomicReference f18660k;

    /* JADX INFO: renamed from: l */
    public final Set f18661l;

    /* JADX INFO: renamed from: m */
    public final Set f18662m;

    /* JADX INFO: renamed from: n */
    public final AtomicBoolean f18663n;

    /* JADX INFO: renamed from: o */
    public final C4561k f18664o;

    public C4551a(Context context, File file, C0194v0 c0194v0, InterfaceC1366u0 interfaceC1366u0) {
        Executor executorM50205a = C13776e.m50205a();
        C1348o0 c1348o0 = new C1348o0(context);
        C4561k c4561k = new Object() { // from class: de.k
        };
        this.f18650a = new Handler(Looper.getMainLooper());
        this.f18660k = new AtomicReference();
        this.f18661l = Collections.synchronizedSet(new HashSet());
        this.f18662m = Collections.synchronizedSet(new HashSet());
        this.f18663n = new AtomicBoolean(false);
        this.f18651b = context;
        this.f18659j = file;
        this.f18652c = c0194v0;
        this.f18653d = interfaceC1366u0;
        this.f18657h = executorM50205a;
        this.f18654e = c1348o0;
        this.f18664o = c4561k;
        this.f18656g = new C1352p1();
        this.f18655f = new C1352p1();
        this.f18658i = EnumC0186r0.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static String m22602s(String str) {
        return str.split("\\.config\\.", 2)[0];
    }

    @Override // ae.InterfaceC0152b
    /* JADX INFO: renamed from: a */
    public final Task<Integer> mo483a(C0157d c0157d) {
        Integer numMo22628a;
        int i10;
        File[] fileArr;
        try {
            final C0157d c0157d2 = c0157d;
            AbstractC0159e abstractC0159eM22611r = m22611r(new InterfaceC4568r() { // from class: de.l
                @Override // de.InterfaceC4568r
                /* JADX INFO: renamed from: a */
                public final AbstractC0159e mo22630a(final AbstractC0159e abstractC0159e) {
                    final C0157d c0157d3 = c0157d2;
                    return (AbstractC0159e) C1363t0.m7219c(new Callable() { // from class: de.o
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws C0149a {
                            AbstractC0159e abstractC0159e2 = abstractC0159e;
                            C0157d c0157d4 = c0157d3;
                            int i11 = C4551a.f18649q;
                            if (abstractC0159e2 == null || abstractC0159e2.m506d()) {
                                return AbstractC0159e.m502b(abstractC0159e2 != null ? 1 + abstractC0159e2.mo510h() : 1, 1, 0, 0L, 0L, c0157d4.m497b(), new ArrayList());
                            }
                            throw new C0149a(-1);
                        }
                    });
                }
            });
            if (abstractC0159eM22611r == null) {
                return m22608o(-100);
            }
            int iMo510h = abstractC0159eM22611r.mo510h();
            final ArrayList arrayList = new ArrayList();
            Iterator<Locale> it = c0157d2.m496a().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getLanguage());
            }
            HashSet hashSet = new HashSet();
            final ArrayList arrayList2 = new ArrayList();
            File[] fileArrListFiles = this.f18659j.listFiles(new FileFilter() { // from class: de.m
                @Override // java.io.FileFilter
                public final boolean accept(File file) {
                    int i11 = C4551a.f18649q;
                    return file.getName().endsWith(".apk");
                }
            });
            if (fileArrListFiles == null) {
                Log.w("FakeSplitInstallManager", "Specified splits directory does not exist.");
                return m22608o(-5);
            }
            int i11 = 0;
            long length = 0;
            while (i11 < fileArrListFiles.length) {
                File file = fileArrListFiles[i11];
                String strM7218a = C1360s0.m7218a(file);
                String strM22602s = m22602s(strM7218a);
                hashSet.add(strM7218a);
                if (c0157d2.m497b().contains(strM22602s)) {
                    String strM22602s2 = m22602s(strM7218a);
                    HashSet<String> hashSet2 = new HashSet(this.f18654e.m7194a());
                    Map mapM531a = m22609p().m531a(Arrays.asList(strM22602s2));
                    HashSet hashSet3 = new HashSet();
                    Iterator it2 = mapM531a.values().iterator();
                    while (it2.hasNext()) {
                        hashSet3.addAll((Set) it2.next());
                        iMo510h = iMo510h;
                    }
                    i10 = iMo510h;
                    HashSet hashSet4 = new HashSet();
                    for (String str : hashSet2) {
                        File[] fileArr2 = fileArrListFiles;
                        if (str.contains("_")) {
                            str = str.split("_", -1)[0];
                        }
                        hashSet4.add(str);
                        fileArrListFiles = fileArr2;
                        mapM531a = mapM531a;
                    }
                    fileArr = fileArrListFiles;
                    hashSet4.addAll(this.f18662m);
                    hashSet4.addAll(arrayList);
                    HashSet hashSet5 = new HashSet();
                    for (Map.Entry entry : mapM531a.entrySet()) {
                        if (hashSet4.contains(entry.getKey())) {
                            hashSet5.addAll((Collection) entry.getValue());
                        }
                    }
                    if (!hashSet3.contains(strM7218a) || hashSet5.contains(strM7218a)) {
                        length += file.length();
                        arrayList2.add(file);
                        break;
                    }
                    i11++;
                    c0157d2 = c0157d;
                    fileArrListFiles = fileArr;
                    iMo510h = i10;
                } else {
                    i10 = iMo510h;
                    fileArr = fileArrListFiles;
                }
                List<Locale> listM496a = c0157d.m496a();
                ArrayList arrayList3 = new ArrayList(this.f18661l);
                arrayList3.addAll(Arrays.asList("", "base"));
                Map mapM531a2 = m22609p().m531a(arrayList3);
                for (Locale locale : listM496a) {
                    if (mapM531a2.containsKey(locale.getLanguage()) && ((Set) mapM531a2.get(locale.getLanguage())).contains(strM7218a)) {
                        length += file.length();
                        arrayList2.add(file);
                        break;
                        break;
                    }
                }
                i11++;
                c0157d2 = c0157d;
                fileArrListFiles = fileArr;
                iMo510h = i10;
            }
            int i12 = iMo510h;
            Log.i("FakeSplitInstallManager", "availableSplits " + hashSet.toString() + " want " + String.valueOf(c0157d.m497b()));
            if (c0157d.m497b().size() != 1 || (numMo22628a = (Integer) ((AbstractC4572v) this.f18653d.zza()).mo22629b().get(c0157d.m497b().get(0))) == null) {
                numMo22628a = ((AbstractC4572v) this.f18653d.zza()).mo22628a();
            }
            if (numMo22628a != null) {
                return m22608o(numMo22628a.intValue());
            }
            if (!hashSet.containsAll(new HashSet(c0157d.m497b()))) {
                return m22608o(-2);
            }
            Long lValueOf = Long.valueOf(length);
            List<String> listM497b = c0157d.m497b();
            Integer numValueOf = Integer.valueOf(i12);
            m22615w(1, 0, 0L, lValueOf, listM497b, numValueOf, arrayList);
            this.f18657h.execute(new Runnable() { // from class: de.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18695a.m22607m(arrayList2, arrayList);
                }
            });
            return C11268m.m42336f(numValueOf);
        } catch (C1363t0 e10) {
            return m22608o(((C0149a) e10.m7221b(C0149a.class)).m466c());
        }
    }

    @Override // ae.InterfaceC0152b
    /* JADX INFO: renamed from: b */
    public final void mo484b(InterfaceC0161f interfaceC0161f) {
        this.f18656g.m7203b(interfaceC0161f);
    }

    @Override // ae.InterfaceC0152b
    /* JADX INFO: renamed from: c */
    public final void mo485c(InterfaceC0161f interfaceC0161f) {
        this.f18656g.m7202a(interfaceC0161f);
    }

    @Override // ae.InterfaceC0152b
    /* JADX INFO: renamed from: d */
    public final Task<Void> mo486d(List<String> list) {
        return C11268m.m42335e(new C0149a(-5));
    }

    @Override // ae.InterfaceC0152b
    /* JADX INFO: renamed from: e */
    public final Set<String> mo487e() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f18652c.m543c());
        hashSet.addAll(this.f18661l);
        return hashSet;
    }

    @Override // ae.InterfaceC0152b
    /* JADX INFO: renamed from: f */
    public final Task<Void> mo488f(List<String> list) {
        return C11268m.m42335e(new C0149a(-5));
    }

    /* JADX INFO: renamed from: g */
    public final File m22603g() {
        return this.f18659j;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m22604j(final long j10, final List list, final List list2, final List list3) {
        long jMin = 0;
        for (int i10 = 0; i10 < 3; i10++) {
            jMin = Math.min(j10, jMin + (j10 / 3));
            m22615w(2, 0, Long.valueOf(jMin), Long.valueOf(j10), null, null, null);
            SystemClock.sleep(f18648p);
            AbstractC0159e abstractC0159eM22610q = m22610q();
            if (abstractC0159eM22610q.mo511i() == 9 || abstractC0159eM22610q.mo511i() == 7 || abstractC0159eM22610q.mo511i() == 6) {
                return;
            }
        }
        this.f18657h.execute(new Runnable() { // from class: de.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f18673a.m22606l(list, list2, list3, j10);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m22605k(AbstractC0159e abstractC0159e) {
        this.f18655f.m7204c(abstractC0159e);
        this.f18656g.m7204c(abstractC0159e);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m22606l(List list, List list2, List list3, long j10) {
        if (this.f18663n.get()) {
            m22615w(6, -6, null, null, null, null, null);
        } else if (this.f18658i.zza() != null) {
            m22612t(list, list2, list3, j10, false);
        } else {
            m22614v(list2, list3, j10);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m22607m(List list, final List list2) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            String strM7218a = C1360s0.m7218a(file);
            Uri uriFromFile = Uri.fromFile(file);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriFromFile, this.f18651b.getContentResolver().getType(uriFromFile));
            intent.addFlags(1);
            intent.putExtra("module_name", m22602s(strM7218a));
            intent.putExtra("split_id", strM7218a);
            arrayList.add(intent);
            arrayList2.add(m22602s(C1360s0.m7218a(file)));
        }
        AbstractC0159e abstractC0159eM22610q = m22610q();
        if (abstractC0159eM22610q == null) {
            return;
        }
        final long jMo512j = abstractC0159eM22610q.mo512j();
        this.f18657h.execute(new Runnable() { // from class: de.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f18687a.m22604j(jMo512j, arrayList, arrayList2, list2);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final Task m22608o(final int i10) {
        m22611r(new InterfaceC4568r() { // from class: de.p
            @Override // de.InterfaceC4568r
            /* JADX INFO: renamed from: a */
            public final AbstractC0159e mo22630a(AbstractC0159e abstractC0159e) {
                int i11 = i10;
                int i12 = C4551a.f18649q;
                if (abstractC0159e == null) {
                    return null;
                }
                return AbstractC0159e.m502b(abstractC0159e.mo510h(), 6, i11, abstractC0159e.mo504a(), abstractC0159e.mo512j(), abstractC0159e.m508f(), abstractC0159e.m507e());
            }
        });
        return C11268m.m42335e(new C0149a(i10));
    }

    /* JADX INFO: renamed from: p */
    public final C0178n0 m22609p() {
        try {
            C0178n0 c0178n0M542a = this.f18652c.m542a(this.f18651b.getPackageManager().getPackageInfo(this.f18651b.getPackageName(), 128).applicationInfo.metaData);
            if (c0178n0M542a != null) {
                return c0178n0M542a;
            }
            throw new IllegalStateException("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
        } catch (PackageManager.NameNotFoundException e10) {
            throw new IllegalStateException("App is not found in PackageManager", e10);
        }
    }

    /* JADX INFO: renamed from: q */
    public final AbstractC0159e m22610q() {
        return (AbstractC0159e) this.f18660k.get();
    }

    /* JADX INFO: renamed from: r */
    public final synchronized AbstractC0159e m22611r(InterfaceC4568r interfaceC4568r) {
        AbstractC0159e abstractC0159eM22610q = m22610q();
        AbstractC0159e abstractC0159eMo22630a = interfaceC4568r.mo22630a(abstractC0159eM22610q);
        AtomicReference atomicReference = this.f18660k;
        while (!C10146t.m39085a(atomicReference, abstractC0159eM22610q, abstractC0159eMo22630a)) {
            if (atomicReference.get() != abstractC0159eM22610q) {
                return null;
            }
        }
        return abstractC0159eMo22630a;
    }

    /* JADX INFO: renamed from: t */
    public final void m22612t(List list, List list2, List list3, long j10, boolean z10) {
        this.f18658i.zza().mo528a(list, new C4567q(this, list2, list3, j10, z10, list));
    }

    /* JADX INFO: renamed from: u */
    public final void m22613u(final AbstractC0159e abstractC0159e) {
        this.f18650a.post(new Runnable() { // from class: de.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f18678a.m22605k(abstractC0159e);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final void m22614v(List list, List list2, long j10) {
        this.f18661l.addAll(list);
        this.f18662m.addAll(list2);
        Long lValueOf = Long.valueOf(j10);
        m22615w(5, 0, lValueOf, lValueOf, null, null, null);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m22615w(final int i10, final int i11, final Long l10, final Long l11, final List list, final Integer num, final List list2) {
        AbstractC0159e abstractC0159eM22611r = m22611r(new InterfaceC4568r() { // from class: de.i
            @Override // de.InterfaceC4568r
            /* JADX INFO: renamed from: a */
            public final AbstractC0159e mo22630a(AbstractC0159e abstractC0159e) {
                Integer num2 = num;
                int i12 = i10;
                int i13 = i11;
                Long l12 = l10;
                Long l13 = l11;
                List<String> listM508f = list;
                List<String> listM507e = list2;
                int i14 = C4551a.f18649q;
                AbstractC0159e abstractC0159eM502b = abstractC0159e == null ? AbstractC0159e.m502b(0, 0, 0, 0L, 0L, new ArrayList(), new ArrayList()) : abstractC0159e;
                int iMo510h = num2 == null ? abstractC0159eM502b.mo510h() : num2.intValue();
                long jMo504a = l12 == null ? abstractC0159eM502b.mo504a() : l12.longValue();
                long jMo512j = l13 == null ? abstractC0159eM502b.mo512j() : l13.longValue();
                if (listM508f == null) {
                    listM508f = abstractC0159eM502b.m508f();
                }
                if (listM507e == null) {
                    listM507e = abstractC0159eM502b.m507e();
                }
                return AbstractC0159e.m502b(iMo510h, i12, i13, jMo504a, jMo512j, listM508f, listM507e);
            }
        });
        if (abstractC0159eM22611r == null) {
            return false;
        }
        m22613u(abstractC0159eM22611r);
        return true;
    }
}
