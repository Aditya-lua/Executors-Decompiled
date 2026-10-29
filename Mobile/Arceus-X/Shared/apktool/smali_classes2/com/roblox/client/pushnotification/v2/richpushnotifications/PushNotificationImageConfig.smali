.class public final Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u0008\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\r\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u000cJ\u0010\u0010\u0016\u001a\u00020\u0015H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00052\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u000cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u001b\u001a\u0004\u0008\u001d\u0010\u000cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u001e\u001a\u0004\u0008\u001f\u0010\u000fR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010 \u001a\u0004\u0008!\u0010\u0011\u00a8\u0006\""
    }
    d2 = {
        "Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;",
        "",
        "",
        "url",
        "format",
        "",
        "addBackgroundColor",
        "Lqj/c;",
        "shape",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;ZLqj/c;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Z",
        "component4",
        "()Lqj/c;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;ZLqj/c;)Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;",
        "toString",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getUrl",
        "getFormat",
        "Z",
        "getAddBackgroundColor",
        "Lqj/c;",
        "getShape",
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


# instance fields
.field private final addBackgroundColor:Z

.field private final format:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final shape:Lqj/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final url:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLqj/c;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lqj/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "format"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shape"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->url:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->format:Ljava/lang/String;

    .line 4
    iput-boolean p3, p0, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->addBackgroundColor:Z

    .line 5
    iput-object p4, p0, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->shape:Lqj/c;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLqj/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 6
    sget-object p4, Lqj/c;->d:Lqj/c;

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;-><init>(Ljava/lang/String;Ljava/lang/String;ZLqj/c;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Ljava/lang/String;Ljava/lang/String;ZLqj/c;ILjava/lang/Object;)Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->url:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->format:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->addBackgroundColor:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->shape:Lqj/c;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->copy(Ljava/lang/String;Ljava/lang/String;ZLqj/c;)Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->url:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->format:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->addBackgroundColor:Z

    return v0
.end method

.method public final component4()Lqj/c;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->shape:Lqj/c;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;ZLqj/c;)Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lqj/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "format"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shape"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;-><init>(Ljava/lang/String;Ljava/lang/String;ZLqj/c;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;

    iget-object v1, p0, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->url:Ljava/lang/String;

    iget-object v3, p1, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->url:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->format:Ljava/lang/String;

    iget-object v3, p1, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->format:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->addBackgroundColor:Z

    iget-boolean v3, p1, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->addBackgroundColor:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->shape:Lqj/c;

    iget-object p1, p1, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->shape:Lqj/c;

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getAddBackgroundColor()Z
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->addBackgroundColor:Z

    return v0
.end method

.method public final getFormat()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->format:Ljava/lang/String;

    return-object v0
.end method

.method public final getShape()Lqj/c;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->shape:Lqj/c;

    return-object v0
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->url:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->url:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->format:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->addBackgroundColor:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->shape:Lqj/c;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->url:Ljava/lang/String;

    iget-object v1, p0, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->format:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->addBackgroundColor:Z

    iget-object v3, p0, Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;->shape:Lqj/c;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "PushNotificationImageConfig(url="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", format="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", addBackgroundColor="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", shape="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
