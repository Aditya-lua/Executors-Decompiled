.class public Lao/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfo/b;
.implements Lgo/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lao/u$b;,
        Lao/u$c;,
        Lao/u$d;
    }
.end annotation


# instance fields
.field public final a:Lfo/c;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lgo/b;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Character;",
            "Lio/a;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lgo/e;",
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
            "Lgo/a;",
            ">;>;"
        }
    .end annotation
.end field

.field public h:Lgo/i;

.field public i:Z

.field public j:I

.field public k:Lao/g;

.field public l:Lao/e;


# direct methods
.method public constructor <init>(Lfo/c;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lao/u;->a:Lfo/c;

    invoke-interface {p1}, Lfo/c;->e()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lao/u;->h(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lao/u;->b:Ljava/util/List;

    invoke-interface {p1}, Lfo/c;->c()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lao/u;->g(Ljava/util/List;)Ljava/util/Map;

    move-result-object v1

    iput-object v1, p0, Lao/u;->c:Ljava/util/Map;

    invoke-interface {p1}, Lfo/c;->b()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0, v2}, Lao/u;->j(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lao/u;->d:Ljava/util/List;

    invoke-interface {p1}, Lfo/c;->d()Ljava/util/Set;

    move-result-object p1

    invoke-static {p1}, Lao/u;->i(Ljava/util/Set;)Ljava/util/BitSet;

    move-result-object p1

    iput-object p1, p0, Lao/u;->f:Ljava/util/BitSet;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-static {p1, v1, v0}, Lao/u;->k(Ljava/util/BitSet;Ljava/util/Set;Ljava/util/List;)Ljava/util/BitSet;

    move-result-object p1

    iput-object p1, p0, Lao/u;->e:Ljava/util/BitSet;

    return-void
.end method

.method public static A(Lgo/i;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lgo/i;->o()Lgo/h;

    move-result-object v0

    invoke-static {p0}, Lco/e;->e(Lgo/i;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lgo/i;->o()Lgo/h;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lgo/i;->d(Lgo/h;Lgo/h;)Lfo/j;

    move-result-object p0

    invoke-virtual {p0}, Lfo/j;->c()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lco/c;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Character;)Ljava/util/List;
    .locals 0

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-object p0
.end method

.method public static e(CLio/a;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(C",
            "Lio/a;",
            "Ljava/util/Map<",
            "Ljava/lang/Character;",
            "Lio/a;",
            ">;)V"
        }
    .end annotation

    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    invoke-interface {p2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/a;

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
            "Lio/a;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/Character;",
            "Lio/a;",
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

    check-cast v0, Lio/a;

    invoke-interface {v0}, Lio/a;->d()C

    move-result v1

    invoke-interface {v0}, Lio/a;->b()C

    move-result v2

    if-ne v1, v2, :cond_2

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/a;

    if-eqz v2, :cond_1

    invoke-interface {v2}, Lio/a;->d()C

    move-result v3

    invoke-interface {v2}, Lio/a;->b()C

    move-result v4

    if-ne v3, v4, :cond_1

    instance-of v3, v2, Lao/a0;

    if-eqz v3, :cond_0

    check-cast v2, Lao/a0;

    goto :goto_1

    :cond_0
    new-instance v3, Lao/a0;

    invoke-direct {v3, v1}, Lao/a0;-><init>(C)V

    invoke-virtual {v3, v2}, Lao/a0;->e(Lio/a;)V

    move-object v2, v3

    :goto_1
    invoke-virtual {v2, v0}, Lao/a0;->e(Lio/a;)V

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    invoke-interface {p1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-static {v1, v0, p1}, Lao/u;->e(CLio/a;Ljava/util/Map;)V

    goto :goto_0

    :cond_2
    invoke-static {v1, v0, p1}, Lao/u;->e(CLio/a;Ljava/util/Map;)V

    invoke-static {v2, v0, p1}, Lao/u;->e(CLio/a;Ljava/util/Map;)V

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
            "Lio/a;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/Character;",
            "Lio/a;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lbo/a;

    invoke-direct {v1}, Lbo/a;-><init>()V

    new-instance v2, Lbo/m;

    invoke-direct {v2}, Lbo/m;-><init>()V

    invoke-static {v1, v2}, Lao/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v0}, Lao/u;->f(Ljava/lang/Iterable;Ljava/util/Map;)V

    invoke-static {p0, v0}, Lao/u;->f(Ljava/lang/Iterable;Ljava/util/Map;)V

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
            "Lgo/b;",
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

    check-cast p2, Lgo/b;

    invoke-interface {p2}, Lgo/b;->b()Ljava/util/Set;

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

.method public static t(Lgo/i;)Lao/u$c;
    .locals 4

    const/16 v0, 0x28

    invoke-virtual {p0, v0}, Lgo/i;->i(C)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p0}, Lgo/i;->r()I

    invoke-static {p0}, Lao/u;->v(Lgo/i;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {p0}, Lgo/i;->r()I

    move-result v2

    const/4 v3, 0x1

    if-lt v2, v3, :cond_2

    invoke-static {p0}, Lao/u;->A(Lgo/i;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lgo/i;->r()I

    goto :goto_0

    :cond_2
    move-object v2, v1

    :goto_0
    const/16 v3, 0x29

    invoke-virtual {p0, v3}, Lgo/i;->i(C)Z

    move-result p0

    if-nez p0, :cond_3

    return-object v1

    :cond_3
    new-instance p0, Lao/u$c;

    invoke-direct {p0, v0, v2}, Lao/u$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public static v(Lgo/i;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lgo/i;->l()C

    move-result v0

    invoke-virtual {p0}, Lgo/i;->o()Lgo/h;

    move-result-object v1

    invoke-static {p0}, Lco/e;->b(Lgo/i;)Z

    move-result v2

    if-nez v2, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/16 v2, 0x3c

    if-ne v0, v2, :cond_1

    invoke-virtual {p0}, Lgo/i;->o()Lgo/h;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lgo/i;->d(Lgo/h;Lgo/h;)Lfo/j;

    move-result-object p0

    invoke-virtual {p0}, Lfo/j;->c()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lgo/i;->o()Lgo/h;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lgo/i;->d(Lgo/h;Lgo/h;)Lfo/j;

    move-result-object p0

    invoke-virtual {p0}, Lfo/j;->c()Ljava/lang/String;

    move-result-object p0

    :goto_0
    invoke-static {p0}, Lco/c;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static x(Lgo/i;)Ljava/lang/String;
    .locals 4

    const/16 v0, 0x5b

    invoke-virtual {p0, v0}, Lgo/i;->i(C)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p0}, Lgo/i;->o()Lgo/h;

    move-result-object v0

    invoke-static {p0}, Lco/e;->d(Lgo/i;)Z

    move-result v2

    if-nez v2, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {p0}, Lgo/i;->o()Lgo/h;

    move-result-object v2

    const/16 v3, 0x5d

    invoke-virtual {p0, v3}, Lgo/i;->i(C)Z

    move-result v3

    if-nez v3, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {p0, v0, v2}, Lgo/i;->d(Lgo/h;Lgo/h;)Lfo/j;

    move-result-object p0

    invoke-virtual {p0}, Lfo/j;->c()Ljava/lang/String;

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
.method public final B()Leo/s;
    .locals 5

    iget-object v0, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v0}, Lgo/i;->o()Lgo/h;

    move-result-object v0

    iget-object v1, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v1}, Lgo/i;->h()V

    iget-object v1, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v1}, Lgo/i;->o()Lgo/h;

    move-result-object v1

    iget-object v2, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v2, v0, v1}, Lgo/i;->d(Lgo/h;Lgo/h;)Lfo/j;

    move-result-object v2

    invoke-virtual {p0, v2}, Lao/u;->M(Lfo/j;)Leo/b0;

    move-result-object v2

    iget-object v3, p0, Lao/u;->l:Lao/e;

    iget-object v4, p0, Lao/u;->k:Lao/g;

    invoke-static {v2, v0, v1, v3, v4}, Lao/e;->a(Leo/b0;Lgo/h;Lgo/h;Lao/e;Lao/g;)Lao/e;

    move-result-object v0

    invoke-virtual {p0, v0}, Lao/u;->d(Lao/e;)V

    return-object v2
.end method

.method public final C()Leo/s;
    .locals 5

    iget-object v0, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v0}, Lgo/i;->o()Lgo/h;

    move-result-object v0

    iget-object v1, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v1}, Lgo/i;->h()V

    :goto_0
    iget-object v1, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v1}, Lgo/i;->l()C

    move-result v1

    if-eqz v1, :cond_1

    iget-object v2, p0, Lao/u;->e:Ljava/util/BitSet;

    invoke-virtual {v2, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v1}, Lgo/i;->h()V

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v2, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v2}, Lgo/i;->o()Lgo/h;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lgo/i;->d(Lgo/h;Lgo/h;)Lfo/j;

    move-result-object v0

    invoke-virtual {v0}, Lfo/j;->c()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0xa

    const/4 v4, 0x0

    if-ne v1, v3, :cond_2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    const/16 v3, 0x20

    invoke-static {v3, v2, v1, v4}, Ljo/d;->j(CLjava/lang/CharSequence;II)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    sub-int/2addr v3, v1

    iput v3, p0, Lao/u;->j:I

    invoke-virtual {v2, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_2
    if-nez v1, :cond_3

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-static {v2, v1, v4}, Ljo/d;->l(Ljava/lang/CharSequence;II)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v2, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    :cond_3
    :goto_2
    new-instance v1, Leo/b0;

    invoke-direct {v1, v2}, Leo/b0;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lfo/j;->e()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Leo/s;->l(Ljava/util/List;)V

    return-object v1
.end method

.method public final D(Lao/g;)V
    .locals 11

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lao/u;->k:Lao/g;

    :goto_0
    if-eqz v1, :cond_0

    iget-object v2, v1, Lao/g;->f:Lao/g;

    if-eq v2, p1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    :goto_1
    if-eqz v1, :cond_b

    iget-char v2, v1, Lao/g;->b:C

    iget-object v3, p0, Lao/u;->c:Ljava/util/Map;

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/a;

    invoke-virtual {v1}, Lao/g;->c()Z

    move-result v4

    if-eqz v4, :cond_a

    if-nez v3, :cond_1

    goto/16 :goto_6

    :cond_1
    invoke-interface {v3}, Lio/a;->d()C

    move-result v4

    iget-object v5, v1, Lao/g;->f:Lao/g;

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

    invoke-virtual {v5}, Lao/g;->g()Z

    move-result v10

    if-eqz v10, :cond_3

    iget-char v10, v5, Lao/g;->b:C

    if-ne v10, v4, :cond_3

    invoke-interface {v3, v5, v1}, Lio/a;->a(Lio/b;Lio/b;)I

    move-result v7

    if-lez v7, :cond_2

    move v3, v9

    move v8, v3

    goto :goto_3

    :cond_2
    move v8, v9

    :cond_3
    iget-object v5, v5, Lao/g;->f:Lao/g;

    goto :goto_2

    :cond_4
    move v3, v6

    :goto_3
    if-nez v3, :cond_6

    if-nez v8, :cond_5

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    iget-object v3, v1, Lao/g;->f:Lao/g;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lao/g;->g()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {p0, v1}, Lao/u;->G(Lao/g;)V

    :cond_5
    iget-object v1, v1, Lao/g;->g:Lao/g;

    goto :goto_1

    :cond_6
    move v2, v6

    :goto_4
    if-ge v2, v7, :cond_7

    iget-object v3, v5, Lao/g;->a:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    sub-int/2addr v4, v9

    invoke-interface {v3, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Leo/b0;

    invoke-virtual {v3}, Leo/s;->n()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_7
    move v2, v6

    :goto_5
    if-ge v2, v7, :cond_8

    iget-object v3, v1, Lao/g;->a:Ljava/util/List;

    invoke-interface {v3, v6}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Leo/b0;

    invoke-virtual {v3}, Leo/s;->n()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_8
    invoke-virtual {p0, v5, v1}, Lao/u;->H(Lao/g;Lao/g;)V

    invoke-virtual {v5}, Lao/g;->length()I

    move-result v2

    if-nez v2, :cond_9

    invoke-virtual {p0, v5}, Lao/u;->F(Lao/g;)V

    :cond_9
    invoke-virtual {v1}, Lao/g;->length()I

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, v1, Lao/g;->g:Lao/g;

    invoke-virtual {p0, v1}, Lao/u;->F(Lao/g;)V

    move-object v1, v2

    goto/16 :goto_1

    :cond_a
    :goto_6
    iget-object v1, v1, Lao/g;->g:Lao/g;

    goto/16 :goto_1

    :cond_b
    :goto_7
    iget-object v0, p0, Lao/u;->k:Lao/g;

    if-eqz v0, :cond_c

    if-eq v0, p1, :cond_c

    invoke-virtual {p0, v0}, Lao/u;->G(Lao/g;)V

    goto :goto_7

    :cond_c
    return-void
.end method

.method public final E(Lao/g;)V
    .locals 2

    iget-object v0, p1, Lao/g;->f:Lao/g;

    if-eqz v0, :cond_0

    iget-object v1, p1, Lao/g;->g:Lao/g;

    iput-object v1, v0, Lao/g;->g:Lao/g;

    :cond_0
    iget-object p1, p1, Lao/g;->g:Lao/g;

    if-nez p1, :cond_1

    iput-object v0, p0, Lao/u;->k:Lao/g;

    return-void

    :cond_1
    iput-object v0, p1, Lao/g;->f:Lao/g;

    return-void
.end method

.method public final F(Lao/g;)V
    .locals 0

    invoke-virtual {p0, p1}, Lao/u;->E(Lao/g;)V

    return-void
.end method

.method public final G(Lao/g;)V
    .locals 0

    invoke-virtual {p0, p1}, Lao/u;->E(Lao/g;)V

    return-void
.end method

.method public final H(Lao/g;Lao/g;)V
    .locals 1

    iget-object p2, p2, Lao/g;->f:Lao/g;

    :goto_0
    if-eqz p2, :cond_0

    if-eq p2, p1, :cond_0

    iget-object v0, p2, Lao/g;->f:Lao/g;

    invoke-virtual {p0, p2}, Lao/u;->G(Lao/g;)V

    move-object p2, v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final I()V
    .locals 1

    iget-object v0, p0, Lao/u;->l:Lao/e;

    iget-object v0, v0, Lao/e;->f:Lao/e;

    iput-object v0, p0, Lao/u;->l:Lao/e;

    return-void
.end method

.method public final J(Lao/e;Leo/s;Z)Leo/s;
    .locals 3

    :goto_0
    iget-object v0, p0, Lao/u;->k:Lao/g;

    if-eqz v0, :cond_0

    iget-object v1, p1, Lao/e;->g:Lao/g;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0, v0}, Lao/u;->G(Lao/g;)V

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lao/u;->i:Z

    if-eqz v0, :cond_2

    if-eqz p3, :cond_1

    iget-object v0, p1, Lao/e;->b:Lgo/h;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p1, Lao/e;->d:Lgo/h;

    :goto_1
    iget-object v1, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v1}, Lgo/i;->o()Lgo/h;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lgo/i;->d(Lgo/h;Lgo/h;)Lfo/j;

    move-result-object v0

    invoke-virtual {v0}, Lfo/j;->e()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Leo/s;->l(Ljava/util/List;)V

    :cond_2
    invoke-virtual {p0}, Lao/u;->I()V

    if-eqz p3, :cond_3

    iget-object v0, p1, Lao/e;->a:Leo/b0;

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    iget-object v0, p1, Lao/e;->c:Leo/b0;

    :goto_2
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Leo/s;->f()Leo/s;

    move-result-object v1

    invoke-virtual {v0}, Leo/s;->n()V

    move-object v0, v1

    goto :goto_2

    :cond_4
    iget-object p1, p1, Lao/e;->a:Leo/b0;

    if-eqz p1, :cond_6

    if-nez p3, :cond_5

    goto :goto_3

    :cond_5
    return-object p2

    :cond_6
    :goto_3
    invoke-virtual {p0}, Lao/u;->m()V

    return-object p2
