.class public final Lm9/a0;
.super Lm9/t1;
.source "SourceFile"


# instance fields
.field public final f:Lw1/b;

.field public final g:Lm9/f;


# direct methods
.method public constructor <init>(Lm9/j;Lm9/f;Lk9/e;)V
    .locals 0

    invoke-direct {p0, p1, p3}, Lm9/t1;-><init>(Lm9/j;Lk9/e;)V

    new-instance p1, Lw1/b;

    invoke-direct {p1}, Lw1/b;-><init>()V

    iput-object p1, p0, Lm9/a0;->f:Lw1/b;

    iput-object p2, p0, Lm9/a0;->g:Lm9/f;

    iget-object p1, p0, Lm9/i;->a:Lm9/j;

    const-string p2, "ConnectionlessLifecycleHelper"

    invoke-interface {p1, p2, p0}, Lm9/j;->f(Ljava/lang/String;Lm9/i;)V

    return-void
.end method

.method public static u(Landroid/app/Activity;Lm9/f;Lm9/b;)V
    .locals 2

    invoke-static {p0}, Lm9/i;->c(Landroid/app/Activity;)Lm9/j;

    move-result-object p0

    const-string v0, "ConnectionlessLifecycleHelper"

    const-class v1, Lm9/a0;

    invoke-interface {p0, v0, v1}, Lm9/j;->d(Ljava/lang/String;Ljava/lang/Class;)Lm9/i;

    move-result-object v0

    check-cast v0, Lm9/a0;

    if-nez v0, :cond_0

    new-instance v0, Lm9/a0;

    invoke-static {}, Lk9/e;->o()Lk9/e;

    move-result-object v1

    invoke-direct {v0, p0, p1, v1}, Lm9/a0;-><init>(Lm9/j;Lm9/f;Lk9/e;)V

    :cond_0
    const-string p0, "ApiKey cannot be null"

    invoke-static {p2, p0}, Lo9/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p0, v0, Lm9/a0;->f:Lw1/b;

    invoke-virtual {p0, p2}, Lw1/b;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1, v0}, Lm9/f;->b(Lm9/a0;)V

    return-void
.end method


# virtual methods
.method public final h()V
    .locals 0

    invoke-super {p0}, Lm9/i;->h()V

    invoke-virtual {p0}, Lm9/a0;->v()V

    return-void
.end method

.method public final j()V
    .locals 0

    invoke-super {p0}, Lm9/t1;->j()V

    invoke-virtual {p0}, Lm9/a0;->v()V

    return-void
.end method

.method public final k()V
    .locals 1

    invoke-super {p0}, Lm9/t1;->k()V

    iget-object v0, p0, Lm9/a0;->g:Lm9/f;

    invoke-virtual {v0, p0}, Lm9/f;->c(Lm9/a0;)V

    return-void
.end method

.method public final m(Lk9/b;I)V
    .locals 1

    iget-object v0, p0, Lm9/a0;->g:Lm9/f;

    invoke-virtual {v0, p1, p2}, Lm9/f;->H(Lk9/b;I)V

    return-void
.end method

.method public final n()V
    .locals 1

    iget-object v0, p0, Lm9/a0;->g:Lm9/f;

    invoke-virtual {v0}, Lm9/f;->I()V

    return-void
.end method

.method public final t()Lw1/b;
    .locals 1

    iget-object v0, p0, Lm9/a0;->f:Lw1/b;

    return-object v0
.end method

.method public final v()V
    .locals 1

    iget-object v0, p0, Lm9/a0;->f:Lw1/b;

    invoke-virtual {v0}, Lw1/b;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lm9/a0;->g:Lm9/f;

    invoke-virtual {v0, p0}, Lm9/f;->b(Lm9/a0;)V

    :cond_0
    return-void
.end method
