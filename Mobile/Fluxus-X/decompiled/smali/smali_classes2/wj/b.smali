.class public final Lwj/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u000b\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J)\u0010\t\u001a\u0004\u0018\u00010\u00072\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J%\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\'\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J5\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0008\u001a\u00020\u00072\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ/\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J!\u0010!\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008!\u0010\u0010J\u001f\u0010#\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008#\u0010$\u00a8\u0006%"
    }
    d2 = {
        "Lwj/b;",
        "",
        "<init>",
        "()V",
        "",
        "Landroid/app/NotificationChannel;",
        "channels",
        "",
        "logicalId",
        "g",
        "(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;",
        "Landroid/content/Context;",
        "context",
        "Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;",
        "descriptor",
        "d",
        "(Landroid/content/Context;Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;)Ljava/lang/String;",
        "Lk2/n;",
        "notificationManager",
        "e",
        "(Lk2/n;Ljava/lang/String;)Ljava/util/List;",
        "installed",
        "f",
        "(Ljava/lang/String;Ljava/util/List;)Landroid/app/NotificationChannel;",
        "",
        "keepVersion",
        "",
        "c",
        "(Lk2/n;Ljava/lang/String;Ljava/util/List;I)V",
        "registeredChannelId",
        "importance",
        "b",
        "(Landroid/content/Context;Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;Ljava/lang/String;I)V",
        "h",
        "channel",
        "a",
        "(Landroid/app/NotificationChannel;Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;)V",
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
.field public static final a:Lwj/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lwj/b;

    invoke-direct {v0}, Lwj/b;-><init>()V

    sput-object v0, Lwj/b;->a:Lwj/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final d(Landroid/content/Context;Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;)Ljava/lang/String;
    .locals 10
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;->getVersion()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v0, :cond_6

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_2

    :cond_0
    if-nez v1, :cond_1

    goto :goto_2

    :cond_1
    invoke-static {p0}, Lk2/n;->g(Landroid/content/Context;)Lk2/n;

    move-result-object v2

    const-string v3, "from(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lwj/b;->a:Lwj/b;

    invoke-virtual {v3, v2, v0}, Lwj/b;->e(Lk2/n;Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3, v0, v4}, Lwj/b;->f(Ljava/lang/String;Ljava/util/List;)Landroid/app/NotificationChannel;

    move-result-object v5

    const-string v6, "getId(...)"

    if-eqz v5, :cond_2

    sget-object v7, Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;->Companion:Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel$a;

    invoke-virtual {v5}, Landroid/app/NotificationChannel;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7, v0, v8}, Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel$a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v7

    goto :goto_0

    :cond_2
    const/4 v7, 0x0

    :goto_0
    if-eqz v5, :cond_3

    if-eqz v7, :cond_3

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v9

    if-lt v8, v9, :cond_3

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {v3, v2, v0, v4, p0}, Lwj/b;->c(Lk2/n;Ljava/lang/String;Ljava/util/List;I)V

    invoke-virtual {v5}, Landroid/app/NotificationChannel;->getId()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_3
    if-eqz v5, :cond_4

    invoke-virtual {v5}, Landroid/app/NotificationChannel;->getImportance()I

    move-result v5

    if-nez v5, :cond_4

    const/4 v5, 0x0

    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;->getAndroidImportance()Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_5

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    goto :goto_1

    :cond_5
    const/4 v5, 0x3

    :goto_1
    sget-object v6, Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;->Companion:Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel$a;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-virtual {v6, v0, v7}, Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel$a;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, p0, p1, v6, v5}, Lwj/b;->b(Landroid/content/Context;Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;Ljava/lang/String;I)V

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {v3, v2, v0, v4, p0}, Lwj/b;->c(Lk2/n;Ljava/lang/String;Ljava/util/List;I)V

    return-object v6

    :cond_6
    :goto_2
    if-nez v0, :cond_7

    const-string p0, ""

    return-object p0

    :cond_7
    return-object v0
.end method

