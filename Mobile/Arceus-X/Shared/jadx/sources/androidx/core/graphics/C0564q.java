package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p298n2.C8867e;
import p482v2.C12004g;

/* JADX INFO: renamed from: androidx.core.graphics.q */
/* JADX INFO: loaded from: classes.dex */
public class C0564q {

    /* JADX INFO: renamed from: a */
    @SuppressLint({"BanConcurrentHashMap"})
    public ConcurrentHashMap<Long, C8867e.c> f2344a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: androidx.core.graphics.q$a */
    public class a implements b<C12004g.b> {
        public a() {
        }

        /* JADX DEBUG: Method merged with bridge method: b(Ljava/lang/Object;)I */
        @Override // androidx.core.graphics.C0564q.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int mo2780b(C12004g.b bVar) {
            return bVar.m44822g();
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)Z */
        @Override // androidx.core.graphics.C0564q.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo2779a(C12004g.b bVar) {
            return bVar.m44823h();
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.q$b */
    public interface b<T> {
        /* JADX INFO: renamed from: a */
        boolean mo2779a(T t8);

        /* JADX INFO: renamed from: b */
        int mo2780b(T t8);
    }

    /* JADX INFO: renamed from: e */
    public static <T> T m2777e(T[] tArr, int i10, b<T> bVar) {
        return (T) m2778f(tArr, (i10 & 1) == 0 ? 400 : 700, (i10 & 2) != 0, bVar);
    }

    /* JADX INFO: renamed from: f */
    public static <T> T m2778f(T[] tArr, int i10, boolean z10, b<T> bVar) {
        T t8 = null;
        int i11 = Integer.MAX_VALUE;
        for (T t10 : tArr) {
            int iAbs = (Math.abs(bVar.mo2780b(t10) - i10) * 2) + (bVar.mo2779a(t10) == z10 ? 0 : 1);
            if (t8 == null || i11 > iAbs) {
                t8 = t10;
                i11 = iAbs;
            }
        }
        return t8;
    }

    /* JADX INFO: renamed from: a */
    public Typeface mo2751a(Context context, C8867e.c cVar, Resources resources, int i10) {
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public Typeface mo2752b(Context context, CancellationSignal cancellationSignal, C12004g.b[] bVarArr, int i10) {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public Typeface mo2753c(Context context, CancellationSignal cancellationSignal, List<C12004g.b[]> list, int i10) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    /* JADX INFO: renamed from: d */
    public Typeface mo2754d(Context context, Resources resources, int i10, String str, int i11) {
        File fileM2786d = C0565r.m2786d(context);
        if (fileM2786d == null) {
            return null;
        }
        try {
            if (C0565r.m2784b(fileM2786d, resources, i10)) {
                return Typeface.createFromFile(fileM2786d.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM2786d.delete();
        }
    }

    /* JADX INFO: renamed from: g */
    public C12004g.b mo2770g(C12004g.b[] bVarArr, int i10) {
        return (C12004g.b) m2777e(bVarArr, i10, new a());
    }
}
