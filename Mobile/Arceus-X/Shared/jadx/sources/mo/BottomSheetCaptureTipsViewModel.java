package mo;

import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mo.a, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u001b\u0010\u001e¨\u0006\u001f"}, m31665d2 = {"Lmo/a;", "Lmo/i;", "", "helpButtonText", Title.type, "prompt", "tips", "buttonText", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "f", "c", "d", "e", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class BottomSheetCaptureTipsViewModel implements InterfaceC8607i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String helpButtonText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final String prompt;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final String tips;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    public final String buttonText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    public final IdConfig.EnumC3514b side;

    public BottomSheetCaptureTipsViewModel(@NotNull String helpButtonText, @NotNull String title, @NotNull String prompt, @NotNull String tips, @NotNull String buttonText, @NotNull IdConfig.EnumC3514b side) {
        Intrinsics.checkNotNullParameter(helpButtonText, "helpButtonText");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        Intrinsics.checkNotNullParameter(tips, "tips");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(side, "side");
        this.helpButtonText = helpButtonText;
        this.title = title;
        this.prompt = prompt;
        this.tips = tips;
        this.buttonText = buttonText;
        this.side = side;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getHelpButtonText() {
        return this.helpButtonText;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPrompt() {
        return this.prompt;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final IdConfig.EnumC3514b getSide() {
        return this.side;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTips() {
        return this.tips;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomSheetCaptureTipsViewModel)) {
            return false;
        }
        BottomSheetCaptureTipsViewModel bottomSheetCaptureTipsViewModel = (BottomSheetCaptureTipsViewModel) other;
        return Intrinsics.m31980c(this.helpButtonText, bottomSheetCaptureTipsViewModel.helpButtonText) && Intrinsics.m31980c(this.title, bottomSheetCaptureTipsViewModel.title) && Intrinsics.m31980c(this.prompt, bottomSheetCaptureTipsViewModel.prompt) && Intrinsics.m31980c(this.tips, bottomSheetCaptureTipsViewModel.tips) && Intrinsics.m31980c(this.buttonText, bottomSheetCaptureTipsViewModel.buttonText) && this.side == bottomSheetCaptureTipsViewModel.side;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((((this.helpButtonText.hashCode() * 31) + this.title.hashCode()) * 31) + this.prompt.hashCode()) * 31) + this.tips.hashCode()) * 31) + this.buttonText.hashCode()) * 31) + this.side.hashCode();
    }

    @NotNull
    public String toString() {
        return "BottomSheetCaptureTipsViewModel(helpButtonText=" + this.helpButtonText + ", title=" + this.title + ", prompt=" + this.prompt + ", tips=" + this.tips + ", buttonText=" + this.buttonText + ", side=" + this.side + ")";
    }
}
