package com.withpersona.sdk2.inquiry.permissions.permissionRequest;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.p616lifecycle.InterfaceC0954f;
import androidx.p616lifecycle.InterfaceC0980s;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.C3877g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p093e4.InterfaceC4810f0;
import p456u2.C11774c;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.permissionRequest.g */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0013B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/g;", "", "<init>", "()V", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "viewId", "Landroidx/lifecycle/s;", "lifecycleOwner", "", "d", "(Landroidx/fragment/app/FragmentManager;ILandroidx/lifecycle/s;)V", "", "requestId", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;", "props", "c", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)V", "a", "Landroidx/fragment/app/FragmentManager;", "b", "Ljava/lang/Integer;", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3877g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public FragmentManager fragmentManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Integer viewId;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.permissions.permissionRequest.g$b */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"com/withpersona/sdk2/inquiry/permissions/permissionRequest/g$b", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", "", "onDestroy", "(Landroidx/lifecycle/s;)V", "permissions_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b implements InterfaceC0954f {
        public b() {
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onCreate(InterfaceC0980s interfaceC0980s) {
            super.onCreate(interfaceC0980s);
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onDestroy(InterfaceC0980s owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            super.onDestroy(owner);
            C3877g.this.fragmentManager = null;
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onPause(InterfaceC0980s interfaceC0980s) {
            super.onPause(interfaceC0980s);
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onResume(InterfaceC0980s interfaceC0980s) {
            super.onResume(interfaceC0980s);
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onStart(InterfaceC0980s interfaceC0980s) {
            super.onStart(interfaceC0980s);
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onStop(InterfaceC0980s interfaceC0980s) {
            super.onStop(interfaceC0980s);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m19208e(String requestKey, Bundle result) {
        Intrinsics.checkNotNullParameter(requestKey, "requestKey");
        Intrinsics.checkNotNullParameter(result, "result");
        PermissionRequestFragment.PermissionRequestFragmentResult permissionRequestFragmentResult = (PermissionRequestFragment.PermissionRequestFragmentResult) C11774c.m44055a(result, "pi2_result", PermissionRequestFragment.PermissionRequestFragmentResult.class);
        if (permissionRequestFragmentResult != null) {
            new C3872b().m19195b(permissionRequestFragmentResult);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m19209c(@NotNull String requestId, @NotNull PermissionRequestWorkflow.Props props) {
        Integer num;
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(props, "props");
        FragmentManager fragmentManager = this.fragmentManager;
        if (fragmentManager == null || (num = this.viewId) == null) {
            return;
        }
        PermissionRequestFragment.INSTANCE.m19186a(fragmentManager, num.intValue(), requestId, props);
    }

    /* JADX INFO: renamed from: d */
    public final void m19210d(@NotNull FragmentManager fragmentManager, int viewId, @NotNull InterfaceC0980s lifecycleOwner) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.fragmentManager = fragmentManager;
        this.viewId = Integer.valueOf(viewId);
        fragmentManager.m4460t1("pi2_permission_request_request", lifecycleOwner, new InterfaceC4810f0() { // from class: tp.e
            @Override // p093e4.InterfaceC4810f0
            /* JADX INFO: renamed from: a */
            public final void mo4490a(String str, Bundle bundle) {
                C3877g.m19208e(str, bundle);
            }
        });
        lifecycleOwner.mo4656a().mo4935a(new b());
    }
}
