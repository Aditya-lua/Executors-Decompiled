package p096e7;

import hu.InterfaceC6567c;
import java.io.Closeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7697o;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p088e.C4711j0;
import p229jt.C7345l;
import p239k6.AbstractC7469j;
import p239k6.C7465h;
import p239k6.C7466h0;
import p239k6.InterfaceC7474n;
import p256ku.AbstractC7888l0;
import p287m6.EnumC8432f;
import p287m6.InterfaceC8435i;
import p323o6.InterfaceC9702j;
import p353p6.C10169e;
import p353p6.InterfaceC10168d;
import p372q6.InterfaceC10438c;
import p537x6.C12753n;
import p537x6.ErrorResult;
import p537x6.ImageRequest;
import p537x6.Options;

/* JADX INFO: renamed from: e7.h0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u0002*\u00060\u0005j\u0002`\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\u0012\u001a\u0004\u0018\u00010\u0010*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a1\u0010\u0019\u001a\u00020\u0014*\u00020\u00142\u001c\u0010\u0018\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0018\u00010\u0015H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001d\u0010\u001d\u001a\u00020\u0014*\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010!\u001a\u00020 *\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0017\u0010%\u001a\u00020 2\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&\u001a\u001f\u0010,\u001a\u00020+2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b,\u0010-\"(\u00104\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0006\u0012\u0004\u0018\u00010/0.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0018\u00108\u001a\u00020\u0010*\u0002058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u00107\"\u0018\u0010<\u001a\u00020 *\u0002098@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;\"\u0018\u0010@\u001a\u00020=*\u0002098@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?\" \u0010G\u001a\u0004\u0018\u00010B*\u00020A8@X\u0080\u0004¢\u0006\f\u0012\u0004\bE\u0010F\u001a\u0004\bC\u0010D¨\u0006H"}, m31665d2 = {"Ljava/io/Closeable;", "Lokio/Closeable;", "", "h", "(Ljava/io/Closeable;)V", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "i", "(Ljava/lang/AutoCloseable;)V", "Lk6/h;", "", "data", "Lx6/p;", "options", "Le7/u;", "logger", "", "tag", "q", "(Lk6/h;Ljava/lang/Object;Lx6/p;Le7/u;Ljava/lang/String;)Ljava/lang/String;", "Lk6/h$a;", "Lkotlin/Pair;", "Lo6/j$a;", "Lhu/c;", "pair", "d", "(Lk6/h$a;Lkotlin/Pair;)Lk6/h$a;", "Lm6/i$a;", "factory", "e", "(Lk6/h$a;Lm6/i$a;)Lk6/h$a;", "", "", "o", "(I)Z", "Lk6/h0;", "uri", "n", "(Lk6/h0;)Z", "Lx6/g;", "request", "", "throwable", "Lx6/e;", "c", "(Lx6/g;Ljava/lang/Throwable;)Lx6/e;", "Lkotlin/Function1;", "Lk6/n;", "a", "Lkotlin/jvm/functions/Function1;", "k", "()Lkotlin/jvm/functions/Function1;", "EMPTY_IMAGE_FACTORY", "Lm6/f;", "l", "(Lm6/f;)Ljava/lang/String;", "emoji", "Lp6/d$a;", "p", "(Lp6/d$a;)Z", "isPlaceholderCached", "Lk6/j;", "m", "(Lp6/d$a;)Lk6/j;", "eventListener", "Lkotlin/coroutines/CoroutineContext;", "Lku/l0;", "j", "(Lkotlin/coroutines/CoroutineContext;)Lku/l0;", "getDispatcher$annotations", "(Lkotlin/coroutines/CoroutineContext;)V", "dispatcher", "coil-core_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4861h0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Function1<ImageRequest, InterfaceC7474n> f19546a = a.f19547a;

    /* JADX INFO: renamed from: e7.h0$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: a */
        public static final a f19547a = new a();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(ImageRequest imageRequest) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e7.h0$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f19548a;

        static {
            int[] iArr = new int[EnumC8432f.values().length];
            try {
                iArr[EnumC8432f.MEMORY_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC8432f.MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC8432f.DISK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC8432f.NETWORK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f19548a = iArr;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final ErrorResult m23436c(@NotNull ImageRequest imageRequest, @NotNull Throwable th2) {
        InterfaceC7474n interfaceC7474nM47496a;
        if (!(th2 instanceof C12753n) || (interfaceC7474nM47496a = imageRequest.m47497b()) == null) {
            interfaceC7474nM47496a = imageRequest.m47496a();
        }
        return new ErrorResult(interfaceC7474nM47496a, imageRequest, th2);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final C7465h.a m23437d(@NotNull C7465h.a aVar, @Nullable final Pair<? extends InterfaceC9702j.a<?>, ? extends InterfaceC6567c<?>> pair) {
        if (pair != null) {
            aVar.m31015r().add(0, new Function0() { // from class: e7.f0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4861h0.m23439f(pair);
                }
            });
        }
        return aVar;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final C7465h.a m23438e(@NotNull C7465h.a aVar, @Nullable final InterfaceC8435i.a aVar2) {
        if (aVar2 != null) {
            aVar.m31014q().add(0, new Function0() { // from class: e7.g0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C4861h0.m23440g(aVar2);
                }
            });
        }
        return aVar;
    }

    /* JADX INFO: renamed from: f */
    public static final List m23439f(Pair pair) {
        return C7697o.m31878d(pair);
    }

    /* JADX INFO: renamed from: g */
    public static final List m23440g(InterfaceC8435i.a aVar) {
        return C7697o.m31878d(aVar);
    }

    /* JADX INFO: renamed from: h */
    public static final void m23441h(@NotNull Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m23442i(@NotNull AutoCloseable autoCloseable) {
        try {
            C4711j0.m23003a(autoCloseable);
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static final AbstractC7888l0 m23443j(@NotNull CoroutineContext coroutineContext) {
        return (AbstractC7888l0) coroutineContext.get(AbstractC7888l0.INSTANCE);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static final Function1<ImageRequest, InterfaceC7474n> m23444k() {
        return f19546a;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static final String m23445l(@NotNull EnumC8432f enumC8432f) {
        int i10 = b.f19548a[enumC8432f.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return "🧠";
        }
        if (i10 == 3) {
            return "💾";
        }
        if (i10 == 4) {
            return "☁️";
        }
        throw new C7345l();
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static final AbstractC7469j m23446m(@NotNull InterfaceC10168d.a aVar) {
        return aVar instanceof C10169e ? ((C10169e) aVar).getEventListener() : AbstractC7469j.f28765b;
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m23447n(@NotNull C7466h0 c7466h0) {
        return ((c7466h0.getScheme() != null && !Intrinsics.m31980c(c7466h0.getScheme(), "file")) || c7466h0.getPath() == null || C4863i0.m23462h(c7466h0)) ? false : true;
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m23448o(int i10) {
        return i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m23449p(@NotNull InterfaceC10168d.a aVar) {
        return (aVar instanceof C10169e) && ((C10169e) aVar).getIsPlaceholderCached();
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public static final String m23450q(@NotNull C7465h c7465h, @NotNull Object obj, @NotNull Options options, @Nullable InterfaceC4875u interfaceC4875u, @NotNull String str) {
        List<Pair<InterfaceC10438c<? extends Object>, InterfaceC6567c<? extends Object>>> listM30992h = c7465h.m30992h();
        int size = listM30992h.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            Pair<InterfaceC10438c<? extends Object>, InterfaceC6567c<? extends Object>> pair = listM30992h.get(i10);
            InterfaceC10438c<? extends Object> interfaceC10438cM31671a = pair.m31671a();
            if (pair.m31672b().mo28425b(obj)) {
                Intrinsics.m31981d(interfaceC10438cM31671a, "null cannot be cast to non-null type coil3.key.Keyer<kotlin.Any>");
                String strMo40186a = interfaceC10438cM31671a.mo40186a(obj, options);
                if (strMo40186a != null) {
                    return strMo40186a;
                }
                z10 = true;
            }
        }
        if (!z10 && interfaceC4875u != null) {
            InterfaceC4875u.a aVar = InterfaceC4875u.a.Warn;
            if (interfaceC4875u.m23484a().compareTo(aVar) <= 0) {
                interfaceC4875u.m23485b(str, aVar, "No keyer is registered for data with type '" + C7731d0.m32002b(obj.getClass()).mo28427g() + "'. Register Keyer<" + C7731d0.m32002b(obj.getClass()).mo28427g() + "> in the component registry to cache the output image in the memory cache.", null);
            }
        }
        return null;
    }
}
