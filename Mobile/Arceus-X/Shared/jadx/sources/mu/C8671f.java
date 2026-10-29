package mu;

import backtraceio.library.services.BacktraceMetrics;
import hu.InterfaceC6571g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7744k;
import org.jetbrains.annotations.NotNull;
import p256ku.InterfaceC7897n;
import p395qu.C10719e0;
import p395qu.C10725h0;
import p615zt.InterfaceC14057n;

/* JADX INFO: renamed from: mu.f */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b$\u001a3\u0010\u0004\u001a \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0001\"\u0004\b\u0000\u0010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001aK\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\f\u001a\u00028\u00002\"\b\u0002\u0010\u0011\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001f\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\"\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\"\u0014\u0010&\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b$\u0010%\"\u0014\u0010(\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%\"\u0014\u0010,\u001a\u00020)8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b*\u0010+\"\u0014\u0010.\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+\"\u0014\u00100\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010+\"\u0014\u00102\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010+\"\u0014\u00104\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010+\"\u0014\u00106\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010+\"\u0014\u00108\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010+\"\u0014\u0010:\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010+\"\u001a\u0010>\u001a\u00020)8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010+\u001a\u0004\b<\u0010=\"\u0014\u0010@\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010+\"\u0014\u0010B\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010+\"\u0014\u0010D\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010+\"\u0014\u0010F\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010+\"\u0014\u0010H\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010+\"\u0014\u0010J\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010+\"\u0014\u0010L\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010+¨\u0006M"}, m31665d2 = {"E", "Lkotlin/reflect/KFunction2;", "", "Lmu/m;", "y", "()Lhu/g;", "id", "prev", "x", "(JLmu/m;)Lmu/m;", "T", "Lku/n;", "value", "Lkotlin/Function3;", "", "Lkotlin/coroutines/CoroutineContext;", "", "onCancellation", "", "B", "(Lku/n;Ljava/lang/Object;Lzt/n;)Z", "", "capacity", "A", "(I)J", "counter", "closeStatus", "w", "(JI)J", "pauseEB", "v", "(JZ)J", "", "a", "Lmu/m;", "NULL_SEGMENT", "b", "I", "SEGMENT_SIZE", "c", "EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS", "Lqu/e0;", "d", "Lqu/e0;", "BUFFERED", "e", "IN_BUFFER", "f", "RESUMING_BY_RCV", "g", "RESUMING_BY_EB", "h", "POISONED", "i", "DONE_RCV", "j", "INTERRUPTED_SEND", "k", "INTERRUPTED_RCV", "l", "z", "()Lqu/e0;", "CHANNEL_CLOSED", "m", "SUSPEND", "n", "SUSPEND_NO_WAITER", "o", "FAILED", "p", "NO_RECEIVE_RESULT", "q", "CLOSE_HANDLER_CLOSED", "r", "CLOSE_HANDLER_INVOKED", "s", "NO_CLOSE_CAUSE", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C8671f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C8678m<Object> f31688a = new C8678m<>(-1, null, null, 0);

    /* JADX INFO: renamed from: b */
    public static final int f31689b = C10725h0.m40855e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);

    /* JADX INFO: renamed from: c */
    public static final int f31690c = C10725h0.m40855e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", BacktraceMetrics.defaultTimeBetweenRetriesMs, 0, 0, 12, null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final C10719e0 f31691d = new C10719e0("BUFFERED");

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final C10719e0 f31692e = new C10719e0("SHOULD_BUFFER");

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final C10719e0 f31693f = new C10719e0("S_RESUMING_BY_RCV");

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final C10719e0 f31694g = new C10719e0("RESUMING_BY_EB");

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final C10719e0 f31695h = new C10719e0("POISONED");

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final C10719e0 f31696i = new C10719e0("DONE_RCV");

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final C10719e0 f31697j = new C10719e0("INTERRUPTED_SEND");

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final C10719e0 f31698k = new C10719e0("INTERRUPTED_RCV");

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final C10719e0 f31699l = new C10719e0("CHANNEL_CLOSED");

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final C10719e0 f31700m = new C10719e0("SUSPEND");

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final C10719e0 f31701n = new C10719e0("SUSPEND_NO_WAITER");

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final C10719e0 f31702o = new C10719e0("FAILED");

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final C10719e0 f31703p = new C10719e0("NO_RECEIVE_RESULT");

    /* JADX INFO: renamed from: q */
    @NotNull
    public static final C10719e0 f31704q = new C10719e0("CLOSE_HANDLER_CLOSED");

    /* JADX INFO: renamed from: r */
    @NotNull
    public static final C10719e0 f31705r = new C10719e0("CLOSE_HANDLER_INVOKED");

    /* JADX INFO: renamed from: s */
    @NotNull
    public static final C10719e0 f31706s = new C10719e0("NO_CLOSE_CAUSE");

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: mu.f$a */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public /* synthetic */ class a<E> extends C7744k implements Function2<Long, C8678m<E>, C8678m<E>> {

        /* JADX INFO: renamed from: a */
        public static final a f31707a = new a();

        public a() {
            super(2, C8671f.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        /* JADX INFO: renamed from: d */
        public final C8678m<E> m34921d(long j10, C8678m<E> c8678m) {
            return C8671f.m34918x(j10, c8678m);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Long l10, Object obj) {
            return m34921d(l10.longValue(), (C8678m) obj);
        }
    }

    /* JADX INFO: renamed from: A */
    public static final long m34892A(int i10) {
        if (i10 == 0) {
            return 0L;
        }
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        return Long.MAX_VALUE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: zt.n<? super java.lang.Throwable, ? super T, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public static final <T> boolean m34893B(InterfaceC7897n<? super T> interfaceC7897n, T t8, InterfaceC14057n<? super Throwable, ? super T, ? super CoroutineContext, Unit> interfaceC14057n) {
        Object objMo32809G = interfaceC7897n.mo32809G(t8, null, interfaceC14057n);
        if (objMo32809G == null) {
            return false;
        }
        interfaceC7897n.mo32810J(objMo32809G);
        return true;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ boolean m34894C(InterfaceC7897n interfaceC7897n, Object obj, InterfaceC14057n interfaceC14057n, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            interfaceC14057n = null;
        }
        return m34893B(interfaceC7897n, obj, interfaceC14057n);
    }

    /* JADX INFO: renamed from: v */
    public static final long m34916v(long j10, boolean z10) {
        return (z10 ? 4611686018427387904L : 0L) + j10;
    }

    /* JADX INFO: renamed from: w */
    public static final long m34917w(long j10, int i10) {
        return (((long) i10) << 60) + j10;
    }

    /* JADX INFO: renamed from: x */
    public static final <E> C8678m<E> m34918x(long j10, C8678m<E> c8678m) {
        return new C8678m<>(j10, c8678m, c8678m.m34955y(), 0);
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public static final <E> InterfaceC6571g<C8678m<E>> m34919y() {
        return a.f31707a;
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public static final C10719e0 m34920z() {
        return f31699l;
    }
}
