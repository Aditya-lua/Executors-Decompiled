package p109en;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: en.d, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m31665d2 = {"Len/d;", "", "B", "Len/f;", "Len/e;", "beneathModals", "", "modals", "<init>", "(Ljava/lang/Object;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "c", "Ljava/util/List;", "a", "()Ljava/util/List;", "wf1-container-common"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public final /* data */ class AlertContainerScreen<B> implements InterfaceC5169f<B, AlertScreen> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final B beneathModals;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final List<AlertScreen> modals;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AlertContainerScreen(@NotNull B beneathModals, @NotNull List<AlertScreen> modals) {
        Intrinsics.checkNotNullParameter(beneathModals, "beneathModals");
        Intrinsics.checkNotNullParameter(modals, "modals");
        this.beneathModals = beneathModals;
        this.modals = modals;
    }

    @Override // p109en.InterfaceC5169f
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<AlertScreen> mo24033a() {
        return this.modals;
    }

    @Override // p109en.InterfaceC5169f
    @NotNull
    /* JADX INFO: renamed from: b */
    public B mo24034b() {
        return this.beneathModals;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlertContainerScreen)) {
            return false;
        }
        AlertContainerScreen alertContainerScreen = (AlertContainerScreen) other;
        return Intrinsics.m31980c(mo24034b(), alertContainerScreen.mo24034b()) && Intrinsics.m31980c(mo24033a(), alertContainerScreen.mo24033a());
    }

    public int hashCode() {
        return (mo24034b().hashCode() * 31) + mo24033a().hashCode();
    }

    @NotNull
    public String toString() {
        return "AlertContainerScreen(beneathModals=" + mo24034b() + ", modals=" + mo24033a() + ')';
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
      (r1v0 java.lang.Object)
      (wrap java.util.List:?: TERNARY null = ((wrap int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap java.util.List:0x0004: INVOKE  STATIC call: kotlin.collections.p.k():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:4)) : (r2v0 java.util.List))
     A[MD:(B, java.util.List<en.e>):void (m)] (LINE:5) call: en.d.<init>(java.lang.Object, java.util.List):void type: THIS */
    public /* synthetic */ AlertContainerScreen(Object obj, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i10 & 2) != 0 ? C7699p.m31892k() : list);
    }
}
