.class public final Lcom/appsflyer/internal/AFb1bSDK$AFa1tSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/appsflyer/internal/AFb1bSDK;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AFa1tSDK"
.end annotation


# static fields
.field static final synthetic AFKeystoreWrapper:Lcom/appsflyer/internal/AFb1bSDK$AFa1tSDK;

.field private static registerClient:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/appsflyer/internal/AFb1bSDK$AFa1tSDK;

    invoke-direct {v0}, Lcom/appsflyer/internal/AFb1bSDK$AFa1tSDK;-><init>()V

    sput-object v0, Lcom/appsflyer/internal/AFb1bSDK$AFa1tSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFb1bSDK$AFa1tSDK;

    const-wide/16 v0, 0x1f4

    sput-wide v0, Lcom/appsflyer/internal/AFb1bSDK$AFa1tSDK;->registerClient:J

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static unregisterClient()J
    .locals 2

    sget-wide v0, Lcom/appsflyer/internal/AFb1bSDK$AFa1tSDK;->registerClient:J

    return-wide v0
.end method
