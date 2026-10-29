package com.withpersona.sdk2.inquiry.tracking;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p229jt.C7348o;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "Ljavax/crypto/Cipher;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lku/p0;)Ljavax/crypto/Cipher;"}, m31666k = 3, m31667mv = {2, 2, 0})
@InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.tracking.TrackingEventUtilsKt$obfuscatePayload$aesCipher$1", m39664f = "TrackingEventUtils.kt", m39665l = {}, m39666m = "invokeSuspend")
public final class TrackingEventUtilsKt$obfuscatePayload$aesCipher$1 extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Cipher>, Object> {
    final /* synthetic */ SecretKeySpec $aesKey;
    final /* synthetic */ byte[] $iv;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingEventUtilsKt$obfuscatePayload$aesCipher$1(SecretKeySpec secretKeySpec, byte[] bArr, InterfaceC9557b<? super TrackingEventUtilsKt$obfuscatePayload$aesCipher$1> interfaceC9557b) {
        super(2, interfaceC9557b);
        this.$aesKey = secretKeySpec;
        this.$iv = bArr;
    }

    @Override // pt.AbstractC10339a
    public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
        return new TrackingEventUtilsKt$obfuscatePayload$aesCipher$1(this.$aesKey, this.$iv, interfaceC9557b);
    }

    @Override // pt.AbstractC10339a
    public final Object invokeSuspend(Object obj) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        C10047c.m38805e();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C7348o.m30470b(obj);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, this.$aesKey, new GCMParameterSpec(128, this.$iv));
        return cipher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Cipher> interfaceC9557b) {
        return ((TrackingEventUtilsKt$obfuscatePayload$aesCipher$1) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
    }
}
