.class public Landroidx/lifecycle/a0$c;
.super Landroidx/lifecycle/a0$d;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/lifecycle/a0<",
        "TT;>.d;",
        "Landroidx/lifecycle/p;"
    }
.end annotation


# instance fields
.field public final e:Landroidx/lifecycle/s;

.field public final synthetic f:Landroidx/lifecycle/a0;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/a0;Landroidx/lifecycle/s;Landroidx/lifecycle/e0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/s;",
            "Landroidx/lifecycle/e0<",
            "-TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/lifecycle/a0$c;->f:Landroidx/lifecycle/a0;

    invoke-direct {p0, p1, p3}, Landroidx/lifecycle/a0$d;-><init>(Landroidx/lifecycle/a0;Landroidx/lifecycle/e0;)V

    iput-object p2, p0, Landroidx/lifecycle/a0$c;->e:Landroidx/lifecycle/s;

    return-void
.end method


# virtual methods
.method public b()V
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/a0$c;->e:Landroidx/lifecycle/s;

    invoke-interface {v0}, Landroidx/lifecycle/s;->a()Landroidx/lifecycle/l;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroidx/lifecycle/l;->d(Landroidx/lifecycle/r;)V

    return-void
.end method

.method public c(Landroidx/lifecycle/s;)Z
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/a0$c;->e:Landroidx/lifecycle/s;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public d()Z
    .locals 2

    iget-object v0, p0, Landroidx/lifecycle/a0$c;->e:Landroidx/lifecycle/s;

    invoke-interface {v0}, Landroidx/lifecycle/s;->a()Landroidx/lifecycle/l;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/l;->b()Landroidx/lifecycle/l$b;

    move-result-object v0

    sget-object v1, Landroidx/lifecycle/l$b;->d:Landroidx/lifecycle/l$b;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/l$b;->b(Landroidx/lifecycle/l$b;)Z

    move-result v0

    return v0
.end method

.method public g(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V
    .locals 1

    iget-object p1, p0, Landroidx/lifecycle/a0$c;->e:Landroidx/lifecycle/s;

    invoke-interface {p1}, Landroidx/lifecycle/s;->a()Landroidx/lifecycle/l;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/l;->b()Landroidx/lifecycle/l$b;

    move-result-object p1

    sget-object p2, Landroidx/lifecycle/l$b;->a:Landroidx/lifecycle/l$b;

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Landroidx/lifecycle/a0$c;->f:Landroidx/lifecycle/a0;

    iget-object p2, p0, Landroidx/lifecycle/a0$d;->a:Landroidx/lifecycle/e0;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/a0;->n(Landroidx/lifecycle/e0;)V

    return-void

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eq p2, p1, :cond_1

    invoke-virtual {p0}, Landroidx/lifecycle/a0$c;->d()Z

    move-result p2

    invoke-virtual {p0, p2}, Landroidx/lifecycle/a0$d;->a(Z)V

    iget-object p2, p0, Landroidx/lifecycle/a0$c;->e:Landroidx/lifecycle/s;

    invoke-interface {p2}, Landroidx/lifecycle/s;->a()Landroidx/lifecycle/l;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/lifecycle/l;->b()Landroidx/lifecycle/l$b;

    move-result-object p2

    move-object v0, p2

    move-object p2, p1

    move-object p1, v0

    goto :goto_0

    :cond_1
    return-void
.end method
