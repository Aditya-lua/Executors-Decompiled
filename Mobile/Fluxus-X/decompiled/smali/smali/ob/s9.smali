.class public final Lob/s9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/os/Bundle;

.field public final synthetic b:Lob/va;


# direct methods
.method public constructor <init>(Lob/va;Landroid/os/Bundle;)V
    .locals 0

    iput-object p2, p0, Lob/s9;->a:Landroid/os/Bundle;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/s9;->b:Lob/va;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 24

    move-object/from16 v0, p0

    const-string v1, "app_id"

    iget-object v2, v0, Lob/s9;->b:Lob/va;

    invoke-virtual {v2}, Lob/o8;->h()V

    invoke-virtual {v2}, Lob/g5;->j()V

    iget-object v3, v0, Lob/s9;->a:Landroid/os/Bundle;

    invoke-static {v3}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "name"

    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v4, "origin"

    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v6}, Lo9/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {v11}, Lo9/s;->f(Ljava/lang/String;)Ljava/lang/String;

    const-string v4, "value"

    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v5, v2, Lob/o8;->a:Lob/l7;

    invoke-virtual {v5}, Lob/l7;->g()Z

    move-result v5

    if-nez v5, :cond_0

    iget-object v1, v2, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->w()Lob/z5;

    move-result-object v1

    const-string v2, "Conditional property not set since app measurement is disabled"

    invoke-virtual {v1, v2}, Lob/z5;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v5, Lob/bf;

    const-string v7, "triggered_timestamp"

    invoke-virtual {v3, v7}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v7

    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    move-object v10, v11

    invoke-direct/range {v5 .. v10}, Lob/bf;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v4, v2, Lob/o8;->a:Lob/l7;

    invoke-virtual {v4}, Lob/l7;->C()Lob/ff;

    move-result-object v7

    invoke-virtual {v3, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v6, "triggered_event_name"

    invoke-virtual {v3, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v6, "triggered_event_params"

    invoke-virtual {v3, v6}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v10

    const/4 v14, 0x1

    const/4 v15, 0x1

    const-wide/16 v12, 0x0

    invoke-virtual/range {v7 .. v15}, Lob/ff;->R(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZZ)Lob/i0;

    move-result-object v18

    invoke-virtual {v4}, Lob/l7;->C()Lob/ff;

    move-result-object v7

    invoke-virtual {v3, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v6, "timed_out_event_name"

    invoke-virtual {v3, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v6, "timed_out_event_params"

    invoke-virtual {v3, v6}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v10

    const/4 v14, 0x1

    const/4 v15, 0x1

    const-wide/16 v12, 0x0

    invoke-virtual/range {v7 .. v15}, Lob/ff;->R(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZZ)Lob/i0;

    move-result-object v6

    invoke-virtual {v4}, Lob/l7;->C()Lob/ff;

    move-result-object v7

    invoke-virtual {v3, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v4, "expired_event_name"

    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v4, "expired_event_params"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v10

    const/4 v14, 0x1

    const/4 v15, 0x1

    const-wide/16 v12, 0x0

    invoke-virtual/range {v7 .. v15}, Lob/ff;->R(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZZ)Lob/i0;

    move-result-object v21
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v7, Lob/i;

    invoke-virtual {v3, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v1, "creation_timestamp"

    invoke-virtual {v3, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v9

    const-string v1, "trigger_event_name"

    invoke-virtual {v3, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const-string v1, "trigger_timeout"

    invoke-virtual {v3, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v16

    const-string v1, "time_to_live"

    invoke-virtual {v3, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v19

    const/4 v13, 0x0

    move-wide/from16 v22, v9

    move-object v9, v11

    move-wide/from16 v11, v22

    move-object v10, v5

    move-object v15, v6

    invoke-direct/range {v7 .. v21}, Lob/i;-><init>(Ljava/lang/String;Ljava/lang/String;Lob/bf;JZLjava/lang/String;Lob/i0;JLob/i0;JLob/i0;)V

    iget-object v1, v2, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->J()Lob/yc;

    move-result-object v1

    invoke-virtual {v1, v7}, Lob/yc;->d0(Lob/i;)V

    :catch_0
    return-void
.end method
