package com.withpersona.sdk2.inquiry.network.core.dto;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.collections.C7702q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.AbstractC11873h;
import p471um.AbstractC11878m;
import p471um.AbstractC11885t;
import p471um.C11888w;
import p522wm.C12494c;

/* JADX INFO: loaded from: classes3.dex */
public final class UiComponentError_UiInputComponentErrorJsonAdapter extends AbstractC11873h<UiComponentError.UiInputComponentError> {

    @NotNull
    private final AbstractC11878m.b options = AbstractC11878m.b.m44343a("name", Payload.TYPE, "message");

    @NotNull
    private final AbstractC11873h<String> stringAdapter;

    public UiComponentError_UiInputComponentErrorJsonAdapter(@NotNull C11888w c11888w) {
        this.stringAdapter = c11888w.m44439f(String.class, C7702q0.m31908d(), "name");
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(60);
        sb2.append("GeneratedJsonAdapter(UiComponentError.UiInputComponentError)");
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p471um.AbstractC11873h
    @NotNull
    public UiComponentError.UiInputComponentError fromJson(@NotNull AbstractC11878m abstractC11878m) {
        abstractC11878m.mo44325b();
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        while (abstractC11878m.mo44329f()) {
            int iMo44316F = abstractC11878m.mo44316F(this.options);
            if (iMo44316F == -1) {
                abstractC11878m.mo44320M();
                abstractC11878m.mo44321P();
            } else if (iMo44316F == 0) {
                strFromJson = this.stringAdapter.fromJson(abstractC11878m);
                if (strFromJson == null) {
                    throw C12494c.m46811x("name", "name", abstractC11878m);
                }
            } else if (iMo44316F == 1) {
                strFromJson2 = this.stringAdapter.fromJson(abstractC11878m);
                if (strFromJson2 == null) {
                    throw C12494c.m46811x(Payload.TYPE, Payload.TYPE, abstractC11878m);
                }
            } else if (iMo44316F == 2 && (strFromJson3 = this.stringAdapter.fromJson(abstractC11878m)) == null) {
                throw C12494c.m46811x("message", "message", abstractC11878m);
            }
        }
        abstractC11878m.mo44327d();
        if (strFromJson == null) {
            throw C12494c.m46802o("name", "name", abstractC11878m);
        }
        if (strFromJson2 == null) {
            throw C12494c.m46802o(Payload.TYPE, Payload.TYPE, abstractC11878m);
        }
        if (strFromJson3 != null) {
            return new UiComponentError.UiInputComponentError(strFromJson, strFromJson2, strFromJson3);
        }
        throw C12494c.m46802o("message", "message", abstractC11878m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
    @Override // p471um.AbstractC11873h
    public void toJson(@NotNull AbstractC11885t abstractC11885t, @Nullable UiComponentError.UiInputComponentError uiInputComponentError) {
        if (uiInputComponentError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC11885t.mo44374c();
        abstractC11885t.mo44380n("name");
        this.stringAdapter.toJson(abstractC11885t, uiInputComponentError.getName());
        abstractC11885t.mo44380n(Payload.TYPE);
        this.stringAdapter.toJson(abstractC11885t, uiInputComponentError.getType());
        abstractC11885t.mo44380n("message");
        this.stringAdapter.toJson(abstractC11885t, uiInputComponentError.getMessage());
        abstractC11885t.mo44378g();
    }
}
