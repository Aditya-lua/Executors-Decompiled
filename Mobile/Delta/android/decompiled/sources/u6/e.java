package u6;

import e.j0;
import java.util.List;
import java.util.Map;
import jt.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.l;
import t6.NetworkHeaders;
import t6.NetworkResponse;
import t6.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0014\u0010\u000b\u001a\u00020\n*\u00020\tH\u0080@¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\u000f\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0080\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\t*\u00020\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0016\u001a\u00020\u0006*\u00060\u0014j\u0002`\u0015H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lt6/n$a;", "", "line", "b", "(Lt6/n$a;Ljava/lang/String;)Lt6/n$a;", "Ln6/a$b;", "", "a", "(Ln6/a$b;)V", "Lt6/r;", "Lxu/e;", "e", "(Lt6/r;Lnt/b;)Ljava/lang/Object;", "Lt6/n;", "other", "d", "(Lt6/n;Lt6/n;)Lt6/n;", "Lt6/q;", "f", "(Lt6/q;)Lt6/r;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "c", "(Ljava/lang/AutoCloseable;)V", "coil-network-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {

    @pt.f(c = "coil3.network.internal.UtilsKt", f = "utils.kt", l = {31}, m = "readBuffer")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f32084t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f32085u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f32086v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f32087w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f32088x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f32089y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f32090z;

        public a(nt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32089y = obj;
            this.f32090z |= Integer.MIN_VALUE;
            return e.e(null, this);
        }
    }

    public static final void a(@NotNull n6.a.b bVar) {
        try {
            bVar.abort();
        } catch (Exception unused) {
        }
    }

    @NotNull
    public static final NetworkHeaders.a b(@NotNull NetworkHeaders.a aVar, @NotNull String str) {
        int iM0 = StringsKt.m0(str, ':', 0, false, 6, null);
        if (iM0 == -1) {
            throw new IllegalArgumentException(("Unexpected header: " + str).toString());
        }
        String strSubstring = str.substring(0, iM0);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String string = StringsKt.p1(strSubstring).toString();
        String strSubstring2 = str.substring(iM0 + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        aVar.a(string, strSubstring2);
        return aVar;
    }

    public static final void c(@NotNull AutoCloseable autoCloseable) {
        try {
            j0.a(autoCloseable);
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    @NotNull
    public static final NetworkHeaders d(@NotNull NetworkHeaders networkHeaders, @NotNull NetworkHeaders networkHeaders2) {
        NetworkHeaders.a aVarD = networkHeaders.d();
        for (Map.Entry<String, List<String>> entry : networkHeaders2.b().entrySet()) {
            aVarD.d(entry.getKey(), entry.getValue());
        }
        return aVarD.b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object e(@NotNull r rVar, @NotNull nt.b<? super xu.e> bVar) throws Exception {
        a aVar;
        AutoCloseable autoCloseable;
        Throwable th2;
        AutoCloseable autoCloseable2;
        xu.f fVar;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f32090z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f32090z = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f32089y;
        Object objE = ot.c.e();
        int i11 = aVar.f32090z;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = (xu.e) aVar.f32087w;
            autoCloseable = (AutoCloseable) aVar.f32085u;
            try {
                o.b(obj);
                autoCloseable2 = autoCloseable;
                xt.a.a(autoCloseable2, null);
                return fVar;
            } catch (Throwable th3) {
                th2 = th3;
                try {
                    throw th2;
                } catch (Throwable th4) {
                    xt.a.a(autoCloseable, th2);
                    throw th4;
                }
            }
        }
        o.b(obj);
        try {
            xu.f eVar = new xu.e();
            aVar.f32084t = l.a(rVar);
            aVar.f32085u = rVar;
            aVar.f32086v = l.a(rVar);
            aVar.f32087w = eVar;
            aVar.f32088x = 0;
            aVar.f32090z = 1;
            if (rVar.x(eVar, aVar) == objE) {
                return objE;
            }
            autoCloseable2 = rVar;
            fVar = eVar;
            xt.a.a(autoCloseable2, null);
            return fVar;
        } catch (Throwable th5) {
            autoCloseable = rVar;
            th2 = th5;
            throw th2;
        }
    }

    @NotNull
    public static final r f(@NotNull NetworkResponse networkResponse) {
        r body = networkResponse.getBody();
        if (body != null) {
            return body;
        }
        throw new IllegalStateException("body == null");
    }
}
