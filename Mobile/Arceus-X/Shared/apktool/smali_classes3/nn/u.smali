.class public Lnn/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrn/b;
.implements Lsn/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnn/u$b;,
        Lnn/u$c;,
        Lnn/u$d;
    }
.end annotation


# instance fields
.field public final a:Lrn/c;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lsn/b;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Character;",
            "Lun/a;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lsn/e;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/BitSet;

.field public final f:Ljava/util/BitSet;

.field public g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Character;",
            "Ljava/util/List<",
            "Lsn/a;",
            ">;>;"
        }
    .end annotation
.end field

.field public h:Lsn/i;

.field public i:Z

.field public j:I

.field public k:Lnn/g;

.field public l:Lnn/e;


# direct methods
.method public constructor <init>(Lrn/c;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnn/u;->a:Lrn/c;

    invoke-interface {p1}, Lrn/c;->e()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lnn/u;->h(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lnn/u;->b:Ljava/util/List;

    invoke-interface {p1}, Lrn/c;->c()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lnn/u;->g(Ljava/util/List;)Ljava/util/Map;

    move-result-object v1

    iput-object v1, p0, Lnn/u;->c:Ljava/util/Map;

    invoke-interface {p1}, Lrn/c;->b()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0, v2}, Lnn/u;->j(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lnn/u;->d:Ljava/util/List;

    invoke-interface {p1}, Lrn/c;->d()Ljava/util/Set;

    move-result-object p1

    invoke-static {p1}, Lnn/u;->i(Ljava/util/Set;)Ljava/util/BitSet;

    move-result-object p1

    iput-object p1, p0, Lnn/u;->f:Ljava/util/BitSet;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-static {p1, v1, v0}, Lnn/u;->k(Ljava/util/BitSet;Ljava/util/Set;Ljava/util/List;)Ljava/util/BitSet;

    move-result-object p1

    iput-object p1, p0, Lnn/u;->e:Ljava/util/BitSet;

    return-void
.end method

.method public static A(Lsn/i;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lsn/i;->o()Lsn/h;

    move-result-object v0

    invoke-static {p0}, Lpn/e;->e(Lsn/i;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lsn/i;->o()Lsn/h;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lsn/i;->d(Lsn/h;Lsn/h;)Lrn/j;

    move-result-object p0

    invoke-virtual {p0}, Lrn/j;->c()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lpn/c;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Character;)Ljava/util/List;
    .locals 0

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-object p0
.end method

.method public static e(CLun/a;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(C",
            "Lun/a;",
            "Ljava/util/Map<",
            "Ljava/lang/Character;",
            "Lun/a;",
            ">;)V"
        }
    .end annotation

    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    invoke-interface {p2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lun/a;

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Delimiter processor conflict with delimiter char \'"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string p0, "\'"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static f(Ljava/lang/Iterable;Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Lun/a;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/Character;",
            "Lun/a;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lun/a;

    invoke-interface {v0}, Lun/a;->d()C

    move-result v1

    invoke-interface {v0}, Lun/a;->b()C

    move-result v2

    if-ne v1, v2, :cond_2

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lun/a;

    if-eqz v2, :cond_1

    invoke-interface {v2}, Lun/a;->d()C

    move-result v3

    invoke-interface {v2}, Lun/a;->b()C

    move-result v4

    if-ne v3, v4, :cond_1

    instance-of v3, v2, Lnn/a0;

    if-eqz v3, :cond_0

    check-cast v2, Lnn/a0;

    goto :goto_1

    :cond_0
    new-instance v3, Lnn/a0;

    invoke-direct {v3, v1}, Lnn/a0;-><init>(C)V

    invoke-virtual {v3, v2}, Lnn/a0;->e(Lun/a;)V

    move-object v2, v3

    :goto_1
    invoke-virtual {v2, v0}, Lnn/a0;->e(Lun/a;)V

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    invoke-interface {p1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-static {v1, v0, p1}, Lnn/u;->e(CLun/a;Ljava/util/Map;)V

    goto :goto_0

    :cond_2
    invoke-static {v1, v0, p1}, Lnn/u;->e(CLun/a;Ljava/util/Map;)V

    invoke-static {v2, v0, p1}, Lnn/u;->e(CLun/a;Ljava/util/Map;)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public static g(Ljava/util/List;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lun/a;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/Character;",
            "Lun/a;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lon/a;

    invoke-direct {v1}, Lon/a;-><init>()V

    new-instance v2, Lon/m;

    invoke-direct {v2}, Lon/m;-><init>()V

    invoke-static {v1, v2}, Lnn/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v0}, Lnn/u;->f(Ljava/lang/Iterable;Ljava/util/Map;)V

    invoke-static {p0, v0}, Lnn/u;->f(Ljava/lang/Iterable;Ljava/util/Map;)V

    return-object v0
.end method

.method public static i(Ljava/util/Set;)Ljava/util/BitSet;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/Character;",
            ">;)",
            "Ljava/util/BitSet;"
        }
    .end annotation

    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Character;

    invoke-virtual {v1}, Ljava/lang/Character;->charValue()C

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/BitSet;->set(I)V

    goto :goto_0

    :cond_0
    const/16 p0, 0x21

    invoke-virtual {v0, p0}, Ljava/util/BitSet;->set(I)V

    return-object v0
.end method

.method public static k(Ljava/util/BitSet;Ljava/util/Set;Ljava/util/List;)Ljava/util/BitSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/BitSet;",
            "Ljava/util/Set<",
            "Ljava/lang/Character;",
            ">;",
            "Ljava/util/List<",
            "Lsn/b;",
            ">;)",
            "Ljava/util/BitSet;"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/util/BitSet;->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/BitSet;

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Character;

    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v0

    invoke-virtual {p0, v0}, Ljava/util/BitSet;->set(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lsn/b;

    invoke-interface {p2}, Lsn/b;->b()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Character;

    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v0

    invoke-virtual {p0, v0}, Ljava/util/BitSet;->set(I)V

    goto :goto_1

    :cond_2
    const/16 p1, 0x5b

    invoke-virtual {p0, p1}, Ljava/util/BitSet;->set(I)V

    const/16 p1, 0x5d

    invoke-virtual {p0, p1}, Ljava/util/BitSet;->set(I)V

    const/16 p1, 0x21

    invoke-virtual {p0, p1}, Ljava/util/BitSet;->set(I)V

    const/16 p1, 0xa

    invoke-virtual {p0, p1}, Ljava/util/BitSet;->set(I)V

    return-object p0
.end method

.method public static t(Lsn/i;)Lnn/u$c;
    .locals 4

    const/16 v0, 0x28

    invoke-virtual {p0, v0}, Lsn/i;->i(C)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p0}, Lsn/i;->r()I

    invoke-static {p0}, Lnn/u;->v(Lsn/i;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {p0}, Lsn/i;->r()I

    move-result v2

    const/4 v3, 0x1

    if-lt v2, v3, :cond_2

    invoke-static {p0}, Lnn/u;->A(Lsn/i;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lsn/i;->r()I

    goto :goto_0

    :cond_2
    move-object v2, v1

    :goto_0
    const/16 v3, 0x29

    invoke-virtual {p0, v3}, Lsn/i;->i(C)Z

    move-result p0

    if-nez p0, :cond_3

    return-object v1

    :cond_3
    new-instance p0, Lnn/u$c;

    invoke-direct {p0, v0, v2}, Lnn/u$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public static v(Lsn/i;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lsn/i;->l()C

    move-result v0

    invoke-virtual {p0}, Lsn/i;->o()Lsn/h;

    move-result-object v1

    invoke-static {p0}, Lpn/e;->b(Lsn/i;)Z

    move-result v2

    if-nez v2, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/16 v2, 0x3c

    if-ne v0, v2, :cond_1

    invoke-virtual {p0}, Lsn/i;->o()Lsn/h;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lsn/i;->d(Lsn/h;Lsn/h;)Lrn/j;

    move-result-object p0

    invoke-virtual {p0}, Lrn/j;->c()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lsn/i;->o()Lsn/h;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lsn/i;->d(Lsn/h;Lsn/h;)Lrn/j;

    move-result-object p0

    invoke-virtual {p0}, Lrn/j;->c()Ljava/lang/String;

    move-result-object p0

    :goto_0
    invoke-static {p0}, Lpn/c;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static x(Lsn/i;)Ljava/lang/String;
    .locals 4

    const/16 v0, 0x5b

    invoke-virtual {p0, v0}, Lsn/i;->i(C)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p0}, Lsn/i;->o()Lsn/h;

    move-result-object v0

    invoke-static {p0}, Lpn/e;->d(Lsn/i;)Z

    move-result v2

    if-nez v2, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {p0}, Lsn/i;->o()Lsn/h;

    move-result-object v2

    const/16 v3, 0x5d

    invoke-virtual {p0, v3}, Lsn/i;->i(C)Z

    move-result v3

    if-nez v3, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {p0, v0, v2}, Lsn/i;->d(Lsn/h;Lsn/h;)Lrn/j;

    move-result-object p0

    invoke-virtual {p0}, Lrn/j;->c()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v2, 0x3e7

    if-le v0, v2, :cond_3

    return-object v1

    :cond_3
    return-object p0
.end method


# virtual methods
.method public final B()Lqn/s;
    .locals 5

    iget-object v0, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v0}, Lsn/i;->o()Lsn/h;

    move-result-object v0

    iget-object v1, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v1}, Lsn/i;->h()V

    iget-object v1, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v1}, Lsn/i;->o()Lsn/h;

    move-result-object v1

    iget-object v2, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v2, v0, v1}, Lsn/i;->d(Lsn/h;Lsn/h;)Lrn/j;

    move-result-object v2

    invoke-virtual {p0, v2}, Lnn/u;->M(Lrn/j;)Lqn/b0;

    move-result-object v2

    iget-object v3, p0, Lnn/u;->l:Lnn/e;

    iget-object v4, p0, Lnn/u;->k:Lnn/g;

    invoke-static {v2, v0, v1, v3, v4}, Lnn/e;->a(Lqn/b0;Lsn/h;Lsn/h;Lnn/e;Lnn/g;)Lnn/e;

    move-result-object v0

    invoke-virtual {p0, v0}, Lnn/u;->d(Lnn/e;)V

    return-object v2
.end method

.method public final C()Lqn/s;
    .locals 5

    iget-object v0, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v0}, Lsn/i;->o()Lsn/h;

    move-result-object v0

    iget-object v1, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v1}, Lsn/i;->h()V

    :goto_0
    iget-object v1, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v1}, Lsn/i;->l()C

    move-result v1

    if-eqz v1, :cond_1

    iget-object v2, p0, Lnn/u;->e:Ljava/util/BitSet;

    invoke-virtual {v2, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v1}, Lsn/i;->h()V

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v2, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v2}, Lsn/i;->o()Lsn/h;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lsn/i;->d(Lsn/h;Lsn/h;)Lrn/j;

    move-result-object v0

    invoke-virtual {v0}, Lrn/j;->c()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0xa

    const/4 v4, 0x0

    if-ne v1, v3, :cond_2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    const/16 v3, 0x20

    invoke-static {v3, v2, v1, v4}, Lvn/d;->j(CLjava/lang/CharSequence;II)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    sub-int/2addr v3, v1

    iput v3, p0, Lnn/u;->j:I

    invoke-virtual {v2, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_2
    if-nez v1, :cond_3

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-static {v2, v1, v4}, Lvn/d;->l(Ljava/lang/CharSequence;II)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v2, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    :cond_3
    :goto_2
    new-instance v1, Lqn/b0;

    invoke-direct {v1, v2}, Lqn/b0;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lrn/j;->e()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Lqn/s;->l(Ljava/util/List;)V

    return-object v1
.end method

.method public final D(Lnn/g;)V
    .locals 11

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lnn/u;->k:Lnn/g;

    :goto_0
    if-eqz v1, :cond_0

    iget-object v2, v1, Lnn/g;->f:Lnn/g;

    if-eq v2, p1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    :goto_1
    if-eqz v1, :cond_b

    iget-char v2, v1, Lnn/g;->b:C

    iget-object v3, p0, Lnn/u;->c:Ljava/util/Map;

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lun/a;

    invoke-virtual {v1}, Lnn/g;->c()Z

    move-result v4

    if-eqz v4, :cond_a

    if-nez v3, :cond_1

    goto/16 :goto_6

    :cond_1
    invoke-interface {v3}, Lun/a;->d()C

    move-result v4

    iget-object v5, v1, Lnn/g;->f:Lnn/g;

    const/4 v6, 0x0

    move v7, v6

    move v8, v7

    :goto_2
    const/4 v9, 0x1

    if-eqz v5, :cond_4

    if-eq v5, p1, :cond_4

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v10

    invoke-interface {v0, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-eq v5, v10, :cond_4

    invoke-virtual {v5}, Lnn/g;->g()Z

    move-result v10

    if-eqz v10, :cond_3

    iget-char v10, v5, Lnn/g;->b:C

    if-ne v10, v4, :cond_3

    invoke-interface {v3, v5, v1}, Lun/a;->a(Lun/b;Lun/b;)I

    move-result v7

    if-lez v7, :cond_2

    move v3, v9

    move v8, v3

    goto :goto_3

    :cond_2
    move v8, v9

    :cond_3
    iget-object v5, v5, Lnn/g;->f:Lnn/g;

    goto :goto_2

    :cond_4
    move v3, v6

    :goto_3
    if-nez v3, :cond_6

    if-nez v8, :cond_5

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    iget-object v3, v1, Lnn/g;->f:Lnn/g;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lnn/g;->g()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {p0, v1}, Lnn/u;->G(Lnn/g;)V

    :cond_5
    iget-object v1, v1, Lnn/g;->g:Lnn/g;

    goto :goto_1

    :cond_6
    move v2, v6

    :goto_4
    if-ge v2, v7, :cond_7

    iget-object v3, v5, Lnn/g;->a:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    sub-int/2addr v4, v9

    invoke-interface {v3, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqn/b0;

    invoke-virtual {v3}, Lqn/s;->n()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_7
    move v2, v6

    :goto_5
    if-ge v2, v7, :cond_8

    iget-object v3, v1, Lnn/g;->a:Ljava/util/List;

    invoke-interface {v3, v6}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqn/b0;

    invoke-virtual {v3}, Lqn/s;->n()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_8
    invoke-virtual {p0, v5, v1}, Lnn/u;->H(Lnn/g;Lnn/g;)V

    invoke-virtual {v5}, Lnn/g;->length()I

    move-result v2

    if-nez v2, :cond_9

    invoke-virtual {p0, v5}, Lnn/u;->F(Lnn/g;)V

    :cond_9
    invoke-virtual {v1}, Lnn/g;->length()I

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, v1, Lnn/g;->g:Lnn/g;

    invoke-virtual {p0, v1}, Lnn/u;->F(Lnn/g;)V

    move-object v1, v2

    goto/16 :goto_1

    :cond_a
    :goto_6
    iget-object v1, v1, Lnn/g;->g:Lnn/g;

    goto/16 :goto_1

    :cond_b
    :goto_7
    iget-object v0, p0, Lnn/u;->k:Lnn/g;

    if-eqz v0, :cond_c

    if-eq v0, p1, :cond_c

    invoke-virtual {p0, v0}, Lnn/u;->G(Lnn/g;)V

    goto :goto_7

    :cond_c
    return-void
.end method

.method public final E(Lnn/g;)V
    .locals 2

    iget-object v0, p1, Lnn/g;->f:Lnn/g;

    if-eqz v0, :cond_0

    iget-object v1, p1, Lnn/g;->g:Lnn/g;

    iput-object v1, v0, Lnn/g;->g:Lnn/g;

    :cond_0
    iget-object p1, p1, Lnn/g;->g:Lnn/g;

    if-nez p1, :cond_1

    iput-object v0, p0, Lnn/u;->k:Lnn/g;

    return-void

    :cond_1
    iput-object v0, p1, Lnn/g;->f:Lnn/g;

    return-void
.end method

.method public final F(Lnn/g;)V
    .locals 0

    invoke-virtual {p0, p1}, Lnn/u;->E(Lnn/g;)V

    return-void
.end method

.method public final G(Lnn/g;)V
    .locals 0

    invoke-virtual {p0, p1}, Lnn/u;->E(Lnn/g;)V

    return-void
.end method

.method public final H(Lnn/g;Lnn/g;)V
    .locals 1

    iget-object p2, p2, Lnn/g;->f:Lnn/g;

    :goto_0
    if-eqz p2, :cond_0

    if-eq p2, p1, :cond_0

    iget-object v0, p2, Lnn/g;->f:Lnn/g;

    invoke-virtual {p0, p2}, Lnn/u;->G(Lnn/g;)V

    move-object p2, v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final I()V
    .locals 1

    iget-object v0, p0, Lnn/u;->l:Lnn/e;

    iget-object v0, v0, Lnn/e;->f:Lnn/e;

    iput-object v0, p0, Lnn/u;->l:Lnn/e;

    return-void
.end method

.method public final J(Lnn/e;Lqn/s;Z)Lqn/s;
    .locals 3

    :goto_0
    iget-object v0, p0, Lnn/u;->k:Lnn/g;

    if-eqz v0, :cond_0

    iget-object v1, p1, Lnn/e;->g:Lnn/g;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0, v0}, Lnn/u;->G(Lnn/g;)V

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lnn/u;->i:Z

    if-eqz v0, :cond_2

    if-eqz p3, :cond_1

    iget-object v0, p1, Lnn/e;->b:Lsn/h;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p1, Lnn/e;->d:Lsn/h;

    :goto_1
    iget-object v1, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v1}, Lsn/i;->o()Lsn/h;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lsn/i;->d(Lsn/h;Lsn/h;)Lrn/j;

    move-result-object v0

    invoke-virtual {v0}, Lrn/j;->e()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Lqn/s;->l(Ljava/util/List;)V

    :cond_2
    invoke-virtual {p0}, Lnn/u;->I()V

    if-eqz p3, :cond_3

    iget-object v0, p1, Lnn/e;->a:Lqn/b0;

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    iget-object v0, p1, Lnn/e;->c:Lqn/b0;

    :goto_2
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lqn/s;->f()Lqn/s;

    move-result-object v1

    invoke-virtual {v0}, Lqn/s;->n()V

    move-object v0, v1

    goto :goto_2

    :cond_4
    iget-object p1, p1, Lnn/e;->a:Lqn/b0;

    if-eqz p1, :cond_6

    if-nez p3, :cond_5

    goto :goto_3

    :cond_5
    return-object p2

    :cond_6
    :goto_3
    invoke-virtual {p0}, Lnn/u;->m()V

    return-object p2
.end method

.method public K(Lrn/j;)V
    .locals 1

    invoke-static {p1}, Lsn/i;->k(Lrn/j;)Lsn/i;

    move-result-object v0

    iput-object v0, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {p1}, Lrn/j;->e()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, Lnn/u;->i:Z

    const/4 p1, 0x0

    iput p1, p0, Lnn/u;->j:I

    const/4 p1, 0x0

    iput-object p1, p0, Lnn/u;->k:Lnn/g;

    iput-object p1, p0, Lnn/u;->l:Lnn/e;

    invoke-virtual {p0}, Lnn/u;->l()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lnn/u;->g:Ljava/util/Map;

    return-void
.end method

.method public final L(Lun/a;C)Lnn/u$b;
    .locals 8

    iget-object v0, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v0}, Lsn/i;->n()I

    move-result v0

    iget-object v1, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v1}, Lsn/i;->o()Lsn/h;

    move-result-object v1

    iget-object v2, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v2, p2}, Lsn/i;->g(C)I

    move-result v2

    invoke-interface {p1}, Lun/a;->c()I

    move-result v3

    if-ge v2, v3, :cond_0

    iget-object p1, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {p1, v1}, Lsn/i;->q(Lsn/h;)V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v3, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v3, v1}, Lsn/i;->q(Lsn/h;)V

    :goto_0
    iget-object v3, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v3, p2}, Lsn/i;->i(C)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v3}, Lsn/i;->o()Lsn/h;

    move-result-object v4

    invoke-virtual {v3, v1, v4}, Lsn/i;->d(Lsn/h;Lsn/h;)Lrn/j;

    move-result-object v1

    invoke-virtual {p0, v1}, Lnn/u;->M(Lrn/j;)Lqn/b0;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v1}, Lsn/i;->o()Lsn/h;

    move-result-object v1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v1}, Lsn/i;->m()I

    move-result v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v0, :cond_3

    invoke-static {v0}, Lvn/d;->f(I)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_1

    :cond_2
    move v5, v4

    goto :goto_2

    :cond_3
    :goto_1
    move v5, v3

    :goto_2
    if-eqz v0, :cond_5

    invoke-static {v0}, Lvn/d;->h(I)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_3

    :cond_4
    move v0, v4

    goto :goto_4

    :cond_5
    :goto_3
    move v0, v3

    :goto_4
    if-eqz v1, :cond_7

    invoke-static {v1}, Lvn/d;->f(I)Z

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_5

    :cond_6
    move v6, v4

    goto :goto_6

    :cond_7
    :goto_5
    move v6, v3

    :goto_6
    if-eqz v1, :cond_9

    invoke-static {v1}, Lvn/d;->h(I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_7

    :cond_8
    move v1, v4

    goto :goto_8

    :cond_9
    :goto_7
    move v1, v3

    :goto_8
    if-nez v1, :cond_b

    if-eqz v6, :cond_a

    if-nez v0, :cond_a

    if-eqz v5, :cond_b

    :cond_a
    move v7, v3

    goto :goto_9

    :cond_b
    move v7, v4

    :goto_9
    if-nez v0, :cond_d

    if-eqz v5, :cond_c

    if-nez v1, :cond_c

    if-eqz v6, :cond_d

    :cond_c
    move v0, v3

    goto :goto_a

    :cond_d
    move v0, v4

    :goto_a
    const/16 v1, 0x5f

    if-ne p2, v1, :cond_11

    if-eqz v7, :cond_f

    if-eqz v0, :cond_e

    if-eqz v5, :cond_f

    :cond_e
    move p1, v3

    goto :goto_b

    :cond_f
    move p1, v4

    :goto_b
    if-eqz v0, :cond_10

    if-eqz v7, :cond_14

    if-eqz v6, :cond_10

    goto :goto_e

    :cond_10
    move v3, v4

    goto :goto_e

    :cond_11
    if-eqz v7, :cond_12

    invoke-interface {p1}, Lun/a;->d()C

    move-result v1

    if-ne p2, v1, :cond_12

    move v1, v3

    goto :goto_c

    :cond_12
    move v1, v4

    :goto_c
    if-eqz v0, :cond_13

    invoke-interface {p1}, Lun/a;->b()C

    move-result p1

    if-ne p2, p1, :cond_13

    goto :goto_d

    :cond_13
    move v3, v4

    :goto_d
    move p1, v1

    :cond_14
    :goto_e
    new-instance p2, Lnn/u$b;

    invoke-direct {p2, v2, p1, v3}, Lnn/u$b;-><init>(Ljava/util/List;ZZ)V

    return-object p2
.end method

.method public final M(Lrn/j;)Lqn/b0;
    .locals 2

    new-instance v0, Lqn/b0;

    invoke-virtual {p1}, Lrn/j;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lqn/b0;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lrn/j;->e()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lqn/s;->l(Ljava/util/List;)V

    return-object v0
.end method

.method public final N(Lnn/e;Lqn/s;Z)Lqn/s;
    .locals 3

    iget-object v0, p1, Lnn/e;->c:Lqn/b0;

    invoke-virtual {v0}, Lqn/s;->f()Lqn/s;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lqn/s;->f()Lqn/s;

    move-result-object v1

    invoke-virtual {p2, v0}, Lqn/s;->c(Lqn/s;)V

    move-object v0, v1

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lnn/u;->i:Z

    if-eqz v0, :cond_2

    if-eqz p3, :cond_1

    iget-object v0, p1, Lnn/e;->b:Lsn/h;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p1, Lnn/e;->d:Lsn/h;

    :goto_1
    iget-object v1, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v1}, Lsn/i;->o()Lsn/h;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lsn/i;->d(Lsn/h;Lsn/h;)Lrn/j;

    move-result-object v0

    invoke-virtual {v0}, Lrn/j;->e()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Lqn/s;->l(Ljava/util/List;)V

    :cond_2
    iget-object v0, p1, Lnn/e;->g:Lnn/g;

    invoke-virtual {p0, v0}, Lnn/u;->D(Lnn/g;)V

    invoke-virtual {p0, p2}, Lnn/u;->n(Lqn/s;)V

    if-eqz p3, :cond_3

    iget-object p3, p1, Lnn/e;->a:Lqn/b0;

    if-eqz p3, :cond_3

    invoke-virtual {p3}, Lqn/s;->n()V

    :cond_3
    iget-object p3, p1, Lnn/e;->c:Lqn/b0;

    invoke-virtual {p3}, Lqn/s;->n()V

    invoke-virtual {p0}, Lnn/u;->I()V

    iget-object p1, p1, Lnn/e;->a:Lqn/b0;

    if-nez p1, :cond_4

    invoke-virtual {p0}, Lnn/u;->m()V

    :cond_4
    return-object p2
