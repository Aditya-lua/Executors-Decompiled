package com.withpersona.sdk2.inquiry.tracking;

import av.p0;
import com.google.mlkit.vision.barcode.common.Barcode;
import fu.c;
import gu.f;
import gu.m;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import zt.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lav/p0;", "Ljavax/crypto/Cipher;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lav/p0;)Ljavax/crypto/Cipher;"}, k = 3, mv = {2, 2, 0})
@f(c = "com.withpersona.sdk2.inquiry.tracking.TrackingEventUtilsKt$obfuscatePayload$aesCipher$1", f = "TrackingEventUtils.kt", l = {}, m = "invokeSuspend")
public final class TrackingEventUtilsKt$obfuscatePayload$aesCipher$1 extends m implements Function2<p0, eu.b<? super Cipher>, Object> {
    final /* synthetic */ SecretKeySpec $aesKey;
    final /* synthetic */ byte[] $iv;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingEventUtilsKt$obfuscatePayload$aesCipher$1(SecretKeySpec secretKeySpec, byte[] bArr, eu.b<? super TrackingEventUtilsKt$obfuscatePayload$aesCipher$1> bVar) {
        super(2, bVar);
        this.$aesKey = secretKeySpec;
        this.$iv = bArr;
    }

    @Override // gu.a
    public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
        return new TrackingEventUtilsKt$obfuscatePayload$aesCipher$1(this.$aesKey, this.$iv, bVar);
    }

    @Override // gu.a
    public final Object invokeSuspend(Object obj) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        c.e();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(obj);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, this.$aesKey, new GCMParameterSpec(Barcode.FORMAT_ITF, this.$iv));
        return cipher;
    }

    @Override // p001kotlin.jvm.functions.Function2
    public final Object invoke(p0 p0Var, eu.b<? super Cipher> bVar) {
        return ((TrackingEventUtilsKt$obfuscatePayload$aesCipher$1) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
    }
}
