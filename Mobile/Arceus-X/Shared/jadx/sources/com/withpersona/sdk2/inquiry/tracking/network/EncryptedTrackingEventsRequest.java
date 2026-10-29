package com.withpersona.sdk2.inquiry.tracking.network;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.InterfaceC11872g;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;", "", "keyVersion", "", "encryptedKey", NotificationCompat.CATEGORY_EVENT, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKeyVersion", "()Ljava/lang/String;", "getEncryptedKey", "getEvent", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final /* data */ class EncryptedTrackingEventsRequest {

    @NotNull
    private final String encryptedKey;

    @NotNull
    private final String event;

    @NotNull
    private final String keyVersion;

    public EncryptedTrackingEventsRequest(@InterfaceC11872g(name = "key_version") @NotNull String str, @InterfaceC11872g(name = "encrypted_key") @NotNull String str2, @InterfaceC11872g(name = NotificationCompat.CATEGORY_EVENT) @NotNull String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.keyVersion = str;
        this.encryptedKey = str2;
        this.event = str3;
    }

    public static /* synthetic */ EncryptedTrackingEventsRequest copy$default(EncryptedTrackingEventsRequest encryptedTrackingEventsRequest, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = encryptedTrackingEventsRequest.keyVersion;
        }
        if ((i10 & 2) != 0) {
            str2 = encryptedTrackingEventsRequest.encryptedKey;
        }
        if ((i10 & 4) != 0) {
            str3 = encryptedTrackingEventsRequest.event;
        }
        return encryptedTrackingEventsRequest.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKeyVersion() {
        return this.keyVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEncryptedKey() {
        return this.encryptedKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEvent() {
        return this.event;
    }

    @NotNull
    public final EncryptedTrackingEventsRequest copy(@InterfaceC11872g(name = "key_version") @NotNull String keyVersion, @InterfaceC11872g(name = "encrypted_key") @NotNull String encryptedKey, @InterfaceC11872g(name = NotificationCompat.CATEGORY_EVENT) @NotNull String event) {
        keyVersion.getClass();
        encryptedKey.getClass();
        event.getClass();
        return new EncryptedTrackingEventsRequest(keyVersion, encryptedKey, event);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EncryptedTrackingEventsRequest)) {
            return false;
        }
        EncryptedTrackingEventsRequest encryptedTrackingEventsRequest = (EncryptedTrackingEventsRequest) other;
        return Intrinsics.m31980c(this.keyVersion, encryptedTrackingEventsRequest.keyVersion) && Intrinsics.m31980c(this.encryptedKey, encryptedTrackingEventsRequest.encryptedKey) && Intrinsics.m31980c(this.event, encryptedTrackingEventsRequest.event);
    }

    @NotNull
    public final String getEncryptedKey() {
        return this.encryptedKey;
    }

    @NotNull
    public final String getEvent() {
        return this.event;
    }

    @NotNull
    public final String getKeyVersion() {
        return this.keyVersion;
    }

    public int hashCode() {
        return this.event.hashCode() + ((this.encryptedKey.hashCode() + (this.keyVersion.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "EncryptedTrackingEventsRequest(keyVersion=" + this.keyVersion + ", encryptedKey=" + this.encryptedKey + ", event=" + this.event + ")";
    }
}
