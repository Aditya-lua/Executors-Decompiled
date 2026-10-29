package com.withpersona.sdk2.inquiry.network.core;

import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import java.lang.reflect.Constructor;
import kotlin.collections.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.h;
import um.m;
import um.t;
import um.w;

/* JADX INFO: loaded from: classes3.dex */
public final class GenericFileUploadErrorResponse_DocumentErrorResponse_UnknownErrorJsonAdapter extends h<GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError> {

    @Nullable
    private volatile Constructor<GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError> constructorRef;

    @NotNull
    private final h<ErrorDetails> nullableErrorDetailsAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(Title.type, "code", "details");

    @NotNull
    private final h<String> stringAdapter;

    public GenericFileUploadErrorResponse_DocumentErrorResponse_UnknownErrorJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, q0.d(), Title.type);
        this.nullableStringAdapter = wVar.f(String.class, q0.d(), "code");
        this.nullableErrorDetailsAdapter = wVar.f(ErrorDetails.class, q0.d(), "details");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(87);
        sb2.append("GeneratedJsonAdapter(GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError)");
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // um.h
    @NotNull
    public GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError fromJson(@NotNull m mVar) throws NoSuchMethodException {
        mVar.b();
        String strFromJson = null;
        String strFromJson2 = null;
        ErrorDetails errorDetailsFromJson = null;
        int i10 = -1;
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
                i10 &= -2;
            } else if (iF == 1) {
                strFromJson2 = this.nullableStringAdapter.fromJson(mVar);
                i10 &= -3;
            } else if (iF == 2) {
                errorDetailsFromJson = this.nullableErrorDetailsAdapter.fromJson(mVar);
                i10 &= -5;
            }
        }
        mVar.d();
        if (i10 == -8) {
            return new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(strFromJson, strFromJson2, errorDetailsFromJson);
        }
        Constructor<GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError.class.getDeclaredConstructor(String.class, String.class, ErrorDetails.class, Integer.TYPE, wm.c.f34445c);
            this.constructorRef = declaredConstructor;
        }
        return declaredConstructor.newInstance(strFromJson, strFromJson2, errorDetailsFromJson, Integer.valueOf(i10), null);
    }

    @Override // um.h
    public void toJson(@NotNull t tVar, @Nullable GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError unknownError) {
        if (unknownError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.c();
        tVar.n(Title.type);
        this.stringAdapter.toJson(tVar, unknownError.getTitle());
        tVar.n("code");
        this.nullableStringAdapter.toJson(tVar, unknownError.getCode());
        tVar.n("details");
        this.nullableErrorDetailsAdapter.toJson(tVar, unknownError.getDetails());
        tVar.g();
    }
}
