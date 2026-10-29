package com.withpersona.sdk2.inquiry.network.core;

import java.lang.reflect.Constructor;
import kotlin.collections.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.h;
import um.m;
import um.t;
import um.w;

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
    @Override // um.h
    @NotNull
    public InternalErrorInfo.NoDiskSpaceErrorInfo fromJson(@NotNull m mVar) throws NoSuchMethodException {
        mVar.b();
        String strFromJson = null;
        int i10 = -1;
        while (mVar.f()) {
            int iF = mVar.F(this.options);
            if (iF == -1) {
                mVar.M();
                mVar.P();
            } else if (iF == 0) {
                strFromJson = this.stringAdapter.fromJson(mVar);
                if (strFromJson == null) {
                    throw wm.c.x("message", "message", mVar);
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
            declaredConstructor = InternalErrorInfo.NoDiskSpaceErrorInfo.class.getDeclaredConstructor(String.class, Integer.TYPE, wm.c.f34445c);
            this.constructorRef = declaredConstructor;
        }
        return declaredConstructor.newInstance(strFromJson, Integer.valueOf(i10), null);
    }

    @Override // um.h
    public void toJson(@NotNull t tVar, @Nullable InternalErrorInfo.NoDiskSpaceErrorInfo noDiskSpaceErrorInfo) {
        if (noDiskSpaceErrorInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.c();
        tVar.n("message");
        this.stringAdapter.toJson(tVar, noDiskSpaceErrorInfo.getMessage());
        tVar.g();
    }
}
