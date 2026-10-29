package com.withpersona.sdk2.inquiry.network.core;

import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import java.lang.reflect.Constructor;
import kotlin.collections.C7702q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.AbstractC11873h;
import p471um.AbstractC11878m;
import p471um.AbstractC11885t;
import p471um.C11888w;
import p522wm.C12494c;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse_DocumentErrorResponse_UnknownErrorJsonAdapter */
/* JADX INFO: loaded from: classes3.dex */
public final class C3780x99b5be6e extends AbstractC11873h<GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError> {

    @Nullable
    private volatile Constructor<GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError> constructorRef;

    @NotNull
    private final AbstractC11873h<ErrorDetails> nullableErrorDetailsAdapter;

    @NotNull
    private final AbstractC11873h<String> nullableStringAdapter;

    @NotNull
    private final AbstractC11878m.b options = AbstractC11878m.b.m44343a(Title.type, "code", "details");

    @NotNull
    private final AbstractC11873h<String> stringAdapter;

    public C3780x99b5be6e(@NotNull C11888w c11888w) {
        this.stringAdapter = c11888w.m44439f(String.class, C7702q0.m31908d(), Title.type);
        this.nullableStringAdapter = c11888w.m44439f(String.class, C7702q0.m31908d(), "code");
        this.nullableErrorDetailsAdapter = c11888w.m44439f(ErrorDetails.class, C7702q0.m31908d(), "details");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(87);
        sb2.append("GeneratedJsonAdapter(GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError)");
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p471um.AbstractC11873h
    @NotNull
    public GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError fromJson(@NotNull AbstractC11878m abstractC11878m) throws NoSuchMethodException {
        abstractC11878m.mo44325b();
        String strFromJson = null;
        String strFromJson2 = null;
        ErrorDetails errorDetailsFromJson = null;
        int i10 = -1;
        while (abstractC11878m.mo44329f()) {
            int iMo44316F = abstractC11878m.mo44316F(this.options);
            if (iMo44316F == -1) {
                abstractC11878m.mo44320M();
                abstractC11878m.mo44321P();
            } else if (iMo44316F == 0) {
                strFromJson = this.stringAdapter.fromJson(abstractC11878m);
                if (strFromJson == null) {
                    throw C12494c.m46811x(Title.type, Title.type, abstractC11878m);
                }
                i10 &= -2;
            } else if (iMo44316F == 1) {
                strFromJson2 = this.nullableStringAdapter.fromJson(abstractC11878m);
                i10 &= -3;
            } else if (iMo44316F == 2) {
                errorDetailsFromJson = this.nullableErrorDetailsAdapter.fromJson(abstractC11878m);
                i10 &= -5;
            }
        }
        abstractC11878m.mo44327d();
        if (i10 == -8) {
            return new GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError(strFromJson, strFromJson2, errorDetailsFromJson);
        }
        Constructor<GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError.class.getDeclaredConstructor(String.class, String.class, ErrorDetails.class, Integer.TYPE, C12494c.f44658c);
            this.constructorRef = declaredConstructor;
        }
        return declaredConstructor.newInstance(strFromJson, strFromJson2, errorDetailsFromJson, Integer.valueOf(i10), null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
    @Override // p471um.AbstractC11873h
    public void toJson(@NotNull AbstractC11885t abstractC11885t, @Nullable GenericFileUploadErrorResponse.DocumentErrorResponse.UnknownError unknownError) {
        if (unknownError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC11885t.mo44374c();
        abstractC11885t.mo44380n(Title.type);
        this.stringAdapter.toJson(abstractC11885t, unknownError.getTitle());
        abstractC11885t.mo44380n("code");
        this.nullableStringAdapter.toJson(abstractC11885t, unknownError.getCode());
        abstractC11885t.mo44380n("details");
        this.nullableErrorDetailsAdapter.toJson(abstractC11885t, unknownError.getDetails());
        abstractC11885t.mo44378g();
    }
}
