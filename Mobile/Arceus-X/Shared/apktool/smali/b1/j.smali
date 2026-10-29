.class public Lb1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/p0;


# instance fields
.field public final a:Ln0/p0;

.field public final b:Lb1/p;

.field public final c:Lb1/q;

.field public final d:Lg0/w2$c;


# direct methods
.method public constructor <init>(Ln0/p0;Lg0/w2$c;Lb1/g$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/j;->a:Ln0/p0;

    iput-object p2, p0, Lb1/j;->d:Lg0/w2$c;

    new-instance p2, Lb1/p;

    invoke-interface {p1}, Ln0/p0;->e()Ln0/l0;

    move-result-object v0

    invoke-direct {p2, v0, p3}, Lb1/p;-><init>(Ln0/l0;Lb1/g$a;)V

    iput-object p2, p0, Lb1/j;->b:Lb1/p;

    new-instance p2, Lb1/q;

    invoke-interface {p1}, Ln0/p0;->k()Ln0/o0;

    move-result-object p1

    invoke-direct {p2, p1}, Lb1/q;-><init>(Ln0/o0;)V

    iput-object p2, p0, Lb1/j;->c:Lb1/q;

    return-void
.end method


# virtual methods
.method public a()Lne/x;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation not supported by VirtualCamera."

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b()Ln0/a3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ln0/a3<",
            "Ln0/p0$a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lb1/j;->a:Ln0/p0;

    invoke-interface {v0}, Ln0/p0;->b()Ln0/a3;

    move-result-object v0

    return-object v0
.end method

.method public e()Ln0/l0;
    .locals 1

    iget-object v0, p0, Lb1/j;->b:Lb1/p;

    return-object v0
.end method

.method public g(Lg0/w2;)V
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lb1/j;->d:Lg0/w2$c;

    invoke-interface {v0, p1}, Lg0/w2$c;->g(Lg0/w2;)V

    return-void
.end method

.method public i(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lg0/w2;",
            ">;)V"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation not supported by VirtualCamera."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public j(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lg0/w2;",
            ">;)V"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation not supported by VirtualCamera."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public k()Ln0/o0;
    .locals 1

    iget-object v0, p0, Lb1/j;->c:Lb1/q;

    return-object v0
.end method

.method public m(Lg0/w2;)V
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lb1/j;->d:Lg0/w2$c;

    invoke-interface {v0, p1}, Lg0/w2$c;->m(Lg0/w2;)V

    return-void
.end method

.method public n(Lg0/w2;)V
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lb1/j;->d:Lg0/w2$c;

    invoke-interface {v0, p1}, Lg0/w2$c;->n(Lg0/w2;)V

    return-void
.end method

.method public q()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public s(Lg0/w2;)V
    .locals 1

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lb1/j;->d:Lg0/w2$c;

    invoke-interface {v0, p1}, Lg0/w2$c;->s(Lg0/w2;)V

    return-void
.end method

.method public t(I)V
    .locals 1

    iget-object v0, p0, Lb1/j;->c:Lb1/q;

    invoke-virtual {v0, p1}, Lb1/q;->B(I)V

    return-void
.end method
