package com.withpersona.sdk2.inquiry.network.core;

import kotlin.collections.C7702q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.AbstractC11873h;
import p471um.AbstractC11878m;
import p471um.AbstractC11885t;
import p471um.C11888w;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse_DocumentErrorResponse_FileSizeExceededError_DetailsJsonAdapter */
/* JADX INFO: loaded from: classes3.dex */
public final class C3769xd4867e47 extends AbstractC11873h<GenericFileUploadErrorResponse.DocumentErrorResponse.FileSizeExceededError.Details> {

    @NotNull
    private final AbstractC11873h<Long> nullableLongAdapter;

    @NotNull
    private final AbstractC11878m.b options = AbstractC11878m.b.m44343a("file_size_limit");

    public C3769xd4867e47(@NotNull C11888w c11888w) {
        this.nullableLongAdapter = c11888w.m44439f(Long.class, C7702q0.m31908d(), "fileSizeLimit");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(104);
        sb2.append("GeneratedJsonAdapter(GenericFileUploadErrorResponse.DocumentErrorResponse.FileSizeExceededError.Details)");
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p471um.AbstractC11873h
    @NotNull
    public GenericFileUploadErrorResponse.DocumentErrorResponse.FileSizeExceededError.Details fromJson(@NotNull AbstractC11878m abstractC11878m) {
        abstractC11878m.mo44325b();
        Long lFromJson = null;
        while (abstractC11878m.mo44329f()) {
            int iMo44316F = abstractC11878m.mo44316F(this.options);
            if (iMo44316F == -1) {
                abstractC11878m.mo44320M();
                abstractC11878m.mo44321P();
            } else if (iMo44316F == 0) {
                lFromJson = this.nullableLongAdapter.fromJson(abstractC11878m);
            }
        }
        abstractC11878m.mo44327d();
        return new GenericFileUploadErrorResponse.DocumentErrorResponse.FileSizeExceededError.Details(lFromJson);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
    @Override // p471um.AbstractC11873h
    public void toJson(@NotNull AbstractC11885t abstractC11885t, @Nullable GenericFileUploadErrorResponse.DocumentErrorResponse.FileSizeExceededError.Details details) {
        if (details == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC11885t.mo44374c();
        abstractC11885t.mo44380n("file_size_limit");
        this.nullableLongAdapter.toJson(abstractC11885t, details.getFileSizeLimit());
        abstractC11885t.mo44378g();
    }
}
