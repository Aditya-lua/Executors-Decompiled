.class public final Log/g;
.super Ltg/a;
.source "SourceFile"


# static fields
.field public static final u:Ljava/io/Reader;

.field public static final v:Ljava/lang/Object;


# instance fields
.field public q:[Ljava/lang/Object;

.field public r:I

.field public s:[Ljava/lang/String;

.field public t:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Log/g$a;

    invoke-direct {v0}, Log/g$a;-><init>()V

    sput-object v0, Log/g;->u:Ljava/io/Reader;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Log/g;->v:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Llg/l;)V
    .locals 2

    sget-object v0, Log/g;->u:Ljava/io/Reader;

    invoke-direct {p0, v0}, Ltg/a;-><init>(Ljava/io/Reader;)V

    const/16 v0, 0x20

    new-array v1, v0, [Ljava/lang/Object;

    iput-object v1, p0, Log/g;->q:[Ljava/lang/Object;

    const/4 v1, 0x0

    iput v1, p0, Log/g;->r:I

    new-array v1, v0, [Ljava/lang/String;

    iput-object v1, p0, Log/g;->s:[Ljava/lang/String;

    new-array v0, v0, [I

    iput-object v0, p0, Log/g;->t:[I

    invoke-virtual {p0, p1}, Log/g;->I0(Ljava/lang/Object;)V

    return-void
.end method

.method private u()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " at path "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Log/g;->x()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public A()J
    .locals 5

    invoke-virtual {p0}, Log/g;->Q()Ltg/b;

    move-result-object v0

    sget-object v1, Ltg/b;->g:Ltg/b;

    if-eq v0, v1, :cond_1

    sget-object v2, Ltg/b;->f:Ltg/b;

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Expected "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " but was "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Log/g;->u()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1
    :goto_0
    invoke-virtual {p0}, Log/g;->E0()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llg/r;

    invoke-virtual {v0}, Llg/r;->i()J

    move-result-wide v0

    invoke-virtual {p0}, Log/g;->F0()Ljava/lang/Object;

    iget v2, p0, Log/g;->r:I

    if-lez v2, :cond_2

    iget-object v3, p0, Log/g;->t:[I

    add-int/lit8 v2, v2, -0x1

    aget v4, v3, v2

    add-int/lit8 v4, v4, 0x1

    aput v4, v3, v2

    :cond_2
    return-wide v0
.end method

.method public final A0(Z)Ljava/lang/String;
    .locals 4

    sget-object v0, Ltg/b;->e:Ltg/b;

    invoke-virtual {p0, v0}, Log/g;->x0(Ltg/b;)V

    invoke-virtual {p0}, Log/g;->E0()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Log/g;->s:[Ljava/lang/String;

    iget v3, p0, Log/g;->r:I

    add-int/lit8 v3, v3, -0x1

    if-eqz p1, :cond_0

    const-string p1, "<skipped>"

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    aput-object p1, v2, v3

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Log/g;->I0(Ljava/lang/Object;)V

    return-object v1
.end method

.method public E()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Log/g;->A0(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final E0()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Log/g;->q:[Ljava/lang/Object;

    iget v1, p0, Log/g;->r:I

    add-int/lit8 v1, v1, -0x1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public final F0()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Log/g;->q:[Ljava/lang/Object;

    iget v1, p0, Log/g;->r:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Log/g;->r:I

    aget-object v2, v0, v1

    const/4 v3, 0x0

    aput-object v3, v0, v1

    return-object v2
.end method

.method public G0()V
    .locals 2

    sget-object v0, Ltg/b;->e:Ltg/b;

    invoke-virtual {p0, v0}, Log/g;->x0(Ltg/b;)V

    invoke-virtual {p0}, Log/g;->E0()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1}, Log/g;->I0(Ljava/lang/Object;)V

    new-instance v1, Llg/r;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v1, v0}, Llg/r;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Log/g;->I0(Ljava/lang/Object;)V

    return-void
.end method

.method public final I0(Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Log/g;->r:I

    iget-object v1, p0, Log/g;->q:[Ljava/lang/Object;

    array-length v2, v1

    if-ne v0, v2, :cond_0

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Log/g;->q:[Ljava/lang/Object;

    iget-object v1, p0, Log/g;->t:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, p0, Log/g;->t:[I

    iget-object v1, p0, Log/g;->s:[Ljava/lang/String;

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Log/g;->s:[Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Log/g;->q:[Ljava/lang/Object;

    iget v1, p0, Log/g;->r:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Log/g;->r:I

    aput-object p1, v0, v1

    return-void
.end method

.method public K()V
    .locals 3

    sget-object v0, Ltg/b;->i:Ltg/b;

    invoke-virtual {p0, v0}, Log/g;->x0(Ltg/b;)V

    invoke-virtual {p0}, Log/g;->F0()Ljava/lang/Object;

    iget v0, p0, Log/g;->r:I

    if-lez v0, :cond_0

    iget-object v1, p0, Log/g;->t:[I

    add-int/lit8 v0, v0, -0x1

    aget v2, v1, v0

    add-int/lit8 v2, v2, 0x1

    aput v2, v1, v0

    :cond_0
    return-void
.end method

.method public N()Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Log/g;->Q()Ltg/b;

    move-result-object v0

    sget-object v1, Ltg/b;->f:Ltg/b;

    if-eq v0, v1, :cond_1

    sget-object v2, Ltg/b;->g:Ltg/b;

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Expected "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " but was "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Log/g;->u()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1
    :goto_0
    invoke-virtual {p0}, Log/g;->F0()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llg/r;

    invoke-virtual {v0}, Llg/r;->l()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Log/g;->r:I

    if-lez v1, :cond_2

    iget-object v2, p0, Log/g;->t:[I

    add-int/lit8 v1, v1, -0x1

    aget v3, v2, v1

    add-int/lit8 v3, v3, 0x1

    aput v3, v2, v1

    :cond_2
    return-object v0
.end method

.method public Q()Ltg/b;
    .locals 4

    iget v0, p0, Log/g;->r:I

    if-nez v0, :cond_0

    sget-object v0, Ltg/b;->j:Ltg/b;

    return-object v0

    :cond_0
    invoke-virtual {p0}, Log/g;->E0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/util/Iterator;

    if-eqz v1, :cond_4

    iget-object v1, p0, Log/g;->q:[Ljava/lang/Object;

    iget v2, p0, Log/g;->r:I

    add-int/lit8 v2, v2, -0x2

    aget-object v1, v1, v2

    instance-of v1, v1, Llg/o;

    check-cast v0, Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    if-eqz v1, :cond_1

    sget-object v0, Ltg/b;->e:Ltg/b;

    return-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Log/g;->I0(Ljava/lang/Object;)V

    invoke-virtual {p0}, Log/g;->Q()Ltg/b;

    move-result-object v0

    return-object v0

    :cond_2
    if-eqz v1, :cond_3

    sget-object v0, Ltg/b;->d:Ltg/b;

    return-object v0

    :cond_3
    sget-object v0, Ltg/b;->b:Ltg/b;

    return-object v0

    :cond_4
    instance-of v1, v0, Llg/o;

    if-eqz v1, :cond_5

    sget-object v0, Ltg/b;->c:Ltg/b;

    return-object v0

    :cond_5
    instance-of v1, v0, Llg/i;

    if-eqz v1, :cond_6

    sget-object v0, Ltg/b;->a:Ltg/b;

    return-object v0

    :cond_6
    instance-of v1, v0, Llg/r;

    if-eqz v1, :cond_a

    check-cast v0, Llg/r;

    invoke-virtual {v0}, Llg/r;->D()Z

    move-result v1

    if-eqz v1, :cond_7

    sget-object v0, Ltg/b;->f:Ltg/b;

    return-object v0

    :cond_7
    invoke-virtual {v0}, Llg/r;->A()Z

    move-result v1

    if-eqz v1, :cond_8

    sget-object v0, Ltg/b;->h:Ltg/b;

    return-object v0

    :cond_8
    invoke-virtual {v0}, Llg/r;->C()Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object v0, Ltg/b;->g:Ltg/b;

    return-object v0

    :cond_9
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_a
    instance-of v1, v0, Llg/n;

    if-eqz v1, :cond_b

    sget-object v0, Ltg/b;->i:Ltg/b;

    return-object v0

    :cond_b
    sget-object v1, Log/g;->v:Ljava/lang/Object;

    if-ne v0, v1, :cond_c

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "JsonReader is closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    new-instance v1, Ltg/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Custom JsonElement subclass "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " is not supported"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ltg/d;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public b()V
    .locals 3

    sget-object v0, Ltg/b;->a:Ltg/b;

    invoke-virtual {p0, v0}, Log/g;->x0(Ltg/b;)V

    invoke-virtual {p0}, Log/g;->E0()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llg/i;

    invoke-virtual {v0}, Llg/i;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-virtual {p0, v0}, Log/g;->I0(Ljava/lang/Object;)V

    iget-object v0, p0, Log/g;->t:[I

    iget v1, p0, Log/g;->r:I

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    aput v2, v0, v1

    return-void
.end method

.method public c()V
    .locals 1

    sget-object v0, Ltg/b;->c:Ltg/b;

    invoke-virtual {p0, v0}, Log/g;->x0(Ltg/b;)V

    invoke-virtual {p0}, Log/g;->E0()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llg/o;

    invoke-virtual {v0}, Llg/o;->D()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-virtual {p0, v0}, Log/g;->I0(Ljava/lang/Object;)V

    return-void
.end method

.method public close()V
    .locals 1

    sget-object v0, Log/g;->v:Ljava/lang/Object;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Log/g;->q:[Ljava/lang/Object;

    const/4 v0, 0x1

    iput v0, p0, Log/g;->r:I

    return-void
.end method

.method public g()V
    .locals 3

    sget-object v0, Ltg/b;->b:Ltg/b;

    invoke-virtual {p0, v0}, Log/g;->x0(Ltg/b;)V

    invoke-virtual {p0}, Log/g;->F0()Ljava/lang/Object;

    invoke-virtual {p0}, Log/g;->F0()Ljava/lang/Object;

    iget v0, p0, Log/g;->r:I

    if-lez v0, :cond_0

    iget-object v1, p0, Log/g;->t:[I

    add-int/lit8 v0, v0, -0x1

    aget v2, v1, v0

    add-int/lit8 v2, v2, 0x1

    aput v2, v1, v0

    :cond_0
    return-void
.end method

.method public h()V
    .locals 3

    sget-object v0, Ltg/b;->d:Ltg/b;

    invoke-virtual {p0, v0}, Log/g;->x0(Ltg/b;)V

    iget-object v0, p0, Log/g;->s:[Ljava/lang/String;

    iget v1, p0, Log/g;->r:I

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    aput-object v2, v0, v1

    invoke-virtual {p0}, Log/g;->F0()Ljava/lang/Object;

    invoke-virtual {p0}, Log/g;->F0()Ljava/lang/Object;

    iget v0, p0, Log/g;->r:I

    if-lez v0, :cond_0

    iget-object v1, p0, Log/g;->t:[I

    add-int/lit8 v0, v0, -0x1

    aget v2, v1, v0

    add-int/lit8 v2, v2, 0x1

    aput v2, v1, v0

    :cond_0
    return-void
.end method

.method public final m(Z)Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Log/g;->r:I

    if-ge v1, v2, :cond_4

    iget-object v3, p0, Log/g;->q:[Ljava/lang/Object;

    aget-object v4, v3, v1

    instance-of v5, v4, Llg/i;

    if-eqz v5, :cond_2

    add-int/lit8 v1, v1, 0x1

    if-ge v1, v2, :cond_3

    aget-object v3, v3, v1

    instance-of v3, v3, Ljava/util/Iterator;

    if-eqz v3, :cond_3

    iget-object v3, p0, Log/g;->t:[I

    aget v3, v3, v1

    if-eqz p1, :cond_1

    if-lez v3, :cond_1

    add-int/lit8 v4, v2, -0x1

    if-eq v1, v4, :cond_0

    add-int/lit8 v2, v2, -0x2

    if-ne v1, v2, :cond_1

    :cond_0
    add-int/lit8 v3, v3, -0x1

    :cond_1
    const/16 v2, 0x5b

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v2, 0x5d

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    instance-of v4, v4, Llg/o;

    if-eqz v4, :cond_3

    add-int/lit8 v1, v1, 0x1

    if-ge v1, v2, :cond_3

    aget-object v2, v3, v1

    instance-of v2, v2, Ljava/util/Iterator;

    if-eqz v2, :cond_3

    const/16 v2, 0x2e

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, Log/g;->s:[Ljava/lang/String;

    aget-object v2, v2, v1

    if-eqz v2, :cond_3

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public n()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Log/g;->m(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public n0()V
    .locals 4

    invoke-virtual {p0}, Log/g;->Q()Ltg/b;

    move-result-object v0

    sget-object v1, Log/g$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    const/4 v2, 0x4

    if-eq v0, v2, :cond_0

    invoke-virtual {p0}, Log/g;->F0()Ljava/lang/Object;

    iget v0, p0, Log/g;->r:I

    if-lez v0, :cond_0

    iget-object v2, p0, Log/g;->t:[I

    sub-int/2addr v0, v1

    aget v3, v2, v0

    add-int/2addr v3, v1

    aput v3, v2, v0

    :cond_0
    return-void

    :cond_1
    invoke-virtual {p0}, Log/g;->h()V

    return-void

    :cond_2
    invoke-virtual {p0}, Log/g;->g()V

    return-void

    :cond_3
    invoke-virtual {p0, v1}, Log/g;->A0(Z)Ljava/lang/String;

    return-void
.end method

.method public p()Z
    .locals 2

    invoke-virtual {p0}, Log/g;->Q()Ltg/b;

    move-result-object v0

    sget-object v1, Ltg/b;->d:Ltg/b;

    if-eq v0, v1, :cond_0

    sget-object v1, Ltg/b;->b:Ltg/b;

    if-eq v0, v1, :cond_0

    sget-object v1, Ltg/b;->j:Ltg/b;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-class v1, Log/g;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Log/g;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public w()Z
    .locals 4

    sget-object v0, Ltg/b;->h:Ltg/b;

    invoke-virtual {p0, v0}, Log/g;->x0(Ltg/b;)V

    invoke-virtual {p0}, Log/g;->F0()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llg/r;

    invoke-virtual {v0}, Llg/r;->b()Z

    move-result v0

    iget v1, p0, Log/g;->r:I

    if-lez v1, :cond_0

    iget-object v2, p0, Log/g;->t:[I

    add-int/lit8 v1, v1, -0x1

    aget v3, v2, v1

    add-int/lit8 v3, v3, 0x1

    aput v3, v2, v1

    :cond_0
    return v0
.end method

.method public x()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Log/g;->m(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final x0(Ltg/b;)V
    .locals 3

    invoke-virtual {p0}, Log/g;->Q()Ltg/b;

    move-result-object v0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Expected "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " but was "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Log/g;->Q()Ltg/b;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Log/g;->u()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public y()D
    .locals 5

    invoke-virtual {p0}, Log/g;->Q()Ltg/b;

    move-result-object v0

    sget-object v1, Ltg/b;->g:Ltg/b;

    if-eq v0, v1, :cond_1

    sget-object v2, Ltg/b;->f:Ltg/b;

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Expected "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " but was "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Log/g;->u()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1
    :goto_0
    invoke-virtual {p0}, Log/g;->E0()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llg/r;

    invoke-virtual {v0}, Llg/r;->c()D

    move-result-wide v0

    invoke-virtual {p0}, Ltg/a;->r()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    new-instance v2, Ltg/d;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "JSON forbids NaN and infinities: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ltg/d;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_3
    :goto_1
    invoke-virtual {p0}, Log/g;->F0()Ljava/lang/Object;

    iget v2, p0, Log/g;->r:I

    if-lez v2, :cond_4

    iget-object v3, p0, Log/g;->t:[I

    add-int/lit8 v2, v2, -0x1

    aget v4, v3, v2

    add-int/lit8 v4, v4, 0x1

    aput v4, v3, v2

    :cond_4
    return-wide v0
.end method

.method public z()I
    .locals 5

    invoke-virtual {p0}, Log/g;->Q()Ltg/b;

    move-result-object v0

    sget-object v1, Ltg/b;->g:Ltg/b;

    if-eq v0, v1, :cond_1

    sget-object v2, Ltg/b;->f:Ltg/b;

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Expected "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " but was "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Log/g;->u()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1
    :goto_0
    invoke-virtual {p0}, Log/g;->E0()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llg/r;

    invoke-virtual {v0}, Llg/r;->e()I

    move-result v0

    invoke-virtual {p0}, Log/g;->F0()Ljava/lang/Object;

    iget v1, p0, Log/g;->r:I

    if-lez v1, :cond_2

    iget-object v2, p0, Log/g;->t:[I

    add-int/lit8 v1, v1, -0x1

    aget v3, v2, v1

    add-int/lit8 v3, v3, 0x1

    aput v3, v2, v1

    :cond_2
    return v0
.end method

.method public z0()Llg/l;
    .locals 4

    invoke-virtual {p0}, Log/g;->Q()Ltg/b;

    move-result-object v0

    sget-object v1, Ltg/b;->e:Ltg/b;

    if-eq v0, v1, :cond_0

    sget-object v1, Ltg/b;->b:Ltg/b;

    if-eq v0, v1, :cond_0

    sget-object v1, Ltg/b;->d:Ltg/b;

    if-eq v0, v1, :cond_0

    sget-object v1, Ltg/b;->j:Ltg/b;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Log/g;->E0()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llg/l;

    invoke-virtual {p0}, Log/g;->n0()V

    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unexpected "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " when reading a JsonElement."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
