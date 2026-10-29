.class public Lwh/n;
.super Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwh/n$a;,
        Lwh/n$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public c:Lwh/n$a;

.field public d:Lwh/n$b;

.field public e:Lwg/a;


# direct methods
.method public constructor <init>(Lwh/n$a;Lwh/n$b;)V
    .locals 1

    invoke-direct {p0}, Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;-><init>()V

    const-string v0, "rbx.datamodel"

    iput-object v0, p0, Lwh/n;->a:Ljava/lang/String;

    const-string v0, "OPEN_YOUTUBE_VIDEO"

    iput-object v0, p0, Lwh/n;->b:Ljava/lang/String;

    new-instance v0, Lwg/a;

    invoke-direct {v0}, Lwg/a;-><init>()V

    iput-object v0, p0, Lwh/n;->e:Lwg/a;

    iput-object p1, p0, Lwh/n;->c:Lwh/n$a;

    iput-object p2, p0, Lwh/n;->d:Lwh/n$b;

    return-void
.end method

.method public static synthetic b(Lwh/n;Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Lwh/n;->f(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic c(ZLcom/roblox/client/a;)V
    .locals 2

    const/16 v0, 0x80

    if-eqz p0, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-static {p0}, Lsg/c2;->b(Landroid/view/Window;)V

    invoke-virtual {p1}, Lcom/roblox/client/a;->W1()Lmi/c;

    move-result-object p0

    sget-object v1, Lwh/t0;->a:Lwh/t0;

    invoke-virtual {p0, v1}, Lmi/c;->o(Lwh/t0;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p0

    invoke-interface {p0}, Lth/i;->z3()Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/view/Window;->addFlags(I)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/roblox/client/a;->W1()Lmi/c;

    move-result-object p0

    sget-object v1, Lwh/t0;->b:Lwh/t0;

    invoke-virtual {p0, v1}, Lmi/c;->o(Lwh/t0;)V

    invoke-virtual {p1}, Lj/b;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    invoke-static {p0}, Lsg/a1;->Q0(Landroid/content/res/Configuration;)Z

    move-result p0

    if-nez p0, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-static {p0}, Lsg/c2;->c(Landroid/view/Window;)V

    :cond_1
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p0

    invoke-interface {p0}, Lth/i;->z3()Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/view/Window;->clearFlags(I)V

    :cond_2
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

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

    const-string v1, "rbx.datamodel"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "VIEW_PROFILE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    const-string p1, "PROFILE_TAG"

    invoke-static {p1}, Lph/g;->b(Ljava/lang/String;)Lph/g;

    move-result-object p1

    invoke-virtual {p1, p2}, Lph/g;->i(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Lph/g;->j(Z)V

    invoke-static {}, Lfv/c;->d()Lfv/c;

    move-result-object p2

    invoke-virtual {p2, p1}, Lfv/c;->j(Ljava/lang/Object;)V

    return-void

    :cond_1
    const-string v0, "SCAN_QR_CODE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    new-instance p1, Lph/g;

    invoke-direct {p1, v0}, Lph/g;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lfv/c;->d()Lfv/c;

    move-result-object p2

    invoke-virtual {p2, p1}, Lfv/c;->j(Ljava/lang/Object;)V

    return-void

    :cond_2
    const-string v0, "REPORT_ABUSE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance p1, Lph/g;

    const-string v0, "ABUSE_REPORT_TAG"

    invoke-direct {p1, v0}, Lph/g;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lph/g;->i(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Lph/g;->j(Z)V

    invoke-static {}, Lfv/c;->d()Lfv/c;

    move-result-object p2

    invoke-virtual {p2, p1}, Lfv/c;->j(Ljava/lang/Object;)V

    return-void

    :cond_3
    const-string v0, "BACK_BUTTON_NOT_CONSUMED"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Lfv/c;->d()Lfv/c;

    move-result-object p1

    new-instance p2, Lph/c;

    invoke-direct {p2}, Lph/c;-><init>()V

    invoke-virtual {p1, p2}, Lfv/c;->j(Ljava/lang/Object;)V

    return-void

    :cond_4
    const-string v0, "PURCHASE_ROBUX"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance p1, Lxi/e;

    iget-object p2, p0, Lwh/n;->d:Lwh/n$b;

    invoke-interface {p2}, Lwh/n$b;->a()Lsg/x0;

    move-result-object p2

    const-string v0, "tabAvatar"

    invoke-direct {p1, p2, v0}, Lxi/e;-><init>(Lsg/x0;Ljava/lang/String;)V

    iget-object p2, p0, Lwh/n;->e:Lwg/a;

    invoke-virtual {p1, p2}, Lxi/e;->g(Landroidx/lifecycle/r;)V

    return-void

    :cond_5
    const-string v0, "VIEW_NOTIFICATIONS"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance p1, Lxi/d;

    iget-object p2, p0, Lwh/n;->d:Lwh/n$b;

    invoke-interface {p2}, Lwh/n$b;->a()Lsg/x0;

    move-result-object p2

    invoke-direct {p1, p2}, Lxi/d;-><init>(Landroidx/fragment/app/c;)V

    iget-object p2, p0, Lwh/n;->e:Lwg/a;

    invoke-virtual {p1, p2}, Lxi/d;->f(Landroidx/lifecycle/r;)V

    return-void

    :cond_6
    const-string v0, "APP_READY"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object p1, p0, Lwh/n;->c:Lwh/n$a;

    invoke-interface {p1, p2}, Lwh/n$a;->c(Ljava/lang/String;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->f2()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-virtual {p0, p2}, Lwh/n;->d(Ljava/lang/String;)V

    :cond_7
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_22

    const-string p1, "landing"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_22

    const-string p1, "Got callback to Java landing page, going to flush the client settings"

    invoke-static {v1, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lcom/roblox/client/startup/a;->n()V

    return-void

    :cond_8
    const-string v0, "OPEN_CUSTOM_WEBVIEW"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v3, "CUSTOM_WEBVIEW_TAG"

    if-eqz v0, :cond_9

    invoke-static {v3}, Lph/g;->b(Ljava/lang/String;)Lph/g;

    move-result-object p1

    invoke-virtual {p1, p2}, Lph/g;->g(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Lph/g;->j(Z)V

    invoke-static {}, Lfv/c;->d()Lfv/c;

    move-result-object p2

    invoke-virtual {p2, p1}, Lfv/c;->j(Ljava/lang/Object;)V

    return-void

    :cond_9
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->q1()Z

    move-result v0

    if-eqz v0, :cond_a

    const-string v0, "POST_PURCHASE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    :try_start_0
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    const-string v0, "url"

    invoke-virtual {p1, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {v3}, Lph/g;->b(Ljava/lang/String;)Lph/g;

    move-result-object v0

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lph/g;->g(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lph/g;->j(Z)V

    invoke-static {}, Lfv/c;->d()Lfv/c;

    move-result-object p1

    invoke-virtual {p1, v0}, Lfv/c;->j(Ljava/lang/Object;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "POST_PURCHASE: failed to build JSON url="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " error="

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_3

    :cond_a
    const-string v0, "OPEN_BUILDERS_CLUB"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    new-instance p1, Lxi/b;

    iget-object p2, p0, Lwh/n;->d:Lwh/n$b;

    invoke-interface {p2}, Lwh/n$b;->a()Lsg/x0;

    move-result-object p2

    const-string v0, "tabMore"

    invoke-direct {p1, p2, v0}, Lxi/b;-><init>(Lsg/x0;Ljava/lang/String;)V

    iget-object p2, p0, Lwh/n;->e:Lwg/a;

    invoke-virtual {p1, p2}, Lxi/b;->c(Landroidx/lifecycle/r;)V

    return-void

    :cond_b
    const-string v0, "SEARCH_GAMES"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    const-string p1, "SEARCH_GAMES_TAG"

    invoke-static {p1}, Lph/g;->b(Ljava/lang/String;)Lph/g;

    move-result-object p1

    invoke-virtual {p1, p2}, Lph/g;->i(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Lph/g;->j(Z)V

    invoke-static {}, Lfv/c;->d()Lfv/c;

    move-result-object p2

    invoke-virtual {p2, p1}, Lfv/c;->j(Ljava/lang/Object;)V

    return-void

    :cond_c
    const-string v0, "ACTION_LOG_OUT"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    new-instance p1, Lxi/c;

    iget-object p2, p0, Lwh/n;->d:Lwh/n$b;

    invoke-interface {p2}, Lwh/n$b;->a()Lsg/x0;

    move-result-object p2

    invoke-direct {p1, p2}, Lxi/c;-><init>(Lsg/x0;)V

    iget-object p2, p0, Lwh/n;->e:Lwg/a;

    invoke-virtual {p1, p2}, Lxi/c;->c(Landroidx/lifecycle/r;)V

    return-void

    :cond_d
    const-string v0, "LUA_HOME_PAGE_LOADED"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->f2()Z

    move-result p1

    if-eqz p1, :cond_e

    invoke-virtual {p0}, Lwh/n;->e()V

    :cond_e
    invoke-static {}, Lcom/roblox/client/RobloxApplication;->f()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/roblox/client/startup/FlagCacheUtils;->flushPendingVersionBWrite(Landroid/content/Context;)V

    invoke-static {}, Lcom/roblox/client/startup/FlagCacheUtils;->flushPendingVersionBTelemetry()V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->X0()Z

    move-result p1

    if-eqz p1, :cond_f

    invoke-static {}, Lsh/b;->c()V

    :cond_f
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->U5()Z

    move-result p1

    if-eqz p1, :cond_22

    iget-object p1, p0, Lwh/n;->d:Lwh/n$b;

    invoke-interface {p1}, Lwh/n$b;->a()Lsg/x0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object p1

    if-eqz p1, :cond_22

    invoke-static {p1}, Ldi/i;->p(Le4/q;)V

    return-void

    :cond_10
    const-string v0, "LAUNCH_CONVERSATION"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    const-wide/16 v2, -0x1

    :try_start_1
    invoke-static {p2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    const-string p1, "could not parse data"

    invoke-static {v1, p1}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    move-wide p1, v2

    :goto_1
    cmp-long v0, p1, v2

    if-eqz v0, :cond_22

    new-instance v0, Lph/f;

    invoke-direct {v0, p1, p2}, Lph/f;-><init>(J)V

    invoke-static {}, Lfv/c;->d()Lfv/c;

    move-result-object p1

    invoke-virtual {p1, v0}, Lfv/c;->j(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_11
    const-string v0, "UNIVERSAL_FRIENDS"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    new-instance p1, Lph/g;

    const-string p2, "UNIVERSAL_FRIENDS_TAG"

    invoke-direct {p1, p2}, Lph/g;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lfv/c;->d()Lfv/c;

    move-result-object p2

    invoke-virtual {p2, p1}, Lfv/c;->j(Ljava/lang/Object;)V

    return-void

    :cond_12
    const-string v0, "OPEN_YOUTUBE_VIDEO"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    const-string p1, "YOUTUBE_TAG"

    invoke-static {p1, p2}, Lph/g;->a(Ljava/lang/String;Ljava/lang/String;)Lph/g;

    move-result-object p1

    invoke-virtual {p1, v2}, Lph/g;->j(Z)V

    invoke-static {}, Lfv/c;->d()Lfv/c;

    move-result-object p2

    invoke-virtual {p2, p1}, Lfv/c;->j(Ljava/lang/Object;)V

    return-void

    :cond_13
    const-string v0, "ACTION_LOG_IN"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    iget-object p1, p0, Lwh/n;->d:Lwh/n$b;

    invoke-interface {p1}, Lwh/n$b;->a()Lsg/x0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object p1

    if-eqz p1, :cond_22

    invoke-static {p1}, Lak/k0;->s(Landroid/content/Context;)Lak/k0;

    move-result-object p1

    invoke-virtual {p1}, Lak/k0;->J()V

    return-void

    :cond_14
    const-string v0, "DID_LOG_IN"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    iget-object p1, p0, Lwh/n;->d:Lwh/n$b;

    invoke-interface {p1}, Lwh/n$b;->a()Lsg/x0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object p1

    if-eqz p1, :cond_22

    invoke-static {p1, p2}, Lak/k0;->G(Landroid/app/Activity;Ljava/lang/String;)V

    return-void

    :cond_15
    const-string v0, "DID_SIGN_UP"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    iget-object p1, p0, Lwh/n;->d:Lwh/n$b;

    invoke-interface {p1}, Lwh/n$b;->a()Lsg/x0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object p1

    if-eqz p1, :cond_22

    invoke-static {p1}, Lak/k0;->s(Landroid/content/Context;)Lak/k0;

    move-result-object p1

    invoke-virtual {p1, p2}, Lak/k0;->I(Ljava/lang/String;)V

    return-void

    :cond_16
    const-string v0, "DID_LOG_OUT"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->S1()Z

    move-result p1

    if-eqz p1, :cond_17

    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object p1

    invoke-virtual {p1}, Lvi/h;->f()Z

    move-result p1

    if-nez p1, :cond_17

    invoke-static {}, Lvi/b;->f()Lvi/b;

    move-result-object p1

    sget-object p2, Lvi/b$d;->b:Lvi/b$d;

    invoke-virtual {p1, p2}, Lvi/b;->p(Lvi/b$d;)V

    invoke-static {}, Lwk/j;->c()Lwk/j;

    move-result-object p1

    invoke-static {}, Lsg/a1;->O()Ljava/lang/String;

    move-result-object p2

    invoke-static {}, Lsg/a1;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lwk/j;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_17
    iget-object p1, p0, Lwh/n;->d:Lwh/n$b;

    invoke-interface {p1}, Lwh/n$b;->a()Lsg/x0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object p1

    if-eqz p1, :cond_22

    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object p2

    invoke-virtual {p2}, Lvi/h;->f()Z

    move-result p2

    if-eqz p2, :cond_22

    invoke-static {}, Lvi/b;->f()Lvi/b;

    move-result-object p2

    sget-object v0, Lvi/b$d;->b:Lvi/b$d;

    invoke-virtual {p2, p1, v0}, Lvi/b;->i(Landroid/app/Activity;Lvi/b$d;)V

    invoke-static {}, Lcm/a;->a()Lcm/a;

    move-result-object p1

    invoke-virtual {p1}, Lcm/a;->c()V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->v3()Z

    move-result p1

    if-eqz p1, :cond_22

    invoke-static {}, Lcom/roblox/engine/jni/NativeGLInterface;->screenTimeStop()V

    return-void

    :cond_18
    const-string v0, "DID_SWITCH_ACCOUNT"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    iget-object p1, p0, Lwh/n;->d:Lwh/n$b;

    invoke-interface {p1}, Lwh/n$b;->a()Lsg/x0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object p1

    if-eqz p1, :cond_22

    invoke-static {}, Lvi/b;->f()Lvi/b;

    move-result-object p2

    invoke-virtual {p2, p1}, Lvi/b;->j(Landroid/app/Activity;)V

    invoke-static {}, Lcm/a;->a()Lcm/a;

    move-result-object p1

    invoke-virtual {p1}, Lcm/a;->c()V

    return-void

    :cond_19
    const-string v0, "NATIVE_SHARE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    iget-object p1, p0, Lwh/n;->d:Lwh/n$b;

    invoke-interface {p1}, Lwh/n$b;->a()Lsg/x0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object p1

    if-eqz p1, :cond_22

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_22

    instance-of v0, p1, Lzj/c;

    if-eqz v0, :cond_22

    check-cast p1, Lzj/c;

    invoke-interface {p1, p2}, Lzj/c;->k(Ljava/lang/String;)V

    return-void

    :cond_1a
    const-string v0, "RESTART_LUA_APP"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1c

    iget-object p1, p0, Lwh/n;->d:Lwh/n$b;

    invoke-interface {p1}, Lwh/n$b;->a()Lsg/x0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object p1

    if-eqz p1, :cond_1b

    invoke-virtual {p1}, Landroid/app/Activity;->recreate()V

    return-void

    :cond_1b
    const-string p1, "could not restart lua app"

    invoke-static {v1, p1}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1c
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->f5()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_1d

    const-string v0, "SET_STATUS_BAR_STYLE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1d

    :try_start_2
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p2, "hidden"

    invoke-virtual {p1, p2, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iget-object p2, p0, Lwh/n;->d:Lwh/n$b;

    invoke-interface {p2}, Lwh/n$b;->a()Lsg/x0;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object p2

    instance-of v0, p2, Lcom/roblox/client/a;

    if-eqz v0, :cond_22

    check-cast p2, Lcom/roblox/client/a;

    new-instance v0, Lwh/m;

    invoke-direct {v0, p1, p2}, Lwh/m;-><init>(ZLcom/roblox/client/a;)V

    invoke-virtual {p2, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    return-void

    :catch_2
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Failed to parse SET_STATUS_BAR_STYLE data: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_3

    :cond_1d
    const-string v0, "HOME_PAGE_INTERACTIVE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_20

    const-string p1, "Got callback to Java for home page is ready to interact."

    invoke-static {v1, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lwh/n;->d:Lwh/n$b;

    invoke-interface {p1}, Lwh/n$b;->a()Lsg/x0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object p1

    if-eqz p1, :cond_1e

    invoke-virtual {p1}, Le/p;->reportFullyDrawn()V

    :cond_1e
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p2

    invoke-interface {p2}, Lth/i;->U5()Z

    move-result p2

    if-eqz p2, :cond_1f

    if-eqz p1, :cond_1f

    invoke-static {p1}, Ldi/i;->o(Le4/q;)V

    :cond_1f
    invoke-static {}, Lcom/roblox/client/startup/a;->n()V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->r1()Z

    move-result p1

    if-eqz p1, :cond_22

    invoke-static {}, Lcom/roblox/client/startup/FlagCacheUtils;->flushRetryDialogTelemetry()V

    return-void

    :cond_20
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->T1()Z

    move-result v0

    if-eqz v0, :cond_22

    const-string v0, "GAME_STREAMING_STATUS_CHANGED"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_22

    :try_start_3
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p2, "inGameStreaming"

    invoke-virtual {p1, p2, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iget-object p2, p0, Lwh/n;->d:Lwh/n$b;

    invoke-interface {p2}, Lwh/n$b;->a()Lsg/x0;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object p2

    if-eqz p2, :cond_22

    if-eqz p1, :cond_21

    invoke-static {p2}, Lwh/p0;->f(Landroid/app/Activity;)V

    return-void

    :catch_3
    move-exception p1

    goto :goto_2

    :cond_21
    invoke-static {p2}, Lwh/p0;->i(Landroid/app/Activity;)V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_3

    return-void

    :goto_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Failed to parse GAME_STREAMING_STATUS_CHANGED data: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_22
    :goto_3
    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "Startup"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Landing"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lvg/j;->q()Lvg/j;

    move-result-object p1

    const-string v0, "luaLandingScreen"

    invoke-virtual {p1, v0}, Lvg/j;->k(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-static {}, Lvg/j;->q()Lvg/j;

    move-result-object p1

    const-string v0, "luaStartup"

    invoke-virtual {p1, v0}, Lvg/j;->k(Ljava/lang/String;)V

    return-void
.end method

.method public final e()V
    .locals 2

    invoke-static {}, Lvg/j;->q()Lvg/j;

    move-result-object v0

    const-string v1, "luaHomeScreen"

    invoke-virtual {v0, v1}, Lvg/j;->k(Ljava/lang/String;)V

    return-void
.end method

.method public final f(Lorg/json/JSONObject;)V
    .locals 1

    iget-object v0, p0, Lwh/n;->d:Lwh/n$b;

    invoke-interface {v0}, Lwh/n$b;->a()Lsg/x0;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    invoke-static {p1, v0}, Lsg/q;->b(Lorg/json/JSONObject;Landroid/app/Activity;)V

    return-void
.end method

.method public g()V
    .locals 2

    iget-object v0, p0, Lwh/n;->d:Lwh/n$b;

    invoke-interface {v0}, Lwh/n$b;->a()Lsg/x0;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcm/a;->a()Lcm/a;

    move-result-object v0

    new-instance v1, Lwh/l;

    invoke-direct {v1, p0}, Lwh/l;-><init>(Lwh/n;)V

    invoke-virtual {v0, v1}, Lcm/a;->b(Lcm/a$b;)V

    :cond_0
    return-void
.end method
