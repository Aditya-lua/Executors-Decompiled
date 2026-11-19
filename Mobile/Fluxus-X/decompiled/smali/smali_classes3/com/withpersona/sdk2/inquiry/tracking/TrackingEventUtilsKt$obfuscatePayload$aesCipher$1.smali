.class final Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$aesCipher$1;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt;->obfuscatePayload(Ljava/lang/String;Ljava/lang/String;Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lav/p0;",
        "Leu/b<",
        "-",
        "Ljavax/crypto/Cipher;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.withpersona.sdk2.inquiry.tracking.TrackingEventUtilsKt$obfuscatePayload$aesCipher$1"
    f = "TrackingEventUtils.kt"
    l = {}
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lav/p0;",
        "Ljavax/crypto/Cipher;",
        "kotlin.jvm.PlatformType",
        "<anonymous>",
        "(Lav/p0;)Ljavax/crypto/Cipher;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field final synthetic $aesKey:Ljavax/crypto/spec/SecretKeySpec;

.field final synthetic $iv:[B

.field label:I


# direct methods
.method public constructor <init>(Ljavax/crypto/spec/SecretKeySpec;[BLeu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/crypto/spec/SecretKeySpec;",
            "[B",
            "Leu/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$aesCipher$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$aesCipher$1;->$aesKey:Ljavax/crypto/spec/SecretKeySpec;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$aesCipher$1;->$iv:[B

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Leu/b<",
            "*>;)",
            "Leu/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$aesCipher$1;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$aesCipher$1;->$aesKey:Ljavax/crypto/spec/SecretKeySpec;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$aesCipher$1;->$iv:[B

    invoke-direct {p1, v0, v1, p2}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$aesCipher$1;-><init>(Ljavax/crypto/spec/SecretKeySpec;[BLeu/b;)V

    return-object p1
.end method

.method public final invoke(Lav/p0;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lav/p0;",
            "Leu/b<",
            "-",
            "Ljavax/crypto/Cipher;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$aesCipher$1;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$aesCipher$1;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$aesCipher$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$aesCipher$1;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$aesCipher$1;->label:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    const-string p1, "AES/GCM/NoPadding"

    invoke-static {p1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object p1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$aesCipher$1;->$aesKey:Ljavax/crypto/spec/SecretKeySpec;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$aesCipher$1;->$iv:[B

    new-instance v2, Ljavax/crypto/spec/GCMParameterSpec;

    const/16 v3, 0x80

    invoke-direct {v2, v3, v1}, Ljavax/crypto/spec/GCMParameterSpec;-><init>(I[B)V

    const/4 v1, 0x1

    invoke-virtual {p1, v1, v0, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
