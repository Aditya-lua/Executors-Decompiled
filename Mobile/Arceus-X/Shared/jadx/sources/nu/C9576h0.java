package nu;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import mu.EnumC8666a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7345l;
import p229jt.C7347n;
import p229jt.C7348o;
import p256ku.C7865g2;
import p256ku.C7905p;
import p256ku.C7913r;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7874i1;
import p315nt.InterfaceC9557b;
import p344ot.C10046b;
import p344ot.C10047c;
import p395qu.C10719e0;
import p617ou.AbstractC10050b;
import p617ou.AbstractC10054d;
import p617ou.C10052c;
import p617ou.InterfaceC10067q;
import pt.AbstractC10342d;
import pt.C10346h;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: nu.h0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u0001CB\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ9\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u001e2\u0010\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00132\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J/\u0010.\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u0016H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0013H\u0002¢\u0006\u0004\b0\u0010\u0015J\u0019\u00102\u001a\u0004\u0018\u00010\u001a2\u0006\u00101\u001a\u00020\u0003H\u0002¢\u0006\u0004\b2\u00103J\u0017\u0010\u0001\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0001\u00104J\u0019\u00106\u001a\u0004\u0018\u00010\u001a2\u0006\u00105\u001a\u00020\u0016H\u0002¢\u0006\u0004\b6\u00107J\u0018\u00108\u001a\u00020\u00132\u0006\u00101\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b8\u00109J3\u0010<\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010:0\u001e2\u0014\u0010;\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010:0\u001eH\u0002¢\u0006\u0004\b<\u0010=J\u001e\u0010A\u001a\u00020@2\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>H\u0096@¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\bC\u0010\u0011J\u0018\u0010D\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00028\u0000H\u0096@¢\u0006\u0004\bD\u0010%J\u000f\u0010E\u001a\u00020\u0016H\u0000¢\u0006\u0004\bE\u0010FJ%\u0010H\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010:0\u001e2\u0006\u0010G\u001a\u00020\u0016H\u0000¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0003H\u0014¢\u0006\u0004\bJ\u0010KJ\u001f\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001e2\u0006\u0010L\u001a\u00020\u0007H\u0014¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\u0013H\u0016¢\u0006\u0004\bO\u0010\u0015J-\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00000S2\u0006\u0010Q\u001a\u00020P2\u0006\u0010R\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\bT\u0010UR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010<R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010<R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR \u0010[\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010^\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010_\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010]R\u0016\u0010a\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010<R\u0016\u0010c\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010<R\u0014\u0010e\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bd\u0010FR\u0014\u0010h\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0014\u0010j\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bi\u0010gR\u0014\u0010k\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u0010FR\u0014\u0010m\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010FR\u001a\u0010q\u001a\u00028\u00008DX\u0084\u0004¢\u0006\f\u0012\u0004\bp\u0010\u0015\u001a\u0004\bn\u0010o¨\u0006r"}, m31665d2 = {"Lnu/h0;", "T", "Lou/b;", "Lnu/j0;", "Lnu/b0;", "Lnu/c;", "Lou/q;", "", "replay", "bufferCapacity", "Lmu/a;", "onBufferOverflow", "<init>", "(IILmu/a;)V", "value", "", "R", "(Ljava/lang/Object;)Z", "S", "", "E", "()V", "", "newHead", "B", "(J)V", "", "item", "H", "(Ljava/lang/Object;)V", "", "curBuffer", "curSize", "newSize", "Q", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "G", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "Lnu/h0$a;", "emitter", "y", "(Lnu/h0$a;)V", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "V", "(JJJJ)V", "z", "slot", "U", "(Lnu/j0;)Ljava/lang/Object;", "(Lnu/j0;)J", "index", "M", "(J)Ljava/lang/Object;", "x", "(Lnu/j0;Lnt/b;)Ljava/lang/Object;", "Lnt/b;", "resumesIn", "I", "([Lnt/b;)[Lnt/b;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "a", "emit", "X", "()J", "oldIndex", "W", "(J)[Lnt/b;", "C", "()Lnu/j0;", "size", "D", "(I)[Lnu/j0;", "j", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Lnu/h;", "e", "(Lkotlin/coroutines/CoroutineContext;ILmu/a;)Lnu/h;", "f", "g", "Lmu/a;", "h", "[Ljava/lang/Object;", "buffer", "i", "J", "replayIndex", "minCollectorIndex", "k", "bufferSize", "l", "queueSize", "K", "head", "O", "()I", "replaySize", "P", "totalSize", "bufferEndIndex", "N", "queueEndIndex", "L", "()Ljava/lang/Object;", "getLastReplayedLocked$annotations", "lastReplayedLocked", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public class C9576h0<T> extends AbstractC10050b<C9580j0> implements InterfaceC9564b0<T>, InterfaceC9565c<T>, InterfaceC10067q<T> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int replay;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int bufferCapacity;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final EnumC8666a onBufferOverflow;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public Object[] buffer;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public long replayIndex;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public long minCollectorIndex;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int bufferSize;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public int queueSize;

    /* JADX INFO: renamed from: nu.h0$a */
    @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B3\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m31665d2 = {"Lnu/h0$a;", "Lku/i1;", "Lnu/h0;", "flow", "", "index", "", "value", "Lnt/b;", "", "cont", "<init>", "(Lnu/h0;JLjava/lang/Object;Lnt/b;)V", "a", "()V", "Lnu/h0;", "b", "J", "c", "Ljava/lang/Object;", "d", "Lnt/b;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a implements InterfaceC7874i1 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final C9576h0<?> flow;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public long index;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final Object value;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC9557b<Unit> cont;

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: nt.b<? super kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull C9576h0<?> c9576h0, long j10, @Nullable Object obj, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
            this.flow = c9576h0;
            this.index = j10;
            this.value = obj;
            this.cont = interfaceC9557b;
        }

        @Override // p256ku.InterfaceC7874i1
        /* JADX INFO: renamed from: a */
        public void mo32664a() {
            this.flow.m37755y(this);
        }
    }

    /* JADX INFO: renamed from: nu.h0$b */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f34593a;

        static {
            int[] iArr = new int[EnumC8666a.values().length];
            try {
                iArr[EnumC8666a.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC8666a.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC8666a.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f34593a = iArr;
        }
    }

    /* JADX INFO: renamed from: nu.h0$c */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.SharedFlowImpl", m39664f = "SharedFlow.kt", m39665l = {387, 394, 397}, m39666m = "collect$suspendImpl")
    public static final class c<T> extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f34594t;

        /* JADX INFO: renamed from: u */
        public Object f34595u;

        /* JADX INFO: renamed from: v */
        public Object f34596v;

        /* JADX INFO: renamed from: w */
        public Object f34597w;

        /* JADX INFO: renamed from: x */
        public /* synthetic */ Object f34598x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ C9576h0<T> f34599y;

        /* JADX INFO: renamed from: z */
        public int f34600z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C9576h0<T> c9576h0, InterfaceC9557b<? super c> interfaceC9557b) {
            super(interfaceC9557b);
            this.f34599y = c9576h0;
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f34598x = obj;
            this.f34600z |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C9576h0.m37718A(this.f34599y, null, this);
        }
    }

    public C9576h0(int i10, int i11, @NotNull EnumC8666a enumC8666a) {
        this.replay = i10;
        this.bufferCapacity = i11;
        this.onBufferOverflow = enumC8666a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v10, resolved type: nu.i */
    /* JADX DEBUG: Multi-variable search result rejected for r10v7, resolved type: nu.i */
    /* JADX DEBUG: Multi-variable search result rejected for r10v9, resolved type: nu.i */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (((nu.C9600t0) r9).m37875b(r0) == r1) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ <T> Object m37718A(C9576h0<T> c9576h0, InterfaceC9577i<? super T> interfaceC9577i, InterfaceC9557b<?> interfaceC9557b) throws Throwable {
        c cVar;
        C9576h0<T> c9576h1;
        Throwable th2;
        C9580j0 c9580j0;
        InterfaceC9577i<? super T> interfaceC9577i2;
        InterfaceC7850d2 interfaceC7850d2;
        InterfaceC9577i interfaceC9577i3;
        if (interfaceC9557b instanceof c) {
            cVar = (c) interfaceC9557b;
            int i10 = cVar.f34600z;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                cVar.f34600z = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                cVar = new c(c9576h0, interfaceC9557b);
            }
        } else {
            cVar = new c(c9576h0, interfaceC9557b);
        }
        Object obj = cVar.f34598x;
        Object objM38805e = C10047c.m38805e();
        int i11 = cVar.f34600z;
        if (i11 != 0) {
            if (i11 == 1) {
                c9580j0 = (C9580j0) cVar.f34596v;
                InterfaceC9577i<? super T> interfaceC9577i4 = (InterfaceC9577i) cVar.f34595u;
                C9576h0<T> c9576h2 = (C9576h0) cVar.f34594t;
                try {
                    C7348o.m30470b(obj);
                    interfaceC9577i2 = interfaceC9577i4;
                    c9576h0 = c9576h2;
                    try {
                        interfaceC7850d2 = (InterfaceC7850d2) cVar.getContext().get(InterfaceC7850d2.INSTANCE);
                        interfaceC9577i3 = interfaceC9577i2;
                    } catch (Throwable th3) {
                        c9576h1 = c9576h0;
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    c9576h1 = c9576h2;
                }
            } else {
                if (i11 != 2 && i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC7850d2 interfaceC7850d3 = (InterfaceC7850d2) cVar.f34597w;
                c9580j0 = (C9580j0) cVar.f34596v;
                InterfaceC9577i interfaceC9577i5 = (InterfaceC9577i) cVar.f34595u;
                c9576h1 = (C9576h0) cVar.f34594t;
                try {
                    C7348o.m30470b(obj);
                    interfaceC9577i3 = interfaceC9577i5;
                    interfaceC7850d2 = interfaceC7850d3;
                    c9576h0 = c9576h1;
                } catch (Throwable th5) {
                    th2 = th5;
                }
            }
            c9576h1.m38810k(c9580j0);
            throw th2;
        }
        C7348o.m30470b(obj);
        C9580j0 c9580j0M38808d = c9576h0.m38808d();
        try {
            if (interfaceC9577i instanceof C9600t0) {
                cVar.f34594t = c9576h0;
                cVar.f34595u = interfaceC9577i;
                cVar.f34596v = c9580j0M38808d;
                cVar.f34600z = 1;
            }
            interfaceC9577i2 = interfaceC9577i;
            c9580j0 = c9580j0M38808d;
            interfaceC7850d2 = (InterfaceC7850d2) cVar.getContext().get(InterfaceC7850d2.INSTANCE);
            interfaceC9577i3 = interfaceC9577i2;
        } catch (Throwable th6) {
            c9576h1 = c9576h0;
            th2 = th6;
            c9580j0 = c9580j0M38808d;
        }
        while (true) {
            Object objM37748U = c9576h0.m37748U(c9580j0);
            if (objM37748U == C9578i0.f34601a) {
                cVar.f34594t = c9576h0;
                cVar.f34595u = interfaceC9577i3;
                cVar.f34596v = c9580j0;
                cVar.f34597w = interfaceC7850d2;
                cVar.f34600z = 2;
                if (c9576h0.m37754x(c9580j0, cVar) == objM38805e) {
                    break;
                }
            } else {
                if (interfaceC7850d2 != null) {
                    C7865g2.m32653g(interfaceC7850d2);
                }
                cVar.f34594t = c9576h0;
                cVar.f34595u = interfaceC9577i3;
                cVar.f34596v = c9580j0;
                cVar.f34597w = interfaceC7850d2;
                cVar.f34600z = 3;
                if (interfaceC9577i3.emit(objM37748U, cVar) == objM38805e) {
                    break;
                }
            }
        }
        return objM38805e;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ <T> Object m37719F(C9576h0<T> c9576h0, T t8, InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM37734G;
        return (!c9576h0.mo37707a(t8) && (objM37734G = c9576h0.m37734G(t8, interfaceC9557b)) == C10047c.m38805e()) ? objM37734G : Unit.f29331a;
    }

    /* JADX DEBUG: Class process forced to load method for inline: ou.b.b(ou.b):int */
    /* JADX INFO: renamed from: B */
    public final void m37730B(long newHead) {
        AbstractC10054d[] abstractC10054dArr;
        if (this.nCollectors != 0 && (abstractC10054dArr = this.slots) != null) {
            for (AbstractC10054d abstractC10054d : abstractC10054dArr) {
                if (abstractC10054d != null) {
                    C9580j0 c9580j0 = (C9580j0) abstractC10054d;
                    long j10 = c9580j0.index;
                    if (j10 >= 0 && j10 < newHead) {
                        c9580j0.index = newHead;
                    }
                }
            }
        }
        this.minCollectorIndex = newHead;
    }

    /* JADX DEBUG: Method merged with bridge method: f()Lou/d; */
    @Override // p617ou.AbstractC10050b
    @NotNull
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public C9580j0 mo37752f() {
        return new C9580j0();
    }

    /* JADX DEBUG: Method merged with bridge method: h(I)[Lou/d; */
    @Override // p617ou.AbstractC10050b
    @NotNull
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public C9580j0[] mo37753h(int size) {
        return new C9580j0[size];
    }

    /* JADX INFO: renamed from: E */
    public final void m37733E() {
        Object[] objArr = this.buffer;
        Intrinsics.checkNotNull(objArr);
        C9578i0.m37763g(objArr, m37738K(), null);
        this.bufferSize--;
        long jM37738K = m37738K() + 1;
        if (this.replayIndex < jM37738K) {
            this.replayIndex = jM37738K;
        }
        if (this.minCollectorIndex < jM37738K) {
            m37730B(jM37738K);
        }
    }

    /* JADX INFO: renamed from: G */
    public final Object m37734G(T t8, InterfaceC9557b<? super Unit> interfaceC9557b) throws Throwable {
        Throwable th2;
        InterfaceC9557b<Unit>[] interfaceC9557bArrM37736I;
        a aVar;
        C7905p c7905p = new C7905p(C10046b.m38803c(interfaceC9557b), 1);
        c7905p.m32860H();
        InterfaceC9557b<Unit>[] interfaceC9557bArrM37736I2 = C10052c.f36192a;
        synchronized (this) {
            try {
                if (m37745R(t8)) {
                    try {
                        C7347n.Companion companion = C7347n.INSTANCE;
                        c7905p.resumeWith(C7347n.m30460b(Unit.f29331a));
                        interfaceC9557bArrM37736I = m37736I(interfaceC9557bArrM37736I2);
                        aVar = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    try {
                        aVar = new a(this, m37738K() + ((long) m37743P()), t8, c7905p);
                        m37735H(aVar);
                        this.queueSize++;
                        if (this.bufferCapacity == 0) {
                            interfaceC9557bArrM37736I2 = m37736I(interfaceC9557bArrM37736I2);
                        }
                        interfaceC9557bArrM37736I = interfaceC9557bArrM37736I2;
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        throw th2;
                    }
                }
                if (aVar != null) {
                    C7913r.m32899a(c7905p, aVar);
                }
                for (InterfaceC9557b<Unit> interfaceC9557b2 : interfaceC9557bArrM37736I) {
                    if (interfaceC9557b2 != null) {
                        C7347n.Companion companion2 = C7347n.INSTANCE;
                        interfaceC9557b2.resumeWith(C7347n.m30460b(Unit.f29331a));
                    }
                }
                Object objM32857A = c7905p.m32857A();
                if (objM32857A == C10047c.m38805e()) {
                    C10346h.m39673c(interfaceC9557b);
                }
                return objM32857A == C10047c.m38805e() ? objM32857A : Unit.f29331a;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m37735H(Object item) {
        int iM37743P = m37743P();
        Object[] objArrM37744Q = this.buffer;
        if (objArrM37744Q == null) {
            objArrM37744Q = m37744Q(null, 0, 2);
        } else if (iM37743P >= objArrM37744Q.length) {
            objArrM37744Q = m37744Q(objArrM37744Q, iM37743P, objArrM37744Q.length * 2);
        }
        C9578i0.m37763g(objArrM37744Q, m37738K() + ((long) iM37743P), item);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:22:0x0047 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:0x0044 */
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
    /* JADX INFO: renamed from: I */
    public final InterfaceC9557b<Unit>[] m37736I(InterfaceC9557b<Unit>[] resumesIn) {
        AbstractC10054d[] abstractC10054dArr;
        C9580j0 c9580j0;
        InterfaceC9557b<? super Unit> interfaceC9557b;
        int length = resumesIn.length;
        if (this.nCollectors != 0 && (abstractC10054dArr = this.slots) != null) {
            int length2 = abstractC10054dArr.length;
            int i10 = 0;
            while (i10 < length2) {
                AbstractC10054d abstractC10054d = abstractC10054dArr[i10];
                if (abstractC10054d == null || (interfaceC9557b = (c9580j0 = (C9580j0) abstractC10054d).cont) == null || m37747T(c9580j0) < 0) {
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
                    ((InterfaceC9557b[]) resumesIn)[length] = interfaceC9557b;
                    c9580j0.cont = null;
                    length++;
                }
                i10++;
                resumesIn = resumesIn;
            }
            resumesIn = resumesIn;
        }
        return (InterfaceC9557b[]) resumesIn;
    }

    /* JADX INFO: renamed from: J */
    public final long m37737J() {
        return m37738K() + ((long) this.bufferSize);
    }

    /* JADX INFO: renamed from: K */
    public final long m37738K() {
        return Math.min(this.minCollectorIndex, this.replayIndex);
    }

    /* JADX INFO: renamed from: L */
    public final T m37739L() {
        Object[] objArr = this.buffer;
        Intrinsics.checkNotNull(objArr);
        return (T) C9578i0.m37762f(objArr, (this.replayIndex + ((long) m37742O())) - 1);
    }

    /* JADX INFO: renamed from: M */
    public final Object m37740M(long index) {
        Object[] objArr = this.buffer;
        Intrinsics.checkNotNull(objArr);
        Object objM37762f = C9578i0.m37762f(objArr, index);
        return objM37762f instanceof a ? ((a) objM37762f).value : objM37762f;
    }

    /* JADX INFO: renamed from: N */
    public final long m37741N() {
        return m37738K() + ((long) this.bufferSize) + ((long) this.queueSize);
    }

    /* JADX INFO: renamed from: O */
    public final int m37742O() {
        return (int) ((m37738K() + ((long) this.bufferSize)) - this.replayIndex);
    }

    /* JADX INFO: renamed from: P */
    public final int m37743P() {
        return this.bufferSize + this.queueSize;
    }

    /* JADX INFO: renamed from: Q */
    public final Object[] m37744Q(Object[] curBuffer, int curSize, int newSize) {
        if (newSize <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr = new Object[newSize];
        this.buffer = objArr;
        if (curBuffer != null) {
            long jM37738K = m37738K();
            for (int i10 = 0; i10 < curSize; i10++) {
                long j10 = ((long) i10) + jM37738K;
                C9578i0.m37763g(objArr, j10, C9578i0.m37762f(curBuffer, j10));
            }
        }
        return objArr;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m37745R(T value) {
        if (getNCollectors() == 0) {
            return m37746S(value);
        }
        if (this.bufferSize >= this.bufferCapacity && this.minCollectorIndex <= this.replayIndex) {
            int i10 = b.f34593a[this.onBufferOverflow.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2) {
                return true;
            }
            if (i10 != 3) {
                throw new C7345l();
            }
        }
        m37735H(value);
        int i11 = this.bufferSize + 1;
        this.bufferSize = i11;
        if (i11 > this.bufferCapacity) {
            m37733E();
        }
        if (m37742O() > this.replay) {
            m37749V(this.replayIndex + 1, this.minCollectorIndex, m37737J(), m37741N());
        }
        return true;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m37746S(T value) {
        if (this.replay == 0) {
            return true;
        }
        m37735H(value);
        int i10 = this.bufferSize + 1;
        this.bufferSize = i10;
        if (i10 > this.replay) {
            m37733E();
        }
        this.minCollectorIndex = m37738K() + ((long) this.bufferSize);
        return true;
    }

    /* JADX INFO: renamed from: T */
    public final long m37747T(C9580j0 slot) {
        long j10 = slot.index;
        if (j10 >= m37737J() && (this.bufferCapacity > 0 || j10 > m37738K() || this.queueSize == 0)) {
            return -1L;
        }
        return j10;
    }

    /* JADX INFO: renamed from: U */
    public final Object m37748U(C9580j0 slot) {
        Object obj;
        InterfaceC9557b<Unit>[] interfaceC9557bArrM37750W = C10052c.f36192a;
        synchronized (this) {
            try {
                long jM37747T = m37747T(slot);
                if (jM37747T < 0) {
                    obj = C9578i0.f34601a;
                } else {
                    long j10 = slot.index;
                    Object objM37740M = m37740M(jM37747T);
                    slot.index = jM37747T + 1;
                    interfaceC9557bArrM37750W = m37750W(j10);
                    obj = objM37740M;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (InterfaceC9557b<Unit> interfaceC9557b : interfaceC9557bArrM37750W) {
            if (interfaceC9557b != null) {
                C7347n.Companion companion = C7347n.INSTANCE;
                interfaceC9557b.resumeWith(C7347n.m30460b(Unit.f29331a));
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: V */
    public final void m37749V(long newReplayIndex, long newMinCollectorIndex, long newBufferEndIndex, long newQueueEndIndex) {
        long jMin = Math.min(newMinCollectorIndex, newReplayIndex);
        for (long jM37738K = m37738K(); jM37738K < jMin; jM37738K++) {
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            C9578i0.m37763g(objArr, jM37738K, null);
        }
        this.replayIndex = newReplayIndex;
        this.minCollectorIndex = newMinCollectorIndex;
        this.bufferSize = (int) (newBufferEndIndex - jMin);
        this.queueSize = (int) (newQueueEndIndex - newBufferEndIndex);
    }

    @NotNull
    /* JADX INFO: renamed from: W */
    public final InterfaceC9557b<Unit>[] m37750W(long oldIndex) {
        long j10;
        long j11;
        long j12;
        AbstractC10054d[] abstractC10054dArr;
        if (oldIndex > this.minCollectorIndex) {
            return C10052c.f36192a;
        }
        long jM37738K = m37738K();
        long j13 = ((long) this.bufferSize) + jM37738K;
        if (this.bufferCapacity == 0 && this.queueSize > 0) {
            j13++;
        }
        if (this.nCollectors != 0 && (abstractC10054dArr = this.slots) != null) {
            for (AbstractC10054d abstractC10054d : abstractC10054dArr) {
                if (abstractC10054d != null) {
                    long j14 = ((C9580j0) abstractC10054d).index;
                    if (j14 >= 0 && j14 < j13) {
                        j13 = j14;
                    }
                }
            }
        }
        if (j13 <= this.minCollectorIndex) {
            return C10052c.f36192a;
        }
        long jM37737J = m37737J();
        int iMin = getNCollectors() > 0 ? Math.min(this.queueSize, this.bufferCapacity - ((int) (jM37737J - j13))) : this.queueSize;
        InterfaceC9557b<Unit>[] interfaceC9557bArr = C10052c.f36192a;
        long j15 = ((long) this.queueSize) + jM37737J;
        if (iMin > 0) {
            interfaceC9557bArr = new InterfaceC9557b[iMin];
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            j12 = 1;
            long j16 = jM37737J;
            int i10 = 0;
            while (true) {
                if (jM37737J >= j15) {
                    j10 = jM37738K;
                    j11 = j13;
                    jM37737J = j16;
                    break;
                }
                Object objM37762f = C9578i0.m37762f(objArr, jM37737J);
                j10 = jM37738K;
                C10719e0 c10719e0 = C9578i0.f34601a;
                if (objM37762f != c10719e0) {
                    Intrinsics.m31981d(objM37762f, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) objM37762f;
                    int i11 = i10 + 1;
                    j11 = j13;
                    interfaceC9557bArr[i10] = aVar.cont;
                    C9578i0.m37763g(objArr, jM37737J, c10719e0);
                    C9578i0.m37763g(objArr, j16, aVar.value);
                    long j17 = j16 + 1;
                    if (i11 >= iMin) {
                        jM37737J = j17;
                        break;
                    }
                    i10 = i11;
                    j16 = j17;
                } else {
                    j11 = j13;
                }
                jM37737J++;
                jM37738K = j10;
                j13 = j11;
            }
        } else {
            j10 = jM37738K;
            j11 = j13;
            j12 = 1;
        }
        InterfaceC9557b<Unit>[] interfaceC9557bArr2 = interfaceC9557bArr;
        int i12 = (int) (jM37737J - j10);
        long j18 = getNCollectors() == 0 ? jM37737J : j11;
        long jMax = Math.max(this.replayIndex, jM37737J - ((long) Math.min(this.replay, i12)));
        if (this.bufferCapacity == 0 && jMax < j15) {
            Object[] objArr2 = this.buffer;
            Intrinsics.checkNotNull(objArr2);
            if (Intrinsics.m31980c(C9578i0.m37762f(objArr2, jMax), C9578i0.f34601a)) {
                jM37737J += j12;
                jMax += j12;
            }
        }
        m37749V(jMax, j18, jM37737J, j15);
        m37756z();
        return !(interfaceC9557bArr2.length == 0) ? m37736I(interfaceC9557bArr2) : interfaceC9557bArr2;
    }

    /* JADX INFO: renamed from: X */
    public final long m37751X() {
        long j10 = this.replayIndex;
        if (j10 < this.minCollectorIndex) {
            this.minCollectorIndex = j10;
        }
        return j10;
    }

    @Override // nu.InterfaceC9564b0
    /* JADX INFO: renamed from: a */
    public boolean mo37707a(T value) {
        int i10;
        boolean z10;
        InterfaceC9557b<Unit>[] interfaceC9557bArrM37736I = C10052c.f36192a;
        synchronized (this) {
            if (m37745R(value)) {
                interfaceC9557bArrM37736I = m37736I(interfaceC9557bArrM37736I);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (InterfaceC9557b<Unit> interfaceC9557b : interfaceC9557bArrM37736I) {
            if (interfaceC9557b != null) {
                C7347n.Companion companion = C7347n.INSTANCE;
                interfaceC9557b.resumeWith(C7347n.m30460b(Unit.f29331a));
            }
        }
        return z10;
    }

    @Override // nu.InterfaceC9574g0, nu.InterfaceC9575h
    @Nullable
    public Object collect(@NotNull InterfaceC9577i<? super T> interfaceC9577i, @NotNull InterfaceC9557b<?> interfaceC9557b) {
        return m37718A(this, interfaceC9577i, interfaceC9557b);
    }

    @Override // p617ou.InterfaceC10067q
    @NotNull
    /* JADX INFO: renamed from: e */
    public InterfaceC9575h<T> mo37711e(@NotNull CoroutineContext context, int capacity, @NotNull EnumC8666a onBufferOverflow) {
        return C9578i0.m37761e(this, context, capacity, onBufferOverflow);
    }

    @Override // nu.InterfaceC9564b0, nu.InterfaceC9577i
    @Nullable
    public Object emit(T t8, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        return m37719F(this, t8, interfaceC9557b);
    }

    @Override // nu.InterfaceC9564b0
    /* JADX INFO: renamed from: j */
    public void mo37709j() throws Throwable {
        synchronized (this) {
            try {
                try {
                    m37749V(m37737J(), this.minCollectorIndex, m37737J(), m37741N());
                    Unit unit = Unit.f29331a;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final Object m37754x(C9580j0 c9580j0, InterfaceC9557b<? super Unit> interfaceC9557b) {
        C7905p c7905p = new C7905p(C10046b.m38803c(interfaceC9557b), 1);
        c7905p.m32860H();
        synchronized (this) {
            try {
                if (m37747T(c9580j0) < 0) {
                    c9580j0.cont = c7905p;
                } else {
                    C7347n.Companion companion = C7347n.INSTANCE;
                    c7905p.resumeWith(C7347n.m30460b(Unit.f29331a));
                }
                Unit unit = Unit.f29331a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object objM32857A = c7905p.m32857A();
        if (objM32857A == C10047c.m38805e()) {
            C10346h.m39673c(interfaceC9557b);
        }
        return objM32857A == C10047c.m38805e() ? objM32857A : Unit.f29331a;
    }

    /* JADX INFO: renamed from: y */
    public final void m37755y(a emitter) {
        synchronized (this) {
            if (emitter.index < m37738K()) {
                return;
            }
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            if (C9578i0.m37762f(objArr, emitter.index) != emitter) {
                return;
            }
            C9578i0.m37763g(objArr, emitter.index, C9578i0.f34601a);
            m37756z();
            Unit unit = Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m37756z() {
        if (this.bufferCapacity != 0 || this.queueSize > 1) {
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            while (this.queueSize > 0 && C9578i0.m37762f(objArr, (m37738K() + ((long) m37743P())) - 1) == C9578i0.f34601a) {
                this.queueSize--;
                C9578i0.m37763g(objArr, m37738K() + ((long) m37743P()), null);
            }
        }
    }
}