.end method

.method public K(Lfo/j;)V
    .locals 1

    invoke-static {p1}, Lgo/i;->k(Lfo/j;)Lgo/i;

    move-result-object v0

    iput-object v0, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {p1}, Lfo/j;->e()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, Lao/u;->i:Z

    const/4 p1, 0x0

    iput p1, p0, Lao/u;->j:I

    const/4 p1, 0x0

    iput-object p1, p0, Lao/u;->k:Lao/g;

    iput-object p1, p0, Lao/u;->l:Lao/e;

    invoke-virtual {p0}, Lao/u;->l()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lao/u;->g:Ljava/util/Map;

    return-void
.end method

.method public final L(Lio/a;C)Lao/u$b;
    .locals 8

    iget-object v0, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v0}, Lgo/i;->n()I

    move-result v0

    iget-object v1, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v1}, Lgo/i;->o()Lgo/h;

    move-result-object v1

    iget-object v2, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v2, p2}, Lgo/i;->g(C)I

    move-result v2

    invoke-interface {p1}, Lio/a;->c()I

    move-result v3

    if-ge v2, v3, :cond_0

    iget-object p1, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {p1, v1}, Lgo/i;->q(Lgo/h;)V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v3, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v3, v1}, Lgo/i;->q(Lgo/h;)V

    :goto_0
    iget-object v3, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v3, p2}, Lgo/i;->i(C)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v3}, Lgo/i;->o()Lgo/h;

    move-result-object v4

    invoke-virtual {v3, v1, v4}, Lgo/i;->d(Lgo/h;Lgo/h;)Lfo/j;

    move-result-object v1

    invoke-virtual {p0, v1}, Lao/u;->M(Lfo/j;)Leo/b0;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v1}, Lgo/i;->o()Lgo/h;

    move-result-object v1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v1}, Lgo/i;->m()I

    move-result v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v0, :cond_3

    invoke-static {v0}, Ljo/d;->f(I)Z

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

    invoke-static {v0}, Ljo/d;->h(I)Z

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

    invoke-static {v1}, Ljo/d;->f(I)Z

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

    invoke-static {v1}, Ljo/d;->h(I)Z

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

    invoke-interface {p1}, Lio/a;->d()C

    move-result v1

    if-ne p2, v1, :cond_12

    move v1, v3

    goto :goto_c

    :cond_12
    move v1, v4

    :goto_c
    if-eqz v0, :cond_13

    invoke-interface {p1}, Lio/a;->b()C

    move-result p1

    if-ne p2, p1, :cond_13

    goto :goto_d

    :cond_13
    move v3, v4

    :goto_d
    move p1, v1

    :cond_14
    :goto_e
    new-instance p2, Lao/u$b;

    invoke-direct {p2, v2, p1, v3}, Lao/u$b;-><init>(Ljava/util/List;ZZ)V

    return-object p2
