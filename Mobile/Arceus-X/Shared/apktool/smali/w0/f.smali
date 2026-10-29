.class public final Lw0/f;
.super Lw0/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lw0/a<",
        "Landroidx/camera/core/d;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(ILw0/c$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lw0/c$a<",
            "Landroidx/camera/core/d;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lw0/a;-><init>(ILw0/c$a;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroidx/camera/core/d;

    invoke-virtual {p0, p1}, Lw0/f;->c(Landroidx/camera/core/d;)V

    return-void
.end method

.method public c(Landroidx/camera/core/d;)V
    .locals 1

    invoke-interface {p1}, Landroidx/camera/core/d;->H2()Lg0/i1;

    move-result-object v0

    invoke-virtual {p0, v0}, Lw0/f;->d(Lg0/i1;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Lw0/a;->b(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lw0/a;->d:Lw0/c$a;

    invoke-interface {v0, p1}, Lw0/c$a;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public final d(Lg0/i1;)Z
    .locals 3

    invoke-static {p1}, Ln0/f0;->a(Lg0/i1;)Ln0/e0;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-interface {p1}, Ln0/e0;->g()Ln0/a0;

    move-result-object v1

    sget-object v2, Ln0/a0;->f:Ln0/a0;

    if-eq v1, v2, :cond_1

    invoke-interface {p1}, Ln0/e0;->g()Ln0/a0;

    move-result-object v1

    sget-object v2, Ln0/a0;->d:Ln0/a0;

    if-eq v1, v2, :cond_1

    return v0

    :cond_1
    invoke-interface {p1}, Ln0/e0;->j()Ln0/y;

    move-result-object v1

    sget-object v2, Ln0/y;->e:Ln0/y;

    if-eq v1, v2, :cond_2

    return v0

    :cond_2
    invoke-interface {p1}, Ln0/e0;->h()Ln0/c0;

    move-result-object p1

    sget-object v1, Ln0/c0;->d:Ln0/c0;

    if-eq p1, v1, :cond_3

    return v0

    :cond_3
    const/4 p1, 0x1

    return p1
.end method
