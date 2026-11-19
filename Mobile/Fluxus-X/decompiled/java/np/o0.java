package np;

import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import hr.InquirySessionConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0016\u0010\r\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0004¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lnp/o0;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "A", "()Ljava/lang/String;", "sessionToken", "i", "trackingEventsUrl", "g", "inquiryId", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "Lhr/g;", "a", "()Lhr/g;", "inquirySessionConfig", "f", "redirectUri", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface o0 {
    @NotNull
    String A();

    @NotNull
    InquirySessionConfig a();

    @Nullable
    String f();

    @NotNull
    String g();

    @Nullable
    StepStyle getStyles();

    @Nullable
    String i();
}
