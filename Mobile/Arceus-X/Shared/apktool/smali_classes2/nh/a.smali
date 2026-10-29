.class public Lnh/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public c:Lgh/d;

.field public d:Lorg/json/JSONObject;

.field public e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "configure_dev_settings"

    iput-object v0, p0, Lnh/a;->a:Ljava/lang/String;

    const-string v0, "config_json"

    iput-object v0, p0, Lnh/a;->b:Ljava/lang/String;

    iput-object p1, p0, Lnh/a;->e:Landroid/content/Context;

    new-instance v0, Lgh/d;

    invoke-direct {v0, p1}, Lgh/d;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lnh/a;->c:Lgh/d;

    invoke-virtual {v0, p1}, Lgh/d;->a(Landroid/content/Context;)Lgh/c;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lgh/c;->i()Lorg/json/JSONObject;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    :goto_0
    iput-object p1, p0, Lnh/a;->d:Lorg/json/JSONObject;

    return-void
.end method

.method public static b(Landroid/content/Context;)Lorg/json/JSONObject;
    .locals 1

    if-eqz p0, :cond_0

    new-instance v0, Lnh/a;

    invoke-direct {v0, p0}, Lnh/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lnh/a;->a()Lorg/json/JSONObject;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static c(Lorg/json/JSONObject;Ljava/lang/String;Lcom/roblox/client/flags/a;)Ljava/lang/String;
    .locals 1

    invoke-static {p1, p2}, Lnh/a;->d(Ljava/lang/String;Lcom/roblox/client/flags/a;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p2

    :cond_0
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    return-object p1

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static d(Ljava/lang/String;Lcom/roblox/client/flags/a;)Ljava/lang/String;
    .locals 1

    instance-of v0, p1, Lcom/roblox/client/flags/a$d;

    if-eqz v0, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "FFlag"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p1, Lcom/roblox/client/flags/a$f;

    if-eqz v0, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "FInt"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    instance-of p1, p1, Lcom/roblox/client/flags/a$g;

    if-eqz p1, :cond_2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "FString"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_2
    return-object p0
.end method


# virtual methods
.method public a()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Lnh/a;->d:Lorg/json/JSONObject;

    return-object v0
.end method
