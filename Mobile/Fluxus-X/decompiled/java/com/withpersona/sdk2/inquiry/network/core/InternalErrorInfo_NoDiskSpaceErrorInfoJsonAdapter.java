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
public final class InternalErrorInfo_NoDiskSpaceErrorInfoJsonAdapter extends h<InternalErrorInfo.NoDiskSpaceErrorInfo> {

    @Nullable
    private volatile Constructor<InternalErrorInfo.NoDiskSpaceErrorInfo> constructorRef;

    @NotNull
    private final m.b options = m.b.a("message");

    @NotNull
    private final h<String> stringAdapter;

    public InternalErrorInfo_NoDiskSpaceErrorInfoJsonAdapter(@NotNull w wVar) {
        this.stringAdapter = wVar.f(String.class, q0.d(), "message");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(60);
        sb2.append("GeneratedJsonAdapter(InternalErrorInfo.NoDiskSpaceErrorInfo)");
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // hn.h
    @NotNull
    public InternalErrorInfo.NoDiskSpaceErrorInfo fromJson(@NotNull m mVar) throws NoSuchMethodException {
        mVar.b();
        String strFromJson = null;
        int i10 = -1;
        while (mVar.f()) {
            int I = mVar.I(this.options);
            if (I == -1) {
                mVar.O();
                mVar.Q();
            } else if (I == 0) {
                strFromJson = this.stringAdapter.fromJson(mVar);
                if (strFromJson == null) {
                    throw jn.c.x("message", "message", mVar);
                }
                i10 = -2;
            } else {
                continue;
            }
        }
        mVar.d();
        if (i10 == -2) {
            return new InternalErrorInfo.NoDiskSpaceErrorInfo(strFromJson);
        }
        Constructor<InternalErrorInfo.NoDiskSpaceErrorInfo> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = InternalErrorInfo.NoDiskSpaceErrorInfo.class.getDeclaredConstructor(String.class, Integer.TYPE, jn.c.f20816c);
            this.constructorRef = declaredConstructor;
        }
        return declaredConstructor.newInstance(strFromJson, Integer.valueOf(i10), null);
    }

    @Override // hn.h
    public void toJson(@NotNull t tVar, @Nullable InternalErrorInfo.NoDiskSpaceErrorInfo noDiskSpaceErrorInfo) {
        if (noDiskSpaceErrorInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.c();
        tVar.o("message");
        this.stringAdapter.toJson(tVar, noDiskSpaceErrorInfo.getMessage());
        tVar.g();
    }
}
