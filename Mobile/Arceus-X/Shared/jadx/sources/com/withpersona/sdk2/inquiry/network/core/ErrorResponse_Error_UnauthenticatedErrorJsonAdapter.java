package com.withpersona.sdk2.inquiry.network.core;

import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import kotlin.collections.C7702q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.AbstractC11873h;
import p471um.AbstractC11878m;
import p471um.AbstractC11885t;
import p471um.C11888w;

/* JADX INFO: loaded from: classes3.dex */
public final class ErrorResponse_Error_UnauthenticatedErrorJsonAdapter extends AbstractC11873h<ErrorResponse.Error.UnauthenticatedError> {

    @NotNull
    private final AbstractC11873h<String> nullableStringAdapter;

    @NotNull
    private final AbstractC11878m.b options = AbstractC11878m.b.m44343a(Title.type, "details");

    public ErrorResponse_Error_UnauthenticatedErrorJsonAdapter(@NotNull C11888w c11888w) {
        this.nullableStringAdapter = c11888w.m44439f(String.class, C7702q0.m31908d(), Title.type);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(62);
        sb2.append("GeneratedJsonAdapter(ErrorResponse.Error.UnauthenticatedError)");
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p471um.AbstractC11873h
    @NotNull
    public ErrorResponse.Error.UnauthenticatedError fromJson(@NotNull AbstractC11878m abstractC11878m) {
        abstractC11878m.mo44325b();
        String strFromJson = null;
        String strFromJson2 = null;
        while (abstractC11878m.mo44329f()) {
            int iMo44316F = abstractC11878m.mo44316F(this.options);
            if (iMo44316F == -1) {
                abstractC11878m.mo44320M();
                abstractC11878m.mo44321P();
            } else if (iMo44316F == 0) {
                strFromJson = this.nullableStringAdapter.fromJson(abstractC11878m);
            } else if (iMo44316F == 1) {
                strFromJson2 = this.nullableStringAdapter.fromJson(abstractC11878m);
            }
        }
        abstractC11878m.mo44327d();
        return new ErrorResponse.Error.UnauthenticatedError(strFromJson, strFromJson2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
    @Override // p471um.AbstractC11873h
    public void toJson(@NotNull AbstractC11885t abstractC11885t, @Nullable ErrorResponse.Error.UnauthenticatedError unauthenticatedError) {
        if (unauthenticatedError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC11885t.mo44374c();
        abstractC11885t.mo44380n(Title.type);
        this.nullableStringAdapter.toJson(abstractC11885t, unauthenticatedError.getTitle());
        abstractC11885t.mo44380n("details");
        this.nullableStringAdapter.toJson(abstractC11885t, unauthenticatedError.getDetails());
        abstractC11885t.mo44378g();
    }
}
