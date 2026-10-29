package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p082dp.InterfaceC4647a;
import p229jt.C7345l;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.fallbackmode.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;", "", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/c;", "params", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/c;)V", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;", "fallbackModeApiController", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f$a;", "offlineModeApiController", "Ldp/a;", "a", "(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f$a;)Ldp/a;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/c;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3678a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC3680c params;

    public C3678a(@NotNull InterfaceC3680c params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.params = params;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final InterfaceC4647a m18480a(@NotNull C3681d fallbackModeApiController, @NotNull C3683f.a offlineModeApiController) {
        Intrinsics.checkNotNullParameter(fallbackModeApiController, "fallbackModeApiController");
        Intrinsics.checkNotNullParameter(offlineModeApiController, "offlineModeApiController");
        InterfaceC3680c interfaceC3680c = this.params;
        if (interfaceC3680c instanceof InterfaceC3680c.b) {
            return offlineModeApiController.mo18500a(((InterfaceC3680c.b) interfaceC3680c).getStaticTemplateResourceId());
        }
        if (interfaceC3680c instanceof InterfaceC3680c.a) {
            return fallbackModeApiController;
        }
        throw new C7345l();
    }
}
