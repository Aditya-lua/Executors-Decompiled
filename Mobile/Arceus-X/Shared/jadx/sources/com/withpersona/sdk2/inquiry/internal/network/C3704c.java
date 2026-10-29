package com.withpersona.sdk2.inquiry.internal.network;

import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p229jt.C7345l;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;", "a", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;", "inquiry-internal_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3704c {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ErrorRequest.EnumC3699a m18722a(@NotNull InternalErrorInfo internalErrorInfo) {
        Intrinsics.checkNotNullParameter(internalErrorInfo, "<this>");
        if (internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo) {
            return ErrorRequest.EnumC3699a.Network;
        }
        if (internalErrorInfo instanceof InternalErrorInfo.IntegrationErrorInfo) {
            return ErrorRequest.EnumC3699a.Other;
        }
        if (internalErrorInfo instanceof InternalErrorInfo.PermissionErrorInfo) {
            return ErrorRequest.EnumC3699a.Permissions;
        }
        if (internalErrorInfo instanceof InternalErrorInfo.CameraErrorInfo) {
            return ErrorRequest.EnumC3699a.Camera;
        }
        if (!(internalErrorInfo instanceof InternalErrorInfo.ConfigurationErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.NoDiskSpaceErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.WebRtcIntegrationErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.UnknownErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.InvalidOneTimeLinkCode)) {
            throw new C7345l();
        }
        return ErrorRequest.EnumC3699a.Other;
    }
}
