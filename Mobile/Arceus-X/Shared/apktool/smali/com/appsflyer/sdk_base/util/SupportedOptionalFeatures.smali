.class public final enum Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;",
        "",
        "className",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getClassName",
        "()Ljava/lang/String;",
        "EXCEPTION_MANAGER",
        "LVL",
        "sdk_base_release"
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
.field private static final synthetic $ENTRIES:Lqt/a;

.field private static final synthetic $VALUES:[Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;

.field public static final enum EXCEPTION_MANAGER:Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;

.field public static final enum LVL:Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;


# instance fields
.field private final className:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;
    .locals 2

    sget-object v0, Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;->EXCEPTION_MANAGER:Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;

    sget-object v1, Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;->LVL:Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;

    filled-new-array {v0, v1}, [Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;

    const/4 v1, 0x0

    const-string v2, "com.appsflyer.exception_manager.ExceptionManager"

    const-string v3, "EXCEPTION_MANAGER"

    invoke-direct {v0, v3, v1, v2}, Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;->EXCEPTION_MANAGER:Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;

    new-instance v0, Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;

    const/4 v1, 0x1

    const-string v2, "com.appsflyer.lvl.AppsFlyerLVL"

    const-string v3, "LVL"

    invoke-direct {v0, v3, v1, v2}, Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;->LVL:Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;

    invoke-static {}, Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;->$values()[Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;

    move-result-object v0

    sput-object v0, Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;->$VALUES:[Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;->$ENTRIES:Lqt/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;->className:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lqt/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lqt/a<",
            "Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;->$ENTRIES:Lqt/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;
    .locals 1

    const-class v0, Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;

    return-object p0
.end method

.method public static values()[Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;
    .locals 1

    sget-object v0, Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;->$VALUES:[Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;

    return-object v0
.end method


# virtual methods
.method public final getClassName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/sdk_base/util/SupportedOptionalFeatures;->className:Ljava/lang/String;

    return-object v0
.end method
