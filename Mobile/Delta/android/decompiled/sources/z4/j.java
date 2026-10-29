package z4;

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

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001a)B!\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u001a\u001a\u00020\u000e2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096A¢\u0006\u0004\b#\u0010$J\u001a\u0010%\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010'\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0001¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010/R\u001a\u00103\u001a\b\u0018\u000101R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00102¨\u00064"}, d2 = {"Lz4/j;", "Lf5/b;", "Luu/a;", "delegate", "lock", "", "preparedStatementCacheSize", "<init>", "(Lf5/b;Luu/a;I)V", "", "sql", "Lf5/d;", "r3", "(Ljava/lang/String;)Lf5/d;", "", "close", "()V", "Lkotlin/coroutines/CoroutineContext;", "context", "c", "(Lkotlin/coroutines/CoroutineContext;)Lz4/j;", "g", "()Lz4/j;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "b", "(Ljava/lang/StringBuilder;)V", "toString", "()Ljava/lang/String;", "", "D", "()Z", "", "owner", "f", "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;", "d", "(Ljava/lang/Object;)Z", "e", "(Ljava/lang/Object;)V", "a", "Lf5/b;", "Luu/a;", "Lkotlin/coroutines/CoroutineContext;", "acquireCoroutineContext", "", "Ljava/lang/Throwable;", "acquireThrowable", "Lz4/j$b;", "Lz4/j$b;", "preparedStatementCache", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j implements f5.b, uu.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f5.b delegate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final uu.a lock;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public CoroutineContext acquireCoroutineContext;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Throwable acquireThrowable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final b preparedStatementCache;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\f\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u000f\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0012\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u000e2\b\b\u0001\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00112\b\b\u0001\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\u001a2\b\b\u0001\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010\"\u001a\u00020\u00112\b\b\u0001\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b%\u0010\u0007J\u0010\u0010&\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b&\u0010\u0007R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lz4/j$a;", "Lf5/d;", "delegate", "<init>", "(Lf5/d;)V", "", "close", "()V", "", "index", "", "value", "A", "(I[B)V", "", "z", "(IJ)V", "", "k0", "(ILjava/lang/String;)V", "C", "(I)V", "getBlob", "(I)[B", "getLong", "(I)J", "", "a2", "(I)Z", "E2", "(I)Ljava/lang/String;", "isNull", "getColumnCount", "()I", "getColumnName", "g3", "()Z", "reset", "E", "a", "Lf5/d;", "getDelegate", "()Lf5/d;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements f5.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final f5.d delegate;

        public a(@NotNull f5.d delegate) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.delegate = delegate;
        }

        @Override // f5.d
        public void A(int index, @NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.delegate.A(index, value);
        }

        @Override // f5.d
        public void C(int index) {
            this.delegate.C(index);
        }

        @Override // f5.d
        public void E() {
            this.delegate.E();
        }

        @Override // f5.d
        @NotNull
        public String E2(int index) {
            return this.delegate.E2(index);
        }

        @Override // f5.d
        public boolean a2(int index) {
            return this.delegate.a2(index);
        }

        @Override // f5.d, java.lang.AutoCloseable
        public void close() {
            this.delegate.reset();
            this.delegate.E();
        }

        @Override // f5.d
        public boolean g3() {
            return this.delegate.g3();
        }

        @Override // f5.d
        @NotNull
        public byte[] getBlob(int index) {
            return this.delegate.getBlob(index);
        }

        @Override // f5.d
        public int getColumnCount() {
            return this.delegate.getColumnCount();
        }

        @Override // f5.d
        @NotNull
        public String getColumnName(int index) {
            return this.delegate.getColumnName(index);
        }

        @Override // f5.d
        public long getLong(int index) {
            return this.delegate.getLong(index);
        }

        @Override // f5.d
        public boolean isNull(int index) {
            return this.delegate.isNull(index);
        }

        @Override // f5.d
        public void k0(int index, @NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.delegate.k0(index, value);
        }

        @Override // f5.d
        public void reset() {
            this.delegate.reset();
        }

        @Override // f5.d
        public void z(int index, long value) {
            this.delegate.z(index, value);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ1\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lz4/j$b;", "Lw1/i;", "", "Lf5/d;", "", "maxSize", "<init>", "(Lz4/j;I)V", "key", "l", "(Ljava/lang/String;)Lf5/d;", "", "evicted", "oldValue", "newValue", "", "m", "(ZLjava/lang/String;Lf5/d;Lf5/d;)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class b extends w1.i<String, f5.d> {
        public b(int i10) {
            super(i10);
        }

        @Override // w1.i
        @NotNull
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public f5.d a(@NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return j.this.delegate.r3(key);
        }

        @Override // w1.i
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void b(boolean evicted, @NotNull String key, @NotNull f5.d oldValue, @Nullable f5.d newValue) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(oldValue, "oldValue");
            oldValue.close();
            super.b(evicted, key, oldValue, newValue);
        }
    }

    public j(@NotNull f5.b delegate, @NotNull uu.a lock, int i10) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(lock, "lock");
        this.delegate = delegate;
        this.lock = lock;
        this.preparedStatementCache = i10 > 0 ? new b(i10) : null;
    }

    @Override // f5.b
    public boolean D() {
        return this.delegate.D();
    }

    public final void b(@NotNull StringBuilder builder) {
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
                Iterator it = CollectionsKt.Y(StringsKt.w0(jt.a.b(th2)), 1).iterator();
                while (it.hasNext()) {
                    builder.append("\t\t" + ((String) it.next()));
                    builder.append('\n');
                }
            }
        }
        if (this.preparedStatementCache != null) {
            builder.append("\t\tPrepared Statement Cache Size: " + this.preparedStatementCache.h());
            builder.append('\n');
        }
    }

    @NotNull
    public final j c(@NotNull CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.acquireCoroutineContext = context;
        this.acquireThrowable = new Throwable();
        return this;
    }

    @Override // f5.b, java.lang.AutoCloseable
    public void close() {
        b bVar = this.preparedStatementCache;
        if (bVar != null) {
            bVar.c();
        }
        this.delegate.close();
    }

    @Override // uu.a
    public boolean d(@Nullable Object owner) {
        return this.lock.d(owner);
    }

    @Override // uu.a
    public void e(@Nullable Object owner) {
        this.lock.e(owner);
    }

    @Override // uu.a
    @Nullable
    public Object f(@Nullable Object obj, @NotNull nt.b<? super Unit> bVar) {
        return this.lock.f(obj, bVar);
    }

    @NotNull
    public final j g() {
        this.acquireCoroutineContext = null;
        this.acquireThrowable = null;
        return this;
    }

    @Override // f5.b
    @NotNull
    public f5.d r3(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        b bVar = this.preparedStatementCache;
        if (bVar == null) {
            return this.delegate.r3(sql);
        }
        f5.d dVarD = bVar.d(sql);
        Intrinsics.checkNotNull(dVarD);
        return new a(dVarD);
    }

    @NotNull
    public String toString() {
        return this.delegate.toString();
    }

    public /* synthetic */ j(f5.b bVar, uu.a aVar, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i11 & 2) != 0 ? uu.g.b(false, 1, null) : aVar, i10);
    }
}
