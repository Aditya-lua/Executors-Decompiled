package w6;

import java.io.Closeable;
import jt.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.f;
import pt.l;
import t6.NetworkRequest;
import t6.NetworkResponse;
import t6.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JB\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\tH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001c"}, d2 = {"Lw6/a;", "Lt6/i;", "Lokhttp3/Call$Factory;", "callFactory", "c", "(Lokhttp3/Call$Factory;)Lokhttp3/Call$Factory;", "T", "Lt6/o;", "request", "Lkotlin/Function2;", "Lt6/q;", "Lnt/b;", "", "block", "e", "(Lokhttp3/Call$Factory;Lt6/o;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lokhttp3/Call$Factory;", "coil-network-okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Call.Factory callFactory;

    /* JADX INFO: renamed from: w6.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "coil3.network.okhttp.internal.CallFactoryNetworkClient", f = "utils.kt", l = {24, 24, 25}, m = "executeRequest-impl")
    public static final class C0618a<T> extends pt.d {
        public int A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33691t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f33692u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f33693v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f33694w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f33695x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f33696y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f33697z;

        public C0618a(nt.b<? super C0618a> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33697z = obj;
            this.A |= Integer.MIN_VALUE;
            return a.e(null, null, null, this);
        }
    }

    public /* synthetic */ a(Call.Factory factory) {
        this.callFactory = factory;
    }

    public static final /* synthetic */ a b(Call.Factory factory) {
        return new a(factory);
    }

    @NotNull
    public static Call.Factory c(@NotNull Call.Factory factory) {
        return factory;
    }

    public static boolean d(Call.Factory factory, Object obj) {
        return (obj instanceof a) && Intrinsics.c(factory, ((a) obj).getCallFactory());
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static <T> Object e(Call.Factory factory, @NotNull NetworkRequest networkRequest, @NotNull Function2<? super NetworkResponse, ? super nt.b<? super T>, ? extends Object> function2, @NotNull nt.b<? super T> bVar) {
        C0618a c0618a;
        Call.Factory factory2;
        Function2<? super NetworkResponse, ? super nt.b<? super T>, ? extends Object> function3;
        Call.Factory factory3;
        Closeable closeable;
        Closeable closeable2;
        Object objInvoke;
        if (bVar instanceof C0618a) {
            c0618a = (C0618a) bVar;
            int i10 = c0618a.A;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0618a.A = i10 - Integer.MIN_VALUE;
            } else {
                c0618a = new C0618a(bVar);
            }
        } else {
            c0618a = new C0618a(bVar);
        }
        Object objH = c0618a.f33697z;
        Object objE = ot.c.e();
        int i11 = c0618a.A;
        if (i11 == 0) {
            o.b(objH);
            c0618a.f33691t = l.a(factory);
            c0618a.f33692u = l.a(networkRequest);
            c0618a.f33693v = function2;
            c0618a.f33694w = factory;
            c0618a.A = 1;
            objH = e.h(networkRequest, c0618a);
            if (objH != objE) {
                factory2 = factory;
            }
            return objE;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable2 = (Closeable) c0618a.f33694w;
                try {
                    o.b(objH);
                    ut.c.a(closeable2, null);
                    return objH;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        ut.c.a(closeable2, th);
                        throw th3;
                    }
                }
            }
            function3 = (Function2) c0618a.f33693v;
            networkRequest = (NetworkRequest) c0618a.f33692u;
            factory3 = (Call.Factory) c0618a.f33691t;
            o.b(objH);
            closeable = (Closeable) objH;
            try {
                Response response = (Response) closeable;
                NetworkResponse networkResponseG = e.g(response);
                c0618a.f33691t = l.a(factory3);
                c0618a.f33692u = l.a(networkRequest);
                c0618a.f33693v = l.a(function3);
                c0618a.f33694w = closeable;
                c0618a.f33695x = l.a(response);
                c0618a.f33696y = 0;
                c0618a.A = 3;
                objInvoke = function3.invoke(networkResponseG, c0618a);
                if (objInvoke != objE) {
                    objH = objInvoke;
                    closeable2 = closeable;
                    ut.c.a(closeable2, null);
                    return objH;
                }
                return objE;
            } catch (Throwable th4) {
                th = th4;
                closeable2 = closeable;
                throw th;
            }
        }
        factory = (Call.Factory) c0618a.f33694w;
        function2 = (Function2) c0618a.f33693v;
        networkRequest = (NetworkRequest) c0618a.f33692u;
        factory2 = (Call.Factory) c0618a.f33691t;
        o.b(objH);
        Call callNewCall = factory.newCall((Request) objH);
        c0618a.f33691t = l.a(factory2);
        c0618a.f33692u = l.a(networkRequest);
        c0618a.f33693v = function2;
        c0618a.f33694w = null;
        c0618a.A = 2;
        objH = b.a(callNewCall, c0618a);
        if (objH != objE) {
            function3 = function2;
            factory3 = factory2;
            closeable = (Closeable) objH;
            Response response2 = (Response) closeable;
            NetworkResponse networkResponseG2 = e.g(response2);
            c0618a.f33691t = l.a(factory3);
            c0618a.f33692u = l.a(networkRequest);
            c0618a.f33693v = l.a(function3);
            c0618a.f33694w = closeable;
            c0618a.f33695x = l.a(response2);
            c0618a.f33696y = 0;
            c0618a.A = 3;
            objInvoke = function3.invoke(networkResponseG2, c0618a);
            if (objInvoke != objE) {
                objH = objInvoke;
                closeable2 = closeable;
                ut.c.a(closeable2, null);
                return objH;
            }
        }
        return objE;
    }

    public static int f(Call.Factory factory) {
        return factory.hashCode();
    }

    public static String g(Call.Factory factory) {
        return "CallFactoryNetworkClient(callFactory=" + factory + ')';
    }

    @Override // t6.i
    @Nullable
    public <T> Object a(@NotNull NetworkRequest networkRequest, @NotNull Function2<? super NetworkResponse, ? super nt.b<? super T>, ? extends Object> function2, @NotNull nt.b<? super T> bVar) {
        return e(this.callFactory, networkRequest, function2, bVar);
    }

    public boolean equals(Object other) {
        return d(this.callFactory, other);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final /* synthetic */ Call.Factory getCallFactory() {
        return this.callFactory;
    }

    public int hashCode() {
        return f(this.callFactory);
    }

    public String toString() {
        return g(this.callFactory);
    }
}
