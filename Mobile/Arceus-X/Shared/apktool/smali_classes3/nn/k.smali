.class public Lnn/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltn/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnn/k$b;,
        Lnn/k$a;
    }
.end annotation


# static fields
.field public static final v:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Lqn/a;",
            ">;>;"
        }
    .end annotation
.end field

.field public static final w:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lqn/a;",
            ">;",
            "Ltn/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:Lrn/i;

.field public b:I

.field public c:I

.field public d:I

.field public e:Z

.field public f:I

.field public g:I

.field public h:I

.field public i:Z

.field public final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ltn/e;",
            ">;"
        }
    .end annotation
.end field

.field public final k:Lrn/d;

.field public final l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lsn/b;",
            ">;"
        }
    .end annotation
.end field

.field public final m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lun/a;",
            ">;"
        }
    .end annotation
.end field

.field public final n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lsn/e;",
            ">;"
        }
    .end annotation
.end field

.field public final o:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Character;",
            ">;"
        }
    .end annotation
.end field

.field public final p:Lrn/a;

.field public final q:I

.field public final r:Lnn/h;

.field public final s:Lnn/f;

.field public final t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnn/k$b;",
            ">;"
        }
    .end annotation
.end field

.field public final u:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ltn/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Ljava/util/LinkedHashSet;

    const-class v6, Lqn/q;

    const-class v7, Lqn/n;

    const-class v1, Lqn/b;

    const-class v2, Lqn/j;

    const-class v3, Lqn/h;

    const-class v4, Lqn/k;

    const-class v5, Lqn/c0;

    invoke-static/range {v1 .. v7}, Lnn/i;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lnn/k;->v:Ljava/util/Set;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lnn/c$a;

    invoke-direct {v1}, Lnn/c$a;-><init>()V

    const-class v2, Lqn/b;

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lnn/m$a;

    invoke-direct {v1}, Lnn/m$a;-><init>()V

    const-class v2, Lqn/j;

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lnn/l$a;

    invoke-direct {v1}, Lnn/l$a;-><init>()V

    const-class v2, Lqn/h;

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lnn/n$a;

    invoke-direct {v1}, Lnn/n$a;-><init>()V

    const-class v2, Lqn/k;

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lnn/b0$a;

    invoke-direct {v1}, Lnn/b0$a;-><init>()V

    const-class v2, Lqn/c0;

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lnn/x$a;

    invoke-direct {v1}, Lnn/x$a;-><init>()V

    const-class v2, Lqn/q;

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lnn/p$a;

    invoke-direct {v1}, Lnn/p$a;-><init>()V

    const-class v2, Lqn/n;

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lnn/k;->w:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lrn/d;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lrn/a;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ltn/e;",
            ">;",
            "Lrn/d;",
            "Ljava/util/List<",
            "Lsn/b;",
            ">;",
            "Ljava/util/List<",
            "Lun/a;",
            ">;",
            "Ljava/util/List<",
            "Lsn/e;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/Character;",
            ">;",
            "Lrn/a;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lnn/k;->b:I

    const/4 v0, 0x0

    iput v0, p0, Lnn/k;->c:I

    iput v0, p0, Lnn/k;->d:I

    iput v0, p0, Lnn/k;->f:I

    iput v0, p0, Lnn/k;->g:I

    iput v0, p0, Lnn/k;->h:I

    new-instance v1, Lnn/f;

    invoke-direct {v1}, Lnn/f;-><init>()V

    iput-object v1, p0, Lnn/k;->s:Lnn/f;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lnn/k;->t:Ljava/util/List;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lnn/k;->u:Ljava/util/List;

    iput-object p1, p0, Lnn/k;->j:Ljava/util/List;

    iput-object p2, p0, Lnn/k;->k:Lrn/d;

    iput-object p3, p0, Lnn/k;->l:Ljava/util/List;

    iput-object p4, p0, Lnn/k;->m:Ljava/util/List;

    iput-object p5, p0, Lnn/k;->n:Ljava/util/List;

    iput-object p6, p0, Lnn/k;->o:Ljava/util/Set;

    iput-object p7, p0, Lnn/k;->p:Lrn/a;

    iput p8, p0, Lnn/k;->q:I

    new-instance p1, Lnn/h;

    invoke-direct {p1}, Lnn/h;-><init>()V

    iput-object p1, p0, Lnn/k;->r:Lnn/h;

    new-instance p2, Lnn/k$b;

    invoke-direct {p2, p1, v0}, Lnn/k$b;-><init>(Ltn/d;I)V

    invoke-virtual {p0, p2}, Lnn/k;->g(Lnn/k$b;)V

    return-void
