package com.withpersona.sdk2.inquiry.network.core;

import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import hn.h;
import hn.m;
import hn.t;
import hn.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.collections.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class GenericFileUploadErrorResponse_DocumentErrorResponse_PageLimitExceededErrorJsonAdapter extends h<GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError> {

    @NotNull
    private final h<GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError.Details> detailsAdapter;

    @NotNull
    private final m.b options = m.b.a(Title.type, "code", "details");

    @NotNull
    private final h<String> stringAdapter;

    public GenericFileUploadErrorResponse_DocumentErrorResponse_PageLimitExceededErrorJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, q0.d(), Title.type);
        this.detailsAdapter = wVar.f(GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError.Details.class, q0.d(), "details");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(97);
        sb2.append("GeneratedJsonAdapter(GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError)");
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // hn.h
    @NotNull
    public GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError fromJson(@NotNull m mVar) {
        mVar.b();
        String strFromJson = null;
        String strFromJson2 = null;
        GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError.Details detailsFromJson = null;
        while (mVar.f()) {
            int I = mVar.I(this.options);
            if (I == -1) {
                mVar.O();
                mVar.Q();
            } else if (I == 0) {
                strFromJson = this.stringAdapter.fromJson(mVar);
                if (strFromJson == null) {
                    throw jn.c.x(Title.type, Title.type, mVar);
                }
            } else if (I == 1) {
                strFromJson2 = this.stringAdapter.fromJson(mVar);
                if (strFromJson2 == null) {
                    throw jn.c.x("code", "code", mVar);
                }
            } else if (I == 2 && (detailsFromJson = this.detailsAdapter.fromJson(mVar)) == null) {
                throw jn.c.x("details", "details", mVar);
            }
        }
        mVar.d();
        if (strFromJson == null) {
            throw jn.c.o(Title.type, Title.type, mVar);
        }
        if (strFromJson2 == null) {
            throw jn.c.o("code", "code", mVar);
        }
        if (detailsFromJson != null) {
            return new GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError(strFromJson, strFromJson2, detailsFromJson);
        }
        throw jn.c.o("details", "details", mVar);
    }

    @Override // hn.h
    public void toJson(@NotNull t tVar, @Nullable GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError pageLimitExceededError) {
        if (pageLimitExceededError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.c();
        tVar.o(Title.type);
        this.stringAdapter.toJson(tVar, pageLimitExceededError.getTitle());
        tVar.o("code");
        this.stringAdapter.toJson(tVar, pageLimitExceededError.getCode());
        tVar.o("details");
        this.detailsAdapter.toJson(tVar, pageLimitExceededError.getDetails());
        tVar.g();
    }
}