.end method

.method public final M(Lfo/j;)Leo/b0;
    .locals 2

    new-instance v0, Leo/b0;

    invoke-virtual {p1}, Lfo/j;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Leo/b0;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lfo/j;->e()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Leo/s;->l(Ljava/util/List;)V

    return-object v0
.end method

.method public final N(Lao/e;Leo/s;Z)Leo/s;
    .locals 3

    iget-object v0, p1, Lao/e;->c:Leo/b0;

    invoke-virtual {v0}, Leo/s;->f()Leo/s;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Leo/s;->f()Leo/s;

    move-result-object v1

    invoke-virtual {p2, v0}, Leo/s;->c(Leo/s;)V

    move-object v0, v1

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lao/u;->i:Z

    if-eqz v0, :cond_2

    if-eqz p3, :cond_1

    iget-object v0, p1, Lao/e;->b:Lgo/h;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p1, Lao/e;->d:Lgo/h;

    :goto_1
    iget-object v1, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v1}, Lgo/i;->o()Lgo/h;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lgo/i;->d(Lgo/h;Lgo/h;)Lfo/j;

    move-result-object v0

    invoke-virtual {v0}, Lfo/j;->e()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Leo/s;->l(Ljava/util/List;)V

    :cond_2
    iget-object v0, p1, Lao/e;->g:Lao/g;

    invoke-virtual {p0, v0}, Lao/u;->D(Lao/g;)V

    invoke-virtual {p0, p2}, Lao/u;->n(Leo/s;)V

    if-eqz p3, :cond_3

    iget-object p3, p1, Lao/e;->a:Leo/b0;

    if-eqz p3, :cond_3

    invoke-virtual {p3}, Leo/s;->n()V

    :cond_3
    iget-object p3, p1, Lao/e;->c:Leo/b0;

    invoke-virtual {p3}, Leo/s;->n()V

    invoke-virtual {p0}, Lao/u;->I()V

    iget-object p1, p1, Lao/e;->a:Leo/b0;

    if-nez p1, :cond_4

    invoke-virtual {p0}, Lao/u;->m()V

    :cond_4
    return-object p2
