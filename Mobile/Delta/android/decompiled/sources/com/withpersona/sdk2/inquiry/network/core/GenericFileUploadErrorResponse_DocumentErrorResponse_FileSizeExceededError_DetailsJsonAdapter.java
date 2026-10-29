package com.withpersona.sdk2.inquiry.network.core;

import kotlin.collections.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.h;
import um.m;
import um.t;
import um.w;

/* JADX INFO: loaded from: classes3.dex */
public final class GenericFileUploadErrorResponse_DocumentErrorResponse_FileSizeExceededError_DetailsJsonAdapter extends h<GenericFileUploadErrorResponse.DocumentErrorResponse.FileSizeExceededError.Details> {

    @NotNull
    private final h<Long> nullableLongAdapter;

    @NotNull
    private final m.b options = m.b.a("file_size_limit");

    public GenericFileUploadErrorResponse_DocumentErrorResponse_FileSizeExceededError_DetailsJsonAdapter(@NotNull w wVar) {
        this.nullableLongAdapter = wVar.f(Long.class, q0.d(), "fileSizeLimit");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(104);
        sb2.append("GeneratedJsonAdapter(GenericFileUploadErrorResponse.DocumentErrorResponse.FileSizeExceededError.Details)");
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // um.h
    @NotNull
    public GenericFileUploadErrorResponse.DocumentErrorResponse.FileSizeExceededError.Details fromJson(@NotNull m mVar) {
        mVar.b();
        Long lFromJson = null;
        while (mVar.f()) {
            int iF = mVar.F(this.options);
            if (iF == -1) {
                mVar.M();
                mVar.P();
            } else if (iF == 0) {
                lFromJson = this.nullableLongAdapter.fromJson(mVar);
            }
        }
        mVar.d();
        return new GenericFileUploadErrorResponse.DocumentErrorResponse.FileSizeExceededError.Details(lFromJson);
    }

    @Override // um.h
    public void toJson(@NotNull t tVar, @Nullable GenericFileUploadErrorResponse.DocumentErrorResponse.FileSizeExceededError.Details details) {
        if (details == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.c();
        tVar.n("file_size_limit");
        this.nullableLongAdapter.toJson(tVar, details.getFileSizeLimit());
        tVar.g();
    }
}
