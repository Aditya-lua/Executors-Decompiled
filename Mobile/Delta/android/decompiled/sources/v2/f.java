package v2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import androidx.core.graphics.k;
import backtraceio.library.services.BacktraceMetrics;
import g0.o0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import w1.i;
import w1.j;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i<String, Typeface> f32711a = new i<>(16);
    public static final ExecutorService b = h.a("fonts-androidx", 10, BacktraceMetrics.defaultTimeBetweenRetriesMs);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f32712c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j<String, ArrayList<x2.a<e>>> f32713d = new j<>();

    public class a implements Callable<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f32714a;
        public final /* synthetic */ Context b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ v2.e f32715c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f32716d;

        public a(String str, Context context, v2.e eVar, int i10) {
            this.f32714a = str;
            this.b = context;
            this.f32715c = eVar;
            this.f32716d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return f.c(this.f32714a, this.b, o0.a(new Object[]{this.f32715c}), this.f32716d);
        }
    }

    public class b implements x2.a<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v2.a f32717a;

        public b(v2.a aVar) {
            this.f32717a = aVar;
        }

        @Override // x2.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f32717a.b(eVar);
        }
    }

    public class c implements Callable<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f32718a;
        public final /* synthetic */ Context b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f32719c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f32720d;

        public c(String str, Context context, List list, int i10) {
            this.f32718a = str;
            this.b = context;
            this.f32719c = list;
            this.f32720d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return f.c(this.f32718a, this.b, this.f32719c, this.f32720d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    public class d implements x2.a<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f32721a;

        public d(String str) {
            this.f32721a = str;
        }

        @Override // x2.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (f.f32712c) {
                try {
                    j<String, ArrayList<x2.a<e>>> jVar = f.f32713d;
                    ArrayList<x2.a<e>> arrayList = jVar.get(this.f32721a);
                    if (arrayList == null) {
                        return;
                    }
                    jVar.remove(this.f32721a);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        arrayList.get(i10).accept(eVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static String a(List<v2.e> list, int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            sb2.append(list.get(i11).d());
            sb2.append("-");
            sb2.append(i10);
            if (i11 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    @SuppressLint({"WrongConstant"})
    public static int b(g.a aVar) {
        int i10 = 1;
        if (aVar.e() != 0) {
            return aVar.e() != 1 ? -3 : -2;
        }
        g.b[] bVarArrC = aVar.c();
        if (bVarArrC != null && bVarArrC.length != 0) {
            i10 = 0;
            for (g.b bVar : bVarArrC) {
                int iB = bVar.b();
                if (iB != 0) {
                    if (iB < 0) {
                        return -3;
                    }
                    return iB;
                }
            }
        }
        return i10;
    }

    public static e c(String str, Context context, List<v2.e> list, int i10) {
        n5.a.c("getFontSync");
        try {
            i<String, Typeface> iVar = f32711a;
            Typeface typefaceD = iVar.d(str);
            if (typefaceD != null) {
                e eVar = new e(typefaceD);
                n5.a.f();
                return eVar;
            }
            try {
                g.a aVarE = v2.d.e(context, list, null);
                int iB = b(aVarE);
                if (iB != 0) {
                    e eVar2 = new e(iB);
                    n5.a.f();
                    return eVar2;
                }
                Typeface typefaceB = (!aVarE.f() || Build.VERSION.SDK_INT < 29) ? k.b(context, null, aVarE.c(), i10) : k.c(context, null, aVarE.d(), i10);
                if (typefaceB == null) {
                    e eVar3 = new e(-3);
                    n5.a.f();
                    return eVar3;
                }
                iVar.e(str, typefaceB);
                e eVar4 = new e(typefaceB);
                n5.a.f();
                return eVar4;
            } catch (PackageManager.NameNotFoundException unused) {
                e eVar5 = new e(-1);
                n5.a.f();
                return eVar5;
            }
        } catch (Throwable th2) {
            n5.a.f();
            throw th2;
        }
    }

    public static Typeface d(Context context, List<v2.e> list, int i10, Executor executor, v2.a aVar) {
        String strA = a(list, i10);
        Typeface typefaceD = f32711a.d(strA);
        if (typefaceD != null) {
            aVar.b(new e(typefaceD));
            return typefaceD;
        }
        b bVar = new b(aVar);
        synchronized (f32712c) {
            try {
                j<String, ArrayList<x2.a<e>>> jVar = f32713d;
                ArrayList<x2.a<e>> arrayList = jVar.get(strA);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList<x2.a<e>> arrayList2 = new ArrayList<>();
                arrayList2.add(bVar);
                jVar.put(strA, arrayList2);
                c cVar = new c(strA, context, list, i10);
                if (executor == null) {
                    executor = b;
                }
                h.c(executor, cVar, new d(strA));
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Typeface e(Context context, v2.e eVar, v2.a aVar, int i10, int i11) {
        String strA = a(o0.a(new Object[]{eVar}), i10);
        Typeface typefaceD = f32711a.d(strA);
        if (typefaceD != null) {
            aVar.b(new e(typefaceD));
            return typefaceD;
        }
        if (i11 == -1) {
            e eVarC = c(strA, context, o0.a(new Object[]{eVar}), i10);
            aVar.b(eVarC);
            return eVarC.f32722a;
        }
        try {
            e eVar2 = (e) h.d(b, new a(strA, context, eVar, i10), i11);
            aVar.b(eVar2);
            return eVar2.f32722a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Typeface f32722a;
        public final int b;

        public e(int i10) {
            this.f32722a = null;
            this.b = i10;
        }

        @SuppressLint({"WrongConstant"})
        public boolean a() {
            return this.b == 0;
        }

        @SuppressLint({"WrongConstant"})
        public e(Typeface typeface) {
            this.f32722a = typeface;
            this.b = 0;
        }
    }
}
