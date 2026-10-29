.class public final enum Lcom/appsflyer/internal/AFd1bSDK;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFe1zSDK;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/AFd1bSDK$AFa1vSDK;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/appsflyer/internal/AFd1bSDK;",
        ">;",
        "Lcom/appsflyer/internal/AFe1zSDK;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u001a\u0008\u0086\u0001\u0018\u0000 \u000c2\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000cB\u0011\u0008\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00038\u0017X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000bj\u0002\u0008\tj\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001bj\u0002\u0008\u001cj\u0002\u0008\u001d"
    }
    d2 = {
        "Lcom/appsflyer/internal/AFd1bSDK;",
        "Lcom/appsflyer/internal/AFe1zSDK;",
        "",
        "",
        "p0",
        "<init>",
        "(Ljava/lang/String;II)V",
        "getEntries",
        "I",
        "AFLogger",
        "()I",
        "unregisterClient",
        "AFa1vSDK",
        "d",
        "AFKeystoreWrapper",
        "registerClient",
        "v",
        "i",
        "force",
        "e",
        "w",
        "afDebugLog",
        "afInfoLog",
        "afErrorLog",
        "AFLoggerLogLevel",
        "afWarnLog",
        "values",
        "AppsFlyerLib",
        "getLevel",
        "valueOf"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final enum AFKeystoreWrapper:Lcom/appsflyer/internal/AFd1bSDK;

.field public static final enum AFLogger:Lcom/appsflyer/internal/AFd1bSDK;

.field public static final enum AFLoggerLogLevel:Lcom/appsflyer/internal/AFd1bSDK;

.field public static final AFa1vSDK:Lcom/appsflyer/internal/AFd1bSDK$AFa1vSDK;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final enum AppsFlyerLib:Lcom/appsflyer/internal/AFd1bSDK;

.field public static final enum afDebugLog:Lcom/appsflyer/internal/AFd1bSDK;

.field public static final enum afErrorLog:Lcom/appsflyer/internal/AFd1bSDK;

.field public static final enum afInfoLog:Lcom/appsflyer/internal/AFd1bSDK;

.field public static final enum afWarnLog:Lcom/appsflyer/internal/AFd1bSDK;

.field public static final enum d:Lcom/appsflyer/internal/AFd1bSDK;

.field public static final enum e:Lcom/appsflyer/internal/AFd1bSDK;

.field private static final synthetic enableTCFDataCollection:[Lcom/appsflyer/internal/AFd1bSDK;

.field public static final enum force:Lcom/appsflyer/internal/AFd1bSDK;

.field private static final synthetic getInstance:Lqt/a;

.field public static final enum getLevel:Lcom/appsflyer/internal/AFd1bSDK;

.field public static final enum i:Lcom/appsflyer/internal/AFd1bSDK;

.field public static final enum registerClient:Lcom/appsflyer/internal/AFd1bSDK;

.field public static final enum unregisterClient:Lcom/appsflyer/internal/AFd1bSDK;

.field public static final enum v:Lcom/appsflyer/internal/AFd1bSDK;

.field public static final enum valueOf:Lcom/appsflyer/internal/AFd1bSDK;

.field public static final enum values:Lcom/appsflyer/internal/AFd1bSDK;

.field public static final enum w:Lcom/appsflyer/internal/AFd1bSDK;


# instance fields
.field private final getEntries:I


# direct methods
.method static constructor <clinit>()V
    .locals 22

    new-instance v1, Lcom/appsflyer/internal/AFd1bSDK;

    const-string v0, "RC_CDN"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v1, v0, v2, v3}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/appsflyer/internal/AFd1bSDK;->d:Lcom/appsflyer/internal/AFd1bSDK;

    new-instance v2, Lcom/appsflyer/internal/AFd1bSDK;

    const-string v0, "FETCH_ADVERTISING_ID"

    invoke-direct {v2, v0, v3, v3}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lcom/appsflyer/internal/AFd1bSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFd1bSDK;

    new-instance v3, Lcom/appsflyer/internal/AFd1bSDK;

    const-string v0, "LOAD_CACHE"

    const/4 v4, 0x2

    invoke-direct {v3, v0, v4, v4}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/appsflyer/internal/AFd1bSDK;->unregisterClient:Lcom/appsflyer/internal/AFd1bSDK;

    new-instance v0, Lcom/appsflyer/internal/AFd1bSDK;

    const-string v5, "CACHED_EVENT"

    const/4 v6, 0x3

    invoke-direct {v0, v5, v6, v4}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/appsflyer/internal/AFd1bSDK;->AFLogger:Lcom/appsflyer/internal/AFd1bSDK;

    new-instance v5, Lcom/appsflyer/internal/AFd1bSDK;

    const-string v7, "CONVERSION"

    const/4 v8, 0x4

    invoke-direct {v5, v7, v8, v4}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/appsflyer/internal/AFd1bSDK;->registerClient:Lcom/appsflyer/internal/AFd1bSDK;

    new-instance v7, Lcom/appsflyer/internal/AFd1bSDK;

    const-string v9, "PLAY_INTEGRITY_API"

    const/4 v10, 0x5

    invoke-direct {v7, v9, v10, v4}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lcom/appsflyer/internal/AFd1bSDK;->v:Lcom/appsflyer/internal/AFd1bSDK;

    move-object v9, v7

    new-instance v7, Lcom/appsflyer/internal/AFd1bSDK;

    const-string v10, "ONELINK"

    const/4 v11, 0x6

    invoke-direct {v7, v10, v11, v4}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lcom/appsflyer/internal/AFd1bSDK;->i:Lcom/appsflyer/internal/AFd1bSDK;

    new-instance v10, Lcom/appsflyer/internal/AFd1bSDK;

    const-string v11, "DLSDK"

    const/4 v12, 0x7

    invoke-direct {v10, v11, v12, v4}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    sput-object v10, Lcom/appsflyer/internal/AFd1bSDK;->force:Lcom/appsflyer/internal/AFd1bSDK;

    move-object v11, v9

    new-instance v9, Lcom/appsflyer/internal/AFd1bSDK;

    const-string v12, "RESOLVE_ESP"

    const/16 v13, 0x8

    invoke-direct {v9, v12, v13, v4}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lcom/appsflyer/internal/AFd1bSDK;->e:Lcom/appsflyer/internal/AFd1bSDK;

    move-object v12, v10

    new-instance v10, Lcom/appsflyer/internal/AFd1bSDK;

    const-string v13, "ATTR"

    const/16 v14, 0x9

    invoke-direct {v10, v13, v14, v4}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    sput-object v10, Lcom/appsflyer/internal/AFd1bSDK;->w:Lcom/appsflyer/internal/AFd1bSDK;

    move-object v4, v11

    new-instance v11, Lcom/appsflyer/internal/AFd1bSDK;

    const-string v13, "GCDSDK"

    const/16 v14, 0xa

    invoke-direct {v11, v13, v14, v6}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lcom/appsflyer/internal/AFd1bSDK;->afDebugLog:Lcom/appsflyer/internal/AFd1bSDK;

    move-object v6, v12

    new-instance v12, Lcom/appsflyer/internal/AFd1bSDK;

    const-string v13, "REGISTER"

    const/16 v14, 0xb

    invoke-direct {v12, v13, v14, v8}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    sput-object v12, Lcom/appsflyer/internal/AFd1bSDK;->afInfoLog:Lcom/appsflyer/internal/AFd1bSDK;

    new-instance v13, Lcom/appsflyer/internal/AFd1bSDK;

    const-string v14, "LAUNCH"

    const/16 v15, 0xc

    invoke-direct {v13, v14, v15, v8}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    sput-object v13, Lcom/appsflyer/internal/AFd1bSDK;->afErrorLog:Lcom/appsflyer/internal/AFd1bSDK;

    new-instance v14, Lcom/appsflyer/internal/AFd1bSDK;

    const-string v15, "INAPP"

    move-object/from16 v16, v0

    const/16 v0, 0xd

    invoke-direct {v14, v15, v0, v8}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    sput-object v14, Lcom/appsflyer/internal/AFd1bSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFd1bSDK;

    new-instance v15, Lcom/appsflyer/internal/AFd1bSDK;

    const-string v0, "MANUAL_PURCHASE_VALIDATION"

    move-object/from16 v17, v1

    const/16 v1, 0xe

    invoke-direct {v15, v0, v1, v8}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    sput-object v15, Lcom/appsflyer/internal/AFd1bSDK;->afWarnLog:Lcom/appsflyer/internal/AFd1bSDK;

    new-instance v0, Lcom/appsflyer/internal/AFd1bSDK;

    const-string v1, "PURCHASE_VALIDATE"

    move-object/from16 v18, v2

    const/16 v2, 0xf

    invoke-direct {v0, v1, v2, v8}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/appsflyer/internal/AFd1bSDK;->values:Lcom/appsflyer/internal/AFd1bSDK;

    new-instance v1, Lcom/appsflyer/internal/AFd1bSDK;

    const-string v2, "IMPRESSIONS"

    move-object/from16 v19, v0

    const/16 v0, 0x10

    invoke-direct {v1, v2, v0, v8}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/appsflyer/internal/AFd1bSDK;->AppsFlyerLib:Lcom/appsflyer/internal/AFd1bSDK;

    new-instance v0, Lcom/appsflyer/internal/AFd1bSDK;

    const-string v2, "ARS_VALIDATE"

    move-object/from16 v20, v1

    const/16 v1, 0x11

    invoke-direct {v0, v2, v1, v8}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/appsflyer/internal/AFd1bSDK;->getLevel:Lcom/appsflyer/internal/AFd1bSDK;

    new-instance v1, Lcom/appsflyer/internal/AFd1bSDK;

    const-string v2, "ADREVENUE"

    move-object/from16 v21, v0

    const/16 v0, 0x12

    invoke-direct {v1, v2, v0, v8}, Lcom/appsflyer/internal/AFd1bSDK;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/appsflyer/internal/AFd1bSDK;->valueOf:Lcom/appsflyer/internal/AFd1bSDK;

    move-object v8, v6

    move-object/from16 v2, v18

    move-object/from16 v18, v21

    move-object v6, v4

    move-object/from16 v4, v16

    move-object/from16 v16, v19

    move-object/from16 v19, v1

    move-object/from16 v1, v17

    move-object/from16 v17, v20

    filled-new-array/range {v1 .. v19}, [Lcom/appsflyer/internal/AFd1bSDK;

    move-result-object v0

    sput-object v0, Lcom/appsflyer/internal/AFd1bSDK;->enableTCFDataCollection:[Lcom/appsflyer/internal/AFd1bSDK;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lcom/appsflyer/internal/AFd1bSDK;->getInstance:Lqt/a;

    new-instance v0, Lcom/appsflyer/internal/AFd1bSDK$AFa1vSDK;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFd1bSDK$AFa1vSDK;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/appsflyer/internal/AFd1bSDK;->AFa1vSDK:Lcom/appsflyer/internal/AFd1bSDK$AFa1vSDK;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/appsflyer/internal/AFd1bSDK;->getEntries:I

    return-void
.end method

.method public static final registerClient(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1bSDK;
    .locals 0
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/appsflyer/internal/AFd1bSDK$AFa1vSDK;->registerClient(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1bSDK;

    move-result-object p0

    return-object p0
.end method

.method public static registerClient()Lqt/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lqt/a<",
            "Lcom/appsflyer/internal/AFd1bSDK;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    sget-object v0, Lcom/appsflyer/internal/AFd1bSDK;->getInstance:Lqt/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/appsflyer/internal/AFd1bSDK;
    .locals 1

    const-class v0, Lcom/appsflyer/internal/AFd1bSDK;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/appsflyer/internal/AFd1bSDK;

    return-object p0
.end method

.method public static values()[Lcom/appsflyer/internal/AFd1bSDK;
    .locals 1

    sget-object v0, Lcom/appsflyer/internal/AFd1bSDK;->enableTCFDataCollection:[Lcom/appsflyer/internal/AFd1bSDK;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/appsflyer/internal/AFd1bSDK;

    return-object v0
.end method


# virtual methods
.method public final AFLogger()I
    .locals 1

    iget v0, p0, Lcom/appsflyer/internal/AFd1bSDK;->getEntries:I

    return v0
.end method

.method public final synthetic unregisterClient()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
