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
public final class ErrorResponseJsonAdapter extends h<ErrorResponse> {

    @NotNull
    private final h<List<ErrorResponse.Error>> nullableListOfErrorAdapter;

    @NotNull
    private final m.b options = m.b.a("errors");

    public ErrorResponseJsonAdapter(@NotNull w wVar) {
        this.nullableListOfErrorAdapter = wVar.f(a0.j(List.class, ErrorResponse.Error.class), q0.d(), "errors");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("GeneratedJsonAdapter(ErrorResponse)");
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // um.h
    @NotNull
    public ErrorResponse fromJson(@NotNull m mVar) {
        mVar.b();
        List<ErrorResponse.Error> listFromJson = null;
        while (mVar.f()) {
            int iF = mVar.F(this.options);
            if (iF == -1) {
                mVar.M();
                mVar.P();
            } else if (iF == 0) {
                listFromJson = this.nullableListOfErrorAdapter.fromJson(mVar);
            }
        }
        mVar.d();
        return new ErrorResponse(listFromJson);
    }

    @Override // um.h
    public void toJson(@NotNull t tVar, @Nullable ErrorResponse errorResponse) {
        if (errorResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.c();
        tVar.n("errors");
        this.nullableListOfErrorAdapter.toJson(tVar, errorResponse.getErrors());
        tVar.g();
    }
}
