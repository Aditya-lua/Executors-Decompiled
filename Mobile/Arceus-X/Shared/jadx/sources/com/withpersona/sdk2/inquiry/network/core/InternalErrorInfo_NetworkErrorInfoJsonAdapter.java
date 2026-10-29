package com.withpersona.sdk2.inquiry.network.core;

import java.lang.reflect.Constructor;
import kotlin.collections.C7702q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.AbstractC11873h;
import p471um.AbstractC11878m;
import p471um.AbstractC11885t;
import p471um.C11888w;
import p522wm.C12494c;

/* JADX INFO: loaded from: classes3.dex */
public final class InternalErrorInfo_NetworkErrorInfoJsonAdapter extends AbstractC11873h<InternalErrorInfo.NetworkErrorInfo> {

    @NotNull
    private final AbstractC11873h<Boolean> booleanAdapter;

    @Nullable
    private volatile Constructor<InternalErrorInfo.NetworkErrorInfo> constructorRef;

    @NotNull
    private final AbstractC11873h<Integer> intAdapter;

    @NotNull
    private final AbstractC11873h<ErrorResponse.Error> nullableErrorAdapter;

    @NotNull
    private final AbstractC11873h<String> nullableStringAdapter;

    @NotNull
    private final AbstractC11878m.b options = AbstractC11878m.b.m44343a("code", "message", "isRecoverable", "responseError");

    public InternalErrorInfo_NetworkErrorInfoJsonAdapter(@NotNull C11888w c11888w) {
        this.intAdapter = c11888w.m44439f(Integer.TYPE, C7702q0.m31908d(), "code");
        this.nullableStringAdapter = c11888w.m44439f(String.class, C7702q0.m31908d(), "message");
        this.booleanAdapter = c11888w.m44439f(Boolean.TYPE, C7702q0.m31908d(), "isRecoverable");
        this.nullableErrorAdapter = c11888w.m44439f(ErrorResponse.Error.class, C7702q0.m31908d(), "responseError");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(56);
        sb2.append("GeneratedJsonAdapter(InternalErrorInfo.NetworkErrorInfo)");
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p471um.AbstractC11873h
    @NotNull
    public InternalErrorInfo.NetworkErrorInfo fromJson(@NotNull AbstractC11878m abstractC11878m) throws NoSuchMethodException {
        abstractC11878m.mo44325b();
        Integer numFromJson = null;
        String strFromJson = null;
        Boolean boolFromJson = null;
        ErrorResponse.Error errorFromJson = null;
        int i10 = -1;
        while (abstractC11878m.mo44329f()) {
            int iMo44316F = abstractC11878m.mo44316F(this.options);
            if (iMo44316F == -1) {
                abstractC11878m.mo44320M();
                abstractC11878m.mo44321P();
            } else if (iMo44316F == 0) {
                numFromJson = this.intAdapter.fromJson(abstractC11878m);
                if (numFromJson == null) {
                    throw C12494c.m46811x("code", "code", abstractC11878m);
                }
            } else if (iMo44316F == 1) {
                strFromJson = this.nullableStringAdapter.fromJson(abstractC11878m);
            } else if (iMo44316F == 2) {
                boolFromJson = this.booleanAdapter.fromJson(abstractC11878m);
                if (boolFromJson == null) {
                    throw C12494c.m46811x("isRecoverable", "isRecoverable", abstractC11878m);
                }
            } else if (iMo44316F == 3) {
                errorFromJson = this.nullableErrorAdapter.fromJson(abstractC11878m);
                i10 = -9;
            }
        }
        abstractC11878m.mo44327d();
        if (i10 == -9) {
            if (numFromJson == null) {
                throw C12494c.m46802o("code", "code", abstractC11878m);
            }
            int iIntValue = numFromJson.intValue();
            if (boolFromJson != null) {
                return new InternalErrorInfo.NetworkErrorInfo(iIntValue, strFromJson, boolFromJson.booleanValue(), errorFromJson);
            }
            throw C12494c.m46802o("isRecoverable", "isRecoverable", abstractC11878m);
        }
        Constructor<InternalErrorInfo.NetworkErrorInfo> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class<?> cls = C12494c.f44658c;
            Class cls2 = Integer.TYPE;
            declaredConstructor = InternalErrorInfo.NetworkErrorInfo.class.getDeclaredConstructor(cls2, String.class, Boolean.TYPE, ErrorResponse.Error.class, cls2, cls);
            this.constructorRef = declaredConstructor;
        }
        if (numFromJson == null) {
            throw C12494c.m46802o("code", "code", abstractC11878m);
        }
        if (boolFromJson != null) {
            return declaredConstructor.newInstance(numFromJson, strFromJson, boolFromJson, errorFromJson, Integer.valueOf(i10), null);
        }
        throw C12494c.m46802o("isRecoverable", "isRecoverable", abstractC11878m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
    @Override // p471um.AbstractC11873h
    public void toJson(@NotNull AbstractC11885t abstractC11885t, @Nullable InternalErrorInfo.NetworkErrorInfo networkErrorInfo) {
        if (networkErrorInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC11885t.mo44374c();
        abstractC11885t.mo44380n("code");
        this.intAdapter.toJson(abstractC11885t, Integer.valueOf(networkErrorInfo.getCode()));
        abstractC11885t.mo44380n("message");
        this.nullableStringAdapter.toJson(abstractC11885t, networkErrorInfo.getMessage());
        abstractC11885t.mo44380n("isRecoverable");
        this.booleanAdapter.toJson(abstractC11885t, Boolean.valueOf(networkErrorInfo.isRecoverable()));
        abstractC11885t.mo44380n("responseError");
        this.nullableErrorAdapter.toJson(abstractC11885t, networkErrorInfo.getResponseError());
        abstractC11885t.mo44378g();
    }
}
