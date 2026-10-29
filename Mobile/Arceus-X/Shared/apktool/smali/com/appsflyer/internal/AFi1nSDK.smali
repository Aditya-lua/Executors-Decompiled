.class public Lcom/appsflyer/internal/AFi1nSDK;
.super Ljava/lang/Object;


# static fields
.field private static final $$a:[B = null

.field private static final $$b:I = 0x0

.field private static $10:I = 0x0

.field private static $11:I = 0x1

.field private static $12:I = 0x0

.field private static $13:I = 0x1

.field private static enableTCFDataCollection:Ljava/lang/Object;

.field private static getInstance:[B

.field public static final getLevel:Ljava/util/Map;

.field public static final getSdkVersion:Ljava/util/Map;

.field private static onPause:[B

.field private static setAndroidIdData:I

.field private static setDebugLog:I

.field private static setImeiData:I

.field private static setOaidData:J

.field private static setUserFirstName:I

.field private static stop:Ljava/lang/Object;

.field private static updateServerUninstallToken:J


# direct methods
.method private static $$c(SII)Ljava/lang/String;
    .locals 6

    rsub-int/lit8 p1, p1, 0x31

    rsub-int p0, p0, 0x46c

    sget-object v0, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    rsub-int/lit8 p2, p2, 0x77

    new-array v1, p1, [B

    const/4 v2, 0x0

    if-nez v0, :cond_0

    sget v3, Lcom/appsflyer/internal/AFi1nSDK;->$12:I

    add-int/lit8 v3, v3, 0x7

    rem-int/lit16 v3, v3, 0x80

    sput v3, Lcom/appsflyer/internal/AFi1nSDK;->$13:I

    move v3, p1

    move v4, v2

    goto :goto_1

    :cond_0
    move v3, v2

    :goto_0
    add-int/lit8 v4, v3, 0x1

    int-to-byte v5, p2

    aput-byte v5, v1, v3

    if-ne v4, p1, :cond_1

    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v1, v2}, Ljava/lang/String;-><init>([BI)V

    return-object p0

    :cond_1
    aget-byte v3, v0, p0

    sget v5, Lcom/appsflyer/internal/AFi1nSDK;->$12:I

    add-int/lit8 v5, v5, 0x6b

    rem-int/lit16 v5, v5, 0x80

    sput v5, Lcom/appsflyer/internal/AFi1nSDK;->$13:I

    :goto_1
    add-int/lit8 p0, p0, 0x1

    add-int/2addr p2, v3

    add-int/lit8 p2, p2, -0x3

    move v3, v4

    goto :goto_0
.end method

.method static constructor <clinit>()V
    .locals 74

    const-class v1, Lcom/appsflyer/internal/AFi1nSDK;

    const-class v2, Ljava/lang/Throwable;

    const-class v3, Ljava/lang/Class;

    const-class v4, [B

    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {}, Lcom/appsflyer/internal/AFi1nSDK;->init$0()V

    const/16 v0, 0xa5

    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const/16 v7, 0x468

    int-to-short v7, v7

    sget-object v8, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    const/16 v9, 0xcf

    aget-byte v10, v8, v9

    int-to-byte v10, v10

    const/16 v11, 0x54

    aget-byte v12, v8, v11

    int-to-byte v12, v12

    invoke-static {v7, v10, v12}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    const/16 v10, 0x453

    int-to-short v10, v10

    const/16 v12, 0x2bc

    aget-byte v13, v8, v12

    int-to-byte v13, v13

    const/4 v14, 0x4

    aget-byte v15, v8, v14

    int-to-byte v15, v15

    invoke-static {v10, v13, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v10

    sget-object v13, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v13}, [Ljava/lang/Class;

    move-result-object v13

    invoke-virtual {v7, v10, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    const/4 v10, 0x0

    invoke-virtual {v7, v10, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_73

    not-int v7, v0

    const v13, -0x2976fca3

    or-int/2addr v13, v7

    not-int v13, v13

    const v15, 0x589cf2e0

    xor-int v16, v15, v0

    and-int/2addr v15, v0

    or-int v15, v16, v15

    not-int v15, v15

    xor-int v16, v13, v15

    and-int/2addr v13, v15

    or-int v13, v16, v13

    mul-int/lit16 v13, v13, 0xd2

    const v15, -0x1f941ced

    or-int v16, v15, v13

    move/from16 v17, v5

    const/4 v5, 0x1

    shl-int/lit8 v16, v16, 0x1

    xor-int/2addr v13, v15

    sub-int v13, v16, v13

    const v15, 0x589cf2e0

    xor-int v16, v15, v7

    and-int/2addr v7, v15

    or-int v7, v16, v7

    const v15, 0x2976fca2

    or-int/2addr v7, v15

    not-int v7, v7

    const v15, -0x814f0a1

    xor-int v16, v15, v0

    and-int/2addr v0, v15

    or-int v0, v16, v0

    not-int v0, v0

    or-int/2addr v0, v7

    mul-int/lit16 v7, v0, 0xd2

    move v15, v11

    move/from16 v16, v12

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    long-to-int v11, v11

    const v12, 0x20328

    mul-int/2addr v0, v12

    mul-int/lit16 v12, v13, 0x274

    neg-int v12, v12

    neg-int v12, v12

    and-int v18, v0, v12

    or-int/2addr v0, v12

    add-int v18, v18, v0

    xor-int v0, v13, v11

    and-int v12, v13, v11

    or-int/2addr v0, v12

    not-int v12, v7

    xor-int v19, v0, v12

    and-int/2addr v0, v12

    or-int v0, v19, v0

    mul-int/lit16 v0, v0, -0x273

    xor-int v12, v18, v0

    and-int v0, v18, v0

    shl-int/2addr v0, v5

    add-int/2addr v12, v0

    not-int v0, v13

    xor-int v18, v0, v11

    and-int/2addr v0, v11

    or-int v0, v18, v0

    not-int v0, v0

    xor-int v18, v7, v0

    and-int/2addr v0, v7

    or-int v0, v18, v0

    mul-int/lit16 v0, v0, -0x273

    add-int/2addr v12, v0

    not-int v0, v11

    xor-int v18, v0, v13

    and-int/2addr v0, v13

    or-int v0, v18, v0

    not-int v0, v0

    xor-int v13, v7, v11

    and-int/2addr v7, v11

    or-int/2addr v7, v13

    not-int v7, v7

    xor-int v11, v0, v7

    and-int/2addr v0, v7

    or-int/2addr v0, v11

    mul-int/lit16 v0, v0, 0x273

    neg-int v0, v0

    neg-int v0, v0

    xor-int v7, v12, v0

    and-int/2addr v0, v12

    shl-int/2addr v0, v5

    add-int/2addr v7, v0

    if-nez v7, :cond_0

    goto/16 :goto_6f

    :cond_0
    const v0, -0x3e6d836b

    sput v0, Lcom/appsflyer/internal/AFi1nSDK;->setDebugLog:I

    const v0, 0x94aeb9

    sput v0, Lcom/appsflyer/internal/AFi1nSDK;->setUserFirstName:I

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/appsflyer/internal/AFi1nSDK;->getLevel:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/appsflyer/internal/AFi1nSDK;->getSdkVersion:Ljava/util/Map;

    const/16 v0, 0x44f

    int-to-short v0, v0

    :try_start_1
    aget-byte v7, v8, v14

    int-to-byte v7, v7

    const/16 v11, 0x56

    aget-byte v12, v8, v11

    int-to-byte v12, v12

    invoke-static {v0, v7, v12}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v7

    sget-object v0, Lcom/appsflyer/internal/AFi1nSDK;->enableTCFDataCollection:Ljava/lang/Object;

    if-nez v0, :cond_1

    const/16 v0, 0x42f

    int-to-short v0, v0

    const/16 v12, 0x15e

    aget-byte v12, v8, v12

    int-to-byte v12, v12

    aget-byte v13, v8, v11

    int-to-byte v13, v13

    invoke-static {v0, v12, v13}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_17

    goto :goto_0

    :cond_1
    move-object v0, v10

    :goto_0
    const/16 v12, 0x423

    int-to-short v12, v12

    const/16 v13, 0x5d

    :try_start_2
    aget-byte v13, v8, v13
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    int-to-byte v13, v13

    move/from16 v18, v9

    :try_start_3
    aget-byte v9, v8, v15

    int-to-byte v9, v9

    invoke-static {v12, v13, v9}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    const/16 v12, 0x40a

    int-to-short v12, v12

    const/16 v13, 0x147

    aget-byte v13, v8, v13

    int-to-byte v13, v13

    aget-byte v8, v8, v11

    int-to-byte v8, v8

    invoke-static {v12, v13, v8}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9, v8, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    invoke-virtual {v8, v10, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    if-eqz v8, :cond_2

    :catch_0
    move/from16 v19, v15

    goto :goto_1

    :catch_1
    move/from16 v18, v9

    :catch_2
    move-object v8, v10

    :cond_2
    const/16 v9, 0x3f9

    int-to-short v9, v9

    :try_start_4
    sget-object v12, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v13, v12, v18
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    int-to-byte v13, v13

    move/from16 v19, v15

    :try_start_5
    aget-byte v15, v12, v19

    int-to-byte v15, v15

    invoke-static {v9, v13, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    const/16 v13, 0x3e4

    int-to-short v13, v13

    aget-byte v15, v12, v17

    int-to-byte v15, v15

    aget-byte v12, v12, v14

    int-to-byte v12, v12

    invoke-static {v13, v15, v12}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9, v12, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    invoke-virtual {v9, v10, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    :catch_3
    :goto_1
    const/4 v12, 0x2

    if-eqz v8, :cond_4

    sget v13, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    and-int/lit8 v15, v13, 0x23

    or-int/lit8 v13, v13, 0x23

    add-int/2addr v15, v13

    rem-int/lit16 v13, v15, 0x80

    sput v13, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    rem-int/2addr v15, v12

    if-eqz v15, :cond_3

    :try_start_6
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v13

    const/16 v15, 0x1093

    int-to-short v15, v15

    sget-object v20, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    const/16 v21, 0x31

    const/16 v22, 0x35

    :try_start_7
    aget-byte v9, v20, v21
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4

    int-to-byte v9, v9

    move/from16 v21, v14

    :try_start_8
    aget-byte v14, v20, v21

    int-to-byte v14, v14

    invoke-static {v15, v9, v14}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v13, v9, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    :goto_2
    invoke-virtual {v9, v8, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    goto :goto_4

    :catch_4
    move/from16 v21, v14

    goto :goto_3

    :cond_3
    move/from16 v21, v14

    const/16 v22, 0x35

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    const/16 v13, 0x3d0

    int-to-short v13, v13

    sget-object v14, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v15, v14, v22

    int-to-byte v15, v15

    aget-byte v14, v14, v21

    int-to-byte v14, v14

    invoke-static {v13, v15, v14}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v9, v13, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_5

    goto :goto_2

    :catch_5
    :goto_3
    move-object v9, v10

    goto :goto_4

    :catch_6
    :cond_4
    move/from16 v21, v14

    const/16 v22, 0x35

    goto :goto_3

    :goto_4
    if-eqz v8, :cond_5

    :try_start_9
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v13

    const/16 v14, 0x3c6

    int-to-short v14, v14

    sget-object v15, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_8

    const/16 v20, 0x265

    move/from16 v23, v5

    :try_start_a
    aget-byte v5, v15, v20

    int-to-byte v5, v5

    aget-byte v15, v15, v21

    int-to-byte v15, v15

    invoke-static {v14, v5, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v13, v5, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5, v8, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_7

    goto :goto_6

    :catch_7
    :goto_5
    move-object v5, v10

    goto :goto_6

    :catch_8
    :cond_5
    move/from16 v23, v5

    goto :goto_5

    :goto_6
    if-eqz v8, :cond_6

    :try_start_b
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v13

    const/16 v14, 0x3b8

    int-to-short v14, v14

    sget-object v15, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_a

    move/from16 v20, v11

    :try_start_c
    aget-byte v11, v15, v22

    int-to-byte v11, v11

    aget-byte v15, v15, v21

    int-to-byte v15, v15

    invoke-static {v14, v11, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v13, v11, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v11

    invoke-virtual {v11, v8, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_9

    goto :goto_8

    :catch_9
    :goto_7
    move-object v8, v10

    goto :goto_8

    :catch_a
    :cond_6
    move/from16 v20, v11

    goto :goto_7

    :goto_8
    const/16 v11, 0x3a4

    const-class v13, Ljava/lang/String;

    if-eqz v9, :cond_7

    :goto_9
    const/16 v24, 0x55

    const/16 v26, 0x5e

    goto :goto_a

    :cond_7
    if-nez v0, :cond_8

    move-object v9, v10

    goto :goto_9

    :cond_8
    :try_start_d
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v24, 0x55

    const/16 v14, 0x3ae

    int-to-short v14, v14

    sget-object v25, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    const/16 v26, 0x5e

    aget-byte v15, v25, v22

    int-to-byte v15, v15

    const/16 v27, 0x292

    aget-byte v12, v25, v27

    int-to-byte v12, v12

    invoke-static {v14, v15, v12}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_17

    :try_start_e
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    int-to-short v9, v11

    aget-byte v12, v25, v24

    int-to-byte v12, v12

    aget-byte v14, v25, v26

    int-to-byte v14, v14

    invoke-static {v9, v12, v14}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    filled-new-array {v13}, [Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v9, v12}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v9

    invoke-virtual {v9, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_72

    :goto_a
    const/16 v12, 0x235

    if-eqz v8, :cond_9

    sget v0, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    or-int/lit8 v14, v0, 0x31

    shl-int/lit8 v14, v14, 0x1

    xor-int/lit8 v0, v0, 0x31

    sub-int/2addr v14, v0

    rem-int/lit16 v14, v14, 0x80

    sput v14, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    move/from16 v25, v12

    goto :goto_b

    :cond_9
    const/16 v0, 0x399

    int-to-short v0, v0

    :try_start_f
    sget-object v8, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v14, v8, v12

    neg-int v14, v14

    int-to-byte v14, v14

    aget-byte v15, v8, v26

    int-to-byte v15, v15

    invoke-static {v0, v14, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v0
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_17

    :try_start_10
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const/16 v14, 0x38c

    int-to-short v14, v14

    const/16 v15, 0xad

    aget-byte v15, v8, v15

    int-to-byte v15, v15

    move/from16 v25, v12

    aget-byte v12, v8, v26

    int-to-byte v12, v12

    invoke-static {v14, v15, v12}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v12

    const/16 v14, 0x37d

    int-to-short v14, v14

    aget-byte v15, v8, v22

    int-to-byte v15, v15

    aget-byte v11, v8, v21

    int-to-byte v11, v11

    invoke-static {v14, v15, v11}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v11

    filled-new-array {v13}, [Ljava/lang/Class;

    move-result-object v14

    invoke-virtual {v12, v11, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v11

    invoke-virtual {v11, v10, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_71

    :try_start_11
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const/16 v11, 0x3a4

    int-to-short v12, v11

    aget-byte v11, v8, v24

    int-to-byte v11, v11

    aget-byte v8, v8, v26

    int-to-byte v8, v8

    invoke-static {v12, v11, v8}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    filled-new-array {v13}, [Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v8, v11}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v8

    invoke-virtual {v8, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_70

    :goto_b
    if-nez v5, :cond_a

    if-eqz v9, :cond_a

    const/16 v0, 0x373

    int-to-short v0, v0

    :try_start_12
    sget-object v5, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    const/16 v11, 0x18e

    aget-byte v11, v5, v11

    neg-int v11, v11

    int-to-byte v11, v11

    aget-byte v12, v5, v20

    int-to-byte v12, v12

    invoke-static {v0, v11, v12}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v0
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_17

    const/4 v11, 0x2

    :try_start_13
    new-array v12, v11, [Ljava/lang/Object;

    aput-object v0, v12, v23

    aput-object v9, v12, v17

    const/16 v11, 0x3a4

    int-to-short v0, v11

    aget-byte v11, v5, v24

    int-to-byte v11, v11

    aget-byte v14, v5, v26

    int-to-byte v14, v14

    invoke-static {v0, v11, v14}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v11

    aget-byte v14, v5, v24

    int-to-byte v14, v14

    aget-byte v5, v5, v26

    int-to-byte v5, v5

    invoke-static {v0, v14, v5}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    filled-new-array {v0, v13}, [Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    :cond_a
    const/16 v11, 0x3a4

    goto :goto_c

    :catchall_0
    move-exception v0

    :try_start_14
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_b

    throw v1

    :cond_b
    throw v0

    :goto_c
    int-to-short v11, v11

    sget-object v0, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v12, v0, v24

    int-to-byte v12, v12

    aget-byte v14, v0, v26

    int-to-byte v14, v14

    invoke-static {v11, v12, v14}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v12

    const/4 v14, 0x7

    invoke-static {v12, v14}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, [Ljava/lang/Object;

    aput-object v10, v12, v17

    aput-object v5, v12, v23

    const/16 v28, 0x2

    aput-object v9, v12, v28

    const/4 v15, 0x3

    aput-object v8, v12, v15

    aput-object v5, v12, v21

    const/4 v5, 0x5

    aput-object v9, v12, v5

    const/4 v9, 0x6

    aput-object v8, v12, v9

    const/4 v8, 0x7

    new-array v8, v8, [Z

    fill-array-data v8, :array_0

    move/from16 v27, v9

    const/4 v9, 0x7

    new-array v9, v9, [Z

    fill-array-data v9, :array_1

    move/from16 v29, v15

    new-array v15, v14, [Z

    aput-boolean v17, v15, v17

    aput-boolean v17, v15, v23

    const/16 v28, 0x2

    aput-boolean v23, v15, v28

    aput-boolean v23, v15, v29

    aput-boolean v17, v15, v21

    aput-boolean v23, v15, v5

    aput-boolean v23, v15, v27
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_17

    move/from16 v30, v14

    const/16 v14, 0x36a

    int-to-short v14, v14

    const/16 v31, 0x1ac

    const/16 v32, 0x1e8

    :try_start_15
    aget-byte v5, v0, v32

    int-to-byte v5, v5

    aget-byte v10, v0, v19

    int-to-byte v10, v10

    invoke-static {v14, v5, v10}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    const/16 v10, 0x353

    int-to-short v10, v10

    aget-byte v14, v0, v31

    int-to-byte v14, v14

    const/16 v35, 0x15e

    aget-byte v0, v0, v35

    int-to-byte v0, v0

    invoke-static {v10, v14, v0}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v0
    :try_end_15
    .catch Ljava/lang/ClassNotFoundException; {:try_start_15 .. :try_end_15} :catch_b
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_17

    const/16 v5, 0x22

    if-lt v0, v5, :cond_c

    move/from16 v5, v23

    goto :goto_d

    :cond_c
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move/from16 v5, v17

    :goto_d
    const/16 v10, 0x1d

    if-ne v0, v10, :cond_d

    goto :goto_e

    :cond_d
    const/16 v10, 0x1a

    if-lt v0, v10, :cond_e

    move/from16 v10, v23

    goto :goto_f

    :cond_e
    :goto_e
    move/from16 v10, v17

    :goto_f
    :try_start_16
    aput-boolean v10, v15, v17

    const/16 v10, 0x15

    if-lt v0, v10, :cond_f

    move/from16 v10, v23

    goto :goto_10

    :cond_f
    move/from16 v10, v17

    :goto_10
    aput-boolean v10, v15, v23

    const/16 v10, 0x15

    if-lt v0, v10, :cond_10

    move/from16 v0, v23

    goto :goto_11

    :cond_10
    move/from16 v0, v17

    :goto_11
    aput-boolean v0, v15, v21
    :try_end_16
    .catch Ljava/lang/ClassNotFoundException; {:try_start_16 .. :try_end_16} :catch_c
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_17

    goto :goto_12

    :catch_b
    move/from16 v5, v17

    :catch_c
    :goto_12
    move/from16 v10, v17

    move v14, v10

    :goto_13
    if-nez v10, :cond_5d

    const/16 v0, 0x9

    if-ge v14, v0, :cond_5d

    :try_start_17
    aget-boolean v0, v15, v14
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_17

    if-eqz v0, :cond_5c

    move/from16 v35, v5

    const/16 v36, 0x69

    const/16 v37, 0x2e4

    const/16 v38, 0x122

    :try_start_18
    aget-boolean v39, v8, v14

    aget-object v0, v12, v14

    aget-boolean v40, v9, v14
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_6e

    const/16 v41, 0x2cf

    const/16 v42, 0x196

    if-eqz v39, :cond_15

    if-eqz v0, :cond_12

    sget v43, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    xor-int/lit8 v44, v43, 0x23

    and-int/lit8 v43, v43, 0x23

    shl-int/lit8 v43, v43, 0x1

    add-int v5, v44, v43

    rem-int/lit16 v5, v5, 0x80

    sput v5, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    :try_start_19
    sget-object v5, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    move-object/from16 v43, v5

    aget-byte v5, v43, v24
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_4

    int-to-byte v5, v5

    move-object/from16 v44, v7

    :try_start_1a
    aget-byte v7, v43, v26

    int-to-byte v7, v7

    invoke-static {v11, v5, v7}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_3

    const/16 v7, 0x34d

    int-to-short v7, v7

    const/16 v45, 0xea

    move-object/from16 v46, v8

    :try_start_1b
    aget-byte v8, v43, v45
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_2

    int-to-byte v8, v8

    move-object/from16 v45, v9

    :try_start_1c
    aget-byte v9, v43, v20

    int-to-byte v9, v9

    invoke-static {v7, v8, v9}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    invoke-virtual {v5, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5, v0, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_1

    if-eqz v5, :cond_13

    :goto_14
    move/from16 v43, v10

    goto/16 :goto_1c

    :catchall_1
    move-exception v0

    goto :goto_17

    :catchall_2
    move-exception v0

    :goto_15
    move-object/from16 v45, v9

    goto :goto_17

    :catchall_3
    move-exception v0

    :goto_16
    move-object/from16 v46, v8

    goto :goto_15

    :catchall_4
    move-exception v0

    move-object/from16 v44, v7

    goto :goto_16

    :goto_17
    :try_start_1d
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_11

    throw v5

    :catchall_5
    move-exception v0

    move-object v5, v1

    move-object v1, v2

    move-object/from16 v60, v4

    :goto_18
    move/from16 v43, v10

    move/from16 v57, v11

    move-object/from16 v55, v12

    move/from16 v40, v14

    move-object/from16 v59, v15

    const/16 v33, 0x5

    move-object v10, v3

    goto/16 :goto_6b

    :cond_11
    throw v0
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_5

    :cond_12
    move-object/from16 v44, v7

    move-object/from16 v46, v8

    move-object/from16 v45, v9

    :cond_13
    :try_start_1e
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v7, 0x346

    int-to-short v7, v7

    sget-object v8, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v9, v8, v16

    int-to-byte v9, v9

    move-object/from16 v39, v8

    aget-byte v8, v39, v36

    int-to-byte v8, v8

    invoke-static {v7, v9, v8}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v7, 0x342

    int-to-short v0, v7

    aget-byte v7, v39, v42

    int-to-byte v7, v7

    aget-byte v8, v39, v41
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_8

    move/from16 v43, v10

    :try_start_1f
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    long-to-int v9, v9

    mul-int/lit16 v10, v8, 0x364

    const/16 v40, -0x364

    add-int v40, v40, v10

    not-int v10, v9

    not-int v10, v10

    move/from16 v41, v10

    not-int v10, v8

    move/from16 v42, v10

    not-int v10, v9

    xor-int v47, v42, v10

    and-int v48, v42, v10

    move/from16 v49, v10

    or-int v10, v47, v48

    not-int v10, v10

    or-int v10, v41, v10

    mul-int/lit16 v10, v10, -0x363

    not-int v10, v10

    sub-int v40, v40, v10

    add-int/lit8 v40, v40, -0x1

    not-int v10, v8

    move/from16 v41, v8

    not-int v8, v10

    move/from16 v47, v8

    not-int v8, v9

    xor-int v48, v47, v8

    and-int v8, v47, v8

    or-int v8, v48, v8

    xor-int v47, v42, v9

    and-int v48, v42, v9

    move/from16 v50, v8

    or-int v8, v47, v48

    not-int v8, v8

    xor-int v47, v50, v8

    and-int v8, v50, v8

    or-int v8, v47, v8

    mul-int/lit16 v8, v8, -0x6c6

    xor-int v47, v40, v8

    and-int v8, v40, v8

    shl-int/lit8 v8, v8, 0x1

    add-int v47, v47, v8

    xor-int v8, v42, v49

    and-int v40, v42, v49

    or-int v8, v8, v40

    not-int v8, v8

    xor-int v40, v41, v9

    and-int v41, v41, v9

    move/from16 v42, v8

    or-int v8, v40, v41

    not-int v8, v8

    or-int v8, v42, v8

    xor-int/lit8 v40, v10, -0x1

    or-int v10, v40, v10

    xor-int v40, v10, v9

    and-int/2addr v9, v10

    or-int v9, v40, v9

    not-int v9, v9

    xor-int v10, v8, v9

    and-int/2addr v8, v9

    or-int/2addr v8, v10

    mul-int/lit16 v8, v8, 0x363

    neg-int v8, v8

    neg-int v8, v8

    xor-int v9, v47, v8

    and-int v8, v47, v8

    shl-int/lit8 v8, v8, 0x1

    add-int/2addr v9, v8

    int-to-byte v8, v9

    invoke-static {v0, v7, v8}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_7

    :try_start_20
    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    aget-byte v7, v39, v38

    int-to-byte v7, v7

    aget-byte v8, v39, v26

    int-to-byte v8, v8

    invoke-static {v0, v7, v8}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    filled-new-array {v13}, [Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_6

    :catchall_6
    move-exception v0

    :try_start_21
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_14

    throw v5

    :catchall_7
    move-exception v0

    :goto_19
    move-object v5, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v60, v4

    move/from16 v57, v11

    move-object/from16 v55, v12

    :goto_1a
    move/from16 v40, v14

    move-object/from16 v59, v15

    :goto_1b
    const/16 v33, 0x5

    goto/16 :goto_6b

    :cond_14
    throw v0
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_7

    :catchall_8
    move-exception v0

    move/from16 v43, v10

    goto :goto_19

    :cond_15
    move-object/from16 v44, v7

    move-object/from16 v46, v8

    move-object/from16 v45, v9

    goto/16 :goto_14

    :goto_1c
    if-eqz v39, :cond_29

    :try_start_22
    new-instance v8, Ljava/util/Random;

    invoke-direct {v8}, Ljava/util/Random;-><init>()V
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_14

    sget v9, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    and-int/lit8 v10, v9, 0x33

    or-int/lit8 v9, v9, 0x33

    add-int/2addr v10, v9

    rem-int/lit16 v10, v10, 0x80

    sput v10, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    const/16 v9, 0x38c

    int-to-short v9, v9

    :try_start_23
    sget-object v10, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    const/16 v47, 0xad

    const/16 v48, 0x3b

    aget-byte v5, v10, v47

    int-to-byte v5, v5

    aget-byte v7, v10, v26

    int-to-byte v7, v7

    invoke-static {v9, v5, v7}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    const/16 v7, 0x330

    int-to-short v7, v7

    const/16 v9, 0x1e9

    aget-byte v9, v10, v9

    int-to-byte v9, v9

    aget-byte v10, v10, v20

    int-to-byte v10, v10

    invoke-static {v7, v9, v10}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v7

    const/4 v9, 0x0

    invoke-virtual {v5, v7, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5, v9, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v9
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_15

    const-wide/32 v49, -0x52c064e4

    xor-long v9, v9, v49

    :try_start_24
    invoke-virtual {v8, v9, v10}, Ljava/util/Random;->setSeed(J)V

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_1d
    if-nez v5, :cond_27

    if-nez v7, :cond_16

    move-object/from16 v49, v5

    move-object/from16 v50, v7

    move/from16 v5, v27

    goto :goto_1e

    :cond_16
    if-nez v9, :cond_17

    move-object/from16 v49, v5

    move-object/from16 v50, v7

    const/4 v5, 0x5

    goto :goto_1e

    :cond_17
    if-nez v10, :cond_18

    move-object/from16 v49, v5

    move-object/from16 v50, v7

    move/from16 v5, v21

    goto :goto_1e

    :cond_18
    move-object/from16 v49, v5

    move-object/from16 v50, v7

    move/from16 v5, v29

    :goto_1e
    new-instance v7, Ljava/lang/StringBuilder;

    and-int/lit8 v51, v5, 0x1

    or-int/lit8 v52, v5, 0x1

    move-object/from16 v53, v9

    add-int v9, v51, v52

    invoke-direct {v7, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v9, 0x2e

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_14

    move/from16 v9, v17

    :goto_1f
    if-ge v9, v5, :cond_1b

    if-eqz v40, :cond_1a

    move/from16 v51, v5

    const/16 v5, 0x1a

    :try_start_25
    invoke-virtual {v8, v5}, Ljava/util/Random;->nextInt(I)I

    move-result v5

    invoke-virtual {v8}, Ljava/util/Random;->nextBoolean()Z

    move-result v52

    if-eqz v52, :cond_19

    move/from16 v54, v9

    move-object/from16 v52, v10

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_9

    long-to-int v9, v9

    mul-int/lit16 v10, v5, 0x1e3

    move-object/from16 v55, v12

    xor-int/lit16 v12, v10, 0x3d72

    and-int/lit16 v10, v10, 0x3d72

    shl-int/lit8 v10, v10, 0x1

    add-int/2addr v12, v10

    not-int v10, v5

    xor-int/lit8 v56, v10, -0x42

    and-int/lit8 v57, v10, -0x42

    move/from16 v58, v10

    or-int v10, v56, v57

    not-int v10, v10

    move/from16 v56, v10

    not-int v10, v9

    xor-int v57, v58, v10

    and-int v10, v58, v10

    or-int v10, v57, v10

    not-int v10, v10

    xor-int v57, v56, v10

    and-int v10, v56, v10

    or-int v10, v57, v10

    mul-int/lit16 v10, v10, -0xf1

    not-int v10, v10

    sub-int/2addr v12, v10

    add-int/lit8 v12, v12, -0x1

    xor-int/lit8 v10, v5, 0x41

    and-int/lit8 v56, v5, 0x41

    or-int v10, v10, v56

    mul-int/lit16 v10, v10, -0x1e2

    neg-int v10, v10

    neg-int v10, v10

    xor-int v56, v12, v10

    and-int/2addr v10, v12

    shl-int/lit8 v10, v10, 0x1

    add-int v56, v56, v10

    const/16 v10, -0x42

    or-int/2addr v10, v5

    not-int v10, v10

    not-int v5, v5

    not-int v9, v9

    or-int/2addr v5, v9

    xor-int/lit8 v9, v5, 0x41

    and-int/lit8 v5, v5, 0x41

    or-int/2addr v5, v9

    not-int v5, v5

    xor-int v9, v10, v5

    and-int/2addr v5, v10

    or-int/2addr v5, v9

    mul-int/lit16 v5, v5, 0xf1

    neg-int v5, v5

    neg-int v5, v5

    not-int v5, v5

    sub-int v56, v56, v5

    add-int/lit8 v56, v56, -0x1

    :goto_20
    move/from16 v5, v56

    goto :goto_22

    :catchall_9
    move-exception v0

    move-object/from16 v55, v12

    :goto_21
    move-object v5, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v60, v4

    move/from16 v57, v11

    goto/16 :goto_1a

    :cond_19
    move/from16 v54, v9

    move-object/from16 v52, v10

    move-object/from16 v55, v12

    or-int/lit8 v9, v5, 0x60

    shl-int/lit8 v9, v9, 0x1

    xor-int/lit8 v5, v5, 0x60

    sub-int v56, v9, v5

    goto :goto_20

    :goto_22
    int-to-char v5, v5

    :try_start_26
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_23

    :catchall_a
    move-exception v0

    goto :goto_21

    :cond_1a
    move/from16 v51, v5

    move/from16 v54, v9

    move-object/from16 v52, v10

    move-object/from16 v55, v12

    const/16 v5, 0xc

    invoke-virtual {v8, v5}, Ljava/util/Random;->nextInt(I)I

    move-result v5

    xor-int/lit16 v9, v5, 0x2000

    and-int/lit16 v5, v5, 0x2000

    shl-int/lit8 v5, v5, 0x1

    add-int/2addr v9, v5

    int-to-char v5, v9

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_a

    :goto_23
    add-int/lit8 v9, v54, 0x1

    move/from16 v5, v51

    move-object/from16 v10, v52

    move-object/from16 v12, v55

    goto/16 :goto_1f

    :cond_1b
    move-object/from16 v52, v10

    move-object/from16 v55, v12

    :try_start_27
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_12

    if-nez v50, :cond_1e

    sget v7, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    xor-int/lit8 v9, v7, 0x3b

    and-int/lit8 v7, v7, 0x3b

    shl-int/lit8 v7, v7, 0x1

    add-int/2addr v9, v7

    rem-int/lit16 v7, v9, 0x80

    sput v7, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    const/4 v7, 0x2

    rem-int/2addr v9, v7

    if-eqz v9, :cond_1d

    :try_start_28
    new-array v9, v7, [Ljava/lang/Object;

    aput-object v5, v9, v23

    aput-object v0, v9, v17

    sget-object v5, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v7, v5, v24

    int-to-byte v7, v7

    aget-byte v10, v5, v26

    int-to-byte v10, v10

    invoke-static {v11, v7, v10}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    aget-byte v10, v5, v24

    int-to-byte v10, v10

    aget-byte v5, v5, v26

    int-to-byte v5, v5

    invoke-static {v11, v10, v5}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    filled-new-array {v5, v13}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v5

    invoke-virtual {v5, v9}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_b

    move-object v7, v5

    move-object/from16 v51, v8

    move-object/from16 v5, v49

    :goto_24
    move-object/from16 v10, v52

    :goto_25
    move-object/from16 v9, v53

    goto/16 :goto_26

    :catchall_b
    move-exception v0

    :try_start_29
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_1c

    throw v5

    :cond_1c
    throw v0

    :cond_1d
    const/16 v34, 0x0

    throw v34
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_a

    :cond_1e
    if-nez v53, :cond_20

    const/4 v7, 0x2

    :try_start_2a
    new-array v9, v7, [Ljava/lang/Object;

    aput-object v5, v9, v23

    aput-object v0, v9, v17

    sget-object v5, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v7, v5, v24

    int-to-byte v7, v7

    aget-byte v10, v5, v26

    int-to-byte v10, v10

    invoke-static {v11, v7, v10}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    aget-byte v10, v5, v24

    int-to-byte v10, v10

    aget-byte v5, v5, v26

    int-to-byte v5, v5

    invoke-static {v11, v10, v5}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    filled-new-array {v5, v13}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v5

    invoke-virtual {v5, v9}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_c

    move-object v9, v5

    move-object/from16 v51, v8

    move-object/from16 v5, v49

    move-object/from16 v7, v50

    move-object/from16 v10, v52

    goto/16 :goto_26

    :catchall_c
    move-exception v0

    :try_start_2b
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_1f

    throw v5

    :cond_1f
    throw v0
    :try_end_2b
    .catchall {:try_start_2b .. :try_end_2b} :catchall_a

    :cond_20
    if-nez v52, :cond_22

    const/4 v7, 0x2

    :try_start_2c
    new-array v9, v7, [Ljava/lang/Object;

    aput-object v5, v9, v23

    aput-object v0, v9, v17

    sget-object v5, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v7, v5, v24

    int-to-byte v7, v7

    aget-byte v10, v5, v26

    int-to-byte v10, v10

    invoke-static {v11, v7, v10}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    aget-byte v10, v5, v24

    int-to-byte v10, v10

    aget-byte v5, v5, v26

    int-to-byte v5, v5

    invoke-static {v11, v10, v5}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    filled-new-array {v5, v13}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v5

    invoke-virtual {v5, v9}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_2c
    .catchall {:try_start_2c .. :try_end_2c} :catchall_d

    move-object v10, v5

    move-object/from16 v51, v8

    move-object/from16 v5, v49

    move-object/from16 v7, v50

    goto/16 :goto_25

    :catchall_d
    move-exception v0

    :try_start_2d
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_21

    throw v5

    :cond_21
    throw v0
    :try_end_2d
    .catchall {:try_start_2d .. :try_end_2d} :catchall_a

    :cond_22
    const/4 v7, 0x2

    :try_start_2e
    new-array v9, v7, [Ljava/lang/Object;

    aput-object v5, v9, v23

    aput-object v0, v9, v17

    sget-object v5, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v7, v5, v24

    int-to-byte v7, v7

    aget-byte v10, v5, v26

    int-to-byte v10, v10

    invoke-static {v11, v7, v10}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    aget-byte v10, v5, v24

    int-to-byte v10, v10

    aget-byte v12, v5, v26

    int-to-byte v12, v12

    invoke-static {v11, v10, v12}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    filled-new-array {v10, v13}, [Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v7, v10}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v7

    invoke-virtual {v7, v9}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7
    :try_end_2e
    .catchall {:try_start_2e .. :try_end_2e} :catchall_13

    :try_start_2f
    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v9

    const/16 v10, 0x320

    int-to-short v10, v10

    aget-byte v12, v5, v32

    int-to-byte v12, v12

    move-object/from16 v49, v5

    aget-byte v5, v49, v26

    int-to-byte v5, v5

    invoke-static {v10, v12, v5}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    aget-byte v12, v49, v24

    int-to-byte v12, v12

    move-object/from16 v51, v8

    aget-byte v8, v49, v26

    int-to-byte v8, v8

    invoke-static {v11, v12, v8}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    filled-new-array {v8}, [Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v5

    invoke-virtual {v5, v9}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5
    :try_end_2f
    .catchall {:try_start_2f .. :try_end_2f} :catchall_f

    sget v8, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    add-int/lit8 v8, v8, 0x35

    rem-int/lit16 v8, v8, 0x80

    sput v8, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    :try_start_30
    aget-byte v8, v49, v32

    int-to-byte v8, v8

    aget-byte v9, v49, v26

    int-to-byte v9, v9

    invoke-static {v10, v8, v9}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    const/16 v9, 0x309

    int-to-short v10, v9

    aget-byte v9, v49, v16

    int-to-byte v9, v9

    aget-byte v12, v49, v20

    int-to-byte v12, v12

    invoke-static {v10, v9, v12}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    invoke-virtual {v8, v9, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    invoke-virtual {v8, v5, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_30
    .catchall {:try_start_30 .. :try_end_30} :catchall_e

    move-object v5, v7

    move-object/from16 v7, v50

    goto/16 :goto_24

    :goto_26
    move-object/from16 v8, v51

    move-object/from16 v12, v55

    goto/16 :goto_1d

    :catchall_e
    move-exception v0

    :try_start_31
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_23

    throw v5

    :catch_d
    move-exception v0

    goto :goto_27

    :cond_23
    throw v0

    :catchall_f
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_24

    throw v5

    :cond_24
    throw v0
    :try_end_31
    .catch Ljava/lang/Exception; {:try_start_31 .. :try_end_31} :catch_d
    .catchall {:try_start_31 .. :try_end_31} :catchall_a

    :goto_27
    :try_start_32
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v8, 0x305

    int-to-short v8, v8

    sget-object v9, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v10, v9, v16

    int-to-byte v10, v10

    aget-byte v12, v9, v36

    int-to-byte v12, v12

    invoke-static {v8, v10, v12}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v7, 0x342

    int-to-short v8, v7

    aget-byte v7, v9, v42

    int-to-byte v7, v7

    aget-byte v10, v9, v41
    :try_end_32
    .catchall {:try_start_32 .. :try_end_32} :catchall_12

    move/from16 v40, v14

    move-object v12, v15

    :try_start_33
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    long-to-int v14, v14

    mul-int/lit16 v15, v10, -0x1c0

    not-int v15, v15

    rsub-int v15, v15, -0x1c3

    move-object/from16 v39, v9

    not-int v9, v10

    move/from16 v41, v9

    not-int v9, v10

    xor-int/lit8 v42, v9, -0x1

    or-int v42, v42, v9

    xor-int v47, v42, v14

    and-int v42, v42, v14

    move/from16 v48, v9

    or-int v9, v47, v42

    not-int v9, v9

    xor-int v42, v41, v9

    and-int v9, v41, v9

    or-int v9, v42, v9

    mul-int/lit16 v9, v9, 0x1c1

    add-int/2addr v15, v9

    not-int v9, v10

    mul-int/lit16 v9, v9, -0x543

    or-int v41, v15, v9

    shl-int/lit8 v41, v41, 0x1

    xor-int/2addr v9, v15

    sub-int v41, v41, v9

    not-int v9, v10

    not-int v10, v14

    or-int v10, v48, v10

    xor-int/lit8 v14, v10, -0x1

    or-int/2addr v10, v14

    not-int v10, v10

    or-int/2addr v9, v10

    mul-int/lit16 v9, v9, 0x1c1

    xor-int v10, v41, v9

    and-int v9, v41, v9

    shl-int/lit8 v9, v9, 0x1

    add-int/2addr v10, v9

    int-to-byte v9, v10

    invoke-static {v8, v7, v9}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5
    :try_end_33
    .catchall {:try_start_33 .. :try_end_33} :catchall_11

    const/4 v7, 0x2

    :try_start_34
    new-array v9, v7, [Ljava/lang/Object;

    aput-object v0, v9, v23

    aput-object v5, v9, v17

    aget-byte v0, v39, v38

    int-to-byte v0, v0

    aget-byte v5, v39, v26

    int-to-byte v5, v5

    invoke-static {v8, v0, v5}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    filled-new-array {v13, v2}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_34
    .catchall {:try_start_34 .. :try_end_34} :catchall_10

    :catchall_10
    move-exception v0

    :try_start_35
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_25

    throw v5

    :catchall_11
    move-exception v0

    :goto_28
    move-object v5, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v60, v4

    move/from16 v57, v11

    move-object/from16 v59, v12

    goto/16 :goto_1b

    :cond_25
    throw v0

    :catchall_12
    move-exception v0

    :goto_29
    move/from16 v40, v14

    move-object v12, v15

    goto :goto_28

    :catchall_13
    move-exception v0

    move/from16 v40, v14

    move-object v12, v15

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_26

    throw v5

    :cond_26
    throw v0

    :catchall_14
    move-exception v0

    move-object/from16 v55, v12

    goto :goto_29

    :cond_27
    move-object/from16 v49, v5

    move-object/from16 v50, v7

    move-object/from16 v53, v9

    move-object/from16 v52, v10

    move-object/from16 v8, v50

    :goto_2a
    move-object/from16 v55, v12

    move/from16 v40, v14

    move-object v12, v15

    goto :goto_2b

    :catchall_15
    move-exception v0

    move-object/from16 v55, v12

    move/from16 v40, v14

    move-object v12, v15

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_28

    throw v5

    :cond_28
    throw v0

    :cond_29
    const/16 v48, 0x3b

    const/4 v8, 0x0

    const/16 v49, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    goto :goto_2a

    :goto_2b
    const/16 v0, 0x301

    int-to-short v0, v0

    sget-object v5, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    const/16 v7, 0x1e

    aget-byte v7, v5, v7

    int-to-byte v7, v7

    const/16 v9, 0x292

    aget-byte v9, v5, v9

    int-to-byte v9, v9

    invoke-static {v0, v7, v9}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v0
    :try_end_35
    .catchall {:try_start_35 .. :try_end_35} :catchall_11

    :try_start_36
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v7

    const/16 v9, 0x2d2

    int-to-short v9, v9

    aget-byte v10, v5, v22

    int-to-byte v10, v10

    aget-byte v14, v5, v21

    int-to-byte v14, v14

    invoke-static {v9, v10, v14}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v9

    filled-new-array {v13}, [Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v3, v9, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    invoke-virtual {v9, v1, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7
    :try_end_36
    .catchall {:try_start_36 .. :try_end_36} :catchall_6d

    const/16 v9, 0x2c8

    int-to-short v9, v9

    :try_start_37
    aget-byte v10, v5, v24

    int-to-byte v10, v10

    aget-byte v14, v5, v26

    int-to-byte v14, v14

    invoke-static {v9, v10, v14}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    const/16 v10, 0x2bd

    int-to-short v10, v10

    aget-byte v14, v5, v31

    int-to-byte v14, v14

    aget-byte v15, v5, v21

    int-to-byte v15, v15

    invoke-static {v10, v14, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v10

    const/4 v14, 0x0

    invoke-virtual {v9, v10, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    invoke-virtual {v9, v7, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;
    :try_end_37
    .catchall {:try_start_37 .. :try_end_37} :catchall_6c

    :try_start_38
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    sget v10, Lcom/appsflyer/internal/AFi1nSDK;->$$b:I

    or-int/lit16 v14, v10, 0x234

    int-to-short v14, v14

    aget-byte v15, v5, v42
    :try_end_38
    .catchall {:try_start_38 .. :try_end_38} :catchall_11

    int-to-byte v15, v15

    move-object/from16 v50, v5

    move-object/from16 v51, v8

    move/from16 v5, v20

    int-to-byte v8, v5

    :try_start_39
    invoke-static {v14, v15, v8}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v5
    :try_end_39
    .catchall {:try_start_39 .. :try_end_39} :catchall_6a

    const/4 v8, 0x5

    :try_start_3a
    invoke-virtual {v7, v8, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5
    :try_end_3a
    .catchall {:try_start_3a .. :try_end_3a} :catchall_6b

    :try_start_3b
    new-instance v7, Ljava/util/zip/ZipFile;

    invoke-direct {v7, v5}, Ljava/util/zip/ZipFile;-><init>(Ljava/lang/String;)V
    :try_end_3b
    .catchall {:try_start_3b .. :try_end_3b} :catchall_6a

    const/16 v5, 0x1a70

    :try_start_3c
    new-array v5, v5, [B

    move/from16 v8, v23

    invoke-virtual {v0, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v0
    :try_end_3c
    .catchall {:try_start_3c .. :try_end_3c} :catchall_16

    sget v8, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    add-int/lit8 v8, v8, 0x1d

    rem-int/lit16 v8, v8, 0x80

    sput v8, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    :try_start_3d
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    or-int/lit16 v8, v10, 0x234

    int-to-short v8, v8

    aget-byte v9, v50, v19

    int-to-byte v9, v9

    aget-byte v14, v50, v26

    int-to-byte v14, v14

    invoke-static {v8, v9, v14}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    const/16 v9, 0x29d

    int-to-short v14, v9

    aget-byte v15, v50, v38

    int-to-byte v15, v15

    aget-byte v9, v50, v26

    int-to-byte v9, v9

    invoke-static {v14, v15, v9}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    filled-new-array {v9}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v8

    invoke-virtual {v8, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3d
    .catchall {:try_start_3d .. :try_end_3d} :catchall_67

    :try_start_3e
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    or-int/lit16 v8, v10, 0x208

    int-to-short v8, v8

    aget-byte v9, v50, v37

    int-to-byte v9, v9

    aget-byte v15, v50, v26

    int-to-byte v15, v15

    invoke-static {v8, v9, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    aget-byte v9, v50, v38

    int-to-byte v9, v9

    aget-byte v15, v50, v26

    int-to-byte v15, v15

    invoke-static {v14, v9, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    filled-new-array {v9}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v8

    invoke-virtual {v8, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3e
    .catchall {:try_start_3e .. :try_end_3e} :catchall_66

    :try_start_3f
    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v8

    xor-int/lit16 v9, v10, 0x208

    and-int/lit16 v14, v10, 0x208

    or-int/2addr v9, v14

    int-to-short v9, v9

    aget-byte v14, v50, v37

    int-to-byte v14, v14

    aget-byte v15, v50, v26

    int-to-byte v15, v15

    invoke-static {v9, v14, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    const/16 v14, 0x275

    int-to-short v14, v14

    const/16 v56, 0x82

    aget-byte v15, v50, v56

    int-to-byte v15, v15

    const/16 v57, 0xae

    move-object/from16 v58, v5

    aget-byte v5, v50, v57

    int-to-byte v5, v5

    invoke-static {v14, v15, v5}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v5

    filled-new-array {v4}, [Ljava/lang/Class;

    move-result-object v14

    invoke-virtual {v9, v5, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5, v0, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3f
    .catchall {:try_start_3f .. :try_end_3f} :catchall_65

    sget v5, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    xor-int/lit8 v8, v5, 0x2f

    and-int/lit8 v5, v5, 0x2f

    const/16 v23, 0x1

    shl-int/lit8 v5, v5, 0x1

    add-int/2addr v8, v5

    rem-int/lit16 v8, v8, 0x80

    sput v8, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    xor-int/lit16 v5, v10, 0x208

    and-int/lit16 v8, v10, 0x208

    or-int/2addr v5, v8

    int-to-short v5, v5

    :try_start_40
    aget-byte v8, v50, v37

    int-to-byte v8, v8

    aget-byte v9, v50, v26

    int-to-byte v9, v9

    invoke-static {v5, v8, v9}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    const/16 v9, 0x309

    int-to-short v8, v9

    aget-byte v9, v50, v16
    :try_end_40
    .catchall {:try_start_40 .. :try_end_40} :catchall_63

    int-to-byte v9, v9

    const/16 v20, 0x56

    :try_start_41
    aget-byte v10, v50, v20
    :try_end_41
    .catchall {:try_start_41 .. :try_end_41} :catchall_64

    int-to-byte v10, v10

    :try_start_42
    invoke-static {v8, v9, v10}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    invoke-virtual {v5, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5, v0, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_42
    .catchall {:try_start_42 .. :try_end_42} :catchall_63

    const/16 v0, 0x14

    const/16 v5, 0x1a4a

    move v15, v5

    move-object/from16 v10, v44

    const/16 v50, 0x0

    move v5, v0

    move-object/from16 v0, v58

    :goto_2c
    const/4 v14, 0x1

    int-to-long v8, v14

    :try_start_43
    array-length v14, v0
    :try_end_43
    .catchall {:try_start_43 .. :try_end_43} :catchall_16

    move-wide/from16 v57, v8

    move/from16 v8, v17

    :goto_2d
    if-ge v8, v14, :cond_2b

    sget v59, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    const/16 v60, 0x10

    add-int/lit8 v9, v59, 0x7

    move/from16 v59, v8

    rem-int/lit16 v8, v9, 0x80

    sput v8, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    const/16 v28, 0x2

    rem-int/lit8 v9, v9, 0x2

    if-eqz v9, :cond_2a

    :try_start_44
    aget-byte v8, v0, v59

    int-to-long v8, v8

    const/16 v60, 0x4d

    shr-long v60, v57, v60

    div-long v8, v8, v60

    const/16 v60, 0x4b

    shr-long v60, v57, v60

    add-long v8, v8, v60

    rem-long v57, v8, v57

    add-int/lit8 v8, v59, 0x5f

    goto :goto_2d

    :catchall_16
    move-exception v0

    move-object v5, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v60, v4

    move/from16 v57, v11

    move-object/from16 v59, v12

    :goto_2e
    const/16 v20, 0x56

    :goto_2f
    const/16 v33, 0x5

    :goto_30
    move-object v2, v0

    goto/16 :goto_69

    :cond_2a
    aget-byte v8, v0, v59

    int-to-long v8, v8

    shl-long v61, v57, v27

    add-long v8, v8, v61

    shl-long v60, v57, v60

    add-long v8, v8, v60

    sub-long v57, v8, v57

    and-int/lit8 v8, v59, -0x7d

    or-int/lit8 v9, v59, -0x7d

    add-int/2addr v8, v9

    and-int/lit8 v9, v8, 0x7e

    or-int/lit8 v8, v8, 0x7e

    add-int/2addr v8, v9

    goto :goto_2d

    :cond_2b
    const/16 v60, 0x10

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    long-to-int v8, v8

    mul-int/lit16 v9, v5, 0xfd

    const v14, 0x4fae2

    xor-int v59, v14, v9

    and-int/2addr v9, v14

    const/16 v23, 0x1

    shl-int/lit8 v9, v9, 0x1

    add-int v59, v59, v9

    not-int v9, v5

    const/16 v14, -0x50b

    xor-int v61, v14, v9

    and-int/2addr v14, v9

    or-int v14, v61, v14

    not-int v14, v14

    move/from16 v61, v9

    not-int v9, v8

    move/from16 v62, v8

    or-int v8, v61, v9

    not-int v8, v8

    xor-int v63, v14, v8

    and-int/2addr v8, v14

    or-int v8, v63, v8

    or-int/lit16 v14, v5, 0x50a

    or-int v14, v14, v62

    not-int v14, v14

    xor-int v63, v8, v14

    and-int/2addr v8, v14

    or-int v8, v63, v8

    mul-int/lit16 v8, v8, -0xfc

    add-int v59, v59, v8

    xor-int/lit16 v8, v5, 0x50a

    and-int/lit16 v14, v5, 0x50a

    or-int/2addr v8, v14

    mul-int/lit16 v14, v8, -0xfc

    xor-int v63, v59, v14

    and-int v14, v59, v14

    const/16 v23, 0x1

    shl-int/lit8 v14, v14, 0x1

    add-int v63, v63, v14

    xor-int v14, v61, v9

    and-int v9, v61, v9

    or-int/2addr v9, v14

    xor-int/lit16 v14, v9, 0x50a

    and-int/lit16 v9, v9, 0x50a

    or-int/2addr v9, v14

    not-int v9, v9

    xor-int v14, v8, v62

    and-int v8, v8, v62

    or-int/2addr v8, v14

    not-int v8, v8

    or-int/2addr v8, v9

    mul-int/lit16 v8, v8, 0xfc

    neg-int v8, v8

    neg-int v8, v8

    or-int v9, v63, v8

    const/16 v23, 0x1

    shl-int/lit8 v9, v9, 0x1

    xor-int v8, v63, v8

    sub-int/2addr v9, v8

    move v14, v9

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8
    :try_end_44
    .catchall {:try_start_44 .. :try_end_44} :catchall_16

    long-to-int v8, v8

    mul-int/lit16 v9, v5, -0x1ee

    const v59, -0x1dc832

    add-int v59, v59, v9

    xor-int/lit16 v9, v5, 0xf6f

    move/from16 v62, v9

    and-int/lit16 v9, v5, 0xf6f

    or-int v9, v62, v9

    not-int v9, v9

    mul-int/lit16 v9, v9, -0x1ef

    neg-int v9, v9

    neg-int v9, v9

    or-int v62, v59, v9

    const/16 v23, 0x1

    shl-int/lit8 v62, v62, 0x1

    xor-int v9, v59, v9

    sub-int v62, v62, v9

    not-int v9, v8

    move-object/from16 v59, v12

    xor-int/lit16 v12, v9, 0xf6f

    and-int/lit16 v9, v9, 0xf6f

    or-int/2addr v9, v12

    mul-int/lit16 v9, v9, 0x1ef

    neg-int v9, v9

    neg-int v9, v9

    or-int v12, v62, v9

    const/16 v23, 0x1

    shl-int/lit8 v12, v12, 0x1

    xor-int v9, v62, v9

    sub-int/2addr v12, v9

    const/16 v9, -0xf70

    xor-int v62, v9, v61

    and-int v9, v9, v61

    or-int v9, v62, v9

    not-int v9, v9

    not-int v8, v8

    move/from16 v61, v9

    xor-int/lit16 v9, v8, 0xf6f

    and-int/lit16 v8, v8, 0xf6f

    or-int/2addr v8, v9

    not-int v8, v8

    xor-int v9, v61, v8

    and-int v8, v61, v8

    or-int/2addr v8, v9

    mul-int/lit16 v8, v8, 0x1ef

    add-int/2addr v12, v8

    :try_start_45
    aget-byte v8, v0, v12

    move v12, v14

    move v9, v15

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    long-to-int v14, v14

    mul-int/lit16 v15, v8, 0x1b2

    neg-int v15, v15

    neg-int v15, v15

    not-int v15, v15

    const v61, -0xc8d1

    sub-int v61, v61, v15

    not-int v15, v14

    const/16 v62, -0x78

    xor-int v63, v62, v15

    and-int v15, v62, v15

    or-int v15, v63, v15

    or-int/2addr v15, v8

    not-int v15, v15

    mul-int/lit16 v15, v15, 0x1b1

    or-int v63, v61, v15

    const/16 v23, 0x1

    shl-int/lit8 v63, v63, 0x1

    xor-int v15, v61, v15

    sub-int v63, v63, v15

    not-int v15, v8

    or-int/2addr v15, v14

    not-int v15, v15

    const/16 v61, -0x78

    or-int v15, v61, v15

    mul-int/lit16 v15, v15, -0x1b1

    not-int v15, v15

    sub-int v63, v63, v15

    const/16 v23, 0x1

    add-int/lit8 v63, v63, -0x1

    xor-int v15, v62, v14

    and-int v14, v62, v14

    or-int/2addr v14, v15

    not-int v14, v14

    xor-int/lit8 v15, v8, 0x77

    and-int/lit8 v8, v8, 0x77

    or-int/2addr v8, v15

    not-int v8, v8

    xor-int v15, v14, v8

    and-int/2addr v8, v14

    or-int/2addr v8, v15

    mul-int/lit16 v8, v8, 0x1b1

    add-int v8, v63, v8

    int-to-byte v8, v8

    aput-byte v8, v0, v12

    array-length v8, v0

    neg-int v12, v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14
    :try_end_45
    .catchall {:try_start_45 .. :try_end_45} :catchall_62

    long-to-int v14, v14

    mul-int/lit16 v15, v12, -0x1f4

    move/from16 v61, v5

    mul-int/lit16 v5, v8, -0x1f4

    and-int v62, v15, v5

    or-int/2addr v5, v15

    add-int v62, v62, v5

    not-int v5, v8

    xor-int v15, v5, v12

    and-int/2addr v5, v12

    or-int/2addr v5, v15

    not-int v5, v5

    not-int v12, v12

    xor-int v15, v12, v8

    and-int v63, v12, v8

    or-int v15, v15, v63

    xor-int v63, v15, v14

    and-int/2addr v15, v14

    or-int v15, v63, v15

    not-int v15, v15

    or-int/2addr v5, v15

    mul-int/lit16 v5, v5, 0x1f5

    neg-int v5, v5

    neg-int v5, v5

    and-int v15, v62, v5

    or-int v5, v62, v5

    add-int/2addr v15, v5

    not-int v5, v8

    xor-int v62, v12, v5

    and-int/2addr v5, v12

    or-int v5, v62, v5

    not-int v5, v5

    mul-int/lit16 v5, v5, 0x3ea

    neg-int v5, v5

    neg-int v5, v5

    or-int v62, v15, v5

    const/16 v23, 0x1

    shl-int/lit8 v62, v62, 0x1

    xor-int/2addr v5, v15

    sub-int v62, v62, v5

    not-int v5, v14

    or-int/2addr v5, v12

    xor-int v12, v5, v8

    and-int/2addr v5, v8

    or-int/2addr v5, v12

    not-int v5, v5

    mul-int/lit16 v5, v5, 0x1f5

    neg-int v5, v5

    neg-int v5, v5

    xor-int v8, v62, v5

    and-int v5, v62, v5

    const/16 v23, 0x1

    shl-int/lit8 v5, v5, 0x1

    add-int/2addr v8, v5

    move/from16 v5, v29

    :try_start_46
    new-array v12, v5, [Ljava/lang/Object;
    :try_end_46
    .catchall {:try_start_46 .. :try_end_46} :catchall_61

    :try_start_47
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v28, 0x2

    aput-object v5, v12, v28

    invoke-static/range {v61 .. v61}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v12, v23

    aput-object v0, v12, v17

    const/16 v0, 0x26d

    int-to-short v0, v0

    sget-object v5, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    const/16 v8, 0x33

    aget-byte v8, v5, v8

    int-to-byte v8, v8

    aget-byte v14, v5, v26

    int-to-byte v14, v14

    invoke-static {v0, v8, v14}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v4, v8, v8}, [Ljava/lang/Class;

    move-result-object v14

    invoke-virtual {v0, v14}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_47
    .catchall {:try_start_47 .. :try_end_47} :catchall_60

    :try_start_48
    sget-object v12, Lcom/appsflyer/internal/AFi1nSDK;->enableTCFDataCollection:Ljava/lang/Object;
    :try_end_48
    .catchall {:try_start_48 .. :try_end_48} :catchall_5f

    if-nez v12, :cond_2d

    :try_start_49
    sput-wide v57, Lcom/appsflyer/internal/AFi1nSDK;->setOaidData:J

    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v62

    const/16 v12, 0x30

    shr-long v62, v62, v12

    const-wide v64, 0x3d58aa5daa3eed8aL    # 3.505177192383821E-13

    add-long v62, v62, v64

    const/16 v68, 0x12

    xor-long v14, v57, v62

    long-to-int v12, v14

    sget-wide v14, Lcom/appsflyer/internal/AFi1nSDK;->setOaidData:J

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v57

    const/16 v62, 0x30

    shr-long v57, v57, v62

    const-wide v62, -0x3d58aa5dbc7e367eL    # -1.2828280996068754E13

    add-long v57, v57, v62

    xor-long v14, v14, v57

    long-to-int v14, v14

    sget-wide v57, Lcom/appsflyer/internal/AFi1nSDK;->setOaidData:J

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v62

    const/16 v15, 0x30

    shr-long v62, v62, v15

    const-wide v64, 0x3d58aa5d8616b9e6L    # 3.5051768861217966E-13

    add-long v62, v62, v64

    move-object/from16 v64, v8

    move v15, v9

    xor-long v8, v57, v62

    long-to-int v8, v8

    sget v9, Lcom/appsflyer/internal/AFi1nSDK;->setDebugLog:I

    sget v57, Lcom/appsflyer/internal/AFi1nSDK;->setUserFirstName:I
    :try_end_49
    .catchall {:try_start_49 .. :try_end_49} :catchall_1a

    sget v58, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    move-object/from16 v69, v5

    add-int/lit8 v5, v58, 0x77

    rem-int/lit16 v5, v5, 0x80

    sput v5, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    move/from16 v58, v8

    move/from16 v5, v27

    :try_start_4a
    new-array v8, v5, [Ljava/lang/Object;

    invoke-static/range {v58 .. v58}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5
    :try_end_4a
    .catchall {:try_start_4a .. :try_end_4a} :catchall_18

    const/16 v33, 0x5

    :try_start_4b
    aput-object v5, v8, v33

    invoke-static/range {v57 .. v57}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v8, v21

    invoke-static {v14}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v5

    const/16 v29, 0x3

    aput-object v5, v8, v29

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v28, 0x2

    aput-object v5, v8, v28

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v23, 0x1

    aput-object v5, v8, v23

    aput-object v0, v8, v17

    const/16 v0, 0x252

    int-to-short v0, v0

    const/16 v5, 0xe

    aget-byte v5, v69, v5

    int-to-byte v5, v5

    const/16 v20, 0x56

    aget-byte v9, v69, v20

    int-to-byte v9, v9

    invoke-static {v0, v5, v9}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/16 v5, 0x29d

    int-to-short v9, v5

    aget-byte v5, v69, v38

    int-to-byte v5, v5

    aget-byte v12, v69, v26

    int-to-byte v12, v12

    invoke-static {v9, v5, v12}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v62

    sget-object v65, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    move-object/from16 v63, v64

    move-object/from16 v64, v63

    move-object/from16 v66, v63

    move-object/from16 v67, v63

    filled-new-array/range {v62 .. v67}, [Ljava/lang/Class;

    move-result-object v5

    move-object/from16 v9, v63

    invoke-virtual {v0, v5}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4b
    .catchall {:try_start_4b .. :try_end_4b} :catchall_17

    move-object/from16 v58, v7

    move/from16 v57, v15

    const/16 v29, 0x3

    :goto_31
    const/16 v5, 0x29d

    goto/16 :goto_34

    :catchall_17
    move-exception v0

    goto :goto_32

    :catchall_18
    move-exception v0

    const/16 v33, 0x5

    :goto_32
    :try_start_4c
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_2c

    throw v5

    :catchall_19
    move-exception v0

    :goto_33
    move-object v5, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v60, v4

    move/from16 v57, v11

    const/16 v20, 0x56

    const/16 v27, 0x6

    const/16 v29, 0x3

    goto/16 :goto_30

    :cond_2c
    throw v0

    :catchall_1a
    move-exception v0

    const/16 v33, 0x5

    goto :goto_33

    :cond_2d
    move-object/from16 v69, v5

    move v15, v9

    const/16 v33, 0x5

    const/16 v68, 0x12

    move-object v9, v8

    sput-wide v57, Lcom/appsflyer/internal/AFi1nSDK;->updateServerUninstallToken:J
    :try_end_4c
    .catchall {:try_start_4c .. :try_end_4c} :catchall_19

    move/from16 v5, v60

    :try_start_4d
    new-array v8, v5, [B

    fill-array-data v8, :array_2
    :try_end_4d
    .catchall {:try_start_4d .. :try_end_4d} :catchall_5e

    :try_start_4e
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    move-result-wide v62

    const/16 v5, 0x20

    shr-long v62, v62, v5

    const-wide v64, -0x62be3626cc0b7f5dL    # -9.426946271110411E-168

    sub-long v64, v64, v62

    move v5, v15

    xor-long v14, v57, v64

    long-to-int v14, v14

    sget-wide v57, Lcom/appsflyer/internal/AFi1nSDK;->updateServerUninstallToken:J

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v62
    :try_end_4e
    .catchall {:try_start_4e .. :try_end_4e} :catchall_19

    const/16 v15, 0x3c

    shr-long v62, v62, v15

    const-wide v64, 0x62be3626fa68f28cL    # 4.453796388435189E167

    sub-long v64, v64, v62

    move/from16 v62, v14

    xor-long v14, v57, v64

    long-to-int v14, v14

    int-to-byte v14, v14

    move/from16 v57, v5

    move/from16 v15, v21

    :try_start_4f
    new-array v5, v15, [Ljava/lang/Object;
    :try_end_4f
    .catchall {:try_start_4f .. :try_end_4f} :catchall_5d

    :try_start_50
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14
    :try_end_50
    .catchall {:try_start_50 .. :try_end_50} :catchall_5c

    const/16 v29, 0x3

    :try_start_51
    aput-object v14, v5, v29

    invoke-static/range {v62 .. v62}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const/16 v28, 0x2

    aput-object v14, v5, v28

    const/16 v23, 0x1

    aput-object v8, v5, v23

    aput-object v0, v5, v17
    :try_end_51
    .catchall {:try_start_51 .. :try_end_51} :catchall_59

    const/16 v0, 0x234

    int-to-short v0, v0

    const/16 v21, 0x4

    :try_start_52
    aget-byte v8, v69, v21
    :try_end_52
    .catchall {:try_start_52 .. :try_end_52} :catchall_5b

    int-to-byte v8, v8

    const/16 v20, 0x56

    :try_start_53
    aget-byte v14, v69, v20
    :try_end_53
    .catchall {:try_start_53 .. :try_end_53} :catchall_5a

    int-to-byte v14, v14

    :try_start_54
    invoke-static {v0, v8, v14}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v0

    sget-object v8, Lcom/appsflyer/internal/AFi1nSDK;->stop:Ljava/lang/Object;

    check-cast v8, Ljava/lang/ClassLoader;

    const/4 v14, 0x1

    invoke-static {v0, v14, v8}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    const/16 v8, 0x214

    int-to-short v8, v8

    aget-byte v14, v69, v42

    int-to-byte v14, v14

    aget-byte v15, v69, v68

    int-to-byte v15, v15

    invoke-static {v8, v14, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v8

    const/16 v14, 0x29d

    int-to-short v15, v14

    aget-byte v14, v69, v38
    :try_end_54
    .catchall {:try_start_54 .. :try_end_54} :catchall_59

    int-to-byte v14, v14

    move-object/from16 v58, v7

    :try_start_55
    aget-byte v7, v69, v26

    int-to-byte v7, v7

    invoke-static {v15, v14, v7}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    filled-new-array {v7, v4, v9, v9}, [Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v0, v8, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v12, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_55
    .catchall {:try_start_55 .. :try_end_55} :catchall_58

    goto/16 :goto_31

    :goto_34
    int-to-short v7, v5

    :try_start_56
    aget-byte v8, v69, v38

    int-to-byte v8, v8

    aget-byte v12, v69, v26

    int-to-byte v12, v12

    invoke-static {v7, v8, v12}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    const/16 v12, 0x214

    int-to-short v12, v12

    const/16 v14, 0x20f

    aget-byte v15, v69, v14

    neg-int v15, v15

    int-to-byte v15, v15

    const/16 v60, 0x10

    aget-byte v5, v69, v60

    int-to-byte v5, v5

    invoke-static {v12, v15, v5}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v5

    sget-object v12, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    filled-new-array {v12}, [Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v8, v5, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-static/range {v60 .. v60}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v5, v0, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_56
    .catchall {:try_start_56 .. :try_end_56} :catchall_1b

    if-eqz v39, :cond_3e

    sget v8, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    add-int/lit8 v12, v8, 0x25

    rem-int/lit16 v12, v12, 0x80

    sput v12, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    :try_start_57
    sget-object v12, Lcom/appsflyer/internal/AFi1nSDK;->enableTCFDataCollection:Ljava/lang/Object;
    :try_end_57
    .catchall {:try_start_57 .. :try_end_57} :catchall_31

    if-nez v12, :cond_2f

    add-int/lit8 v15, v8, 0x49

    move/from16 v62, v14

    rem-int/lit16 v14, v15, 0x80

    sput v14, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    const/16 v28, 0x2

    rem-int/lit8 v15, v15, 0x2

    if-eqz v15, :cond_2e

    move-object/from16 v14, v51

    goto :goto_3a

    :cond_2e
    const/16 v34, 0x0

    :try_start_58
    throw v34
    :try_end_58
    .catchall {:try_start_58 .. :try_end_58} :catchall_1b

    :catchall_1b
    move-exception v0

    move-object v5, v1

    move-object v1, v2

    :goto_35
    move-object v10, v3

    move-object/from16 v60, v4

    move/from16 v57, v11

    :goto_36
    move-object/from16 v7, v58

    :goto_37
    const/16 v20, 0x56

    :goto_38
    const/16 v21, 0x4

    :goto_39
    const/16 v27, 0x6

    goto/16 :goto_30

    :cond_2f
    move/from16 v62, v14

    move-object/from16 v14, v53

    :goto_3a
    if-nez v12, :cond_30

    add-int/lit8 v8, v8, 0x55

    rem-int/lit16 v8, v8, 0x80

    sput v8, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    move-object/from16 v8, v52

    goto :goto_3b

    :cond_30
    move-object/from16 v8, v49

    :goto_3b
    :try_start_59
    aget-byte v12, v69, v38

    int-to-byte v12, v12

    aget-byte v15, v69, v26

    int-to-byte v15, v15

    invoke-static {v7, v12, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v12

    const/16 v15, 0x211

    int-to-short v15, v15

    aget-byte v5, v69, v62

    neg-int v5, v5

    int-to-byte v5, v5

    const/16 v64, 0xae

    move-object/from16 v65, v10

    aget-byte v10, v69, v64

    int-to-byte v10, v10

    invoke-static {v15, v5, v10}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v5

    filled-new-array {v4, v9, v9}, [Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v12, v5, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    const/16 v10, 0x320

    int-to-short v10, v10

    aget-byte v12, v69, v32

    int-to-byte v12, v12

    aget-byte v15, v69, v26

    int-to-byte v15, v15

    invoke-static {v10, v12, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10
    :try_end_59
    .catchall {:try_start_59 .. :try_end_59} :catchall_31

    :try_start_5a
    aget-byte v12, v69, v24

    int-to-byte v12, v12

    aget-byte v15, v69, v26

    int-to-byte v15, v15

    invoke-static {v11, v12, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v12

    filled-new-array {v12}, [Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v10, v12}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v12

    filled-new-array {v14}, [Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v12, v15}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12
    :try_end_5a
    .catch Ljava/lang/Exception; {:try_start_5a .. :try_end_5a} :catch_f
    .catchall {:try_start_5a .. :try_end_5a} :catchall_2a

    if-eqz v35, :cond_32

    :try_start_5b
    aget-byte v15, v69, v24

    int-to-byte v15, v15

    move/from16 v64, v7

    aget-byte v7, v69, v26

    int-to-byte v7, v7

    invoke-static {v11, v15, v7}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7
    :try_end_5b
    .catchall {:try_start_5b .. :try_end_5b} :catchall_1e

    const/16 v15, 0x20e

    int-to-short v15, v15

    move-object/from16 v66, v2

    :try_start_5c
    aget-byte v2, v69, v22
    :try_end_5c
    .catchall {:try_start_5c .. :try_end_5c} :catchall_1d

    int-to-byte v2, v2

    move-object/from16 v67, v1

    const/16 v60, 0x10

    :try_start_5d
    aget-byte v1, v69, v60

    int-to-byte v1, v1

    invoke-static {v15, v2, v1}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v7, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v14, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_5d
    .catchall {:try_start_5d .. :try_end_5d} :catchall_1c

    goto :goto_3d

    :catchall_1c
    move-exception v0

    goto :goto_3c

    :catchall_1d
    move-exception v0

    move-object/from16 v67, v1

    goto :goto_3c

    :catchall_1e
    move-exception v0

    move-object/from16 v67, v1

    move-object/from16 v66, v2

    :goto_3c
    :try_start_5e
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_31

    throw v1

    :catchall_1f
    move-exception v0

    move-object/from16 v1, v66

    move-object/from16 v2, v67

    goto/16 :goto_47

    :catch_e
    move-exception v0

    move-object/from16 v2, v67

    goto/16 :goto_45

    :cond_31
    throw v0
    :try_end_5e
    .catch Ljava/lang/Exception; {:try_start_5e .. :try_end_5e} :catch_e
    .catchall {:try_start_5e .. :try_end_5e} :catchall_1f

    :cond_32
    move-object/from16 v67, v1

    move-object/from16 v66, v2

    move/from16 v64, v7

    :goto_3d
    const/16 v1, 0x400

    :try_start_5f
    new-array v2, v1, [B

    const/16 v7, 0x200

    int-to-short v7, v7

    aget-byte v15, v69, v16

    int-to-byte v15, v15

    aget-byte v1, v69, v30

    int-to-byte v1, v1

    invoke-static {v7, v15, v1}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v4, v9, v9}, [Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v10, v1, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1
    :try_end_5f
    .catchall {:try_start_5f .. :try_end_5f} :catchall_26

    move/from16 v7, v57

    :goto_3e
    if-lez v7, :cond_33

    const/16 v9, 0x400

    :try_start_60
    invoke-static {v9, v7}, Ljava/lang/Math;->min(II)I

    move-result v15

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    filled-new-array {v2, v6, v15}, [Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v5, v0, v15}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Integer;

    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v9

    move-object/from16 v57, v5

    const/4 v5, -0x1

    if-eq v9, v5, :cond_33

    filled-new-array {v2, v6, v15}, [Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v1, v12, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_60
    .catchall {:try_start_60 .. :try_end_60} :catchall_1f

    neg-int v5, v9

    not-int v5, v5

    sub-int/2addr v7, v5

    const/16 v23, 0x1

    add-int/lit8 v7, v7, -0x1

    move-object/from16 v5, v57

    goto :goto_3e

    :cond_33
    const/16 v0, 0x1fc

    int-to-short v0, v0

    :try_start_61
    sget-object v1, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v2, v1, v16

    int-to-byte v2, v2

    const/16 v21, 0x4

    aget-byte v5, v1, v21

    int-to-byte v5, v5

    invoke-static {v0, v2, v5}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v0

    const/4 v9, 0x0

    invoke-virtual {v10, v0, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v12, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/16 v2, 0x1f8

    int-to-short v2, v2

    aget-byte v5, v1, v18

    int-to-byte v5, v5

    aget-byte v7, v1, v26

    int-to-byte v7, v7

    invoke-static {v2, v5, v7}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    sget v5, Lcom/appsflyer/internal/AFi1nSDK;->$$b:I

    xor-int/lit16 v7, v5, 0x160

    and-int/lit16 v9, v5, 0x160

    or-int/2addr v7, v9

    int-to-short v7, v7

    aget-byte v9, v1, v62

    neg-int v9, v9

    int-to-byte v9, v9

    const/16 v60, 0x10

    aget-byte v15, v1, v60

    int-to-byte v15, v15

    invoke-static {v7, v9, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v7

    const/4 v9, 0x0

    invoke-virtual {v2, v7, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v0, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v2, 0x309

    int-to-short v0, v2

    aget-byte v2, v1, v16

    int-to-byte v2, v2

    const/16 v20, 0x56

    aget-byte v7, v1, v20

    int-to-byte v7, v7

    invoke-static {v0, v2, v7}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v12, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x1e0

    int-to-short v0, v0

    aget-byte v2, v1, v17

    int-to-byte v2, v2

    aget-byte v7, v1, v68

    int-to-byte v7, v7

    invoke-static {v0, v2, v7}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/16 v2, 0x1cc

    int-to-short v2, v2

    aget-byte v7, v1, v31

    int-to-byte v7, v7

    aget-byte v9, v1, v48

    int-to-byte v9, v9

    invoke-static {v2, v7, v9}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v2

    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v13, v13, v7}, [Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v0, v2, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_61
    .catchall {:try_start_61 .. :try_end_61} :catchall_26

    :try_start_62
    aget-byte v2, v1, v24

    int-to-byte v2, v2

    aget-byte v7, v1, v26

    int-to-byte v7, v7

    invoke-static {v11, v2, v7}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const/16 v7, 0x1c6

    int-to-short v7, v7

    const/16 v9, 0x265

    aget-byte v9, v1, v9

    int-to-byte v9, v9

    const/16 v21, 0x4

    aget-byte v10, v1, v21

    int-to-byte v10, v10

    invoke-static {v7, v9, v10}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    invoke-virtual {v2, v9, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v14, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_62
    .catchall {:try_start_62 .. :try_end_62} :catchall_29

    :try_start_63
    aget-byte v9, v1, v24

    int-to-byte v9, v9

    aget-byte v10, v1, v26

    int-to-byte v10, v10

    invoke-static {v11, v9, v10}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    const/16 v10, 0x265

    aget-byte v10, v1, v10

    int-to-byte v10, v10

    const/16 v21, 0x4

    aget-byte v12, v1, v21

    int-to-byte v12, v12

    invoke-static {v7, v10, v12}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v7

    const/4 v10, 0x0

    invoke-virtual {v9, v7, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-virtual {v7, v8, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7
    :try_end_63
    .catchall {:try_start_63 .. :try_end_63} :catchall_27

    :try_start_64
    filled-new-array {v2, v7, v6}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v10, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_64
    .catchall {:try_start_64 .. :try_end_64} :catchall_26

    :try_start_65
    aget-byte v2, v1, v24

    int-to-byte v2, v2

    aget-byte v7, v1, v26

    int-to-byte v7, v7

    invoke-static {v11, v2, v7}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const/16 v7, 0x1b8

    int-to-short v7, v7

    const/16 v9, 0x9e

    aget-byte v9, v1, v9

    neg-int v9, v9

    int-to-byte v9, v9

    aget-byte v10, v1, v68

    int-to-byte v10, v10

    invoke-static {v7, v9, v10}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    invoke-virtual {v2, v9, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v14, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_65
    .catchall {:try_start_65 .. :try_end_65} :catchall_25

    :try_start_66
    aget-byte v2, v1, v24

    int-to-byte v2, v2

    aget-byte v9, v1, v26

    int-to-byte v9, v9

    invoke-static {v11, v2, v9}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const/16 v9, 0x9e

    aget-byte v9, v1, v9

    neg-int v9, v9

    int-to-byte v9, v9

    aget-byte v10, v1, v68

    int-to-byte v10, v10

    invoke-static {v7, v9, v10}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v7

    const/4 v9, 0x0

    invoke-virtual {v2, v7, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v8, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_66
    .catchall {:try_start_66 .. :try_end_66} :catchall_24

    :try_start_67
    sget-object v2, Lcom/appsflyer/internal/AFi1nSDK;->stop:Ljava/lang/Object;
    :try_end_67
    .catchall {:try_start_67 .. :try_end_67} :catchall_23

    if-nez v2, :cond_35

    xor-int/lit16 v2, v5, 0x130

    and-int/lit16 v5, v5, 0x130

    or-int/2addr v2, v5

    int-to-short v2, v2

    :try_start_68
    aget-byte v5, v1, v25

    neg-int v5, v5

    int-to-byte v5, v5

    const/16 v21, 0x4

    aget-byte v1, v1, v21

    int-to-byte v1, v1

    invoke-static {v2, v5, v1}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v1

    const/4 v9, 0x0

    invoke-virtual {v3, v1, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1
    :try_end_68
    .catchall {:try_start_68 .. :try_end_68} :catchall_22

    move-object/from16 v2, v67

    :try_start_69
    invoke-virtual {v1, v2, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_69
    .catchall {:try_start_69 .. :try_end_69} :catchall_21

    :try_start_6a
    sput-object v1, Lcom/appsflyer/internal/AFi1nSDK;->stop:Ljava/lang/Object;

    goto :goto_42

    :catchall_20
    move-exception v0

    :goto_3f
    move-object v5, v2

    move-object v10, v3

    move-object/from16 v60, v4

    move/from16 v57, v11

    :goto_40
    move-object/from16 v7, v58

    move-object/from16 v1, v66

    goto/16 :goto_37

    :catchall_21
    move-exception v0

    goto :goto_41

    :catchall_22
    move-exception v0

    move-object/from16 v2, v67

    :goto_41
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_34

    throw v1

    :cond_34
    throw v0

    :cond_35
    move-object/from16 v2, v67

    :goto_42
    move-object/from16 v70, v2

    move-object v10, v3

    move-object/from16 v60, v4

    move/from16 v57, v11

    const/16 v27, 0x6

    :cond_36
    :goto_43
    move-object v1, v0

    goto/16 :goto_50

    :catchall_23
    move-exception v0

    move-object/from16 v2, v67

    goto :goto_3f

    :catchall_24
    move-exception v0

    move-object/from16 v2, v67

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_37

    throw v1

    :cond_37
    throw v0

    :catchall_25
    move-exception v0

    move-object/from16 v2, v67

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_38

    throw v1

    :cond_38
    throw v0
    :try_end_6a
    .catchall {:try_start_6a .. :try_end_6a} :catchall_20

    :catchall_26
    move-exception v0

    move-object/from16 v2, v67

    :goto_44
    move-object/from16 v1, v66

    goto/16 :goto_47

    :catchall_27
    move-exception v0

    move-object/from16 v2, v67

    :try_start_6b
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_39

    throw v1

    :catchall_28
    move-exception v0

    goto :goto_44

    :cond_39
    throw v0

    :catchall_29
    move-exception v0

    move-object/from16 v2, v67

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_3a

    throw v1

    :cond_3a
    throw v0

    :catchall_2a
    move-exception v0

    move-object/from16 v66, v2

    move-object v2, v1

    goto :goto_44

    :catch_f
    move-exception v0

    move-object/from16 v66, v2

    move-object v2, v1

    :goto_45
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v5, 0x204

    int-to-short v5, v5

    sget-object v7, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v9, v7, v16

    int-to-byte v9, v9

    aget-byte v10, v7, v36

    int-to-byte v10, v10

    invoke-static {v5, v9, v10}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v5, 0x342

    int-to-short v9, v5

    aget-byte v5, v7, v42

    int-to-byte v5, v5

    aget-byte v10, v7, v41

    xor-int/lit8 v12, v10, -0x1

    const/16 v23, 0x1

    shl-int/lit8 v10, v10, 0x1

    add-int/2addr v12, v10

    int-to-byte v10, v12

    invoke-static {v9, v5, v10}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_6b
    .catchall {:try_start_6b .. :try_end_6b} :catchall_28

    const/4 v5, 0x2

    :try_start_6c
    new-array v10, v5, [Ljava/lang/Object;

    aput-object v0, v10, v23

    aput-object v1, v10, v17

    aget-byte v0, v7, v38

    int-to-byte v0, v0

    aget-byte v1, v7, v26

    int-to-byte v1, v1

    invoke-static {v9, v0, v1}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_6c
    .catchall {:try_start_6c .. :try_end_6c} :catchall_2c

    move-object/from16 v1, v66

    :try_start_6d
    filled-new-array {v13, v1}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_6d
    .catchall {:try_start_6d .. :try_end_6d} :catchall_2b

    :catchall_2b
    move-exception v0

    goto :goto_46

    :catchall_2c
    move-exception v0

    move-object/from16 v1, v66

    :goto_46
    :try_start_6e
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_3b

    throw v5

    :catchall_2d
    move-exception v0

    goto :goto_47

    :cond_3b
    throw v0
    :try_end_6e
    .catchall {:try_start_6e .. :try_end_6e} :catchall_2d

    :goto_47
    :try_start_6f
    sget-object v5, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v7, v5, v24

    int-to-byte v7, v7

    aget-byte v9, v5, v26

    int-to-byte v9, v9

    invoke-static {v11, v7, v9}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    const/16 v9, 0x1b8

    int-to-short v9, v9

    const/16 v10, 0x9e

    aget-byte v10, v5, v10

    neg-int v10, v10

    int-to-byte v10, v10

    aget-byte v12, v5, v68

    int-to-byte v12, v12

    invoke-static {v9, v10, v12}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v10

    const/4 v12, 0x0

    invoke-virtual {v7, v10, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-virtual {v7, v14, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_6f
    .catchall {:try_start_6f .. :try_end_6f} :catchall_30

    :try_start_70
    aget-byte v7, v5, v24

    int-to-byte v7, v7

    aget-byte v10, v5, v26

    int-to-byte v10, v10

    invoke-static {v11, v7, v10}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    const/16 v10, 0x9e

    aget-byte v10, v5, v10

    neg-int v10, v10

    int-to-byte v10, v10

    aget-byte v5, v5, v68

    int-to-byte v5, v5

    invoke-static {v9, v10, v5}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v5

    const/4 v9, 0x0

    invoke-virtual {v7, v5, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5, v8, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_70
    .catchall {:try_start_70 .. :try_end_70} :catchall_2f

    :try_start_71
    throw v0

    :catchall_2e
    move-exception v0

    :goto_48
    move-object v5, v2

    goto/16 :goto_35

    :catchall_2f
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_3c

    throw v5

    :cond_3c
    throw v0

    :catchall_30
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_3d

    throw v5

    :cond_3d
    throw v0

    :catchall_31
    move-exception v0

    move-object/from16 v73, v2

    move-object v2, v1

    move-object/from16 v1, v73

    goto :goto_48

    :cond_3e
    move-object/from16 v62, v2

    move-object v2, v1

    move-object/from16 v1, v62

    move/from16 v64, v7

    move-object/from16 v65, v10

    move/from16 v62, v14

    const/16 v5, 0x1a6

    int-to-short v5, v5

    const/16 v7, 0x33

    aget-byte v7, v69, v7

    int-to-byte v7, v7

    aget-byte v8, v69, v26

    int-to-byte v8, v8

    invoke-static {v5, v7, v8}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    aget-byte v7, v69, v38

    int-to-byte v7, v7

    aget-byte v8, v69, v26

    int-to-byte v8, v8

    move/from16 v10, v64

    invoke-static {v10, v7, v8}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v8

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget v8, Lcom/appsflyer/internal/AFi1nSDK;->$$b:I

    or-int/lit16 v12, v8, 0x108

    int-to-short v12, v12

    aget-byte v14, v69, v24
    :try_end_71
    .catchall {:try_start_71 .. :try_end_71} :catchall_2e

    int-to-byte v14, v14

    const/16 v21, 0x4

    :try_start_72
    aget-byte v15, v69, v21
    :try_end_72
    .catchall {:try_start_72 .. :try_end_72} :catchall_57

    int-to-byte v15, v15

    :try_start_73
    invoke-static {v12, v14, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v12

    const/4 v14, 0x0

    invoke-virtual {v5, v12, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5, v0, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    const/16 v12, 0x180

    int-to-short v12, v12

    aget-byte v14, v69, v18

    int-to-byte v14, v14

    aget-byte v15, v69, v26

    int-to-byte v15, v15

    invoke-static {v12, v14, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v12

    const/16 v14, 0x16b

    int-to-short v14, v14

    aget-byte v15, v69, v31
    :try_end_73
    .catchall {:try_start_73 .. :try_end_73} :catchall_2e

    int-to-byte v15, v15

    move/from16 v57, v11

    const/16 v21, 0x4

    :try_start_74
    aget-byte v11, v69, v21
    :try_end_74
    .catchall {:try_start_74 .. :try_end_74} :catchall_56

    int-to-byte v11, v11

    :try_start_75
    invoke-static {v14, v15, v11}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v11

    const/4 v14, 0x0

    invoke-virtual {v12, v11, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v11

    const/16 v12, 0x211

    int-to-short v12, v12

    aget-byte v14, v69, v62

    neg-int v14, v14

    int-to-byte v14, v14

    const/16 v15, 0xae

    aget-byte v15, v69, v15

    int-to-byte v15, v15

    invoke-static {v12, v14, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v12

    filled-new-array {v4}, [Ljava/lang/Class;

    move-result-object v14

    invoke-virtual {v7, v12, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7
    :try_end_75
    .catchall {:try_start_75 .. :try_end_75} :catchall_51

    sget v12, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    and-int/lit8 v14, v12, 0x13

    or-int/lit8 v12, v12, 0x13

    add-int/2addr v14, v12

    rem-int/lit16 v14, v14, 0x80

    sput v14, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    :try_start_76
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    or-int/lit16 v12, v8, 0x234

    int-to-short v12, v12

    aget-byte v14, v69, v19

    int-to-byte v14, v14

    aget-byte v15, v69, v26

    int-to-byte v15, v15

    invoke-static {v12, v14, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v12

    aget-byte v14, v69, v38

    int-to-byte v14, v14

    aget-byte v15, v69, v26

    int-to-byte v15, v15

    invoke-static {v10, v14, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v14

    filled-new-array {v14}, [Ljava/lang/Class;

    move-result-object v14

    invoke-virtual {v12, v14}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v12

    invoke-virtual {v12, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_76
    .catchall {:try_start_76 .. :try_end_76} :catchall_55

    sget v12, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    or-int/lit8 v14, v12, 0x1b

    const/16 v23, 0x1

    shl-int/lit8 v14, v14, 0x1

    xor-int/lit8 v12, v12, 0x1b

    sub-int/2addr v14, v12

    rem-int/lit16 v14, v14, 0x80

    sput v14, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    xor-int/lit16 v12, v8, 0x130

    and-int/lit16 v8, v8, 0x130

    or-int/2addr v8, v12

    int-to-short v8, v8

    :try_start_77
    aget-byte v12, v69, v25
    :try_end_77
    .catchall {:try_start_77 .. :try_end_77} :catchall_53

    neg-int v12, v12

    int-to-byte v12, v12

    const/16 v21, 0x4

    :try_start_78
    aget-byte v14, v69, v21
    :try_end_78
    .catchall {:try_start_78 .. :try_end_78} :catchall_54

    int-to-byte v14, v14

    :try_start_79
    invoke-static {v8, v12, v14}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v8

    const/4 v14, 0x0

    invoke-virtual {v3, v8, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    invoke-virtual {v8, v2, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8
    :try_end_79
    .catchall {:try_start_79 .. :try_end_79} :catchall_53

    const/16 v12, 0x165

    int-to-short v12, v12

    const/16 v20, 0x56

    :try_start_7a
    aget-byte v14, v69, v20
    :try_end_7a
    .catchall {:try_start_7a .. :try_end_7a} :catchall_52

    int-to-byte v14, v14

    :try_start_7b
    aget-byte v15, v69, v26

    int-to-byte v15, v15

    invoke-static {v12, v14, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v12

    const/4 v14, 0x0

    invoke-virtual {v12, v14}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v15

    invoke-virtual {v15, v14}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15
    :try_end_7b
    .catchall {:try_start_7b .. :try_end_7b} :catchall_51

    const/16 v14, 0x200

    int-to-short v14, v14

    move-object/from16 v66, v1

    :try_start_7c
    aget-byte v1, v69, v16

    int-to-byte v1, v1

    move/from16 v64, v10

    aget-byte v10, v69, v30

    int-to-byte v10, v10

    invoke-static {v14, v1, v10}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v4, v9, v9}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v12, v1, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    const/16 v9, 0x149

    int-to-short v9, v9

    aget-byte v10, v69, v22

    int-to-byte v10, v10

    const/16 v14, 0x1b

    aget-byte v14, v69, v14

    int-to-byte v14, v14

    invoke-static {v9, v10, v14}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v9

    const/4 v14, 0x0

    invoke-virtual {v12, v9, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    const/16 v10, 0x13f

    int-to-short v10, v10

    const/16 v12, 0x1e9

    aget-byte v12, v69, v12

    int-to-byte v12, v12

    aget-byte v14, v69, v26

    int-to-byte v14, v14

    invoke-static {v10, v12, v14}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    const/16 v12, 0x309

    int-to-short v14, v12

    aget-byte v12, v69, v16
    :try_end_7c
    .catchall {:try_start_7c .. :try_end_7c} :catchall_50

    int-to-byte v12, v12

    move-object/from16 v60, v4

    const/16 v20, 0x56

    :try_start_7d
    aget-byte v4, v69, v20
    :try_end_7d
    .catchall {:try_start_7d .. :try_end_7d} :catchall_4f

    int-to-byte v4, v4

    :try_start_7e
    invoke-static {v14, v12, v4}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v4

    const/4 v14, 0x0

    invoke-virtual {v10, v4, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    const/16 v10, 0x400

    new-array v10, v10, [B

    move/from16 v12, v17

    :goto_49
    filled-new-array {v10}, [Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v7, v0, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Integer;

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v67
    :try_end_7e
    .catchall {:try_start_7e .. :try_end_7e} :catchall_4e

    if-lez v67, :cond_40

    move-object/from16 v70, v2

    move-object/from16 v69, v3

    int-to-long v2, v12

    move-wide/from16 v71, v2

    const/4 v2, 0x0

    :try_start_7f
    invoke-virtual {v11, v5, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v2, v71, v2

    if-gez v2, :cond_3f

    filled-new-array {v10, v6, v14}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v15, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7f
    .catchall {:try_start_7f .. :try_end_7f} :catchall_32

    xor-int v2, v12, v67

    and-int v3, v12, v67

    const/16 v23, 0x1

    shl-int/lit8 v3, v3, 0x1

    add-int v12, v2, v3

    move-object/from16 v3, v69

    move-object/from16 v2, v70

    goto :goto_49

    :catchall_32
    move-exception v0

    move-object v2, v0

    move-object/from16 v7, v58

    move-object/from16 v1, v66

    move-object/from16 v10, v69

    move-object/from16 v5, v70

    const/16 v20, 0x56

    const/16 v21, 0x4

    const/16 v27, 0x6

    goto/16 :goto_69

    :cond_3f
    :goto_4a
    const/4 v14, 0x0

    goto :goto_4b

    :cond_40
    move-object/from16 v70, v2

    move-object/from16 v69, v3

    goto :goto_4a

    :goto_4b
    :try_start_80
    invoke-virtual {v9, v15, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B
    :try_end_80
    .catchall {:try_start_80 .. :try_end_80} :catchall_4c

    :try_start_81
    invoke-virtual {v4, v0, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4, v15, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_81
    .catch Ljava/lang/Exception; {:try_start_81 .. :try_end_81} :catch_10
    .catchall {:try_start_81 .. :try_end_81} :catchall_32

    :catch_10
    const/16 v0, 0x12f

    int-to-short v0, v0

    :try_start_82
    sget-object v2, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v3, v2, v26

    int-to-byte v3, v3

    aget-byte v4, v2, v68

    int-to-byte v4, v4

    invoke-static {v0, v3, v4}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/16 v3, 0x10c

    int-to-short v3, v3

    aget-byte v4, v2, v38

    int-to-byte v4, v4

    aget-byte v5, v2, v26

    int-to-byte v5, v5

    invoke-static {v3, v4, v5}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const/16 v5, 0xfa

    int-to-short v5, v5

    aget-byte v7, v2, v17

    int-to-byte v7, v7

    aget-byte v9, v2, v26

    int-to-byte v9, v9

    invoke-static {v5, v7, v9}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    filled-new-array {v4, v5}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0
    :try_end_82
    .catchall {:try_start_82 .. :try_end_82} :catchall_4c

    :try_start_83
    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    aget-byte v4, v2, v38

    int-to-byte v4, v4

    aget-byte v5, v2, v26

    int-to-byte v5, v5

    invoke-static {v3, v4, v5}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    const/16 v4, 0xe6

    int-to-short v4, v4

    aget-byte v5, v2, v62

    neg-int v5, v5

    int-to-byte v5, v5

    aget-byte v7, v2, v30

    int-to-byte v7, v7

    invoke-static {v4, v5, v7}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v4

    filled-new-array/range {v60 .. v60}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    const/4 v14, 0x0

    invoke-virtual {v3, v14, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_83
    .catchall {:try_start_83 .. :try_end_83} :catchall_4d

    :try_start_84
    filled-new-array {v1, v8}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_84
    .catchall {:try_start_84 .. :try_end_84} :catchall_4c

    :try_start_85
    sget v1, Lcom/appsflyer/internal/AFi1nSDK;->$$b:I
    :try_end_85
    .catch Ljava/lang/Exception; {:try_start_85 .. :try_end_85} :catch_16
    .catchall {:try_start_85 .. :try_end_85} :catchall_46

    xor-int/lit8 v3, v1, 0x60

    and-int/lit8 v1, v1, 0x60

    or-int/2addr v1, v3

    int-to-short v1, v1

    const/16 v27, 0x6

    :try_start_86
    aget-byte v3, v2, v27

    int-to-byte v3, v3

    aget-byte v4, v2, v68

    int-to-byte v4, v4

    invoke-static {v1, v3, v4}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/16 v3, 0xc4

    int-to-short v3, v3

    const/16 v4, 0xea

    aget-byte v4, v2, v4

    int-to-byte v4, v4

    const/16 v5, 0xfd

    aget-byte v5, v2, v5

    int-to-byte v5, v5

    invoke-static {v3, v4, v5}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    const/4 v14, 0x1

    invoke-virtual {v1, v14}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v1, v8}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    const/16 v5, 0xbd

    int-to-short v5, v5

    aget-byte v7, v2, v32

    int-to-byte v7, v7

    const/16 v9, 0x25

    aget-byte v9, v2, v9

    int-to-byte v9, v9

    invoke-static {v5, v7, v9}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v5

    const/4 v14, 0x1

    invoke-virtual {v5, v14}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const/16 v7, 0xa6

    int-to-short v7, v7

    const/16 v9, 0x14

    aget-byte v9, v2, v9

    int-to-byte v9, v9

    const/16 v10, 0x25

    aget-byte v10, v2, v10

    int-to-byte v10, v10

    invoke-static {v7, v9, v10}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v4

    const/4 v14, 0x1

    invoke-virtual {v4, v14}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v5, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v4, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    new-instance v9, Ljava/util/ArrayList;

    check-cast v7, Ljava/util/List;

    invoke-direct {v9, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7
    :try_end_86
    .catch Ljava/lang/Exception; {:try_start_86 .. :try_end_86} :catch_15
    .catchall {:try_start_86 .. :try_end_86} :catchall_45

    const/16 v10, 0x8e

    int-to-short v10, v10

    const/16 v11, 0xad

    :try_start_87
    aget-byte v11, v2, v11

    int-to-byte v11, v11

    const/16 v21, 0x4

    aget-byte v2, v2, v21

    int-to-byte v2, v2

    invoke-static {v10, v11, v2}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v2
    :try_end_87
    .catchall {:try_start_87 .. :try_end_87} :catchall_44

    move-object/from16 v10, v69

    const/4 v14, 0x0

    :try_start_88
    invoke-virtual {v10, v2, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v7, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Class;
    :try_end_88
    .catchall {:try_start_88 .. :try_end_88} :catchall_43

    :try_start_89
    invoke-static {v3}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v7

    invoke-static {v2, v7}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v2
    :try_end_89
    .catch Ljava/lang/Exception; {:try_start_89 .. :try_end_89} :catch_11
    .catchall {:try_start_89 .. :try_end_89} :catchall_42

    move/from16 v11, v17

    :goto_4c
    if-ge v11, v7, :cond_41

    sget v12, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    xor-int/lit8 v14, v12, 0x3d

    and-int/lit8 v12, v12, 0x3d

    const/16 v23, 0x1

    shl-int/lit8 v12, v12, 0x1

    add-int/2addr v14, v12

    rem-int/lit16 v14, v14, 0x80

    sput v14, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    :try_start_8a
    invoke-static {v3, v11}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v12

    invoke-static {v2, v11, v12}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V
    :try_end_8a
    .catch Ljava/lang/Exception; {:try_start_8a .. :try_end_8a} :catch_11
    .catchall {:try_start_8a .. :try_end_8a} :catchall_33

    and-int/lit8 v12, v11, 0x54

    or-int/lit8 v11, v11, 0x54

    add-int/2addr v12, v11

    or-int/lit8 v11, v12, -0x53

    const/16 v23, 0x1

    shl-int/lit8 v11, v11, 0x1

    xor-int/lit8 v12, v12, -0x53

    sub-int/2addr v11, v12

    goto :goto_4c

    :catchall_33
    move-exception v0

    move-object v2, v0

    move-object/from16 v7, v58

    move-object/from16 v1, v66

    move-object/from16 v5, v70

    :goto_4d
    const/16 v20, 0x56

    :goto_4e
    const/16 v21, 0x4

    goto/16 :goto_69

    :catch_11
    move-exception v0

    move-object/from16 v7, v58

    :goto_4f
    move-object/from16 v5, v70

    const/16 v20, 0x56

    goto/16 :goto_5c

    :cond_41
    :try_start_8b
    invoke-virtual {v5, v1, v9}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v1, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_8b
    .catch Ljava/lang/Exception; {:try_start_8b .. :try_end_8b} :catch_11
    .catchall {:try_start_8b .. :try_end_8b} :catchall_42

    sget v1, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    add-int/lit8 v1, v1, 0x53

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    :try_start_8c
    sget-object v1, Lcom/appsflyer/internal/AFi1nSDK;->stop:Ljava/lang/Object;
    :try_end_8c
    .catchall {:try_start_8c .. :try_end_8c} :catchall_42

    if-nez v1, :cond_36

    :try_start_8d
    sput-object v0, Lcom/appsflyer/internal/AFi1nSDK;->stop:Ljava/lang/Object;
    :try_end_8d
    .catchall {:try_start_8d .. :try_end_8d} :catchall_33

    goto/16 :goto_43

    :goto_50
    if-eqz v39, :cond_44

    sget v0, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    add-int/lit8 v0, v0, 0x47

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    const/16 v0, 0x1e0

    int-to-short v0, v0

    :try_start_8e
    sget-object v2, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v3, v2, v17

    int-to-byte v3, v3

    aget-byte v4, v2, v68

    int-to-byte v4, v4

    invoke-static {v0, v3, v4}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/16 v3, 0x7b

    int-to-short v3, v3

    aget-byte v4, v2, v56

    int-to-byte v4, v4

    aget-byte v5, v2, v48

    int-to-byte v5, v5

    invoke-static {v3, v4, v5}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0xfa

    int-to-short v4, v4

    aget-byte v5, v2, v17

    int-to-byte v5, v5

    aget-byte v7, v2, v26

    int-to-byte v7, v7

    invoke-static {v4, v5, v7}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    filled-new-array {v13, v4}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    const/4 v14, 0x1

    invoke-virtual {v3, v14}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_8e
    .catchall {:try_start_8e .. :try_end_8e} :catchall_37

    :try_start_8f
    sget v4, Lcom/appsflyer/internal/AFi1nSDK;->$$b:I

    or-int/lit16 v4, v4, 0x130

    int-to-short v4, v4

    aget-byte v5, v2, v25

    neg-int v5, v5

    int-to-byte v5, v5

    const/16 v21, 0x4

    aget-byte v7, v2, v21

    int-to-byte v7, v7

    invoke-static {v4, v5, v7}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v4

    const/4 v14, 0x0

    invoke-virtual {v10, v4, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4
    :try_end_8f
    .catchall {:try_start_8f .. :try_end_8f} :catchall_36

    move-object/from16 v5, v70

    :try_start_90
    invoke-virtual {v4, v5, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_90
    .catchall {:try_start_90 .. :try_end_90} :catchall_35

    move-object/from16 v7, v65

    :try_start_91
    filled-new-array {v7, v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_42

    const/16 v9, 0x309

    int-to-short v4, v9

    aget-byte v7, v2, v16

    int-to-byte v7, v7

    const/16 v20, 0x56

    aget-byte v2, v2, v20

    int-to-byte v2, v2

    invoke-static {v4, v7, v2}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v2

    const/4 v14, 0x0

    invoke-virtual {v0, v2, v14}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v1, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_91
    .catchall {:try_start_91 .. :try_end_91} :catchall_34

    goto :goto_52

    :catchall_34
    move-exception v0

    :goto_51
    move-object v2, v0

    move-object/from16 v7, v58

    move-object/from16 v1, v66

    goto/16 :goto_4d

    :cond_42
    :goto_52
    sget v0, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    add-int/lit8 v0, v0, 0x27

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    move-object v0, v3

    goto :goto_54

    :catchall_35
    move-exception v0

    goto :goto_53

    :catchall_36
    move-exception v0

    move-object/from16 v5, v70

    :goto_53
    :try_start_92
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_43

    throw v1

    :cond_43
    throw v0
    :try_end_92
    .catchall {:try_start_92 .. :try_end_92} :catchall_34

    :catchall_37
    move-exception v0

    move-object/from16 v5, v70

    goto :goto_51

    :cond_44
    move-object/from16 v7, v65

    move-object/from16 v5, v70

    const/16 v0, 0xfa

    int-to-short v0, v0

    :try_start_93
    sget-object v2, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v3, v2, v17

    int-to-byte v3, v3

    aget-byte v4, v2, v26

    int-to-byte v4, v4

    invoke-static {v0, v3, v4}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/16 v3, 0x7b

    int-to-short v3, v3

    aget-byte v4, v2, v56

    int-to-byte v4, v4

    aget-byte v2, v2, v48

    int-to-byte v2, v2

    invoke-static {v3, v4, v2}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v13}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0
    :try_end_93
    .catchall {:try_start_93 .. :try_end_93} :catchall_3f

    const/4 v14, 0x1

    :try_start_94
    invoke-virtual {v0, v14}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_94
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_94 .. :try_end_94} :catch_12
    .catchall {:try_start_94 .. :try_end_94} :catchall_34

    goto :goto_54

    :catch_12
    move-exception v0

    :try_start_95
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    throw v0
    :try_end_95
    .catch Ljava/lang/ClassNotFoundException; {:try_start_95 .. :try_end_95} :catch_13
    .catchall {:try_start_95 .. :try_end_95} :catchall_34

    :catch_13
    const/4 v0, 0x0

    :goto_54
    if-eqz v0, :cond_49

    :try_start_96
    check-cast v0, Ljava/lang/Class;

    const/16 v2, 0x73

    int-to-short v2, v2

    sget-object v3, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    const/16 v21, 0x4

    aget-byte v4, v3, v21
    :try_end_96
    .catchall {:try_start_96 .. :try_end_96} :catchall_3f

    int-to-byte v4, v4

    const/16 v20, 0x56

    :try_start_97
    aget-byte v7, v3, v20
    :try_end_97
    .catchall {:try_start_97 .. :try_end_97} :catchall_40

    int-to-byte v7, v7

    :try_start_98
    invoke-static {v2, v4, v7}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v2

    const-class v4, Ljava/lang/Object;

    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v4, v7}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    const/4 v14, 0x1

    invoke-virtual {v4, v14}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    xor-int/lit8 v7, v39, 0x1

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    filled-new-array {v1, v7}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    sput-object v1, Lcom/appsflyer/internal/AFi1nSDK;->enableTCFDataCollection:Ljava/lang/Object;

    const/16 v1, 0xf84

    new-array v1, v1, [B

    const/16 v4, 0x53

    int-to-short v4, v4

    aget-byte v7, v3, v30

    int-to-byte v7, v7

    const/16 v8, 0x292

    aget-byte v8, v3, v8

    int-to-byte v8, v8

    invoke-static {v4, v7, v8}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v4

    const/4 v14, 0x1

    invoke-virtual {v4, v14}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4
    :try_end_98
    .catchall {:try_start_98 .. :try_end_98} :catchall_3f

    move-object/from16 v7, v58

    :try_start_99
    invoke-virtual {v7, v4}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v4

    invoke-virtual {v7, v4}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v4
    :try_end_99
    .catchall {:try_start_99 .. :try_end_99} :catchall_3e

    :try_start_9a
    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    sget v8, Lcom/appsflyer/internal/AFi1nSDK;->$$b:I

    or-int/lit16 v9, v8, 0x234

    int-to-short v9, v9

    aget-byte v11, v3, v19

    int-to-byte v11, v11

    aget-byte v12, v3, v26

    int-to-byte v12, v12

    invoke-static {v9, v11, v12}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    aget-byte v11, v3, v38

    int-to-byte v11, v11

    aget-byte v12, v3, v26

    int-to-byte v12, v12

    move/from16 v14, v64

    invoke-static {v14, v11, v12}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v11

    filled-new-array {v11}, [Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v9, v11}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v9

    invoke-virtual {v9, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_9a
    .catchall {:try_start_9a .. :try_end_9a} :catchall_3d

    :try_start_9b
    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    or-int/lit16 v9, v8, 0x208

    int-to-short v9, v9

    aget-byte v11, v3, v37

    int-to-byte v11, v11

    aget-byte v12, v3, v26

    int-to-byte v12, v12

    invoke-static {v9, v11, v12}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    aget-byte v11, v3, v38

    int-to-byte v11, v11

    aget-byte v12, v3, v26

    int-to-byte v12, v12

    invoke-static {v14, v11, v12}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v11

    filled-new-array {v11}, [Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v9, v11}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v9

    invoke-virtual {v9, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_9b
    .catchall {:try_start_9b .. :try_end_9b} :catchall_3c

    sget v9, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    and-int/lit8 v11, v9, 0x5b

    or-int/lit8 v9, v9, 0x5b

    add-int/2addr v11, v9

    rem-int/lit16 v11, v11, 0x80

    sput v11, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    :try_start_9c
    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v9

    xor-int/lit16 v11, v8, 0x208

    and-int/lit16 v12, v8, 0x208

    or-int/2addr v11, v12

    int-to-short v11, v11

    aget-byte v12, v3, v37

    int-to-byte v12, v12

    aget-byte v14, v3, v26

    int-to-byte v14, v14

    invoke-static {v11, v12, v14}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v11

    const/16 v12, 0x275

    int-to-short v12, v12

    aget-byte v14, v3, v56

    int-to-byte v14, v14

    const/16 v15, 0xae

    aget-byte v15, v3, v15

    int-to-byte v15, v15

    invoke-static {v12, v14, v15}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v12

    filled-new-array/range {v60 .. v60}, [Ljava/lang/Class;

    move-result-object v14

    invoke-virtual {v11, v12, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v11

    invoke-virtual {v11, v4, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_9c
    .catchall {:try_start_9c .. :try_end_9c} :catchall_3b

    xor-int/lit16 v9, v8, 0x208

    and-int/lit16 v8, v8, 0x208

    or-int/2addr v8, v9

    int-to-short v8, v8

    :try_start_9d
    aget-byte v9, v3, v37

    int-to-byte v9, v9

    aget-byte v11, v3, v26

    int-to-byte v11, v11

    invoke-static {v8, v9, v11}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    const/16 v9, 0x309

    int-to-short v11, v9

    aget-byte v12, v3, v16
    :try_end_9d
    .catchall {:try_start_9d .. :try_end_9d} :catchall_3a

    int-to-byte v12, v12

    const/16 v20, 0x56

    :try_start_9e
    aget-byte v3, v3, v20

    int-to-byte v3, v3

    invoke-static {v11, v12, v3}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v3

    const/4 v14, 0x0

    invoke-virtual {v8, v3, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-virtual {v3, v4, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_9e
    .catchall {:try_start_9e .. :try_end_9e} :catchall_39

    :try_start_9f
    invoke-static/range {v61 .. v61}, Ljava/lang/Math;->abs(I)I

    move-result v3

    const/16 v15, 0xf58

    move-object/from16 v50, v0

    move-object v0, v1

    move-object v1, v5

    move/from16 v11, v57

    move-object/from16 v12, v59

    move-object/from16 v4, v60

    const/16 v21, 0x4

    move v5, v3

    move-object v3, v10

    move-object v10, v2

    move-object/from16 v2, v66

    goto/16 :goto_2c

    :catchall_38
    move-exception v0

    :goto_55
    move-object v2, v0

    move-object/from16 v1, v66

    goto/16 :goto_4e

    :catchall_39
    move-exception v0

    goto :goto_56

    :catchall_3a
    move-exception v0

    const/16 v20, 0x56

    :goto_56
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_45

    throw v1

    :cond_45
    throw v0

    :catchall_3b
    move-exception v0

    const/16 v20, 0x56

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_46

    throw v1

    :cond_46
    throw v0

    :catchall_3c
    move-exception v0

    const/16 v20, 0x56

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_47

    throw v1

    :cond_47
    throw v0

    :catchall_3d
    move-exception v0

    const/16 v20, 0x56

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_48

    throw v1

    :cond_48
    throw v0

    :catchall_3e
    move-exception v0

    :goto_57
    const/16 v20, 0x56

    goto :goto_55

    :catchall_3f
    move-exception v0

    move-object/from16 v7, v58

    goto :goto_57

    :catchall_40
    move-exception v0

    move-object/from16 v7, v58

    goto :goto_55

    :cond_49
    move-object/from16 v7, v58

    const/16 v20, 0x56

    const-class v0, Ljava/lang/Object;

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v0, v2}, [Ljava/lang/Class;

    move-result-object v0

    move-object/from16 v2, v50

    invoke-virtual {v2, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    const/4 v14, 0x1

    invoke-virtual {v0, v14}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_9f
    .catchall {:try_start_9f .. :try_end_9f} :catchall_38

    if-nez v39, :cond_4a

    sget v2, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    and-int/lit8 v3, v2, 0x1b

    or-int/lit8 v2, v2, 0x1b

    add-int/2addr v3, v2

    rem-int/lit16 v2, v3, 0x80

    sput v2, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    const/16 v28, 0x2

    rem-int/lit8 v3, v3, 0x2

    if-nez v3, :cond_4b

    :cond_4a
    move/from16 v2, v17

    goto :goto_58

    :cond_4b
    const/4 v2, 0x1

    :goto_58
    :try_start_a0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sput-object v0, Lcom/appsflyer/internal/AFi1nSDK;->enableTCFDataCollection:Ljava/lang/Object;
    :try_end_a0
    .catchall {:try_start_a0 .. :try_end_a0} :catchall_38

    :try_start_a1
    invoke-virtual {v7}, Ljava/util/zip/ZipFile;->close()V
    :try_end_a1
    .catchall {:try_start_a1 .. :try_end_a1} :catchall_41

    move/from16 v2, v30

    move/from16 v3, v40

    move-object/from16 v1, v66

    const/4 v7, 0x2

    const/16 v21, 0x4

    const/16 v34, 0x0

    const/16 v43, 0x1

    goto/16 :goto_6e

    :catchall_41
    move-exception v0

    move-object/from16 v1, v66

    const/16 v21, 0x4

    goto/16 :goto_6b

    :catchall_42
    move-exception v0

    move-object/from16 v7, v58

    :goto_59
    move-object/from16 v5, v70

    goto :goto_57

    :catchall_43
    move-exception v0

    move-object/from16 v7, v58

    :goto_5a
    move-object/from16 v5, v70

    const/16 v20, 0x56

    goto :goto_5b

    :catchall_44
    move-exception v0

    move-object/from16 v7, v58

    move-object/from16 v10, v69

    goto :goto_5a

    :goto_5b
    :try_start_a2
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_4c

    throw v1

    :catch_14
    move-exception v0

    goto :goto_5c

    :cond_4c
    throw v0
    :try_end_a2
    .catch Ljava/lang/Exception; {:try_start_a2 .. :try_end_a2} :catch_14
    .catchall {:try_start_a2 .. :try_end_a2} :catchall_38

    :catchall_45
    move-exception v0

    move-object/from16 v7, v58

    move-object/from16 v10, v69

    goto :goto_59

    :catch_15
    move-exception v0

    move-object/from16 v7, v58

    move-object/from16 v10, v69

    goto/16 :goto_4f

    :catchall_46
    move-exception v0

    move-object/from16 v7, v58

    move-object/from16 v10, v69

    move-object/from16 v5, v70

    const/16 v20, 0x56

    const/16 v27, 0x6

    goto/16 :goto_55

    :catch_16
    move-exception v0

    move-object/from16 v7, v58

    move-object/from16 v10, v69

    move-object/from16 v5, v70

    const/16 v20, 0x56

    const/16 v27, 0x6

    :goto_5c
    :try_start_a3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget v2, Lcom/appsflyer/internal/AFi1nSDK;->$$b:I
    :try_end_a3
    .catchall {:try_start_a3 .. :try_end_a3} :catchall_4b

    const/16 v21, 0x4

    add-int/lit8 v2, v2, -0x4

    int-to-short v2, v2

    :try_start_a4
    sget-object v3, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v4, v3, v16

    int-to-byte v4, v4

    aget-byte v9, v3, v36

    int-to-byte v9, v9

    invoke-static {v2, v4, v9}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v2, 0x342

    int-to-short v4, v2

    aget-byte v2, v3, v42

    int-to-byte v2, v2

    aget-byte v8, v3, v41

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    long-to-int v9, v11

    mul-int/lit16 v11, v8, -0x29b

    const/16 v12, 0x537

    or-int v14, v12, v11

    const/16 v23, 0x1

    shl-int/lit8 v14, v14, 0x1

    xor-int/2addr v11, v12

    sub-int/2addr v14, v11

    not-int v8, v8

    const/16 v63, -0x1

    xor-int v11, v63, v9

    or-int/2addr v9, v11

    not-int v9, v9

    xor-int v11, v8, v9

    and-int/2addr v8, v9

    or-int/2addr v8, v11

    mul-int/lit16 v8, v8, -0x29c

    neg-int v8, v8

    neg-int v8, v8

    xor-int v9, v14, v8

    and-int/2addr v8, v14

    const/16 v23, 0x1

    shl-int/lit8 v8, v8, 0x1

    add-int/2addr v9, v8

    add-int/lit16 v9, v9, -0x538

    or-int/lit16 v8, v9, -0x29c

    shl-int/lit8 v8, v8, 0x1

    xor-int/lit16 v9, v9, -0x29c

    sub-int/2addr v8, v9

    int-to-byte v8, v8

    invoke-static {v4, v2, v8}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_a4
    .catchall {:try_start_a4 .. :try_end_a4} :catchall_4a

    const/4 v11, 0x2

    :try_start_a5
    new-array v2, v11, [Ljava/lang/Object;

    const/16 v23, 0x1

    aput-object v0, v2, v23

    aput-object v1, v2, v17

    aget-byte v0, v3, v38

    int-to-byte v0, v0

    aget-byte v1, v3, v26

    int-to-byte v1, v1

    invoke-static {v4, v0, v1}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_a5
    .catchall {:try_start_a5 .. :try_end_a5} :catchall_48

    move-object/from16 v1, v66

    :try_start_a6
    filled-new-array {v13, v1}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0
    :try_end_a6
    .catchall {:try_start_a6 .. :try_end_a6} :catchall_47

    :catchall_47
    move-exception v0

    goto :goto_5d

    :catchall_48
    move-exception v0

    move-object/from16 v1, v66

    :goto_5d
    :try_start_a7
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_4d

    throw v2

    :catchall_49
    move-exception v0

    goto/16 :goto_30

    :cond_4d
    throw v0

    :catchall_4a
    move-exception v0

    move-object/from16 v1, v66

    goto/16 :goto_30

    :catchall_4b
    move-exception v0

    move-object/from16 v1, v66

    const/16 v21, 0x4

    goto/16 :goto_30

    :catchall_4c
    move-exception v0

    move-object/from16 v7, v58

    move-object/from16 v1, v66

    move-object/from16 v10, v69

    move-object/from16 v5, v70

    goto/16 :goto_37

    :catchall_4d
    move-exception v0

    move-object/from16 v7, v58

    move-object/from16 v1, v66

    move-object/from16 v10, v69

    move-object/from16 v5, v70

    const/16 v20, 0x56

    const/16 v21, 0x4

    const/16 v27, 0x6

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_4e

    throw v2

    :cond_4e
    throw v0

    :catchall_4e
    move-exception v0

    move-object v5, v2

    move-object v10, v3

    goto/16 :goto_40

    :catchall_4f
    move-exception v0

    move-object v5, v2

    move-object v10, v3

    move-object/from16 v7, v58

    move-object/from16 v1, v66

    goto/16 :goto_38

    :catchall_50
    move-exception v0

    move-object v5, v2

    move-object v10, v3

    move-object/from16 v60, v4

    goto/16 :goto_40

    :catchall_51
    move-exception v0

    move-object v5, v2

    move-object v10, v3

    move-object/from16 v60, v4

    goto/16 :goto_36

    :catchall_52
    move-exception v0

    move-object v5, v2

    move-object v10, v3

    move-object/from16 v60, v4

    move-object/from16 v7, v58

    goto/16 :goto_38

    :catchall_53
    move-exception v0

    move-object v5, v2

    move-object v10, v3

    move-object/from16 v60, v4

    move-object/from16 v7, v58

    const/16 v20, 0x56

    const/16 v21, 0x4

    :goto_5e
    const/16 v27, 0x6

    goto :goto_5f

    :catchall_54
    move-exception v0

    move-object v5, v2

    move-object v10, v3

    move-object/from16 v60, v4

    move-object/from16 v7, v58

    const/16 v20, 0x56

    goto :goto_5e

    :goto_5f
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_4f

    throw v2

    :cond_4f
    throw v0

    :catchall_55
    move-exception v0

    move-object v5, v2

    move-object v10, v3

    move-object/from16 v60, v4

    move-object/from16 v7, v58

    const/16 v20, 0x56

    const/16 v21, 0x4

    const/16 v27, 0x6

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_50

    throw v2

    :cond_50
    throw v0

    :catchall_56
    move-exception v0

    move-object v5, v2

    move-object v10, v3

    move-object/from16 v60, v4

    :goto_60
    move-object/from16 v7, v58

    const/16 v20, 0x56

    goto/16 :goto_39

    :catchall_57
    move-exception v0

    move-object v5, v2

    move-object v10, v3

    move-object/from16 v60, v4

    move/from16 v57, v11

    goto :goto_60

    :catchall_58
    move-exception v0

    move-object v5, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v60, v4

    move/from16 v57, v11

    move-object/from16 v7, v58

    :goto_61
    const/16 v20, 0x56

    :goto_62
    const/16 v21, 0x4

    :goto_63
    const/16 v27, 0x6

    goto :goto_65

    :catchall_59
    move-exception v0

    move-object v5, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v60, v4

    move/from16 v57, v11

    goto :goto_61

    :catchall_5a
    move-exception v0

    move-object v5, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v60, v4

    move/from16 v57, v11

    goto :goto_62

    :catchall_5b
    move-exception v0

    move-object v5, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v60, v4

    move/from16 v57, v11

    const/16 v20, 0x56

    goto :goto_63

    :catchall_5c
    move-exception v0

    move-object v5, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v60, v4

    move/from16 v57, v11

    const/16 v20, 0x56

    const/16 v21, 0x4

    :goto_64
    const/16 v27, 0x6

    const/16 v29, 0x3

    goto :goto_65

    :catchall_5d
    move-exception v0

    move-object v5, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v60, v4

    move/from16 v57, v11

    move/from16 v21, v15

    const/16 v20, 0x56

    goto :goto_64

    :goto_65
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_51

    throw v2

    :cond_51
    throw v0

    :catchall_5e
    move-exception v0

    goto/16 :goto_33

    :catchall_5f
    move-exception v0

    move-object v5, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v60, v4

    move/from16 v57, v11

    const/16 v20, 0x56

    const/16 v29, 0x3

    goto/16 :goto_2f

    :catchall_60
    move-exception v0

    move-object v5, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v60, v4

    move/from16 v57, v11

    const/16 v20, 0x56

    const/16 v29, 0x3

    const/16 v33, 0x5

    goto :goto_66

    :catchall_61
    move-exception v0

    move-object v10, v3

    move-object/from16 v60, v4

    move/from16 v29, v5

    move/from16 v57, v11

    const/16 v20, 0x56

    const/16 v33, 0x5

    move-object v5, v1

    move-object v1, v2

    :goto_66
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_52

    throw v2

    :cond_52
    throw v0

    :catchall_62
    move-exception v0

    move-object v5, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v60, v4

    move/from16 v57, v11

    goto/16 :goto_2e

    :catchall_63
    move-exception v0

    move-object v5, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v60, v4

    move/from16 v57, v11

    move-object/from16 v59, v12

    const/16 v20, 0x56

    :goto_67
    const/16 v33, 0x5

    goto :goto_68

    :catchall_64
    move-exception v0

    move-object v5, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v60, v4

    move/from16 v57, v11

    move-object/from16 v59, v12

    goto :goto_67

    :goto_68
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_53

    throw v2

    :cond_53
    throw v0

    :catchall_65
    move-exception v0

    move-object v5, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v60, v4

    move/from16 v57, v11

    move-object/from16 v59, v12

    const/16 v20, 0x56

    const/16 v33, 0x5

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_54

    throw v2

    :cond_54
    throw v0

    :catchall_66
    move-exception v0

    move-object v5, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v60, v4

    move/from16 v57, v11

    move-object/from16 v59, v12

    const/16 v20, 0x56

    const/16 v33, 0x5

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_55

    throw v2

    :cond_55
    throw v0

    :catchall_67
    move-exception v0

    move-object v5, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v60, v4

    move/from16 v57, v11

    move-object/from16 v59, v12

    const/16 v20, 0x56

    const/16 v33, 0x5

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_56

    throw v2

    :cond_56
    throw v0
    :try_end_a7
    .catchall {:try_start_a7 .. :try_end_a7} :catchall_49

    :goto_69
    :try_start_a8
    invoke-virtual {v7}, Ljava/util/zip/ZipFile;->close()V
    :try_end_a8
    .catchall {:try_start_a8 .. :try_end_a8} :catchall_68

    goto :goto_6a

    :catchall_68
    move-exception v0

    :try_start_a9
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6a
    throw v2

    :catchall_69
    move-exception v0

    goto/16 :goto_6b

    :catchall_6a
    move-exception v0

    move-object v5, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v60, v4

    move/from16 v57, v11

    move-object/from16 v59, v12

    const/16 v20, 0x56

    goto/16 :goto_1b

    :catchall_6b
    move-exception v0

    move-object v5, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v60, v4

    move/from16 v33, v8

    move/from16 v57, v11

    move-object/from16 v59, v12

    const/16 v20, 0x56

    goto :goto_6b

    :catchall_6c
    move-exception v0

    move-object v5, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v60, v4

    move/from16 v57, v11

    move-object/from16 v59, v12

    const/16 v33, 0x5

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_57

    throw v2

    :cond_57
    throw v0

    :catchall_6d
    move-exception v0

    move-object v5, v1

    move-object v1, v2

    move-object v10, v3

    move-object/from16 v60, v4

    move/from16 v57, v11

    move-object/from16 v59, v12

    const/16 v33, 0x5

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_58

    throw v2

    :cond_58
    throw v0
    :try_end_a9
    .catchall {:try_start_a9 .. :try_end_a9} :catchall_69

    :catchall_6e
    move-exception v0

    move-object v5, v1

    move-object v1, v2

    move-object/from16 v60, v4

    move-object/from16 v44, v7

    move-object/from16 v46, v8

    move-object/from16 v45, v9

    goto/16 :goto_18

    :goto_6b
    :try_start_aa
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    long-to-int v2, v2

    move/from16 v3, v40

    mul-int/lit16 v14, v3, 0x2c9

    neg-int v4, v14

    neg-int v4, v4

    not-int v4, v4

    rsub-int v4, v4, -0x2c8

    not-int v7, v3

    xor-int/lit8 v8, v7, 0x1

    and-int/lit8 v9, v7, 0x1

    or-int/2addr v8, v9

    not-int v8, v8

    not-int v9, v2

    or-int/lit8 v11, v9, 0x1

    not-int v11, v11

    xor-int v12, v8, v11

    and-int/2addr v8, v11

    or-int/2addr v8, v12

    mul-int/lit16 v8, v8, -0x2c8

    xor-int v11, v4, v8

    and-int/2addr v4, v8

    const/16 v23, 0x1

    shl-int/lit8 v4, v4, 0x1

    add-int/2addr v11, v4

    xor-int v4, v7, v9

    and-int v8, v7, v9

    or-int/2addr v4, v8

    xor-int/lit8 v8, v4, 0x1

    and-int/lit8 v4, v4, 0x1

    or-int/2addr v4, v8

    not-int v4, v4

    xor-int/lit8 v8, v3, 0x1

    and-int/lit8 v9, v3, 0x1

    or-int/2addr v8, v9

    xor-int v9, v8, v2

    and-int/2addr v8, v2

    or-int/2addr v8, v9

    not-int v8, v8

    xor-int v9, v4, v8

    and-int/2addr v4, v8

    or-int/2addr v4, v9

    mul-int/lit16 v4, v4, -0x2c8

    neg-int v4, v4

    neg-int v4, v4

    and-int v8, v11, v4

    or-int/2addr v4, v11

    add-int/2addr v8, v4

    not-int v2, v2

    xor-int/lit8 v4, v2, 0x1

    const/16 v23, 0x1

    and-int/lit8 v2, v2, 0x1

    or-int/2addr v2, v4

    not-int v2, v2

    xor-int v4, v7, v2

    and-int/2addr v2, v7

    or-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x2c8

    add-int/2addr v8, v2

    move/from16 v2, v30

    :goto_6c
    if-ge v8, v2, :cond_5a

    aget-boolean v4, v59, v8

    if-eqz v4, :cond_59

    const/16 v34, 0x0

    sput-object v34, Lcom/appsflyer/internal/AFi1nSDK;->enableTCFDataCollection:Ljava/lang/Object;

    sput-object v34, Lcom/appsflyer/internal/AFi1nSDK;->stop:Ljava/lang/Object;

    :goto_6d
    const/4 v7, 0x2

    goto/16 :goto_6e

    :cond_59
    const/16 v34, 0x0

    add-int/lit8 v8, v8, 0x1

    goto :goto_6c

    :cond_5a
    sget-object v2, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    aget-byte v3, v2, v25

    neg-int v3, v3

    int-to-short v3, v3

    aget-byte v4, v2, v37

    int-to-byte v4, v4

    aget-byte v5, v2, v36

    int-to-byte v5, v5

    invoke-static {v3, v4, v5}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v3
    :try_end_aa
    .catch Ljava/lang/Exception; {:try_start_aa .. :try_end_aa} :catch_17

    sget v4, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    add-int/lit8 v4, v4, 0x2b

    rem-int/lit16 v4, v4, 0x80

    sput v4, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    or-int/lit8 v5, v4, 0x29

    const/16 v23, 0x1

    shl-int/lit8 v5, v5, 0x1

    xor-int/lit8 v4, v4, 0x29

    sub-int/2addr v5, v4

    rem-int/lit16 v5, v5, 0x80

    sput v5, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    const/4 v7, 0x2

    :try_start_ab
    new-array v4, v7, [Ljava/lang/Object;

    aput-object v0, v4, v23

    aput-object v3, v4, v17

    const/16 v7, 0x342

    int-to-short v0, v7

    aget-byte v3, v2, v38

    int-to-byte v3, v3

    aget-byte v2, v2, v26

    int-to-byte v2, v2

    invoke-static {v0, v3, v2}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

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
    :try_end_ab
    .catchall {:try_start_ab .. :try_end_ab} :catchall_6f

    :catchall_6f
    move-exception v0

    :try_start_ac
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_5b

    throw v1

    :cond_5b
    throw v0

    :cond_5c
    move-object/from16 v60, v4

    move/from16 v35, v5

    move-object/from16 v44, v7

    move-object/from16 v46, v8

    move-object/from16 v45, v9

    move/from16 v43, v10

    move/from16 v57, v11

    move-object/from16 v55, v12

    move-object/from16 v59, v15

    const/16 v33, 0x5

    const/16 v34, 0x0

    move-object v5, v1

    move-object v1, v2

    move-object v10, v3

    move v3, v14

    move/from16 v2, v30

    goto :goto_6d

    :goto_6e
    or-int/lit8 v0, v3, 0x1

    const/16 v23, 0x1

    shl-int/lit8 v0, v0, 0x1

    xor-int/lit8 v3, v3, 0x1

    sub-int v14, v0, v3

    move/from16 v30, v2

    move-object v3, v10

    move/from16 v10, v43

    move-object/from16 v7, v44

    move-object/from16 v9, v45

    move-object/from16 v8, v46

    move-object/from16 v12, v55

    move/from16 v11, v57

    move-object/from16 v15, v59

    move-object/from16 v4, v60

    move-object v2, v1

    move-object v1, v5

    move/from16 v5, v35

    goto/16 :goto_13

    :cond_5d
    :goto_6f
    return-void

    :catchall_70
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_5e

    throw v1

    :cond_5e
    throw v0

    :catchall_71
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_5f

    throw v1

    :cond_5f
    throw v0

    :catchall_72
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_60

    throw v1

    :cond_60
    throw v0
    :try_end_ac
    .catch Ljava/lang/Exception; {:try_start_ac .. :try_end_ac} :catch_17

    :catch_17
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catchall_73
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_61

    throw v1

    :cond_61
    throw v0

    nop

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
        -0x14t
        -0x7ct
        -0x3ft
        0x5dt
        -0x5et
        -0x60t
        -0xct
        -0x6ct
        0x29t
        -0x29t
        -0x57t
        -0x68t
        -0x3et
        0x7ct
        0x72t
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static AFKeystoreWrapper(IIC)Ljava/lang/Object;
    .locals 4

    sget v0, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    sget-object v1, Lcom/appsflyer/internal/AFi1nSDK;->enableTCFDataCollection:Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x23

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    or-int/lit8 v2, v0, 0x5b

    const/4 v3, 0x1

    shl-int/2addr v2, v3

    xor-int/lit8 v0, v0, 0x5b

    sub-int/2addr v2, v0

    rem-int/lit16 v2, v2, 0x80

    sput v2, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    const/4 v0, 0x3

    :try_start_0
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p2

    const/4 v2, 0x2

    aput-object p2, v0, v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v0, v3

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 p1, 0x0

    aput-object p0, v0, p1

    const/16 p0, 0x234

    int-to-short p0, p0

    sget-object p1, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    const/4 p2, 0x4

    aget-byte p2, p1, p2

    int-to-byte p2, p2

    const/16 v2, 0x56

    aget-byte v2, p1, v2

    int-to-byte v2, v2

    invoke-static {p0, p2, v2}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object p0

    sget-object p2, Lcom/appsflyer/internal/AFi1nSDK;->stop:Ljava/lang/Object;

    check-cast p2, Ljava/lang/ClassLoader;

    invoke-static {p0, v3, p2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p0

    const/16 p2, 0x5e

    aget-byte p2, p1, p2

    int-to-short p2, p2

    const/16 v2, 0x235

    aget-byte v2, p1, v2

    neg-int v2, v2

    int-to-byte v2, v2

    const/16 v3, 0xae

    aget-byte p1, p1, v3

    int-to-byte p1, p1

    invoke-static {p2, v2, p1}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object p1

    sget-object p2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    sget-object v2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    filled-new-array {p2, p2, v2}, [Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

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
.end method

.method public static d(I)I
    .locals 6

    sget v0, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    and-int/lit8 v1, v0, 0x5b

    or-int/lit8 v0, v0, 0x5b

    add-int/2addr v1, v0

    rem-int/lit16 v0, v1, 0x80

    sput v0, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    rem-int/lit8 v1, v1, 0x2

    sget-object v0, Lcom/appsflyer/internal/AFi1nSDK;->enableTCFDataCollection:Ljava/lang/Object;

    if-eqz v1, :cond_0

    const/16 v1, 0x41

    div-int/lit8 v1, v1, 0x0

    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const/16 v1, 0x234

    int-to-short v1, v1

    sget-object v2, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    const/4 v3, 0x4

    aget-byte v3, v2, v3

    int-to-byte v3, v3

    const/16 v4, 0x56

    aget-byte v4, v2, v4

    int-to-byte v4, v4

    invoke-static {v1, v3, v4}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lcom/appsflyer/internal/AFi1nSDK;->stop:Ljava/lang/Object;

    check-cast v3, Ljava/lang/ClassLoader;

    const/4 v4, 0x1

    invoke-static {v1, v4, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v1

    const/4 v3, 0x7

    aget-byte v3, v2, v3

    int-to-short v3, v3

    const/16 v4, 0x1e9

    aget-byte v4, v2, v4

    int-to-byte v4, v4

    const/16 v5, 0x40

    aget-byte v2, v2, v5

    int-to-byte v2, v2

    invoke-static {v3, v4, v2}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, v0, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget v0, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    add-int/lit8 v0, v0, 0x3f

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_1

    return p0

    :cond_1
    const/4 p0, 0x0

    throw p0

    :catchall_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_2

    throw v0

    :cond_2
    throw p0
.end method

.method public static init$0()V
    .locals 5

    sget v0, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    or-int/lit8 v1, v0, 0x5f

    shl-int/lit8 v1, v1, 0x1

    xor-int/lit8 v0, v0, 0x5f

    sub-int/2addr v1, v0

    rem-int/lit16 v0, v1, 0x80

    sput v0, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    rem-int/lit8 v1, v1, 0x2

    const-string v0, "ISO-8859-1"

    const-string v2, "\u001c5\u00e1A\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cd<\u000e\u00f2\u0012\u00fb\u0004\u00fd\u0013\u00be\u0018/\u0000\u0006\u0006\u000e\u00f6\u0003\u000c\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\u0008\t\u00f4\u0010\u00ff\u00f6\u000e\u00c6\u0015\u0008&\u00cb>\u00ea\u00f4\n\u000b\u0003\u000f\u0001\u00c46\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cd6\u0012\u0003\u00c1\u0016%\u0014\u00f8\u0010\u00f6\u000e\u0008\u00de\u0017\r\u00f6\u00ff\u0006\u0015\u0000\u0003\u00f6\u000c\t\u00d02\u0003\u00ff\u0000\u00fd\u0001\u0016\u00f8\t\u0002\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cd6\u0012\u0003\u00c1\u00162\u0003\u00da(\u0006\u00f6\u0002\u000e\n\u0001\u0012\u00d8(\u00fe\u000e\u00f8\u00fb\u000e\u00d82\u0003\u00ff\u0000\u00fd\u0001\u0016\u00f8\t\u0002\u0001\u0012\u00d5&\u0006\u00fc\u0011\u00d4(\u000c\u0001\u0012\u00d2/\u00f8\u0004\u00e1!\u0005\u0008\u0000\u00e2(\u000c\u0001\u0012\u00d2!\u0005\u0008\u0000\u00e2(\u000c8\u0000\u0016\u00f0\u00d18\u0000\u0016\u00f0\u00d1\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001b&\u0006\u00fc\u00fa\u0018\u00ee\u00d0>\t\u00c2I\u00fc\u0006\u00f7\u0008\u000c\u00fa\u0018\u00ee\u00d0A\u00f8\u0010\u00fc\u00ca()\u00fd\u0004\u00f4\u000b\u0001\u0012\u00df%\u0000\u0004\u00f8\u0010\u0005\u0008\u000f\u00f8\u0004\u00fd\u0007\u0001\u0005\u0008\u0000\u0010\u00f9\u0011\u0000\u00fd\u00fe\u00cdD\u0007\u00be\u00176\u00f7\u0006\u00fb\u00c35\u00f2\u0010\u0004\u00f9\t\u0002\u00f4\n\u0017\u00ed\u0008\t\u0001\u0010\u00ec\u001e\u00fa\u000e\u00f4\u00ee\t\u00ed\u000b\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001e\t\u00f96\u00ee\u0005\u000e\u0007\u00f8\t\u0002\u0015\u0000\u0003\u00f6\u000c\t\u00e3\u0018\u0007\u00fb\u00eb\u001f\u0006\u0003\u0000\r\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001b&\u0006\u00fc\u00ed)\u0002\u00ff\u0008\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u000c\u0006\u0007\u00f5\u00ee\u0006\u00f0\u000b5\u0015\u0003\u00f5\u0012\u0002\u00bf7\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\u0008\t\u00f4\u0010\u00ff\u00f6\u000e\u00c6\t\u0000\u0008\u0002/\u00d9\u00013\u00ff\u00d8\u0005\u00ff\u00030\u0002\u0005\u00cd\u0001\u0012\u00e1\u0016\u0011\u00ff\t\u0000\u00f4\u0005\u00fa\u0018\u00ee\u00d0C\u00fa\u0012\u00bd*\u0000\u00fd\u0001\u0012\u00df\u0014\u0016\u00f7\u00fa\u0018\u00ee\u00d0>\t\u00c2\u00176\u00f4\u0003\u0002\u0010\u00f6\u0002\u00e8(\u0005\u0008\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001e(\u0005\u0008\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u00fa\u0018\u00ee\u00d0>\t\u00c2\u0019 \u0016\u00f0\u00eb(\u0005\u0008\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u00f6\u00ff\u0006\u00e52\u00fa\u0003\u0010\u00fa\u0018\u00ee\u00d0>\t\u00c2\u0017:\u00fe\u00f4\u00df4\u0003\u00f2\u001b\u00d3(\u0005\u0008\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u000f\u0001\u00c46\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00bf>\u0008\t\u00f4\u0010\u00ff\u00f6\u000e\u00c5\u0016\u0008(\u00c9K\u00dd\u00f4\n\u000f\u0001\u00c46\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00bf>\u0008\t\u00f4\u0010\u00ff\u00f6\u000e\u00c5\u0016\u0008&\u00cb>\u00ea\u00f4\n\u000b\u0003\u00fb\u0001\n\u00f6\u00ff\u0006\u00f5\u0012\u00e1\u0016\u00ff\u0006\u00ee\"\u0001\u0010\u00ee\u0007\u00ef\u000b\u00fe\u00fa\u000e\u00f4\u0001\u0012\u00d5\u0001\u00fa\u0018\u00ee\u00d0>\t\u00c2\u001b&\u0006\u00fc\u00e2$\u0011\u00f3\u0012\u00fa\n\u0007\u00fe\u0006\t\u00f8\u00f8\u0000\u000e\r\u00f6\u0005\u00c6H\t\u00fd\u0004\u00f4\u000b\u00c4\u0019$\u0016\u00d1&\u0006\u00fc\u0006\u00f5\u0006\u00e3$\u0016\u0001\u0012\u00d0$\u0014\u00ff\u0000\u000c\u0002\u00f4\u00ee\u0014\u0016\u00f7\u0004\n\u00fc\u0012\u00f4\u0001\u0012\u00d2,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u0010\u00fa\u0018\u00ee\u00d0J\u0002\u00f8\u0006\u00c5O\u00f2\n\u00c1/\u0012\n\u00dc(\u0005\u0008\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u0001\u0012\u00dd\u001a\u0016\u00ff\u00d4,\t\u0001\n\u00fa\u0018\u00ee\u00d0J\u0002\u00f8\u0006\u00c5O\u00f2\n\u00c1/\u0012\n\u00d8,\t\u0001\n\u0001\u0012\u00e2\u0019\u0014\u00ee\u00fa\u0018\u00ee\u00d0>\t\u00c2\u0017:\u00fe\u00f4\u00df4\u0003\u00f2\u001b\u00d9)\u0002\u00ff\u0008\u0002\u00e2$\u0001\u00f6\u00ff\u000f\u00fe\u00d6:\u00fe\u00f4\u00df4\u0003\u00f2\u001b\u00fa\u0018\u00ee\u00d0>\t\u00c2\u0018,\u0006\u0007\u00f5\u00ff\u0004\r\u00fc\u0000\u000e\r\u00f6\u0005\u00c6H\t\u00fd\u0004\u00f4\u000b\u00c4\u001e(\u00e2\u001b\u000b\u0005\u0006\n\u00ce$\u0016\u00ce,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u0010\u00fa\u0018\u00ee\u00d0C\u00fe\t\u00c2\u0017:\u00fe\u00f4\u00e06\u00f4\u0003\u0002\u0010\u00fa\u0018\u00ee\u00d0A\u00f8\u0010\u00fc\u00ca\u0018,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u0010\u00fe\u00f2\u0012\u0000\u000e\r\u00f6\u0005\u00c6H\t\u00fd\u0004\u00f4\u000b\u00c4\u0017\"\u0015\u00f5\u00e2$\u0016\u00ce,\u00f8\u0015\u0003\u00dc&\u00f5\u0006\u0004\u0010\u00f4\u0016\u00f7\u00e7 \r\u0004\u00f6\u0016\u00f8\u0010\u00f2\u00ea \u00fc\u0013\u00f2\u0014\n\u00ce(\u000c\u00f6\u0001\u0014\u00fe\u0006\u00fa\u00ff\u0011\u00f6\u0016\u00f8\u0010\u00f2\u00ea \u00fc\u0013\u00f2\u0014\n\u00da\u0014\u0016\u00f7\u00e0*\u00fc\u000b\u00fb\u000c\t\u0002\u0001\u0012\u00d2/\u0001\u0006\u0002\u0002\u00fa\u000c\t\u00e3(\u00fa\u00f8\u00ee\u000b\u00eb\u000b\u0006\u00f5\u0006\u00e2,\u00f8\u0015\u0003\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\u0008\t\u00f4\u0010\u00ff\u00f6\u000e\u00c6\u0015\u0008&\u00cb@\u00e8\u00f4\n\u00dcK5\u0015\u0003\u00f5\u0012\u0002\u00bf7\u000f\u0001\u00c55\u0012\u0003\u0006\u00f6\t\u0010\u00ef\u0010\u00c0=\u0008\t\u00f4\u0010\u00ff\u00f6\u000e\u00c6\u000c\u0001\u0003\u0004\u0005.\u00d5\u0005\u00fd3\u00d8\u0004\u0004\u0002\u0001\u00fe6\u00cc\u00ee\n\u00ec\u000bI\u0004\u00b4I\u00fe\u000e\u0003\u00f9\u0002\u0005\u000b\u000b\u00b0O\u00fc\u0004\u0011\u00b8\u00f6\u0005\u0005\r\u0004\u00f4\u0010\u00d4,\u0000\u00ff\u000c\t\u0008\u0008\u001d\u0017\u00fd\u0004\u00fe\u0006\u00f6\u00f5\u001e\u00f2\u0012\u0003\u00f8\u0010"

    const/4 v3, 0x0

    const/16 v4, 0x47c

    if-eqz v1, :cond_0

    new-array v1, v4, [B

    invoke-virtual {v2, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0, v3, v1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sput-object v1, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    const/16 v0, 0x588a

    :goto_0
    sput v0, Lcom/appsflyer/internal/AFi1nSDK;->$$b:I

    goto :goto_1

    :cond_0
    new-array v1, v4, [B

    invoke-virtual {v2, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-static {v0, v3, v1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sput-object v1, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    const/16 v0, 0x83

    goto :goto_0

    :goto_1
    sget v0, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    xor-int/lit8 v1, v0, 0x23

    and-int/lit8 v0, v0, 0x23

    shl-int/lit8 v0, v0, 0x1

    add-int/2addr v1, v0

    rem-int/lit16 v0, v1, 0x80

    sput v0, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    rem-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x0

    throw v0
.end method

.method public static registerClient(Ljava/lang/Object;)I
    .locals 6

    sget v0, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    sget-object v1, Lcom/appsflyer/internal/AFi1nSDK;->enableTCFDataCollection:Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x75

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    :try_start_0
    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const/16 v0, 0x234

    int-to-short v0, v0

    sget-object v2, Lcom/appsflyer/internal/AFi1nSDK;->$$a:[B

    const/4 v3, 0x4

    aget-byte v3, v2, v3

    int-to-byte v3, v3

    const/16 v4, 0x56

    aget-byte v4, v2, v4

    int-to-byte v4, v4

    invoke-static {v0, v3, v4}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v0

    sget-object v3, Lcom/appsflyer/internal/AFi1nSDK;->stop:Ljava/lang/Object;

    check-cast v3, Ljava/lang/ClassLoader;

    const/4 v4, 0x1

    invoke-static {v0, v4, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    const/16 v3, 0x214

    int-to-short v3, v3

    const/16 v4, 0x196

    aget-byte v4, v2, v4

    int-to-byte v4, v4

    const/16 v5, 0x12

    aget-byte v2, v2, v5

    int-to-byte v2, v2

    invoke-static {v3, v4, v2}, Lcom/appsflyer/internal/AFi1nSDK;->$$c(SII)Ljava/lang/String;

    move-result-object v2

    const-class v3, Ljava/lang/Object;

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget v0, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    add-int/lit8 v0, v0, 0x57

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    return p0

    :catchall_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    throw v0

    :cond_0
    throw p0
.end method

.method private static unregisterClient(II)V
    .locals 0

    sget p0, Lcom/appsflyer/internal/AFi1nSDK;->$11:I

    xor-int/lit8 p1, p0, 0x1f

    and-int/lit8 p0, p0, 0x1f

    shl-int/lit8 p0, p0, 0x1

    add-int/2addr p1, p0

    rem-int/lit16 p0, p1, 0x80

    sput p0, Lcom/appsflyer/internal/AFi1nSDK;->$10:I

    rem-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_0

    const/16 p0, 0x2c

    div-int/lit8 p0, p0, 0x0

    :cond_0
    return-void
.end method
