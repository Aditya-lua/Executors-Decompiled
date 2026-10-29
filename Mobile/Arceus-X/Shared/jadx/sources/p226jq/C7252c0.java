package p226jq;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p420rq.C11069c;
import p420rq.InterfaceC11067a;
import p498vq.C12247a;

/* JADX INFO: renamed from: jq.c0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014¨\u0006\u0015"}, m31665d2 = {"Ljq/c0;", "", "", "controlNavigationBar", "controlStatusBar", "<init>", "(ZZ)V", "Lrq/c;", "imageHelper", "Lrq/a;", "b", "(Lrq/c;)Lrq/a;", "Ljq/x;", "fileHelper", "Ljq/k;", "a", "(Ljq/x;)Ljq/k;", "Lvq/a;", "c", "()Lvq/a;", "Z", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7252c0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean controlNavigationBar;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean controlStatusBar;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public C7252c0() {
        boolean z10 = false;
        this(z10, z10, 3, null);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final InterfaceC7267k m30223a(@NotNull C7286x fileHelper) {
        Intrinsics.checkNotNullParameter(fileHelper, "fileHelper");
        return fileHelper;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final InterfaceC11067a m30224b(@NotNull C11069c imageHelper) {
        Intrinsics.checkNotNullParameter(imageHelper, "imageHelper");
        return imageHelper;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final C12247a m30225c() {
        return new C12247a(this.controlNavigationBar, this.controlStatusBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C7252c0(boolean z10, boolean z11) {
        this.controlNavigationBar = z10;
        this.controlStatusBar = z11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
      (wrap boolean:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
      (wrap boolean:?: TERNARY null = ((wrap int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r3v0 boolean))
     A[MD:(boolean, boolean):void (m)] (LINE:5) call: jq.c0.<init>(boolean, boolean):void type: THIS */
    public /* synthetic */ C7252c0(boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11);
    }
}
