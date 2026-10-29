package com.roblox.universalapp.ads;

import java.util.function.BiConsumer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import th.h;
import tl.a;
import tl.c;
import tl.e;
import tl.f;
import ul.GetQueryInfoError;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u001dB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/roblox/universalapp/ads/NoopGmaSdkController;", "Ltl/a;", "", "unavailableReason", "<init>", "(Ljava/lang/String;)V", "experimentVariant", "Ljava/util/function/BiConsumer;", "", "callback", "", "b", "(Ljava/lang/String;Ljava/util/function/BiConsumer;)V", "destroy", "()V", "adTracingId", "adUnitId", "Ltl/e;", "listener", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltl/e;)V", "Lorg/json/JSONObject;", "params", "Ltl/c;", "e", "(Ljava/lang/String;Lorg/json/JSONObject;Ltl/c;)V", "Ltl/f;", "d", "(Ljava/lang/String;Ltl/f;)V", "a", "Ljava/lang/String;", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NoopGmaSdkController implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String unavailableReason;

    /* JADX WARN: Multi-variable type inference failed */
    public NoopGmaSdkController() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // tl.a
    public void a() {
    }

    @Override // tl.a
    public void b(@NotNull String experimentVariant, @NotNull BiConsumer<Boolean, String> callback) {
        Intrinsics.checkNotNullParameter(experimentVariant, "experimentVariant");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.accept(Boolean.FALSE, "GMA SDK controller unavailable");
    }

    @Override // tl.a
    public void c(@NotNull String adTracingId, @NotNull String adUnitId, @NotNull String experimentVariant, @NotNull e listener) {
        Intrinsics.checkNotNullParameter(adTracingId, "adTracingId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(experimentVariant, "experimentVariant");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (h.a().I3()) {
            listener.a(new GetQueryInfoError(this.unavailableReason));
        } else {
            listener.onSuccess("");
        }
    }

    @Override // tl.a
    public void d(@NotNull String adTracingId, @NotNull f listener) {
        Intrinsics.checkNotNullParameter(adTracingId, "adTracingId");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // tl.a
    public void destroy() {
    }

    @Override // tl.a
    public void e(@NotNull String adTracingId, @NotNull JSONObject params, @NotNull c listener) {
        Intrinsics.checkNotNullParameter(adTracingId, "adTracingId");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(listener, "listener");
        listener.onFailure("GMA SDK controller unavailable");
    }

    public NoopGmaSdkController(@NotNull String unavailableReason) {
        Intrinsics.checkNotNullParameter(unavailableReason, "unavailableReason");
        this.unavailableReason = unavailableReason;
    }

    public /* synthetic */ NoopGmaSdkController(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "MODULE_NOT_INSTALLED" : str);
    }
}
