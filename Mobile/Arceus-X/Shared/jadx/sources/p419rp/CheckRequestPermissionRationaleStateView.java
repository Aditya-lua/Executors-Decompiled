package p419rp;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: rp.i, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, m31665d2 = {"Lrp/i;", "", "Lrp/i0;", "permission", "", "isPermanentPermissionRejectionCheck", "Lkotlin/Function1;", "", "callback", "<init>", "(Lrp/i0;ZLkotlin/jvm/functions/Function1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lrp/i0;", "b", "()Lrp/i0;", "Z", "c", "()Z", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class CheckRequestPermissionRationaleStateView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final EnumC11024i0 permission;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean isPermanentPermissionRejectionCheck;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    public final Function1<Boolean, Unit> callback;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public CheckRequestPermissionRationaleStateView(@NotNull EnumC11024i0 permission, boolean z10, @Nullable Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        this.permission = permission;
        this.isPermanentPermissionRejectionCheck = z10;
        this.callback = function1;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Function1<Boolean, Unit> m41722a() {
        return this.callback;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC11024i0 getPermission() {
        return this.permission;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsPermanentPermissionRejectionCheck() {
        return this.isPermanentPermissionRejectionCheck;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckRequestPermissionRationaleStateView)) {
            return false;
        }
        CheckRequestPermissionRationaleStateView checkRequestPermissionRationaleStateView = (CheckRequestPermissionRationaleStateView) other;
        return this.permission == checkRequestPermissionRationaleStateView.permission && this.isPermanentPermissionRejectionCheck == checkRequestPermissionRationaleStateView.isPermanentPermissionRejectionCheck && Intrinsics.m31980c(this.callback, checkRequestPermissionRationaleStateView.callback);
    }

    public int hashCode() {
        int iHashCode = ((this.permission.hashCode() * 31) + Boolean.hashCode(this.isPermanentPermissionRejectionCheck)) * 31;
        Function1<Boolean, Unit> function1 = this.callback;
        return iHashCode + (function1 == null ? 0 : function1.hashCode());
    }

    @NotNull
    public String toString() {
        return "CheckRequestPermissionRationaleStateView(permission=" + this.permission + ", isPermanentPermissionRejectionCheck=" + this.isPermanentPermissionRejectionCheck + ", callback=" + this.callback + ")";
    }
}