.end method

.method public a()Lsn/i;
    .locals 1

    iget-object v0, p0, Lnn/u;->h:Lsn/i;

    return-object v0
.end method

.method public b(Lrn/j;Lqn/s;)V
    .locals 1

    invoke-virtual {p0, p1}, Lnn/u;->K(Lrn/j;)V

    :cond_0
    invoke-virtual {p0}, Lnn/u;->s()Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lnn/u;->D(Lnn/g;)V

    invoke-virtual {p0, p2}, Lnn/u;->n(Lqn/s;)V

    return-void

    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqn/s;

    invoke-virtual {p2, v0}, Lqn/s;->c(Lqn/s;)V

    goto :goto_0
.end method

.method public final d(Lnn/e;)V
    .locals 2

    iget-object v0, p0, Lnn/u;->l:Lnn/e;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lnn/e;->i:Z

    :cond_0
    iput-object p1, p0, Lnn/u;->l:Lnn/e;

    return-void
.end method

.method public final h(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lsn/b;",
            ">;)",
            "Ljava/util/List<",
            "Lsn/b;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance p1, Lon/e$a;

    invoke-direct {p1}, Lon/e$a;-><init>()V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Lon/f$a;

    invoke-direct {p1}, Lon/f$a;-><init>()V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Lon/i$a;

    invoke-direct {p1}, Lon/i$a;-><init>()V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Lon/d$a;

    invoke-direct {p1}, Lon/d$a;-><init>()V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Lon/j$a;

    invoke-direct {p1}, Lon/j$a;-><init>()V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final j(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lsn/e;",
            ">;)",
            "Ljava/util/List<",
            "Lsn/e;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance p1, Lon/g;

    invoke-direct {p1}, Lon/g;-><init>()V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final l()Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Character;",
            "Ljava/util/List<",
            "Lsn/a;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lnn/u;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lsn/b;

    invoke-interface {v2}, Lsn/b;->a()Lsn/a;

    move-result-object v3

    invoke-interface {v2}, Lsn/b;->b()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Character;

    new-instance v5, Lnn/t;

    invoke-direct {v5}, Lnn/t;-><init>()V

    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final m()V
    .locals 2

    iget-object v0, p0, Lnn/u;->l:Lnn/e;

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, v0, Lnn/e;->a:Lqn/b0;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lnn/e;->h:Z

    :cond_0
    iget-object v0, v0, Lnn/e;->f:Lnn/e;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final n(Lqn/s;)V
    .locals 1

    invoke-virtual {p1}, Lqn/s;->d()Lqn/s;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lqn/s;->d()Lqn/s;

    move-result-object v0

    invoke-virtual {p1}, Lqn/s;->e()Lqn/s;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lnn/u;->p(Lqn/s;Lqn/s;)V

    return-void
.end method

.method public final o(Lqn/b0;Lqn/b0;I)V
    .locals 3

    if-eqz p1, :cond_3

    if-eqz p2, :cond_3

    if-eq p1, p2, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {p1}, Lqn/b0;->o()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean p3, p0, Lnn/u;->i:Z

    if-eqz p3, :cond_0

    new-instance p3, Lqn/z;

    invoke-direct {p3}, Lqn/z;-><init>()V

    invoke-virtual {p1}, Lqn/s;->h()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p3, v1}, Lqn/z;->a(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    invoke-virtual {p1}, Lqn/s;->f()Lqn/s;

    move-result-object v1

    invoke-virtual {p2}, Lqn/s;->f()Lqn/s;

    move-result-object p2

    :goto_1
    if-eq v1, p2, :cond_2

    move-object v2, v1

    check-cast v2, Lqn/b0;

    invoke-virtual {v2}, Lqn/b0;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p3, :cond_1

    invoke-virtual {v1}, Lqn/s;->h()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p3, v2}, Lqn/z;->a(Ljava/util/List;)V

    :cond_1
    invoke-virtual {v1}, Lqn/s;->f()Lqn/s;

    move-result-object v2

    invoke-virtual {v1}, Lqn/s;->n()V

    move-object v1, v2

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lqn/b0;->p(Ljava/lang/String;)V

    if-eqz p3, :cond_3

    invoke-virtual {p3}, Lqn/z;->d()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1, p2}, Lqn/s;->l(Ljava/util/List;)V

    :cond_3
    return-void
