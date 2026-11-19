package com.withpersona.sdk2.inquiry.network.core;

import com.google.mlkit.common.MlKitException;
import hn.h;
import hn.m;
import hn.t;
import hn.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class GenericFileUploadErrorResponse_DocumentErrorResponse_MalformedImageError_DetailsJsonAdapter extends h<GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError.Details> {

    @NotNull
    private final m.b options = m.b.a(new String[0]);

    public GenericFileUploadErrorResponse_DocumentErrorResponse_MalformedImageError_DetailsJsonAdapter(@NotNull w wVar) {
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(MlKitException.MODEL_HASH_MISMATCH);
        sb2.append("GeneratedJsonAdapter(GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError.Details)");
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // hn.h
    @NotNull
    public GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError.Details fromJson(@NotNull m mVar) {
        mVar.b();
        while (mVar.f()) {
            if (mVar.I(this.options) == -1) {
                mVar.O();
                mVar.Q();
            }
        }
        mVar.d();
        return new GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError.Details();
    }

    @Override // hn.h
    public void toJson(@NotNull t tVar, @Nullable GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError.Details details) {
        if (details == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.c();
        tVar.g();
    }
}
