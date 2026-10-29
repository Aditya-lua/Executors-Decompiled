package com.withpersona.sdk2.inquiry.network.core;

import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import kotlin.collections.C7702q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.AbstractC11873h;
import p471um.AbstractC11878m;
import p471um.AbstractC11885t;
import p471um.C11888w;
import p522wm.C12494c;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse_DocumentErrorResponse_MalformedImageErrorJsonAdapter */
/* JADX INFO: loaded from: classes3.dex */
public final class C3774x2298351a extends AbstractC11873h<GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError> {

    @NotNull
    private final AbstractC11873h<GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError.Details> detailsAdapter;

    @NotNull
    private final AbstractC11878m.b options = AbstractC11878m.b.m44343a(Title.type, "code", "details");

    @NotNull
    private final AbstractC11873h<String> stringAdapter;

    public C3774x2298351a(@NotNull C11888w c11888w) {
        this.stringAdapter = c11888w.m44439f(String.class, C7702q0.m31908d(), Title.type);
        this.detailsAdapter = c11888w.m44439f(GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError.Details.class, C7702q0.m31908d(), "details");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(94);
        sb2.append("GeneratedJsonAdapter(GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError)");
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p471um.AbstractC11873h
    @NotNull
    public GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError fromJson(@NotNull AbstractC11878m abstractC11878m) {
        abstractC11878m.mo44325b();
        String strFromJson = null;
        String strFromJson2 = null;
        GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError.Details detailsFromJson = null;
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
            } else if (iMo44316F == 1) {
                strFromJson2 = this.stringAdapter.fromJson(abstractC11878m);
                if (strFromJson2 == null) {
                    throw C12494c.m46811x("code", "code", abstractC11878m);
                }
            } else if (iMo44316F == 2 && (detailsFromJson = this.detailsAdapter.fromJson(abstractC11878m)) == null) {
                throw C12494c.m46811x("details", "details", abstractC11878m);
            }
        }
        abstractC11878m.mo44327d();
        if (strFromJson == null) {
            throw C12494c.m46802o(Title.type, Title.type, abstractC11878m);
        }
        if (strFromJson2 == null) {
            throw C12494c.m46802o("code", "code", abstractC11878m);
        }
        if (detailsFromJson != null) {
            return new GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError(strFromJson, strFromJson2, detailsFromJson);
        }
        throw C12494c.m46802o("details", "details", abstractC11878m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
    @Override // p471um.AbstractC11873h
    public void toJson(@NotNull AbstractC11885t abstractC11885t, @Nullable GenericFileUploadErrorResponse.DocumentErrorResponse.MalformedImageError malformedImageError) {
        if (malformedImageError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC11885t.mo44374c();
        abstractC11885t.mo44380n(Title.type);
        this.stringAdapter.toJson(abstractC11885t, malformedImageError.getTitle());
        abstractC11885t.mo44380n("code");
        this.stringAdapter.toJson(abstractC11885t, malformedImageError.getCode());
        abstractC11885t.mo44380n("details");
        this.detailsAdapter.toJson(abstractC11885t, malformedImageError.getDetails());
        abstractC11885t.mo44378g();
    }
}
