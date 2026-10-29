package nu;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import ku.i1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u0001CB\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ9\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u001e2\u0010\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J/\u0010.\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u0016H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0013H\u0002¢\u0006\u0004\b0\u0010\u0015J\u0019\u00102\u001a\u0004\u0018\u00010\u001a2\u0006\u00101\u001a\u00020\u0003H\u0002¢\u0006\u0004\b2\u00103J\u0017\u0010\u0001\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0001\u00104J\u0019\u00106\u001a\u0004\u0018\u00010\u001a2\u0006\u00105\u001a\u00020\u0016H\u0002¢\u0006\u0004\b6\u00107J\u0018\u00108\u001a\u00020\u00132\u0006\u00101\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b8\u00109J3\u0010<\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010:0\u001e2\u0014\u0010;\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010:0\u001eH\u0002¢\u0006\u0004\b<\u0010=J\u001e\u0010A\u001a\u00020@2\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>H\u0096@¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\bC\u0010\u0011J\u0018\u0010D\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00028\u0000H\u0096@¢\u0006\u0004\bD\u0010%J\u000f\u0010E\u001a\u00020\u0016H\u0000¢\u0006\u0004\bE\u0010FJ%\u0010H\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010:0\u001e2\u0006\u0010G\u001a\u00020\u0016H\u0000¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0003H\u0014¢\u0006\u0004\bJ\u0010KJ\u001f\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001e2\u0006\u0010L\u001a\u00020\u0007H\u0014¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\u0013H\u0016¢\u0006\u0004\bO\u0010\u0015J-\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00000S2\u0006\u0010Q\u001a\u00020P2\u0006\u0010R\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\bT\u0010UR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010<R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010<R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR \u0010[\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010^\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010_\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010]R\u0016\u0010a\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010<R\u0016\u0010c\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010<R\u0014\u0010e\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bd\u0010FR\u0014\u0010h\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0014\u0010j\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bi\u0010gR\u0014\u0010k\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u0010FR\u0014\u0010m\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010FR\u001a\u0010q\u001a\u00028\u00008DX\u0084\u0004¢\u0006\f\u0012\u0004\bp\u0010\u0015\u001a\u0004\bn\u0010o¨\u0006r"}, d2 = {"Lnu/h0;", "T", "Lou/b;", "Lnu/j0;", "Lnu/b0;", "Lnu/c;", "Lou/q;", "", "replay", "bufferCapacity", "Lmu/a;", "onBufferOverflow", "<init>", "(IILmu/a;)V", "value", "", "R", "(Ljava/lang/Object;)Z", "S", "", "E", "()V", "", "newHead", "B", "(J)V", "", "item", "H", "(Ljava/lang/Object;)V", "", "curBuffer", "curSize", "newSize", "Q", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "G", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "Lnu/h0$a;", "emitter", "y", "(Lnu/h0$a;)V", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "V", "(JJJJ)V", "z", "slot", "U", "(Lnu/j0;)Ljava/lang/Object;", "(Lnu/j0;)J", "index", "M", "(J)Ljava/lang/Object;", "x", "(Lnu/j0;Lnt/b;)Ljava/lang/Object;", "Lnt/b;", "resumesIn", "I", "([Lnt/b;)[Lnt/b;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "a", "emit", "X", "()J", "oldIndex", "W", "(J)[Lnt/b;", "C", "()Lnu/j0;", "size", "D", "(I)[Lnu/j0;", "j", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Lnu/h;", "e", "(Lkotlin/coroutines/CoroutineContext;ILmu/a;)Lnu/h;", "f", "g", "Lmu/a;", "h", "[Ljava/lang/Object;", "buffer", "i", "J", "replayIndex", "minCollectorIndex", "k", "bufferSize", "l", "queueSize", "K", "head", "O", "()I", "replaySize", "P", "totalSize", "bufferEndIndex", "N", "queueEndIndex", "L", "()Ljava/lang/Object;", "getLastReplayedLocked$annotations", "lastReplayedLocked", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class h0<T> extends p001ou.b<j0> implements b0<T>, nu.c<T>, p001ou.q<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int replay;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final int bufferCapacity;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mu.a onBufferOverflow;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Object[] buffer;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public long replayIndex;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public long minCollectorIndex;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public int bufferSize;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int queueSize;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B3\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lnu/h0$a;", "Lku/i1;", "Lnu/h0;", "flow", "", "index", "", "value", "Lnt/b;", "", "cont", "<init>", "(Lnu/h0;JLjava/lang/Object;Lnt/b;)V", "a", "()V", "Lnu/h0;", "b", "J", "c", "Ljava/lang/Object;", "d", "Lnt/b;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements i1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final h0<?> flow;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public long index;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Object value;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final nt.b<Unit> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull h0<?> h0Var, long j10, @Nullable Object obj, @NotNull nt.b<? super Unit> bVar) {
            this.flow = h0Var;
            this.index = j10;
            this.value = obj;
            this.cont = bVar;
        }

        @Override // ku.i1
        public void a() {
            this.flow.y(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26713a;

        static {
            int[] iArr = new int[mu.a.values().length];
            try {
                iArr[mu.a.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mu.a.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mu.a.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f26713a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @pt.f(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {387, 394, 397}, m = "collect$suspendImpl")
    public static final class c<T> extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f26714t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f26715u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f26716v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f26717w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f26718x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ h0<T> f26719y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f26720z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h0<T> h0Var, nt.b<? super c> bVar) {
            super(bVar);
            this.f26719y = h0Var;
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f26718x = obj;
            this.f26720z |= Integer.MIN_VALUE;
            return h0.A(this.f26719y, null, this);
        }
    }

    public h0(int i10, int i11, @NotNull mu.a aVar) {
        this.replay = i10;
        this.bufferCapacity = i11;
        this.onBufferOverflow = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (((nu.t0) r9).b(r0) == r1) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ <T> java.lang.Object A(nu.h0<T> r8, nu.i<? super T> r9, nt.b<?> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nu.h0.A(nu.h0, nu.i, nt.b):java.lang.Object");
    }

    public static /* synthetic */ <T> Object F(h0<T> h0Var, T t8, nt.b<? super Unit> bVar) {
        Object objG;
        return (!h0Var.a(t8) && (objG = h0Var.G(t8, bVar)) == ot.c.e()) ? objG : Unit.f22483a;
    }

    public final void B(long newHead) {
        p001ou.d[] dVarArr;
        if (this.nCollectors != 0 && (dVarArr = this.slots) != null) {
            for (p001ou.d dVar : dVarArr) {
                if (dVar != null) {
                    j0 j0Var = (j0) dVar;
                    long j10 = j0Var.index;
                    if (j10 >= 0 && j10 < newHead) {
                        j0Var.index = newHead;
                    }
                }
            }
        }
        this.minCollectorIndex = newHead;
    }

    @Override // p001ou.b
    @NotNull
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public j0 f() {
        return new j0();
    }

    @Override // p001ou.b
    @NotNull
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public j0[] h(int size) {
        return new j0[size];
    }

    public final void E() {
        Object[] objArr = this.buffer;
        Intrinsics.checkNotNull(objArr);
        i0.g(objArr, K(), null);
        this.bufferSize--;
        long jK = K() + 1;
        if (this.replayIndex < jK) {
            this.replayIndex = jK;
        }
        if (this.minCollectorIndex < jK) {
            B(jK);
        }
    }

    public final Object G(T t8, nt.b<? super Unit> bVar) throws Throwable {
        Throwable th2;
        nt.b<Unit>[] bVarArrI;
        a aVar;
        ku.p pVar = new ku.p(ot.b.c(bVar), 1);
        pVar.H();
        nt.b<Unit>[] bVarArrI2 = p001ou.c.f27943a;
        synchronized (this) {
            try {
                if (R(t8)) {
                    try {
                        jt.n.Companion companion = jt.n.INSTANCE;
                        pVar.resumeWith(jt.n.b(Unit.f22483a));
                        bVarArrI = I(bVarArrI2);
                        aVar = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    try {
                        aVar = new a(this, K() + ((long) P()), t8, pVar);
                        H(aVar);
                        this.queueSize++;
                        if (this.bufferCapacity == 0) {
                            bVarArrI2 = I(bVarArrI2);
                        }
                        bVarArrI = bVarArrI2;
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        throw th2;
                    }
                }
                if (aVar != null) {
                    ku.r.a(pVar, aVar);
                }
                for (nt.b<Unit> bVar2 : bVarArrI) {
                    if (bVar2 != null) {
                        jt.n.Companion companion2 = jt.n.INSTANCE;
                        bVar2.resumeWith(jt.n.b(Unit.f22483a));
                    }
                }
                Object objA = pVar.A();
                if (objA == ot.c.e()) {
                    pt.h.c(bVar);
                }
                return objA == ot.c.e() ? objA : Unit.f22483a;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public final void H(Object item) {
        int iP = P();
        Object[] objArrQ = this.buffer;
        if (objArrQ == null) {
            objArrQ = Q(null, 0, 2);
        } else if (iP >= objArrQ.length) {
            objArrQ = Q(objArrQ, iP, objArrQ.length * 2);
        }
        i0.g(objArrQ, K() + ((long) iP), item);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [nt.b<kotlin.Unit>[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final nt.b<Unit>[] I(nt.b<Unit>[] resumesIn) {
        p001ou.d[] dVarArr;
        j0 j0Var;
        nt.b<? super Unit> bVar;
        int length = resumesIn.length;
        if (this.nCollectors != 0 && (dVarArr = this.slots) != null) {
            int length2 = dVarArr.length;
            int i10 = 0;
            while (i10 < length2) {
                p001ou.d dVar = dVarArr[i10];
                if (dVar == null || (bVar = (j0Var = (j0) dVar).cont) == null || T(j0Var) < 0) {
                    resumesIn = resumesIn;
                } else {
                    if (length >= resumesIn.length) {
                        resumesIn = resumesIn;
                        resumesIn = resumesIn;
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) resumesIn, Math.max(2, resumesIn.length * 2));
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                        resumesIn = objArrCopyOf;
                    }
                    resumesIn = resumesIn;
                    resumesIn = resumesIn;
                    ((nt.b[]) resumesIn)[length] = bVar;
                    j0Var.cont = null;
                    length++;
                }
                i10++;
                resumesIn = resumesIn;
            }
            resumesIn = resumesIn;
        }
        return (nt.b[]) resumesIn;
    }

    public final long J() {
        return K() + ((long) this.bufferSize);
    }

    public final long K() {
        return Math.min(this.minCollectorIndex, this.replayIndex);
    }

    public final T L() {
        Object[] objArr = this.buffer;
        Intrinsics.checkNotNull(objArr);
        return (T) i0.f(objArr, (this.replayIndex + ((long) O())) - 1);
    }

    public final Object M(long index) {
        Object[] objArr = this.buffer;
        Intrinsics.checkNotNull(objArr);
        Object objF = i0.f(objArr, index);
        return objF instanceof a ? ((a) objF).value : objF;
    }

    public final long N() {
        return K() + ((long) this.bufferSize) + ((long) this.queueSize);
    }

    public final int O() {
        return (int) ((K() + ((long) this.bufferSize)) - this.replayIndex);
    }

    public final int P() {
        return this.bufferSize + this.queueSize;
    }

    public final Object[] Q(Object[] curBuffer, int curSize, int newSize) {
        if (newSize <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr = new Object[newSize];
        this.buffer = objArr;
        if (curBuffer != null) {
            long jK = K();
            for (int i10 = 0; i10 < curSize; i10++) {
                long j10 = ((long) i10) + jK;
                i0.g(objArr, j10, i0.f(curBuffer, j10));
            }
        }
        return objArr;
    }

    public final boolean R(T value) {
        if (getNCollectors() == 0) {
            return S(value);
        }
        if (this.bufferSize >= this.bufferCapacity && this.minCollectorIndex <= this.replayIndex) {
            int i10 = b.f26713a[this.onBufferOverflow.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2) {
                return true;
            }
            if (i10 != 3) {
                throw new jt.l();
            }
        }
        H(value);
        int i11 = this.bufferSize + 1;
        this.bufferSize = i11;
        if (i11 > this.bufferCapacity) {
            E();
        }
        if (O() > this.replay) {
            V(this.replayIndex + 1, this.minCollectorIndex, J(), N());
        }
        return true;
    }

    public final boolean S(T value) {
        if (this.replay == 0) {
            return true;
        }
        H(value);
        int i10 = this.bufferSize + 1;
        this.bufferSize = i10;
        if (i10 > this.replay) {
            E();
        }
        this.minCollectorIndex = K() + ((long) this.bufferSize);
        return true;
    }

    public final long T(j0 slot) {
        long j10 = slot.index;
        if (j10 >= J() && (this.bufferCapacity > 0 || j10 > K() || this.queueSize == 0)) {
            return -1L;
        }
        return j10;
    }

    public final Object U(j0 slot) {
        Object obj;
        nt.b<Unit>[] bVarArrW = p001ou.c.f27943a;
        synchronized (this) {
            try {
                long jT = T(slot);
                if (jT < 0) {
                    obj = i0.f26721a;
                } else {
                    long j10 = slot.index;
                    Object objM = M(jT);
                    slot.index = jT + 1;
                    bVarArrW = W(j10);
                    obj = objM;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (nt.b<Unit> bVar : bVarArrW) {
            if (bVar != null) {
                jt.n.Companion companion = jt.n.INSTANCE;
                bVar.resumeWith(jt.n.b(Unit.f22483a));
            }
        }
        return obj;
    }

    public final void V(long newReplayIndex, long newMinCollectorIndex, long newBufferEndIndex, long newQueueEndIndex) {
        long jMin = Math.min(newMinCollectorIndex, newReplayIndex);
        for (long jK = K(); jK < jMin; jK++) {
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            i0.g(objArr, jK, null);
        }
        this.replayIndex = newReplayIndex;
        this.minCollectorIndex = newMinCollectorIndex;
        this.bufferSize = (int) (newBufferEndIndex - jMin);
        this.queueSize = (int) (newQueueEndIndex - newBufferEndIndex);
    }

    @NotNull
    public final nt.b<Unit>[] W(long oldIndex) {
        long j10;
        long j11;
        long j12;
        p001ou.d[] dVarArr;
        if (oldIndex > this.minCollectorIndex) {
            return p001ou.c.f27943a;
        }
        long jK = K();
        long j13 = ((long) this.bufferSize) + jK;
        if (this.bufferCapacity == 0 && this.queueSize > 0) {
            j13++;
        }
        if (this.nCollectors != 0 && (dVarArr = this.slots) != null) {
            for (p001ou.d dVar : dVarArr) {
                if (dVar != null) {
                    long j14 = ((j0) dVar).index;
                    if (j14 >= 0 && j14 < j13) {
                        j13 = j14;
                    }
                }
            }
        }
        if (j13 <= this.minCollectorIndex) {
            return p001ou.c.f27943a;
        }
        long J = J();
        int iMin = getNCollectors() > 0 ? Math.min(this.queueSize, this.bufferCapacity - ((int) (J - j13))) : this.queueSize;
        nt.b<Unit>[] bVarArr = p001ou.c.f27943a;
        long j15 = ((long) this.queueSize) + J;
        if (iMin > 0) {
            bVarArr = new nt.b[iMin];
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            j12 = 1;
            long j16 = J;
            int i10 = 0;
            while (true) {
                if (J >= j15) {
                    j10 = jK;
                    j11 = j13;
                    J = j16;
                    break;
                }
                Object objF = i0.f(objArr, J);
                j10 = jK;
                qu.e0 e0Var = i0.f26721a;
                if (objF != e0Var) {
                    Intrinsics.d(objF, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) objF;
                    int i11 = i10 + 1;
                    j11 = j13;
                    bVarArr[i10] = aVar.cont;
                    i0.g(objArr, J, e0Var);
                    i0.g(objArr, j16, aVar.value);
                    long j17 = j16 + 1;
                    if (i11 >= iMin) {
                        J = j17;
                        break;
                    }
                    i10 = i11;
                    j16 = j17;
                } else {
                    j11 = j13;
                }
                J++;
                jK = j10;
                j13 = j11;
            }
        } else {
            j10 = jK;
            j11 = j13;
            j12 = 1;
        }
        nt.b<Unit>[] bVarArr2 = bVarArr;
        int i12 = (int) (J - j10);
        long j18 = getNCollectors() == 0 ? J : j11;
        long jMax = Math.max(this.replayIndex, J - ((long) Math.min(this.replay, i12)));
        if (this.bufferCapacity == 0 && jMax < j15) {
            Object[] objArr2 = this.buffer;
            Intrinsics.checkNotNull(objArr2);
            if (Intrinsics.c(i0.f(objArr2, jMax), i0.f26721a)) {
                J += j12;
                jMax += j12;
            }
        }
        V(jMax, j18, J, j15);
        z();
        return !(bVarArr2.length == 0) ? I(bVarArr2) : bVarArr2;
    }

    public final long X() {
        long j10 = this.replayIndex;
        if (j10 < this.minCollectorIndex) {
            this.minCollectorIndex = j10;
        }
        return j10;
    }

    @Override // nu.b0
    public boolean a(T value) {
        int i10;
        boolean z10;
        nt.b<Unit>[] bVarArrI = p001ou.c.f27943a;
        synchronized (this) {
            if (R(value)) {
                bVarArrI = I(bVarArrI);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (nt.b<Unit> bVar : bVarArrI) {
            if (bVar != null) {
                jt.n.Companion companion = jt.n.INSTANCE;
                bVar.resumeWith(jt.n.b(Unit.f22483a));
            }
        }
        return z10;
    }

    @Override // nu.g0, nu.h
    @Nullable
    public Object collect(@NotNull i<? super T> iVar, @NotNull nt.b<?> bVar) {
        return A(this, iVar, bVar);
    }

    @Override // p001ou.q
    @NotNull
    public h<T> e(@NotNull CoroutineContext context, int capacity, @NotNull mu.a onBufferOverflow) {
        return i0.e(this, context, capacity, onBufferOverflow);
    }

    @Override // nu.b0, nu.i
    @Nullable
    public Object emit(T t8, @NotNull nt.b<? super Unit> bVar) {
        return F(this, t8, bVar);
    }

    @Override // nu.b0
    public void j() throws Throwable {
        synchronized (this) {
            try {
                try {
                    V(J(), this.minCollectorIndex, J(), N());
                    Unit unit = Unit.f22483a;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final Object x(j0 j0Var, nt.b<? super Unit> bVar) {
        ku.p pVar = new ku.p(ot.b.c(bVar), 1);
        pVar.H();
        synchronized (this) {
            try {
                if (T(j0Var) < 0) {
                    j0Var.cont = pVar;
                } else {
                    jt.n.Companion companion = jt.n.INSTANCE;
                    pVar.resumeWith(jt.n.b(Unit.f22483a));
                }
                Unit unit = Unit.f22483a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object objA = pVar.A();
        if (objA == ot.c.e()) {
            pt.h.c(bVar);
        }
        return objA == ot.c.e() ? objA : Unit.f22483a;
    }

    public final void y(a emitter) {
        synchronized (this) {
            if (emitter.index < K()) {
                return;
            }
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            if (i0.f(objArr, emitter.index) != emitter) {
                return;
            }
            i0.g(objArr, emitter.index, i0.f26721a);
            z();
            Unit unit = Unit.f22483a;
        }
    }

    public final void z() {
        if (this.bufferCapacity != 0 || this.queueSize > 1) {
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            while (this.queueSize > 0 && i0.f(objArr, (K() + ((long) P())) - 1) == i0.f26721a) {
                this.queueSize--;
                i0.g(objArr, K() + ((long) P()), null);
            }
        }
    }
}
