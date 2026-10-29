.class public interface abstract Ln0/n1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln0/n1$c;,
        Ln0/n1$a;,
        Ln0/n1$b;
    }
.end annotation


# direct methods
.method public static L(Ln0/n1;Ln0/n1;)Ln0/n1;
    .locals 3

    if-nez p0, :cond_0

    if-nez p1, :cond_0

    invoke-static {}, Ln0/c3;->i0()Ln0/c3;

    move-result-object p0

    return-object p0

    :cond_0
    if-eqz p1, :cond_1

    invoke-static {p1}, Ln0/x2;->l0(Ln0/n1;)Ln0/x2;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-static {}, Ln0/x2;->k0()Ln0/x2;

    move-result-object v0

    :goto_0
    if-eqz p0, :cond_2

    invoke-interface {p0}, Ln0/n1;->b()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln0/n1$a;

    invoke-static {v0, p1, p0, v2}, Ln0/n1;->P(Ln0/x2;Ln0/n1;Ln0/n1;Ln0/n1$a;)V

    goto :goto_1

    :cond_2
    invoke-static {v0}, Ln0/c3;->j0(Ln0/n1;)Ln0/c3;

    move-result-object p0

    return-object p0
.end method

.method public static P(Ln0/x2;Ln0/n1;Ln0/n1;Ln0/n1$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/x2;",
            "Ln0/n1;",
            "Ln0/n1;",
            "Ln0/n1$a<",
            "*>;)V"
        }
    .end annotation

    sget-object v0, Ln0/i2;->u:Ln0/n1$a;

    invoke-static {p3, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {p2, p3, v0}, Ln0/n1;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La1/c;

    invoke-interface {p1, p3, v0}, Ln0/n1;->h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La1/c;

    invoke-interface {p2, p3}, Ln0/n1;->g(Ln0/n1$a;)Ln0/n1$c;

    move-result-object p2

    invoke-static {p1, v1}, Lp0/w;->a(La1/c;La1/c;)La1/c;

    move-result-object p1

    invoke-virtual {p0, p3, p2, p1}, Ln0/x2;->D(Ln0/n1$a;Ln0/n1$c;Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-interface {p2, p3}, Ln0/n1;->g(Ln0/n1$a;)Ln0/n1$c;

    move-result-object p1

    invoke-interface {p2, p3}, Ln0/n1;->e(Ln0/n1$a;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p0, p3, p1, p2}, Ln0/x2;->D(Ln0/n1$a;Ln0/n1$c;Ljava/lang/Object;)V

    return-void
.end method

.method public static y(Ln0/n1$c;Ln0/n1$c;)Z
    .locals 1

    sget-object v0, Ln0/n1$c;->c:Ln0/n1$c;

    if-ne p0, v0, :cond_0

    if-ne p1, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public abstract a(Ln0/n1$a;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/n1$a<",
            "*>;)Z"
        }
    .end annotation
.end method

.method public abstract b()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ln0/n1$a<",
            "*>;>;"
        }
    .end annotation
.end method

.method public abstract c(Ln0/n1$a;Ln0/n1$c;)Ljava/lang/Object;
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
.end method

.method public abstract d(Ljava/lang/String;Ln0/n1$b;)V
.end method

.method public abstract e(Ln0/n1$a;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ValueT:",
            "Ljava/lang/Object;",
            ">(",
            "Ln0/n1$a<",
            "TValueT;>;)TValueT;"
        }
    .end annotation
.end method

.method public abstract f(Ln0/n1$a;)Ljava/util/Set;
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
.end method

.method public abstract g(Ln0/n1$a;)Ln0/n1$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/n1$a<",
            "*>;)",
            "Ln0/n1$c;"
        }
    .end annotation
.end method

.method public abstract h(Ln0/n1$a;Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ValueT:",
            "Ljava/lang/Object;",
            ">(",
            "Ln0/n1$a<",
            "TValueT;>;TValueT;)TValueT;"
        }
    .end annotation
.end method
