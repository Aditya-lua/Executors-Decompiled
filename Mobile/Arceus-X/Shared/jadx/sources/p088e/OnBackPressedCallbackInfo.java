package p088e;

import androidx.p616lifecycle.InterfaceC0980s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p321o4.AbstractC9639g;

/* JADX INFO: renamed from: e.n0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m31665d2 = {"Le/n0;", "Lo4/g;", "Le/m0;", "callback", "Landroidx/lifecycle/s;", "owner", "<init>", "(Le/m0;Landroidx/lifecycle/s;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Le/m0;", "getCallback", "()Le/m0;", "b", "Landroidx/lifecycle/s;", "getOwner", "()Landroidx/lifecycle/s;", "activity"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final /* data */ class OnBackPressedCallbackInfo extends AbstractC9639g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final AbstractC4717m0 callback;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final InterfaceC0980s owner;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public OnBackPressedCallbackInfo(@NotNull AbstractC4717m0 callback, @Nullable InterfaceC0980s interfaceC0980s) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callback = callback;
        this.owner = interfaceC0980s;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnBackPressedCallbackInfo)) {
            return false;
        }
        OnBackPressedCallbackInfo onBackPressedCallbackInfo = (OnBackPressedCallbackInfo) other;
        return Intrinsics.m31980c(this.callback, onBackPressedCallbackInfo.callback) && Intrinsics.m31980c(this.owner, onBackPressedCallbackInfo.owner);
    }

    public int hashCode() {
        int iHashCode = this.callback.hashCode() * 31;
        InterfaceC0980s interfaceC0980s = this.owner;
        return iHashCode + (interfaceC0980s == null ? 0 : interfaceC0980s.hashCode());
    }

    @NotNull
    public String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.callback + ", owner=" + this.owner + ')';
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
      (r1v0 e.m0)
      (wrap androidx.lifecycle.s:?: TERNARY null = ((wrap int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null androidx.lifecycle.s) : (r2v0 androidx.lifecycle.s))
     A[MD:(e.m0, androidx.lifecycle.s):void (m)] (LINE:4) call: e.n0.<init>(e.m0, androidx.lifecycle.s):void type: THIS */
    public /* synthetic */ OnBackPressedCallbackInfo(AbstractC4717m0 abstractC4717m0, InterfaceC0980s interfaceC0980s, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC4717m0, (i10 & 2) != 0 ? null : interfaceC0980s);
    }
}