.end method

.method public a()Lgo/i;
    .locals 1

    iget-object v0, p0, Lao/u;->h:Lgo/i;

    return-object v0
.end method

.method public b(Lfo/j;Leo/s;)V
    .locals 1

    invoke-virtual {p0, p1}, Lao/u;->K(Lfo/j;)V

    :cond_0
    invoke-virtual {p0}, Lao/u;->s()Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lao/u;->D(Lao/g;)V

    invoke-virtual {p0, p2}, Lao/u;->n(Leo/s;)V

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

    check-cast v0, Leo/s;

    invoke-virtual {p2, v0}, Leo/s;->c(Leo/s;)V

    goto :goto_0
.end method

.method public final d(Lao/e;)V
    .locals 2

    iget-object v0, p0, Lao/u;->l:Lao/e;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lao/e;->i:Z

    :cond_0
    iput-object p1, p0, Lao/u;->l:Lao/e;

    return-void
.end method

.method public final h(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lgo/b;",
            ">;)",
            "Ljava/util/List<",
            "Lgo/b;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance p1, Lbo/e$a;

    invoke-direct {p1}, Lbo/e$a;-><init>()V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Lbo/f$a;

    invoke-direct {p1}, Lbo/f$a;-><init>()V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Lbo/i$a;

    invoke-direct {p1}, Lbo/i$a;-><init>()V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Lbo/d$a;

    invoke-direct {p1}, Lbo/d$a;-><init>()V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Lbo/j$a;

    invoke-direct {p1}, Lbo/j$a;-><init>()V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final j(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lgo/e;",
            ">;)",
            "Ljava/util/List<",
            "Lgo/e;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance p1, Lbo/g;

    invoke-direct {p1}, Lbo/g;-><init>()V

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
            "Lgo/a;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lao/u;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lgo/b;

    invoke-interface {v2}, Lgo/b;->a()Lgo/a;

    move-result-object v3

    invoke-interface {v2}, Lgo/b;->b()Ljava/util/Set;

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

    new-instance v5, Lao/t;

    invoke-direct {v5}, Lao/t;-><init>()V

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

    iget-object v0, p0, Lao/u;->l:Lao/e;

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, v0, Lao/e;->a:Leo/b0;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lao/e;->h:Z

    :cond_0
    iget-object v0, v0, Lao/e;->f:Lao/e;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final n(Leo/s;)V
    .locals 1

    invoke-virtual {p1}, Leo/s;->d()Leo/s;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Leo/s;->d()Leo/s;

    move-result-object v0

    invoke-virtual {p1}, Leo/s;->e()Leo/s;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lao/u;->p(Leo/s;Leo/s;)V

    return-void
.end method

.method public final o(Leo/b0;Leo/b0;I)V
    .locals 3

    if-eqz p1, :cond_3

    if-eqz p2, :cond_3

    if-eq p1, p2, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {p1}, Leo/b0;->o()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean p3, p0, Lao/u;->i:Z

    if-eqz p3, :cond_0

    new-instance p3, Leo/z;

    invoke-direct {p3}, Leo/z;-><init>()V

    invoke-virtual {p1}, Leo/s;->h()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p3, v1}, Leo/z;->a(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    invoke-virtual {p1}, Leo/s;->f()Leo/s;

    move-result-object v1

    invoke-virtual {p2}, Leo/s;->f()Leo/s;

    move-result-object p2

    :goto_1
    if-eq v1, p2, :cond_2

    move-object v2, v1

    check-cast v2, Leo/b0;

    invoke-virtual {v2}, Leo/b0;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p3, :cond_1

    invoke-virtual {v1}, Leo/s;->h()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p3, v2}, Leo/z;->a(Ljava/util/List;)V

    :cond_1
    invoke-virtual {v1}, Leo/s;->f()Leo/s;

    move-result-object v2

    invoke-virtual {v1}, Leo/s;->n()V

    move-object v1, v2

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Leo/b0;->p(Ljava/lang/String;)V

    if-eqz p3, :cond_3

    invoke-virtual {p3}, Leo/z;->d()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1, p2}, Leo/s;->l(Ljava/util/List;)V

    :cond_3
    return-void
