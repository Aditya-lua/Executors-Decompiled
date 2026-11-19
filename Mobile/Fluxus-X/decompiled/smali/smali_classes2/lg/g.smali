.class public final Llg/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lng/w;

.field public b:Llg/v;

.field public c:Llg/d;

.field public final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/reflect/Type;",
            "Llg/h<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llg/b0;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llg/b0;",
            ">;"
        }
    .end annotation
.end field

.field public g:Z

.field public h:Ljava/lang/String;

.field public i:I

.field public j:I

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Llg/e;

.field public o:Z

.field public p:Llg/x;

.field public q:Z

.field public r:Llg/z;

.field public s:Llg/z;

.field public final t:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Llg/w;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lng/w;->g:Lng/w;

    iput-object v0, p0, Llg/g;->a:Lng/w;

    sget-object v0, Llg/v;->a:Llg/v;

    iput-object v0, p0, Llg/g;->b:Llg/v;

    sget-object v0, Llg/c;->a:Llg/c;

    iput-object v0, p0, Llg/g;->c:Llg/d;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Llg/g;->d:Ljava/util/Map;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Llg/g;->e:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Llg/g;->f:Ljava/util/List;

    const/4 v0, 0x0

    iput-boolean v0, p0, Llg/g;->g:Z

    sget-object v1, Llg/f;->B:Ljava/lang/String;

    iput-object v1, p0, Llg/g;->h:Ljava/lang/String;

    const/4 v1, 0x2

    iput v1, p0, Llg/g;->i:I

    iput v1, p0, Llg/g;->j:I

    iput-boolean v0, p0, Llg/g;->k:Z

    iput-boolean v0, p0, Llg/g;->l:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Llg/g;->m:Z

    sget-object v2, Llg/f;->A:Llg/e;

    iput-object v2, p0, Llg/g;->n:Llg/e;

    iput-boolean v0, p0, Llg/g;->o:Z

    sget-object v0, Llg/f;->z:Llg/x;

    iput-object v0, p0, Llg/g;->p:Llg/x;

    iput-boolean v1, p0, Llg/g;->q:Z

    sget-object v0, Llg/f;->D:Llg/z;

    iput-object v0, p0, Llg/g;->r:Llg/z;

    sget-object v0, Llg/f;->E:Llg/z;

    iput-object v0, p0, Llg/g;->s:Llg/z;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Llg/g;->t:Ljava/util/ArrayDeque;

    return-void
.end method

