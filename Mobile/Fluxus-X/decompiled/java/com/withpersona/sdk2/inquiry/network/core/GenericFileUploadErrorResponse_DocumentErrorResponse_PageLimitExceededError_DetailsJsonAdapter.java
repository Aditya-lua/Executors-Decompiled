package com.withpersona.sdk2.inquiry.network.core;

import hn.h;
import hn.m;
import hn.t;
import hn.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.collections.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class GenericFileUploadErrorResponse_DocumentErrorResponse_PageLimitExceededError_DetailsJsonAdapter extends h<GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError.Details> {

    @NotNull
    private final h<Integer> intAdapter;

    @NotNull
    private final m.b options = m.b.a("page_limit");

    public GenericFileUploadErrorResponse_DocumentErrorResponse_PageLimitExceededError_DetailsJsonAdapter(@NotNull w wVar) {
        this.intAdapter = wVar.f(Integer.TYPE, q0.d(), "pageLimit");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(105);
        sb2.append("GeneratedJsonAdapter(GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError.Details)");
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // hn.h
    @NotNull
    public GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError.Details fromJson(@NotNull m mVar) {
        mVar.b();
        Integer numFromJson = null;
        while (mVar.f()) {
            int I = mVar.I(this.options);
            if (I == -1) {
                mVar.O();
                mVar.Q();
            } else if (I == 0 && (numFromJson = this.intAdapter.fromJson(mVar)) == null) {
                throw jn.c.x("pageLimit", "page_limit", mVar);
            }
        }
        mVar.d();
        if (numFromJson != null) {
            return new GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError.Details(numFromJson.intValue());
        }
        throw jn.c.o("pageLimit", "page_limit", mVar);
    }

    @Override // hn.h
    public void toJson(@NotNull t tVar, @Nullable GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError.Details details) {
        if (details == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.c();
        tVar.o("page_limit");
        this.intAdapter.toJson(tVar, Integer.valueOf(details.getPageLimit()));
        tVar.g();
    }
}
