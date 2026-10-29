.class public final synthetic Lnb/ed;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnb/fd;


# direct methods
.method public synthetic constructor <init>(Lnb/fd;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb/ed;->a:Lnb/fd;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 7

    iget-object v0, p0, Lnb/ed;->a:Lnb/fd;

    iget-object v1, v0, Lnb/fd;->c:Lnb/gd;

    iget-object v1, v1, Lnb/gd;->b:Lnb/ld;

    invoke-virtual {v1}, Lnb/j8;->h()V

    iget-object v2, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->a()Lnb/w5;

    move-result-object v3

    invoke-virtual {v3}, Lnb/w5;->v()Lnb/u5;

    move-result-object v3

    const-string v4, "Application going to the background"

    invoke-virtual {v3, v4}, Lnb/u5;->a(Ljava/lang/String;)V

    invoke-virtual {v2}, Lnb/g7;->x()Lnb/k6;

    move-result-object v3

    iget-object v3, v3, Lnb/k6;->t:Lnb/f6;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Lnb/f6;->b(Z)V

    invoke-virtual {v1, v4}, Lnb/ld;->o(Z)V

    invoke-virtual {v2}, Lnb/g7;->w()Lnb/k;

    move-result-object v3

    invoke-virtual {v3}, Lnb/k;->N()Z

    move-result v3

    if-nez v3, :cond_0

    iget-wide v3, v0, Lnb/fd;->b:J

    iget-object v5, v1, Lnb/ld;->f:Lnb/jd;

    const/4 v6, 0x0

    invoke-virtual {v5, v6, v6, v3, v4}, Lnb/jd;->d(ZZJ)Z

    invoke-virtual {v5, v3, v4}, Lnb/jd;->b(J)V

    :cond_0
    iget-wide v3, v0, Lnb/fd;->a:J

    invoke-virtual {v2}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->u()Lnb/u5;

    move-result-object v0

    const-string v5, "Application backgrounded at: timestamp_millis"

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v0, v5, v3}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->B()Lnb/qa;

    move-result-object v1

    invoke-virtual {v1}, Lnb/j8;->h()V

    iget-object v3, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/b5;->j()V

    invoke-virtual {v3}, Lnb/g7;->J()Lnb/tc;

    move-result-object v1

    invoke-virtual {v1}, Lnb/j8;->h()V

    invoke-virtual {v1}, Lnb/b5;->j()V

    invoke-virtual {v1}, Lnb/tc;->y()Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->C()Lnb/ve;

    move-result-object v1

    invoke-virtual {v1}, Lnb/ve;->W()I

    move-result v1

    const v4, 0x3b3a8

    if-lt v1, v4, :cond_2

    :goto_0
    invoke-virtual {v3}, Lnb/g7;->J()Lnb/tc;

    move-result-object v1

    invoke-virtual {v1}, Lnb/tc;->t()V

    :cond_2
    invoke-virtual {v2}, Lnb/g7;->w()Lnb/k;

    move-result-object v1

    const/4 v3, 0x0

    sget-object v4, Lnb/z4;->O0:Lnb/y4;

    invoke-virtual {v1, v3, v4}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v2}, Lnb/g7;->C()Lnb/ve;

    move-result-object v1

    invoke-virtual {v2}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lnb/g7;->w()Lnb/k;

    move-result-object v4

    invoke-virtual {v4}, Lnb/k;->R()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lnb/ve;->P(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-wide/16 v3, 0x3e8

    goto :goto_1

    :cond_3
    invoke-virtual {v2}, Lnb/g7;->w()Lnb/k;

    move-result-object v1

    invoke-virtual {v2}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lnb/z4;->E:Lnb/y4;

    invoke-virtual {v1, v3, v4}, Lnb/k;->D(Ljava/lang/String;Lnb/y4;)J

    move-result-wide v3

    :goto_1
    invoke-virtual {v2}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->w()Lnb/u5;

    move-result-object v1

    const-string v2, "[sgtm] Scheduling batch upload with minimum latency in millis"

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v1, v2, v5}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lnb/g7;->N()Lnb/xa;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Lnb/xa;->o(J)V

    :cond_4
    return-void
.end method
