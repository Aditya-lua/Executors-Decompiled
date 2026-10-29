.class public final Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\t\u0010\u0008R\u001c\u0010\u000c\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0010\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker$a;",
        "",
        "<init>",
        "()V",
        "Lx5/p0;",
        "workManager",
        "",
        "b",
        "(Lx5/p0;)V",
        "a",
        "Ljava/time/Duration;",
        "kotlin.jvm.PlatformType",
        "INTERVAL",
        "Ljava/time/Duration;",
        "",
        "PUSH_BACKGROUND_JOB_TAG",
        "Ljava/lang/String;",
        "PUSH_BACKGROUND_JOB_NAME",
        "TAG",
        "NativeShell_googleProdRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lx5/p0;)V
    .locals 2
    .param p1    # Lx5/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "workManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rbx.push"

    const-string v1, "Cancelling background notification job."

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "PushNotificationSettingsBackgroundReporter"

    invoke-virtual {p1, v0}, Lx5/p0;->b(Ljava/lang/String;)Lx5/a0;

    return-void
.end method

.method public final b(Lx5/p0;)V
    .locals 3
    .param p1    # Lx5/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "workManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker;->h()Ljava/time/Duration;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Scheduling periodic background notification job every "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.push"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker;->h()Ljava/time/Duration;

    move-result-object v0

    const-string v1, "access$getINTERVAL$cp(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lx5/g0$a;

    const-class v2, Lcom/roblox/client/pushnotification/backgroundjob/PushNotificationSettingsWorker;

    invoke-direct {v1, v2, v0}, Lx5/g0$a;-><init>(Ljava/lang/Class;Ljava/time/Duration;)V

    const-string v0, "PushNotificationSettingsBackgroundReporterTag"

    invoke-virtual {v1, v0}, Lx5/q0$a;->p(Ljava/lang/String;)Lx5/q0$a;

    move-result-object v0

    check-cast v0, Lx5/g0$a;

    invoke-virtual {v0}, Lx5/q0$a;->b()Lx5/q0;

    move-result-object v0

    check-cast v0, Lx5/g0;

    const-string v1, "PushNotificationSettingsBackgroundReporter"

    sget-object v2, Lx5/i;->c:Lx5/i;

    invoke-virtual {p1, v1, v2, v0}, Lx5/p0;->e(Ljava/lang/String;Lx5/i;Lx5/g0;)Lx5/a0;

    return-void
.end method
