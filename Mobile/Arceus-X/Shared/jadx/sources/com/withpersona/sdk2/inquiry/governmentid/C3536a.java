package com.withpersona.sdk2.inquiry.governmentid;

import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.RemoteImage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p361po.EnumC10302b;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;", "Lpo/b;", "idClass", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;Lpo/b;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "government-id_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3536a {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final RemoteImage m17498a(@NotNull NextStep.GovernmentId.AssetConfig.CapturePage capturePage, @NotNull EnumC10302b idClass, @NotNull IdConfig.EnumC3514b side) {
        Intrinsics.checkNotNullParameter(capturePage, "<this>");
        Intrinsics.checkNotNullParameter(idClass, "idClass");
        Intrinsics.checkNotNullParameter(side, "side");
        if (idClass == EnumC10302b.Passport && side == IdConfig.EnumC3514b.Front) {
            RemoteImage passportFrontPictograph = capturePage.getPassportFrontPictograph();
            return passportFrontPictograph == null ? capturePage.getIdFrontPictograph() : passportFrontPictograph;
        }
        if (side == IdConfig.EnumC3514b.Front) {
            return capturePage.getIdFrontPictograph();
        }
        if (side == IdConfig.EnumC3514b.Back) {
            return capturePage.getIdBackPictograph();
        }
        if (side == IdConfig.EnumC3514b.PassportSignature) {
            return capturePage.getPassportSignaturePictograph();
        }
        if (side == IdConfig.EnumC3514b.BarcodePdf417) {
            return capturePage.getBarcodePdf417Pictograph();
        }
        return null;
    }
}
