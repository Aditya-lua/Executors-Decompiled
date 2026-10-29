package com.withpersona.sdk2.inquiry.network.core;

import kotlin.collections.C7702q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.AbstractC11873h;
import p471um.AbstractC11878m;
import p471um.AbstractC11885t;
import p471um.C11888w;
import p522wm.C12494c;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse_DocumentErrorResponse_PageLimitExceededError_DetailsJsonAdapter */
/* JADX INFO: loaded from: classes3.dex */
public final class C3779xba91eb00 extends AbstractC11873h<GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError.Details> {

    @NotNull
    private final AbstractC11873h<Integer> intAdapter;

    @NotNull
    private final AbstractC11878m.b options = AbstractC11878m.b.m44343a("page_limit");

    public C3779xba91eb00(@NotNull C11888w c11888w) {
        this.intAdapter = c11888w.m44439f(Integer.TYPE, C7702q0.m31908d(), "pageLimit");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(105);
        sb2.append("GeneratedJsonAdapter(GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError.Details)");
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p471um.AbstractC11873h
    @NotNull
    public GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError.Details fromJson(@NotNull AbstractC11878m abstractC11878m) {
        abstractC11878m.mo44325b();
        Integer numFromJson = null;
        while (abstractC11878m.mo44329f()) {
            int iMo44316F = abstractC11878m.mo44316F(this.options);
            if (iMo44316F == -1) {
                abstractC11878m.mo44320M();
                abstractC11878m.mo44321P();
            } else if (iMo44316F == 0 && (numFromJson = this.intAdapter.fromJson(abstractC11878m)) == null) {
                throw C12494c.m46811x("pageLimit", "page_limit", abstractC11878m);
            }
        }
        abstractC11878m.mo44327d();
        if (numFromJson != null) {
            return new GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError.Details(numFromJson.intValue());
        }
        throw C12494c.m46802o("pageLimit", "page_limit", abstractC11878m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
    @Override // p471um.AbstractC11873h
    public void toJson(@NotNull AbstractC11885t abstractC11885t, @Nullable GenericFileUploadErrorResponse.DocumentErrorResponse.PageLimitExceededError.Details details) {
        if (details == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC11885t.mo44374c();
        abstractC11885t.mo44380n("page_limit");
        this.intAdapter.toJson(abstractC11885t, Integer.valueOf(details.getPageLimit()));
        abstractC11885t.mo44378g();
    }
}
