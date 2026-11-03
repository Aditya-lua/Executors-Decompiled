package com.withpersona.sdk2.inquiry.tracking;

import gt.o;
import iu.p0;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import mt.c;
import nt.f;
import nt.m;

/* JADX INFO: loaded from: classes3.dex */
@f(c = "com.withpersona.sdk2.inquiry.tracking.TrackingEventUtilsKt$obfuscatePayload$rsaCipher$1", f = "TrackingEventUtils.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Liu/p0;", "Ljavax/crypto/Cipher;", "kotlin.jvm.PlatformType", "<anonymous>", "(Liu/p0;)Ljavax/crypto/Cipher;"}, k = 3, mv = {2, 2, 0})
public final class TrackingEventUtilsKt$obfuscatePayload$rsaCipher$1 extends m implements Function2<p0, lt.b<? super Cipher>, Object> {
    final /* synthetic */ PublicKey $rsaPublicKey;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingEventUtilsKt$obfuscatePayload$rsaCipher$1(PublicKey publicKey, lt.b<? super TrackingEventUtilsKt$obfuscatePayload$rsaCipher$1> bVar) {
        super(2, bVar);
        this.$rsaPublicKey = publicKey;
    }

    @Override // nt.a
    public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
        return new TrackingEventUtilsKt$obfuscatePayload$rsaCipher$1(this.$rsaPublicKey, bVar);
    }

    @Override // nt.a
    public final Object invokeSuspend(Object obj) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        c.e();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(obj);
        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
        cipher.init(1, this.$rsaPublicKey);
        return cipher;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(p0 p0Var, lt.b<? super Cipher> bVar) {
        return ((TrackingEventUtilsKt$obfuscatePayload$rsaCipher$1) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
    }
}
