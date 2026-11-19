package com.withpersona.sdk2.inquiry.network.core.dto;

import com.appsflyer.sdk_base.referrer.Payload;
import hn.h;
import hn.m;
import hn.t;
import hn.w;
import jn.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.collections.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class UiComponentError_UiInputComponentErrorJsonAdapter extends h<UiComponentError.UiInputComponentError> {

    @NotNull
    private final m.b options = m.b.a("name", Payload.TYPE, "message");

    @NotNull
    private final h<String> stringAdapter;

    public UiComponentError_UiInputComponentErrorJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, q0.d(), "name");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(60);
        sb2.append("GeneratedJsonAdapter(UiComponentError.UiInputComponentError)");
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // hn.h
    @NotNull
    public UiComponentError.UiInputComponentError fromJson(@NotNull m mVar) {
        mVar.b();
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        while (mVar.f()) {
            int I = mVar.I(this.options);
            if (I == -1) {
                mVar.O();
                mVar.Q();
            } else if (I == 0) {
                strFromJson = this.stringAdapter.fromJson(mVar);
                if (strFromJson == null) {
                    throw c.x("name", "name", mVar);
                }
            } else if (I == 1) {
                strFromJson2 = this.stringAdapter.fromJson(mVar);
                if (strFromJson2 == null) {
                    throw c.x(Payload.TYPE, Payload.TYPE, mVar);
                }
            } else if (I == 2 && (strFromJson3 = this.stringAdapter.fromJson(mVar)) == null) {
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
        if (strFromJson3 != null) {
            return new UiComponentError.UiInputComponentError(strFromJson, strFromJson2, strFromJson3);
        }
        throw c.o("message", "message", mVar);
    }

    @Override // hn.h
    public void toJson(@NotNull t tVar, @Nullable UiComponentError.UiInputComponentError uiInputComponentError) {
        if (uiInputComponentError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.c();
        tVar.o("name");
        this.stringAdapter.toJson(tVar, uiInputComponentError.getName());
        tVar.o(Payload.TYPE);
        this.stringAdapter.toJson(tVar, uiInputComponentError.getType());
        tVar.o("message");
        this.stringAdapter.toJson(tVar, uiInputComponentError.getMessage());
        tVar.g();
    }
}
