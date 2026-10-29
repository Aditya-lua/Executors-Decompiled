package p460u6;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p088e.C4711j0;
import p229jt.C7348o;
import p302n6.InterfaceC8887a;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p443t6.InterfaceC11548r;
import p443t6.NetworkHeaders;
import p443t6.NetworkResponse;
import p559xt.C12915a;
import p560xu.C12924e;
import p560xu.InterfaceC12926f;
import pt.AbstractC10342d;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: u6.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0014\u0010\u000b\u001a\u00020\n*\u00020\tH\u0080@¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\u000f\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0080\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\t*\u00020\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0016\u001a\u00020\u0006*\u00060\u0014j\u0002`\u0015H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m31665d2 = {"Lt6/n$a;", "", "line", "b", "(Lt6/n$a;Ljava/lang/String;)Lt6/n$a;", "Ln6/a$b;", "", "a", "(Ln6/a$b;)V", "Lt6/r;", "Lxu/e;", "e", "(Lt6/r;Lnt/b;)Ljava/lang/Object;", "Lt6/n;", "other", "d", "(Lt6/n;Lt6/n;)Lt6/n;", "Lt6/q;", "f", "(Lt6/q;)Lt6/r;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "c", "(Ljava/lang/AutoCloseable;)V", "coil-network-core_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11807e {

    /* JADX INFO: renamed from: u6.e$a */
    @InterfaceC10344f(m39663c = "coil3.network.internal.UtilsKt", m39664f = "utils.kt", m39665l = {31}, m39666m = "readBuffer")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f41560t;

        /* JADX INFO: renamed from: u */
        public Object f41561u;

        /* JADX INFO: renamed from: v */
        public Object f41562v;

        /* JADX INFO: renamed from: w */
        public Object f41563w;

        /* JADX INFO: renamed from: x */
        public int f41564x;

        /* JADX INFO: renamed from: y */
        public /* synthetic */ Object f41565y;

        /* JADX INFO: renamed from: z */
        public int f41566z;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f41565y = obj;
            this.f41566z |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C11807e.m44163e(null, this);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m44159a(@NotNull InterfaceC8887a.b bVar) {
        try {
            bVar.abort();
        } catch (Exception unused) {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final NetworkHeaders.a m44160b(@NotNull NetworkHeaders.a aVar, @NotNull String str) {
        int iM0 = StringsKt.m32176m0(str, ':', 0, false, 6, null);
        if (iM0 == -1) {
            throw new IllegalArgumentException(("Unexpected header: " + str).toString());
        }
        String strSubstring = str.substring(0, iM0);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String string = StringsKt.m32183p1(strSubstring).toString();
        String strSubstring2 = str.substring(iM0 + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        aVar.m43151a(string, strSubstring2);
        return aVar;
    }

    /* JADX INFO: renamed from: c */
    public static final void m44161c(@NotNull AutoCloseable autoCloseable) {
        try {
            C4711j0.m23003a(autoCloseable);
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final NetworkHeaders m44162d(@NotNull NetworkHeaders networkHeaders, @NotNull NetworkHeaders networkHeaders2) {
        NetworkHeaders.a aVarM43150d = networkHeaders.m43150d();
        for (Map.Entry<String, List<String>> entry : networkHeaders2.m43148b().entrySet()) {
            aVarM43150d.m43154d(entry.getKey(), entry.getValue());
        }
        return aVarM43150d.m43152b();
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:14:0x0039 */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: e */
    public static final Object m44163e(@NotNull InterfaceC11548r interfaceC11548r, @NotNull InterfaceC9557b<? super C12924e> interfaceC9557b) throws Exception {
        a aVar;
        AutoCloseable autoCloseable;
        Throwable th2;
        AutoCloseable autoCloseable2;
        InterfaceC12926f interfaceC12926f;
        if (interfaceC9557b instanceof a) {
            aVar = (a) interfaceC9557b;
            int i10 = aVar.f41566z;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                aVar.f41566z = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                aVar = new a(interfaceC9557b);
            }
        } else {
            aVar = new a(interfaceC9557b);
        }
        Object obj = aVar.f41565y;
        Object objM38805e = C10047c.m38805e();
        int i11 = aVar.f41566z;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC12926f = (C12924e) aVar.f41563w;
            autoCloseable = (AutoCloseable) aVar.f41561u;
            try {
                C7348o.m30470b(obj);
                autoCloseable2 = autoCloseable;
                C12915a.m47941a(autoCloseable2, null);
                return interfaceC12926f;
            } catch (Throwable th3) {
                th2 = th3;
                try {
                    throw th2;
                } catch (Throwable th4) {
                    C12915a.m47941a(autoCloseable, th2);
                    throw th4;
                }
            }
        }
        C7348o.m30470b(obj);
        try {
            InterfaceC12926f c12924e = new C12924e();
            aVar.f41560t = C10350l.m39676a(interfaceC11548r);
            aVar.f41561u = interfaceC11548r;
            aVar.f41562v = C10350l.m39676a(interfaceC11548r);
            aVar.f41563w = c12924e;
            aVar.f41564x = 0;
            aVar.f41566z = 1;
            if (interfaceC11548r.mo43168x(c12924e, aVar) == objM38805e) {
                return objM38805e;
            }
            autoCloseable2 = interfaceC11548r;
            interfaceC12926f = c12924e;
            C12915a.m47941a(autoCloseable2, null);
            return interfaceC12926f;
        } catch (Throwable th5) {
            autoCloseable = interfaceC11548r;
            th2 = th5;
            throw th2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final InterfaceC11548r m44164f(@NotNull NetworkResponse networkResponse) {
        InterfaceC11548r body = networkResponse.getBody();
        if (body != null) {
            return body;
        }
        throw new IllegalStateException("body == null");
    }
}
