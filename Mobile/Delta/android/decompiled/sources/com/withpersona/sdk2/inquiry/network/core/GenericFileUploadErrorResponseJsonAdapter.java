package com.withpersona.sdk2.inquiry.network.core;

import java.util.List;
import kotlin.collections.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.a0;
import um.h;
import um.m;
import um.t;
import um.w;

/* JADX INFO: loaded from: classes3.dex */
public final class GenericFileUploadErrorResponseJsonAdapter extends h<GenericFileUploadErrorResponse> {

    @NotNull
    private final h<List<GenericFileUploadErrorResponse.DocumentErrorResponse>> listOfDocumentErrorResponseAdapter;

    @NotNull
    private final m.b options = m.b.a("errors");

    public GenericFileUploadErrorResponseJsonAdapter(@NotNull w wVar) {
        this.listOfDocumentErrorResponseAdapter = wVar.f(a0.j(List.class, GenericFileUploadErrorResponse.DocumentErrorResponse.class), q0.d(), "errors");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(52);
        sb2.append("GeneratedJsonAdapter(GenericFileUploadErrorResponse)");
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // um.h
    @NotNull
    public GenericFileUploadErrorResponse fromJson(@NotNull m mVar) {
        mVar.b();
        List<GenericFileUploadErrorResponse.DocumentErrorResponse> listFromJson = null;
        while (mVar.f()) {
            int iF = mVar.F(this.options);
            if (iF == -1) {
                mVar.M();
                mVar.P();
            } else if (iF == 0 && (listFromJson = this.listOfDocumentErrorResponseAdapter.fromJson(mVar)) == null) {
                throw wm.c.x("errors", "errors", mVar);
            }
        }
        mVar.d();
        if (listFromJson != null) {
            return new GenericFileUploadErrorResponse(listFromJson);
        }
        throw wm.c.o("errors", "errors", mVar);
    }

    @Override // um.h
    public void toJson(@NotNull t tVar, @Nullable GenericFileUploadErrorResponse genericFileUploadErrorResponse) {
        if (genericFileUploadErrorResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.c();
        tVar.n("errors");
        this.listOfDocumentErrorResponseAdapter.toJson(tVar, genericFileUploadErrorResponse.getErrors());
        tVar.g();
    }
}
