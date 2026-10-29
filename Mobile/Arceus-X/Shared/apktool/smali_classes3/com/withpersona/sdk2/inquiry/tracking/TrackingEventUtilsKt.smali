.class public final Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086@\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@\u00a2\u0006\u0004\u0008\u0004\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\t\u0010\n\"\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u00008\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "",
        "data",
        "publicKeyPem",
        "Lcom/withpersona/sdk2/inquiry/tracking/ObfuscationResult;",
        "obfuscatePayload",
        "(Ljava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;",
        "(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;",
        "pem",
        "Ljava/security/PublicKey;",
        "parsePublicKeyPem",
        "(Ljava/lang/String;)Ljava/security/PublicKey;",
        "",
        "GCM_TAG_LENGTH_BITS",
        "I",
        "GCM_IV_LENGTH_BYTES",
        "AES_KEY_LENGTH_BYTES",
        "TEST_OBFUSCATION_KEY",
        "Ljava/lang/String;",
        "tracking-events_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final AES_KEY_LENGTH_BYTES:I = 0x20

.field private static final GCM_IV_LENGTH_BYTES:I = 0xc

.field private static final GCM_TAG_LENGTH_BITS:I = 0x80

.field private static final TEST_OBFUSCATION_KEY:Ljava/lang/String; = "4ERbfREmnh82jvK5QaXOv8jZ3OQq9hKg5o/Hbb3l9bk="
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static final obfuscatePayload(Ljava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;
    .locals 19
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/tracking/ObfuscationResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    move-object/from16 v0, p2

    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;

    iget v2, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->label:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;

    invoke-direct {v1, v0}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;-><init>(Lnt/b;)V

    :goto_0
    iget-object v0, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->result:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v2

    .line 1
    iget v3, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->label:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x2

    if-eqz v3, :cond_3

    if-eq v3, v5, :cond_2

    if-ne v3, v6, :cond_1

    iget-object v2, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->L$10:Ljava/lang/Object;

    check-cast v2, Ljava/security/PublicKey;

    iget-object v2, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->L$9:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v3, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->L$8:Ljava/lang/Object;

    check-cast v3, [B

    iget-object v3, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->L$7:Ljava/lang/Object;

    check-cast v3, [B

    iget-object v3, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->L$6:Ljava/lang/Object;

    check-cast v3, Ljavax/crypto/Cipher;

    iget-object v3, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->L$5:Ljava/lang/Object;

    check-cast v3, [B

    iget-object v3, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->L$4:Ljava/lang/Object;

    check-cast v3, Ljavax/crypto/spec/SecretKeySpec;

    iget-object v3, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->L$3:Ljava/lang/Object;

    check-cast v3, [B

    iget-object v4, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->L$2:Ljava/lang/Object;

    check-cast v4, [B

    iget-object v4, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v1, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->L$0:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    :try_start_0
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_3

    .line 2
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v3, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->L$5:Ljava/lang/Object;

    check-cast v3, [B

    iget-object v5, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->L$4:Ljava/lang/Object;

    check-cast v5, Ljavax/crypto/spec/SecretKeySpec;

    iget-object v7, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->L$3:Ljava/lang/Object;

    check-cast v7, [B

    iget-object v8, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->L$2:Ljava/lang/Object;

    check-cast v8, [B

    iget-object v9, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->L$1:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v10, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->L$0:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    :try_start_1
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object/from16 v18, v10

    move-object v10, v3

    move-object/from16 v3, v18

    goto :goto_1

    .line 3
    :cond_3
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    .line 4
    :try_start_2
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v3, p0

    invoke-virtual {v3, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v0, 0x20

    .line 5
    new-array v0, v0, [B

    .line 6
    new-instance v7, Ljava/security/SecureRandom;

    invoke-direct {v7}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v7, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 7
    new-instance v7, Ljavax/crypto/spec/SecretKeySpec;

    const-string v9, "AES"

    invoke-direct {v7, v0, v9}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    const/16 v9, 0xc

    .line 8
    new-array v9, v9, [B

    .line 9
    new-instance v10, Ljava/security/SecureRandom;

    invoke-direct {v10}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v10, v9}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 10
    invoke-static {}, Lku/g1;->b()Lku/l0;

    move-result-object v10

    new-instance v11, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$aesCipher$1;

    invoke-direct {v11, v7, v9, v4}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$aesCipher$1;-><init>(Ljavax/crypto/spec/SecretKeySpec;[BLnt/b;)V

    invoke-static {v3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->L$0:Ljava/lang/Object;

    move-object/from16 v12, p1

    iput-object v12, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->L$1:Ljava/lang/Object;

    iput-object v8, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->L$2:Ljava/lang/Object;

    iput-object v0, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->L$3:Ljava/lang/Object;

    invoke-static {v7}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    iput-object v13, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->L$4:Ljava/lang/Object;

    iput-object v9, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->L$5:Ljava/lang/Object;

    iput v5, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->label:I

    invoke-static {v10, v11, v1}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v2, :cond_4

    goto/16 :goto_2

    :cond_4
    move-object v10, v7

    move-object v7, v0

    move-object v0, v5

    move-object v5, v10

    move-object v10, v9

    move-object v9, v12

    .line 11
    :goto_1
    check-cast v0, Ljavax/crypto/Cipher;

    .line 12
    invoke-virtual {v0, v8}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v11

    .line 13
    array-length v12, v11

    array-length v13, v10

    add-int/2addr v12, v13

    new-array v12, v12, [B

    const/16 v16, 0xc

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    .line 14
    invoke-static/range {v11 .. v17}, Lkotlin/collections/l;->j([B[BIIIILjava/lang/Object;)[B

    move-object v13, v12

    .line 15
    array-length v12, v11

    const/16 v15, 0xc

    const/16 v16, 0x0

    move-object v14, v11

    move-object v11, v13

    const/4 v13, 0x0

    move-object/from16 v17, v14

    const/4 v14, 0x0

    invoke-static/range {v10 .. v16}, Lkotlin/collections/l;->j([B[BIIIILjava/lang/Object;)[B

    .line 16
    invoke-static {v11, v6}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v12

    .line 17
    invoke-static {v9}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt;->parsePublicKeyPem(Ljava/lang/String;)Ljava/security/PublicKey;

    move-result-object v13

    .line 18
    invoke-static {}, Lku/g1;->b()Lku/l0;

    move-result-object v14

    new-instance v15, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$rsaCipher$1;

    invoke-direct {v15, v13, v4}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$rsaCipher$1;-><init>(Ljava/security/PublicKey;Lnt/b;)V

    invoke-static {v3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->L$0:Ljava/lang/Object;

    invoke-static {v9}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->L$1:Ljava/lang/Object;

    invoke-static {v8}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->L$2:Ljava/lang/Object;

    iput-object v7, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->L$3:Ljava/lang/Object;

    invoke-static {v5}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->L$4:Ljava/lang/Object;

    invoke-static {v10}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->L$5:Ljava/lang/Object;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->L$6:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->L$7:Ljava/lang/Object;

    invoke-static {v11}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->L$8:Ljava/lang/Object;

    iput-object v12, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->L$9:Ljava/lang/Object;

    invoke-static {v13}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->L$10:Ljava/lang/Object;

    iput v6, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$1;->label:I

    invoke-static {v14, v15, v1}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_5

    :goto_2
    return-object v2

    :cond_5
    move-object v3, v7

    move-object v2, v12

    .line 19
    :goto_3
    check-cast v0, Ljavax/crypto/Cipher;

    .line 20
    invoke-virtual {v0, v3}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v0

    .line 21
    invoke-static {v0, v6}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    .line 22
    new-instance v1, Lcom/withpersona/sdk2/inquiry/tracking/ObfuscationResult;

    .line 23
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    invoke-direct {v1, v2, v0}, Lcom/withpersona/sdk2/inquiry/tracking/ObfuscationResult;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    .line 26
    new-instance v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsObfuscationException;

    const-string v2, "Failed to encrypt payload"

    invoke-direct {v1, v2, v0}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsObfuscationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static final obfuscatePayload(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;
    .locals 13
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lnt/b<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v1, p1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$2;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$2;

    iget v2, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$2;->label:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$2;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$2;

    invoke-direct {v1, p1}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$2;-><init>(Lnt/b;)V

    :goto_0
    iget-object v0, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$2;->result:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v2

    .line 27
    iget v3, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$2;->label:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v5, :cond_1

    iget-object v2, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$2;->L$4:Ljava/lang/Object;

    check-cast v2, [B

    iget-object v3, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$2;->L$3:Ljava/lang/Object;

    check-cast v3, Ljavax/crypto/spec/SecretKeySpec;

    iget-object v3, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$2;->L$2:Ljava/lang/Object;

    check-cast v3, [B

    iget-object v3, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$2;->L$1:Ljava/lang/Object;

    check-cast v3, [B

    iget-object v1, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$2;->L$0:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    :try_start_0
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v5, v2

    goto :goto_1

    .line 28
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    .line 29
    :try_start_1
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    const-string v6, "4ERbfREmnh82jvK5QaXOv8jZ3OQq9hKg5o/Hbb3l9bk="

    const/4 v7, 0x0

    invoke-static {v6, v7}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v6

    .line 31
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    array-length v7, v6

    const/4 v8, 0x0

    if-eqz v7, :cond_4

    .line 32
    new-instance v7, Ljavax/crypto/spec/SecretKeySpec;

    const-string v9, "AES"

    invoke-direct {v7, v6, v9}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    const/16 v9, 0xc

    .line 33
    new-array v9, v9, [B

    .line 34
    new-instance v10, Ljava/security/SecureRandom;

    invoke-direct {v10}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual {v10, v9}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 35
    invoke-static {}, Lku/g1;->b()Lku/l0;

    move-result-object v10

    new-instance v11, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$cipher$1;

    invoke-direct {v11, v7, v9, v8}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$cipher$1;-><init>(Ljavax/crypto/spec/SecretKeySpec;[BLnt/b;)V

    invoke-static {p0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$2;->L$0:Ljava/lang/Object;

    iput-object v0, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$2;->L$1:Ljava/lang/Object;

    invoke-static {v6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$2;->L$2:Ljava/lang/Object;

    invoke-static {v7}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$2;->L$3:Ljava/lang/Object;

    iput-object v9, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$2;->L$4:Ljava/lang/Object;

    iput v5, v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventUtilsKt$obfuscatePayload$2;->label:I

    invoke-static {v10, v11, v1}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_3

    return-object v2

    :cond_3
    move-object v3, v0

    move-object v0, v1

    move-object v5, v9

    .line 36
    :goto_1
    check-cast v0, Ljavax/crypto/Cipher;

    .line 37
    invoke-virtual {v0, v3}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v6

    .line 38
    array-length v0, v6

    array-length v1, v5

    add-int/2addr v0, v1

    new-array v7, v0, [B

    const/16 v11, 0xc

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 39
    invoke-static/range {v6 .. v12}, Lkotlin/collections/l;->j([B[BIIIILjava/lang/Object;)[B

    .line 40
    array-length v0, v6

    const/16 v10, 0xc

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v6, v7

    move v7, v0

    invoke-static/range {v5 .. v11}, Lkotlin/collections/l;->j([B[BIIIILjava/lang/Object;)[B

    move-object v7, v6

    .line 41
    invoke-static {v7, v4}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0

    .line 42
    :cond_4
    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsObfuscationException;

    .line 43
    const-string v1, "Invalid obfuscation key (empty after Base64 decode)"

    .line 44
    invoke-direct {v0, v1, v8, v4, v8}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsObfuscationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception v0

    .line 45
    new-instance v1, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsObfuscationException;

    const-string v2, "Failed to encrypt payload"

    invoke-direct {v1, v2, v0}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsObfuscationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method private static final parsePublicKeyPem(Ljava/lang/String;)Ljava/security/PublicKey;
    .locals 12

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, "-----BEGIN PUBLIC KEY-----"

    const-string v2, ""

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lkotlin/text/x;->N(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const/4 v10, 0x4

    const/4 v11, 0x0

    const-string v7, "-----END PUBLIC KEY-----"

    const-string v8, ""

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lkotlin/text/x;->N(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Lkotlin/text/Regex;

    const-string v1, "\\s"

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    const-string v1, ""

    invoke-virtual {v0, p0, v1}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    invoke-static {p0, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p0

    new-instance v0, Ljava/security/spec/X509EncodedKeySpec;

    invoke-direct {v0, p0}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    const-string p0, "RSA"

    invoke-static {p0}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object p0

    invoke-virtual {p0, v0}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method
