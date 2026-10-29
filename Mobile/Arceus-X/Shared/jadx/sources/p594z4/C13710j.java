package p594z4;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p119f5.InterfaceC5359b;
import p119f5.InterfaceC5361d;
import p229jt.C7328a;
import p315nt.InterfaceC9557b;
import p478uu.C11976g;
import p478uu.InterfaceC11970a;
import p504w1.C12285i;

/* JADX INFO: renamed from: z4.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001a)B!\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u001a\u001a\u00020\u000e2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096A¢\u0006\u0004\b#\u0010$J\u001a\u0010%\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010'\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0001¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010/R\u001a\u00103\u001a\b\u0018\u000101R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00102¨\u00064"}, m31665d2 = {"Lz4/j;", "Lf5/b;", "Luu/a;", "delegate", "lock", "", "preparedStatementCacheSize", "<init>", "(Lf5/b;Luu/a;I)V", "", "sql", "Lf5/d;", "r3", "(Ljava/lang/String;)Lf5/d;", "", "close", "()V", "Lkotlin/coroutines/CoroutineContext;", "context", "c", "(Lkotlin/coroutines/CoroutineContext;)Lz4/j;", "g", "()Lz4/j;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "b", "(Ljava/lang/StringBuilder;)V", "toString", "()Ljava/lang/String;", "", "D", "()Z", "", "owner", "f", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "d", "(Ljava/lang/Object;)Z", "e", "(Ljava/lang/Object;)V", "a", "Lf5/b;", "Luu/a;", "Lkotlin/coroutines/CoroutineContext;", "acquireCoroutineContext", "", "Ljava/lang/Throwable;", "acquireThrowable", "Lz4/j$b;", "Lz4/j$b;", "preparedStatementCache", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C13710j implements InterfaceC5359b, InterfaceC11970a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5359b delegate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11970a lock;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public CoroutineContext acquireCoroutineContext;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Throwable acquireThrowable;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final b preparedStatementCache;

    /* JADX INFO: renamed from: z4.j$a */
    @Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\f\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u000f\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0012\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u000e2\b\b\u0001\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00112\b\b\u0001\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\u001a2\b\b\u0001\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010\"\u001a\u00020\u00112\b\b\u0001\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b%\u0010\u0007J\u0010\u0010&\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b&\u0010\u0007R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, m31665d2 = {"Lz4/j$a;", "Lf5/d;", "delegate", "<init>", "(Lf5/d;)V", "", "close", "()V", "", "index", "", "value", "A", "(I[B)V", "", "z", "(IJ)V", "", "k0", "(ILjava/lang/String;)V", "C", "(I)V", "getBlob", "(I)[B", "getLong", "(I)J", "", "a2", "(I)Z", "E2", "(I)Ljava/lang/String;", "isNull", "getColumnCount", "()I", "getColumnName", "g3", "()Z", "reset", "E", "a", "Lf5/d;", "getDelegate", "()Lf5/d;", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a implements InterfaceC5361d {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final InterfaceC5361d delegate;

        public a(@NotNull InterfaceC5361d delegate) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.delegate = delegate;
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: A */
        public void mo24699A(int index, @NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.delegate.mo24699A(index, value);
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: C */
        public void mo24700C(int index) {
            this.delegate.mo24700C(index);
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: E */
        public void mo24701E() {
            this.delegate.mo24701E();
        }

        @Override // p119f5.InterfaceC5361d
        @NotNull
        /* JADX INFO: renamed from: E2 */
        public String mo24702E2(int index) {
            return this.delegate.mo24702E2(index);
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: a2 */
        public boolean mo24703a2(int index) {
            return this.delegate.mo24703a2(index);
        }

        @Override // p119f5.InterfaceC5361d, java.lang.AutoCloseable
        public void close() {
            this.delegate.reset();
            this.delegate.mo24701E();
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: g3 */
        public boolean mo24704g3() {
            return this.delegate.mo24704g3();
        }

        @Override // p119f5.InterfaceC5361d
        @NotNull
        public byte[] getBlob(int index) {
            return this.delegate.getBlob(index);
        }

        @Override // p119f5.InterfaceC5361d
        public int getColumnCount() {
            return this.delegate.getColumnCount();
        }

        @Override // p119f5.InterfaceC5361d
        @NotNull
        public String getColumnName(int index) {
            return this.delegate.getColumnName(index);
        }

        @Override // p119f5.InterfaceC5361d
        public long getLong(int index) {
            return this.delegate.getLong(index);
        }

        @Override // p119f5.InterfaceC5361d
        public boolean isNull(int index) {
            return this.delegate.isNull(index);
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: k0 */
        public void mo24705k0(int index, @NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.delegate.mo24705k0(index, value);
        }

        @Override // p119f5.InterfaceC5361d
        public void reset() {
            this.delegate.reset();
        }

        @Override // p119f5.InterfaceC5361d
        /* JADX INFO: renamed from: z */
        public void mo24706z(int index, long value) {
            this.delegate.mo24706z(index, value);
        }
    }

    /* JADX INFO: renamed from: z4.j$b */
    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ1\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m31665d2 = {"Lz4/j$b;", "Lw1/i;", "", "Lf5/d;", "", "maxSize", "<init>", "(Lz4/j;I)V", "key", "l", "(Ljava/lang/String;)Lf5/d;", "", "evicted", "oldValue", "newValue", "", "m", "(ZLjava/lang/String;Lf5/d;Lf5/d;)V", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public final class b extends C12285i<String, InterfaceC5361d> {
        public b(int i10) {
            super(i10);
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // p504w1.C12285i
        @NotNull
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public InterfaceC5361d mo36640a(@NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return C13710j.this.delegate.mo24696r3(key);
        }

        /* JADX DEBUG: Method merged with bridge method: b(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // p504w1.C12285i
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo45610b(boolean evicted, @NotNull String key, @NotNull InterfaceC5361d oldValue, @Nullable InterfaceC5361d newValue) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(oldValue, "oldValue");
            oldValue.close();
            super.mo45610b(evicted, key, oldValue, newValue);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C13710j(@NotNull InterfaceC5359b delegate, @NotNull InterfaceC11970a lock, int i10) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(lock, "lock");
        this.delegate = delegate;
        this.lock = lock;
        this.preparedStatementCache = i10 > 0 ? new b(i10) : null;
    }

    @Override // p119f5.InterfaceC5359b
    /* JADX INFO: renamed from: D */
    public boolean mo24695D() {
        return this.delegate.mo24695D();
    }

    /* JADX INFO: renamed from: b */
    public final void m50078b(@NotNull StringBuilder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (this.acquireCoroutineContext == null && this.acquireThrowable == null) {
            builder.append("\t\tStatus: Free connection");
            builder.append('\n');
        } else {
            builder.append("\t\tStatus: Acquired connection");
            builder.append('\n');
            CoroutineContext coroutineContext = this.acquireCoroutineContext;
            if (coroutineContext != null) {
                builder.append("\t\tCoroutine: " + coroutineContext);
                builder.append('\n');
            }
            Throwable th2 = this.acquireThrowable;
            if (th2 != null) {
                builder.append("\t\tAcquired:");
                builder.append('\n');
                Iterator it = CollectionsKt.m31701Y(StringsKt.m32193w0(C7328a.m30430b(th2)), 1).iterator();
                while (it.hasNext()) {
                    builder.append("\t\t" + ((String) it.next()));
                    builder.append('\n');
                }
            }
        }
        if (this.preparedStatementCache != null) {
            builder.append("\t\tPrepared Statement Cache Size: " + this.preparedStatementCache.m45616h());
            builder.append('\n');
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final C13710j m50079c(@NotNull CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.acquireCoroutineContext = context;
        this.acquireThrowable = new Throwable();
        return this;
    }

    @Override // p119f5.InterfaceC5359b, java.lang.AutoCloseable
    public void close() {
        b bVar = this.preparedStatementCache;
        if (bVar != null) {
            bVar.m45611c();
        }
        this.delegate.close();
    }

    @Override // p478uu.InterfaceC11970a
    /* JADX INFO: renamed from: d */
    public boolean mo44672d(@Nullable Object owner) {
        return this.lock.mo44672d(owner);
    }

    @Override // p478uu.InterfaceC11970a
    /* JADX INFO: renamed from: e */
    public void mo44673e(@Nullable Object owner) {
        this.lock.mo44673e(owner);
    }

    @Override // p478uu.InterfaceC11970a
    @Nullable
    /* JADX INFO: renamed from: f */
    public Object mo44674f(@Nullable Object obj, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        return this.lock.mo44674f(obj, interfaceC9557b);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final C13710j m50080g() {
        this.acquireCoroutineContext = null;
        this.acquireThrowable = null;
        return this;
    }

    @Override // p119f5.InterfaceC5359b
    @NotNull
    /* JADX INFO: renamed from: r3 */
    public InterfaceC5361d mo24696r3(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        b bVar = this.preparedStatementCache;
        if (bVar == null) {
            return this.delegate.mo24696r3(sql);
        }
        InterfaceC5361d interfaceC5361dM45612d = bVar.m45612d(sql);
        Intrinsics.checkNotNull(interfaceC5361dM45612d);
        return new a(interfaceC5361dM45612d);
    }

    @NotNull
    public String toString() {
        return this.delegate.toString();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
      (r1v0 f5.b)
      (wrap uu.a:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap uu.a:0x0007: INVOKE false, (1 int), (null java.lang.Object) STATIC call: uu.g.b(boolean, int, java.lang.Object):uu.a A[MD:(boolean, int, java.lang.Object):uu.a (m), WRAPPED] (LINE:6)) : (r2v0 uu.a))
      (r3v0 int)
     A[MD:(f5.b, uu.a, int):void (m)] (LINE:7) call: z4.j.<init>(f5.b, uu.a, int):void type: THIS */
    public /* synthetic */ C13710j(InterfaceC5359b interfaceC5359b, InterfaceC11970a interfaceC11970a, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC5359b, (i11 & 2) != 0 ? C11976g.m44697b(false, 1, null) : interfaceC11970a, i10);
    }
}
