.class public final Lcom/google/android/gms/internal/measurement/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/f;Lcom/google/android/gms/internal/measurement/u4;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/q;
    .locals 10

    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const-string v2, ","

    const-string v3, "Callback should be a method"

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_17

    :sswitch_0
    const-string v1, "indexOf"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3b

    invoke-static {v1, v7, p3}, Lcom/google/android/gms/internal/measurement/v5;->c(Ljava/lang/String;ILjava/util/List;)V

    sget-object p0, Lcom/google/android/gms/internal/measurement/q;->zo:Lcom/google/android/gms/internal/measurement/q;

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/measurement/q;

    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/measurement/u4;->a(Lcom/google/android/gms/internal/measurement/q;)Lcom/google/android/gms/internal/measurement/q;

    move-result-object p0

    :cond_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v1

    if-le v1, v8, :cond_3

    invoke-interface {p3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/google/android/gms/internal/measurement/q;

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/measurement/u4;->a(Lcom/google/android/gms/internal/measurement/q;)Lcom/google/android/gms/internal/measurement/q;

    move-result-object p2

    invoke-interface {p2}, Lcom/google/android/gms/internal/measurement/q;->zzd()Ljava/lang/Double;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p2

    invoke-static {p2, p3}, Lcom/google/android/gms/internal/measurement/v5;->i(D)D

    move-result-wide p2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f;->k()I

    move-result v1

    int-to-double v1, v1

    cmpl-double v1, p2, v1

    if-ltz v1, :cond_1

    new-instance p0, Lcom/google/android/gms/internal/measurement/j;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/j;-><init>(Ljava/lang/Double;)V

    return-object p0

    :cond_1
    cmpg-double v1, p2, v4

    if-gez v1, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f;->k()I

    move-result v1

    int-to-double v1, v1

    add-double v4, v1, p2

    goto :goto_0

    :cond_2
    move-wide v4, p2

    :cond_3
    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f;->i()Ljava/util/Iterator;

    move-result-object p2

    :cond_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    int-to-double v1, p3

    cmpg-double v3, v1, v4

    if-ltz v3, :cond_4

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/measurement/f;->m(I)Lcom/google/android/gms/internal/measurement/q;

    move-result-object p3

    invoke-static {p3, p0}, Lcom/google/android/gms/internal/measurement/v5;->f(Lcom/google/android/gms/internal/measurement/q;Lcom/google/android/gms/internal/measurement/q;)Z

    move-result p3

    if-eqz p3, :cond_4

    new-instance p0, Lcom/google/android/gms/internal/measurement/j;

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/j;-><init>(Ljava/lang/Double;)V

    return-object p0

    :cond_5
    new-instance p0, Lcom/google/android/gms/internal/measurement/j;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/j;-><init>(Ljava/lang/Double;)V

    return-object p0

    :sswitch_1
    const-string p2, "reverse"

    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3b

    invoke-static {p2, v9, p3}, Lcom/google/android/gms/internal/measurement/v5;->a(Ljava/lang/String;ILjava/util/List;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f;->k()I

    move-result p0

    if-eqz p0, :cond_13

    :goto_1
    div-int/lit8 p2, p0, 0x2

    if-ge v9, p2, :cond_13

    invoke-virtual {p1, v9}, Lcom/google/android/gms/internal/measurement/f;->t(I)Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-virtual {p1, v9}, Lcom/google/android/gms/internal/measurement/f;->m(I)Lcom/google/android/gms/internal/measurement/q;

    move-result-object p2

    invoke-virtual {p1, v9, v6}, Lcom/google/android/gms/internal/measurement/f;->p(ILcom/google/android/gms/internal/measurement/q;)V

    add-int/lit8 p3, p0, -0x1

    sub-int/2addr p3, v9

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/measurement/f;->t(I)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p1, p3}, Lcom/google/android/gms/internal/measurement/f;->m(I)Lcom/google/android/gms/internal/measurement/q;

    move-result-object v0

    invoke-virtual {p1, v9, v0}, Lcom/google/android/gms/internal/measurement/f;->p(ILcom/google/android/gms/internal/measurement/q;)V

    :cond_6
    invoke-virtual {p1, p3, p2}, Lcom/google/android/gms/internal/measurement/f;->p(ILcom/google/android/gms/internal/measurement/q;)V

    :cond_7
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :sswitch_2
    const-string v0, "reduceRight"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3b

    invoke-static {p1, p2, p3, v9}, Lcom/google/android/gms/internal/measurement/d0;->b(Lcom/google/android/gms/internal/measurement/f;Lcom/google/android/gms/internal/measurement/u4;Ljava/util/List;Z)Lcom/google/android/gms/internal/measurement/q;

    move-result-object p0

    return-object p0

    :sswitch_3
    const-string v0, "slice"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3b

    invoke-static {v0, v7, p3}, Lcom/google/android/gms/internal/measurement/v5;->c(Ljava/lang/String;ILjava/util/List;)V

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_8

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f;->a()Lcom/google/android/gms/internal/measurement/q;

    move-result-object p0

    return-object p0

    :cond_8
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f;->k()I

    move-result p0

    int-to-double v0, p0

    invoke-interface {p3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/measurement/q;

    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/measurement/u4;->a(Lcom/google/android/gms/internal/measurement/q;)Lcom/google/android/gms/internal/measurement/q;

    move-result-object p0

    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/q;->zzd()Ljava/lang/Double;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/v5;->i(D)D

    move-result-wide v2

    cmpg-double p0, v2, v4

    if-gez p0, :cond_9

    add-double/2addr v2, v0

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(DD)D

    move-result-wide v2

    goto :goto_2

    :cond_9
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide v2

    :goto_2
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p0

    if-ne p0, v7, :cond_b

    invoke-interface {p3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/measurement/q;

    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/measurement/u4;->a(Lcom/google/android/gms/internal/measurement/q;)Lcom/google/android/gms/internal/measurement/q;

    move-result-object p0

    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/q;->zzd()Ljava/lang/Double;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p2

    invoke-static {p2, p3}, Lcom/google/android/gms/internal/measurement/v5;->i(D)D

    move-result-wide p2

    cmpg-double p0, p2, v4

    if-gez p0, :cond_a

    add-double/2addr v0, p2

    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    goto :goto_3

    :cond_a
    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    :cond_b
    :goto_3
    new-instance p0, Lcom/google/android/gms/internal/measurement/f;

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/f;-><init>()V

    double-to-int p2, v2

    :goto_4
    int-to-double v2, p2

    cmpg-double p3, v2, v0

    if-gez p3, :cond_c

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/measurement/f;->m(I)Lcom/google/android/gms/internal/measurement/q;

    move-result-object p3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/f;->k()I

    move-result v2

    invoke-virtual {p0, v2, p3}, Lcom/google/android/gms/internal/measurement/f;->p(ILcom/google/android/gms/internal/measurement/q;)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_4

    :cond_c
    return-object p0

    :sswitch_4
    const-string p2, "shift"

    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3b

    invoke-static {p2, v9, p3}, Lcom/google/android/gms/internal/measurement/v5;->a(Ljava/lang/String;ILjava/util/List;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f;->k()I

    move-result p0

    if-nez p0, :cond_d

    sget-object p0, Lcom/google/android/gms/internal/measurement/q;->zo:Lcom/google/android/gms/internal/measurement/q;

    return-object p0

    :cond_d
    invoke-virtual {p1, v9}, Lcom/google/android/gms/internal/measurement/f;->m(I)Lcom/google/android/gms/internal/measurement/q;

    move-result-object p0

    invoke-virtual {p1, v9}, Lcom/google/android/gms/internal/measurement/f;->y(I)V

    return-object p0

    :sswitch_5
    const-string v0, "every"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3b

    invoke-static {v0, v8, p3}, Lcom/google/android/gms/internal/measurement/v5;->a(Ljava/lang/String;ILjava/util/List;)V

    invoke-interface {p3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/measurement/q;

    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/measurement/u4;->a(Lcom/google/android/gms/internal/measurement/q;)Lcom/google/android/gms/internal/measurement/q;

    move-result-object p0

    instance-of p3, p0, Lcom/google/android/gms/internal/measurement/p;

    if-eqz p3, :cond_10

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f;->k()I

    move-result p3

    if-nez p3, :cond_e

    sget-object p0, Lcom/google/android/gms/internal/measurement/q;->Eo:Lcom/google/android/gms/internal/measurement/q;

    return-object p0

    :cond_e
    check-cast p0, Lcom/google/android/gms/internal/measurement/p;

    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, p2, p0, p3, v0}, Lcom/google/android/gms/internal/measurement/d0;->c(Lcom/google/android/gms/internal/measurement/f;Lcom/google/android/gms/internal/measurement/u4;Lcom/google/android/gms/internal/measurement/k;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/google/android/gms/internal/measurement/f;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/f;->k()I

    move-result p0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f;->k()I

    move-result p1

    if-eq p0, p1, :cond_f

    sget-object p0, Lcom/google/android/gms/internal/measurement/q;->Fo:Lcom/google/android/gms/internal/measurement/q;

    return-object p0

    :cond_f
    sget-object p0, Lcom/google/android/gms/internal/measurement/q;->Eo:Lcom/google/android/gms/internal/measurement/q;

    return-object p0

    :cond_10
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :sswitch_6
    const-string v0, "sort"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3b

    invoke-static {v0, v8, p3}, Lcom/google/android/gms/internal/measurement/v5;->c(Ljava/lang/String;ILjava/util/List;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f;->k()I

    move-result p0

    if-lt p0, v7, :cond_13

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f;->h()Ljava/util/List;

    move-result-object p0

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_12

    invoke-interface {p3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/google/android/gms/internal/measurement/q;

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/measurement/u4;->a(Lcom/google/android/gms/internal/measurement/q;)Lcom/google/android/gms/internal/measurement/q;

    move-result-object p3

    instance-of v0, p3, Lcom/google/android/gms/internal/measurement/k;

    if-eqz v0, :cond_11

    move-object v6, p3

    check-cast v6, Lcom/google/android/gms/internal/measurement/k;

    goto :goto_5

    :cond_11
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Comparator should be a method"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_12
    :goto_5
    new-instance p3, Lcom/google/android/gms/internal/measurement/b0;

    invoke-direct {p3, v6, p2}, Lcom/google/android/gms/internal/measurement/b0;-><init>(Lcom/google/android/gms/internal/measurement/k;Lcom/google/android/gms/internal/measurement/u4;)V

    invoke-static {p0, p3}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f;->u()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_13

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/measurement/q;

    add-int/lit8 p3, v9, 0x1

    invoke-virtual {p1, v9, p2}, Lcom/google/android/gms/internal/measurement/f;->p(ILcom/google/android/gms/internal/measurement/q;)V

    move v9, p3

    goto :goto_6

    :cond_13
    return-object p1

    :sswitch_7
    const-string v0, "some"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3b

    invoke-static {v0, v8, p3}, Lcom/google/android/gms/internal/measurement/v5;->a(Ljava/lang/String;ILjava/util/List;)V

    invoke-interface {p3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/measurement/q;

    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/measurement/u4;->a(Lcom/google/android/gms/internal/measurement/q;)Lcom/google/android/gms/internal/measurement/q;

    move-result-object p0

    instance-of p3, p0, Lcom/google/android/gms/internal/measurement/k;

    if-eqz p3, :cond_17

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f;->k()I

    move-result p3

    if-nez p3, :cond_14

    sget-object p0, Lcom/google/android/gms/internal/measurement/q;->Fo:Lcom/google/android/gms/internal/measurement/q;

    return-object p0

    :cond_14
    check-cast p0, Lcom/google/android/gms/internal/measurement/k;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f;->i()Ljava/util/Iterator;

    move-result-object p3

    :cond_15
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/f;->t(I)Z

    move-result v1

    if-eqz v1, :cond_15

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/f;->m(I)Lcom/google/android/gms/internal/measurement/q;

    move-result-object v1

    int-to-double v2, v0

    new-instance v0, Lcom/google/android/gms/internal/measurement/j;

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/measurement/j;-><init>(Ljava/lang/Double;)V

    const/4 v2, 0x3

    new-array v2, v2, [Lcom/google/android/gms/internal/measurement/q;

    aput-object v1, v2, v9

    aput-object v0, v2, v8

    aput-object p1, v2, v7

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/internal/measurement/k;->h(Lcom/google/android/gms/internal/measurement/u4;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/q;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/q;->zze()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_15

    sget-object p0, Lcom/google/android/gms/internal/measurement/q;->Eo:Lcom/google/android/gms/internal/measurement/q;

    return-object p0

    :cond_16
    sget-object p0, Lcom/google/android/gms/internal/measurement/q;->Fo:Lcom/google/android/gms/internal/measurement/q;

    return-object p0

    :cond_17
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :sswitch_8
    const-string v0, "push"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3b

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_18

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_18

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/google/android/gms/internal/measurement/q;

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/measurement/u4;->a(Lcom/google/android/gms/internal/measurement/q;)Lcom/google/android/gms/internal/measurement/q;

    move-result-object p3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f;->k()I

    move-result v0

    invoke-virtual {p1, v0, p3}, Lcom/google/android/gms/internal/measurement/f;->p(ILcom/google/android/gms/internal/measurement/q;)V

    goto :goto_7

    :cond_18
    new-instance p0, Lcom/google/android/gms/internal/measurement/j;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f;->k()I

    move-result p1

    int-to-double p1, p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/j;-><init>(Ljava/lang/Double;)V

    return-object p0

    :sswitch_9
    const-string v0, "join"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3b

    invoke-static {v0, v8, p3}, Lcom/google/android/gms/internal/measurement/v5;->c(Ljava/lang/String;ILjava/util/List;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f;->k()I

    move-result p0

    if-nez p0, :cond_19

    sget-object p0, Lcom/google/android/gms/internal/measurement/q;->Go:Lcom/google/android/gms/internal/measurement/q;

    return-object p0

    :cond_19
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_1c

    invoke-interface {p3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/measurement/q;

    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/measurement/u4;->a(Lcom/google/android/gms/internal/measurement/q;)Lcom/google/android/gms/internal/measurement/q;

    move-result-object p0

    instance-of p2, p0, Lcom/google/android/gms/internal/measurement/o;

    if-nez p2, :cond_1b

    instance-of p2, p0, Lcom/google/android/gms/internal/measurement/v;

    if-eqz p2, :cond_1a

    goto :goto_8

    :cond_1a
    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/q;->zzc()Ljava/lang/String;

    move-result-object v2

    goto :goto_9

    :cond_1b
    :goto_8
    const-string v2, ""

    :cond_1c
    :goto_9
    new-instance p0, Lcom/google/android/gms/internal/measurement/u;

    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/measurement/f;->z(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/u;-><init>(Ljava/lang/String;)V

    return-object p0

    :sswitch_a
    const-string p2, "pop"

    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3b

    invoke-static {p2, v9, p3}, Lcom/google/android/gms/internal/measurement/v5;->a(Ljava/lang/String;ILjava/util/List;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f;->k()I

    move-result p0

    if-nez p0, :cond_1d

    sget-object p0, Lcom/google/android/gms/internal/measurement/q;->zo:Lcom/google/android/gms/internal/measurement/q;

    return-object p0

    :cond_1d
    add-int/lit8 p0, p0, -0x1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/measurement/f;->m(I)Lcom/google/android/gms/internal/measurement/q;

    move-result-object p2

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/measurement/f;->y(I)V

    return-object p2

    :sswitch_b
    const-string v0, "map"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3b

    invoke-static {v0, v8, p3}, Lcom/google/android/gms/internal/measurement/v5;->a(Ljava/lang/String;ILjava/util/List;)V

    invoke-interface {p3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/measurement/q;

    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/measurement/u4;->a(Lcom/google/android/gms/internal/measurement/q;)Lcom/google/android/gms/internal/measurement/q;

    move-result-object p0

    instance-of p3, p0, Lcom/google/android/gms/internal/measurement/p;

    if-eqz p3, :cond_1f

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f;->k()I

    move-result p3

    if-nez p3, :cond_1e

    new-instance p0, Lcom/google/android/gms/internal/measurement/f;

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/f;-><init>()V

    return-object p0

    :cond_1e
    check-cast p0, Lcom/google/android/gms/internal/measurement/p;

    invoke-static {p1, p2, p0, v6, v6}, Lcom/google/android/gms/internal/measurement/d0;->c(Lcom/google/android/gms/internal/measurement/f;Lcom/google/android/gms/internal/measurement/u4;Lcom/google/android/gms/internal/measurement/k;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/google/android/gms/internal/measurement/f;

    move-result-object p0

    return-object p0

    :cond_1f
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :sswitch_c
    const-string v0, "unshift"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3b

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_23

    new-instance p0, Lcom/google/android/gms/internal/measurement/f;

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/f;-><init>()V

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_a
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_21

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/q;

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/measurement/u4;->a(Lcom/google/android/gms/internal/measurement/q;)Lcom/google/android/gms/internal/measurement/q;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/measurement/h;

    if-nez v1, :cond_20

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/f;->k()I

    move-result v1

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/measurement/f;->p(ILcom/google/android/gms/internal/measurement/q;)V

    goto :goto_a

    :cond_20
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Argument evaluation failed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_21
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/f;->k()I

    move-result p2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f;->i()Ljava/util/Iterator;

    move-result-object p3

    :goto_b
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_22

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    add-int/2addr v1, p2

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/measurement/f;->m(I)Lcom/google/android/gms/internal/measurement/q;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/measurement/f;->p(ILcom/google/android/gms/internal/measurement/q;)V

    goto :goto_b

    :cond_22
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f;->u()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/f;->i()Ljava/util/Iterator;

    move-result-object p2

    :goto_c
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_23

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/measurement/f;->m(I)Lcom/google/android/gms/internal/measurement/q;

    move-result-object p3

    invoke-virtual {p1, v0, p3}, Lcom/google/android/gms/internal/measurement/f;->p(ILcom/google/android/gms/internal/measurement/q;)V

    goto :goto_c

    :cond_23
    new-instance p0, Lcom/google/android/gms/internal/measurement/j;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f;->k()I

    move-result p1

    int-to-double p1, p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/j;-><init>(Ljava/lang/Double;)V

    return-object p0

    :sswitch_d
    const-string v1, "lastIndexOf"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3b

    invoke-static {v1, v7, p3}, Lcom/google/android/gms/internal/measurement/v5;->c(Ljava/lang/String;ILjava/util/List;)V

    sget-object p0, Lcom/google/android/gms/internal/measurement/q;->zo:Lcom/google/android/gms/internal/measurement/q;

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_24

    invoke-interface {p3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/measurement/q;

    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/measurement/u4;->a(Lcom/google/android/gms/internal/measurement/q;)Lcom/google/android/gms/internal/measurement/q;

    move-result-object p0

    :cond_24
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f;->k()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    if-le v2, v8, :cond_26

    invoke-interface {p3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/google/android/gms/internal/measurement/q;

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/measurement/u4;->a(Lcom/google/android/gms/internal/measurement/q;)Lcom/google/android/gms/internal/measurement/q;

    move-result-object p2

    invoke-interface {p2}, Lcom/google/android/gms/internal/measurement/q;->zzd()Ljava/lang/Double;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    move-result p3

    if-eqz p3, :cond_25

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f;->k()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    int-to-double p2, p2

    goto :goto_d

    :cond_25
    invoke-interface {p2}, Lcom/google/android/gms/internal/measurement/q;->zzd()Ljava/lang/Double;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p2

    invoke-static {p2, p3}, Lcom/google/android/gms/internal/measurement/v5;->i(D)D

    move-result-wide p2

    :goto_d
    cmpg-double v1, p2, v4

    if-gez v1, :cond_27

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f;->k()I

    move-result v1

    int-to-double v1, v1

    add-double/2addr p2, v1

    goto :goto_e

    :cond_26
    int-to-double p2, v1

    :cond_27
    :goto_e
    cmpg-double v1, p2, v4

    if-gez v1, :cond_28

    new-instance p0, Lcom/google/android/gms/internal/measurement/j;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/j;-><init>(Ljava/lang/Double;)V

    return-object p0

    :cond_28
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f;->k()I

    move-result v1

    int-to-double v1, v1

    invoke-static {v1, v2, p2, p3}, Ljava/lang/Math;->min(DD)D

    move-result-wide p2

    double-to-int p2, p2

    :goto_f
    if-ltz p2, :cond_2a

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/measurement/f;->t(I)Z

    move-result p3

    if-eqz p3, :cond_29

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/measurement/f;->m(I)Lcom/google/android/gms/internal/measurement/q;

    move-result-object p3

    invoke-static {p3, p0}, Lcom/google/android/gms/internal/measurement/v5;->f(Lcom/google/android/gms/internal/measurement/q;Lcom/google/android/gms/internal/measurement/q;)Z

    move-result p3

    if-eqz p3, :cond_29

    int-to-double p0, p2

    new-instance p2, Lcom/google/android/gms/internal/measurement/j;

    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    invoke-direct {p2, p0}, Lcom/google/android/gms/internal/measurement/j;-><init>(Ljava/lang/Double;)V

    return-object p2

    :cond_29
    add-int/lit8 p2, p2, -0x1

    goto :goto_f

    :cond_2a
    new-instance p0, Lcom/google/android/gms/internal/measurement/j;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/measurement/j;-><init>(Ljava/lang/Double;)V

    return-object p0

    :sswitch_e
    const-string v0, "forEach"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3b

    invoke-static {v0, v8, p3}, Lcom/google/android/gms/internal/measurement/v5;->a(Ljava/lang/String;ILjava/util/List;)V

    invoke-interface {p3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/measurement/q;

    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/measurement/u4;->a(Lcom/google/android/gms/internal/measurement/q;)Lcom/google/android/gms/internal/measurement/q;

    move-result-object p0

    instance-of p3, p0, Lcom/google/android/gms/internal/measurement/p;

    if-eqz p3, :cond_2c

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f;->l()I

    move-result p3

    if-nez p3, :cond_2b

    sget-object p0, Lcom/google/android/gms/internal/measurement/q;->zo:Lcom/google/android/gms/internal/measurement/q;

    return-object p0

    :cond_2b
    check-cast p0, Lcom/google/android/gms/internal/measurement/p;

    invoke-static {p1, p2, p0, v6, v6}, Lcom/google/android/gms/internal/measurement/d0;->c(Lcom/google/android/gms/internal/measurement/f;Lcom/google/android/gms/internal/measurement/u4;Lcom/google/android/gms/internal/measurement/k;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/google/android/gms/internal/measurement/f;

    sget-object p0, Lcom/google/android/gms/internal/measurement/q;->zo:Lcom/google/android/gms/internal/measurement/q;

    return-object p0

    :cond_2c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :sswitch_f
    const-string v0, "splice"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3b

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_2d

    new-instance p0, Lcom/google/android/gms/internal/measurement/f;

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/f;-><init>()V

    return-object p0

    :cond_2d
    invoke-interface {p3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/measurement/q;

    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/measurement/u4;->a(Lcom/google/android/gms/internal/measurement/q;)Lcom/google/android/gms/internal/measurement/q;

    move-result-object p0

    invoke-interface {p0}, Lcom/google/android/gms/internal/measurement/q;->zzd()Ljava/lang/Double;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/v5;->i(D)D

    move-result-wide v0

    double-to-int p0, v0

    if-gez p0, :cond_2e

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f;->k()I

    move-result v0

    add-int/2addr p0, v0

    invoke-static {v9, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    goto :goto_10

    :cond_2e
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f;->k()I

    move-result v0

    if-le p0, v0, :cond_2f

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f;->k()I

    move-result p0

    :cond_2f
    :goto_10
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f;->k()I

    move-result v0

    new-instance v1, Lcom/google/android/gms/internal/measurement/f;

    invoke-direct {v1}, Lcom/google/android/gms/internal/measurement/f;-><init>()V

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    if-le v2, v8, :cond_32

    invoke-interface {p3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/q;

    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/measurement/u4;->a(Lcom/google/android/gms/internal/measurement/q;)Lcom/google/android/gms/internal/measurement/q;

    move-result-object v2

    invoke-interface {v2}, Lcom/google/android/gms/internal/measurement/q;->zzd()Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/measurement/v5;->i(D)D

    move-result-wide v2

    double-to-int v2, v2

    invoke-static {v9, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    if-lez v2, :cond_30

    move v3, p0

    :goto_11
    add-int v4, p0, v2

    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    if-ge v3, v4, :cond_30

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/measurement/f;->m(I)Lcom/google/android/gms/internal/measurement/q;

    move-result-object v4

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/f;->k()I

    move-result v5

    invoke-virtual {v1, v5, v4}, Lcom/google/android/gms/internal/measurement/f;->p(ILcom/google/android/gms/internal/measurement/q;)V

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/measurement/f;->y(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_11

    :cond_30
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v7, :cond_33

    :goto_12
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_33

    invoke-interface {p3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/q;

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/measurement/u4;->a(Lcom/google/android/gms/internal/measurement/q;)Lcom/google/android/gms/internal/measurement/q;

    move-result-object v0

    instance-of v2, v0, Lcom/google/android/gms/internal/measurement/h;

    if-nez v2, :cond_31

    add-int v2, p0, v7

    add-int/lit8 v2, v2, -0x2

    invoke-virtual {p1, v2, v0}, Lcom/google/android/gms/internal/measurement/f;->x(ILcom/google/android/gms/internal/measurement/q;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_12

    :cond_31
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Failed to parse elements to add"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_32
    :goto_13
    if-ge p0, v0, :cond_33

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/measurement/f;->m(I)Lcom/google/android/gms/internal/measurement/q;

    move-result-object p2

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/f;->k()I

    move-result p3

    invoke-virtual {v1, p3, p2}, Lcom/google/android/gms/internal/measurement/f;->p(ILcom/google/android/gms/internal/measurement/q;)V

    invoke-virtual {p1, p0, v6}, Lcom/google/android/gms/internal/measurement/f;->p(ILcom/google/android/gms/internal/measurement/q;)V

    add-int/lit8 p0, p0, 0x1

    goto :goto_13

    :cond_33
    return-object v1

    :sswitch_10
    const-string v0, "reduce"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3b

    invoke-static {p1, p2, p3, v8}, Lcom/google/android/gms/internal/measurement/d0;->b(Lcom/google/android/gms/internal/measurement/f;Lcom/google/android/gms/internal/measurement/u4;Ljava/util/List;Z)Lcom/google/android/gms/internal/measurement/q;

    move-result-object p0

    return-object p0

    :sswitch_11
    const-string v0, "filter"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3b

    invoke-static {v0, v8, p3}, Lcom/google/android/gms/internal/measurement/v5;->a(Ljava/lang/String;ILjava/util/List;)V

    invoke-interface {p3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/measurement/q;

    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/measurement/u4;->a(Lcom/google/android/gms/internal/measurement/q;)Lcom/google/android/gms/internal/measurement/q;

    move-result-object p0

    instance-of p3, p0, Lcom/google/android/gms/internal/measurement/p;

    if-eqz p3, :cond_36

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f;->l()I

    move-result p3

    if-nez p3, :cond_34

    new-instance p0, Lcom/google/android/gms/internal/measurement/f;

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/f;-><init>()V

    return-object p0

    :cond_34
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f;->a()Lcom/google/android/gms/internal/measurement/q;

    move-result-object p3

    check-cast p3, Lcom/google/android/gms/internal/measurement/f;

    check-cast p0, Lcom/google/android/gms/internal/measurement/p;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, p2, p0, v6, v0}, Lcom/google/android/gms/internal/measurement/d0;->c(Lcom/google/android/gms/internal/measurement/f;Lcom/google/android/gms/internal/measurement/u4;Lcom/google/android/gms/internal/measurement/k;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/google/android/gms/internal/measurement/f;

    move-result-object p0

    new-instance p1, Lcom/google/android/gms/internal/measurement/f;

    invoke-direct {p1}, Lcom/google/android/gms/internal/measurement/f;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/f;->i()Ljava/util/Iterator;

    move-result-object p0

    :goto_14
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_35

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/measurement/f;->m(I)Lcom/google/android/gms/internal/measurement/q;

    move-result-object p2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f;->k()I

    move-result v0

    invoke-virtual {p1, v0, p2}, Lcom/google/android/gms/internal/measurement/f;->p(ILcom/google/android/gms/internal/measurement/q;)V

    goto :goto_14

    :cond_35
    return-object p1

    :cond_36
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :sswitch_12
    const-string v0, "concat"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3b

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/f;->a()Lcom/google/android/gms/internal/measurement/q;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/measurement/f;

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_3a

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_37
    :goto_15
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/google/android/gms/internal/measurement/q;

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/measurement/u4;->a(Lcom/google/android/gms/internal/measurement/q;)Lcom/google/android/gms/internal/measurement/q;

    move-result-object p3

    instance-of v0, p3, Lcom/google/android/gms/internal/measurement/h;

    if-nez v0, :cond_39

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/f;->k()I

    move-result v0

    instance-of v1, p3, Lcom/google/android/gms/internal/measurement/f;

    if-eqz v1, :cond_38

    check-cast p3, Lcom/google/android/gms/internal/measurement/f;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/f;->i()Ljava/util/Iterator;

    move-result-object v1

    :goto_16
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_37

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    add-int/2addr v3, v0

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p3, v2}, Lcom/google/android/gms/internal/measurement/f;->m(I)Lcom/google/android/gms/internal/measurement/q;

    move-result-object v2

    invoke-virtual {p0, v3, v2}, Lcom/google/android/gms/internal/measurement/f;->p(ILcom/google/android/gms/internal/measurement/q;)V

    goto :goto_16

    :cond_38
    invoke-virtual {p0, v0, p3}, Lcom/google/android/gms/internal/measurement/f;->p(ILcom/google/android/gms/internal/measurement/q;)V

    goto :goto_15

    :cond_39
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Failed evaluation of arguments"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3a
    return-object p0

    :sswitch_13
    const-string p2, "toString"

    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3b

    invoke-static {p2, v9, p3}, Lcom/google/android/gms/internal/measurement/v5;->a(Ljava/lang/String;ILjava/util/List;)V

    new-instance p0, Lcom/google/android/gms/internal/measurement/u;

    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/measurement/f;->z(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/u;-><init>(Ljava/lang/String;)V

    return-object p0

    :cond_3b
    :goto_17
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Command not supported"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :sswitch_data_0
    .sparse-switch
        -0x69e9ad94 -> :sswitch_13
        -0x50c088ec -> :sswitch_12
        -0x4bf73488 -> :sswitch_11
        -0x37b90a9a -> :sswitch_10
        -0x3565b984 -> :sswitch_f
        -0x28732996 -> :sswitch_e
        -0x1bdda92d -> :sswitch_d
        -0x108c6a77 -> :sswitch_c
        0x1a55c -> :sswitch_b
        0x1b251 -> :sswitch_a
        0x31dd2a -> :sswitch_9
        0x34af1a -> :sswitch_8
        0x35f4f4 -> :sswitch_7
        0x35f59e -> :sswitch_6
        0x5c6731b -> :sswitch_5
        0x6856c82 -> :sswitch_4
        0x6873d92 -> :sswitch_3
        0x398d4c56 -> :sswitch_2
        0x418e52e2 -> :sswitch_1
        0x73d44649 -> :sswitch_0
    .end sparse-switch
.end method

.method public static b(Lcom/google/android/gms/internal/measurement/f;Lcom/google/android/gms/internal/measurement/u4;Ljava/util/List;Z)Lcom/google/android/gms/internal/measurement/q;
    .locals 10

    const-string v0, "reduce"

    const/4 v1, 0x1

    invoke-static {v0, v1, p2}, Lcom/google/android/gms/internal/measurement/v5;->b(Ljava/lang/String;ILjava/util/List;)V

    const/4 v2, 0x2

    invoke-static {v0, v2, p2}, Lcom/google/android/gms/internal/measurement/v5;->c(Ljava/lang/String;ILjava/util/List;)V

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/q;

    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/measurement/u4;->a(Lcom/google/android/gms/internal/measurement/q;)Lcom/google/android/gms/internal/measurement/q;

    move-result-object v3

    instance-of v4, v3, Lcom/google/android/gms/internal/measurement/k;

    if-eqz v4, :cond_a

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v4

    if-ne v4, v2, :cond_1

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/measurement/q;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/measurement/u4;->a(Lcom/google/android/gms/internal/measurement/q;)Lcom/google/android/gms/internal/measurement/q;

    move-result-object p2

    instance-of v4, p2, Lcom/google/android/gms/internal/measurement/h;

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Failed to parse initial value"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/f;->k()I

    move-result p2

    if-eqz p2, :cond_9

    const/4 p2, 0x0

    :goto_0
    check-cast v3, Lcom/google/android/gms/internal/measurement/k;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/f;->k()I

    move-result v4

    if-eqz p3, :cond_2

    move v5, v0

    goto :goto_1

    :cond_2
    add-int/lit8 v5, v4, -0x1

    :goto_1
    const/4 v6, -0x1

    if-eqz p3, :cond_3

    add-int/2addr v4, v6

    goto :goto_2

    :cond_3
    move v4, v0

    :goto_2
    if-eq v1, p3, :cond_4

    goto :goto_3

    :cond_4
    move v6, v1

    :goto_3
    if-nez p2, :cond_6

    invoke-virtual {p0, v5}, Lcom/google/android/gms/internal/measurement/f;->m(I)Lcom/google/android/gms/internal/measurement/q;

    move-result-object p2

    :cond_5
    :goto_4
    add-int/2addr v5, v6

    :cond_6
    sub-int p3, v4, v5

    mul-int/2addr p3, v6

    if-ltz p3, :cond_8

    invoke-virtual {p0, v5}, Lcom/google/android/gms/internal/measurement/f;->t(I)Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-virtual {p0, v5}, Lcom/google/android/gms/internal/measurement/f;->m(I)Lcom/google/android/gms/internal/measurement/q;

    move-result-object p3

    int-to-double v7, v5

    new-instance v9, Lcom/google/android/gms/internal/measurement/j;

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    invoke-direct {v9, v7}, Lcom/google/android/gms/internal/measurement/j;-><init>(Ljava/lang/Double;)V

    const/4 v7, 0x4

    new-array v7, v7, [Lcom/google/android/gms/internal/measurement/q;

    aput-object p2, v7, v0

    aput-object p3, v7, v1

    aput-object v9, v7, v2

    const/4 p2, 0x3

    aput-object p0, v7, p2

    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {v3, p1, p2}, Lcom/google/android/gms/internal/measurement/k;->h(Lcom/google/android/gms/internal/measurement/u4;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/q;

    move-result-object p2

    instance-of p3, p2, Lcom/google/android/gms/internal/measurement/h;

    if-nez p3, :cond_7

    goto :goto_4

    :cond_7
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Reduce operation failed"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    return-object p2

    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Empty array with no initial value error"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Callback should be a method"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static c(Lcom/google/android/gms/internal/measurement/f;Lcom/google/android/gms/internal/measurement/u4;Lcom/google/android/gms/internal/measurement/k;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/google/android/gms/internal/measurement/f;
    .locals 7

    new-instance v0, Lcom/google/android/gms/internal/measurement/f;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/f;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/f;->i()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/measurement/f;->t(I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/measurement/f;->m(I)Lcom/google/android/gms/internal/measurement/q;

    move-result-object v3

    int-to-double v4, v2

    new-instance v6, Lcom/google/android/gms/internal/measurement/j;

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    invoke-direct {v6, v4}, Lcom/google/android/gms/internal/measurement/j;-><init>(Ljava/lang/Double;)V

    const/4 v4, 0x3

    new-array v4, v4, [Lcom/google/android/gms/internal/measurement/q;

    const/4 v5, 0x0

    aput-object v3, v4, v5

    const/4 v3, 0x1

    aput-object v6, v4, v3

    const/4 v3, 0x2

    aput-object p0, v4, v3

    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {p2, p1, v3}, Lcom/google/android/gms/internal/measurement/k;->h(Lcom/google/android/gms/internal/measurement/u4;Ljava/util/List;)Lcom/google/android/gms/internal/measurement/q;

    move-result-object v3

    invoke-interface {v3}, Lcom/google/android/gms/internal/measurement/q;->zze()Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v4, p3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    if-eqz p4, :cond_2

    invoke-interface {v3}, Lcom/google/android/gms/internal/measurement/q;->zze()Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v4, p4}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    :cond_2
    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/measurement/f;->p(ILcom/google/android/gms/internal/measurement/q;)V

    goto :goto_0

    :cond_3
    :goto_1
    return-object v0
.end method
