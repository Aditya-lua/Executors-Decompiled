package com.withpersona.sdk2.inquiry.network.core;

import java.util.List;
import kotlin.collections.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sm.a0;
import sm.h;
import sm.m;
import sm.t;
import sm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class GenericFileUploadErrorResponse_DocumentErrorResponse_DisabledFileTypeError_DetailsJsonAdapter extends h<GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError.Details> {

    @NotNull
    private final h<List<String>> listOfStringAdapter;

    @NotNull
    private final m.b options = m.b.a("uploaded_file_type", "enabled_file_types");

    @NotNull
    private final h<String> stringAdapter;

    public GenericFileUploadErrorResponse_DocumentErrorResponse_DisabledFileTypeError_DetailsJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, q0.d(), "uploadedFileType");
        this.listOfStringAdapter = wVar.f(a0.j(List.class, String.class), q0.d(), "enabledFileTypes");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(104);
        sb2.append("GeneratedJsonAdapter(GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError.Details)");
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // sm.h
    @NotNull
    public GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError.Details fromJson(@NotNull m mVar) {
        mVar.b();
        String strFromJson = null;
        List<String> listFromJson = null;
        while (mVar.f()) {
            int iF = mVar.F(this.options);
            if (iF == -1) {
                mVar.M();
                mVar.P();
            } else if (iF == 0) {
                strFromJson = this.stringAdapter.fromJson(mVar);
                if (strFromJson == null) {
                    throw um.c.x("uploadedFileType", "uploaded_file_type", mVar);
                }
            } else if (iF == 1 && (listFromJson = this.listOfStringAdapter.fromJson(mVar)) == null) {
                throw um.c.x("enabledFileTypes", "enabled_file_types", mVar);
            }
        }
        mVar.d();
        if (strFromJson == null) {
            throw um.c.o("uploadedFileType", "uploaded_file_type", mVar);
        }
        if (listFromJson != null) {
            return new GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError.Details(strFromJson, listFromJson);
        }
        throw um.c.o("enabledFileTypes", "enabled_file_types", mVar);
    }

    @Override // sm.h
    public void toJson(@NotNull t tVar, @Nullable GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError.Details details) {
        if (details == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.c();
        tVar.n("uploaded_file_type");
        this.stringAdapter.toJson(tVar, details.getUploadedFileType());
        tVar.n("enabled_file_types");
        this.listOfStringAdapter.toJson(tVar, details.getEnabledFileTypes());
        tVar.g();
    }
}
