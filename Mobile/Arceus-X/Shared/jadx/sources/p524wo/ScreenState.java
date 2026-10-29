package p524wo;

import com.withpersona.sdk2.inquiry.ExperimentalInlineApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wo.c, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0005\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015¨\u0006\u001b"}, m31665d2 = {"Lwo/c;", "", "", "shouldShowBackButton", "shouldShowCancelButton", "isNavigationEnabled", "shouldShowHelpButton", "<init>", "(ZZZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getShouldShowBackButton", "()Z", "b", "getShouldShowCancelButton", "c", "d", "getShouldShowHelpButton", "inquiry-dynamic-feature_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@ExperimentalInlineApi
public final /* data */ class ScreenState {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final boolean shouldShowBackButton;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean shouldShowCancelButton;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    public final boolean isNavigationEnabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final boolean shouldShowHelpButton;

    public ScreenState(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.shouldShowBackButton = z10;
        this.shouldShowCancelButton = z11;
        this.isNavigationEnabled = z12;
        this.shouldShowHelpButton = z13;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScreenState)) {
            return false;
        }
        ScreenState screenState = (ScreenState) other;
        return this.shouldShowBackButton == screenState.shouldShowBackButton && this.shouldShowCancelButton == screenState.shouldShowCancelButton && this.isNavigationEnabled == screenState.isNavigationEnabled && this.shouldShowHelpButton == screenState.shouldShowHelpButton;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.shouldShowBackButton) * 31) + Boolean.hashCode(this.shouldShowCancelButton)) * 31) + Boolean.hashCode(this.isNavigationEnabled)) * 31) + Boolean.hashCode(this.shouldShowHelpButton);
    }

    @NotNull
    public String toString() {
        return "ScreenState(shouldShowBackButton=" + this.shouldShowBackButton + ", shouldShowCancelButton=" + this.shouldShowCancelButton + ", isNavigationEnabled=" + this.isNavigationEnabled + ", shouldShowHelpButton=" + this.shouldShowHelpButton + ")";
    }
}
