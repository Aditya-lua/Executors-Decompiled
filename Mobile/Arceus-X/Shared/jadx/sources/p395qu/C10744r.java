package p395qu;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p563y1.C12996b;

/* JADX INFO: renamed from: qu.r */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u0014*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002 \fB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00132\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00132\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u00132\u0006\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u00132\u0006\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b \u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\"R\u0014\u0010#\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010!R\u0011\u0010%\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b$\u0010\nR\u0011\u0010(\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010'R%\u0010*\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00130)8\u0002X\u0082\u0004R\u000b\u0010,\u001a\u00020+8\u0002X\u0082\u0004R\u0013\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010-8\u0002X\u0082\u0004¨\u0006/"}, m31665d2 = {"Lqu/r;", "", "E", "", "capacity", "", "singleConsumer", "<init>", "(IZ)V", "d", "()Z", "element", "a", "(Ljava/lang/Object;)I", "m", "()Ljava/lang/Object;", "l", "()Lqu/r;", "index", "Lkotlinx/coroutines/internal/Core;", "e", "(ILjava/lang/Object;)Lqu/r;", "oldHead", "newHead", "n", "(II)Lqu/r;", "", "k", "()J", "state", "c", "(J)Lqu/r;", "b", "I", "Z", "mask", "j", "isEmpty", "g", "()I", "size", "Lkotlinx/atomicfu/AtomicRef;", "_next", "Lkotlinx/atomicfu/AtomicLong;", "_state", "Lkotlinx/atomicfu/AtomicArray;", "array", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C10744r<E> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f38311f = AtomicReferenceFieldUpdater.newUpdater(C10744r.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicLongFieldUpdater f38312g = AtomicLongFieldUpdater.newUpdater(C10744r.class, "_state$volatile");

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final C10719e0 f38313h = new C10719e0("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int capacity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean singleConsumer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int mask;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AtomicReferenceArray f38317d;

    /* JADX INFO: renamed from: qu.r$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000bJ\u0011\u0010\u000e\u001a\u00020\b*\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R\u0014\u0010\u001d\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u0014\u0010\u001f\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0011R\u0014\u0010\"\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0011R\u0014\u0010#\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0011¨\u0006$"}, m31665d2 = {"Lqu/r$a;", "", "<init>", "()V", "", "other", "d", "(JJ)J", "", "newHead", "b", "(JI)J", "newTail", "c", "a", "(J)I", "INITIAL_CAPACITY", "I", "CAPACITY_BITS", "MAX_CAPACITY_MASK", "HEAD_SHIFT", "HEAD_MASK", "J", "TAIL_SHIFT", "TAIL_MASK", "FROZEN_SHIFT", "FROZEN_MASK", "CLOSED_SHIFT", "CLOSED_MASK", "MIN_ADD_SPIN_CAPACITY", "Lqu/e0;", "REMOVE_FROZEN", "Lqu/e0;", "ADD_SUCCESS", "ADD_FROZEN", "ADD_CLOSED", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: qu.r.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m40943a(long j10) {
            return (j10 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* JADX INFO: renamed from: b */
        public final long m40944b(long j10, int i10) {
            return m40946d(j10, 1073741823L) | ((long) i10);
        }

        /* JADX INFO: renamed from: c */
        public final long m40945c(long j10, int i10) {
            return m40946d(j10, 1152921503533105152L) | (((long) i10) << 30);
        }

        /* JADX INFO: renamed from: d */
        public final long m40946d(long j10, long j11) {
            return j10 & (~j11);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: qu.r$b */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lqu/r$b;", "", "", "index", "<init>", "(I)V", "a", "I", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int index;

        public b(int i10) {
            this.index = i10;
        }
    }

    public C10744r(int i10, boolean z10) {
        this.capacity = i10;
        this.singleConsumer = z10;
        int i11 = i10 - 1;
        this.mask = i11;
        this.f38317d = new AtomicReferenceArray(i10);
        if (i11 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i10 & i11) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m40931a(@NotNull E element) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f38312g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j10) != 0) {
                return INSTANCE.m40943a(j10);
            }
            int i10 = (int) (1073741823 & j10);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            int i12 = this.mask;
            if (((i11 + 2) & i12) == (i10 & i12)) {
                return 1;
            }
            if (!this.singleConsumer && getF38317d().get(i11 & i12) != null) {
                int i13 = this.capacity;
                if (i13 < 1024 || ((i11 - i10) & 1073741823) > (i13 >> 1)) {
                    return 1;
                }
            } else if (f38312g.compareAndSet(this, j10, INSTANCE.m40945c(j10, (i11 + 1) & 1073741823))) {
                getF38317d().set(i11 & i12, element);
                C10744r<E> c10744rM40935e = this;
                while ((f38312g.get(c10744rM40935e) & 1152921504606846976L) != 0 && (c10744rM40935e = c10744rM40935e.m40940l().m40935e(i11, element)) != null) {
                }
                return 0;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: java.util.concurrent.atomic.AtomicReferenceArray */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final C10744r<E> m40932b(long state) {
        C10744r<E> c10744r = new C10744r<>(this.capacity * 2, this.singleConsumer);
        int i10 = (int) (1073741823 & state);
        int i11 = (int) ((1152921503533105152L & state) >> 30);
        while (true) {
            int i12 = this.mask;
            if ((i10 & i12) == (i12 & i11)) {
                f38312g.set(c10744r, INSTANCE.m40946d(state, 1152921504606846976L));
                return c10744r;
            }
            Object bVar = getF38317d().get(this.mask & i10);
            if (bVar == null) {
                bVar = new b(i10);
            }
            c10744r.getF38317d().set(c10744r.mask & i10, bVar);
            i10++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final C10744r<E> m40933c(long state) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38311f;
        while (true) {
            C10744r<E> c10744r = (C10744r) atomicReferenceFieldUpdater.get(this);
            if (c10744r != null) {
                return c10744r;
            }
            C12996b.m48310a(f38311f, this, null, m40932b(state));
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m40934d() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f38312g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, 2305843009213693952L | j10));
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final C10744r<E> m40935e(int index, E element) {
        Object obj = getF38317d().get(this.mask & index);
        if (!(obj instanceof b) || ((b) obj).index != index) {
            return null;
        }
        getF38317d().set(index & this.mask, element);
        return this;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final /* synthetic */ AtomicReferenceArray getF38317d() {
        return this.f38317d;
    }

    /* JADX INFO: renamed from: g */
    public final int m40937g() {
        long j10 = f38312g.get(this);
        return (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j10))) & 1073741823;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m40938j() {
        long j10 = f38312g.get(this);
        return ((int) (1073741823 & j10)) == ((int) ((j10 & 1152921503533105152L) >> 30));
    }

    /* JADX INFO: renamed from: k */
    public final long m40939k() {
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f38312g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                return j10;
            }
            j11 = 1152921504606846976L | j10;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j11));
        return j11;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final C10744r<E> m40940l() {
        return m40933c(m40939k());
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public final Object m40941m() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f38312g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j10) != 0) {
                return f38313h;
            }
            int i10 = (int) (1073741823 & j10);
            int i11 = this.mask;
            if ((((int) ((1152921503533105152L & j10) >> 30)) & i11) == (i11 & i10)) {
                return null;
            }
            Object obj = getF38317d().get(this.mask & i10);
            if (obj == null) {
                if (this.singleConsumer) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i12 = (i10 + 1) & 1073741823;
                if (f38312g.compareAndSet(this, j10, INSTANCE.m40944b(j10, i12))) {
                    getF38317d().set(this.mask & i10, null);
                    return obj;
                }
                if (this.singleConsumer) {
                    C10744r<E> c10744rM40942n = this;
                    do {
                        c10744rM40942n = c10744rM40942n.m40942n(i10, i12);
                    } while (c10744rM40942n != null);
                    return obj;
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final C10744r<E> m40942n(int oldHead, int newHead) {
        long j10;
        int i10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f38312g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            i10 = (int) (1073741823 & j10);
            if ((1152921504606846976L & j10) != 0) {
                return m40940l();
            }
        } while (!f38312g.compareAndSet(this, j10, INSTANCE.m40944b(j10, newHead)));
        getF38317d().set(this.mask & i10, null);
        return null;
    }
}
