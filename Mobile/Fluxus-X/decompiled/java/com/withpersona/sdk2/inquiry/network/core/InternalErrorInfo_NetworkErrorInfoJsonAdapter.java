package com.withpersona.sdk2.inquiry.network.core;

import hn.h;
import hn.m;
import hn.t;
import hn.w;
import java.lang.reflect.Constructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.collections.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class InternalErrorInfo_NetworkErrorInfoJsonAdapter extends h<InternalErrorInfo.NetworkErrorInfo> {

    @NotNull
    private final h<Boolean> booleanAdapter;

    @Nullable
    private volatile Constructor<InternalErrorInfo.NetworkErrorInfo> constructorRef;

    @NotNull
    private final h<Integer> intAdapter;

    @NotNull
    private final h<ErrorResponse.Error> nullableErrorAdapter;

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a("code", "message", "isRecoverable", "responseError");

    public InternalErrorInfo_NetworkErrorInfoJsonAdapter(@NotNull w wVar) {
        this.intAdapter = wVar.f(Integer.TYPE, q0.d(), "code");
        this.nullableStringAdapter = wVar.f(String.class, q0.d(), "message");
        this.booleanAdapter = wVar.f(Boolean.TYPE, q0.d(), "isRecoverable");
        this.nullableErrorAdapter = wVar.f(ErrorResponse.Error.class, q0.d(), "responseError");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(56);
        sb2.append("GeneratedJsonAdapter(InternalErrorInfo.NetworkErrorInfo)");
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // hn.h
    @NotNull
    public InternalErrorInfo.NetworkErrorInfo fromJson(@NotNull m mVar) throws NoSuchMethodException {
        mVar.b();
        Integer numFromJson = null;
        String strFromJson = null;
        Boolean boolFromJson = null;
        ErrorResponse.Error errorFromJson = null;
        int i10 = -1;
        while (mVar.f()) {
            int I = mVar.I(this.options);
            if (I == -1) {
                mVar.O();
                mVar.Q();
            } else if (I == 0) {
                numFromJson = this.intAdapter.fromJson(mVar);
                if (numFromJson == null) {
                    throw jn.c.x("code", "code", mVar);
                }
            } else if (I == 1) {
                strFromJson = this.nullableStringAdapter.fromJson(mVar);
            } else if (I == 2) {
                boolFromJson = this.booleanAdapter.fromJson(mVar);
                if (boolFromJson == null) {
                    throw jn.c.x("isRecoverable", "isRecoverable", mVar);
                }
            } else if (I == 3) {
                errorFromJson = this.nullableErrorAdapter.fromJson(mVar);
                i10 = -9;
            }
        }
        mVar.d();
        if (i10 == -9) {
            if (numFromJson == null) {
                throw jn.c.o("code", "code", mVar);
            }
            int iIntValue = numFromJson.intValue();
            if (boolFromJson != null) {
                return new InternalErrorInfo.NetworkErrorInfo(iIntValue, strFromJson, boolFromJson.booleanValue(), errorFromJson);
            }
            throw jn.c.o("isRecoverable", "isRecoverable", mVar);
        }
        Constructor<InternalErrorInfo.NetworkErrorInfo> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class<?> cls = jn.c.f20816c;
            Class cls2 = Integer.TYPE;
            declaredConstructor = InternalErrorInfo.NetworkErrorInfo.class.getDeclaredConstructor(cls2, String.class, Boolean.TYPE, ErrorResponse.Error.class, cls2, cls);
            this.constructorRef = declaredConstructor;
        }
        if (numFromJson == null) {
            throw jn.c.o("code", "code", mVar);
        }
        if (boolFromJson != null) {
            return declaredConstructor.newInstance(numFromJson, strFromJson, boolFromJson, errorFromJson, Integer.valueOf(i10), null);
        }
        throw jn.c.o("isRecoverable", "isRecoverable", mVar);
    }

    @Override // hn.h
    public void toJson(@NotNull t tVar, @Nullable InternalErrorInfo.NetworkErrorInfo networkErrorInfo) {
        if (networkErrorInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.c();
        tVar.o("code");
        this.intAdapter.toJson(tVar, Integer.valueOf(networkErrorInfo.getCode()));
        tVar.o("message");
        this.nullableStringAdapter.toJson(tVar, networkErrorInfo.getMessage());
        tVar.o("isRecoverable");
        this.booleanAdapter.toJson(tVar, Boolean.valueOf(networkErrorInfo.isRecoverable()));
        tVar.o("responseError");
        this.nullableErrorAdapter.toJson(tVar, networkErrorInfo.getResponseError());
        tVar.g();
    }
}
