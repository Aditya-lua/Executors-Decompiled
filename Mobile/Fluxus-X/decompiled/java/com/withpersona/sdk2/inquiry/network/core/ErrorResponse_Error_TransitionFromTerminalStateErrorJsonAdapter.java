package com.withpersona.sdk2.inquiry.network.core;

import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import hn.h;
import hn.m;
import hn.t;
import hn.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.collections.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class ErrorResponse_Error_TransitionFromTerminalStateErrorJsonAdapter extends h<ErrorResponse.Error.TransitionFromTerminalStateError> {

    @NotNull
    private final h<String> nullableStringAdapter;

    @NotNull
    private final m.b options = m.b.a(Title.type, "details");

    public ErrorResponse_Error_TransitionFromTerminalStateErrorJsonAdapter(@NotNull w wVar) {
        this.nullableStringAdapter = wVar.f(String.class, q0.d(), Title.type);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(74);
        sb2.append("GeneratedJsonAdapter(ErrorResponse.Error.TransitionFromTerminalStateError)");
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // hn.h
    @NotNull
    public ErrorResponse.Error.TransitionFromTerminalStateError fromJson(@NotNull m mVar) {
        mVar.b();
        String strFromJson = null;
        String strFromJson2 = null;
        while (mVar.f()) {
            int I = mVar.I(this.options);
            if (I == -1) {
                mVar.O();
                mVar.Q();
            } else if (I == 0) {
                strFromJson = this.nullableStringAdapter.fromJson(mVar);
            } else if (I == 1) {
                strFromJson2 = this.nullableStringAdapter.fromJson(mVar);
            }
        }
        mVar.d();
        return new ErrorResponse.Error.TransitionFromTerminalStateError(strFromJson, strFromJson2);
    }

    @Override // hn.h
    public void toJson(@NotNull t tVar, @Nullable ErrorResponse.Error.TransitionFromTerminalStateError transitionFromTerminalStateError) {
        if (transitionFromTerminalStateError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.c();
        tVar.o(Title.type);
        this.nullableStringAdapter.toJson(tVar, transitionFromTerminalStateError.getTitle());
        tVar.o("details");
        this.nullableStringAdapter.toJson(tVar, transitionFromTerminalStateError.getDetails());
        tVar.g();
    }
}
