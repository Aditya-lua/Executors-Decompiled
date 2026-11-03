package com.roblox.universalapp.ads;

import gt.n;
import gt.o;
import java.util.function.BiConsumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lt.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import rl.a;
import rl.c;
import rl.e;
import rl.f;
import rl.g;
import rl.j;
import rl.k;
import sl.GetQueryInfoError;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001'B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\nH\u0017¢\u0006\u0004\b\u001d\u0010\u000eJX\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\"2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022(\u0010$\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\"0!\u0012\u0006\u0012\u0004\u0018\u00010#0 H\u0096@¢\u0006\u0004\b%\u0010&J \u0010'\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010)¨\u0006*"}, d2 = {"Lcom/roblox/universalapp/ads/NoopGmaSdkController;", "Lrl/c;", "", "unavailableReason", "<init>", "(Ljava/lang/String;)V", "experimentVariant", "Ljava/util/function/BiConsumer;", "", "callback", "", "g", "(Ljava/lang/String;Ljava/util/function/BiConsumer;)V", "destroy", "()V", "adTracingId", "adUnitId", "Lrl/j;", "listener", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrl/j;)V", "Lorg/json/JSONObject;", "params", "Lrl/f;", "f", "(Ljava/lang/String;Lorg/json/JSONObject;Lrl/f;)V", "Lrl/k;", "b", "(Ljava/lang/String;Lrl/k;)V", "d", "Lrl/a;", "adFormat", "Lkotlin/Function2;", "Llt/b;", "Lgt/n;", "", "serveAd", "j", "(Lrl/a;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Llt/b;)Ljava/lang/Object;", "a", "(Lrl/a;Ljava/lang/String;Llt/b;)Ljava/lang/Object;", "Ljava/lang/String;", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NoopGmaSdkController implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String unavailableReason;

    /* JADX WARN: Multi-variable type inference failed */
    public NoopGmaSdkController() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // rl.c
    @Nullable
    public Object a(@NotNull a aVar, @NotNull String str, @NotNull b<? super Unit> bVar) {
        return Unit.f22938a;
    }

    @Override // rl.c
    public void b(@NotNull String adTracingId, @NotNull k listener) {
        Intrinsics.checkNotNullParameter(adTracingId, "adTracingId");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // rl.c
    public void d() {
    }

    @Override // rl.c
    public void destroy() {
    }

    @Override // rl.c
    public void e(@NotNull String adTracingId, @NotNull String adUnitId, @NotNull String experimentVariant, @NotNull j listener) {
        Intrinsics.checkNotNullParameter(adTracingId, "adTracingId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(experimentVariant, "experimentVariant");
        Intrinsics.checkNotNullParameter(listener, "listener");
        listener.a(new GetQueryInfoError(this.unavailableReason));
    }

    @Override // rl.c
    public void f(@NotNull String adTracingId, @NotNull JSONObject params, @NotNull f listener) {
        Intrinsics.checkNotNullParameter(adTracingId, "adTracingId");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(listener, "listener");
        listener.onFailure("GMA SDK controller unavailable");
    }

    @Override // rl.c
    public void g(@NotNull String experimentVariant, @NotNull BiConsumer<Boolean, String> callback) {
        Intrinsics.checkNotNullParameter(experimentVariant, "experimentVariant");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.accept(Boolean.FALSE, "GMA SDK controller unavailable");
    }

    @Override // rl.c
    @Nullable
    public /* bridge */ Object i(@NotNull String str, @NotNull b<? super n<Unit>> bVar) {
        return super.i(str, bVar);
    }

    @Override // rl.c
    @Nullable
    public Object j(@NotNull a aVar, @NotNull String str, @NotNull String str2, @NotNull Function2<? super String, ? super b<? super n<String>>, ? extends Object> function2, @NotNull b<? super n<Unit>> bVar) {
        n.Companion companion = n.INSTANCE;
        return n.b(o.a(new e(g.NOT_INSTALLED, new RuntimeException(this.unavailableReason))));
    }

    public NoopGmaSdkController(@NotNull String unavailableReason) {
        Intrinsics.checkNotNullParameter(unavailableReason, "unavailableReason");
        this.unavailableReason = unavailableReason;
    }

    public /* synthetic */ NoopGmaSdkController(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "MODULE_NOT_INSTALLED" : str);
    }
}
