.class public final Lcom/appsflyer/internal/AFj1aSDK;
.super Ljava/io/FilterInputStream;
.source "SourceFile"


# static fields
.field private static final registerClient:S


# instance fields
.field private AFKeystoreWrapper:[B

.field private AFLogger:[B

.field private AFLoggerLogLevel:I

.field private final afDebugLog:I

.field private final afErrorLog:I

.field private afInfoLog:I

.field private afWarnLog:I

.field private d:[B

.field private e:I

.field private force:I

.field private getEntries:I

.field private i:I

.field private unregisterClient:I

.field private v:I

.field private w:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const-wide/high16 v0, 0x4014000000000000L    # 5.0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v0, v2

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    const-wide/high16 v4, 0x402e000000000000L    # 15.0

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    mul-double/2addr v0, v2

    double-to-int v0, v0

    int-to-short v0, v0

    sput-short v0, Lcom/appsflyer/internal/AFj1aSDK;->registerClient:S

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;[II[BII)V
    .locals 8

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    move v6, p6

    .line 1
    invoke-direct/range {v0 .. v7}, Lcom/appsflyer/internal/AFj1aSDK;-><init>(Ljava/io/InputStream;[II[BIIB)V

    return-void
.end method

.method private constructor <init>(Ljava/io/InputStream;[II[BIIB)V
    .locals 2

    .line 2
    new-instance p7, Ljava/io/BufferedInputStream;

    const/16 v0, 0x1000

    invoke-direct {p7, p1, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    invoke-direct {p0, p7}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    const p1, 0x7fffffff

    .line 3
    iput p1, p0, Lcom/appsflyer/internal/AFj1aSDK;->force:I

    const/4 p1, 0x1

    .line 4
    iput p1, p0, Lcom/appsflyer/internal/AFj1aSDK;->getEntries:I

    const/16 p7, 0x8

    .line 5
    new-array v0, p7, [B

    iput-object v0, p0, Lcom/appsflyer/internal/AFj1aSDK;->AFLogger:[B

    .line 6
    new-array v0, p7, [B

    iput-object v0, p0, Lcom/appsflyer/internal/AFj1aSDK;->AFKeystoreWrapper:[B

    .line 7
    new-array v0, p7, [B

    iput-object v0, p0, Lcom/appsflyer/internal/AFj1aSDK;->d:[B

    .line 8
    iput p7, p0, Lcom/appsflyer/internal/AFj1aSDK;->unregisterClient:I

    .line 9
    iput p7, p0, Lcom/appsflyer/internal/AFj1aSDK;->w:I

    const/4 v0, 0x5

    .line 10
    invoke-static {p5, v0}, Ljava/lang/Math;->max(II)I

    move-result p5

    const/16 v0, 0x10

    invoke-static {p5, v0}, Ljava/lang/Math;->min(II)I

    move-result p5

    iput p5, p0, Lcom/appsflyer/internal/AFj1aSDK;->v:I

    .line 11
    iput p6, p0, Lcom/appsflyer/internal/AFj1aSDK;->i:I

    const/4 p5, 0x0

    const/4 v0, 0x3

    if-ne p6, v0, :cond_0

    .line 12
    iget-object p6, p0, Lcom/appsflyer/internal/AFj1aSDK;->AFKeystoreWrapper:[B

    invoke-static {p4, p5, p6, p5, p7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 13
    :cond_0
    aget p4, p2, p5

    int-to-long p4, p4

    const-wide p6, 0xffffffffL

    and-long/2addr p4, p6

    const/16 v1, 0x20

    shl-long/2addr p4, v1

    aget p1, p2, p1

    int-to-long p1, p1

    and-long/2addr p1, p6

    or-long/2addr p1, p4

    if-nez p3, :cond_1

    long-to-int p3, p1

    .line 14
    iput p3, p0, Lcom/appsflyer/internal/AFj1aSDK;->e:I

    shr-long p3, p1, v0

    .line 15
    sget-short p5, Lcom/appsflyer/internal/AFj1aSDK;->registerClient:S

    int-to-long p6, p5

    mul-long/2addr p6, p3

    shr-long/2addr p6, v1

    long-to-int p6, p6

    iput p6, p0, Lcom/appsflyer/internal/AFj1aSDK;->AFLoggerLogLevel:I

    shr-long/2addr p1, v1

    long-to-int p1, p1

    .line 16
    iput p1, p0, Lcom/appsflyer/internal/AFj1aSDK;->afInfoLog:I

    int-to-long p1, p5

    add-long/2addr p3, p1

    long-to-int p1, p3

    .line 17
    iput p1, p0, Lcom/appsflyer/internal/AFj1aSDK;->afWarnLog:I

    goto :goto_0

    :cond_1
    long-to-int p4, p1

    .line 18
    iput p4, p0, Lcom/appsflyer/internal/AFj1aSDK;->e:I

    mul-int p5, p4, p3

    .line 19
    iput p5, p0, Lcom/appsflyer/internal/AFj1aSDK;->AFLoggerLogLevel:I

    xor-int/2addr p3, p4

    .line 20
    iput p3, p0, Lcom/appsflyer/internal/AFj1aSDK;->afInfoLog:I

    shr-long/2addr p1, v1

    long-to-int p1, p1

    .line 21
    iput p1, p0, Lcom/appsflyer/internal/AFj1aSDK;->afWarnLog:I

    :goto_0
    const/16 p1, 0x64

    .line 22
    iput p1, p0, Lcom/appsflyer/internal/AFj1aSDK;->afErrorLog:I

    .line 23
    iput p1, p0, Lcom/appsflyer/internal/AFj1aSDK;->afDebugLog:I

    return-void
.end method

.method private AFKeystoreWrapper()I
    .locals 8

    iget v0, p0, Lcom/appsflyer/internal/AFj1aSDK;->force:I

    const v1, 0x7fffffff

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    iput v0, p0, Lcom/appsflyer/internal/AFj1aSDK;->force:I

    :cond_0
    iget v0, p0, Lcom/appsflyer/internal/AFj1aSDK;->unregisterClient:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_9

    iget-object v0, p0, Lcom/appsflyer/internal/AFj1aSDK;->AFLogger:[B

    iget v2, p0, Lcom/appsflyer/internal/AFj1aSDK;->force:I

    int-to-byte v3, v2

    const/4 v4, 0x0

    aput-byte v3, v0, v4

    const-string v0, "unexpected block size"

    if-ltz v2, :cond_8

    const/4 v2, 0x1

    move v3, v2

    :cond_1
    iget-object v5, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    iget-object v6, p0, Lcom/appsflyer/internal/AFj1aSDK;->AFLogger:[B

    rsub-int/lit8 v7, v3, 0x8

    invoke-virtual {v5, v6, v3, v7}, Ljava/io/InputStream;->read([BII)I

    move-result v5

    if-lez v5, :cond_2

    add-int/2addr v3, v5

    if-lt v3, v1, :cond_1

    :cond_2
    if-lt v3, v1, :cond_7

    iget v0, p0, Lcom/appsflyer/internal/AFj1aSDK;->afErrorLog:I

    iget v3, p0, Lcom/appsflyer/internal/AFj1aSDK;->afDebugLog:I

    if-ne v0, v3, :cond_3

    invoke-direct {p0}, Lcom/appsflyer/internal/AFj1aSDK;->unregisterClient()V

    goto :goto_0

    :cond_3
    iget v3, p0, Lcom/appsflyer/internal/AFj1aSDK;->getEntries:I

    if-gt v3, v0, :cond_4

    invoke-direct {p0}, Lcom/appsflyer/internal/AFj1aSDK;->unregisterClient()V

    :cond_4
    iget v0, p0, Lcom/appsflyer/internal/AFj1aSDK;->getEntries:I

    iget v3, p0, Lcom/appsflyer/internal/AFj1aSDK;->afDebugLog:I

    if-ge v0, v3, :cond_5

    add-int/2addr v0, v2

    iput v0, p0, Lcom/appsflyer/internal/AFj1aSDK;->getEntries:I

    goto :goto_0

    :cond_5
    iput v2, p0, Lcom/appsflyer/internal/AFj1aSDK;->getEntries:I

    :goto_0
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    iput v0, p0, Lcom/appsflyer/internal/AFj1aSDK;->force:I

    iput v4, p0, Lcom/appsflyer/internal/AFj1aSDK;->unregisterClient:I

    if-gez v0, :cond_6

    iget-object v0, p0, Lcom/appsflyer/internal/AFj1aSDK;->AFLogger:[B

    const/4 v2, 0x7

    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    sub-int/2addr v1, v0

    :cond_6
    iput v1, p0, Lcom/appsflyer/internal/AFj1aSDK;->w:I

    goto :goto_1

    :cond_7
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_8
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_9
    :goto_1
    iget v0, p0, Lcom/appsflyer/internal/AFj1aSDK;->w:I

    return v0
.end method

.method private unregisterClient()V
    .locals 18

    move-object/from16 v0, p0

    iget v1, v0, Lcom/appsflyer/internal/AFj1aSDK;->i:I

    const/4 v2, 0x0

    const/4 v3, 0x3

    if-ne v1, v3, :cond_0

    iget-object v1, v0, Lcom/appsflyer/internal/AFj1aSDK;->AFLogger:[B

    iget-object v4, v0, Lcom/appsflyer/internal/AFj1aSDK;->d:[B

    array-length v5, v1

    invoke-static {v1, v2, v4, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_0
    iget-object v1, v0, Lcom/appsflyer/internal/AFj1aSDK;->AFLogger:[B

    aget-byte v4, v1, v2

    shl-int/lit8 v4, v4, 0x18

    const/high16 v5, -0x1000000

    and-int/2addr v4, v5

    const/4 v6, 0x1

    aget-byte v7, v1, v6

    shl-int/lit8 v7, v7, 0x10

    const/high16 v8, 0xff0000

    and-int/2addr v7, v8

    add-int/2addr v4, v7

    const/4 v7, 0x2

    aget-byte v9, v1, v7

    const/16 v10, 0x8

    shl-int/2addr v9, v10

    const v11, 0xff00

    and-int/2addr v9, v11

    add-int/2addr v4, v9

    aget-byte v9, v1, v3

    and-int/lit16 v9, v9, 0xff

    add-int/2addr v4, v9

    const/4 v9, 0x4

    aget-byte v12, v1, v9

    shl-int/lit8 v12, v12, 0x18

    and-int/2addr v5, v12

    const/4 v12, 0x5

    aget-byte v13, v1, v12

    shl-int/lit8 v13, v13, 0x10

    and-int/2addr v8, v13

    add-int/2addr v5, v8

    const/4 v8, 0x6

    aget-byte v13, v1, v8

    shl-int/2addr v13, v10

    and-int/2addr v11, v13

    add-int/2addr v5, v11

    const/4 v11, 0x7

    aget-byte v1, v1, v11

    and-int/lit16 v1, v1, 0xff

    add-int/2addr v5, v1

    move v1, v2

    :goto_0
    iget v13, v0, Lcom/appsflyer/internal/AFj1aSDK;->v:I

    if-ge v1, v13, :cond_1

    sget-short v14, Lcom/appsflyer/internal/AFj1aSDK;->registerClient:S

    sub-int v15, v13, v1

    mul-int/2addr v15, v14

    add-int/2addr v15, v4

    shl-int/lit8 v16, v4, 0x4

    move/from16 v17, v6

    iget v6, v0, Lcom/appsflyer/internal/AFj1aSDK;->afInfoLog:I

    add-int v16, v16, v6

    xor-int v6, v15, v16

    ushr-int/lit8 v15, v4, 0x5

    move/from16 v16, v7

    iget v7, v0, Lcom/appsflyer/internal/AFj1aSDK;->afWarnLog:I

    add-int/2addr v15, v7

    xor-int/2addr v6, v15

    sub-int/2addr v5, v6

    sub-int/2addr v13, v1

    mul-int/2addr v14, v13

    add-int/2addr v14, v5

    shl-int/lit8 v6, v5, 0x4

    iget v7, v0, Lcom/appsflyer/internal/AFj1aSDK;->e:I

    add-int/2addr v6, v7

    xor-int/2addr v6, v14

    ushr-int/lit8 v7, v5, 0x5

    iget v13, v0, Lcom/appsflyer/internal/AFj1aSDK;->AFLoggerLogLevel:I

    add-int/2addr v7, v13

    xor-int/2addr v6, v7

    sub-int/2addr v4, v6

    add-int/lit8 v1, v1, 0x1

    move/from16 v7, v16

    move/from16 v6, v17

    goto :goto_0

    :cond_1
    move/from16 v17, v6

    move/from16 v16, v7

    iget-object v1, v0, Lcom/appsflyer/internal/AFj1aSDK;->AFLogger:[B

    shr-int/lit8 v6, v4, 0x18

    int-to-byte v6, v6

    aput-byte v6, v1, v2

    shr-int/lit8 v6, v4, 0x10

    int-to-byte v6, v6

    aput-byte v6, v1, v17

    shr-int/lit8 v6, v4, 0x8

    int-to-byte v6, v6

    aput-byte v6, v1, v16

    int-to-byte v4, v4

    aput-byte v4, v1, v3

    shr-int/lit8 v4, v5, 0x18

    int-to-byte v4, v4

    aput-byte v4, v1, v9

    shr-int/lit8 v4, v5, 0x10

    int-to-byte v4, v4

    aput-byte v4, v1, v12

    shr-int/lit8 v4, v5, 0x8

    int-to-byte v4, v4

    aput-byte v4, v1, v8

    int-to-byte v4, v5

    aput-byte v4, v1, v11

    iget v1, v0, Lcom/appsflyer/internal/AFj1aSDK;->i:I

    if-ne v1, v3, :cond_3

    move v1, v2

    :goto_1
    if-ge v1, v10, :cond_2

    iget-object v3, v0, Lcom/appsflyer/internal/AFj1aSDK;->AFLogger:[B

    aget-byte v4, v3, v1

    iget-object v5, v0, Lcom/appsflyer/internal/AFj1aSDK;->AFKeystoreWrapper:[B

    aget-byte v5, v5, v1

    xor-int/2addr v4, v5

    int-to-byte v4, v4

    aput-byte v4, v3, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    iget-object v1, v0, Lcom/appsflyer/internal/AFj1aSDK;->d:[B

    iget-object v3, v0, Lcom/appsflyer/internal/AFj1aSDK;->AFKeystoreWrapper:[B

    array-length v4, v1

    invoke-static {v1, v2, v3, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final available()I
    .locals 2

    invoke-direct {p0}, Lcom/appsflyer/internal/AFj1aSDK;->AFKeystoreWrapper()I

    iget v0, p0, Lcom/appsflyer/internal/AFj1aSDK;->w:I

    iget v1, p0, Lcom/appsflyer/internal/AFj1aSDK;->unregisterClient:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final markSupported()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final read()I
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/appsflyer/internal/AFj1aSDK;->AFKeystoreWrapper()I

    .line 2
    iget v0, p0, Lcom/appsflyer/internal/AFj1aSDK;->unregisterClient:I

    iget v1, p0, Lcom/appsflyer/internal/AFj1aSDK;->w:I

    if-lt v0, v1, :cond_0

    const/4 v0, -0x1

    return v0

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFj1aSDK;->AFLogger:[B

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Lcom/appsflyer/internal/AFj1aSDK;->unregisterClient:I

    aget-byte v0, v1, v0

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final read([BII)I
    .locals 6

    add-int v0, p2, p3

    move v1, p2

    :goto_0
    if-ge v1, v0, :cond_2

    .line 4
    invoke-direct {p0}, Lcom/appsflyer/internal/AFj1aSDK;->AFKeystoreWrapper()I

    .line 5
    iget v2, p0, Lcom/appsflyer/internal/AFj1aSDK;->unregisterClient:I

    iget v3, p0, Lcom/appsflyer/internal/AFj1aSDK;->w:I

    if-lt v2, v3, :cond_1

    if-ne v1, p2, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    sub-int/2addr v0, v1

    sub-int/2addr p3, v0

    return p3

    :cond_1
    add-int/lit8 v3, v1, 0x1

    .line 6
    iget-object v4, p0, Lcom/appsflyer/internal/AFj1aSDK;->AFLogger:[B

    add-int/lit8 v5, v2, 0x1

    iput v5, p0, Lcom/appsflyer/internal/AFj1aSDK;->unregisterClient:I

    aget-byte v2, v4, v2

    aput-byte v2, p1, v1

    move v1, v3

    goto :goto_0

    :cond_2
    return p3
.end method

.method public final skip(J)J
    .locals 4

    const-wide/16 v0, 0x0

    :goto_0
    cmp-long v2, v0, p1

    if-gez v2, :cond_0

    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    goto :goto_0

    :cond_0
    return-wide v0
.end method
