package p482v2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import androidx.core.graphics.C0558k;
import backtraceio.library.services.BacktraceMetrics;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p140g0.C5918o0;
import p301n5.C8884a;
import p504w1.C12285i;
import p504w1.C12286j;
import p533x2.InterfaceC12631a;

/* JADX INFO: renamed from: v2.f */
/* JADX INFO: loaded from: classes.dex */
public class C12003f {

    /* JADX INFO: renamed from: a */
    public static final C12285i<String, Typeface> f42502a = new C12285i<>(16);

    /* JADX INFO: renamed from: b */
    public static final ExecutorService f42503b = C12005h.m44825a("fonts-androidx", 10, BacktraceMetrics.defaultTimeBetweenRetriesMs);

    /* JADX INFO: renamed from: c */
    public static final Object f42504c = new Object();

    /* JADX INFO: renamed from: d */
    public static final C12286j<String, ArrayList<InterfaceC12631a<e>>> f42505d = new C12286j<>();

    /* JADX INFO: renamed from: v2.f$a */
    public class a implements Callable<e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f42506a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f42507b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C12002e f42508c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f42509d;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(String str, Context context, C12002e c12002e, int i10) {
            this.f42506a = str;
            this.f42507b = context;
            this.f42508c = c12002e;
            this.f42509d = i10;
        }

        /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return C12003f.m44799c(this.f42506a, this.f42507b, C5918o0.m26551a(new Object[]{this.f42508c}), this.f42509d);
        }
    }

    /* JADX INFO: renamed from: v2.f$b */
    public class b implements InterfaceC12631a<e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C11998a f42510a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b(C11998a c11998a) {
            this.f42510a = c11998a;
        }

        /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
        @Override // p533x2.InterfaceC12631a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f42510a.m44776b(eVar);
        }
    }

    /* JADX INFO: renamed from: v2.f$c */
    public class c implements Callable<e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f42511a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f42512b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ List f42513c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f42514d;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public c(String str, Context context, List list, int i10) {
            this.f42511a = str;
            this.f42512b = context;
            this.f42513c = list;
            this.f42514d = i10;
        }

        /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return C12003f.m44799c(this.f42511a, this.f42512b, this.f42513c, this.f42514d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* JADX INFO: renamed from: v2.f$d */
    public class d implements InterfaceC12631a<e> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f42515a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public d(String str) {
            this.f42515a = str;
        }

        /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
        @Override // p533x2.InterfaceC12631a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (C12003f.f42504c) {
                try {
                    C12286j<String, ArrayList<InterfaceC12631a<e>>> c12286j = C12003f.f42505d;
                    ArrayList<InterfaceC12631a<e>> arrayList = c12286j.get(this.f42515a);
                    if (arrayList == null) {
                        return;
                    }
                    c12286j.remove(this.f42515a);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        arrayList.get(i10).accept(eVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m44797a(List<C12002e> list, int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            sb2.append(list.get(i11).m44791d());
            sb2.append("-");
            sb2.append(i10);
            if (i11 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: b */
    public static int m44798b(C12004g.a aVar) {
        int i10 = 1;
        if (aVar.m44814e() != 0) {
            return aVar.m44814e() != 1 ? -3 : -2;
        }
        C12004g.b[] bVarArrM44812c = aVar.m44812c();
        if (bVarArrM44812c != null && bVarArrM44812c.length != 0) {
            i10 = 0;
            for (C12004g.b bVar : bVarArrM44812c) {
                int iM44817b = bVar.m44817b();
                if (iM44817b != 0) {
                    if (iM44817b < 0) {
                        return -3;
                    }
                    return iM44817b;
                }
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: c */
    public static e m44799c(String str, Context context, List<C12002e> list, int i10) {
        C8884a.m35746c("getFontSync");
        try {
            C12285i<String, Typeface> c12285i = f42502a;
            Typeface typefaceM45612d = c12285i.m45612d(str);
            if (typefaceM45612d != null) {
                e eVar = new e(typefaceM45612d);
                C8884a.m35749f();
                return eVar;
            }
            try {
                C12004g.a aVarM44783e = C12001d.m44783e(context, list, null);
                int iM44798b = m44798b(aVarM44783e);
                if (iM44798b != 0) {
                    e eVar2 = new e(iM44798b);
                    C8884a.m35749f();
                    return eVar2;
                }
                Typeface typefaceM2736b = (!aVarM44783e.m44815f() || Build.VERSION.SDK_INT < 29) ? C0558k.m2736b(context, null, aVarM44783e.m44812c(), i10) : C0558k.m2737c(context, null, aVarM44783e.m44813d(), i10);
                if (typefaceM2736b == null) {
                    e eVar3 = new e(-3);
                    C8884a.m35749f();
                    return eVar3;
                }
                c12285i.m45613e(str, typefaceM2736b);
                e eVar4 = new e(typefaceM2736b);
                C8884a.m35749f();
                return eVar4;
            } catch (PackageManager.NameNotFoundException unused) {
                e eVar5 = new e(-1);
                C8884a.m35749f();
                return eVar5;
            }
        } catch (Throwable th2) {
            C8884a.m35749f();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public static Typeface m44800d(Context context, List<C12002e> list, int i10, Executor executor, C11998a c11998a) {
        String strM44797a = m44797a(list, i10);
        Typeface typefaceM45612d = f42502a.m45612d(strM44797a);
        if (typefaceM45612d != null) {
            c11998a.m44776b(new e(typefaceM45612d));
            return typefaceM45612d;
        }
        b bVar = new b(c11998a);
        synchronized (f42504c) {
            try {
                C12286j<String, ArrayList<InterfaceC12631a<e>>> c12286j = f42505d;
                ArrayList<InterfaceC12631a<e>> arrayList = c12286j.get(strM44797a);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList<InterfaceC12631a<e>> arrayList2 = new ArrayList<>();
                arrayList2.add(bVar);
                c12286j.put(strM44797a, arrayList2);
                c cVar = new c(strM44797a, context, list, i10);
                if (executor == null) {
                    executor = f42503b;
                }
                C12005h.m44827c(executor, cVar, new d(strM44797a));
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static Typeface m44801e(Context context, C12002e c12002e, C11998a c11998a, int i10, int i11) {
        String strM44797a = m44797a(C5918o0.m26551a(new Object[]{c12002e}), i10);
        Typeface typefaceM45612d = f42502a.m45612d(strM44797a);
        if (typefaceM45612d != null) {
            c11998a.m44776b(new e(typefaceM45612d));
            return typefaceM45612d;
        }
        if (i11 == -1) {
            e eVarM44799c = m44799c(strM44797a, context, C5918o0.m26551a(new Object[]{c12002e}), i10);
            c11998a.m44776b(eVarM44799c);
            return eVarM44799c.f42516a;
        }
        try {
            e eVar = (e) C12005h.m44828d(f42503b, new a(strM44797a, context, c12002e, i10), i11);
            c11998a.m44776b(eVar);
            return eVar.f42516a;
        } catch (InterruptedException unused) {
            c11998a.m44776b(new e(-3));
            return null;
        }
    }

    /* JADX INFO: renamed from: v2.f$e */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public final Typeface f42516a;

        /* JADX INFO: renamed from: b */
        public final int f42517b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public e(int i10) {
            this.f42516a = null;
            this.f42517b = i10;
        }

        @SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: a */
        public boolean m44806a() {
            return this.f42517b == 0;
        }

        @SuppressLint({"WrongConstant"})
        public e(Typeface typeface) {
            this.f42516a = typeface;
            this.f42517b = 0;
        }
    }
}
