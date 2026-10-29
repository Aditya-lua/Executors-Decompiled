.class public final Lnb/jb;
.super Lnb/b5;
.source "SourceFile"


# instance fields
.field public volatile c:Lnb/bb;

.field public volatile d:Lnb/bb;

.field public e:Lnb/bb;

.field public final f:Ljava/util/Map;

.field public g:Lcom/google/android/gms/internal/measurement/zzdf;

.field public volatile h:Z

.field public volatile i:Lnb/bb;

.field public j:Lnb/bb;

.field public k:Z

.field public final l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lnb/g7;)V
    .locals 0

    invoke-direct {p0, p1}, Lnb/b5;-><init>(Lnb/g7;)V

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb/jb;->l:Ljava/lang/Object;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lnb/jb;->f:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final synthetic A(Landroid/os/Bundle;Lnb/bb;Lnb/bb;J)V
    .locals 8

    const-string v0, "screen_name"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    const-string v0, "screen_class"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->C()Lnb/ve;

    move-result-object v0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    const-string v2, "screen_view"

    move-object v3, p1

    invoke-virtual/range {v0 .. v5}, Lnb/ve;->t(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/util/List;Z)Landroid/os/Bundle;

    move-result-object v7

    const/4 v6, 0x1

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    invoke-virtual/range {v1 .. v7}, Lnb/jb;->G(Lnb/bb;Lnb/bb;JZLandroid/os/Bundle;)V

    return-void
.end method

.method public final synthetic B(Lnb/bb;Lnb/bb;JZLandroid/os/Bundle;)V
    .locals 7

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    move v5, p5

    invoke-virtual/range {v0 .. v6}, Lnb/jb;->G(Lnb/bb;Lnb/bb;JZLandroid/os/Bundle;)V

    return-void
.end method

.method public final synthetic C(Lnb/bb;ZJ)V
    .locals 0

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2, p3, p4}, Lnb/jb;->o(Lnb/bb;ZJ)V

    return-void
.end method

.method public final synthetic D()Lnb/bb;
    .locals 1

    iget-object v0, p0, Lnb/jb;->j:Lnb/bb;

    return-object v0
.end method