.method public static final g(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .param p0    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/app/NotificationChannel;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "channels"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_8

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_3

    :cond_0
    check-cast p0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/NotificationChannel;

    sget-object v3, Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;->Companion:Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel$a;

    invoke-virtual {v2}, Landroid/app/NotificationChannel;->getId()Ljava/lang/String;

    move-result-object v4

    const-string v5, "getId(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, p1, v4}, Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel$a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v5, 0x1

    if-lt v4, v5, :cond_2

    invoke-virtual {v2}, Landroid/app/NotificationChannel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lzt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    goto :goto_1

    :cond_2
    move-object v2, v0

    :goto_1
    if-eqz v2, :cond_1

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-nez p1, :cond_4

    move-object p1, v0

    goto :goto_2

    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_2

    :cond_5
    move-object v1, p1

    check-cast v1, Lkotlin/Pair;

    invoke-virtual {v1}, Lkotlin/Pair;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    :cond_6
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lkotlin/Pair;

    invoke-virtual {v3}, Lkotlin/Pair;->c()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    if-ge v1, v3, :cond_7

    move-object p1, v2

    move v1, v3

    :cond_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_6

    :goto_2
    check-cast p1, Lkotlin/Pair;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lkotlin/Pair;->d()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0

    :cond_8
    :goto_3
    return-object v0
.end method


# virtual methods
.method public final a(Landroid/app/NotificationChannel;Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;)V
    .locals 3

    invoke-virtual {p2}, Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;->getSound()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "toLowerCase(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    const-string v2, "none"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, ""

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    invoke-virtual {p1, v1, v1}, Landroid/app/NotificationChannel;->setSound(Landroid/net/Uri;Landroid/media/AudioAttributes;)V

    :cond_2
    invoke-virtual {p2}, Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;->getVibration()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/app/NotificationChannel;->enableVibration(Z)V

    if-nez v0, :cond_3

    invoke-virtual {p1, v1}, Landroid/app/NotificationChannel;->setVibrationPattern([J)V

    :cond_3
    invoke-virtual {p2}, Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;->getBadge()Ljava/lang/Boolean;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/app/NotificationChannel;->setShowBadge(Z)V

    :cond_4
    return-void
.end method

.method public final b(Landroid/content/Context;Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;Ljava/lang/String;I)V
    .locals 2

    new-instance v0, Landroid/app/NotificationChannel;

    invoke-virtual {p2}, Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p3, v1, p4}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    invoke-virtual {p2}, Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;->getDescription()Ljava/lang/String;

    move-result-object p3

    if-eqz p3, :cond_1

    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result p3

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;->getDescription()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2}, Lwj/b;->h(Landroid/content/Context;Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;)Ljava/lang/String;

    move-result-object p3

    if-eqz p3, :cond_2

    invoke-virtual {v0, p3}, Landroid/app/NotificationChannel;->setGroup(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0, v0, p2}, Lwj/b;->a(Landroid/app/NotificationChannel;Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;)V

    invoke-static {p1}, Lk2/n;->g(Landroid/content/Context;)Lk2/n;

    move-result-object p1

    invoke-virtual {p1, v0}, Lk2/n;->d(Landroid/app/NotificationChannel;)V

    return-void
.end method

.method public final c(Lk2/n;Ljava/lang/String;Ljava/util/List;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk2/n;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroid/app/NotificationChannel;",
            ">;I)V"
        }
    .end annotation

    check-cast p3, Ljava/lang/Iterable;

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationChannel;

    sget-object v1, Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;->Companion:Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel$a;

    invoke-virtual {v0}, Landroid/app/NotificationChannel;->getId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "getId(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p2, v2}, Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel$a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ge v1, p4, :cond_0

    invoke-virtual {v0}, Landroid/app/NotificationChannel;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lk2/n;->f(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final e(Lk2/n;Ljava/lang/String;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk2/n;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Landroid/app/NotificationChannel;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lk2/n;->l()Ljava/util/List;

    move-result-object p1

    const-string v0, "getNotificationChannels(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/NotificationChannel;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    sget-object v3, Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;->Companion:Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel$a;

    invoke-virtual {v1}, Landroid/app/NotificationChannel;->getId()Ljava/lang/String;

    move-result-object v4

    const-string v5, "getId(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, p2, v4}, Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel$a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, v2

    :goto_1
    if-eqz v1, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public final f(Ljava/lang/String;Ljava/util/List;)Landroid/app/NotificationChannel;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroid/app/NotificationChannel;",
            ">;)",
            "Landroid/app/NotificationChannel;"
        }
    .end annotation

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_3

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    :goto_0
    move-object p1, v0

    goto :goto_3

    :cond_1
    move-object v1, v0

    check-cast v1, Landroid/app/NotificationChannel;

    sget-object v2, Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;->Companion:Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel$a;

    invoke-virtual {v1}, Landroid/app/NotificationChannel;->getId()Ljava/lang/String;

    move-result-object v1

    const-string v3, "getId(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p1, v1}, Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel$a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_1

    :cond_2
    move v1, v2

    :cond_3
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Landroid/app/NotificationChannel;

    sget-object v6, Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;->Companion:Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel$a;

    invoke-virtual {v5}, Landroid/app/NotificationChannel;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, p1, v5}, Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel$a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    goto :goto_2

    :cond_4
    move v5, v2

    :goto_2
    if-ge v1, v5, :cond_5

    move-object v0, v4

    move v1, v5

    :cond_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_0

    :goto_3
    check-cast p1, Landroid/app/NotificationChannel;

    return-object p1
.end method

.method public final h(Landroid/content/Context;Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p2}, Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;->getGroupId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lk2/n;->g(Landroid/content/Context;)Lk2/n;

    move-result-object p1

    const-string v2, "from(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lk2/n;->j(Ljava/lang/String;)Landroid/app/NotificationChannelGroup;

    move-result-object v2

    if-eqz v2, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p2}, Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;->getGroupName()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    new-instance v1, Landroid/app/NotificationChannelGroup;

    invoke-direct {v1, v0, p2}, Landroid/app/NotificationChannelGroup;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;)V

    invoke-virtual {p1, v1}, Lk2/n;->e(Landroid/app/NotificationChannelGroup;)V

    return-object v0

    :cond_3
    :goto_0
    return-object v1
.end method
