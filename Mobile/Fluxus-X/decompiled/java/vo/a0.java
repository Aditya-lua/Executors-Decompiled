package vo;

import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyResponse;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lvo/a0;", BuildConfig.FLAVOR, "a", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: vo.a0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\u0006H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lvo/a0$a;", BuildConfig.FLAVOR, "<init>", "()V", "Lxo/z;", "governmentIdCameraScreenViewFactory", BuildConfig.FLAVOR, "Lnn/b0;", "b", "(Lxo/z;)Ljava/util/Set;", "Lhn/h$e;", "Lcom/withpersona/sdk2/inquiry/network/core/MoshiJsonAdapter;", "a", "()Ljava/util/Set;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<hn.h.e> a() {
            return p001kotlin.collections.p0.c(AutoClassifyResponse.INSTANCE.a());
        }

        @NotNull
        public final Set<nn.b0<?>> b(@NotNull xo.z governmentIdCameraScreenViewFactory) {
            Intrinsics.checkNotNullParameter(governmentIdCameraScreenViewFactory, "governmentIdCameraScreenViewFactory");
            return p001kotlin.collections.q0.g(w.INSTANCE, governmentIdCameraScreenViewFactory, hp.q.INSTANCE, o0.INSTANCE, rn.c.INSTANCE, kr.p.INSTANCE, wo.c0.INSTANCE, gp.e.INSTANCE, gp.j.INSTANCE, gp.p.INSTANCE, gp.k.INSTANCE);
        }

        public Companion() {
        }
    }

    @NotNull
    public static final Set<hn.h.e> a() {
        return INSTANCE.a();
    }

    @NotNull
    public static final Set<nn.b0<?>> b(@NotNull xo.z zVar) {
        return INSTANCE.b(zVar);
    }
}
