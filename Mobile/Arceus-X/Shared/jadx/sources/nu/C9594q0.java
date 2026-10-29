package nu;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import mu.EnumC8666a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;
import p395qu.C10719e0;
import p617ou.AbstractC10050b;
import p617ou.C10070t;
import p617ou.InterfaceC10067q;
import pt.AbstractC10342d;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: nu.q0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030!2\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b\"\u0010#J-\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010+J!\u0010.\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010\u00072\u0006\u0010-\u001a\u00020\u0007H\u0002¢\u0006\u0004\b.\u0010\u000fR\u0016\u00100\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010/R$\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u0010\nR\u0011\u00105\u001a\b\u0012\u0004\u0012\u00020\u0007048\u0002X\u0082\u0004¨\u00066"}, m31665d2 = {"Lnu/q0;", "T", "Lou/b;", "Lnu/s0;", "Lnu/c0;", "Lnu/c;", "Lou/q;", "", "initialState", "<init>", "(Ljava/lang/Object;)V", "expect", "update", "", "i", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "value", "a", "(Ljava/lang/Object;)Z", "", "emit", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "j", "()V", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "n", "()Lnu/s0;", "", "size", "", "o", "(I)[Lnu/s0;", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Lmu/a;", "onBufferOverflow", "Lnu/h;", "e", "(Lkotlin/coroutines/CoroutineContext;ILmu/a;)Lnu/h;", "expectedState", "newState", "q", "I", "sequence", "getValue", "()Ljava/lang/Object;", "setValue", "Lkotlinx/atomicfu/AtomicRef;", "_state", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C9594q0<T> extends AbstractC10050b<C9598s0> implements InterfaceC9566c0<T>, InterfaceC9565c<T>, InterfaceC10067q<T> {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f34672f = AtomicReferenceFieldUpdater.newUpdater(C9594q0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int sequence;

    /* JADX INFO: renamed from: nu.q0$a */
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.StateFlowImpl", m39664f = "StateFlow.kt", m39665l = {389, HttpStatusCode.UNAUTHORIZED_401, 406}, m39666m = "collect")
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public int f34674A;

        /* JADX INFO: renamed from: t */
        public Object f34675t;

        /* JADX INFO: renamed from: u */
        public Object f34676u;

        /* JADX INFO: renamed from: v */
        public Object f34677v;

        /* JADX INFO: renamed from: w */
        public Object f34678w;

        /* JADX INFO: renamed from: x */
        public Object f34679x;

        /* JADX INFO: renamed from: y */
        public /* synthetic */ Object f34680y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ C9594q0<T> f34681z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C9594q0<T> c9594q0, InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
            this.f34681z = c9594q0;
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f34680y = obj;
            this.f34674A |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return this.f34681z.collect(null, this);
        }
    }

    public C9594q0(@NotNull Object obj) {
        this._state$volatile = obj;
    }

    @Override // nu.InterfaceC9564b0
    /* JADX INFO: renamed from: a */
    public boolean mo37707a(T value) {
        setValue(value);
        return true;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:16:0x0043 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:57:0x0024 */
    /* JADX WARN: Code duplicated, block: B:36:0x00ac A[Catch: all -> 0x0043, PHI: r2 r6 r7 r8 r11
      0x00ac: PHI (r2v8 ku.d2) = (r2v6 ku.d2), (r2v7 ku.d2), (r2v7 ku.d2), (r2v13 ku.d2) binds: [B:35:0x009d, B:51:0x00e0, B:53:0x00f2, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r6v7 ??) = (r6v14 ??), (r6v15 ??), (r6v16 ??), (r6v17 ??) binds: [B:35:0x009d, B:51:0x00e0, B:53:0x00f2, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r7v2 ??) = (r7v0 ??), (r7v7 ??), (r7v8 ??), (r7v9 ??) binds: [B:35:0x009d, B:51:0x00e0, B:53:0x00f2, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r8v6 nu.q0<T>) = (r8v4 nu.q0<T>), (r8v5 nu.q0<T>), (r8v5 nu.q0<T>), (r8v12 nu.q0<T>) binds: [B:35:0x009d, B:51:0x00e0, B:53:0x00f2, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r11v7 java.lang.Object) = (r11v5 java.lang.Object), (r11v6 java.lang.Object), (r11v6 java.lang.Object), (r11v19 java.lang.Object) binds: [B:35:0x009d, B:51:0x00e0, B:53:0x00f2, B:14:0x003e] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b6 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
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
    /* JADX WARN: Type inference failed for: r6v2, types: [ou.d] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, nu.s0] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, nu.i] */
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
    @Override // nu.InterfaceC9574g0, nu.InterfaceC9575h
    @org.jetbrains.annotations.Nullable
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull nu.InterfaceC9577i<? super T> r11, @org.jetbrains.annotations.NotNull p315nt.InterfaceC9557b<?> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof nu.C9594q0.a
            if (r0 == 0) goto L13
            r0 = r12
            nu.q0$a r0 = (nu.C9594q0.a) r0
            int r1 = r0.f34674A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34674A = r1
            goto L18
        L13:
            nu.q0$a r0 = new nu.q0$a
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f34680y
            java.lang.Object r1 = p344ot.C10047c.m38805e()
            int r2 = r0.f34674A
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L77
            if (r2 == r6) goto L65
            if (r2 == r5) goto L4e
            if (r2 != r4) goto L46
            java.lang.Object r11 = r0.f34679x
            java.lang.Object r2 = r0.f34678w
            ku.d2 r2 = (p256ku.InterfaceC7850d2) r2
            java.lang.Object r6 = r0.f34677v
            nu.s0 r6 = (nu.C9598s0) r6
            java.lang.Object r7 = r0.f34676u
            nu.i r7 = (nu.InterfaceC9577i) r7
            java.lang.Object r8 = r0.f34675t
            nu.q0 r8 = (nu.C9594q0) r8
            p229jt.C7348o.m30470b(r12)     // Catch: java.lang.Throwable -> L43
            goto Lac
        L43:
            r11 = move-exception
            goto Lf5
        L46:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L4e:
            java.lang.Object r11 = r0.f34679x
            java.lang.Object r2 = r0.f34678w
            ku.d2 r2 = (p256ku.InterfaceC7850d2) r2
            java.lang.Object r6 = r0.f34677v
            nu.s0 r6 = (nu.C9598s0) r6
            java.lang.Object r7 = r0.f34676u
            nu.i r7 = (nu.InterfaceC9577i) r7
            java.lang.Object r8 = r0.f34675t
            nu.q0 r8 = (nu.C9594q0) r8
            p229jt.C7348o.m30470b(r12)     // Catch: java.lang.Throwable -> L43
            goto Ldc
        L65:
            java.lang.Object r11 = r0.f34677v
            r6 = r11
            nu.s0 r6 = (nu.C9598s0) r6
            java.lang.Object r11 = r0.f34676u
            nu.i r11 = (nu.InterfaceC9577i) r11
            java.lang.Object r2 = r0.f34675t
            r8 = r2
            nu.q0 r8 = (nu.C9594q0) r8
            p229jt.C7348o.m30470b(r12)     // Catch: java.lang.Throwable -> L43
            goto L9d
        L77:
            p229jt.C7348o.m30470b(r12)
            ou.d r12 = r10.m38808d()
            nu.s0 r12 = (nu.C9598s0) r12
            boolean r2 = r11 instanceof nu.C9600t0     // Catch: java.lang.Throwable -> L97
            if (r2 == 0) goto L9b
            r2 = r11
            nu.t0 r2 = (nu.C9600t0) r2     // Catch: java.lang.Throwable -> L97
            r0.f34675t = r10     // Catch: java.lang.Throwable -> L97
            r0.f34676u = r11     // Catch: java.lang.Throwable -> L97
            r0.f34677v = r12     // Catch: java.lang.Throwable -> L97
            r0.f34674A = r6     // Catch: java.lang.Throwable -> L97
            java.lang.Object r2 = r2.m37875b(r0)     // Catch: java.lang.Throwable -> L97
            if (r2 != r1) goto L9b
            goto Lf4
        L97:
            r11 = move-exception
            r8 = r10
            r6 = r12
            goto Lf5
        L9b:
            r8 = r10
            r6 = r12
        L9d:
            kotlin.coroutines.CoroutineContext r12 = r0.getContext()     // Catch: java.lang.Throwable -> L43
            ku.d2$b r2 = p256ku.InterfaceC7850d2.INSTANCE     // Catch: java.lang.Throwable -> L43
            kotlin.coroutines.CoroutineContext$Element r12 = r12.get(r2)     // Catch: java.lang.Throwable -> L43
            ku.d2 r12 = (p256ku.InterfaceC7850d2) r12     // Catch: java.lang.Throwable -> L43
            r7 = r11
            r2 = r12
            r11 = r3
        Lac:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = m37855p()     // Catch: java.lang.Throwable -> L43
            java.lang.Object r12 = r12.get(r8)     // Catch: java.lang.Throwable -> L43
            if (r2 == 0) goto Lb9
            p256ku.C7865g2.m32653g(r2)     // Catch: java.lang.Throwable -> L43
        Lb9:
            if (r11 == 0) goto Lc1
            boolean r9 = kotlin.jvm.internal.Intrinsics.m31980c(r11, r12)     // Catch: java.lang.Throwable -> L43
            if (r9 != 0) goto Ldc
        Lc1:
            qu.e0 r11 = p617ou.C10070t.f36266a     // Catch: java.lang.Throwable -> L43
            if (r12 != r11) goto Lc7
            r11 = r3
            goto Lc8
        Lc7:
            r11 = r12
        Lc8:
            r0.f34675t = r8     // Catch: java.lang.Throwable -> L43
            r0.f34676u = r7     // Catch: java.lang.Throwable -> L43
            r0.f34677v = r6     // Catch: java.lang.Throwable -> L43
            r0.f34678w = r2     // Catch: java.lang.Throwable -> L43
            r0.f34679x = r12     // Catch: java.lang.Throwable -> L43
            r0.f34674A = r5     // Catch: java.lang.Throwable -> L43
            java.lang.Object r11 = r7.emit(r11, r0)     // Catch: java.lang.Throwable -> L43
            if (r11 != r1) goto Ldb
            goto Lf4
        Ldb:
            r11 = r12
        Ldc:
            boolean r12 = r6.m37868h()     // Catch: java.lang.Throwable -> L43
            if (r12 != 0) goto Lac
            r0.f34675t = r8     // Catch: java.lang.Throwable -> L43
            r0.f34676u = r7     // Catch: java.lang.Throwable -> L43
            r0.f34677v = r6     // Catch: java.lang.Throwable -> L43
            r0.f34678w = r2     // Catch: java.lang.Throwable -> L43
            r0.f34679x = r11     // Catch: java.lang.Throwable -> L43
            r0.f34674A = r4     // Catch: java.lang.Throwable -> L43
            java.lang.Object r12 = r6.m37865e(r0)     // Catch: java.lang.Throwable -> L43
            if (r12 != r1) goto Lac
        Lf4:
            return r1
        Lf5:
            r8.m38810k(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: nu.C9594q0.collect(nu.i, nt.b):java.lang.Object");
    }

    @Override // p617ou.InterfaceC10067q
    @NotNull
    /* JADX INFO: renamed from: e */
    public InterfaceC9575h<T> mo37711e(@NotNull CoroutineContext context, int capacity, @NotNull EnumC8666a onBufferOverflow) {
        return C9596r0.m37862d(this, context, capacity, onBufferOverflow);
    }

    @Override // nu.InterfaceC9564b0, nu.InterfaceC9577i
    @Nullable
    public Object emit(T t8, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        setValue(t8);
        return Unit.f29331a;
    }

    @Override // nu.InterfaceC9566c0, nu.InterfaceC9592p0
    public T getValue() {
        C10719e0 c10719e0 = C10070t.f36266a;
        T t8 = (T) f34672f.get(this);
        if (t8 == c10719e0) {
            return null;
        }
        return t8;
    }

    @Override // nu.InterfaceC9566c0
    /* JADX INFO: renamed from: i */
    public boolean mo37710i(T expect, T update) {
        if (expect == null) {
            expect = (T) C10070t.f36266a;
        }
        if (update == null) {
            update = (T) C10070t.f36266a;
        }
        return m37858q(expect, update);
    }

    @Override // nu.InterfaceC9564b0
    /* JADX INFO: renamed from: j */
    public void mo37709j() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /* JADX DEBUG: Method merged with bridge method: f()Lou/d; */
    @Override // p617ou.AbstractC10050b
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public C9598s0 mo37752f() {
        return new C9598s0();
    }

    /* JADX DEBUG: Method merged with bridge method: h(I)[Lou/d; */
    @Override // p617ou.AbstractC10050b
    @NotNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public C9598s0[] mo37753h(int size) {
        return new C9598s0[size];
    }

    /* JADX INFO: renamed from: q */
    public final boolean m37858q(Object expectedState, Object newState) {
        int i10;
        C9598s0[] c9598s0ArrM38812m;
        synchronized (this) {
            Object obj = f34672f.get(this);
            if (expectedState != null && !Intrinsics.m31980c(obj, expectedState)) {
                return false;
            }
            if (Intrinsics.m31980c(obj, newState)) {
                return true;
            }
            f34672f.set(this, newState);
            int i11 = this.sequence;
            if ((i11 & 1) != 0) {
                this.sequence = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.sequence = i12;
            C9598s0[] c9598s0ArrM38812m2 = m38812m();
            Unit unit = Unit.f29331a;
            while (true) {
                C9598s0[] c9598s0Arr = c9598s0ArrM38812m2;
                if (c9598s0Arr != null) {
                    for (C9598s0 c9598s0 : c9598s0Arr) {
                        if (c9598s0 != null) {
                            c9598s0.m37867g();
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.sequence;
                    if (i10 == i12) {
                        this.sequence = i12 + 1;
                        return true;
                    }
                    c9598s0ArrM38812m = m38812m();
                    Unit unit2 = Unit.f29331a;
                }
                c9598s0ArrM38812m2 = c9598s0ArrM38812m;
                i12 = i10;
            }
        }
    }

    @Override // nu.InterfaceC9566c0
    public void setValue(T t8) {
        if (t8 == null) {
            t8 = (T) C10070t.f36266a;
        }
        m37858q(null, t8);
    }
}
