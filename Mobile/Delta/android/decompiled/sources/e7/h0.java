package e7;

import e.j0;
import java.io.Closeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ku.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x6.ErrorResult;
import x6.ImageRequest;
import x6.Options;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u0002*\u00060\u0005j\u0002`\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\u0012\u001a\u0004\u0018\u00010\u0010*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a1\u0010\u0019\u001a\u00020\u0014*\u00020\u00142\u001c\u0010\u0018\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0018\u00010\u0015H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001d\u0010\u001d\u001a\u00020\u0014*\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010!\u001a\u00020 *\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0017\u0010%\u001a\u00020 2\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&\u001a\u001f\u0010,\u001a\u00020+2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b,\u0010-\"(\u00104\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0006\u0012\u0004\u0018\u00010/0.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0018\u00108\u001a\u00020\u0010*\u0002058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u00107\"\u0018\u0010<\u001a\u00020 *\u0002098@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;\"\u0018\u0010@\u001a\u00020=*\u0002098@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?\" \u0010G\u001a\u0004\u0018\u00010B*\u00020A8@X\u0080\u0004¢\u0006\f\u0012\u0004\bE\u0010F\u001a\u0004\bC\u0010D¨\u0006H"}, d2 = {"Ljava/io/Closeable;", "Lokio/Closeable;", "", "h", "(Ljava/io/Closeable;)V", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "i", "(Ljava/lang/AutoCloseable;)V", "Lk6/h;", "", "data", "Lx6/p;", "options", "Le7/u;", "logger", "", "tag", "q", "(Lk6/h;Ljava/lang/Object;Lx6/p;Le7/u;Ljava/lang/String;)Ljava/lang/String;", "Lk6/h$a;", "Lkotlin/Pair;", "Lo6/j$a;", "Lhu/c;", "pair", "d", "(Lk6/h$a;Lkotlin/Pair;)Lk6/h$a;", "Lm6/i$a;", "factory", "e", "(Lk6/h$a;Lm6/i$a;)Lk6/h$a;", "", "", "o", "(I)Z", "Lk6/h0;", "uri", "n", "(Lk6/h0;)Z", "Lx6/g;", "request", "", "throwable", "Lx6/e;", "c", "(Lx6/g;Ljava/lang/Throwable;)Lx6/e;", "Lkotlin/Function1;", "Lk6/n;", "a", "Lkotlin/jvm/functions/Function1;", "k", "()Lkotlin/jvm/functions/Function1;", "EMPTY_IMAGE_FACTORY", "Lm6/f;", "l", "(Lm6/f;)Ljava/lang/String;", "emoji", "Lp6/d$a;", "p", "(Lp6/d$a;)Z", "isPlaceholderCached", "Lk6/j;", "m", "(Lp6/d$a;)Lk6/j;", "eventListener", "Lkotlin/coroutines/CoroutineContext;", "Lku/l0;", "j", "(Lkotlin/coroutines/CoroutineContext;)Lku/l0;", "getDispatcher$annotations", "(Lkotlin/coroutines/CoroutineContext;)V", "dispatcher", "coil-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Function1<ImageRequest, k6.n> f15189a = a.f15190a;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f15190a = new a();

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(ImageRequest imageRequest) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15191a;

        static {
            int[] iArr = new int[m6.f.values().length];
            try {
                iArr[m6.f.MEMORY_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m6.f.MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m6.f.DISK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m6.f.NETWORK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f15191a = iArr;
        }
    }

    @NotNull
    public static final ErrorResult c(@NotNull ImageRequest imageRequest, @NotNull Throwable th2) {
        k6.n nVarA;
        if (!(th2 instanceof x6.n) || (nVarA = imageRequest.b()) == null) {
            nVarA = imageRequest.a();
        }
        return new ErrorResult(nVarA, imageRequest, th2);
    }

    @NotNull
    public static final k6.h.a d(@NotNull k6.h.a aVar, @Nullable final Pair<? extends o6.j.a<?>, ? extends hu.c<?>> pair) {
        if (pair != null) {
            aVar.r().add(0, new Function0() { // from class: e7.f0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h0.f(pair);
                }
            });
        }
        return aVar;
    }

    @NotNull
    public static final k6.h.a e(@NotNull k6.h.a aVar, @Nullable final m6.i.a aVar2) {
        if (aVar2 != null) {
            aVar.q().add(0, new Function0() { // from class: e7.g0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h0.g(aVar2);
                }
            });
        }
        return aVar;
    }

    public static final List f(Pair pair) {
        return kotlin.collections.o.d(pair);
    }

    public static final List g(m6.i.a aVar) {
        return kotlin.collections.o.d(aVar);
    }

    public static final void h(@NotNull Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void i(@NotNull AutoCloseable autoCloseable) {
        try {
            j0.a(autoCloseable);
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    @Nullable
    public static final l0 j(@NotNull CoroutineContext coroutineContext) {
        return (l0) coroutineContext.get(l0.INSTANCE);
    }

    @NotNull
    public static final Function1<ImageRequest, k6.n> k() {
        return f15189a;
    }

    @NotNull
    public static final String l(@NotNull m6.f fVar) {
        int i10 = b.f15191a[fVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return "🧠";
        }
        if (i10 == 3) {
            return "💾";
        }
        if (i10 == 4) {
            return "☁️";
        }
        throw new jt.l();
    }

    @NotNull
    public static final k6.j m(@NotNull p6.d.a aVar) {
        return aVar instanceof p6.e ? ((p6.e) aVar).getEventListener() : k6.j.b;
    }

    public static final boolean n(@NotNull k6.h0 h0Var) {
        return ((h0Var.getScheme() != null && !Intrinsics.c(h0Var.getScheme(), "file")) || h0Var.getPath() == null || i0.h(h0Var)) ? false : true;
    }

    public static final boolean o(int i10) {
        return i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE;
    }

    public static final boolean p(@NotNull p6.d.a aVar) {
        return (aVar instanceof p6.e) && ((p6.e) aVar).getIsPlaceholderCached();
    }

    @Nullable
    public static final String q(@NotNull k6.h hVar, @NotNull Object obj, @NotNull Options options, @Nullable u uVar, @NotNull String str) {
        List<Pair<q6.c<? extends Object>, hu.c<? extends Object>>> listH = hVar.h();
        int size = listH.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            Pair<q6.c<? extends Object>, hu.c<? extends Object>> pair = listH.get(i10);
            q6.c<? extends Object> cVarA = pair.a();
            if (pair.b().b(obj)) {
                Intrinsics.d(cVarA, "null cannot be cast to non-null type coil3.key.Keyer<kotlin.Any>");
                String strA = cVarA.a(obj, options);
                if (strA != null) {
                    return strA;
                }
                z10 = true;
            }
        }
        if (!z10 && uVar != null) {
            u.a aVar = u.a.Warn;
            if (uVar.a().compareTo(aVar) <= 0) {
                uVar.b(str, aVar, "No keyer is registered for data with type '" + kotlin.jvm.internal.d0.b(obj.getClass()).g() + "'. Register Keyer<" + kotlin.jvm.internal.d0.b(obj.getClass()).g() + "> in the component registry to cache the output image in the memory cache.", null);
            }
        }
        return null;
    }
}
