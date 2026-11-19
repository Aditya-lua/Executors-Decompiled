package av;

import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.common.MlKitException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\b\u0010\t\u001aO\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u000b\u001a\u00020\n2\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\f\u0010\t\u001aD\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@¢\u0006\u0004\b\r\u0010\t\u001aY\u0010\u0011\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u0010\u0000*\u00028\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f2\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"T", BuildConfig.FLAVOR, "timeMillis", "Lkotlin/Function2;", "Lav/p0;", "Leu/b;", BuildConfig.FLAVOR, "block", "c", "(JLkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;", "Lkotlin/time/a;", "timeout", "d", "e", "U", "Lav/f3;", "coroutine", "b", "(Lav/f3;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "time", "Lav/y0;", "delay", "Lav/d2;", "Lav/e3;", "a", "(JLav/y0;Lav/d2;)Lav/e3;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g3 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @gu.f(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", l = {MlKitException.MODEL_HASH_MISMATCH}, m = "withTimeoutOrNull")
    public static final class a<T> extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f3412t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f3413u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f3414v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f3415w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f3416x;

        public a(eu.b<? super a> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f3415w = obj;
            this.f3416x |= Integer.MIN_VALUE;
            return g3.e(0L, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Instruction removed from duplicated block: B:9:0x0018, please report this as an issue */
    @NotNull
    public static final e3 a(long j10, @NotNull y0 y0Var, @NotNull d2 d2Var) {
        String strP;
        a1 a1Var = y0Var instanceof a1 ? (a1) y0Var : null;
        if (a1Var != null) {
            p001kotlin.time.a.Companion companion = p001kotlin.time.a.INSTANCE;
            strP = a1Var.p(p001kotlin.time.b.q(j10, zu.b.MILLISECONDS));
            if (strP == null) {
                strP = "Timed out waiting for " + j10 + " ms";
            }
        } else {
            strP = "Timed out waiting for " + j10 + " ms";
        }
        return new e3(strP, d2Var);
    }

    public static final <U, T extends U> Object b(f3<U, ? super T> f3Var, Function2<? super p0, ? super eu.b<? super T>, ? extends Object> function2) {
        g2.g(f3Var, z0.d(f3Var.uCont.getContext()).g(f3Var.time, f3Var, f3Var.getContext()));
        return hv.b.e(f3Var, f3Var, function2);
    }

    @Nullable
    public static final <T> Object c(long j10, @NotNull Function2<? super p0, ? super eu.b<? super T>, ? extends Object> function2, @NotNull eu.b<? super T> bVar) {
        if (j10 <= 0) {
            throw new e3("Timed out immediately");
        }
        Object objB = b(new f3(j10, bVar), function2);
        if (objB == fu.c.e()) {
            gu.h.c(bVar);
        }
        return objB;
    }

    @Nullable
    public static final <T> Object d(long j10, @NotNull Function2<? super p0, ? super eu.b<? super T>, ? extends Object> function2, @NotNull eu.b<? super T> bVar) {
        return c(z0.e(j10), function2, bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, av.f3] */
    @Nullable
    public static final <T> Object e(long j10, @NotNull Function2<? super p0, ? super eu.b<? super T>, ? extends Object> function2, @NotNull eu.b<? super T> bVar) {
        a aVar;
        p001kotlin.jvm.internal.c0 c0Var;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f3416x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f3416x = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f3415w;
        Object objE = fu.c.e();
        int i11 = aVar.f3416x;
        if (i11 == 0) {
            zt.o.b(obj);
            if (j10 <= 0) {
                return null;
            }
            p001kotlin.jvm.internal.c0 c0Var2 = new p001kotlin.jvm.internal.c0();
            try {
                aVar.f3413u = function2;
                aVar.f3414v = c0Var2;
                aVar.f3412t = j10;
                aVar.f3416x = 1;
                ?? r10 = (T) new f3(j10, aVar);
                c0Var2.f21575a = r10;
                Object objB = b(r10, function2);
                if (objB == fu.c.e()) {
                    gu.h.c(aVar);
                }
                return objB == objE ? objE : objB;
            } catch (e3 e10) {
                e = e10;
                c0Var = c0Var2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (p001kotlin.jvm.internal.c0) aVar.f3414v;
            try {
                zt.o.b(obj);
                return obj;
            } catch (e3 e11) {
                e = e11;
            }
        }
        if (e.coroutine == c0Var.f21575a) {
            return null;
        }
        throw e;
    }
}