.end method

.method public final p(Leo/s;Leo/s;)V
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    move-object v2, v0

    move-object v3, v2

    move v4, v1

    :goto_0
    if-eqz p1, :cond_3

    instance-of v5, p1, Leo/b0;

    if-eqz v5, :cond_1

    move-object v3, p1

    check-cast v3, Leo/b0;

    if-nez v2, :cond_0

    move-object v2, v3

    :cond_0
    invoke-virtual {v3}, Leo/b0;->o()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v4, v5

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v2, v3, v4}, Lao/u;->o(Leo/b0;Leo/b0;I)V

    invoke-virtual {p0, p1}, Lao/u;->n(Leo/s;)V

    move-object v2, v0

    move-object v3, v2

    move v4, v1

    :goto_1
    if-ne p1, p2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Leo/s;->f()Leo/s;

    move-result-object p1

    goto :goto_0

    :cond_3
    :goto_2
    invoke-virtual {p0, v2, v3, v4}, Lao/u;->o(Leo/b0;Leo/b0;I)V

    return-void
.end method

.method public final q()Leo/s;
    .locals 4

    iget-object v0, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v0}, Lgo/i;->o()Lgo/h;

    move-result-object v0

    iget-object v1, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v1}, Lgo/i;->h()V

    iget-object v1, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v1}, Lgo/i;->o()Lgo/h;

    move-result-object v1

    iget-object v2, p0, Lao/u;->l:Lao/e;

    if-nez v2, :cond_0

    iget-object v2, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v2, v0, v1}, Lgo/i;->d(Lgo/h;Lgo/h;)Lfo/j;

    move-result-object v0

    invoke-virtual {p0, v0}, Lao/u;->M(Lfo/j;)Leo/b0;

    move-result-object v0

    return-object v0

    :cond_0
    iget-boolean v3, v2, Lao/e;->h:Z

    if-nez v3, :cond_1

    invoke-virtual {p0}, Lao/u;->I()V

    iget-object v2, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v2, v0, v1}, Lgo/i;->d(Lgo/h;Lgo/h;)Lfo/j;

    move-result-object v0

    invoke-virtual {p0, v0}, Lao/u;->M(Lfo/j;)Leo/b0;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-virtual {p0, v2, v0}, Lao/u;->z(Lao/e;Lgo/h;)Leo/s;

    move-result-object v2

    if-eqz v2, :cond_2

    return-object v2

    :cond_2
    iget-object v2, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v2, v1}, Lgo/i;->q(Lgo/h;)V

    invoke-virtual {p0}, Lao/u;->I()V

    iget-object v2, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v2, v0, v1}, Lgo/i;->d(Lgo/h;Lgo/h;)Lfo/j;

    move-result-object v0

    invoke-virtual {p0, v0}, Lao/u;->M(Lfo/j;)Leo/b0;

    move-result-object v0

    return-object v0
