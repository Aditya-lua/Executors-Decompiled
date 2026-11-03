package com.withpersona.sdk2.inquiry.permissions.state;

import androidx.p000lifecycle.l0;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import dt.e;
import dt.i;
import sp.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements PermissionRequestStateManager.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f12481a;

    public a(l lVar) {
        this.f12481a = lVar;
    }

    public static i<PermissionRequestStateManager.c> b(l lVar) {
        return e.a(new a(lVar));
    }

    @Override // com.withpersona.sdk2.inquiry.permissions.state.PermissionRequestStateManager.c
    public PermissionRequestStateManager a(PermissionRequestWorkflow.Props props, l0 l0Var) {
        return this.f12481a.b(props, l0Var);
    }
}
