package x6;

import com.google.mlkit.vision.barcode.common.Barcode;
import ew.g;
import ew.h;
import gu.f;
import gu.l;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mv.f0;
import mv.g0;
import mv.h0;
import mv.i0;
import mv.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import u6.NetworkHeaders;
import u6.NetworkRequest;
import u6.NetworkResponse;
import u6.j;
import u6.p;
import zt.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0082@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\f*\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lu6/o;", "Lmv/f0;", "h", "(Lu6/o;Leu/b;)Ljava/lang/Object;", "Lu6/p;", "Lew/h;", "d", "(Lu6/p;Leu/b;)Ljava/lang/Object;", "Lmv/h0;", "Lu6/q;", "g", "(Lmv/h0;)Lu6/q;", "Lu6/n;", "Lmv/y;", "e", "(Lu6/n;)Lmv/y;", "f", "(Lmv/y;)Lu6/n;", "coil-network-okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "coil3.network.okhttp.internal.UtilsKt", f = "utils.kt", l = {39}, m = "readByteString")
    public static final class a extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f36189t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f36190u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f36191v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f36192w;

        public a(eu.b<? super a> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f36191v = obj;
            this.f36192w |= Integer.MIN_VALUE;
            return e.d(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "coil3.network.okhttp.internal.UtilsKt", f = "utils.kt", l = {Barcode.FORMAT_EAN_13}, m = "toRequest")
    public static final class b extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f36193t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f36194u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f36195v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f36196w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f36197x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f36198y;

        public b(eu.b<? super b> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f36197x = obj;
            this.f36198y |= Integer.MIN_VALUE;
            return e.h(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(p pVar, eu.b<? super h> bVar) {
        a aVar;
        ew.e eVar;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f36192w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f36192w = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f36191v;
        Object objE = fu.c.e();
        int i11 = aVar.f36192w;
        if (i11 == 0) {
            o.b(obj);
            ew.e eVar2 = new ew.e();
            aVar.f36189t = l.a(pVar);
            aVar.f36190u = eVar2;
            aVar.f36192w = 1;
            if (pVar.D(eVar2, aVar) == objE) {
                return objE;
            }
            eVar = eVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = (ew.e) aVar.f36190u;
            o.b(obj);
        }
        return eVar.J2();
    }

    public static final y e(NetworkHeaders networkHeaders) {
        y.a aVar = new y.a();
        for (Map.Entry<String, List<String>> entry : networkHeaders.b().entrySet()) {
            String key = entry.getKey();
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                aVar.e(key, it.next());
            }
        }
        return aVar.f();
    }

    public static final NetworkHeaders f(y yVar) {
        NetworkHeaders.a aVar = new NetworkHeaders.a();
        for (Pair<? extends String, ? extends String> pair : yVar) {
            aVar.a(pair.a(), pair.b());
        }
        return aVar.b();
    }

    public static final NetworkResponse g(h0 h0Var) {
        g source;
        int code = h0Var.getCode();
        long sentRequestAtMillis = h0Var.getSentRequestAtMillis();
        long receivedResponseAtMillis = h0Var.getReceivedResponseAtMillis();
        NetworkHeaders networkHeadersF = f(h0Var.getHeaders());
        i0 body = h0Var.getBody();
        return new NetworkResponse(code, sentRequestAtMillis, receivedResponseAtMillis, networkHeadersF, (body == null || (source = body.getCom.appsflyer.sdk_base.referrer.Payload.SOURCE java.lang.String()) == null) ? null : j.a(source), h0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object h(NetworkRequest networkRequest, eu.b<? super f0> bVar) {
        b bVar2;
        f0.a aVar;
        String str;
        f0.a aVar2;
        f0.a aVar3;
        NetworkRequest networkRequest2;
        String str2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f36198y;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f36198y = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object obj = bVar2.f36197x;
        Object objE = fu.c.e();
        int i11 = bVar2.f36198y;
        g0 g0VarI = null;
        if (i11 == 0) {
            o.b(obj);
            aVar = new f0.a();
            aVar.t(networkRequest.getUrl());
            String method = networkRequest.getMethod();
            p body = networkRequest.getBody();
            if (body != null) {
                bVar2.f36193t = networkRequest;
                bVar2.f36194u = aVar;
                bVar2.f36195v = aVar;
                bVar2.f36196w = method;
                bVar2.f36198y = 1;
                Object objD = d(body, bVar2);
                if (objD == objE) {
                    return objE;
                }
                aVar3 = aVar;
                obj = objD;
                networkRequest2 = networkRequest;
                str2 = method;
                aVar2 = aVar3;
            } else {
                str = method;
                aVar2 = aVar;
            }
            String str3 = str;
            networkRequest2 = networkRequest;
            str2 = str3;
            aVar3 = aVar;
            aVar3.o(str2, g0VarI);
            aVar2.n(e(networkRequest2.getHeaders()));
            return aVar2.b();
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str2 = (String) bVar2.f36196w;
        aVar3 = (f0.a) bVar2.f36195v;
        aVar2 = (f0.a) bVar2.f36194u;
        networkRequest2 = (NetworkRequest) bVar2.f36193t;
        o.b(obj);
        h hVar = (h) obj;
        if (hVar != null) {
            g0VarI = g0.Companion.i(g0.INSTANCE, hVar, null, 1, null);
        } else {
            NetworkRequest networkRequest3 = networkRequest2;
            str = str2;
            networkRequest = networkRequest3;
            aVar = aVar3;
            String str4 = str;
            networkRequest2 = networkRequest;
            str2 = str4;
            aVar3 = aVar;
        }
        aVar3.o(str2, g0VarI);
        aVar2.n(e(networkRequest2.getHeaders()));
        return aVar2.b();
    }
}