.method public static a(Ljava/lang/String;IILjava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Ljava/util/List<",
            "Llg/b0;",
            ">;)V"
        }
    .end annotation

    sget-boolean v0, Lrg/d;->a:Z

    const/4 v1, 0x0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    sget-object p1, Log/c$b;->b:Log/c$b;

    invoke-virtual {p1, p0}, Log/c$b;->b(Ljava/lang/String;)Llg/b0;

    move-result-object p1

    if-eqz v0, :cond_0

    sget-object p2, Lrg/d;->c:Log/c$b;

    invoke-virtual {p2, p0}, Log/c$b;->b(Ljava/lang/String;)Llg/b0;

    move-result-object v1

    sget-object p2, Lrg/d;->b:Log/c$b;

    invoke-virtual {p2, p0}, Log/c$b;->b(Ljava/lang/String;)Llg/b0;

    move-result-object p0

    goto :goto_1

    :cond_0
    :goto_0
    move-object p0, v1

    goto :goto_1

    :cond_1
    const/4 p0, 0x2

    if-ne p1, p0, :cond_2

    if-eq p2, p0, :cond_4

    :cond_2
    sget-object p0, Log/c$b;->b:Log/c$b;

    invoke-virtual {p0, p1, p2}, Log/c$b;->a(II)Llg/b0;

    move-result-object p0

    if-eqz v0, :cond_3

    sget-object v1, Lrg/d;->c:Log/c$b;

    invoke-virtual {v1, p1, p2}, Log/c$b;->a(II)Llg/b0;

    move-result-object v1

    sget-object v2, Lrg/d;->b:Log/c$b;

    invoke-virtual {v2, p1, p2}, Log/c$b;->a(II)Llg/b0;

    move-result-object p1

    move-object v3, p1

    move-object p1, p0

    move-object p0, v3

    goto :goto_1

    :cond_3
    move-object p1, p0

    goto :goto_0

    :goto_1
    invoke-interface {p3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz v0, :cond_4

    invoke-interface {p3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p3, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    return-void
.end method

.method public static c(Ljava/lang/reflect/Type;)Z
    .locals 1

    const-class v0, Ljava/lang/Object;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public b()Llg/f;
    .locals 24

    move-object/from16 v0, p0

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, v0, Llg/g;->e:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    iget-object v3, v0, Llg/g;->f:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v2, v2, 0x3

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v2, v0, Llg/g;->e:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-static {v1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, v0, Llg/g;->f:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v2}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    invoke-interface {v1, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v2, v0, Llg/g;->h:Ljava/lang/String;

    iget v3, v0, Llg/g;->i:I

    iget v4, v0, Llg/g;->j:I

    invoke-static {v2, v3, v4, v1}, Llg/g;->a(Ljava/lang/String;IILjava/util/List;)V

    move-object/from16 v19, v1

    new-instance v1, Llg/f;

    iget-object v2, v0, Llg/g;->a:Lng/w;

    iget-object v3, v0, Llg/g;->c:Llg/d;

    new-instance v4, Ljava/util/HashMap;

    iget-object v5, v0, Llg/g;->d:Ljava/util/Map;

    invoke-direct {v4, v5}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iget-boolean v5, v0, Llg/g;->g:Z

    iget-boolean v6, v0, Llg/g;->k:Z

    iget-boolean v7, v0, Llg/g;->o:Z

    iget-boolean v8, v0, Llg/g;->m:Z

    iget-object v9, v0, Llg/g;->n:Llg/e;

    iget-object v10, v0, Llg/g;->p:Llg/x;

    iget-boolean v11, v0, Llg/g;->l:Z

    iget-boolean v12, v0, Llg/g;->q:Z

    iget-object v13, v0, Llg/g;->b:Llg/v;

    iget-object v14, v0, Llg/g;->h:Ljava/lang/String;

    iget v15, v0, Llg/g;->i:I

    move-object/from16 v16, v1

    iget v1, v0, Llg/g;->j:I

    move/from16 v17, v1

    new-instance v1, Ljava/util/ArrayList;

    move-object/from16 v18, v2

    iget-object v2, v0, Llg/g;->e:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v2, Ljava/util/ArrayList;

    move-object/from16 v20, v1

    iget-object v1, v0, Llg/g;->f:Ljava/util/List;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v1, v0, Llg/g;->r:Llg/z;

    move-object/from16 v21, v1

    iget-object v1, v0, Llg/g;->s:Llg/z;

    move-object/from16 v22, v1

    new-instance v1, Ljava/util/ArrayList;

    move-object/from16 v23, v2

    iget-object v2, v0, Llg/g;->t:Ljava/util/ArrayDeque;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object/from16 v2, v22

    move-object/from16 v22, v1

    move-object/from16 v1, v16

    move/from16 v16, v17

    move-object/from16 v17, v20

    move-object/from16 v20, v21

    move-object/from16 v21, v2

    move-object/from16 v2, v18

    move-object/from16 v18, v23

    invoke-direct/range {v1 .. v22}, Llg/f;-><init>(Lng/w;Llg/d;Ljava/util/Map;ZZZZLlg/e;Llg/x;ZZLlg/v;Ljava/lang/String;IILjava/util/List;Ljava/util/List;Ljava/util/List;Llg/z;Llg/z;Ljava/util/List;)V

    move-object/from16 v16, v1

    return-object v16
.end method

.method public d(Ljava/lang/reflect/Type;Ljava/lang/Object;)Llg/g;
    .locals 3

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v0, p2, Llg/t;

    if-nez v0, :cond_1

    instance-of v1, p2, Llg/k;

    if-nez v1, :cond_1

    instance-of v1, p2, Llg/h;

    if-nez v1, :cond_1

    instance-of v1, p2, Llg/a0;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Class "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " does not implement any supported type adapter class or interface"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, Llg/g;->c(Ljava/lang/reflect/Type;)Z

    move-result v1

    if-nez v1, :cond_6

    instance-of v1, p2, Llg/h;

    if-eqz v1, :cond_2

    iget-object v1, p0, Llg/g;->d:Ljava/util/Map;

    move-object v2, p2

    check-cast v2, Llg/h;

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    if-nez v0, :cond_3

    instance-of v0, p2, Llg/k;

    if-eqz v0, :cond_4

    :cond_3
    invoke-static {p1}, Lsg/a;->b(Ljava/lang/reflect/Type;)Lsg/a;

    move-result-object v0

    iget-object v1, p0, Llg/g;->e:Ljava/util/List;

    invoke-static {v0, p2}, Log/n;->c(Lsg/a;Ljava/lang/Object;)Llg/b0;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    instance-of v0, p2, Llg/a0;

    if-eqz v0, :cond_5

    invoke-static {p1}, Lsg/a;->b(Ljava/lang/reflect/Type;)Lsg/a;

    move-result-object p1

    check-cast p2, Llg/a0;

    invoke-static {p1, p2}, Log/p;->c(Lsg/a;Llg/a0;)Llg/b0;

    move-result-object p1

    iget-object p2, p0, Llg/g;->e:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    return-object p0

    :cond_6
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot override built-in adapter for "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public e(Llg/b0;)Llg/g;
    .locals 1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Llg/g;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public f()Llg/g;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Llg/g;->g:Z

    return-object p0
.end method

.method public g(Llg/c;)Llg/g;
    .locals 0

    invoke-virtual {p0, p1}, Llg/g;->h(Llg/d;)Llg/g;

    move-result-object p1

    return-object p1
.end method

.method public h(Llg/d;)Llg/g;
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Llg/d;

    iput-object p1, p0, Llg/g;->c:Llg/d;

    return-object p0
.end method
