package p146g6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p536x5.AbstractC12732w;
import p567y5.C13085s;
import p567y5.C13098y;

/* JADX INFO: renamed from: g6.z */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m31665d2 = {"Lg6/z;", "Ljava/lang/Runnable;", "Ly5/s;", "processor", "Ly5/y;", "token", "", "stopInForeground", "", "reason", "<init>", "(Ly5/s;Ly5/y;ZI)V", "", "run", "()V", "a", "Ly5/s;", "b", "Ly5/y;", "c", "Z", "d", "I", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class RunnableC6046z implements Runnable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C13085s processor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C13098y token;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean stopInForeground;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int reason;

    public RunnableC6046z(@NotNull C13085s processor, @NotNull C13098y token, boolean z10, int i10) {
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(token, "token");
        this.processor = processor;
        this.token = token;
        this.stopInForeground = z10;
        this.reason = i10;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zM48675r = this.stopInForeground ? this.processor.m48675r(this.token, this.reason) : this.processor.m48676s(this.token, this.reason);
        AbstractC12732w.m47441e().mo47444a(AbstractC12732w.m47443i("StopWorkRunnable"), "StopWorkRunnable for " + this.token.getId().getWorkSpecId() + "; Processor.stopWork = " + zM48675r);
    }
}
