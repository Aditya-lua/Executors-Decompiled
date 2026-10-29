package p424s0;

import android.util.Range;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p140g0.AbstractC5952w2;
import p296n0.InterfaceC8761h0;
import p296n0.InterfaceC8789m0;
import p296n0.InterfaceC8799o0;

/* JADX INFO: renamed from: s0.m */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00182\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006Ju\u0010\u0018\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00072\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0014H&¢\u0006\u0004\b\u0018\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, m31665d2 = {"Ls0/m;", "", "Ln0/m0;", "cameraDeviceSurfaceManager", "", "b", "(Ln0/m0;)V", "", "cameraMode", "Ln0/o0;", "cameraInfoInternal", "", "Lg0/w2;", "newUseCases", "attachedUseCases", "Ln0/h0;", "cameraConfig", "sessionType", "Landroid/util/Range;", "targetFrameRate", "", "isFeatureComboInvocation", "findMaxSupportedFrameRate", "Ls0/l;", "a", "(ILn0/o0;Ljava/util/List;Ljava/util/List;Ln0/h0;ILandroid/util/Range;ZZ)Ls0/l;", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public interface InterfaceC11152m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f39388a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final InterfaceC11152m f39387b = new a();

    /* JADX INFO: renamed from: s0.m$a */
    @Metadata(m31664d1 = {"\u0000?\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001Ji\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m31665d2 = {"s0/m$a", "Ls0/m;", "", "cameraMode", "Ln0/o0;", "cameraInfoInternal", "", "Lg0/w2;", "newUseCases", "attachedUseCases", "Ln0/h0;", "cameraConfig", "sessionType", "Landroid/util/Range;", "targetFrameRate", "", "isFeatureComboInvocation", "findMaxSupportedFrameRate", "Ls0/l;", "a", "(ILn0/o0;Ljava/util/List;Ljava/util/List;Ln0/h0;ILandroid/util/Range;ZZ)Ls0/l;", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class a implements InterfaceC11152m {
        /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p424s0.InterfaceC11152m
        /* JADX INFO: renamed from: a */
        public StreamSpecQueryResult mo42015a(int cameraMode, InterfaceC8799o0 cameraInfoInternal, List<? extends AbstractC5952w2> newUseCases, List<? extends AbstractC5952w2> attachedUseCases, InterfaceC8761h0 cameraConfig, int sessionType, Range<Integer> targetFrameRate, boolean isFeatureComboInvocation, boolean findMaxSupportedFrameRate) {
            Intrinsics.checkNotNullParameter(cameraInfoInternal, "cameraInfoInternal");
            Intrinsics.checkNotNullParameter(newUseCases, "newUseCases");
            Intrinsics.checkNotNullParameter(attachedUseCases, "attachedUseCases");
            Intrinsics.checkNotNullParameter(cameraConfig, "cameraConfig");
            Intrinsics.checkNotNullParameter(targetFrameRate, "targetFrameRate");
            return new StreamSpecQueryResult(null, 0, 3, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: s0.m$b, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\u0007"}, m31665d2 = {"Ls0/m$b;", "", "<init>", "()V", "Ls0/m;", "NO_OP_STREAM_SPECS_CALCULATOR", "Ls0/m;", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f39388a = new Companion();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    StreamSpecQueryResult mo42015a(int cameraMode, @NotNull InterfaceC8799o0 cameraInfoInternal, @NotNull List<? extends AbstractC5952w2> newUseCases, @NotNull List<? extends AbstractC5952w2> attachedUseCases, @NotNull InterfaceC8761h0 cameraConfig, int sessionType, @NotNull Range<Integer> targetFrameRate, boolean isFeatureComboInvocation, boolean findMaxSupportedFrameRate);

    /* JADX INFO: renamed from: b */
    default void mo42016b(@NotNull InterfaceC8789m0 cameraDeviceSurfaceManager) {
        Intrinsics.checkNotNullParameter(cameraDeviceSurfaceManager, "cameraDeviceSurfaceManager");
    }
}
