package w6;

import gt.o;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import nt.f;
import nt.l;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t6.NetworkHeaders;
import t6.NetworkRequest;
import t6.NetworkResponse;
import t6.j;
import t6.p;
import vu.g;
import vu.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0082@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\f*\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lt6/o;", "Lokhttp3/Request;", "h", "(Lt6/o;Llt/b;)Ljava/lang/Object;", "Lt6/p;", "Lvu/h;", "d", "(Lt6/p;Llt/b;)Ljava/lang/Object;", "Lokhttp3/Response;", "Lt6/q;", "g", "(Lokhttp3/Response;)Lt6/q;", "Lt6/n;", "Lokhttp3/Headers;", "e", "(Lt6/n;)Lokhttp3/Headers;", "f", "(Lokhttp3/Headers;)Lt6/n;", "coil-network-okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {

    @f(c = "coil3.network.okhttp.internal.UtilsKt", f = "utils.kt", l = {39}, m = "readByteString")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33905t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f33906u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f33907v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f33908w;

        public a(lt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33907v = obj;
            this.f33908w |= Integer.MIN_VALUE;
            return e.d(null, this);
        }
    }

    @f(c = "coil3.network.okhttp.internal.UtilsKt", f = "utils.kt", l = {32}, m = "toRequest")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33909t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f33910u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f33911v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f33912w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f33913x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f33914y;

        public b(lt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33913x = obj;
            this.f33914y |= Integer.MIN_VALUE;
            return e.h(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(p pVar, lt.b<? super h> bVar) {
        a aVar;
        vu.e eVar;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f33908w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f33908w = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f33907v;
        Object objE = mt.c.e();
        int i11 = aVar.f33908w;
        if (i11 == 0) {
            o.b(obj);
            vu.e eVar2 = new vu.e();
            aVar.f33905t = l.a(pVar);
            aVar.f33906u = eVar2;
            aVar.f33908w = 1;
            if (pVar.C(eVar2, aVar) == objE) {
                return objE;
            }
            eVar = eVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = (vu.e) aVar.f33906u;
            o.b(obj);
        }
        return eVar.G2();
    }

    public static final Headers e(NetworkHeaders networkHeaders) {
        Headers.Builder builder = new Headers.Builder();
        for (Map.Entry<String, List<String>> entry : networkHeaders.b().entrySet()) {
            String key = entry.getKey();
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                builder.addUnsafeNonAscii(key, it.next());
            }
        }
        return builder.build();
    }

    public static final NetworkHeaders f(Headers headers) {
        NetworkHeaders.a aVar = new NetworkHeaders.a();
        for (Pair<? extends String, ? extends String> pair : headers) {
            aVar.a(pair.a(), pair.b());
        }
        return aVar.b();
    }

    public static final NetworkResponse g(Response response) {
        g source;
        int iCode = response.code();
        long jSentRequestAtMillis = response.sentRequestAtMillis();
        long jReceivedResponseAtMillis = response.receivedResponseAtMillis();
        NetworkHeaders networkHeadersF = f(response.headers());
        ResponseBody responseBodyBody = response.body();
        return new NetworkResponse(iCode, jSentRequestAtMillis, jReceivedResponseAtMillis, networkHeadersF, (responseBodyBody == null || (source = responseBodyBody.getSource()) == null) ? null : j.a(source), response);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object h(NetworkRequest networkRequest, lt.b<? super Request> bVar) {
        b bVar2;
        Request.Builder builder;
        String str;
        Request.Builder builder2;
        Request.Builder builder3;
        NetworkRequest networkRequest2;
        String str2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f33914y;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f33914y = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object obj = bVar2.f33913x;
        Object objE = mt.c.e();
        int i11 = bVar2.f33914y;
        RequestBody requestBodyCreate$default = null;
        if (i11 == 0) {
            o.b(obj);
            builder = new Request.Builder();
            builder.url(networkRequest.getUrl());
            String method = networkRequest.getMethod();
            p body = networkRequest.getBody();
            if (body != null) {
                bVar2.f33909t = networkRequest;
                bVar2.f33910u = builder;
                bVar2.f33911v = builder;
                bVar2.f33912w = method;
                bVar2.f33914y = 1;
                Object objD = d(body, bVar2);
                if (objD == objE) {
                    return objE;
                }
                builder3 = builder;
                obj = objD;
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
            builder2.headers(e(networkRequest2.getHeaders()));
            return builder2.build();
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str2 = (String) bVar2.f33912w;
        builder3 = (Request.Builder) bVar2.f33911v;
        builder2 = (Request.Builder) bVar2.f33910u;
        networkRequest2 = (NetworkRequest) bVar2.f33909t;
        o.b(obj);
        h hVar = (h) obj;
        if (hVar != null) {
            requestBodyCreate$default = RequestBody.Companion.create$default(RequestBody.INSTANCE, hVar, (MediaType) null, 1, (Object) null);
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
        builder2.headers(e(networkRequest2.getHeaders()));
        return builder2.build();
    }
}
