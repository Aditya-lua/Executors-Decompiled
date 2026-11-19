.class public Lmk/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Llk/a;Ljava/lang/String;)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-interface {p1, p2}, Llk/a;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public b(Llk/a;)V
    .locals 2

    const-string v0, "rbx.accountsettings"

    const-string v1, " api failure"

    invoke-static {v0, v1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lmk/a;->a(Llk/a;Ljava/lang/String;)V

    return-void
.end method

.method public c(Ljava/lang/String;ILlk/a;)V
    .locals 2

    const/16 v0, 0xc8

    const/4 v1, 0x0

    if-ne p2, v0, :cond_0

    :try_start_0
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    new-instance p1, Lmk/b;

    invoke-direct {p1, p2}, Lmk/b;-><init>(Lorg/json/JSONObject;)V

    invoke-virtual {p1}, Lmk/b;->a()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "JSONException thrown while parsing response to fetch user theme from server. Exception message: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lok/q;->d(Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "response code != 200, response code = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "rbx.accountsettings"

    invoke-static {p2, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    invoke-virtual {p0, p3, v1}, Lmk/a;->a(Llk/a;Ljava/lang/String;)V

    return-void
.end method

.method public d(JLlk/a;)V
    .locals 1

    invoke-static {}, Lcl/g;->d()Lcl/d;

    move-result-object v0

    invoke-interface {v0}, Lcl/d;->h()Lcom/roblox/platform/http/interfaces/AccountSettingsInterface;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/roblox/platform/http/interfaces/AccountSettingsInterface;->getUserSelectedTheme(J)Lsw/d;

    move-result-object p1

    new-instance p2, Lmk/a$a;

    invoke-direct {p2, p0, p3}, Lmk/a$a;-><init>(Lmk/a;Llk/a;)V

    invoke-interface {p1, p2}, Lsw/d;->L(Lsw/f;)V

    return-void
.end method