.end method

.method public final p(Lqn/s;Lqn/s;)V
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    move-object v2, v0

    move-object v3, v2

    move v4, v1

    :goto_0
    if-eqz p1, :cond_3

    instance-of v5, p1, Lqn/b0;

    if-eqz v5, :cond_1

    move-object v3, p1

    check-cast v3, Lqn/b0;

    if-nez v2, :cond_0

    move-object v2, v3

    :cond_0
    invoke-virtual {v3}, Lqn/b0;->o()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v2, v3, v4}, Lnn/u;->o(Lqn/b0;Lqn/b0;I)V

    invoke-virtual {p0, p1}, Lnn/u;->n(Lqn/s;)V

    move-object v2, v0

    move-object v3, v2

    move v4, v1

    :goto_1
    if-ne p1, p2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lqn/s;->f()Lqn/s;

    move-result-object p1

    goto :goto_0

    :cond_3
    :goto_2
    invoke-virtual {p0, v2, v3, v4}, Lnn/u;->o(Lqn/b0;Lqn/b0;I)V

    return-void
.end method

.method public final q()Lqn/s;
    .locals 4

    iget-object v0, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v0}, Lsn/i;->o()Lsn/h;

    move-result-object v0

    iget-object v1, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v1}, Lsn/i;->h()V

    iget-object v1, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v1}, Lsn/i;->o()Lsn/h;

    move-result-object v1

    iget-object v2, p0, Lnn/u;->l:Lnn/e;

    if-nez v2, :cond_0

    iget-object v2, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v2, v0, v1}, Lsn/i;->d(Lsn/h;Lsn/h;)Lrn/j;

    move-result-object v0

    invoke-virtual {p0, v0}, Lnn/u;->M(Lrn/j;)Lqn/b0;

    move-result-object v0

    return-object v0

    :cond_0
    iget-boolean v3, v2, Lnn/e;->h:Z

    if-nez v3, :cond_1

    invoke-virtual {p0}, Lnn/u;->I()V

    iget-object v2, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v2, v0, v1}, Lsn/i;->d(Lsn/h;Lsn/h;)Lrn/j;

    move-result-object v0

    invoke-virtual {p0, v0}, Lnn/u;->M(Lrn/j;)Lqn/b0;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-virtual {p0, v2, v0}, Lnn/u;->z(Lnn/e;Lsn/h;)Lqn/s;

    move-result-object v2

    if-eqz v2, :cond_2

    return-object v2

    :cond_2
    iget-object v2, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v2, v1}, Lsn/i;->q(Lsn/h;)V

    invoke-virtual {p0}, Lnn/u;->I()V

    iget-object v2, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v2, v0, v1}, Lsn/i;->d(Lsn/h;Lsn/h;)Lrn/j;

    move-result-object v0

    invoke-virtual {p0, v0}, Lnn/u;->M(Lrn/j;)Lqn/b0;

    move-result-object v0

    return-object v0
