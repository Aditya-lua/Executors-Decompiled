package p508w6;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p443t6.C11540j;
import p443t6.InterfaceC11546p;
import p443t6.NetworkHeaders;
import p443t6.NetworkRequest;
import p443t6.NetworkResponse;
import p560xu.C12924e;
import p560xu.C12930h;
import p560xu.InterfaceC12928g;
import pt.AbstractC10342d;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: w6.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0082@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\f*\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m31665d2 = {"Lt6/o;", "Lokhttp3/Request;", "h", "(Lt6/o;Lnt/b;)Ljava/lang/Object;", "Lt6/p;", "Lxu/h;", "d", "(Lt6/p;Lnt/b;)Ljava/lang/Object;", "Lokhttp3/Response;", "Lt6/q;", "g", "(Lokhttp3/Response;)Lt6/q;", "Lt6/n;", "Lokhttp3/Headers;", "e", "(Lt6/n;)Lokhttp3/Headers;", "f", "(Lokhttp3/Headers;)Lt6/n;", "coil-network-okhttp"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12312e {

    /* JADX INFO: renamed from: w6.e$a */
    @InterfaceC10344f(m39663c = "coil3.network.okhttp.internal.UtilsKt", m39664f = "utils.kt", m39665l = {39}, m39666m = "readByteString")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f43619t;

        /* JADX INFO: renamed from: u */
        public Object f43620u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f43621v;

        /* JADX INFO: renamed from: w */
        public int f43622w;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f43621v = obj;
            this.f43622w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C12312e.m45770d(null, this);
        }
    }

    /* JADX INFO: renamed from: w6.e$b */
    @InterfaceC10344f(m39663c = "coil3.network.okhttp.internal.UtilsKt", m39664f = "utils.kt", m39665l = {32}, m39666m = "toRequest")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f43623t;

        /* JADX INFO: renamed from: u */
        public Object f43624u;

        /* JADX INFO: renamed from: v */
        public Object f43625v;

        /* JADX INFO: renamed from: w */
        public Object f43626w;

        /* JADX INFO: renamed from: x */
        public /* synthetic */ Object f43627x;

        /* JADX INFO: renamed from: y */
        public int f43628y;

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f43627x = obj;
            this.f43628y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C12312e.m45774h(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public static final Object m45770d(InterfaceC11546p interfaceC11546p, InterfaceC9557b<? super C12930h> interfaceC9557b) {
        a aVar;
        C12924e c12924e;
        if (interfaceC9557b instanceof a) {
            aVar = (a) interfaceC9557b;
            int i10 = aVar.f43622w;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                aVar.f43622w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                aVar = new a(interfaceC9557b);
            }
        } else {
            aVar = new a(interfaceC9557b);
        }
        Object obj = aVar.f43621v;
        Object objM38805e = C10047c.m38805e();
        int i11 = aVar.f43622w;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            C12924e c12924e2 = new C12924e();
            aVar.f43619t = C10350l.m39676a(interfaceC11546p);
            aVar.f43620u = c12924e2;
            aVar.f43622w = 1;
            if (interfaceC11546p.m43159x(c12924e2, aVar) == objM38805e) {
                return objM38805e;
            }
            c12924e = c12924e2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c12924e = (C12924e) aVar.f43620u;
            C7348o.m30470b(obj);
        }
        return c12924e.mo47997F2();
    }

    /* JADX INFO: renamed from: e */
    public static final Headers m45771e(NetworkHeaders networkHeaders) {
        Headers.Builder builder = new Headers.Builder();
        for (Map.Entry<String, List<String>> entry : networkHeaders.m43148b().entrySet()) {
            String key = entry.getKey();
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                builder.addUnsafeNonAscii(key, it.next());
            }
        }
        return builder.build();
    }

    /* JADX INFO: renamed from: f */
    public static final NetworkHeaders m45772f(Headers headers) {
        NetworkHeaders.a aVar = new NetworkHeaders.a();
        for (Pair<? extends String, ? extends String> pair : headers) {
            aVar.m43151a(pair.m31671a(), pair.m31672b());
        }
        return aVar.m43152b();
    }

    /* JADX INFO: renamed from: g */
    public static final NetworkResponse m45773g(Response response) {
        InterfaceC12928g source;
        int iCode = response.code();
        long jSentRequestAtMillis = response.sentRequestAtMillis();
        long jReceivedResponseAtMillis = response.receivedResponseAtMillis();
        NetworkHeaders networkHeadersM45772f = m45772f(response.headers());
        ResponseBody responseBodyBody = response.body();
        return new NetworkResponse(iCode, jSentRequestAtMillis, jReceivedResponseAtMillis, networkHeadersM45772f, (responseBodyBody == null || (source = responseBodyBody.getSource()) == null) ? null : C11540j.m43119a(source), response);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public static final Object m45774h(NetworkRequest networkRequest, InterfaceC9557b<? super Request> interfaceC9557b) {
        b bVar;
        Request.Builder builder;
        String str;
        Request.Builder builder2;
        Request.Builder builder3;
        NetworkRequest networkRequest2;
        String str2;
        if (interfaceC9557b instanceof b) {
            bVar = (b) interfaceC9557b;
            int i10 = bVar.f43628y;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                bVar.f43628y = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                bVar = new b(interfaceC9557b);
            }
        } else {
            bVar = new b(interfaceC9557b);
        }
        Object obj = bVar.f43627x;
        Object objM38805e = C10047c.m38805e();
        int i11 = bVar.f43628y;
        RequestBody requestBodyCreate$default = null;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            builder = new Request.Builder();
            builder.url(networkRequest.getUrl());
            String method = networkRequest.getMethod();
            InterfaceC11546p body = networkRequest.getBody();
            if (body != null) {
                bVar.f43623t = networkRequest;
                bVar.f43624u = builder;
                bVar.f43625v = builder;
                bVar.f43626w = method;
                bVar.f43628y = 1;
                Object objM45770d = m45770d(body, bVar);
                if (objM45770d == objM38805e) {
                    return objM38805e;
                }
                builder3 = builder;
                obj = objM45770d;
                networkRequest2 = networkRequest;
                str2 = method;
                builder2 = builder3;
            } else {
                str = method;
                builder2 = builder;
            }
            String str3 = str;
            networkRequest2 = networkRequest;
            str2 = str3;
            builder3 = builder;
            builder3.method(str2, requestBodyCreate$default);
            builder2.headers(m45771e(networkRequest2.getHeaders()));
            return builder2.build();
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str2 = (String) bVar.f43626w;
        builder3 = (Request.Builder) bVar.f43625v;
        builder2 = (Request.Builder) bVar.f43624u;
        networkRequest2 = (NetworkRequest) bVar.f43623t;
        C7348o.m30470b(obj);
        C12930h c12930h = (C12930h) obj;
        if (c12930h != null) {
            requestBodyCreate$default = RequestBody.Companion.create$default(RequestBody.INSTANCE, c12930h, (MediaType) null, 1, (Object) null);
        } else {
            NetworkRequest networkRequest3 = networkRequest2;
            str = str2;
            networkRequest = networkRequest3;
            builder = builder3;
            String str4 = str;
            networkRequest2 = networkRequest;
            str2 = str4;
            builder3 = builder;
        }
        builder3.method(str2, requestBodyCreate$default);
        builder2.headers(m45771e(networkRequest2.getHeaders()));
        return builder2.build();
    }
}
