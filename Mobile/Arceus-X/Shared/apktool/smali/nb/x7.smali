.class public final Lnb/x7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/measurement/internal/zzbg;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lnb/i8;


# direct methods
.method public constructor <init>(Lnb/i8;Lcom/google/android/gms/measurement/internal/zzbg;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Lnb/x7;->a:Lcom/google/android/gms/measurement/internal/zzbg;

    iput-object p3, p0, Lnb/x7;->b:Ljava/lang/String;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/x7;->c:Lnb/i8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic call()Ljava/lang/Object;
    .locals 38

    move-object/from16 v1, p0

    const-string v0, "_r"

    iget-object v2, v1, Lnb/x7;->c:Lnb/i8;

    invoke-virtual {v2}, Lnb/i8;->z2()Lnb/me;

    move-result-object v3

    invoke-virtual {v3}, Lnb/me;->E()V

    invoke-virtual {v2}, Lnb/i8;->z2()Lnb/me;

    move-result-object v2

    invoke-virtual {v2}, Lnb/me;->J0()Lnb/wa;

    move-result-object v2

    invoke-virtual {v2}, Lnb/j8;->h()V

    iget-object v3, v2, Lnb/j8;->a:Lnb/g7;

    invoke-static {}, Lnb/g7;->q()V

    iget-object v4, v1, Lnb/x7;->a:Lcom/google/android/gms/measurement/internal/zzbg;

    invoke-static {v4}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v6, v1, Lnb/x7;->b:Ljava/lang/String;

    invoke-static {v6}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v5, v4, Lcom/google/android/gms/measurement/internal/zzbg;->f:Ljava/lang/String;

    const-string v7, "_iap"

    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    const/4 v8, 0x0

    if-nez v7, :cond_0

    const-string v7, "_iapx"

    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_0

    iget-object v0, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->v()Lnb/u5;

    move-result-object v0

    const-string v2, "Generating a payload for this event is not available. package_name, event_name"

    invoke-virtual {v0, v2, v6, v5}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v8

    :cond_0
    iget-object v5, v2, Lnb/td;->b:Lnb/me;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/y6;->O()Lcom/google/android/gms/internal/measurement/v6;

    move-result-object v7

    invoke-virtual {v5}, Lnb/me;->F0()Lnb/t;

    move-result-object v9

    invoke-virtual {v9}, Lnb/t;->r0()V

    :try_start_0
    invoke-virtual {v5}, Lnb/me;->F0()Lnb/t;

    move-result-object v9

    invoke-virtual {v9, v6}, Lnb/t;->J0(Ljava/lang/String;)Lnb/c6;

    move-result-object v9

    const/4 v10, 0x0

    if-nez v9, :cond_1

    iget-object v0, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->v()Lnb/u5;

    move-result-object v0

    const-string v3, "Log and bundle not available. package_name"

    invoke-virtual {v0, v3, v6}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v0, v10, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-virtual {v5}, Lnb/me;->F0()Lnb/t;

    move-result-object v2

    invoke-virtual {v2}, Lnb/t;->t0()V

    return-object v0

    :catchall_0
    move-exception v0

    move-object v1, v2

    goto/16 :goto_d

    :cond_1
    :try_start_1
    invoke-virtual {v9}, Lnb/c6;->d()Z

    move-result v11

    if-nez v11, :cond_2

    iget-object v0, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->v()Lnb/u5;

    move-result-object v0

    const-string v3, "Log and bundle disabled. package_name"

    invoke-virtual {v0, v3, v6}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v0, v10, [B

    goto :goto_0

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/a7;->m0()Lcom/google/android/gms/internal/measurement/z6;

    move-result-object v11

    const/4 v12, 0x1

    invoke-virtual {v11, v12}, Lcom/google/android/gms/internal/measurement/z6;->e0(I)Lcom/google/android/gms/internal/measurement/z6;

    const-string v13, "android"

    invoke-virtual {v11, v13}, Lcom/google/android/gms/internal/measurement/z6;->A(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v9}, Lnb/c6;->o0()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_3

    invoke-virtual {v9}, Lnb/c6;->o0()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v11, v13}, Lcom/google/android/gms/internal/measurement/z6;->P(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/z6;

    :cond_3
    invoke-virtual {v9}, Lnb/c6;->H0()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_4

    invoke-virtual {v9}, Lnb/c6;->H0()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-virtual {v11, v13}, Lcom/google/android/gms/internal/measurement/z6;->N(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/z6;

    :cond_4
    invoke-virtual {v9}, Lnb/c6;->D0()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_5

    invoke-virtual {v9}, Lnb/c6;->D0()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-virtual {v11, v13}, Lcom/google/android/gms/internal/measurement/z6;->Q(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/z6;

    :cond_5
    invoke-virtual {v9}, Lnb/c6;->F0()J

    move-result-wide v13

    const-wide/32 v15, -0x80000000

    cmp-long v13, v13, v15

    if-eqz v13, :cond_6

    invoke-virtual {v9}, Lnb/c6;->F0()J

    move-result-wide v13

    long-to-int v13, v13

    invoke-virtual {v11, v13}, Lcom/google/android/gms/internal/measurement/z6;->F0(I)Lcom/google/android/gms/internal/measurement/z6;

    :cond_6
    invoke-virtual {v9}, Lnb/c6;->J0()J

    move-result-wide v13

    invoke-virtual {v11, v13, v14}, Lcom/google/android/gms/internal/measurement/z6;->R(J)Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v9}, Lnb/c6;->b()J

    move-result-wide v13

    invoke-virtual {v11, v13, v14}, Lcom/google/android/gms/internal/measurement/z6;->N0(J)Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v9}, Lnb/c6;->r0()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v14

    if-nez v14, :cond_7

    invoke-virtual {v11, v13}, Lcom/google/android/gms/internal/measurement/z6;->z0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/z6;

    :cond_7
    invoke-virtual {v9}, Lnb/c6;->X()J

    move-result-wide v13

    invoke-virtual {v11, v13, v14}, Lcom/google/android/gms/internal/measurement/z6;->U0(J)Lcom/google/android/gms/internal/measurement/z6;

    iget-object v13, v2, Lnb/td;->b:Lnb/me;

    invoke-virtual {v13, v6}, Lnb/me;->g(Ljava/lang/String;)Lnb/q8;

    move-result-object v13

    invoke-virtual {v9}, Lnb/c6;->L0()J

    move-result-wide v14

    invoke-virtual {v11, v14, v15}, Lcom/google/android/gms/internal/measurement/z6;->c0(J)Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v3}, Lnb/g7;->g()Z

    move-result v3

    if-eqz v3, :cond_8

    iget-object v3, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v3}, Lnb/g7;->w()Lnb/k;

    move-result-object v3

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/z6;->O()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v3, v14}, Lnb/k;->k(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_8

    sget-object v3, Lnb/p8;->b:Lnb/p8;

    invoke-virtual {v13, v3}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_8

    invoke-virtual {v11, v8}, Lcom/google/android/gms/internal/measurement/z6;->I0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/z6;

    :cond_8
    invoke-virtual {v13}, Lnb/q8;->k()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11, v3}, Lcom/google/android/gms/internal/measurement/z6;->P0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/z6;

    sget-object v3, Lnb/p8;->b:Lnb/p8;

    invoke-virtual {v13, v3}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-virtual {v9}, Lnb/c6;->P()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-virtual {v5}, Lnb/me;->L0()Lnb/vc;

    move-result-object v3

    invoke-virtual {v9}, Lnb/c6;->o0()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5, v13}, Lnb/vc;->m(Ljava/lang/String;Lnb/q8;)Landroid/util/Pair;

    move-result-object v3

    invoke-virtual {v9}, Lnb/c6;->P()Z

    move-result v5

    if-eqz v5, :cond_9

    iget-object v5, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v5, :cond_9

    :try_start_2
    iget-object v5, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-wide v14, v4, Lcom/google/android/gms/measurement/internal/zzbg;->i:J

    invoke-static {v14, v15}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v14

    invoke-static {v5, v14}, Lnb/wa;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v11, v5}, Lcom/google/android/gms/internal/measurement/z6;->U(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/z6;
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    if-eqz v3, :cond_9

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v11, v3}, Lcom/google/android/gms/internal/measurement/z6;->X(Z)Lcom/google/android/gms/internal/measurement/z6;

    goto :goto_2

    :catch_0
    move-exception v0

    iget-object v3, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v3}, Lnb/g7;->a()Lnb/w5;

    move-result-object v3

    invoke-virtual {v3}, Lnb/w5;->v()Lnb/u5;

    move-result-object v3

    const-string v4, "Resettable device id encryption failed"

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v8, v10, [B
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    iget-object v0, v2, Lnb/td;->b:Lnb/me;

    :goto_1
    invoke-virtual {v0}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0}, Lnb/t;->t0()V

    goto/16 :goto_c

    :cond_9
    :goto_2
    :try_start_4
    iget-object v3, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v3}, Lnb/g7;->K()Lnb/z;

    move-result-object v5

    invoke-virtual {v5}, Lnb/k8;->l()V

    sget-object v5, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v11, v5}, Lcom/google/android/gms/internal/measurement/z6;->E(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v3}, Lnb/g7;->K()Lnb/z;

    move-result-object v5

    invoke-virtual {v5}, Lnb/k8;->l()V

    sget-object v5, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v11, v5}, Lcom/google/android/gms/internal/measurement/z6;->D(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v3}, Lnb/g7;->K()Lnb/z;

    move-result-object v5

    invoke-virtual {v5}, Lnb/z;->o()J

    move-result-wide v14

    long-to-int v5, v14

    invoke-virtual {v11, v5}, Lcom/google/android/gms/internal/measurement/z6;->K(I)Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v3}, Lnb/g7;->K()Lnb/z;

    move-result-object v3

    invoke-virtual {v3}, Lnb/z;->p()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11, v3}, Lcom/google/android/gms/internal/measurement/z6;->J(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/z6;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    sget-object v3, Lnb/p8;->c:Lnb/p8;

    invoke-virtual {v13, v3}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-virtual {v9}, Lnb/c6;->p0()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_a

    invoke-virtual {v9}, Lnb/c6;->p0()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-wide v13, v4, Lcom/google/android/gms/measurement/internal/zzbg;->i:J

    invoke-static {v13, v14}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lnb/wa;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11, v3}, Lcom/google/android/gms/internal/measurement/z6;->a0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/z6;
    :try_end_5
    .catch Ljava/lang/SecurityException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_3

    :catch_1
    move-exception v0

    move-object v1, v2

    goto/16 :goto_b

    :cond_a
    :goto_3
    :try_start_6
    invoke-virtual {v9}, Lnb/c6;->x0()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_b

    invoke-virtual {v9}, Lnb/c6;->x0()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v11, v3}, Lcom/google/android/gms/internal/measurement/z6;->D0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/z6;

    :cond_b
    invoke-virtual {v9}, Lnb/c6;->o0()Ljava/lang/String;

    move-result-object v14

    iget-object v3, v2, Lnb/td;->b:Lnb/me;

    invoke-virtual {v3}, Lnb/me;->F0()Lnb/t;

    move-result-object v5

    invoke-virtual {v5, v14}, Lnb/t;->C0(Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_4
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_d

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lnb/te;

    const-string v8, "_lte"

    iget-object v10, v15, Lnb/te;->c:Ljava/lang/String;

    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_c

    goto :goto_5

    :cond_c
    const/4 v8, 0x0

    const/4 v10, 0x0

    goto :goto_4

    :cond_d
    const/4 v15, 0x0

    :goto_5
    const-wide/16 v22, 0x0

    if-eqz v15, :cond_e

    iget-object v8, v15, Lnb/te;->e:Ljava/lang/Object;

    if-nez v8, :cond_f

    :cond_e
    new-instance v13, Lnb/te;

    const-string v15, "auto"

    const-string v16, "_lte"

    iget-object v8, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v8}, Lnb/g7;->e()Lu9/e;

    move-result-object v8

    invoke-interface {v8}, Lu9/e;->a()J

    move-result-wide v17

    invoke-static/range {v22 .. v23}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v19

    invoke-direct/range {v13 .. v19}, Lnb/te;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    invoke-interface {v5, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Lnb/me;->F0()Lnb/t;

    move-result-object v8

    invoke-virtual {v8, v13}, Lnb/t;->A0(Lnb/te;)Z

    :cond_f
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    new-array v8, v8, [Lcom/google/android/gms/internal/measurement/r7;

    const/4 v10, 0x0

    :goto_6
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v13

    if-ge v10, v13, :cond_10

    invoke-static {}, Lcom/google/android/gms/internal/measurement/r7;->S()Lcom/google/android/gms/internal/measurement/q7;

    move-result-object v13

    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lnb/te;

    iget-object v14, v14, Lnb/te;->c:Ljava/lang/String;

    invoke-virtual {v13, v14}, Lcom/google/android/gms/internal/measurement/q7;->z(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/q7;

    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lnb/te;

    iget-wide v14, v14, Lnb/te;->d:J

    invoke-virtual {v13, v14, v15}, Lcom/google/android/gms/internal/measurement/q7;->x(J)Lcom/google/android/gms/internal/measurement/q7;

    invoke-virtual {v3}, Lnb/me;->K0()Lnb/re;

    move-result-object v14

    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lnb/te;

    iget-object v15, v15, Lnb/te;->e:Ljava/lang/Object;

    invoke-virtual {v14, v13, v15}, Lnb/re;->G(Lcom/google/android/gms/internal/measurement/q7;Ljava/lang/Object;)V

    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v13

    check-cast v13, Lcom/google/android/gms/internal/measurement/r7;

    aput-object v13, v8, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_6

    :cond_10
    invoke-static {v8}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-virtual {v11, v5}, Lcom/google/android/gms/internal/measurement/z6;->l1(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/z6;

    iget-object v5, v2, Lnb/td;->b:Lnb/me;

    invoke-virtual {v5, v9, v11}, Lnb/me;->n(Lnb/c6;Lcom/google/android/gms/internal/measurement/z6;)V

    invoke-virtual {v5, v9, v11}, Lnb/me;->o(Lnb/c6;Lcom/google/android/gms/internal/measurement/z6;)V

    invoke-static {v4}, Lnb/x5;->a(Lcom/google/android/gms/measurement/internal/zzbg;)Lnb/x5;

    move-result-object v8

    iget-object v10, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v10}, Lnb/g7;->C()Lnb/ve;

    move-result-object v13

    iget-object v14, v8, Lnb/x5;->d:Landroid/os/Bundle;

    invoke-virtual {v3}, Lnb/me;->F0()Lnb/t;

    move-result-object v15

    invoke-virtual {v15, v6}, Lnb/t;->G(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v15

    invoke-virtual {v13, v14, v15}, Lnb/ve;->w(Landroid/os/Bundle;Landroid/os/Bundle;)V

    invoke-virtual {v10}, Lnb/g7;->C()Lnb/ve;

    move-result-object v13

    invoke-virtual {v10}, Lnb/g7;->w()Lnb/k;

    move-result-object v15

    invoke-virtual {v15, v6}, Lnb/k;->w(Ljava/lang/String;)I

    move-result v15

    invoke-virtual {v13, v8, v15}, Lnb/ve;->u(Lnb/x5;I)V

    const-string v8, "_c"

    const-wide/16 v12, 0x1

    invoke-virtual {v14, v8, v12, v13}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {v10}, Lnb/g7;->a()Lnb/w5;

    move-result-object v8

    invoke-virtual {v8}, Lnb/w5;->v()Lnb/u5;

    move-result-object v8

    const-string v15, "Marking in-app purchase as real-time"

    invoke-virtual {v8, v15}, Lnb/u5;->a(Ljava/lang/String;)V

    invoke-virtual {v14, v0, v12, v13}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v8, "_o"

    iget-object v15, v4, Lcom/google/android/gms/measurement/internal/zzbg;->h:Ljava/lang/String;

    invoke-virtual {v14, v8, v15}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v10}, Lnb/g7;->C()Lnb/ve;

    move-result-object v8

    move-wide/from16 v17, v12

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/z6;->O()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9}, Lnb/c6;->l0()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v8, v12, v13}, Lnb/ve;->P(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_11

    invoke-virtual {v10}, Lnb/g7;->C()Lnb/ve;

    move-result-object v8

    const-string v12, "_dbg"

    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    invoke-virtual {v8, v14, v12, v13}, Lnb/ve;->A(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v10}, Lnb/g7;->C()Lnb/ve;

    move-result-object v8

    invoke-virtual {v8, v14, v0, v13}, Lnb/ve;->A(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_11
    invoke-virtual {v3}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    move-object v8, v7

    iget-object v7, v4, Lcom/google/android/gms/measurement/internal/zzbg;->f:Ljava/lang/String;

    invoke-virtual {v0, v6, v7}, Lnb/t;->v0(Ljava/lang/String;Ljava/lang/String;)Lnb/b0;

    move-result-object v0

    if-nez v0, :cond_12

    move-object v12, v5

    new-instance v5, Lnb/b0;

    move-object v0, v14

    move-object v13, v15

    iget-wide v14, v4, Lcom/google/android/gms/measurement/internal/zzbg;->i:J

    const/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    move-object/from16 v19, v8

    move-object/from16 v24, v9

    const-wide/16 v8, 0x0

    move-object/from16 v26, v10

    move-object/from16 v25, v11

    const-wide/16 v10, 0x0

    move-object/from16 v27, v12

    move-object/from16 v28, v13

    const-wide/16 v12, 0x0

    move-object/from16 v30, v17

    const/16 v29, 0x1

    const-wide/16 v16, 0x0

    move/from16 v31, v18

    const/16 v18, 0x0

    move-object/from16 v32, v19

    const/16 v19, 0x0

    move-object/from16 v1, v28

    move-object/from16 v28, v0

    move/from16 v0, v29

    move-object/from16 v29, v1

    move/from16 v1, v31

    invoke-direct/range {v5 .. v21}, Lnb/b0;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    move/from16 v16, v0

    move-wide/from16 v12, v22

    move-object/from16 v15, v32

    :goto_7
    move-object v0, v5

    goto :goto_8

    :cond_12
    move-object/from16 v27, v5

    move-object/from16 v24, v9

    move-object/from16 v26, v10

    move-object/from16 v25, v11

    move-object/from16 v28, v14

    move-object/from16 v29, v15

    const/4 v1, 0x0

    const/16 v16, 0x1

    const/16 v30, 0x0

    move-object v15, v8

    iget-wide v8, v0, Lnb/b0;->f:J

    iget-wide v10, v4, Lcom/google/android/gms/measurement/internal/zzbg;->i:J

    invoke-virtual {v0, v10, v11}, Lnb/b0;->a(J)Lnb/b0;

    move-result-object v5

    move-wide v12, v8

    goto :goto_7

    :goto_8
    invoke-virtual {v3}, Lnb/me;->F0()Lnb/t;

    move-result-object v5

    invoke-virtual {v5, v0}, Lnb/t;->w0(Lnb/b0;)V

    new-instance v5, Lnb/a0;

    move-object v8, v6

    iget-object v6, v2, Lnb/j8;->a:Lnb/g7;

    iget-wide v10, v4, Lcom/google/android/gms/measurement/internal/zzbg;->i:J
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-object/from16 v17, v2

    move-object v9, v7

    move/from16 v2, v16

    move-object/from16 v4, v24

    move-object/from16 v1, v25

    move-object/from16 v14, v28

    move-object/from16 v7, v29

    move-object/from16 v16, v3

    move-object/from16 v3, v27

    :try_start_7
    invoke-direct/range {v5 .. v14}, Lnb/a0;-><init>(Lnb/g7;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V

    move-object v6, v8

    move-object v7, v9

    invoke-static {}, Lcom/google/android/gms/internal/measurement/o6;->R()Lcom/google/android/gms/internal/measurement/n6;

    move-result-object v8

    iget-wide v9, v5, Lnb/a0;->d:J

    invoke-virtual {v8, v9, v10}, Lcom/google/android/gms/internal/measurement/n6;->S(J)Lcom/google/android/gms/internal/measurement/n6;

    iget-object v9, v5, Lnb/a0;->b:Ljava/lang/String;

    invoke-virtual {v8, v9}, Lcom/google/android/gms/internal/measurement/n6;->P(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/n6;

    iget-wide v9, v5, Lnb/a0;->e:J

    invoke-virtual {v8, v9, v10}, Lcom/google/android/gms/internal/measurement/n6;->U(J)Lcom/google/android/gms/internal/measurement/n6;

    iget-object v5, v5, Lnb/a0;->f:Lcom/google/android/gms/measurement/internal/zzbe;

    new-instance v9, Lnb/c0;

    invoke-direct {v9, v5}, Lnb/c0;-><init>(Lcom/google/android/gms/measurement/internal/zzbe;)V

    :cond_13
    :goto_9
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_14

    invoke-virtual {v9}, Lnb/c0;->b()Ljava/lang/String;

    move-result-object v10

    invoke-static {}, Lcom/google/android/gms/internal/measurement/s6;->T()Lcom/google/android/gms/internal/measurement/r6;

    move-result-object v11

    invoke-virtual {v11, v10}, Lcom/google/android/gms/internal/measurement/r6;->z(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r6;

    invoke-virtual {v5, v10}, Lcom/google/android/gms/measurement/internal/zzbe;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    if-eqz v10, :cond_13

    invoke-virtual/range {v16 .. v16}, Lnb/me;->K0()Lnb/re;

    move-result-object v12

    invoke-virtual {v12, v11, v10}, Lnb/re;->H(Lcom/google/android/gms/internal/measurement/r6;Ljava/lang/Object;)V

    invoke-virtual {v8, v11}, Lcom/google/android/gms/internal/measurement/n6;->G(Lcom/google/android/gms/internal/measurement/r6;)Lcom/google/android/gms/internal/measurement/n6;

    goto :goto_9

    :catchall_1
    move-exception v0

    move-object/from16 v1, v17

    goto/16 :goto_d

    :cond_14
    invoke-virtual {v1, v8}, Lcom/google/android/gms/internal/measurement/z6;->b1(Lcom/google/android/gms/internal/measurement/n6;)Lcom/google/android/gms/internal/measurement/z6;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/d7;->F()Lcom/google/android/gms/internal/measurement/b7;

    move-result-object v5

    invoke-static {}, Lcom/google/android/gms/internal/measurement/q6;->F()Lcom/google/android/gms/internal/measurement/p6;

    move-result-object v9

    iget-wide v10, v0, Lnb/b0;->c:J

    invoke-virtual {v9, v10, v11}, Lcom/google/android/gms/internal/measurement/p6;->z(J)Lcom/google/android/gms/internal/measurement/p6;

    invoke-virtual {v9, v7}, Lcom/google/android/gms/internal/measurement/p6;->x(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/p6;

    invoke-virtual {v5, v9}, Lcom/google/android/gms/internal/measurement/b7;->x(Lcom/google/android/gms/internal/measurement/p6;)Lcom/google/android/gms/internal/measurement/b7;

    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/measurement/z6;->L0(Lcom/google/android/gms/internal/measurement/b7;)Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual/range {v16 .. v16}, Lnb/me;->I0()Lnb/e;

    move-result-object v31

    invoke-virtual {v4}, Lnb/c6;->o0()Ljava/lang/String;

    move-result-object v32

    sget-object v33, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/z6;->f1()Ljava/util/List;

    move-result-object v34

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/n6;->R()J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v35

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/n6;->R()J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v36

    const/16 v37, 0x0

    invoke-virtual/range {v31 .. v37}, Lnb/e;->m(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Z)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/measurement/z6;->B0(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/n6;->Q()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/n6;->R()J

    move-result-wide v9

    invoke-virtual {v1, v9, v10}, Lcom/google/android/gms/internal/measurement/z6;->q1(J)Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/n6;->R()J

    move-result-wide v7

    invoke-virtual {v1, v7, v8}, Lcom/google/android/gms/internal/measurement/z6;->s1(J)Lcom/google/android/gms/internal/measurement/z6;

    :cond_15
    invoke-virtual {v4}, Lnb/c6;->B0()J

    move-result-wide v7

    cmp-long v0, v7, v22

    if-eqz v0, :cond_16

    invoke-virtual {v1, v7, v8}, Lcom/google/android/gms/internal/measurement/z6;->x(J)Lcom/google/android/gms/internal/measurement/z6;

    :cond_16
    invoke-virtual {v4}, Lnb/c6;->z0()J

    move-result-wide v9

    cmp-long v5, v9, v22

    if-eqz v5, :cond_17

    invoke-virtual {v1, v9, v10}, Lcom/google/android/gms/internal/measurement/z6;->t1(J)Lcom/google/android/gms/internal/measurement/z6;

    goto :goto_a

    :cond_17
    if-eqz v0, :cond_18

    invoke-virtual {v1, v7, v8}, Lcom/google/android/gms/internal/measurement/z6;->t1(J)Lcom/google/android/gms/internal/measurement/z6;

    :cond_18
    :goto_a
    invoke-virtual {v4}, Lnb/c6;->t0()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/ig;->a()Z

    invoke-virtual/range {v26 .. v26}, Lnb/g7;->w()Lnb/k;

    move-result-object v5

    sget-object v7, Lnb/z4;->N0:Lnb/y4;

    invoke-virtual {v5, v6, v7}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v5

    if-eqz v5, :cond_19

    if-eqz v0, :cond_19

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/measurement/z6;->Q0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/z6;

    :cond_19
    invoke-virtual {v4}, Lnb/c6;->l()V

    invoke-virtual {v4}, Lnb/c6;->g()J

    move-result-wide v7

    long-to-int v0, v7

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/measurement/z6;->d0(I)Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual/range {v26 .. v26}, Lnb/g7;->w()Lnb/k;

    move-result-object v0

    invoke-virtual {v0}, Lnb/k;->A()J

    const-wide/32 v7, 0x2078d

    invoke-virtual {v1, v7, v8}, Lcom/google/android/gms/internal/measurement/z6;->S(J)Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual/range {v26 .. v26}, Lnb/g7;->e()Lu9/e;

    move-result-object v0

    invoke-interface {v0}, Lu9/e;->a()J

    move-result-wide v7

    invoke-virtual {v1, v7, v8}, Lcom/google/android/gms/internal/measurement/z6;->n1(J)Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/measurement/z6;->A0(Z)Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/z6;->O()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0, v1}, Lnb/me;->x(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/z6;)V

    invoke-virtual {v15, v1}, Lcom/google/android/gms/internal/measurement/v6;->D(Lcom/google/android/gms/internal/measurement/z6;)Lcom/google/android/gms/internal/measurement/v6;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/z6;->p1()J

    move-result-wide v2

    invoke-virtual {v4, v2, v3}, Lnb/c6;->A0(J)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/z6;->r1()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lnb/c6;->C0(J)V

    invoke-virtual/range {v16 .. v16}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v4, v1, v1}, Lnb/t;->K0(Lnb/c6;ZZ)V

    invoke-virtual/range {v16 .. v16}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0}, Lnb/t;->s0()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    invoke-virtual/range {v16 .. v16}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0}, Lnb/t;->t0()V

    :try_start_8
    invoke-virtual/range {v16 .. v16}, Lnb/me;->K0()Lnb/re;

    move-result-object v0

    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/y6;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/r9;->d()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lnb/re;->V([B)[B

    move-result-object v0
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2

    return-object v0

    :catch_2
    move-exception v0

    move-object/from16 v1, v17

    iget-object v1, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->o()Lnb/u5;

    move-result-object v1

    invoke-static {v6}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "Data loss. Failed to bundle and serialize. appId"

    invoke-virtual {v1, v3, v2, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v8, v30

    goto :goto_c

    :goto_b
    :try_start_9
    iget-object v2, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->v()Lnb/u5;

    move-result-object v2

    const-string v3, "app instance id encryption failed"

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v2, 0x0

    new-array v8, v2, [B
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    iget-object v0, v1, Lnb/td;->b:Lnb/me;

    goto/16 :goto_1

    :goto_c
    return-object v8

    :catchall_2
    move-exception v0

    :goto_d
    iget-object v1, v1, Lnb/td;->b:Lnb/me;

    invoke-virtual {v1}, Lnb/me;->F0()Lnb/t;

    move-result-object v1

    invoke-virtual {v1}, Lnb/t;->t0()V

    throw v0
.end method
