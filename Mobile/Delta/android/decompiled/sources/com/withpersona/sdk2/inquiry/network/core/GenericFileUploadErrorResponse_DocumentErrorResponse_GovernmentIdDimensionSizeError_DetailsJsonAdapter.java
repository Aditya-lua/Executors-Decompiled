package com.withpersona.sdk2.inquiry.network.core;

import kotlin.collections.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.h;
import um.m;
import um.t;
import um.w;

/* JADX INFO: loaded from: classes3.dex */
public final class GenericFileUploadErrorResponse_DocumentErrorResponse_GovernmentIdDimensionSizeError_DetailsJsonAdapter extends h<GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError.Details> {

    @NotNull
    private final h<Integer> intAdapter;

    @NotNull
    private final m.b options = m.b.a("min_dimension_size", "max_dimension_size");

    public GenericFileUploadErrorResponse_DocumentErrorResponse_GovernmentIdDimensionSizeError_DetailsJsonAdapter(@NotNull w wVar) {
        this.intAdapter = wVar.f(Integer.TYPE, q0.d(), "minDimensionSize");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(113);
        sb2.append("GeneratedJsonAdapter(GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError.Details)");
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // um.h
    @NotNull
    public GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError.Details fromJson(@NotNull m mVar) {
        mVar.b();
        Integer numFromJson = null;
        Integer numFromJson2 = null;
        while (mVar.f()) {
            int iF = mVar.F(this.options);
            if (iF == -1) {
                mVar.M();
                mVar.P();
            } else if (iF == 0) {
                numFromJson = this.intAdapter.fromJson(mVar);
                if (numFromJson == null) {
                    throw wm.c.x("minDimensionSize", "min_dimension_size", mVar);
                }
            } else if (iF == 1 && (numFromJson2 = this.intAdapter.fromJson(mVar)) == null) {
                throw wm.c.x("maxDimensionSize", "max_dimension_size", mVar);
            }
        }
        mVar.d();
        if (numFromJson == null) {
            throw wm.c.o("minDimensionSize", "min_dimension_size", mVar);
        }
        int iIntValue = numFromJson.intValue();
        if (numFromJson2 != null) {
            return new GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError.Details(iIntValue, numFromJson2.intValue());
        }
        throw wm.c.o("maxDimensionSize", "max_dimension_size", mVar);
    }

    @Override // um.h
    public void toJson(@NotNull t tVar, @Nullable GenericFileUploadErrorResponse.DocumentErrorResponse.GovernmentIdDimensionSizeError.Details details) {
        if (details == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.c();
        tVar.n("min_dimension_size");
        this.intAdapter.toJson(tVar, Integer.valueOf(details.getMinDimensionSize()));
        tVar.n("max_dimension_size");
        this.intAdapter.toJson(tVar, Integer.valueOf(details.getMaxDimensionSize()));
        tVar.g();
    }
}
