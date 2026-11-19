package wr;

import com.withpersona.sdk2.inquiry.network.dto.ui.components.Mdoc;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Provider;", "Lwr/a;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Provider;)Lwr/a;", "ui-step-renderer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    @Nullable
    public static final a a(@NotNull Mdoc.Provider provider) {
        Mdoc.ClientMetadata clientMetadata;
        String requestJsonString;
        a.b bVar;
        Intrinsics.checkNotNullParameter(provider, "<this>");
        if (!Intrinsics.c(provider.getProviderType(), "google_wallet") || (clientMetadata = provider.getClientMetadata()) == null || (requestJsonString = clientMetadata.getRequestJsonString()) == null) {
            return null;
        }
        try {
            new JSONObject(requestJsonString);
            String nonce = provider.getNonce();
            if (nonce == null) {
                return null;
            }
            String idType = provider.getIdType();
            if (!Intrinsics.c(idType, "dl")) {
                if (Intrinsics.c(idType, "pp")) {
                    bVar = a.b.PP;
                }
                return null;
            }
            bVar = a.b.DL;
            return new a.GoogleWalletRequestMetadata(nonce, bVar, requestJsonString);
        } catch (Exception unused) {
        }
    }
}
