package com.withpersona.sdk2.inquiry.governmentid;

import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse;
import com.withpersona.sdk2.inquiry.shared.p055ui.ScreenWithTransitionContainer;
import java.util.Set;
import jo.C7217b0;
import kotlin.Metadata;
import kotlin.collections.C7700p0;
import kotlin.collections.C7702q0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p016an.InterfaceC0364a0;
import p109en.C5166c;
import p251ko.C7667z;
import p471um.AbstractC11873h;
import so.C11430e;
import so.C11435j;
import so.C11436k;
import so.C11441p;
import to.C11731q;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.k */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/k;", "", "a", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3550k {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.k$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\u0006H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/k$a;", "", "<init>", "()V", "Lko/z;", "governmentIdCameraScreenViewFactory", "", "Lan/a0;", "b", "(Lko/z;)Ljava/util/Set;", "Lum/h$e;", "Lcom/withpersona/sdk2/inquiry/network/core/MoshiJsonAdapter;", "a", "()Ljava/util/Set;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.governmentid.k.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Set<AbstractC11873h.e> m17565a() {
            return C7700p0.m31904c(AutoClassifyResponse.INSTANCE.m17678a());
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Set<InterfaceC0364a0<?>> m17566b(@NotNull C7667z governmentIdCameraScreenViewFactory) {
            Intrinsics.checkNotNullParameter(governmentIdCameraScreenViewFactory, "governmentIdCameraScreenViewFactory");
            return C7702q0.m31911g(C3548i.INSTANCE, governmentIdCameraScreenViewFactory, C11731q.INSTANCE, C3554m.INSTANCE, C5166c.INSTANCE, ScreenWithTransitionContainer.INSTANCE, C7217b0.INSTANCE, C11430e.INSTANCE, C11435j.INSTANCE, C11441p.INSTANCE, C11436k.INSTANCE);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Set<AbstractC11873h.e> m17563a() {
        return INSTANCE.m17565a();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Set<InterfaceC0364a0<?>> m17564b(@NotNull C7667z c7667z) {
        return INSTANCE.m17566b(c7667z);
    }
}
