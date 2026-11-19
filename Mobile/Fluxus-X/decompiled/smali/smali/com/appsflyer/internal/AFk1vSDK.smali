.class public final Lcom/appsflyer/internal/AFk1vSDK;
.super Ljava/io/FilterInputStream;
.source "SourceFile"


# static fields
.field private static final AFKeystoreWrapper:[I

.field private static final AFLogger:[B

.field private static final d:[I

.field private static final registerClient:[I

.field private static final unregisterClient:[I


# instance fields
.field private final AFLoggerLogLevel:I

.field private final afDebugLog:[B

.field private afErrorLog:I

.field private final afInfoLog:I

.field private afWarnLog:I

.field private final e:I

.field private final force:[B

.field private getEntries:I

.field private getLevel:I

.field private final i:[[B

.field private final v:[I

.field private final w:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/appsflyer/internal/AFk1xSDK;->registerClient:[B

    sput-object v0, Lcom/appsflyer/internal/AFk1vSDK;->AFLogger:[B

    sget-object v0, Lcom/appsflyer/internal/AFk1xSDK;->d:[I

    sput-object v0, Lcom/appsflyer/internal/AFk1vSDK;->unregisterClient:[I

    sget-object v0, Lcom/appsflyer/internal/AFk1xSDK;->unregisterClient:[I

    sput-object v0, Lcom/appsflyer/internal/AFk1vSDK;->d:[I

    sget-object v0, Lcom/appsflyer/internal/AFk1xSDK;->AFKeystoreWrapper:[I

    sput-object v0, Lcom/appsflyer/internal/AFk1vSDK;->registerClient:[I

    sget-object v0, Lcom/appsflyer/internal/AFk1xSDK;->AFLogger:[I

    sput-object v0, Lcom/appsflyer/internal/AFk1vSDK;->AFKeystoreWrapper:[I

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;I[B[[B)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 1
    invoke-direct/range {v0 .. v5}, Lcom/appsflyer/internal/AFk1vSDK;-><init>(Ljava/io/InputStream;I[B[[BB)V

    return-void
.end method

.method private constructor <init>(Ljava/io/InputStream;I[B[[BB)V
    .locals 3

    .line 2
    new-instance p5, Ljava/io/BufferedInputStream;

    const/16 v0, 0x1000

    invoke-direct {p5, p1, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    invoke-direct {p0, p5}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    const/4 p1, 0x4

    .line 3
    new-array p1, p1, [I

    iput-object p1, p0, Lcom/appsflyer/internal/AFk1vSDK;->w:[I

    const/16 p1, 0x10

    .line 4
    new-array p5, p1, [B

    iput-object p5, p0, Lcom/appsflyer/internal/AFk1vSDK;->force:[B

    .line 5
    new-array p5, p1, [B

    iput-object p5, p0, Lcom/appsflyer/internal/AFk1vSDK;->afDebugLog:[B

    const/4 p5, 0x1

    .line 6
    iput p5, p0, Lcom/appsflyer/internal/AFk1vSDK;->afWarnLog:I

    const p5, 0x7fffffff

    .line 7
    iput p5, p0, Lcom/appsflyer/internal/AFk1vSDK;->afErrorLog:I

    .line 8
    iput p1, p0, Lcom/appsflyer/internal/AFk1vSDK;->getLevel:I

    .line 9
    iput p1, p0, Lcom/appsflyer/internal/AFk1vSDK;->getEntries:I

    .line 10
    iput p2, p0, Lcom/appsflyer/internal/AFk1vSDK;->e:I

    .line 11
    invoke-static {p3, p2}, Lcom/appsflyer/internal/AFk1xSDK;->AFLogger([BI)[I

    move-result-object p1

    iput-object p1, p0, Lcom/appsflyer/internal/AFk1vSDK;->v:[I

    .line 12
    array-length p1, p4

    new-array p1, p1, [[B

    const/4 p2, 0x0

    move p3, p2

    .line 13
    :goto_0
    array-length p5, p4

    if-ge p3, p5, :cond_1

    .line 14
    aget-object p5, p4, p3

    array-length p5, p5

    new-array p5, p5, [B

    aput-object p5, p1, p3

    move p5, p2

    .line 15
    :goto_1
    aget-object v0, p4, p3

    array-length v1, v0

    if-ge p5, v1, :cond_0

    .line 16
    aget-object v1, p1, p3

    aget-byte v0, v0, p5

    int-to-byte v2, p5

    aput-byte v2, v1, v0

    add-int/lit8 p5, p5, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    .line 17
    :cond_1
    iput-object p1, p0, Lcom/appsflyer/internal/AFk1vSDK;->i:[[B

    const/16 p1, 0x64

    .line 18
    iput p1, p0, Lcom/appsflyer/internal/AFk1vSDK;->AFLoggerLogLevel:I

    .line 19
    iput p1, p0, Lcom/appsflyer/internal/AFk1vSDK;->afInfoLog:I

    return-void
.end method

.method private registerClient([B[B)V
    .locals 34

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/appsflyer/internal/AFk1vSDK;->w:[I

    const/4 v2, 0x0

    aget-byte v3, p1, v2

    shl-int/lit8 v3, v3, 0x18

    const/4 v4, 0x1

    aget-byte v5, p1, v4

    and-int/lit16 v5, v5, 0xff

    shl-int/lit8 v5, v5, 0x10

    or-int/2addr v3, v5

    const/4 v5, 0x2

    aget-byte v6, p1, v5

    and-int/lit16 v6, v6, 0xff

    const/16 v7, 0x8

    shl-int/2addr v6, v7

    or-int/2addr v3, v6

    const/4 v6, 0x3

    aget-byte v8, p1, v6

    and-int/lit16 v8, v8, 0xff

    or-int/2addr v3, v8

    iget-object v8, v0, Lcom/appsflyer/internal/AFk1vSDK;->v:[I

    aget v9, v8, v2

    xor-int/2addr v3, v9

    aput v3, v1, v2

    const/4 v3, 0x4

    aget-byte v9, p1, v3

    shl-int/lit8 v9, v9, 0x18

    const/4 v10, 0x5

    aget-byte v11, p1, v10

    and-int/lit16 v11, v11, 0xff

    shl-int/lit8 v11, v11, 0x10

    or-int/2addr v9, v11

    const/4 v11, 0x6

    aget-byte v12, p1, v11

    and-int/lit16 v12, v12, 0xff

    shl-int/2addr v12, v7

    or-int/2addr v9, v12

    const/4 v12, 0x7

    aget-byte v13, p1, v12

    and-int/lit16 v13, v13, 0xff

    or-int/2addr v9, v13

    aget v13, v8, v4

    xor-int/2addr v9, v13

    aput v9, v1, v4

    aget-byte v9, p1, v7

    shl-int/lit8 v9, v9, 0x18

    const/16 v13, 0x9

    aget-byte v14, p1, v13

    and-int/lit16 v14, v14, 0xff

    shl-int/lit8 v14, v14, 0x10

    or-int/2addr v9, v14

    const/16 v14, 0xa

    aget-byte v15, p1, v14

    and-int/lit16 v15, v15, 0xff

    shl-int/2addr v15, v7

    or-int/2addr v9, v15

    const/16 v15, 0xb

    move/from16 v16, v2

    aget-byte v2, p1, v15

    and-int/lit16 v2, v2, 0xff

    or-int/2addr v2, v9

    aget v9, v8, v5

    xor-int/2addr v2, v9

    aput v2, v1, v5

    const/16 v2, 0xc

    aget-byte v9, p1, v2

    shl-int/lit8 v9, v9, 0x18

    const/16 v17, 0xd

    move/from16 v18, v2

    aget-byte v2, p1, v17

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v2, v9

    const/16 v9, 0xe

    move/from16 v19, v3

    aget-byte v3, p1, v9

    and-int/lit16 v3, v3, 0xff

    shl-int/2addr v3, v7

    or-int/2addr v2, v3

    const/16 v20, 0xf

    aget-byte v3, p1, v20

    and-int/lit16 v3, v3, 0xff

    or-int/2addr v2, v3

    aget v3, v8, v6

    xor-int/2addr v2, v3

    aput v2, v1, v6

    move v1, v4

    move/from16 v2, v19

    :goto_0
    iget v3, v0, Lcom/appsflyer/internal/AFk1vSDK;->e:I

    if-ge v1, v3, :cond_0

    sget-object v3, Lcom/appsflyer/internal/AFk1vSDK;->unregisterClient:[I

    iget-object v8, v0, Lcom/appsflyer/internal/AFk1vSDK;->w:[I

    move/from16 v21, v4

    iget-object v4, v0, Lcom/appsflyer/internal/AFk1vSDK;->i:[[B

    aget-object v22, v4, v16

    aget-byte v23, v22, v16

    aget v23, v8, v23

    ushr-int/lit8 v23, v23, 0x18

    aget v23, v3, v23

    sget-object v24, Lcom/appsflyer/internal/AFk1vSDK;->d:[I

    aget-object v25, v4, v21

    aget-byte v26, v25, v16

    aget v26, v8, v26

    move/from16 v27, v5

    ushr-int/lit8 v5, v26, 0x10

    and-int/lit16 v5, v5, 0xff

    aget v5, v24, v5

    xor-int v5, v23, v5

    sget-object v23, Lcom/appsflyer/internal/AFk1vSDK;->registerClient:[I

    aget-object v26, v4, v27

    aget-byte v28, v26, v16

    aget v28, v8, v28

    move/from16 v29, v6

    ushr-int/lit8 v6, v28, 0x8

    and-int/lit16 v6, v6, 0xff

    aget v6, v23, v6

    xor-int/2addr v5, v6

    sget-object v6, Lcom/appsflyer/internal/AFk1vSDK;->AFKeystoreWrapper:[I

    aget-object v4, v4, v29

    aget-byte v28, v4, v16

    move/from16 v30, v7

    aget v7, v8, v28

    and-int/lit16 v7, v7, 0xff

    aget v7, v6, v7

    xor-int/2addr v5, v7

    iget-object v7, v0, Lcom/appsflyer/internal/AFk1vSDK;->v:[I

    aget v28, v7, v2

    xor-int v5, v5, v28

    aget-byte v28, v22, v21

    aget v28, v8, v28

    ushr-int/lit8 v28, v28, 0x18

    aget v28, v3, v28

    aget-byte v31, v25, v21

    aget v31, v8, v31

    move/from16 v32, v9

    ushr-int/lit8 v9, v31, 0x10

    and-int/lit16 v9, v9, 0xff

    aget v9, v24, v9

    xor-int v9, v28, v9

    aget-byte v28, v26, v21

    aget v28, v8, v28

    move/from16 v31, v10

    ushr-int/lit8 v10, v28, 0x8

    and-int/lit16 v10, v10, 0xff

    aget v10, v23, v10

    xor-int/2addr v9, v10

    aget-byte v10, v4, v21

    aget v10, v8, v10

    and-int/lit16 v10, v10, 0xff

    aget v10, v6, v10

    xor-int/2addr v9, v10

    add-int/lit8 v10, v2, 0x1

    aget v10, v7, v10

    xor-int/2addr v9, v10

    aget-byte v10, v22, v27

    aget v10, v8, v10

    ushr-int/lit8 v10, v10, 0x18

    aget v10, v3, v10

    aget-byte v28, v25, v27

    aget v28, v8, v28

    move/from16 v33, v11

    ushr-int/lit8 v11, v28, 0x10

    and-int/lit16 v11, v11, 0xff

    aget v11, v24, v11

    xor-int/2addr v10, v11

    aget-byte v11, v26, v27

    aget v11, v8, v11

    ushr-int/lit8 v11, v11, 0x8

    and-int/lit16 v11, v11, 0xff

    aget v11, v23, v11

    xor-int/2addr v10, v11

    aget-byte v11, v4, v27

    aget v11, v8, v11

    and-int/lit16 v11, v11, 0xff

    aget v11, v6, v11

    xor-int/2addr v10, v11

    add-int/lit8 v11, v2, 0x2

    aget v11, v7, v11

    xor-int/2addr v10, v11

    aget-byte v11, v22, v29

    aget v11, v8, v11

    ushr-int/lit8 v11, v11, 0x18

    aget v3, v3, v11

    aget-byte v11, v25, v29

    aget v11, v8, v11

    ushr-int/lit8 v11, v11, 0x10

    and-int/lit16 v11, v11, 0xff

    aget v11, v24, v11

    xor-int/2addr v3, v11

    aget-byte v11, v26, v29

    aget v11, v8, v11

    ushr-int/lit8 v11, v11, 0x8

    and-int/lit16 v11, v11, 0xff

    aget v11, v23, v11

    xor-int/2addr v3, v11

    aget-byte v4, v4, v29

    aget v4, v8, v4

    and-int/lit16 v4, v4, 0xff

    aget v4, v6, v4

    xor-int/2addr v3, v4

    add-int/lit8 v4, v2, 0x3

    aget v4, v7, v4

    xor-int/2addr v3, v4

    aput v5, v8, v16

    aput v9, v8, v21

    aput v10, v8, v27

    aput v3, v8, v29

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v2, v2, 0x4

    move/from16 v4, v21

    move/from16 v5, v27

    move/from16 v6, v29

    move/from16 v7, v30

    move/from16 v10, v31

    move/from16 v9, v32

    move/from16 v11, v33

    goto/16 :goto_0

    :cond_0
    move/from16 v21, v4

    move/from16 v27, v5

    move/from16 v29, v6

    move/from16 v30, v7

    move/from16 v32, v9

    move/from16 v31, v10

    move/from16 v33, v11

    iget-object v1, v0, Lcom/appsflyer/internal/AFk1vSDK;->v:[I

    aget v3, v1, v2

    sget-object v4, Lcom/appsflyer/internal/AFk1vSDK;->AFLogger:[B

    iget-object v5, v0, Lcom/appsflyer/internal/AFk1vSDK;->w:[I

    iget-object v6, v0, Lcom/appsflyer/internal/AFk1vSDK;->i:[[B

    aget-object v7, v6, v16

    aget-byte v8, v7, v16

    aget v8, v5, v8

    ushr-int/lit8 v8, v8, 0x18

    aget-byte v8, v4, v8

    ushr-int/lit8 v9, v3, 0x18

    xor-int/2addr v8, v9

    int-to-byte v8, v8

    aput-byte v8, p2, v16

    aget-object v8, v6, v21

    aget-byte v9, v8, v16

    aget v9, v5, v9

    ushr-int/lit8 v9, v9, 0x10

    and-int/lit16 v9, v9, 0xff

    aget-byte v9, v4, v9

    ushr-int/lit8 v10, v3, 0x10

    xor-int/2addr v9, v10

    int-to-byte v9, v9

    aput-byte v9, p2, v21

    aget-object v9, v6, v27

    aget-byte v10, v9, v16

    aget v10, v5, v10

    ushr-int/lit8 v10, v10, 0x8

    and-int/lit16 v10, v10, 0xff

    aget-byte v10, v4, v10

    ushr-int/lit8 v11, v3, 0x8

    xor-int/2addr v10, v11

    int-to-byte v10, v10

    aput-byte v10, p2, v27

    aget-object v6, v6, v29

    aget-byte v10, v6, v16

    aget v10, v5, v10

    and-int/lit16 v10, v10, 0xff

    aget-byte v10, v4, v10

    xor-int/2addr v3, v10

    int-to-byte v3, v3

    aput-byte v3, p2, v29

    add-int/lit8 v3, v2, 0x1

    aget v3, v1, v3

    aget-byte v10, v7, v21

    aget v10, v5, v10

    ushr-int/lit8 v10, v10, 0x18

    aget-byte v10, v4, v10

    ushr-int/lit8 v11, v3, 0x18

    xor-int/2addr v10, v11

    int-to-byte v10, v10

    aput-byte v10, p2, v19

    aget-byte v10, v8, v21

    aget v10, v5, v10

    ushr-int/lit8 v10, v10, 0x10

    and-int/lit16 v10, v10, 0xff

    aget-byte v10, v4, v10

    ushr-int/lit8 v11, v3, 0x10

    xor-int/2addr v10, v11

    int-to-byte v10, v10

    aput-byte v10, p2, v31

    aget-byte v10, v9, v21

    aget v10, v5, v10

    ushr-int/lit8 v10, v10, 0x8

    and-int/lit16 v10, v10, 0xff

    aget-byte v10, v4, v10

    ushr-int/lit8 v11, v3, 0x8

    xor-int/2addr v10, v11

    int-to-byte v10, v10

    aput-byte v10, p2, v33

    aget-byte v10, v6, v21

    aget v10, v5, v10

    and-int/lit16 v10, v10, 0xff

    aget-byte v10, v4, v10

    xor-int/2addr v3, v10

    int-to-byte v3, v3

    aput-byte v3, p2, v12

    add-int/lit8 v3, v2, 0x2

    aget v3, v1, v3

    aget-byte v10, v7, v27

    aget v10, v5, v10

    ushr-int/lit8 v10, v10, 0x18

    aget-byte v10, v4, v10

    ushr-int/lit8 v11, v3, 0x18

    xor-int/2addr v10, v11

    int-to-byte v10, v10

    aput-byte v10, p2, v30

    aget-byte v10, v8, v27

    aget v10, v5, v10

    ushr-int/lit8 v10, v10, 0x10

    and-int/lit16 v10, v10, 0xff

    aget-byte v10, v4, v10

    ushr-int/lit8 v11, v3, 0x10

    xor-int/2addr v10, v11

    int-to-byte v10, v10

    aput-byte v10, p2, v13

    aget-byte v10, v9, v27

    aget v10, v5, v10

    ushr-int/lit8 v10, v10, 0x8

    and-int/lit16 v10, v10, 0xff

    aget-byte v10, v4, v10

    ushr-int/lit8 v11, v3, 0x8

    xor-int/2addr v10, v11

    int-to-byte v10, v10

    aput-byte v10, p2, v14

    aget-byte v10, v6, v27

    aget v10, v5, v10

    and-int/lit16 v10, v10, 0xff

    aget-byte v10, v4, v10

    xor-int/2addr v3, v10

    int-to-byte v3, v3

    aput-byte v3, p2, v15

    add-int/lit8 v2, v2, 0x3

    aget v1, v1, v2

    aget-byte v2, v7, v29

    aget v2, v5, v2

    ushr-int/lit8 v2, v2, 0x18

    aget-byte v2, v4, v2

    ushr-int/lit8 v3, v1, 0x18

    xor-int/2addr v2, v3

    int-to-byte v2, v2

    aput-byte v2, p2, v18

    aget-byte v2, v8, v29

    aget v2, v5, v2

    ushr-int/lit8 v2, v2, 0x10

    and-int/lit16 v2, v2, 0xff

    aget-byte v2, v4, v2

    ushr-int/lit8 v3, v1, 0x10

    xor-int/2addr v2, v3

    int-to-byte v2, v2

    aput-byte v2, p2, v17

    aget-byte v2, v9, v29

    aget v2, v5, v2

    ushr-int/lit8 v2, v2, 0x8

    and-int/lit16 v2, v2, 0xff

    aget-byte v2, v4, v2

    ushr-int/lit8 v3, v1, 0x8

    xor-int/2addr v2, v3

    int-to-byte v2, v2

    aput-byte v2, p2, v32

    aget-byte v2, v6, v29

    aget v2, v5, v2

    and-int/lit16 v2, v2, 0xff

    aget-byte v2, v4, v2

    xor-int/2addr v1, v2

    int-to-byte v1, v1

    aput-byte v1, p2, v20

    return-void
.end method

.method private unregisterClient()I
    .locals 8

    iget v0, p0, Lcom/appsflyer/internal/AFk1vSDK;->afErrorLog:I

    const v1, 0x7fffffff

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    iput v0, p0, Lcom/appsflyer/internal/AFk1vSDK;->afErrorLog:I

    :cond_0
    iget v0, p0, Lcom/appsflyer/internal/AFk1vSDK;->getLevel:I

    const/16 v1, 0x10

    if-ne v0, v1, :cond_9

    iget-object v0, p0, Lcom/appsflyer/internal/AFk1vSDK;->force:[B

    iget v2, p0, Lcom/appsflyer/internal/AFk1vSDK;->afErrorLog:I

    int-to-byte v3, v2

    const/4 v4, 0x0

    aput-byte v3, v0, v4

    const-string v0, "unexpected block size"

    if-ltz v2, :cond_8

    const/4 v2, 0x1

    move v3, v2

    :cond_1
    iget-object v5, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    iget-object v6, p0, Lcom/appsflyer/internal/AFk1vSDK;->force:[B

    rsub-int/lit8 v7, v3, 0x10

    invoke-virtual {v5, v6, v3, v7}, Ljava/io/InputStream;->read([BII)I

    move-result v5

    if-lez v5, :cond_2

    add-int/2addr v3, v5

    if-lt v3, v1, :cond_1

    :cond_2
    if-lt v3, v1, :cond_7

    iget v0, p0, Lcom/appsflyer/internal/AFk1vSDK;->AFLoggerLogLevel:I

    iget v3, p0, Lcom/appsflyer/internal/AFk1vSDK;->afInfoLog:I

    if-ne v0, v3, :cond_3

    iget-object v0, p0, Lcom/appsflyer/internal/AFk1vSDK;->force:[B

    iget-object v2, p0, Lcom/appsflyer/internal/AFk1vSDK;->afDebugLog:[B

    invoke-direct {p0, v0, v2}, Lcom/appsflyer/internal/AFk1vSDK;->registerClient([B[B)V

    goto :goto_1

    :cond_3
    iget v3, p0, Lcom/appsflyer/internal/AFk1vSDK;->afWarnLog:I

    if-gt v3, v0, :cond_4

    iget-object v0, p0, Lcom/appsflyer/internal/AFk1vSDK;->force:[B

    iget-object v3, p0, Lcom/appsflyer/internal/AFk1vSDK;->afDebugLog:[B

    invoke-direct {p0, v0, v3}, Lcom/appsflyer/internal/AFk1vSDK;->registerClient([B[B)V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/appsflyer/internal/AFk1vSDK;->force:[B

    iget-object v3, p0, Lcom/appsflyer/internal/AFk1vSDK;->afDebugLog:[B

    array-length v5, v0

    invoke-static {v0, v4, v3, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_0
    iget v0, p0, Lcom/appsflyer/internal/AFk1vSDK;->afWarnLog:I

    iget v3, p0, Lcom/appsflyer/internal/AFk1vSDK;->afInfoLog:I

    if-ge v0, v3, :cond_5

    add-int/2addr v0, v2

    iput v0, p0, Lcom/appsflyer/internal/AFk1vSDK;->afWarnLog:I

    goto :goto_1

    :cond_5
    iput v2, p0, Lcom/appsflyer/internal/AFk1vSDK;->afWarnLog:I

    :goto_1
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    iput v0, p0, Lcom/appsflyer/internal/AFk1vSDK;->afErrorLog:I

    iput v4, p0, Lcom/appsflyer/internal/AFk1vSDK;->getLevel:I

    if-gez v0, :cond_6

    iget-object v0, p0, Lcom/appsflyer/internal/AFk1vSDK;->afDebugLog:[B

    const/16 v2, 0xf

    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    sub-int/2addr v1, v0

    :cond_6
    iput v1, p0, Lcom/appsflyer/internal/AFk1vSDK;->getEntries:I

    goto :goto_2

    :cond_7
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_8
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_9
    :goto_2
    iget v0, p0, Lcom/appsflyer/internal/AFk1vSDK;->getEntries:I

    return v0
.end method


# virtual methods
.method public final available()I
    .locals 2

    invoke-direct {p0}, Lcom/appsflyer/internal/AFk1vSDK;->unregisterClient()I

    iget v0, p0, Lcom/appsflyer/internal/AFk1vSDK;->getEntries:I

    iget v1, p0, Lcom/appsflyer/internal/AFk1vSDK;->getLevel:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final close()V
    .locals 0

    invoke-super {p0}, Ljava/io/FilterInputStream;->close()V

    return-void
.end method

.method public final declared-synchronized mark(I)V
    .locals 0

    monitor-enter p0

    monitor-exit p0

    return-void
.end method

.method public final markSupported()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final read()I
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/appsflyer/internal/AFk1vSDK;->unregisterClient()I

    .line 2
    iget v0, p0, Lcom/appsflyer/internal/AFk1vSDK;->getLevel:I

    iget v1, p0, Lcom/appsflyer/internal/AFk1vSDK;->getEntries:I

    if-lt v0, v1, :cond_0

    const/4 v0, -0x1

    return v0

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFk1vSDK;->afDebugLog:[B

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Lcom/appsflyer/internal/AFk1vSDK;->getLevel:I

    aget-byte v0, v1, v0

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final read([B)I
    .locals 2

    const/4 v0, 0x0

    .line 4
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    return p1
.end method

.method public final read([BII)I
    .locals 6

    add-int v0, p2, p3

    move v1, p2

    :goto_0
    if-ge v1, v0, :cond_2

    .line 5
    invoke-direct {p0}, Lcom/appsflyer/internal/AFk1vSDK;->unregisterClient()I

    .line 6
    iget v2, p0, Lcom/appsflyer/internal/AFk1vSDK;->getLevel:I

    iget v3, p0, Lcom/appsflyer/internal/AFk1vSDK;->getEntries:I

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

    .line 7
    iget-object v4, p0, Lcom/appsflyer/internal/AFk1vSDK;->afDebugLog:[B

    add-int/lit8 v5, v2, 0x1

    iput v5, p0, Lcom/appsflyer/internal/AFk1vSDK;->getLevel:I

    aget-byte v2, v4, v2

    aput-byte v2, p1, v1

    move v1, v3

    goto :goto_0

    :cond_2
    return p3
.end method

.method public final declared-synchronized reset()V
    .locals 0

    monitor-enter p0

    monitor-exit p0

    return-void
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
