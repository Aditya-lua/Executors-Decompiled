package mu;

import backtraceio.library.services.BacktraceMetrics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import qu.e0;
import qu.h0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b$\u001a3\u0010\u0004\u001a \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0001\"\u0004\b\u0000\u0010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001aK\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\f\u001a\u00028\u00002\"\b\u0002\u0010\u0011\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001f\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\"\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\"\u0014\u0010&\u001a\u00020\u00158\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b$\u0010%\"\u0014\u0010(\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%\"\u0014\u0010,\u001a\u00020)8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b*\u0010+\"\u0014\u0010.\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+\"\u0014\u00100\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010+\"\u0014\u00102\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010+\"\u0014\u00104\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010+\"\u0014\u00106\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010+\"\u0014\u00108\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010+\"\u0014\u0010:\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010+\"\u001a\u0010>\u001a\u00020)8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010+\u001a\u0004\b<\u0010=\"\u0014\u0010@\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010+\"\u0014\u0010B\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010+\"\u0014\u0010D\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010+\"\u0014\u0010F\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010+\"\u0014\u0010H\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010+\"\u0014\u0010J\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010+\"\u0014\u0010L\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010+¨\u0006M"}, d2 = {"E", "Lkotlin/reflect/KFunction2;", "", "Lmu/m;", "y", "()Lhu/g;", "id", "prev", "x", "(JLmu/m;)Lmu/m;", "T", "Lku/n;", "value", "Lkotlin/Function3;", "", "Lkotlin/coroutines/CoroutineContext;", "", "onCancellation", "", "B", "(Lku/n;Ljava/lang/Object;Lzt/n;)Z", "", "capacity", "A", "(I)J", "counter", "closeStatus", "w", "(JI)J", "pauseEB", "v", "(JZ)J", "", "a", "Lmu/m;", "NULL_SEGMENT", "b", "I", "SEGMENT_SIZE", "c", "EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS", "Lqu/e0;", "d", "Lqu/e0;", "BUFFERED", "e", "IN_BUFFER", "f", "RESUMING_BY_RCV", "g", "RESUMING_BY_EB", "h", "POISONED", "i", "DONE_RCV", "j", "INTERRUPTED_SEND", "k", "INTERRUPTED_RCV", "l", "z", "()Lqu/e0;", "CHANNEL_CLOSED", "m", "SUSPEND", "n", "SUSPEND_NO_WAITER", "o", "FAILED", "p", "NO_RECEIVE_RESULT", "q", "CLOSE_HANDLER_CLOSED", "r", "CLOSE_HANDLER_INVOKED", "s", "NO_CLOSE_CAUSE", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m<Object> f24540a = new m<>(-1, null, null, 0);
    public static final int b = h0.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f24541c = h0.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", BacktraceMetrics.defaultTimeBetweenRetriesMs, 0, 0, 12, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final e0 f24542d = new e0("BUFFERED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final e0 f24543e = new e0("SHOULD_BUFFER");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final e0 f24544f = new e0("S_RESUMING_BY_RCV");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final e0 f24545g = new e0("RESUMING_BY_EB");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final e0 f24546h = new e0("POISONED");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final e0 f24547i = new e0("DONE_RCV");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final e0 f24548j = new e0("INTERRUPTED_SEND");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final e0 f24549k = new e0("INTERRUPTED_RCV");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final e0 f24550l = new e0("CHANNEL_CLOSED");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final e0 f24551m = new e0("SUSPEND");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final e0 f24552n = new e0("SUSPEND_NO_WAITER");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final e0 f24553o = new e0("FAILED");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final e0 f24554p = new e0("NO_RECEIVE_RESULT");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final e0 f24555q = new e0("CLOSE_HANDLER_CLOSED");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final e0 f24556r = new e0("CLOSE_HANDLER_INVOKED");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final e0 f24557s = new e0("NO_CLOSE_CAUSE");

    /* JADX INFO: Add missing generic type declarations: [E] */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a<E> extends kotlin.jvm.internal.k implements Function2<Long, m<E>, m<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f24558a = new a();

        public a() {
            super(2, f.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        public final m<E> d(long j10, m<E> mVar) {
            return f.x(j10, mVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Long l10, Object obj) {
            return d(l10.longValue(), (m) obj);
        }
    }

    public static final long A(int i10) {
        if (i10 == 0) {
            return 0L;
        }
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        return Long.MAX_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean B(ku.n<? super T> nVar, T t8, zt.n<? super Throwable, ? super T, ? super CoroutineContext, Unit> nVar2) {
        Object objG = nVar.G(t8, null, nVar2);
        if (objG == null) {
            return false;
        }
        nVar.J(objG);
        return true;
    }

    public static /* synthetic */ boolean C(ku.n nVar, Object obj, zt.n nVar2, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            nVar2 = null;
        }
        return B(nVar, obj, nVar2);
    }

    public static final long v(long j10, boolean z10) {
        return (z10 ? 4611686018427387904L : 0L) + j10;
    }

    public static final long w(long j10, int i10) {
        return (((long) i10) << 60) + j10;
    }

    public static final <E> m<E> x(long j10, m<E> mVar) {
        return new m<>(j10, mVar, mVar.y(), 0);
    }

    @NotNull
    public static final <E> hu.g<m<E>> y() {
        return a.f24558a;
    }

    @NotNull
    public static final e0 z() {
        return f24550l;
    }
}
