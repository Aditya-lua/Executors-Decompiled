package p424s0;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p021b1.C1196g;
import p140g0.AbstractC5952w2;

/* JADX INFO: renamed from: s0.b, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b\"\u0010!R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010%R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b&\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b(\u0010.R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b*\u00103\u001a\u0004\b,\u00104R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b1\u00103\u001a\u0004\b/\u00104¨\u00065"}, m31665d2 = {"Ls0/b;", "", "", "Lg0/w2;", "appUseCases", "cameraUseCases", "", "cameraUseCasesToAttach", "cameraUseCasesToKeep", "cameraUseCasesToDetach", "Lb1/g;", "streamSharing", "placeholderForExtensions", "", "Ls0/f$b;", "useCaseConfigs", "Ls0/l;", "primaryStreamSpecResult", "secondaryStreamSpecResult", "<init>", "(Ljava/util/Collection;Ljava/util/Collection;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lb1/g;Lg0/w2;Ljava/util/Map;Ls0/l;Ls0/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Collection;", "()Ljava/util/Collection;", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "e", "f", "Lb1/g;", "i", "()Lb1/g;", "g", "Lg0/w2;", "()Lg0/w2;", "h", "Ljava/util/Map;", "j", "()Ljava/util/Map;", "Ls0/l;", "()Ls0/l;", "camera-core_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final /* data */ class CalculatedUseCaseInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final Collection<AbstractC5952w2> appUseCases;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final Collection<AbstractC5952w2> cameraUseCases;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<AbstractC5952w2> cameraUseCasesToAttach;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<AbstractC5952w2> cameraUseCasesToKeep;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<AbstractC5952w2> cameraUseCasesToDetach;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    public final C1196g streamSharing;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    public final AbstractC5952w2 placeholderForExtensions;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    public final Map<AbstractC5952w2, C11145f.b> useCaseConfigs;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @NotNull
    public final StreamSpecQueryResult primaryStreamSpecResult;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    public final StreamSpecQueryResult secondaryStreamSpecResult;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Collection<? extends g0.w2> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Collection<? extends g0.w2> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends g0.w2> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends g0.w2> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends g0.w2> */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: java.util.Map<g0.w2, ? extends s0.f$b> */
    /* JADX WARN: Multi-variable type inference failed */
    public CalculatedUseCaseInfo(@NotNull Collection<? extends AbstractC5952w2> appUseCases, @NotNull Collection<? extends AbstractC5952w2> cameraUseCases, @NotNull List<? extends AbstractC5952w2> cameraUseCasesToAttach, @NotNull List<? extends AbstractC5952w2> cameraUseCasesToKeep, @NotNull List<? extends AbstractC5952w2> cameraUseCasesToDetach, @Nullable C1196g c1196g, @Nullable AbstractC5952w2 abstractC5952w2, @NotNull Map<AbstractC5952w2, ? extends C11145f.b> useCaseConfigs, @NotNull StreamSpecQueryResult primaryStreamSpecResult, @Nullable StreamSpecQueryResult c11151l) {
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
        this.streamSharing = c1196g;
        this.placeholderForExtensions = abstractC5952w2;
        this.useCaseConfigs = useCaseConfigs;
        this.primaryStreamSpecResult = primaryStreamSpecResult;
        this.secondaryStreamSpecResult = c11151l;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Collection<AbstractC5952w2> m41931a() {
        return this.appUseCases;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Collection<AbstractC5952w2> m41932b() {
        return this.cameraUseCases;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<AbstractC5952w2> m41933c() {
        return this.cameraUseCasesToAttach;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<AbstractC5952w2> m41934d() {
        return this.cameraUseCasesToDetach;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final List<AbstractC5952w2> m41935e() {
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
        return Intrinsics.m31980c(this.appUseCases, calculatedUseCaseInfo.appUseCases) && Intrinsics.m31980c(this.cameraUseCases, calculatedUseCaseInfo.cameraUseCases) && Intrinsics.m31980c(this.cameraUseCasesToAttach, calculatedUseCaseInfo.cameraUseCasesToAttach) && Intrinsics.m31980c(this.cameraUseCasesToKeep, calculatedUseCaseInfo.cameraUseCasesToKeep) && Intrinsics.m31980c(this.cameraUseCasesToDetach, calculatedUseCaseInfo.cameraUseCasesToDetach) && Intrinsics.m31980c(this.streamSharing, calculatedUseCaseInfo.streamSharing) && Intrinsics.m31980c(this.placeholderForExtensions, calculatedUseCaseInfo.placeholderForExtensions) && Intrinsics.m31980c(this.useCaseConfigs, calculatedUseCaseInfo.useCaseConfigs) && Intrinsics.m31980c(this.primaryStreamSpecResult, calculatedUseCaseInfo.primaryStreamSpecResult) && Intrinsics.m31980c(this.secondaryStreamSpecResult, calculatedUseCaseInfo.secondaryStreamSpecResult);
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final AbstractC5952w2 getPlaceholderForExtensions() {
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
        C1196g c1196g = this.streamSharing;
        int iHashCode2 = (iHashCode + (c1196g == null ? 0 : c1196g.hashCode())) * 31;
        AbstractC5952w2 abstractC5952w2 = this.placeholderForExtensions;
        int iHashCode3 = (((((iHashCode2 + (abstractC5952w2 == null ? 0 : abstractC5952w2.hashCode())) * 31) + this.useCaseConfigs.hashCode()) * 31) + this.primaryStreamSpecResult.hashCode()) * 31;
        StreamSpecQueryResult c11151l = this.secondaryStreamSpecResult;
        return iHashCode3 + (c11151l != null ? c11151l.hashCode() : 0);
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final C1196g getStreamSharing() {
        return this.streamSharing;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final Map<AbstractC5952w2, C11145f.b> m41940j() {
        return this.useCaseConfigs;
    }

    @NotNull
    public String toString() {
        return "CalculatedUseCaseInfo(appUseCases=" + this.appUseCases + ", cameraUseCases=" + this.cameraUseCases + ", cameraUseCasesToAttach=" + this.cameraUseCasesToAttach + ", cameraUseCasesToKeep=" + this.cameraUseCasesToKeep + ", cameraUseCasesToDetach=" + this.cameraUseCasesToDetach + ", streamSharing=" + this.streamSharing + ", placeholderForExtensions=" + this.placeholderForExtensions + ", useCaseConfigs=" + this.useCaseConfigs + ", primaryStreamSpecResult=" + this.primaryStreamSpecResult + ", secondaryStreamSpecResult=" + this.secondaryStreamSpecResult + ')';
    }
}
