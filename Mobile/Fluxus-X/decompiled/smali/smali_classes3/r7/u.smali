.class public Lr7/u;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Ls7/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "k"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ls7/c$a;->a([Ljava/lang/String;)Ls7/c$a;

    move-result-object v0

    sput-object v0, Lr7/u;->a:Ls7/c$a;

    return-void
.end method

.method public static a(Ls7/c;Lg7/i;FLr7/n0;Z)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ls7/c;",
            "Lg7/i;",
            "F",
            "Lr7/n0<",
            "TT;>;Z)",
            "Ljava/util/List<",
            "Lu7/a<",
            "TT;>;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Ls7/c;->p()Ls7/c$b;

    move-result-object v1

    sget-object v2, Ls7/c$b;->f:Ls7/c$b;

    if-ne v1, v2, :cond_0

    const-string p0, "Lottie doesn\'t support expressions."

    invoke-virtual {p1, p0}, Lg7/i;->a(Ljava/lang/String;)V

    return-object v0

    :cond_0
    invoke-virtual {p0}, Ls7/c;->c()V

    :goto_0
    invoke-virtual {p0}, Ls7/c;->f()Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v1, Lr7/u;->a:Ls7/c$a;

    invoke-virtual {p0, v1}, Ls7/c;->s(Ls7/c$a;)I

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Ls7/c;->w()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ls7/c;->p()Ls7/c$b;

    move-result-object v1

    sget-object v2, Ls7/c$b;->a:Ls7/c$b;

    if-ne v1, v2, :cond_4

    invoke-virtual {p0}, Ls7/c;->b()V

    invoke-virtual {p0}, Ls7/c;->p()Ls7/c$b;

    move-result-object v1

    sget-object v2, Ls7/c$b;->g:Ls7/c$b;

    if-ne v1, v2, :cond_2

    const/4 v7, 0x0

    move-object v3, p0

    move-object v4, p1

    move v5, p2

    move-object v6, p3

    move v8, p4

    invoke-static/range {v3 .. v8}, Lr7/t;->c(Ls7/c;Lg7/i;FLr7/n0;ZZ)Lu7/a;

    move-result-object p0

    move-object v1, v3

    move-object v2, v4

    move v3, v5

    move-object v4, v6

    move v6, v8

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v6, p4

    :goto_1
    invoke-virtual {v1}, Ls7/c;->f()Z

    move-result p0

    if-eqz p0, :cond_3

    const/4 v5, 0x1

    invoke-static/range {v1 .. v6}, Lr7/t;->c(Ls7/c;Lg7/i;FLr7/n0;ZZ)Lu7/a;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    :goto_2
    invoke-virtual {v1}, Ls7/c;->d()V

    move-object p0, v1

    move-object p1, v2

    move p2, v3

    move-object p3, v4

    move p4, v6

    goto :goto_0

    :cond_4
    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v6, p4

    const/4 v5, 0x0

    invoke-static/range {v1 .. v6}, Lr7/t;->c(Ls7/c;Lg7/i;FLr7/n0;ZZ)Lu7/a;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object p0, v1

    goto :goto_0

    :cond_5
    move-object v1, p0

    invoke-virtual {v1}, Ls7/c;->e()V

    invoke-static {v0}, Lr7/u;->b(Ljava/util/List;)V

    return-object v0
.end method

.method public static b(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+",
            "Lu7/a<",
            "TT;>;>;)V"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    const/4 v2, 0x1

    add-int/lit8 v3, v0, -0x1

    if-ge v1, v3, :cond_1

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lu7/a;

    add-int/lit8 v1, v1, 0x1

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu7/a;

    iget v4, v3, Lu7/a;->g:F

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    iput-object v4, v2, Lu7/a;->h:Ljava/lang/Float;

    iget-object v4, v2, Lu7/a;->c:Ljava/lang/Object;

    if-nez v4, :cond_0

    iget-object v3, v3, Lu7/a;->b:Ljava/lang/Object;

    if-eqz v3, :cond_0

    iput-object v3, v2, Lu7/a;->c:Ljava/lang/Object;

    instance-of v3, v2, Lj7/i;

    if-eqz v3, :cond_0

    check-cast v2, Lj7/i;

    invoke-virtual {v2}, Lj7/i;->j()V

    goto :goto_0

    :cond_1
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu7/a;

    iget-object v1, v0, Lu7/a;->b:Ljava/lang/Object;

    if-eqz v1, :cond_2

    iget-object v1, v0, Lu7/a;->c:Ljava/lang/Object;

    if-nez v1, :cond_3

    :cond_2
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    if-le v1, v2, :cond_3

    invoke-interface {p0, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_3
    return-void
.end method
