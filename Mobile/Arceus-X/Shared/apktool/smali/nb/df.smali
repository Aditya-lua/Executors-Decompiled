.class public final Lnb/df;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Z

.field public c:Lcom/google/android/gms/internal/measurement/f7;

.field public d:Ljava/util/BitSet;

.field public e:Ljava/util/BitSet;

.field public f:Ljava/util/Map;

.field public g:Ljava/util/Map;

.field public final synthetic h:Lnb/e;


# direct methods
.method public synthetic constructor <init>(Lnb/e;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/f7;Ljava/util/BitSet;Ljava/util/BitSet;Ljava/util/Map;Ljava/util/Map;[B)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/df;->h:Lnb/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lnb/df;->a:Ljava/lang/String;

    iput-object p4, p0, Lnb/df;->d:Ljava/util/BitSet;

    iput-object p5, p0, Lnb/df;->e:Ljava/util/BitSet;

    iput-object p6, p0, Lnb/df;->f:Ljava/util/Map;

    new-instance p1, Lw1/a;

    .line 2
    invoke-direct {p1}, Lw1/a;-><init>()V

    iput-object p1, p0, Lnb/df;->g:Ljava/util/Map;

    .line 3
    invoke-interface {p7}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    new-instance p4, Ljava/util/ArrayList;

    .line 4
    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 5
    invoke-interface {p7, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ljava/lang/Long;

    invoke-interface {p4, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p5, p0, Lnb/df;->g:Ljava/util/Map;

    .line 6
    invoke-interface {p5, p2, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    iput-boolean p1, p0, Lnb/df;->b:Z

    iput-object p3, p0, Lnb/df;->c:Lcom/google/android/gms/internal/measurement/f7;

    return-void
.end method

.method public synthetic constructor <init>(Lnb/e;Ljava/lang/String;[B)V
    .locals 0

    .line 7
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/df;->h:Lnb/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lnb/df;->a:Ljava/lang/String;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lnb/df;->b:Z

    new-instance p1, Ljava/util/BitSet;

    .line 8
    invoke-direct {p1}, Ljava/util/BitSet;-><init>()V

    iput-object p1, p0, Lnb/df;->d:Ljava/util/BitSet;

    new-instance p1, Ljava/util/BitSet;

    .line 9
    invoke-direct {p1}, Ljava/util/BitSet;-><init>()V

    iput-object p1, p0, Lnb/df;->e:Ljava/util/BitSet;

    .line 10
    new-instance p1, Lw1/a;

    invoke-direct {p1}, Lw1/a;-><init>()V

    iput-object p1, p0, Lnb/df;->f:Ljava/util/Map;

    new-instance p1, Lw1/a;

    .line 11
    invoke-direct {p1}, Lw1/a;-><init>()V

    iput-object p1, p0, Lnb/df;->g:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a(Lnb/c;)V
    .locals 9
    .param p1    # Lnb/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Lnb/c;->a()I

    move-result v0

    iget-object v1, p1, Lnb/c;->c:Ljava/lang/Boolean;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lnb/df;->e:Ljava/util/BitSet;

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Ljava/util/BitSet;->set(IZ)V

    :cond_0
    iget-object v1, p1, Lnb/c;->d:Ljava/lang/Boolean;

    if-eqz v1, :cond_1

    iget-object v2, p0, Lnb/df;->d:Ljava/util/BitSet;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v2, v0, v1}, Ljava/util/BitSet;->set(IZ)V

    :cond_1
    iget-object v1, p1, Lnb/c;->e:Ljava/lang/Long;

    const-wide/16 v2, 0x3e8

    if-eqz v1, :cond_3

    iget-object v1, p0, Lnb/df;->f:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    iget-object v5, p1, Lnb/c;->e:Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    div-long/2addr v5, v2

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    cmp-long v1, v5, v7

    if-lez v1, :cond_3

    :cond_2
    iget-object v1, p0, Lnb/df;->f:Ljava/util/Map;

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iget-object v1, p1, Lnb/c;->f:Ljava/lang/Long;

    if-eqz v1, :cond_8

    iget-object v1, p0, Lnb/df;->g:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-nez v1, :cond_4

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v4, p0, Lnb/df;->g:Ljava/util/Map;

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    invoke-virtual {p1}, Lnb/c;->b()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v1}, Ljava/util/List;->clear()V

    :cond_5
    invoke-static {}, Lcom/google/android/gms/internal/measurement/ye;->a()Z

    iget-object v0, p0, Lnb/df;->h:Lnb/e;

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    move-result-object v4

    iget-object v5, p0, Lnb/df;->a:Ljava/lang/String;

    sget-object v6, Lnb/z4;->G0:Lnb/y4;

    invoke-virtual {v4, v5, v6}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-virtual {p1}, Lnb/c;->c()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v1}, Ljava/util/List;->clear()V

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/measurement/ye;->a()Z

    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    move-result-object v0

    iget-object v4, p0, Lnb/df;->a:Ljava/lang/String;

    invoke-virtual {v0, v4, v6}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object p1, p1, Lnb/c;->f:Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    div-long/2addr v4, v2

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_7
    iget-object p1, p1, Lnb/c;->f:Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    div-long/2addr v4, v2

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    return-void
.end method

.method public final b(I)Lcom/google/android/gms/internal/measurement/c6;
    .locals 6
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {}, Lcom/google/android/gms/internal/measurement/c6;->O()Lcom/google/android/gms/internal/measurement/b6;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/b6;->x(I)Lcom/google/android/gms/internal/measurement/b6;

    iget-boolean p1, p0, Lnb/df;->b:Z

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/b6;->C(Z)Lcom/google/android/gms/internal/measurement/b6;

    iget-object p1, p0, Lnb/df;->c:Lcom/google/android/gms/internal/measurement/f7;

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/b6;->A(Lcom/google/android/gms/internal/measurement/f7;)Lcom/google/android/gms/internal/measurement/b6;

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/f7;->P()Lcom/google/android/gms/internal/measurement/e7;

    move-result-object p1

    iget-object v1, p0, Lnb/df;->d:Ljava/util/BitSet;

    invoke-static {v1}, Lnb/re;->Q(Ljava/util/BitSet;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/e7;->A(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/e7;

    iget-object v1, p0, Lnb/df;->e:Ljava/util/BitSet;

    invoke-static {v1}, Lnb/re;->Q(Ljava/util/BitSet;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/e7;->x(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/e7;

    iget-object v1, p0, Lnb/df;->f:Ljava/util/Map;

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v1, p0, Lnb/df;->f:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget-object v5, p0, Lnb/df;->f:Ljava/util/Map;

    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    if-eqz v3, :cond_2

    invoke-static {}, Lcom/google/android/gms/internal/measurement/m6;->K()Lcom/google/android/gms/internal/measurement/l6;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/measurement/l6;->x(I)Lcom/google/android/gms/internal/measurement/l6;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v5, v3, v4}, Lcom/google/android/gms/internal/measurement/l6;->z(J)Lcom/google/android/gms/internal/measurement/l6;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/m6;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    move-object v1, v2

    :goto_1
    if-eqz v1, :cond_4

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/e7;->D(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/e7;

    :cond_4
    iget-object v1, p0, Lnb/df;->g:Ljava/util/Map;

    if-nez v1, :cond_5

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_3

    :cond_5
    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v1, p0, Lnb/df;->g:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/h7;->M()Lcom/google/android/gms/internal/measurement/g7;

    move-result-object v4

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/measurement/g7;->x(I)Lcom/google/android/gms/internal/measurement/g7;

    iget-object v5, p0, Lnb/df;->g:Ljava/util/Map;

    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_6

    invoke-static {v3}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/measurement/g7;->z(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/g7;

    :cond_6
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/h7;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    move-object v1, v2

    :goto_3
    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/measurement/e7;->G(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/e7;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/b6;->z(Lcom/google/android/gms/internal/measurement/e7;)Lcom/google/android/gms/internal/measurement/b6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/c6;

    return-object p1
.end method

.method public final synthetic c()Ljava/util/BitSet;
    .locals 1

    iget-object v0, p0, Lnb/df;->d:Ljava/util/BitSet;

    return-object v0
.end method
