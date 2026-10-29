package com.withpersona.sdk2.inquiry.governmentid;

import an.a0;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse;
import com.withpersona.sdk2.inquiry.shared.ui.ScreenWithTransitionContainer;
import java.util.Set;
import jo.b0;
import ko.z;
import kotlin.Metadata;
import kotlin.collections.p0;
import kotlin.collections.q0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import to.q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/k;", "", "a", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\u0006H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/k$a;", "", "<init>", "()V", "Lko/z;", "governmentIdCameraScreenViewFactory", "", "Lan/a0;", "b", "(Lko/z;)Ljava/util/Set;", "Lum/h$e;", "Lcom/withpersona/sdk2/inquiry/network/core/MoshiJsonAdapter;", "a", "()Ljava/util/Set;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<um.h.e> a() {
            return p0.c(AutoClassifyResponse.INSTANCE.a());
        }

        @NotNull
        public final Set<a0<?>> b(@NotNull z governmentIdCameraScreenViewFactory) {
            Intrinsics.checkNotNullParameter(governmentIdCameraScreenViewFactory, "governmentIdCameraScreenViewFactory");
            return q0.g(i.INSTANCE, governmentIdCameraScreenViewFactory, q.INSTANCE, m.INSTANCE, en.c.INSTANCE, ScreenWithTransitionContainer.INSTANCE, b0.INSTANCE, so.e.INSTANCE, so.j.INSTANCE, so.p.INSTANCE, so.k.INSTANCE);
        }

        public Companion() {
        }
    }

    @NotNull
    public static final Set<um.h.e> a() {
        return INSTANCE.a();
    }

    @NotNull
    public static final Set<a0<?>> b(@NotNull z zVar) {
        return INSTANCE.b(zVar);
    }
}
