.class public Ldj/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldj/h$e;,
        Ldj/h$d;,
        Ldj/h$f;
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

    iput-wide v0, p0, Ldj/h;->a:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Ldj/h;->b:Z

    invoke-virtual {p0}, Ldj/h;->k()V

    return-void
.end method

.method public static e()Ldj/h;
    .locals 1

    invoke-static {}, Ldj/h$e;->a()Ldj/h;

    move-result-object v0

    return-object v0
.end method

.method public static h()Z
    .locals 4

    invoke-static {}, Lbh/a1;->T()Landroid/content/SharedPreferences;

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

    invoke-static {}, Lbh/a1;->T()Landroid/content/SharedPreferences;

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
.method public final a(Lfj/c$b;)V
    .locals 3

    new-instance v0, Ldj/h$c;

    invoke-direct {v0, p0, p1}, Ldj/h$c;-><init>(Ldj/h;Lfj/c$b;)V

    invoke-static {}, Lbh/a1;->v0()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lmi/g;->a()Lmi/f;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, p1, v2, v2, v0}, Lmi/f;->a(Ljava/lang/String;Loi/a;[Lmi/c$a;Lmi/l;)Lmi/e;

    move-result-object p1

    invoke-virtual {p1}, Lmi/a;->b()V

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

.method public c(Landroid/content/Context;ZLfj/c$b;)V
    .locals 0

    if-eqz p2, :cond_0

    invoke-virtual {p0, p3}, Ldj/h;->a(Lfj/c$b;)V

    :cond_0
    invoke-virtual {p0, p1}, Ldj/h;->n(Landroid/content/Context;)V

    if-nez p2, :cond_1

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->W1()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, Ldl/j;->e()Ldl/j;

    move-result-object p1

    invoke-static {}, Lbh/a1;->O()Ljava/lang/String;

    move-result-object p2

    invoke-static {}, Lbh/a1;->g()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Ldl/j;->g(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object p1

    invoke-virtual {p1}, Lbh/y;->p()Ldk/a;

    move-result-object p1

    invoke-virtual {p1}, Ldk/a;->c()V

    return-void
.end method

.method public d(Lmi/m;)V
    .locals 1

    new-instance v0, Lnk/a;

    invoke-direct {v0, p1}, Lnk/a;-><init>(Lmi/m;)V

    invoke-virtual {v0}, Lnk/a;->b()V

    const-string p1, "activeSession"

    invoke-static {p1}, Ldj/g;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lnk/a;->c()V

    return-void
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Ldj/h;->b:Z

    return v0
.end method

.method public g()J
    .locals 2

    iget-wide v0, p0, Ldj/h;->a:J

    return-wide v0
.end method

.method public i()Z
    .locals 4

    iget-wide v0, p0, Ldj/h;->a:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public j(Landroid/content/Context;Ljava/lang/String;Ldj/h$f;)V
    .locals 6

    const-string v0, ""

    const-string v1, "SessionManager"

    const-string v2, "didLoggedIn"

    invoke-static {v1, v2}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v1, 0x1

    iput-boolean v1, p0, Ldj/h;->b:Z

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p2, "userId"

    iget-wide v2, p0, Ldj/h;->a:J

    invoke-virtual {v1, p2, v2, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v2

    iput-wide v2, p0, Ldj/h;->a:J

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object p2

    iget-wide v2, p0, Ldj/h;->a:J

    invoke-virtual {p2, v2, v3}, Lnk/c;->v(J)V

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object p2

    const-string v2, "isUnder13"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v2

    invoke-virtual {p2, v2}, Lnk/c;->q(Z)V

    const-string p2, "username"

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v2

    invoke-virtual {v2}, Lnk/c;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p2, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v2

    invoke-virtual {v2, p2}, Lnk/c;->w(Ljava/lang/String;)V

    const-string p2, "displayName"

    invoke-virtual {v1, p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v2

    invoke-virtual {v2, p2}, Lnk/c;->o(Ljava/lang/String;)V

    const/4 p2, 0x0

    invoke-virtual {p0, p2}, Ldj/h;->r(Z)V

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v2

    const-string v3, "membershipType"

    invoke-virtual {v1, v3, p2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v2, v3}, Lnk/c;->r(I)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v2

    invoke-interface {v2}, Lbi/i;->o1()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v2

    const-string v3, "hasRobloxSubscription"

    invoke-virtual {v1, v3, p2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p2

    invoke-virtual {v2, p2}, Lnk/c;->p(Z)V

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p2, v0

    goto :goto_1

    :cond_0
    :goto_0
    const-string p2, "countryCode"

    invoke-virtual {v1, p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p2

    invoke-interface {p2}, Lbi/i;->x1()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, Lbh/y;->h()Lbh/y;

    move-result-object p2

    invoke-virtual {p2}, Lbh/y;->d()Ldj/d;

    move-result-object p2

    iget-wide v0, p0, Ldj/h;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ldj/d;->i(Ljava/lang/String;)V
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

    invoke-static {p2}, Lok/q;->j(Ljava/lang/String;)I

    :cond_1
    :goto_2
    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object p2

    invoke-virtual {p2}, Lnk/c;->k()Ljava/lang/String;

    move-result-object v5

    new-instance v0, Lcj/a;

    const-string v2, "PostLogin"

    iget-wide v3, p0, Ldj/h;->a:J

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcj/a;-><init>(Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;)V

    new-instance p1, Ldj/h$b;

    invoke-direct {p1, p0, p3}, Ldj/h$b;-><init>(Ldj/h;Ldj/h$f;)V

    invoke-virtual {v0, p1}, Lcj/a;->g(Lcj/a$d;)V

    invoke-virtual {v0}, Lnh/d;->e()V

    return-void
.end method

.method public final k()V
    .locals 8

    invoke-static {}, Lbh/a1;->T()Landroid/content/SharedPreferences;

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

    iput-wide v6, p0, Ldj/h;->a:J

    cmp-long v3, v6, v4

    if-nez v3, :cond_0

    const-string v3, "userid"

    const/4 v4, -0x1

    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v3

    int-to-long v3, v3

    iput-wide v3, p0, Ldj/h;->a:J

    :cond_0
    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v3

    const-string v4, "under13"

    const/4 v5, 0x1

    invoke-interface {v0, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v3, v0}, Lnk/c;->q(Z)V

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v0

    invoke-virtual {v0, v1}, Lnk/c;->w(Ljava/lang/String;)V

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v0

    invoke-virtual {v0, v2}, Lnk/c;->o(Ljava/lang/String;)V

    return-void
.end method

.method public m(Ldj/h$d;Lmi/f;)V
    .locals 2

    new-instance v0, Ldj/h$a;

    invoke-direct {v0, p0, p1}, Ldj/h$a;-><init>(Ldj/h;Ldj/h$d;)V

    invoke-static {}, Lbh/a1;->f()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {p2, p1, v1, v0}, Lmi/f;->b(Ljava/lang/String;[Lmi/c$a;Lmi/l;)Lmi/d;

    move-result-object p1

    invoke-virtual {p1}, Lmi/a;->b()V

    return-void
.end method

.method public final n(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Ldj/h;->b:Z

    const-wide/16 v0, -0x1

    invoke-virtual {p0, v0, v1}, Ldj/h;->o(J)V

    invoke-virtual {p0}, Ldj/h;->q()V

    invoke-virtual {p0}, Ldj/h;->p()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ldj/h;->r(Z)V

    invoke-static {}, Lmh/b;->b()Lmh/b;

    move-result-object v0

    invoke-virtual {v0}, Lmh/b;->a()V

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object v0

    invoke-virtual {v0}, Lnk/c;->a()V

    invoke-static {}, Lrj/u;->c()Lrj/u;

    move-result-object v0

    invoke-virtual {v0}, Lrj/u;->a()V

    invoke-virtual {p0, p1}, Ldj/h;->b(Landroid/content/Context;)V

    return-void
.end method

.method public o(J)V
    .locals 0

    iput-wide p1, p0, Ldj/h;->a:J

    return-void
.end method

.method public final p()V
    .locals 2

    invoke-static {}, Lbh/a1;->T()Landroid/content/SharedPreferences;

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

    invoke-static {}, Lbh/a1;->T()Landroid/content/SharedPreferences;

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

    invoke-static {}, Lbh/a1;->T()Landroid/content/SharedPreferences;

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
    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object p1

    invoke-virtual {p1}, Lnk/c;->k()Ljava/lang/String;

    move-result-object p1

    const-string v4, "username"

    invoke-interface {v0, v4, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object p1

    invoke-virtual {p1}, Lnk/c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    iget-wide v4, p0, Ldj/h;->a:J

    invoke-interface {v0, v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-static {}, Lnk/c;->c()Lnk/c;

    move-result-object p1

    invoke-virtual {p1}, Lnk/c;->n()Z

    move-result p1

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    :goto_0
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
