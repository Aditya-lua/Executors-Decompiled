package p016an;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p256ku.InterfaceC7850d2;

/* JADX INFO: renamed from: an.v */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lan/v;", "", "Lan/r;", "controller", "Lku/d2;", "subscription", "<init>", "(Lan/r;Lku/d2;)V", "a", "Lan/r;", "()Lan/r;", "b", "Lku/d2;", "()Lku/d2;", "wf1-core-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C0393v {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC0389r controller;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7850d2 subscription;

    public C0393v(@NotNull InterfaceC0389r controller, @NotNull InterfaceC7850d2 subscription) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.controller = controller;
        this.subscription = subscription;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC0389r getController() {
        return this.controller;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final InterfaceC7850d2 getSubscription() {
        return this.subscription;
    }
}
