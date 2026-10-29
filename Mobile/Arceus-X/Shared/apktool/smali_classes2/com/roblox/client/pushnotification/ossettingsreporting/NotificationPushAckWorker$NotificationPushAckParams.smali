.class final Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "NotificationPushAckParams"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0010\u0011\n\u0002\u0008\u0013\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0008\u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002\u00a2\u0006\u000c\u001a\u0004\u0008\u000b\u0010\u000c*\u0004\u0008\t\u0010\nR#\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8FX\u0086\u0084\u0002\u00a2\u0006\u000c\u001a\u0004\u0008\u0010\u0010\u0011*\u0004\u0008\u000f\u0010\nR#\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8FX\u0086\u0084\u0002\u00a2\u0006\u000c\u001a\u0004\u0008\u0014\u0010\u0011*\u0004\u0008\u0013\u0010\nR#\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8FX\u0086\u0084\u0002\u00a2\u0006\u000c\u001a\u0004\u0008\u0017\u0010\u0011*\u0004\u0008\u0016\u0010\nR\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002\u00a2\u0006\u000c\u001a\u0004\u0008\u001a\u0010\u000c*\u0004\u0008\u0019\u0010\nR\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002\u00a2\u0006\u000c\u001a\u0004\u0008\u001d\u0010\u000c*\u0004\u0008\u001c\u0010\nR\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002\u00a2\u0006\u000c\u001a\u0004\u0008 \u0010\u000c*\u0004\u0008\u001f\u0010\nR\u0013\u0010!\u001a\u0004\u0018\u00010\"8F\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010$R\u0013\u0010%\u001a\u0004\u0018\u00010\"8F\u00a2\u0006\u0006\u001a\u0004\u0008&\u0010$R\u0013\u0010\'\u001a\u0004\u0018\u00010(8F\u00a2\u0006\u0006\u001a\u0004\u0008)\u0010*R\u0013\u0010+\u001a\u0004\u0018\u00010(8F\u00a2\u0006\u0006\u001a\u0004\u0008,\u0010*\u00a8\u0006-"
    }
    d2 = {
        "Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;",
        "",
        "data",
        "",
        "",
        "<init>",
        "(Ljava/util/Map;)V",
        "delegate",
        "deviceId",
        "getDeviceId$delegate",
        "(Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;)Ljava/lang/Object;",
        "getDeviceId",
        "()Ljava/lang/String;",
        "channelNames",
        "",
        "getChannelNames$delegate",
        "getChannelNames",
        "()[Ljava/lang/String;",
        "channelEnabledValues",
        "getChannelEnabledValues$delegate",
        "getChannelEnabledValues",
        "changedChannels",
        "getChangedChannels$delegate",
        "getChangedChannels",
        "notificationId",
        "getNotificationId$delegate",
        "getNotificationId",
        "metadata",
        "getMetadata$delegate",
        "getMetadata",
        "notificationType",
        "getNotificationType$delegate",
        "getNotificationType",
        "userId",
        "",
        "getUserId",
        "()Ljava/lang/Long;",
        "receivedTime",
        "getReceivedTime",
        "priority",
        "",
        "getPriority",
        "()Ljava/lang/Integer;",
        "originalPriority",
        "getOriginalPriority",
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


# static fields
.field static final synthetic $$delegatedProperties:[Lhu/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lhu/l<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final delegate:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lkotlin/jvm/internal/u;

    const-class v1, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;

    const-string v2, "deviceId"

    const-string v3, "getDeviceId()Ljava/lang/String;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/u;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/d0;->g(Lkotlin/jvm/internal/t;)Lhu/j;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/u;

    const-string v3, "channelNames"

    const-string v5, "getChannelNames()[Ljava/lang/String;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/u;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/d0;->g(Lkotlin/jvm/internal/t;)Lhu/j;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/u;

    const-string v5, "channelEnabledValues"

    const-string v6, "getChannelEnabledValues()[Ljava/lang/String;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/u;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/d0;->g(Lkotlin/jvm/internal/t;)Lhu/j;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/u;

    const-string v6, "changedChannels"

    const-string v7, "getChangedChannels()[Ljava/lang/String;"

    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/u;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Lkotlin/jvm/internal/d0;->g(Lkotlin/jvm/internal/t;)Lhu/j;

    move-result-object v5

    new-instance v6, Lkotlin/jvm/internal/u;

    const-string v7, "notificationId"

    const-string v8, "getNotificationId()Ljava/lang/String;"

    invoke-direct {v6, v1, v7, v8, v4}, Lkotlin/jvm/internal/u;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v6}, Lkotlin/jvm/internal/d0;->g(Lkotlin/jvm/internal/t;)Lhu/j;

    move-result-object v6

    new-instance v7, Lkotlin/jvm/internal/u;

    const-string v8, "metadata"

    const-string v9, "getMetadata()Ljava/lang/String;"

    invoke-direct {v7, v1, v8, v9, v4}, Lkotlin/jvm/internal/u;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v7}, Lkotlin/jvm/internal/d0;->g(Lkotlin/jvm/internal/t;)Lhu/j;

    move-result-object v7

    new-instance v8, Lkotlin/jvm/internal/u;

    const-string v9, "notificationType"

    const-string v10, "getNotificationType()Ljava/lang/String;"

    invoke-direct {v8, v1, v9, v10, v4}, Lkotlin/jvm/internal/u;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v8}, Lkotlin/jvm/internal/d0;->g(Lkotlin/jvm/internal/t;)Lhu/j;

    move-result-object v1

    const/4 v8, 0x7

    new-array v8, v8, [Lhu/l;

    aput-object v0, v8, v4

    const/4 v0, 0x1

    aput-object v2, v8, v0

    const/4 v0, 0x2

    aput-object v3, v8, v0

    const/4 v0, 0x3

    aput-object v5, v8, v0

    const/4 v0, 0x4

    aput-object v6, v8, v0

    const/4 v0, 0x5

    aput-object v7, v8, v0

    const/4 v0, 0x6

    aput-object v1, v8, v0

    sput-object v8, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->$$delegatedProperties:[Lhu/l;

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 1
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/roblox/client/pushnotification/ossettingsreporting/a;

    invoke-direct {v0}, Lcom/roblox/client/pushnotification/ossettingsreporting/a;-><init>()V

    invoke-static {p1, v0}, Lkotlin/collections/i0;->b(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->delegate:Ljava/util/Map;

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->delegate$lambda$0(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final delegate$lambda$0(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method private static getChangedChannels$delegate(Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->delegate:Ljava/util/Map;

    return-object p0
.end method

.method private static getChannelEnabledValues$delegate(Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->delegate:Ljava/util/Map;

    return-object p0
.end method

.method private static getChannelNames$delegate(Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->delegate:Ljava/util/Map;

    return-object p0
.end method

.method private static getDeviceId$delegate(Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->delegate:Ljava/util/Map;

    return-object p0
.end method

.method private static getMetadata$delegate(Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->delegate:Ljava/util/Map;

    return-object p0
.end method

.method private static getNotificationId$delegate(Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->delegate:Ljava/util/Map;

    return-object p0
.end method

.method private static getNotificationType$delegate(Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->delegate:Ljava/util/Map;

    return-object p0
.end method


# virtual methods
.method public final getChangedChannels()[Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->delegate:Ljava/util/Map;

    sget-object v1, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->$$delegatedProperties:[Lhu/l;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-interface {v1}, Lhu/b;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/collections/i0;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method public final getChannelEnabledValues()[Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->delegate:Ljava/util/Map;

    sget-object v1, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->$$delegatedProperties:[Lhu/l;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-interface {v1}, Lhu/b;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/collections/i0;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method public final getChannelNames()[Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->delegate:Ljava/util/Map;

    sget-object v1, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->$$delegatedProperties:[Lhu/l;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-interface {v1}, Lhu/b;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/collections/i0;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method public final getDeviceId()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->delegate:Ljava/util/Map;

    sget-object v1, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->$$delegatedProperties:[Lhu/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v1}, Lhu/b;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/collections/i0;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final getMetadata()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->delegate:Ljava/util/Map;

    sget-object v1, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->$$delegatedProperties:[Lhu/l;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-interface {v1}, Lhu/b;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/collections/i0;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final getNotificationId()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->delegate:Ljava/util/Map;

    sget-object v1, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->$$delegatedProperties:[Lhu/l;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    invoke-interface {v1}, Lhu/b;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/collections/i0;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final getNotificationType()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->delegate:Ljava/util/Map;

    sget-object v1, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->$$delegatedProperties:[Lhu/l;

    const/4 v2, 0x6

    aget-object v1, v1, v2

    invoke-interface {v1}, Lhu/b;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/collections/i0;->a(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final getOriginalPriority()Ljava/lang/Integer;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->delegate:Ljava/util/Map;

    const-string v1, "originalPriority"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Number;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_1
    return-object v2
.end method

.method public final getPriority()Ljava/lang/Integer;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->delegate:Ljava/util/Map;

    const-string v1, "priority"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Number;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_1
    return-object v2
.end method

.method public final getReceivedTime()Ljava/lang/Long;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->delegate:Ljava/util/Map;

    const-string v1, "receivedTime"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Number;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :cond_1
    return-object v2
.end method

.method public final getUserId()Ljava/lang/Long;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/pushnotification/ossettingsreporting/NotificationPushAckWorker$NotificationPushAckParams;->delegate:Ljava/util/Map;

    const-string v1, "userId"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Number;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :cond_1
    return-object v2
.end method
