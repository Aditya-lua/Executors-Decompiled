package iu;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\b\u0010\t\u001aO\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u000b\u001a\u00020\n2\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\f\u0010\t\u001aD\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@¢\u0006\u0004\b\r\u0010\t\u001aY\u0010\u0011\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u000e\"\b\b\u0001\u0010\u0000*\u00028\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f2\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"T", "", "timeMillis", "Lkotlin/Function2;", "Liu/p0;", "Llt/b;", "", "block", "c", "(JLkotlin/jvm/functions/Function2;Llt/b;)Ljava/lang/Object;", "Lkotlin/time/a;", "timeout", "d", "e", "U", "Liu/f3;", "coroutine", "b", "(Liu/f3;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "time", "Liu/y0;", "delay", "Liu/d2;", "Liu/e3;", "a", "(JLiu/y0;Liu/d2;)Liu/e3;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g3 {

    @nt.f(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", l = {102}, m = "withTimeoutOrNull")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f21361t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f21362u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f21363v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f21364w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f21365x;

        public a(lt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f21364w = obj;
            this.f21365x |= Integer.MIN_VALUE;
            return g3.e(0L, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Instruction removed from duplicated block: B:9:0x0018, please report this as an issue */
    @NotNull
    public static final e3 a(long j10, @NotNull y0 y0Var, @NotNull d2 d2Var) {
        String strR;
        a1 a1Var = y0Var instanceof a1 ? (a1) y0Var : null;
        if (a1Var != null) {
            kotlin.time.a.Companion companion = kotlin.time.a.INSTANCE;
            strR = a1Var.r(kotlin.time.b.q(j10, hu.b.MILLISECONDS));
            if (strR == null) {
                strR = "Timed out waiting for " + j10 + " ms";
            }
        } else {
            strR = "Timed out waiting for " + j10 + " ms";
        }
        return new e3(strR, d2Var);
    }

    public static final <U, T extends U> Object b(f3<U, ? super T> f3Var, Function2<? super p0, ? super lt.b<? super T>, ? extends Object> function2) {
        g2.e(f3Var, z0.d(f3Var.uCont.getContext()).j(f3Var.time, f3Var, f3Var.getContext()));
        return pu.b.e(f3Var, f3Var, function2);
    }

    @Nullable
    public static final <T> Object c(long j10, @NotNull Function2<? super p0, ? super lt.b<? super T>, ? extends Object> function2, @NotNull lt.b<? super T> bVar) {
        if (j10 <= 0) {
            throw new e3("Timed out immediately");
        }
        Object objB = b(new f3(j10, bVar), function2);
        if (objB == mt.c.e()) {
            nt.h.c(bVar);
        }
        return objB;
    }

    @Nullable
    public static final <T> Object d(long j10, @NotNull Function2<? super p0, ? super lt.b<? super T>, ? extends Object> function2, @NotNull lt.b<? super T> bVar) {
        return c(z0.e(j10), function2, bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, iu.f3] */
    @Nullable
    public static final <T> Object e(long j10, @NotNull Function2<? super p0, ? super lt.b<? super T>, ? extends Object> function2, @NotNull lt.b<? super T> bVar) {
        a aVar;
        kotlin.jvm.internal.c0 c0Var;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f21365x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f21365x = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f21364w;
        Object objE = mt.c.e();
        int i11 = aVar.f21365x;
        if (i11 == 0) {
            gt.o.b(obj);
            if (j10 <= 0) {
                return null;
            }
            kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
            try {
                aVar.f21362u = function2;
                aVar.f21363v = c0Var2;
                aVar.f21361t = j10;
                aVar.f21365x = 1;
                ?? r8 = (T) new f3(j10, aVar);
                c0Var2.f23007a = r8;
                Object objB = b(r8, function2);
                if (objB == mt.c.e()) {
                    nt.h.c(aVar);
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
            c0Var = (kotlin.jvm.internal.c0) aVar.f21363v;
            try {
                gt.o.b(obj);
                return obj;
            } catch (e3 e11) {
                e = e11;
            }
        }
        if (e.coroutine == c0Var.f23007a) {
            return null;
        }
        throw e;
    }
}
