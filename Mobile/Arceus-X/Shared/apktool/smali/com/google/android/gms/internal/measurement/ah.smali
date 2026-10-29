.class public final Lcom/google/android/gms/internal/measurement/ah;
.super Lcom/google/android/gms/internal/measurement/k;
.source "SourceFile"


# instance fields
.field public final c:Z

.field public final d:Z

.field public final synthetic e:Lcom/google/android/gms/internal/measurement/bh;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/bh;ZZ)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/ah;->e:Lcom/google/android/gms/internal/measurement/bh;

    const-string p1, "log"

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/k;-><init>(Ljava/lang/String;)V

    iput-boolean p2, p0, Lcom/google/android/gms/internal/measurement/ah;->c:Z

    iput-boolean p3, p0, Lcom/google/android/gms/internal/measurement/ah;->d:Z

    return-void
.end method


# virtual methods
.method public final h(Lcom/google/android/gms/internal/measurement/u4;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/q;
    .locals 11

    const-string v0, "log"

    const/4 v1, 0x1

    invoke-static {v0, v1, p2}, Lcom/google/android/gms/internal/measurement/v5;->b(Ljava/lang/String;ILjava/util/List;)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/ah;->e:Lcom/google/android/gms/internal/measurement/bh;

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/measurement/q;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/measurement/u4;->a(Lcom/google/android/gms/internal/measurement/q;)Lcom/google/android/gms/internal/measurement/q;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/measurement/q;->zzc()Ljava/lang/String;

    move-result-object v3

    iget-boolean v5, p0, Lcom/google/android/gms/internal/measurement/ah;->c:Z

    iget-boolean v6, p0, Lcom/google/android/gms/internal/measurement/ah;->d:Z

    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/bh;->j()Lcom/google/android/gms/internal/measurement/gg;

    move-result-object v1

    const/4 v2, 0x3

    invoke-interface/range {v1 .. v6}, Lcom/google/android/gms/internal/measurement/gg;->a(ILjava/lang/String;Ljava/util/List;ZZ)V

    sget-object p1, Lcom/google/android/gms/internal/measurement/q;->zo:Lcom/google/android/gms/internal/measurement/q;

    return-object p1

    :cond_0
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/q;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/u4;->a(Lcom/google/android/gms/internal/measurement/q;)Lcom/google/android/gms/internal/measurement/q;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/q;->zzd()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/v5;->g(D)I

    move-result v0

    const/4 v2, 0x5

    const/4 v3, 0x2

    if-eq v0, v3, :cond_4

    const/4 v4, 0x3

    if-eq v0, v4, :cond_3

    if-eq v0, v2, :cond_2

    const/4 v5, 0x6

    if-eq v0, v5, :cond_1

    :goto_0
    move v6, v4

    goto :goto_1

    :cond_1
    move v6, v3

    goto :goto_1

    :cond_2
    move v6, v2

    goto :goto_1

    :cond_3
    move v6, v1

    goto :goto_1

    :cond_4
    const/4 v4, 0x4

    goto :goto_0

    :goto_1
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/q;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/u4;->a(Lcom/google/android/gms/internal/measurement/q;)Lcom/google/android/gms/internal/measurement/q;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/q;->zzc()Ljava/lang/String;

    move-result-object v7

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v3, :cond_5

    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/ah;->e:Lcom/google/android/gms/internal/measurement/bh;

    iget-boolean v9, p0, Lcom/google/android/gms/internal/measurement/ah;->c:Z

    iget-boolean v10, p0, Lcom/google/android/gms/internal/measurement/ah;->d:Z

    sget-object v8, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/bh;->j()Lcom/google/android/gms/internal/measurement/gg;

    move-result-object v5

    invoke-interface/range {v5 .. v10}, Lcom/google/android/gms/internal/measurement/gg;->a(ILjava/lang/String;Ljava/util/List;ZZ)V

    sget-object p1, Lcom/google/android/gms/internal/measurement/q;->zo:Lcom/google/android/gms/internal/measurement/q;

    return-object p1

    :cond_5
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-ge v3, v0, :cond_6

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/q;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/u4;->a(Lcom/google/android/gms/internal/measurement/q;)Lcom/google/android/gms/internal/measurement/q;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/q;->zzc()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v8, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_6
    iget-object p1, p0, Lcom/google/android/gms/internal/measurement/ah;->e:Lcom/google/android/gms/internal/measurement/bh;

    iget-boolean v9, p0, Lcom/google/android/gms/internal/measurement/ah;->c:Z

    iget-boolean v10, p0, Lcom/google/android/gms/internal/measurement/ah;->d:Z

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/bh;->j()Lcom/google/android/gms/internal/measurement/gg;

    move-result-object v5

    invoke-interface/range {v5 .. v10}, Lcom/google/android/gms/internal/measurement/gg;->a(ILjava/lang/String;Ljava/util/List;ZZ)V

    sget-object p1, Lcom/google/android/gms/internal/measurement/q;->zo:Lcom/google/android/gms/internal/measurement/q;

    return-object p1
.end method
