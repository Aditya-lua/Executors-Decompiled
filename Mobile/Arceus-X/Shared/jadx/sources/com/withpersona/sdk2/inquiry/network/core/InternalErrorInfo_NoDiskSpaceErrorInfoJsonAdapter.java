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
public final class InternalErrorInfo_NoDiskSpaceErrorInfoJsonAdapter extends AbstractC11873h<InternalErrorInfo.NoDiskSpaceErrorInfo> {

    @Nullable
    private volatile Constructor<InternalErrorInfo.NoDiskSpaceErrorInfo> constructorRef;

    @NotNull
    private final AbstractC11878m.b options = AbstractC11878m.b.m44343a("message");

    @NotNull
    private final AbstractC11873h<String> stringAdapter;

    public InternalErrorInfo_NoDiskSpaceErrorInfoJsonAdapter(@NotNull C11888w c11888w) {
        this.stringAdapter = c11888w.m44439f(String.class, C7702q0.m31908d(), "message");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(60);
        sb2.append("GeneratedJsonAdapter(InternalErrorInfo.NoDiskSpaceErrorInfo)");
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p471um.AbstractC11873h
    @NotNull
    public InternalErrorInfo.NoDiskSpaceErrorInfo fromJson(@NotNull AbstractC11878m abstractC11878m) throws NoSuchMethodException {
        abstractC11878m.mo44325b();
        String strFromJson = null;
        int i10 = -1;
        while (abstractC11878m.mo44329f()) {
            int iMo44316F = abstractC11878m.mo44316F(this.options);
            if (iMo44316F == -1) {
                abstractC11878m.mo44320M();
                abstractC11878m.mo44321P();
            } else if (iMo44316F == 0) {
                strFromJson = this.stringAdapter.fromJson(abstractC11878m);
                if (strFromJson == null) {
                    throw C12494c.m46811x("message", "message", abstractC11878m);
                }
                i10 = -2;
            } else {
                continue;
            }
        }
        abstractC11878m.mo44327d();
        if (i10 == -2) {
            return new InternalErrorInfo.NoDiskSpaceErrorInfo(strFromJson);
        }
        Constructor<InternalErrorInfo.NoDiskSpaceErrorInfo> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = InternalErrorInfo.NoDiskSpaceErrorInfo.class.getDeclaredConstructor(String.class, Integer.TYPE, C12494c.f44658c);
            this.constructorRef = declaredConstructor;
        }
        return declaredConstructor.newInstance(strFromJson, Integer.valueOf(i10), null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
    @Override // p471um.AbstractC11873h
    public void toJson(@NotNull AbstractC11885t abstractC11885t, @Nullable InternalErrorInfo.NoDiskSpaceErrorInfo noDiskSpaceErrorInfo) {
        if (noDiskSpaceErrorInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC11885t.mo44374c();
        abstractC11885t.mo44380n("message");
        this.stringAdapter.toJson(abstractC11885t, noDiskSpaceErrorInfo.getMessage());
        abstractC11885t.mo44378g();
    }
}
