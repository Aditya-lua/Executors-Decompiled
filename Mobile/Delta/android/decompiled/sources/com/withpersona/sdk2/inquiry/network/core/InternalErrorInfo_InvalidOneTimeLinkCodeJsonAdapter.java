package com.withpersona.sdk2.inquiry.network.core;

import kotlin.collections.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.h;
import um.m;
import um.t;
import um.w;

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
    @Override // um.h
    @NotNull
    public InternalErrorInfo.InvalidOneTimeLinkCode fromJson(@NotNull m mVar) {
        mVar.b();
        String strFromJson = null;
        while (mVar.f()) {
            int iF = mVar.F(this.options);
            if (iF == -1) {
                mVar.M();
                mVar.P();
            } else if (iF == 0 && (strFromJson = this.stringAdapter.fromJson(mVar)) == null) {
                throw wm.c.x("oneTimeLinkCode", "oneTimeLinkCode", mVar);
            }
        }
        mVar.d();
        if (strFromJson != null) {
            return new InternalErrorInfo.InvalidOneTimeLinkCode(strFromJson);
        }
        throw wm.c.o("oneTimeLinkCode", "oneTimeLinkCode", mVar);
    }

    @Override // um.h
    public void toJson(@NotNull t tVar, @Nullable InternalErrorInfo.InvalidOneTimeLinkCode invalidOneTimeLinkCode) {
        if (invalidOneTimeLinkCode == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.c();
        tVar.n("oneTimeLinkCode");
        this.stringAdapter.toJson(tVar, invalidOneTimeLinkCode.getOneTimeLinkCode());
        tVar.g();
    }
}
