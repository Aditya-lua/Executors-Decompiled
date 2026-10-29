package com.withpersona.sdk2.inquiry.tracking;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ku.p0;
import ot.c;
import pt.f;
import pt.m;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lku/p0;", "Ljavax/crypto/Cipher;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lku/p0;)Ljavax/crypto/Cipher;"}, k = 3, mv = {2, 2, 0})
@f(c = "com.withpersona.sdk2.inquiry.tracking.TrackingEventUtilsKt$obfuscatePayload$cipher$1", f = "TrackingEventUtils.kt", l = {}, m = "invokeSuspend")
public final class TrackingEventUtilsKt$obfuscatePayload$cipher$1 extends m implements Function2<p0, nt.b<? super Cipher>, Object> {
    final /* synthetic */ byte[] $iv;
    final /* synthetic */ SecretKeySpec $secretKey;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingEventUtilsKt$obfuscatePayload$cipher$1(SecretKeySpec secretKeySpec, byte[] bArr, nt.b<? super TrackingEventUtilsKt$obfuscatePayload$cipher$1> bVar) {
        super(2, bVar);
        this.$secretKey = secretKeySpec;
        this.$iv = bArr;
    }

    @Override // pt.a
    public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
        return new TrackingEventUtilsKt$obfuscatePayload$cipher$1(this.$secretKey, this.$iv, bVar);
    }

    @Override // pt.a
    public final Object invokeSuspend(Object obj) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        c.e();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(obj);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, this.$secretKey, new GCMParameterSpec(128, this.$iv));
        return cipher;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(p0 p0Var, nt.b<? super Cipher> bVar) {
        return ((TrackingEventUtilsKt$obfuscatePayload$cipher$1) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
    }
}
