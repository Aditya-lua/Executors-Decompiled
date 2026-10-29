package com.withpersona.sdk2.inquiry.network.core;

import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import kotlin.collections.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.h;
import um.m;
import um.t;
import um.w;

/* JADX INFO: loaded from: classes3.dex */
public final class ErrorResponse_Error_InconsistentTransitionErrorJsonAdapter extends h<ErrorResponse.Error.InconsistentTransitionError> {

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(Title.type, "details");

    public ErrorResponse_Error_InconsistentTransitionErrorJsonAdapter(@NotNull w wVar) {
        this.nullableStringAdapter = wVar.f(String.class, q0.d(), Title.type);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(69);
        sb2.append("GeneratedJsonAdapter(ErrorResponse.Error.InconsistentTransitionError)");
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // um.h
    @NotNull
    public ErrorResponse.Error.InconsistentTransitionError fromJson(@NotNull m mVar) {
        mVar.b();
        String strFromJson = null;
        String strFromJson2 = null;
        while (mVar.f()) {
            int iF = mVar.F(this.options);
            if (iF == -1) {
                mVar.M();
                mVar.P();
            } else if (iF == 0) {
                strFromJson = this.nullableStringAdapter.fromJson(mVar);
            } else if (iF == 1) {
                strFromJson2 = this.nullableStringAdapter.fromJson(mVar);
            }
        }
        mVar.d();
        return new ErrorResponse.Error.InconsistentTransitionError(strFromJson, strFromJson2);
    }

    @Override // um.h
    public void toJson(@NotNull t tVar, @Nullable ErrorResponse.Error.InconsistentTransitionError inconsistentTransitionError) {
        if (inconsistentTransitionError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.c();
        tVar.n(Title.type);
        this.nullableStringAdapter.toJson(tVar, inconsistentTransitionError.getTitle());
        tVar.n("details");
        this.nullableStringAdapter.toJson(tVar, inconsistentTransitionError.getDetails());
        tVar.g();
    }
}