.end method

.method public final r(Lio/a;C)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/a;",
            "C)",
            "Ljava/util/List<",
            "+",
            "Leo/s;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lao/u;->L(Lio/a;C)Lao/u$b;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v1, p1, Lao/u$b;->a:Ljava/util/List;

    new-instance v0, Lao/g;

    iget-boolean v3, p1, Lao/u$b;->c:Z

    iget-boolean v4, p1, Lao/u$b;->b:Z

    iget-object v5, p0, Lao/u;->k:Lao/g;

    move v2, p2

    invoke-direct/range {v0 .. v5}, Lao/g;-><init>(Ljava/util/List;CZZLao/g;)V

    iput-object v0, p0, Lao/u;->k:Lao/g;

    iget-object p1, v0, Lao/g;->f:Lao/g;

    if-eqz p1, :cond_1

    iput-object v0, p1, Lao/g;->g:Lao/g;

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
            "Leo/s;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v0}, Lgo/i;->l()C

    move-result v0

    if-eqz v0, :cond_a

    const/16 v1, 0xa

    if-eq v0, v1, :cond_9

    const/16 v1, 0x5b

    if-eq v0, v1, :cond_8

    const/16 v1, 0x5d

    if-eq v0, v1, :cond_7

    iget-object v1, p0, Lao/u;->f:Ljava/util/BitSet;

    invoke-virtual {v1, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v1}, Lgo/i;->o()Lgo/h;

    move-result-object v1

    invoke-virtual {p0}, Lao/u;->y()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    return-object v2

    :cond_0
    iget-object v2, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v2, v1}, Lgo/i;->q(Lgo/h;)V

    :cond_1
    iget-object v1, p0, Lao/u;->e:Ljava/util/BitSet;

    invoke-virtual {v1, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, Lao/u;->C()Leo/s;

    move-result-object v0

    invoke-static {v0}, Lao/r;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_2
    iget-object v1, p0, Lao/u;->g:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-eqz v1, :cond_5

    iget-object v2, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v2}, Lgo/i;->o()Lgo/h;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lgo/a;

    invoke-interface {v3, p0}, Lgo/a;->a(Lgo/c;)Lgo/g;

    move-result-object v3

    instance-of v4, v3, Lbo/l;

    if-eqz v4, :cond_4

    check-cast v3, Lbo/l;

    invoke-virtual {v3}, Lbo/l;->c()Leo/s;

    move-result-object v0

    iget-object v1, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v3}, Lbo/l;->d()Lgo/h;

    move-result-object v3

    invoke-virtual {v1, v3}, Lgo/i;->q(Lgo/h;)V

    iget-boolean v1, p0, Lao/u;->i:Z

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Leo/s;->h()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v1}, Lgo/i;->o()Lgo/h;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lgo/i;->d(Lgo/h;Lgo/h;)Lfo/j;

    move-result-object v1

    invoke-virtual {v1}, Lfo/j;->e()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Leo/s;->l(Ljava/util/List;)V

    :cond_3
    invoke-static {v0}, Lao/r;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_4
    iget-object v3, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v3, v2}, Lgo/i;->q(Lgo/h;)V

    goto :goto_0

    :cond_5
    iget-object v1, p0, Lao/u;->c:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/a;

    if-eqz v1, :cond_6

    invoke-virtual {p0, v1, v0}, Lao/u;->r(Lio/a;C)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_6

    return-object v0

    :cond_6
    invoke-virtual {p0}, Lao/u;->C()Leo/s;

    move-result-object v0

    invoke-static {v0}, Lao/r;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_7
    invoke-virtual {p0}, Lao/u;->q()Leo/s;

    move-result-object v0

    invoke-static {v0}, Lao/r;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_8
    invoke-virtual {p0}, Lao/u;->B()Leo/s;

    move-result-object v0

    invoke-static {v0}, Lao/r;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_9
    invoke-virtual {p0}, Lao/u;->u()Leo/s;

    move-result-object v0

    invoke-static {v0}, Lao/r;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_a
    const/4 v0, 0x0

    return-object v0
