.class public final enum Lcom/appsflyer/share/AFPurchaseType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/appsflyer/share/AFPurchaseType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\t\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tj\u0002\u0008\nj\u0002\u0008\u000b"
    }
    d2 = {
        "Lcom/appsflyer/share/AFPurchaseType;",
        "",
        "",
        "p0",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "value",
        "Ljava/lang/String;",
        "getValue",
        "()Ljava/lang/String;",
        "SUBSCRIPTION",
        "ONE_TIME_PURCHASE"
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
.field private static final synthetic AFKeystoreWrapper:Lqt/a;

.field public static final enum ONE_TIME_PURCHASE:Lcom/appsflyer/share/AFPurchaseType;

.field public static final enum SUBSCRIPTION:Lcom/appsflyer/share/AFPurchaseType;

.field private static final synthetic unregisterClient:[Lcom/appsflyer/share/AFPurchaseType;


# instance fields
.field private final value:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/appsflyer/share/AFPurchaseType;

    const/4 v1, 0x0

    const-string v2, "subscription"

    const-string v3, "SUBSCRIPTION"

    invoke-direct {v0, v3, v1, v2}, Lcom/appsflyer/share/AFPurchaseType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/appsflyer/share/AFPurchaseType;->SUBSCRIPTION:Lcom/appsflyer/share/AFPurchaseType;

    new-instance v1, Lcom/appsflyer/share/AFPurchaseType;

    const/4 v2, 0x1

    const-string v3, "one_time_purchase"

    const-string v4, "ONE_TIME_PURCHASE"

    invoke-direct {v1, v4, v2, v3}, Lcom/appsflyer/share/AFPurchaseType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/appsflyer/share/AFPurchaseType;->ONE_TIME_PURCHASE:Lcom/appsflyer/share/AFPurchaseType;

    filled-new-array {v0, v1}, [Lcom/appsflyer/share/AFPurchaseType;

    move-result-object v0

    sput-object v0, Lcom/appsflyer/share/AFPurchaseType;->unregisterClient:[Lcom/appsflyer/share/AFPurchaseType;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lcom/appsflyer/share/AFPurchaseType;->AFKeystoreWrapper:Lqt/a;

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

    iput-object p3, p0, Lcom/appsflyer/share/AFPurchaseType;->value:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lqt/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lqt/a<",
            "Lcom/appsflyer/share/AFPurchaseType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lcom/appsflyer/share/AFPurchaseType;->AFKeystoreWrapper:Lqt/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/appsflyer/share/AFPurchaseType;
    .locals 1

    const-class v0, Lcom/appsflyer/share/AFPurchaseType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/appsflyer/share/AFPurchaseType;

    return-object p0
.end method

.method public static values()[Lcom/appsflyer/share/AFPurchaseType;
    .locals 1

    sget-object v0, Lcom/appsflyer/share/AFPurchaseType;->unregisterClient:[Lcom/appsflyer/share/AFPurchaseType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/appsflyer/share/AFPurchaseType;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/appsflyer/share/AFPurchaseType;->value:Ljava/lang/String;

    return-object v0
.end method