.end method

.method public final r(Lun/a;C)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lun/a;",
            "C)",
            "Ljava/util/List<",
            "+",
            "Lqn/s;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lnn/u;->L(Lun/a;C)Lnn/u$b;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v1, p1, Lnn/u$b;->a:Ljava/util/List;

    new-instance v0, Lnn/g;

    iget-boolean v3, p1, Lnn/u$b;->c:Z

    iget-boolean v4, p1, Lnn/u$b;->b:Z

    iget-object v5, p0, Lnn/u;->k:Lnn/g;

    move v2, p2

    invoke-direct/range {v0 .. v5}, Lnn/g;-><init>(Ljava/util/List;CZZLnn/g;)V

    iput-object v0, p0, Lnn/u;->k:Lnn/g;

    iget-object p1, v0, Lnn/g;->f:Lnn/g;

    if-eqz p1, :cond_1

    iput-object v0, p1, Lnn/g;->g:Lnn/g;

    :cond_1
    return-object v1
.end method

.method public final s()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lqn/s;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v0}, Lsn/i;->l()C

    move-result v0

    if-eqz v0, :cond_a

    const/16 v1, 0xa

    if-eq v0, v1, :cond_9

    const/16 v1, 0x5b

    if-eq v0, v1, :cond_8

    const/16 v1, 0x5d

    if-eq v0, v1, :cond_7

    iget-object v1, p0, Lnn/u;->f:Ljava/util/BitSet;

    invoke-virtual {v1, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v1}, Lsn/i;->o()Lsn/h;

    move-result-object v1

    invoke-virtual {p0}, Lnn/u;->y()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    return-object v2

    :cond_0
    iget-object v2, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v2, v1}, Lsn/i;->q(Lsn/h;)V

    :cond_1
    iget-object v1, p0, Lnn/u;->e:Ljava/util/BitSet;

    invoke-virtual {v1, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, Lnn/u;->C()Lqn/s;

    move-result-object v0

    invoke-static {v0}, Lnn/r;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_2
    iget-object v1, p0, Lnn/u;->g:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_5

    iget-object v2, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v2}, Lsn/i;->o()Lsn/h;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lsn/a;

    invoke-interface {v3, p0}, Lsn/a;->a(Lsn/c;)Lsn/g;

    move-result-object v3

    instance-of v4, v3, Lon/l;

    if-eqz v4, :cond_4

    check-cast v3, Lon/l;

    invoke-virtual {v3}, Lon/l;->c()Lqn/s;

    move-result-object v0

    iget-object v1, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v3}, Lon/l;->d()Lsn/h;

    move-result-object v3

    invoke-virtual {v1, v3}, Lsn/i;->q(Lsn/h;)V

    iget-boolean v1, p0, Lnn/u;->i:Z

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Lqn/s;->h()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v1}, Lsn/i;->o()Lsn/h;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lsn/i;->d(Lsn/h;Lsn/h;)Lrn/j;

    move-result-object v1

    invoke-virtual {v1}, Lrn/j;->e()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqn/s;->l(Ljava/util/List;)V

    :cond_3
    invoke-static {v0}, Lnn/r;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_4
    iget-object v3, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v3, v2}, Lsn/i;->q(Lsn/h;)V

    goto :goto_0

    :cond_5
    iget-object v1, p0, Lnn/u;->c:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lun/a;

    if-eqz v1, :cond_6

    invoke-virtual {p0, v1, v0}, Lnn/u;->r(Lun/a;C)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_6

    return-object v0

    :cond_6
    invoke-virtual {p0}, Lnn/u;->C()Lqn/s;

    move-result-object v0

    invoke-static {v0}, Lnn/r;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_7
    invoke-virtual {p0}, Lnn/u;->q()Lqn/s;

    move-result-object v0

    invoke-static {v0}, Lnn/r;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_8
    invoke-virtual {p0}, Lnn/u;->B()Lqn/s;

    move-result-object v0

    invoke-static {v0}, Lnn/r;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_9
    invoke-virtual {p0}, Lnn/u;->u()Lqn/s;

    move-result-object v0

    invoke-static {v0}, Lnn/r;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_a
    const/4 v0, 0x0

    return-object v0
