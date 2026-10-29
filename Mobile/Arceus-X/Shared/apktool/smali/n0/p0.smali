.class public interface abstract Ln0/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/l;
.implements Lg0/w2$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln0/p0$a;
    }
.end annotation


# virtual methods
.method public abstract a()Lne/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lne/x<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b()Ln0/a3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ln0/a3<",
            "Ln0/p0$a;",
            ">;"
        }
    .end annotation
.end method

.method public c()Lg0/m;
    .locals 1

    invoke-interface {p0}, Ln0/p0;->e()Ln0/l0;

    move-result-object v0

    return-object v0
.end method

.method public d()Lg0/t;
    .locals 1

    invoke-interface {p0}, Ln0/p0;->k()Ln0/o0;

    move-result-object v0

    return-object v0
.end method

.method public abstract e()Ln0/l0;
.end method

.method public f()Ln0/h0;
    .locals 1

    invoke-static {}, Ln0/k0;->a()Ln0/h0;

    move-result-object v0

    return-object v0
.end method

.method public h(Z)V
    .locals 0

    return-void
.end method

.method public abstract i(Ljava/util/Collection;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lg0/w2;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract j(Ljava/util/Collection;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lg0/w2;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract k()Ln0/o0;
.end method

.method public l()Z
    .locals 1

    invoke-interface {p0}, Ln0/p0;->d()Lg0/t;

    move-result-object v0

    invoke-interface {v0}, Lg0/t;->i()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public o(Ln0/h0;)V
    .locals 0

    return-void
.end method

.method public p()V
    .locals 0

    return-void
.end method

.method public q()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public r(Z)V
    .locals 0

    return-void
.end method
