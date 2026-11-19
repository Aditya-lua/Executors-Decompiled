package mq;

import com.github.luben.zstd.BuildConfig;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003À\u0006\u0003"}, d2 = {"Lmq/n0;", BuildConfig.FLAVOR, "a", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f23732a;

    /* JADX INFO: renamed from: mq.n0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lmq/n0$a;", BuildConfig.FLAVOR, "<init>", "()V", "Lmq/p;", "oldSelfieCameraScreenViewFactory", "Lnq/p0;", "selfieCameraScreenViewFactory", BuildConfig.FLAVOR, "Lnn/b0;", "a", "(Lmq/p;Lnq/p0;)Ljava/util/Set;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f23732a = new Companion();

        @NotNull
        public final Set<nn.b0<?>> a(@NotNull p oldSelfieCameraScreenViewFactory, @NotNull nq.p0 selfieCameraScreenViewFactory) {
            Intrinsics.checkNotNullParameter(oldSelfieCameraScreenViewFactory, "oldSelfieCameraScreenViewFactory");
            Intrinsics.checkNotNullParameter(selfieCameraScreenViewFactory, "selfieCameraScreenViewFactory");
            return p001kotlin.collections.q0.g(l0.INSTANCE, oldSelfieCameraScreenViewFactory, selfieCameraScreenViewFactory, uq.f.INSTANCE, q0.INSTANCE, v0.INSTANCE);
        }
    }

    @NotNull
    static Set<nn.b0<?>> a(@NotNull p pVar, @NotNull nq.p0 p0Var) {
        return INSTANCE.a(pVar, p0Var);
    }
}
