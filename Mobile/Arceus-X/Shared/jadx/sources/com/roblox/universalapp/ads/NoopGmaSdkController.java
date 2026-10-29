package com.roblox.universalapp.ads;

import java.util.function.BiConsumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p229jt.C7347n;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p470ul.GetQueryInfoError;
import th.C11659h;
import tl.C11679e;
import tl.EnumC11671a;
import tl.EnumC11683g;
import tl.InterfaceC11675c;
import tl.InterfaceC11681f;
import tl.InterfaceC11689j;
import tl.InterfaceC11690k;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001'B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\nH\u0017¢\u0006\u0004\b\u001d\u0010\u000eJX\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\"2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022(\u0010$\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\"0!\u0012\u0006\u0012\u0004\u0018\u00010#0 H\u0096@¢\u0006\u0004\b%\u0010&J \u0010'\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010)¨\u0006*"}, m31665d2 = {"Lcom/roblox/universalapp/ads/NoopGmaSdkController;", "Ltl/c;", "", "unavailableReason", "<init>", "(Ljava/lang/String;)V", "experimentVariant", "Ljava/util/function/BiConsumer;", "", "callback", "", "g", "(Ljava/lang/String;Ljava/util/function/BiConsumer;)V", "destroy", "()V", "adTracingId", "adUnitId", "Ltl/j;", "listener", "h", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltl/j;)V", "Lorg/json/JSONObject;", "params", "Ltl/f;", "j", "(Ljava/lang/String;Lorg/json/JSONObject;Ltl/f;)V", "Ltl/k;", "b", "(Ljava/lang/String;Ltl/k;)V", "d", "Ltl/a;", "adFormat", "Lkotlin/Function2;", "Lnt/b;", "Ljt/n;", "", "serveAd", "i", "(Ltl/a;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "a", "(Ltl/a;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "Ljava/lang/String;", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class NoopGmaSdkController implements InterfaceC11675c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String unavailableReason;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public NoopGmaSdkController() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // tl.InterfaceC11675c
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo15965a(@NotNull EnumC11671a enumC11671a, @NotNull String str, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        return Unit.f29331a;
    }

    @Override // tl.InterfaceC11675c
    /* JADX INFO: renamed from: b */
    public void mo15966b(@NotNull String adTracingId, @NotNull InterfaceC11690k listener) {
        Intrinsics.checkNotNullParameter(adTracingId, "adTracingId");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // tl.InterfaceC11675c
    @Nullable
    /* JADX INFO: renamed from: c */
    public /* bridge */ Object mo15967c(@NotNull String str, @NotNull InterfaceC9557b<? super C7347n<Unit>> interfaceC9557b) {
        return super.mo15967c(str, interfaceC9557b);
    }

    @Override // tl.InterfaceC11675c
    /* JADX INFO: renamed from: d */
    public void mo15968d() {
    }

    @Override // tl.InterfaceC11675c
    public void destroy() {
    }

    @Override // tl.InterfaceC11675c
    /* JADX INFO: renamed from: g */
    public void mo15969g(@NotNull String experimentVariant, @NotNull BiConsumer<Boolean, String> callback) {
        Intrinsics.checkNotNullParameter(experimentVariant, "experimentVariant");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.accept(Boolean.FALSE, "GMA SDK controller unavailable");
    }

    @Override // tl.InterfaceC11675c
    /* JADX INFO: renamed from: h */
    public void mo15970h(@NotNull String adTracingId, @NotNull String adUnitId, @NotNull String experimentVariant, @NotNull InterfaceC11689j listener) {
        Intrinsics.checkNotNullParameter(adTracingId, "adTracingId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(experimentVariant, "experimentVariant");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (C11659h.m43403a().mo43498N3()) {
            listener.mo43354a(new GetQueryInfoError(this.unavailableReason));
        } else {
            listener.onSuccess("");
        }
    }

    @Override // tl.InterfaceC11675c
    @Nullable
    /* JADX INFO: renamed from: i */
    public Object mo15971i(@NotNull EnumC11671a enumC11671a, @NotNull String str, @NotNull String str2, @NotNull Function2<? super String, ? super InterfaceC9557b<? super C7347n<String>>, ? extends Object> function2, @NotNull InterfaceC9557b<? super C7347n<Unit>> interfaceC9557b) {
        C7347n.Companion companion = C7347n.INSTANCE;
        return C7347n.m30460b(C7348o.m30469a(new C11679e(EnumC11683g.NOT_INSTALLED, new RuntimeException(this.unavailableReason))));
    }

    @Override // tl.InterfaceC11675c
    /* JADX INFO: renamed from: j */
    public void mo15972j(@NotNull String adTracingId, @NotNull JSONObject params, @NotNull InterfaceC11681f listener) {
        Intrinsics.checkNotNullParameter(adTracingId, "adTracingId");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(listener, "listener");
        listener.onFailure("GMA SDK controller unavailable");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public NoopGmaSdkController(@NotNull String unavailableReason) {
        Intrinsics.checkNotNullParameter(unavailableReason, "unavailableReason");
        this.unavailableReason = unavailableReason;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
      (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("MODULE_NOT_INSTALLED") : (r1v0 java.lang.String))
     A[MD:(java.lang.String):void (m)] (LINE:5) call: com.roblox.universalapp.ads.NoopGmaSdkController.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ NoopGmaSdkController(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "MODULE_NOT_INSTALLED" : str);
    }
}
