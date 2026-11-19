.class public final Lcom/appsflyer/internal/AFf1nSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static $10:I = 0x0

.field private static $11:I = 0x1

.field private static AFKeystoreWrapper:I = 0x0

.field private static AFLogger:[B = null

.field private static d:I = 0x0

.field private static force:I = 0x0

.field private static registerClient:I = 0x0

.field private static unregisterClient:[S = null

.field private static v:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lcom/appsflyer/internal/AFf1nSDK;->registerClient()V

    invoke-static {}, Landroid/os/Process;->myTid()I

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    sget v0, Lcom/appsflyer/internal/AFf1nSDK;->force:I

    add-int/lit8 v0, v0, 0x5f

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFf1nSDK;->v:I

    rem-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static AFLogger(Lcom/appsflyer/internal/AFh1aSDK;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFi1uSDK;
    .locals 9
    .param p0    # Lcom/appsflyer/internal/AFh1aSDK;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p1, :cond_1

    new-instance p1, Lcom/appsflyer/internal/AFi1uSDK;

    iget-object p0, p0, Lcom/appsflyer/internal/AFh1aSDK;->unregisterClient:Lcom/appsflyer/internal/AFh1iSDK;

    sget-object p2, Lcom/appsflyer/internal/AFh1iSDK;->registerClient:Lcom/appsflyer/internal/AFh1iSDK;

    if-ne p0, p2, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    sget-object p0, Lcom/appsflyer/internal/AFh1dSDK;->registerClient:Lcom/appsflyer/internal/AFh1dSDK;

    invoke-direct {p1, v0, p0}, Lcom/appsflyer/internal/AFi1uSDK;-><init>(ZLcom/appsflyer/internal/AFh1dSDK;)V

    return-object p1

    :cond_1
    const-wide/16 v2, 0x0

    invoke-static {v2, v3}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    move-result v2

    rsub-int/lit8 v3, v2, -0x4b

    const-string v2, ""

    invoke-static {v2}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v4

    int-to-short v4, v4

    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    move-result v5

    shr-int/lit8 v5, v5, 0x8

    add-int/lit8 v5, v5, -0x24

    int-to-byte v5, v5

    const/16 v6, 0x30

    invoke-static {v2, v6, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    move-result v6

    const v7, 0x776324f2

    sub-int v6, v7, v6

    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    move-result v7

    shr-int/lit8 v7, v7, 0x10

    const v8, -0x196fedad

    sub-int v7, v8, v7

    new-array v8, v0, [Ljava/lang/Object;

    invoke-static/range {v3 .. v8}, Lcom/appsflyer/internal/AFf1nSDK;->a(ISBII[Ljava/lang/Object;)V

    aget-object v0, v8, v1

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/appsflyer/internal/AFh1aSDK;->unregisterClient:Lcom/appsflyer/internal/AFh1iSDK;

    sget-object v3, Lcom/appsflyer/internal/AFh1iSDK;->d:Lcom/appsflyer/internal/AFh1iSDK;

    if-ne v1, v3, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->reverse()Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_2
    move-object p3, v0

    :goto_1
    iget-object p0, p0, Lcom/appsflyer/internal/AFh1aSDK;->d:Ljava/lang/String;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->reverse()Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "android"

    const-string v0, "v1"

    invoke-static {p2, p0, p3, v0, v2}, Lcom/appsflyer/internal/AFf1nSDK;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    new-instance p1, Lcom/appsflyer/internal/AFi1uSDK;

    if-eqz p0, :cond_3

    sget-object p2, Lcom/appsflyer/internal/AFh1dSDK;->d:Lcom/appsflyer/internal/AFh1dSDK;

    goto :goto_2

    :cond_3
    sget-object p2, Lcom/appsflyer/internal/AFh1dSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFh1dSDK;

    :goto_2
    invoke-direct {p1, p0, p2}, Lcom/appsflyer/internal/AFi1uSDK;-><init>(ZLcom/appsflyer/internal/AFh1dSDK;)V

    return-object p1
.end method

.method private static a(ISBII[Ljava/lang/Object;)V
    .locals 12

    new-instance v0, Lcom/appsflyer/internal/AFk1rSDK;

    invoke-direct {v0}, Lcom/appsflyer/internal/AFk1rSDK;-><init>()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget v2, Lcom/appsflyer/internal/AFf1nSDK;->registerClient:I

    int-to-long v2, v2

    const-wide v4, -0x5f1571567e51948fL

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr p0, v2

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v6, 0x1

    if-ne p0, v2, :cond_0

    move v2, v6

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    if-eqz v2, :cond_5

    sget p0, Lcom/appsflyer/internal/AFf1nSDK;->$11:I

    add-int/lit8 p0, p0, 0x5f

    rem-int/lit16 v7, p0, 0x80

    sput v7, Lcom/appsflyer/internal/AFf1nSDK;->$10:I

    rem-int/lit8 p0, p0, 0x2

    if-nez p0, :cond_4

    sget-object p0, Lcom/appsflyer/internal/AFf1nSDK;->AFLogger:[B

    if-eqz p0, :cond_2

    array-length v7, p0

    new-array v8, v7, [B

    move v9, v3

    :goto_1
    if-ge v9, v7, :cond_1

    aget-byte v10, p0, v9

    int-to-long v10, v10

    xor-long/2addr v10, v4

    long-to-int v10, v10

    int-to-byte v10, v10

    aput-byte v10, v8, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_1
    move-object p0, v8

    :cond_2
    if-eqz p0, :cond_3

    sget-object p0, Lcom/appsflyer/internal/AFf1nSDK;->AFLogger:[B

    sget v7, Lcom/appsflyer/internal/AFf1nSDK;->d:I

    int-to-long v7, v7

    xor-long/2addr v7, v4

    long-to-int v7, v7

    add-int v7, p4, v7

    aget-byte p0, p0, v7

    int-to-long v7, p0

    xor-long/2addr v7, v4

    long-to-int p0, v7

    int-to-byte p0, p0

    sget v7, Lcom/appsflyer/internal/AFf1nSDK;->registerClient:I

    int-to-long v7, v7

    xor-long/2addr v7, v4

    long-to-int v7, v7

    add-int/2addr p0, v7

    int-to-byte p0, p0

    goto :goto_2

    :cond_3
    sget-object p0, Lcom/appsflyer/internal/AFf1nSDK;->unregisterClient:[S

    sget v7, Lcom/appsflyer/internal/AFf1nSDK;->d:I

    int-to-long v7, v7

    xor-long/2addr v7, v4

    long-to-int v7, v7

    add-int v7, p4, v7

    aget-short p0, p0, v7

    int-to-long v7, p0

    xor-long/2addr v7, v4

    long-to-int p0, v7

    int-to-short p0, p0

    sget v7, Lcom/appsflyer/internal/AFf1nSDK;->registerClient:I

    int-to-long v7, v7

    xor-long/2addr v7, v4

    long-to-int v7, v7

    add-int/2addr p0, v7

    int-to-short p0, p0

    goto :goto_2

    :cond_4
    const/4 p0, 0x0

    throw p0

    :cond_5
    :goto_2
    if-lez p0, :cond_d

    sget v7, Lcom/appsflyer/internal/AFf1nSDK;->$10:I

    add-int/lit8 v7, v7, 0x7b

    rem-int/lit16 v8, v7, 0x80

    sput v8, Lcom/appsflyer/internal/AFf1nSDK;->$11:I

    rem-int/lit8 v7, v7, 0x2

    if-nez v7, :cond_6

    ushr-int v7, p4, p0

    add-int/lit8 v7, v7, -0x5

    sget v8, Lcom/appsflyer/internal/AFf1nSDK;->d:I

    int-to-long v8, v8

    rem-long/2addr v8, v4

    long-to-int v8, v8

    add-int/2addr v7, v8

    if-eqz v2, :cond_7

    goto :goto_3

    :cond_6
    add-int v7, p4, p0

    add-int/lit8 v7, v7, -0x2

    sget v8, Lcom/appsflyer/internal/AFf1nSDK;->d:I

    int-to-long v8, v8

    xor-long/2addr v8, v4

    long-to-int v8, v8

    add-int/2addr v7, v8

    if-eqz v2, :cond_7

    :goto_3
    move v2, v6

    goto :goto_4

    :cond_7
    move v2, v3

    :goto_4
    add-int/2addr v7, v2

    iput v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->AFLogger:I

    sget v2, Lcom/appsflyer/internal/AFf1nSDK;->AFKeystoreWrapper:I

    int-to-long v7, v2

    xor-long/2addr v7, v4

    long-to-int v2, v7

    add-int/2addr v2, p3

    int-to-char v2, v2

    iput-char v2, v0, Lcom/appsflyer/internal/AFk1rSDK;->registerClient:C

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-char v2, v0, Lcom/appsflyer/internal/AFk1rSDK;->registerClient:C

    iput-char v2, v0, Lcom/appsflyer/internal/AFk1rSDK;->AFKeystoreWrapper:C

    sget-object v2, Lcom/appsflyer/internal/AFf1nSDK;->AFLogger:[B

    if-eqz v2, :cond_9

    array-length v7, v2

    new-array v8, v7, [B

    move v9, v3

    :goto_5
    if-ge v9, v7, :cond_8

    aget-byte v10, v2, v9

    int-to-long v10, v10

    xor-long/2addr v10, v4

    long-to-int v10, v10

    int-to-byte v10, v10

    aput-byte v10, v8, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_5

    :cond_8
    move-object v2, v8

    :cond_9
    if-eqz v2, :cond_a

    sget v2, Lcom/appsflyer/internal/AFf1nSDK;->$10:I

    add-int/lit8 v2, v2, 0x2d

    rem-int/lit16 v7, v2, 0x80

    sput v7, Lcom/appsflyer/internal/AFf1nSDK;->$11:I

    rem-int/lit8 v2, v2, 0x2

    if-nez v2, :cond_b

    :cond_a
    move v2, v3

    goto :goto_6

    :cond_b
    move v2, v6

    :goto_6
    iput v6, v0, Lcom/appsflyer/internal/AFk1rSDK;->d:I

    :goto_7
    iget v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->d:I

    if-ge v7, p0, :cond_d

    if-eqz v2, :cond_c

    sget-object v7, Lcom/appsflyer/internal/AFf1nSDK;->AFLogger:[B

    iget v8, v0, Lcom/appsflyer/internal/AFk1rSDK;->AFLogger:I

    add-int/lit8 v9, v8, -0x1

    iput v9, v0, Lcom/appsflyer/internal/AFk1rSDK;->AFLogger:I

    aget-byte v7, v7, v8

    int-to-long v7, v7

    xor-long/2addr v7, v4

    long-to-int v7, v7

    int-to-byte v7, v7

    iget-char v8, v0, Lcom/appsflyer/internal/AFk1rSDK;->AFKeystoreWrapper:C

    add-int/2addr v7, p1

    int-to-byte v7, v7

    xor-int/2addr v7, p2

    add-int/2addr v8, v7

    int-to-char v7, v8

    iput-char v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->registerClient:C

    goto :goto_8

    :cond_c
    sget-object v7, Lcom/appsflyer/internal/AFf1nSDK;->unregisterClient:[S

    iget v8, v0, Lcom/appsflyer/internal/AFk1rSDK;->AFLogger:I

    add-int/lit8 v9, v8, -0x1

    iput v9, v0, Lcom/appsflyer/internal/AFk1rSDK;->AFLogger:I

    aget-short v7, v7, v8

    int-to-long v7, v7

    xor-long/2addr v7, v4

    long-to-int v7, v7

    int-to-short v7, v7

    iget-char v8, v0, Lcom/appsflyer/internal/AFk1rSDK;->AFKeystoreWrapper:C

    add-int/2addr v7, p1

    int-to-short v7, v7

    xor-int/2addr v7, p2

    add-int/2addr v8, v7

    int-to-char v7, v8

    iput-char v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->registerClient:C

    :goto_8
    iget-char v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->registerClient:C

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-char v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->registerClient:C

    iput-char v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->AFKeystoreWrapper:C

    iget v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->d:I

    add-int/2addr v7, v6

    iput v7, v0, Lcom/appsflyer/internal/AFk1rSDK;->d:I

    goto :goto_7

    :cond_d
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    aput-object p0, p5, v3

    return-void
.end method

.method private static d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    sget v0, Lcom/appsflyer/internal/AFf1nSDK;->v:I

    add-int/lit8 v0, v0, 0x3f

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFf1nSDK;->force:I

    const/4 v1, 0x2

    rem-int/2addr v0, v1

    const/16 v2, 0xc

    const-string v3, "\u2063"

    const-string v4, ""

    const/4 v5, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x5

    new-array v6, v0, [Ljava/lang/String;

    aput-object p1, v6, v5

    aput-object p2, v6, v5

    aput-object p3, v6, v0

    const/4 p1, 0x4

    aput-object p4, v6, p1

    aput-object v4, v6, v1

    invoke-static {v3, v6}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p0}, Lcom/appsflyer/internal/AFj1nSDK;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    const/16 p2, 0xe

    if-ge p1, p2, :cond_2

    goto :goto_0

    :cond_0
    filled-new-array {p1, p2, p3, p4, v4}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p0}, Lcom/appsflyer/internal/AFj1nSDK;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    if-ge p1, v2, :cond_2

    :goto_0
    sget p1, Lcom/appsflyer/internal/AFf1nSDK;->force:I

    add-int/lit8 p1, p1, 0x21

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/appsflyer/internal/AFf1nSDK;->v:I

    rem-int/2addr p1, v1

    if-nez p1, :cond_1

    const/16 p1, 0x38

    div-int/2addr p1, v5

    :cond_1
    return-object p0

    :cond_2
    invoke-virtual {p0, v5, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static registerClient()V
    .locals 1

    const v0, -0x673e7924

    sput v0, Lcom/appsflyer/internal/AFf1nSDK;->d:I

    const v0, -0x7e5194c5

    sput v0, Lcom/appsflyer/internal/AFf1nSDK;->registerClient:I

    const v0, 0x932b031

    sput v0, Lcom/appsflyer/internal/AFf1nSDK;->AFKeystoreWrapper:I

    const/16 v0, 0x40

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lcom/appsflyer/internal/AFf1nSDK;->AFLogger:[B

    return-void

    nop

    :array_0
    .array-data 1
        -0x79t
        -0x5et
        0x52t
        0x52t
        0x52t
        -0x52t
        0x5ct
        -0x59t
        -0x55t
        0x52t
        0x56t
        -0x53t
        -0x53t
        -0x57t
        0x52t
        0x50t
        -0x52t
        -0x54t
        -0x51t
        0x57t
        0x5bt
        -0x5ft
        0x5dt
        -0x5et
        0x52t
        -0x51t
        0x59t
        -0x5at
        -0x51t
        0x52t
        0x52t
        -0x53t
        -0x58t
        0x51t
        -0x51t
        0x50t
        0x5ft
        -0x43t
        -0x57t
        0x51t
        0x51t
        -0x57t
        0x56t
        -0x56t
        0x50t
        -0x54t
        0x53t
        -0x57t
        -0x53t
        0x53t
        -0x53t
        -0x51t
        0x54t
        -0x51t
        0x53t
        -0x55t
        0x50t
        0x52t
        -0x54t
        -0x52t
        -0x53t
        0x51t
        -0x57t
        -0x53t
    .end array-data
.end method


# virtual methods
.method public final AFKeystoreWrapper(Lcom/appsflyer/internal/AFh1aSDK;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFi1uSDK;
    .locals 1
    .param p1    # Lcom/appsflyer/internal/AFh1aSDK;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    if-eqz p1, :cond_0

    if-eqz p3, :cond_0

    if-eqz p4, :cond_0

    sget v0, Lcom/appsflyer/internal/AFf1nSDK;->v:I

    add-int/lit8 v0, v0, 0x49

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFf1nSDK;->force:I

    invoke-static {p1, p2, p3, p4}, Lcom/appsflyer/internal/AFf1nSDK;->AFLogger(Lcom/appsflyer/internal/AFh1aSDK;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFi1uSDK;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lcom/appsflyer/internal/AFi1uSDK;

    const/4 p2, 0x0

    sget-object p3, Lcom/appsflyer/internal/AFh1dSDK;->AFLogger:Lcom/appsflyer/internal/AFh1dSDK;

    invoke-direct {p1, p2, p3}, Lcom/appsflyer/internal/AFi1uSDK;-><init>(ZLcom/appsflyer/internal/AFh1dSDK;)V

    sget p2, Lcom/appsflyer/internal/AFf1nSDK;->v:I

    add-int/lit8 p2, p2, 0x21

    rem-int/lit16 p2, p2, 0x80

    sput p2, Lcom/appsflyer/internal/AFf1nSDK;->force:I

    return-object p1
.end method
