package com.withpersona.sdk2.inquiry.permissions.permissionRequest;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nu.b0;
import nu.g0;
import nu.i;
import nu.i0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0096A¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/b;", "Lnu/g0;", "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$PermissionRequestFragmentResult;", "<init>", "()V", "result", "", "b", "(Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/PermissionRequestFragment$PermissionRequestFragmentResult;)Z", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "a", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements g0<PermissionRequestFragment.PermissionRequestFragmentResult> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final b0<PermissionRequestFragment.PermissionRequestFragmentResult> f12345c = i0.b(0, 1, mu.a.DROP_OLDEST, 1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0<PermissionRequestFragment.PermissionRequestFragmentResult> f12346a = f12345c;

    public final boolean b(@NotNull PermissionRequestFragment.PermissionRequestFragmentResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        return f12345c.a(result);
    }

    @Override // nu.g0, nu.h
    @Nullable
    public Object collect(@NotNull i<? super PermissionRequestFragment.PermissionRequestFragmentResult> iVar, @NotNull nt.b<?> bVar) {
        return this.f12346a.collect(iVar, bVar);
    }
}