.method public final synthetic E(Lnb/bb;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Lnb/jb;->j:Lnb/bb;

    return-void
.end method

.method public final F(Ljava/lang/String;Lnb/bb;Z)V
    .locals 12

    iget-object v3, p0, Lnb/jb;->c:Lnb/bb;

    if-nez v3, :cond_0

    iget-object v3, p0, Lnb/jb;->d:Lnb/bb;

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lnb/jb;->c:Lnb/bb;

    :goto_0
    iget-object v4, p2, Lnb/bb;->b:Ljava/lang/String;

    if-nez v4, :cond_2

    if-eqz p1, :cond_1

    const-string v4, "Activity"

    invoke-virtual {p0, p1, v4}, Lnb/jb;->r(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    move-object v6, v0

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :goto_2
    new-instance v4, Lnb/bb;

    iget-object v5, p2, Lnb/bb;->a:Ljava/lang/String;

    iget-wide v7, p2, Lnb/bb;->c:J

    iget-boolean v9, p2, Lnb/bb;->e:Z

    iget-wide v10, p2, Lnb/bb;->f:J

    invoke-direct/range {v4 .. v11}, Lnb/bb;-><init>(Ljava/lang/String;Ljava/lang/String;JZJ)V

    move-object v2, v4

    goto :goto_3

    :cond_2
    move-object v2, p2

    :goto_3
    iget-object v0, p0, Lnb/jb;->c:Lnb/bb;

    iput-object v0, p0, Lnb/jb;->d:Lnb/bb;

    iput-object v2, p0, Lnb/jb;->c:Lnb/bb;

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->e()Lu9/e;

    move-result-object v4

    invoke-interface {v4}, Lu9/e;->b()J

    move-result-wide v4

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object v7

    new-instance v0, Lnb/db;

    move-object v1, p0

    move v6, p3

    invoke-direct/range {v0 .. v6}, Lnb/db;-><init>(Lnb/jb;Lnb/bb;Lnb/bb;JZ)V

    invoke-virtual {v7, v0}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final G(Lnb/bb;Lnb/bb;JZLandroid/os/Bundle;)V
    .locals 14

    move-object v0, p1

    move-object/from16 v1, p2

    move-wide/from16 v2, p3

    move-object/from16 v4, p6

    invoke-virtual {p0}, Lnb/j8;->h()V

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v1, :cond_0

    iget-wide v7, v0, Lnb/bb;->c:J

    iget-wide v9, v1, Lnb/bb;->c:J

    cmp-long v7, v9, v7

    if-nez v7, :cond_0

    iget-object v7, v1, Lnb/bb;->b:Ljava/lang/String;

    iget-object v8, v0, Lnb/bb;->b:Ljava/lang/String;

    invoke-static {v7, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    iget-object v7, v1, Lnb/bb;->a:Ljava/lang/String;

    iget-object v8, v0, Lnb/bb;->a:Ljava/lang/String;

    invoke-static {v7, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1

    :cond_0
    move v7, v6

    goto :goto_0

    :cond_1
    move v7, v5

    :goto_0
    if-eqz p5, :cond_2

    iget-object v8, p0, Lnb/jb;->e:Lnb/bb;

    if-eqz v8, :cond_2

    move v5, v6

    :cond_2
    if-eqz v7, :cond_c

    if-eqz v4, :cond_3

    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7, v4}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    :goto_1
    move-object v13, v7

    goto :goto_2

    :cond_3
    new-instance v7, Landroid/os/Bundle;

    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    goto :goto_1

    :goto_2
    invoke-static {p1, v13, v6}, Lnb/ve;->k0(Lnb/bb;Landroid/os/Bundle;Z)V

    if-eqz v1, :cond_6

    iget-object v4, v1, Lnb/bb;->a:Ljava/lang/String;

    if-eqz v4, :cond_4

    const-string v7, "_pn"

    invoke-virtual {v13, v7, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    iget-object v4, v1, Lnb/bb;->b:Ljava/lang/String;

    if-eqz v4, :cond_5

    const-string v7, "_pc"

    invoke-virtual {v13, v7, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    iget-wide v7, v1, Lnb/bb;->c:J

    const-string v1, "_pi"

    invoke-virtual {v13, v1, v7, v8}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_6
    const-wide/16 v7, 0x0

    if-eqz v5, :cond_7

    iget-object v1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->z()Lnb/ld;

    move-result-object v1

    iget-object v1, v1, Lnb/ld;->f:Lnb/jd;

    iget-wide v9, v1, Lnb/jd;->b:J

    sub-long v9, v2, v9

    iput-wide v2, v1, Lnb/jd;->b:J

    cmp-long v1, v9, v7

    if-lez v1, :cond_7

    iget-object v1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->C()Lnb/ve;

    move-result-object v1

    invoke-virtual {v1, v13, v9, v10}, Lnb/ve;->Z(Landroid/os/Bundle;J)V

    :cond_7
    iget-object v1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->w()Lnb/k;

    move-result-object v4

    invoke-virtual {v4}, Lnb/k;->N()Z

    move-result v4

    if-nez v4, :cond_8

    const-string v4, "_mst"

    const-wide/16 v9, 0x1

    invoke-virtual {v13, v4, v9, v10}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_8
    iget-boolean v4, v0, Lnb/bb;->e:Z

    if-eq v6, v4, :cond_9

    const-string v9, "auto"

    goto :goto_3

    :cond_9
    const-string v9, "app"

    :goto_3
    invoke-virtual {v1}, Lnb/g7;->e()Lu9/e;

    move-result-object v1

    invoke-interface {v1}, Lu9/e;->a()J

    move-result-wide v10

    if-eqz v4, :cond_b

    move-wide/from16 p5, v7

    iget-wide v7, v0, Lnb/bb;->f:J

    cmp-long v1, v7, p5

    if-nez v1, :cond_a

    goto :goto_4

    :cond_a
    move-wide v11, v7

    goto :goto_5

    :cond_b
    :goto_4
    move-wide v11, v10

    :goto_5
    iget-object v1, p0, Lnb/j8;->a:Lnb/g7;

    const-string v10, "_vs"

    invoke-virtual {v1}, Lnb/g7;->B()Lnb/qa;

    move-result-object v8

    invoke-virtual/range {v8 .. v13}, Lnb/qa;->u(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;)V

    :cond_c
    if-eqz v5, :cond_d

    iget-object v1, p0, Lnb/jb;->e:Lnb/bb;

    invoke-virtual {p0, v1, v6, v2, v3}, Lnb/jb;->o(Lnb/bb;ZJ)V

    :cond_d
    iput-object v0, p0, Lnb/jb;->e:Lnb/bb;

    iget-boolean v1, v0, Lnb/bb;->e:Z

    if-eqz v1, :cond_e

    iput-object v0, p0, Lnb/jb;->j:Lnb/bb;

    :cond_e
    iget-object v1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->J()Lnb/tc;

    move-result-object v1

    invoke-virtual {v1, p1}, Lnb/tc;->u(Lnb/bb;)V

    return-void
.end method

.method public final m()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final o(Lnb/bb;ZJ)V
    .locals 4

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->M()Lnb/y1;

    move-result-object v1

    invoke-virtual {v0}, Lnb/g7;->e()Lu9/e;

    move-result-object v2

    invoke-interface {v2}, Lu9/e;->b()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lnb/y1;->k(J)V

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    iget-boolean v2, p1, Lnb/bb;->d:Z

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-virtual {v0}, Lnb/g7;->z()Lnb/ld;

    move-result-object v0

    iget-object v0, v0, Lnb/ld;->f:Lnb/jd;

    invoke-virtual {v0, v2, p2, p3, p4}, Lnb/jd;->d(ZZJ)Z

    move-result p2

    if-eqz p2, :cond_1

    if-eqz p1, :cond_1

    iput-boolean v1, p1, Lnb/bb;->d:Z

    :cond_1
    return-void
.end method

.method public final p(Lcom/google/android/gms/internal/measurement/zzdf;)Lnb/bb;
    .locals 6
    .param p1    # Lcom/google/android/gms/internal/measurement/zzdf;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p1, Lcom/google/android/gms/internal/measurement/zzdf;->f:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lnb/jb;->f:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnb/bb;

    if-nez v2, :cond_0

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzdf;->g:Ljava/lang/String;

    const-string v2, "Activity"

    invoke-virtual {p0, p1, v2}, Lnb/jb;->r(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Lnb/j8;->a:Lnb/g7;

    new-instance v3, Lnb/bb;

    invoke-virtual {v2}, Lnb/g7;->C()Lnb/ve;

    move-result-object v2

    invoke-virtual {v2}, Lnb/ve;->p0()J

    move-result-wide v4

    const/4 v2, 0x0

    invoke-direct {v3, v2, p1, v4, v5}, Lnb/bb;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v2, v3

    :cond_0
    iget-object p1, p0, Lnb/jb;->i:Lnb/bb;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lnb/jb;->i:Lnb/bb;

    return-object p1

    :cond_1
    return-object v2
.end method

.method public final q(Z)Lnb/bb;
    .locals 0

    invoke-virtual {p0}, Lnb/b5;->j()V

    invoke-virtual {p0}, Lnb/j8;->h()V

    if-nez p1, :cond_0

    iget-object p1, p0, Lnb/jb;->e:Lnb/bb;

    return-object p1

    :cond_0
    iget-object p1, p0, Lnb/jb;->e:Lnb/bb;

    if-eqz p1, :cond_1

    return-object p1

    :cond_1
    iget-object p1, p0, Lnb/jb;->j:Lnb/bb;

    return-object p1
.end method

.method public final r(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    if-nez p1, :cond_0

    const-string p1, "Activity"

    return-object p1

    :cond_0
    const-string p2, "\\."

    invoke-virtual {p1, p2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    array-length p2, p1

    if-lez p2, :cond_1

    add-int/lit8 p2, p2, -0x1

    aget-object p1, p1, p2

    goto :goto_0

    :cond_1
    const-string p1, ""

    :goto_0
    iget-object p2, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p2}, Lnb/g7;->w()Lnb/k;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lnb/k;->x(Ljava/lang/String;Z)I

    move-result v1

    if-le v0, v1, :cond_2

    invoke-virtual {p2}, Lnb/g7;->w()Lnb/k;

    move-result-object p2

    invoke-virtual {p2, v2, v3}, Lnb/k;->x(Ljava/lang/String;Z)I

    move-result p2

    invoke-virtual {p1, v3, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    :cond_2
    return-object p1
.end method

.method public final s(Landroid/os/Bundle;J)V
    .locals 12

    iget-object v1, p0, Lnb/jb;->l:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lnb/jb;->k:Z

    if-nez v0, :cond_0

    iget-object p1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->t()Lnb/u5;

    move-result-object p1

    const-string p2, "Cannot log screen view event when the app is in the background."

    invoke-virtual {p1, p2}, Lnb/u5;->a(Ljava/lang/String;)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_4

    :cond_0
    const-string v0, "screen_name"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v0, 0x0

    const/4 v2, 0x0

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_1

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    iget-object v5, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v5}, Lnb/g7;->w()Lnb/k;

    move-result-object v5

    invoke-virtual {v5, v0, v2}, Lnb/k;->x(Ljava/lang/String;Z)I

    move-result v5

    if-le v4, v5, :cond_2

    :cond_1
    iget-object p1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->t()Lnb/u5;

    move-result-object p1

    const-string p2, "Invalid screen name length for screen view. Length"

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    monitor-exit v1

    return-void

    :cond_2
    const-string v4, "screen_class"

    invoke-virtual {p1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_3

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    iget-object v6, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v6}, Lnb/g7;->w()Lnb/k;

    move-result-object v6

    invoke-virtual {v6, v0, v2}, Lnb/k;->x(Ljava/lang/String;Z)I

    move-result v0

    if-le v5, v0, :cond_4

    :cond_3
    iget-object p1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->t()Lnb/u5;

    move-result-object p1

    const-string p2, "Invalid screen class length for screen view. Length"

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    monitor-exit v1

    return-void

    :cond_4
    if-nez v4, :cond_6

    iget-object v0, p0, Lnb/jb;->g:Lcom/google/android/gms/internal/measurement/zzdf;

    if-eqz v0, :cond_5

    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzdf;->g:Ljava/lang/String;

    const-string v4, "Activity"

    invoke-virtual {p0, v0, v4}, Lnb/jb;->r(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_5
    const-string v4, "Activity"

    :cond_6
    :goto_0
    iget-object v0, p0, Lnb/jb;->c:Lnb/bb;

    iget-boolean v5, p0, Lnb/jb;->h:Z

    if-eqz v5, :cond_7

    if-eqz v0, :cond_7

    iput-boolean v2, p0, Lnb/jb;->h:Z

    iget-object v2, v0, Lnb/bb;->b:Ljava/lang/String;

    invoke-static {v2, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    iget-object v0, v0, Lnb/bb;->a:Ljava/lang/String;

    invoke-static {v0, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v2, :cond_7

    if-eqz v0, :cond_7

    iget-object p1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->t()Lnb/u5;

    move-result-object p1

    const-string p2, "Ignoring call to log screen view event with duplicate parameters."

    invoke-virtual {p1, p2}, Lnb/u5;->a(Ljava/lang/String;)V

    monitor-exit v1

    return-void

    :cond_7
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->w()Lnb/u5;

    move-result-object v1

    if-nez v3, :cond_8

    const-string v2, "null"

    goto :goto_1

    :cond_8
    move-object v2, v3

    :goto_1
    if-nez v4, :cond_9

    const-string v5, "null"

    goto :goto_2

    :cond_9
    move-object v5, v4

    :goto_2
    const-string v6, "Logging screen view with name, class"

    invoke-virtual {v1, v6, v2, v5}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, Lnb/jb;->c:Lnb/bb;

    if-nez v1, :cond_a

    iget-object v1, p0, Lnb/jb;->d:Lnb/bb;

    goto :goto_3

    :cond_a
    iget-object v1, p0, Lnb/jb;->c:Lnb/bb;

    :goto_3
    new-instance v2, Lnb/bb;

    invoke-virtual {v0}, Lnb/g7;->C()Lnb/ve;

    move-result-object v5

    invoke-virtual {v5}, Lnb/ve;->p0()J

    move-result-wide v5

    const/4 v7, 0x1

    move-wide v8, p2

    invoke-direct/range {v2 .. v9}, Lnb/bb;-><init>(Ljava/lang/String;Ljava/lang/String;JZJ)V

    iput-object v2, p0, Lnb/jb;->c:Lnb/bb;

    iput-object v1, p0, Lnb/jb;->d:Lnb/bb;

    iput-object v2, p0, Lnb/jb;->i:Lnb/bb;

    invoke-virtual {v0}, Lnb/g7;->e()Lu9/e;

    move-result-object p2

    invoke-interface {p2}, Lu9/e;->b()J

    move-result-wide v10

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object p2

    new-instance v5, Lnb/cb;

    move-object v6, p0

    move-object v7, p1

    move-object v9, v1

    move-object v8, v2

    invoke-direct/range {v5 .. v11}, Lnb/cb;-><init>(Lnb/jb;Landroid/os/Bundle;Lnb/bb;Lnb/bb;J)V

    invoke-virtual {p2, v5}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    return-void

    :goto_4
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final t(Lcom/google/android/gms/internal/measurement/zzdf;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7
    .param p1    # Lcom/google/android/gms/internal/measurement/zzdf;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    move-result-object v1

    invoke-virtual {v1}, Lnb/k;->N()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->t()Lnb/u5;

    move-result-object p1

    const-string p2, "setCurrentScreen cannot be called while screen reporting is disabled."

    invoke-virtual {p1, p2}, Lnb/u5;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v1, p0, Lnb/jb;->c:Lnb/bb;

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->t()Lnb/u5;

    move-result-object p1

    const-string p2, "setCurrentScreen cannot be called while no activity active"

    invoke-virtual {p1, p2}, Lnb/u5;->a(Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object v2, p0, Lnb/jb;->f:Ljava/util/Map;

    iget v3, p1, Lcom/google/android/gms/internal/measurement/zzdf;->f:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_2

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->t()Lnb/u5;

    move-result-object p1

    const-string p2, "setCurrentScreen must be called with an activity in the activity lifecycle"

    invoke-virtual {p1, p2}, Lnb/u5;->a(Ljava/lang/String;)V

    return-void

    :cond_2
    if-nez p3, :cond_3

    iget-object p3, p1, Lcom/google/android/gms/internal/measurement/zzdf;->g:Ljava/lang/String;

    const-string v4, "Activity"

    invoke-virtual {p0, p3, v4}, Lnb/jb;->r(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    :cond_3
    iget-object v4, v1, Lnb/bb;->b:Ljava/lang/String;

    iget-object v1, v1, Lnb/bb;->a:Ljava/lang/String;

    invoke-static {v4, p3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    invoke-static {v1, p2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v4, :cond_5

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->t()Lnb/u5;

    move-result-object p1

    const-string p2, "setCurrentScreen cannot be called with the same class and name"

    invoke-virtual {p1, p2}, Lnb/u5;->a(Ljava/lang/String;)V

    return-void

    :cond_5
    :goto_0
    const/4 v1, 0x0

    const/4 v4, 0x0

    if-eqz p2, :cond_7

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_6

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v5

    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    move-result-object v6

    invoke-virtual {v6, v4, v1}, Lnb/k;->x(Ljava/lang/String;Z)I

    move-result v6

    if-gt v5, v6, :cond_6

    goto :goto_1

    :cond_6
    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->t()Lnb/u5;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    const-string p3, "Invalid screen name length in setCurrentScreen. Length"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_7
    :goto_1
    if-eqz p3, :cond_9

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_8

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v5

    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    move-result-object v6

    invoke-virtual {v6, v4, v1}, Lnb/k;->x(Ljava/lang/String;Z)I

    move-result v1

    if-gt v5, v1, :cond_8

    goto :goto_2

    :cond_8
    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->t()Lnb/u5;

    move-result-object p1

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p2

    const-string p3, "Invalid class name length in setCurrentScreen. Length"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_9
    :goto_2
    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->w()Lnb/u5;

    move-result-object v1

    if-nez p2, :cond_a

    const-string v4, "null"

    goto :goto_3

    :cond_a
    move-object v4, p2

    :goto_3
    const-string v5, "Setting current screen to name, class"

    invoke-virtual {v1, v5, v4, p3}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Lnb/bb;

    invoke-virtual {v0}, Lnb/g7;->C()Lnb/ve;

    move-result-object v0

    invoke-virtual {v0}, Lnb/ve;->p0()J

    move-result-wide v4

    invoke-direct {v1, p2, p3, v4, v5}, Lnb/bb;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzdf;->g:Ljava/lang/String;

    const/4 p2, 0x1

    invoke-virtual {p0, p1, v1, p2}, Lnb/jb;->F(Ljava/lang/String;Lnb/bb;Z)V

    return-void
.end method

.method public final u()Lnb/bb;
    .locals 1

    iget-object v0, p0, Lnb/jb;->c:Lnb/bb;

    return-object v0
.end method

.method public final v(Lcom/google/android/gms/internal/measurement/zzdf;Landroid/os/Bundle;)V
    .locals 5

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    move-result-object v0

    invoke-virtual {v0}, Lnb/k;->N()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    const-string v0, "com.google.app_measurement.screen_service"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p2

    if-eqz p2, :cond_1

    new-instance v0, Lnb/bb;

    const-string v1, "name"

    invoke-virtual {p2, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "referrer_name"

    invoke-virtual {p2, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "id"

    invoke-virtual {p2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lnb/bb;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    iget-object p2, p0, Lnb/jb;->f:Ljava/util/Map;

    iget p1, p1, Lcom/google/android/gms/internal/measurement/zzdf;->f:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    return-void
.end method

.method public final w(Lcom/google/android/gms/internal/measurement/zzdf;)V
    .locals 4

    iget-object v0, p0, Lnb/jb;->l:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lnb/jb;->k:Z

    iget-object v1, p0, Lnb/jb;->g:Lcom/google/android/gms/internal/measurement/zzdf;

    invoke-static {p1, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iput-object p1, p0, Lnb/jb;->g:Lcom/google/android/gms/internal/measurement/zzdf;

    iput-boolean v2, p0, Lnb/jb;->h:Z

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object v1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->w()Lnb/k;

    move-result-object v3

    invoke-virtual {v3}, Lnb/k;->N()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x0

    iput-object v3, p0, Lnb/jb;->i:Lnb/bb;

    invoke-virtual {v1}, Lnb/g7;->b()Lnb/c7;

    move-result-object v1

    new-instance v3, Lnb/ib;

    invoke-direct {v3, p0}, Lnb/ib;-><init>(Lnb/jb;)V

    invoke-virtual {v1, v3}, Lnb/c7;->t(Ljava/lang/Runnable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catchall_1
    move-exception p1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    throw p1

    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    move-result-object v1

    invoke-virtual {v1}, Lnb/k;->N()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object p1, p0, Lnb/jb;->i:Lnb/bb;

    iput-object p1, p0, Lnb/jb;->c:Lnb/bb;

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object p1

    new-instance v0, Lnb/eb;

    invoke-direct {v0, p0}, Lnb/eb;-><init>(Lnb/jb;)V

    invoke-virtual {p1, v0}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    return-void

    :cond_1
    invoke-virtual {p0, p1}, Lnb/jb;->p(Lcom/google/android/gms/internal/measurement/zzdf;)Lnb/bb;

    move-result-object v0

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/zzdf;->g:Ljava/lang/String;

    invoke-virtual {p0, p1, v0, v2}, Lnb/jb;->F(Ljava/lang/String;Lnb/bb;Z)V

    iget-object p1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->M()Lnb/y1;

    move-result-object p1

    iget-object v0, p1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->e()Lu9/e;

    move-result-object v1

    invoke-interface {v1}, Lu9/e;->b()J

    move-result-wide v1

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object v0

    new-instance v3, Lnb/x0;

    invoke-direct {v3, p1, v1, v2}, Lnb/x0;-><init>(Lnb/y1;J)V

    invoke-virtual {v0, v3}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    return-void

    :goto_1
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p1
.end method

.method public final x(Lcom/google/android/gms/internal/measurement/zzdf;)V
    .locals 5

    iget-object v0, p0, Lnb/jb;->l:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v1, p0, Lnb/jb;->k:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lnb/jb;->h:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->e()Lu9/e;

    move-result-object v1

    invoke-interface {v1}, Lu9/e;->b()J

    move-result-wide v1

    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    move-result-object v3

    invoke-virtual {v3}, Lnb/k;->N()Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_0

    iput-object v4, p0, Lnb/jb;->c:Lnb/bb;

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object p1

    new-instance v0, Lnb/fb;

    invoke-direct {v0, p0, v1, v2}, Lnb/fb;-><init>(Lnb/jb;J)V

    invoke-virtual {p1, v0}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lnb/jb;->p(Lcom/google/android/gms/internal/measurement/zzdf;)Lnb/bb;

    move-result-object p1

    iget-object v3, p0, Lnb/jb;->c:Lnb/bb;

    iput-object v3, p0, Lnb/jb;->d:Lnb/bb;

    iput-object v4, p0, Lnb/jb;->c:Lnb/bb;

    invoke-virtual {v0}, Lnb/g7;->b()Lnb/c7;

    move-result-object v0

    new-instance v3, Lnb/gb;

    invoke-direct {v3, p0, p1, v1, v2}, Lnb/gb;-><init>(Lnb/jb;Lnb/bb;J)V

    invoke-virtual {v0, v3}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final y(Lcom/google/android/gms/internal/measurement/zzdf;Landroid/os/Bundle;)V
    .locals 4

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    move-result-object v0

    invoke-virtual {v0}, Lnb/k;->N()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    iget-object v0, p0, Lnb/jb;->f:Ljava/util/Map;

    iget p1, p1, Lcom/google/android/gms/internal/measurement/zzdf;->f:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnb/bb;

    if-eqz p1, :cond_1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "id"

    iget-wide v2, p1, Lnb/bb;->c:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v1, "name"

    iget-object v2, p1, Lnb/bb;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "referrer_name"

    iget-object p1, p1, Lnb/bb;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "com.google.app_measurement.screen_service"

    invoke-virtual {p2, p1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final z(Lcom/google/android/gms/internal/measurement/zzdf;)V
    .locals 2

    iget-object v0, p0, Lnb/jb;->l:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lnb/jb;->g:Lcom/google/android/gms/internal/measurement/zzdf;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    iput-object v1, p0, Lnb/jb;->g:Lcom/google/android/gms/internal/measurement/zzdf;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    move-result-object v0

    invoke-virtual {v0}, Lnb/k;->N()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lnb/jb;->f:Ljava/util/Map;

    iget p1, p1, Lcom/google/android/gms/internal/measurement/zzdf;->f:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
