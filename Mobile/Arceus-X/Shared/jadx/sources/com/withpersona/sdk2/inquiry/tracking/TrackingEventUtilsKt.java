package com.withpersona.sdk2.inquiry.tracking;

import android.util.Base64;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.collections.C7691l;
import kotlin.text.C7797x;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p256ku.AbstractC7888l0;
import p256ku.C7864g1;
import p256ku.C7872i;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10342d;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0004\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m31665d2 = {"", "data", "publicKeyPem", "Lcom/withpersona/sdk2/inquiry/tracking/ObfuscationResult;", "obfuscatePayload", "(Ljava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "pem", "Ljava/security/PublicKey;", "parsePublicKeyPem", "(Ljava/lang/String;)Ljava/security/PublicKey;", "", "GCM_TAG_LENGTH_BITS", "I", "GCM_IV_LENGTH_BYTES", "AES_KEY_LENGTH_BYTES", "TEST_OBFUSCATION_KEY", "Ljava/lang/String;", "tracking-events_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class TrackingEventUtilsKt {
    private static final int AES_KEY_LENGTH_BYTES = 32;
    private static final int GCM_IV_LENGTH_BYTES = 12;
    private static final int GCM_TAG_LENGTH_BITS = 128;

    @NotNull
    private static final String TEST_OBFUSCATION_KEY = "4ERbfREmnh82jvK5QaXOv8jZ3OQq9hKg5o/Hbb3l9bk=";

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.tracking.TrackingEventUtilsKt$obfuscatePayload$1 */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.tracking.TrackingEventUtilsKt", m39664f = "TrackingEventUtils.kt", m39665l = {42, 55}, m39666m = "obfuscatePayload")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C41031 extends AbstractC10342d {
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

        public C41031(InterfaceC9557b<? super C41031> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return TrackingEventUtilsKt.obfuscatePayload(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.tracking.TrackingEventUtilsKt$obfuscatePayload$2 */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.tracking.TrackingEventUtilsKt", m39664f = "TrackingEventUtils.kt", m39665l = {85}, m39666m = "obfuscatePayload")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C41042 extends AbstractC10342d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C41042(InterfaceC9557b<? super C41042> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return TrackingEventUtilsKt.obfuscatePayload(null, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public static final Object obfuscatePayload(@NotNull String str, @NotNull String str2, @NotNull InterfaceC9557b<? super ObfuscationResult> interfaceC9557b) {
        C41031 c41031;
        String str3;
        byte[] bytes;
        byte[] bArr;
        SecretKeySpec secretKeySpec;
        byte[] bArr2;
        String str4;
        byte[] bArr3;
        String str5;
        if (interfaceC9557b instanceof C41031) {
            c41031 = (C41031) interfaceC9557b;
            int i10 = c41031.label;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                c41031.label = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                c41031 = new C41031(interfaceC9557b);
            }
        } else {
            c41031 = new C41031(interfaceC9557b);
        }
        Object objM32684g = c41031.result;
        Object objM38805e = C10047c.m38805e();
        int i11 = c41031.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    byte[] bArr4 = (byte[]) c41031.L$5;
                    secretKeySpec = (SecretKeySpec) c41031.L$4;
                    bArr = (byte[]) c41031.L$3;
                    bytes = (byte[]) c41031.L$2;
                    str4 = (String) c41031.L$1;
                    String str6 = (String) c41031.L$0;
                    C7348o.m30470b(objM32684g);
                    bArr2 = bArr4;
                    str3 = str6;
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str5 = (String) c41031.L$9;
                    bArr3 = (byte[]) c41031.L$3;
                    C7348o.m30470b(objM32684g);
                }
                String strEncodeToString = Base64.encodeToString(((Cipher) objM32684g).doFinal(bArr3), 2);
                str5.getClass();
                strEncodeToString.getClass();
                return new ObfuscationResult(str5, strEncodeToString);
            }
            C7348o.m30470b(objM32684g);
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
            AbstractC7888l0 abstractC7888l0M32644b = C7864g1.m32644b();
            TrackingEventUtilsKt$obfuscatePayload$aesCipher$1 trackingEventUtilsKt$obfuscatePayload$aesCipher$1 = new TrackingEventUtilsKt$obfuscatePayload$aesCipher$1(secretKeySpec2, bArr6, null);
            c41031.L$0 = C10350l.m39676a(str3);
            c41031.L$1 = str2;
            c41031.L$2 = bytes;
            c41031.L$3 = bArr5;
            c41031.L$4 = C10350l.m39676a(secretKeySpec2);
            c41031.L$5 = bArr6;
            c41031.label = 1;
            Object objM32684g2 = C7872i.m32684g(abstractC7888l0M32644b, trackingEventUtilsKt$obfuscatePayload$aesCipher$1, c41031);
            if (objM32684g2 != objM38805e) {
                bArr = bArr5;
                objM32684g = objM32684g2;
                secretKeySpec = secretKeySpec2;
                bArr2 = bArr6;
                str4 = str2;
            }
            return objM38805e;
            Cipher cipher = (Cipher) objM32684g;
            byte[] bArrDoFinal = cipher.doFinal(bytes);
            byte[] bArr7 = new byte[bArrDoFinal.length + bArr2.length];
            C7691l.m31815j(bArrDoFinal, bArr7, 0, 0, 0, 12, null);
            C7691l.m31815j(bArr2, bArr7, bArrDoFinal.length, 0, 0, 12, null);
            String strEncodeToString2 = Base64.encodeToString(bArr7, 2);
            PublicKey publicKeyPem = parsePublicKeyPem(str4);
            AbstractC7888l0 abstractC7888l0M32644b2 = C7864g1.m32644b();
            TrackingEventUtilsKt$obfuscatePayload$rsaCipher$1 trackingEventUtilsKt$obfuscatePayload$rsaCipher$1 = new TrackingEventUtilsKt$obfuscatePayload$rsaCipher$1(publicKeyPem, null);
            c41031.L$0 = C10350l.m39676a(str3);
            c41031.L$1 = C10350l.m39676a(str4);
            c41031.L$2 = C10350l.m39676a(bytes);
            c41031.L$3 = bArr;
            c41031.L$4 = C10350l.m39676a(secretKeySpec);
            c41031.L$5 = C10350l.m39676a(bArr2);
            c41031.L$6 = C10350l.m39676a(cipher);
            c41031.L$7 = C10350l.m39676a(bArrDoFinal);
            c41031.L$8 = C10350l.m39676a(bArr7);
            c41031.L$9 = strEncodeToString2;
            c41031.L$10 = C10350l.m39676a(publicKeyPem);
            c41031.label = 2;
            objM32684g = C7872i.m32684g(abstractC7888l0M32644b2, trackingEventUtilsKt$obfuscatePayload$rsaCipher$1, c41031);
            if (objM32684g != objM38805e) {
                bArr3 = bArr;
                str5 = strEncodeToString2;
                String strEncodeToString3 = Base64.encodeToString(((Cipher) objM32684g).doFinal(bArr3), 2);
                str5.getClass();
                strEncodeToString3.getClass();
                return new ObfuscationResult(str5, strEncodeToString3);
            }
            return objM38805e;
        } catch (Exception e10) {
            throw new TrackingEventsObfuscationException("Failed to encrypt payload", e10);
        }
    }

    private static final PublicKey parsePublicKeyPem(String str) throws InvalidKeySpecException {
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(new Regex("\\s").replace(C7797x.m32303N(C7797x.m32303N(str, "-----BEGIN PUBLIC KEY-----", "", false, 4, null), "-----END PUBLIC KEY-----", "", false, 4, null), ""), 0)));
        publicKeyGeneratePublic.getClass();
        return publicKeyGeneratePublic;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object obfuscatePayload(@NotNull String str, @NotNull InterfaceC9557b<? super String> interfaceC9557b) {
        C41042 c41042;
        byte[] bArr;
        byte[] bArr2;
        if (interfaceC9557b instanceof C41042) {
            c41042 = (C41042) interfaceC9557b;
            int i10 = c41042.label;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                c41042.label = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                c41042 = new C41042(interfaceC9557b);
            }
        } else {
            c41042 = new C41042(interfaceC9557b);
        }
        Object obj = c41042.result;
        Object objM38805e = C10047c.m38805e();
        int i11 = c41042.label;
        try {
            if (i11 == 0) {
                C7348o.m30470b(obj);
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
                    AbstractC7888l0 abstractC7888l0M32644b = C7864g1.m32644b();
                    TrackingEventUtilsKt$obfuscatePayload$cipher$1 trackingEventUtilsKt$obfuscatePayload$cipher$1 = new TrackingEventUtilsKt$obfuscatePayload$cipher$1(secretKeySpec, bArr3, null);
                    c41042.L$0 = C10350l.m39676a(str);
                    c41042.L$1 = bytes;
                    c41042.L$2 = C10350l.m39676a(bArrDecode);
                    c41042.L$3 = C10350l.m39676a(secretKeySpec);
                    c41042.L$4 = bArr3;
                    c41042.label = 1;
                    Object objM32684g = C7872i.m32684g(abstractC7888l0M32644b, trackingEventUtilsKt$obfuscatePayload$cipher$1, c41042);
                    if (objM32684g == objM38805e) {
                        return objM38805e;
                    }
                    bArr = bytes;
                    obj = objM32684g;
                    bArr2 = bArr3;
                } else {
                    throw new TrackingEventsObfuscationException("Invalid obfuscation key (empty after Base64 decode)", null, 2, null);
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                byte[] bArr4 = (byte[]) c41042.L$4;
                bArr = (byte[]) c41042.L$1;
                C7348o.m30470b(obj);
                bArr2 = bArr4;
            }
            byte[] bArrDoFinal = ((Cipher) obj).doFinal(bArr);
            byte[] bArr5 = new byte[bArrDoFinal.length + bArr2.length];
            C7691l.m31815j(bArrDoFinal, bArr5, 0, 0, 0, 12, null);
            C7691l.m31815j(bArr2, bArr5, bArrDoFinal.length, 0, 0, 12, null);
            String strEncodeToString = Base64.encodeToString(bArr5, 2);
            strEncodeToString.getClass();
            return strEncodeToString;
        } catch (Exception e10) {
            throw new TrackingEventsObfuscationException("Failed to encrypt payload", e10);
        }
    }
}
