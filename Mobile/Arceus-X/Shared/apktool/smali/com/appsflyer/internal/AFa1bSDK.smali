.class public Lcom/appsflyer/internal/AFa1bSDK;
.super Ljava/lang/Object;


# static fields
.field private static final $$a:[B = null

.field private static final $$b:I = 0x0

.field private static $10:I = 0x0

.field private static $11:I = 0x1

.field private static $12:I = 0x0

.field private static $13:I = 0x1

.field private static enableTCFDataCollection:[B

.field public static final getInstance:Ljava/util/Map;

.field private static getSdkVersion:Ljava/lang/Object;

.field private static onPause:Ljava/lang/Object;

.field private static setAndroidIdData:J

.field private static setCustomerUserId:[B

.field private static setDebugLog:J

.field private static setImeiData:I

.field private static setOaidData:I

.field private static setUserFirstName:I

.field private static setUserPhone:I

.field private static stop:[B

.field private static updateServerUninstallToken:J

.field public static final values:Ljava/util/Map;


# direct methods
.method private static $$c(BIS)Ljava/lang/String;
    .locals 6

    rsub-int/lit8 p0, p0, 0x77

    add-int/lit8 p2, p2, 0x4

    rsub-int/lit8 v0, p1, 0x31

    sget-object v1, Lcom/appsflyer/internal/AFa1bSDK;->$$a:[B

    new-array v0, v0, [B

    rsub-int/lit8 p1, p1, 0x30

    const/4 v2, 0x0

    if-nez v1, :cond_0

    sget p0, Lcom/appsflyer/internal/AFa1bSDK;->$13:I

    add-int/lit8 p0, p0, 0x75

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFa1bSDK;->$12:I

    move v3, p1

    move p0, p2

    move v4, v2

    goto :goto_1

    :cond_0
    move v3, v2

    :goto_0
    add-int/lit8 p2, p2, 0x1

    int-to-byte v4, p0

    aput-byte v4, v0, v3

    add-int/lit8 v4, v3, 0x1

    if-ne v3, p1, :cond_2

    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v0, v2}, Ljava/lang/String;-><init>([BI)V

    sget p1, Lcom/appsflyer/internal/AFa1bSDK;->$12:I

    add-int/lit8 p1, p1, 0x51

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/appsflyer/internal/AFa1bSDK;->$13:I

    rem-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_1

    return-object p0

    :cond_1
    const/4 p0, 0x0

    throw p0

    :cond_2
    aget-byte v3, v1, p2

    move v5, p2

    move p2, p0

    move p0, v5

    :goto_1
    neg-int v3, v3

    add-int/2addr p2, v3

    add-int/lit8 p2, p2, -0x1

    sget v3, Lcom/appsflyer/internal/AFa1bSDK;->$12:I

    add-int/lit8 v3, v3, 0x33

    rem-int/lit16 v3, v3, 0x80

    sput v3, Lcom/appsflyer/internal/AFa1bSDK;->$13:I

    move v3, p2

    move p2, p0

    move p0, v3

    move v3, v4

    goto :goto_0
.end method

.method static constructor <clinit>()V
    .locals 74

    const-class v1, Ljava/lang/Class;

    const-class v2, [B

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {}, Lcom/appsflyer/internal/AFa1bSDK;->init$0()V

    sget v0, Lcom/appsflyer/internal/AFa1bSDK;->$11:I

    xor-int/lit8 v5, v0, 0x67

    and-int/lit8 v0, v0, 0x67

    const/4 v6, 0x1

    shl-int/2addr v0, v6

    add-int/2addr v5, v0

    rem-int/lit16 v5, v5, 0x80

    sput v5, Lcom/appsflyer/internal/AFa1bSDK;->$10:I

    const/16 v0, 0x17

    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    sget-object v5, Lcom/appsflyer/internal/AFa1bSDK;->$$a:[B

    const/16 v7, 0x11f

    aget-byte v8, v5, v7

    int-to-byte v8, v8

    const/16 v9, 0x3b1

    aget-byte v10, v5, v9

    int-to-byte v10, v10

    const/16 v11, 0x20

    aget-byte v11, v5, v11

    int-to-short v11, v11

    invoke-static {v8, v10, v11}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    const/16 v10, 0x8

    aget-byte v11, v5, v10

    int-to-byte v11, v11

    const/16 v12, 0xa1

    aget-byte v12, v5, v12

    int-to-byte v12, v12

    const/16 v13, 0xc8

    aget-byte v14, v5, v13

    int-to-short v14, v14

    invoke-static {v11, v12, v14}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v11

    sget-object v12, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v12}, [Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v8, v11, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    const/4 v11, 0x0

    invoke-virtual {v8, v11, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_69

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    long-to-int v8, v14

    const v12, -0x2425029

    not-int v14, v8

    or-int/2addr v12, v14

    not-int v12, v12

    const v14, -0x7efb77ec

    xor-int v15, v12, v14

    and-int/2addr v12, v14

    or-int/2addr v12, v15

    mul-int/lit16 v12, v12, -0x24f

    const v14, -0x6e35031a

    and-int v15, v14, v12

    or-int/2addr v12, v14

    add-int/2addr v15, v12

    const v12, -0x76c255a9

    or-int/2addr v8, v12

    const v12, -0xa7b726c

    xor-int v14, v8, v12

    and-int/2addr v8, v12

    or-int/2addr v8, v14

    mul-int/lit16 v8, v8, 0x24f

    neg-int v8, v8

    neg-int v8, v8

    xor-int v12, v15, v8

    and-int/2addr v8, v15

    shl-int/2addr v8, v6

    add-int/2addr v12, v8

    const v8, -0x8310081

    not-int v14, v0

    or-int/2addr v8, v14

    mul-int/lit16 v14, v8, -0x1ea

    move v15, v9

    move/from16 v16, v10

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    long-to-int v9, v9

    const v10, -0x10de2

    mul-int/2addr v8, v10

    mul-int/lit16 v10, v12, -0x8b

    add-int/2addr v8, v10

    not-int v10, v14

    xor-int v17, v10, v12

    and-int v18, v10, v12

    move/from16 v19, v13

    or-int v13, v17, v18

    not-int v13, v13

    xor-int v17, v10, v9

    and-int v18, v10, v9

    move/from16 v20, v15

    or-int v15, v17, v18

    not-int v15, v15

    xor-int v17, v13, v15

    and-int/2addr v13, v15

    or-int v13, v17, v13

    mul-int/lit16 v13, v13, -0x118

    neg-int v13, v13

    neg-int v13, v13

    or-int v17, v8, v13

    shl-int/lit8 v17, v17, 0x1

    xor-int/2addr v8, v13

    sub-int v17, v17, v8

    not-int v8, v12

    xor-int v13, v8, v9

    and-int v18, v8, v9

    or-int v13, v13, v18

    not-int v13, v13

    xor-int v18, v15, v13

    and-int/2addr v13, v15

    or-int v13, v18, v13

    mul-int/lit16 v13, v13, 0x8c

    or-int v15, v17, v13

    shl-int/2addr v15, v6

    xor-int v13, v17, v13

    sub-int/2addr v15, v13

    not-int v13, v14

    xor-int v17, v13, v8

    and-int/2addr v13, v8

    or-int v13, v17, v13

    xor-int v17, v13, v9

    and-int/2addr v13, v9

    or-int v13, v17, v13

    not-int v13, v13

    move/from16 v17, v3

    not-int v3, v9

    xor-int v18, v10, v3

    and-int/2addr v3, v10

    or-int v3, v18, v3

    xor-int v10, v3, v12

    and-int/2addr v3, v12

    or-int/2addr v3, v10

    not-int v3, v3

    xor-int v10, v13, v3

    and-int/2addr v3, v13

    or-int/2addr v3, v10

    not-int v9, v9

    xor-int v10, v8, v9

    and-int/2addr v8, v9

    or-int/2addr v8, v10

    xor-int v9, v8, v14

    and-int/2addr v8, v14

    or-int/2addr v8, v9

    not-int v8, v8

    or-int/2addr v3, v8

    mul-int/lit16 v3, v3, 0x8c

    add-int/2addr v15, v3

    const v3, -0x583b4899

    xor-int v8, v3, v0

    and-int/2addr v0, v3

    or-int/2addr v0, v8

    not-int v0, v0

    const v3, 0x500a4818

    or-int/2addr v0, v3

    mul-int/lit16 v3, v0, 0x1ea

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    long-to-int v8, v8

    const v9, -0x4f8da

    mul-int/2addr v0, v9

    mul-int/lit16 v9, v15, 0x14e

    neg-int v9, v9

    neg-int v9, v9

    not-int v9, v9

    sub-int/2addr v0, v9

    sub-int/2addr v0, v6

    not-int v3, v3

    mul-int/lit16 v9, v3, -0x14d

    add-int/2addr v0, v9

    not-int v9, v8

    xor-int v10, v3, v9

    and-int/2addr v9, v3

    or-int/2addr v9, v10

    not-int v9, v9

    xor-int v10, v15, v8

    and-int v12, v15, v8

    or-int/2addr v10, v12

    not-int v10, v10

    or-int/2addr v9, v10

    mul-int/lit16 v9, v9, 0x14d

    add-int/2addr v0, v9

    xor-int v9, v3, v8

    and-int/2addr v3, v8

    or-int/2addr v3, v9

    not-int v3, v3

    not-int v8, v8

    or-int/2addr v8, v15

    not-int v8, v8

    xor-int v9, v3, v8

    and-int/2addr v3, v8

    or-int/2addr v3, v9

    mul-int/lit16 v3, v3, 0x14d

    or-int v8, v0, v3

    shl-int/2addr v8, v6

    xor-int/2addr v0, v3

    sub-int/2addr v8, v0

    const v0, 0x7fc5c2d4

    sub-int/2addr v8, v0

    if-nez v8, :cond_0

    goto/16 :goto_6d

    :cond_0
    const-wide v8, -0x2b2aa279a3af5d7eL    # -4.673133665579411E100

    sput-wide v8, Lcom/appsflyer/internal/AFa1bSDK;->setDebugLog:J

    sput v17, Lcom/appsflyer/internal/AFa1bSDK;->setUserFirstName:I

    const/4 v3, 0x2

    sput v3, Lcom/appsflyer/internal/AFa1bSDK;->setUserPhone:I

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/appsflyer/internal/AFa1bSDK;->values:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/appsflyer/internal/AFa1bSDK;->getInstance:Ljava/util/Map;

    :try_start_1
    aget-byte v0, v5, v19

    int-to-byte v0, v0

    const/16 v8, 0xd

    aget-byte v9, v5, v8

    int-to-byte v9, v9

    aget-byte v10, v5, v7

    int-to-short v10, v10

    invoke-static {v0, v9, v10}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v9

    sget-object v0, Lcom/appsflyer/internal/AFa1bSDK;->onPause:Ljava/lang/Object;

    if-nez v0, :cond_1

    aget-byte v0, v5, v19

    int-to-byte v0, v0

    const/16 v10, 0x5a

    aget-byte v10, v5, v10

    int-to-byte v10, v10

    const/16 v12, 0xbc

    aget-byte v12, v5, v12

    neg-int v12, v12

    int-to-short v12, v12

    invoke-static {v0, v10, v12}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_14

    goto :goto_0

    :cond_1
    move-object v0, v11

    :goto_0
    const/16 v10, 0x120

    :try_start_2
    aget-byte v12, v5, v7

    int-to-byte v12, v12

    const/16 v13, 0x144

    aget-byte v13, v5, v13

    int-to-byte v13, v13

    const/16 v14, 0x27

    aget-byte v14, v5, v14

    int-to-short v14, v14

    invoke-static {v12, v13, v14}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v12

    aget-byte v13, v5, v19

    int-to-byte v13, v13

    const/16 v14, 0x140

    aget-byte v5, v5, v14

    int-to-byte v5, v5

    const/16 v14, 0x5b

    int-to-short v14, v14

    invoke-static {v13, v5, v14}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v12, v5, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5, v11, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    if-eqz v5, :cond_2

    goto :goto_1

    :catch_0
    move-object v5, v11

    :cond_2
    :try_start_3
    sget-object v12, Lcom/appsflyer/internal/AFa1bSDK;->$$a:[B

    aget-byte v13, v12, v7

    int-to-byte v13, v13

    aget-byte v14, v12, v20

    int-to-byte v14, v14

    shl-int/lit8 v15, v14, 0x2

    int-to-short v15, v15

    invoke-static {v13, v14, v15}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v13

    aget-byte v14, v12, v8

    int-to-byte v14, v14

    aget-byte v12, v12, v10

    neg-int v12, v12

    int-to-byte v12, v12

    const/16 v15, 0x81

    int-to-short v15, v15

    invoke-static {v14, v12, v15}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v13, v12, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v12

    invoke-virtual {v12, v11, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    :goto_1
    const/16 v12, 0x2c6

    if-eqz v5, :cond_3

    sget v13, Lcom/appsflyer/internal/AFa1bSDK;->$10:I

    xor-int/lit8 v14, v13, 0x6f

    and-int/lit8 v13, v13, 0x6f

    shl-int/2addr v13, v6

    add-int/2addr v14, v13

    rem-int/lit16 v14, v14, 0x80

    sput v14, Lcom/appsflyer/internal/AFa1bSDK;->$11:I

    :try_start_4
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v13

    sget-object v14, Lcom/appsflyer/internal/AFa1bSDK;->$$a:[B

    aget-byte v15, v14, v8

    int-to-byte v15, v15

    aget-byte v14, v14, v12
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    int-to-byte v14, v14

    move/from16 v18, v8

    const/16 v8, 0x95

    int-to-short v8, v8

    :try_start_5
    invoke-static {v15, v14, v8}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v13, v8, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    invoke-virtual {v8, v5, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_3

    :catch_2
    :goto_2
    move-object v8, v11

    goto :goto_3

    :catch_3
    :cond_3
    move/from16 v18, v8

    goto :goto_2

    :goto_3
    if-eqz v5, :cond_4

    :try_start_6
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v13

    sget-object v14, Lcom/appsflyer/internal/AFa1bSDK;->$$a:[B

    aget-byte v15, v14, v18

    int-to-byte v15, v15

    const/16 v21, 0x372

    aget-byte v14, v14, v21
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    int-to-byte v14, v14

    move/from16 v21, v10

    const/16 v10, 0x9f

    int-to-short v10, v10

    :try_start_7
    invoke-static {v15, v14, v10}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v13, v10, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    invoke-virtual {v10, v5, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4

    goto :goto_5

    :catch_4
    :goto_4
    move-object v10, v11

    goto :goto_5

    :catch_5
    :cond_4
    move/from16 v21, v10

    goto :goto_4

    :goto_5
    if-eqz v5, :cond_5

    :try_start_8
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v13

    sget-object v14, Lcom/appsflyer/internal/AFa1bSDK;->$$a:[B

    aget-byte v15, v14, v18

    int-to-byte v15, v15

    aget-byte v14, v14, v12
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7

    int-to-byte v14, v14

    move/from16 v22, v12

    const/16 v12, 0xad

    int-to-short v12, v12

    :try_start_9
    invoke-static {v15, v14, v12}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v13, v12, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v12

    invoke-virtual {v12, v5, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_6

    goto :goto_7

    :catch_6
    :goto_6
    move-object v5, v11

    goto :goto_7

    :catch_7
    :cond_5
    move/from16 v22, v12

    goto :goto_6

    :goto_7
    const/16 v12, 0xc1

    const-class v13, Ljava/lang/String;

    if-eqz v8, :cond_6

    move/from16 v26, v6

    move/from16 v27, v7

    :goto_8
    const/16 v24, 0x164

    const/16 v25, 0x36

    goto :goto_9

    :cond_6
    if-nez v0, :cond_7

    move/from16 v26, v6

    move/from16 v27, v7

    move-object v8, v11

    goto :goto_8

    :cond_7
    :try_start_a
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v23, Lcom/appsflyer/internal/AFa1bSDK;->$$a:[B

    const/16 v24, 0x2d0

    const/16 v25, 0x36

    aget-byte v14, v23, v24

    neg-int v14, v14

    int-to-byte v14, v14

    const/16 v24, 0x164

    aget-byte v15, v23, v22

    int-to-byte v15, v15

    move/from16 v26, v6

    xor-int/lit16 v6, v15, 0x91

    move/from16 v27, v7

    and-int/lit16 v7, v15, 0x91

    or-int/2addr v6, v7

    int-to-short v6, v6

    invoke-static {v14, v15, v6}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_14

    :try_start_b
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    aget-byte v6, v23, v24

    int-to-byte v6, v6

    aget-byte v7, v23, v25

    int-to-byte v7, v7

    int-to-short v8, v12

    invoke-static {v6, v7, v8}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    filled-new-array {v13}, [Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_68

    :goto_9
    const/16 v6, 0xef

    if-eqz v5, :cond_8

    move/from16 v23, v6

    goto :goto_a

    :cond_8
    :try_start_c
    sget-object v0, Lcom/appsflyer/internal/AFa1bSDK;->$$a:[B

    aget-byte v5, v0, v24

    int-to-byte v5, v5

    aget-byte v7, v0, v6

    int-to-byte v7, v7

    const/16 v14, 0xcc

    int-to-short v14, v14

    invoke-static {v5, v7, v14}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_14

    :try_start_d
    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    aget-byte v7, v0, v24

    int-to-byte v7, v7

    const/16 v14, 0xaa

    aget-byte v14, v0, v14

    int-to-byte v14, v14

    const/16 v15, 0xd9

    int-to-short v15, v15

    invoke-static {v7, v14, v15}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    aget-byte v14, v0, v18

    int-to-byte v14, v14

    aget-byte v15, v0, v22

    int-to-byte v15, v15

    move/from16 v23, v6

    const/16 v6, 0xe8

    int-to-short v6, v6

    invoke-static {v14, v15, v6}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    filled-new-array {v13}, [Ljava/lang/Class;

    move-result-object v14

    invoke-virtual {v7, v6, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-virtual {v6, v11, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_67

    :try_start_e
    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    aget-byte v6, v0, v24

    int-to-byte v6, v6

    aget-byte v0, v0, v25

    int-to-byte v0, v0

    int-to-short v7, v12

    invoke-static {v6, v0, v7}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    filled-new-array {v13}, [Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_66

    :goto_a
    if-nez v10, :cond_a

    sget v0, Lcom/appsflyer/internal/AFa1bSDK;->$11:I

    xor-int/lit8 v6, v0, 0x3b

    and-int/lit8 v7, v0, 0x3b

    shl-int/lit8 v7, v7, 0x1

    add-int/2addr v6, v7

    rem-int/lit16 v6, v6, 0x80

    sput v6, Lcom/appsflyer/internal/AFa1bSDK;->$10:I

    if-eqz v8, :cond_a

    and-int/lit8 v6, v0, 0x65

    or-int/lit8 v0, v0, 0x65

    add-int/2addr v6, v0

    rem-int/lit16 v6, v6, 0x80

    sput v6, Lcom/appsflyer/internal/AFa1bSDK;->$10:I

    :try_start_f
    sget-object v0, Lcom/appsflyer/internal/AFa1bSDK;->$$a:[B

    aget-byte v6, v0, v19

    int-to-byte v6, v6

    const/16 v7, 0x188

    aget-byte v7, v0, v7

    int-to-byte v7, v7

    const/16 v10, 0xf2

    int-to-short v10, v10

    invoke-static {v6, v7, v10}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_14

    :try_start_10
    new-array v7, v3, [Ljava/lang/Object;

    aput-object v6, v7, v26

    aput-object v8, v7, v17

    aget-byte v6, v0, v24

    int-to-byte v6, v6

    aget-byte v10, v0, v25

    int-to-byte v10, v10

    int-to-short v14, v12

    invoke-static {v6, v10, v14}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    aget-byte v10, v0, v24

    int-to-byte v10, v10

    aget-byte v0, v0, v25

    int-to-byte v0, v0

    invoke-static {v10, v0, v14}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    filled-new-array {v0, v13}, [Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    goto :goto_b

    :catchall_0
    move-exception v0

    :try_start_11
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_9

    throw v1

    :cond_9
    throw v0

    :cond_a
    :goto_b
    sget-object v0, Lcom/appsflyer/internal/AFa1bSDK;->$$a:[B

    aget-byte v6, v0, v24

    int-to-byte v6, v6

    aget-byte v7, v0, v25

    int-to-byte v7, v7

    int-to-short v12, v12

    invoke-static {v6, v7, v12}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const/4 v7, 0x7

    invoke-static {v6, v7}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [Ljava/lang/Object;

    aput-object v11, v6, v17

    aput-object v10, v6, v26

    aput-object v8, v6, v3

    const/4 v14, 0x3

    aput-object v5, v6, v14

    const/4 v15, 0x4

    aput-object v10, v6, v15

    const/4 v10, 0x5

    aput-object v8, v6, v10

    const/4 v8, 0x6

    aput-object v5, v6, v8

    new-array v5, v7, [Z

    fill-array-data v5, :array_0

    move/from16 v28, v15

    new-array v15, v7, [Z

    fill-array-data v15, :array_1

    move/from16 v29, v8

    new-array v8, v7, [Z

    aput-boolean v17, v8, v17

    aput-boolean v17, v8, v26

    aput-boolean v26, v8, v3

    aput-boolean v26, v8, v14

    aput-boolean v17, v8, v28

    aput-boolean v26, v8, v10

    aput-boolean v26, v8, v29
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_14

    const/16 v30, 0x88

    const/16 v31, 0xcd

    const/16 v7, 0x1a

    :try_start_12
    aget-byte v14, v0, v27

    int-to-byte v14, v14

    aget-byte v10, v0, v31
    :try_end_12
    .catch Ljava/lang/ClassNotFoundException; {:try_start_12 .. :try_end_12} :catch_9
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_14

    neg-int v10, v10

    int-to-byte v10, v10

    move/from16 v34, v3

    xor-int/lit16 v3, v10, 0xe2

    and-int/lit16 v11, v10, 0xe2

    or-int/2addr v3, v11

    int-to-short v3, v3

    :try_start_13
    invoke-static {v14, v10, v3}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    const/16 v10, 0x5a

    aget-byte v10, v0, v10

    int-to-byte v10, v10

    aget-byte v0, v0, v30

    int-to-byte v0, v0

    const/16 v11, 0x112

    int-to-short v11, v11

    invoke-static {v10, v0, v11}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v0
    :try_end_13
    .catch Ljava/lang/ClassNotFoundException; {:try_start_13 .. :try_end_13} :catch_8
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_14

    const/16 v3, 0x22

    if-lt v0, v3, :cond_b

    move/from16 v3, v26

    goto :goto_c

    :cond_b
    move/from16 v3, v17

    :goto_c
    const/16 v10, 0x1d

    if-ne v0, v10, :cond_c

    goto :goto_d

    :cond_c
    if-lt v0, v7, :cond_d

    move/from16 v10, v26

    goto :goto_e

    :cond_d
    :goto_d
    move/from16 v10, v17

    :goto_e
    :try_start_14
    aput-boolean v10, v8, v17

    const/16 v10, 0x15

    if-lt v0, v10, :cond_e

    move/from16 v10, v26

    goto :goto_f

    :cond_e
    move/from16 v10, v17

    :goto_f
    aput-boolean v10, v8, v26

    const/16 v10, 0x15

    if-lt v0, v10, :cond_f

    move/from16 v0, v26

    goto :goto_10

    :cond_f
    move/from16 v0, v17

    :goto_10
    aput-boolean v0, v8, v28
    :try_end_14
    .catch Ljava/lang/ClassNotFoundException; {:try_start_14 .. :try_end_14} :catch_a
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_14

    goto :goto_12

    :catch_8
    :goto_11
    move/from16 v3, v17

    goto :goto_12

    :catch_9
    move/from16 v34, v3

    goto :goto_11

    :catch_a
    :goto_12
    move/from16 v10, v17

    move v11, v10

    :goto_13
    if-nez v10, :cond_5a

    const/16 v14, 0x9

    if-ge v11, v14, :cond_5a

    :try_start_15
    aget-boolean v0, v8, v11
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_14

    if-eqz v0, :cond_59

    sget v0, Lcom/appsflyer/internal/AFa1bSDK;->$10:I

    or-int/lit8 v36, v0, 0x5d

    shl-int/lit8 v36, v36, 0x1

    xor-int/lit8 v0, v0, 0x5d

    sub-int v0, v36, v0

    move/from16 v36, v14

    rem-int/lit16 v14, v0, 0x80

    sput v14, Lcom/appsflyer/internal/AFa1bSDK;->$11:I

    rem-int/lit8 v0, v0, 0x2

    const-class v7, Ljava/lang/Throwable;

    move/from16 v38, v3

    const/16 v39, 0x66

    const/16 v40, 0x1c3

    const/16 v41, 0x1e8

    if-eqz v0, :cond_55

    :try_start_16
    aget-boolean v42, v5, v11

    aget-object v0, v6, v11

    aget-boolean v43, v15, v11
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_64

    const/16 v44, 0x455

    const/16 v45, 0x34

    const/16 v46, 0x32a

    if-eqz v42, :cond_14

    if-eqz v0, :cond_11

    add-int/lit8 v14, v14, 0x11

    rem-int/lit16 v14, v14, 0x80

    sput v14, Lcom/appsflyer/internal/AFa1bSDK;->$10:I

    :try_start_17
    sget-object v14, Lcom/appsflyer/internal/AFa1bSDK;->$$a:[B

    aget-byte v3, v14, v24
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_3

    int-to-byte v3, v3

    move-object/from16 v47, v5

    :try_start_18
    aget-byte v5, v14, v25

    int-to-byte v5, v5

    invoke-static {v3, v5, v12}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    aget-byte v5, v14, v19

    int-to-byte v5, v5

    const/16 v48, 0x31d

    aget-byte v14, v14, v48
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_2

    int-to-byte v14, v14

    move-object/from16 v48, v6

    const/16 v6, 0x118

    int-to-short v6, v6

    :try_start_19
    invoke-static {v5, v14, v6}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v3, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-virtual {v3, v0, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_1

    if-eqz v3, :cond_12

    :goto_14
    move-object/from16 v49, v8

    goto/16 :goto_1c

    :catchall_1
    move-exception v0

    goto :goto_16

    :catchall_2
    move-exception v0

    :goto_15
    move-object/from16 v48, v6

    goto :goto_16

    :catchall_3
    move-exception v0

    move-object/from16 v47, v5

    goto :goto_15

    :goto_16
    :try_start_1a
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_10

    throw v3

    :catchall_4
    move-exception v0

    move-object v5, v1

    move-object/from16 v62, v2

    move-object v1, v7

    move-object/from16 v49, v8

    move-object/from16 v50, v9

    move/from16 v53, v10

    move/from16 v57, v11

    move/from16 v63, v12

    move-object/from16 v54, v15

    :goto_17
    const/16 v32, 0x3

    const/16 v33, 0x5

    :goto_18
    const/16 v37, 0x1a

    goto/16 :goto_69

    :cond_10
    throw v0
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_4

    :cond_11
    move-object/from16 v47, v5

    move-object/from16 v48, v6

    :cond_12
    :try_start_1b
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v5, Lcom/appsflyer/internal/AFa1bSDK;->$$a:[B

    aget-byte v6, v5, v39

    int-to-byte v6, v6

    aget-byte v14, v5, v46
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_7

    int-to-byte v14, v14

    move-object/from16 v36, v5

    move-object/from16 v49, v8

    move/from16 v5, v27

    int-to-short v8, v5

    :try_start_1c
    invoke-static {v6, v14, v8}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    aget-byte v0, v36, v44

    int-to-byte v0, v0

    aget-byte v5, v36, v45

    int-to-byte v5, v5

    const/16 v6, 0x123

    int-to-short v8, v6

    invoke-static {v0, v5, v8}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_6

    :try_start_1d
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    aget-byte v3, v36, v24

    int-to-byte v3, v3

    aget-byte v5, v36, v41

    neg-int v5, v5

    int-to-byte v5, v5

    invoke-static {v3, v5, v8}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    filled-new-array {v13}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_5

    :catchall_5
    move-exception v0

    :try_start_1e
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_13

    throw v3

    :catchall_6
    move-exception v0

    :goto_19
    move-object v5, v1

    move-object/from16 v62, v2

    move-object v1, v7

    move-object/from16 v50, v9

    :goto_1a
    move/from16 v53, v10

    :goto_1b
    move/from16 v57, v11

    move/from16 v63, v12

    move-object/from16 v54, v15

    const/16 v27, 0x11f

    goto :goto_17

    :cond_13
    throw v0
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_6

    :catchall_7
    move-exception v0

    move-object/from16 v49, v8

    goto :goto_19

    :cond_14
    move-object/from16 v47, v5

    move-object/from16 v48, v6

    goto/16 :goto_14

    :goto_1c
    if-eqz v42, :cond_28

    :try_start_1f
    new-instance v5, Ljava/util/Random;

    invoke-direct {v5}, Ljava/util/Random;-><init>()V
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_15

    :try_start_20
    sget-object v6, Lcom/appsflyer/internal/AFa1bSDK;->$$a:[B

    aget-byte v8, v6, v24

    int-to-byte v8, v8

    const/16 v14, 0xaa

    aget-byte v14, v6, v14

    int-to-byte v14, v14

    const/16 v3, 0xd9

    int-to-short v3, v3

    invoke-static {v8, v14, v3}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    aget-byte v8, v6, v19

    int-to-byte v8, v8

    const/16 v14, 0xaf

    aget-byte v6, v6, v14
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_14

    int-to-byte v6, v6

    xor-int/lit16 v14, v6, 0x115

    move-object/from16 v50, v9

    and-int/lit16 v9, v6, 0x115

    or-int/2addr v9, v14

    int-to-short v9, v9

    :try_start_21
    invoke-static {v8, v6, v9}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x0

    invoke-virtual {v3, v6, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-virtual {v3, v8, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v8
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_13

    const-wide/32 v51, -0x606c9e50

    xor-long v8, v8, v51

    :try_start_22
    invoke-virtual {v5, v8, v9}, Ljava/util/Random;->setSeed(J)V
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_12

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_1d
    if-nez v3, :cond_26

    if-nez v6, :cond_15

    move-object/from16 v51, v3

    move/from16 v3, v29

    goto :goto_1f

    :cond_15
    if-nez v8, :cond_17

    sget v14, Lcom/appsflyer/internal/AFa1bSDK;->$11:I

    add-int/lit8 v14, v14, 0x31

    move-object/from16 v51, v3

    rem-int/lit16 v3, v14, 0x80

    sput v3, Lcom/appsflyer/internal/AFa1bSDK;->$10:I

    rem-int/lit8 v14, v14, 0x2

    if-eqz v14, :cond_16

    :goto_1e
    move/from16 v3, v28

    goto :goto_1f

    :cond_16
    const/4 v3, 0x5

    goto :goto_1f

    :cond_17
    move-object/from16 v51, v3

    if-nez v9, :cond_18

    goto :goto_1e

    :cond_18
    const/4 v3, 0x3

    :goto_1f
    :try_start_23
    new-instance v14, Ljava/lang/StringBuilder;

    move-object/from16 v52, v6

    add-int/lit8 v6, v3, 0x1

    invoke-direct {v14, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v6, 0x2e

    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_12

    move/from16 v6, v17

    :goto_20
    if-ge v6, v3, :cond_1b

    move/from16 v53, v3

    move/from16 v54, v6

    if-eqz v43, :cond_1a

    const/16 v3, 0x1a

    :try_start_24
    invoke-virtual {v5, v3}, Ljava/util/Random;->nextInt(I)I

    move-result v6

    invoke-virtual {v5}, Ljava/util/Random;->nextBoolean()Z

    move-result v3
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_8

    if-eqz v3, :cond_19

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    not-int v3, v6

    rsub-int/lit8 v3, v3, 0x40

    move-object/from16 v56, v8

    move-object/from16 v55, v9

    goto :goto_21

    :cond_19
    move-object v3, v8

    move-object/from16 v55, v9

    :try_start_25
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    long-to-int v8, v8

    mul-int/lit16 v9, v6, 0xd9

    move-object/from16 v56, v3

    or-int/lit16 v3, v9, -0x50a0

    shl-int/lit8 v3, v3, 0x1

    xor-int/lit16 v9, v9, -0x50a0

    sub-int/2addr v3, v9

    xor-int v9, v6, v8

    and-int v57, v6, v8

    or-int v9, v9, v57

    not-int v9, v9

    mul-int/lit16 v9, v9, 0xd8

    add-int/2addr v3, v9

    xor-int/lit8 v9, v6, -0x61

    and-int/lit8 v57, v6, -0x61

    or-int v9, v9, v57

    move/from16 v57, v3

    not-int v3, v8

    or-int/2addr v3, v9

    mul-int/lit16 v3, v3, -0xd8

    not-int v3, v3

    sub-int v3, v57, v3

    add-int/lit8 v3, v3, -0x1

    not-int v8, v8

    or-int/2addr v6, v8

    not-int v6, v6

    xor-int/lit8 v8, v6, 0x60

    and-int/lit8 v6, v6, 0x60

    or-int/2addr v6, v8

    mul-int/lit16 v6, v6, 0xd8

    neg-int v6, v6

    neg-int v6, v6

    xor-int v8, v3, v6

    and-int/2addr v3, v6

    shl-int/lit8 v3, v3, 0x1

    add-int/2addr v3, v8

    :goto_21
    int-to-char v3, v3

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-object/from16 v57, v5

    goto :goto_22

    :catchall_8
    move-exception v0

    move-object v5, v1

    move-object/from16 v62, v2

    move-object v1, v7

    goto/16 :goto_1a

    :cond_1a
    move-object/from16 v56, v8

    move-object/from16 v55, v9

    const/16 v3, 0xc

    invoke-virtual {v5, v3}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    long-to-int v6, v8

    mul-int/lit16 v8, v3, 0xa5

    const v9, 0x146000

    sub-int/2addr v8, v9

    not-int v9, v6

    move-object/from16 v57, v5

    xor-int/lit16 v5, v9, 0x2000

    move/from16 v58, v5

    and-int/lit16 v5, v9, 0x2000

    or-int v5, v58, v5

    not-int v5, v5

    xor-int v58, v3, v5

    and-int/2addr v5, v3

    or-int v5, v58, v5

    mul-int/lit16 v5, v5, -0x148

    and-int v58, v8, v5

    or-int/2addr v5, v8

    add-int v58, v58, v5

    xor-int v5, v3, v6

    and-int v8, v3, v6

    or-int/2addr v5, v8

    mul-int/lit16 v5, v5, 0xa4

    not-int v5, v5

    sub-int v58, v58, v5

    add-int/lit8 v58, v58, -0x1

    not-int v5, v3

    xor-int/lit16 v8, v5, -0x2001

    move/from16 v59, v3

    const/16 v3, -0x2001

    and-int/2addr v5, v3

    or-int/2addr v5, v8

    not-int v5, v5

    xor-int v8, v3, v6

    and-int/2addr v3, v6

    or-int/2addr v3, v8

    not-int v3, v3

    xor-int v6, v5, v3

    and-int/2addr v3, v5

    or-int/2addr v3, v6

    xor-int v5, v9, v59

    and-int v6, v9, v59

    or-int/2addr v5, v6

    or-int/lit16 v5, v5, 0x2000

    not-int v5, v5

    xor-int v6, v3, v5

    and-int/2addr v3, v5

    or-int/2addr v3, v6

    mul-int/lit16 v3, v3, 0xa4

    neg-int v3, v3

    neg-int v3, v3

    or-int v5, v58, v3

    shl-int/lit8 v5, v5, 0x1

    xor-int v3, v58, v3

    sub-int/2addr v5, v3

    int-to-char v3, v5

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_8

    :goto_22
    add-int/lit8 v6, v54, 0x1

    move/from16 v3, v53

    move-object/from16 v9, v55

    move-object/from16 v8, v56

    move-object/from16 v5, v57

    goto/16 :goto_20

    :cond_1b
    move-object/from16 v57, v5

    move-object/from16 v56, v8

    move-object/from16 v55, v9

    :try_start_26
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_12

    if-nez v52, :cond_1d

    sget v5, Lcom/appsflyer/internal/AFa1bSDK;->$11:I

    add-int/lit8 v5, v5, 0x41

    rem-int/lit16 v5, v5, 0x80

    sput v5, Lcom/appsflyer/internal/AFa1bSDK;->$10:I

    move/from16 v5, v34

    :try_start_27
    new-array v6, v5, [Ljava/lang/Object;

    aput-object v3, v6, v26

    aput-object v0, v6, v17

    sget-object v3, Lcom/appsflyer/internal/AFa1bSDK;->$$a:[B

    aget-byte v5, v3, v24

    int-to-byte v5, v5

    aget-byte v8, v3, v25

    int-to-byte v8, v8

    invoke-static {v5, v8, v12}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    aget-byte v8, v3, v24

    int-to-byte v8, v8

    aget-byte v3, v3, v25

    int-to-byte v3, v3

    invoke-static {v8, v3, v12}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    filled-new-array {v3, v13}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_9

    move-object v6, v3

    move/from16 v53, v10

    move-object/from16 v3, v51

    :goto_23
    move-object/from16 v9, v55

    :goto_24
    move-object/from16 v8, v56

    goto/16 :goto_25

    :catchall_9
    move-exception v0

    :try_start_28
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_1c

    throw v3

    :cond_1c
    throw v0
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_8

    :cond_1d
    if-nez v56, :cond_1f

    const/4 v5, 0x2

    :try_start_29
    new-array v6, v5, [Ljava/lang/Object;

    aput-object v3, v6, v26

    aput-object v0, v6, v17

    sget-object v3, Lcom/appsflyer/internal/AFa1bSDK;->$$a:[B

    aget-byte v5, v3, v24

    int-to-byte v5, v5

    aget-byte v8, v3, v25

    int-to-byte v8, v8

    invoke-static {v5, v8, v12}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    aget-byte v8, v3, v24

    int-to-byte v8, v8

    aget-byte v3, v3, v25

    int-to-byte v3, v3

    invoke-static {v8, v3, v12}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    filled-new-array {v3, v13}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_a

    move-object v8, v3

    move/from16 v53, v10

    move-object/from16 v3, v51

    move-object/from16 v6, v52

    move-object/from16 v9, v55

    goto/16 :goto_25

    :catchall_a
    move-exception v0

    :try_start_2a
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_1e

    throw v3

    :cond_1e
    throw v0
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_8

    :cond_1f
    if-nez v55, :cond_21

    const/4 v5, 0x2

    :try_start_2b
    new-array v6, v5, [Ljava/lang/Object;

    aput-object v3, v6, v26

    aput-object v0, v6, v17

    sget-object v3, Lcom/appsflyer/internal/AFa1bSDK;->$$a:[B

    aget-byte v5, v3, v24

    int-to-byte v5, v5

    aget-byte v8, v3, v25

    int-to-byte v8, v8

    invoke-static {v5, v8, v12}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    aget-byte v8, v3, v24

    int-to-byte v8, v8

    aget-byte v3, v3, v25

    int-to-byte v3, v3

    invoke-static {v8, v3, v12}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    filled-new-array {v3, v13}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_2b
    .catchall {:try_start_2b .. :try_end_2b} :catchall_b

    move-object v9, v3

    move/from16 v53, v10

    move-object/from16 v3, v51

    move-object/from16 v6, v52

    goto/16 :goto_24

    :catchall_b
    move-exception v0

    :try_start_2c
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_20

    throw v3

    :cond_20
    throw v0
    :try_end_2c
    .catchall {:try_start_2c .. :try_end_2c} :catchall_8

    :cond_21
    const/4 v5, 0x2

    :try_start_2d
    new-array v6, v5, [Ljava/lang/Object;

    aput-object v3, v6, v26

    aput-object v0, v6, v17

    sget-object v3, Lcom/appsflyer/internal/AFa1bSDK;->$$a:[B

    aget-byte v5, v3, v24

    int-to-byte v5, v5

    aget-byte v8, v3, v25

    int-to-byte v8, v8

    invoke-static {v5, v8, v12}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    aget-byte v8, v3, v24

    int-to-byte v8, v8

    aget-byte v9, v3, v25

    int-to-byte v9, v9

    invoke-static {v8, v9, v12}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    filled-new-array {v8, v13}, [Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v5

    invoke-virtual {v5, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_2d
    .catchall {:try_start_2d .. :try_end_2d} :catchall_11

    :try_start_2e
    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v6

    aget-byte v8, v3, v24

    int-to-byte v8, v8

    aget-byte v9, v3, v31

    neg-int v9, v9

    int-to-byte v9, v9

    const/16 v14, 0x145

    int-to-short v14, v14

    invoke-static {v8, v9, v14}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v9, v3, v24

    int-to-byte v9, v9

    move-object/from16 v51, v3

    aget-byte v3, v51, v25

    int-to-byte v3, v3

    invoke-static {v9, v3, v12}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v8, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_2e
    .catchall {:try_start_2e .. :try_end_2e} :catchall_f

    :try_start_2f
    aget-byte v6, v51, v24

    int-to-byte v6, v6

    aget-byte v8, v51, v31

    neg-int v8, v8

    int-to-byte v8, v8

    invoke-static {v6, v8, v14}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    aget-byte v8, v51, v19

    int-to-byte v8, v8

    aget-byte v9, v51, v46
    :try_end_2f
    .catchall {:try_start_2f .. :try_end_2f} :catchall_d

    int-to-byte v9, v9

    move/from16 v53, v10

    const/16 v14, 0x15c

    int-to-short v10, v14

    :try_start_30
    invoke-static {v8, v9, v10}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    invoke-virtual {v6, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-virtual {v6, v3, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_30
    .catchall {:try_start_30 .. :try_end_30} :catchall_c

    move-object v3, v5

    move-object/from16 v6, v52

    goto/16 :goto_23

    :goto_25
    move/from16 v10, v53

    move-object/from16 v5, v57

    const/16 v34, 0x2

    goto/16 :goto_1d

    :catchall_c
    move-exception v0

    goto :goto_26

    :catchall_d
    move-exception v0

    move/from16 v53, v10

    :goto_26
    :try_start_31
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_22

    throw v3

    :catchall_e
    move-exception v0

    :goto_27
    move-object v5, v1

    move-object/from16 v62, v2

    move-object v1, v7

    goto/16 :goto_1b

    :catch_b
    move-exception v0

    goto :goto_28

    :cond_22
    throw v0

    :catchall_f
    move-exception v0

    move/from16 v53, v10

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_23

    throw v3

    :cond_23
    throw v0
    :try_end_31
    .catch Ljava/lang/Exception; {:try_start_31 .. :try_end_31} :catch_b
    .catchall {:try_start_31 .. :try_end_31} :catchall_e

    :goto_28
    :try_start_32
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, Lcom/appsflyer/internal/AFa1bSDK;->$$a:[B

    aget-byte v8, v6, v39

    int-to-byte v8, v8

    aget-byte v9, v6, v46

    int-to-byte v9, v9

    const/16 v10, 0x160

    int-to-short v10, v10

    invoke-static {v8, v9, v10}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    aget-byte v5, v6, v44

    int-to-byte v5, v5

    aget-byte v8, v6, v45

    int-to-byte v8, v8

    const/16 v9, 0x123

    int-to-short v10, v9

    invoke-static {v5, v8, v10}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3
    :try_end_32
    .catchall {:try_start_32 .. :try_end_32} :catchall_e

    const/4 v5, 0x2

    :try_start_33
    new-array v8, v5, [Ljava/lang/Object;

    aput-object v0, v8, v26

    aput-object v3, v8, v17

    aget-byte v0, v6, v24

    int-to-byte v0, v0

    aget-byte v3, v6, v41

    neg-int v3, v3

    int-to-byte v3, v3

    invoke-static {v0, v3, v10}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    filled-new-array {v13, v7}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_33
    .catchall {:try_start_33 .. :try_end_33} :catchall_10

    :catchall_10
    move-exception v0

    :try_start_34
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_24

    throw v3

    :cond_24
    throw v0

    :catchall_11
    move-exception v0

    move/from16 v53, v10

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_25

    throw v3

    :cond_25
    throw v0

    :catchall_12
    move-exception v0

    :goto_29
    move/from16 v53, v10

    goto :goto_27

    :cond_26
    move-object/from16 v51, v3

    move-object/from16 v52, v6

    move-object/from16 v56, v8

    move-object/from16 v55, v9

    :goto_2a
    move/from16 v53, v10

    goto :goto_2d

    :catchall_13
    move-exception v0

    :goto_2b
    move/from16 v53, v10

    goto :goto_2c

    :catchall_14
    move-exception v0

    move-object/from16 v50, v9

    goto :goto_2b

    :goto_2c
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_27

    throw v3

    :cond_27
    throw v0

    :catchall_15
    move-exception v0

    move-object/from16 v50, v9

    goto :goto_29

    :cond_28
    move-object/from16 v50, v9

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    goto :goto_2a

    :goto_2d
    sget-object v0, Lcom/appsflyer/internal/AFa1bSDK;->$$a:[B

    const/16 v3, 0x2d0

    aget-byte v3, v0, v3
    :try_end_34
    .catchall {:try_start_34 .. :try_end_34} :catchall_e

    neg-int v3, v3

    int-to-byte v3, v3

    const/16 v37, 0x1a

    :try_start_35
    aget-byte v5, v0, v37
    :try_end_35
    .catchall {:try_start_35 .. :try_end_35} :catchall_63

    int-to-byte v5, v5

    xor-int/lit16 v6, v5, 0x164

    and-int/lit16 v8, v5, 0x164

    or-int/2addr v6, v8

    int-to-short v6, v6

    :try_start_36
    invoke-static {v3, v5, v6}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v3

    const-class v5, Lcom/appsflyer/internal/AFa1bSDK;
    :try_end_36
    .catchall {:try_start_36 .. :try_end_36} :catchall_e

    :try_start_37
    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v6

    aget-byte v8, v0, v18

    int-to-byte v8, v8

    aget-byte v9, v0, v22

    int-to-byte v9, v9

    const/16 v10, 0x194

    int-to-short v10, v10

    invoke-static {v8, v9, v10}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v8

    filled-new-array {v13}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v1, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    invoke-virtual {v8, v5, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_37
    .catchall {:try_start_37 .. :try_end_37} :catchall_62

    :try_start_38
    aget-byte v6, v0, v24

    int-to-byte v6, v6

    aget-byte v8, v0, v25

    int-to-byte v8, v8

    const/16 v9, 0x19e

    int-to-short v9, v9

    invoke-static {v6, v8, v9}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    aget-byte v8, v0, v18

    int-to-byte v8, v8

    aget-byte v9, v0, v30

    int-to-byte v9, v9

    const/16 v10, 0x1a9

    int-to-short v10, v10

    invoke-static {v8, v9, v10}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    invoke-virtual {v6, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-virtual {v6, v5, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;
    :try_end_38
    .catchall {:try_start_38 .. :try_end_38} :catchall_61

    :try_start_39
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v8, 0x56

    int-to-byte v8, v8

    aget-byte v9, v0, v45

    int-to-byte v9, v9

    const/16 v10, 0x1af

    int-to-short v10, v10

    invoke-static {v8, v9, v10}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v6
    :try_end_39
    .catchall {:try_start_39 .. :try_end_39} :catchall_e

    const/4 v8, 0x5

    :try_start_3a
    invoke-virtual {v5, v8, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5
    :try_end_3a
    .catchall {:try_start_3a .. :try_end_3a} :catchall_60

    :try_start_3b
    new-instance v6, Ljava/util/zip/ZipFile;

    invoke-direct {v6, v5}, Ljava/util/zip/ZipFile;-><init>(Ljava/lang/String;)V
    :try_end_3b
    .catchall {:try_start_3b .. :try_end_3b} :catchall_e

    const/16 v5, 0x1d76

    :try_start_3c
    new-array v5, v5, [B

    move/from16 v8, v26

    invoke-virtual {v3, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v3
    :try_end_3c
    .catchall {:try_start_3c .. :try_end_3c} :catchall_5d

    :try_start_3d
    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    aget-byte v8, v0, v24
    :try_end_3d
    .catchall {:try_start_3d .. :try_end_3d} :catchall_5b

    int-to-byte v8, v8

    const/16 v27, 0x11f

    :try_start_3e
    aget-byte v9, v0, v27
    :try_end_3e
    .catchall {:try_start_3e .. :try_end_3e} :catchall_5c

    int-to-byte v9, v9

    :try_start_3f
    invoke-static {v8, v9, v10}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v9, v0, v24

    int-to-byte v9, v9

    aget-byte v14, v0, v41

    neg-int v14, v14

    int-to-byte v14, v14

    move-object/from16 v43, v5

    const/16 v5, 0x1c9

    int-to-short v5, v5

    invoke-static {v9, v14, v5}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    filled-new-array {v9}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v8

    invoke-virtual {v8, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_3f
    .catchall {:try_start_3f .. :try_end_3f} :catchall_5b

    :try_start_40
    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    aget-byte v8, v0, v24

    int-to-byte v8, v8

    aget-byte v9, v0, v40

    int-to-byte v9, v9

    xor-int/lit16 v14, v9, 0x1c1

    move/from16 v54, v14

    and-int/lit16 v14, v9, 0x1c1

    or-int v14, v54, v14

    int-to-short v14, v14

    invoke-static {v8, v9, v14}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v9, v0, v24

    int-to-byte v9, v9

    aget-byte v14, v0, v41

    neg-int v14, v14

    int-to-byte v14, v14

    invoke-static {v9, v14, v5}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_40
    .catchall {:try_start_40 .. :try_end_40} :catchall_5a

    :try_start_41
    filled-new-array/range {v43 .. v43}, [Ljava/lang/Object;

    move-result-object v5

    aget-byte v8, v0, v24

    int-to-byte v8, v8

    aget-byte v9, v0, v40

    int-to-byte v9, v9

    or-int/lit16 v14, v9, 0x1c1

    int-to-short v14, v14

    invoke-static {v8, v9, v14}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v9, v0, v16

    int-to-byte v9, v9

    const/16 v14, 0x7f

    aget-byte v14, v0, v14
    :try_end_41
    .catchall {:try_start_41 .. :try_end_41} :catchall_59

    int-to-byte v14, v14

    move-object/from16 v54, v15

    :try_start_42
    sget v15, Lcom/appsflyer/internal/AFa1bSDK;->$$b:I

    or-int/lit16 v15, v15, 0x1c0

    int-to-short v15, v15

    invoke-static {v9, v14, v15}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v9

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v14

    invoke-virtual {v8, v9, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    invoke-virtual {v8, v3, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_42
    .catchall {:try_start_42 .. :try_end_42} :catchall_58

    sget v5, Lcom/appsflyer/internal/AFa1bSDK;->$10:I

    xor-int/lit8 v8, v5, 0x23

    and-int/lit8 v5, v5, 0x23

    const/16 v26, 0x1

    shl-int/lit8 v5, v5, 0x1

    add-int/2addr v8, v5

    rem-int/lit16 v8, v8, 0x80

    sput v8, Lcom/appsflyer/internal/AFa1bSDK;->$11:I

    :try_start_43
    aget-byte v5, v0, v24

    int-to-byte v5, v5

    aget-byte v8, v0, v40

    int-to-byte v8, v8

    xor-int/lit16 v9, v8, 0x1c1

    and-int/lit16 v14, v8, 0x1c1

    or-int/2addr v9, v14

    int-to-short v9, v9

    invoke-static {v5, v8, v9}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    aget-byte v8, v0, v19

    int-to-byte v8, v8

    aget-byte v0, v0, v46

    int-to-byte v0, v0

    const/16 v14, 0x15c

    int-to-short v9, v14

    invoke-static {v8, v0, v9}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v0

    const/4 v9, 0x0

    invoke-virtual {v5, v0, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v3, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_43
    .catchall {:try_start_43 .. :try_end_43} :catchall_57

    const/16 v0, 0x16

    const/16 v3, 0x1d4e

    move v5, v3

    move v3, v0

    move v0, v5

    move-object/from16 v5, v43

    move-object/from16 v43, v50

    const/4 v15, 0x0

    :goto_2e
    const/4 v14, 0x1

    int-to-long v8, v14

    :try_start_44
    array-length v14, v5

    move-wide/from16 v57, v8

    move/from16 v8, v17

    :goto_2f
    if-ge v8, v14, :cond_29

    const/16 v59, 0x10

    aget-byte v9, v5, v8

    move/from16 v60, v8

    int-to-long v8, v9

    shl-long v61, v57, v29

    add-long v8, v8, v61

    shl-long v61, v57, v59

    add-long v8, v8, v61

    sub-long v57, v8, v57

    add-int/lit8 v8, v60, 0x1

    goto :goto_2f

    :catchall_16
    move-exception v0

    move-object v5, v1

    move-object/from16 v62, v2

    move-object v3, v6

    move-object v1, v7

    move/from16 v57, v11

    move/from16 v63, v12

    :goto_30
    const/16 v27, 0x11f

    const/16 v32, 0x3

    :goto_31
    const/16 v33, 0x5

    const/16 v37, 0x1a

    :goto_32
    move-object v2, v0

    goto/16 :goto_67

    :cond_29
    const/16 v59, 0x10

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    long-to-int v8, v8

    mul-int/lit16 v9, v3, 0x25b

    const v14, 0x8420

    and-int v60, v14, v9

    or-int/2addr v9, v14

    add-int v60, v60, v9

    not-int v9, v8

    const/16 v61, -0x71

    or-int v14, v61, v9

    not-int v14, v14

    xor-int v62, v3, v14

    and-int/2addr v14, v3

    or-int v14, v62, v14

    mul-int/lit16 v14, v14, -0x25a

    neg-int v14, v14

    neg-int v14, v14

    or-int v62, v60, v14

    const/16 v26, 0x1

    shl-int/lit8 v62, v62, 0x1

    xor-int v14, v60, v14

    sub-int v62, v62, v14

    not-int v14, v3

    or-int v14, v61, v14

    not-int v14, v14

    xor-int v60, v61, v8

    and-int v61, v61, v8

    move/from16 v63, v9

    or-int v9, v60, v61

    not-int v9, v9

    xor-int v60, v14, v9

    and-int/2addr v9, v14

    or-int v9, v60, v9

    or-int/lit8 v14, v63, 0x70

    or-int/2addr v14, v3

    not-int v14, v14

    xor-int v60, v9, v14

    and-int/2addr v9, v14

    or-int v9, v60, v9

    mul-int/lit16 v9, v9, -0x12d

    xor-int v14, v62, v9

    and-int v9, v62, v9

    const/16 v26, 0x1

    shl-int/lit8 v9, v9, 0x1

    add-int/2addr v14, v9

    not-int v8, v8

    xor-int v9, v8, v3

    and-int/2addr v8, v3

    or-int/2addr v8, v9

    not-int v8, v8

    mul-int/lit16 v8, v8, 0x12d

    xor-int v9, v14, v8

    and-int/2addr v8, v14

    shl-int/lit8 v8, v8, 0x1

    add-int/2addr v9, v8

    and-int/lit16 v8, v3, 0x1d5f

    or-int/lit16 v14, v3, 0x1d5f

    add-int/2addr v8, v14

    aget-byte v8, v5, v8

    add-int/lit8 v8, v8, 0x3

    int-to-byte v8, v8

    aput-byte v8, v5, v9

    array-length v8, v5
    :try_end_44
    .catchall {:try_start_44 .. :try_end_44} :catchall_16

    sub-int/2addr v8, v3

    const/4 v9, 0x3

    :try_start_45
    new-array v14, v9, [Ljava/lang/Object;
    :try_end_45
    .catchall {:try_start_45 .. :try_end_45} :catchall_56

    :try_start_46
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/16 v34, 0x2

    aput-object v8, v14, v34

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/16 v26, 0x1

    aput-object v8, v14, v26

    aput-object v5, v14, v17

    sget-object v5, Lcom/appsflyer/internal/AFa1bSDK;->$$a:[B

    aget-byte v8, v5, v24

    int-to-byte v8, v8

    const/16 v9, 0x11a

    aget-byte v9, v5, v9

    int-to-byte v9, v9

    move/from16 v60, v3

    sget v3, Lcom/appsflyer/internal/AFa1bSDK;->$$b:I

    or-int/lit16 v3, v3, 0x1c8

    int-to-short v3, v3

    invoke-static {v8, v9, v3}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v2, v8, v8}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v3, v9}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    invoke-virtual {v3, v14}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_46
    .catchall {:try_start_46 .. :try_end_46} :catchall_55

    :try_start_47
    sget-object v9, Lcom/appsflyer/internal/AFa1bSDK;->onPause:Ljava/lang/Object;

    const/16 v14, 0x30

    if-nez v9, :cond_2b

    sput-wide v57, Lcom/appsflyer/internal/AFa1bSDK;->updateServerUninstallToken:J

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    move-result v9

    shr-int/lit8 v9, v9, 0x10

    const v57, -0x5f0934b

    or-int v58, v9, v57

    const/16 v26, 0x1

    shl-int/lit8 v58, v58, 0x1

    xor-int v9, v9, v57

    sub-int v9, v58, v9

    sget-wide v57, Lcom/appsflyer/internal/AFa1bSDK;->updateServerUninstallToken:J

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v61

    shr-long v61, v61, v14

    const-wide v63, 0x11603a78705cce68L

    add-long v61, v61, v63

    move/from16 v63, v14

    move-object/from16 v67, v15

    xor-long v14, v57, v61

    long-to-int v14, v14

    sget-wide v57, Lcom/appsflyer/internal/AFa1bSDK;->updateServerUninstallToken:J

    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    move-result-wide v61

    const/16 v15, 0x20

    shr-long v61, v61, v15

    const-wide v64, 0x11603a78705cce6fL    # 5.480358363309116E-225

    add-long v61, v61, v64

    move/from16 v64, v14

    xor-long v14, v57, v61

    long-to-int v14, v14

    new-array v14, v14, [I

    invoke-static/range {v63 .. v63}, Landroid/text/AndroidCharacter;->getMirror(C)C

    move-result v15

    and-int/lit8 v57, v15, -0x30

    or-int/lit8 v15, v15, -0x30

    add-int v57, v57, v15

    sget-wide v61, Lcom/appsflyer/internal/AFa1bSDK;->setDebugLog:J

    const-string v15, ""

    move-object/from16 v65, v3

    move-object/from16 v68, v5

    move/from16 v5, v17

    move/from16 v3, v63

    invoke-static {v15, v3, v5, v5}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    move-result v3

    neg-int v3, v3

    move-object v5, v14

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    long-to-int v14, v14

    mul-int/lit16 v15, v3, 0x239

    add-int/lit16 v15, v15, 0x44e7

    move-object/from16 v58, v5

    not-int v5, v3

    xor-int/lit8 v63, v5, -0x20

    and-int/lit8 v66, v5, -0x20

    move/from16 v69, v3

    or-int v3, v63, v66

    not-int v3, v3

    move/from16 v63, v3

    not-int v3, v14

    xor-int v66, v5, v3

    and-int v70, v5, v3

    move/from16 v71, v3

    or-int v3, v66, v70

    not-int v3, v3

    xor-int v66, v63, v3

    and-int v3, v63, v3

    or-int v3, v66, v3

    const/16 v63, -0x20

    move/from16 v66, v3

    or-int v3, v63, v71

    not-int v3, v3

    xor-int v70, v66, v3

    and-int v3, v66, v3

    or-int v3, v70, v3

    mul-int/lit16 v3, v3, -0x470

    xor-int v66, v15, v3

    and-int/2addr v3, v15

    const/16 v26, 0x1

    shl-int/lit8 v3, v3, 0x1

    add-int v66, v66, v3

    or-int v3, v5, v14

    not-int v3, v3

    xor-int v15, v63, v14

    and-int v70, v63, v14

    or-int v15, v15, v70

    not-int v15, v15

    or-int/2addr v3, v15

    not-int v15, v14

    xor-int v70, v15, v69

    and-int v69, v15, v69

    move/from16 v71, v3

    or-int v3, v70, v69

    xor-int/lit8 v69, v3, 0x1f

    and-int/lit8 v70, v3, 0x1f

    move/from16 v72, v5

    or-int v5, v69, v70

    not-int v5, v5

    or-int v5, v71, v5

    mul-int/lit16 v5, v5, -0x238

    neg-int v5, v5

    neg-int v5, v5

    or-int v69, v66, v5

    const/16 v26, 0x1

    shl-int/lit8 v69, v69, 0x1

    xor-int v5, v66, v5

    sub-int v69, v69, v5

    not-int v3, v3

    or-int/lit8 v5, v15, 0x1f

    not-int v5, v5

    xor-int v15, v3, v5

    and-int/2addr v3, v5

    or-int/2addr v3, v15

    xor-int/lit8 v5, v72, -0x20

    and-int/lit8 v15, v72, -0x20

    or-int/2addr v5, v15

    xor-int v15, v5, v14

    and-int/2addr v5, v14

    or-int/2addr v5, v15

    not-int v5, v5

    or-int/2addr v3, v5

    mul-int/lit16 v3, v3, 0x238

    not-int v3, v3

    sub-int v69, v69, v3

    const/16 v26, 0x1

    add-int/lit8 v3, v69, -0x1

    int-to-byte v3, v3

    ushr-long v14, v61, v3

    long-to-int v3, v14

    and-int v5, v3, v9

    not-int v5, v5

    or-int/2addr v3, v9

    and-int/2addr v3, v5

    aput v3, v58, v57

    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    neg-int v3, v3

    xor-int/lit8 v5, v3, 0x1

    const/16 v26, 0x1

    and-int/lit8 v3, v3, 0x1

    shl-int/lit8 v3, v3, 0x1

    add-int/2addr v5, v3

    sget-wide v14, Lcom/appsflyer/internal/AFa1bSDK;->setDebugLog:J

    long-to-int v3, v14

    not-int v14, v9

    and-int/2addr v14, v3

    not-int v3, v3

    and-int/2addr v3, v9

    or-int/2addr v3, v14

    aput v3, v58, v5

    sget v3, Lcom/appsflyer/internal/AFa1bSDK;->setUserFirstName:I

    sget-object v5, Lcom/appsflyer/internal/AFa1bSDK;->setCustomerUserId:[B

    sget v9, Lcom/appsflyer/internal/AFa1bSDK;->setUserPhone:I
    :try_end_47
    .catchall {:try_start_47 .. :try_end_47} :catchall_16

    sget v14, Lcom/appsflyer/internal/AFa1bSDK;->$10:I

    add-int/lit8 v14, v14, 0x5f

    rem-int/lit16 v14, v14, 0x80

    sput v14, Lcom/appsflyer/internal/AFa1bSDK;->$11:I

    move/from16 v14, v29

    :try_start_48
    new-array v15, v14, [Ljava/lang/Object;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const/16 v33, 0x5

    aput-object v9, v15, v33

    invoke-static/range {v64 .. v64}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v15, v28

    const/16 v32, 0x3

    aput-object v5, v15, v32

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/16 v34, 0x2

    aput-object v3, v15, v34

    const/16 v26, 0x1

    aput-object v58, v15, v26

    const/16 v17, 0x0

    aput-object v65, v15, v17

    aget-byte v3, v68, v19

    int-to-byte v3, v3

    const/16 v5, 0xbf

    aget-byte v5, v68, v5

    int-to-byte v5, v5

    const/16 v9, 0x214

    int-to-short v9, v9

    invoke-static {v3, v5, v9}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    aget-byte v5, v68, v24

    int-to-byte v5, v5

    aget-byte v9, v68, v41

    neg-int v9, v9

    int-to-byte v9, v9

    const/16 v14, 0x1c9

    int-to-short v14, v14

    invoke-static {v5, v9, v14}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v61

    const-class v62, [I

    const-class v64, [B

    move-object/from16 v65, v8

    move-object/from16 v66, v8

    move-object/from16 v63, v8

    filled-new-array/range {v61 .. v66}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3

    invoke-virtual {v3, v15}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_48
    .catchall {:try_start_48 .. :try_end_48} :catchall_17

    move-object/from16 v58, v6

    move/from16 v57, v11

    const/16 v32, 0x3

    goto/16 :goto_33

    :catchall_17
    move-exception v0

    :try_start_49
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_2a

    throw v3

    :cond_2a
    throw v0

    :cond_2b
    move-object/from16 v65, v3

    move-object/from16 v68, v5

    move-object/from16 v67, v15

    sput-wide v57, Lcom/appsflyer/internal/AFa1bSDK;->setAndroidIdData:J

    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    move-result-wide v14
    :try_end_49
    .catchall {:try_start_49 .. :try_end_49} :catchall_16

    const/16 v63, 0x30

    shr-long v14, v14, v63

    const-wide v61, 0x5ab2ca3b244258f4L    # 8.14036973661956E128

    sub-long v61, v61, v14

    xor-long v14, v57, v61

    long-to-int v3, v14

    move/from16 v5, v59

    :try_start_4a
    new-array v14, v5, [B

    fill-array-data v14, :array_2
    :try_end_4a
    .catchall {:try_start_4a .. :try_end_4a} :catchall_54

    :try_start_4b
    sget-wide v57, Lcom/appsflyer/internal/AFa1bSDK;->setAndroidIdData:J

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v61
    :try_end_4b
    .catchall {:try_start_4b .. :try_end_4b} :catchall_16

    const/16 v63, 0x30

    shr-long v61, v61, v63

    const-wide v63, 0x5ab2ca3b5665916cL    # 8.140371031297168E128

    add-long v61, v61, v63

    move-object v5, v14

    xor-long v14, v57, v61

    long-to-int v14, v14

    sget v15, Lcom/appsflyer/internal/AFa1bSDK;->$11:I

    and-int/lit8 v57, v15, 0x75

    or-int/lit8 v15, v15, 0x75

    add-int v15, v57, v15

    rem-int/lit16 v15, v15, 0x80

    sput v15, Lcom/appsflyer/internal/AFa1bSDK;->$10:I

    move/from16 v15, v28

    move/from16 v28, v3

    :try_start_4c
    new-array v3, v15, [Ljava/lang/Object;

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14
    :try_end_4c
    .catchall {:try_start_4c .. :try_end_4c} :catchall_53

    const/16 v32, 0x3

    :try_start_4d
    aput-object v14, v3, v32

    const/16 v34, 0x2

    aput-object v5, v3, v34

    invoke-static/range {v28 .. v28}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v26, 0x1

    aput-object v5, v3, v26

    const/16 v17, 0x0

    aput-object v65, v3, v17

    aget-byte v5, v68, v19

    int-to-byte v5, v5

    aget-byte v14, v68, v18

    int-to-byte v14, v14

    xor-int/lit16 v15, v14, 0x222

    move/from16 v57, v15

    and-int/lit16 v15, v14, 0x222

    or-int v15, v57, v15

    int-to-short v15, v15

    invoke-static {v5, v14, v15}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5

    sget-object v14, Lcom/appsflyer/internal/AFa1bSDK;->getSdkVersion:Ljava/lang/Object;

    check-cast v14, Ljava/lang/ClassLoader;

    const/4 v15, 0x1

    invoke-static {v5, v15, v14}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v5

    const/16 v14, 0xbc

    aget-byte v14, v68, v14

    neg-int v14, v14

    int-to-byte v14, v14

    const/16 v15, 0x31d

    aget-byte v15, v68, v15
    :try_end_4d
    .catchall {:try_start_4d .. :try_end_4d} :catchall_52

    int-to-byte v15, v15

    move/from16 v57, v11

    const/16 v11, 0x252

    int-to-short v11, v11

    :try_start_4e
    invoke-static {v14, v15, v11}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v11

    aget-byte v14, v68, v24

    int-to-byte v14, v14

    aget-byte v15, v68, v41
    :try_end_4e
    .catchall {:try_start_4e .. :try_end_4e} :catchall_51

    neg-int v15, v15

    int-to-byte v15, v15

    move-object/from16 v58, v6

    const/16 v6, 0x1c9

    int-to-short v6, v6

    :try_start_4f
    invoke-static {v14, v15, v6}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    filled-new-array {v6, v8, v2, v8}, [Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v5, v11, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5, v9, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_4f
    .catchall {:try_start_4f .. :try_end_4f} :catchall_50

    :goto_33
    :try_start_50
    aget-byte v5, v68, v24

    int-to-byte v5, v5

    aget-byte v6, v68, v41

    neg-int v6, v6

    int-to-byte v6, v6

    const/16 v9, 0x1c9

    int-to-short v9, v9

    invoke-static {v5, v6, v9}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    aget-byte v6, v68, v36

    int-to-byte v6, v6

    const/16 v11, 0x9c

    aget-byte v14, v68, v11

    int-to-byte v14, v14

    const/16 v15, 0x259

    int-to-short v15, v15

    invoke-static {v6, v14, v15}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    sget-object v14, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    filled-new-array {v14}, [Ljava/lang/Class;

    move-result-object v14

    invoke-virtual {v5, v6, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    const/16 v59, 0x10

    invoke-static/range {v59 .. v59}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v3, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_50
    .catchall {:try_start_50 .. :try_end_50} :catchall_4f

    if-eqz v42, :cond_3a

    sget v6, Lcom/appsflyer/internal/AFa1bSDK;->$10:I

    and-int/lit8 v14, v6, 0x21

    or-int/lit8 v6, v6, 0x21

    add-int/2addr v14, v6

    rem-int/lit16 v14, v14, 0x80

    sput v14, Lcom/appsflyer/internal/AFa1bSDK;->$11:I

    :try_start_51
    sget-object v6, Lcom/appsflyer/internal/AFa1bSDK;->onPause:Ljava/lang/Object;
    :try_end_51
    .catchall {:try_start_51 .. :try_end_51} :catchall_2f

    if-nez v6, :cond_2c

    and-int/lit8 v15, v14, 0x7

    or-int/lit8 v14, v14, 0x7

    add-int/2addr v15, v14

    rem-int/lit16 v15, v15, 0x80

    sput v15, Lcom/appsflyer/internal/AFa1bSDK;->$10:I

    move-object/from16 v14, v52

    goto :goto_34

    :cond_2c
    move-object/from16 v14, v56

    :goto_34
    if-nez v6, :cond_2d

    move-object/from16 v6, v55

    goto :goto_35

    :cond_2d
    move-object/from16 v6, v51

    :goto_35
    :try_start_52
    aget-byte v15, v68, v24

    int-to-byte v15, v15

    const/16 v59, 0x25

    aget-byte v5, v68, v41

    neg-int v5, v5

    int-to-byte v5, v5

    invoke-static {v15, v5, v9}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    aget-byte v15, v68, v16

    int-to-byte v15, v15

    move/from16 v61, v11

    aget-byte v11, v68, v61

    int-to-byte v11, v11

    move/from16 v62, v10

    const/16 v10, 0x25c

    int-to-short v10, v10

    invoke-static {v15, v11, v10}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v10

    filled-new-array {v2, v8, v8}, [Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v5, v10, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    aget-byte v10, v68, v24

    int-to-byte v10, v10

    aget-byte v11, v68, v31

    neg-int v11, v11

    int-to-byte v11, v11

    const/16 v15, 0x145

    int-to-short v15, v15

    invoke-static {v10, v11, v15}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10
    :try_end_52
    .catchall {:try_start_52 .. :try_end_52} :catchall_2f

    :try_start_53
    aget-byte v11, v68, v24

    int-to-byte v11, v11

    aget-byte v15, v68, v25

    int-to-byte v15, v15

    invoke-static {v11, v15, v12}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v11

    filled-new-array {v11}, [Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v11

    filled-new-array {v14}, [Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v11, v15}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11
    :try_end_53
    .catch Ljava/lang/Exception; {:try_start_53 .. :try_end_53} :catch_d
    .catchall {:try_start_53 .. :try_end_53} :catchall_28

    if-eqz v38, :cond_2f

    :try_start_54
    aget-byte v15, v68, v24

    int-to-byte v15, v15

    move/from16 v63, v9

    aget-byte v9, v68, v25

    int-to-byte v9, v9

    invoke-static {v15, v9, v12}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    aget-byte v15, v68, v36
    :try_end_54
    .catchall {:try_start_54 .. :try_end_54} :catchall_1a

    int-to-byte v15, v15

    move-object/from16 v64, v7

    :try_start_55
    aget-byte v7, v68, v22
    :try_end_55
    .catchall {:try_start_55 .. :try_end_55} :catchall_19

    int-to-byte v7, v7

    move-object/from16 v65, v1

    const/16 v1, 0x25f

    int-to-short v1, v1

    :try_start_56
    invoke-static {v15, v7, v1}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v1

    const/4 v7, 0x0

    invoke-virtual {v9, v1, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v14, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_56
    .catchall {:try_start_56 .. :try_end_56} :catchall_18

    goto :goto_38

    :catchall_18
    move-exception v0

    goto :goto_36

    :catchall_19
    move-exception v0

    move-object/from16 v65, v1

    goto :goto_36

    :catchall_1a
    move-exception v0

    move-object/from16 v65, v1

    move-object/from16 v64, v7

    :goto_36
    :try_start_57
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_2e

    throw v1

    :catchall_1b
    move-exception v0

    move-object v9, v2

    :goto_37
    move-object/from16 v1, v64

    move-object/from16 v5, v65

    goto/16 :goto_44

    :catch_c
    move-exception v0

    move-object v9, v2

    move-object/from16 v5, v65

    goto/16 :goto_42

    :cond_2e
    throw v0
    :try_end_57
    .catch Ljava/lang/Exception; {:try_start_57 .. :try_end_57} :catch_c
    .catchall {:try_start_57 .. :try_end_57} :catchall_1b

    :cond_2f
    move-object/from16 v65, v1

    move-object/from16 v64, v7

    move/from16 v63, v9

    :goto_38
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    const/16 v1, 0x400

    :try_start_58
    new-array v7, v1, [B

    const/16 v37, 0x1a

    aget-byte v9, v68, v37

    int-to-byte v9, v9

    aget-byte v15, v68, v46

    int-to-byte v15, v15

    xor-int/lit16 v1, v15, 0x241

    move/from16 v68, v1

    and-int/lit16 v1, v15, 0x241

    or-int v1, v68, v1

    int-to-short v1, v1

    invoke-static {v9, v15, v1}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v2, v8, v8}, [Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v10, v1, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1
    :try_end_58
    .catchall {:try_start_58 .. :try_end_58} :catchall_27

    :goto_39
    if-lez v0, :cond_30

    const/16 v8, 0x400

    :try_start_59
    invoke-static {v8, v0}, Ljava/lang/Math;->min(II)I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    filled-new-array {v7, v4, v9}, [Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v5, v3, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v15

    const/4 v8, -0x1

    if-eq v15, v8, :cond_30

    filled-new-array {v7, v4, v9}, [Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v1, v11, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_59
    .catchall {:try_start_59 .. :try_end_59} :catchall_1b

    neg-int v8, v15

    move-object v15, v1

    move-object v9, v2

    :try_start_5a
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1
    :try_end_5a
    .catchall {:try_start_5a .. :try_end_5a} :catchall_1c

    long-to-int v1, v1

    mul-int/lit16 v2, v8, -0x2ef

    move/from16 v68, v1

    mul-int/lit16 v1, v0, -0x2ef

    neg-int v1, v1

    neg-int v1, v1

    not-int v1, v1

    sub-int/2addr v2, v1

    const/16 v26, 0x1

    add-int/lit8 v2, v2, -0x1

    not-int v1, v8

    move/from16 v69, v1

    not-int v1, v0

    xor-int v70, v69, v1

    and-int v71, v69, v1

    move/from16 v72, v1

    or-int v1, v70, v71

    not-int v1, v1

    xor-int v70, v69, v68

    and-int v71, v69, v68

    move/from16 v73, v1

    or-int v1, v70, v71

    not-int v1, v1

    or-int v1, v73, v1

    mul-int/lit16 v1, v1, 0x5e0

    neg-int v1, v1

    neg-int v1, v1

    not-int v1, v1

    sub-int/2addr v2, v1

    const/16 v26, 0x1

    add-int/lit8 v2, v2, -0x1

    xor-int v1, v69, v0

    and-int v0, v69, v0

    or-int/2addr v0, v1

    xor-int v1, v0, v68

    and-int v68, v0, v68

    or-int v1, v1, v68

    not-int v1, v1

    mul-int/lit16 v1, v1, -0x5e0

    not-int v1, v1

    sub-int/2addr v2, v1

    const/16 v26, 0x1

    add-int/lit8 v2, v2, -0x1

    not-int v0, v0

    xor-int v1, v72, v8

    and-int v8, v72, v8

    or-int/2addr v1, v8

    not-int v1, v1

    xor-int v8, v0, v1

    and-int/2addr v0, v1

    or-int/2addr v0, v8

    mul-int/lit16 v0, v0, 0x2f0

    neg-int v0, v0

    neg-int v0, v0

    or-int v1, v2, v0

    const/16 v26, 0x1

    shl-int/lit8 v1, v1, 0x1

    xor-int/2addr v0, v2

    sub-int v0, v1, v0

    move-object v2, v9

    move-object v1, v15

    goto/16 :goto_39

    :catchall_1c
    move-exception v0

    goto/16 :goto_37

    :cond_30
    move-object v9, v2

    :try_start_5b
    sget-object v0, Lcom/appsflyer/internal/AFa1bSDK;->$$a:[B

    aget-byte v1, v0, v18

    int-to-byte v1, v1

    aget-byte v2, v0, v46

    int-to-byte v2, v2

    sget v3, Lcom/appsflyer/internal/AFa1bSDK;->$$b:I

    xor-int/lit16 v5, v3, 0x240

    and-int/lit16 v7, v3, 0x240

    or-int/2addr v5, v7

    int-to-short v5, v5

    invoke-static {v1, v2, v5}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v1

    const/4 v7, 0x0

    invoke-virtual {v10, v1, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v11, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    aget-byte v2, v0, v24

    int-to-byte v2, v2

    aget-byte v5, v0, v20

    int-to-byte v5, v5

    xor-int/lit16 v7, v3, 0x244

    and-int/lit16 v8, v3, 0x244

    or-int/2addr v7, v8

    int-to-short v7, v7

    invoke-static {v2, v5, v7}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    aget-byte v5, v0, v36

    int-to-byte v5, v5

    aget-byte v7, v0, v61

    int-to-byte v7, v7

    const/16 v8, 0x28a

    int-to-short v8, v8

    invoke-static {v5, v7, v8}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x0

    invoke-virtual {v2, v5, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    aget-byte v1, v0, v19

    int-to-byte v1, v1

    aget-byte v2, v0, v46

    int-to-byte v2, v2

    const/16 v5, 0x15c

    int-to-short v8, v5

    invoke-static {v1, v2, v8}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v1, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v11, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    aget-byte v1, v0, v59

    int-to-byte v1, v1

    aget-byte v2, v0, v21

    neg-int v2, v2

    int-to-byte v2, v2

    const/16 v5, 0x28d

    int-to-short v5, v5

    invoke-static {v1, v2, v5}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/16 v2, 0xdb

    aget-byte v2, v0, v2

    int-to-byte v2, v2

    aget-byte v5, v0, v30

    int-to-byte v5, v5

    const/16 v7, 0x2a1

    int-to-short v7, v7

    invoke-static {v2, v5, v7}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v2

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v13, v13, v5}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v1, v2, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1
    :try_end_5b
    .catchall {:try_start_5b .. :try_end_5b} :catchall_23

    sget v2, Lcom/appsflyer/internal/AFa1bSDK;->$10:I

    and-int/lit8 v5, v2, 0x45

    or-int/lit8 v2, v2, 0x45

    add-int/2addr v5, v2

    rem-int/lit16 v5, v5, 0x80

    sput v5, Lcom/appsflyer/internal/AFa1bSDK;->$11:I

    :try_start_5c
    aget-byte v2, v0, v24

    int-to-byte v2, v2

    aget-byte v5, v0, v25

    int-to-byte v5, v5

    invoke-static {v2, v5, v12}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    aget-byte v5, v0, v18

    int-to-byte v5, v5

    const/16 v7, 0x372

    aget-byte v7, v0, v7

    int-to-byte v7, v7

    xor-int/lit16 v8, v7, 0x285

    and-int/lit16 v10, v7, 0x285

    or-int/2addr v8, v10

    int-to-short v8, v8

    invoke-static {v5, v7, v8}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x0

    invoke-virtual {v2, v5, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v14, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_5c
    .catchall {:try_start_5c .. :try_end_5c} :catchall_26

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    :try_start_5d
    aget-byte v5, v0, v24

    int-to-byte v5, v5

    aget-byte v7, v0, v25

    int-to-byte v7, v7

    invoke-static {v5, v7, v12}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    aget-byte v7, v0, v18

    int-to-byte v7, v7

    const/16 v8, 0x372

    aget-byte v8, v0, v8

    int-to-byte v8, v8

    xor-int/lit16 v10, v8, 0x285

    and-int/lit16 v11, v8, 0x285

    or-int/2addr v10, v11

    int-to-short v10, v10

    invoke-static {v7, v8, v10}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    invoke-virtual {v5, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5, v6, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_5d
    .catchall {:try_start_5d .. :try_end_5d} :catchall_24

    :try_start_5e
    filled-new-array {v2, v5, v4}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v8, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_5e
    .catchall {:try_start_5e .. :try_end_5e} :catchall_23

    sget v2, Lcom/appsflyer/internal/AFa1bSDK;->$11:I

    add-int/lit8 v2, v2, 0x4b

    rem-int/lit16 v2, v2, 0x80

    sput v2, Lcom/appsflyer/internal/AFa1bSDK;->$10:I

    :try_start_5f
    aget-byte v2, v0, v24

    int-to-byte v2, v2

    aget-byte v5, v0, v25

    int-to-byte v5, v5

    invoke-static {v2, v5, v12}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    aget-byte v5, v0, v59

    int-to-byte v5, v5

    const/16 v7, 0x442

    aget-byte v7, v0, v7

    int-to-byte v7, v7

    xor-int/lit16 v8, v3, 0x284

    and-int/lit16 v10, v3, 0x284

    or-int/2addr v8, v10

    int-to-short v8, v8

    invoke-static {v5, v7, v8}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x0

    invoke-virtual {v2, v5, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v14, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_5f
    .catchall {:try_start_5f .. :try_end_5f} :catchall_22

    sget v2, Lcom/appsflyer/internal/AFa1bSDK;->$10:I

    and-int/lit8 v5, v2, 0x1b

    or-int/lit8 v2, v2, 0x1b

    add-int/2addr v5, v2

    rem-int/lit16 v5, v5, 0x80

    sput v5, Lcom/appsflyer/internal/AFa1bSDK;->$11:I

    :try_start_60
    aget-byte v2, v0, v24

    int-to-byte v2, v2

    aget-byte v5, v0, v25

    int-to-byte v5, v5

    invoke-static {v2, v5, v12}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    aget-byte v5, v0, v59

    int-to-byte v5, v5

    const/16 v7, 0x442

    aget-byte v7, v0, v7

    int-to-byte v7, v7

    xor-int/lit16 v8, v3, 0x284

    and-int/lit16 v3, v3, 0x284

    or-int/2addr v3, v8

    int-to-short v3, v3

    invoke-static {v5, v7, v3}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v3

    const/4 v7, 0x0

    invoke-virtual {v2, v3, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_60
    .catchall {:try_start_60 .. :try_end_60} :catchall_21

    :try_start_61
    sget-object v2, Lcom/appsflyer/internal/AFa1bSDK;->getSdkVersion:Ljava/lang/Object;

    if-nez v2, :cond_32

    const-class v2, Lcom/appsflyer/internal/AFa1bSDK;
    :try_end_61
    .catchall {:try_start_61 .. :try_end_61} :catchall_20

    :try_start_62
    aget-byte v3, v0, v18

    int-to-byte v3, v3

    aget-byte v0, v0, v23

    int-to-byte v0, v0

    const/16 v5, 0x2ba

    int-to-short v5, v5

    invoke-static {v3, v0, v5}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v0
    :try_end_62
    .catchall {:try_start_62 .. :try_end_62} :catchall_1f

    move-object/from16 v5, v65

    const/4 v7, 0x0

    :try_start_63
    invoke-virtual {v5, v0, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v2, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_63
    .catchall {:try_start_63 .. :try_end_63} :catchall_1e

    :try_start_64
    sput-object v0, Lcom/appsflyer/internal/AFa1bSDK;->getSdkVersion:Ljava/lang/Object;

    goto :goto_3f

    :catchall_1d
    move-exception v0

    :goto_3a
    move-object v2, v0

    move-object/from16 v62, v9

    move/from16 v63, v12

    :goto_3b
    move-object/from16 v3, v58

    move-object/from16 v1, v64

    :goto_3c
    const/16 v27, 0x11f

    const/16 v33, 0x5

    :goto_3d
    const/16 v37, 0x1a

    goto/16 :goto_67

    :catchall_1e
    move-exception v0

    goto :goto_3e

    :catchall_1f
    move-exception v0

    move-object/from16 v5, v65

    :goto_3e
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_31

    throw v1

    :cond_31
    throw v0

    :catchall_20
    move-exception v0

    move-object/from16 v5, v65

    goto :goto_3a

    :cond_32
    move-object/from16 v5, v65

    :goto_3f
    move/from16 v66, v62

    move/from16 v65, v63

    const/16 v33, 0x5

    move-object/from16 v62, v9

    move/from16 v63, v12

    goto/16 :goto_4c

    :catchall_21
    move-exception v0

    move-object/from16 v5, v65

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_33

    throw v1

    :cond_33
    throw v0

    :catchall_22
    move-exception v0

    move-object/from16 v5, v65

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_34

    throw v1

    :cond_34
    throw v0
    :try_end_64
    .catchall {:try_start_64 .. :try_end_64} :catchall_1d

    :catchall_23
    move-exception v0

    :goto_40
    move-object/from16 v5, v65

    :goto_41
    move-object/from16 v1, v64

    goto/16 :goto_44

    :catchall_24
    move-exception v0

    move-object/from16 v5, v65

    :try_start_65
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_35

    throw v1

    :catchall_25
    move-exception v0

    goto :goto_41

    :cond_35
    throw v0

    :catchall_26
    move-exception v0

    move-object/from16 v5, v65

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_36

    throw v1

    :cond_36
    throw v0

    :catchall_27
    move-exception v0

    move-object v9, v2

    goto :goto_40

    :catchall_28
    move-exception v0

    move-object v5, v1

    move-object v9, v2

    move-object/from16 v64, v7

    goto :goto_41

    :catch_d
    move-exception v0

    move-object v5, v1

    move-object v9, v2

    move-object/from16 v64, v7

    :goto_42
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/appsflyer/internal/AFa1bSDK;->$$a:[B

    aget-byte v3, v2, v39

    int-to-byte v3, v3

    aget-byte v7, v2, v46

    int-to-byte v7, v7

    const/16 v8, 0x269

    int-to-short v8, v8

    invoke-static {v3, v7, v8}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    aget-byte v3, v2, v44

    int-to-byte v3, v3

    aget-byte v7, v2, v45

    int-to-byte v7, v7

    const/16 v8, 0x123

    int-to-short v10, v8

    invoke-static {v3, v7, v10}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_65
    .catchall {:try_start_65 .. :try_end_65} :catchall_25

    const/4 v3, 0x2

    :try_start_66
    new-array v7, v3, [Ljava/lang/Object;

    const/16 v26, 0x1

    aput-object v0, v7, v26

    const/16 v17, 0x0

    aput-object v1, v7, v17

    aget-byte v0, v2, v24

    int-to-byte v0, v0

    aget-byte v1, v2, v41

    neg-int v1, v1

    int-to-byte v1, v1

    invoke-static {v0, v1, v10}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_66
    .catchall {:try_start_66 .. :try_end_66} :catchall_2a

    move-object/from16 v1, v64

    :try_start_67
    filled-new-array {v13, v1}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_67
    .catchall {:try_start_67 .. :try_end_67} :catchall_29

    :catchall_29
    move-exception v0

    goto :goto_43

    :catchall_2a
    move-exception v0

    move-object/from16 v1, v64

    :goto_43
    :try_start_68
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_37

    throw v2

    :catchall_2b
    move-exception v0

    goto :goto_44

    :cond_37
    throw v0
    :try_end_68
    .catchall {:try_start_68 .. :try_end_68} :catchall_2b

    :goto_44
    :try_start_69
    sget-object v2, Lcom/appsflyer/internal/AFa1bSDK;->$$a:[B

    aget-byte v3, v2, v24

    int-to-byte v3, v3

    aget-byte v7, v2, v25

    int-to-byte v7, v7

    invoke-static {v3, v7, v12}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    aget-byte v7, v2, v59

    int-to-byte v7, v7

    const/16 v8, 0x442

    aget-byte v8, v2, v8

    int-to-byte v8, v8

    sget v10, Lcom/appsflyer/internal/AFa1bSDK;->$$b:I

    xor-int/lit16 v11, v10, 0x284

    and-int/lit16 v15, v10, 0x284

    or-int/2addr v11, v15

    int-to-short v11, v11

    invoke-static {v7, v8, v11}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    invoke-virtual {v3, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-virtual {v3, v14, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_69
    .catchall {:try_start_69 .. :try_end_69} :catchall_2e

    sget v3, Lcom/appsflyer/internal/AFa1bSDK;->$11:I

    add-int/lit8 v3, v3, 0x33

    rem-int/lit16 v3, v3, 0x80

    sput v3, Lcom/appsflyer/internal/AFa1bSDK;->$10:I

    :try_start_6a
    aget-byte v3, v2, v24

    int-to-byte v3, v3

    aget-byte v7, v2, v25

    int-to-byte v7, v7

    invoke-static {v3, v7, v12}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    aget-byte v7, v2, v59

    int-to-byte v7, v7

    const/16 v8, 0x442

    aget-byte v2, v2, v8

    int-to-byte v2, v2

    xor-int/lit16 v8, v10, 0x284

    and-int/lit16 v10, v10, 0x284

    or-int/2addr v8, v10

    int-to-short v8, v8

    invoke-static {v7, v2, v8}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v2

    const/4 v7, 0x0

    invoke-virtual {v3, v2, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v6, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_6a
    .catchall {:try_start_6a .. :try_end_6a} :catchall_2d

    :try_start_6b
    throw v0

    :catchall_2c
    move-exception v0

    :goto_45
    move-object v2, v0

    move-object/from16 v62, v9

    move/from16 v63, v12

    move-object/from16 v3, v58

    goto/16 :goto_3c

    :catchall_2d
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_38

    throw v2

    :cond_38
    throw v0

    :catchall_2e
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_39

    throw v2

    :cond_39
    throw v0
    :try_end_6b
    .catchall {:try_start_6b .. :try_end_6b} :catchall_2c

    :catchall_2f
    move-exception v0

    move-object v5, v1

    move-object v9, v2

    move-object v1, v7

    goto :goto_45

    :cond_3a
    move-object v5, v1

    move-object v1, v7

    move/from16 v63, v9

    move/from16 v62, v10

    move/from16 v61, v11

    const/16 v59, 0x25

    move-object v9, v2

    :try_start_6c
    aget-byte v0, v68, v24

    int-to-byte v0, v0

    const/16 v2, 0x11a

    aget-byte v2, v68, v2

    int-to-byte v2, v2

    const/16 v6, 0x2c7

    int-to-short v6, v6

    invoke-static {v0, v2, v6}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    aget-byte v2, v68, v24

    int-to-byte v2, v2

    aget-byte v6, v68, v41

    neg-int v6, v6

    int-to-byte v6, v6

    move/from16 v7, v63

    invoke-static {v2, v6, v7}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v6

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    aget-byte v6, v68, v18

    int-to-byte v6, v6

    aget-byte v10, v68, v25

    int-to-byte v10, v10

    const/16 v11, 0x2e2

    int-to-short v11, v11

    invoke-static {v6, v10, v11}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    const/4 v10, 0x0

    invoke-virtual {v0, v6, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v3, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    aget-byte v6, v68, v24

    int-to-byte v6, v6

    aget-byte v10, v68, v20

    int-to-byte v10, v10

    const/16 v11, 0x2ed

    int-to-short v11, v11

    invoke-static {v6, v10, v11}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    aget-byte v10, v68, v18

    int-to-byte v10, v10

    aget-byte v11, v68, v30

    int-to-byte v11, v11

    const/16 v14, 0x302

    int-to-short v14, v14

    invoke-static {v10, v11, v14}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    invoke-virtual {v6, v10, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    aget-byte v10, v68, v16

    int-to-byte v10, v10

    aget-byte v11, v68, v61

    int-to-byte v11, v11

    const/16 v14, 0x25c

    int-to-short v14, v14

    invoke-static {v10, v11, v14}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v10

    filled-new-array {v9}, [Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v2, v10, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2
    :try_end_6c
    .catchall {:try_start_6c .. :try_end_6c} :catchall_4c

    :try_start_6d
    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    aget-byte v10, v68, v24
    :try_end_6d
    .catchall {:try_start_6d .. :try_end_6d} :catchall_4d

    int-to-byte v10, v10

    const/16 v27, 0x11f

    :try_start_6e
    aget-byte v11, v68, v27
    :try_end_6e
    .catchall {:try_start_6e .. :try_end_6e} :catchall_4e

    int-to-byte v11, v11

    move/from16 v14, v62

    :try_start_6f
    invoke-static {v10, v11, v14}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    aget-byte v11, v68, v24

    int-to-byte v11, v11

    aget-byte v15, v68, v41

    neg-int v15, v15

    int-to-byte v15, v15

    invoke-static {v11, v15, v7}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v11

    filled-new-array {v11}, [Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v10

    invoke-virtual {v10, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_6f
    .catchall {:try_start_6f .. :try_end_6f} :catchall_4d

    :try_start_70
    const-class v10, Lcom/appsflyer/internal/AFa1bSDK;
    :try_end_70
    .catchall {:try_start_70 .. :try_end_70} :catchall_4c

    :try_start_71
    aget-byte v11, v68, v18

    int-to-byte v11, v11

    aget-byte v15, v68, v23
    :try_end_71
    .catchall {:try_start_71 .. :try_end_71} :catchall_4b

    int-to-byte v15, v15

    move-object/from16 v62, v9

    const/16 v9, 0x2ba

    int-to-short v9, v9

    :try_start_72
    invoke-static {v11, v15, v9}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v9

    const/4 v11, 0x0

    invoke-virtual {v5, v9, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    invoke-virtual {v9, v10, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9
    :try_end_72
    .catchall {:try_start_72 .. :try_end_72} :catchall_4a

    :try_start_73
    aget-byte v10, v68, v24

    int-to-byte v10, v10

    aget-byte v11, v68, v19

    int-to-byte v11, v11

    const/16 v15, 0x308

    int-to-short v15, v15

    invoke-static {v10, v11, v15}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    const/4 v11, 0x0

    invoke-virtual {v10, v11}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v15

    invoke-virtual {v15, v11}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15
    :try_end_73
    .catchall {:try_start_73 .. :try_end_73} :catchall_49

    const/16 v37, 0x1a

    :try_start_74
    aget-byte v11, v68, v37
    :try_end_74
    .catchall {:try_start_74 .. :try_end_74} :catchall_48

    int-to-byte v11, v11

    move/from16 v63, v12

    :try_start_75
    aget-byte v12, v68, v46
    :try_end_75
    .catchall {:try_start_75 .. :try_end_75} :catchall_47

    int-to-byte v12, v12

    move-object/from16 v64, v1

    or-int/lit16 v1, v12, 0x241

    int-to-short v1, v1

    :try_start_76
    invoke-static {v11, v12, v1}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v1
    :try_end_76
    .catchall {:try_start_76 .. :try_end_76} :catchall_43

    move-object/from16 v11, v62

    :try_start_77
    filled-new-array {v11, v8, v8}, [Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v10, v1, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    const/16 v8, 0x2d

    aget-byte v8, v68, v8

    int-to-byte v8, v8

    aget-byte v12, v68, v22
    :try_end_77
    .catchall {:try_start_77 .. :try_end_77} :catchall_46

    int-to-byte v12, v12

    move-object/from16 v62, v11

    const/16 v11, 0x324

    int-to-short v11, v11

    :try_start_78
    invoke-static {v8, v12, v11}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v8

    const/4 v11, 0x0

    invoke-virtual {v10, v8, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    aget-byte v10, v68, v24

    int-to-byte v10, v10

    const/16 v11, 0xaf

    aget-byte v11, v68, v11

    int-to-byte v11, v11

    xor-int/lit16 v12, v11, 0x30e

    move/from16 v65, v12

    and-int/lit16 v12, v11, 0x30e

    or-int v12, v65, v12

    int-to-short v12, v12

    invoke-static {v10, v11, v12}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    aget-byte v11, v68, v19

    int-to-byte v11, v11

    aget-byte v12, v68, v46

    int-to-byte v12, v12

    move/from16 v65, v7

    move/from16 v66, v14

    const/16 v7, 0x15c

    int-to-short v14, v7

    invoke-static {v11, v12, v14}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v7

    const/4 v11, 0x0

    invoke-virtual {v10, v7, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    const/16 v10, 0x400

    new-array v10, v10, [B

    const/4 v11, 0x0

    :goto_46
    filled-new-array {v10}, [Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v2, v3, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v14
    :try_end_78
    .catchall {:try_start_78 .. :try_end_78} :catchall_43

    if-lez v14, :cond_3c

    sget v68, Lcom/appsflyer/internal/AFa1bSDK;->$10:I

    and-int/lit8 v69, v68, 0x6b

    or-int/lit8 v68, v68, 0x6b

    move-object/from16 v70, v2

    add-int v2, v69, v68

    rem-int/lit16 v2, v2, 0x80

    sput v2, Lcom/appsflyer/internal/AFa1bSDK;->$11:I

    move-object/from16 v68, v3

    int-to-long v2, v11

    move-wide/from16 v71, v2

    const/4 v2, 0x0

    :try_start_79
    invoke-virtual {v6, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v2, v71, v2

    if-gez v2, :cond_3b

    filled-new-array {v10, v4, v12}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v15, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_79
    .catchall {:try_start_79 .. :try_end_79} :catchall_30

    neg-int v2, v14

    neg-int v2, v2

    xor-int v3, v11, v2

    and-int/2addr v2, v11

    const/16 v26, 0x1

    shl-int/lit8 v2, v2, 0x1

    add-int v11, v3, v2

    move-object/from16 v3, v68

    move-object/from16 v2, v70

    goto :goto_46

    :catchall_30
    move-exception v0

    move-object v2, v0

    goto/16 :goto_3b

    :cond_3b
    :goto_47
    const/4 v11, 0x0

    goto :goto_48

    :cond_3c
    move-object/from16 v68, v3

    goto :goto_47

    :goto_48
    :try_start_7a
    invoke-virtual {v8, v15, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B
    :try_end_7a
    .catchall {:try_start_7a .. :try_end_7a} :catchall_43

    move-object/from16 v1, v68

    :try_start_7b
    invoke-virtual {v7, v1, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v7, v15, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7b
    .catch Ljava/lang/Exception; {:try_start_7b .. :try_end_7b} :catch_e
    .catchall {:try_start_7b .. :try_end_7b} :catchall_30

    :catch_e
    :try_start_7c
    sget-object v1, Lcom/appsflyer/internal/AFa1bSDK;->$$a:[B

    aget-byte v2, v1, v59

    int-to-byte v2, v2

    aget-byte v3, v1, v24

    int-to-byte v3, v3

    const/16 v6, 0x33e

    int-to-short v6, v6

    invoke-static {v2, v3, v6}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    aget-byte v3, v1, v24

    int-to-byte v3, v3

    aget-byte v6, v1, v41

    neg-int v6, v6

    int-to-byte v6, v6

    const/16 v7, 0x361

    int-to-short v7, v7

    invoke-static {v3, v6, v7}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    aget-byte v6, v1, v24

    int-to-byte v6, v6

    aget-byte v8, v1, v21

    neg-int v8, v8

    int-to-byte v8, v8

    sget v10, Lcom/appsflyer/internal/AFa1bSDK;->$$b:I

    xor-int/lit16 v11, v10, 0x342

    and-int/lit16 v10, v10, 0x342

    or-int/2addr v10, v11

    int-to-short v10, v10

    invoke-static {v6, v8, v10}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    filled-new-array {v3, v6}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2
    :try_end_7c
    .catchall {:try_start_7c .. :try_end_7c} :catchall_43

    :try_start_7d
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    aget-byte v3, v1, v24

    int-to-byte v3, v3

    aget-byte v6, v1, v41

    neg-int v6, v6

    int-to-byte v6, v6

    invoke-static {v3, v6, v7}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3
    :try_end_7d
    .catchall {:try_start_7d .. :try_end_7d} :catchall_44

    const/16 v37, 0x1a

    :try_start_7e
    aget-byte v6, v1, v37
    :try_end_7e
    .catchall {:try_start_7e .. :try_end_7e} :catchall_45

    int-to-byte v6, v6

    :try_start_7f
    aget-byte v7, v1, v61

    int-to-byte v7, v7

    const/16 v8, 0x387

    int-to-short v8, v8

    invoke-static {v6, v7, v8}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    filled-new-array/range {v62 .. v62}, [Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v3, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    const/4 v7, 0x0

    invoke-virtual {v3, v7, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_7f
    .catchall {:try_start_7f .. :try_end_7f} :catchall_44

    :try_start_80
    filled-new-array {v0, v9}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_80
    .catchall {:try_start_80 .. :try_end_80} :catchall_43

    :try_start_81
    aget-byte v2, v1, v59

    int-to-byte v2, v2

    const/16 v3, 0x12

    aget-byte v3, v1, v3

    neg-int v3, v3

    int-to-byte v3, v3

    const/16 v6, 0x38a

    int-to-short v6, v6

    invoke-static {v2, v3, v6}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const/16 v3, 0xf

    aget-byte v3, v1, v3

    int-to-byte v3, v3

    const/16 v6, 0x31d

    aget-byte v6, v1, v6

    int-to-byte v6, v6

    xor-int/lit16 v7, v6, 0x380

    and-int/lit16 v8, v6, 0x380

    or-int/2addr v7, v8

    int-to-short v7, v7

    invoke-static {v3, v6, v7}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    const/4 v8, 0x1

    invoke-virtual {v2, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v2, v9}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6
    :try_end_81
    .catch Ljava/lang/Exception; {:try_start_81 .. :try_end_81} :catch_13
    .catchall {:try_start_81 .. :try_end_81} :catchall_3e

    const/16 v33, 0x5

    :try_start_82
    aget-byte v7, v1, v33
    :try_end_82
    .catch Ljava/lang/Exception; {:try_start_82 .. :try_end_82} :catch_f
    .catchall {:try_start_82 .. :try_end_82} :catchall_3b

    int-to-byte v7, v7

    :try_start_83
    aget-byte v8, v1, v31

    neg-int v8, v8

    int-to-byte v8, v8

    const/16 v10, 0x3b0

    int-to-short v10, v10

    invoke-static {v7, v8, v10}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v7

    const/4 v8, 0x1

    invoke-virtual {v7, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_83
    .catch Ljava/lang/Exception; {:try_start_83 .. :try_end_83} :catch_13
    .catchall {:try_start_83 .. :try_end_83} :catchall_3e

    const/16 v33, 0x5

    :try_start_84
    aget-byte v8, v1, v33

    int-to-byte v8, v8

    const/16 v10, 0x3ba

    aget-byte v10, v1, v10

    int-to-byte v10, v10

    const/16 v11, 0x3c7

    int-to-short v11, v11

    invoke-static {v8, v10, v11}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v6

    const/4 v8, 0x1

    invoke-virtual {v6, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v7, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v6, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    new-instance v10, Ljava/util/ArrayList;

    check-cast v8, Ljava/util/List;

    invoke-direct {v10, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8
    :try_end_84
    .catch Ljava/lang/Exception; {:try_start_84 .. :try_end_84} :catch_f
    .catchall {:try_start_84 .. :try_end_84} :catchall_3b

    :try_start_85
    aget-byte v11, v1, v18

    int-to-byte v11, v11

    const/16 v12, 0xaa

    aget-byte v1, v1, v12

    int-to-byte v1, v1

    const/16 v12, 0x3df

    int-to-short v12, v12

    invoke-static {v11, v1, v12}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v1

    const/4 v11, 0x0

    invoke-virtual {v5, v1, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v8, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;
    :try_end_85
    .catchall {:try_start_85 .. :try_end_85} :catchall_3d

    :try_start_86
    invoke-static {v3}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v8

    invoke-static {v1, v8}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v1
    :try_end_86
    .catch Ljava/lang/Exception; {:try_start_86 .. :try_end_86} :catch_f
    .catchall {:try_start_86 .. :try_end_86} :catchall_3b

    const/4 v11, 0x0

    :goto_49
    if-ge v11, v8, :cond_3d

    :try_start_87
    invoke-static {v3, v11}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v12

    invoke-static {v1, v11, v12}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V
    :try_end_87
    .catch Ljava/lang/Exception; {:try_start_87 .. :try_end_87} :catch_f
    .catchall {:try_start_87 .. :try_end_87} :catchall_31

    xor-int/lit8 v12, v11, 0x1

    and-int/lit8 v11, v11, 0x1

    const/16 v26, 0x1

    shl-int/lit8 v11, v11, 0x1

    add-int/2addr v11, v12

    goto :goto_49

    :catchall_31
    move-exception v0

    move-object v2, v0

    move-object/from16 v3, v58

    move-object/from16 v1, v64

    const/16 v27, 0x11f

    goto/16 :goto_3d

    :catch_f
    move-exception v0

    move-object/from16 v3, v58

    const/16 v27, 0x11f

    :goto_4a
    const/16 v37, 0x1a

    goto/16 :goto_52

    :cond_3d
    :try_start_88
    invoke-virtual {v7, v2, v10}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v6, v2, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_88
    .catch Ljava/lang/Exception; {:try_start_88 .. :try_end_88} :catch_f
    .catchall {:try_start_88 .. :try_end_88} :catchall_3b

    sget v1, Lcom/appsflyer/internal/AFa1bSDK;->$10:I

    and-int/lit8 v2, v1, 0x1

    const/16 v26, 0x1

    or-int/lit8 v1, v1, 0x1

    add-int/2addr v2, v1

    rem-int/lit16 v1, v2, 0x80

    sput v1, Lcom/appsflyer/internal/AFa1bSDK;->$11:I

    const/16 v34, 0x2

    rem-int/lit8 v2, v2, 0x2

    if-nez v2, :cond_3e

    :try_start_89
    sget-object v1, Lcom/appsflyer/internal/AFa1bSDK;->getSdkVersion:Ljava/lang/Object;

    const/16 v2, 0x1a

    const/16 v17, 0x0

    div-int/lit8 v2, v2, 0x0
    :try_end_89
    .catchall {:try_start_89 .. :try_end_89} :catchall_31

    if-nez v1, :cond_3f

    goto :goto_4b

    :cond_3e
    :try_start_8a
    sget-object v1, Lcom/appsflyer/internal/AFa1bSDK;->getSdkVersion:Ljava/lang/Object;
    :try_end_8a
    .catchall {:try_start_8a .. :try_end_8a} :catchall_3b

    if-nez v1, :cond_3f

    :goto_4b
    :try_start_8b
    sput-object v0, Lcom/appsflyer/internal/AFa1bSDK;->getSdkVersion:Ljava/lang/Object;

    :cond_3f
    move-object v1, v0

    :goto_4c
    if-eqz v42, :cond_42

    sget-object v0, Lcom/appsflyer/internal/AFa1bSDK;->$$a:[B

    aget-byte v2, v0, v59

    int-to-byte v2, v2

    aget-byte v3, v0, v21

    neg-int v3, v3

    int-to-byte v3, v3

    const/16 v6, 0x28d

    int-to-short v6, v6

    invoke-static {v2, v3, v6}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const/16 v3, 0xdb

    aget-byte v3, v0, v3

    int-to-byte v3, v3

    const/16 v6, 0x7f

    aget-byte v6, v0, v6

    int-to-byte v6, v6

    const/16 v7, 0x3f2

    int-to-short v7, v7

    invoke-static {v3, v6, v7}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v3

    aget-byte v6, v0, v24

    int-to-byte v6, v6

    aget-byte v7, v0, v21

    neg-int v7, v7

    int-to-byte v7, v7

    sget v8, Lcom/appsflyer/internal/AFa1bSDK;->$$b:I

    or-int/lit16 v8, v8, 0x342

    int-to-short v8, v8

    invoke-static {v6, v7, v8}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    filled-new-array {v13, v6}, [Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v2, v3, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    const/4 v8, 0x1

    invoke-virtual {v3, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const-class v6, Lcom/appsflyer/internal/AFa1bSDK;
    :try_end_8b
    .catchall {:try_start_8b .. :try_end_8b} :catchall_31

    :try_start_8c
    aget-byte v7, v0, v18

    int-to-byte v7, v7

    aget-byte v8, v0, v23

    int-to-byte v8, v8

    const/16 v9, 0x2ba

    int-to-short v9, v9

    invoke-static {v7, v8, v9}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v7

    const/4 v11, 0x0

    invoke-virtual {v5, v7, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-virtual {v7, v6, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6
    :try_end_8c
    .catchall {:try_start_8c .. :try_end_8c} :catchall_32

    move-object/from16 v7, v43

    :try_start_8d
    filled-new-array {v7, v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v3, v1, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_40

    aget-byte v6, v0, v19

    int-to-byte v6, v6

    aget-byte v0, v0, v46

    int-to-byte v0, v0

    const/16 v14, 0x15c

    int-to-short v7, v14

    invoke-static {v6, v0, v7}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v0

    const/4 v7, 0x0

    invoke-virtual {v2, v0, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_40
    move-object v0, v3

    goto :goto_4d

    :catchall_32
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_41

    throw v1

    :cond_41
    throw v0
    :try_end_8d
    .catchall {:try_start_8d .. :try_end_8d} :catchall_31

    :cond_42
    move-object/from16 v7, v43

    :try_start_8e
    sget-object v0, Lcom/appsflyer/internal/AFa1bSDK;->$$a:[B

    aget-byte v2, v0, v24

    int-to-byte v2, v2

    aget-byte v3, v0, v21

    neg-int v3, v3

    int-to-byte v3, v3

    sget v6, Lcom/appsflyer/internal/AFa1bSDK;->$$b:I

    xor-int/lit16 v8, v6, 0x342

    and-int/lit16 v6, v6, 0x342

    or-int/2addr v6, v8

    int-to-short v6, v6

    invoke-static {v2, v3, v6}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const/16 v3, 0xdb

    aget-byte v3, v0, v3

    int-to-byte v3, v3

    const/16 v6, 0x7f

    aget-byte v0, v0, v6

    int-to-byte v0, v0

    const/16 v6, 0x3f2

    int-to-short v6, v6

    invoke-static {v3, v0, v6}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v13}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_8e
    .catchall {:try_start_8e .. :try_end_8e} :catchall_3b

    const/4 v8, 0x1

    :try_start_8f
    invoke-virtual {v0, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_8f
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_8f .. :try_end_8f} :catch_10
    .catchall {:try_start_8f .. :try_end_8f} :catchall_31

    goto :goto_4d

    :catch_10
    move-exception v0

    :try_start_90
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    throw v0
    :try_end_90
    .catch Ljava/lang/ClassNotFoundException; {:try_start_90 .. :try_end_90} :catch_11
    .catchall {:try_start_90 .. :try_end_90} :catchall_31

    :catch_11
    const/4 v0, 0x0

    :goto_4d
    if-eqz v0, :cond_47

    :try_start_91
    move-object v15, v0

    check-cast v15, Ljava/lang/Class;

    sget-object v0, Lcom/appsflyer/internal/AFa1bSDK;->$$a:[B

    aget-byte v2, v0, v19

    int-to-byte v2, v2

    aget-byte v3, v0, v18

    int-to-byte v3, v3

    xor-int/lit16 v6, v3, 0x3ea

    and-int/lit16 v7, v3, 0x3ea

    or-int/2addr v6, v7

    int-to-short v6, v6

    invoke-static {v2, v3, v6}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v43

    const-class v2, Ljava/lang/Object;

    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v2, v3}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v15, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    const/4 v8, 0x1

    invoke-virtual {v2, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    xor-int/lit8 v3, v42, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    filled-new-array {v1, v3}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sput-object v1, Lcom/appsflyer/internal/AFa1bSDK;->onPause:Ljava/lang/Object;

    const/16 v1, 0x3426

    new-array v1, v1, [B

    const/16 v2, 0x2d0

    aget-byte v2, v0, v2
    :try_end_91
    .catchall {:try_start_91 .. :try_end_91} :catchall_3b

    neg-int v2, v2

    int-to-byte v2, v2

    const/16 v37, 0x1a

    :try_start_92
    aget-byte v3, v0, v37

    int-to-byte v3, v3

    xor-int/lit16 v6, v3, 0x41a

    and-int/lit16 v7, v3, 0x41a

    or-int/2addr v6, v7

    int-to-short v6, v6

    invoke-static {v2, v3, v6}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v2

    const/4 v8, 0x1

    invoke-virtual {v2, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2
    :try_end_92
    .catchall {:try_start_92 .. :try_end_92} :catchall_3a

    move-object/from16 v3, v58

    :try_start_93
    invoke-virtual {v3, v2}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v2
    :try_end_93
    .catchall {:try_start_93 .. :try_end_93} :catchall_39

    :try_start_94
    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    aget-byte v6, v0, v24
    :try_end_94
    .catchall {:try_start_94 .. :try_end_94} :catchall_38

    int-to-byte v6, v6

    const/16 v27, 0x11f

    :try_start_95
    aget-byte v7, v0, v27

    int-to-byte v7, v7

    move/from16 v14, v66

    invoke-static {v6, v7, v14}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    aget-byte v7, v0, v24

    int-to-byte v7, v7

    aget-byte v8, v0, v41

    neg-int v8, v8

    int-to-byte v8, v8

    move/from16 v9, v65

    invoke-static {v7, v8, v9}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_95
    .catchall {:try_start_95 .. :try_end_95} :catchall_37

    :try_start_96
    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    aget-byte v6, v0, v24

    int-to-byte v6, v6

    aget-byte v7, v0, v40

    int-to-byte v7, v7

    or-int/lit16 v8, v7, 0x1c1

    int-to-short v8, v8

    invoke-static {v6, v7, v8}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    aget-byte v7, v0, v24

    int-to-byte v7, v7

    aget-byte v8, v0, v41

    neg-int v8, v8

    int-to-byte v8, v8

    invoke-static {v7, v8, v9}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_96
    .catchall {:try_start_96 .. :try_end_96} :catchall_36

    :try_start_97
    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v6

    aget-byte v7, v0, v24

    int-to-byte v7, v7

    aget-byte v8, v0, v40

    int-to-byte v8, v8

    xor-int/lit16 v9, v8, 0x1c1

    and-int/lit16 v10, v8, 0x1c1

    or-int/2addr v9, v10

    int-to-short v9, v9

    invoke-static {v7, v8, v9}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    aget-byte v8, v0, v16

    int-to-byte v8, v8

    const/16 v9, 0x7f

    aget-byte v9, v0, v9

    int-to-byte v9, v9

    sget v10, Lcom/appsflyer/internal/AFa1bSDK;->$$b:I

    xor-int/lit16 v11, v10, 0x1c0

    and-int/lit16 v10, v10, 0x1c0

    or-int/2addr v10, v11

    int-to-short v10, v10

    invoke-static {v8, v9, v10}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v8

    filled-new-array/range {v62 .. v62}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v7, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-virtual {v7, v2, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_97
    .catchall {:try_start_97 .. :try_end_97} :catchall_35

    :try_start_98
    aget-byte v6, v0, v24

    int-to-byte v6, v6

    aget-byte v7, v0, v40

    int-to-byte v7, v7

    xor-int/lit16 v8, v7, 0x1c1

    and-int/lit16 v9, v7, 0x1c1

    or-int/2addr v8, v9

    int-to-short v8, v8

    invoke-static {v6, v7, v8}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    aget-byte v7, v0, v19

    int-to-byte v7, v7

    aget-byte v0, v0, v46

    int-to-byte v0, v0

    const/16 v8, 0x15c

    int-to-short v9, v8

    invoke-static {v7, v0, v9}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v0

    const/4 v7, 0x0

    invoke-virtual {v6, v0, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v2, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_98
    .catchall {:try_start_98 .. :try_end_98} :catchall_34

    :try_start_99
    invoke-static/range {v60 .. v60}, Ljava/lang/Math;->abs(I)I

    move-result v0

    const/16 v2, 0x33fb

    move-object v6, v5

    move-object v5, v1

    move-object v1, v6

    move-object v6, v3

    move v10, v14

    move/from16 v11, v57

    move/from16 v12, v63

    move-object/from16 v7, v64

    const/16 v17, 0x0

    const/16 v28, 0x4

    const/16 v29, 0x6

    move v3, v0

    move v0, v2

    move-object/from16 v2, v62

    goto/16 :goto_2e

    :catchall_33
    move-exception v0

    :goto_4e
    move-object v2, v0

    move-object/from16 v1, v64

    goto/16 :goto_67

    :catchall_34
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_43

    throw v1

    :cond_43
    throw v0

    :catchall_35
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_44

    throw v1

    :cond_44
    throw v0

    :catchall_36
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_45

    throw v1

    :cond_45
    throw v0

    :catchall_37
    move-exception v0

    goto :goto_4f

    :catchall_38
    move-exception v0

    const/16 v27, 0x11f

    :goto_4f
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_46

    throw v1

    :cond_46
    throw v0

    :catchall_39
    move-exception v0

    :goto_50
    const/16 v27, 0x11f

    goto :goto_4e

    :catchall_3a
    move-exception v0

    move-object/from16 v3, v58

    goto :goto_50

    :catchall_3b
    move-exception v0

    move-object/from16 v3, v58

    const/16 v27, 0x11f

    :goto_51
    const/16 v37, 0x1a

    goto :goto_4e

    :cond_47
    move-object/from16 v3, v58

    const/16 v27, 0x11f

    const/16 v37, 0x1a

    const-class v0, Ljava/lang/Object;

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v0, v2}, [Ljava/lang/Class;

    move-result-object v0

    move-object/from16 v15, v67

    invoke-virtual {v15, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    const/4 v8, 0x1

    invoke-virtual {v0, v8}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    xor-int/lit8 v2, v42, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sput-object v0, Lcom/appsflyer/internal/AFa1bSDK;->onPause:Ljava/lang/Object;
    :try_end_99
    .catchall {:try_start_99 .. :try_end_99} :catchall_33

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    :try_start_9a
    invoke-virtual {v3}, Ljava/util/zip/ZipFile;->close()V
    :try_end_9a
    .catchall {:try_start_9a .. :try_end_9a} :catchall_3c

    move/from16 v3, v57

    const/4 v2, 0x7

    const/4 v6, 0x2

    const/4 v10, 0x1

    const/16 v17, 0x0

    const/16 v26, 0x1

    const/16 v35, 0x0

    goto/16 :goto_6c

    :catchall_3c
    move-exception v0

    move-object/from16 v1, v64

    goto/16 :goto_69

    :catchall_3d
    move-exception v0

    move-object/from16 v3, v58

    const/16 v27, 0x11f

    const/16 v37, 0x1a

    :try_start_9b
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_48

    throw v1

    :catch_12
    move-exception v0

    goto :goto_52

    :cond_48
    throw v0
    :try_end_9b
    .catch Ljava/lang/Exception; {:try_start_9b .. :try_end_9b} :catch_12
    .catchall {:try_start_9b .. :try_end_9b} :catchall_33

    :catchall_3e
    move-exception v0

    move-object/from16 v3, v58

    const/16 v27, 0x11f

    const/16 v33, 0x5

    goto :goto_51

    :catch_13
    move-exception v0

    move-object/from16 v3, v58

    const/16 v27, 0x11f

    const/16 v33, 0x5

    goto/16 :goto_4a

    :goto_52
    :try_start_9c
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/appsflyer/internal/AFa1bSDK;->$$a:[B

    aget-byte v6, v2, v39

    int-to-byte v6, v6

    aget-byte v7, v2, v46

    int-to-byte v7, v7

    xor-int/lit16 v8, v7, 0x3c2

    and-int/lit16 v10, v7, 0x3c2

    or-int/2addr v8, v10

    int-to-short v8, v8

    invoke-static {v6, v7, v8}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    aget-byte v6, v2, v44

    int-to-byte v6, v6

    aget-byte v7, v2, v45

    int-to-byte v7, v7

    const/16 v8, 0x123

    int-to-short v9, v8

    invoke-static {v6, v7, v9}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_9c
    .catchall {:try_start_9c .. :try_end_9c} :catchall_42

    const/4 v6, 0x2

    :try_start_9d
    new-array v7, v6, [Ljava/lang/Object;

    const/16 v26, 0x1

    aput-object v0, v7, v26

    const/16 v17, 0x0

    aput-object v1, v7, v17

    aget-byte v0, v2, v24

    int-to-byte v0, v0

    aget-byte v1, v2, v41

    neg-int v1, v1

    int-to-byte v1, v1

    invoke-static {v0, v1, v9}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_9d
    .catchall {:try_start_9d .. :try_end_9d} :catchall_40

    move-object/from16 v1, v64

    :try_start_9e
    filled-new-array {v13, v1}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_9e
    .catchall {:try_start_9e .. :try_end_9e} :catchall_3f

    :catchall_3f
    move-exception v0

    goto :goto_53

    :catchall_40
    move-exception v0

    move-object/from16 v1, v64

    :goto_53
    :try_start_9f
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_49

    throw v2

    :catchall_41
    move-exception v0

    goto/16 :goto_32

    :cond_49
    throw v0

    :catchall_42
    move-exception v0

    move-object/from16 v1, v64

    goto/16 :goto_32

    :catchall_43
    move-exception v0

    :goto_54
    move-object/from16 v3, v58

    move-object/from16 v1, v64

    :goto_55
    const/16 v27, 0x11f

    goto/16 :goto_31

    :catchall_44
    move-exception v0

    move-object/from16 v3, v58

    move-object/from16 v1, v64

    const/16 v27, 0x11f

    const/16 v33, 0x5

    const/16 v37, 0x1a

    goto :goto_56

    :catchall_45
    move-exception v0

    move-object/from16 v3, v58

    move-object/from16 v1, v64

    const/16 v27, 0x11f

    const/16 v33, 0x5

    :goto_56
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_4a

    throw v2

    :cond_4a
    throw v0

    :catchall_46
    move-exception v0

    move-object/from16 v62, v11

    goto :goto_54

    :catchall_47
    move-exception v0

    :goto_57
    move-object/from16 v3, v58

    goto :goto_55

    :catchall_48
    move-exception v0

    move/from16 v63, v12

    move-object/from16 v3, v58

    const/16 v27, 0x11f

    const/16 v33, 0x5

    goto/16 :goto_32

    :catchall_49
    move-exception v0

    :goto_58
    move/from16 v63, v12

    goto :goto_57

    :catchall_4a
    move-exception v0

    :goto_59
    move/from16 v63, v12

    move-object/from16 v3, v58

    const/16 v27, 0x11f

    const/16 v33, 0x5

    const/16 v37, 0x1a

    goto :goto_5a

    :catchall_4b
    move-exception v0

    move-object/from16 v62, v9

    goto :goto_59

    :goto_5a
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_4b

    throw v2

    :cond_4b
    throw v0

    :catchall_4c
    move-exception v0

    move-object/from16 v62, v9

    goto :goto_58

    :catchall_4d
    move-exception v0

    move-object/from16 v62, v9

    move/from16 v63, v12

    move-object/from16 v3, v58

    const/16 v27, 0x11f

    :goto_5b
    const/16 v33, 0x5

    const/16 v37, 0x1a

    goto :goto_5c

    :catchall_4e
    move-exception v0

    move-object/from16 v62, v9

    move/from16 v63, v12

    move-object/from16 v3, v58

    goto :goto_5b

    :goto_5c
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_4c

    throw v2

    :cond_4c
    throw v0

    :catchall_4f
    move-exception v0

    move-object v5, v1

    move-object/from16 v62, v2

    move-object v1, v7

    goto :goto_58

    :catchall_50
    move-exception v0

    move-object v5, v1

    move-object/from16 v62, v2

    move-object v1, v7

    move/from16 v63, v12

    move-object/from16 v3, v58

    :goto_5d
    const/16 v27, 0x11f

    :goto_5e
    const/16 v33, 0x5

    const/16 v37, 0x1a

    goto :goto_60

    :catchall_51
    move-exception v0

    move-object v5, v1

    move-object/from16 v62, v2

    move-object v3, v6

    move-object v1, v7

    :goto_5f
    move/from16 v63, v12

    goto :goto_5d

    :catchall_52
    move-exception v0

    move-object v5, v1

    move-object/from16 v62, v2

    move-object v3, v6

    move-object v1, v7

    move/from16 v57, v11

    goto :goto_5f

    :catchall_53
    move-exception v0

    move-object v5, v1

    move-object/from16 v62, v2

    move-object v3, v6

    move-object v1, v7

    move/from16 v57, v11

    move/from16 v63, v12

    const/16 v27, 0x11f

    const/16 v32, 0x3

    goto :goto_5e

    :goto_60
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_4d

    throw v2

    :cond_4d
    throw v0

    :catchall_54
    move-exception v0

    move-object v5, v1

    move-object/from16 v62, v2

    move-object v3, v6

    move-object v1, v7

    move/from16 v57, v11

    move/from16 v63, v12

    const/16 v27, 0x11f

    const/16 v32, 0x3

    goto/16 :goto_31

    :catchall_55
    move-exception v0

    move-object v5, v1

    move-object/from16 v62, v2

    move-object v3, v6

    move-object v1, v7

    move/from16 v57, v11

    move/from16 v63, v12

    const/16 v27, 0x11f

    const/16 v32, 0x3

    :goto_61
    const/16 v33, 0x5

    const/16 v37, 0x1a

    goto :goto_62

    :catchall_56
    move-exception v0

    move-object v5, v1

    move-object/from16 v62, v2

    move-object v3, v6

    move-object v1, v7

    move/from16 v32, v9

    move/from16 v57, v11

    move/from16 v63, v12

    const/16 v27, 0x11f

    goto :goto_61

    :goto_62
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_4e

    throw v2

    :cond_4e
    throw v0

    :catchall_57
    move-exception v0

    move-object v5, v1

    move-object/from16 v62, v2

    move-object v3, v6

    move-object v1, v7

    move/from16 v57, v11

    move/from16 v63, v12

    const/16 v27, 0x11f

    const/16 v32, 0x3

    const/16 v33, 0x5

    const/16 v37, 0x1a

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_4f

    throw v2

    :cond_4f
    throw v0

    :catchall_58
    move-exception v0

    move-object v5, v1

    move-object/from16 v62, v2

    move-object v3, v6

    move-object v1, v7

    move/from16 v57, v11

    move/from16 v63, v12

    :goto_63
    const/16 v27, 0x11f

    const/16 v32, 0x3

    const/16 v33, 0x5

    const/16 v37, 0x1a

    goto :goto_64

    :catchall_59
    move-exception v0

    move-object v5, v1

    move-object/from16 v62, v2

    move-object v3, v6

    move-object v1, v7

    move/from16 v57, v11

    move/from16 v63, v12

    move-object/from16 v54, v15

    goto :goto_63

    :goto_64
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_50

    throw v2

    :cond_50
    throw v0

    :catchall_5a
    move-exception v0

    move-object v5, v1

    move-object/from16 v62, v2

    move-object v3, v6

    move-object v1, v7

    move/from16 v57, v11

    move/from16 v63, v12

    move-object/from16 v54, v15

    const/16 v27, 0x11f

    const/16 v32, 0x3

    const/16 v33, 0x5

    const/16 v37, 0x1a

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_51

    throw v2

    :cond_51
    throw v0

    :catchall_5b
    move-exception v0

    move-object v5, v1

    move-object/from16 v62, v2

    move-object v3, v6

    move-object v1, v7

    move/from16 v57, v11

    move/from16 v63, v12

    move-object/from16 v54, v15

    const/16 v27, 0x11f

    :goto_65
    const/16 v32, 0x3

    const/16 v33, 0x5

    const/16 v37, 0x1a

    goto :goto_66

    :catchall_5c
    move-exception v0

    move-object v5, v1

    move-object/from16 v62, v2

    move-object v3, v6

    move-object v1, v7

    move/from16 v57, v11

    move/from16 v63, v12

    move-object/from16 v54, v15

    goto :goto_65

    :goto_66
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_52

    throw v2

    :cond_52
    throw v0
    :try_end_9f
    .catchall {:try_start_9f .. :try_end_9f} :catchall_41

    :catchall_5d
    move-exception v0

    move-object v5, v1

    move-object/from16 v62, v2

    move-object v3, v6

    move-object v1, v7

    move/from16 v57, v11

    move/from16 v63, v12

    move-object/from16 v54, v15

    goto/16 :goto_30

    :goto_67
    :try_start_a0
    invoke-virtual {v3}, Ljava/util/zip/ZipFile;->close()V
    :try_end_a0
    .catchall {:try_start_a0 .. :try_end_a0} :catchall_5e

    goto :goto_68

    :catchall_5e
    move-exception v0

    :try_start_a1
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_68
    throw v2

    :catchall_5f
    move-exception v0

    goto/16 :goto_69

    :catchall_60
    move-exception v0

    move-object v5, v1

    move-object/from16 v62, v2

    move-object v1, v7

    move/from16 v33, v8

    move/from16 v57, v11

    move/from16 v63, v12

    move-object/from16 v54, v15

    const/16 v27, 0x11f

    const/16 v32, 0x3

    goto/16 :goto_18

    :catchall_61
    move-exception v0

    move-object v5, v1

    move-object/from16 v62, v2

    move-object v1, v7

    move/from16 v57, v11

    move/from16 v63, v12

    move-object/from16 v54, v15

    const/16 v27, 0x11f

    const/16 v32, 0x3

    const/16 v33, 0x5

    const/16 v37, 0x1a

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_53

    throw v2

    :cond_53
    throw v0

    :catchall_62
    move-exception v0

    move-object v5, v1

    move-object/from16 v62, v2

    move-object v1, v7

    move/from16 v57, v11

    move/from16 v63, v12

    move-object/from16 v54, v15

    const/16 v27, 0x11f

    const/16 v32, 0x3

    const/16 v33, 0x5

    const/16 v37, 0x1a

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_54

    throw v2

    :cond_54
    throw v0

    :catchall_63
    move-exception v0

    move-object v5, v1

    move-object/from16 v62, v2

    move-object v1, v7

    move/from16 v57, v11

    move/from16 v63, v12

    move-object/from16 v54, v15

    const/16 v27, 0x11f

    const/16 v32, 0x3

    const/16 v33, 0x5

    goto :goto_69

    :catchall_64
    move-exception v0

    move-object/from16 v62, v2

    move-object/from16 v47, v5

    move-object/from16 v48, v6

    move-object/from16 v49, v8

    move-object/from16 v50, v9

    move/from16 v53, v10

    move/from16 v57, v11

    move/from16 v63, v12

    move-object/from16 v54, v15

    const/16 v32, 0x3

    const/16 v33, 0x5

    const/16 v37, 0x1a

    move-object v5, v1

    move-object v1, v7

    goto :goto_69

    :cond_55
    move-object/from16 v62, v2

    move-object/from16 v47, v5

    move-object/from16 v48, v6

    move-object/from16 v49, v8

    move-object/from16 v50, v9

    move/from16 v53, v10

    move/from16 v57, v11

    move/from16 v63, v12

    move-object/from16 v54, v15

    const/16 v32, 0x3

    const/16 v33, 0x5

    const/16 v37, 0x1a

    move-object v5, v1

    move-object v1, v7

    aget-boolean v0, v47, v57

    aget-object v0, v48, v57

    aget-boolean v0, v54, v57

    const/16 v35, 0x0

    throw v35
    :try_end_a1
    .catchall {:try_start_a1 .. :try_end_a1} :catchall_5f

    :goto_69
    :try_start_a2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v3, v57

    mul-int/lit16 v11, v3, -0x2a3

    neg-int v6, v11

    neg-int v6, v6

    const/16 v7, 0x2a5

    or-int v8, v7, v6

    const/16 v26, 0x1

    shl-int/lit8 v8, v8, 0x1

    xor-int/2addr v6, v7

    sub-int/2addr v8, v6

    xor-int/lit8 v6, v2, 0x1

    and-int/lit8 v7, v2, 0x1

    or-int/2addr v6, v7

    not-int v7, v3

    or-int/2addr v6, v7

    mul-int/lit16 v6, v6, -0x2a4

    neg-int v6, v6

    neg-int v6, v6

    and-int v9, v8, v6

    or-int/2addr v6, v8

    add-int/2addr v9, v6

    xor-int/lit8 v6, v7, 0x1

    const/16 v26, 0x1

    and-int/lit8 v7, v7, 0x1

    or-int/2addr v6, v7

    not-int v6, v6

    not-int v7, v2

    or-int/lit8 v8, v7, 0x1

    not-int v8, v8

    xor-int v10, v6, v8

    and-int/2addr v6, v8

    or-int/2addr v6, v10

    mul-int/lit16 v6, v6, 0x2a4

    neg-int v6, v6

    neg-int v6, v6

    not-int v6, v6

    sub-int/2addr v9, v6

    const/16 v26, 0x1

    add-int/lit8 v9, v9, -0x1

    not-int v6, v3

    const/4 v8, -0x2

    xor-int v10, v8, v6

    and-int/2addr v8, v6

    or-int/2addr v8, v10

    not-int v8, v8

    xor-int v10, v6, v7

    and-int/2addr v6, v7

    or-int/2addr v6, v10

    not-int v6, v6

    xor-int v7, v8, v6

    and-int/2addr v6, v8

    or-int/2addr v6, v7

    xor-int/lit8 v7, v3, 0x1

    and-int/lit8 v8, v3, 0x1

    or-int/2addr v7, v8

    xor-int v8, v7, v2

    and-int/2addr v2, v7

    or-int/2addr v2, v8

    not-int v2, v2

    xor-int v7, v6, v2

    and-int/2addr v2, v6

    or-int/2addr v2, v7

    mul-int/lit16 v2, v2, 0x2a4

    or-int v6, v9, v2

    const/16 v26, 0x1

    shl-int/lit8 v6, v6, 0x1

    xor-int/2addr v2, v9

    sub-int/2addr v6, v2

    const/4 v2, 0x7

    :goto_6a
    if-ge v6, v2, :cond_57

    aget-boolean v7, v49, v6
    :try_end_a2
    .catch Ljava/lang/Exception; {:try_start_a2 .. :try_end_a2} :catch_14

    if-eqz v7, :cond_56

    sget v6, Lcom/appsflyer/internal/AFa1bSDK;->$11:I

    add-int/lit8 v6, v6, 0x2d

    rem-int/lit16 v7, v6, 0x80

    sput v7, Lcom/appsflyer/internal/AFa1bSDK;->$10:I

    const/16 v34, 0x2

    rem-int/lit8 v6, v6, 0x2

    if-nez v6, :cond_57

    const/16 v35, 0x0

    :try_start_a3
    sput-object v35, Lcom/appsflyer/internal/AFa1bSDK;->onPause:Ljava/lang/Object;

    sput-object v35, Lcom/appsflyer/internal/AFa1bSDK;->getSdkVersion:Ljava/lang/Object;

    const/4 v6, 0x2

    const/16 v17, 0x0

    const/16 v26, 0x1

    goto/16 :goto_6b

    :cond_56
    const/16 v35, 0x0

    xor-int/lit8 v7, v6, 0x1

    and-int/lit8 v6, v6, 0x1

    const/16 v26, 0x1

    shl-int/lit8 v6, v6, 0x1

    add-int/2addr v6, v7

    goto :goto_6a

    :cond_57
    sget-object v2, Lcom/appsflyer/internal/AFa1bSDK;->$$a:[B

    aget-byte v3, v2, v39

    int-to-byte v3, v3

    aget-byte v4, v2, v40

    int-to-byte v4, v4

    const/16 v5, 0x44a

    int-to-short v5, v5

    invoke-static {v3, v4, v5}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v3
    :try_end_a3
    .catch Ljava/lang/Exception; {:try_start_a3 .. :try_end_a3} :catch_14

    const/4 v6, 0x2

    :try_start_a4
    new-array v4, v6, [Ljava/lang/Object;

    const/16 v26, 0x1

    aput-object v0, v4, v26

    const/16 v17, 0x0

    aput-object v3, v4, v17

    aget-byte v0, v2, v24

    int-to-byte v0, v0

    aget-byte v2, v2, v41

    neg-int v2, v2

    int-to-byte v2, v2

    const/16 v8, 0x123

    int-to-short v3, v8

    invoke-static {v0, v2, v3}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    filled-new-array {v13, v1}, [Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_a4
    .catchall {:try_start_a4 .. :try_end_a4} :catchall_65

    :catchall_65
    move-exception v0

    :try_start_a5
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_58

    throw v1

    :cond_58
    throw v0

    :cond_59
    move-object/from16 v62, v2

    move/from16 v38, v3

    move-object/from16 v47, v5

    move-object/from16 v48, v6

    move/from16 v37, v7

    move-object/from16 v49, v8

    move-object/from16 v50, v9

    move/from16 v53, v10

    move v3, v11

    move/from16 v63, v12

    move-object/from16 v54, v15

    move/from16 v6, v34

    const/4 v2, 0x7

    const/16 v32, 0x3

    const/16 v33, 0x5

    const/16 v35, 0x0

    move-object v5, v1

    :goto_6b
    move/from16 v10, v53

    :goto_6c
    and-int/lit8 v0, v3, 0x1

    or-int/lit8 v1, v3, 0x1

    add-int v11, v0, v1

    move-object v1, v5

    move/from16 v34, v6

    move/from16 v7, v37

    move/from16 v3, v38

    move-object/from16 v5, v47

    move-object/from16 v6, v48

    move-object/from16 v8, v49

    move-object/from16 v9, v50

    move-object/from16 v15, v54

    move-object/from16 v2, v62

    move/from16 v12, v63

    const/16 v28, 0x4

    const/16 v29, 0x6

    goto/16 :goto_13

    :cond_5a
    :goto_6d
    return-void

    :catchall_66
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_5b

    throw v1

    :cond_5b
    throw v0

    :catchall_67
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_5c

    throw v1

    :cond_5c
    throw v0

    :catchall_68
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_5d

    throw v1

    :cond_5d
    throw v0
    :try_end_a5
    .catch Ljava/lang/Exception; {:try_start_a5 .. :try_end_a5} :catch_14

    :catch_14
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catchall_69
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_5e

    throw v1

    :cond_5e
    throw v0

    :array_0
    .array-data 1
        0x0t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
    .end array-data

    :array_1
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x0t
        0x1t
        0x1t
        0x1t
    .end array-data

    :array_2
    .array-data 1
        -0x69t
        0x45t
        0x64t
        -0x24t
        -0x65t
        0x3ct
        -0x78t
        0x18t
        -0x51t
        -0x37t
        -0x7dt
        0x30t
        0x6t
        0x24t
        -0x32t
        0x4ct
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static AFKeystoreWrapper(Ljava/lang/Object;)I
    .locals 6

    sget v0, Lcom/appsflyer/internal/AFa1bSDK;->$11:I

    sget-object v1, Lcom/appsflyer/internal/AFa1bSDK;->onPause:Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x41

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFa1bSDK;->$10:I

    add-int/lit8 v0, v0, 0x39

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFa1bSDK;->$11:I

    :try_start_0
    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    sget-object v0, Lcom/appsflyer/internal/AFa1bSDK;->$$a:[B

    const/16 v2, 0xc8

    aget-byte v2, v0, v2

    int-to-byte v2, v2

    const/16 v3, 0xd

    aget-byte v3, v0, v3

    int-to-byte v3, v3

    xor-int/lit16 v4, v3, 0x222

    and-int/lit16 v5, v3, 0x222

    or-int/2addr v4, v5

    int-to-short v4, v4

    invoke-static {v2, v3, v4}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/appsflyer/internal/AFa1bSDK;->getSdkVersion:Ljava/lang/Object;

    check-cast v3, Ljava/lang/ClassLoader;

    const/4 v4, 0x1

    invoke-static {v2, v4, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2

    const/16 v3, 0x8

    aget-byte v3, v0, v3

    int-to-byte v3, v3

    const/16 v4, 0xef

    aget-byte v0, v0, v4

    int-to-byte v0, v0

    xor-int/lit16 v4, v0, 0x44c

    and-int/lit16 v5, v0, 0x44c

    or-int/2addr v4, v5

    int-to-short v4, v4

    invoke-static {v3, v0, v4}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v0

    const-class v3, Ljava/lang/Object;

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget v0, Lcom/appsflyer/internal/AFa1bSDK;->$10:I

    add-int/lit8 v0, v0, 0xb

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFa1bSDK;->$11:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_0

    const/16 v0, 0x52

    div-int/lit8 v0, v0, 0x0

    :cond_0
    return p0

    :catchall_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_1

    throw v0

    :cond_1
    throw p0
.end method

.method public static AFLogger(CII)Ljava/lang/Object;
    .locals 4

    sget v0, Lcom/appsflyer/internal/AFa1bSDK;->$10:I

    and-int/lit8 v1, v0, 0x29

    or-int/lit8 v0, v0, 0x29

    add-int/2addr v1, v0

    rem-int/lit16 v0, v1, 0x80

    sput v0, Lcom/appsflyer/internal/AFa1bSDK;->$11:I

    const/4 v2, 0x2

    rem-int/2addr v1, v2

    if-eqz v1, :cond_1

    sget-object v1, Lcom/appsflyer/internal/AFa1bSDK;->onPause:Ljava/lang/Object;

    and-int/lit8 v3, v0, 0x63

    or-int/lit8 v0, v0, 0x63

    add-int/2addr v3, v0

    rem-int/lit16 v3, v3, 0x80

    sput v3, Lcom/appsflyer/internal/AFa1bSDK;->$10:I

    const/4 v0, 0x3

    :try_start_0
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v0, v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v0, p2

    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p0

    const/4 p1, 0x0

    aput-object p0, v0, p1

    sget-object p0, Lcom/appsflyer/internal/AFa1bSDK;->$$a:[B

    const/16 p1, 0xc8

    aget-byte p1, p0, p1

    int-to-byte p1, p1

    const/16 v2, 0xd

    aget-byte v2, p0, v2

    int-to-byte v2, v2

    or-int/lit16 v3, v2, 0x222

    int-to-short v3, v3

    invoke-static {p1, v2, v3}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object p1

    sget-object v2, Lcom/appsflyer/internal/AFa1bSDK;->getSdkVersion:Ljava/lang/Object;

    check-cast v2, Ljava/lang/ClassLoader;

    invoke-static {p1, p2, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p1

    const/4 p2, 0x7

    aget-byte p2, p0, p2

    int-to-byte p2, p2

    const/16 v2, 0xaa

    aget-byte p0, p0, v2

    int-to-byte p0, p0

    const/16 v2, 0x460

    int-to-short v2, v2

    invoke-static {p2, p0, v2}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object p0

    sget-object p2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {p2, v2, v2}, [Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p1, p0, p2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0

    invoke-virtual {p0, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_0

    throw p1

    :cond_0
    throw p0

    :cond_1
    const/4 p0, 0x0

    throw p0
.end method

.method public static d(I)I
    .locals 7

    sget v0, Lcom/appsflyer/internal/AFa1bSDK;->$11:I

    or-int/lit8 v1, v0, 0x3d

    const/4 v2, 0x1

    shl-int/2addr v1, v2

    xor-int/lit8 v0, v0, 0x3d

    sub-int/2addr v1, v0

    rem-int/lit16 v0, v1, 0x80

    sput v0, Lcom/appsflyer/internal/AFa1bSDK;->$10:I

    rem-int/lit8 v1, v1, 0x2

    if-nez v1, :cond_1

    sget-object v1, Lcom/appsflyer/internal/AFa1bSDK;->onPause:Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x9

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFa1bSDK;->$11:I

    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    sget-object v0, Lcom/appsflyer/internal/AFa1bSDK;->$$a:[B

    const/16 v3, 0xc8

    aget-byte v3, v0, v3

    int-to-byte v3, v3

    const/16 v4, 0xd

    aget-byte v4, v0, v4

    int-to-byte v4, v4

    xor-int/lit16 v5, v4, 0x222

    and-int/lit16 v6, v4, 0x222

    or-int/2addr v5, v6

    int-to-short v5, v5

    invoke-static {v3, v4, v5}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lcom/appsflyer/internal/AFa1bSDK;->getSdkVersion:Ljava/lang/Object;

    check-cast v4, Ljava/lang/ClassLoader;

    invoke-static {v3, v2, v4}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2

    const/16 v3, 0xbc

    aget-byte v3, v0, v3

    neg-int v3, v3

    int-to-byte v3, v3

    const/16 v4, 0x31d

    aget-byte v0, v0, v4

    int-to-byte v0, v0

    const/16 v4, 0x252

    int-to-short v4, v4

    invoke-static {v3, v0, v4}, Lcom/appsflyer/internal/AFa1bSDK;->$$c(BIS)Ljava/lang/String;

    move-result-object v0

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget v0, Lcom/appsflyer/internal/AFa1bSDK;->$10:I

    add-int/lit8 v0, v0, 0x5

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFa1bSDK;->$11:I

    return p0

    :catchall_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    throw v0

    :cond_0
    throw p0

    :cond_1
    const/4 p0, 0x0

    throw p0
.end method

.method public static init$0()V
    .locals 4

    sget v0, Lcom/appsflyer/internal/AFa1bSDK;->$10:I

    add-int/lit8 v0, v0, 0x55

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFa1bSDK;->$11:I

    const/16 v0, 0x481

    new-array v1, v0, [B

    const-string v2, "Sf\u009e\u0001\u00f2\t\u00f1\u0002\u0005\u00045\u00c6\u00f4\u0010\u00f0\u0007\u00fe\u0005\u00efD\u00ea\u00d3\u0002\u00fc\u00fc\u000c\u0000\u00f3\u0001=\u00cd\u00f0\u00ff\u00fc\u000c\u00f9\u00f2\u0013\u00f2B\u00c5\u00fa\u00f9\u000e\u00f2\u0003\u000c\u00f4<\u00ed\u00fa\u00e30\u00b7%\u000e\u00f8\u00f7\u00ff\u00f3\u0001>\u00cc\u00f0\u00ff\u00fc\u000c\u00f9\u00f2\u0013\u00f2\u00f2\t\u00f1\u0002\u0005\u00045\u00cc\u00f0\u00ffA\u00ec\u00dd\u00ee\n\u00f2\u000c\u00f4\u00fa$\u00eb\u00f5\u000c\u0003\u00fc\u00ed\u0002\u00ff\u000c\u00f6\u00f92\u00d0\u00ff\u0003\u0002\u0005\u0001\u00ec\n\u00f9\u0000\u00f2\t\u00f1\u0002\u0005\u00045\u00cc\u00f0\u00ffA\u00ec\u00d0\u00ff(\u00da\u00fc\u000c\u0000\u00f4\u00f8\u0001\u00f0*\u00da\u0004\u00f4\n\u0007\u00f4*\u00d0\u00ff\u0003\u0002\u0005\u0001\u00ec\n\u00f9\u0000\u0001\u00f0-\u00dc\u00fc\u0006\u00f1.\u00da\u00f6\u0001\u00f00\u00d3\n\u00fe!\u00e1\u00fd\u00fa\u0002 \u00da\u00f6\u0001\u00f00\u00e1\u00fd\u00fa\u0002 \u00da\u00f6\u00ca\u0002\u00ec\u00121\u00ca\u0002\u00ec\u00121\u0008\u00ea\u00142\u00c4\u00f9@\u00e7\u00dc\u00fc\u0006\u0008\u00ea\u00142\u00c4\u00f9@\u00b9\u0006\u00fc\u000b\u00fa\u00f6\u0008\u00ea\u00142\u00c1\n\u00f2\u00068\u00da\u00d9\u0005\u00fe\u000e\u00f7\u0001\u00f0#\u00dd\u0002\u00fe\n\u00f2\u00fd\u00fa\u00f3\n\u00fe\u0005\u00fb\u0001\u00fd\u00fa\u0002\u00f2\t\u00f1\u0002\u0005\u00045\u00be\u00fbD\u00eb\u00cc\u000b\u00fc\u0007?\u00cd\u0010\u00f2\u00fe\t\u00f9\u0000\u000e\u00f8\u00eb\u0015\u00fa\u00f9\u0001\u00f2\u0016\u00e4\u0008\u00f4\u000e\u0014\u00f9\u0015\u00f7\u0008\u00ea\u00142\u00c4\u00f9@\u00e4\u00f9\t\u00cc\u0014\u00fd\u00f4\u00fb\n\u00f9\u0000\u00ed\u0002\u00ff\u000c\u00f6\u00f9\u001f\u00ea\u00fb\u0007\u0017\u00e3\u00fc\u00ff\u0002\u00f5\u0008\u00ea\u00142\u00c4\u00f9@\u00e7\u00dc\u00fc\u0006\u0015\u00d9\u0000\u0003\u00fa\u0000 \u00de\u0001\u000c\u0003\u00f3\u00f6\u00fc\u00fb\r\u0014\u00fc\u0012\u00f7\u00cd\u00ed\u00ff\r\u00f0\u0000C\u00cb\u00f3\u0001=\u00cd\u00f0\u00ff\u00fc\u000c\u00f9\u00f2\u0013\u00f2B\u00c5\u00fa\u00f9\u000e\u00f2\u0003\u000c\u00f4<\u00cd\'\u0001\u00d2.\u00cf\u0003\u00fc*\u0004\u00fb\u0001\u00d0/\u00ff\u0001\u00d13\u0001\u00f0!\u00ec\u00f1\u0003\u00f9\u0002\u000e\u00fd\u0008\u00ea\u00142\u00bf\u0008\u00f0E\u00d8\u0002\u0005\u0001\u00f0#\u00ee\u00ec\u000b\u0008\u00ea\u00142\u00c4\u00f9@\u00eb\u00cc\u000e\u00ff\u0000\u00f2\u000c\u0000\u001a\u00da\u00fd\u00fa\u0000 \u00de\u0001\u000c\u0003\u00f3\u0008\u00ea\u00142\u00c4\u00f9@\u00e4\u00da\u00fd\u00fa\u0000 \u00de\u0001\u000c\u0003\u00f3\u0008\u00ea\u00142\u00c4\u00f9@\u00e9\u00e2\u00ec\u0012\u0017\u00da\u00fd\u00fa\u0000 \u00de\u0001\u000c\u0003\u00f3\u000c\u0003\u00fc\u001d\u00d0\u0008\u00ff\u00f2\u0008\u00ea\u00142\u00c4\u00f9@\u00eb\u00c8\u0004\u000e#\u00ce\u00ff\u0010\u00e7/\u00da\u00fd\u00fa\u0000 \u00de\u0001\u000c\u0003\u00f3\u00f3\u0001>\u00cc\u00f0\u00ff\u00fc\u000c\u00f9\u00f2\u0013\u00f2C\u00c4\u00fa\u00f9\u000e\u00f2\u0003\u000c\u00f4=\u00ec\u00fa\u00db8\u00cf\r\u000e\u00f8\u00f3\u0001>\u00cc\u00f0\u00ff\u00fc\u000c\u00f9\u00f2\u0013\u00f2C\u00c4\u00fa\u00f9\u000e\u00f2\u0003\u000c\u00f4=\u00ec\u00fa\u00e30\u00b7%\u000e\u00f8\u00f7\u00ff\u00fa\u00f9\u00dc\u0007\u00ff\u0001\u00f2\u0007\u0001\u00f8\u000c\u0003\u00fc\r\u00f0!\u00ec\u0003\u00fc\u0014\u00e0\u0001\u00f2\u0014\u00fb\u0013\u00f7\u0004\u0008\u00f4\u000e\u0001\u00f0-\u0001\u0008\u00ea\u00142\u00c4\u00f9@\u00e7\u00dc\u00fc\u0006 \u00de\u00f1\u000f\u00f0\u0008\u00f8\u00fb\u0004\u00fc\u00f9\n\n\u0002\u00f4\u00f5\u000c\u00fd<\u00ba\u00f9\u0005\u00fe\u000e\u00f7>\u00e9\u00de\u00ec1\u00dc\u00fc\u0006\u00fc\r\u00fc\u001f\u00de\u00ec\u0001\u00f02\u00de\u00ee\u0003\u0002\u00f6\u0000\u000e\u0014\u00ee\u00ec\u000b\u00fe\u00f8\u0006\u00f0\u000e\u0001\u00f00\u00d6\n\u00ed\u00ff&\u00dc\r\u00fc\u00fe\u00f2\u0008\u00ea\u00142\u00b8\u0000\n\u00fc=\u00b3\u0010\u00f8A\u00d3\u00f0\u00f8&\u00da\u00fd\u00fa\u0000 \u00de\u0001\u000c\u0003\u00f3\u0001\u00f0%\u00e8\u00ec\u0003.\u00d6\u00f9\u0001\u00f8\u0008\u00ea\u00142\u00b8\u0000\n\u00fc=\u00b3\u0010\u00f8A\u00d3\u00f0\u00f8*\u00d6\u00f9\u0001\u00f8\u0001\u00f0 \u00e9\u00ee\u0014\u0008\u00ea\u00142\u00c4\u00f9@\u00eb\u00c8\u0004\u000e#\u00ce\u00ff\u0010\u00e7)\u00d9\u0000\u0003\u00fa\u0000 \u00de\u0001\u000c\u0003\u00f3\u0004,\u00c8\u0004\u000e#\u00ce\u00ff\u0010\u00e7\u0008\u00ea\u00142\u00c4\u00f9@\u00ea\u00d6\u00fc\u00fb\r\u0003\u00fe\u00f5\u0006\u0002\u00f4\u00f5\u000c\u00fd<\u00ba\u00f9\u0005\u00fe\u000e\u00f7>\u00e4\u00da \u00e7\u00f7\u00fd\u00fc\u00f84\u00de\u00ec4\u00d6\n\u00ed\u00ff&\u00dc\r\u00fc\u00fe\u00f2\u0008\u00ea\u00142\u00bf\u0004\u00f9@\u00eb\u00c8\u0004\u000e\"\u00cc\u000e\u00ff\u0000\u00f2\u0008\u00ea\u00142\u00c1\n\u00f2\u00068\u00ea\u00d6\n\u00ed\u00ff&\u00dc\r\u00fc\u00fe\u00f2\u0004\u0010\u00f0\u0002\u00f4\u00f5\u000c\u00fd<\u00ba\u00f9\u0005\u00fe\u000e\u00f7>\u00eb\u00e0\u00ed\r \u00de\u00ec4\u00d6\n\u00ed\u00ff&\u00dc\r\u00fc\u00fe\u00f2\u000e\u00ec\u000b\u001b\u00e2\u00f5\u00fe\u000c\u00ec\n\u00f2\u0010\u0018\u00e2\u0006\u00ef\u0010\u00ee\u00f84\u00da\u00f6\u000c\u0001\u00ee\u0004\u00fc\u0008\u0003\u00f1\u000c\u00ec\n\u00f2\u0010\u0018\u00e2\u0006\u00ef\u0010\u00ee\u00f8(\u00ee\u00ec\u000b\"\u00d8\u0006\u00f7\u0007\u00f6\u00f9\u0000\u0001\u00f00\u00d3\u0001\u00fc\u0000\u0000\u0008\u00f6\u00f9\u001f\u00da\u0008\n\u0014\u00f7\u0017\u00f7\u00fc\r\u00fc \u00d6\n\u00ed\u00ff\u00f3\u0001=\u00cd\u00f0\u00ff\u00fc\u000c\u00f9\u00f2\u0013\u00f2B\u00c5\u00fa\u00f9\u000e\u00f2\u0003\u000c\u00f4<\u00ed\u00fa\u00e4/\u00ce\u000e\u000e\u00f8&\u00ae\u00cd\u00ed\u00ff\r\u00f0\u0000C\u00cb\u00f3\u0001=\u00cd\u00f0\u00ff\u00fc\u000c\u00f9\u00f2\u0013\u00f2B\u00c5\u00fa\u00f9\u000e\u00f2\u0003\u000c\u00f4<\u00f7\u00fe\u00d4.\u00ce+\u0007\u00ca-\u0007\u00f8\u00d2\u00ff.\u00d0/\u00d14\u0014\u00f8\u0016\u00f7\u00b9\u00feN\u00b9\u0004\u00f4\u00ff\t\u0000\u00fd\u00f7\u00f7R\u00b3\u0006\u00fe\u00f1J\u0006\u00fb\u000c\u00fd\u00fd\u00f5\u00fe\u000e\u00f2.\u00d6\u0002\u0003\u00f6\u00f9\u000c\u00fd\u00fd\u00f5\u00fe\u000e\u00f2.\u00d6\u0002\u0003\u00f6\u00f9"

    const-string v3, "ISO-8859-1"

    invoke-virtual {v2, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sput-object v1, Lcom/appsflyer/internal/AFa1bSDK;->$$a:[B

    const/16 v0, 0x31

    sput v0, Lcom/appsflyer/internal/AFa1bSDK;->$$b:I

    sget v0, Lcom/appsflyer/internal/AFa1bSDK;->$11:I

    add-int/lit8 v0, v0, 0x1b

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFa1bSDK;->$10:I

    return-void
.end method

.method private static registerClient(II)V
    .locals 0

    sget p0, Lcom/appsflyer/internal/AFa1bSDK;->$10:I

    add-int/lit8 p0, p0, 0x2d

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFa1bSDK;->$11:I

    return-void
.end method
