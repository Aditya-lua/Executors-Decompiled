.class public final Log/b$a;
.super Llg/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Log/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Llg/a0<",
        "Ljava/util/Collection<",
        "TE;>;>;"
    }
.end annotation


# instance fields
.field public final a:Llg/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llg/a0<",
            "TE;>;"
        }
    .end annotation
.end field

.field public final b:Lng/d0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lng/d0<",
            "+",
            "Ljava/util/Collection<",
            "TE;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Llg/a0;Lng/d0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llg/a0<",
            "TE;>;",
            "Lng/d0<",
            "+",
            "Ljava/util/Collection<",
            "TE;>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Llg/a0;-><init>()V

    iput-object p1, p0, Log/b$a;->a:Llg/a0;

    iput-object p2, p0, Log/b$a;->b:Lng/d0;

    return-void
.end method


# virtual methods
.method public a(Ltg/a;)Ljava/util/Collection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltg/a;",
            ")",
            "Ljava/util/Collection<",
            "TE;>;"
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
    iget-object v0, p0, Log/b$a;->b:Lng/d0;

    invoke-interface {v0}, Lng/d0;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {p1}, Ltg/a;->b()V

    :goto_0
    invoke-virtual {p1}, Ltg/a;->p()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Log/b$a;->a:Llg/a0;

    invoke-virtual {v1, p1}, Llg/a0;->read(Ltg/a;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ltg/a;->g()V

    return-object v0
.end method

.method public b(Ltg/c;Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltg/c;",
            "Ljava/util/Collection<",
            "TE;>;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    invoke-virtual {p1}, Ltg/c;->s()Ltg/c;

    return-void

    :cond_0
    invoke-virtual {p1}, Ltg/c;->d()Ltg/c;

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Log/b$a;->a:Llg/a0;

    invoke-virtual {v1, p1, v0}, Llg/a0;->write(Ltg/c;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ltg/c;->g()Ltg/c;

    return-void
.end method

.method public bridge synthetic read(Ltg/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Log/b$a;->a(Ltg/a;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic write(Ltg/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/util/Collection;

    invoke-virtual {p0, p1, p2}, Log/b$a;->b(Ltg/c;Ljava/util/Collection;)V

    return-void
.end method
