package com.withpersona.sdk2.inquiry.network.core;

import java.util.List;
import kotlin.collections.C7702q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.AbstractC11873h;
import p471um.AbstractC11878m;
import p471um.AbstractC11885t;
import p471um.C11866a0;
import p471um.C11888w;
import p522wm.C12494c;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.core.GenericFileUploadErrorResponse_DocumentErrorResponse_DisabledFileTypeError_DetailsJsonAdapter */
/* JADX INFO: loaded from: classes3.dex */
public final class C3765xa6a39fa9 extends AbstractC11873h<GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError.Details> {

    @NotNull
    private final AbstractC11873h<List<String>> listOfStringAdapter;

    @NotNull
    private final AbstractC11878m.b options = AbstractC11878m.b.m44343a("uploaded_file_type", "enabled_file_types");

    @NotNull
    private final AbstractC11873h<String> stringAdapter;

    public C3765xa6a39fa9(@NotNull C11888w c11888w) {
        this.stringAdapter = c11888w.m44439f(String.class, C7702q0.m31908d(), "uploadedFileType");
        this.listOfStringAdapter = c11888w.m44439f(C11866a0.m44298j(List.class, String.class), C7702q0.m31908d(), "enabledFileTypes");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(104);
        sb2.append("GeneratedJsonAdapter(GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError.Details)");
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p471um.AbstractC11873h
    @NotNull
    public GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError.Details fromJson(@NotNull AbstractC11878m abstractC11878m) {
        abstractC11878m.mo44325b();
        String strFromJson = null;
        List<String> listFromJson = null;
        while (abstractC11878m.mo44329f()) {
            int iMo44316F = abstractC11878m.mo44316F(this.options);
            if (iMo44316F == -1) {
                abstractC11878m.mo44320M();
                abstractC11878m.mo44321P();
            } else if (iMo44316F == 0) {
                strFromJson = this.stringAdapter.fromJson(abstractC11878m);
                if (strFromJson == null) {
                    throw C12494c.m46811x("uploadedFileType", "uploaded_file_type", abstractC11878m);
                }
            } else if (iMo44316F == 1 && (listFromJson = this.listOfStringAdapter.fromJson(abstractC11878m)) == null) {
                throw C12494c.m46811x("enabledFileTypes", "enabled_file_types", abstractC11878m);
            }
        }
        abstractC11878m.mo44327d();
        if (strFromJson == null) {
            throw C12494c.m46802o("uploadedFileType", "uploaded_file_type", abstractC11878m);
        }
        if (listFromJson != null) {
            return new GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError.Details(strFromJson, listFromJson);
        }
        throw C12494c.m46802o("enabledFileTypes", "enabled_file_types", abstractC11878m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
    @Override // p471um.AbstractC11873h
    public void toJson(@NotNull AbstractC11885t abstractC11885t, @Nullable GenericFileUploadErrorResponse.DocumentErrorResponse.DisabledFileTypeError.Details details) {
        if (details == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC11885t.mo44374c();
        abstractC11885t.mo44380n("uploaded_file_type");
        this.stringAdapter.toJson(abstractC11885t, details.getUploadedFileType());
        abstractC11885t.mo44380n("enabled_file_types");
        this.listOfStringAdapter.toJson(abstractC11885t, details.getEnabledFileTypes());
        abstractC11885t.mo44378g();
    }
}
