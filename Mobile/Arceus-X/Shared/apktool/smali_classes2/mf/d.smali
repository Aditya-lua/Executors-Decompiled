.class public interface abstract Lmf/d;
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

    invoke-static {p1}, Lmf/e0;->b(Ljava/lang/Class;)Lmf/e0;

    move-result-object p1

    invoke-interface {p0, p1}, Lmf/d;->f(Lmf/e0;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Lmf/e0;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lmf/e0<",
            "TT;>;)",
            "Ljava/util/Set<",
            "TT;>;"
        }
    .end annotation

    invoke-interface {p0, p1}, Lmf/d;->e(Lmf/e0;)Lyf/b;

    move-result-object p1

    invoke-interface {p1}, Lyf/b;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    return-object p1
.end method

.method public abstract c(Lmf/e0;)Lyf/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lmf/e0<",
            "TT;>;)",
            "Lyf/b<",
            "TT;>;"
        }
    .end annotation
.end method

.method public d(Ljava/lang/Class;)Ljava/util/Set;
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

    invoke-static {p1}, Lmf/e0;->b(Ljava/lang/Class;)Lmf/e0;

    move-result-object p1

    invoke-interface {p0, p1}, Lmf/d;->b(Lmf/e0;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public abstract e(Lmf/e0;)Lyf/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lmf/e0<",
            "TT;>;)",
            "Lyf/b<",
            "Ljava/util/Set<",
            "TT;>;>;"
        }
    .end annotation
.end method

.method public f(Lmf/e0;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lmf/e0<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-interface {p0, p1}, Lmf/d;->c(Lmf/e0;)Lyf/b;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-interface {p1}, Lyf/b;->get()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public g(Ljava/lang/Class;)Lyf/b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lyf/b<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Lmf/e0;->b(Ljava/lang/Class;)Lmf/e0;

    move-result-object p1

    invoke-interface {p0, p1}, Lmf/d;->c(Lmf/e0;)Lyf/b;

    move-result-object p1

    return-object p1
.end method
