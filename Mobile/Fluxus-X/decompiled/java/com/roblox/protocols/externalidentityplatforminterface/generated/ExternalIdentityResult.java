package com.roblox.protocols.externalidentityplatforminterface.generated;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class ExternalIdentityResult {
    final String errorClass;
    final ExternalIdentityProofType proofType;
    final ExternalIdentityProvider provider;
    final ExternalIdentityStatus status;

    public ExternalIdentityResult(ExternalIdentityProvider externalIdentityProvider, ExternalIdentityStatus externalIdentityStatus, ExternalIdentityProofType externalIdentityProofType, String str) {
        this.provider = externalIdentityProvider;
        this.status = externalIdentityStatus;
        this.proofType = externalIdentityProofType;
        this.errorClass = str;
    }

    public String getErrorClass() {
        return this.errorClass;
    }

    public ExternalIdentityProofType getProofType() {
        return this.proofType;
    }

    public ExternalIdentityProvider getProvider() {
        return this.provider;
    }

    public ExternalIdentityStatus getStatus() {
        return this.status;
    }

    public String toString() {
        return "ExternalIdentityResult{provider=" + this.provider + ",status=" + this.status + ",proofType=" + this.proofType + ",errorClass=" + this.errorClass + "}";
    }
}
