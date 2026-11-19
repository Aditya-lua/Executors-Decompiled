.class public final Lob/b;
.super Lob/c;
.source "SourceFile"


# instance fields
.field public final g:Lcom/google/android/gms/internal/measurement/d4;

.field public final synthetic h:Lob/e;


# direct methods
.method public constructor <init>(Lob/e;Ljava/lang/String;ILcom/google/android/gms/internal/measurement/d4;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/b;->h:Lob/e;

    invoke-direct {p0, p2, p3}, Lob/c;-><init>(Ljava/lang/String;I)V

    iput-object p4, p0, Lob/b;->g:Lcom/google/android/gms/internal/measurement/d4;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Lob/b;->g:Lcom/google/android/gms/internal/measurement/d4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/d4;->G()I

    move-result v0

    return v0
.end method

.method public final b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final c()Z
    .locals 1

    iget-object v0, p0, Lob/b;->g:Lcom/google/android/gms/internal/measurement/d4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/d4;->L()Z

    move-result v0

    return v0
.end method

.method public final k(Ljava/lang/Long;Ljava/lang/Long;Lcom/google/android/gms/internal/measurement/s6;JLob/e0;Z)Z
    .locals 16

    move-object/from16 v0, p0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/cf;->a()Z

    iget-object v1, v0, Lob/b;->h:Lob/e;

    iget-object v2, v1, Lob/o8;->a:Lob/l7;

    invoke-virtual {v2}, Lob/l7;->w()Lob/m;

    move-result-object v3

    iget-object v4, v0, Lob/c;->a:Ljava/lang/String;

    sget-object v5, Lob/e5;->G0:Lob/d5;

    invoke-virtual {v3, v4, v5}, Lob/m;->H(Ljava/lang/String;Lob/d5;)Z

    move-result v3

    iget-object v5, v0, Lob/b;->g:Lcom/google/android/gms/internal/measurement/d4;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/d4;->R()Z

    move-result v6

    if-eqz v6, :cond_0

    move-object/from16 v6, p6

    iget-wide v6, v6, Lob/e0;->e:J

    goto :goto_0

    :cond_0
    move-wide/from16 v6, p4

    :goto_0
    invoke-virtual {v2}, Lob/l7;->a()Lob/b6;

    move-result-object v8

    invoke-virtual {v8}, Lob/b6;->z()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x2

    invoke-static {v8, v9}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v8

    const/4 v9, 0x0

    if-eqz v8, :cond_2

    invoke-virtual {v2}, Lob/l7;->a()Lob/b6;

    move-result-object v8

    invoke-virtual {v8}, Lob/b6;->w()Lob/z5;

    move-result-object v8

    iget v10, v0, Lob/c;->b:I

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/d4;->F()Z

    move-result v11

    if-eqz v11, :cond_1

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/d4;->G()I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    goto :goto_1

    :cond_1
    move-object v11, v9

    :goto_1
    invoke-virtual {v2}, Lob/l7;->D()Lob/u5;

    move-result-object v12

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/d4;->H()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Lob/u5;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v13, "Evaluating filter. audience, filter, event"

    invoke-virtual {v8, v13, v10, v11, v12}, Lob/z5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lob/l7;->a()Lob/b6;

    move-result-object v8

    invoke-virtual {v8}, Lob/b6;->w()Lob/z5;

    move-result-object v8

    iget-object v1, v1, Lob/zd;->b:Lob/ve;

    invoke-virtual {v1}, Lob/ve;->K0()Lob/af;

    move-result-object v1

    invoke-virtual {v1, v5}, Lob/af;->L(Lcom/google/android/gms/internal/measurement/d4;)Ljava/lang/String;

    move-result-object v1

    const-string v10, "Filter definition"

    invoke-virtual {v8, v10, v1}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_2
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/d4;->F()Z

    move-result v1

    const/4 v8, 0x0

    if-eqz v1, :cond_2c

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/d4;->G()I

    move-result v1

    const/16 v10, 0x100

    if-le v1, v10, :cond_3

    goto/16 :goto_e

    :cond_3
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/d4;->N()Z

    move-result v1

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/d4;->O()Z

    move-result v4

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/d4;->R()Z

    move-result v10

    const/4 v11, 0x1

    if-nez v1, :cond_4

    if-nez v4, :cond_4

    if-eqz v10, :cond_5

    :cond_4
    move v1, v11

    goto :goto_2

    :cond_5
    move v1, v8

    :goto_2
    if-eqz p7, :cond_7

    if-nez v1, :cond_7

    invoke-virtual {v2}, Lob/l7;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->w()Lob/z5;

    move-result-object v1

    iget v2, v0, Lob/c;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/d4;->F()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/d4;->G()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    :cond_6
    const-string v3, "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"

    invoke-virtual {v1, v3, v2, v9}, Lob/z5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return v11

    :cond_7
    invoke-virtual/range {p3 .. p3}, Lcom/google/android/gms/internal/measurement/s6;->I()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/d4;->L()Z

    move-result v10

    if-eqz v10, :cond_9

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/d4;->M()Lcom/google/android/gms/internal/measurement/j4;

    move-result-object v10

    invoke-static {v6, v7, v10}, Lob/c;->g(JLcom/google/android/gms/internal/measurement/j4;)Ljava/lang/Boolean;

    move-result-object v6

    if-nez v6, :cond_8

    goto/16 :goto_9

    :cond_8
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-nez v6, :cond_9

    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_9

    :cond_9
    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/d4;->I()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_b

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/google/android/gms/internal/measurement/f4;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/f4;->M()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/String;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_a

    invoke-virtual {v2}, Lob/l7;->a()Lob/b6;

    move-result-object v6

    invoke-virtual {v6}, Lob/b6;->r()Lob/z5;

    move-result-object v6

    invoke-virtual {v2}, Lob/l7;->D()Lob/u5;

    move-result-object v7

    invoke-virtual {v7, v4}, Lob/u5;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v7, "null or empty param name in filter. event"

    invoke-virtual {v6, v7, v4}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_a
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/f4;->M()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v6, v10}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_b
    new-instance v7, Lw1/a;

    invoke-direct {v7}, Lw1/a;-><init>()V

    invoke-virtual/range {p3 .. p3}, Lcom/google/android/gms/internal/measurement/s6;->F()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_c
    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_12

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/google/android/gms/internal/measurement/w6;

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/w6;->G()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v6, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_c

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/w6;->J()Z

    move-result v13

    if-eqz v13, :cond_e

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/w6;->G()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/w6;->J()Z

    move-result v14

    if-eqz v14, :cond_d

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/w6;->K()J

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    goto :goto_5

    :cond_d
    move-object v12, v9

    :goto_5
    invoke-interface {v7, v13, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_e
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/w6;->N()Z

    move-result v13

    if-eqz v13, :cond_10

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/w6;->G()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/w6;->N()Z

    move-result v14

    if-eqz v14, :cond_f

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/w6;->O()D

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v12

    goto :goto_6

    :cond_f
    move-object v12, v9

    :goto_6
    invoke-interface {v7, v13, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_10
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/w6;->H()Z

    move-result v13

    if-eqz v13, :cond_11

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/w6;->G()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/w6;->I()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v7, v13, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_11
    invoke-virtual {v2}, Lob/l7;->a()Lob/b6;

    move-result-object v6

    invoke-virtual {v6}, Lob/b6;->r()Lob/z5;

    move-result-object v6

    invoke-virtual {v2}, Lob/l7;->D()Lob/u5;

    move-result-object v7

    invoke-virtual {v7, v4}, Lob/u5;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lob/l7;->D()Lob/u5;

    move-result-object v7

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/w6;->G()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10}, Lob/u5;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v10, "Unknown value for param. event, param"

    invoke-virtual {v6, v10, v4, v7}, Lob/z5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_12
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/d4;->I()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_13
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_22

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/google/android/gms/internal/measurement/f4;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/f4;->J()Z

    move-result v12

    if-eqz v12, :cond_14

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/f4;->K()Z

    move-result v12

    if-eqz v12, :cond_14

    move v12, v11

    goto :goto_7

    :cond_14
    move v12, v8

    :goto_7
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/f4;->M()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/String;->isEmpty()Z

    move-result v14

    if-eqz v14, :cond_15

    invoke-virtual {v2}, Lob/l7;->a()Lob/b6;

    move-result-object v6

    invoke-virtual {v6}, Lob/b6;->r()Lob/z5;

    move-result-object v6

    invoke-virtual {v2}, Lob/l7;->D()Lob/u5;

    move-result-object v7

    invoke-virtual {v7, v4}, Lob/u5;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v7, "Event has empty param name. event"

    invoke-virtual {v6, v7, v4}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_15
    invoke-interface {v7, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    instance-of v15, v14, Ljava/lang/Long;

    if-eqz v15, :cond_18

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/f4;->H()Z

    move-result v15

    if-nez v15, :cond_16

    invoke-virtual {v2}, Lob/l7;->a()Lob/b6;

    move-result-object v6

    invoke-virtual {v6}, Lob/b6;->r()Lob/z5;

    move-result-object v6

    invoke-virtual {v2}, Lob/l7;->D()Lob/u5;

    move-result-object v7

    invoke-virtual {v7, v4}, Lob/u5;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lob/l7;->D()Lob/u5;

    move-result-object v7

    invoke-virtual {v7, v13}, Lob/u5;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v10, "No number filter for long param. event, param"

    invoke-virtual {v6, v10, v4, v7}, Lob/z5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_16
    check-cast v14, Ljava/lang/Long;

    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/f4;->I()Lcom/google/android/gms/internal/measurement/j4;

    move-result-object v10

    invoke-static {v13, v14, v10}, Lob/c;->g(JLcom/google/android/gms/internal/measurement/j4;)Ljava/lang/Boolean;

    move-result-object v10

    if-nez v10, :cond_17

    goto/16 :goto_9

    :cond_17
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    if-ne v10, v12, :cond_13

    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_9

    :cond_18
    instance-of v15, v14, Ljava/lang/Double;

    if-eqz v15, :cond_1b

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/f4;->H()Z

    move-result v15

    if-nez v15, :cond_19

    invoke-virtual {v2}, Lob/l7;->a()Lob/b6;

    move-result-object v6

    invoke-virtual {v6}, Lob/b6;->r()Lob/z5;

    move-result-object v6

    invoke-virtual {v2}, Lob/l7;->D()Lob/u5;

    move-result-object v7

    invoke-virtual {v7, v4}, Lob/u5;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lob/l7;->D()Lob/u5;

    move-result-object v7

    invoke-virtual {v7, v13}, Lob/u5;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v10, "No number filter for double param. event, param"

    invoke-virtual {v6, v10, v4, v7}, Lob/z5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_19
    check-cast v14, Ljava/lang/Double;

    invoke-virtual {v14}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v13

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/f4;->I()Lcom/google/android/gms/internal/measurement/j4;

    move-result-object v10

    invoke-static {v13, v14, v10}, Lob/c;->h(DLcom/google/android/gms/internal/measurement/j4;)Ljava/lang/Boolean;

    move-result-object v10

    if-nez v10, :cond_1a

    goto/16 :goto_9

    :cond_1a
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    if-ne v10, v12, :cond_13

    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_9

    :cond_1b
    instance-of v15, v14, Ljava/lang/String;

    if-eqz v15, :cond_20

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/f4;->F()Z

    move-result v15

    if-eqz v15, :cond_1c

    check-cast v14, Ljava/lang/String;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/f4;->G()Lcom/google/android/gms/internal/measurement/p4;

    move-result-object v10

    invoke-virtual {v2}, Lob/l7;->a()Lob/b6;

    move-result-object v13

    invoke-static {v14, v10, v13}, Lob/c;->f(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/p4;Lob/b6;)Ljava/lang/Boolean;

    move-result-object v10

    goto :goto_8

    :cond_1c
    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/f4;->H()Z

    move-result v15

    if-eqz v15, :cond_1f

    check-cast v14, Ljava/lang/String;

    invoke-static {v14}, Lob/af;->O(Ljava/lang/String;)Z

    move-result v15

    if-eqz v15, :cond_1e

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/f4;->I()Lcom/google/android/gms/internal/measurement/j4;

    move-result-object v10

    invoke-static {v14, v10}, Lob/c;->i(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/j4;)Ljava/lang/Boolean;

    move-result-object v10

    :goto_8
    if-nez v10, :cond_1d

    goto/16 :goto_9

    :cond_1d
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    if-ne v10, v12, :cond_13

    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_9

    :cond_1e
    invoke-virtual {v2}, Lob/l7;->a()Lob/b6;

    move-result-object v6

    invoke-virtual {v6}, Lob/b6;->r()Lob/z5;

    move-result-object v6

    invoke-virtual {v2}, Lob/l7;->D()Lob/u5;

    move-result-object v7

    invoke-virtual {v7, v4}, Lob/u5;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lob/l7;->D()Lob/u5;

    move-result-object v7

    invoke-virtual {v7, v13}, Lob/u5;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v10, "Invalid param value for number filter. event, param"

    invoke-virtual {v6, v10, v4, v7}, Lob/z5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_9

    :cond_1f
    invoke-virtual {v2}, Lob/l7;->a()Lob/b6;

    move-result-object v6

    invoke-virtual {v6}, Lob/b6;->r()Lob/z5;

    move-result-object v6

    invoke-virtual {v2}, Lob/l7;->D()Lob/u5;

    move-result-object v7

    invoke-virtual {v7, v4}, Lob/u5;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lob/l7;->D()Lob/u5;

    move-result-object v7

    invoke-virtual {v7, v13}, Lob/u5;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v10, "No filter for String param. event, param"

    invoke-virtual {v6, v10, v4, v7}, Lob/z5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_9

    :cond_20
    if-nez v14, :cond_21

    invoke-virtual {v2}, Lob/l7;->a()Lob/b6;

    move-result-object v6

    invoke-virtual {v6}, Lob/b6;->w()Lob/z5;

    move-result-object v6

    invoke-virtual {v2}, Lob/l7;->D()Lob/u5;

    move-result-object v7

    invoke-virtual {v7, v4}, Lob/u5;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lob/l7;->D()Lob/u5;

    move-result-object v7

    invoke-virtual {v7, v13}, Lob/u5;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v9, "Missing param for filter. event, param"

    invoke-virtual {v6, v9, v4, v7}, Lob/z5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_9

    :cond_21
    invoke-virtual {v2}, Lob/l7;->a()Lob/b6;

    move-result-object v6

    invoke-virtual {v6}, Lob/b6;->r()Lob/z5;

    move-result-object v6

    invoke-virtual {v2}, Lob/l7;->D()Lob/u5;

    move-result-object v7

    invoke-virtual {v7, v4}, Lob/u5;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lob/l7;->D()Lob/u5;

    move-result-object v7

    invoke-virtual {v7, v13}, Lob/u5;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v10, "Unknown param type. event, param"

    invoke-virtual {v6, v10, v4, v7}, Lob/z5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_9

    :cond_22
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_9
    invoke-virtual {v2}, Lob/l7;->a()Lob/b6;

    move-result-object v2

    invoke-virtual {v2}, Lob/b6;->w()Lob/z5;

    move-result-object v2

    if-nez v9, :cond_23

    const-string v4, "null"

    goto :goto_a

    :cond_23
    move-object v4, v9

    :goto_a
    const-string v6, "Event filter result"

    invoke-virtual {v2, v6, v4}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    if-nez v9, :cond_24

    return v8

    :cond_24
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v2, v0, Lob/c;->c:Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v4, :cond_25

    return v11

    :cond_25
    iput-object v2, v0, Lob/c;->d:Ljava/lang/Boolean;

    if-eqz v1, :cond_2b

    invoke-virtual/range {p3 .. p3}, Lcom/google/android/gms/internal/measurement/s6;->J()Z

    move-result v1

    if-eqz v1, :cond_2b

    invoke-virtual/range {p3 .. p3}, Lcom/google/android/gms/internal/measurement/s6;->K()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/d4;->O()Z

    move-result v2

    if-eqz v2, :cond_28

    if-eqz v3, :cond_27

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/d4;->L()Z

    move-result v2

    if-nez v2, :cond_26

    goto :goto_b

    :cond_26
    move-object/from16 v1, p1

    :cond_27
    :goto_b
    iput-object v1, v0, Lob/c;->f:Ljava/lang/Long;

    goto :goto_d

    :cond_28
    if-eqz v3, :cond_2a

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/d4;->L()Z

    move-result v2

    if-nez v2, :cond_29

    goto :goto_c

    :cond_29
    move-object/from16 v1, p2

    :cond_2a
    :goto_c
    iput-object v1, v0, Lob/c;->e:Ljava/lang/Long;

    :cond_2b
    :goto_d
    return v11

    :cond_2c
    :goto_e
    invoke-virtual {v2}, Lob/l7;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->r()Lob/z5;

    move-result-object v1

    invoke-static {v4}, Lob/b6;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/d4;->F()Z

    move-result v3

    if-eqz v3, :cond_2d

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/d4;->G()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    :cond_2d
    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "Invalid event filter ID. appId, id"

    invoke-virtual {v1, v4, v2, v3}, Lob/z5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return v8
.end method
