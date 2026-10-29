.class public Lvi/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvi/h$e;,
        Lvi/h$d;,
        Lvi/h$f;
    }
.end annotation


# instance fields
.field public a:J

.field public b:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lvi/h;->a:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lvi/h;->b:Z

    invoke-virtual {p0}, Lvi/h;->k()V

    return-void
.end method

.method public static e()Lvi/h;
    .locals 1

    invoke-static {}, Lvi/h$e;->a()Lvi/h;

    move-result-object v0

    return-object v0
.end method

.method public static h()Z
    .locals 4

    invoke-static {}, Lsg/a1;->T()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "userid_long"

    const-wide/16 v2, -0x1

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static l()Lorg/json/JSONObject;
    .locals 9

    const-string v0, "displayName"

    const-string v1, ""

    const-string v2, "username"

    invoke-static {}, Lsg/a1;->T()Landroid/content/SharedPreferences;

    move-result-object v3

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v5, "userId"

    const-string v6, "userid_long"

    const-wide/16 v7, -0x1

    invoke-interface {v3, v6, v7, v8}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v6

    invoke-virtual {v4, v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v5, "isUnder13"

    const-string v6, "under13"

    const/4 v7, 0x1

    invoke-interface {v3, v6, v7}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v6

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    invoke-interface {v3, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v4

    :catch_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "invalid UserInfo json"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a(Lxi/c$b;)V
    .locals 3

    new-instance v0, Lvi/h$c;

    invoke-direct {v0, p0, p1}, Lvi/h$c;-><init>(Lvi/h;Lxi/c$b;)V

    invoke-static {}, Lsg/a1;->v0()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lei/g;->a()Lei/f;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, p1, v2, v2, v0}, Lei/f;->b(Ljava/lang/String;Lgi/a;[Lei/c$a;Lei/l;)Lei/e;

    move-result-object p1

    invoke-virtual {p1}, Lei/a;->b()V

    return-void
.end method

.method public final b(Landroid/content/Context;)V
    .locals 1

    if-eqz p1, :cond_0

    const-string v0, "notification"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;

    invoke-virtual {p1}, Landroid/app/NotificationManager;->cancelAll()V

    :cond_0
    return-void
.end method

.method public c(Landroid/content/Context;ZLxi/c$b;)V
    .locals 0

    if-eqz p2, :cond_0

    invoke-virtual {p0, p3}, Lvi/h;->a(Lxi/c$b;)V

    :cond_0
    invoke-virtual {p0, p1}, Lvi/h;->n(Landroid/content/Context;)V

    if-nez p2, :cond_1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->S1()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, Lwk/j;->c()Lwk/j;

    move-result-object p1

    invoke-static {}, Lsg/a1;->O()Ljava/lang/String;

    move-result-object p2

    invoke-static {}, Lsg/a1;->g()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lwk/j;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object p1

    invoke-virtual {p1}, Lsg/y;->p()Lvj/a;

    move-result-object p1

    invoke-virtual {p1}, Lvj/a;->c()V

    return-void
.end method

.method public d(Lei/m;)V
    .locals 1

    new-instance v0, Lfk/a;

    invoke-direct {v0, p1}, Lfk/a;-><init>(Lei/m;)V

    invoke-virtual {v0}, Lfk/a;->b()V

    const-string p1, "activeSession"

    invoke-static {p1}, Lvi/g;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lfk/a;->c()V

    return-void
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lvi/h;->b:Z

    return v0
.end method

.method public g()J
    .locals 2

    iget-wide v0, p0, Lvi/h;->a:J

    return-wide v0
.end method

.method public i()Z
    .locals 4

    iget-wide v0, p0, Lvi/h;->a:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public j(Landroid/content/Context;Ljava/lang/String;Lvi/h$f;)V
    .locals 6

    const-string v0, ""

    const-string v1, "SessionManager"

    const-string v2, "didLoggedIn"

    invoke-static {v1, v2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v1, 0x1

    iput-boolean v1, p0, Lvi/h;->b:Z

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p2, "userId"

    iget-wide v2, p0, Lvi/h;->a:J

    invoke-virtual {v1, p2, v2, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v2

    iput-wide v2, p0, Lvi/h;->a:J

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object p2

    iget-wide v2, p0, Lvi/h;->a:J

    invoke-virtual {p2, v2, v3}, Lfk/c;->v(J)V

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object p2

    const-string v2, "isUnder13"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v2

    invoke-virtual {p2, v2}, Lfk/c;->q(Z)V

    const-string p2, "username"

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v2

    invoke-virtual {v2}, Lfk/c;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p2, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v2

    invoke-virtual {v2, p2}, Lfk/c;->w(Ljava/lang/String;)V

    const-string p2, "displayName"

    invoke-virtual {v1, p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v2

    invoke-virtual {v2, p2}, Lfk/c;->o(Ljava/lang/String;)V

    const/4 p2, 0x0

    invoke-virtual {p0, p2}, Lvi/h;->r(Z)V

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v2

    const-string v3, "membershipType"

    invoke-virtual {v1, v3, p2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v2, v3}, Lfk/c;->r(I)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->l1()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v2

    const-string v3, "hasRobloxSubscription"

    invoke-virtual {v1, v3, p2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p2

    invoke-virtual {v2, p2}, Lfk/c;->p(Z)V

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p2, v0

    goto :goto_1

    :cond_0
    :goto_0
    const-string p2, "countryCode"

    invoke-virtual {v1, p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p2

    invoke-interface {p2}, Lth/i;->t1()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object p2

    invoke-virtual {p2}, Lsg/y;->d()Lvi/d;

    move-result-object p2

    iget-wide v0, p0, Lvi/h;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lvi/d;->i(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onAccountInfoFromLua: Exception: + "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lgk/q;->j(Ljava/lang/String;)I

    :cond_1
    :goto_2
    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object p2

    invoke-virtual {p2}, Lfk/c;->k()Ljava/lang/String;

    move-result-object v5

    new-instance v0, Lui/a;

    const-string v2, "PostLogin"

    iget-wide v3, p0, Lvi/h;->a:J

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lui/a;-><init>(Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;)V

    new-instance p1, Lvi/h$b;

    invoke-direct {p1, p0, p3}, Lvi/h$b;-><init>(Lvi/h;Lvi/h$f;)V

    invoke-virtual {v0, p1}, Lui/a;->g(Lui/a$d;)V

    invoke-virtual {v0}, Leh/d;->e()V

    return-void
.end method

.method public final k()V
    .locals 8

    invoke-static {}, Lsg/a1;->T()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "username"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "displayName"

    invoke-interface {v0, v3, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "userid_long"

    const-wide/16 v4, -0x1

    invoke-interface {v0, v3, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v6

    iput-wide v6, p0, Lvi/h;->a:J

    cmp-long v3, v6, v4

    if-nez v3, :cond_0

    const-string v3, "userid"

    const/4 v4, -0x1

    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v3

    int-to-long v3, v3

    iput-wide v3, p0, Lvi/h;->a:J

    :cond_0
    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v3

    const-string v4, "under13"

    const/4 v5, 0x1

    invoke-interface {v0, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v3, v0}, Lfk/c;->q(Z)V

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v0

    invoke-virtual {v0, v1}, Lfk/c;->w(Ljava/lang/String;)V

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v0

    invoke-virtual {v0, v2}, Lfk/c;->o(Ljava/lang/String;)V

    return-void
.end method

.method public m(Lvi/h$d;Lei/f;)V
    .locals 2

    new-instance v0, Lvi/h$a;

    invoke-direct {v0, p0, p1}, Lvi/h$a;-><init>(Lvi/h;Lvi/h$d;)V

    invoke-static {}, Lsg/a1;->f()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {p2, p1, v1, v0}, Lei/f;->a(Ljava/lang/String;[Lei/c$a;Lei/l;)Lei/d;

    move-result-object p1

    invoke-virtual {p1}, Lei/a;->b()V

    return-void
.end method

.method public final n(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lvi/h;->b:Z

    const-wide/16 v0, -0x1

    invoke-virtual {p0, v0, v1}, Lvi/h;->o(J)V

    invoke-virtual {p0}, Lvi/h;->q()V

    invoke-virtual {p0}, Lvi/h;->p()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lvi/h;->r(Z)V

    invoke-static {}, Ldh/b;->b()Ldh/b;

    move-result-object v0

    invoke-virtual {v0}, Ldh/b;->a()V

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v0

    invoke-virtual {v0}, Lfk/c;->a()V

    invoke-static {}, Ljj/u;->c()Ljj/u;

    move-result-object v0

    invoke-virtual {v0}, Ljj/u;->a()V

    invoke-virtual {p0, p1}, Lvi/h;->b(Landroid/content/Context;)V

    return-void
.end method

.method public o(J)V
    .locals 0

    iput-wide p1, p0, Lvi/h;->a:J

    return-void
.end method

.method public final p()V
    .locals 2

    invoke-static {}, Lsg/a1;->T()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "last_auth_cookie_expir_key"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final q()V
    .locals 2

    invoke-static {}, Lsg/a1;->T()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "user_logged_in_time"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final r(Z)V
    .locals 6

    invoke-static {}, Lsg/a1;->T()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "userid"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    const-string v1, "under13"

    const-string v2, "displayName"

    const-string v3, "userid_long"

    if-eqz p1, :cond_0

    invoke-interface {v0, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    :cond_0
    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object p1

    invoke-virtual {p1}, Lfk/c;->k()Ljava/lang/String;

    move-result-object p1

    const-string v4, "username"

    invoke-interface {v0, v4, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object p1

    invoke-virtual {p1}, Lfk/c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    iget-wide v4, p0, Lvi/h;->a:J

    invoke-interface {v0, v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object p1

    invoke-virtual {p1}, Lfk/c;->n()Z

    move-result p1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    :goto_0
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
