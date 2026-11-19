package com.withpersona.sdk2.inquiry.network.core;

import hn.h;
import hn.m;
import hn.t;
import hn.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.collections.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class InternalErrorInfo_InvalidOneTimeLinkCodeJsonAdapter extends h<InternalErrorInfo.InvalidOneTimeLinkCode> {

    @NotNull
    private final m.b options = m.b.a("oneTimeLinkCode");

    @NotNull
    private final h<String> stringAdapter;

    public InternalErrorInfo_InvalidOneTimeLinkCodeJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, q0.d(), "oneTimeLinkCode");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(62);
        sb2.append("GeneratedJsonAdapter(InternalErrorInfo.InvalidOneTimeLinkCode)");
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // hn.h
    @NotNull
    public InternalErrorInfo.InvalidOneTimeLinkCode fromJson(@NotNull m mVar) {
        mVar.b();
        String strFromJson = null;
        while (mVar.f()) {
            int I = mVar.I(this.options);
            if (I == -1) {
                mVar.O();
                mVar.Q();
            } else if (I == 0 && (strFromJson = this.stringAdapter.fromJson(mVar)) == null) {
                throw jn.c.x("oneTimeLinkCode", "oneTimeLinkCode", mVar);
            }
        }
        mVar.d();
        if (strFromJson != null) {
            return new InternalErrorInfo.InvalidOneTimeLinkCode(strFromJson);
        }
        throw jn.c.o("oneTimeLinkCode", "oneTimeLinkCode", mVar);
    }

    @Override // hn.h
    public void toJson(@NotNull t tVar, @Nullable InternalErrorInfo.InvalidOneTimeLinkCode invalidOneTimeLinkCode) {
        if (invalidOneTimeLinkCode == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.c();
        tVar.o("oneTimeLinkCode");
        this.stringAdapter.toJson(tVar, invalidOneTimeLinkCode.getOneTimeLinkCode());
        tVar.g();
    }
}
