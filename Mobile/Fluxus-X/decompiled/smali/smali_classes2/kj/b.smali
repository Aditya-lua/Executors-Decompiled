.class public Lkj/b;
.super Lkj/a;
.source "SourceFile"


# instance fields
.field public a:Lph/c;


# direct methods
.method public constructor <init>(Lph/c;)V
    .locals 0

    invoke-direct {p0}, Lkj/a;-><init>()V

    iput-object p1, p0, Lkj/b;->a:Lph/c;

    return-void
.end method


# virtual methods
.method public getColumnNames()[Ljava/lang/String;
    .locals 11

    const-string v9, "dev_commit"

    const-string v10, "browser_tracker_id"

    const-string v0, "channel_param"

    const-string v1, "default_channel_param"

    const-string v2, "base_url_param"

    const-string v3, "default_base_url_param"

    const-string v4, "settings_param"

    const-string v5, "user_agent_param"

    const-string v6, "default_user_agent_param"

    const-string v7, "dev_rpc_ip_port_override"

    const-string v8, "dev_branch"

    filled-new-array/range {v0 .. v10}, [Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getString(I)Ljava/lang/String;
    .locals 2

    const-string v0, "channel_param"

    invoke-virtual {p0, v0}, Landroid/database/AbstractCursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lkj/b;->a:Lph/c;

    invoke-virtual {p1}, Lph/c;->h()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "default_channel_param"

    invoke-virtual {p0, v0}, Landroid/database/AbstractCursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lkj/b;->a:Lph/c;

    invoke-virtual {p1}, Lph/c;->c()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    const-string v0, "base_url_param"

    invoke-virtual {p0, v0}, Landroid/database/AbstractCursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Lkj/b;->a:Lph/c;

    invoke-virtual {p1}, Lph/c;->a()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    const-string v0, "default_base_url_param"

    invoke-virtual {p0, v0}, Landroid/database/AbstractCursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    if-ne p1, v0, :cond_3

    iget-object p1, p0, Lkj/b;->a:Lph/c;

    invoke-virtual {p1}, Lph/c;->b()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    const-string v0, "settings_param"

    invoke-virtual {p0, v0}, Landroid/database/AbstractCursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    if-ne p1, v0, :cond_4

    iget-object p1, p0, Lkj/b;->a:Lph/c;

    invoke-virtual {p1}, Lph/c;->j()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_4
    const-string v0, "user_agent_param"

    invoke-virtual {p0, v0}, Landroid/database/AbstractCursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    if-ne p1, v0, :cond_5

    iget-object p1, p0, Lkj/b;->a:Lph/c;

    invoke-virtual {p1}, Lph/c;->k()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_5
    const-string v0, "default_user_agent_param"

    invoke-virtual {p0, v0}, Landroid/database/AbstractCursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    if-ne p1, v0, :cond_6

    iget-object p1, p0, Lkj/b;->a:Lph/c;

    invoke-virtual {p1}, Lph/c;->d()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_6
    const-string v0, "dev_rpc_ip_port_override"

    invoke-virtual {p0, v0}, Landroid/database/AbstractCursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    if-ne p1, v0, :cond_7

    iget-object p1, p0, Lkj/b;->a:Lph/c;

    invoke-virtual {p1}, Lph/c;->g()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_7
    const-string v0, "dev_branch"

    invoke-virtual {p0, v0}, Landroid/database/AbstractCursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    if-ne p1, v0, :cond_8

    iget-object p1, p0, Lkj/b;->a:Lph/c;

    invoke-virtual {p1}, Lph/c;->e()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_8
    const-string v0, "dev_commit"

    invoke-virtual {p0, v0}, Landroid/database/AbstractCursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    if-ne p1, v0, :cond_9

    iget-object p1, p0, Lkj/b;->a:Lph/c;

    invoke-virtual {p1}, Lph/c;->f()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_9
    const-string v0, "browser_tracker_id"

    invoke-virtual {p0, v0}, Landroid/database/AbstractCursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    if-ne p1, v0, :cond_a

    sget-wide v0, Lbh/a1;->u:J

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_a
    const/4 p1, 0x0

    return-object p1
.end method
