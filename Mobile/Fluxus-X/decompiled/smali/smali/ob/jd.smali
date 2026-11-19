.class public final synthetic Lob/jd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/kd;


# direct methods
.method public synthetic constructor <init>(Lob/kd;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lob/jd;->a:Lob/kd;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 7

    iget-object v0, p0, Lob/jd;->a:Lob/kd;

    iget-object v1, v0, Lob/kd;->c:Lob/ld;

    iget-object v1, v1, Lob/ld;->b:Lob/qd;

    invoke-virtual {v1}, Lob/o8;->h()V

    iget-object v2, v1, Lob/o8;->a:Lob/l7;

    invoke-virtual {v2}, Lob/l7;->a()Lob/b6;

    move-result-object v3

    invoke-virtual {v3}, Lob/b6;->v()Lob/z5;

    move-result-object v3

    const-string v4, "Application going to the background"

    invoke-virtual {v3, v4}, Lob/z5;->a(Ljava/lang/String;)V

    invoke-virtual {v2}, Lob/l7;->x()Lob/p6;

    move-result-object v3

    iget-object v3, v3, Lob/p6;->t:Lob/k6;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Lob/k6;->b(Z)V

    invoke-virtual {v1, v4}, Lob/qd;->o(Z)V

    invoke-virtual {v2}, Lob/l7;->w()Lob/m;

    move-result-object v3

    invoke-virtual {v3}, Lob/m;->N()Z

    move-result v3

    if-nez v3, :cond_0

    iget-wide v3, v0, Lob/kd;->b:J

    iget-object v5, v1, Lob/qd;->f:Lob/od;

    const/4 v6, 0x0

    invoke-virtual {v5, v6, v6, v3, v4}, Lob/od;->d(ZZJ)Z

    invoke-virtual {v5, v3, v4}, Lob/od;->b(J)V

    :cond_0
    iget-wide v3, v0, Lob/kd;->a:J

    invoke-virtual {v2}, Lob/l7;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->u()Lob/z5;

    move-result-object v0

    const-string v5, "Application backgrounded at: timestamp_millis"

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v0, v5, v3}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, v1, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->B()Lob/va;

    move-result-object v1

    invoke-virtual {v1}, Lob/o8;->h()V

    iget-object v3, v1, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/g5;->j()V

    invoke-virtual {v3}, Lob/l7;->J()Lob/yc;

    move-result-object v1

    invoke-virtual {v1}, Lob/o8;->h()V

    invoke-virtual {v1}, Lob/g5;->j()V

    invoke-virtual {v1}, Lob/yc;->y()Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, v1, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->C()Lob/ff;

    move-result-object v1

    invoke-virtual {v1}, Lob/ff;->W()I

    move-result v1

    const v4, 0x3b3a8

    if-lt v1, v4, :cond_2

    :goto_0
    invoke-virtual {v3}, Lob/l7;->J()Lob/yc;

    move-result-object v1

    invoke-virtual {v1}, Lob/yc;->t()V

    :cond_2
    invoke-virtual {v2}, Lob/l7;->w()Lob/m;

    move-result-object v1

    const/4 v3, 0x0

    sget-object v4, Lob/e5;->O0:Lob/d5;

    invoke-virtual {v1, v3, v4}, Lob/m;->H(Ljava/lang/String;Lob/d5;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v2}, Lob/l7;->C()Lob/ff;

    move-result-object v1

    invoke-virtual {v2}, Lob/l7;->d()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lob/l7;->w()Lob/m;

    move-result-object v4

    invoke-virtual {v4}, Lob/m;->R()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lob/ff;->P(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-wide/16 v3, 0x3e8

    goto :goto_1

    :cond_3
    invoke-virtual {v2}, Lob/l7;->w()Lob/m;

    move-result-object v1

    invoke-virtual {v2}, Lob/l7;->d()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lob/e5;->E:Lob/d5;

    invoke-virtual {v1, v3, v4}, Lob/m;->D(Ljava/lang/String;Lob/d5;)J

    move-result-wide v3

    :goto_1
    invoke-virtual {v2}, Lob/l7;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->w()Lob/z5;

    move-result-object v1

    const-string v2, "[sgtm] Scheduling batch upload with minimum latency in millis"

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v1, v2, v5}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lob/l7;->N()Lob/cb;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Lob/cb;->o(J)V

    :cond_4
    return-void
.end method
