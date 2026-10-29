.class public final Lcom/appsflyer/internal/AFh1bSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final AFKeystoreWrapper:Ljava/lang/String;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final AFLogger:J

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/Throwable;

.field public final force:Lcom/appsflyer/internal/AFh1dSDK;

.field public final registerClient:I

.field public final unregisterClient:J

.field public final w:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JJILcom/appsflyer/internal/AFh1dSDK;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/appsflyer/internal/AFh1bSDK;->d:Ljava/lang/String;

    iput-object p2, p0, Lcom/appsflyer/internal/AFh1bSDK;->AFKeystoreWrapper:Ljava/lang/String;

    iput-wide p3, p0, Lcom/appsflyer/internal/AFh1bSDK;->AFLogger:J

    iput-wide p5, p0, Lcom/appsflyer/internal/AFh1bSDK;->unregisterClient:J

    iput p7, p0, Lcom/appsflyer/internal/AFh1bSDK;->registerClient:I

    iput-object p8, p0, Lcom/appsflyer/internal/AFh1bSDK;->force:Lcom/appsflyer/internal/AFh1dSDK;

    iput-object p9, p0, Lcom/appsflyer/internal/AFh1bSDK;->w:Ljava/lang/String;

    iput-object p10, p0, Lcom/appsflyer/internal/AFh1bSDK;->e:Ljava/lang/Throwable;

    return-void
.end method
