package com.withpersona.sdk2.inquiry.network.core;

import hn.h;
import hn.m;
import hn.t;
import hn.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.collections.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class InternalErrorInfo_UnknownErrorInfoJsonAdapter extends h<InternalErrorInfo.UnknownErrorInfo> {

    @NotNull
    private final m.b options = m.b.a("message");

    @NotNull
    private final h<String> stringAdapter;

    public InternalErrorInfo_UnknownErrorInfoJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, q0.d(), "message");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(56);
        sb2.append("GeneratedJsonAdapter(InternalErrorInfo.UnknownErrorInfo)");
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // hn.h
    @NotNull
    public InternalErrorInfo.UnknownErrorInfo fromJson(@NotNull m mVar) {
        mVar.b();
        String strFromJson = null;
        while (mVar.f()) {
            int I = mVar.I(this.options);
            if (I == -1) {
                mVar.O();
                mVar.Q();
            } else if (I == 0 && (strFromJson = this.stringAdapter.fromJson(mVar)) == null) {
                throw jn.c.x("message", "message", mVar);
            }
        }
        mVar.d();
        if (strFromJson != null) {
            return new InternalErrorInfo.UnknownErrorInfo(strFromJson);
        }
        throw jn.c.o("message", "message", mVar);
    }

    @Override // hn.h
    public void toJson(@NotNull t tVar, @Nullable InternalErrorInfo.UnknownErrorInfo unknownErrorInfo) {
        if (unknownErrorInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.c();
        tVar.o("message");
        this.stringAdapter.toJson(tVar, unknownErrorInfo.getMessage());
        tVar.g();
    }
}
