package com.withpersona.sdk2.inquiry.network.core.dto;

import com.appsflyer.sdk_base.referrer.Payload;
import java.util.Map;
import kotlin.collections.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.a0;
import um.h;
import um.m;
import um.t;
import um.w;
import wm.c;

/* JADX INFO: loaded from: classes3.dex */
public final class UiComponentError_UiInputAddressComponentErrorJsonAdapter extends h<UiComponentError.UiInputAddressComponentError> {

    @NotNull
    private final h<Map<String, String>> mapOfStringStringAdapter;

    @NotNull
    private final m.b options = m.b.a("name", Payload.TYPE, "message");

    @NotNull
    private final h<String> stringAdapter;

    public UiComponentError_UiInputAddressComponentErrorJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, q0.d(), "name");
        this.mapOfStringStringAdapter = wVar.f(a0.j(Map.class, String.class, String.class), q0.d(), "message");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(67);
        sb2.append("GeneratedJsonAdapter(UiComponentError.UiInputAddressComponentError)");
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // um.h
    @NotNull
    public UiComponentError.UiInputAddressComponentError fromJson(@NotNull m mVar) {
        mVar.b();
        String strFromJson = null;
        String strFromJson2 = null;
        Map<String, String> mapFromJson = null;
        while (mVar.f()) {
            int iF = mVar.F(this.options);
            if (iF == -1) {
                mVar.M();
                mVar.P();
            } else if (iF == 0) {
                strFromJson = this.stringAdapter.fromJson(mVar);
                if (strFromJson == null) {
                    throw c.x("name", "name", mVar);
                }
            } else if (iF == 1) {
                strFromJson2 = this.stringAdapter.fromJson(mVar);
                if (strFromJson2 == null) {
                    throw c.x(Payload.TYPE, Payload.TYPE, mVar);
                }
            } else if (iF == 2 && (mapFromJson = this.mapOfStringStringAdapter.fromJson(mVar)) == null) {
                throw c.x("message", "message", mVar);
            }
        }
        mVar.d();
        if (strFromJson == null) {
            throw c.o("name", "name", mVar);
        }
        if (strFromJson2 == null) {
            throw c.o(Payload.TYPE, Payload.TYPE, mVar);
        }
        if (mapFromJson != null) {
            return new UiComponentError.UiInputAddressComponentError(strFromJson, strFromJson2, mapFromJson);
        }
        throw c.o("message", "message", mVar);
    }

    @Override // um.h
    public void toJson(@NotNull t tVar, @Nullable UiComponentError.UiInputAddressComponentError uiInputAddressComponentError) {
        if (uiInputAddressComponentError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.c();
        tVar.n("name");
        this.stringAdapter.toJson(tVar, uiInputAddressComponentError.getName());
        tVar.n(Payload.TYPE);
        this.stringAdapter.toJson(tVar, uiInputAddressComponentError.getType());
        tVar.n("message");
        this.mapOfStringStringAdapter.toJson(tVar, uiInputAddressComponentError.getMessage());
        tVar.g();
    }
}
