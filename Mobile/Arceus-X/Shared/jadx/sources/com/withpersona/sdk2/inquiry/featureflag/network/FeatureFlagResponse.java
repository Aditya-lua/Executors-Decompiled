package com.withpersona.sdk2.inquiry.featureflag.network;

import com.appsflyer.sdk_base.referrer.Payload;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p471um.InterfaceC11872g;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\u000b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse;", "", "", "Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse$FeatureFlagDataResponse;", "data", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "FeatureFlagDataResponse", "feature-flag_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final class FeatureFlagResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<FeatureFlagDataResponse> data;

    @Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/featureflag/network/FeatureFlagResponse$FeatureFlagDataResponse;", "", "", "id", Payload.TYPE, "", "enabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "Z", "()Z", "feature-flag_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class FeatureFlagDataResponse {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String id;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String type;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final boolean enabled;

        public FeatureFlagDataResponse(@InterfaceC11872g(name = "id") @NotNull String id2, @InterfaceC11872g(name = Payload.TYPE) @NotNull String type, @InterfaceC11872g(name = "enabled") boolean z10) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(type, "type");
            this.id = id2;
            this.type = type;
            this.enabled = z10;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getEnabled() {
            return this.enabled;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getType() {
            return this.type;
        }
    }

    public FeatureFlagResponse(@NotNull List<FeatureFlagDataResponse> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<FeatureFlagDataResponse> m16913a() {
        return this.data;
    }
}
