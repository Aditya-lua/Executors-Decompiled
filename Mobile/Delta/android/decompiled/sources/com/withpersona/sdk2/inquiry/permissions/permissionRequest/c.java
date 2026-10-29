package com.withpersona.sdk2.inquiry.permissions.permissionRequest;

import androidx.p000lifecycle.l0;
import androidx.p000lifecycle.x0;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0014B\u001b\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c;", "Landroidx/lifecycle/x0;", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$c;", "permissionRequestStateManagerFactory", "<init>", "(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$c;)V", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;", "props", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;", "e", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;", "b", "Landroidx/lifecycle/l0;", "c", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager$c;", "d", "Lcom/withpersona/sdk2/inquiry/permissions/state/PermissionRequestStateManager;", "permissionRequestStateManager", "a", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c extends x0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final l0 savedStateHandle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PermissionRequestStateManager.c permissionRequestStateManagerFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public PermissionRequestStateManager permissionRequestStateManager;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c$a;", "", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c;", "a", "(Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/c;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @NotNull
        c a(@NotNull l0 savedStateHandle);
    }

    public c(@NotNull l0 savedStateHandle, @NotNull PermissionRequestStateManager.c permissionRequestStateManagerFactory) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(permissionRequestStateManagerFactory, "permissionRequestStateManagerFactory");
        this.savedStateHandle = savedStateHandle;
        this.permissionRequestStateManagerFactory = permissionRequestStateManagerFactory;
    }

    @NotNull
    public final PermissionRequestStateManager e(@NotNull PermissionRequestWorkflow.Props props) {
        Intrinsics.checkNotNullParameter(props, "props");
        PermissionRequestStateManager permissionRequestStateManager = this.permissionRequestStateManager;
        if (permissionRequestStateManager != null) {
            return permissionRequestStateManager;
        }
        PermissionRequestStateManager permissionRequestStateManagerA = this.permissionRequestStateManagerFactory.a(props, this.savedStateHandle);
        this.permissionRequestStateManager = permissionRequestStateManagerA;
        return permissionRequestStateManagerA;
    }
}
