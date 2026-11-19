.class public final Log/h;
.super Ltg/c;
.source "SourceFile"


# static fields
.field public static final r:Ljava/io/Writer;

.field public static final s:Llg/r;


# instance fields
.field public final o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llg/l;",
            ">;"
        }
    .end annotation
.end field

.field public p:Ljava/lang/String;

.field public q:Llg/l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Log/h$a;

    invoke-direct {v0}, Log/h$a;-><init>()V

    sput-object v0, Log/h;->r:Ljava/io/Writer;

    new-instance v0, Llg/r;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Llg/r;-><init>(Ljava/lang/String;)V

    sput-object v0, Log/h;->s:Llg/r;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Log/h;->r:Ljava/io/Writer;

    invoke-direct {p0, v0}, Ltg/c;-><init>(Ljava/io/Writer;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Log/h;->o:Ljava/util/List;

    sget-object v0, Llg/n;->a:Llg/n;

    iput-object v0, p0, Log/h;->q:Llg/l;

    return-void
.end method


# virtual methods
.method public N(D)Ltg/c;
    .locals 3

    invoke-virtual {p0}, Ltg/c;->o()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1, p2}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "JSON forbids NaN and infinities: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    new-instance v0, Llg/r;

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-direct {v0, p1}, Llg/r;-><init>(Ljava/lang/Number;)V

    invoke-virtual {p0, v0}, Log/h;->f0(Llg/l;)V

    return-object p0
.end method

.method public O(J)Ltg/c;
    .locals 1

    new-instance v0, Llg/r;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-direct {v0, p1}, Llg/r;-><init>(Ljava/lang/Number;)V

    invoke-virtual {p0, v0}, Log/h;->f0(Llg/l;)V

    return-object p0
.end method

.method public Q(Ljava/lang/Boolean;)Ltg/c;
    .locals 1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Log/h;->s()Ltg/c;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Llg/r;

    invoke-direct {v0, p1}, Llg/r;-><init>(Ljava/lang/Boolean;)V

    invoke-virtual {p0, v0}, Log/h;->f0(Llg/l;)V

    return-object p0
.end method

.method public T(Ljava/lang/Number;)Ltg/c;
    .locals 3

    if-nez p1, :cond_0

    invoke-virtual {p0}, Log/h;->s()Ltg/c;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Ltg/c;->o()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "JSON forbids NaN and infinities: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    new-instance v0, Llg/r;

    invoke-direct {v0, p1}, Llg/r;-><init>(Ljava/lang/Number;)V

    invoke-virtual {p0, v0}, Log/h;->f0(Llg/l;)V

    return-object p0
.end method

.method public Y(Ljava/lang/String;)Ltg/c;
    .locals 1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Log/h;->s()Ltg/c;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Llg/r;

    invoke-direct {v0, p1}, Llg/r;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Log/h;->f0(Llg/l;)V

    return-object p0
.end method

.method public b0(Z)Ltg/c;
    .locals 1

    new-instance v0, Llg/r;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {v0, p1}, Llg/r;-><init>(Ljava/lang/Boolean;)V

    invoke-virtual {p0, v0}, Log/h;->f0(Llg/l;)V

    return-object p0
.end method

.method public close()V
    .locals 2

    iget-object v0, p0, Log/h;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Log/h;->o:Ljava/util/List;

    sget-object v1, Log/h;->s:Llg/r;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Incomplete document"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d()Ltg/c;
    .locals 2

    new-instance v0, Llg/i;

    invoke-direct {v0}, Llg/i;-><init>()V

    invoke-virtual {p0, v0}, Log/h;->f0(Llg/l;)V

    iget-object v1, p0, Log/h;->o:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public d0()Llg/l;
    .locals 3

    iget-object v0, p0, Log/h;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Log/h;->q:Llg/l;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected one JSON element but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Log/h;->o:Ljava/util/List;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e()Ltg/c;
    .locals 2

    new-instance v0, Llg/o;

    invoke-direct {v0}, Llg/o;-><init>()V

    invoke-virtual {p0, v0}, Log/h;->f0(Llg/l;)V

    iget-object v1, p0, Log/h;->o:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final e0()Llg/l;
    .locals 2

    iget-object v0, p0, Log/h;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llg/l;

    return-object v0
.end method

.method public final f0(Llg/l;)V
    .locals 2

    iget-object v0, p0, Log/h;->p:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Llg/l;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ltg/c;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Log/h;->e0()Llg/l;

    move-result-object v0

    check-cast v0, Llg/o;

    iget-object v1, p0, Log/h;->p:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Llg/o;->v(Ljava/lang/String;Llg/l;)V

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, Log/h;->p:Ljava/lang/String;

    return-void

    :cond_2
    iget-object v0, p0, Log/h;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    iput-object p1, p0, Log/h;->q:Llg/l;

    return-void

    :cond_3
    invoke-virtual {p0}, Log/h;->e0()Llg/l;

    move-result-object v0

    instance-of v1, v0, Llg/i;

    if-eqz v1, :cond_4

    check-cast v0, Llg/i;

    invoke-virtual {v0, p1}, Llg/i;->w(Llg/l;)V

    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public flush()V
    .locals 0

    return-void
.end method

.method public g()Ltg/c;
    .locals 2

    iget-object v0, p0, Log/h;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Log/h;->p:Ljava/lang/String;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Log/h;->e0()Llg/l;

    move-result-object v0

    instance-of v0, v0, Llg/i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Log/h;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public h()Ltg/c;
    .locals 2

    iget-object v0, p0, Log/h;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Log/h;->p:Ljava/lang/String;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Log/h;->e0()Llg/l;

    move-result-object v0

    instance-of v0, v0, Llg/o;

    if-eqz v0, :cond_0

    iget-object v0, p0, Log/h;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public p(Ljava/lang/String;)Ltg/c;
    .locals 1

    const-string v0, "name == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, Log/h;->o:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Log/h;->p:Ljava/lang/String;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Log/h;->e0()Llg/l;

    move-result-object v0

    instance-of v0, v0, Llg/o;

    if-eqz v0, :cond_0

    iput-object p1, p0, Log/h;->p:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Please begin an object before writing a name."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Did not expect a name"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public s()Ltg/c;
    .locals 1

    sget-object v0, Llg/n;->a:Llg/n;

    invoke-virtual {p0, v0}, Log/h;->f0(Llg/l;)V

    return-object p0
.end method
