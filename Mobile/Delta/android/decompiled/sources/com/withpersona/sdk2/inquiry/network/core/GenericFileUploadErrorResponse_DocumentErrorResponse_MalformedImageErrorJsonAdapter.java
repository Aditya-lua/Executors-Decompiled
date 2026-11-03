package com.withpersona.sdk2.inquiry.network.core;

import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import kotlin.collections.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sm.h;
import sm.m;
import sm.t;
import sm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class GenericFileUploadErrorResponse_DocumentErrorResponse_MalformedImageErrorJsonAdapter extends h<GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError> {

    @NotNull
    private final h<GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError.Details> detailsAdapter;

    @NotNull
    private final m.b options = m.b.a(Title.type, "code", "details");

    @NotNull
    private final h<String> stringAdapter;

    public GenericFileUploadErrorResponse_DocumentErrorResponse_MalformedImageErrorJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, q0.d(), Title.type);
        this.detailsAdapter = wVar.f(GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError.Details.class, q0.d(), "details");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(94);
        sb2.append("GeneratedJsonAdapter(GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError)");
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // sm.h
    @NotNull
    public GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError fromJson(@NotNull m mVar) {
        mVar.b();
        String strFromJson = null;
        String strFromJson2 = null;
        GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError.Details detailsFromJson = null;
        while (mVar.f()) {
            int iF = mVar.F(this.options);
            if (iF == -1) {
                mVar.M();
                mVar.P();
            } else if (iF == 0) {
                strFromJson = this.stringAdapter.fromJson(mVar);
                if (strFromJson == null) {
                    throw um.c.x(Title.type, Title.type, mVar);
                }
            } else if (iF == 1) {
                strFromJson2 = this.stringAdapter.fromJson(mVar);
                if (strFromJson2 == null) {
                    throw um.c.x("code", "code", mVar);
                }
            } else if (iF == 2 && (detailsFromJson = this.detailsAdapter.fromJson(mVar)) == null) {
                throw um.c.x("details", "details", mVar);
            }
        }
        mVar.d();
        if (strFromJson == null) {
            throw um.c.o(Title.type, Title.type, mVar);
        }
        if (strFromJson2 == null) {
            throw um.c.o("code", "code", mVar);
        }
        if (detailsFromJson != null) {
            return new GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError(strFromJson, strFromJson2, detailsFromJson);
        }
        throw um.c.o("details", "details", mVar);
    }

    @Override // sm.h
    public void toJson(@NotNull t tVar, @Nullable GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError malformedImageError) {
        if (malformedImageError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.c();
        tVar.n(Title.type);
        this.stringAdapter.toJson(tVar, malformedImageError.getTitle());
        tVar.n("code");
        this.stringAdapter.toJson(tVar, malformedImageError.getCode());
        tVar.n("details");
        this.detailsAdapter.toJson(tVar, malformedImageError.getDetails());
        tVar.g();
    }
}