.end method

.method public final u()Lqn/s;
    .locals 3

    iget-object v0, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v0}, Lsn/i;->h()V

    iget v0, p0, Lnn/u;->j:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iput v2, p0, Lnn/u;->j:I

    if-eqz v0, :cond_1

    new-instance v0, Lqn/i;

    invoke-direct {v0}, Lqn/i;-><init>()V

    return-object v0

    :cond_1
    new-instance v0, Lqn/x;

    invoke-direct {v0}, Lqn/x;-><init>()V

    return-object v0
.end method

.method public final w(Lnn/e;Lsn/h;)Lsn/d;
    .locals 10

    iget-object v0, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v0}, Lsn/i;->o()Lsn/h;

    move-result-object v8

    iget-object v0, p0, Lnn/u;->h:Lsn/i;

    invoke-static {v0}, Lnn/u;->t(Lsn/i;)Lnn/u$c;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lnn/u;->h:Lsn/i;

    iget-object v2, p1, Lnn/e;->e:Lsn/h;

    invoke-virtual {v1, v2, p2}, Lsn/i;->d(Lsn/h;Lsn/h;)Lrn/j;

    move-result-object p2

    invoke-virtual {p2}, Lrn/j;->c()Ljava/lang/String;

    move-result-object v4

    new-instance v1, Lnn/u$d;

    iget-object v2, p1, Lnn/e;->a:Lqn/b0;

    iget-object v3, p1, Lnn/e;->c:Lqn/b0;

    iget-object v6, v0, Lnn/u$c;->a:Ljava/lang/String;

    iget-object v7, v0, Lnn/u$c;->b:Ljava/lang/String;

    const/4 v9, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v9}, Lnn/u$d;-><init>(Lqn/b0;Lqn/b0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lsn/h;Lnn/v;)V

    return-object v1

    :cond_0
    iget-object v0, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v0, v8}, Lsn/i;->q(Lsn/h;)V

    iget-object v0, p0, Lnn/u;->h:Lsn/i;

    invoke-static {v0}, Lnn/u;->x(Lsn/i;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_1

    iget-object v0, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v0, v8}, Lsn/i;->q(Lsn/h;)V

    :cond_1
    if-eqz v5, :cond_3

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v0, 0x1

    :goto_1
    iget-boolean v1, p1, Lnn/e;->i:Z

    if-eqz v1, :cond_4

    if-eqz v0, :cond_4

    iget-object v0, p1, Lnn/e;->a:Lqn/b0;

    if-nez v0, :cond_4

    const/4 p1, 0x0

    return-object p1

    :cond_4
    iget-object v0, p0, Lnn/u;->h:Lsn/i;

    iget-object v1, p1, Lnn/e;->e:Lsn/h;

    invoke-virtual {v0, v1, p2}, Lsn/i;->d(Lsn/h;Lsn/h;)Lrn/j;

    move-result-object p2

    invoke-virtual {p2}, Lrn/j;->c()Ljava/lang/String;

    move-result-object v4

    new-instance v1, Lnn/u$d;

    iget-object v2, p1, Lnn/e;->a:Lqn/b0;

    iget-object v3, p1, Lnn/e;->c:Lqn/b0;

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v9}, Lnn/u$d;-><init>(Lqn/b0;Lqn/b0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lsn/h;Lnn/v;)V

    return-object v1
