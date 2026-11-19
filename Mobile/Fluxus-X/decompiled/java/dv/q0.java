package dv;

import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.coroutines.CoroutineContext;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030!2\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b\"\u0010#J-\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010+J!\u0010.\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010\u00072\u0006\u0010-\u001a\u00020\u0007H\u0002¢\u0006\u0004\b.\u0010\u000fR\u0016\u00101\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R$\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u0010\nR\u0011\u00106\u001a\b\u0012\u0004\u0012\u00020\u0007058\u0002X\u0082\u0004¨\u00067"}, d2 = {"Ldv/q0;", "T", "Lev/b;", "Ldv/s0;", "Ldv/c0;", "Ldv/c;", "Lev/q;", BuildConfig.FLAVOR, "initialState", "<init>", "(Ljava/lang/Object;)V", "expect", "update", BuildConfig.FLAVOR, "h", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "value", "a", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "emit", "(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;", "k", "()V", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "n", "()Ldv/s0;", BuildConfig.FLAVOR, "size", BuildConfig.FLAVOR, "o", "(I)[Ldv/s0;", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Lcv/a;", "onBufferOverflow", "Ldv/h;", "g", "(Lkotlin/coroutines/CoroutineContext;ILcv/a;)Ldv/h;", "expectedState", "newState", "q", "e", "I", "sequence", "getValue", "()Ljava/lang/Object;", "setValue", "Lkotlinx/atomicfu/AtomicRef;", "_state", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q0<T> extends kotlin.b<s0> implements c0<T>, c<T>, kotlin.q<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12833f = AtomicReferenceFieldUpdater.newUpdater(q0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int sequence;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @gu.f(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {389, HttpStatusCode.UNAUTHORIZED_401, 406}, m = "collect")
    public static final class a extends gu.d {
        public int A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f12835t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f12836u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f12837v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f12838w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f12839x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f12840y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ q0<T> f12841z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q0<T> q0Var, eu.b<? super a> bVar) {
            super(bVar);
            this.f12841z = q0Var;
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12840y = obj;
            this.A |= Integer.MIN_VALUE;
            return this.f12841z.collect(null, this);
        }
    }

    public q0(@NotNull Object obj) {
        this._state$volatile = obj;
    }

    @Override // dv.b0
    public boolean a(T value) {
        setValue(value);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ac A[Catch: all -> 0x0043, PHI: r2 r6 r7 r8 r11
      0x00ac: PHI (r2v8 av.d2) = (r2v6 av.d2), (r2v7 av.d2), (r2v7 av.d2), (r2v13 av.d2) binds: [B:35:0x009d, B:51:0x00e0, B:53:0x00f2, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r6v7 ??) = (r6v14 ??), (r6v15 ??), (r6v16 ??), (r6v17 ??) binds: [B:35:0x009d, B:51:0x00e0, B:53:0x00f2, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r7v2 ??) = (r7v0 ??), (r7v7 ??), (r7v8 ??), (r7v9 ??) binds: [B:35:0x009d, B:51:0x00e0, B:53:0x00f2, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r8v6 dv.q0<T>) = (r8v4 dv.q0<T>), (r8v5 dv.q0<T>), (r8v5 dv.q0<T>), (r8v12 dv.q0<T>) binds: [B:35:0x009d, B:51:0x00e0, B:53:0x00f2, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r11v7 java.lang.Object) = (r11v5 java.lang.Object), (r11v6 java.lang.Object), (r11v6 java.lang.Object), (r11v19 java.lang.Object) binds: [B:35:0x009d, B:51:0x00e0, B:53:0x00f2, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b6 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c1 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00da  */
    /* JADX WARN: Code duplicated, block: B:49:0x00db  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e2 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2, types: [ev.d] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6, types: [dv.s0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [dv.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e0 -> B:36:0x00ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00f2 -> B:36:0x00ac). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // dv.g0, dv.h
    @org.jetbrains.annotations.Nullable
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull dv.i<? super T> r11, @org.jetbrains.annotations.NotNull eu.b<?> r12) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dv.q0.collect(dv.i, eu.b):java.lang.Object");
    }

    @Override // dv.b0, dv.i
    @Nullable
    public Object emit(T t8, @NotNull eu.b<? super Unit> bVar) {
        setValue(t8);
        return Unit.f21506a;
    }

    @Override // kotlin.q
    @NotNull
    public h<T> g(@NotNull CoroutineContext context, int capacity, @NotNull cv.a onBufferOverflow) {
        return r0.d(this, context, capacity, onBufferOverflow);
    }

    @Override // dv.c0, dv.p0
    public T getValue() {
        gv.e0 e0Var = kotlin.t.f14752a;
        T t8 = (T) f12833f.get(this);
        if (t8 == e0Var) {
            return null;
        }
        return t8;
    }

    @Override // dv.c0
    public boolean h(T expect, T update) {
        if (expect == null) {
            expect = (T) kotlin.t.f14752a;
        }
        if (update == null) {
            update = (T) kotlin.t.f14752a;
        }
        return q(expect, update);
    }

    @Override // dv.b0
    public void k() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // kotlin.b
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public s0 e() {
        return new s0();
    }

    @Override // kotlin.b
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public s0[] i(int size) {
        return new s0[size];
    }

    public final boolean q(Object expectedState, Object newState) {
        int i10;
        s0[] s0VarArrM;
        synchronized (this) {
            Object obj = f12833f.get(this);
            if (expectedState != null && !Intrinsics.c(obj, expectedState)) {
                return false;
            }
            if (Intrinsics.c(obj, newState)) {
                return true;
            }
            f12833f.set(this, newState);
            int i11 = this.sequence;
            if ((i11 & 1) != 0) {
                this.sequence = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.sequence = i12;
            s0[] s0VarArrM2 = m();
            Unit unit = Unit.f21506a;
            while (true) {
                s0[] s0VarArr = s0VarArrM2;
                if (s0VarArr != null) {
                    for (s0 s0Var : s0VarArr) {
                        if (s0Var != null) {
                            s0Var.g();
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.sequence;
                    if (i10 == i12) {
                        this.sequence = i12 + 1;
                        return true;
                    }
                    s0VarArrM = m();
                    Unit unit2 = Unit.f21506a;
                }
                s0VarArrM2 = s0VarArrM;
                i12 = i10;
            }
        }
    }

    @Override // dv.c0
    public void setValue(T t8) {
        if (t8 == null) {
            t8 = (T) kotlin.t.f14752a;
        }
        q(null, t8);
    }
}
