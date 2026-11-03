package com.withpersona.sdk2.inquiry.network.core;

import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import java.util.Map;
import kotlin.collections.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sm.a0;
import sm.h;
import sm.m;
import sm.t;
import sm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class ErrorResponse_Error_InvalidFieldValueErrorJsonAdapter extends h<ErrorResponse.Error.InvalidFieldValueError> {

    @NotNull
    private final h<Map<String, UiComponentError>> nullableMapOfStringUiComponentErrorAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(Title.type, "details");

    public ErrorResponse_Error_InvalidFieldValueErrorJsonAdapter(@NotNull w wVar) {
        this.nullableStringAdapter = wVar.f(String.class, q0.d(), Title.type);
        this.nullableMapOfStringUiComponentErrorAdapter = wVar.f(a0.j(Map.class, String.class, UiComponentError.class), q0.d(), "details");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("GeneratedJsonAdapter(ErrorResponse.Error.InvalidFieldValueError)");
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // sm.h
    @NotNull
    public ErrorResponse.Error.InvalidFieldValueError fromJson(@NotNull m mVar) {
        mVar.b();
        String strFromJson = null;
        Map<String, UiComponentError> mapFromJson = null;
        while (mVar.f()) {
            int iF = mVar.F(this.options);
            if (iF == -1) {
                mVar.M();
                mVar.P();
            } else if (iF == 0) {
                strFromJson = this.nullableStringAdapter.fromJson(mVar);
            } else if (iF == 1) {
                mapFromJson = this.nullableMapOfStringUiComponentErrorAdapter.fromJson(mVar);
            }
        }
        mVar.d();
        return new ErrorResponse.Error.InvalidFieldValueError(strFromJson, mapFromJson);
    }

    @Override // sm.h
    public void toJson(@NotNull t tVar, @Nullable ErrorResponse.Error.InvalidFieldValueError invalidFieldValueError) {
        if (invalidFieldValueError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.c();
        tVar.n(Title.type);
        this.nullableStringAdapter.toJson(tVar, invalidFieldValueError.getTitle());
        tVar.n("details");
        this.nullableMapOfStringUiComponentErrorAdapter.toJson(tVar, invalidFieldValueError.getDetails());
        tVar.g();
    }
}
