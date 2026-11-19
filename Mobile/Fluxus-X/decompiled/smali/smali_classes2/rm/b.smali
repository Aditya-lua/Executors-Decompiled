.class public Lrm/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrm/b$c;
    }
.end annotation


# instance fields
.field public final a:Lcom/roblox/universalapp/messagebus/MessageBus;

.field public final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/roblox/universalapp/messagebus/Connection;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/Hashtable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Hashtable<",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->getInstance()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object v0

    iput-object v0, p0, Lrm/b;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lrm/b;->b:Ljava/util/ArrayList;

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lrm/b;->c:Ljava/util/ArrayList;

    .line 6
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lrm/b;->d:Ljava/util/Hashtable;

    .line 7
    invoke-virtual {p0}, Lrm/b;->e()V

    .line 8
    invoke-virtual {p0}, Lrm/b;->f()V

    return-void
.end method

.method public synthetic constructor <init>(Lrm/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lrm/b;-><init>()V

    return-void
.end method

.method public static bridge synthetic a(Lrm/b;)Ljava/util/Hashtable;
    .locals 0

    iget-object p0, p0, Lrm/b;->d:Ljava/util/Hashtable;

    return-object p0
.end method

.method public static bridge synthetic b(Lrm/b;)V
    .locals 0

    invoke-virtual {p0}, Lrm/b;->c()V

    return-void
.end method

.method public static i()Lrm/b;
    .locals 1

    invoke-static {}, Lrm/b$c;->a()Lrm/b;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final c()V
    .locals 6

    iget-object v0, p0, Lrm/b;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    check-cast v3, Ljava/lang/String;

    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    const-string v5, "layerName"

    invoke-virtual {v4, v5, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v3, p0, Lrm/b;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    sget-object v5, Lrm/d;->e:Ljava/lang/String;

    invoke-virtual {v3, v5, v4}, Lcom/roblox/universalapp/messagebus/MessageBus;->publish(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Failed to construct getUserLayerVariables JSON due to: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "ExperimentProtocol"

    invoke-static {v4, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    return-void
.end method

.method public d(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Lrm/b;->d:Ljava/util/Hashtable;

    invoke-virtual {v0, p1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/json/JSONObject;

    return-object p1
.end method

.method public final e()V
    .locals 3

    iget-object v0, p0, Lrm/b;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    sget-object v1, Lrm/d;->f:Ljava/lang/String;

    new-instance v2, Lrm/b$b;

    invoke-direct {v2, p0}, Lrm/b$b;-><init>(Lrm/b;)V

    invoke-virtual {v0, v1, v2}, Lcom/roblox/universalapp/messagebus/MessageBus;->subscribe(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    iget-object v1, p0, Lrm/b;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final f()V
    .locals 3

    iget-object v0, p0, Lrm/b;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    sget-object v1, Lrm/d;->b:Ljava/lang/String;

    new-instance v2, Lrm/b$a;

    invoke-direct {v2, p0}, Lrm/b$a;-><init>(Lrm/b;)V

    invoke-virtual {v0, v1, v2}, Lcom/roblox/universalapp/messagebus/MessageBus;->subscribe(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object v0

    iget-object v1, p0, Lrm/b;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public g()V
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v1

    invoke-interface {v1}, Lbi/i;->S0()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "Backgrounding.General"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-virtual {p0, v0}, Lrm/b;->h([Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final h([Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lrm/b;->c:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/Object;)V

    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "userLayers"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v0, p0, Lrm/b;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    sget-object v1, Lrm/d;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/roblox/universalapp/messagebus/MessageBus;->publish(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to construct registerUserLayers JSON due to: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "ExperimentProtocol"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
