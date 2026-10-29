package com.withpersona.sdk2.inquiry.selfie;

import an.a0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zp.p0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/j;", "", "a", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f12970a;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.j$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/j$a;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/selfie/d;", "oldSelfieCameraScreenViewFactory", "Lzp/p0;", "selfieCameraScreenViewFactory", "", "Lan/a0;", "a", "(Lcom/withpersona/sdk2/inquiry/selfie/d;Lzp/p0;)Ljava/util/Set;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f12970a = new Companion();

        @NotNull
        public final Set<a0<?>> a(@NotNull d oldSelfieCameraScreenViewFactory, @NotNull p0 selfieCameraScreenViewFactory) {
            Intrinsics.checkNotNullParameter(oldSelfieCameraScreenViewFactory, "oldSelfieCameraScreenViewFactory");
            Intrinsics.checkNotNullParameter(selfieCameraScreenViewFactory, "selfieCameraScreenViewFactory");
            return q0.g(h.INSTANCE, oldSelfieCameraScreenViewFactory, selfieCameraScreenViewFactory, gq.f.INSTANCE, k.INSTANCE, l.INSTANCE);
        }
    }

    @NotNull
    static Set<a0<?>> a(@NotNull d dVar, @NotNull p0 p0Var) {
        return INSTANCE.a(dVar, p0Var);
    }
}
