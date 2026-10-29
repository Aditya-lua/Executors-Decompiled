package com.withpersona.sdk2.inquiry.tracking;

import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import jt.o;
import kotlin.Metadata;
import kotlin.text.Regex;
import kotlin.text.x;
import ku.g1;
import ku.i;
import ku.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.c;
import pt.d;
import pt.f;
import pt.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0004\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "data", "publicKeyPem", "Lcom/withpersona/sdk2/inquiry/tracking/ObfuscationResult;", "obfuscatePayload", "(Ljava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "pem", "Ljava/security/PublicKey;", "parsePublicKeyPem", "(Ljava/lang/String;)Ljava/security/PublicKey;", "", "GCM_TAG_LENGTH_BITS", "I", "GCM_IV_LENGTH_BYTES", "AES_KEY_LENGTH_BYTES", "TEST_OBFUSCATION_KEY", "Ljava/lang/String;", "tracking-events_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class TrackingEventUtilsKt {
    private static final int AES_KEY_LENGTH_BYTES = 32;
    private static final int GCM_IV_LENGTH_BYTES = 12;
    private static final int GCM_TAG_LENGTH_BITS = 128;

    @NotNull
    private static final String TEST_OBFUSCATION_KEY = "4ERbfREmnh82jvK5QaXOv8jZ3OQq9hKg5o/Hbb3l9bk=";

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.tracking.TrackingEventUtilsKt$obfuscatePayload$1, reason: invalid class name */
    @f(c = "com.withpersona.sdk2.inquiry.tracking.TrackingEventUtilsKt", f = "TrackingEventUtils.kt", l = {42, 55}, m = "obfuscatePayload")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(nt.b<? super AnonymousClass1> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrackingEventUtilsKt.obfuscatePayload(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.tracking.TrackingEventUtilsKt$obfuscatePayload$2, reason: invalid class name */
    @f(c = "com.withpersona.sdk2.inquiry.tracking.TrackingEventUtilsKt", f = "TrackingEventUtils.kt", l = {85}, m = "obfuscatePayload")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass2(nt.b<? super AnonymousClass2> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrackingEventUtilsKt.obfuscatePayload(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public static final Object obfuscatePayload(@NotNull String str, @NotNull String str2, @NotNull nt.b<? super ObfuscationResult> bVar) {
        AnonymousClass1 anonymousClass1;
        String str3;
        byte[] bytes;
        byte[] bArr;
        SecretKeySpec secretKeySpec;
        byte[] bArr2;
        String str4;
        byte[] bArr3;
        String str5;
        if (bVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) bVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(bVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(bVar);
        }
        Object objG = anonymousClass1.result;
        Object objE = c.e();
        int i11 = anonymousClass1.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    byte[] bArr4 = (byte[]) anonymousClass1.L$5;
                    secretKeySpec = (SecretKeySpec) anonymousClass1.L$4;
                    bArr = (byte[]) anonymousClass1.L$3;
                    bytes = (byte[]) anonymousClass1.L$2;
                    str4 = (String) anonymousClass1.L$1;
                    String str6 = (String) anonymousClass1.L$0;
                    o.b(objG);
                    bArr2 = bArr4;
                    str3 = str6;
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str5 = (String) anonymousClass1.L$9;
                    bArr3 = (byte[]) anonymousClass1.L$3;
                    o.b(objG);
                }
                String strEncodeToString = Base64.encodeToString(((Cipher) objG).doFinal(bArr3), 2);
                str5.getClass();
                strEncodeToString.getClass();
                return new ObfuscationResult(str5, strEncodeToString);
            }
            o.b(objG);
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            str3 = str;
            bytes = str3.getBytes(charset);
            bytes.getClass();
            byte[] bArr5 = new byte[32];
            new SecureRandom().nextBytes(bArr5);
            SecretKeySpec secretKeySpec2 = new SecretKeySpec(bArr5, "AES");
            byte[] bArr6 = new byte[12];
            new SecureRandom().nextBytes(bArr6);
            l0 l0VarB = g1.b();
            TrackingEventUtilsKt$obfuscatePayload$aesCipher$1 trackingEventUtilsKt$obfuscatePayload$aesCipher$1 = new TrackingEventUtilsKt$obfuscatePayload$aesCipher$1(secretKeySpec2, bArr6, null);
            anonymousClass1.L$0 = l.a(str3);
            anonymousClass1.L$1 = str2;
            anonymousClass1.L$2 = bytes;
            anonymousClass1.L$3 = bArr5;
            anonymousClass1.L$4 = l.a(secretKeySpec2);
            anonymousClass1.L$5 = bArr6;
            anonymousClass1.label = 1;
            Object objG2 = i.g(l0VarB, trackingEventUtilsKt$obfuscatePayload$aesCipher$1, anonymousClass1);
            if (objG2 != objE) {
                bArr = bArr5;
                objG = objG2;
                secretKeySpec = secretKeySpec2;
                bArr2 = bArr6;
                str4 = str2;
            }
            return objE;
            Cipher cipher = (Cipher) objG;
            byte[] bArrDoFinal = cipher.doFinal(bytes);
            byte[] bArr7 = new byte[bArrDoFinal.length + bArr2.length];
            kotlin.collections.l.j(bArrDoFinal, bArr7, 0, 0, 0, 12, null);
            kotlin.collections.l.j(bArr2, bArr7, bArrDoFinal.length, 0, 0, 12, null);
            String strEncodeToString2 = Base64.encodeToString(bArr7, 2);
            PublicKey publicKeyPem = parsePublicKeyPem(str4);
            l0 l0VarB2 = g1.b();
            TrackingEventUtilsKt$obfuscatePayload$rsaCipher$1 trackingEventUtilsKt$obfuscatePayload$rsaCipher$1 = new TrackingEventUtilsKt$obfuscatePayload$rsaCipher$1(publicKeyPem, null);
            anonymousClass1.L$0 = l.a(str3);
            anonymousClass1.L$1 = l.a(str4);
            anonymousClass1.L$2 = l.a(bytes);
            anonymousClass1.L$3 = bArr;
            anonymousClass1.L$4 = l.a(secretKeySpec);
            anonymousClass1.L$5 = l.a(bArr2);
            anonymousClass1.L$6 = l.a(cipher);
            anonymousClass1.L$7 = l.a(bArrDoFinal);
            anonymousClass1.L$8 = l.a(bArr7);
            anonymousClass1.L$9 = strEncodeToString2;
            anonymousClass1.L$10 = l.a(publicKeyPem);
            anonymousClass1.label = 2;
            objG = i.g(l0VarB2, trackingEventUtilsKt$obfuscatePayload$rsaCipher$1, anonymousClass1);
            if (objG != objE) {
                bArr3 = bArr;
                str5 = strEncodeToString2;
                String strEncodeToString3 = Base64.encodeToString(((Cipher) objG).doFinal(bArr3), 2);
                str5.getClass();
                strEncodeToString3.getClass();
                return new ObfuscationResult(str5, strEncodeToString3);
            }
            return objE;
        } catch (Exception e10) {
            throw new TrackingEventsObfuscationException("Failed to encrypt payload", e10);
        }
    }

    private static final PublicKey parsePublicKeyPem(String str) throws InvalidKeySpecException {
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(new Regex("\\s").replace(x.N(x.N(str, "-----BEGIN PUBLIC KEY-----", "", false, 4, null), "-----END PUBLIC KEY-----", "", false, 4, null), ""), 0)));
        publicKeyGeneratePublic.getClass();
        return publicKeyGeneratePublic;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object obfuscatePayload(@NotNull String str, @NotNull nt.b<? super String> bVar) {
        AnonymousClass2 anonymousClass2;
        byte[] bArr;
        byte[] bArr2;
        if (bVar instanceof AnonymousClass2) {
            anonymousClass2 = (AnonymousClass2) bVar;
            int i10 = anonymousClass2.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass2.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass2 = new AnonymousClass2(bVar);
            }
        } else {
            anonymousClass2 = new AnonymousClass2(bVar);
        }
        Object obj = anonymousClass2.result;
        Object objE = c.e();
        int i11 = anonymousClass2.label;
        try {
            if (i11 == 0) {
                o.b(obj);
                Charset charset = StandardCharsets.UTF_8;
                charset.getClass();
                byte[] bytes = str.getBytes(charset);
                bytes.getClass();
                byte[] bArrDecode = Base64.decode(TEST_OBFUSCATION_KEY, 0);
                bArrDecode.getClass();
                if (bArrDecode.length != 0) {
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArrDecode, "AES");
                    byte[] bArr3 = new byte[12];
                    new SecureRandom().nextBytes(bArr3);
                    l0 l0VarB = g1.b();
                    TrackingEventUtilsKt$obfuscatePayload$cipher$1 trackingEventUtilsKt$obfuscatePayload$cipher$1 = new TrackingEventUtilsKt$obfuscatePayload$cipher$1(secretKeySpec, bArr3, null);
                    anonymousClass2.L$0 = l.a(str);
                    anonymousClass2.L$1 = bytes;
                    anonymousClass2.L$2 = l.a(bArrDecode);
                    anonymousClass2.L$3 = l.a(secretKeySpec);
                    anonymousClass2.L$4 = bArr3;
                    anonymousClass2.label = 1;
                    Object objG = i.g(l0VarB, trackingEventUtilsKt$obfuscatePayload$cipher$1, anonymousClass2);
                    if (objG == objE) {
                        return objE;
                    }
                    bArr = bytes;
                    obj = objG;
                    bArr2 = bArr3;
                } else {
                    throw new TrackingEventsObfuscationException("Invalid obfuscation key (empty after Base64 decode)", null, 2, null);
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                byte[] bArr4 = (byte[]) anonymousClass2.L$4;
                bArr = (byte[]) anonymousClass2.L$1;
                o.b(obj);
                bArr2 = bArr4;
            }
            byte[] bArrDoFinal = ((Cipher) obj).doFinal(bArr);
            byte[] bArr5 = new byte[bArrDoFinal.length + bArr2.length];
            kotlin.collections.l.j(bArrDoFinal, bArr5, 0, 0, 0, 12, null);
            kotlin.collections.l.j(bArr2, bArr5, bArrDoFinal.length, 0, 0, 12, null);
            String strEncodeToString = Base64.encodeToString(bArr5, 2);
            strEncodeToString.getClass();
            return strEncodeToString;
        } catch (Exception e10) {
            throw new TrackingEventsObfuscationException("Failed to encrypt payload", e10);
        }
    }
}
