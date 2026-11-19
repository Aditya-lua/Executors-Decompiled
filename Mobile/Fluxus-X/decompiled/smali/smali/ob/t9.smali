.class public final Lob/t9;
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

    iput-object p2, p0, Lob/t9;->a:Landroid/os/Bundle;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/t9;->b:Lob/va;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 19

    move-object/from16 v0, p0

    const-string v1, "creation_timestamp"

    const-string v2, "app_id"

    iget-object v3, v0, Lob/t9;->b:Lob/va;

    invoke-virtual {v3}, Lob/o8;->h()V

    invoke-virtual {v3}, Lob/g5;->j()V

    iget-object v4, v0, Lob/t9;->a:Landroid/os/Bundle;

    invoke-static {v4}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "name"

    invoke-virtual {v4, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lo9/s;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iget-object v5, v3, Lob/o8;->a:Lob/l7;

    invoke-virtual {v5}, Lob/l7;->g()Z

    move-result v5

    if-nez v5, :cond_0

    iget-object v1, v3, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->w()Lob/z5;

    move-result-object v1

    const-string v2, "Conditional property not cleared since app measurement is disabled"

    invoke-virtual {v1, v2}, Lob/z5;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v6, Lob/bf;

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const-string v11, ""

    invoke-direct/range {v6 .. v11}, Lob/bf;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v5, v3, Lob/o8;->a:Lob/l7;

    invoke-virtual {v5}, Lob/l7;->C()Lob/ff;

    move-result-object v7

    invoke-virtual {v4, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v5, "expired_event_name"

    invoke-virtual {v4, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v5, "expired_event_params"

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v10

    const-string v11, ""

    invoke-virtual {v4, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v12

    const/4 v14, 0x1

    const/4 v15, 0x1

    invoke-virtual/range {v7 .. v15}, Lob/ff;->R(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZZ)Lob/i0;

    move-result-object v18
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v5, Lob/i;

    invoke-virtual {v4, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v8

    const-string v1, "active"

    invoke-virtual {v4, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v10

    const-string v1, "trigger_event_name"

    invoke-virtual {v4, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v1, "trigger_timeout"

    invoke-virtual {v4, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v13

    const-string v1, "time_to_live"

    invoke-virtual {v4, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v16

    const/4 v12, 0x0

    const/4 v15, 0x0

    move-object v7, v6

    const-string v6, ""

    move-object v4, v5

    move-object v5, v2

    invoke-direct/range {v4 .. v18}, Lob/i;-><init>(Ljava/lang/String;Ljava/lang/String;Lob/bf;JZLjava/lang/String;Lob/i0;JLob/i0;JLob/i0;)V

    iget-object v1, v3, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->J()Lob/yc;

    move-result-object v1

    invoke-virtual {v1, v4}, Lob/yc;->d0(Lob/i;)V

    :catch_0
    return-void
.end method
