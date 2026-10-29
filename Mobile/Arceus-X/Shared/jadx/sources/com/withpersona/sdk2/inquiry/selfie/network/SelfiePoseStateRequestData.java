package com.withpersona.sdk2.inquiry.selfie.network;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\t\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateRequestData;", "", "", Payload.TYPE, "id", "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateRequestAttributes;", "attributes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateRequestAttributes;)V", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateRequestAttributes;", "()Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateRequestAttributes;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final class SelfiePoseStateRequestData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final SelfiePoseStateRequestAttributes attributes;

    public SelfiePoseStateRequestData(@NotNull String type, @NotNull String id2, @NotNull SelfiePoseStateRequestAttributes attributes) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.type = type;
        this.id = id2;
        this.attributes = attributes;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final SelfiePoseStateRequestAttributes getAttributes() {
        return this.attributes;
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
