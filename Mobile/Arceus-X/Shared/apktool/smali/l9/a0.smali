.class public final Ll9/a0;
.super Ll9/t1;
.source "SourceFile"


# instance fields
.field public final f:Lw1/b;

.field public final g:Ll9/f;


# direct methods
.method public constructor <init>(Ll9/j;Ll9/f;Lj9/c;)V
    .locals 0

    invoke-direct {p0, p1, p3}, Ll9/t1;-><init>(Ll9/j;Lj9/c;)V

    new-instance p1, Lw1/b;

    invoke-direct {p1}, Lw1/b;-><init>()V

    iput-object p1, p0, Ll9/a0;->f:Lw1/b;

    iput-object p2, p0, Ll9/a0;->g:Ll9/f;

    iget-object p1, p0, Ll9/i;->a:Ll9/j;

    const-string p2, "ConnectionlessLifecycleHelper"

    invoke-interface {p1, p2, p0}, Ll9/j;->g(Ljava/lang/String;Ll9/i;)V

    return-void
.end method

.method public static u(Landroid/app/Activity;Ll9/f;Ll9/b;)V
    .locals 2

    invoke-static {p0}, Ll9/i;->c(Landroid/app/Activity;)Ll9/j;

    move-result-object p0

    const-string v0, "ConnectionlessLifecycleHelper"

    const-class v1, Ll9/a0;

    invoke-interface {p0, v0, v1}, Ll9/j;->d(Ljava/lang/String;Ljava/lang/Class;)Ll9/i;

    move-result-object v0

    check-cast v0, Ll9/a0;

    if-nez v0, :cond_0

    new-instance v0, Ll9/a0;

    invoke-static {}, Lj9/c;->o()Lj9/c;

    move-result-object v1

    invoke-direct {v0, p0, p1, v1}, Ll9/a0;-><init>(Ll9/j;Ll9/f;Lj9/c;)V

    :cond_0
    const-string p0, "ApiKey cannot be null"

    invoke-static {p2, p0}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p0, v0, Ll9/a0;->f:Lw1/b;

    invoke-virtual {p0, p2}, Lw1/b;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1, v0}, Ll9/f;->b(Ll9/a0;)V

    return-void
.end method


# virtual methods
.method public final h()V
    .locals 0

    invoke-super {p0}, Ll9/i;->h()V

    invoke-virtual {p0}, Ll9/a0;->v()V

    return-void
.end method

.method public final j()V
    .locals 0

    invoke-super {p0}, Ll9/t1;->j()V

    invoke-virtual {p0}, Ll9/a0;->v()V

    return-void
.end method

.method public final k()V
    .locals 1

    invoke-super {p0}, Ll9/t1;->k()V

    iget-object v0, p0, Ll9/a0;->g:Ll9/f;

    invoke-virtual {v0, p0}, Ll9/f;->c(Ll9/a0;)V

    return-void
.end method

.method public final m(Lcom/google/android/gms/common/ConnectionResult;I)V
    .locals 1

    iget-object v0, p0, Ll9/a0;->g:Ll9/f;

    invoke-virtual {v0, p1, p2}, Ll9/f;->H(Lcom/google/android/gms/common/ConnectionResult;I)V

    return-void
.end method

.method public final n()V
    .locals 1

    iget-object v0, p0, Ll9/a0;->g:Ll9/f;

    invoke-virtual {v0}, Ll9/f;->I()V

    return-void
.end method

.method public final t()Lw1/b;
    .locals 1

    iget-object v0, p0, Ll9/a0;->f:Lw1/b;

    return-object v0
.end method

.method public final v()V
    .locals 1

    iget-object v0, p0, Ll9/a0;->f:Lw1/b;

    invoke-virtual {v0}, Lw1/b;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll9/a0;->g:Ll9/f;

    invoke-virtual {v0, p0}, Ll9/f;->b(Ll9/a0;)V

    :cond_0
    return-void
.end method
