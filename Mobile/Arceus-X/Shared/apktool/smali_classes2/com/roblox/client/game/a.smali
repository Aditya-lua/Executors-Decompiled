.class public Lcom/roblox/client/game/a;
.super Lwh/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/game/a$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/roblox/client/game/a$a;

.field public final c:Lwh/w0;


# direct methods
.method public constructor <init>(Lcom/roblox/client/game/a$a;Lwh/w0;)V
    .locals 1

    invoke-direct {p0}, Lwh/k;-><init>()V

    const-string v0, "rbx.game.callback"

    iput-object v0, p0, Lcom/roblox/client/game/a;->a:Ljava/lang/String;

    iput-object p1, p0, Lcom/roblox/client/game/a;->b:Lcom/roblox/client/game/a$a;

    iput-object p2, p0, Lcom/roblox/client/game/a;->c:Lwh/w0;

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "exitGameWithError: errorID = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.game.callback"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/game/a;->b:Lcom/roblox/client/game/a$a;

    invoke-virtual {p0, p1}, Lcom/roblox/client/game/a;->v(I)I

    move-result p1

    invoke-interface {v0, p1}, Lcom/roblox/client/game/a$a;->q(I)V

    return-void
.end method

.method public b(J)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gameLoadedCallback() "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.game.callback"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/game/a;->b:Lcom/roblox/client/game/a$a;

    invoke-interface {v0, p1, p2}, Lcom/roblox/client/game/a$a;->m(J)V

    invoke-static {}, Lcom/roblox/client/startup/a;->n()V

    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    iget-object p1, p0, Lcom/roblox/client/game/a;->b:Lcom/roblox/client/game/a$a;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lcom/roblox/client/game/a$a;->f(Z)V

    return-void
.end method

.method public f(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onDataModelNotification() type:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " data:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "rbx.game.callback"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "OPEN_CUSTOM_WEBVIEW"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    :try_start_0
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p2, "url"

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "URL must not be empty onNavigateToFeatureEvent OPEN_CUSTOM_WEBVIEW"

    invoke-static {v1, p1}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    const-string v0, "title"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "searchParams"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    iget-object v2, p0, Lcom/roblox/client/game/a;->b:Lcom/roblox/client/game/a$a;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    invoke-interface {v2, p2, v0, p1}, Lcom/roblox/client/game/a$a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string p1, "Exception parsing data onNavigateToFeatureEvent OPEN_CUSTOM_WEBVIEW"

    invoke-static {v1, p1}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    return-void
.end method

.method public j(JLjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/game/a;->b:Lcom/roblox/client/game/a$a;

    invoke-interface {v0, p1, p2, p3}, Lcom/roblox/client/game/a$a;->n(JLjava/lang/String;)V

    return-void
.end method

.method public k(JLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/game/a;->b:Lcom/roblox/client/game/a$a;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/roblox/client/game/a$a;->j(JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public l(JLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/game/a;->b:Lcom/roblox/client/game/a$a;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/roblox/client/game/a$a;->h(JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public m(JLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/game/a;->b:Lcom/roblox/client/game/a$a;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/roblox/client/game/a$a;->k(JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public n(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    iget-object v0, p0, Lcom/roblox/client/game/a;->b:Lcom/roblox/client/game/a$a;

    move-wide v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/roblox/client/game/a$a;->l(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public p(I)V
    .locals 3

    invoke-static {}, Lsg/a1;->q0()Z

    move-result v0

    const-string v1, "rbx.game.orientation"

    if-eqz v0, :cond_0

    const-string p1, "screenOrientationChanged: ignoring screen orientation change request on Quest"

    invoke-static {v1, p1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    if-eqz p1, :cond_5

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v2, 0x3

    if-eq p1, v2, :cond_2

    const/4 v2, 0x4

    if-eq p1, v2, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "screenOrientationChanged: newOrientation ="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    const-string p1, "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_USER"

    invoke-static {v1, p1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/game/a;->b:Lcom/roblox/client/game/a$a;

    invoke-interface {p1, v0}, Lcom/roblox/client/game/a$a;->g(I)V

    return-void

    :cond_2
    const-string p1, "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_SENSOR_PORTRAIT"

    invoke-static {v1, p1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/game/a;->b:Lcom/roblox/client/game/a$a;

    const/4 v0, 0x7

    invoke-interface {p1, v0}, Lcom/roblox/client/game/a$a;->g(I)V

    return-void

    :cond_3
    const-string p1, "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_SENSOR_LANDSCAPE"

    invoke-static {v1, p1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/game/a;->b:Lcom/roblox/client/game/a$a;

    const/4 v0, 0x6

    invoke-interface {p1, v0}, Lcom/roblox/client/game/a$a;->g(I)V

    return-void

    :cond_4
    const-string p1, "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_LANDSCAPE"

    invoke-static {v1, p1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/game/a;->b:Lcom/roblox/client/game/a$a;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/roblox/client/game/a$a;->g(I)V

    return-void

    :cond_5
    const-string p1, "screenOrientationChanged: newOrientation = SCREEN_ORIENTATION_REVERSE_LANDSCAPE"

    invoke-static {v1, p1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/game/a;->b:Lcom/roblox/client/game/a$a;

    const/16 v0, 0x8

    invoke-interface {p1, v0}, Lcom/roblox/client/game/a$a;->g(I)V

    return-void
.end method

.method public r()Lwh/w0;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/game/a;->c:Lwh/w0;

    return-object v0
.end method

.method public final v(I)I
    .locals 2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_3

    const/4 v0, 0x4

    if-eq p1, v0, :cond_2

    const/4 v0, 0x5

    if-eq p1, v0, :cond_1

    const/4 v0, 0x6

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "(Game failed to start) Unexpected errorId=["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "]."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "rbx.game.callback"

    invoke-static {v0, p1}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    sget p1, Lsg/q0;->x0:I

    return p1

    :pswitch_0
    sget p1, Lsg/q0;->v0:I

    return p1

    :pswitch_1
    sget p1, Lsg/q0;->w0:I

    return p1

    :pswitch_2
    sget p1, Lsg/q0;->y0:I

    return p1

    :cond_0
    sget p1, Lsg/q0;->u0:I

    return p1

    :cond_1
    sget p1, Lsg/q0;->t0:I

    return p1

    :cond_2
    sget p1, Lsg/q0;->s0:I

    return p1

    :cond_3
    sget p1, Lsg/q0;->r0:I

    return p1

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
