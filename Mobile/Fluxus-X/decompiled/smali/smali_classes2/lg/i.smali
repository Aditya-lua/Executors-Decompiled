.class public final Llg/i;
.super Llg/l;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Llg/l;",
        "Ljava/lang/Iterable<",
        "Llg/l;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Llg/l;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Llg/l;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Llg/i;->a:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 3
    invoke-direct {p0}, Llg/l;-><init>()V

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Llg/i;->a:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public A(I)Llg/l;
    .locals 1

    iget-object v0, p0, Llg/i;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llg/l;

    return-object p1
.end method

.method public final B()Llg/l;
    .locals 4

    iget-object v0, p0, Llg/i;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Llg/i;->a:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llg/l;

    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Array must have size 1, but has size "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public bridge synthetic a()Llg/l;
    .locals 1

    invoke-virtual {p0}, Llg/i;->x()Llg/i;

    move-result-object v0

    return-object v0
.end method

.method public b()Z
    .locals 1

    invoke-virtual {p0}, Llg/i;->B()Llg/l;

    move-result-object v0

    invoke-virtual {v0}, Llg/l;->b()Z

    move-result v0

    return v0
.end method

.method public c()D
    .locals 2

    invoke-virtual {p0}, Llg/i;->B()Llg/l;

    move-result-object v0

    invoke-virtual {v0}, Llg/l;->c()D

    move-result-wide v0

    return-wide v0
.end method

.method public d()F
    .locals 1

    invoke-virtual {p0}, Llg/i;->B()Llg/l;

    move-result-object v0

    invoke-virtual {v0}, Llg/l;->d()F

    move-result v0

    return v0
.end method

.method public e()I
    .locals 1

    invoke-virtual {p0}, Llg/i;->B()Llg/l;

    move-result-object v0

    invoke-virtual {v0}, Llg/l;->e()I

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p1, p0, :cond_1

    instance-of v0, p1, Llg/i;

    if-eqz v0, :cond_0

    check-cast p1, Llg/i;

    iget-object p1, p1, Llg/i;->a:Ljava/util/ArrayList;

    iget-object v0, p0, Llg/i;->a:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Llg/i;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->hashCode()I

    move-result v0

    return v0
.end method

.method public i()J
    .locals 2

    invoke-virtual {p0}, Llg/i;->B()Llg/l;

    move-result-object v0

    invoke-virtual {v0}, Llg/l;->i()J

    move-result-wide v0

    return-wide v0
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Llg/i;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Llg/l;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llg/i;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public j()Ljava/lang/Number;
    .locals 1

    invoke-virtual {p0}, Llg/i;->B()Llg/l;

    move-result-object v0

    invoke-virtual {v0}, Llg/l;->j()Ljava/lang/Number;

    move-result-object v0

    return-object v0
.end method

.method public l()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Llg/i;->B()Llg/l;

    move-result-object v0

    invoke-virtual {v0}, Llg/l;->l()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Llg/i;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public v(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Llg/i;->a:Ljava/util/ArrayList;

    if-nez p1, :cond_0

    sget-object p1, Llg/n;->a:Llg/n;

    goto :goto_0

    :cond_0
    new-instance v1, Llg/r;

    invoke-direct {v1, p1}, Llg/r;-><init>(Ljava/lang/String;)V

    move-object p1, v1

    :goto_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public w(Llg/l;)V
    .locals 1

    if-nez p1, :cond_0

    sget-object p1, Llg/n;->a:Llg/n;

    :cond_0
    iget-object v0, p0, Llg/i;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public x()Llg/i;
    .locals 5

    iget-object v0, p0, Llg/i;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Llg/i;

    iget-object v1, p0, Llg/i;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Llg/i;-><init>(I)V

    iget-object v1, p0, Llg/i;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v3, v3, 0x1

    check-cast v4, Llg/l;

    invoke-virtual {v4}, Llg/l;->a()Llg/l;

    move-result-object v4

    invoke-virtual {v0, v4}, Llg/i;->w(Llg/l;)V

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    new-instance v0, Llg/i;

    invoke-direct {v0}, Llg/i;-><init>()V

    return-object v0
.end method
