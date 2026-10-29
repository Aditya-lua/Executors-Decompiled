package com.withpersona.sdk2.inquiry.network.core;

import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import kotlin.collections.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.h;
import um.m;
import um.t;
import um.w;

/* JADX INFO: loaded from: classes3.dex */
public final class GenericFileUploadErrorResponse_DocumentErrorResponse_FileSizeExceededErrorJsonAdapter extends h<GenericFileUploadErrorResponse.DocumentErrorResponse.FileSizeExceededError> {

    @NotNull
    private final h<GenericFileUploadErrorResponse.DocumentErrorResponse.FileSizeExceededError.Details> detailsAdapter;

    @NotNull
    private final m.b options = m.b.a(Title.type, "code", "details");

    @NotNull
    private final h<String> stringAdapter;

    public GenericFileUploadErrorResponse_DocumentErrorResponse_FileSizeExceededErrorJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, q0.d(), Title.type);
        this.detailsAdapter = wVar.f(GenericFileUploadErrorResponse.DocumentErrorResponse.FileSizeExceededError.Details.class, q0.d(), "details");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(96);
        sb2.append("GeneratedJsonAdapter(GenericFileUploadErrorResponse.DocumentErrorResponse.FileSizeExceededError)");
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // um.h
    @NotNull
    public GenericFileUploadErrorResponse.DocumentErrorResponse.FileSizeExceededError fromJson(@NotNull m mVar) {
        mVar.b();
        String strFromJson = null;
        String strFromJson2 = null;
        GenericFileUploadErrorResponse.DocumentErrorResponse.FileSizeExceededError.Details detailsFromJson = null;
        while (mVar.f()) {
            int iF = mVar.F(this.options);
            if (iF == -1) {
                mVar.M();
                mVar.P();
            } else if (iF == 0) {
                strFromJson = this.stringAdapter.fromJson(mVar);
                if (strFromJson == null) {
                    throw wm.c.x(Title.type, Title.type, mVar);
                }
            } else if (iF == 1) {
                strFromJson2 = this.stringAdapter.fromJson(mVar);
                if (strFromJson2 == null) {
                    throw wm.c.x("code", "code", mVar);
                }
            } else if (iF == 2 && (detailsFromJson = this.detailsAdapter.fromJson(mVar)) == null) {
                throw wm.c.x("details", "details", mVar);
            }
        }
        mVar.d();
        if (strFromJson == null) {
            throw wm.c.o(Title.type, Title.type, mVar);
        }
        if (strFromJson2 == null) {
            throw wm.c.o("code", "code", mVar);
        }
        if (detailsFromJson != null) {
            return new GenericFileUploadErrorResponse.DocumentErrorResponse.FileSizeExceededError(strFromJson, strFromJson2, detailsFromJson);
        }
        throw wm.c.o("details", "details", mVar);
    }

    @Override // um.h
    public void toJson(@NotNull t tVar, @Nullable GenericFileUploadErrorResponse.DocumentErrorResponse.FileSizeExceededError fileSizeExceededError) {
        if (fileSizeExceededError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.c();
        tVar.n(Title.type);
        this.stringAdapter.toJson(tVar, fileSizeExceededError.getTitle());
        tVar.n("code");
        this.stringAdapter.toJson(tVar, fileSizeExceededError.getCode());
        tVar.n("details");
        this.detailsAdapter.toJson(tVar, fileSizeExceededError.getDetails());
        tVar.g();
    }
}
