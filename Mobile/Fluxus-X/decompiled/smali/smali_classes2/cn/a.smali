.class public Lcn/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcn/a$a;
    }
.end annotation


# instance fields
.field public final a:Lcom/roblox/universalapp/messagebus/MessageBus;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/roblox/universalapp/messagebus/MessageBus;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->getInstance()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcn/a;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    return-void
.end method

.method public static c()Lcn/a;
    .locals 1

    invoke-static {}, Lcn/a$a;->a()Lcn/a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 3

    const-string v0, "RealtimeProtocol"

    const-string v1, "App Resumed"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcn/a;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    sget-object v1, Lcn/b;->b:Ljava/lang/String;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/roblox/universalapp/messagebus/MessageBus;->publish(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method public b()V
    .locals 3

    const-string v0, "RealtimeProtocol"

    const-string v1, "App Stopped"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcn/a;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    sget-object v1, Lcn/b;->c:Ljava/lang/String;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/roblox/universalapp/messagebus/MessageBus;->publish(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method
