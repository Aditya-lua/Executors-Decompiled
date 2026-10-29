package z4;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x4.f0;
import x4.g0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u001b\u001c\u0019B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJJ\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\f2(\u0010\u0012\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J2\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00028\u00000\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJH\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\r\u001a\u00020\f2(\u0010\u0012\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eH\u0096@¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b!\u0010\"J\u0018\u0010$\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010,\u001a\u0004\b-\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010,R\u0014\u00108\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00107¨\u00069"}, d2 = {"Lz4/p;", "Lx4/g0;", "Lz4/q;", "Lz4/b;", "connectionElementKey", "Lz4/j;", "delegate", "", "isReadOnly", "<init>", "(Lz4/b;Lz4/j;Z)V", "R", "Lx4/g0$a;", Payload.TYPE, "Lkotlin/Function2;", "Lx4/f0;", "Lnt/b;", "", "block", "o", "(Lx4/g0$a;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "", "sql", "Lkotlin/Function1;", "Lf5/d;", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;", "c", "b", "(Lnt/b;)Ljava/lang/Object;", "", "n", "()V", "i", "(Lx4/g0$a;Lnt/b;)Ljava/lang/Object;", "success", "j", "(ZLnt/b;)Ljava/lang/Object;", "Lz4/b;", "k", "()Lz4/b;", "Lz4/j;", "l", "()Lz4/j;", "Z", "m", "()Z", "Lkotlin/collections/i;", "Lz4/p$c;", "d", "Lkotlin/collections/i;", "transactionStack", "e", "isRecycled", "Lf5/b;", "()Lf5/b;", "rawConnection", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p implements g0, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final z4.b connectionElementKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final j delegate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean isReadOnly;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kotlin.collections.i<c> transactionStack;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public volatile boolean isRecycled;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010\u0019J\u000f\u0010 \u001a\u00020\u001aH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010#J\u000f\u0010%\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010#R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lz4/p$a;", "Lf5/d;", "delegate", "<init>", "(Lz4/p;Lf5/d;)V", "", "index", "", "value", "", "A", "(I[B)V", "", "z", "(IJ)V", "", "k0", "(ILjava/lang/String;)V", "C", "(I)V", "getBlob", "(I)[B", "getLong", "(I)J", "E2", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "g3", "()Z", "reset", "()V", "E", "close", "a", "Lf5/d;", "b", "J", "threadId", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a implements f5.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final f5.d delegate;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final long threadId;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p f37246c;

        public a(@NotNull p pVar, f5.d delegate) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f37246c = pVar;
            this.delegate = delegate;
            this.threadId = y4.d.b();
        }

        @Override // f5.d
        public void A(int index, @NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (this.f37246c.isRecycled) {
                f5.a.b(21, "Statement is recycled");
                throw new jt.d();
            }
            if (this.threadId == y4.d.b()) {
                this.delegate.A(index, value);
            } else {
                f5.a.b(21, "Attempted to use statement on a different thread");
                throw new jt.d();
            }
        }

        @Override // f5.d
        public void C(int index) {
            if (this.f37246c.isRecycled) {
                f5.a.b(21, "Statement is recycled");
                throw new jt.d();
            }
            if (this.threadId == y4.d.b()) {
                this.delegate.C(index);
            } else {
                f5.a.b(21, "Attempted to use statement on a different thread");
                throw new jt.d();
            }
        }

        @Override // f5.d
        public void E() {
            if (this.f37246c.isRecycled) {
                f5.a.b(21, "Statement is recycled");
                throw new jt.d();
            }
            if (this.threadId == y4.d.b()) {
                this.delegate.E();
            } else {
                f5.a.b(21, "Attempted to use statement on a different thread");
                throw new jt.d();
            }
        }

        @Override // f5.d
        @NotNull
        public String E2(int index) {
            if (this.f37246c.isRecycled) {
                f5.a.b(21, "Statement is recycled");
                throw new jt.d();
            }
            if (this.threadId == y4.d.b()) {
                return this.delegate.E2(index);
            }
            f5.a.b(21, "Attempted to use statement on a different thread");
            throw new jt.d();
        }

        @Override // f5.d, java.lang.AutoCloseable
        public void close() {
            if (this.f37246c.isRecycled) {
                f5.a.b(21, "Statement is recycled");
                throw new jt.d();
            }
            if (this.threadId == y4.d.b()) {
                this.delegate.close();
            } else {
                f5.a.b(21, "Attempted to use statement on a different thread");
                throw new jt.d();
            }
        }

        @Override // f5.d
        public boolean g3() {
            if (this.f37246c.isRecycled) {
                f5.a.b(21, "Statement is recycled");
                throw new jt.d();
            }
            if (this.threadId == y4.d.b()) {
                return this.delegate.g3();
            }
            f5.a.b(21, "Attempted to use statement on a different thread");
            throw new jt.d();
        }

        @Override // f5.d
        @NotNull
        public byte[] getBlob(int index) {
            if (this.f37246c.isRecycled) {
                f5.a.b(21, "Statement is recycled");
                throw new jt.d();
            }
            if (this.threadId == y4.d.b()) {
                return this.delegate.getBlob(index);
            }
            f5.a.b(21, "Attempted to use statement on a different thread");
            throw new jt.d();
        }

        @Override // f5.d
        public int getColumnCount() {
            if (this.f37246c.isRecycled) {
                f5.a.b(21, "Statement is recycled");
                throw new jt.d();
            }
            if (this.threadId == y4.d.b()) {
                return this.delegate.getColumnCount();
            }
            f5.a.b(21, "Attempted to use statement on a different thread");
            throw new jt.d();
        }

        @Override // f5.d
        @NotNull
        public String getColumnName(int index) {
            if (this.f37246c.isRecycled) {
                f5.a.b(21, "Statement is recycled");
                throw new jt.d();
            }
            if (this.threadId == y4.d.b()) {
                return this.delegate.getColumnName(index);
            }
            f5.a.b(21, "Attempted to use statement on a different thread");
            throw new jt.d();
        }

        @Override // f5.d
        public long getLong(int index) {
            if (this.f37246c.isRecycled) {
                f5.a.b(21, "Statement is recycled");
                throw new jt.d();
            }
            if (this.threadId == y4.d.b()) {
                return this.delegate.getLong(index);
            }
            f5.a.b(21, "Attempted to use statement on a different thread");
            throw new jt.d();
        }

        @Override // f5.d
        public boolean isNull(int index) {
            if (this.f37246c.isRecycled) {
                f5.a.b(21, "Statement is recycled");
                throw new jt.d();
            }
            if (this.threadId == y4.d.b()) {
                return this.delegate.isNull(index);
            }
            f5.a.b(21, "Attempted to use statement on a different thread");
            throw new jt.d();
        }

        @Override // f5.d
        public void k0(int index, @NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (this.f37246c.isRecycled) {
                f5.a.b(21, "Statement is recycled");
                throw new jt.d();
            }
            if (this.threadId == y4.d.b()) {
                this.delegate.k0(index, value);
            } else {
                f5.a.b(21, "Attempted to use statement on a different thread");
                throw new jt.d();
            }
        }

        @Override // f5.d
        public void reset() {
            if (this.f37246c.isRecycled) {
                f5.a.b(21, "Statement is recycled");
                throw new jt.d();
            }
            if (this.threadId == y4.d.b()) {
                this.delegate.reset();
            } else {
                f5.a.b(21, "Attempted to use statement on a different thread");
                throw new jt.d();
            }
        }

        @Override // f5.d
        public void z(int index, long value) {
            if (this.f37246c.isRecycled) {
                f5.a.b(21, "Statement is recycled");
                throw new jt.d();
            }
            if (this.threadId == y4.d.b()) {
                this.delegate.z(index, value);
            } else {
                f5.a.b(21, "Attempted to use statement on a different thread");
                throw new jt.d();
            }
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\f\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00010\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lz4/p$b;", "T", "Lx4/f0;", "Lz4/q;", "<init>", "(Lz4/p;)V", "R", "", "sql", "Lkotlin/Function1;", "Lf5/d;", "block", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;", "Lf5/b;", "d", "()Lf5/b;", "rawConnection", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class b<T> implements f0<T>, q {
        public b() {
        }

        @Override // x4.m
        @Nullable
        public <R> Object a(@NotNull String str, @NotNull Function1<? super f5.d, ? extends R> function1, @NotNull nt.b<? super R> bVar) {
            return p.this.a(str, function1, bVar);
        }

        @Override // z4.q
        @NotNull
        /* JADX INFO: renamed from: d */
        public f5.b getDelegate() {
            return p.this.getDelegate();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lz4/p$c;", "", "", "id", "", "shouldRollback", "<init>", "(IZ)V", "a", "I", "()I", "b", "Z", "()Z", "setShouldRollback", "(Z)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean shouldRollback;

        public c(int i10, boolean z10) {
            this.id = i10;
            this.shouldRollback = z10;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getShouldRollback() {
            return this.shouldRollback;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37249a;

        static {
            int[] iArr = new int[g0.a.values().length];
            try {
                iArr[g0.a.DEFERRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g0.a.IMMEDIATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g0.a.EXCLUSIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37249a = iArr;
        }
    }

    @pt.f(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {629}, m = "beginTransaction")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class e extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f37250t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f37251u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f37252v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f37254x;

        public e(nt.b<? super e> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f37252v = obj;
            this.f37254x |= Integer.MIN_VALUE;
            return p.this.i(null, this);
        }
    }

    @pt.f(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {629}, m = "endTransaction")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class f extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f37255t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f37256u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f37257v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f37259x;

        public f(nt.b<? super f> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f37257v = obj;
            this.f37259x |= Integer.MIN_VALUE;
            return p.this.j(false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @pt.f(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {464, 468, 482, 482, 482}, m = "transaction")
    public static final class g<R> extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f37260t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f37261u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f37262v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f37263w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f37265y;

        public g(nt.b<? super g> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f37263w = obj;
            this.f37265y |= Integer.MIN_VALUE;
            return p.this.o(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @pt.f(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {640}, m = "usePrepared")
    public static final class h<R> extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f37266t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f37267u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f37268v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f37269w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f37271y;

        public h(nt.b<? super h> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f37269w = obj;
            this.f37271y |= Integer.MIN_VALUE;
            return p.this.a(null, null, this);
        }
    }

    public p(@NotNull z4.b connectionElementKey, @NotNull j delegate, boolean z10) {
        Intrinsics.checkNotNullParameter(connectionElementKey, "connectionElementKey");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.connectionElementKey = connectionElementKey;
        this.delegate = delegate;
        this.isReadOnly = z10;
        this.transactionStack = new kotlin.collections.i<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:41:0x0089  */
    /* JADX WARN: Code duplicated, block: B:45:0x0095 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x00be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bc, code lost:
    
        if (j(false, r0) == r1) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R> java.lang.Object o(x4.g0.a r11, kotlin.jvm.functions.Function2<? super x4.f0<R>, ? super nt.b<? super R>, ? extends java.lang.Object> r12, nt.b<? super R> r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof z4.p.g
            if (r0 == 0) goto L13
            r0 = r13
            z4.p$g r0 = (z4.p.g) r0
            int r1 = r0.f37265y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37265y = r1
            goto L18
        L13:
            z4.p$g r0 = new z4.p$g
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f37263w
            java.lang.Object r1 = ot.c.e()
            int r2 = r0.f37265y
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 0
            r8 = 1
            r9 = 0
            if (r2 == 0) goto L62
            if (r2 == r8) goto L59
            if (r2 == r6) goto L51
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L4b
            if (r2 == r3) goto L3b
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3b:
            java.lang.Object r11 = r0.f37261u
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            java.lang.Object r12 = r0.f37260t
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            jt.o.b(r13)     // Catch: android.database.SQLException -> L48
            goto Lc6
        L48:
            r13 = move-exception
            goto Lc1
        L4b:
            java.lang.Object r11 = r0.f37260t
            jt.o.b(r13)
            return r11
        L51:
            int r11 = r0.f37262v
            jt.o.b(r13)     // Catch: java.lang.Throwable -> L57
            goto L87
        L57:
            r11 = move-exception
            goto L96
        L59:
            java.lang.Object r11 = r0.f37260t
            r12 = r11
            kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
            jt.o.b(r13)
            goto L74
        L62:
            jt.o.b(r13)
            if (r11 != 0) goto L69
            x4.g0$a r11 = x4.g0.a.DEFERRED
        L69:
            r0.f37260t = r12
            r0.f37265y = r8
            java.lang.Object r11 = r10.i(r11, r0)
            if (r11 != r1) goto L74
            goto Lbe
        L74:
            z4.p$b r11 = new z4.p$b     // Catch: java.lang.Throwable -> L57
            r11.<init>()     // Catch: java.lang.Throwable -> L57
            r0.f37260t = r9     // Catch: java.lang.Throwable -> L57
            r0.f37262v = r8     // Catch: java.lang.Throwable -> L57
            r0.f37265y = r6     // Catch: java.lang.Throwable -> L57
            java.lang.Object r13 = r12.invoke(r11, r0)     // Catch: java.lang.Throwable -> L57
            if (r13 != r1) goto L86
            goto Lbe
        L86:
            r11 = r8
        L87:
            if (r11 == 0) goto L8a
            r7 = r8
        L8a:
            r0.f37260t = r13
            r0.f37265y = r5
            java.lang.Object r11 = r10.j(r7, r0)
            if (r11 != r1) goto L95
            goto Lbe
        L95:
            return r13
        L96:
            boolean r12 = r11 instanceof z4.c.a     // Catch: java.lang.Throwable -> Lac
            if (r12 == 0) goto Lae
            z4.c$a r11 = (z4.c.a) r11     // Catch: java.lang.Throwable -> Lac
            java.lang.Object r11 = r11.a()     // Catch: java.lang.Throwable -> Lac
            r0.f37260t = r11
            r0.f37265y = r4
            java.lang.Object r12 = r10.j(r7, r0)
            if (r12 != r1) goto Lab
            goto Lbe
        Lab:
            return r11
        Lac:
            r11 = move-exception
            goto Lb2
        Lae:
            throw r11     // Catch: java.lang.Throwable -> Laf
        Laf:
            r12 = move-exception
            r9 = r11
            r11 = r12
        Lb2:
            r0.f37260t = r9     // Catch: android.database.SQLException -> Lbf
            r0.f37261u = r11     // Catch: android.database.SQLException -> Lbf
            r0.f37265y = r3     // Catch: android.database.SQLException -> Lbf
            java.lang.Object r12 = r10.j(r7, r0)     // Catch: android.database.SQLException -> Lbf
            if (r12 != r1) goto Lc6
        Lbe:
            return r1
        Lbf:
            r13 = move-exception
            r12 = r9
        Lc1:
            if (r12 == 0) goto Lc7
            jt.a.a(r12, r13)
        Lc6:
            throw r11
        Lc7:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.p.o(x4.g0$a, kotlin.jvm.functions.Function2, nt.b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // x4.m
    @Nullable
    public <R> Object a(@NotNull String str, @NotNull Function1<? super f5.d, ? extends R> function1, @NotNull nt.b<? super R> bVar) {
        h hVar;
        uu.a aVar;
        if (bVar instanceof h) {
            hVar = (h) bVar;
            int i10 = hVar.f37271y;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f37271y = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(bVar);
            }
        } else {
            hVar = new h(bVar);
        }
        Object obj = hVar.f37269w;
        Object objE = ot.c.e();
        int i11 = hVar.f37271y;
        if (i11 == 0) {
            jt.o.b(obj);
            if (this.isRecycled) {
                f5.a.b(21, "Connection is recycled");
                throw new jt.d();
            }
            z4.a aVar2 = (z4.a) hVar.getContext().get(getConnectionElementKey());
            if (aVar2 == null || aVar2.getConnectionWrapper() != this) {
                f5.a.b(21, "Attempted to use connection on a different coroutine");
                throw new jt.d();
            }
            aVar = this.delegate;
            hVar.f37266t = str;
            hVar.f37267u = function1;
            hVar.f37268v = aVar;
            hVar.f37271y = 1;
            if (aVar.f(null, hVar) == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uu.a aVar3 = (uu.a) hVar.f37268v;
            function1 = (Function1) hVar.f37267u;
            String str2 = (String) hVar.f37266t;
            jt.o.b(obj);
            aVar = aVar3;
            str = str2;
        }
        try {
            a aVar4 = new a(this, this.delegate.r3(str));
            try {
                R rInvoke = function1.invoke(aVar4);
                xt.a.a(aVar4, null);
                aVar.e(null);
                return rInvoke;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    xt.a.a(aVar4, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            aVar.e(null);
            throw th4;
        }
    }

    @Override // x4.g0
    @Nullable
    public Object b(@NotNull nt.b<? super Boolean> bVar) {
        if (this.isRecycled) {
            f5.a.b(21, "Connection is recycled");
            throw new jt.d();
        }
        z4.a aVar = (z4.a) bVar.getContext().get(getConnectionElementKey());
        if (aVar != null && aVar.getConnectionWrapper() == this) {
            return pt.b.a(!this.transactionStack.isEmpty() || this.delegate.D());
        }
        f5.a.b(21, "Attempted to use connection on a different coroutine");
        throw new jt.d();
    }

    @Override // x4.g0
    @Nullable
    public <R> Object c(@NotNull g0.a aVar, @NotNull Function2<? super f0<R>, ? super nt.b<? super R>, ? extends Object> function2, @NotNull nt.b<? super R> bVar) {
        if (this.isRecycled) {
            f5.a.b(21, "Connection is recycled");
            throw new jt.d();
        }
        z4.a aVar2 = (z4.a) bVar.getContext().get(getConnectionElementKey());
        if (aVar2 != null && aVar2.getConnectionWrapper() == this) {
            return o(aVar, function2, bVar);
        }
        f5.a.b(21, "Attempted to use connection on a different coroutine");
        throw new jt.d();
    }

    @Override // z4.q
    @NotNull
    /* JADX INFO: renamed from: d */
    public f5.b getDelegate() {
        return this.delegate;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(g0.a aVar, nt.b<? super Unit> bVar) {
        e eVar;
        uu.a aVar2;
        if (bVar instanceof e) {
            eVar = (e) bVar;
            int i10 = eVar.f37254x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f37254x = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(bVar);
            }
        } else {
            eVar = new e(bVar);
        }
        Object obj = eVar.f37252v;
        Object objE = ot.c.e();
        int i11 = eVar.f37254x;
        if (i11 == 0) {
            jt.o.b(obj);
            aVar2 = this.delegate;
            eVar.f37250t = aVar;
            eVar.f37251u = aVar2;
            eVar.f37254x = 1;
            if (aVar2.f(null, eVar) == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uu.a aVar3 = (uu.a) eVar.f37251u;
            g0.a aVar4 = (g0.a) eVar.f37250t;
            jt.o.b(obj);
            aVar2 = aVar3;
            aVar = aVar4;
        }
        try {
            int size = this.transactionStack.size();
            if (this.transactionStack.isEmpty()) {
                int i12 = d.f37249a[aVar.ordinal()];
                if (i12 == 1) {
                    f5.a.a(this.delegate, "BEGIN DEFERRED TRANSACTION");
                } else if (i12 == 2) {
                    f5.a.a(this.delegate, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (i12 != 3) {
                        throw new jt.l();
                    }
                    f5.a.a(this.delegate, "BEGIN EXCLUSIVE TRANSACTION");
                }
            } else {
                f5.a.a(this.delegate, "SAVEPOINT '" + size + '\'');
            }
            this.transactionStack.addLast(new c(size, false));
            Unit unit = Unit.f22483a;
            aVar2.e(null);
            return unit;
        } catch (Throwable th2) {
            aVar2.e(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(boolean z10, nt.b<? super Unit> bVar) {
        f fVar;
        uu.a aVar;
        if (bVar instanceof f) {
            fVar = (f) bVar;
            int i10 = fVar.f37259x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f37259x = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(bVar);
            }
        } else {
            fVar = new f(bVar);
        }
        Object obj = fVar.f37257v;
        Object objE = ot.c.e();
        int i11 = fVar.f37259x;
        if (i11 == 0) {
            jt.o.b(obj);
            j jVar = this.delegate;
            fVar.f37256u = jVar;
            fVar.f37255t = z10;
            fVar.f37259x = 1;
            if (jVar.f(null, fVar) == objE) {
                return objE;
            }
            aVar = jVar;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = fVar.f37255t;
            aVar = (uu.a) fVar.f37256u;
            jt.o.b(obj);
        }
        try {
            if (this.transactionStack.isEmpty()) {
                throw new IllegalStateException("Not in a transaction");
            }
            c cVar = (c) u.H(this.transactionStack);
            if (!z10 || cVar.getShouldRollback()) {
                if (this.transactionStack.isEmpty()) {
                    f5.a.a(this.delegate, "ROLLBACK TRANSACTION");
                } else {
                    f5.a.a(this.delegate, "ROLLBACK TRANSACTION TO SAVEPOINT '" + cVar.getId() + '\'');
                }
            } else if (this.transactionStack.isEmpty()) {
                f5.a.a(this.delegate, "END TRANSACTION");
            } else {
                f5.a.a(this.delegate, "RELEASE SAVEPOINT '" + cVar.getId() + '\'');
            }
            Unit unit = Unit.f22483a;
            aVar.e(null);
            return unit;
        } catch (Throwable th2) {
            aVar.e(null);
            throw th2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final z4.b getConnectionElementKey() {
        return this.connectionElementKey;
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final j getDelegate() {
        return this.delegate;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsReadOnly() {
        return this.isReadOnly;
    }

    public final void n() {
        if (this.isRecycled) {
            return;
        }
        this.isRecycled = true;
        if (this.delegate.D()) {
            f5.a.a(this.delegate, "ROLLBACK TRANSACTION");
        }
    }
}
