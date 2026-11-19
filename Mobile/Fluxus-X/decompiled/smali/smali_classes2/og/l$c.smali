.class public abstract Log/l$c;
.super Llg/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Log/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "A:",
        "Ljava/lang/Object;",
        ">",
        "Llg/a0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Log/l$f;


# direct methods
.method public constructor <init>(Log/l$f;)V
    .locals 0

    invoke-direct {p0}, Llg/a0;-><init>()V

    iput-object p1, p0, Log/l$c;->a:Log/l$f;

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TA;"
        }
    .end annotation
.end method

.method public abstract b(Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;)TT;"
        }
    .end annotation
.end method

.method public abstract c(Ljava/lang/Object;Ltg/a;Log/l$d;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;",
            "Ltg/a;",
            "Log/l$d;",
            ")V"
        }
    .end annotation
.end method

.method public read(Ltg/a;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltg/a;",
            ")TT;"
        }
    .end annotation

    invoke-virtual {p1}, Ltg/a;->Q()Ltg/b;

    move-result-object v0

    sget-object v1, Ltg/b;->i:Ltg/b;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Ltg/a;->K()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p0}, Log/l$c;->a()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Log/l$c;->a:Log/l$f;

    iget-object v1, v1, Log/l$f;->a:Ljava/util/Map;

    :try_start_0
    invoke-virtual {p1}, Ltg/a;->c()V

    :goto_0
    invoke-virtual {p1}, Ltg/a;->p()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p1}, Ltg/a;->E()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Log/l$d;

    if-nez v2, :cond_1

    invoke-virtual {p1}, Ltg/a;->n0()V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    :cond_1
    invoke-virtual {p0, v0, p1, v2}, Log/l$c;->c(Ljava/lang/Object;Ltg/a;Log/l$d;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Ltg/a;->h()V

    invoke-virtual {p0, v0}, Log/l$c;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :goto_1
    invoke-static {p1}, Lqg/a;->e(Ljava/lang/IllegalAccessException;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :goto_2
    new-instance v0, Llg/u;

    invoke-direct {v0, p1}, Llg/u;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public write(Ltg/c;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltg/c;",
            "TT;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    invoke-virtual {p1}, Ltg/c;->s()Ltg/c;

    return-void

    :cond_0
    invoke-virtual {p1}, Ltg/c;->e()Ltg/c;

    :try_start_0
    iget-object v0, p0, Log/l$c;->a:Log/l$f;

    iget-object v0, v0, Log/l$f;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Log/l$d;

    invoke-virtual {v1, p1, p2}, Log/l$d;->c(Ltg/c;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ltg/c;->h()Ltg/c;

    return-void

    :goto_1
    invoke-static {p1}, Lqg/a;->e(Ljava/lang/IllegalAccessException;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1
.end method
