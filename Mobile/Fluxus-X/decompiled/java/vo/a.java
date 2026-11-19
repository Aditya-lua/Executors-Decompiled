package vo;

import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "Ldp/e;", "idClass", "Lvo/d3$e;", "side", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;Ldp/e;Lvo/d3$e;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "government-id_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    @Nullable
    public static final RemoteImage a(@NotNull NextStep.GovernmentId.AssetConfig.CapturePage capturePage, @NotNull dp.e idClass, @NotNull IdConfig.e side) {
        Intrinsics.checkNotNullParameter(capturePage, "<this>");
        Intrinsics.checkNotNullParameter(idClass, "idClass");
        Intrinsics.checkNotNullParameter(side, "side");
        if (idClass == dp.e.Passport && side == IdConfig.e.Front) {
            RemoteImage passportFrontPictograph = capturePage.getPassportFrontPictograph();
            return passportFrontPictograph == null ? capturePage.getIdFrontPictograph() : passportFrontPictograph;
        }
        if (side == IdConfig.e.Front) {
            return capturePage.getIdFrontPictograph();
        }
        if (side == IdConfig.e.Back) {
            return capturePage.getIdBackPictograph();
        }
        if (side == IdConfig.e.PassportSignature) {
            return capturePage.getPassportSignaturePictograph();
        }
        if (side == IdConfig.e.BarcodePdf417) {
            return capturePage.getBarcodePdf417Pictograph();
        }
        return null;
    }
}
