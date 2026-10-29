.class public Lcom/roblox/client/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/d$b;,
        Lcom/roblox/client/d$e;,
        Lcom/roblox/client/d$f;,
        Lcom/roblox/client/d$d;,
        Lcom/roblox/client/d$c;
    }
.end annotation


# instance fields
.field public a:Lcom/roblox/client/d$e;

.field public b:J

.field public final c:Lgk/c0;

.field public d:Lcom/roblox/client/d$f;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lgk/c0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/roblox/client/d$e;

    invoke-direct {v0}, Lcom/roblox/client/d$e;-><init>()V

    iput-object v0, p0, Lcom/roblox/client/d;->a:Lcom/roblox/client/d$e;

    sget-object v0, Lcom/roblox/client/d$f;->a:Lcom/roblox/client/d$f;

    iput-object v0, p0, Lcom/roblox/client/d;->d:Lcom/roblox/client/d$f;

    const-string v0, ""

    iput-object v0, p0, Lcom/roblox/client/d;->e:Ljava/lang/String;

    iput-object v0, p0, Lcom/roblox/client/d;->f:Ljava/lang/String;

    iput-object p1, p0, Lcom/roblox/client/d;->c:Lgk/c0;

    return-void
.end method

.method public static bridge synthetic a(Lcom/roblox/client/d;Lei/j;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/d;->c(Lei/j;)V

    return-void
.end method

.method public static e()Lcom/roblox/client/d;
    .locals 1

    invoke-static {}, Lcom/roblox/client/d$b;->a()Lcom/roblox/client/d;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public b(Lcom/roblox/client/d$d;)V
    .locals 9

    invoke-static {}, Lgk/t;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/roblox/client/RobloxApplication;->f()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lnh/b;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lbh/b;

    invoke-direct {v1}, Lbh/b;-><init>()V

    invoke-virtual {v1, v0}, Lbh/b;->c(Landroid/content/Context;)V

    invoke-virtual {v1}, Lbh/b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lbh/b;->b()Lcom/roblox/client/d$e;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/roblox/client/d$d;->a(Lcom/roblox/client/d$e;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/d;->d:Lcom/roblox/client/d$f;

    sget-object v1, Lcom/roblox/client/d$f;->a:Lcom/roblox/client/d$f;

    const-string v2, "UpgradeCheckHelper"

    if-eq v0, v1, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Rely on the upgrade-status set by the Init process: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/roblox/client/d;->d:Lcom/roblox/client/d$f;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/d;->a:Lcom/roblox/client/d$e;

    iget-object v2, p0, Lcom/roblox/client/d;->d:Lcom/roblox/client/d$f;

    iput-object v2, v0, Lcom/roblox/client/d$e;->a:Lcom/roblox/client/d$f;

    iput-object v1, p0, Lcom/roblox/client/d;->d:Lcom/roblox/client/d$f;

    iget-object v1, p0, Lcom/roblox/client/d;->e:Ljava/lang/String;

    iput-object v1, v0, Lcom/roblox/client/d$e;->b:Ljava/lang/String;

    const-string v1, ""

    iput-object v1, p0, Lcom/roblox/client/d;->e:Ljava/lang/String;

    iget-object v2, p0, Lcom/roblox/client/d;->f:Ljava/lang/String;

    iput-object v2, v0, Lcom/roblox/client/d$e;->c:Ljava/lang/String;

    iput-object v1, p0, Lcom/roblox/client/d;->f:Ljava/lang/String;

    iget-object v0, p0, Lcom/roblox/client/d;->c:Lgk/c0;

    invoke-interface {v0}, Lgk/c0;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/roblox/client/d;->b:J

    if-eqz p1, :cond_3

    iget-object v0, p0, Lcom/roblox/client/d;->a:Lcom/roblox/client/d$e;

    invoke-interface {p1, v0}, Lcom/roblox/client/d$d;->a(Lcom/roblox/client/d$e;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/roblox/client/d;->c:Lgk/c0;

    invoke-interface {v0}, Lgk/c0;->b()J

    move-result-wide v3

    iget-wide v5, p0, Lcom/roblox/client/d;->b:J

    sub-long/2addr v3, v5

    invoke-static {}, Lgk/t;->j()Z

    move-result v0

    const-wide/32 v5, 0x36ee80

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roblox/client/d;->a:Lcom/roblox/client/d$e;

    iget-object v7, v0, Lcom/roblox/client/d$e;->a:Lcom/roblox/client/d$f;

    sget-object v8, Lcom/roblox/client/d$f;->e:Lcom/roblox/client/d$f;

    if-ne v7, v8, :cond_2

    cmp-long v3, v3, v5

    if-gez v3, :cond_4

    if-eqz p1, :cond_3

    invoke-interface {p1, v0}, Lcom/roblox/client/d$d;->a(Lcom/roblox/client/d$e;)V

    return-void

    :cond_2
    iget-object v0, p0, Lcom/roblox/client/d;->a:Lcom/roblox/client/d$e;

    iget-object v0, v0, Lcom/roblox/client/d$e;->a:Lcom/roblox/client/d$f;

    if-eq v0, v1, :cond_4

    cmp-long v0, v3, v5

    if-gez v0, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Skip upgrade check because it was completed not long ago: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " ms."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_3

    iget-object v0, p0, Lcom/roblox/client/d;->a:Lcom/roblox/client/d$e;

    invoke-interface {p1, v0}, Lcom/roblox/client/d$d;->b(Lcom/roblox/client/d$e;)V

    :cond_3
    return-void

    :cond_4
    iget-object v0, p0, Lcom/roblox/client/d;->a:Lcom/roblox/client/d$e;

    iput-object v1, v0, Lcom/roblox/client/d$e;->a:Lcom/roblox/client/d$f;

    const-string v0, "Perform upgrade check with the server..."

    invoke-static {v2, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lei/g;->a()Lei/f;

    move-result-object v0

    invoke-static {}, Lsg/a1;->Y0()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/roblox/client/d$a;

    invoke-direct {v2, p0, p1}, Lcom/roblox/client/d$a;-><init>(Lcom/roblox/client/d;Lcom/roblox/client/d$d;)V

    const/4 p1, 0x0

    invoke-interface {v0, v1, p1, v2}, Lei/f;->a(Ljava/lang/String;[Lei/c$a;Lei/l;)Lei/d;

    move-result-object p1

    new-instance v0, Lhi/b;

    invoke-direct {v0}, Lhi/b;-><init>()V

    invoke-virtual {p1, v0}, Lei/a;->g(Lhi/d;)V

    invoke-virtual {p1}, Lei/a;->b()V

    return-void
.end method

.method public final c(Lei/j;)V
    .locals 4

    const-string v0, ""

    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-virtual {p1}, Lei/j;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "data"

    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v2, "UpgradeAction"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const v3, -0x46e179c5

    if-eq v2, v3, :cond_3

    const v3, -0x13947041

    if-eq v2, v3, :cond_2

    const v3, -0x89820c0

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    const-string v2, "NewAppRequired"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/roblox/client/d;->a:Lcom/roblox/client/d$e;

    sget-object v2, Lcom/roblox/client/d$f;->e:Lcom/roblox/client/d$f;

    iput-object v2, p1, Lcom/roblox/client/d$e;->a:Lcom/roblox/client/d$f;

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_2
    const-string v2, "Required"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/roblox/client/d;->a:Lcom/roblox/client/d$e;

    sget-object v2, Lcom/roblox/client/d$f;->c:Lcom/roblox/client/d$f;

    iput-object v2, p1, Lcom/roblox/client/d$e;->a:Lcom/roblox/client/d$f;

    goto :goto_1

    :cond_3
    const-string v2, "Recommended"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/roblox/client/d;->a:Lcom/roblox/client/d$e;

    sget-object v2, Lcom/roblox/client/d$f;->b:Lcom/roblox/client/d$f;

    iput-object v2, p1, Lcom/roblox/client/d$e;->a:Lcom/roblox/client/d$f;

    goto :goto_1

    :cond_4
    :goto_0
    iget-object p1, p0, Lcom/roblox/client/d;->a:Lcom/roblox/client/d$e;

    sget-object v2, Lcom/roblox/client/d$f;->d:Lcom/roblox/client/d$f;

    iput-object v2, p1, Lcom/roblox/client/d$e;->a:Lcom/roblox/client/d$f;

    :goto_1
    iget-object p1, p0, Lcom/roblox/client/d;->a:Lcom/roblox/client/d$e;

    const-string v2, "upgradeSource"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p1, Lcom/roblox/client/d$e;->b:Ljava/lang/String;

    iget-object p1, p0, Lcom/roblox/client/d;->a:Lcom/roblox/client/d$e;

    const-string v2, "MD5Sum"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/roblox/client/d$e;->c:Ljava/lang/String;

    iget-object p1, p0, Lcom/roblox/client/d;->c:Lgk/c0;

    invoke-interface {p1}, Lgk/c0;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/roblox/client/d;->b:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "evaluateResponse: Exception caught: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "UpgradeCheckHelper"

    invoke-static {v0, p1}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public d()Lcom/roblox/client/d$e;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/d;->a:Lcom/roblox/client/d$e;

    return-object v0
.end method

.method public f()Z
    .locals 6

    iget-object v0, p0, Lcom/roblox/client/d;->d:Lcom/roblox/client/d$f;

    sget-object v1, Lcom/roblox/client/d$f;->c:Lcom/roblox/client/d$f;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iget-object v4, p0, Lcom/roblox/client/d;->a:Lcom/roblox/client/d$e;

    iget-object v4, v4, Lcom/roblox/client/d$e;->a:Lcom/roblox/client/d$f;

    if-ne v4, v1, :cond_1

    move v1, v3

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "isUpgradeRequired: ["

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, ", "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v5, "]"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "UpgradeCheckHelper"

    invoke-static {v5, v4}, Lgk/q;->i(Ljava/lang/String;Ljava/lang/String;)I

    if-nez v0, :cond_3

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    return v2

    :cond_3
    :goto_2
    return v3
.end method

.method public g(Lcom/roblox/client/d$e;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Set upgrade-status (from Init) = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Lcom/roblox/client/d$e;->a:Lcom/roblox/client/d$f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UpgradeCheckHelper"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p1, Lcom/roblox/client/d$e;->a:Lcom/roblox/client/d$f;

    iput-object v0, p0, Lcom/roblox/client/d;->d:Lcom/roblox/client/d$f;

    iget-object v0, p1, Lcom/roblox/client/d$e;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/roblox/client/d;->e:Ljava/lang/String;

    iget-object p1, p1, Lcom/roblox/client/d$e;->c:Ljava/lang/String;

    iput-object p1, p0, Lcom/roblox/client/d;->f:Ljava/lang/String;

    return-void
.end method
