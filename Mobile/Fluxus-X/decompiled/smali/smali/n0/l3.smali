.class public interface abstract Ln0/l3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/n1;


# virtual methods
.method public a(Ln0/n1$a;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/n1$a<",
            "*>;)Z"
        }
    .end annotation

    invoke-interface {p0}, Ln0/l3;->n()Ln0/n1;

    move-result-object v0

    invoke-interface {v0, p1}, Ln0/n1;->a(Ln0/n1$a;)Z

    move-result p1

    return p1
.end method

.method public b()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ln0/n1$a<",
            "*>;>;"
        }
    .end annotation

    invoke-interface {p0}, Ln0/l3;->n()Ln0/n1;

    move-result-object v0

    invoke-interface {v0}, Ln0/n1;->b()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public c(Ln0/n1$a;Ln0/n1$c;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ValueT:",
            "Ljava/lang/Object;",
            ">(",
            "Ln0/n1$a<",
            "TValueT;>;",
            "Ln0/n1$c;",
            ")TValueT;"
        }
    .end annotation

    invoke-interface {p0}, Ln0/l3;->n()Ln0/n1;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ln0/n1;->c(Ln0/n1$a;Ln0/n1$c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/lang/String;Ln0/n1$b;)V
    .locals 1

    invoke-interface {p0}, Ln0/l3;->n()Ln0/n1;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ln0/n1;->d(Ljava/lang/String;Ln0/n1$b;)V

    return-void
.end method

.method public e(Ln0/n1$a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ValueT:",
            "Ljava/lang/Object;",
            ">(",
            "Ln0/n1$a<",
            "TValueT;>;)TValueT;"
        }
    .end annotation

    invoke-interface {p0}, Ln0/l3;->n()Ln0/n1;

    move-result-object v0

    invoke-interface {v0, p1}, Ln0/n1;->e(Ln0/n1$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public f(Ln0/n1$a;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/n1$a<",
            "*>;)",
            "Ljava/util/Set<",
            "Ln0/n1$c;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, Ln0/l3;->n()Ln0/n1;

    move-result-object v0

    invoke-interface {v0, p1}, Ln0/n1;->f(Ln0/n1$a;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public g(Ln0/n1$a;)Ln0/n1$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/n1$a<",
            "*>;)",
            "Ln0/n1$c;"
        }
    .end annotation

    invoke-interface {p0}, Ln0/l3;->n()Ln0/n1;

    move-result-object v0

    invoke-interface {v0, p1}, Ln0/n1;->g(Ln0/n1$a;)Ln0/n1$c;

    move-result-object p1

    return-object p1
.end method

.method public h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ValueT:",
            "Ljava/lang/Object;",
            ">(",
            "Ln0/n1$a<",
            "TValueT;>;TValueT;)TValueT;"
        }
    .end annotation

    invoke-interface {p0}, Ln0/l3;->n()Ln0/n1;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ln0/n1;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract n()Ln0/n1;
.end method
