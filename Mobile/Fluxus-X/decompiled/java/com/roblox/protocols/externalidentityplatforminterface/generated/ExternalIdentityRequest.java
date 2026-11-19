package com.roblox.protocols.externalidentityplatforminterface.generated;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class ExternalIdentityRequest {
    final String browserStartUrl;
    final String nonce;
    final ExternalIdentityProvider provider;

    public ExternalIdentityRequest(ExternalIdentityProvider externalIdentityProvider, String str, String str2) {
        this.provider = externalIdentityProvider;
        this.nonce = str;
        this.browserStartUrl = str2;
    }

    public String getBrowserStartUrl() {
        return this.browserStartUrl;
    }

    public String getNonce() {
        return this.nonce;
    }

    public ExternalIdentityProvider getProvider() {
        return this.provider;
    }

    public String toString() {
        return "ExternalIdentityRequest{provider=" + this.provider + ",nonce=" + this.nonce + ",browserStartUrl=" + this.browserStartUrl + "}";
    }
}
