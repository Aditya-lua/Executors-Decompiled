package com.withpersona.sdk2.inquiry.network.core;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sm.h;
import sm.m;
import sm.t;
import sm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class GenericFileUploadErrorResponse_DocumentErrorResponse_MalformedImageError_DetailsJsonAdapter extends h<GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError.Details> {

    @NotNull
    private final m.b options = m.b.a(new String[0]);

    public GenericFileUploadErrorResponse_DocumentErrorResponse_MalformedImageError_DetailsJsonAdapter(@NotNull w wVar) {
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(102);
        sb2.append("GeneratedJsonAdapter(GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError.Details)");
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // sm.h
    @NotNull
    public GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError.Details fromJson(@NotNull m mVar) {
        mVar.b();
        while (mVar.f()) {
            if (mVar.F(this.options) == -1) {
                mVar.M();
                mVar.P();
            }
        }
        mVar.d();
        return new GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError.Details();
    }

    @Override // sm.h
    public void toJson(@NotNull t tVar, @Nullable GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError.Details details) {
        if (details == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.c();
        tVar.g();
    }
}
