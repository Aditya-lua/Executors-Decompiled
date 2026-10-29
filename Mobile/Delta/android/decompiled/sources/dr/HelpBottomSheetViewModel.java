package dr;

import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.HelpBottomSheetComponentStyle;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: dr.o, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001b\u0010\u000fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b\u001a\u0010!¨\u0006\""}, d2 = {"Ldr/o;", "", "", Title.type, "buttonText", "secondaryButtonText", "secondaryButtonActionComponentName", "", "Ldr/s;", "tips", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/HelpBottomSheetComponentStyle;", "componentStyle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/HelpBottomSheetComponentStyle;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "c", "d", "e", "Ljava/util/List;", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/HelpBottomSheetComponentStyle;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/HelpBottomSheetComponentStyle;", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HelpBottomSheetViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final String buttonText;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String secondaryButtonText;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String secondaryButtonActionComponentName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final List<HelpPagerItem> tips;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final HelpBottomSheetComponentStyle componentStyle;

    public HelpBottomSheetViewModel(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull List<HelpPagerItem> tips, @Nullable HelpBottomSheetComponentStyle helpBottomSheetComponentStyle) {
        Intrinsics.checkNotNullParameter(tips, "tips");
        this.title = str;
        this.buttonText = str2;
        this.secondaryButtonText = str3;
        this.secondaryButtonActionComponentName = str4;
        this.tips = tips;
        this.componentStyle = helpBottomSheetComponentStyle;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final HelpBottomSheetComponentStyle getComponentStyle() {
        return this.componentStyle;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSecondaryButtonActionComponentName() {
        return this.secondaryButtonActionComponentName;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSecondaryButtonText() {
        return this.secondaryButtonText;
    }

    @NotNull
    public final List<HelpPagerItem> e() {
        return this.tips;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HelpBottomSheetViewModel)) {
            return false;
        }
        HelpBottomSheetViewModel helpBottomSheetViewModel = (HelpBottomSheetViewModel) other;
        return Intrinsics.c(this.title, helpBottomSheetViewModel.title) && Intrinsics.c(this.buttonText, helpBottomSheetViewModel.buttonText) && Intrinsics.c(this.secondaryButtonText, helpBottomSheetViewModel.secondaryButtonText) && Intrinsics.c(this.secondaryButtonActionComponentName, helpBottomSheetViewModel.secondaryButtonActionComponentName) && Intrinsics.c(this.tips, helpBottomSheetViewModel.tips) && Intrinsics.c(this.componentStyle, helpBottomSheetViewModel.componentStyle);
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.buttonText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.secondaryButtonText;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.secondaryButtonActionComponentName;
        int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.tips.hashCode()) * 31;
        HelpBottomSheetComponentStyle helpBottomSheetComponentStyle = this.componentStyle;
        return iHashCode4 + (helpBottomSheetComponentStyle != null ? helpBottomSheetComponentStyle.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "HelpBottomSheetViewModel(title=" + this.title + ", buttonText=" + this.buttonText + ", secondaryButtonText=" + this.secondaryButtonText + ", secondaryButtonActionComponentName=" + this.secondaryButtonActionComponentName + ", tips=" + this.tips + ", componentStyle=" + this.componentStyle + ")";
    }
}
