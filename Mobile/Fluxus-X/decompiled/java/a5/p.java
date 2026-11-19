package a5;

import android.database.SQLException;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.u;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import y4.f0;
import y4.g0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u001b\u001c\u0019B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJJ\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\f2(\u0010\u0012\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J2\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00028\u00000\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJH\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\r\u001a\u00020\f2(\u0010\u0012\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eH\u0096@¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b!\u0010\"J\u0018\u0010$\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010,\u001a\u0004\b-\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010,R\u0014\u00108\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00107¨\u00069"}, d2 = {"La5/p;", "Ly4/g0;", "La5/q;", "La5/b;", "connectionElementKey", "La5/j;", "delegate", BuildConfig.FLAVOR, "isReadOnly", "<init>", "(La5/b;La5/j;Z)V", "R", "Ly4/g0$a;", Payload.TYPE, "Lkotlin/Function2;", "Ly4/f0;", "Leu/b;", BuildConfig.FLAVOR, "block", "o", "(Ly4/g0$a;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "sql", "Lkotlin/Function1;", "Lg5/d;", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;", "c", "b", "(Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "n", "()V", "i", "(Ly4/g0$a;Leu/b;)Ljava/lang/Object;", "success", "j", "(ZLeu/b;)Ljava/lang/Object;", "La5/b;", "k", "()La5/b;", "La5/j;", "l", "()La5/j;", "Z", "m", "()Z", "Lkotlin/collections/i;", "La5/p$c;", "d", "Lkotlin/collections/i;", "transactionStack", "e", "isRecycled", "Lg5/b;", "()Lg5/b;", "rawConnection", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p implements g0, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a5.b connectionElementKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final j delegate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean isReadOnly;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p001kotlin.collections.i<c> transactionStack;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public volatile boolean isRecycled;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010\u0019J\u000f\u0010 \u001a\u00020\u001aH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010#J\u000f\u0010%\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010#R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"La5/p$a;", "Lg5/d;", "delegate", "<init>", "(La5/p;Lg5/d;)V", BuildConfig.FLAVOR, "index", BuildConfig.FLAVOR, "value", BuildConfig.FLAVOR, "C", "(I[B)V", BuildConfig.FLAVOR, "B", "(IJ)V", BuildConfig.FLAVOR, "m0", "(ILjava/lang/String;)V", "F", "(I)V", "getBlob", "(I)[B", "getLong", "(I)J", "I2", "(I)Ljava/lang/String;", BuildConfig.FLAVOR, "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "n3", "()Z", "reset", "()V", "H", "close", "a", "Lg5/d;", "b", "J", "threadId", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a implements g5.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final g5.d delegate;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final long threadId;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p f216c;

        public a(@NotNull p pVar, g5.d delegate) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f216c = pVar;
            this.delegate = delegate;
            this.threadId = z4.d.b();
        }

        @Override // g5.d
        public void B(int index, long value) {
            if (this.f216c.isRecycled) {
                g5.a.b(21, "Statement is recycled");
                throw new zt.d();
            }
            if (this.threadId == z4.d.b()) {
                this.delegate.B(index, value);
            } else {
                g5.a.b(21, "Attempted to use statement on a different thread");
                throw new zt.d();
            }
        }

        @Override // g5.d
        public void C(int index, @NotNull byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (this.f216c.isRecycled) {
                g5.a.b(21, "Statement is recycled");
                throw new zt.d();
            }
            if (this.threadId == z4.d.b()) {
                this.delegate.C(index, value);
            } else {
                g5.a.b(21, "Attempted to use statement on a different thread");
                throw new zt.d();
            }
        }

        @Override // g5.d
        public void F(int index) {
            if (this.f216c.isRecycled) {
                g5.a.b(21, "Statement is recycled");
                throw new zt.d();
            }
            if (this.threadId == z4.d.b()) {
                this.delegate.F(index);
            } else {
                g5.a.b(21, "Attempted to use statement on a different thread");
                throw new zt.d();
            }
        }

        @Override // g5.d
        public void H() {
            if (this.f216c.isRecycled) {
                g5.a.b(21, "Statement is recycled");
                throw new zt.d();
            }
            if (this.threadId == z4.d.b()) {
                this.delegate.H();
            } else {
                g5.a.b(21, "Attempted to use statement on a different thread");
                throw new zt.d();
            }
        }

        @Override // g5.d
        @NotNull
        public String I2(int index) {
            if (this.f216c.isRecycled) {
                g5.a.b(21, "Statement is recycled");
                throw new zt.d();
            }
            if (this.threadId == z4.d.b()) {
                return this.delegate.I2(index);
            }
            g5.a.b(21, "Attempted to use statement on a different thread");
            throw new zt.d();
        }

        @Override // g5.d, java.lang.AutoCloseable
        public void close() {
            if (this.f216c.isRecycled) {
                g5.a.b(21, "Statement is recycled");
                throw new zt.d();
            }
            if (this.threadId == z4.d.b()) {
                this.delegate.close();
            } else {
                g5.a.b(21, "Attempted to use statement on a different thread");
                throw new zt.d();
            }
        }

        @Override // g5.d
        @NotNull
        public byte[] getBlob(int index) {
            if (this.f216c.isRecycled) {
                g5.a.b(21, "Statement is recycled");
                throw new zt.d();
            }
            if (this.threadId == z4.d.b()) {
                return this.delegate.getBlob(index);
            }
            g5.a.b(21, "Attempted to use statement on a different thread");
            throw new zt.d();
        }

        @Override // g5.d
        public int getColumnCount() {
            if (this.f216c.isRecycled) {
                g5.a.b(21, "Statement is recycled");
                throw new zt.d();
            }
            if (this.threadId == z4.d.b()) {
                return this.delegate.getColumnCount();
            }
            g5.a.b(21, "Attempted to use statement on a different thread");
            throw new zt.d();
        }

        @Override // g5.d
        @NotNull
        public String getColumnName(int index) {
            if (this.f216c.isRecycled) {
                g5.a.b(21, "Statement is recycled");
                throw new zt.d();
            }
            if (this.threadId == z4.d.b()) {
                return this.delegate.getColumnName(index);
            }
            g5.a.b(21, "Attempted to use statement on a different thread");
            throw new zt.d();
        }

        @Override // g5.d
        public long getLong(int index) {
            if (this.f216c.isRecycled) {
                g5.a.b(21, "Statement is recycled");
                throw new zt.d();
            }
            if (this.threadId == z4.d.b()) {
                return this.delegate.getLong(index);
            }
            g5.a.b(21, "Attempted to use statement on a different thread");
            throw new zt.d();
        }

        @Override // g5.d
        public boolean isNull(int index) {
            if (this.f216c.isRecycled) {
                g5.a.b(21, "Statement is recycled");
                throw new zt.d();
            }
            if (this.threadId == z4.d.b()) {
                return this.delegate.isNull(index);
            }
            g5.a.b(21, "Attempted to use statement on a different thread");
            throw new zt.d();
        }

        @Override // g5.d
        public void m0(int index, @NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (this.f216c.isRecycled) {
                g5.a.b(21, "Statement is recycled");
                throw new zt.d();
            }
            if (this.threadId == z4.d.b()) {
                this.delegate.m0(index, value);
            } else {
                g5.a.b(21, "Attempted to use statement on a different thread");
                throw new zt.d();
            }
        }

        @Override // g5.d
        public boolean n3() {
            if (this.f216c.isRecycled) {
                g5.a.b(21, "Statement is recycled");
                throw new zt.d();
            }
            if (this.threadId == z4.d.b()) {
                return this.delegate.n3();
            }
            g5.a.b(21, "Attempted to use statement on a different thread");
            throw new zt.d();
        }

        @Override // g5.d
        public void reset() {
            if (this.f216c.isRecycled) {
                g5.a.b(21, "Statement is recycled");
                throw new zt.d();
            }
            if (this.threadId == z4.d.b()) {
                this.delegate.reset();
            } else {
                g5.a.b(21, "Attempted to use statement on a different thread");
                throw new zt.d();
            }
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\f\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00010\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"La5/p$b;", "T", "Ly4/f0;", "La5/q;", "<init>", "(La5/p;)V", "R", BuildConfig.FLAVOR, "sql", "Lkotlin/Function1;", "Lg5/d;", "block", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;", "Lg5/b;", "d", "()Lg5/b;", "rawConnection", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class b<T> implements f0<T>, q {
        public b() {
        }

        @Override // y4.m
        @Nullable
        public <R> Object a(@NotNull String str, @NotNull Function1<? super g5.d, ? extends R> function1, @NotNull eu.b<? super R> bVar) {
            return p.this.a(str, function1, bVar);
        }

        @Override // a5.q
        @NotNull
        /* JADX INFO: renamed from: d */
        public g5.b getDelegate() {
            return p.this.getDelegate();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"La5/p$c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "id", BuildConfig.FLAVOR, "shouldRollback", "<init>", "(IZ)V", "a", "I", "()I", "b", "Z", "()Z", "setShouldRollback", "(Z)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
        public static final /* synthetic */ int[] f219a;

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
            f219a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @gu.f(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {629}, m = "beginTransaction")
    public static final class e extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f220t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f221u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f222v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f224x;

        public e(eu.b<? super e> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f222v = obj;
            this.f224x |= Integer.MIN_VALUE;
            return p.this.i(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @gu.f(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {629}, m = "endTransaction")
    public static final class f extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f225t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f226u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f227v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f229x;

        public f(eu.b<? super f> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f227v = obj;
            this.f229x |= Integer.MIN_VALUE;
            return p.this.j(false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @gu.f(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {464, 468, 482, 482, 482}, m = "transaction")
    public static final class g<R> extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f230t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f231u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f232v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f233w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f235y;

        public g(eu.b<? super g> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f233w = obj;
            this.f235y |= Integer.MIN_VALUE;
            return p.this.o(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @gu.f(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {640}, m = "usePrepared")
    public static final class h<R> extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f236t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f237u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f238v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f239w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f241y;

        public h(eu.b<? super h> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f239w = obj;
            this.f241y |= Integer.MIN_VALUE;
            return p.this.a(null, null, this);
        }
    }

    public p(@NotNull a5.b connectionElementKey, @NotNull j delegate, boolean z10) {
        Intrinsics.checkNotNullParameter(connectionElementKey, "connectionElementKey");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.connectionElementKey = connectionElementKey;
        this.delegate = delegate;
        this.isReadOnly = z10;
        this.transactionStack = new p001kotlin.collections.i<>();
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
    */
    public final <R> Object o(g0.a aVar, Function2<? super f0<R>, ? super eu.b<? super R>, ? extends Object> function2, eu.b<? super R> bVar) throws Throwable {
        g gVar;
        Throwable th2;
        int i10;
        boolean z10;
        if (bVar instanceof g) {
            gVar = (g) bVar;
            int i11 = gVar.f235y;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f235y = i11 - Integer.MIN_VALUE;
            } else {
                gVar = new g(bVar);
            }
        } else {
            gVar = new g(bVar);
        }
        Object objInvoke = gVar.f233w;
        Object objE = fu.c.e();
        int i12 = gVar.f235y;
        a5.c.a aVar2 = null;
        try {
            if (i12 == 0) {
                zt.o.b(objInvoke);
                if (aVar == null) {
                    aVar = g0.a.DEFERRED;
                }
                gVar.f230t = function2;
                gVar.f235y = 1;
                if (i(aVar, gVar) != objE) {
                }
                return objE;
            }
            if (i12 == 1) {
                function2 = (Function2) gVar.f230t;
                zt.o.b(objInvoke);
            } else {
                if (i12 != 2) {
                    if (i12 == 3 || i12 == 4) {
                        Object obj = gVar.f230t;
                        zt.o.b(objInvoke);
                        return obj;
                    }
                    if (i12 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = (Throwable) gVar.f231u;
                    th2 = (Throwable) gVar.f230t;
                    try {
                        zt.o.b(objInvoke);
                    } catch (SQLException e10) {
                        e = e10;
                        if (th2 != null) {
                            throw e;
                        }
                        zt.a.a(th2, e);
                    }
                    throw th;
                }
                i10 = gVar.f232v;
                zt.o.b(objInvoke);
            }
            z10 = i10 != 0;
            gVar.f230t = objInvoke;
            gVar.f235y = 3;
            if (j(z10, gVar) != objE) {
                return objE;
            }
            return objInvoke;
            b bVar2 = new b();
            gVar.f230t = null;
            gVar.f232v = 1;
            gVar.f235y = 2;
            objInvoke = function2.invoke(bVar2, gVar);
            if (objInvoke != objE) {
                i10 = 1;
                if (i10 != 0) {
                }
                gVar.f230t = objInvoke;
                gVar.f235y = 3;
                if (j(z10, gVar) != objE) {
                    return objInvoke;
                }
            }
        } catch (Throwable th3) {
            try {
                try {
                    if (th3 instanceof a5.c.a) {
                        Object objA = th3.a();
                        gVar.f230t = objA;
                        gVar.f235y = 4;
                        if (j(false, gVar) == objE) {
                            return objE;
                        }
                        return objA;
                    }
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        aVar2 = th3;
                        th = th4;
                        gVar.f230t = aVar2;
                        gVar.f231u = th;
                        gVar.f235y = 5;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
                gVar.f230t = aVar2;
                gVar.f231u = th;
                gVar.f235y = 5;
            } catch (SQLException e11) {
                e = e11;
                th2 = aVar2;
                if (th2 != null) {
                    throw e;
                }
                zt.a.a(th2, e);
            }
        }
        return objE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // y4.m
    @Nullable
    public <R> Object a(@NotNull String str, @NotNull Function1<? super g5.d, ? extends R> function1, @NotNull eu.b<? super R> bVar) {
        h hVar;
        kv.a aVar;
        if (bVar instanceof h) {
            hVar = (h) bVar;
            int i10 = hVar.f241y;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f241y = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(bVar);
            }
        } else {
            hVar = new h(bVar);
        }
        Object obj = hVar.f239w;
        Object objE = fu.c.e();
        int i11 = hVar.f241y;
        if (i11 == 0) {
            zt.o.b(obj);
            if (this.isRecycled) {
                g5.a.b(21, "Connection is recycled");
                throw new zt.d();
            }
            a5.a aVar2 = (a5.a) hVar.getContext().get(getConnectionElementKey());
            if (aVar2 == null || aVar2.getConnectionWrapper() != this) {
                g5.a.b(21, "Attempted to use connection on a different coroutine");
                throw new zt.d();
            }
            aVar = this.delegate;
            hVar.f236t = str;
            hVar.f237u = function1;
            hVar.f238v = aVar;
            hVar.f241y = 1;
            if (aVar.d(null, hVar) == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kv.a aVar3 = (kv.a) hVar.f238v;
            function1 = (Function1) hVar.f237u;
            String str2 = (String) hVar.f236t;
            zt.o.b(obj);
            aVar = aVar3;
            str = str2;
        }
        try {
            a aVar4 = new a(this, this.delegate.w3(str));
            try {
                R rInvoke = function1.invoke(aVar4);
                nu.a.a(aVar4, null);
                aVar.f(null);
                return rInvoke;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    nu.a.a(aVar4, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            aVar.f(null);
            throw th4;
        }
    }

    @Override // y4.g0
    @Nullable
    public Object b(@NotNull eu.b<? super Boolean> bVar) {
        if (this.isRecycled) {
            g5.a.b(21, "Connection is recycled");
            throw new zt.d();
        }
        a5.a aVar = (a5.a) bVar.getContext().get(getConnectionElementKey());
        if (aVar != null && aVar.getConnectionWrapper() == this) {
            return gu.b.a(!this.transactionStack.isEmpty() || this.delegate.G());
        }
        g5.a.b(21, "Attempted to use connection on a different coroutine");
        throw new zt.d();
    }

    @Override // y4.g0
    @Nullable
    public <R> Object c(@NotNull g0.a aVar, @NotNull Function2<? super f0<R>, ? super eu.b<? super R>, ? extends Object> function2, @NotNull eu.b<? super R> bVar) {
        if (this.isRecycled) {
            g5.a.b(21, "Connection is recycled");
            throw new zt.d();
        }
        a5.a aVar2 = (a5.a) bVar.getContext().get(getConnectionElementKey());
        if (aVar2 != null && aVar2.getConnectionWrapper() == this) {
            return o(aVar, function2, bVar);
        }
        g5.a.b(21, "Attempted to use connection on a different coroutine");
        throw new zt.d();
    }

    @Override // a5.q
    @NotNull
    /* JADX INFO: renamed from: d */
    public g5.b getDelegate() {
        return this.delegate;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(g0.a aVar, eu.b<? super Unit> bVar) {
        e eVar;
        kv.a aVar2;
        if (bVar instanceof e) {
            eVar = (e) bVar;
            int i10 = eVar.f224x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f224x = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(bVar);
            }
        } else {
            eVar = new e(bVar);
        }
        Object obj = eVar.f222v;
        Object objE = fu.c.e();
        int i11 = eVar.f224x;
        if (i11 == 0) {
            zt.o.b(obj);
            aVar2 = this.delegate;
            eVar.f220t = aVar;
            eVar.f221u = aVar2;
            eVar.f224x = 1;
            if (aVar2.d(null, eVar) == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kv.a aVar3 = (kv.a) eVar.f221u;
            g0.a aVar4 = (g0.a) eVar.f220t;
            zt.o.b(obj);
            aVar2 = aVar3;
            aVar = aVar4;
        }
        try {
            int size = this.transactionStack.size();
            if (this.transactionStack.isEmpty()) {
                int i12 = d.f219a[aVar.ordinal()];
                if (i12 == 1) {
                    g5.a.a(this.delegate, "BEGIN DEFERRED TRANSACTION");
                } else if (i12 == 2) {
                    g5.a.a(this.delegate, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (i12 != 3) {
                        throw new zt.l();
                    }
                    g5.a.a(this.delegate, "BEGIN EXCLUSIVE TRANSACTION");
                }
            } else {
                g5.a.a(this.delegate, "SAVEPOINT '" + size + '\'');
            }
            this.transactionStack.addLast(new c(size, false));
            Unit unit = Unit.f21506a;
            aVar2.f(null);
            return unit;
        } catch (Throwable th2) {
            aVar2.f(null);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(boolean z10, eu.b<? super Unit> bVar) {
        f fVar;
        kv.a aVar;
        if (bVar instanceof f) {
            fVar = (f) bVar;
            int i10 = fVar.f229x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f229x = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(bVar);
            }
        } else {
            fVar = new f(bVar);
        }
        Object obj = fVar.f227v;
        Object objE = fu.c.e();
        int i11 = fVar.f229x;
        if (i11 == 0) {
            zt.o.b(obj);
            j jVar = this.delegate;
            fVar.f226u = jVar;
            fVar.f225t = z10;
            fVar.f229x = 1;
            if (jVar.d(null, fVar) == objE) {
                return objE;
            }
            aVar = jVar;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = fVar.f225t;
            aVar = (kv.a) fVar.f226u;
            zt.o.b(obj);
        }
        try {
            if (this.transactionStack.isEmpty()) {
                throw new IllegalStateException("Not in a transaction");
            }
            c cVar = (c) u.H(this.transactionStack);
            if (!z10 || cVar.getShouldRollback()) {
                if (this.transactionStack.isEmpty()) {
                    g5.a.a(this.delegate, "ROLLBACK TRANSACTION");
                } else {
                    g5.a.a(this.delegate, "ROLLBACK TRANSACTION TO SAVEPOINT '" + cVar.getId() + '\'');
                }
            } else if (this.transactionStack.isEmpty()) {
                g5.a.a(this.delegate, "END TRANSACTION");
            } else {
                g5.a.a(this.delegate, "RELEASE SAVEPOINT '" + cVar.getId() + '\'');
            }
            Unit unit = Unit.f21506a;
            aVar.f(null);
            return unit;
        } catch (Throwable th2) {
            aVar.f(null);
            throw th2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final a5.b getConnectionElementKey() {
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
        if (this.delegate.G()) {
            g5.a.a(this.delegate, "ROLLBACK TRANSACTION");
        }
    }
}
