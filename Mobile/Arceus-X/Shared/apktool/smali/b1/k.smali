.class public Lb1/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/w2$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb1/k$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lg0/w2;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lg0/w2;",
            "Lx0/n0;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lg0/w2;",
            "Lb1/j;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lg0/w2;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ln0/j4;

.field public final f:Ln0/p0;

.field public final g:Ln0/p0;

.field public final h:Ln0/u;

.field public final i:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ln0/i4<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final j:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lg0/w2;",
            "Ln0/i4<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final k:Lb1/c;

.field public l:Lb1/c;


# direct methods
.method public constructor <init>(Ln0/p0;Ln0/p0;Ljava/util/Set;Ln0/j4;Lb1/g$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/p0;",
            "Ln0/p0;",
            "Ljava/util/Set<",
            "Lg0/w2;",
            ">;",
            "Ln0/j4;",
            "Lb1/g$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lb1/k;->b:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lb1/k;->c:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lb1/k;->d:Ljava/util/Map;

    invoke-virtual {p0}, Lb1/k;->v()Ln0/u;

    move-result-object v0

    iput-object v0, p0, Lb1/k;->h:Ln0/u;

    iput-object p1, p0, Lb1/k;->f:Ln0/p0;

    iput-object p2, p0, Lb1/k;->g:Ln0/p0;

    iput-object p4, p0, Lb1/k;->e:Ln0/j4;

    iput-object p3, p0, Lb1/k;->a:Ljava/util/Set;

    invoke-static {p1, p3, p4}, Lb1/k;->U(Ln0/p0;Ljava/util/Set;Ln0/j4;)Ljava/util/Map;

    move-result-object p4

    iput-object p4, p0, Lb1/k;->j:Ljava/util/Map;

    new-instance v0, Ljava/util/HashSet;

    invoke-interface {p4}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p4

    invoke-direct {v0, p4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lb1/k;->i:Ljava/util/Set;

    new-instance p4, Lb1/c;

    invoke-direct {p4, p1, v0}, Lb1/c;-><init>(Ln0/p0;Ljava/util/Set;)V

    iput-object p4, p0, Lb1/k;->k:Lb1/c;

    if-eqz p2, :cond_0

    new-instance p4, Lb1/c;

    invoke-direct {p4, p2, v0}, Lb1/c;-><init>(Ln0/p0;Ljava/util/Set;)V

    iput-object p4, p0, Lb1/k;->l:Lb1/c;

    :cond_0
    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lg0/w2;

    iget-object p4, p0, Lb1/k;->d:Ljava/util/Map;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p4, p3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p4, p0, Lb1/k;->c:Ljava/util/Map;

    new-instance v0, Lb1/j;

    invoke-direct {v0, p1, p0, p5}, Lb1/j;-><init>(Ln0/p0;Lg0/w2$c;Lb1/g$a;)V

    invoke-interface {p4, p3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static A(Lg0/w2;Ln0/t3;Ljava/util/Map;)Ln0/t3;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg0/w2;",
            "Ln0/t3;",
            "Ljava/util/Map<",
            "Lg0/w2;",
            "Landroid/util/Size;",
            ">;)",
            "Ln0/t3;"
        }
    .end annotation

    invoke-virtual {p1}, Ln0/t3;->i()Ln0/t3$a;

    move-result-object p1

    invoke-interface {p2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/util/Size;

    if-eqz p0, :cond_0

    invoke-virtual {p1, p0}, Ln0/t3$a;->e(Landroid/util/Size;)Ln0/t3$a;

    :cond_0
    invoke-virtual {p1}, Ln0/t3$a;->a()Ln0/t3;

    move-result-object p0

    return-object p0
.end method

.method public static B(Lg0/w2;)Ln0/u1;
    .locals 3

    instance-of v0, p0, Lg0/f1;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lg0/w2;->z()Ln0/o3;

    move-result-object p0

    invoke-virtual {p0}, Ln0/o3;->p()Ljava/util/List;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lg0/w2;->z()Ln0/o3;

    move-result-object p0

    invoke-virtual {p0}, Ln0/o3;->l()Ln0/l1;

    move-result-object p0

    invoke-virtual {p0}, Ln0/l1;->i()Ljava/util/List;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-gt v0, v2, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    invoke-static {v0}, Lx2/g;->i(Z)V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v2, :cond_2

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln0/u1;

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static C(Lg0/w2;)I
    .locals 1

    instance-of v0, p0, Lg0/a2;

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    instance-of p0, p0, Lg0/f1;

    if-eqz p0, :cond_1

    const/4 p0, 0x4

    return p0

    :cond_1
    const/4 p0, 0x2

    return p0
.end method

.method public static G(Ljava/util/Set;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ln0/i4<",
            "*>;>;)I"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ln0/i4;

    invoke-interface {v2, v0}, Ln0/i4;->B(I)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    goto :goto_0

    :cond_0
    return v1
.end method

.method public static R(Ljava/util/Set;)Landroid/util/Range;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ln0/i4<",
            "*>;>;)",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    sget-object v0, Ln0/t3;->a:Landroid/util/Range;

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/i4;

    invoke-interface {v1, v0}, Ln0/i4;->z(Landroid/util/Range;)Landroid/util/Range;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v2, Ln0/t3;->a:Landroid/util/Range;

    invoke-virtual {v2, v0}, Landroid/util/Range;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-virtual {v0, v1}, Landroid/util/Range;->intersect(Landroid/util/Range;)Landroid/util/Range;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No intersected frame rate can be found from the target frame rate settings of the UseCases! Resolved: "

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " <<>> "

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v2, "VirtualCameraAdapter"

    invoke-static {v2, p0}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/util/Range;->extend(Landroid/util/Range;)Landroid/util/Range;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v0
.end method

.method public static S(Ln0/e0;Ln0/o3;I)V
    .locals 4

    invoke-virtual {p1}, Ln0/o3;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/u;

    new-instance v2, Lb1/l;

    invoke-virtual {p1}, Ln0/o3;->l()Ln0/l1;

    move-result-object v3

    invoke-virtual {v3}, Ln0/l1;->j()Ln0/z3;

    move-result-object v3

    invoke-direct {v2, v3, p0}, Lb1/l;-><init>(Ln0/z3;Ln0/e0;)V

    invoke-virtual {v1, p2, v2}, Ln0/u;->b(ILn0/e0;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static U(Ln0/p0;Ljava/util/Set;Ln0/j4;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/p0;",
            "Ljava/util/Set<",
            "Lg0/w2;",
            ">;",
            "Ln0/j4;",
            ")",
            "Ljava/util/Map<",
            "Lg0/w2;",
            "Ln0/i4<",
            "*>;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/w2;

    invoke-interface {p0}, Ln0/p0;->k()Ln0/o0;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v1, v3, p2}, Lg0/w2;->m(ZLn0/j4;)Ln0/i4;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v4, v3}, Lg0/w2;->I(Ln0/o0;Ln0/i4;Ln0/i4;)Ln0/i4;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static w(Lx0/n0;Ln0/u1;Ln0/o3;)V
    .locals 0

    invoke-virtual {p0}, Lx0/n0;->v()V

    :try_start_0
    invoke-virtual {p0, p1}, Lx0/n0;->y(Ln0/u1;)V
    :try_end_0
    .catch Ln0/u1$a; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    invoke-virtual {p2}, Ln0/o3;->d()Ln0/o3$d;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p2}, Ln0/o3;->d()Ln0/o3$d;

    move-result-object p0

    sget-object p1, Ln0/o3$g;->a:Ln0/o3$g;

    invoke-interface {p0, p2, p1}, Ln0/o3$d;->a(Ln0/o3;Ln0/o3$g;)V

    :cond_0
    return-void
.end method

.method public static x(Lg0/w2;)I
    .locals 0

    instance-of p0, p0, Lg0/f1;

    if-eqz p0, :cond_0

    const/16 p0, 0x100

    return p0

    :cond_0
    const/16 p0, 0x22

    return p0
.end method


# virtual methods
.method public D()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lg0/w2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lb1/k;->a:Ljava/util/Set;

    return-object v0
.end method

.method public E(Lx0/n0;IZZ)Ljava/util/Map;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx0/n0;",
            "IZZ)",
            "Ljava/util/Map<",
            "Lg0/w2;",
            "Lz0/f;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lb1/k;->a:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lg0/w2;

    iget-object v5, p0, Lb1/k;->k:Lb1/c;

    iget-object v6, p0, Lb1/k;->f:Ln0/p0;

    move-object v3, p0

    move-object v7, p1

    move v8, p2

    move v9, p3

    move v10, p4

    invoke-virtual/range {v3 .. v10}, Lb1/k;->u(Lg0/w2;Lb1/c;Ln0/p0;Lx0/n0;IZZ)Lz0/f;

    move-result-object p1

    invoke-virtual {p0, v4}, Lb1/k;->W(Lg0/w2;)V

    invoke-interface {v0, v4, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object p1, v7

    goto :goto_0

    :cond_0
    move-object v3, p0

    return-object v0
.end method

.method public F(Lx0/n0;Lx0/n0;IZ)Ljava/util/Map;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx0/n0;",
            "Lx0/n0;",
            "IZ)",
            "Ljava/util/Map<",
            "Lg0/w2;",
            "Ly0/d;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lb1/k;->a:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lg0/w2;

    iget-object v5, p0, Lb1/k;->k:Lb1/c;

    iget-object v6, p0, Lb1/k;->f:Ln0/p0;

    const/4 v10, 0x0

    move-object v3, p0

    move-object v7, p1

    move v8, p3

    move v9, p4

    invoke-virtual/range {v3 .. v10}, Lb1/k;->u(Lg0/w2;Lb1/c;Ln0/p0;Lx0/n0;IZZ)Lz0/f;

    move-result-object p1

    move-object p3, v7

    iget-object v5, v3, Lb1/k;->l:Lb1/c;

    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p4, v3, Lb1/k;->g:Ln0/p0;

    invoke-static {p4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v6, p4

    check-cast v6, Ln0/p0;

    move-object v7, p2

    invoke-virtual/range {v3 .. v10}, Lb1/k;->u(Lg0/w2;Lb1/c;Ln0/p0;Lx0/n0;IZZ)Lz0/f;

    move-result-object p2

    invoke-virtual {p0, v4}, Lb1/k;->W(Lg0/w2;)V

    invoke-static {p1, p2}, Ly0/d;->c(Lz0/f;Lz0/f;)Ly0/d;

    move-result-object p1

    invoke-interface {v0, v4, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object p1, p3

    move-object p2, v7

    move p3, v8

    move p4, v9

    goto :goto_0

    :cond_0
    move-object v3, p0

    return-object v0
.end method

.method public H()Ln0/u;
    .locals 1

    iget-object v0, p0, Lb1/k;->h:Ln0/u;

    return-object v0
.end method

.method public final I()Lg0/a2;
    .locals 3

    iget-object v0, p0, Lb1/k;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/w2;

    instance-of v2, v1, Lg0/a2;

    if-eqz v2, :cond_0

    check-cast v1, Lg0/a2;

    return-object v1

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public J(Lx0/n0;Z)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx0/n0;",
            "Z)",
            "Ljava/util/Map<",
            "Lg0/w2;",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lb1/k;->a:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg0/w2;

    iget-object v3, p0, Lb1/k;->k:Lb1/c;

    iget-object v4, p0, Lb1/k;->j:Ljava/util/Map;

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ln0/i4;

    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v4, Ln0/i4;

    invoke-virtual {p1}, Lx0/n0;->n()Landroid/graphics/Rect;

    move-result-object v5

    invoke-virtual {p1}, Lx0/n0;->r()Landroid/graphics/Matrix;

    move-result-object v6

    invoke-static {v6}, Lp0/a0;->g(Landroid/graphics/Matrix;)I

    move-result v6

    invoke-virtual {v3, v4, v5, v6, p2}, Lb1/c;->r(Ln0/i4;Landroid/graphics/Rect;IZ)Lb1/b;

    move-result-object v3

    invoke-virtual {v3}, Lb1/b;->c()Landroid/util/Size;

    move-result-object v4

    invoke-interface {v0, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Selected child size: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lb1/b;->c()Landroid/util/Size;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", useCase: "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "VirtualCameraAdapter"

    invoke-static {v3, v2}, Lg0/r1;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final K(Lg0/w2;)Lx0/n0;
    .locals 1

    iget-object v0, p0, Lb1/k;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx0/n0;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method public final L(Lg0/w2;)Z
    .locals 1

    iget-object v0, p0, Lb1/k;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method public M(Ln0/w2;)V
    .locals 4

    iget-object v0, p0, Lb1/k;->k:Lb1/c;

    invoke-virtual {v0, p1}, Lb1/c;->o(Ln0/w2;)Ljava/util/List;

    move-result-object v0

    sget-object v1, Ln0/i2;->v:Ln0/n1$a;

    invoke-interface {p1, v1, v0}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    sget-object v0, Ln0/i4;->A:Ln0/n1$a;

    iget-object v1, p0, Lb1/k;->i:Ljava/util/Set;

    invoke-static {v1}, Lb1/k;->G(Ljava/util/Set;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    iget-object v0, p0, Lb1/k;->i:Ljava/util/Set;

    invoke-static {v0}, Lb1/a;->d(Ljava/util/Set;)Lg0/k0;

    move-result-object v0

    if-eqz v0, :cond_3

    sget-object v1, Ln0/h2;->l:Ln0/n1$a;

    invoke-interface {p1, v1, v0}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    sget-object v0, Ln0/i4;->C:Ln0/n1$a;

    iget-object v1, p0, Lb1/k;->i:Ljava/util/Set;

    invoke-static {v1}, Lb1/k;->R(Ljava/util/Set;)Landroid/util/Range;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    iget-object v0, p0, Lb1/k;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/w2;

    iget-object v2, p0, Lb1/k;->j:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/i4;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Ln0/i4;

    invoke-interface {v1}, Ln0/i4;->x()I

    move-result v2

    if-eqz v2, :cond_1

    sget-object v2, Ln0/i4;->I:Ln0/n1$a;

    invoke-interface {v1}, Ln0/i4;->x()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {p1, v2, v3}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    :cond_1
    invoke-interface {v1}, Ln0/i4;->E()I

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Ln0/i4;->H:Ln0/n1$a;

    invoke-interface {v1}, Ln0/i4;->E()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v2, v1}, Ln0/w2;->G(Ln0/n1$a;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public N()V
    .locals 2

    iget-object v0, p0, Lb1/k;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/w2;

    invoke-virtual {v1}, Lg0/w2;->P()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public O()V
    .locals 2

    iget-object v0, p0, Lb1/k;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/w2;

    invoke-virtual {v1}, Lg0/w2;->R()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public P()V
    .locals 2

    iget-object v0, p0, Lb1/k;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/w2;

    invoke-virtual {v1}, Lg0/w2;->S()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public Q()V
    .locals 2

    invoke-static {}, Lp0/z;->b()V

    iget-object v0, p0, Lb1/k;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/w2;

    invoke-virtual {p0, v1}, Lb1/k;->n(Lg0/w2;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public T(Ljava/util/Map;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lg0/w2;",
            "Lx0/n0;",
            ">;",
            "Ljava/util/Map<",
            "Lg0/w2;",
            "Landroid/util/Size;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lb1/k;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lb1/k;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    iget-object p1, p0, Lb1/k;->b:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/w2;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx0/n0;

    invoke-virtual {v0}, Lx0/n0;->n()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {v1, v2}, Lg0/w2;->b0(Landroid/graphics/Rect;)V

    invoke-virtual {v0}, Lx0/n0;->r()Landroid/graphics/Matrix;

    move-result-object v2

    invoke-virtual {v1, v2}, Lg0/w2;->Z(Landroid/graphics/Matrix;)V

    invoke-virtual {v0}, Lx0/n0;->s()Ln0/t3;

    move-result-object v0

    invoke-static {v1, v0, p2}, Lb1/k;->A(Lg0/w2;Ln0/t3;Ljava/util/Map;)Ln0/t3;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lg0/w2;->e0(Ln0/t3;Ln0/t3;)V

    invoke-virtual {v1}, Lg0/w2;->M()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public V()V
    .locals 3

    iget-object v0, p0, Lb1/k;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/w2;

    iget-object v2, p0, Lb1/k;->c:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb1/j;

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v2, Ln0/p0;

    invoke-virtual {v1, v2}, Lg0/w2;->c0(Ln0/p0;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final W(Lg0/w2;)V
    .locals 2

    iget-object v0, p0, Lb1/k;->f:Ln0/p0;

    invoke-virtual {p0, p1, v0}, Lb1/k;->z(Lg0/w2;Ln0/p0;)I

    move-result v0

    iget-object v1, p0, Lb1/k;->c:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb1/j;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, v0}, Lb1/j;->t(I)V

    return-void
.end method

.method public g(Lg0/w2;)V
    .locals 2

    invoke-static {}, Lp0/z;->b()V

    invoke-virtual {p0, p1}, Lb1/k;->L(Lg0/w2;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lb1/k;->K(Lg0/w2;)Lx0/n0;

    move-result-object v0

    invoke-static {p1}, Lb1/k;->B(Lg0/w2;)Ln0/u1;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lg0/w2;->z()Ln0/o3;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lb1/k;->w(Lx0/n0;Ln0/u1;Ln0/o3;)V

    return-void

    :cond_1
    invoke-virtual {v0}, Lx0/n0;->m()V

    return-void
.end method

.method public m(Lg0/w2;)V
    .locals 2

    invoke-static {}, Lp0/z;->b()V

    invoke-virtual {p0, p1}, Lb1/k;->L(Lg0/w2;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lb1/k;->d:Ljava/util/Map;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lb1/k;->K(Lg0/w2;)Lx0/n0;

    move-result-object p1

    invoke-virtual {p1}, Lx0/n0;->m()V

    return-void
.end method

.method public n(Lg0/w2;)V
    .locals 2

    invoke-static {}, Lp0/z;->b()V

    invoke-virtual {p0, p1}, Lb1/k;->K(Lg0/w2;)Lx0/n0;

    move-result-object v0

    invoke-virtual {p0, p1}, Lb1/k;->L(Lg0/w2;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lb1/k;->B(Lg0/w2;)Ln0/u1;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lg0/w2;->z()Ln0/o3;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lb1/k;->w(Lx0/n0;Ln0/u1;Ln0/o3;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public s(Lg0/w2;)V
    .locals 2

    invoke-static {}, Lp0/z;->b()V

    invoke-virtual {p0, p1}, Lb1/k;->L(Lg0/w2;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lb1/k;->d:Ljava/util/Map;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lb1/k;->B(Lg0/w2;)Ln0/u1;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lb1/k;->K(Lg0/w2;)Lx0/n0;

    move-result-object v1

    invoke-virtual {p1}, Lg0/w2;->z()Ln0/o3;

    move-result-object p1

    invoke-static {v1, v0, p1}, Lb1/k;->w(Lx0/n0;Ln0/u1;Ln0/o3;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public t()V
    .locals 5

    iget-object v0, p0, Lb1/k;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/w2;

    iget-object v2, p0, Lb1/k;->c:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb1/j;

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v2, Ln0/p0;

    const/4 v3, 0x1

    iget-object v4, p0, Lb1/k;->e:Ln0/j4;

    invoke-virtual {v1, v3, v4}, Lg0/w2;->m(ZLn0/j4;)Ln0/i4;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v4, v4, v3}, Lg0/w2;->d(Ln0/p0;Ln0/p0;Ln0/i4;Ln0/i4;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final u(Lg0/w2;Lb1/c;Ln0/p0;Lx0/n0;IZZ)Lz0/f;
    .locals 7

    invoke-interface {p3}, Ln0/p0;->d()Lg0/t;

    move-result-object v0

    invoke-interface {v0, p5}, Lg0/t;->w(I)I

    move-result p5

    invoke-virtual {p4}, Lx0/n0;->r()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-static {v0}, Lp0/a0;->l(Landroid/graphics/Matrix;)Z

    move-result v0

    iget-object v1, p0, Lb1/k;->j:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln0/i4;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Ln0/i4;

    invoke-virtual {p4}, Lx0/n0;->n()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {p4}, Lx0/n0;->r()Landroid/graphics/Matrix;

    move-result-object v3

    invoke-static {v3}, Lp0/a0;->g(Landroid/graphics/Matrix;)I

    move-result v3

    invoke-virtual {p2, v1, v2, v3, p6}, Lb1/c;->r(Ln0/i4;Landroid/graphics/Rect;IZ)Lb1/b;

    move-result-object p2

    invoke-virtual {p2}, Lb1/b;->b()Landroid/graphics/Rect;

    move-result-object v3

    invoke-virtual {p2}, Lb1/b;->a()Landroid/util/Size;

    move-result-object p2

    invoke-virtual {p0, p1, p3}, Lb1/k;->z(Lg0/w2;Ln0/p0;)I

    move-result p6

    invoke-virtual {p4}, Lx0/n0;->q()I

    move-result p4

    add-int/2addr p4, p6

    sub-int/2addr p4, p5

    invoke-static {p4}, Lp0/a0;->w(I)I

    move-result v5

    if-eqz p7, :cond_0

    const/4 p3, 0x0

    :goto_0
    move v6, p3

    goto :goto_1

    :cond_0
    invoke-virtual {p1, p3}, Lg0/w2;->H(Ln0/p0;)Z

    move-result p3

    xor-int/2addr p3, v0

    goto :goto_0

    :goto_1
    invoke-static {p1}, Lb1/k;->C(Lg0/w2;)I

    move-result v1

    invoke-static {p1}, Lb1/k;->x(Lg0/w2;)I

    move-result v2

    invoke-static {p2, v5}, Lp0/a0;->q(Landroid/util/Size;I)Landroid/util/Size;

    move-result-object v4

    invoke-static/range {v1 .. v6}, Lz0/f;->h(IILandroid/graphics/Rect;Landroid/util/Size;IZ)Lz0/f;

    move-result-object p1

    return-object p1
.end method

.method public v()Ln0/u;
    .locals 1

    new-instance v0, Lb1/k$a;

    invoke-direct {v0, p0}, Lb1/k$a;-><init>(Lb1/k;)V

    return-object v0
.end method

.method public y(Lx0/n0;Lx0/n0;IZ)Ly0/d;
    .locals 9

    invoke-virtual {p0}, Lb1/k;->I()Lg0/a2;

    move-result-object v0

    invoke-static {v0}, Lx2/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lg0/a2;

    iget-object v3, p0, Lb1/k;->k:Lb1/c;

    iget-object v4, p0, Lb1/k;->f:Ln0/p0;

    const/4 v8, 0x0

    move-object v1, p0

    move-object v5, p1

    move v6, p3

    move v7, p4

    invoke-virtual/range {v1 .. v8}, Lb1/k;->u(Lg0/w2;Lb1/c;Ln0/p0;Lx0/n0;IZZ)Lz0/f;

    move-result-object p1

    iget-object v3, v1, Lb1/k;->k:Lb1/c;

    iget-object v4, v1, Lb1/k;->g:Ln0/p0;

    move-object v5, p2

    invoke-virtual/range {v1 .. v8}, Lb1/k;->u(Lg0/w2;Lb1/c;Ln0/p0;Lx0/n0;IZZ)Lz0/f;

    move-result-object p2

    invoke-static {p1, p2}, Ly0/d;->c(Lz0/f;Lz0/f;)Ly0/d;

    move-result-object p1

    return-object p1
.end method

.method public final z(Lg0/w2;Ln0/p0;)I
    .locals 1

    invoke-virtual {p1}, Lg0/w2;->l()Ln0/i4;

    move-result-object p1

    check-cast p1, Ln0/i2;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ln0/i2;->J(I)I

    move-result p1

    invoke-interface {p2}, Ln0/p0;->d()Lg0/t;

    move-result-object p2

    invoke-interface {p2, p1}, Lg0/t;->w(I)I

    move-result p1

    return p1
.end method