.end method

.method public static m(Ljava/util/List;Ljava/util/Set;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ltn/e;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Lqn/a;",
            ">;>;)",
            "Ljava/util/List<",
            "Ltn/e;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Class;

    sget-object v1, Lnn/k;->w:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ltn/e;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static t()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "Lqn/a;",
            ">;>;"
        }
    .end annotation

    sget-object v0, Lnn/k;->v:Ljava/util/Set;

    return-object v0
.end method

.method public static x(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    return-object p0

    :cond_0
    const v1, 0xfffd

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final A(Ljava/lang/String;I)V
    .locals 3

    iget v0, p0, Lnn/k;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lnn/k;->b:I

    const/4 v0, 0x0

    iput v0, p0, Lnn/k;->c:I

    iput v0, p0, Lnn/k;->d:I

    iput-boolean v0, p0, Lnn/k;->e:Z

    invoke-static {p1}, Lnn/k;->x(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lnn/k;->p:Lrn/a;

    sget-object v2, Lrn/a;->a:Lrn/a;

    if-eq v1, v2, :cond_0

    iget v1, p0, Lnn/k;->b:I

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v1, v0, p2, v2}, Lqn/y;->e(IIII)Lqn/y;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-static {p1, p2}, Lrn/i;->c(Ljava/lang/CharSequence;Lqn/y;)Lrn/i;

    move-result-object p1

    iput-object p1, p0, Lnn/k;->a:Lrn/i;

    return-void
.end method

.method public final B(I)V
    .locals 3

    iget v0, p0, Lnn/k;->g:I

    if-lt p1, v0, :cond_0

    iget v1, p0, Lnn/k;->f:I

    iput v1, p0, Lnn/k;->c:I

    iput v0, p0, Lnn/k;->d:I

    :cond_0
    iget-object v0, p0, Lnn/k;->a:Lrn/i;

    invoke-virtual {v0}, Lrn/i;->a()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    :goto_0
    iget v1, p0, Lnn/k;->d:I

    if-ge v1, p1, :cond_1

    iget v2, p0, Lnn/k;->c:I

    if-eq v2, v0, :cond_1

    invoke-virtual {p0}, Lnn/k;->l()V

    goto :goto_0

    :cond_1
    if-le v1, p1, :cond_2

    iget v0, p0, Lnn/k;->c:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iput v0, p0, Lnn/k;->c:I

    iput p1, p0, Lnn/k;->d:I

    iput-boolean v1, p0, Lnn/k;->e:Z

    return-void

    :cond_2
    const/4 p1, 0x0

    iput-boolean p1, p0, Lnn/k;->e:Z

    return-void
.end method

.method public final C(I)V
    .locals 2

    iget v0, p0, Lnn/k;->f:I

    if-lt p1, v0, :cond_0

    iput v0, p0, Lnn/k;->c:I

    iget v0, p0, Lnn/k;->g:I

    iput v0, p0, Lnn/k;->d:I

    :cond_0
    iget-object v0, p0, Lnn/k;->a:Lrn/i;

    invoke-virtual {v0}, Lrn/i;->a()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    :goto_0
    iget v1, p0, Lnn/k;->c:I

    if-ge v1, p1, :cond_1

    if-eq v1, v0, :cond_1

    invoke-virtual {p0}, Lnn/k;->l()V

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    iput-boolean p1, p0, Lnn/k;->e:Z

    return-void
.end method

.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lnn/k;->i:Z

    return v0
.end method

.method public b()Lrn/i;
    .locals 1

    iget-object v0, p0, Lnn/k;->a:Lrn/i;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lnn/k;->d:I

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lnn/k;->h:I

    return v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lnn/k;->f:I

    return v0
.end method

.method public f()Ltn/d;
    .locals 2

    iget-object v0, p0, Lnn/k;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnn/k$b;

    invoke-static {v0}, Lnn/k$b;->a(Lnn/k$b;)Ltn/d;

    move-result-object v0

    return-object v0
.end method

.method public final g(Lnn/k$b;)V
    .locals 1

    iget-object v0, p0, Lnn/k;->t:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public getIndex()I
    .locals 1

    iget v0, p0, Lnn/k;->c:I

    return v0
.end method

.method public final h(Lnn/k$b;)V
    .locals 2

    :goto_0
    invoke-virtual {p0}, Lnn/k;->f()Ltn/d;

    move-result-object v0

    invoke-static {p1}, Lnn/k$b;->a(Lnn/k$b;)Ltn/d;

    move-result-object v1

    invoke-interface {v1}, Ltn/d;->d()Lqn/a;

    move-result-object v1

    invoke-interface {v0, v1}, Ltn/d;->e(Lqn/a;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lnn/k;->n(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lnn/k;->f()Ltn/d;

    move-result-object v0

    invoke-interface {v0}, Ltn/d;->d()Lqn/a;

    move-result-object v0

    invoke-static {p1}, Lnn/k$b;->a(Lnn/k$b;)Ltn/d;

    move-result-object v1

    invoke-interface {v1}, Ltn/d;->d()Lqn/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqn/s;->c(Lqn/s;)V

    invoke-virtual {p0, p1}, Lnn/k;->g(Lnn/k$b;)V

    return-void
.end method

.method public final i(Ltn/d;)V
    .locals 2

    invoke-interface {p1}, Ltn/d;->j()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqn/e;

    iget-object v1, p0, Lnn/k;->s:Lnn/f;

    invoke-virtual {v1, v0}, Lnn/f;->a(Lqn/e;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final j()V
    .locals 5

    iget-boolean v0, p0, Lnn/k;->e:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lnn/k;->c:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lnn/k;->a:Lrn/i;

    invoke-virtual {v1}, Lrn/i;->a()Ljava/lang/CharSequence;

    move-result-object v1

    iget-object v2, p0, Lnn/k;->a:Lrn/i;

    invoke-virtual {v2}, Lrn/i;->a()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-interface {v1, v0, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    iget v1, p0, Lnn/k;->d:I

    invoke-static {v1}, Lpn/f;->a(I)I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    add-int/2addr v3, v1

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    const/16 v4, 0x20

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    iget v0, p0, Lnn/k;->c:I

    if-nez v0, :cond_2

    iget-object v0, p0, Lnn/k;->a:Lrn/i;

    invoke-virtual {v0}, Lrn/i;->a()Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lnn/k;->a:Lrn/i;

    invoke-virtual {v0}, Lrn/i;->a()Ljava/lang/CharSequence;

    move-result-object v0

    iget v1, p0, Lnn/k;->c:I

    iget-object v2, p0, Lnn/k;->a:Lrn/i;

    invoke-virtual {v2}, Lrn/i;->a()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-interface {v0, v1, v2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    :goto_1
    iget-object v1, p0, Lnn/k;->p:Lrn/a;

    sget-object v2, Lrn/a;->c:Lrn/a;

    if-ne v1, v2, :cond_3

    iget v1, p0, Lnn/k;->c:I

    iget-object v2, p0, Lnn/k;->a:Lrn/i;

    invoke-virtual {v2}, Lrn/i;->b()Lqn/y;

    move-result-object v2

    invoke-virtual {v2}, Lqn/y;->c()I

    move-result v2

    if-ge v1, v2, :cond_3

    iget-object v1, p0, Lnn/k;->a:Lrn/i;

    invoke-virtual {v1}, Lrn/i;->b()Lqn/y;

    move-result-object v1

    iget v2, p0, Lnn/k;->c:I

    invoke-virtual {v1, v2}, Lqn/y;->f(I)Lqn/y;

    move-result-object v1

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    :goto_2
    invoke-virtual {p0}, Lnn/k;->f()Ltn/d;

    move-result-object v2

    invoke-static {v0, v1}, Lrn/i;->c(Ljava/lang/CharSequence;Lqn/y;)Lrn/i;

    move-result-object v0

    invoke-interface {v2, v0}, Ltn/d;->g(Lrn/i;)V

    invoke-virtual {p0}, Lnn/k;->k()V

    return-void
.end method

.method public final k()V
    .locals 4

    iget-object v0, p0, Lnn/k;->p:Lrn/a;

    sget-object v1, Lrn/a;->a:Lrn/a;

    if-eq v0, v1, :cond_1

    const/4 v0, 0x1

    :goto_0
    iget-object v1, p0, Lnn/k;->t:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lnn/k;->t:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnn/k$b;

    invoke-static {v1}, Lnn/k$b;->b(Lnn/k$b;)I

    move-result v2

    iget v3, p0, Lnn/k;->c:I

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    iget-object v3, p0, Lnn/k;->a:Lrn/i;

    invoke-virtual {v3}, Lrn/i;->a()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    sub-int/2addr v3, v2

    if-eqz v3, :cond_0

    invoke-static {v1}, Lnn/k$b;->a(Lnn/k$b;)Ltn/d;

    move-result-object v1

    iget-object v3, p0, Lnn/k;->a:Lrn/i;

    invoke-virtual {v3}, Lrn/i;->b()Lqn/y;

    move-result-object v3

    invoke-virtual {v3, v2}, Lqn/y;->f(I)Lqn/y;

    move-result-object v2

    invoke-interface {v1, v2}, Ltn/d;->i(Lqn/y;)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final l()V
    .locals 2

    iget-object v0, p0, Lnn/k;->a:Lrn/i;

    invoke-virtual {v0}, Lrn/i;->a()Ljava/lang/CharSequence;

    move-result-object v0

    iget v1, p0, Lnn/k;->c:I

    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    iget v1, p0, Lnn/k;->c:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lnn/k;->c:I

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    iget v0, p0, Lnn/k;->d:I

    invoke-static {v0}, Lpn/f;->a(I)I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lnn/k;->d:I

    return-void

    :cond_0
    iget v0, p0, Lnn/k;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lnn/k;->d:I

    return-void
.end method

.method public final n(I)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    invoke-virtual {p0}, Lnn/k;->o()Lnn/k$b;

    move-result-object v1

    invoke-static {v1}, Lnn/k$b;->a(Lnn/k$b;)Ltn/d;

    move-result-object v1

    invoke-virtual {p0, v1}, Lnn/k;->p(Ltn/d;)V

    iget-object v2, p0, Lnn/k;->u:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final o()Lnn/k$b;
    .locals 2

    iget-object v0, p0, Lnn/k;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnn/k$b;

    return-object v0
.end method

.method public final p(Ltn/d;)V
    .locals 0

    invoke-virtual {p0, p1}, Lnn/k;->i(Ltn/d;)V

    invoke-interface {p1}, Ltn/d;->h()V

    return-void
.end method

.method public final q()Lqn/f;
    .locals 1

    iget-object v0, p0, Lnn/k;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p0, v0}, Lnn/k;->n(I)V

    invoke-virtual {p0}, Lnn/k;->y()V

    iget-object v0, p0, Lnn/k;->r:Lnn/h;

    invoke-virtual {v0}, Lnn/h;->k()Lqn/f;

    move-result-object v0

    return-object v0
.end method

.method public final r(Ltn/d;)Lnn/d;
    .locals 4

    iget-object v0, p0, Lnn/k;->t:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lnn/k;->q:I

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    return-object v2

    :cond_0
    new-instance v0, Lnn/k$a;

    invoke-direct {v0, p1}, Lnn/k$a;-><init>(Ltn/d;)V

    iget-object p1, p0, Lnn/k;->j:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltn/e;

    invoke-interface {v1, p0, v0}, Ltn/e;->a(Ltn/h;Ltn/g;)Ltn/f;

    move-result-object v1

    instance-of v3, v1, Lnn/d;

    if-eqz v3, :cond_1

    check-cast v1, Lnn/d;

    return-object v1

    :cond_2
    return-object v2
.end method

.method public final s()V
    .locals 5

    iget v0, p0, Lnn/k;->c:I

    iget v1, p0, Lnn/k;->d:I

    const/4 v2, 0x1

    iput-boolean v2, p0, Lnn/k;->i:Z

    iget-object v2, p0, Lnn/k;->a:Lrn/i;

    invoke-virtual {v2}, Lrn/i;->a()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    :goto_0
    if-ge v0, v2, :cond_2

    iget-object v3, p0, Lnn/k;->a:Lrn/i;

    invoke-virtual {v3}, Lrn/i;->a()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    const/16 v4, 0x9

    if-eq v3, v4, :cond_1

    const/16 v4, 0x20

    if-eq v3, v4, :cond_0

    const/4 v2, 0x0

    iput-boolean v2, p0, Lnn/k;->i:Z

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    rem-int/lit8 v3, v1, 0x4

    rsub-int/lit8 v3, v3, 0x4

    add-int/2addr v1, v3

    goto :goto_0

    :cond_2
    :goto_1
    iput v0, p0, Lnn/k;->f:I

    iput v1, p0, Lnn/k;->g:I

    iget v0, p0, Lnn/k;->d:I

    sub-int/2addr v1, v0

    iput v1, p0, Lnn/k;->h:I

    return-void
.end method

.method public u(Ljava/lang/String;)Lqn/f;
    .locals 4

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-static {p1, v0}, Lvn/d;->b(Ljava/lang/CharSequence;I)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2, v0}, Lnn/k;->v(Ljava/lang/String;I)V

    add-int/lit8 v0, v1, 0x1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v0, v2, :cond_0

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0xd

    if-ne v2, v3, :cond_0

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0xa

    if-ne v2, v3, :cond_0

    add-int/lit8 v1, v1, 0x2

    move v0, v1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_3

    :cond_2
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lnn/k;->v(Ljava/lang/String;I)V

    :cond_3
    invoke-virtual {p0}, Lnn/k;->q()Lqn/f;

    move-result-object p1

    return-object p1
.end method

.method public final v(Ljava/lang/String;I)V
    .locals 10

    invoke-virtual {p0, p1, p2}, Lnn/k;->A(Ljava/lang/String;I)V

    const/4 p1, 0x1

    move p2, p1

    move v0, p2

    :goto_0
    iget-object v1, p0, Lnn/k;->t:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, -0x1

    if-ge p2, v1, :cond_3

    iget-object v1, p0, Lnn/k;->t:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnn/k$b;

    invoke-static {v1}, Lnn/k$b;->a(Lnn/k$b;)Ltn/d;

    move-result-object v3

    invoke-virtual {p0}, Lnn/k;->s()V

    invoke-interface {v3, p0}, Ltn/d;->b(Ltn/h;)Ltn/c;

    move-result-object v3

    instance-of v4, v3, Lnn/b;

    if-eqz v4, :cond_3

    check-cast v3, Lnn/b;

    invoke-virtual {p0}, Lnn/k;->getIndex()I

    move-result v4

    invoke-static {v1, v4}, Lnn/k$b;->c(Lnn/k$b;I)V

    invoke-virtual {v3}, Lnn/b;->g()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lnn/k;->k()V

    iget-object p1, p0, Lnn/k;->t:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    sub-int/2addr p1, p2

    invoke-virtual {p0, p1}, Lnn/k;->n(I)V

    return-void

    :cond_0
    invoke-virtual {v3}, Lnn/b;->f()I

    move-result v1

    if-eq v1, v2, :cond_1

    invoke-virtual {v3}, Lnn/b;->f()I

    move-result v1

    invoke-virtual {p0, v1}, Lnn/k;->C(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lnn/b;->e()I

    move-result v1

    if-eq v1, v2, :cond_2

    invoke-virtual {v3}, Lnn/b;->e()I

    move-result v1

    invoke-virtual {p0, v1}, Lnn/k;->B(I)V

    :cond_2
    :goto_1
    add-int/lit8 v0, v0, 0x1

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_3
    iget-object p2, p0, Lnn/k;->t:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    sub-int/2addr p2, v0

    iget-object v1, p0, Lnn/k;->t:Ljava/util/List;

    sub-int/2addr v0, p1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnn/k$b;

    invoke-static {v0}, Lnn/k$b;->a(Lnn/k$b;)Ltn/d;

    move-result-object v0

    iget v1, p0, Lnn/k;->c:I

    invoke-interface {v0}, Ltn/d;->d()Lqn/a;

    move-result-object v3

    instance-of v3, v3, Lqn/w;

    const/4 v4, 0x0

    if-nez v3, :cond_5

    invoke-interface {v0}, Ltn/d;->a()Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    move v3, v4

    goto :goto_3

    :cond_5
    :goto_2
    move v3, p1

    :goto_3
    move v5, v4

    :goto_4
    if-eqz v3, :cond_12

    iget v1, p0, Lnn/k;->c:I

    invoke-virtual {p0}, Lnn/k;->s()V

    invoke-virtual {p0}, Lnn/k;->a()Z

    move-result v6

    if-nez v6, :cond_11

    iget v6, p0, Lnn/k;->h:I

    sget v7, Lpn/f;->a:I

    if-ge v6, v7, :cond_6

    iget-object v6, p0, Lnn/k;->a:Lrn/i;

    invoke-virtual {v6}, Lrn/i;->a()Ljava/lang/CharSequence;

    move-result-object v6

    iget v7, p0, Lnn/k;->f:I

    invoke-static {v6, v7}, Lvn/d;->e(Ljava/lang/CharSequence;I)Z

    move-result v6

    if-eqz v6, :cond_6

    goto/16 :goto_9

    :cond_6
    invoke-virtual {p0, v0}, Lnn/k;->r(Ltn/d;)Lnn/d;

    move-result-object v6

    if-nez v6, :cond_7

    iget v2, p0, Lnn/k;->f:I

    invoke-virtual {p0, v2}, Lnn/k;->C(I)V

    goto/16 :goto_a

    :cond_7
    invoke-virtual {p0}, Lnn/k;->getIndex()I

    move-result v5

    if-lez p2, :cond_8

    invoke-virtual {p0, p2}, Lnn/k;->n(I)V

    move p2, v4

    :cond_8
    invoke-virtual {v6}, Lnn/d;->h()I

    move-result v7

    if-eq v7, v2, :cond_9

    invoke-virtual {v6}, Lnn/d;->h()I

    move-result v7

    invoke-virtual {p0, v7}, Lnn/k;->C(I)V

    goto :goto_5

    :cond_9
    invoke-virtual {v6}, Lnn/d;->g()I

    move-result v7

    if-eq v7, v2, :cond_a

    invoke-virtual {v6}, Lnn/d;->g()I

    move-result v7

    invoke-virtual {p0, v7}, Lnn/k;->B(I)V

    :cond_a
    :goto_5
    invoke-virtual {v6}, Lnn/d;->i()I

    move-result v7

    if-ge v7, p1, :cond_b

    invoke-virtual {v6}, Lnn/d;->j()Z

    move-result v7

    if-eqz v7, :cond_e

    :cond_b
    invoke-virtual {p0}, Lnn/k;->f()Ltn/d;

    move-result-object v7

    instance-of v8, v7, Lnn/z;

    if-eqz v8, :cond_d

    check-cast v7, Lnn/z;

    invoke-virtual {v6}, Lnn/d;->j()Z

    move-result v8

    if-eqz v8, :cond_c

    const v8, 0x7fffffff

    goto :goto_6

    :cond_c
    invoke-virtual {v6}, Lnn/d;->i()I

    move-result v8

    :goto_6
    invoke-virtual {p0, v8, v7}, Lnn/k;->z(ILnn/z;)Ljava/util/List;

    move-result-object v7

    goto :goto_7

    :cond_d
    invoke-virtual {v6}, Lnn/d;->j()Z

    move-result v8

    if-eqz v8, :cond_e

    invoke-virtual {p0, v7}, Lnn/k;->w(Ltn/d;)Ljava/util/List;

    move-result-object v7

    goto :goto_7

    :cond_e
    const/4 v7, 0x0

    :goto_7
    invoke-virtual {v6}, Lnn/d;->f()[Ltn/d;

    move-result-object v6

    array-length v8, v6

    move v9, v4

    :goto_8
    if-ge v9, v8, :cond_10

    aget-object v0, v6, v9

    new-instance v3, Lnn/k$b;

    invoke-direct {v3, v0, v5}, Lnn/k$b;-><init>(Ltn/d;I)V

    invoke-virtual {p0, v3}, Lnn/k;->h(Lnn/k$b;)V

    if-eqz v7, :cond_f

    invoke-interface {v0}, Ltn/d;->d()Lqn/a;

    move-result-object v3

    invoke-virtual {v3, v7}, Lqn/s;->l(Ljava/util/List;)V

    :cond_f
    invoke-interface {v0}, Ltn/d;->a()Z

    move-result v3

    add-int/lit8 v9, v9, 0x1

    goto :goto_8

    :cond_10
    move v5, p1

    goto/16 :goto_4

    :cond_11
    :goto_9
    iget v2, p0, Lnn/k;->f:I

    invoke-virtual {p0, v2}, Lnn/k;->C(I)V

    :cond_12
    :goto_a
    if-nez v5, :cond_13

    invoke-virtual {p0}, Lnn/k;->a()Z

    move-result v2

    if-nez v2, :cond_13

    invoke-virtual {p0}, Lnn/k;->f()Ltn/d;

    move-result-object v2

    invoke-interface {v2}, Ltn/d;->c()Z

    move-result v2

    if-eqz v2, :cond_13

    iget-object p2, p0, Lnn/k;->t:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, p1

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnn/k$b;

    invoke-static {p1, v1}, Lnn/k$b;->c(Lnn/k$b;I)V

    invoke-virtual {p0}, Lnn/k;->j()V

    return-void

    :cond_13
    if-lez p2, :cond_14

    invoke-virtual {p0, p2}, Lnn/k;->n(I)V

    :cond_14
    invoke-interface {v0}, Ltn/d;->a()Z

    move-result p1

    if-nez p1, :cond_15

    invoke-virtual {p0}, Lnn/k;->j()V

    return-void

    :cond_15
    invoke-virtual {p0}, Lnn/k;->a()Z

    move-result p1

    if-nez p1, :cond_16

    new-instance p1, Lnn/z;

    invoke-direct {p1}, Lnn/z;-><init>()V

    new-instance p2, Lnn/k$b;

    invoke-direct {p2, p1, v1}, Lnn/k$b;-><init>(Ltn/d;I)V

    invoke-virtual {p0, p2}, Lnn/k;->h(Lnn/k$b;)V

    invoke-virtual {p0}, Lnn/k;->j()V

    return-void

    :cond_16
    invoke-virtual {p0}, Lnn/k;->k()V

    return-void
.end method

.method public final w(Ltn/d;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltn/d;",
            ")",
            "Ljava/util/List<",
            "Lqn/y;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lnn/k;->o()Lnn/k$b;

    invoke-interface {p1}, Ltn/d;->h()V

    invoke-interface {p1}, Ltn/d;->d()Lqn/a;

    move-result-object v0

    invoke-virtual {v0}, Lqn/s;->n()V

    invoke-interface {p1}, Ltn/d;->d()Lqn/a;

    move-result-object p1

    invoke-virtual {p1}, Lqn/s;->h()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final y()V
    .locals 6

    new-instance v0, Lnn/q;

    iget-object v1, p0, Lnn/k;->l:Ljava/util/List;

    iget-object v2, p0, Lnn/k;->m:Ljava/util/List;

    iget-object v3, p0, Lnn/k;->n:Ljava/util/List;

    iget-object v4, p0, Lnn/k;->o:Ljava/util/Set;

    iget-object v5, p0, Lnn/k;->s:Lnn/f;

    invoke-direct/range {v0 .. v5}, Lnn/q;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lnn/f;)V

    iget-object v1, p0, Lnn/k;->k:Lrn/d;

    invoke-interface {v1, v0}, Lrn/d;->a(Lrn/c;)Lrn/b;

    move-result-object v0

    iget-object v1, p0, Lnn/k;->u:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltn/d;

    invoke-interface {v2, v0}, Ltn/d;->f(Lrn/b;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final z(ILnn/z;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lnn/z;",
            ")",
            "Ljava/util/List<",
            "Lqn/y;",
            ">;"
        }
    .end annotation

    invoke-virtual {p2, p1}, Lnn/z;->l(I)Ljava/util/List;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p0, p2}, Lnn/k;->n(I)V

    return-object p1
.end method
