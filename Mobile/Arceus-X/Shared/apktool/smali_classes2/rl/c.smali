.class public Lrl/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrl/c$a;
    }
.end annotation


# instance fields
.field public a:Lcom/roblox/universalapp/messagebus/MessageBus;

.field public b:Lrl/p;


# direct methods
.method public constructor <init>(Lcom/roblox/universalapp/messagebus/MessageBus;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lrl/c;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    .line 4
    invoke-static {}, Lnm/a;->o()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lnm/a;->e()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrl/a;

    invoke-direct {v2}, Lrl/a;-><init>()V

    invoke-virtual {p1, v0, v1, v2}, Lcom/roblox/universalapp/messagebus/MessageBus;->p(Ljava/lang/String;Ljava/lang/String;Lmm/i;)V

    .line 5
    invoke-static {}, Lnm/a;->o()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lnm/a;->k()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrl/b;

    invoke-direct {v2}, Lrl/b;-><init>()V

    invoke-virtual {p1, v0, v1, v2}, Lcom/roblox/universalapp/messagebus/MessageBus;->p(Ljava/lang/String;Ljava/lang/String;Lmm/i;)V

    .line 6
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->D3()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    new-instance v0, Lrl/p;

    invoke-direct {v0, p1}, Lrl/p;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;)V

    iput-object v0, p0, Lrl/c;->b:Lrl/p;

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(Lcom/roblox/universalapp/messagebus/MessageBus;Lrl/d;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lrl/c;-><init>(Lcom/roblox/universalapp/messagebus/MessageBus;)V

    return-void
.end method

.method public static synthetic a(Lorg/json/JSONObject;)Lmm/l;
    .locals 3

    new-instance p0, Lmm/l;

    invoke-direct {p0}, Lmm/l;-><init>()V

    :try_start_0
    iget-object v0, p0, Lmm/l;->a:Lorg/json/JSONObject;

    invoke-static {}, Lnm/a;->q()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception while handling DeviceIntegrityAvailable request: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AccountProtocol"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object p0
.end method

.method public static synthetic b(Lorg/json/JSONObject;)Lmm/l;
    .locals 1

    invoke-static {}, Lrl/j;->j()Lrl/j;

    move-result-object v0

    invoke-virtual {v0, p0}, Lrl/j;->e(Lorg/json/JSONObject;)Lmm/l;

    move-result-object p0

    return-object p0
.end method

.method public static d()Lrl/c;
    .locals 1

    invoke-static {}, Lrl/c$a;->a()Lrl/c;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public c(Landroid/content/Context;)V
    .locals 1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->D3()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lrl/c;->b:Lrl/p;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    invoke-virtual {v0, p1}, Lrl/p;->h(Landroid/app/Application;)V

    :cond_0
    return-void
.end method
