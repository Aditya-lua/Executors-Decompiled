.class public final Lf6/n1$b;
.super Lx4/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf6/n1;-><init>(Lx4/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx4/e<",
        "Lf6/j0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "f6/n1$b",
        "Lx4/e;",
        "Lf6/j0;",
        "",
        "b",
        "()Ljava/lang/String;",
        "Lf5/d;",
        "statement",
        "entity",
        "",
        "e",
        "(Lf5/d;Lf6/j0;)V",
        "work-runtime_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lx4/e;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lf5/d;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lf6/j0;

    invoke-virtual {p0, p1, p2}, Lf6/n1$b;->e(Lf5/d;Lf6/j0;)V

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    const-string v0, "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`backoff_on_system_interruptions` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?"

    return-object v0
.end method

.method public e(Lf5/d;Lf6/j0;)V
    .locals 5

    const-string v0, "statement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "entity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iget-object v1, p2, Lf6/j0;->a:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lf5/d;->k0(ILjava/lang/String;)V

    iget-object v0, p2, Lf6/j0;->b:Lx5/o0$c;

    invoke-static {v0}, Lf6/v1;->k(Lx5/o0$c;)I

    move-result v0

    const/4 v1, 0x2

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lf5/d;->z(IJ)V

    const/4 v0, 0x3

    iget-object v1, p2, Lf6/j0;->c:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lf5/d;->k0(ILjava/lang/String;)V

    const/4 v0, 0x4

    iget-object v1, p2, Lf6/j0;->d:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lf5/d;->k0(ILjava/lang/String;)V

    sget-object v0, Landroidx/work/b;->b:Landroidx/work/b$b;

    iget-object v1, p2, Lf6/j0;->e:Landroidx/work/b;

    invoke-virtual {v0, v1}, Landroidx/work/b$b;->e(Landroidx/work/b;)[B

    move-result-object v1

    const/4 v2, 0x5

    invoke-interface {p1, v2, v1}, Lf5/d;->A(I[B)V

    iget-object v1, p2, Lf6/j0;->f:Landroidx/work/b;

    invoke-virtual {v0, v1}, Landroidx/work/b$b;->e(Landroidx/work/b;)[B

    move-result-object v0

    const/4 v1, 0x6

    invoke-interface {p1, v1, v0}, Lf5/d;->A(I[B)V

    const/4 v0, 0x7

    iget-wide v1, p2, Lf6/j0;->g:J

    invoke-interface {p1, v0, v1, v2}, Lf5/d;->z(IJ)V

    const/16 v0, 0x8

    iget-wide v1, p2, Lf6/j0;->h:J

    invoke-interface {p1, v0, v1, v2}, Lf5/d;->z(IJ)V

    const/16 v0, 0x9

    iget-wide v1, p2, Lf6/j0;->i:J

    invoke-interface {p1, v0, v1, v2}, Lf5/d;->z(IJ)V

    iget v0, p2, Lf6/j0;->k:I

    int-to-long v0, v0

    const/16 v2, 0xa

    invoke-interface {p1, v2, v0, v1}, Lf5/d;->z(IJ)V

    iget-object v0, p2, Lf6/j0;->l:Lx5/a;

    invoke-static {v0}, Lf6/v1;->a(Lx5/a;)I

    move-result v0

    const/16 v1, 0xb

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lf5/d;->z(IJ)V

    const/16 v0, 0xc

    iget-wide v1, p2, Lf6/j0;->m:J

    invoke-interface {p1, v0, v1, v2}, Lf5/d;->z(IJ)V

    const/16 v0, 0xd

    iget-wide v1, p2, Lf6/j0;->n:J

    invoke-interface {p1, v0, v1, v2}, Lf5/d;->z(IJ)V

    const/16 v0, 0xe

    iget-wide v1, p2, Lf6/j0;->o:J

    invoke-interface {p1, v0, v1, v2}, Lf5/d;->z(IJ)V

    const/16 v0, 0xf

    iget-wide v1, p2, Lf6/j0;->p:J

    invoke-interface {p1, v0, v1, v2}, Lf5/d;->z(IJ)V

    iget-boolean v0, p2, Lf6/j0;->q:Z

    const/16 v1, 0x10

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lf5/d;->z(IJ)V

    iget-object v0, p2, Lf6/j0;->r:Lx5/f0;

    invoke-static {v0}, Lf6/v1;->i(Lx5/f0;)I

    move-result v0

    const/16 v1, 0x11

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lf5/d;->z(IJ)V

    invoke-virtual {p2}, Lf6/j0;->j()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x12

    invoke-interface {p1, v2, v0, v1}, Lf5/d;->z(IJ)V

    invoke-virtual {p2}, Lf6/j0;->g()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x13

    invoke-interface {p1, v2, v0, v1}, Lf5/d;->z(IJ)V

    const/16 v0, 0x14

    invoke-virtual {p2}, Lf6/j0;->h()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lf5/d;->z(IJ)V

    invoke-virtual {p2}, Lf6/j0;->i()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x15

    invoke-interface {p1, v2, v0, v1}, Lf5/d;->z(IJ)V

    invoke-virtual {p2}, Lf6/j0;->k()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x16

    invoke-interface {p1, v2, v0, v1}, Lf5/d;->z(IJ)V

    invoke-virtual {p2}, Lf6/j0;->l()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x17

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Lf5/d;->C(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1, v0}, Lf5/d;->k0(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, Lf6/j0;->f()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    const/16 v1, 0x18

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, Lf5/d;->C(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lf5/d;->z(IJ)V

    :goto_2
    iget-object v0, p2, Lf6/j0;->j:Lx5/d;

    invoke-virtual {v0}, Lx5/d;->f()Lx5/x;

    move-result-object v1

    invoke-static {v1}, Lf6/v1;->h(Lx5/x;)I

    move-result v1

    const/16 v2, 0x19

    int-to-long v3, v1

    invoke-interface {p1, v2, v3, v4}, Lf5/d;->z(IJ)V

    invoke-virtual {v0}, Lx5/d;->e()Lg6/s;

    move-result-object v1

    invoke-static {v1}, Lf6/v1;->c(Lg6/s;)[B

    move-result-object v1

    const/16 v2, 0x1a

    invoke-interface {p1, v2, v1}, Lf5/d;->A(I[B)V

    invoke-virtual {v0}, Lx5/d;->i()Z

    move-result v1

    const/16 v2, 0x1b

    int-to-long v3, v1

    invoke-interface {p1, v2, v3, v4}, Lf5/d;->z(IJ)V

    invoke-virtual {v0}, Lx5/d;->j()Z

    move-result v1

    const/16 v2, 0x1c

    int-to-long v3, v1

    invoke-interface {p1, v2, v3, v4}, Lf5/d;->z(IJ)V

    invoke-virtual {v0}, Lx5/d;->h()Z

    move-result v1

    const/16 v2, 0x1d

    int-to-long v3, v1

    invoke-interface {p1, v2, v3, v4}, Lf5/d;->z(IJ)V

    invoke-virtual {v0}, Lx5/d;->k()Z

    move-result v1

    const/16 v2, 0x1e

    int-to-long v3, v1

    invoke-interface {p1, v2, v3, v4}, Lf5/d;->z(IJ)V

    const/16 v1, 0x1f

    invoke-virtual {v0}, Lx5/d;->b()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Lf5/d;->z(IJ)V

    const/16 v1, 0x20

    invoke-virtual {v0}, Lx5/d;->a()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Lf5/d;->z(IJ)V

    invoke-virtual {v0}, Lx5/d;->c()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Lf6/v1;->j(Ljava/util/Set;)[B

    move-result-object v0

    const/16 v1, 0x21

    invoke-interface {p1, v1, v0}, Lf5/d;->A(I[B)V

    const/16 v0, 0x22

    iget-object p2, p2, Lf6/j0;->a:Ljava/lang/String;

    invoke-interface {p1, v0, p2}, Lf5/d;->k0(ILjava/lang/String;)V

    return-void
.end method
