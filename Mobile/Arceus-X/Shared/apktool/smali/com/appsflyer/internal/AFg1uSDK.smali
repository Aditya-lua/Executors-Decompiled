.class public final Lcom/appsflyer/internal/AFg1uSDK;
.super Lcom/appsflyer/internal/AFh1pSDK;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "VisibleForTests"
        }
    .end annotation

    const/4 v0, 0x0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v2, "Register"

    invoke-direct {p0, v2, v0, v1}, Lcom/appsflyer/internal/AFh1pSDK;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method


# virtual methods
.method public final AFKeystoreWrapper()Lcom/appsflyer/internal/AFe1zSDK;
    .locals 1

    sget-object v0, Lcom/appsflyer/internal/AFd1bSDK;->afInfoLog:Lcom/appsflyer/internal/AFd1bSDK;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
