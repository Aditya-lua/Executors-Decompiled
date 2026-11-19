package v6;

import com.github.luben.zstd.BuildConfig;
import e.j0;
import gu.l;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;
import u6.NetworkHeaders;
import u6.NetworkResponse;
import u6.r;
import zt.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0014\u0010\u000b\u001a\u00020\n*\u00020\tH\u0080@¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\u000f\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0080\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\t*\u00020\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0016\u001a\u00020\u0006*\u00060\u0014j\u0002`\u0015H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lu6/n$a;", BuildConfig.FLAVOR, "line", "b", "(Lu6/n$a;Ljava/lang/String;)Lu6/n$a;", "Lo6/a$b;", BuildConfig.FLAVOR, "a", "(Lo6/a$b;)V", "Lu6/r;", "Lew/e;", "e", "(Lu6/r;Leu/b;)Ljava/lang/Object;", "Lu6/n;", "other", "d", "(Lu6/n;Lu6/n;)Lu6/n;", "Lu6/q;", "f", "(Lu6/q;)Lu6/r;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "c", "(Ljava/lang/AutoCloseable;)V", "coil-network-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "coil3.network.internal.UtilsKt", f = "utils.kt", l = {31}, m = "readBuffer")
    public static final class a extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f34230t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f34231u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f34232v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f34233w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f34234x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f34235y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f34236z;

        public a(eu.b<? super a> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f34235y = obj;
            this.f34236z |= Integer.MIN_VALUE;
            return e.e(null, this);
        }
    }

    public static final void a(@NotNull o6.a.b bVar) {
        try {
            bVar.a();
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
        String string = StringsKt.n1(strSubstring).toString();
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
    public static final Object e(@NotNull r rVar, @NotNull eu.b<? super ew.e> bVar) throws Exception {
        a aVar;
        AutoCloseable autoCloseable;
        Throwable th2;
        AutoCloseable autoCloseable2;
        ew.f fVar;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f34236z;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f34236z = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f34235y;
        Object objE = fu.c.e();
        int i11 = aVar.f34236z;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = (ew.e) aVar.f34233w;
            autoCloseable = (AutoCloseable) aVar.f34231u;
            try {
                o.b(obj);
                autoCloseable2 = autoCloseable;
                nu.a.a(autoCloseable2, null);
                return fVar;
            } catch (Throwable th3) {
                th2 = th3;
                try {
                    throw th2;
                } catch (Throwable th4) {
                    nu.a.a(autoCloseable, th2);
                    throw th4;
                }
            }
        }
        o.b(obj);
        try {
            ew.f eVar = new ew.e();
            aVar.f34230t = l.a(rVar);
            aVar.f34231u = rVar;
            aVar.f34232v = l.a(rVar);
            aVar.f34233w = eVar;
            aVar.f34234x = 0;
            aVar.f34236z = 1;
            if (rVar.D(eVar, aVar) == objE) {
                return objE;
            }
            autoCloseable2 = rVar;
            fVar = eVar;
            nu.a.a(autoCloseable2, null);
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
