.class public final Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\r\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u001c\u0010\u000f\u001a\n \u000e*\u0004\u0018\u00010\r0\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia$a;",
        "",
        "<init>",
        "()V",
        "",
        "jsonString",
        "Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;",
        "a",
        "(Ljava/lang/String;)Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;",
        "b",
        "()Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;",
        "default",
        "Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;",
        "Lkg/f;",
        "kotlin.jvm.PlatformType",
        "gson",
        "Lkg/f;",
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
    invoke-direct {p0}, Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Parsing string for push notification media: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "RichPushNotificationMedia"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;->access$getGson$cp()Lkg/f;

    move-result-object v0

    const-class v1, Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;

    invoke-virtual {v0, p1, v1}, Lkg/f;->j(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "fromJson(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;

    return-object p1

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia$a;->b()Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;

    move-result-object p1

    return-object p1
.end method

.method public final b()Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-static {}, Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;->access$getDefault$cp()Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;

    move-result-object v0

    return-object v0
.end method
