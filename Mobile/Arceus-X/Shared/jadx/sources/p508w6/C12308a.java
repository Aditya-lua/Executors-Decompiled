package p508w6;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p443t6.InterfaceC11539i;
import p443t6.NetworkRequest;
import p443t6.NetworkResponse;
import p477ut.C11958c;
import pt.AbstractC10342d;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: w6.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JB\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\tH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001c"}, m31665d2 = {"Lw6/a;", "Lt6/i;", "Lokhttp3/Call$Factory;", "callFactory", "c", "(Lokhttp3/Call$Factory;)Lokhttp3/Call$Factory;", "T", "Lt6/o;", "request", "Lkotlin/Function2;", "Lt6/q;", "Lnt/b;", "", "block", "e", "(Lokhttp3/Call$Factory;Lt6/o;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lokhttp3/Call$Factory;", "coil-network-okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12308a implements InterfaceC11539i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Call.Factory callFactory;

    /* JADX INFO: renamed from: w6.a$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "coil3.network.okhttp.internal.CallFactoryNetworkClient", m39664f = "utils.kt", m39665l = {24, 24, 25}, m39666m = "executeRequest-impl")
    public static final class a<T> extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public int f43609A;

        /* JADX INFO: renamed from: t */
        public Object f43610t;

        /* JADX INFO: renamed from: u */
        public Object f43611u;

        /* JADX INFO: renamed from: v */
        public Object f43612v;

        /* JADX INFO: renamed from: w */
        public Object f43613w;

        /* JADX INFO: renamed from: x */
        public Object f43614x;

        /* JADX INFO: renamed from: y */
        public int f43615y;

        /* JADX INFO: renamed from: z */
        public /* synthetic */ Object f43616z;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f43616z = obj;
            this.f43609A |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C12308a.m45760e(null, null, null, this);
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [w6.a.b(okhttp3.Call$Factory):w6.a] */
    public /* synthetic */ C12308a(Call.Factory factory) {
        this.callFactory = factory;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 okhttp3.Call$Factory) A[MD:(okhttp3.Call$Factory):void (m)] call: w6.a.<init>(okhttp3.Call$Factory):void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ C12308a m45757b(Call.Factory factory) {
        return new C12308a(factory);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static Call.Factory m45758c(@NotNull Call.Factory factory) {
        return factory;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m45759d(Call.Factory factory, Object obj) {
        return (obj instanceof C12308a) && Intrinsics.m31980c(factory, ((C12308a) obj).getCallFactory());
    }

    /* JADX DEBUG: Class process forced to load method for inline: w6.e.b(okhttp3.Response):t6.q */
    /* JADX WARN: Code duplicated, block: B:34:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: e */
    public static <T> Object m45760e(Call.Factory factory, @NotNull NetworkRequest networkRequest, @NotNull Function2<? super NetworkResponse, ? super InterfaceC9557b<? super T>, ? extends Object> function2, @NotNull InterfaceC9557b<? super T> interfaceC9557b) {
        a aVar;
        Call.Factory factory2;
        Function2<? super NetworkResponse, ? super InterfaceC9557b<? super T>, ? extends Object> function3;
        Call.Factory factory3;
        Closeable closeable;
        Closeable closeable2;
        Object objInvoke;
        if (interfaceC9557b instanceof a) {
            aVar = (a) interfaceC9557b;
            int i10 = aVar.f43609A;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                aVar.f43609A = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                aVar = new a(interfaceC9557b);
            }
        } else {
            aVar = new a(interfaceC9557b);
        }
        Object objM45774h = aVar.f43616z;
        Object objM38805e = C10047c.m38805e();
        int i11 = aVar.f43609A;
        if (i11 == 0) {
            C7348o.m30470b(objM45774h);
            aVar.f43610t = C10350l.m39676a(factory);
            aVar.f43611u = C10350l.m39676a(networkRequest);
            aVar.f43612v = function2;
            aVar.f43613w = factory;
            aVar.f43609A = 1;
            objM45774h = C12312e.m45774h(networkRequest, aVar);
            if (objM45774h != objM38805e) {
                factory2 = factory;
            }
            return objM38805e;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable2 = (Closeable) aVar.f43613w;
                try {
                    C7348o.m30470b(objM45774h);
                    C11958c.m44629a(closeable2, null);
                    return objM45774h;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        C11958c.m44629a(closeable2, th);
                        throw th3;
                    }
                }
            }
            function3 = (Function2) aVar.f43612v;
            networkRequest = (NetworkRequest) aVar.f43611u;
            factory3 = (Call.Factory) aVar.f43610t;
            C7348o.m30470b(objM45774h);
            closeable = (Closeable) objM45774h;
            try {
                Response response = (Response) closeable;
                NetworkResponse networkResponseM45773g = C12312e.m45773g(response);
                aVar.f43610t = C10350l.m39676a(factory3);
                aVar.f43611u = C10350l.m39676a(networkRequest);
                aVar.f43612v = C10350l.m39676a(function3);
                aVar.f43613w = closeable;
                aVar.f43614x = C10350l.m39676a(response);
                aVar.f43615y = 0;
                aVar.f43609A = 3;
                objInvoke = function3.invoke(networkResponseM45773g, aVar);
                if (objInvoke != objM38805e) {
                    objM45774h = objInvoke;
                    closeable2 = closeable;
                    C11958c.m44629a(closeable2, null);
                    return objM45774h;
                }
                return objM38805e;
            } catch (Throwable th4) {
                th = th4;
                closeable2 = closeable;
                throw th;
            }
        }
        factory = (Call.Factory) aVar.f43613w;
        function2 = (Function2) aVar.f43612v;
        networkRequest = (NetworkRequest) aVar.f43611u;
        factory2 = (Call.Factory) aVar.f43610t;
        C7348o.m30470b(objM45774h);
        Call callNewCall = factory.newCall((Request) objM45774h);
        aVar.f43610t = C10350l.m39676a(factory2);
        aVar.f43611u = C10350l.m39676a(networkRequest);
        aVar.f43612v = function2;
        aVar.f43613w = null;
        aVar.f43609A = 2;
        objM45774h = C12309b.m45764a(callNewCall, aVar);
        if (objM45774h != objM38805e) {
            function3 = function2;
            factory3 = factory2;
            closeable = (Closeable) objM45774h;
            Response response2 = (Response) closeable;
            NetworkResponse networkResponseM45773g2 = C12312e.m45773g(response2);
            aVar.f43610t = C10350l.m39676a(factory3);
            aVar.f43611u = C10350l.m39676a(networkRequest);
            aVar.f43612v = C10350l.m39676a(function3);
            aVar.f43613w = closeable;
            aVar.f43614x = C10350l.m39676a(response2);
            aVar.f43615y = 0;
            aVar.f43609A = 3;
            objInvoke = function3.invoke(networkResponseM45773g2, aVar);
            if (objInvoke != objM38805e) {
                objM45774h = objInvoke;
                closeable2 = closeable;
                C11958c.m44629a(closeable2, null);
                return objM45774h;
            }
        }
        return objM38805e;
    }

    /* JADX INFO: renamed from: f */
    public static int m45761f(Call.Factory factory) {
        return factory.hashCode();
    }

    /* JADX INFO: renamed from: g */
    public static String m45762g(Call.Factory factory) {
        return "CallFactoryNetworkClient(callFactory=" + factory + ')';
    }

    @Override // p443t6.InterfaceC11539i
    @Nullable
    /* JADX INFO: renamed from: a */
    public <T> Object mo43118a(@NotNull NetworkRequest networkRequest, @NotNull Function2<? super NetworkResponse, ? super InterfaceC9557b<? super T>, ? extends Object> function2, @NotNull InterfaceC9557b<? super T> interfaceC9557b) {
        return m45760e(this.callFactory, networkRequest, function2, interfaceC9557b);
    }

    public boolean equals(Object other) {
        return m45759d(this.callFactory, other);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final /* synthetic */ Call.Factory getCallFactory() {
        return this.callFactory;
    }

    public int hashCode() {
        return m45761f(this.callFactory);
    }

    public String toString() {
        return m45762g(this.callFactory);
    }
}