.end method

.method public final u()Leo/s;
    .locals 3

    iget-object v0, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v0}, Lgo/i;->h()V

    iget v0, p0, Lao/u;->j:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iput v2, p0, Lao/u;->j:I

    if-eqz v0, :cond_1

    new-instance v0, Leo/i;

    invoke-direct {v0}, Leo/i;-><init>()V

    return-object v0

    :cond_1
    new-instance v0, Leo/x;

    invoke-direct {v0}, Leo/x;-><init>()V

    return-object v0
.end method

.method public final w(Lao/e;Lgo/h;)Lgo/d;
    .locals 10

    iget-object v0, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v0}, Lgo/i;->o()Lgo/h;

    move-result-object v8

    iget-object v0, p0, Lao/u;->h:Lgo/i;

    invoke-static {v0}, Lao/u;->t(Lgo/i;)Lao/u$c;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lao/u;->h:Lgo/i;

    iget-object v2, p1, Lao/e;->e:Lgo/h;

    invoke-virtual {v1, v2, p2}, Lgo/i;->d(Lgo/h;Lgo/h;)Lfo/j;

    move-result-object p2

    invoke-virtual {p2}, Lfo/j;->c()Ljava/lang/String;

    move-result-object v4

    new-instance v1, Lao/u$d;

    iget-object v2, p1, Lao/e;->a:Leo/b0;

    iget-object v3, p1, Lao/e;->c:Leo/b0;

    iget-object v6, v0, Lao/u$c;->a:Ljava/lang/String;

    iget-object v7, v0, Lao/u$c;->b:Ljava/lang/String;

    const/4 v9, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v9}, Lao/u$d;-><init>(Leo/b0;Leo/b0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgo/h;Lao/v;)V

    return-object v1

    :cond_0
    iget-object v0, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v0, v8}, Lgo/i;->q(Lgo/h;)V

    iget-object v0, p0, Lao/u;->h:Lgo/i;

    invoke-static {v0}, Lao/u;->x(Lgo/i;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_1

    iget-object v0, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v0, v8}, Lgo/i;->q(Lgo/h;)V

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
    iget-boolean v1, p1, Lao/e;->i:Z

    if-eqz v1, :cond_4

    if-eqz v0, :cond_4

    iget-object v0, p1, Lao/e;->a:Leo/b0;

    if-nez v0, :cond_4

    const/4 p1, 0x0

    return-object p1

    :cond_4
    iget-object v0, p0, Lao/u;->h:Lgo/i;

    iget-object v1, p1, Lao/e;->e:Lgo/h;

    invoke-virtual {v0, v1, p2}, Lgo/i;->d(Lgo/h;Lgo/h;)Lfo/j;

    move-result-object p2

    invoke-virtual {p2}, Lfo/j;->c()Ljava/lang/String;

    move-result-object v4

    new-instance v1, Lao/u$d;

    iget-object v2, p1, Lao/e;->a:Leo/b0;

    iget-object v3, p1, Lao/e;->c:Leo/b0;

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v9}, Lao/u$d;-><init>(Leo/b0;Leo/b0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgo/h;Lao/v;)V

    return-object v1
