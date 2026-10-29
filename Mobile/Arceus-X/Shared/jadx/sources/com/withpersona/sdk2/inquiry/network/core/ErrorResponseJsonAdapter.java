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

/* JADX INFO: loaded from: classes3.dex */
public final class ErrorResponseJsonAdapter extends AbstractC11873h<ErrorResponse> {

    @NotNull
    private final AbstractC11873h<List<ErrorResponse.Error>> nullableListOfErrorAdapter;

    @NotNull
    private final AbstractC11878m.b options = AbstractC11878m.b.m44343a("errors");

    public ErrorResponseJsonAdapter(@NotNull C11888w c11888w) {
        this.nullableListOfErrorAdapter = c11888w.m44439f(C11866a0.m44298j(List.class, ErrorResponse.Error.class), C7702q0.m31908d(), "errors");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("GeneratedJsonAdapter(ErrorResponse)");
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p471um.AbstractC11873h
    @NotNull
    public ErrorResponse fromJson(@NotNull AbstractC11878m abstractC11878m) {
        abstractC11878m.mo44325b();
        List<ErrorResponse.Error> listFromJson = null;
        while (abstractC11878m.mo44329f()) {
            int iMo44316F = abstractC11878m.mo44316F(this.options);
            if (iMo44316F == -1) {
                abstractC11878m.mo44320M();
                abstractC11878m.mo44321P();
            } else if (iMo44316F == 0) {
                listFromJson = this.nullableListOfErrorAdapter.fromJson(abstractC11878m);
            }
        }
        abstractC11878m.mo44327d();
        return new ErrorResponse(listFromJson);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
    @Override // p471um.AbstractC11873h
    public void toJson(@NotNull AbstractC11885t abstractC11885t, @Nullable ErrorResponse errorResponse) {
        if (errorResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC11885t.mo44374c();
        abstractC11885t.mo44380n("errors");
        this.nullableListOfErrorAdapter.toJson(abstractC11885t, errorResponse.getErrors());
        abstractC11885t.mo44378g();
    }
}
