package x6;

import com.github.luben.zstd.BuildConfig;
import gu.f;
import gu.l;
import java.io.Closeable;
import mv.f0;
import mv.h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import u6.NetworkRequest;
import u6.NetworkResponse;
import u6.i;
import zt.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JB\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\tH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001c"}, d2 = {"Lx6/a;", "Lu6/i;", "Lmv/e$a;", "callFactory", "c", "(Lmv/e$a;)Lmv/e$a;", "T", "Lu6/o;", "request", "Lkotlin/Function2;", "Lu6/q;", "Leu/b;", BuildConfig.FLAVOR, "block", "e", "(Lmv/e$a;Lu6/o;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Lmv/e$a;", "coil-network-okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mv.e.a callFactory;

    /* JADX INFO: renamed from: x6.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "coil3.network.okhttp.internal.CallFactoryNetworkClient", f = "utils.kt", l = {24, 24, 25}, m = "executeRequest-impl")
    public static final class C0748a<T> extends gu.d {
        public int A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f36181t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f36182u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f36183v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f36184w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f36185x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f36186y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f36187z;

        public C0748a(eu.b<? super C0748a> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f36187z = obj;
            this.A |= Integer.MIN_VALUE;
            return a.e(null, null, null, this);
        }
    }

    public /* synthetic */ a(mv.e.a aVar) {
        this.callFactory = aVar;
    }

    public static final /* synthetic */ a b(mv.e.a aVar) {
        return new a(aVar);
    }

    @NotNull
    public static mv.e.a c(@NotNull mv.e.a aVar) {
        return aVar;
    }

    public static boolean d(mv.e.a aVar, Object obj) {
        return (obj instanceof a) && Intrinsics.c(aVar, ((a) obj).getCallFactory());
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static <T> Object e(mv.e.a aVar, @NotNull NetworkRequest networkRequest, @NotNull Function2<? super NetworkResponse, ? super eu.b<? super T>, ? extends Object> function2, @NotNull eu.b<? super T> bVar) {
        C0748a c0748a;
        mv.e.a aVar2;
        Function2<? super NetworkResponse, ? super eu.b<? super T>, ? extends Object> function3;
        mv.e.a aVar3;
        Closeable closeable;
        Closeable closeable2;
        Object objInvoke;
        if (bVar instanceof C0748a) {
            c0748a = (C0748a) bVar;
            int i10 = c0748a.A;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0748a.A = i10 - Integer.MIN_VALUE;
            } else {
                c0748a = new C0748a(bVar);
            }
        } else {
            c0748a = new C0748a(bVar);
        }
        Object objH = c0748a.f36187z;
        Object objE = fu.c.e();
        int i11 = c0748a.A;
        if (i11 == 0) {
            o.b(objH);
            c0748a.f36181t = l.a(aVar);
            c0748a.f36182u = l.a(networkRequest);
            c0748a.f36183v = function2;
            c0748a.f36184w = aVar;
            c0748a.A = 1;
            objH = e.h(networkRequest, c0748a);
            if (objH != objE) {
                aVar2 = aVar;
            }
            return objE;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable2 = (Closeable) c0748a.f36184w;
                try {
                    o.b(objH);
                    lu.c.a(closeable2, null);
                    return objH;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        lu.c.a(closeable2, th);
                        throw th3;
                    }
                }
            }
            function3 = (Function2) c0748a.f36183v;
            networkRequest = (NetworkRequest) c0748a.f36182u;
            aVar3 = (mv.e.a) c0748a.f36181t;
            o.b(objH);
            closeable = (Closeable) objH;
            try {
                h0 h0Var = (h0) closeable;
                NetworkResponse networkResponseG = e.g(h0Var);
                c0748a.f36181t = l.a(aVar3);
                c0748a.f36182u = l.a(networkRequest);
                c0748a.f36183v = l.a(function3);
                c0748a.f36184w = closeable;
                c0748a.f36185x = l.a(h0Var);
                c0748a.f36186y = 0;
                c0748a.A = 3;
                objInvoke = function3.invoke(networkResponseG, c0748a);
                if (objInvoke != objE) {
                    objH = objInvoke;
                    closeable2 = closeable;
                    lu.c.a(closeable2, null);
                    return objH;
                }
                return objE;
            } catch (Throwable th4) {
                th = th4;
                closeable2 = closeable;
                throw th;
            }
        }
        aVar = (mv.e.a) c0748a.f36184w;
        function2 = (Function2) c0748a.f36183v;
        networkRequest = (NetworkRequest) c0748a.f36182u;
        aVar2 = (mv.e.a) c0748a.f36181t;
        o.b(objH);
        mv.e eVarA = aVar.a((f0) objH);
        c0748a.f36181t = l.a(aVar2);
        c0748a.f36182u = l.a(networkRequest);
        c0748a.f36183v = function2;
        c0748a.f36184w = null;
        c0748a.A = 2;
        objH = b.a(eVarA, c0748a);
        if (objH != objE) {
            function3 = function2;
            aVar3 = aVar2;
            closeable = (Closeable) objH;
            h0 h0Var2 = (h0) closeable;
            NetworkResponse networkResponseG2 = e.g(h0Var2);
            c0748a.f36181t = l.a(aVar3);
            c0748a.f36182u = l.a(networkRequest);
            c0748a.f36183v = l.a(function3);
            c0748a.f36184w = closeable;
            c0748a.f36185x = l.a(h0Var2);
            c0748a.f36186y = 0;
            c0748a.A = 3;
            objInvoke = function3.invoke(networkResponseG2, c0748a);
            if (objInvoke != objE) {
                objH = objInvoke;
                closeable2 = closeable;
                lu.c.a(closeable2, null);
                return objH;
            }
        }
        return objE;
    }

    public static int f(mv.e.a aVar) {
        return aVar.hashCode();
    }

    public static String g(mv.e.a aVar) {
        return "CallFactoryNetworkClient(callFactory=" + aVar + ')';
    }

    @Override // u6.i
    @Nullable
    public <T> Object a(@NotNull NetworkRequest networkRequest, @NotNull Function2<? super NetworkResponse, ? super eu.b<? super T>, ? extends Object> function2, @NotNull eu.b<? super T> bVar) {
        return e(this.callFactory, networkRequest, function2, bVar);
    }

    public boolean equals(Object other) {
        return d(this.callFactory, other);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final /* synthetic */ mv.e.a getCallFactory() {
        return this.callFactory;
    }

    public int hashCode() {
        return f(this.callFactory);
    }

    public String toString() {
        return g(this.callFactory);
    }
}