.end method

.method public final y()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Leo/s;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v0}, Lgo/i;->o()Lgo/h;

    move-result-object v2

    iget-object v0, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v0}, Lgo/i;->h()V

    iget-object v0, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v0}, Lgo/i;->o()Lgo/h;

    move-result-object v4

    iget-object v0, p0, Lao/u;->h:Lgo/i;

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Lgo/i;->i(C)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v0}, Lgo/i;->o()Lgo/h;

    move-result-object v5

    iget-object v0, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v0, v2, v4}, Lgo/i;->d(Lgo/h;Lgo/h;)Lfo/j;

    move-result-object v0

    invoke-virtual {p0, v0}, Lao/u;->M(Lfo/j;)Leo/b0;

    move-result-object v1

    iget-object v0, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v0, v4, v5}, Lgo/i;->d(Lgo/h;Lgo/h;)Lfo/j;

    move-result-object v0

    invoke-virtual {p0, v0}, Lao/u;->M(Lfo/j;)Leo/b0;

    move-result-object v3

    iget-object v6, p0, Lao/u;->l:Lao/e;

    iget-object v7, p0, Lao/u;->k:Lao/g;

    invoke-static/range {v1 .. v7}, Lao/e;->b(Leo/b0;Lgo/h;Leo/b0;Lgo/h;Lgo/h;Lao/e;Lao/g;)Lao/e;

    move-result-object v0

    invoke-virtual {p0, v0}, Lao/u;->d(Lao/e;)V

    invoke-static {v1, v3}, Lao/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final z(Lao/e;Lgo/h;)Leo/s;
    .locals 8

    invoke-virtual {p0, p1, p2}, Lao/u;->w(Lao/e;Lgo/h;)Lgo/d;

    move-result-object p2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v1}, Lgo/i;->o()Lgo/h;

    move-result-object v1

    iget-object v2, p0, Lao/u;->d:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lgo/e;

    iget-object v4, p0, Lao/u;->h:Lgo/i;

    iget-object v5, p0, Lao/u;->a:Lfo/c;

    invoke-interface {v3, p2, v4, v5}, Lgo/e;->a(Lgo/d;Lgo/i;Lfo/c;)Lgo/f;

    move-result-object v3

    instance-of v4, v3, Lbo/k;

    if-nez v4, :cond_1

    iget-object v3, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {v3, v1}, Lgo/i;->q(Lgo/h;)V

    goto :goto_0

    :cond_1
    check-cast v3, Lbo/k;

    invoke-virtual {v3}, Lbo/k;->d()Leo/s;

    move-result-object v4

    invoke-virtual {v3}, Lbo/k;->e()Lgo/h;

    move-result-object v5

    invoke-virtual {v3}, Lbo/k;->g()Z

    move-result v6

    sget-object v7, Lao/u$a;->a:[I

    invoke-virtual {v3}, Lbo/k;->f()Lbo/k$a;

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
    iget-object p2, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {p2, v5}, Lgo/i;->q(Lgo/h;)V

    invoke-virtual {p0, p1, v4, v6}, Lao/u;->J(Lao/e;Leo/s;Z)Leo/s;

    move-result-object p1

    return-object p1

    :cond_3
    iget-object p2, p0, Lao/u;->h:Lgo/i;

    invoke-virtual {p2, v5}, Lgo/i;->q(Lgo/h;)V

    invoke-virtual {p0, p1, v4, v6}, Lao/u;->N(Lao/e;Leo/s;Z)Leo/s;

    move-result-object p1

    return-object p1

    :cond_4
    return-object v0
.end method
