package com.withpersona.sdk2.inquiry.steps.p056ui.mdoc;

import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Mdoc;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.mdoc.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Provider;", "Lcom/withpersona/sdk2/inquiry/steps/ui/mdoc/MdocRequestMetadata;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc$Provider;)Lcom/withpersona/sdk2/inquiry/steps/ui/mdoc/MdocRequestMetadata;", "ui-step-renderer_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4090a {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final MdocRequestMetadata m20907a(@NotNull Mdoc.Provider provider) {
        Mdoc.ClientMetadata clientMetadata;
        String requestJsonString;
        MdocRequestMetadata.EnumC4089a enumC4089a;
        Intrinsics.checkNotNullParameter(provider, "<this>");
        if (!Intrinsics.m31980c(provider.getProviderType(), "google_wallet") || (clientMetadata = provider.getClientMetadata()) == null || (requestJsonString = clientMetadata.getRequestJsonString()) == null) {
            return null;
        }
        try {
            new JSONObject(requestJsonString);
            String nonce = provider.getNonce();
            if (nonce == null) {
                return null;
            }
            String idType = provider.getIdType();
            if (!Intrinsics.m31980c(idType, "dl")) {
                if (Intrinsics.m31980c(idType, "pp")) {
                    enumC4089a = MdocRequestMetadata.EnumC4089a.PP;
                }
                return null;
            }
            enumC4089a = MdocRequestMetadata.EnumC4089a.DL;
            return new MdocRequestMetadata.GoogleWalletRequestMetadata(nonce, enumC4089a, requestJsonString);
        } catch (Exception unused) {
        }
    }
}
