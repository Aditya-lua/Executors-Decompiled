package p566y4;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7334d;

/* JADX INFO: renamed from: y4.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u00060\u0011j\u0002`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017¨\u0006\u001a"}, m31665d2 = {"Ly4/b;", "", "", "filename", "", "useFileLock", "<init>", "(Ljava/lang/String;Z)V", "T", "Lkotlin/Function0;", "onLocked", "Lkotlin/Function1;", "", "", "onLockError", "b", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/ReentrantLock;", "a", "Ljava/util/concurrent/locks/ReentrantLock;", "threadLock", "Ly4/c;", "Ly4/c;", "fileLock", "c", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C13028b {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Map<String, ReentrantLock> f46155d = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ReentrantLock threadLock;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final C13029c fileLock;

    /* JADX INFO: renamed from: y4.b$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u00060\u0007j\u0002`\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"Ly4/b$a;", "", "Landroidx/room/concurrent/SynchronizedObject;", "<init>", "()V", "", "key", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/ReentrantLock;", "d", "(Ljava/lang/String;)Ljava/util/concurrent/locks/ReentrantLock;", "Ly4/c;", "c", "(Ljava/lang/String;)Ly4/c;", "", "threadLocksMap", "Ljava/util/Map;", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: y4.b.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public final C13029c m48541c(String key) {
            return new C13029c(key);
        }

        /* JADX INFO: renamed from: d */
        public final ReentrantLock m48542d(String key) {
            ReentrantLock reentrantLock;
            synchronized (this) {
                try {
                    Map map = C13028b.f46155d;
                    Object reentrantLock2 = map.get(key);
                    if (reentrantLock2 == null) {
                        reentrantLock2 = new ReentrantLock();
                        map.put(key, reentrantLock2);
                    }
                    reentrantLock = (ReentrantLock) reentrantLock2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return reentrantLock;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    public C13028b(@NotNull String filename, boolean z10) {
        Intrinsics.checkNotNullParameter(filename, "filename");
        Companion companion = INSTANCE;
        this.threadLock = companion.m48542d(filename);
        this.fileLock = z10 ? companion.m48541c(filename) : null;
    }

    /* JADX INFO: renamed from: b */
    public final <T> T m48538b(@NotNull Function0<? extends T> onLocked, @NotNull Function1 onLockError) {
        Intrinsics.checkNotNullParameter(onLocked, "onLocked");
        Intrinsics.checkNotNullParameter(onLockError, "onLockError");
        this.threadLock.lock();
        boolean z10 = false;
        try {
            C13029c c13029c = this.fileLock;
            if (c13029c != null) {
                c13029c.m48543a();
            }
            z10 = true;
            try {
                T tInvoke = onLocked.invoke();
                C13029c c13029c2 = this.fileLock;
                if (c13029c2 != null) {
                    c13029c2.m48544b();
                }
                this.threadLock.unlock();
                return tInvoke;
            } catch (Throwable th2) {
                C13029c c13029c3 = this.fileLock;
                if (c13029c3 != null) {
                    c13029c3.m48544b();
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                if (z10) {
                    throw th3;
                }
                onLockError.invoke(th3);
                throw new C7334d();
            } catch (Throwable th4) {
                this.threadLock.unlock();
                throw th4;
            }
        }
    }
}
