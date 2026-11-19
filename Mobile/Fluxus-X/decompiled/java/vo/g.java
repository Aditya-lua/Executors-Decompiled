package vo;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u0015\u0010\f\u001a\u00020\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u0015\u0010\u0010\u001a\u00020\r*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lvo/f;", "Lvo/d3$e;", "side", "Lvo/d3$c;", "d", "(Lvo/f;Lvo/d3$e;)Lvo/d3$c;", "Lvo/d3;", "c", "(Lvo/f;)Lvo/d3;", BuildConfig.FLAVOR, "b", "(Lvo/f;)Ljava/lang/String;", "idClassKey", "Ldp/e;", "a", "(Lvo/f;)Ldp/e;", "idClass", "government-id_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {
    @NotNull
    public static final dp.e a(@NotNull f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (fVar instanceof f.AutoClassifyConfig) {
            return dp.e.Unknown;
        }
        if (fVar instanceof f.IdCaptureConfig) {
            return ((f.IdCaptureConfig) fVar).getId().getType();
        }
        throw new zt.l();
    }

    @NotNull
    public static final String b(@NotNull f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (fVar instanceof f.AutoClassifyConfig) {
            return "auto-classification";
        }
        if (fVar instanceof f.IdCaptureConfig) {
            return ((f.IdCaptureConfig) fVar).getId().getIdClassKey();
        }
        throw new zt.l();
    }

    @Nullable
    public static final IdConfig c(@NotNull f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        if (fVar instanceof f.AutoClassifyConfig) {
            return null;
        }
        if (fVar instanceof f.IdCaptureConfig) {
            return ((f.IdCaptureConfig) fVar).getId();
        }
        throw new zt.l();
    }

    @NotNull
    public static final IdConfig.IdSideConfig d(@NotNull f fVar, @NotNull IdConfig.e side) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(side, "side");
        if (fVar instanceof f.AutoClassifyConfig) {
            return ((f.AutoClassifyConfig) fVar).getConfig().getIdSideConfig();
        }
        if (fVar instanceof f.IdCaptureConfig) {
            return ((f.IdCaptureConfig) fVar).getId().g(side);
        }
        throw new zt.l();
    }
}
