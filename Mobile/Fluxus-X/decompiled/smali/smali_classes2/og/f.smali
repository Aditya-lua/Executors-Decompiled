.class public Log/f;
.super Llg/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Llg/a0<",
        "Llg/l;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Log/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Log/f;

    invoke-direct {v0}, Log/f;-><init>()V

    sput-object v0, Log/f;->a:Log/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Llg/a0;-><init>()V

    return-void
.end method

.method private b(Ltg/a;Ltg/b;)Llg/l;
    .locals 2

    sget-object v0, Log/f$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_3

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Ltg/a;->K()V

    sget-object p1, Llg/n;->a:Llg/n;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected token: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p2, Llg/r;

    invoke-virtual {p1}, Ltg/a;->w()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {p2, p1}, Llg/r;-><init>(Ljava/lang/Boolean;)V

    return-object p2

    :cond_2
    invoke-virtual {p1}, Ltg/a;->N()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Llg/r;

    new-instance v0, Lng/a0;

    invoke-direct {v0, p1}, Lng/a0;-><init>(Ljava/lang/String;)V

    invoke-direct {p2, v0}, Llg/r;-><init>(Ljava/lang/Number;)V

    return-object p2

    :cond_3
    new-instance p2, Llg/r;

    invoke-virtual {p1}, Ltg/a;->N()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Llg/r;-><init>(Ljava/lang/String;)V

    return-object p2
.end method

.method private c(Ltg/a;Ltg/b;)Llg/l;
    .locals 1

    sget-object v0, Log/f$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_1

    const/4 v0, 0x2

    if-eq p2, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ltg/a;->c()V

    new-instance p1, Llg/o;

    invoke-direct {p1}, Llg/o;-><init>()V

    return-object p1

    :cond_1
    invoke-virtual {p1}, Ltg/a;->b()V

    new-instance p1, Llg/i;

    invoke-direct {p1}, Llg/i;-><init>()V

    return-object p1
.end method


# virtual methods
.method public a(Ltg/a;)Llg/l;
    .locals 6

    instance-of v0, p1, Log/g;

    if-eqz v0, :cond_0

    check-cast p1, Log/g;

    invoke-virtual {p1}, Log/g;->z0()Llg/l;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ltg/a;->Q()Ltg/b;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Log/f;->c(Ltg/a;Ltg/b;)Llg/l;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-direct {p0, p1, v0}, Log/f;->b(Ltg/a;Ltg/b;)Llg/l;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    :cond_2
    :goto_0
    invoke-virtual {p1}, Ltg/a;->p()Z

    move-result v2

    if-eqz v2, :cond_7

    instance-of v2, v1, Llg/o;

    if-eqz v2, :cond_3

    invoke-virtual {p1}, Ltg/a;->E()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {p1}, Ltg/a;->Q()Ltg/b;

    move-result-object v3

    invoke-direct {p0, p1, v3}, Log/f;->c(Ltg/a;Ltg/b;)Llg/l;

    move-result-object v4

    if-eqz v4, :cond_4

    const/4 v5, 0x1

    goto :goto_2

    :cond_4
    const/4 v5, 0x0

    :goto_2
    if-nez v4, :cond_5

    invoke-direct {p0, p1, v3}, Log/f;->b(Ltg/a;Ltg/b;)Llg/l;

    move-result-object v4

    :cond_5
    instance-of v3, v1, Llg/i;

    if-eqz v3, :cond_6

    move-object v2, v1

    check-cast v2, Llg/i;

    invoke-virtual {v2, v4}, Llg/i;->w(Llg/l;)V

    goto :goto_3

    :cond_6
    move-object v3, v1

    check-cast v3, Llg/o;

    invoke-virtual {v3, v2, v4}, Llg/o;->v(Ljava/lang/String;Llg/l;)V

    :goto_3
    if-eqz v5, :cond_2

    invoke-interface {v0, v1}, Ljava/util/Deque;->addLast(Ljava/lang/Object;)V

    move-object v1, v4

    goto :goto_0

    :cond_7
    instance-of v2, v1, Llg/i;

    if-eqz v2, :cond_8

    invoke-virtual {p1}, Ltg/a;->g()V

    goto :goto_4

    :cond_8
    invoke-virtual {p1}, Ltg/a;->h()V

    :goto_4
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_9

    return-object v1

    :cond_9
    invoke-interface {v0}, Ljava/util/Deque;->removeLast()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llg/l;

    goto :goto_0
.end method

.method public d(Ltg/c;Llg/l;)V
    .locals 2

    if-eqz p2, :cond_8

    invoke-virtual {p2}, Llg/l;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p2}, Llg/l;->t()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p2}, Llg/l;->h()Llg/r;

    move-result-object p2

    invoke-virtual {p2}, Llg/r;->C()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Llg/r;->j()Ljava/lang/Number;

    move-result-object p2

    invoke-virtual {p1, p2}, Ltg/c;->T(Ljava/lang/Number;)Ltg/c;

    return-void

    :cond_1
    invoke-virtual {p2}, Llg/r;->A()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Llg/r;->b()Z

    move-result p2

    invoke-virtual {p1, p2}, Ltg/c;->b0(Z)Ltg/c;

    return-void

    :cond_2
    invoke-virtual {p2}, Llg/r;->l()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ltg/c;->Y(Ljava/lang/String;)Ltg/c;

    return-void

    :cond_3
    invoke-virtual {p2}, Llg/l;->m()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Ltg/c;->d()Ltg/c;

    invoke-virtual {p2}, Llg/l;->f()Llg/i;

    move-result-object p2

    invoke-virtual {p2}, Llg/i;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llg/l;

    invoke-virtual {p0, p1, v0}, Log/f;->d(Ltg/c;Llg/l;)V

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Ltg/c;->g()Ltg/c;

    return-void

    :cond_5
    invoke-virtual {p2}, Llg/l;->q()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Ltg/c;->e()Ltg/c;

    invoke-virtual {p2}, Llg/l;->g()Llg/o;

    move-result-object p2

    invoke-virtual {p2}, Llg/o;->D()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Ltg/c;->p(Ljava/lang/String;)Ltg/c;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llg/l;

    invoke-virtual {p0, p1, v0}, Log/f;->d(Ltg/c;Llg/l;)V

    goto :goto_1

    :cond_6
    invoke-virtual {p1}, Ltg/c;->h()Ltg/c;

    return-void

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Couldn\'t write "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    :goto_2
    invoke-virtual {p1}, Ltg/c;->s()Ltg/c;

    return-void
.end method

.method public bridge synthetic read(Ltg/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Log/f;->a(Ltg/a;)Llg/l;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic write(Ltg/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Llg/l;

    invoke-virtual {p0, p1, p2}, Log/f;->d(Ltg/c;Llg/l;)V

    return-void
.end method
