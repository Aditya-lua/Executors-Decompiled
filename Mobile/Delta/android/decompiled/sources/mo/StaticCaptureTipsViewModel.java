package mo;

import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mo.j, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lmo/j;", "Lmo/i;", "", Title.type, "subtext", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "iconAsset", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StaticCaptureTipsViewModel implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final String subtext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final NextStep.GovernmentId.AssetConfig.CapturePage iconAsset;

    public StaticCaptureTipsViewModel(@Nullable String str, @Nullable String str2, @Nullable NextStep.GovernmentId.AssetConfig.CapturePage capturePage) {
        this.title = str;
        this.subtext = str2;
        this.iconAsset = capturePage;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final NextStep.GovernmentId.AssetConfig.CapturePage getIconAsset() {
        return this.iconAsset;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSubtext() {
        return this.subtext;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StaticCaptureTipsViewModel)) {
            return false;
        }
        StaticCaptureTipsViewModel staticCaptureTipsViewModel = (StaticCaptureTipsViewModel) other;
        return Intrinsics.c(this.title, staticCaptureTipsViewModel.title) && Intrinsics.c(this.subtext, staticCaptureTipsViewModel.subtext) && Intrinsics.c(this.iconAsset, staticCaptureTipsViewModel.iconAsset);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtext;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        NextStep.GovernmentId.AssetConfig.CapturePage capturePage = this.iconAsset;
        return iHashCode2 + (capturePage != null ? capturePage.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "StaticCaptureTipsViewModel(title=" + this.title + ", subtext=" + this.subtext + ", iconAsset=" + this.iconAsset + ")";
    }
}
