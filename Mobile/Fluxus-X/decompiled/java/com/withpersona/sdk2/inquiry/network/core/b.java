package com.withpersona.sdk2.inquiry.network.core;

import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.util.List;
import mv.s;
import mv.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<String, Unit> f10948a;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull Function1<? super String, Unit> function1) {
        this.f10948a = function1;
    }

    @Override // mv.s
    public void secureConnectEnd(@NotNull mv.e eVar, @Nullable x xVar) {
        List<Certificate> listE;
        Certificate certificate;
        if (xVar == null || (listE = xVar.e()) == null || (certificate = (Certificate) CollectionsKt.firstOrNull(listE)) == null) {
            return;
        }
        this.f10948a.invoke(p001kotlin.text.e.i(MessageDigest.getInstance("SHA-256").digest(certificate.getEncoded()), null, 1, null));
    }
}
