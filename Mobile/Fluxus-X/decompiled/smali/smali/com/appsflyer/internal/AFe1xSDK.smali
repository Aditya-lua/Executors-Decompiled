.class public final Lcom/appsflyer/internal/AFe1xSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final AFKeystoreWrapper:Ljava/util/concurrent/atomic/AtomicInteger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final AFLogger:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Lcom/appsflyer/internal/AFe1xSDK;->AFKeystoreWrapper:Ljava/util/concurrent/atomic/AtomicInteger;

    const v0, 0x4e864ee

    sput v0, Lcom/appsflyer/internal/AFe1xSDK;->AFLogger:I

    return-void
.end method

.method public static final synthetic d()I
    .locals 1

    sget v0, Lcom/appsflyer/internal/AFe1xSDK;->AFLogger:I

    return v0
.end method

.method public static final synthetic unregisterClient()Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 1

    sget-object v0, Lcom/appsflyer/internal/AFe1xSDK;->AFKeystoreWrapper:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object v0
.end method
