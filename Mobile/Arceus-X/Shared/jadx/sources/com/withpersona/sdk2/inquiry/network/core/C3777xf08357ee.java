package com.withpersona.sdk2.inquiry.network.core;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.AbstractC11873h;
import p471um.AbstractC11878m;
import p471um.AbstractC11885t;
import p471um.C11888w;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse_DocumentErrorResponse_MalformedPdfError_DetailsJsonAdapter */
/* JADX INFO: loaded from: classes3.dex */
public final class C3777xf08357ee extends AbstractC11873h<GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedPdfError.Details> {

    @NotNull
    private final AbstractC11878m.b options = AbstractC11878m.b.m44343a(new String[0]);

    public C3777xf08357ee(@NotNull C11888w c11888w) {
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("GeneratedJsonAdapter(GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedPdfError.Details)");
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p471um.AbstractC11873h
    @NotNull
    public GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedPdfError.Details fromJson(@NotNull AbstractC11878m abstractC11878m) {
        abstractC11878m.mo44325b();
        while (abstractC11878m.mo44329f()) {
            if (abstractC11878m.mo44316F(this.options) == -1) {
                abstractC11878m.mo44320M();
                abstractC11878m.mo44321P();
            }
        }
        abstractC11878m.mo44327d();
        return new GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedPdfError.Details();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
    @Override // p471um.AbstractC11873h
    public void toJson(@NotNull AbstractC11885t abstractC11885t, @Nullable GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedPdfError.Details details) {
        if (details == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC11885t.mo44374c();
        abstractC11885t.mo44378g();
    }
}
