package p535x4;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7691l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;

/* JADX INFO: renamed from: x4.k */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0014\u001a\u00060\u0010j\u0002`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010!\u001a\u00060\u0010j\u0002`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0013R\u0016\u0010#\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001e¨\u0006$"}, m31665d2 = {"Lx4/k;", "", "", "size", "<init>", "(I)V", "", "tableIds", "", "i", "([I)Z", "j", "", "k", "()V", "h", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/ReentrantLock;", "a", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "", "b", "[J", "tableObserversCount", "", "c", "[Z", "tableObservedState", "d", "Z", "needsSync", "e", "onSyncLock", "f", "inProgressSync", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C12670k {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final long[] tableObserversCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final boolean[] tableObservedState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public volatile boolean needsSync;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public volatile boolean inProgressSync;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ReentrantLock lock = new ReentrantLock();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final ReentrantLock onSyncLock = new ReentrantLock();

    /* JADX INFO: renamed from: x4.k$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m31665d2 = {"Lx4/k$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public enum a {
        NO_OP,
        ADD,
        REMOVE;


        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ InterfaceC10707a f45045e = C10708b.m40805a(m47191a());
    }

    public C12670k(int i10) {
        this.tableObserversCount = new long[i10];
        this.tableObservedState = new boolean[i10];
    }

    /* JADX INFO: renamed from: h */
    public final void m47187h() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.needsSync = true;
            Unit unit = Unit.f29331a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m47188i(@NotNull int[] tableIds) {
        Intrinsics.checkNotNullParameter(tableIds, "tableIds");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean z10 = false;
            for (int i10 : tableIds) {
                long[] jArr = this.tableObserversCount;
                long j10 = jArr[i10];
                jArr[i10] = 1 + j10;
                if (j10 == 0) {
                    this.needsSync = true;
                    z10 = true;
                }
            }
            return z10 || this.needsSync || this.inProgressSync;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m47189j(@NotNull int[] tableIds) {
        Intrinsics.checkNotNullParameter(tableIds, "tableIds");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            boolean z10 = false;
            for (int i10 : tableIds) {
                long[] jArr = this.tableObserversCount;
                long j10 = jArr[i10];
                jArr[i10] = j10 - 1;
                if (j10 == 1) {
                    this.needsSync = true;
                    z10 = true;
                }
            }
            return z10 || this.needsSync || this.inProgressSync;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m47190k() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            C7691l.m31826u(this.tableObservedState, false, 0, 0, 6, null);
            this.needsSync = true;
            Unit unit = Unit.f29331a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
