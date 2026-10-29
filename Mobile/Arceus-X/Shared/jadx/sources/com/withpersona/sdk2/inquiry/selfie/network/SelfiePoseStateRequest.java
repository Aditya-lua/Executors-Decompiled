package com.withpersona.sdk2.inquiry.selfie.network;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateRequest;", "", "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateRequestData;", "data", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateRequestData;)V", "a", "Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateRequestData;", "()Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateRequestData;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final class SelfiePoseStateRequest {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SelfiePoseStateRequestData data;

    public SelfiePoseStateRequest(@NotNull SelfiePoseStateRequestData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final SelfiePoseStateRequestData getData() {
        return this.data;
    }
}
