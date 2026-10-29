.class public final Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001d\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$a;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "appContext",
        "Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$b;",
        "input",
        "",
        "b",
        "(Landroid/content/Context;Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$b;)V",
        "Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$a;",
        "a",
        "(Landroid/content/Context;Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$a;)V",
        "",
        "MAX_RETRY_COUNT",
        "I",
        "",
        "SETTINGS_CHANGE_WORK_NAME",
        "Ljava/lang/String;",
        "ACK_CALL_WORK_NAME",
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
    invoke-direct {p0}, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$a;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "input"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "NotificationOSSettingChangeReportingWorker"

    const-string v1, "Scheduling Push Ack Work"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lx5/z$a;

    const-class v1, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker;

    invoke-direct {v0, v1}, Lx5/z$a;-><init>(Ljava/lang/Class;)V

    new-instance v1, Lx5/d$a;

    invoke-direct {v1}, Lx5/d$a;-><init>()V

    sget-object v2, Lx5/x;->b:Lx5/x;

    invoke-virtual {v1, v2}, Lx5/d$a;->b(Lx5/x;)Lx5/d$a;

    move-result-object v1

    invoke-virtual {v1}, Lx5/d$a;->a()Lx5/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx5/q0$a;->k(Lx5/d;)Lx5/q0$a;

    move-result-object v0

    check-cast v0, Lx5/z$a;

    invoke-virtual {p2}, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$a;->a()Landroidx/work/b;

    move-result-object p2

    invoke-virtual {v0, p2}, Lx5/q0$a;->o(Landroidx/work/b;)Lx5/q0$a;

    move-result-object p2

    check-cast p2, Lx5/z$a;

    invoke-virtual {p2}, Lx5/q0$a;->b()Lx5/q0;

    move-result-object p2

    check-cast p2, Lx5/z;

    sget-object v0, Lx5/p0;->a:Lx5/p0$a;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v1, "getApplicationContext(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lx5/p0$a;->a(Landroid/content/Context;)Lx5/p0;

    move-result-object p1

    const-string v0, "NotificationPushAckWorkUniqueWork"

    sget-object v1, Lx5/j;->d:Lx5/j;

    invoke-virtual {p1, v0, v1, p2}, Lx5/p0;->g(Ljava/lang/String;Lx5/j;Lx5/z;)Lx5/a0;

    return-void
.end method

.method public final b(Landroid/content/Context;Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$b;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "input"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "NotificationOSSettingChangeReportingWorker"

    const-string v1, "Scheduling OS Notification Setting Change Reporting Work"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lx5/z$a;

    const-class v1, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker;

    invoke-direct {v0, v1}, Lx5/z$a;-><init>(Ljava/lang/Class;)V

    new-instance v1, Lx5/d$a;

    invoke-direct {v1}, Lx5/d$a;-><init>()V

    sget-object v2, Lx5/x;->b:Lx5/x;

    invoke-virtual {v1, v2}, Lx5/d$a;->b(Lx5/x;)Lx5/d$a;

    move-result-object v1

    invoke-virtual {v1}, Lx5/d$a;->a()Lx5/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx5/q0$a;->k(Lx5/d;)Lx5/q0$a;

    move-result-object v0

    check-cast v0, Lx5/z$a;

    invoke-virtual {p2}, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$b;->a()Landroidx/work/b;

    move-result-object p2

    invoke-virtual {v0, p2}, Lx5/q0$a;->o(Landroidx/work/b;)Lx5/q0$a;

    move-result-object p2

    check-cast p2, Lx5/z$a;

    invoke-virtual {p2}, Lx5/q0$a;->b()Lx5/q0;

    move-result-object p2

    check-cast p2, Lx5/z;

    sget-object v0, Lx5/p0;->a:Lx5/p0$a;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v1, "getApplicationContext(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lx5/p0$a;->a(Landroid/content/Context;)Lx5/p0;

    move-result-object p1

    const-string v0, "NotificationOSSettingChangeReportingWorkerUniqueWork"

    sget-object v1, Lx5/j;->a:Lx5/j;

    invoke-virtual {p1, v0, v1, p2}, Lx5/p0;->g(Ljava/lang/String;Lx5/j;Lx5/z;)Lx5/a0;

    return-void
.end method
