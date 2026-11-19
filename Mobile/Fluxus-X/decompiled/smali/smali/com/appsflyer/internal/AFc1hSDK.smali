.class public final Lcom/appsflyer/internal/AFc1hSDK;
.super Ljava/util/HashMap;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<",
        "Ljava/lang/String;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field private static $10:I = 0x0

.field private static $11:I = 0x1

.field private static AFKeystoreWrapper:C = '\u0000'

.field private static e:I = 0x1

.field private static force:C

.field private static i:C

.field private static registerClient:C

.field private static unregisterClient:[C

.field private static v:I

.field private static w:C


# instance fields
.field private final AFLogger:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lcom/appsflyer/internal/AFc1hSDK;->registerClient()V

    const-string v0, ""

    invoke-static {v0, v0}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    const/16 v1, 0x30

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    invoke-static {v2, v2}, Landroid/view/KeyEvent;->getDeadChar(II)I

    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    invoke-static {}, Landroid/os/Process;->myPid()I

    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    invoke-static {v2}, Landroid/graphics/Color;->red(I)I

    invoke-static {v2, v2}, Landroid/view/View;->getDefaultSize(II)I

    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    sget v0, Lcom/appsflyer/internal/AFc1hSDK;->v:I

    add-int/lit8 v0, v0, 0x13

    rem-int/lit16 v1, v0, 0x80

    sput v1, Lcom/appsflyer/internal/AFc1hSDK;->e:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_0

    const/16 v0, 0x18

    div-int/2addr v0, v2

    :cond_0
    return-void
.end method

.method public constructor <init>(Ljava/util/Map;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/AFc1hSDK;->AFLogger:Ljava/util/Map;

    iput-object p2, p0, Lcom/appsflyer/internal/AFc1hSDK;->d:Landroid/content/Context;

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1hSDK;->AFLogger()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1hSDK;->AFKeystoreWrapper()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private AFKeystoreWrapper()Ljava/lang/String;
    .locals 15

    .line 17
    const-string v1, ""

    const/16 v2, 0x30

    const/16 v3, 0x10

    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 18
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1hSDK;->AFLogger:Ljava/util/Map;

    const-string v6, ")!#\u0003\u0001+\r\u000c\u0005#)\u000f"

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    move-result v7

    shr-int/lit8 v7, v7, 0x18

    rsub-int/lit8 v7, v7, 0xc

    invoke-static {v5, v5}, Landroid/view/View;->getDefaultSize(II)I

    move-result v8

    rsub-int/lit8 v8, v8, 0x33

    int-to-byte v8, v8

    new-array v9, v4, [Ljava/lang/Object;

    invoke-static {v6, v7, v8, v9}, Lcom/appsflyer/internal/AFc1hSDK;->a(Ljava/lang/String;IB[Ljava/lang/Object;)V

    aget-object v6, v9, v5

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 19
    iget-object v6, p0, Lcom/appsflyer/internal/AFc1hSDK;->AFLogger:Ljava/util/Map;

    const-string v7, "\u6fc0\u87f0\u9d4f\u5abb\u1388\ua99d\u8cae\u305e\u4bc3\u2943\ue744\u90aa\ub1fd\u0ebc\uf74d\ub333"

    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v8

    shr-int/lit8 v8, v8, 0x16

    add-int/lit8 v8, v8, 0xf

    new-array v9, v4, [Ljava/lang/Object;

    invoke-static {v7, v8, v9}, Lcom/appsflyer/internal/AFc1hSDK;->b(Ljava/lang/String;I[Ljava/lang/Object;)V

    aget-object v7, v9, v5

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    .line 20
    const-string v7, "\u0f03\u865f\u131c\ue396\uec19\u27ba"

    invoke-static {v1, v2}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;C)I

    move-result v8

    rsub-int/lit8 v8, v8, 0x4

    new-array v9, v4, [Ljava/lang/Object;

    invoke-static {v7, v8, v9}, Lcom/appsflyer/internal/AFc1hSDK;->b(Ljava/lang/String;I[Ljava/lang/Object;)V

    aget-object v7, v9, v5

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v7

    .line 21
    const-string v8, "\u0013\u0019\u0006-\u362c"

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    move-result v9

    shr-int/lit8 v9, v9, 0x8

    add-int/lit8 v9, v9, 0x5

    invoke-static {v5}, Landroid/graphics/Color;->alpha(I)I

    move-result v10

    rsub-int/lit8 v10, v10, 0x7c

    int-to-byte v10, v10

    new-array v11, v4, [Ljava/lang/Object;

    invoke-static {v8, v9, v10, v11}, Lcom/appsflyer/internal/AFc1hSDK;->a(Ljava/lang/String;IB[Ljava/lang/Object;)V

    aget-object v8, v11, v5

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 22
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/appsflyer/internal/AFj1nSDK;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 23
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    move-object v6, v0

    goto/16 :goto_1

    :catch_0
    move-exception v0

    move-object v9, v0

    .line 24
    sget-object v6, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v7, Lcom/appsflyer/sdk_base/logger/LogTag;->SECURITY:Lcom/appsflyer/sdk_base/logger/LogTag;

    invoke-static {v1, v1, v5, v5}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    move-result v0

    add-int/lit8 v0, v0, 0x2b

    invoke-static {v1, v2, v5}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CI)I

    move-result v8

    add-int/lit8 v8, v8, 0x21

    int-to-byte v8, v8

    new-array v10, v4, [Ljava/lang/Object;

    const-string v11, "\u0013\n\u0002\u000e\u0002\u0013#\u0013\u0005\r0!$/\u0013\u0007!+\u0013\n\n\r!/\u0001*\n\u0010-\u0005!\n\u0000-\r\u0004(+/\'\u0014\u0000\u361f"

    invoke-static {v11, v0, v8, v10}, Lcom/appsflyer/internal/AFc1hSDK;->a(Ljava/lang/String;IB[Ljava/lang/Object;)V

    aget-object v0, v10, v5

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v8

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-virtual/range {v6 .. v11}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v8

    shr-int/lit8 v8, v8, 0x16

    rsub-int/lit8 v8, v8, 0x31

    new-array v10, v4, [Ljava/lang/Object;

    const-string v11, "\u6200\uaff1\u3d0a\u322f\u26b9\ud62f\u595e\uf895\u6677\uf538\uc4cb\ubf88\ub1fd\u0ebc\ueaed\ufe15\u8175\u8e11\uee9f\u38e5\ua0ba\u9162\ubc21\u4695\u12fb\u864e\uc3fb\u8f1c\ub48f\u5b3c\u9b18\uef18\ua0d1\u4d60\u0e83\uf78a\ub636\u10ad\u4f83\u09f1\ufe72\u2e50\u5f46\u8279\ud613\u1aee\uadc9\uebc9\uc515\ub0cf"

    invoke-static {v11, v8, v10}, Lcom/appsflyer/internal/AFc1hSDK;->b(Ljava/lang/String;I[Ljava/lang/Object;)V

    aget-object v8, v10, v5

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v7, v0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->v(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    move-result v6

    shr-int/2addr v6, v3

    add-int/lit8 v6, v6, 0x12

    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    move-result v7

    shr-int/2addr v7, v3

    int-to-byte v7, v7

    new-array v8, v4, [Ljava/lang/Object;

    const-string v9, "\u001a%\u001a\t/\u0013&\u000b #\u001e\u0001\r\u001d\u0004(\u000f\u0008"

    invoke-static {v9, v6, v7, v8}, Lcom/appsflyer/internal/AFc1hSDK;->a(Ljava/lang/String;IB[Ljava/lang/Object;)V

    aget-object v6, v8, v5

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :goto_1
    const-wide/16 v7, 0x0

    .line 27
    :try_start_1
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1hSDK;->d:Landroid/content/Context;

    new-instance v9, Landroid/content/IntentFilter;

    const-string v10, "\ua11c\u4cb6\uf29b\u8126\uc477\u2ce4\u3247\u4b6f\ueaed\ufe15\udd09\u1e2d\u087f\u94c6\u62b9\u7eec\u70af\ude12\ud613\u1aee\u119b\u7b87\u4694\u795b\u5f83\u8341\u6873\ua402\ua13a\u3bbd\uca03\u5133\ua0dd\u492b\uad4d\ueded\u335f\u302a"

    invoke-static {v5}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    move-result v11

    rsub-int/lit8 v11, v11, 0x25

    new-array v12, v4, [Ljava/lang/Object;

    invoke-static {v10, v11, v12}, Lcom/appsflyer/internal/AFc1hSDK;->b(Ljava/lang/String;I[Ljava/lang/Object;)V

    aget-object v10, v12, v5

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v10}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v9, v10}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const/4 v10, 0x0

    invoke-virtual {v0, v10, v9}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v0

    const/16 v9, -0xa8c

    const/4 v10, 0x0

    if-eqz v0, :cond_0

    .line 28
    const-string v11, "\udd09\u1e2d\u4d0c\uebb7\uc4cb\ubf88\ub1fd\u0ebc\uf3e3\uc2fa\uf74d\ub333"

    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    move-result v12

    cmpl-float v12, v12, v10

    rsub-int/lit8 v12, v12, 0xc

    new-array v13, v4, [Ljava/lang/Object;

    invoke-static {v11, v12, v13}, Lcom/appsflyer/internal/AFc1hSDK;->b(Ljava/lang/String;I[Ljava/lang/Object;)V

    aget-object v11, v13, v5

    check-cast v11, Ljava/lang/String;

    invoke-virtual {v11}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0, v11, v9}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v9
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v0

    move-object v12, v0

    goto/16 :goto_6

    .line 29
    :cond_0
    sget v0, Lcom/appsflyer/internal/AFc1hSDK;->e:I

    add-int/lit8 v0, v0, 0x61

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFc1hSDK;->v:I

    .line 30
    :goto_2
    :try_start_2
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1hSDK;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    if-eqz v0, :cond_1

    .line 31
    sget v11, Lcom/appsflyer/internal/AFc1hSDK;->e:I

    add-int/lit8 v11, v11, 0x6d

    rem-int/lit16 v11, v11, 0x80

    sput v11, Lcom/appsflyer/internal/AFc1hSDK;->v:I

    .line 32
    :try_start_3
    const-string v11, "\uf9a7\ud46f\u1516\u8394"

    invoke-static {v5, v5, v5}, Landroid/graphics/Color;->rgb(III)I

    move-result v12

    const v13, 0x1000003

    add-int/2addr v12, v13

    new-array v13, v4, [Ljava/lang/Object;

    invoke-static {v11, v12, v13}, Lcom/appsflyer/internal/AFc1hSDK;->b(Ljava/lang/String;I[Ljava/lang/Object;)V

    aget-object v11, v13, v5

    check-cast v11, Ljava/lang/String;

    invoke-virtual {v11}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    if-eqz v0, :cond_1

    .line 33
    sget v0, Lcom/appsflyer/internal/AFc1hSDK;->v:I

    add-int/lit8 v0, v0, 0x6f

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFc1hSDK;->e:I

    move v0, v4

    goto :goto_3

    :cond_1
    move v0, v5

    .line 34
    :goto_3
    :try_start_4
    iget-object v11, p0, Lcom/appsflyer/internal/AFc1hSDK;->d:Landroid/content/Context;

    const-string v12, "\u000c\r\n\u000c\u0019\u001b"

    invoke-static {v7, v8}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    move-result v13

    add-int/lit8 v13, v13, 0x6

    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    move-result v14

    shr-int/lit8 v3, v14, 0x10

    add-int/lit8 v3, v3, 0x46

    int-to-byte v3, v3

    new-array v14, v4, [Ljava/lang/Object;

    invoke-static {v12, v13, v3, v14}, Lcom/appsflyer/internal/AFc1hSDK;->a(Ljava/lang/String;IB[Ljava/lang/Object;)V

    aget-object v3, v14, v5

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/hardware/SensorManager;

    const/4 v11, -0x1

    .line 35
    invoke-virtual {v3, v11}, Landroid/hardware/SensorManager;->getSensorList(I)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    .line 36
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "\u54d9\u9857"

    invoke-static {v1}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    move-result v13

    add-int/2addr v13, v4

    new-array v14, v4, [Ljava/lang/Object;

    invoke-static {v12, v13, v14}, Lcom/appsflyer/internal/AFc1hSDK;->b(Ljava/lang/String;I[Ljava/lang/Object;)V

    aget-object v12, v14, v5

    check-cast v12, Ljava/lang/String;

    invoke-virtual {v12}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, "\u2ab9\u7548"

    invoke-static {v1}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v12

    rsub-int/lit8 v12, v12, 0x2

    new-array v13, v4, [Ljava/lang/Object;

    invoke-static {v9, v12, v13}, Lcom/appsflyer/internal/AFc1hSDK;->b(Ljava/lang/String;I[Ljava/lang/Object;)V

    aget-object v9, v13, v5

    check-cast v9, Ljava/lang/String;

    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "\u0008\u000c"

    invoke-static {v5, v10, v10}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    move-result v9

    cmpl-float v9, v9, v10

    add-int/lit8 v9, v9, 0x2

    invoke-static {v1, v1, v5}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    move-result v10

    add-int/lit8 v10, v10, 0x25

    int-to-byte v10, v10

    new-array v12, v4, [Ljava/lang/Object;

    invoke-static {v0, v9, v10, v12}, Lcom/appsflyer/internal/AFc1hSDK;->a(Ljava/lang/String;IB[Ljava/lang/Object;)V

    aget-object v0, v12, v5

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "\r\u000e"

    invoke-static {v5, v5}, Landroid/view/View;->resolveSize(II)I

    move-result v3

    add-int/lit8 v3, v3, 0x2

    invoke-static {v1, v1, v5, v5}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    move-result v1

    add-int/lit8 v1, v1, 0x5f

    int-to-byte v1, v1

    new-array v9, v4, [Ljava/lang/Object;

    invoke-static {v0, v3, v1, v9}, Lcom/appsflyer/internal/AFc1hSDK;->a(Ljava/lang/String;IB[Ljava/lang/Object;)V

    aget-object v0, v9, v5

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/appsflyer/internal/AFc1hSDK;->AFLogger:Ljava/util/Map;

    .line 37
    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    move v3, v5

    .line 40
    :goto_4
    array-length v9, v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    if-ge v3, v9, :cond_2

    .line 41
    sget v9, Lcom/appsflyer/internal/AFc1hSDK;->v:I

    add-int/lit8 v9, v9, 0x31

    rem-int/lit16 v9, v9, 0x80

    sput v9, Lcom/appsflyer/internal/AFc1hSDK;->e:I

    .line 42
    :try_start_5
    aget-byte v9, v0, v3

    rem-int/lit8 v10, v3, 0x2

    add-int/lit8 v10, v10, 0x2a

    xor-int/2addr v9, v10

    int-to-byte v9, v9

    aput-byte v9, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 43
    :cond_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    array-length v9, v0

    move v10, v5

    :goto_5
    if-ge v10, v9, :cond_4

    aget-byte v11, v0, v10

    .line 45
    invoke-static {v11}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v11

    .line 46
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v12

    if-ne v12, v4, :cond_3

    .line 47
    const-string v12, "0"

    invoke-virtual {v12, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 48
    :cond_3
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v10, v10, 0x1

    goto :goto_5

    .line 49
    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 50
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_7

    .line 51
    :goto_6
    sget-object v9, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v10, Lcom/appsflyer/sdk_base/logger/LogTag;->SECURITY:Lcom/appsflyer/sdk_base/logger/LogTag;

    invoke-static {v5}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    add-int/2addr v0, v2

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v1

    shr-int/lit8 v1, v1, 0x16

    rsub-int/lit8 v1, v1, 0x29

    int-to-byte v1, v1

    new-array v2, v4, [Ljava/lang/Object;

    const-string v3, "\u0013\n\u0002\u000e\u0002\u0013#\u0013\u0005\r\u0005\u0013\u3611\u3611\u0019\u001b0(\u001d-\u0013\u0007-\u0013\r\n\u0013!#\u0005,\u0008\u0013-\u0008(\u0000\u0014#\u0005\u0019\u001b0!\u0013#\u0012\n"

    invoke-static {v3, v0, v1, v2}, Lcom/appsflyer/internal/AFc1hSDK;->a(Ljava/lang/String;IB[Ljava/lang/Object;)V

    aget-object v0, v2, v5

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v11

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-virtual/range {v9 .. v14}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v5}, Landroid/graphics/Color;->alpha(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x31

    new-array v2, v4, [Ljava/lang/Object;

    const-string v3, "\u6200\uaff1\u3d0a\u322f\u26b9\ud62f\u595e\uf895\u6677\uf538\uc4cb\ubf88\ub1fd\u0ebc\ueaed\ufe15\u8175\u8e11\u6a3f\uc0e0\ub48b\u53c2\ub1fd\u0ebc\u43f3\ua98c\u6fbd\ue145\u746f\u2a6f\u7228\ue4a4\ua0d1\u4d60\u0e83\uf78a\ub636\u10ad\u4f83\u09f1\ufe72\u2e50\u5f46\u8279\ud613\u1aee\uadc9\uebc9\uc515\ub0cf"

    invoke-static {v3, v1, v2}, Lcom/appsflyer/internal/AFc1hSDK;->b(Ljava/lang/String;I[Ljava/lang/Object;)V

    aget-object v1, v2, v5

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v10, v0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->v(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    move-result-wide v1

    cmp-long v1, v1, v7

    add-int/lit8 v1, v1, 0xf

    invoke-static {v7, v8}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    move-result v2

    rsub-int/lit8 v2, v2, 0x4

    int-to-byte v2, v2

    new-array v3, v4, [Ljava/lang/Object;

    const-string v4, " ) (\u001d\u000c\u000f\r\u0013\u0006\u0006\u0004\u001c\u0003)%"

    invoke-static {v4, v1, v2, v3}, Lcom/appsflyer/internal/AFc1hSDK;->a(Ljava/lang/String;IB[Ljava/lang/Object;)V

    aget-object v1, v3, v5

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_7
    return-object v0
.end method

.method private static varargs AFKeystoreWrapper([Ljava/lang/String;)Ljava/lang/StringBuilder;
    .locals 8
    .param p0    # [Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    array-length v1, p0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, 0x3

    if-ge v2, v3, :cond_0

    .line 3
    sget v3, Lcom/appsflyer/internal/AFc1hSDK;->e:I

    add-int/lit8 v3, v3, 0x61

    rem-int/lit16 v3, v3, 0x80

    sput v3, Lcom/appsflyer/internal/AFc1hSDK;->v:I

    .line 4
    aget-object v3, p0, v2

    .line 5
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 7
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    .line 8
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move v4, v1

    :goto_1
    if-ge v4, v0, :cond_3

    .line 9
    sget v5, Lcom/appsflyer/internal/AFc1hSDK;->e:I

    add-int/lit8 v5, v5, 0x53

    rem-int/lit16 v5, v5, 0x80

    sput v5, Lcom/appsflyer/internal/AFc1hSDK;->v:I

    const/4 v5, 0x0

    move v6, v1

    :goto_2
    if-ge v6, v3, :cond_2

    .line 10
    aget-object v7, p0, v6

    .line 11
    invoke-virtual {v7, v4}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-nez v5, :cond_1

    goto :goto_3

    .line 12
    :cond_1
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    xor-int/2addr v7, v5

    :goto_3
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    add-int/lit8 v6, v6, 0x1

    .line 13
    sget v7, Lcom/appsflyer/internal/AFc1hSDK;->e:I

    add-int/lit8 v7, v7, 0xf

    rem-int/lit16 v7, v7, 0x80

    sput v7, Lcom/appsflyer/internal/AFc1hSDK;->v:I

    goto :goto_2

    .line 14
    :cond_2
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v5

    .line 15
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    .line 16
    sget v5, Lcom/appsflyer/internal/AFc1hSDK;->e:I

    add-int/lit8 v5, v5, 0x47

    rem-int/lit16 v5, v5, 0x80

    sput v5, Lcom/appsflyer/internal/AFc1hSDK;->v:I

    goto :goto_1

    :cond_3
    return-object v2
.end method

.method private AFLogger()Ljava/lang/String;
    .locals 12
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 v1, 0x1

    const/4 v2, 0x0

    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lcom/appsflyer/internal/AFc1hSDK;->AFLogger:Ljava/util/Map;

    const-string v4, ")!#\u0003\u0001+\r\u000c\u0005#)\u000f"

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long v5, v5, v7

    add-int/lit8 v5, v5, 0xb

    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    move-result v6

    shr-int/lit8 v6, v6, 0x10

    add-int/lit8 v6, v6, 0x33

    int-to-byte v6, v6

    new-array v9, v1, [Ljava/lang/Object;

    invoke-static {v4, v5, v6, v9}, Lcom/appsflyer/internal/AFc1hSDK;->a(Ljava/lang/String;IB[Ljava/lang/Object;)V

    aget-object v4, v9, v2

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/appsflyer/internal/AFc1hSDK;->AFLogger:Ljava/util/Map;

    const-string v5, "\u0018\u001b%\u000c\u3663"

    invoke-static {v2}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    move-result v6

    const/4 v9, 0x4

    rsub-int/lit8 v6, v6, 0x4

    invoke-static {v2}, Landroid/graphics/Color;->red(I)I

    move-result v10

    add-int/lit8 v10, v10, 0x65

    int-to-byte v10, v10

    new-array v11, v1, [Ljava/lang/Object;

    invoke-static {v5, v6, v10, v11}, Lcom/appsflyer/internal/AFc1hSDK;->a(Ljava/lang/String;IB[Ljava/lang/Object;)V

    aget-object v5, v11, v2

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v4, :cond_0

    sget v4, Lcom/appsflyer/internal/AFc1hSDK;->e:I

    add-int/lit8 v4, v4, 0x53

    rem-int/lit16 v4, v4, 0x80

    sput v4, Lcom/appsflyer/internal/AFc1hSDK;->v:I

    :try_start_1
    const-string v4, "\u001f,$\u0018)\u0015 \u0017"

    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    move-result v5

    const/4 v6, 0x0

    cmpl-float v5, v5, v6

    add-int/lit8 v5, v5, 0x8

    invoke-static {v7, v8}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    move-result v6

    rsub-int/lit8 v6, v6, 0x15

    int-to-byte v6, v6

    new-array v10, v1, [Ljava/lang/Object;

    invoke-static {v4, v5, v6, v10}, Lcom/appsflyer/internal/AFc1hSDK;->a(Ljava/lang/String;IB[Ljava/lang/Object;)V

    aget-object v4, v10, v2

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v6, v0

    goto :goto_3

    :cond_0
    :goto_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->reverse()Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v0, v4, v3}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/appsflyer/internal/AFc1hSDK;->AFKeystoreWrapper([Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    if-le v3, v9, :cond_1

    invoke-virtual {v0, v9, v3}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :cond_1
    :goto_1
    if-ge v3, v9, :cond_3

    sget v4, Lcom/appsflyer/internal/AFc1hSDK;->v:I

    add-int/lit8 v4, v4, 0x49

    rem-int/lit16 v5, v4, 0x80

    sput v5, Lcom/appsflyer/internal/AFc1hSDK;->e:I

    rem-int/lit8 v4, v4, 0x2

    if-nez v4, :cond_2

    add-int/lit8 v3, v3, 0x2d

    const/16 v4, 0x5c

    :try_start_2
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    const/16 v4, 0x31

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_3
    :goto_2
    const-string v3, "/\u0007\u3648"

    invoke-static {v2}, Landroid/graphics/Color;->green(I)I

    move-result v4

    rsub-int/lit8 v4, v4, 0x3

    invoke-static {v2}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    move-result-wide v5

    cmp-long v5, v5, v7

    add-int/lit8 v5, v5, 0x4c

    int-to-byte v5, v5

    new-array v6, v1, [Ljava/lang/Object;

    invoke-static {v3, v4, v5, v6}, Lcom/appsflyer/internal/AFc1hSDK;->a(Ljava/lang/String;IB[Ljava/lang/Object;)V

    aget-object v3, v6, v2

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object v0

    :goto_3
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->SECURITY:Lcom/appsflyer/sdk_base/logger/LogTag;

    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    move-result v0

    shr-int/lit8 v0, v0, 0x10

    add-int/lit8 v0, v0, 0x1e

    const-string v9, ""

    invoke-static {v9, v9}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v5

    rsub-int/lit8 v5, v5, 0x6b

    int-to-byte v5, v5

    new-array v7, v1, [Ljava/lang/Object;

    const-string v8, "\u0013\n\u0002\u000e\u0001\u0013\u0013\u001a0!$/\u0013\u0007!+\u0013\n\n\r!/\u0001*\n\u00100+\u0013\u001a"

    invoke-static {v8, v0, v5, v7}, Lcom/appsflyer/internal/AFc1hSDK;->a(Ljava/lang/String;IB[Ljava/lang/Object;)V

    aget-object v0, v7, v2

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v2, v2}, Landroid/view/KeyEvent;->getDeadChar(II)I

    move-result v5

    rsub-int/lit8 v5, v5, 0x26

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    move-result v7

    shr-int/lit8 v7, v7, 0x10

    rsub-int/lit8 v7, v7, 0x72

    int-to-byte v7, v7

    new-array v8, v1, [Ljava/lang/Object;

    const-string v10, "!)*\u000f\u0008!-\u0013\r\n\u0013!#\u0005,\u0008\u0013-/\u0007\u001a\u0005$0\u0003\u001c\u0005\u0013\n\u0006\r\u0013\u0001*\u0017\n-0"

    invoke-static {v10, v5, v7, v8}, Lcom/appsflyer/internal/AFc1hSDK;->a(Ljava/lang/String;IB[Ljava/lang/Object;)V

    aget-object v5, v8, v2

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->v(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;)V

    const/16 v0, 0x30

    invoke-static {v9, v0, v2, v2}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    move-result v0

    rsub-int/lit8 v0, v0, 0x6

    invoke-static {v9, v9}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v3

    rsub-int/lit8 v3, v3, 0x17

    int-to-byte v3, v3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v4, "/\u0007\u001e\u0006\u35ba\u35ba\u35ba"

    invoke-static {v4, v0, v3, v1}, Lcom/appsflyer/internal/AFc1hSDK;->a(Ljava/lang/String;IB[Ljava/lang/Object;)V

    aget-object v0, v1, v2

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static a(Ljava/lang/String;IB[Ljava/lang/Object;)V
    .locals 12

    if-eqz p0, :cond_0

    sget v0, Lcom/appsflyer/internal/AFc1hSDK;->$11:I

    add-int/lit8 v0, v0, 0x39

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFc1hSDK;->$10:I

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    :cond_0
    check-cast p0, [C

    new-instance v0, Lcom/appsflyer/internal/AFk1sSDK;

    invoke-direct {v0}, Lcom/appsflyer/internal/AFk1sSDK;-><init>()V

    sget-object v1, Lcom/appsflyer/internal/AFc1hSDK;->unregisterClient:[C

    const-wide v2, -0x36e1765fc3cd03f5L    # -1.7025281608142096E44

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    sget v5, Lcom/appsflyer/internal/AFc1hSDK;->$11:I

    add-int/lit8 v5, v5, 0x6f

    rem-int/lit16 v5, v5, 0x80

    sput v5, Lcom/appsflyer/internal/AFc1hSDK;->$10:I

    array-length v5, v1

    new-array v6, v5, [C

    move v7, v4

    :goto_0
    if-ge v7, v5, :cond_1

    aget-char v8, v1, v7

    int-to-long v8, v8

    xor-long/2addr v8, v2

    long-to-int v8, v8

    int-to-char v8, v8

    aput-char v8, v6, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    sget v1, Lcom/appsflyer/internal/AFc1hSDK;->$11:I

    add-int/lit8 v1, v1, 0x35

    rem-int/lit16 v1, v1, 0x80

    sput v1, Lcom/appsflyer/internal/AFc1hSDK;->$10:I

    move-object v1, v6

    :cond_2
    sget-char v5, Lcom/appsflyer/internal/AFc1hSDK;->AFKeystoreWrapper:C

    int-to-long v5, v5

    xor-long/2addr v2, v5

    long-to-int v2, v2

    int-to-char v2, v2

    new-array v3, p1, [C

    rem-int/lit8 v5, p1, 0x2

    if-eqz v5, :cond_3

    add-int/lit8 v5, p1, -0x1

    aget-char v6, p0, v5

    sub-int/2addr v6, p2

    int-to-char v6, v6

    aput-char v6, v3, v5

    goto :goto_1

    :cond_3
    move v5, p1

    :goto_1
    const/4 v6, 0x1

    if-le v5, v6, :cond_7

    iput v4, v0, Lcom/appsflyer/internal/AFk1sSDK;->AFLogger:I

    :goto_2
    iget v7, v0, Lcom/appsflyer/internal/AFk1sSDK;->AFLogger:I

    if-ge v7, v5, :cond_7

    sget v8, Lcom/appsflyer/internal/AFc1hSDK;->$11:I

    add-int/lit8 v8, v8, 0x7

    rem-int/lit16 v8, v8, 0x80

    sput v8, Lcom/appsflyer/internal/AFc1hSDK;->$10:I

    aget-char v9, p0, v7

    iput-char v9, v0, Lcom/appsflyer/internal/AFk1sSDK;->d:C

    add-int/lit8 v10, v7, 0x1

    aget-char v10, p0, v10

    iput-char v10, v0, Lcom/appsflyer/internal/AFk1sSDK;->AFKeystoreWrapper:C

    if-ne v9, v10, :cond_4

    sub-int/2addr v9, p2

    int-to-char v9, v9

    aput-char v9, v3, v7

    add-int/lit8 v9, v7, 0x1

    sub-int/2addr v10, p2

    int-to-char v10, v10

    aput-char v10, v3, v9

    add-int/lit8 v8, v8, 0x57

    rem-int/lit16 v8, v8, 0x80

    sput v8, Lcom/appsflyer/internal/AFc1hSDK;->$11:I

    goto :goto_3

    :cond_4
    div-int v8, v9, v2

    iput v8, v0, Lcom/appsflyer/internal/AFk1sSDK;->unregisterClient:I

    rem-int/2addr v9, v2

    iput v9, v0, Lcom/appsflyer/internal/AFk1sSDK;->e:I

    div-int v11, v10, v2

    iput v11, v0, Lcom/appsflyer/internal/AFk1sSDK;->registerClient:I

    rem-int/2addr v10, v2

    iput v10, v0, Lcom/appsflyer/internal/AFk1sSDK;->w:I

    if-ne v9, v10, :cond_5

    add-int/2addr v8, v2

    sub-int/2addr v8, v6

    rem-int/2addr v8, v2

    iput v8, v0, Lcom/appsflyer/internal/AFk1sSDK;->unregisterClient:I

    add-int/2addr v11, v2

    sub-int/2addr v11, v6

    rem-int/2addr v11, v2

    iput v11, v0, Lcom/appsflyer/internal/AFk1sSDK;->registerClient:I

    mul-int/2addr v8, v2

    add-int/2addr v8, v9

    mul-int/2addr v11, v2

    add-int/2addr v11, v10

    aget-char v8, v1, v8

    aput-char v8, v3, v7

    add-int/lit8 v8, v7, 0x1

    aget-char v9, v1, v11

    aput-char v9, v3, v8

    goto :goto_3

    :cond_5
    if-ne v8, v11, :cond_6

    add-int/2addr v9, v2

    sub-int/2addr v9, v6

    rem-int/2addr v9, v2

    iput v9, v0, Lcom/appsflyer/internal/AFk1sSDK;->e:I

    add-int/2addr v10, v2

    sub-int/2addr v10, v6

    rem-int/2addr v10, v2

    iput v10, v0, Lcom/appsflyer/internal/AFk1sSDK;->w:I

    mul-int/2addr v8, v2

    add-int/2addr v8, v9

    mul-int/2addr v11, v2

    add-int/2addr v11, v10

    aget-char v8, v1, v8

    aput-char v8, v3, v7

    add-int/lit8 v8, v7, 0x1

    aget-char v9, v1, v11

    aput-char v9, v3, v8

    goto :goto_3

    :cond_6
    mul-int/2addr v8, v2

    add-int/2addr v8, v10

    mul-int/2addr v11, v2

    add-int/2addr v11, v9

    aget-char v8, v1, v8

    aput-char v8, v3, v7

    add-int/lit8 v8, v7, 0x1

    aget-char v9, v1, v11

    aput-char v9, v3, v8

    :goto_3
    add-int/lit8 v7, v7, 0x2

    iput v7, v0, Lcom/appsflyer/internal/AFk1sSDK;->AFLogger:I

    goto :goto_2

    :cond_7
    move p0, v4

    :goto_4
    if-ge p0, p1, :cond_8

    aget-char p2, v3, p0

    xor-int/lit16 p2, p2, 0x359a

    int-to-char p2, p2

    aput-char p2, v3, p0

    add-int/lit8 p0, p0, 0x1

    goto :goto_4

    :cond_8
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v3}, Ljava/lang/String;-><init>([C)V

    aput-object p0, p3, v4

    return-void
.end method

.method private static b(Ljava/lang/String;I[Ljava/lang/Object;)V
    .locals 17

    const/4 v0, 0x2

    if-eqz p0, :cond_1

    sget v1, Lcom/appsflyer/internal/AFc1hSDK;->$10:I

    add-int/lit8 v1, v1, 0x27

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/appsflyer/internal/AFc1hSDK;->$11:I

    rem-int/2addr v1, v0

    if-eqz v1, :cond_0

    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->toCharArray()[C

    const/4 v0, 0x0

    throw v0

    :cond_1
    move-object/from16 v1, p0

    :goto_0
    check-cast v1, [C

    new-instance v2, Lcom/appsflyer/internal/AFk1uSDK;

    invoke-direct {v2}, Lcom/appsflyer/internal/AFk1uSDK;-><init>()V

    array-length v3, v1

    new-array v3, v3, [C

    const/4 v4, 0x0

    iput v4, v2, Lcom/appsflyer/internal/AFk1uSDK;->AFKeystoreWrapper:I

    new-array v5, v0, [C

    :goto_1
    iget v6, v2, Lcom/appsflyer/internal/AFk1uSDK;->AFKeystoreWrapper:I

    array-length v7, v1

    if-ge v6, v7, :cond_3

    aget-char v7, v1, v6

    aput-char v7, v5, v4

    add-int/lit8 v6, v6, 0x1

    aget-char v6, v1, v6

    const/4 v7, 0x1

    aput-char v6, v5, v7

    const v6, 0xe370

    move v8, v4

    :goto_2
    const/16 v9, 0x10

    if-ge v8, v9, :cond_2

    aget-char v9, v5, v7

    aget-char v10, v5, v4

    add-int v11, v10, v6

    shl-int/lit8 v12, v10, 0x4

    sget-char v13, Lcom/appsflyer/internal/AFc1hSDK;->i:C

    int-to-long v13, v13

    const-wide v15, -0x6fededfe9eddb959L    # -2.909842667540399E-231

    xor-long/2addr v13, v15

    long-to-int v13, v13

    int-to-char v13, v13

    add-int/2addr v12, v13

    xor-int/2addr v11, v12

    ushr-int/lit8 v12, v10, 0x5

    sget-char v13, Lcom/appsflyer/internal/AFc1hSDK;->w:C

    int-to-long v13, v13

    xor-long/2addr v13, v15

    long-to-int v13, v13

    int-to-char v13, v13

    add-int/2addr v12, v13

    xor-int/2addr v11, v12

    sub-int/2addr v9, v11

    int-to-char v9, v9

    aput-char v9, v5, v7

    add-int v11, v9, v6

    shl-int/lit8 v12, v9, 0x4

    sget-char v13, Lcom/appsflyer/internal/AFc1hSDK;->registerClient:C

    int-to-long v13, v13

    xor-long/2addr v13, v15

    long-to-int v13, v13

    int-to-char v13, v13

    add-int/2addr v12, v13

    xor-int/2addr v11, v12

    ushr-int/lit8 v9, v9, 0x5

    sget-char v12, Lcom/appsflyer/internal/AFc1hSDK;->force:C

    int-to-long v12, v12

    xor-long/2addr v12, v15

    long-to-int v12, v12

    int-to-char v12, v12

    add-int/2addr v9, v12

    xor-int/2addr v9, v11

    sub-int/2addr v10, v9

    int-to-char v9, v10

    aput-char v9, v5, v4

    const v9, 0x9e37

    sub-int/2addr v6, v9

    add-int/lit8 v8, v8, 0x1

    sget v9, Lcom/appsflyer/internal/AFc1hSDK;->$11:I

    add-int/lit8 v9, v9, 0x5d

    rem-int/lit16 v9, v9, 0x80

    sput v9, Lcom/appsflyer/internal/AFc1hSDK;->$10:I

    goto :goto_2

    :cond_2
    iget v6, v2, Lcom/appsflyer/internal/AFk1uSDK;->AFKeystoreWrapper:I

    aget-char v8, v5, v4

    aput-char v8, v3, v6

    add-int/lit8 v8, v6, 0x1

    aget-char v7, v5, v7

    aput-char v7, v3, v8

    add-int/2addr v6, v0

    iput v6, v2, Lcom/appsflyer/internal/AFk1uSDK;->AFKeystoreWrapper:I

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/lang/String;

    move/from16 v1, p1

    invoke-direct {v0, v3, v4, v1}, Ljava/lang/String;-><init>([CII)V

    aput-object v0, p2, v4

    return-void
.end method

.method public static registerClient()V
    .locals 1

    const/16 v0, 0x31

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lcom/appsflyer/internal/AFc1hSDK;->unregisterClient:[C

    const v0, 0xfc0c

    sput-char v0, Lcom/appsflyer/internal/AFc1hSDK;->AFKeystoreWrapper:C

    const/16 v0, 0x4dd4

    sput-char v0, Lcom/appsflyer/internal/AFc1hSDK;->registerClient:C

    const v0, 0xf767

    sput-char v0, Lcom/appsflyer/internal/AFc1hSDK;->force:C

    const v0, 0xa8d5

    sput-char v0, Lcom/appsflyer/internal/AFc1hSDK;->i:C

    const v0, 0xa297

    sput-char v0, Lcom/appsflyer/internal/AFc1hSDK;->w:C

    return-void

    :array_0
    .array-data 2
        -0x361bs
        -0x3657s
        -0x3658s
        -0x360es
        -0x3645s
        -0x365ds
        -0x361cs
        -0x3649s
        -0x3660s
        -0x3601s
        -0x365cs
        -0x361es
        -0x360cs
        -0x3617s
        -0x3603s
        -0x3626s
        -0x3639s
        -0x360as
        -0x3644s
        -0x3618s
        -0x361fs
        -0x35f5s
        -0x362ds
        -0x360ds
        -0x3602s
        -0x362bs
        -0x361ds
        -0x3630s
        -0x365bs
        -0x360bs
        -0x3621s
        -0x3607s
        -0x3605s
        -0x3620s
        -0x3609s
        -0x363ds
        -0x3604s
        -0x360fs
        -0x3632s
        -0x365fs
        -0x3610s
        -0x361as
        -0x3606s
        -0x3608s
        -0x3655s
        -0x3622s
        -0x3619s
        -0x364fs
        -0x3641s
    .end array-data
.end method
