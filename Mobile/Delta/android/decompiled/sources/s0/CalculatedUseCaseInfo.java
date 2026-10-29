package s0;

import g0.w2;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: s0.b, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b\"\u0010!R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010%R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b&\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b(\u0010.R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b*\u00103\u001a\u0004\b,\u00104R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b1\u00103\u001a\u0004\b/\u00104¨\u00065"}, d2 = {"Ls0/b;", "", "", "Lg0/w2;", "appUseCases", "cameraUseCases", "", "cameraUseCasesToAttach", "cameraUseCasesToKeep", "cameraUseCasesToDetach", "Lb1/g;", "streamSharing", "placeholderForExtensions", "", "Ls0/f$b;", "useCaseConfigs", "Ls0/l;", "primaryStreamSpecResult", "secondaryStreamSpecResult", "<init>", "(Ljava/util/Collection;Ljava/util/Collection;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lb1/g;Lg0/w2;Ljava/util/Map;Ls0/l;Ls0/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Collection;", "()Ljava/util/Collection;", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "e", "f", "Lb1/g;", "i", "()Lb1/g;", "g", "Lg0/w2;", "()Lg0/w2;", "h", "Ljava/util/Map;", "j", "()Ljava/util/Map;", "Ls0/l;", "()Ls0/l;", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CalculatedUseCaseInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Collection<w2> appUseCases;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final Collection<w2> cameraUseCases;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final List<w2> cameraUseCasesToAttach;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final List<w2> cameraUseCasesToKeep;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final List<w2> cameraUseCasesToDetach;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final b1.g streamSharing;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final w2 placeholderForExtensions;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Map<w2, f.b> useCaseConfigs;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final StreamSpecQueryResult primaryStreamSpecResult;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final StreamSpecQueryResult secondaryStreamSpecResult;

    /* JADX WARN: Multi-variable type inference failed */
    public CalculatedUseCaseInfo(@NotNull Collection<? extends w2> appUseCases, @NotNull Collection<? extends w2> cameraUseCases, @NotNull List<? extends w2> cameraUseCasesToAttach, @NotNull List<? extends w2> cameraUseCasesToKeep, @NotNull List<? extends w2> cameraUseCasesToDetach, @Nullable b1.g gVar, @Nullable w2 w2Var, @NotNull Map<w2, ? extends f.b> useCaseConfigs, @NotNull StreamSpecQueryResult primaryStreamSpecResult, @Nullable StreamSpecQueryResult lVar) {
        Intrinsics.checkNotNullParameter(appUseCases, "appUseCases");
        Intrinsics.checkNotNullParameter(cameraUseCases, "cameraUseCases");
        Intrinsics.checkNotNullParameter(cameraUseCasesToAttach, "cameraUseCasesToAttach");
        Intrinsics.checkNotNullParameter(cameraUseCasesToKeep, "cameraUseCasesToKeep");
        Intrinsics.checkNotNullParameter(cameraUseCasesToDetach, "cameraUseCasesToDetach");
        Intrinsics.checkNotNullParameter(useCaseConfigs, "useCaseConfigs");
        Intrinsics.checkNotNullParameter(primaryStreamSpecResult, "primaryStreamSpecResult");
        this.appUseCases = appUseCases;
        this.cameraUseCases = cameraUseCases;
        this.cameraUseCasesToAttach = cameraUseCasesToAttach;
        this.cameraUseCasesToKeep = cameraUseCasesToKeep;
        this.cameraUseCasesToDetach = cameraUseCasesToDetach;
        this.streamSharing = gVar;
        this.placeholderForExtensions = w2Var;
        this.useCaseConfigs = useCaseConfigs;
        this.primaryStreamSpecResult = primaryStreamSpecResult;
        this.secondaryStreamSpecResult = lVar;
    }

    @NotNull
    public final Collection<w2> a() {
        return this.appUseCases;
    }

    @NotNull
    public final Collection<w2> b() {
        return this.cameraUseCases;
    }

    @NotNull
    public final List<w2> c() {
        return this.cameraUseCasesToAttach;
    }

    @NotNull
    public final List<w2> d() {
        return this.cameraUseCasesToDetach;
    }

    @NotNull
    public final List<w2> e() {
        return this.cameraUseCasesToKeep;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalculatedUseCaseInfo)) {
            return false;
        }
        CalculatedUseCaseInfo calculatedUseCaseInfo = (CalculatedUseCaseInfo) other;
        return Intrinsics.c(this.appUseCases, calculatedUseCaseInfo.appUseCases) && Intrinsics.c(this.cameraUseCases, calculatedUseCaseInfo.cameraUseCases) && Intrinsics.c(this.cameraUseCasesToAttach, calculatedUseCaseInfo.cameraUseCasesToAttach) && Intrinsics.c(this.cameraUseCasesToKeep, calculatedUseCaseInfo.cameraUseCasesToKeep) && Intrinsics.c(this.cameraUseCasesToDetach, calculatedUseCaseInfo.cameraUseCasesToDetach) && Intrinsics.c(this.streamSharing, calculatedUseCaseInfo.streamSharing) && Intrinsics.c(this.placeholderForExtensions, calculatedUseCaseInfo.placeholderForExtensions) && Intrinsics.c(this.useCaseConfigs, calculatedUseCaseInfo.useCaseConfigs) && Intrinsics.c(this.primaryStreamSpecResult, calculatedUseCaseInfo.primaryStreamSpecResult) && Intrinsics.c(this.secondaryStreamSpecResult, calculatedUseCaseInfo.secondaryStreamSpecResult);
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final w2 getPlaceholderForExtensions() {
        return this.placeholderForExtensions;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final StreamSpecQueryResult getPrimaryStreamSpecResult() {
        return this.primaryStreamSpecResult;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final StreamSpecQueryResult getSecondaryStreamSpecResult() {
        return this.secondaryStreamSpecResult;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.appUseCases.hashCode() * 31) + this.cameraUseCases.hashCode()) * 31) + this.cameraUseCasesToAttach.hashCode()) * 31) + this.cameraUseCasesToKeep.hashCode()) * 31) + this.cameraUseCasesToDetach.hashCode()) * 31;
        b1.g gVar = this.streamSharing;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        w2 w2Var = this.placeholderForExtensions;
        int iHashCode3 = (((((iHashCode2 + (w2Var == null ? 0 : w2Var.hashCode())) * 31) + this.useCaseConfigs.hashCode()) * 31) + this.primaryStreamSpecResult.hashCode()) * 31;
        StreamSpecQueryResult lVar = this.secondaryStreamSpecResult;
        return iHashCode3 + (lVar != null ? lVar.hashCode() : 0);
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final b1.g getStreamSharing() {
        return this.streamSharing;
    }

    @NotNull
    public final Map<w2, f.b> j() {
        return this.useCaseConfigs;
    }

    @NotNull
    public String toString() {
        return "CalculatedUseCaseInfo(appUseCases=" + this.appUseCases + ", cameraUseCases=" + this.cameraUseCases + ", cameraUseCasesToAttach=" + this.cameraUseCasesToAttach + ", cameraUseCasesToKeep=" + this.cameraUseCasesToKeep + ", cameraUseCasesToDetach=" + this.cameraUseCasesToDetach + ", streamSharing=" + this.streamSharing + ", placeholderForExtensions=" + this.placeholderForExtensions + ", useCaseConfigs=" + this.useCaseConfigs + ", primaryStreamSpecResult=" + this.primaryStreamSpecResult + ", secondaryStreamSpecResult=" + this.secondaryStreamSpecResult + ')';
    }
}
