package com.withpersona.sdk2.inquiry.network.core;

import com.google.mlkit.common.MlKitException;
import hn.h;
import hn.m;
import hn.t;
import hn.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class GenericFileUploadErrorResponse_DocumentErrorResponse_MalformedFileError_DetailsJsonAdapter extends h<GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedFileError.Details> {

    @NotNull
    private final m.b options = m.b.a(new String[0]);

    public GenericFileUploadErrorResponse_DocumentErrorResponse_MalformedFileError_DetailsJsonAdapter(@NotNull w wVar) {
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(MlKitException.NOT_ENOUGH_SPACE);
        sb2.append("GeneratedJsonAdapter(GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedFileError.Details)");
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // hn.h
    @NotNull
    public GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedFileError.Details fromJson(@NotNull m mVar) {
        mVar.b();
        while (mVar.f()) {
            if (mVar.I(this.options) == -1) {
                mVar.O();
                mVar.Q();
            }
        }
        mVar.d();
        return new GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedFileError.Details();
    }

    @Override // hn.h
    public void toJson(@NotNull t tVar, @Nullable GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedFileError.Details details) {
        if (details == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.c();
        tVar.g();
    }
}