.end method

.method public final y()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lqn/s;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v0}, Lsn/i;->o()Lsn/h;

    move-result-object v2

    iget-object v0, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v0}, Lsn/i;->h()V

    iget-object v0, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v0}, Lsn/i;->o()Lsn/h;

    move-result-object v4

    iget-object v0, p0, Lnn/u;->h:Lsn/i;

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Lsn/i;->i(C)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v0}, Lsn/i;->o()Lsn/h;

    move-result-object v5

    iget-object v0, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v0, v2, v4}, Lsn/i;->d(Lsn/h;Lsn/h;)Lrn/j;

    move-result-object v0

    invoke-virtual {p0, v0}, Lnn/u;->M(Lrn/j;)Lqn/b0;

    move-result-object v1

    iget-object v0, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v0, v4, v5}, Lsn/i;->d(Lsn/h;Lsn/h;)Lrn/j;

    move-result-object v0

    invoke-virtual {p0, v0}, Lnn/u;->M(Lrn/j;)Lqn/b0;

    move-result-object v3

    iget-object v6, p0, Lnn/u;->l:Lnn/e;

    iget-object v7, p0, Lnn/u;->k:Lnn/g;

    invoke-static/range {v1 .. v7}, Lnn/e;->b(Lqn/b0;Lsn/h;Lqn/b0;Lsn/h;Lsn/h;Lnn/e;Lnn/g;)Lnn/e;

    move-result-object v0

    invoke-virtual {p0, v0}, Lnn/u;->d(Lnn/e;)V

    invoke-static {v1, v3}, Lnn/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final z(Lnn/e;Lsn/h;)Lqn/s;
    .locals 8

    invoke-virtual {p0, p1, p2}, Lnn/u;->w(Lnn/e;Lsn/h;)Lsn/d;

    move-result-object p2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v1}, Lsn/i;->o()Lsn/h;

    move-result-object v1

    iget-object v2, p0, Lnn/u;->d:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lsn/e;

    iget-object v4, p0, Lnn/u;->h:Lsn/i;

    iget-object v5, p0, Lnn/u;->a:Lrn/c;

    invoke-interface {v3, p2, v4, v5}, Lsn/e;->a(Lsn/d;Lsn/i;Lrn/c;)Lsn/f;

    move-result-object v3

    instance-of v4, v3, Lon/k;

    if-nez v4, :cond_1

    iget-object v3, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {v3, v1}, Lsn/i;->q(Lsn/h;)V

    goto :goto_0

    :cond_1
    check-cast v3, Lon/k;

    invoke-virtual {v3}, Lon/k;->d()Lqn/s;

    move-result-object v4

    invoke-virtual {v3}, Lon/k;->e()Lsn/h;

    move-result-object v5

    invoke-virtual {v3}, Lon/k;->g()Z

    move-result v6

    sget-object v7, Lnn/u$a;->a:[I

    invoke-virtual {v3}, Lon/k;->f()Lon/k$a;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v7, v3

    const/4 v7, 0x1

    if-eq v3, v7, :cond_3

    const/4 v7, 0x2

    if-eq v3, v7, :cond_2

    goto :goto_0

    :cond_2
    iget-object p2, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {p2, v5}, Lsn/i;->q(Lsn/h;)V

    invoke-virtual {p0, p1, v4, v6}, Lnn/u;->J(Lnn/e;Lqn/s;Z)Lqn/s;

    move-result-object p1

    return-object p1

    :cond_3
    iget-object p2, p0, Lnn/u;->h:Lsn/i;

    invoke-virtual {p2, v5}, Lsn/i;->q(Lsn/h;)V

    invoke-virtual {p0, p1, v4, v6}, Lnn/u;->N(Lnn/e;Lqn/s;Z)Lqn/s;

    move-result-object p1

    return-object p1

    :cond_4
    return-object v0
.end method
