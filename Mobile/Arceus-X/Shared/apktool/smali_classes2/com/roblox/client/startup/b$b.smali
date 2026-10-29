.class public Lcom/roblox/client/startup/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/startup/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Lorg/json/JSONObject;

.field public final c:Ljava/lang/String;

.field public final d:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-wide/16 v0, 0x0

    .line 5
    invoke-direct {p0, p1, p2, v0, v1}, Lcom/roblox/client/startup/b$b;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/roblox/client/startup/b$b;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/roblox/client/startup/b$b;->c:Ljava/lang/String;

    .line 4
    iput-wide p3, p0, Lcom/roblox/client/startup/b$b;->d:J

    return-void
.end method

.method public static a(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p0, "ClientSettingsRequest"

    const-string v1, "can\'t parse flag json."

    invoke-static {p0, v1}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_0

    const-string p0, "applicationSettings"

    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, p0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public b()J
    .locals 2

    iget-wide v0, p0, Lcom/roblox/client/startup/b$b;->d:J

    return-wide v0
.end method

.method public c()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/startup/b$b;->b:Lorg/json/JSONObject;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/roblox/client/startup/b$b;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/client/startup/b$b;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/startup/b$b;->b:Lorg/json/JSONObject;

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/startup/b$b;->b:Lorg/json/JSONObject;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/startup/b$b;->a:Ljava/lang/String;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/startup/b$b;->c:Ljava/lang/String;

    return-object v0
.end method
