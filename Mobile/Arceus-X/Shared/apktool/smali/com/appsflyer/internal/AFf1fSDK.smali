.class public final Lcom/appsflyer/internal/AFf1fSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static $10:I = 0x0

.field private static $11:I = 0x1

.field private static e:I = 0x1

.field private static force:I

.field private static v:[C


# instance fields
.field AFKeystoreWrapper:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final AFLogger:Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private d:J

.field private volatile i:Ljava/lang/String;

.field private final registerClient:Lcom/appsflyer/internal/AFd1zSDK;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private unregisterClient:Z

.field private volatile w:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xc

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lcom/appsflyer/internal/AFf1fSDK;->v:[C

    return-void

    :array_0
    .array-data 2
        -0x7bds
        -0x7ecs
        -0x7e3s
        -0x7e5s
        -0x7f0s
        -0x7efs
        -0x7e6s
        -0x7e3s
        -0x7e8s
        -0x7e6s
        -0x7e1s
        -0x800s
    .end array-data
.end method

.method public constructor <init>(Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;)V
    .locals 1
    .param p1    # Lcom/appsflyer/internal/AFd1zSDK;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/appsflyer/internal/AFf1fSDK;->unregisterClient:Z

    iput-boolean v0, p0, Lcom/appsflyer/internal/AFf1fSDK;->w:Z

    iput-object p1, p0, Lcom/appsflyer/internal/AFf1fSDK;->registerClient:Lcom/appsflyer/internal/AFd1zSDK;

    iput-object p2, p0, Lcom/appsflyer/internal/AFf1fSDK;->AFLogger:Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;

    return-void
.end method

.method private AFLogger(Lcom/appsflyer/internal/AFc1iSDK;)J
    .locals 3

    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    iget-object p1, p1, Lcom/appsflyer/internal/AFc1iSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1kSDK;

    invoke-static {p1}, Lcom/appsflyer/internal/AFb1jSDK;->AFLogger(Lcom/appsflyer/internal/AFc1kSDK;)Ljava/lang/String;

    move-result-object p1

    .line 10
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lcom/appsflyer/internal/AFf1fSDK;->w()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-static {p1}, Lcom/appsflyer/internal/AFj1nSDK;->unregisterClient(Ljava/lang/String;)[B

    move-result-object p1

    invoke-static {p1}, Lcom/appsflyer/internal/AFj1nSDK;->AFLogger([B)J

    move-result-wide v0

    .line 12
    sget p1, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    add-int/lit8 p1, p1, 0x39

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    return-wide v0
.end method

.method private static synthetic AFLogger([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    aget-object p0, p0, v0

    check-cast p0, Lcom/appsflyer/internal/AFf1fSDK;

    .line 1
    sget v0, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    add-int/lit8 v0, v0, 0x11

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    rem-int/lit8 v0, v0, 0x2

    const/4 v1, 0x0

    iget-object p0, p0, Lcom/appsflyer/internal/AFf1fSDK;->i:Ljava/lang/String;

    if-nez v0, :cond_1

    sget v0, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    add-int/lit8 v0, v0, 0x53

    rem-int/lit16 v2, v0, 0x80

    sput v2, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    throw v1

    :cond_1
    throw v1
.end method

.method private static a([ILjava/lang/String;Z[Ljava/lang/Object;)V
    .locals 17

    move-object/from16 v0, p1

    sget v1, Lcom/appsflyer/internal/AFf1fSDK;->$10:I

    add-int/lit8 v2, v1, 0x25

    rem-int/lit16 v3, v2, 0x80

    sput v3, Lcom/appsflyer/internal/AFf1fSDK;->$11:I

    const/4 v3, 0x2

    rem-int/2addr v2, v3

    if-eqz v2, :cond_c

    if-eqz v0, :cond_0

    add-int/lit8 v1, v1, 0x33

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFf1fSDK;->$11:I

    const-string v1, "ISO-8859-1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    :cond_0
    check-cast v0, [B

    new-instance v1, Lcom/appsflyer/internal/AFk1mSDK;

    invoke-direct {v1}, Lcom/appsflyer/internal/AFk1mSDK;-><init>()V

    const/4 v2, 0x0

    aget v4, p0, v2

    const/4 v5, 0x1

    aget v6, p0, v5

    aget v7, p0, v3

    const/4 v8, 0x3

    aget v8, p0, v8

    sget-object v9, Lcom/appsflyer/internal/AFf1fSDK;->v:[C

    if-eqz v9, :cond_2

    array-length v10, v9

    new-array v11, v10, [C

    move v12, v2

    :goto_0
    if-ge v12, v10, :cond_1

    aget-char v13, v9, v12

    int-to-long v13, v13

    const-wide v15, -0x31235be88b2078dL    # -5.945620543029098E293

    xor-long/2addr v13, v15

    long-to-int v13, v13

    int-to-char v13, v13

    aput-char v13, v11, v12

    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    :cond_1
    move-object v9, v11

    :cond_2
    new-array v10, v6, [C

    invoke-static {v9, v4, v10, v2, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-eqz v0, :cond_6

    new-array v4, v6, [C

    iput v2, v1, Lcom/appsflyer/internal/AFk1mSDK;->d:I

    move v9, v2

    :goto_1
    iget v11, v1, Lcom/appsflyer/internal/AFk1mSDK;->d:I

    if-ge v11, v6, :cond_5

    aget-byte v12, v0, v11

    if-ne v12, v5, :cond_4

    sget v12, Lcom/appsflyer/internal/AFf1fSDK;->$11:I

    add-int/lit8 v12, v12, 0x51

    rem-int/lit16 v13, v12, 0x80

    sput v13, Lcom/appsflyer/internal/AFf1fSDK;->$10:I

    rem-int/2addr v12, v3

    if-eqz v12, :cond_3

    aget-char v12, v10, v11

    rem-int/2addr v12, v3

    sub-int/2addr v12, v9

    int-to-char v9, v12

    aput-char v9, v4, v11

    goto :goto_2

    :cond_3
    aget-char v12, v10, v11

    mul-int/2addr v12, v3

    add-int/2addr v12, v5

    sub-int/2addr v12, v9

    int-to-char v9, v12

    aput-char v9, v4, v11

    goto :goto_2

    :cond_4
    aget-char v12, v10, v11

    mul-int/2addr v12, v3

    sub-int/2addr v12, v9

    int-to-char v9, v12

    aput-char v9, v4, v11

    :goto_2
    aget-char v9, v4, v11

    add-int/lit8 v11, v11, 0x1

    iput v11, v1, Lcom/appsflyer/internal/AFk1mSDK;->d:I

    goto :goto_1

    :cond_5
    move-object v10, v4

    :cond_6
    if-lez v8, :cond_8

    sget v0, Lcom/appsflyer/internal/AFf1fSDK;->$10:I

    add-int/lit8 v0, v0, 0x9

    rem-int/lit16 v4, v0, 0x80

    sput v4, Lcom/appsflyer/internal/AFf1fSDK;->$11:I

    rem-int/2addr v0, v3

    if-nez v0, :cond_7

    new-array v0, v6, [C

    invoke-static {v10, v5, v0, v5, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    mul-int v4, v6, v8

    invoke-static {v0, v2, v10, v4, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    ushr-int v4, v6, v8

    invoke-static {v0, v8, v10, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_3

    :cond_7
    new-array v0, v6, [C

    invoke-static {v10, v2, v0, v2, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sub-int v4, v6, v8

    invoke-static {v0, v2, v10, v4, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v0, v8, v10, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_8
    :goto_3
    if-eqz p2, :cond_a

    new-array v0, v6, [C

    iput v2, v1, Lcom/appsflyer/internal/AFk1mSDK;->d:I

    :goto_4
    iget v4, v1, Lcom/appsflyer/internal/AFk1mSDK;->d:I

    if-ge v4, v6, :cond_9

    sub-int v8, v6, v4

    sub-int/2addr v8, v5

    aget-char v8, v10, v8

    aput-char v8, v0, v4

    add-int/lit8 v4, v4, 0x1

    iput v4, v1, Lcom/appsflyer/internal/AFk1mSDK;->d:I

    goto :goto_4

    :cond_9
    move-object v10, v0

    :cond_a
    if-lez v7, :cond_b

    iput v2, v1, Lcom/appsflyer/internal/AFk1mSDK;->d:I

    :goto_5
    iget v0, v1, Lcom/appsflyer/internal/AFk1mSDK;->d:I

    if-ge v0, v6, :cond_b

    aget-char v4, v10, v0

    aget v5, p0, v3

    sub-int/2addr v4, v5

    int-to-char v4, v4

    aput-char v4, v10, v0

    add-int/lit8 v0, v0, 0x1

    iput v0, v1, Lcom/appsflyer/internal/AFk1mSDK;->d:I

    sget v0, Lcom/appsflyer/internal/AFf1fSDK;->$10:I

    add-int/lit8 v0, v0, 0x67

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFf1fSDK;->$11:I

    goto :goto_5

    :cond_b
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v10}, Ljava/lang/String;-><init>([C)V

    aput-object v0, p3, v2

    return-void

    :cond_c
    const/4 v0, 0x0

    throw v0
.end method

.method public static d(Lcom/appsflyer/internal/AFh1pSDK;Lcom/appsflyer/internal/AFc1iSDK;)Z
    .locals 7

    .line 16
    iget-object v0, p1, Lcom/appsflyer/internal/AFc1iSDK;->unregisterClient:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 17
    sget v2, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    add-int/lit8 v2, v2, 0x63

    rem-int/lit16 v2, v2, 0x80

    sput v2, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    .line 18
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 19
    :cond_0
    iget-object p1, p1, Lcom/appsflyer/internal/AFc1iSDK;->unregisterClient:Ljava/lang/String;

    goto :goto_2

    .line 20
    :cond_1
    :goto_0
    sget v0, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    add-int/lit8 v0, v0, 0x49

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    .line 21
    const-string v0, "com.appsflyer.security.uuid"

    invoke-virtual {p1, v0}, Lcom/appsflyer/internal/AFc1iSDK;->AFLogger(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 22
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    const/16 v2, 0x8

    .line 23
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/appsflyer/internal/AFc1iSDK;->unregisterClient:Ljava/lang/String;

    move-object p1, v0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 p1, 0x0

    :goto_2
    if-eqz p1, :cond_6

    .line 24
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_5

    .line 25
    :cond_4
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFh1pSDK;->d:Ljava/util/Map;

    const/16 v2, 0xc

    const/4 v3, 0x3

    .line 26
    filled-new-array {v1, v2, v1, v3}, [I

    move-result-object v2

    const-string v3, "\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001"

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Object;

    invoke-static {v2, v3, v1, v5}, Lcom/appsflyer/internal/AFf1fSDK;->a([ILjava/lang/String;Z[Ljava/lang/Object;)V

    aget-object v2, v5, v1

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    .line 27
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object p1

    const-wide/16 v5, 0x5e

    .line 28
    rem-long/2addr v2, v5

    long-to-int v0, v2

    add-int/lit8 v0, v0, 0x21

    move v2, v1

    .line 29
    :goto_3
    array-length v3, p1

    if-ge v2, v3, :cond_5

    .line 30
    aget-char v3, p1, v2

    xor-int/2addr v3, v0

    int-to-char v3, v3

    aput-char v3, p1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :catch_0
    move-exception p0

    goto :goto_4

    .line 31
    :cond_5
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1}, Ljava/lang/String;-><init>([C)V

    .line 32
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const/4 v0, 0x2

    .line 33
    invoke-static {p1, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p1

    .line 34
    const-string v0, "af-sdk-sbid"

    .line 35
    iget-object p0, p0, Lcom/appsflyer/internal/AFh1pSDK;->registerClient:Ljava/util/Map;

    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v4

    .line 36
    :goto_4
    sget-object p1, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v0, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v2, "Exception occurred while generating sbid "

    invoke-virtual {p1, v0, v2, p0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;)V

    return v1

    .line 37
    :cond_6
    :goto_5
    sget-object p0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object p1, Lcom/appsflyer/sdk_base/logger/LogTag;->SECURITY_SDK:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v0, "the module is not detected"

    invoke-virtual {p0, p1, v0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->d(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    return v1
.end method

.method private static e()Lcom/appsflyer/internal/AFf1cSDK;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lcom/appsflyer/internal/AFf1cSDK;

    invoke-direct {v0}, Lcom/appsflyer/internal/AFf1cSDK;-><init>()V

    sget v1, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    add-int/lit8 v1, v1, 0x7b

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    rem-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    throw v0
.end method

.method private static synthetic registerClient([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const v0, 0x5e17b8b9

    .line 1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    .line 2
    aget-object v2, p0, v1

    check-cast v2, Lcom/appsflyer/internal/AFf1fSDK;

    const/4 v3, 0x1

    aget-object p0, p0, v3

    check-cast p0, Ljava/util/Map;

    .line 3
    :try_start_0
    iget-object v2, v2, Lcom/appsflyer/internal/AFf1fSDK;->registerClient:Lcom/appsflyer/internal/AFd1zSDK;

    .line 4
    iget-object v2, v2, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v4, 0x2

    .line 5
    :try_start_1
    new-array v5, v4, [Ljava/lang/Object;

    aput-object v2, v5, v3

    aput-object p0, v5, v1

    sget-object p0, Lcom/appsflyer/internal/AFa1bSDK;->getInstance:Ljava/util/Map;

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    move-result v1

    shr-int/lit8 v1, v1, 0x10

    const v2, 0xf99f

    add-int/2addr v1, v2

    int-to-char v1, v1

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    move-result v2

    shr-int/lit8 v2, v2, 0x10

    rsub-int/lit8 v2, v2, 0x7c

    const-string v3, ""

    invoke-static {v3}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v3

    rsub-int/lit8 v3, v3, 0x25

    invoke-static {v1, v2, v3}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    const-class v2, Ljava/util/Map;

    const-class v3, Landroid/content/Context;

    filled-new-array {v2, v3}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    check-cast v1, Ljava/lang/reflect/Constructor;

    invoke-virtual {v1, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 6
    sget v0, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    add-int/lit8 v0, v0, 0x3f

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    rem-int/2addr v0, v4

    if-nez v0, :cond_1

    return-object p0

    :cond_1
    const/4 p0, 0x0

    throw p0

    :catchall_0
    move-exception v0

    move-object p0, v0

    .line 7
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_2

    throw v0

    :cond_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    move-object p0, v0

    move-object v3, p0

    .line 8
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->ANTI_FRAUD:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v2, "AFCksmV3: reflection init failed"

    invoke-virtual/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 9
    new-instance p0, Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    return-object p0
.end method

.method public static registerClient(Lcom/appsflyer/internal/AFh1pSDK;[B)V
    .locals 6

    .line 10
    :try_start_0
    new-instance v0, Lcom/appsflyer/internal/AFb1sSDK;

    invoke-direct {v0, p0, p1}, Lcom/appsflyer/internal/AFb1sSDK;-><init>(Lcom/appsflyer/internal/AFh1pSDK;[B)V

    invoke-virtual {v0}, Lcom/appsflyer/internal/AFb1sSDK;->afInfoLog()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    sget p0, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    add-int/lit8 p0, p0, 0x55

    rem-int/lit16 p1, p0, 0x80

    sput p1, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    rem-int/lit8 p0, p0, 0x2

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 p0, 0x0

    throw p0

    :catch_0
    move-exception v0

    move-object p0, v0

    move-object v3, p0

    .line 12
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->SECURITY:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v2, "native: reflection init failed"

    invoke-virtual/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 13
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->SECURITY_SDK:Lcom/appsflyer/sdk_base/logger/LogTag;

    const-string v2, "the module detected but malfunctioning"

    invoke-virtual/range {v0 .. v5}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    return-void
.end method

.method public static synthetic unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;
    .locals 5

    mul-int/lit16 v0, p1, -0x233

    mul-int/lit16 v1, p2, 0x235

    add-int/2addr v0, v1

    not-int v1, p1

    not-int v2, p2

    not-int v3, p3

    or-int/2addr v2, v3

    not-int v2, v2

    or-int/2addr v2, v1

    or-int v4, p2, p3

    not-int v4, v4

    or-int/2addr v2, v4

    mul-int/lit16 v2, v2, -0x234

    add-int/2addr v0, v2

    or-int v2, v1, p2

    or-int/2addr p3, v2

    not-int p3, p3

    mul-int/lit16 p3, p3, 0x468

    add-int/2addr v0, p3

    or-int p3, v1, v3

    not-int p3, p3

    or-int/2addr p1, p2

    not-int p1, p1

    or-int/2addr p1, p3

    mul-int/lit16 p1, p1, 0x234

    add-int/2addr v0, p1

    const/4 p1, 0x1

    if-eq v0, p1, :cond_1

    const/4 p1, 0x2

    if-eq v0, p1, :cond_0

    .line 1
    invoke-static {p0}, Lcom/appsflyer/internal/AFf1fSDK;->registerClient([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Lcom/appsflyer/internal/AFf1fSDK;->AFLogger([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p2, 0x0

    aget-object p2, p0, p2

    check-cast p2, Lcom/appsflyer/internal/AFf1fSDK;

    aget-object p0, p0, p1

    check-cast p0, Ljava/util/Map;

    .line 2
    new-instance p1, Lcom/appsflyer/internal/AFc1hSDK;

    iget-object p2, p2, Lcom/appsflyer/internal/AFf1fSDK;->registerClient:Lcom/appsflyer/internal/AFd1zSDK;

    .line 3
    iget-object p2, p2, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 4
    invoke-direct {p1, p0, p2}, Lcom/appsflyer/internal/AFc1hSDK;-><init>(Ljava/util/Map;Landroid/content/Context;)V

    sget p0, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    add-int/lit8 p0, p0, 0x49

    rem-int/lit16 p0, p0, 0x80

    sput p0, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    return-object p1
.end method

.method private v()Z
    .locals 2

    iget-object v0, p0, Lcom/appsflyer/internal/AFf1fSDK;->AFKeystoreWrapper:Ljava/util/Map;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    sget v0, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    add-int/lit8 v0, v0, 0x35

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    const/4 v0, 0x1

    return v0

    :cond_0
    sget v0, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    add-int/lit8 v0, v0, 0x55

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    const/4 v0, 0x0

    throw v0
.end method

.method private w()J
    .locals 4

    sget v0, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    add-int/lit8 v1, v0, 0x6f

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    rem-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_0

    iget-wide v1, p0, Lcom/appsflyer/internal/AFf1fSDK;->d:J

    const/4 v3, 0x0

    div-int/2addr v3, v3

    goto :goto_0

    :cond_0
    iget-wide v1, p0, Lcom/appsflyer/internal/AFf1fSDK;->d:J

    :goto_0
    add-int/lit8 v0, v0, 0x4b

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    return-wide v1
.end method


# virtual methods
.method public final AFKeystoreWrapper()Ljava/util/Map;
    .locals 5
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 2
    invoke-direct {p0}, Lcom/appsflyer/internal/AFf1fSDK;->v()Z

    move-result v1

    const-string v2, "lvl"

    if-eqz v1, :cond_0

    .line 3
    sget v1, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    add-int/lit8 v1, v1, 0x39

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    .line 4
    iget-object v1, p0, Lcom/appsflyer/internal/AFf1fSDK;->AFKeystoreWrapper:Ljava/util/Map;

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    sget v1, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    add-int/lit8 v1, v1, 0x65

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    return-object v0

    .line 6
    :cond_0
    iget-boolean v1, p0, Lcom/appsflyer/internal/AFf1fSDK;->unregisterClient:Z

    if-eqz v1, :cond_1

    .line 7
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lcom/appsflyer/internal/AFf1fSDK;->AFKeystoreWrapper:Ljava/util/Map;

    .line 8
    invoke-virtual {p0}, Lcom/appsflyer/internal/AFf1fSDK;->registerClient()V

    .line 9
    iget-object v1, p0, Lcom/appsflyer/internal/AFf1fSDK;->AFKeystoreWrapper:Ljava/util/Map;

    const-string v3, "error"

    const-string v4, "pending LVL response"

    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    iget-object v1, p0, Lcom/appsflyer/internal/AFf1fSDK;->AFKeystoreWrapper:Ljava/util/Map;

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public final AFKeystoreWrapper(Ljava/util/Map;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 11
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x17315fa3

    const v2, -0x17315fa3

    invoke-static {p1, v1, v2, v0}, Lcom/appsflyer/internal/AFf1fSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    return-object p1
.end method

.method public final AFLogger(Z)V
    .locals 2

    .line 3
    sget v0, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    add-int/lit8 v0, v0, 0x1

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    .line 4
    iput-boolean p1, p0, Lcom/appsflyer/internal/AFf1fSDK;->w:Z

    .line 5
    sget p1, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    add-int/lit8 p1, p1, 0x1d

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    return-void

    .line 6
    :cond_0
    iput-boolean p1, p0, Lcom/appsflyer/internal/AFf1fSDK;->w:Z

    const/4 p1, 0x0

    .line 7
    throw p1
.end method

.method public final AFLogger()Z
    .locals 2

    .line 2
    sget v0, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    add-int/lit8 v0, v0, 0x53

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/appsflyer/internal/AFf1fSDK;->w:Z

    sget v1, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    add-int/lit8 v1, v1, 0x51

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    return v0

    :cond_0
    const/4 v0, 0x0

    throw v0
.end method

.method public final d(Lcom/appsflyer/internal/AFc1iSDK;)V
    .locals 4

    .line 7
    sget v0, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    add-int/lit8 v0, v0, 0x77

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_0

    .line 8
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1fSDK;->AFLogger:Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;

    sget-object v1, Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;->LVL:Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;

    invoke-interface {v0, v1}, Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;->isOptionalFeaturePresent(Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;)Z

    move-result v0

    const/16 v1, 0x52

    .line 9
    div-int/lit8 v1, v1, 0x0

    if-nez v0, :cond_2

    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1fSDK;->AFLogger:Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;

    sget-object v1, Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;->LVL:Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;

    invoke-interface {v0, v1}, Lcom/appsflyer/sdk_base/util/OptionalFeaturesValidator;->isOptionalFeaturePresent(Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 11
    :goto_0
    sget p1, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    add-int/lit8 p1, p1, 0x3d

    rem-int/lit16 v0, p1, 0x80

    sput v0, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    rem-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_1

    const/16 p1, 0x56

    div-int/lit8 p1, p1, 0x0

    :cond_1
    return-void

    .line 12
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/appsflyer/internal/AFf1fSDK;->d:J

    .line 13
    invoke-static {}, Lcom/appsflyer/internal/AFf1fSDK;->e()Lcom/appsflyer/internal/AFf1cSDK;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFf1fSDK;->AFLogger(Lcom/appsflyer/internal/AFc1iSDK;)J

    move-result-wide v1

    iget-object p1, p0, Lcom/appsflyer/internal/AFf1fSDK;->registerClient:Lcom/appsflyer/internal/AFd1zSDK;

    .line 14
    iget-object p1, p1, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 15
    new-instance v3, Lcom/appsflyer/internal/AFf1fSDK$3;

    invoke-direct {v3, p0}, Lcom/appsflyer/internal/AFf1fSDK$3;-><init>(Lcom/appsflyer/internal/AFf1fSDK;)V

    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/appsflyer/internal/AFf1cSDK;->AFLogger(JLandroid/content/Context;Lcom/appsflyer/internal/AFf1cSDK$AFa1zSDK;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/appsflyer/internal/AFf1fSDK;->unregisterClient:Z

    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 2

    .line 1
    sget v0, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    add-int/lit8 v0, v0, 0x55

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_0

    .line 2
    iput-object p1, p0, Lcom/appsflyer/internal/AFf1fSDK;->i:Ljava/lang/String;

    const/16 p1, 0x5c

    .line 3
    div-int/lit8 p1, p1, 0x0

    goto :goto_0

    .line 4
    :cond_0
    iput-object p1, p0, Lcom/appsflyer/internal/AFf1fSDK;->i:Ljava/lang/String;

    .line 5
    :goto_0
    sget p1, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    add-int/lit8 p1, p1, 0x5

    rem-int/lit16 p1, p1, 0x80

    sput p1, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    return-void
.end method

.method public final d()Z
    .locals 3

    .line 6
    sget v0, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    add-int/lit8 v0, v0, 0x17

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    rem-int/lit8 v0, v0, 0x2

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/appsflyer/internal/AFf1fSDK;->unregisterClient:Z

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/appsflyer/internal/AFf1fSDK;->v()Z

    move-result v0

    if-nez v0, :cond_0

    sget v0, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    add-int/lit8 v0, v0, 0x3f

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    return v2

    :cond_0
    sget v0, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    add-int/2addr v0, v2

    rem-int/lit16 v2, v0, 0x80

    sput v2, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    throw v1

    :cond_2
    throw v1
.end method

.method public final registerClient()V
    .locals 7

    .line 14
    sget v0, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    add-int/lit8 v0, v0, 0x59

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    rem-int/lit8 v0, v0, 0x2

    const-string v1, "lvl_timestamp"

    const-string v2, "ttr"

    .line 15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/appsflyer/internal/AFf1fSDK;->d:J

    sub-long/2addr v3, v5

    .line 16
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1fSDK;->AFKeystoreWrapper:Ljava/util/Map;

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1fSDK;->AFKeystoreWrapper:Ljava/util/Map;

    invoke-direct {p0}, Lcom/appsflyer/internal/AFf1fSDK;->w()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    sget v0, Lcom/appsflyer/internal/AFf1fSDK;->force:I

    add-int/lit8 v0, v0, 0x2b

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFf1fSDK;->e:I

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    throw v0
.end method

.method public final unregisterClient()Ljava/lang/String;
    .locals 4

    .line 6
    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    const v2, -0x62ff1f55

    const v3, 0x62ff1f57

    invoke-static {v0, v2, v3, v1}, Lcom/appsflyer/internal/AFf1fSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final unregisterClient(Ljava/util/Map;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 5
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x746b6f75

    const v2, -0x746b6f74

    invoke-static {p1, v1, v2, v0}, Lcom/appsflyer/internal/AFf1fSDK;->unregisterClient([Ljava/lang/Object;III)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    return-object p1
.end method
