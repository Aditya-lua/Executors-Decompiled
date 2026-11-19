.class public final Lob/c8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lob/i0;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lob/n8;


# direct methods
.method public constructor <init>(Lob/n8;Lob/i0;Ljava/lang/String;)V
    .locals 0

    iput-object p2, p0, Lob/c8;->a:Lob/i0;

    iput-object p3, p0, Lob/c8;->b:Ljava/lang/String;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lob/c8;->c:Lob/n8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic call()Ljava/lang/Object;
    .locals 38

    move-object/from16 v1, p0

    const-string v0, "_r"

    iget-object v2, v1, Lob/c8;->c:Lob/n8;

    invoke-virtual {v2}, Lob/n8;->z2()Lob/ve;

    move-result-object v3

    invoke-virtual {v3}, Lob/ve;->E()V

    invoke-virtual {v2}, Lob/n8;->z2()Lob/ve;

    move-result-object v2

    invoke-virtual {v2}, Lob/ve;->J0()Lob/bb;

    move-result-object v2

    invoke-virtual {v2}, Lob/o8;->h()V

    iget-object v3, v2, Lob/o8;->a:Lob/l7;

    invoke-static {}, Lob/l7;->q()V

    iget-object v4, v1, Lob/c8;->a:Lob/i0;

    invoke-static {v4}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v6, v1, Lob/c8;->b:Ljava/lang/String;

    invoke-static {v6}, Lo9/s;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v5, v4, Lob/i0;->f:Ljava/lang/String;

    const-string v7, "_iap"

    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    const/4 v8, 0x0

    if-nez v7, :cond_0

    const-string v7, "_iapx"

    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_0

    iget-object v0, v2, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->v()Lob/z5;

    move-result-object v0

    const-string v2, "Generating a payload for this event is not available. package_name, event_name"

    invoke-virtual {v0, v2, v6, v5}, Lob/z5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v8

    :cond_0
    iget-object v5, v2, Lob/zd;->b:Lob/ve;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/c7;->M()Lcom/google/android/gms/internal/measurement/z6;

    move-result-object v7

    invoke-virtual {v5}, Lob/ve;->F0()Lob/w;

    move-result-object v9

    invoke-virtual {v9}, Lob/w;->r0()V

    :try_start_0
    invoke-virtual {v5}, Lob/ve;->F0()Lob/w;

    move-result-object v9

    invoke-virtual {v9, v6}, Lob/w;->J0(Ljava/lang/String;)Lob/h6;

    move-result-object v9

    const/4 v10, 0x0

    if-nez v9, :cond_1

    iget-object v0, v2, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->v()Lob/z5;

    move-result-object v0

    const-string v3, "Log and bundle not available. package_name"

    invoke-virtual {v0, v3, v6}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v0, v10, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-virtual {v5}, Lob/ve;->F0()Lob/w;

    move-result-object v2

    invoke-virtual {v2}, Lob/w;->t0()V

    return-object v0

    :catchall_0
    move-exception v0

    move-object v1, v2

    goto/16 :goto_d

    :cond_1
    :try_start_1
    invoke-virtual {v9}, Lob/h6;->d()Z

    move-result v11

    if-nez v11, :cond_2

    iget-object v0, v2, Lob/o8;->a:Lob/l7;

    invoke-virtual {v0}, Lob/l7;->a()Lob/b6;

    move-result-object v0

    invoke-virtual {v0}, Lob/b6;->v()Lob/z5;

    move-result-object v0

    const-string v3, "Log and bundle disabled. package_name"

    invoke-virtual {v0, v3, v6}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v0, v10, [B

    goto :goto_0

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/e7;->m0()Lcom/google/android/gms/internal/measurement/d7;

    move-result-object v11

    const/4 v12, 0x1

    invoke-virtual {v11, v12}, Lcom/google/android/gms/internal/measurement/d7;->i0(I)Lcom/google/android/gms/internal/measurement/d7;

    const-string v13, "android"

    invoke-virtual {v11, v13}, Lcom/google/android/gms/internal/measurement/d7;->C(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d7;

    invoke-virtual {v9}, Lob/h6;->o0()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_3

    invoke-virtual {v9}, Lob/h6;->o0()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v11, v13}, Lcom/google/android/gms/internal/measurement/d7;->R(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d7;

    :cond_3
    invoke-virtual {v9}, Lob/h6;->H0()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_4

    invoke-virtual {v9}, Lob/h6;->H0()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-virtual {v11, v13}, Lcom/google/android/gms/internal/measurement/d7;->O(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d7;

    :cond_4
    invoke-virtual {v9}, Lob/h6;->D0()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_5

    invoke-virtual {v9}, Lob/h6;->D0()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-virtual {v11, v13}, Lcom/google/android/gms/internal/measurement/d7;->S(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d7;

    :cond_5
    invoke-virtual {v9}, Lob/h6;->F0()J

    move-result-wide v13

    const-wide/32 v15, -0x80000000

    cmp-long v13, v13, v15

    if-eqz v13, :cond_6

    invoke-virtual {v9}, Lob/h6;->F0()J

    move-result-wide v13

    long-to-int v13, v13

    invoke-virtual {v11, v13}, Lcom/google/android/gms/internal/measurement/d7;->J0(I)Lcom/google/android/gms/internal/measurement/d7;

    :cond_6
    invoke-virtual {v9}, Lob/h6;->J0()J

    move-result-wide v13

    invoke-virtual {v11, v13, v14}, Lcom/google/android/gms/internal/measurement/d7;->U(J)Lcom/google/android/gms/internal/measurement/d7;

    invoke-virtual {v9}, Lob/h6;->b()J

    move-result-wide v13

    invoke-virtual {v11, v13, v14}, Lcom/google/android/gms/internal/measurement/d7;->R0(J)Lcom/google/android/gms/internal/measurement/d7;

    invoke-virtual {v9}, Lob/h6;->r0()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v14

    if-nez v14, :cond_7

    invoke-virtual {v11, v13}, Lcom/google/android/gms/internal/measurement/d7;->D0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d7;

    :cond_7
    invoke-virtual {v9}, Lob/h6;->X()J

    move-result-wide v13

    invoke-virtual {v11, v13, v14}, Lcom/google/android/gms/internal/measurement/d7;->Y0(J)Lcom/google/android/gms/internal/measurement/d7;

    iget-object v13, v2, Lob/zd;->b:Lob/ve;

    invoke-virtual {v13, v6}, Lob/ve;->g(Ljava/lang/String;)Lob/v8;

    move-result-object v13

    invoke-virtual {v9}, Lob/h6;->L0()J

    move-result-wide v14

    invoke-virtual {v11, v14, v15}, Lcom/google/android/gms/internal/measurement/d7;->g0(J)Lcom/google/android/gms/internal/measurement/d7;

    invoke-virtual {v3}, Lob/l7;->g()Z

    move-result v3

    if-eqz v3, :cond_8

    iget-object v3, v2, Lob/o8;->a:Lob/l7;

    invoke-virtual {v3}, Lob/l7;->w()Lob/m;

    move-result-object v3

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/d7;->P()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v3, v14}, Lob/m;->k(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_8

    sget-object v3, Lob/u8;->b:Lob/u8;

    invoke-virtual {v13, v3}, Lob/v8;->o(Lob/u8;)Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_8

    invoke-virtual {v11, v8}, Lcom/google/android/gms/internal/measurement/d7;->M0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d7;

    :cond_8
    invoke-virtual {v13}, Lob/v8;->k()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11, v3}, Lcom/google/android/gms/internal/measurement/d7;->T0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d7;

    sget-object v3, Lob/u8;->b:Lob/u8;

    invoke-virtual {v13, v3}, Lob/v8;->o(Lob/u8;)Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-virtual {v9}, Lob/h6;->P()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-virtual {v5}, Lob/ve;->L0()Lob/ad;

    move-result-object v3

    invoke-virtual {v9}, Lob/h6;->o0()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5, v13}, Lob/ad;->m(Ljava/lang/String;Lob/v8;)Landroid/util/Pair;

    move-result-object v3

    invoke-virtual {v9}, Lob/h6;->P()Z

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

    iget-wide v14, v4, Lob/i0;->i:J

    invoke-static {v14, v15}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v14

    invoke-static {v5, v14}, Lob/bb;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v11, v5}, Lcom/google/android/gms/internal/measurement/d7;->X(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d7;
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    if-eqz v3, :cond_9

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v11, v3}, Lcom/google/android/gms/internal/measurement/d7;->a0(Z)Lcom/google/android/gms/internal/measurement/d7;

    goto :goto_2

    :catch_0
    move-exception v0

    iget-object v3, v2, Lob/o8;->a:Lob/l7;

    invoke-virtual {v3}, Lob/l7;->a()Lob/b6;

    move-result-object v3

    invoke-virtual {v3}, Lob/b6;->v()Lob/z5;

    move-result-object v3

    const-string v4, "Resettable device id encryption failed"

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-array v8, v10, [B
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    iget-object v0, v2, Lob/zd;->b:Lob/ve;

    :goto_1
    invoke-virtual {v0}, Lob/ve;->F0()Lob/w;

    move-result-object v0

    invoke-virtual {v0}, Lob/w;->t0()V

    goto/16 :goto_c

    :cond_9
    :goto_2
    :try_start_4
    iget-object v3, v2, Lob/o8;->a:Lob/l7;

    invoke-virtual {v3}, Lob/l7;->K()Lob/c0;

    move-result-object v5

    invoke-virtual {v5}, Lob/p8;->l()V

    sget-object v5, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v11, v5}, Lcom/google/android/gms/internal/measurement/d7;->G(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d7;

    invoke-virtual {v3}, Lob/l7;->K()Lob/c0;

    move-result-object v5

    invoke-virtual {v5}, Lob/p8;->l()V

    sget-object v5, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v11, v5}, Lcom/google/android/gms/internal/measurement/d7;->F(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d7;

    invoke-virtual {v3}, Lob/l7;->K()Lob/c0;

    move-result-object v5

    invoke-virtual {v5}, Lob/c0;->o()J

    move-result-wide v14

    long-to-int v5, v14

    invoke-virtual {v11, v5}, Lcom/google/android/gms/internal/measurement/d7;->M(I)Lcom/google/android/gms/internal/measurement/d7;

    invoke-virtual {v3}, Lob/l7;->K()Lob/c0;

    move-result-object v3

    invoke-virtual {v3}, Lob/c0;->p()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11, v3}, Lcom/google/android/gms/internal/measurement/d7;->J(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d7;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    sget-object v3, Lob/u8;->c:Lob/u8;

    invoke-virtual {v13, v3}, Lob/v8;->o(Lob/u8;)Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-virtual {v9}, Lob/h6;->p0()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_a

    invoke-virtual {v9}, Lob/h6;->p0()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-wide v13, v4, Lob/i0;->i:J

    invoke-static {v13, v14}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lob/bb;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11, v3}, Lcom/google/android/gms/internal/measurement/d7;->e0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d7;
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
    invoke-virtual {v9}, Lob/h6;->x0()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_b

    invoke-virtual {v9}, Lob/h6;->x0()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lo9/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v11, v3}, Lcom/google/android/gms/internal/measurement/d7;->H0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d7;

    :cond_b
    invoke-virtual {v9}, Lob/h6;->o0()Ljava/lang/String;

    move-result-object v14

    iget-object v3, v2, Lob/zd;->b:Lob/ve;

    invoke-virtual {v3}, Lob/ve;->F0()Lob/w;

    move-result-object v5

    invoke-virtual {v5, v14}, Lob/w;->C0(Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_4
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_d

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lob/df;

    const-string v8, "_lte"

    iget-object v10, v15, Lob/df;->c:Ljava/lang/String;

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

    iget-object v8, v15, Lob/df;->e:Ljava/lang/Object;

    if-nez v8, :cond_f

    :cond_e
    new-instance v13, Lob/df;

    const-string v15, "auto"

    const-string v16, "_lte"

    iget-object v8, v2, Lob/o8;->a:Lob/l7;

    invoke-virtual {v8}, Lob/l7;->e()Lv9/e;

    move-result-object v8

    invoke-interface {v8}, Lv9/e;->a()J

    move-result-wide v17

    invoke-static/range {v22 .. v23}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v19

    invoke-direct/range {v13 .. v19}, Lob/df;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    invoke-interface {v5, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Lob/ve;->F0()Lob/w;

    move-result-object v8

    invoke-virtual {v8, v13}, Lob/w;->A0(Lob/df;)Z

    :cond_f
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    new-array v8, v8, [Lcom/google/android/gms/internal/measurement/v7;

    const/4 v10, 0x0

    :goto_6
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v13

    if-ge v10, v13, :cond_10

    invoke-static {}, Lcom/google/android/gms/internal/measurement/v7;->R()Lcom/google/android/gms/internal/measurement/u7;

    move-result-object v13

    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lob/df;

    iget-object v14, v14, Lob/df;->c:Ljava/lang/String;

    invoke-virtual {v13, v14}, Lcom/google/android/gms/internal/measurement/u7;->B(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/u7;

    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lob/df;

    iget-wide v14, v14, Lob/df;->d:J

    invoke-virtual {v13, v14, v15}, Lcom/google/android/gms/internal/measurement/u7;->z(J)Lcom/google/android/gms/internal/measurement/u7;

    invoke-virtual {v3}, Lob/ve;->K0()Lob/af;

    move-result-object v14

    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lob/df;

    iget-object v15, v15, Lob/df;->e:Ljava/lang/Object;

    invoke-virtual {v14, v13, v15}, Lob/af;->G(Lcom/google/android/gms/internal/measurement/u7;Ljava/lang/Object;)V

    invoke-virtual {v13}, Lcom/google/android/gms/internal/measurement/gb;->v()Lcom/google/android/gms/internal/measurement/kb;

    move-result-object v13

    check-cast v13, Lcom/google/android/gms/internal/measurement/v7;

    aput-object v13, v8, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_6

    :cond_10
    invoke-static {v8}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-virtual {v11, v5}, Lcom/google/android/gms/internal/measurement/d7;->p1(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/d7;

    iget-object v5, v2, Lob/zd;->b:Lob/ve;

    invoke-virtual {v5, v9, v11}, Lob/ve;->n(Lob/h6;Lcom/google/android/gms/internal/measurement/d7;)V

    invoke-virtual {v5, v9, v11}, Lob/ve;->o(Lob/h6;Lcom/google/android/gms/internal/measurement/d7;)V

    invoke-static {v4}, Lob/c6;->a(Lob/i0;)Lob/c6;

    move-result-object v8

    iget-object v10, v2, Lob/o8;->a:Lob/l7;

    invoke-virtual {v10}, Lob/l7;->C()Lob/ff;

    move-result-object v13

    iget-object v14, v8, Lob/c6;->d:Landroid/os/Bundle;

    invoke-virtual {v3}, Lob/ve;->F0()Lob/w;

    move-result-object v15

    invoke-virtual {v15, v6}, Lob/w;->G(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v15

    invoke-virtual {v13, v14, v15}, Lob/ff;->w(Landroid/os/Bundle;Landroid/os/Bundle;)V

    invoke-virtual {v10}, Lob/l7;->C()Lob/ff;

    move-result-object v13

    invoke-virtual {v10}, Lob/l7;->w()Lob/m;

    move-result-object v15

    invoke-virtual {v15, v6}, Lob/m;->w(Ljava/lang/String;)I

    move-result v15

    invoke-virtual {v13, v8, v15}, Lob/ff;->u(Lob/c6;I)V

    const-string v8, "_c"

    const-wide/16 v12, 0x1

    invoke-virtual {v14, v8, v12, v13}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {v10}, Lob/l7;->a()Lob/b6;

    move-result-object v8

    invoke-virtual {v8}, Lob/b6;->v()Lob/z5;

    move-result-object v8

    const-string v15, "Marking in-app purchase as real-time"

    invoke-virtual {v8, v15}, Lob/z5;->a(Ljava/lang/String;)V

    invoke-virtual {v14, v0, v12, v13}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    const-string v8, "_o"

    iget-object v15, v4, Lob/i0;->h:Ljava/lang/String;

    invoke-virtual {v14, v8, v15}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v10}, Lob/l7;->C()Lob/ff;

    move-result-object v8

    move-wide/from16 v17, v12

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/d7;->P()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9}, Lob/h6;->l0()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v8, v12, v13}, Lob/ff;->P(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_11

    invoke-virtual {v10}, Lob/l7;->C()Lob/ff;

    move-result-object v8

    const-string v12, "_dbg"

    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    invoke-virtual {v8, v14, v12, v13}, Lob/ff;->A(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v10}, Lob/l7;->C()Lob/ff;

    move-result-object v8

    invoke-virtual {v8, v14, v0, v13}, Lob/ff;->A(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_11
    invoke-virtual {v3}, Lob/ve;->F0()Lob/w;

    move-result-object v0

    move-object v8, v7

    iget-object v7, v4, Lob/i0;->f:Ljava/lang/String;

    invoke-virtual {v0, v6, v7}, Lob/w;->v0(Ljava/lang/String;Ljava/lang/String;)Lob/e0;

    move-result-object v0

    if-nez v0, :cond_12

    move-object v12, v5

    new-instance v5, Lob/e0;

    move-object v0, v14

    move-object v13, v15

    iget-wide v14, v4, Lob/i0;->i:J

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

    invoke-direct/range {v5 .. v21}, Lob/e0;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

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

    iget-wide v8, v0, Lob/e0;->f:J

    iget-wide v10, v4, Lob/i0;->i:J

    invoke-virtual {v0, v10, v11}, Lob/e0;->a(J)Lob/e0;

    move-result-object v5

    move-wide v12, v8

    goto :goto_7

    :goto_8
    invoke-virtual {v3}, Lob/ve;->F0()Lob/w;

    move-result-object v5

    invoke-virtual {v5, v0}, Lob/w;->w0(Lob/e0;)V

    new-instance v5, Lob/d0;

    move-object v8, v6

    iget-object v6, v2, Lob/o8;->a:Lob/l7;

    iget-wide v10, v4, Lob/i0;->i:J
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
    invoke-direct/range {v5 .. v14}, Lob/d0;-><init>(Lob/l7;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V

    move-object v6, v8

    move-object v7, v9

    invoke-static {}, Lcom/google/android/gms/internal/measurement/s6;->P()Lcom/google/android/gms/internal/measurement/r6;

    move-result-object v8

    iget-wide v9, v5, Lob/d0;->d:J

    invoke-virtual {v8, v9, v10}, Lcom/google/android/gms/internal/measurement/r6;->V(J)Lcom/google/android/gms/internal/measurement/r6;

    iget-object v9, v5, Lob/d0;->b:Ljava/lang/String;

    invoke-virtual {v8, v9}, Lcom/google/android/gms/internal/measurement/r6;->R(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/r6;

    iget-wide v9, v5, Lob/d0;->e:J

    invoke-virtual {v8, v9, v10}, Lcom/google/android/gms/internal/measurement/r6;->X(J)Lcom/google/android/gms/internal/measurement/r6;

    iget-object v5, v5, Lob/d0;->f:Lob/g0;

    new-instance v9, Lob/f0;

    invoke-direct {v9, v5}, Lob/f0;-><init>(Lob/g0;)V

    :cond_13
    :goto_9
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_14

    invoke-virtual {v9}, Lob/f0;->b()Ljava/lang/String;

    move-result-object v10

    invoke-static {}, Lcom/google/android/gms/internal/measurement/w6;->S()Lcom/google/android/gms/internal/measurement/v6;

    move-result-object v11

    invoke-virtual {v11, v10}, Lcom/google/android/gms/internal/measurement/v6;->B(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/v6;

    invoke-virtual {v5, v10}, Lob/g0;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    if-eqz v10, :cond_13

    invoke-virtual/range {v16 .. v16}, Lob/ve;->K0()Lob/af;

    move-result-object v12

    invoke-virtual {v12, v11, v10}, Lob/af;->H(Lcom/google/android/gms/internal/measurement/v6;Ljava/lang/Object;)V

    invoke-virtual {v8, v11}, Lcom/google/android/gms/internal/measurement/r6;->H(Lcom/google/android/gms/internal/measurement/v6;)Lcom/google/android/gms/internal/measurement/r6;

    goto :goto_9

    :catchall_1
    move-exception v0

    move-object/from16 v1, v17

    goto/16 :goto_d

    :cond_14
    invoke-virtual {v1, v8}, Lcom/google/android/gms/internal/measurement/d7;->f1(Lcom/google/android/gms/internal/measurement/r6;)Lcom/google/android/gms/internal/measurement/d7;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/h7;->F()Lcom/google/android/gms/internal/measurement/f7;

    move-result-object v5

    invoke-static {}, Lcom/google/android/gms/internal/measurement/u6;->F()Lcom/google/android/gms/internal/measurement/t6;

    move-result-object v9

    iget-wide v10, v0, Lob/e0;->c:J

    invoke-virtual {v9, v10, v11}, Lcom/google/android/gms/internal/measurement/t6;->B(J)Lcom/google/android/gms/internal/measurement/t6;

    invoke-virtual {v9, v7}, Lcom/google/android/gms/internal/measurement/t6;->z(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/t6;

    invoke-virtual {v5, v9}, Lcom/google/android/gms/internal/measurement/f7;->z(Lcom/google/android/gms/internal/measurement/t6;)Lcom/google/android/gms/internal/measurement/f7;

    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/measurement/d7;->P0(Lcom/google/android/gms/internal/measurement/f7;)Lcom/google/android/gms/internal/measurement/d7;

    invoke-virtual/range {v16 .. v16}, Lob/ve;->I0()Lob/e;

    move-result-object v31

    invoke-virtual {v4}, Lob/h6;->o0()Ljava/lang/String;

    move-result-object v32

    sget-object v33, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d7;->j1()Ljava/util/List;

    move-result-object v34

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/r6;->U()J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v35

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/r6;->U()J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v36

    const/16 v37, 0x0

    invoke-virtual/range {v31 .. v37}, Lob/e;->m(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Z)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/measurement/d7;->F0(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/d7;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/r6;->S()Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/r6;->U()J

    move-result-wide v9

    invoke-virtual {v1, v9, v10}, Lcom/google/android/gms/internal/measurement/d7;->u1(J)Lcom/google/android/gms/internal/measurement/d7;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/r6;->U()J

    move-result-wide v7

    invoke-virtual {v1, v7, v8}, Lcom/google/android/gms/internal/measurement/d7;->w1(J)Lcom/google/android/gms/internal/measurement/d7;

    :cond_15
    invoke-virtual {v4}, Lob/h6;->B0()J

    move-result-wide v7

    cmp-long v0, v7, v22

    if-eqz v0, :cond_16

    invoke-virtual {v1, v7, v8}, Lcom/google/android/gms/internal/measurement/d7;->z(J)Lcom/google/android/gms/internal/measurement/d7;

    :cond_16
    invoke-virtual {v4}, Lob/h6;->z0()J

    move-result-wide v9

    cmp-long v5, v9, v22

    if-eqz v5, :cond_17

    invoke-virtual {v1, v9, v10}, Lcom/google/android/gms/internal/measurement/d7;->x1(J)Lcom/google/android/gms/internal/measurement/d7;

    goto :goto_a

    :cond_17
    if-eqz v0, :cond_18

    invoke-virtual {v1, v7, v8}, Lcom/google/android/gms/internal/measurement/d7;->x1(J)Lcom/google/android/gms/internal/measurement/d7;

    :cond_18
    :goto_a
    invoke-virtual {v4}, Lob/h6;->t0()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/mg;->a()Z

    invoke-virtual/range {v26 .. v26}, Lob/l7;->w()Lob/m;

    move-result-object v5

    sget-object v7, Lob/e5;->N0:Lob/d5;

    invoke-virtual {v5, v6, v7}, Lob/m;->H(Ljava/lang/String;Lob/d5;)Z

    move-result v5

    if-eqz v5, :cond_19

    if-eqz v0, :cond_19

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/measurement/d7;->U0(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/d7;

    :cond_19
    invoke-virtual {v4}, Lob/h6;->l()V

    invoke-virtual {v4}, Lob/h6;->g()J

    move-result-wide v7

    long-to-int v0, v7

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/measurement/d7;->h0(I)Lcom/google/android/gms/internal/measurement/d7;

    invoke-virtual/range {v26 .. v26}, Lob/l7;->w()Lob/m;

    move-result-object v0

    invoke-virtual {v0}, Lob/m;->A()J

    const-wide/32 v7, 0x2078d

    invoke-virtual {v1, v7, v8}, Lcom/google/android/gms/internal/measurement/d7;->V(J)Lcom/google/android/gms/internal/measurement/d7;

    invoke-virtual/range {v26 .. v26}, Lob/l7;->e()Lv9/e;

    move-result-object v0

    invoke-interface {v0}, Lv9/e;->a()J

    move-result-wide v7

    invoke-virtual {v1, v7, v8}, Lcom/google/android/gms/internal/measurement/d7;->r1(J)Lcom/google/android/gms/internal/measurement/d7;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/measurement/d7;->E0(Z)Lcom/google/android/gms/internal/measurement/d7;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d7;->P()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0, v1}, Lob/ve;->x(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/d7;)V

    invoke-virtual {v15, v1}, Lcom/google/android/gms/internal/measurement/z6;->F(Lcom/google/android/gms/internal/measurement/d7;)Lcom/google/android/gms/internal/measurement/z6;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d7;->t1()J

    move-result-wide v2

    invoke-virtual {v4, v2, v3}, Lob/h6;->A0(J)V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/d7;->v1()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lob/h6;->C0(J)V

    invoke-virtual/range {v16 .. v16}, Lob/ve;->F0()Lob/w;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v4, v1, v1}, Lob/w;->K0(Lob/h6;ZZ)V

    invoke-virtual/range {v16 .. v16}, Lob/ve;->F0()Lob/w;

    move-result-object v0

    invoke-virtual {v0}, Lob/w;->s0()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    invoke-virtual/range {v16 .. v16}, Lob/ve;->F0()Lob/w;

    move-result-object v0

    invoke-virtual {v0}, Lob/w;->t0()V

    :try_start_8
    invoke-virtual/range {v16 .. v16}, Lob/ve;->K0()Lob/af;

    move-result-object v0

    invoke-virtual {v15}, Lcom/google/android/gms/internal/measurement/gb;->v()Lcom/google/android/gms/internal/measurement/kb;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/c7;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/v9;->d()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lob/af;->V([B)[B

    move-result-object v0
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2

    return-object v0

    :catch_2
    move-exception v0

    move-object/from16 v1, v17

    iget-object v1, v1, Lob/o8;->a:Lob/l7;

    invoke-virtual {v1}, Lob/l7;->a()Lob/b6;

    move-result-object v1

    invoke-virtual {v1}, Lob/b6;->o()Lob/z5;

    move-result-object v1

    invoke-static {v6}, Lob/b6;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "Data loss. Failed to bundle and serialize. appId"

    invoke-virtual {v1, v3, v2, v0}, Lob/z5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v8, v30

    goto :goto_c

    :goto_b
    :try_start_9
    iget-object v2, v1, Lob/o8;->a:Lob/l7;

    invoke-virtual {v2}, Lob/l7;->a()Lob/b6;

    move-result-object v2

    invoke-virtual {v2}, Lob/b6;->v()Lob/z5;

    move-result-object v2

    const-string v3, "app instance id encryption failed"

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lob/z5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v2, 0x0

    new-array v8, v2, [B
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    iget-object v0, v1, Lob/zd;->b:Lob/ve;

    goto/16 :goto_1

    :goto_c
    return-object v8

    :catchall_2
    move-exception v0

    :goto_d
    iget-object v1, v1, Lob/zd;->b:Lob/ve;

    invoke-virtual {v1}, Lob/ve;->F0()Lob/w;

    move-result-object v1

    invoke-virtual {v1}, Lob/w;->t0()V

    throw v0
.end method
