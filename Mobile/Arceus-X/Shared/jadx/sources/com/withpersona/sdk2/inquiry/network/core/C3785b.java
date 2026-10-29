package com.withpersona.sdk2.inquiry.network.core;

import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.C7778e;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Handshake;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.core.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C3785b extends EventListener {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Function1<String, Unit> f15667a;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C3785b(@NotNull Function1<? super String, Unit> function1) {
        this.f15667a = function1;
    }

    /* JADX DEBUG: Class process forced to load method for inline: kotlin.text.e.i(byte[], kotlin.text.f, int, java.lang.Object):java.lang.String */
    @Override // okhttp3.EventListener
    public void secureConnectEnd(@NotNull Call call, @Nullable Handshake handshake) {
        List<Certificate> listPeerCertificates;
        Certificate certificate;
        if (handshake == null || (listPeerCertificates = handshake.peerCertificates()) == null || (certificate = (Certificate) CollectionsKt.firstOrNull(listPeerCertificates)) == null) {
            return;
        }
        this.f15667a.invoke(C7778e.m32226i(MessageDigest.getInstance("SHA-256").digest(certificate.getEncoded()), null, 1, null));
    }
}
