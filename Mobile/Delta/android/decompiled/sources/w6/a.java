package w6;

import gt.o;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nt.f;
import nt.l;
import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t6.NetworkRequest;
import t6.NetworkResponse;
import t6.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JB\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\tH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001c"}, d2 = {"Lw6/a;", "Lt6/i;", "Lokhttp3/Call$Factory;", "callFactory", "c", "(Lokhttp3/Call$Factory;)Lokhttp3/Call$Factory;", "T", "Lt6/o;", "request", "Lkotlin/Function2;", "Lt6/q;", "Llt/b;", "", "block", "e", "(Lokhttp3/Call$Factory;Lt6/o;Lkotlin/jvm/functions/Function2;Llt/b;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lokhttp3/Call$Factory;", "coil-network-okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Call.Factory callFactory;

    /* JADX INFO: renamed from: w6.a$a, reason: collision with other inner class name */
    @f(c = "coil3.network.okhttp.internal.CallFactoryNetworkClient", f = "utils.kt", l = {24, 24, 25}, m = "executeRequest-impl")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C0628a<T> extends nt.d {
        public int A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33897t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f33898u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f33899v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f33900w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f33901x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f33902y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f33903z;

        public C0628a(lt.b<? super C0628a> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33903z = obj;
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
    public static <T> Object e(Call.Factory factory, @NotNull NetworkRequest networkRequest, @NotNull Function2<? super NetworkResponse, ? super lt.b<? super T>, ? extends Object> function2, @NotNull lt.b<? super T> bVar) {
        C0628a c0628a;
        Call.Factory factory2;
        Function2<? super NetworkResponse, ? super lt.b<? super T>, ? extends Object> function3;
        Call.Factory factory3;
        Closeable closeable;
        Closeable closeable2;
        Object objInvoke;
        if (bVar instanceof C0628a) {
            c0628a = (C0628a) bVar;
            int i10 = c0628a.A;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0628a.A = i10 - Integer.MIN_VALUE;
            } else {
                c0628a = new C0628a(bVar);
            }
        } else {
            c0628a = new C0628a(bVar);
        }
        Object objH = c0628a.f33903z;
        Object objE = mt.c.e();
        int i11 = c0628a.A;
        if (i11 == 0) {
            o.b(objH);
            c0628a.f33897t = l.a(factory);
            c0628a.f33898u = l.a(networkRequest);
            c0628a.f33899v = function2;
            c0628a.f33900w = factory;
            c0628a.A = 1;
            objH = e.h(networkRequest, c0628a);
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
                closeable2 = (Closeable) c0628a.f33900w;
                try {
                    o.b(objH);
                    st.c.a(closeable2, null);
                    return objH;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        st.c.a(closeable2, th);
                        throw th3;
                    }
                }
            }
            function3 = (Function2) c0628a.f33899v;
            networkRequest = (NetworkRequest) c0628a.f33898u;
            factory3 = (Call.Factory) c0628a.f33897t;
            o.b(objH);
            closeable = (Closeable) objH;
            try {
                Response response = (Response) closeable;
                NetworkResponse networkResponseG = e.g(response);
                c0628a.f33897t = l.a(factory3);
                c0628a.f33898u = l.a(networkRequest);
                c0628a.f33899v = l.a(function3);
                c0628a.f33900w = closeable;
                c0628a.f33901x = l.a(response);
                c0628a.f33902y = 0;
                c0628a.A = 3;
                objInvoke = function3.invoke(networkResponseG, c0628a);
                if (objInvoke != objE) {
                    objH = objInvoke;
                    closeable2 = closeable;
                    st.c.a(closeable2, null);
                    return objH;
                }
                return objE;
            } catch (Throwable th4) {
                th = th4;
                closeable2 = closeable;
                throw th;
            }
        }
        factory = (Call.Factory) c0628a.f33900w;
        function2 = (Function2) c0628a.f33899v;
        networkRequest = (NetworkRequest) c0628a.f33898u;
        factory2 = (Call.Factory) c0628a.f33897t;
        o.b(objH);
        Call callNewCall = factory.newCall((Request) objH);
        c0628a.f33897t = l.a(factory2);
        c0628a.f33898u = l.a(networkRequest);
        c0628a.f33899v = function2;
        c0628a.f33900w = null;
        c0628a.A = 2;
        objH = b.a(callNewCall, c0628a);
        if (objH != objE) {
            function3 = function2;
            factory3 = factory2;
            closeable = (Closeable) objH;
            Response response2 = (Response) closeable;
            NetworkResponse networkResponseG2 = e.g(response2);
            c0628a.f33897t = l.a(factory3);
            c0628a.f33898u = l.a(networkRequest);
            c0628a.f33899v = l.a(function3);
            c0628a.f33900w = closeable;
            c0628a.f33901x = l.a(response2);
            c0628a.f33902y = 0;
            c0628a.A = 3;
            objInvoke = function3.invoke(networkResponseG2, c0628a);
            if (objInvoke != objE) {
                objH = objInvoke;
                closeable2 = closeable;
                st.c.a(closeable2, null);
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
    public <T> Object a(@NotNull NetworkRequest networkRequest, @NotNull Function2<? super NetworkResponse, ? super lt.b<? super T>, ? extends Object> function2, @NotNull lt.b<? super T> bVar) {
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
