package com.withpersona.sdk2.inquiry.network.core;

import kotlin.collections.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sm.h;
import sm.m;
import sm.t;
import sm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class InternalErrorInfo_PermissionErrorInfoJsonAdapter extends h<InternalErrorInfo.PermissionErrorInfo> {

    @NotNull
    private final m.b options = m.b.a("message");

    @NotNull
    private final h<String> stringAdapter;

    public InternalErrorInfo_PermissionErrorInfoJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, q0.d(), "message");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(59);
        sb2.append("GeneratedJsonAdapter(InternalErrorInfo.PermissionErrorInfo)");
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // sm.h
    @NotNull
    public InternalErrorInfo.PermissionErrorInfo fromJson(@NotNull m mVar) {
        mVar.b();
        String strFromJson = null;
        while (mVar.f()) {
            int iF = mVar.F(this.options);
            if (iF == -1) {
                mVar.M();
                mVar.P();
            } else if (iF == 0 && (strFromJson = this.stringAdapter.fromJson(mVar)) == null) {
                throw um.c.x("message", "message", mVar);
            }
        }
        mVar.d();
        if (strFromJson != null) {
            return new InternalErrorInfo.PermissionErrorInfo(strFromJson);
        }
        throw um.c.o("message", "message", mVar);
    }

    @Override // sm.h
    public void toJson(@NotNull t tVar, @Nullable InternalErrorInfo.PermissionErrorInfo permissionErrorInfo) {
        if (permissionErrorInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.c();
        tVar.n("message");
        this.stringAdapter.toJson(tVar, permissionErrorInfo.getMessage());
        tVar.g();
    }
}
