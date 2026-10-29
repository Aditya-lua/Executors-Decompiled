package com.withpersona.sdk2.inquiry.tracking.network;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.InterfaceC11872g;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;", "", "version", "", "publicKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getVersion", "()Ljava/lang/String;", "getPublicKey", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final /* data */ class PublicKeyResponse {

    @NotNull
    private final String publicKey;

    @NotNull
    private final String version;

    public PublicKeyResponse(@InterfaceC11872g(name = "version") @NotNull String str, @InterfaceC11872g(name = "publicKey") @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.version = str;
        this.publicKey = str2;
    }

    public static /* synthetic */ PublicKeyResponse copy$default(PublicKeyResponse publicKeyResponse, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = publicKeyResponse.version;
        }
        if ((i10 & 2) != 0) {
            str2 = publicKeyResponse.publicKey;
        }
        return publicKeyResponse.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPublicKey() {
        return this.publicKey;
    }

    @NotNull
    public final PublicKeyResponse copy(@InterfaceC11872g(name = "version") @NotNull String version, @InterfaceC11872g(name = "publicKey") @NotNull String publicKey) {
        version.getClass();
        publicKey.getClass();
        return new PublicKeyResponse(version, publicKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PublicKeyResponse)) {
            return false;
        }
        PublicKeyResponse publicKeyResponse = (PublicKeyResponse) other;
        return Intrinsics.m31980c(this.version, publicKeyResponse.version) && Intrinsics.m31980c(this.publicKey, publicKeyResponse.publicKey);
    }

    @NotNull
    public final String getPublicKey() {
        return this.publicKey;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.publicKey.hashCode() + (this.version.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "PublicKeyResponse(version=" + this.version + ", publicKey=" + this.publicKey + ")";
    }
}
