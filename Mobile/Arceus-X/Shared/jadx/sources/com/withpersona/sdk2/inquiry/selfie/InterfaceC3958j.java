package com.withpersona.sdk2.inquiry.selfie;

import gq.C6211f;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7702q0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p016an.InterfaceC0364a0;
import p611zp.C14021p0;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.j */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003À\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/j;", "", "a", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC3958j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f16629a;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.j$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/j$a;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/selfie/d;", "oldSelfieCameraScreenViewFactory", "Lzp/p0;", "selfieCameraScreenViewFactory", "", "Lan/a0;", "a", "(Lcom/withpersona/sdk2/inquiry/selfie/d;Lzp/p0;)Ljava/util/Set;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f16629a = new Companion();

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Set<InterfaceC0364a0<?>> m20084a(@NotNull C3942d oldSelfieCameraScreenViewFactory, @NotNull C14021p0 selfieCameraScreenViewFactory) {
            Intrinsics.checkNotNullParameter(oldSelfieCameraScreenViewFactory, "oldSelfieCameraScreenViewFactory");
            Intrinsics.checkNotNullParameter(selfieCameraScreenViewFactory, "selfieCameraScreenViewFactory");
            return C7702q0.m31911g(C3956h.INSTANCE, oldSelfieCameraScreenViewFactory, selfieCameraScreenViewFactory, C6211f.INSTANCE, C3959k.INSTANCE, C3960l.INSTANCE);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    static Set<InterfaceC0364a0<?>> m20083a(@NotNull C3942d c3942d, @NotNull C14021p0 c14021p0) {
        return INSTANCE.m20084a(c3942d, c14021p0);
    }
}
