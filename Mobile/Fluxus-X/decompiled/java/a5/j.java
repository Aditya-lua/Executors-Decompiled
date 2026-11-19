package a5;

import com.github.luben.zstd.BuildConfig;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.coroutines.CoroutineContext;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001a)B!\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u001a\u001a\u00020\u000e2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096A¢\u0006\u0004\b#\u0010$J\u001a\u0010%\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010'\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0001¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010/R\u001a\u00103\u001a\b\u0018\u000101R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00102¨\u00064"}, d2 = {"La5/j;", "Lg5/b;", "Lkv/a;", "delegate", "lock", BuildConfig.FLAVOR, "preparedStatementCacheSize", "<init>", "(Lg5/b;Lkv/a;I)V", BuildConfig.FLAVOR, "sql", "Lg5/d;", "w3", "(Ljava/lang/String;)Lg5/d;", BuildConfig.FLAVOR, "close", "()V", "Lkotlin/coroutines/CoroutineContext;", "context", "c", "(Lkotlin/coroutines/CoroutineContext;)La5/j;", "g", "()La5/j;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "b", "(Ljava/lang/StringBuilder;)V", "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "G", "()Z", BuildConfig.FLAVOR, "owner", "d", "(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;", "e", "(Ljava/lang/Object;)Z", "f", "(Ljava/lang/Object;)V", "a", "Lg5/b;", "Lkv/a;", "Lkotlin/coroutines/CoroutineContext;", "acquireCoroutineContext", BuildConfig.FLAVOR, "Ljava/lang/Throwable;", "acquireThrowable", "La5/j$b;", "La5/j$b;", "preparedStatementCache", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j implements g5.b, kv.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g5.b delegate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final kv.a lock;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public CoroutineContext acquireCoroutineContext;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Throwable acquireThrowable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final b preparedStatementCache;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\f\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u000f\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0012\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u000e2\b\b\u0001\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00112\b\b\u0001\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\u001f\u001a\u00020\u001a2\b\b\u0001\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010\"\u001a\u00020\u00112\b\b\u0001\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b%\u0010\u0007J\u0010\u0010&\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b&\u0010\u0007R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"La5/j$a;", "Lg5/d;", "delegate", "<init>", "(Lg5/d;)V", BuildConfig.FLAVOR, "close", "()V", BuildConfig.FLAVOR, "index", BuildConfig.FLAVOR, "value", "C", "(I[B)V", BuildConfig.FLAVOR, "B", "(IJ)V", BuildConfig.FLAVOR, "m0", "(ILjava/lang/String;)V", "F", "(I)V", "getBlob", "(I)[B", "getLong", "(I)J", BuildConfig.FLAVOR, "d2", "(I)Z", "I2", "(I)Ljava/lang/String;", "isNull", "getColumnCount", "()I", "getColumnName", "n3", "()Z", "reset", "H", "a", "Lg5/d;", "getDelegate", "()Lg5/d;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements g5.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final g5.d delegate;

        public a(@NotNull g5.d delegate) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.delegate = delegate;
        }

        @Override // g5.d
        public void B(int index, long value) {
            this.delegate.B(index, value);
        }

        @Override // g5.d
        public void C(int index, @NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.delegate.C(index, value);
        }

        @Override // g5.d
        public void F(int index) {
            this.delegate.F(index);
        }

        @Override // g5.d
        public void H() {
            this.delegate.H();
        }

        @Override // g5.d
        @NotNull
        public String I2(int index) {
            return this.delegate.I2(index);
        }

        @Override // g5.d, java.lang.AutoCloseable
        public void close() {
            this.delegate.reset();
            this.delegate.H();
        }

        @Override // g5.d
        public boolean d2(int index) {
            return this.delegate.d2(index);
        }

        @Override // g5.d
        @NotNull
        public byte[] getBlob(int index) {
            return this.delegate.getBlob(index);
        }

        @Override // g5.d
        public int getColumnCount() {
            return this.delegate.getColumnCount();
        }

        @Override // g5.d
        @NotNull
        public String getColumnName(int index) {
            return this.delegate.getColumnName(index);
        }

        @Override // g5.d
        public long getLong(int index) {
            return this.delegate.getLong(index);
        }

        @Override // g5.d
        public boolean isNull(int index) {
            return this.delegate.isNull(index);
        }

        @Override // g5.d
        public void m0(int index, @NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.delegate.m0(index, value);
        }

        @Override // g5.d
        public boolean n3() {
            return this.delegate.n3();
        }

        @Override // g5.d
        public void reset() {
            this.delegate.reset();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ1\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"La5/j$b;", "Lw1/i;", BuildConfig.FLAVOR, "Lg5/d;", BuildConfig.FLAVOR, "maxSize", "<init>", "(La5/j;I)V", "key", "l", "(Ljava/lang/String;)Lg5/d;", BuildConfig.FLAVOR, "evicted", "oldValue", "newValue", BuildConfig.FLAVOR, "m", "(ZLjava/lang/String;Lg5/d;Lg5/d;)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class b extends w1.i<String, g5.d> {
        public b(int i10) {
            super(i10);
        }

        @Override // w1.i
        @NotNull
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public g5.d a(@NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return j.this.delegate.w3(key);
        }

        @Override // w1.i
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void b(boolean evicted, @NotNull String key, @NotNull g5.d oldValue, @Nullable g5.d newValue) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(oldValue, "oldValue");
            oldValue.close();
            super.b(evicted, key, oldValue, newValue);
        }
    }

    public j(@NotNull g5.b delegate, @NotNull kv.a lock, int i10) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(lock, "lock");
        this.delegate = delegate;
        this.lock = lock;
        this.preparedStatementCache = i10 > 0 ? new b(i10) : null;
    }

    @Override // g5.b
    public boolean G() {
        return this.delegate.G();
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
                Iterator it = CollectionsKt.Y(StringsKt.w0(zt.a.b(th2)), 1).iterator();
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

    @Override // g5.b, java.lang.AutoCloseable
    public void close() {
        b bVar = this.preparedStatementCache;
        if (bVar != null) {
            bVar.c();
        }
        this.delegate.close();
    }

    @Override // kv.a
    @Nullable
    public Object d(@Nullable Object obj, @NotNull eu.b<? super Unit> bVar) {
        return this.lock.d(obj, bVar);
    }

    @Override // kv.a
    public boolean e(@Nullable Object owner) {
        return this.lock.e(owner);
    }

    @Override // kv.a
    public void f(@Nullable Object owner) {
        this.lock.f(owner);
    }

    @NotNull
    public final j g() {
        this.acquireCoroutineContext = null;
        this.acquireThrowable = null;
        return this;
    }

    @NotNull
    public String toString() {
        return this.delegate.toString();
    }

    @Override // g5.b
    @NotNull
    public g5.d w3(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        b bVar = this.preparedStatementCache;
        if (bVar == null) {
            return this.delegate.w3(sql);
        }
        g5.d dVarD = bVar.d(sql);
        Intrinsics.checkNotNull(dVarD);
        return new a(dVarD);
    }

    public /* synthetic */ j(g5.b bVar, kv.a aVar, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, (i11 & 2) != 0 ? kv.g.b(false, 1, null) : aVar, i10);
    }
}
