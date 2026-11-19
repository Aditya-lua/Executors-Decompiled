.class public interface abstract Lof/d;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public a(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-static {p1}, Lof/e0;->b(Ljava/lang/Class;)Lof/e0;

    move-result-object p1

    invoke-interface {p0, p1}, Lof/d;->f(Lof/e0;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract b(Lof/e0;)Lag/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lof/e0<",
            "TT;>;)",
            "Lag/b<",
            "Ljava/util/Set<",
            "TT;>;>;"
        }
    .end annotation
.end method

.method public c(Ljava/lang/Class;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Lof/e0;->b(Ljava/lang/Class;)Lof/e0;

    move-result-object p1

    invoke-interface {p0, p1}, Lof/d;->e(Lof/e0;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/lang/Class;)Lag/b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lag/b<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Lof/e0;->b(Ljava/lang/Class;)Lof/e0;

    move-result-object p1

    invoke-interface {p0, p1}, Lof/d;->g(Lof/e0;)Lag/b;

    move-result-object p1

    return-object p1
.end method

.method public e(Lof/e0;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lof/e0<",
            "TT;>;)",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    invoke-interface {p0, p1}, Lof/d;->b(Lof/e0;)Lag/b;

    move-result-object p1

    invoke-interface {p1}, Lag/b;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    return-object p1
.end method

.method public f(Lof/e0;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lof/e0<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-interface {p0, p1}, Lof/d;->g(Lof/e0;)Lag/b;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-interface {p1}, Lag/b;->get()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract g(Lof/e0;)Lag/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lof/e0<",
            "TT;>;)",
            "Lag/b<",
            "TT;>;"
        }
    .end annotation
.end method
