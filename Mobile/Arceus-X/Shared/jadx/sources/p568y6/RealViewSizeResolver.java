package p568y6;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: y6.e, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m31665d2 = {"Ly6/e;", "Landroid/view/View;", "T", "Ly6/k;", "view", "", "subtractPadding", "<init>", "(Landroid/view/View;Z)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "c", "Landroid/view/View;", "getView", "()Landroid/view/View;", "d", "Z", "f", "()Z", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class RealViewSizeResolver<T extends View> implements InterfaceC13112k<T> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final T view;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final boolean subtractPadding;

    public RealViewSizeResolver(@NotNull T t8, boolean z10) {
        this.view = t8;
        this.subtractPadding = z10;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RealViewSizeResolver)) {
            return false;
        }
        RealViewSizeResolver realViewSizeResolver = (RealViewSizeResolver) other;
        return Intrinsics.m31980c(this.view, realViewSizeResolver.view) && this.subtractPadding == realViewSizeResolver.subtractPadding;
    }

    @Override // p568y6.InterfaceC13112k
    /* JADX INFO: renamed from: f, reason: from getter */
    public boolean getSubtractPadding() {
        return this.subtractPadding;
    }

    @Override // p568y6.InterfaceC13112k
    @NotNull
    public T getView() {
        return this.view;
    }

    public int hashCode() {
        return (this.view.hashCode() * 31) + Boolean.hashCode(this.subtractPadding);
    }

    @NotNull
    public String toString() {
        return "RealViewSizeResolver(view=" + this.view + ", subtractPadding=" + this.subtractPadding + ')';
    }
}
