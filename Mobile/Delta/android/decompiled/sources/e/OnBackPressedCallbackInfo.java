package e;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: e.n0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Le/n0;", "Lo4/g;", "Le/m0;", "callback", "Landroidx/lifecycle/s;", "owner", "<init>", "(Le/m0;Landroidx/lifecycle/s;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Le/m0;", "getCallback", "()Le/m0;", "b", "Landroidx/lifecycle/s;", "getOwner", "()Landroidx/lifecycle/s;", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OnBackPressedCallbackInfo extends o4.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final m0 callback;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final androidx.p000lifecycle.s owner;

    public OnBackPressedCallbackInfo(@NotNull m0 callback, @Nullable androidx.p000lifecycle.s sVar) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callback = callback;
        this.owner = sVar;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnBackPressedCallbackInfo)) {
            return false;
        }
        OnBackPressedCallbackInfo onBackPressedCallbackInfo = (OnBackPressedCallbackInfo) other;
        return Intrinsics.c(this.callback, onBackPressedCallbackInfo.callback) && Intrinsics.c(this.owner, onBackPressedCallbackInfo.owner);
    }

    public int hashCode() {
        int iHashCode = this.callback.hashCode() * 31;
        androidx.p000lifecycle.s sVar = this.owner;
        return iHashCode + (sVar == null ? 0 : sVar.hashCode());
    }

    @NotNull
    public String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.callback + ", owner=" + this.owner + ')';
    }

    public /* synthetic */ OnBackPressedCallbackInfo(m0 m0Var, androidx.p000lifecycle.s sVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(m0Var, (i10 & 2) != 0 ? null : sVar);
    }
}
