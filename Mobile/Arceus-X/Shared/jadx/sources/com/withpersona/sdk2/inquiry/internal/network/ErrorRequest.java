package com.withpersona.sdk2.inquiry.internal.network;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\u0007\u0010\f¨\u0006\r"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest;", "", "Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;", "errorType", "debugDescription", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;Ljava/lang/Object;)V", "a", "Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;", "b", "()Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;", "Ljava/lang/Object;", "()Ljava/lang/Object;", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final class ErrorRequest {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final EnumC3699a errorType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final Object debugDescription;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.network.ErrorRequest$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;", "", "<init>", "(Ljava/lang/String;I)V", "Camera", "Network", "Permissions", "Nfc", "Other", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = false)
    public enum EnumC3699a {
        Camera,
        Network,
        Permissions,
        Nfc,
        Other;

        private static final /* synthetic */ InterfaceC10707a $ENTRIES = C10708b.m40805a(m18649a());
    }

    public ErrorRequest(@NotNull EnumC3699a errorType, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        this.errorType = errorType;
        this.debugDescription = obj;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Object getDebugDescription() {
        return this.debugDescription;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC3699a getErrorType() {
        return this.errorType;
    }
}
