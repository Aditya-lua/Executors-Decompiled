.class public final Lnb/i6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:J

.field public final synthetic e:Lnb/k6;


# direct methods
.method public synthetic constructor <init>(Lnb/k6;Ljava/lang/String;J[B)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/i6;->e:Lnb/k6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "health_monitor"

    invoke-static {p1}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    const-wide/16 p1, 0x0

    cmp-long p1, p3, p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ln9/m;->a(Z)V

    const-string p1, "health_monitor:start"

    iput-object p1, p0, Lnb/i6;->a:Ljava/lang/String;

    const-string p1, "health_monitor:count"

    iput-object p1, p0, Lnb/i6;->b:Ljava/lang/String;

    const-string p1, "health_monitor:value"

    iput-object p1, p0, Lnb/i6;->c:Ljava/lang/String;

    iput-wide p3, p0, Lnb/i6;->d:J

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;J)V
    .locals 10

    iget-object p2, p0, Lnb/i6;->e:Lnb/k6;

    invoke-virtual {p2}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/i6;->d()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p3, v0, v2

    if-nez p3, :cond_0

    invoke-virtual {p0}, Lnb/i6;->c()V

    :cond_0
    if-nez p1, :cond_1

    const-string p1, ""

    :cond_1
    invoke-virtual {p2}, Lnb/k6;->p()Landroid/content/SharedPreferences;

    move-result-object p3

    iget-object v0, p0, Lnb/i6;->b:Ljava/lang/String;

    invoke-interface {p3, v0, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    cmp-long p3, v4, v2

    const-wide/16 v1, 0x1

    if-gtz p3, :cond_2

    invoke-virtual {p2}, Lnb/k6;->p()Landroid/content/SharedPreferences;

    move-result-object p2

    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    iget-object p3, p0, Lnb/i6;->c:Ljava/lang/String;

    invoke-interface {p2, p3, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p2, v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void

    :cond_2
    iget-object p3, p2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p3}, Lnb/g7;->C()Lnb/ve;

    move-result-object p3

    invoke-virtual {p3}, Lnb/ve;->q0()Ljava/security/SecureRandom;

    move-result-object p3

    invoke-virtual {p3}, Ljava/util/Random;->nextLong()J

    move-result-wide v6

    const-wide v8, 0x7fffffffffffffffL

    and-long/2addr v6, v8

    add-long/2addr v4, v1

    div-long/2addr v8, v4

    invoke-virtual {p2}, Lnb/k6;->p()Landroid/content/SharedPreferences;

    move-result-object p2

    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    cmp-long p3, v6, v8

    if-gez p3, :cond_3

    iget-object p3, p0, Lnb/i6;->c:Ljava/lang/String;

    invoke-interface {p2, p3, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    :cond_3
    invoke-interface {p2, v0, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final b()Landroid/util/Pair;
    .locals 9

    iget-object v0, p0, Lnb/i6;->e:Lnb/k6;

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {v0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/i6;->d()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    invoke-virtual {p0}, Lnb/i6;->c()V

    move-wide v1, v3

    goto :goto_0

    :cond_0
    iget-object v5, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v5}, Lnb/g7;->e()Lu9/e;

    move-result-object v5

    invoke-interface {v5}, Lu9/e;->a()J

    move-result-wide v5

    sub-long/2addr v1, v5

    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    move-result-wide v1

    :goto_0
    iget-wide v5, p0, Lnb/i6;->d:J

    cmp-long v7, v1, v5

    const/4 v8, 0x0

    if-gez v7, :cond_1

    return-object v8

    :cond_1
    add-long/2addr v5, v5

    cmp-long v1, v1, v5

    if-lez v1, :cond_2

    invoke-virtual {p0}, Lnb/i6;->c()V

    return-object v8

    :cond_2
    iget-object v1, p0, Lnb/i6;->c:Ljava/lang/String;

    invoke-virtual {v0}, Lnb/k6;->p()Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2, v1, v8}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lnb/i6;->b:Ljava/lang/String;

    invoke-virtual {v0}, Lnb/k6;->p()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0, v2, v3, v4}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v5

    invoke-virtual {p0}, Lnb/i6;->c()V

    if-eqz v1, :cond_4

    cmp-long v0, v5, v3

    if-gtz v0, :cond_3

    goto :goto_1

    :cond_3
    new-instance v0, Landroid/util/Pair;

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_4
    :goto_1
    sget-object v0, Lnb/k6;->A:Landroid/util/Pair;

    return-object v0
.end method

.method public final c()V
    .locals 4

    iget-object v0, p0, Lnb/i6;->e:Lnb/k6;

    invoke-virtual {v0}, Lnb/j8;->h()V

    iget-object v1, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->e()Lu9/e;

    move-result-object v1

    invoke-interface {v1}, Lu9/e;->a()J

    move-result-wide v1

    invoke-virtual {v0}, Lnb/k6;->p()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v3, p0, Lnb/i6;->b:Ljava/lang/String;

    invoke-interface {v0, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    iget-object v3, p0, Lnb/i6;->c:Ljava/lang/String;

    invoke-interface {v0, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    iget-object v3, p0, Lnb/i6;->a:Ljava/lang/String;

    invoke-interface {v0, v3, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public final d()J
    .locals 4

    iget-object v0, p0, Lnb/i6;->e:Lnb/k6;

    invoke-virtual {v0}, Lnb/k6;->p()Landroid/content/SharedPreferences;

    move-result-object v0

    iget-object v1, p0, Lnb/i6;->a:Ljava/lang/String;

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method
