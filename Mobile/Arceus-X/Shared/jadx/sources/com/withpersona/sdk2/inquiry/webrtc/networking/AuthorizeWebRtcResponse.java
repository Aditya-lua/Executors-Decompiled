package com.withpersona.sdk2.inquiry.webrtc.networking;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import p471um.InterfaceC11872g;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\b\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;", "", "", "username", "credential", "serverUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "webrtc_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final class AuthorizeWebRtcResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final String username;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final String credential;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String serverUrl;

    public AuthorizeWebRtcResponse(@Nullable String str, @Nullable String str2, @InterfaceC11872g(name = "server_url") @Nullable String str3) {
        this.username = str;
        this.credential = str2;
        this.serverUrl = str3;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCredential() {
        return this.credential;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getServerUrl() {
        return this.serverUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getUsername() {
        return this.username;
    }
}
