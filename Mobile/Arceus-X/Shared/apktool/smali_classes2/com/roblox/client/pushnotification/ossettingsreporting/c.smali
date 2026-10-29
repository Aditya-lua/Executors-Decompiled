.class public final Lcom/roblox/client/pushnotification/ossettingsreporting/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/pushnotification/ossettingsreporting/b;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JI\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/roblox/client/pushnotification/ossettingsreporting/c;",
        "Lcom/roblox/client/pushnotification/ossettingsreporting/b;",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "appContext",
        "",
        "",
        "channels",
        "",
        "changedChannels",
        "deviceId",
        "",
        "userId",
        "",
        "a",
        "(Landroid/content/Context;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;J)V",
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

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;J)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "J)V"
        }
    .end annotation

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channels"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "changedChannels"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceId"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker;->b:Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$a;

    new-instance v1, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$b;

    move-object v5, p2

    move-object v6, p3

    move-object v2, p4

    move-wide v3, p5

    invoke-direct/range {v1 .. v6}, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$b;-><init>(Ljava/lang/String;JLjava/util/Map;Ljava/util/List;)V

    invoke-virtual {v0, p1, v1}, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$a;->b(Landroid/content/Context;Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$b$b;)V

    return-void
.end method
