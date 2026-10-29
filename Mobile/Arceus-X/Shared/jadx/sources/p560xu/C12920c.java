package p560xu;

import com.appsflyer.sdk_base.referrer.Payload;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7745l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xu.c */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\b\u0016\u0018\u0000 ,2\u00020\u0001:\u0002-.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0003J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0001¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0014¢\u0006\u0004\b\"\u0010!R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020#8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b&\u0010%R$\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020\n8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006/"}, m31665d2 = {"Lxu/c;", "Lxu/s0;", "<init>", "()V", "", "enter", "", "exit", "()Z", "cancel", "", "now", "remainingNanos$okio", "(J)J", "remainingNanos", "setTimeoutAt$okio", "(J)V", "setTimeoutAt", "timedOut", "Lxu/p0;", "sink", "(Lxu/p0;)Lxu/p0;", "Lxu/r0;", Payload.SOURCE, "(Lxu/r0;)Lxu/r0;", "T", "Lkotlin/Function0;", "block", "withTimeout", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Ljava/io/IOException;", "cause", "access$newTimeoutException", "(Ljava/io/IOException;)Ljava/io/IOException;", "newTimeoutException", "", "state", "I", "index", "value", "timeoutAt", "J", "getTimeoutAt$okio", "()J", "Companion", "b", "a", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public class C12920c extends C12953s0 {
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int STATE_CANCELED = 3;
    private static final int STATE_IDLE = 0;
    private static final int STATE_IN_QUEUE = 1;
    private static final int STATE_TIMED_OUT = 2;
    private static final int TIMEOUT_WRITE_SIZE = 65536;

    @NotNull
    private static final Condition condition;

    @Nullable
    private static C12920c idleSentinel;

    @NotNull
    private static final ReentrantLock lock;
    public int index = -1;
    private int state;
    private long timeoutAt;

    @NotNull
    private static final a Companion = new a(null);

    @NotNull
    private static final C12935j0 queue = new C12935j0();

    /* JADX INFO: renamed from: xu.c$a */
    @Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\nR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010 R\u0014\u0010&\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010 R\u0014\u0010'\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010 R\u0014\u0010(\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010 ¨\u0006)"}, m31665d2 = {"Lxu/c$a;", "", "<init>", "()V", "Lxu/c;", "b", "()Lxu/c;", "node", "", "g", "(Lxu/c;)V", "Lxu/j0;", "queue", "Lxu/j0;", "f", "()Lxu/j0;", "idleSentinel", "Lxu/c;", "d", "h", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "e", "()Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/Condition;", "condition", "Ljava/util/concurrent/locks/Condition;", "c", "()Ljava/util/concurrent/locks/Condition;", "", "TIMEOUT_WRITE_SIZE", "I", "", "IDLE_TIMEOUT_MILLIS", "J", "IDLE_TIMEOUT_NANOS", "STATE_IDLE", "STATE_IN_QUEUE", "STATE_TIMED_OUT", "STATE_CANCELED", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: xu.c.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public final C12920c m47970b() throws InterruptedException {
            C12920c c12920cM48153b = m47974f().m48153b();
            if (c12920cM48153b == null) {
                long jNanoTime = System.nanoTime();
                m47971c().await(C12920c.IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
                if (m47974f().m48153b() != null || System.nanoTime() - jNanoTime < C12920c.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return m47972d();
            }
            long jRemainingNanos$okio = c12920cM48153b.remainingNanos$okio(System.nanoTime());
            if (jRemainingNanos$okio > 0) {
                m47971c().await(jRemainingNanos$okio, TimeUnit.NANOSECONDS);
                return null;
            }
            m47974f().m48156e(c12920cM48153b);
            c12920cM48153b.state = 2;
            return c12920cM48153b;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final Condition m47971c() {
            return C12920c.condition;
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public final C12920c m47972d() {
            return C12920c.idleSentinel;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final ReentrantLock m47973e() {
            return C12920c.lock;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final C12935j0 m47974f() {
            return C12920c.queue;
        }

        /* JADX INFO: renamed from: g */
        public final void m47975g(C12920c node) {
            if (m47972d() == null) {
                m47976h(new C12920c());
                new b().start();
            }
            C12920c.setTimeoutAt$okio$default(node, 0L, 1, null);
            m47974f().m48152a(node);
            if (node.index == 1) {
                m47971c().signal();
            }
        }

        /* JADX INFO: renamed from: h */
        public final void m47976h(@Nullable C12920c c12920c) {
            C12920c.idleSentinel = c12920c;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public a() {
        }
    }

    /* JADX INFO: renamed from: xu.c$b */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, m31665d2 = {"Lxu/c$b;", "Ljava/lang/Thread;", "<init>", "()V", "", "run", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    ReentrantLock reentrantLockM47973e = C12920c.Companion.m47973e();
                    reentrantLockM47973e.lock();
                    try {
                        C12920c c12920cM47970b = C12920c.Companion.m47970b();
                        if (c12920cM47970b == C12920c.Companion.m47972d()) {
                            C12920c.Companion.m47976h(null);
                            reentrantLockM47973e.unlock();
                            return;
                        } else {
                            Unit unit = Unit.f29331a;
                            reentrantLockM47973e.unlock();
                            if (c12920cM47970b != null) {
                                c12920cM47970b.timedOut();
                            }
                        }
                    } catch (Throwable th2) {
                        reentrantLockM47973e.unlock();
                        throw th2;
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: xu.c$c */
    @Metadata(m31664d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m31665d2 = {"xu/c$c", "Lxu/p0;", "Lxu/e;", Payload.SOURCE, "", "byteCount", "", "write", "(Lxu/e;J)V", "flush", "()V", "close", "Lxu/c;", "a", "()Lxu/c;", "", "toString", "()Ljava/lang/String;", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class c implements InterfaceC12947p0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC12947p0 f45810b;

        public c(InterfaceC12947p0 interfaceC12947p0) {
            this.f45810b = interfaceC12947p0;
        }

        /* JADX DEBUG: Method merged with bridge method: timeout()Lxu/s0; */
        @Override // p560xu.InterfaceC12947p0
        /* JADX INFO: renamed from: a, reason: from getter and merged with bridge method [inline-methods] */
        public C12920c timeout() {
            return C12920c.this;
        }

        @Override // p560xu.InterfaceC12947p0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C12920c c12920c = C12920c.this;
            InterfaceC12947p0 interfaceC12947p0 = this.f45810b;
            c12920c.enter();
            try {
                try {
                    interfaceC12947p0.close();
                    Unit unit = Unit.f29331a;
                    if (c12920c.exit()) {
                        throw c12920c.access$newTimeoutException(null);
                    }
                } catch (IOException e10) {
                    if (!c12920c.exit()) {
                        throw e10;
                    }
                    throw c12920c.access$newTimeoutException(e10);
                }
            } catch (Throwable th2) {
                c12920c.exit();
                throw th2;
            }
        }

        @Override // p560xu.InterfaceC12947p0, java.io.Flushable
        public void flush() throws IOException {
            C12920c c12920c = C12920c.this;
            InterfaceC12947p0 interfaceC12947p0 = this.f45810b;
            c12920c.enter();
            try {
                try {
                    interfaceC12947p0.flush();
                    Unit unit = Unit.f29331a;
                    if (c12920c.exit()) {
                        throw c12920c.access$newTimeoutException(null);
                    }
                } catch (IOException e10) {
                    if (!c12920c.exit()) {
                        throw e10;
                    }
                    throw c12920c.access$newTimeoutException(e10);
                }
            } catch (Throwable th2) {
                c12920c.exit();
                throw th2;
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f45810b + ')';
        }

        @Override // p560xu.InterfaceC12947p0
        public void write(C12924e source, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            C12918b.m47948b(source.getSize(), 0L, byteCount);
            while (true) {
                long j10 = 0;
                if (byteCount <= 0) {
                    return;
                }
                C12941m0 c12941m0 = source.head;
                Intrinsics.checkNotNull(c12941m0);
                while (j10 < 65536) {
                    j10 += (long) (c12941m0.limit - c12941m0.pos);
                    if (j10 >= byteCount) {
                        j10 = byteCount;
                        break;
                    } else {
                        c12941m0 = c12941m0.next;
                        Intrinsics.checkNotNull(c12941m0);
                    }
                }
                C12920c c12920c = C12920c.this;
                InterfaceC12947p0 interfaceC12947p0 = this.f45810b;
                c12920c.enter();
                try {
                    try {
                        interfaceC12947p0.write(source, j10);
                        Unit unit = Unit.f29331a;
                        if (c12920c.exit()) {
                            throw c12920c.access$newTimeoutException(null);
                        }
                        byteCount -= j10;
                    } catch (IOException e10) {
                        if (!c12920c.exit()) {
                            throw e10;
                        }
                        throw c12920c.access$newTimeoutException(e10);
                    }
                } catch (Throwable th2) {
                    c12920c.exit();
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: xu.c$d */
    @Metadata(m31664d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"xu/c$d", "Lxu/r0;", "Lxu/e;", "sink", "", "byteCount", "read", "(Lxu/e;J)J", "", "close", "()V", "Lxu/c;", "a", "()Lxu/c;", "", "toString", "()Ljava/lang/String;", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class d implements InterfaceC12951r0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC12951r0 f45812b;

        public d(InterfaceC12951r0 interfaceC12951r0) {
            this.f45812b = interfaceC12951r0;
        }

        /* JADX DEBUG: Method merged with bridge method: timeout()Lxu/s0; */
        @Override // p560xu.InterfaceC12951r0
        /* JADX INFO: renamed from: a, reason: from getter and merged with bridge method [inline-methods] */
        public C12920c timeout() {
            return C12920c.this;
        }

        @Override // p560xu.InterfaceC12951r0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            C12920c c12920c = C12920c.this;
            InterfaceC12951r0 interfaceC12951r0 = this.f45812b;
            c12920c.enter();
            try {
                try {
                    interfaceC12951r0.close();
                    Unit unit = Unit.f29331a;
                    if (c12920c.exit()) {
                        throw c12920c.access$newTimeoutException(null);
                    }
                } catch (IOException e10) {
                    if (!c12920c.exit()) {
                        throw e10;
                    }
                    throw c12920c.access$newTimeoutException(e10);
                }
            } catch (Throwable th2) {
                c12920c.exit();
                throw th2;
            }
        }

        @Override // p560xu.InterfaceC12951r0
        public long read(C12924e sink, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            C12920c c12920c = C12920c.this;
            InterfaceC12951r0 interfaceC12951r0 = this.f45812b;
            c12920c.enter();
            try {
                try {
                    long j10 = interfaceC12951r0.read(sink, byteCount);
                    if (c12920c.exit()) {
                        throw c12920c.access$newTimeoutException(null);
                    }
                    return j10;
                } catch (IOException e10) {
                    if (c12920c.exit()) {
                        throw c12920c.access$newTimeoutException(e10);
                    }
                    throw e10;
                }
            } catch (Throwable th2) {
                c12920c.exit();
                throw th2;
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f45812b + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(conditionNewCondition, "newCondition(...)");
        condition = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public static /* synthetic */ void setTimeoutAt$okio$default(C12920c c12920c, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTimeoutAt");
        }
        if ((i10 & 1) != 0) {
            j10 = System.nanoTime();
        }
        c12920c.setTimeoutAt$okio(j10);
    }

    @NotNull
    public final IOException access$newTimeoutException(@Nullable IOException cause) {
        return newTimeoutException(cause);
    }

    @Override // p560xu.C12953s0
    public void cancel() {
        super.cancel();
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (this.state == 1) {
                queue.m48156e(this);
                this.state = 3;
            }
            Unit unit = Unit.f29331a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void enter() {
        long timeoutNanos = getTimeoutNanos();
        boolean hasDeadline = getHasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            ReentrantLock reentrantLock = lock;
            reentrantLock.lock();
            try {
                if (this.state != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.state = 1;
                Companion.m47975g(this);
                Unit unit = Unit.f29331a;
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    public final boolean exit() {
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            int i10 = this.state;
            this.state = 0;
            if (i10 != 1) {
                return i10 == 2;
            }
            queue.m48156e(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: getTimeoutAt$okio, reason: from getter */
    public final long getTimeoutAt() {
        return this.timeoutAt;
    }

    @NotNull
    public IOException newTimeoutException(@Nullable IOException cause) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    public final long remainingNanos$okio(long now) {
        return this.timeoutAt - now;
    }

    public final void setTimeoutAt$okio(long now) {
        long timeoutNanos = getTimeoutNanos();
        boolean hasDeadline = getHasDeadline();
        if (getTimeoutNanos() != 0 && getHasDeadline()) {
            this.timeoutAt = now + Math.min(timeoutNanos, deadlineNanoTime() - now);
        } else if (timeoutNanos != 0) {
            this.timeoutAt = now + timeoutNanos;
        } else {
            if (!hasDeadline) {
                throw new AssertionError();
            }
            this.timeoutAt = deadlineNanoTime();
        }
    }

    @NotNull
    public final InterfaceC12947p0 sink(@NotNull InterfaceC12947p0 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return new c(sink);
    }

    @NotNull
    public final InterfaceC12951r0 source(@NotNull InterfaceC12951r0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new d(source);
    }

    public void timedOut() {
    }

    public final <T> T withTimeout(@NotNull Function0<? extends T> block) throws IOException {
        Intrinsics.checkNotNullParameter(block, "block");
        enter();
        try {
            try {
                T tInvoke = block.invoke();
                C7745l.m32060b(1);
                if (exit()) {
                    throw access$newTimeoutException(null);
                }
                C7745l.m32059a(1);
                return tInvoke;
            } catch (IOException e10) {
                if (exit()) {
                    throw access$newTimeoutException(e10);
                }
                throw e10;
            }
        } catch (Throwable th2) {
            C7745l.m32060b(1);
            exit();
            C7745l.m32059a(1);
            throw th2;
        }
    }
}
