.class public final Lnb/e;
.super Lnb/xd;
.source "SourceFile"


# instance fields
.field public d:Ljava/lang/String;

.field public e:Ljava/util/Set;

.field public f:Ljava/util/Map;

.field public g:Ljava/lang/Long;

.field public h:Ljava/lang/Long;


# direct methods
.method public constructor <init>(Lnb/me;)V
    .locals 0

    invoke-direct {p0, p1}, Lnb/xd;-><init>(Lnb/me;)V

    return-void
.end method


# virtual methods
.method public final l()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final m(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Z)Ljava/util/List;
    .locals 34

    move-object/from16 v1, p0

    const-string v9, "current_results"

    invoke-static/range {p1 .. p1}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static/range {p2 .. p2}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p3 .. p3}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, p1

    iput-object v0, v1, Lnb/e;->d:Ljava/lang/String;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, v1, Lnb/e;->e:Ljava/util/Set;

    new-instance v0, Lw1/a;

    invoke-direct {v0}, Lw1/a;-><init>()V

    iput-object v0, v1, Lnb/e;->f:Ljava/util/Map;

    move-object/from16 v0, p4

    iput-object v0, v1, Lnb/e;->g:Ljava/lang/Long;

    move-object/from16 v0, p5

    iput-object v0, v1, Lnb/e;->h:Ljava/lang/Long;

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/o6;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/o6;->J()Ljava/lang/String;

    move-result-object v2

    const-string v3, "_s"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v11

    goto :goto_0

    :cond_1
    move v2, v10

    :goto_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/ye;->a()Z

    iget-object v0, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    move-result-object v3

    iget-object v4, v1, Lnb/e;->d:Ljava/lang/String;

    sget-object v5, Lnb/z4;->G0:Lnb/y4;

    invoke-virtual {v3, v4, v5}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v12

    invoke-static {}, Lcom/google/android/gms/internal/measurement/ye;->a()Z

    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    move-result-object v0

    iget-object v3, v1, Lnb/e;->d:Ljava/lang/String;

    sget-object v4, Lnb/z4;->F0:Lnb/y4;

    invoke-virtual {v0, v3, v4}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v13

    if-eqz v2, :cond_2

    iget-object v0, v1, Lnb/td;->b:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->F0()Lnb/t;

    move-result-object v3

    iget-object v4, v1, Lnb/e;->d:Ljava/lang/String;

    invoke-virtual {v3}, Lnb/xd;->j()V

    invoke-virtual {v3}, Lnb/j8;->h()V

    invoke-static {v4}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    const-string v5, "current_session_count"

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v0, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    :try_start_0
    invoke-virtual {v3}, Lnb/t;->u0()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v5

    const-string v6, "events"

    const-string v7, "app_id = ?"

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v6, v0, v7, v8}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    iget-object v3, v3, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v3}, Lnb/g7;->a()Lnb/w5;

    move-result-object v3

    invoke-virtual {v3}, Lnb/w5;->o()Lnb/u5;

    move-result-object v3

    invoke-static {v4}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "Error resetting session-scoped event counts. appId"

    invoke-virtual {v3, v5, v4, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    :goto_1
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    const-string v14, "Failed to merge filter. appId"

    const-string v15, "Database error querying filters. appId"

    const-string v3, "data"

    const-string v4, "audience_id"

    if-eqz v13, :cond_7

    if-eqz v12, :cond_7

    iget-object v6, v1, Lnb/td;->b:Lnb/me;

    invoke-virtual {v6}, Lnb/me;->F0()Lnb/t;

    move-result-object v6

    iget-object v7, v1, Lnb/e;->d:Ljava/lang/String;

    invoke-static {v7}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    new-instance v8, Lw1/a;

    invoke-direct {v8}, Lw1/a;-><init>()V

    invoke-virtual {v6}, Lnb/t;->u0()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v16

    :try_start_1
    const-string v17, "event_filters"

    filled-new-array {v4, v3}, [Ljava/lang/String;

    move-result-object v18

    const-string v19, "app_id=?"

    filled-new-array {v7}, [Ljava/lang/String;

    move-result-object v20

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v21, 0x0

    invoke-virtual/range {v16 .. v23}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v5
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-interface {v5}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v16

    if-eqz v16, :cond_6

    :goto_2
    invoke-interface {v5, v11}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v0
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-static {}, Lcom/google/android/gms/internal/measurement/z3;->T()Lcom/google/android/gms/internal/measurement/y3;

    move-result-object v11

    invoke-static {v11, v0}, Lnb/re;->W(Lcom/google/android/gms/internal/measurement/nc;[B)Lcom/google/android/gms/internal/measurement/nc;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/y3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/z3;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/z3;->N()Z

    move-result v11

    if-nez v11, :cond_3

    goto :goto_4

    :cond_3
    invoke-interface {v5, v10}, Landroid/database/Cursor;->getInt(I)I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v8, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/util/List;

    if-nez v16, :cond_4

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v8, v11, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_9

    :catch_1
    move-exception v0

    goto :goto_8

    :cond_4
    move-object/from16 v10, v16

    :goto_3
    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :catch_2
    move-exception v0

    iget-object v10, v6, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v10}, Lnb/g7;->a()Lnb/w5;

    move-result-object v10

    invoke-virtual {v10}, Lnb/w5;->o()Lnb/u5;

    move-result-object v10

    invoke-static {v7}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v10, v14, v11, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_4
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez v0, :cond_5

    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    move-object v10, v8

    goto :goto_a

    :cond_5
    const/4 v10, 0x0

    const/4 v11, 0x1

    goto :goto_2

    :cond_6
    :goto_5
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    :cond_7
    move-object v10, v0

    goto :goto_a

    :catchall_1
    move-exception v0

    goto :goto_6

    :catch_3
    move-exception v0

    goto :goto_7

    :goto_6
    const/4 v5, 0x0

    goto :goto_9

    :goto_7
    const/4 v5, 0x0

    :goto_8
    :try_start_5
    iget-object v6, v6, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v6}, Lnb/g7;->a()Lnb/w5;

    move-result-object v6

    invoke-virtual {v6}, Lnb/w5;->o()Lnb/u5;

    move-result-object v6

    invoke-static {v7}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v6, v15, v7, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-eqz v5, :cond_7

    goto :goto_5

    :goto_9
    if-eqz v5, :cond_8

    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    :cond_8
    throw v0

    :goto_a
    iget-object v0, v1, Lnb/td;->b:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->F0()Lnb/t;

    move-result-object v5

    iget-object v6, v1, Lnb/e;->d:Ljava/lang/String;

    invoke-virtual {v5}, Lnb/xd;->j()V

    invoke-virtual {v5}, Lnb/j8;->h()V

    invoke-static {v6}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v5}, Lnb/t;->u0()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v16

    :try_start_6
    const-string v17, "audience_filter_values"

    filled-new-array {v4, v9}, [Ljava/lang/String;

    move-result-object v18

    const-string v19, "app_id=?"

    filled-new-array {v6}, [Ljava/lang/String;

    move-result-object v20

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v21, 0x0

    invoke-virtual/range {v16 .. v23}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7
    :try_end_6
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_9
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :try_start_7
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-nez v0, :cond_9

    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_7
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    move-object v11, v0

    move/from16 v17, v2

    move-object/from16 v18, v3

    move-object/from16 v19, v4

    goto/16 :goto_13

    :catchall_2
    move-exception v0

    goto/16 :goto_f

    :catch_4
    move-exception v0

    move/from16 v17, v2

    :goto_b
    move-object/from16 v18, v3

    :goto_c
    move-object/from16 v19, v4

    goto/16 :goto_12

    :cond_9
    :try_start_8
    new-instance v8, Lw1/a;

    invoke-direct {v8}, Lw1/a;-><init>()V

    :goto_d
    const/4 v11, 0x0

    invoke-interface {v7, v11}, Landroid/database/Cursor;->getInt(I)I

    move-result v16

    const/4 v11, 0x1

    invoke-interface {v7, v11}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v0
    :try_end_8
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_8 .. :try_end_8} :catch_4
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :try_start_9
    invoke-static {}, Lcom/google/android/gms/internal/measurement/f7;->P()Lcom/google/android/gms/internal/measurement/e7;

    move-result-object v11

    invoke-static {v11, v0}, Lnb/re;->W(Lcom/google/android/gms/internal/measurement/nc;[B)Lcom/google/android/gms/internal/measurement/nc;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/e7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/f7;
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_9 .. :try_end_9} :catch_4
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :try_start_a
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v8, v11, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move/from16 v17, v2

    move-object/from16 v18, v3

    move-object/from16 v19, v4

    goto :goto_e

    :catch_5
    move-exception v0

    iget-object v11, v5, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v11}, Lnb/g7;->a()Lnb/w5;

    move-result-object v11

    invoke-virtual {v11}, Lnb/w5;->o()Lnb/u5;

    move-result-object v11
    :try_end_a
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_a .. :try_end_a} :catch_4
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    move/from16 v17, v2

    :try_start_b
    const-string v2, "Failed to merge filter results. appId, audienceId, error"
    :try_end_b
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_b .. :try_end_b} :catch_8
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    move-object/from16 v18, v3

    :try_start_c
    invoke-static {v6}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3
    :try_end_c
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_c .. :try_end_c} :catch_7
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    move-object/from16 v19, v4

    :try_start_d
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v11, v2, v3, v4, v0}, Lnb/u5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_e
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0
    :try_end_d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_d .. :try_end_d} :catch_6
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    if-nez v0, :cond_a

    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    move-object v11, v8

    goto :goto_13

    :cond_a
    move/from16 v2, v17

    move-object/from16 v3, v18

    move-object/from16 v4, v19

    goto :goto_d

    :catch_6
    move-exception v0

    goto :goto_12

    :catch_7
    move-exception v0

    goto :goto_c

    :catch_8
    move-exception v0

    goto :goto_b

    :goto_f
    move-object v5, v7

    goto/16 :goto_58

    :catchall_3
    move-exception v0

    goto :goto_10

    :catch_9
    move-exception v0

    move/from16 v17, v2

    move-object/from16 v18, v3

    move-object/from16 v19, v4

    goto :goto_11

    :goto_10
    const/4 v5, 0x0

    goto/16 :goto_58

    :goto_11
    const/4 v7, 0x0

    :goto_12
    :try_start_e
    iget-object v2, v5, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->o()Lnb/u5;

    move-result-object v2

    const-string v3, "Database error querying filter results. appId"

    invoke-static {v6}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v4, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    if-eqz v7, :cond_b

    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    :cond_b
    move-object v11, v0

    :goto_13
    invoke-interface {v11}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_d

    :cond_c
    move-object/from16 v10, v18

    move-object/from16 v11, v19

    goto/16 :goto_2d

    :cond_d
    new-instance v2, Ljava/util/HashSet;

    invoke-interface {v11}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    if-eqz v17, :cond_1c

    iget-object v3, v1, Lnb/e;->d:Ljava/lang/String;

    iget-object v0, v1, Lnb/td;->b:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->F0()Lnb/t;

    move-result-object v4

    iget-object v5, v1, Lnb/e;->d:Ljava/lang/String;

    invoke-virtual {v4}, Lnb/xd;->j()V

    invoke-virtual {v4}, Lnb/j8;->h()V

    invoke-static {v5}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    new-instance v0, Lw1/a;

    invoke-direct {v0}, Lw1/a;-><init>()V

    invoke-virtual {v4}, Lnb/t;->u0()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v6

    :try_start_f
    const-string v7, "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"

    filled-new-array {v5, v5}, [Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6
    :try_end_f
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_f .. :try_end_f} :catch_b
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    :try_start_10
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v7

    if-eqz v7, :cond_10

    :cond_e
    const/4 v7, 0x0

    invoke-interface {v6, v7}, Landroid/database/Cursor;->getInt(I)I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    if-nez v8, :cond_f

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_f
    const/4 v7, 0x1

    goto :goto_14

    :catchall_4
    move-exception v0

    goto :goto_16

    :catch_a
    move-exception v0

    goto :goto_19

    :goto_14
    invoke-interface {v6, v7}, Landroid/database/Cursor;->getInt(I)I

    move-result v16

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v8, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v7
    :try_end_10
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_10 .. :try_end_10} :catch_a
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    if-nez v7, :cond_e

    :goto_15
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    goto :goto_1a

    :cond_10
    :try_start_11
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_11
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_11 .. :try_end_11} :catch_a
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    goto :goto_15

    :goto_16
    move-object v5, v6

    goto/16 :goto_21

    :catchall_5
    move-exception v0

    goto :goto_17

    :catch_b
    move-exception v0

    goto :goto_18

    :goto_17
    const/4 v5, 0x0

    goto/16 :goto_21

    :goto_18
    const/4 v6, 0x0

    :goto_19
    :try_start_12
    iget-object v4, v4, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v4}, Lnb/g7;->a()Lnb/w5;

    move-result-object v4

    invoke-virtual {v4}, Lnb/w5;->o()Lnb/u5;

    move-result-object v4

    const-string v7, "Database error querying scoped filters. appId"

    invoke-static {v5}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v7, v5, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_4

    if-eqz v6, :cond_11

    goto :goto_15

    :cond_11
    :goto_1a
    invoke-static {v3}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {v11}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Lw1/a;

    invoke-direct {v3}, Lw1/a;-><init>()V

    invoke-interface {v11}, Ljava/util/Map;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_13

    :cond_12
    move-object/from16 v17, v2

    goto/16 :goto_20

    :cond_13
    invoke-interface {v11}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_12

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    invoke-interface {v11, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/measurement/f7;

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    if-eqz v7, :cond_14

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_15

    :cond_14
    move-object/from16 v16, v0

    move-object/from16 v17, v2

    move-object/from16 v21, v4

    goto/16 :goto_1f

    :cond_15
    iget-object v8, v1, Lnb/td;->b:Lnb/me;

    move-object/from16 v16, v0

    invoke-virtual {v8}, Lnb/me;->K0()Lnb/re;

    move-result-object v0

    move-object/from16 v17, v2

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/f7;->H()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v2, v7}, Lnb/re;->R(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1a

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/gb;->q()Lcom/google/android/gms/internal/measurement/cb;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/e7;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/e7;->C()Lcom/google/android/gms/internal/measurement/e7;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/measurement/e7;->A(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/e7;

    invoke-virtual {v8}, Lnb/me;->K0()Lnb/re;

    move-result-object v0

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/f7;->F()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v0, v8, v7}, Lnb/re;->R(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/e7;->z()Lcom/google/android/gms/internal/measurement/e7;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/measurement/e7;->x(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/e7;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/f7;->K()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1c
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_17

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    move-object/from16 v21, v4

    move-object/from16 v4, v20

    check-cast v4, Lcom/google/android/gms/internal/measurement/m6;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/m6;->G()I

    move-result v20

    move-object/from16 v22, v8

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_16

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_16
    move-object/from16 v4, v21

    move-object/from16 v8, v22

    goto :goto_1c

    :cond_17
    move-object/from16 v21, v4

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/e7;->E()Lcom/google/android/gms/internal/measurement/e7;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/measurement/e7;->D(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/e7;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/f7;->N()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_18
    :goto_1d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_19

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/measurement/h7;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/measurement/h7;->G()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_18

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1d

    :cond_19
    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/e7;->J()Lcom/google/android/gms/internal/measurement/e7;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/measurement/e7;->G(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/e7;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/f7;

    invoke-interface {v3, v5, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1e
    move-object/from16 v0, v16

    move-object/from16 v2, v17

    move-object/from16 v4, v21

    goto/16 :goto_1b

    :cond_1a
    move-object/from16 v0, v16

    move-object/from16 v2, v17

    goto/16 :goto_1b

    :goto_1f
    invoke-interface {v3, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1e

    :goto_20
    move-object v0, v3

    goto :goto_22

    :goto_21
    if-eqz v5, :cond_1b

    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    :cond_1b
    throw v0

    :cond_1c
    move-object/from16 v17, v2

    move-object v0, v11

    :goto_22
    invoke-interface/range {v17 .. v17}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_23
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/f7;

    new-instance v4, Ljava/util/BitSet;

    invoke-direct {v4}, Ljava/util/BitSet;-><init>()V

    new-instance v5, Ljava/util/BitSet;

    invoke-direct {v5}, Ljava/util/BitSet;-><init>()V

    new-instance v6, Lw1/a;

    invoke-direct {v6}, Lw1/a;-><init>()V

    if-eqz v3, :cond_1d

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/f7;->M()I

    move-result v7

    if-nez v7, :cond_1e

    :cond_1d
    move-object/from16 v20, v0

    goto :goto_26

    :cond_1e
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/f7;->K()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_1f
    :goto_24
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1d

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/android/gms/internal/measurement/m6;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/m6;->F()Z

    move-result v17

    if-eqz v17, :cond_1f

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/m6;->G()I

    move-result v17

    move-object/from16 v20, v0

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/m6;->H()Z

    move-result v17

    if-eqz v17, :cond_20

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/m6;->J()J

    move-result-wide v21

    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    goto :goto_25

    :cond_20
    const/4 v8, 0x0

    :goto_25
    invoke-interface {v6, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v20

    goto :goto_24

    :goto_26
    new-instance v7, Lw1/a;

    invoke-direct {v7}, Lw1/a;-><init>()V

    if-eqz v3, :cond_21

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/f7;->O()I

    move-result v0

    if-nez v0, :cond_22

    :cond_21
    move-object/from16 v22, v3

    goto :goto_28

    :cond_22
    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/f7;->N()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_23
    :goto_27
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_21

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/android/gms/internal/measurement/h7;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/h7;->F()Z

    move-result v17

    if-eqz v17, :cond_23

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/h7;->J()I

    move-result v17

    if-lez v17, :cond_23

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/h7;->G()I

    move-result v17

    move-object/from16 v21, v0

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/h7;->J()I

    move-result v17

    move-object/from16 v22, v3

    add-int/lit8 v3, v17, -0x1

    invoke-virtual {v8, v3}, Lcom/google/android/gms/internal/measurement/h7;->K(I)J

    move-result-wide v23

    invoke-static/range {v23 .. v24}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v7, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v21

    move-object/from16 v3, v22

    goto :goto_27

    :goto_28
    if-eqz v22, :cond_26

    const/4 v0, 0x0

    :goto_29
    invoke-virtual/range {v22 .. v22}, Lcom/google/android/gms/internal/measurement/f7;->G()I

    move-result v3

    mul-int/lit8 v3, v3, 0x40

    if-ge v0, v3, :cond_26

    invoke-virtual/range {v22 .. v22}, Lcom/google/android/gms/internal/measurement/f7;->F()Ljava/util/List;

    move-result-object v3

    invoke-static {v3, v0}, Lnb/re;->P(Ljava/util/List;I)Z

    move-result v3

    if-eqz v3, :cond_24

    iget-object v3, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v3}, Lnb/g7;->a()Lnb/w5;

    move-result-object v3

    invoke-virtual {v3}, Lnb/w5;->w()Lnb/u5;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    move/from16 v17, v12

    const-string v12, "Filter already evaluated. audience ID, filter ID"

    invoke-virtual {v3, v12, v2, v8}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v5, v0}, Ljava/util/BitSet;->set(I)V

    invoke-virtual/range {v22 .. v22}, Lcom/google/android/gms/internal/measurement/f7;->H()Ljava/util/List;

    move-result-object v3

    invoke-static {v3, v0}, Lnb/re;->P(Ljava/util/List;I)Z

    move-result v3

    if-eqz v3, :cond_25

    invoke-virtual {v4, v0}, Ljava/util/BitSet;->set(I)V

    goto :goto_2a

    :cond_24
    move/from16 v17, v12

    :cond_25
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v6, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2a
    add-int/lit8 v0, v0, 0x1

    move/from16 v12, v17

    goto :goto_29

    :cond_26
    move/from16 v17, v12

    invoke-interface {v11, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/google/android/gms/internal/measurement/f7;

    if-eqz v13, :cond_2b

    if-eqz v17, :cond_2b

    invoke-interface {v10, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_2b

    iget-object v8, v1, Lnb/e;->h:Ljava/lang/Long;

    if-eqz v8, :cond_2b

    iget-object v8, v1, Lnb/e;->g:Ljava/lang/Long;

    if-nez v8, :cond_27

    goto :goto_2c

    :cond_27
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/android/gms/internal/measurement/z3;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/z3;->G()I

    move-result v12

    move-object/from16 v21, v0

    iget-object v0, v1, Lnb/e;->h:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v22

    const-wide/16 v24, 0x3e8

    div-long v22, v22, v24

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/z3;->Q()Z

    move-result v0

    if-eqz v0, :cond_28

    iget-object v0, v1, Lnb/e;->g:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v22

    div-long v22, v22, v24

    :cond_28
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_29

    invoke-static/range {v22 .. v23}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-interface {v6, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_29
    invoke-interface {v7, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2a

    invoke-static/range {v22 .. v23}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-interface {v7, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2a
    move-object/from16 v0, v21

    goto :goto_2b

    :cond_2b
    :goto_2c
    new-instance v0, Lnb/df;

    move-object v8, v2

    iget-object v2, v1, Lnb/e;->d:Ljava/lang/String;

    move-object v12, v8

    const/4 v8, 0x0

    move-object/from16 v33, v18

    move-object/from16 v18, v10

    move-object/from16 v10, v33

    move-object/from16 v33, v19

    move-object/from16 v19, v11

    move-object/from16 v11, v33

    invoke-direct/range {v0 .. v8}, Lnb/df;-><init>(Lnb/e;Ljava/lang/String;Lcom/google/android/gms/internal/measurement/f7;Ljava/util/BitSet;Ljava/util/BitSet;Ljava/util/Map;Ljava/util/Map;[B)V

    iget-object v2, v1, Lnb/e;->f:Ljava/util/Map;

    invoke-interface {v2, v12, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v18

    move-object/from16 v18, v10

    move-object v10, v0

    move-object/from16 v0, v19

    move-object/from16 v19, v11

    move-object v11, v0

    move/from16 v12, v17

    move-object/from16 v0, v20

    goto/16 :goto_23

    :goto_2d
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const-string v2, "Skipping failed audience ID"

    if-eqz v0, :cond_2c

    goto/16 :goto_3e

    :cond_2c
    new-instance v3, Lnb/ef;

    const/4 v4, 0x0

    invoke-direct {v3, v1, v4}, Lnb/ef;-><init>(Lnb/e;[B)V

    new-instance v4, Lw1/a;

    invoke-direct {v4}, Lw1/a;-><init>()V

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2d
    :goto_2e
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_39

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/o6;

    iget-object v6, v1, Lnb/e;->d:Ljava/lang/String;

    invoke-virtual {v3, v6, v0}, Lnb/ef;->a(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/o6;)Lcom/google/android/gms/internal/measurement/o6;

    move-result-object v19

    if-eqz v19, :cond_2d

    iget-object v6, v1, Lnb/td;->b:Lnb/me;

    invoke-virtual {v6}, Lnb/me;->F0()Lnb/t;

    move-result-object v7

    iget-object v8, v1, Lnb/e;->d:Ljava/lang/String;

    invoke-virtual/range {v19 .. v19}, Lcom/google/android/gms/internal/measurement/o6;->J()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v7, v8, v0, v12}, Lnb/t;->Z(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/o6;Ljava/lang/String;)Lnb/b0;

    move-result-object v7

    invoke-virtual {v6}, Lnb/me;->F0()Lnb/t;

    move-result-object v0

    invoke-virtual {v0, v7}, Lnb/t;->w0(Lnb/b0;)V

    if-nez p6, :cond_2d

    iget-wide v12, v7, Lnb/b0;->c:J

    invoke-virtual/range {v19 .. v19}, Lcom/google/android/gms/internal/measurement/o6;->J()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-nez v0, :cond_33

    invoke-virtual {v6}, Lnb/me;->F0()Lnb/t;

    move-result-object v6

    move-object/from16 v24, v3

    iget-object v3, v1, Lnb/e;->d:Ljava/lang/String;

    invoke-virtual {v6}, Lnb/xd;->j()V

    invoke-virtual {v6}, Lnb/j8;->h()V

    invoke-static {v3}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {v8}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    move-object/from16 p2, v5

    new-instance v5, Lw1/a;

    invoke-direct {v5}, Lw1/a;-><init>()V

    invoke-virtual {v6}, Lnb/t;->u0()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v25

    :try_start_13
    const-string v26, "event_filters"

    filled-new-array {v11, v10}, [Ljava/lang/String;

    move-result-object v27

    const-string v28, "app_id=? AND event_name=?"

    filled-new-array {v3, v8}, [Ljava/lang/String;

    move-result-object v29
    :try_end_13
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_13 .. :try_end_13} :catch_11
    .catchall {:try_start_13 .. :try_end_13} :catchall_8

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v30, 0x0

    move-object/from16 v16, v3

    :try_start_14
    invoke-virtual/range {v25 .. v32}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3
    :try_end_14
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_14 .. :try_end_14} :catch_10
    .catchall {:try_start_14 .. :try_end_14} :catchall_8

    :try_start_15
    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0
    :try_end_15
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_15 .. :try_end_15} :catch_f
    .catchall {:try_start_15 .. :try_end_15} :catchall_7

    if-eqz v0, :cond_30

    move-object/from16 v22, v7

    :goto_2f
    const/4 v7, 0x1

    :try_start_16
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v0
    :try_end_16
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_16 .. :try_end_16} :catch_d
    .catchall {:try_start_16 .. :try_end_16} :catchall_7

    :try_start_17
    invoke-static {}, Lcom/google/android/gms/internal/measurement/z3;->T()Lcom/google/android/gms/internal/measurement/y3;

    move-result-object v7

    invoke-static {v7, v0}, Lnb/re;->W(Lcom/google/android/gms/internal/measurement/nc;[B)Lcom/google/android/gms/internal/measurement/nc;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/y3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/z3;
    :try_end_17
    .catch Ljava/io/IOException; {:try_start_17 .. :try_end_17} :catch_e
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_17 .. :try_end_17} :catch_d
    .catchall {:try_start_17 .. :try_end_17} :catchall_7

    const/4 v7, 0x0

    :try_start_18
    invoke-interface {v3, v7}, Landroid/database/Cursor;->getInt(I)I

    move-result v17

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Ljava/util/List;
    :try_end_18
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_18 .. :try_end_18} :catch_d
    .catchall {:try_start_18 .. :try_end_18} :catchall_7

    if-nez v17, :cond_2e

    move-object/from16 v18, v3

    :try_start_19
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5, v7, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_30

    :catchall_6
    move-exception v0

    goto :goto_32

    :catch_c
    move-exception v0

    goto :goto_33

    :cond_2e
    move-object/from16 v18, v3

    move-object/from16 v3, v17

    :goto_30
    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_31

    :catchall_7
    move-exception v0

    move-object/from16 v18, v3

    goto :goto_32

    :catch_d
    move-exception v0

    move-object/from16 v18, v3

    goto :goto_33

    :catch_e
    move-exception v0

    move-object/from16 v18, v3

    iget-object v3, v6, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v3}, Lnb/g7;->a()Lnb/w5;

    move-result-object v3

    invoke-virtual {v3}, Lnb/w5;->o()Lnb/u5;

    move-result-object v3

    invoke-static/range {v16 .. v16}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v3, v14, v7, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_31
    invoke-interface/range {v18 .. v18}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0
    :try_end_19
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_19 .. :try_end_19} :catch_c
    .catchall {:try_start_19 .. :try_end_19} :catchall_6

    if-nez v0, :cond_2f

    invoke-interface/range {v18 .. v18}, Landroid/database/Cursor;->close()V

    move-object v0, v5

    goto :goto_38

    :cond_2f
    move-object/from16 v3, v18

    goto :goto_2f

    :cond_30
    move-object/from16 v18, v3

    move-object/from16 v22, v7

    :try_start_1a
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_1a
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1a .. :try_end_1a} :catch_c
    .catchall {:try_start_1a .. :try_end_1a} :catchall_6

    invoke-interface/range {v18 .. v18}, Landroid/database/Cursor;->close()V

    goto :goto_38

    :goto_32
    move-object/from16 v5, v18

    goto :goto_39

    :catch_f
    move-exception v0

    move-object/from16 v18, v3

    move-object/from16 v22, v7

    :goto_33
    move-object/from16 v5, v18

    goto :goto_37

    :catchall_8
    move-exception v0

    goto :goto_35

    :catch_10
    move-exception v0

    :goto_34
    move-object/from16 v22, v7

    goto :goto_36

    :catch_11
    move-exception v0

    move-object/from16 v16, v3

    goto :goto_34

    :goto_35
    const/4 v5, 0x0

    goto :goto_39

    :goto_36
    const/4 v5, 0x0

    :goto_37
    :try_start_1b
    iget-object v3, v6, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v3}, Lnb/g7;->a()Lnb/w5;

    move-result-object v3

    invoke-virtual {v3}, Lnb/w5;->o()Lnb/u5;

    move-result-object v3

    invoke-static/range {v16 .. v16}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v3, v15, v6, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_9

    if-eqz v5, :cond_31

    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    :cond_31
    :goto_38
    invoke-interface {v4, v8, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3a

    :catchall_9
    move-exception v0

    :goto_39
    if-eqz v5, :cond_32

    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    :cond_32
    throw v0

    :cond_33
    move-object/from16 v24, v3

    move-object/from16 p2, v5

    move-object/from16 v22, v7

    :goto_3a
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_38

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v7, v1, Lnb/e;->e:Ljava/util/Set;

    invoke-interface {v7, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_34

    iget-object v6, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v6}, Lnb/g7;->a()Lnb/w5;

    move-result-object v6

    invoke-virtual {v6}, Lnb/w5;->w()Lnb/u5;

    move-result-object v6

    invoke-virtual {v6, v2, v5}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_3b

    :cond_34
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    const/4 v8, 0x1

    :goto_3c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_36

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/android/gms/internal/measurement/z3;

    move-object/from16 v25, v0

    new-instance v0, Lnb/b;

    move-object/from16 v26, v3

    iget-object v3, v1, Lnb/e;->d:Ljava/lang/String;

    invoke-direct {v0, v1, v3, v6, v8}, Lnb/b;-><init>(Lnb/e;Ljava/lang/String;ILcom/google/android/gms/internal/measurement/z3;)V

    iget-object v3, v1, Lnb/e;->g:Ljava/lang/Long;

    move-object/from16 v16, v0

    iget-object v0, v1, Lnb/e;->h:Ljava/lang/Long;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/z3;->G()I

    move-result v8

    invoke-virtual {v1, v6, v8}, Lnb/e;->o(II)Z

    move-result v23

    move-object/from16 v18, v0

    move-object/from16 v17, v3

    move-wide/from16 v20, v12

    invoke-virtual/range {v16 .. v23}, Lnb/b;->k(Ljava/lang/Long;Ljava/lang/Long;Lcom/google/android/gms/internal/measurement/o6;JLnb/b0;Z)Z

    move-result v8

    move-object/from16 v0, v16

    if-eqz v8, :cond_35

    invoke-virtual {v1, v5}, Lnb/e;->n(Ljava/lang/Integer;)Lnb/df;

    move-result-object v3

    invoke-virtual {v3, v0}, Lnb/df;->a(Lnb/c;)V

    move-wide/from16 v12, v20

    move-object/from16 v0, v25

    move-object/from16 v3, v26

    goto :goto_3c

    :cond_35
    iget-object v0, v1, Lnb/e;->e:Ljava/util/Set;

    invoke-interface {v0, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_3d

    :cond_36
    move-object/from16 v25, v0

    move-object/from16 v26, v3

    move-wide/from16 v20, v12

    :goto_3d
    if-nez v8, :cond_37

    iget-object v0, v1, Lnb/e;->e:Ljava/util/Set;

    invoke-interface {v0, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_37
    move-wide/from16 v12, v20

    move-object/from16 v0, v25

    move-object/from16 v3, v26

    goto/16 :goto_3b

    :cond_38
    move-object/from16 v5, p2

    move-object/from16 v3, v24

    goto/16 :goto_2e

    :cond_39
    :goto_3e
    if-nez p6, :cond_4e

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3a

    goto/16 :goto_55

    :cond_3a
    new-instance v3, Lw1/a;

    invoke-direct {v3}, Lw1/a;-><init>()V

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/google/android/gms/internal/measurement/r7;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/r7;->H()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-nez v0, :cond_40

    iget-object v0, v1, Lnb/td;->b:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->F0()Lnb/t;

    move-result-object v7

    iget-object v8, v1, Lnb/e;->d:Ljava/lang/String;

    invoke-virtual {v7}, Lnb/xd;->j()V

    invoke-virtual {v7}, Lnb/j8;->h()V

    invoke-static {v8}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {v6}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    new-instance v12, Lw1/a;

    invoke-direct {v12}, Lw1/a;-><init>()V

    invoke-virtual {v7}, Lnb/t;->u0()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v16

    :try_start_1c
    const-string v17, "property_filters"

    filled-new-array {v11, v10}, [Ljava/lang/String;

    move-result-object v18

    const-string v19, "app_id=? AND property_name=?"

    filled-new-array {v8, v6}, [Ljava/lang/String;

    move-result-object v20

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v21, 0x0

    invoke-virtual/range {v16 .. v23}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v13
    :try_end_1c
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1c .. :try_end_1c} :catch_16
    .catchall {:try_start_1c .. :try_end_1c} :catchall_b

    :try_start_1d
    invoke-interface {v13}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_3d

    :goto_40
    const/4 v14, 0x1

    invoke-interface {v13, v14}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v0
    :try_end_1d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1d .. :try_end_1d} :catch_13
    .catchall {:try_start_1d .. :try_end_1d} :catchall_a

    :try_start_1e
    invoke-static {}, Lcom/google/android/gms/internal/measurement/h4;->P()Lcom/google/android/gms/internal/measurement/g4;

    move-result-object v14

    invoke-static {v14, v0}, Lnb/re;->W(Lcom/google/android/gms/internal/measurement/nc;[B)Lcom/google/android/gms/internal/measurement/nc;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/g4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/h4;
    :try_end_1e
    .catch Ljava/io/IOException; {:try_start_1e .. :try_end_1e} :catch_14
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1e .. :try_end_1e} :catch_13
    .catchall {:try_start_1e .. :try_end_1e} :catchall_a

    const/4 v14, 0x0

    :try_start_1f
    invoke-interface {v13, v14}, Landroid/database/Cursor;->getInt(I)I

    move-result v16

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-interface {v12, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ljava/util/List;
    :try_end_1f
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1f .. :try_end_1f} :catch_13
    .catchall {:try_start_1f .. :try_end_1f} :catchall_a

    if-nez v16, :cond_3b

    move-object/from16 p2, v4

    :try_start_20
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v12, v14, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_42

    :catchall_a
    move-exception v0

    goto :goto_45

    :catch_12
    move-exception v0

    :goto_41
    move-object/from16 v16, v8

    goto :goto_48

    :cond_3b
    move-object/from16 p2, v4

    move-object/from16 v4, v16

    :goto_42
    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v16, v8

    goto :goto_43

    :catch_13
    move-exception v0

    move-object/from16 p2, v4

    goto :goto_41

    :catch_14
    move-exception v0

    move-object/from16 p2, v4

    iget-object v4, v7, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v4}, Lnb/g7;->a()Lnb/w5;

    move-result-object v4

    invoke-virtual {v4}, Lnb/w5;->o()Lnb/u5;

    move-result-object v4

    const-string v14, "Failed to merge filter"
    :try_end_20
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_20 .. :try_end_20} :catch_12
    .catchall {:try_start_20 .. :try_end_20} :catchall_a

    move-object/from16 v16, v8

    :try_start_21
    invoke-static/range {v16 .. v16}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v4, v14, v8, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_43
    invoke-interface {v13}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0
    :try_end_21
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_21 .. :try_end_21} :catch_15
    .catchall {:try_start_21 .. :try_end_21} :catchall_a

    if-nez v0, :cond_3c

    invoke-interface {v13}, Landroid/database/Cursor;->close()V

    move-object v0, v12

    goto :goto_49

    :cond_3c
    move-object/from16 v4, p2

    move-object/from16 v8, v16

    goto :goto_40

    :catch_15
    move-exception v0

    goto :goto_48

    :cond_3d
    move-object/from16 p2, v4

    move-object/from16 v16, v8

    :try_start_22
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_22
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_22 .. :try_end_22} :catch_15
    .catchall {:try_start_22 .. :try_end_22} :catchall_a

    :goto_44
    invoke-interface {v13}, Landroid/database/Cursor;->close()V

    goto :goto_49

    :goto_45
    move-object v5, v13

    goto :goto_4a

    :catchall_b
    move-exception v0

    goto :goto_46

    :catch_16
    move-exception v0

    move-object/from16 p2, v4

    move-object/from16 v16, v8

    goto :goto_47

    :goto_46
    const/4 v5, 0x0

    goto :goto_4a

    :goto_47
    const/4 v13, 0x0

    :goto_48
    :try_start_23
    iget-object v4, v7, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v4}, Lnb/g7;->a()Lnb/w5;

    move-result-object v4

    invoke-virtual {v4}, Lnb/w5;->o()Lnb/u5;

    move-result-object v4

    invoke-static/range {v16 .. v16}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v4, v15, v7, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_a

    if-eqz v13, :cond_3e

    goto :goto_44

    :cond_3e
    :goto_49
    invoke-interface {v3, v6, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4b

    :goto_4a
    if-eqz v5, :cond_3f

    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    :cond_3f
    throw v0

    :cond_40
    move-object/from16 p2, v4

    :goto_4b
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_4c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_41

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v8, v1, Lnb/e;->e:Ljava/util/Set;

    invoke-interface {v8, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_42

    iget-object v0, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    invoke-virtual {v0, v2, v6}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_41
    move-object/from16 v4, p2

    goto/16 :goto_3f

    :cond_42
    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    const/4 v12, 0x1

    :goto_4d
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_49

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/google/android/gms/internal/measurement/h4;

    iget-object v13, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v13}, Lnb/g7;->a()Lnb/w5;

    move-result-object v14

    invoke-virtual {v14}, Lnb/w5;->z()Ljava/lang/String;

    move-result-object v14

    move-object/from16 p3, v0

    const/4 v0, 0x2

    invoke-static {v14, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_44

    invoke-virtual {v13}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/h4;->F()Z

    move-result v14

    if-eqz v14, :cond_43

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/h4;->G()I

    move-result v14

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    :goto_4e
    move-object/from16 v16, v2

    goto :goto_4f

    :cond_43
    const/4 v14, 0x0

    goto :goto_4e

    :goto_4f
    invoke-virtual {v13}, Lnb/g7;->D()Lnb/p5;

    move-result-object v2

    move-object/from16 p6, v3

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/h4;->H()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lnb/p5;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Evaluating filter. audience, filter, property"

    invoke-virtual {v0, v3, v6, v14, v2}, Lnb/u5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v13}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    iget-object v2, v1, Lnb/td;->b:Lnb/me;

    invoke-virtual {v2}, Lnb/me;->K0()Lnb/re;

    move-result-object v2

    invoke-virtual {v2, v12}, Lnb/re;->M(Lcom/google/android/gms/internal/measurement/h4;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Filter definition"

    invoke-virtual {v0, v3, v2}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_50

    :cond_44
    move-object/from16 v16, v2

    move-object/from16 p6, v3

    :goto_50
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/h4;->F()Z

    move-result v0

    if-eqz v0, :cond_47

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/h4;->G()I

    move-result v0

    const/16 v2, 0x100

    if-le v0, v2, :cond_45

    goto :goto_51

    :cond_45
    new-instance v0, Lnb/d;

    iget-object v2, v1, Lnb/e;->d:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v7, v12}, Lnb/d;-><init>(Lnb/e;Ljava/lang/String;ILcom/google/android/gms/internal/measurement/h4;)V

    iget-object v2, v1, Lnb/e;->g:Ljava/lang/Long;

    iget-object v3, v1, Lnb/e;->h:Ljava/lang/Long;

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/h4;->G()I

    move-result v12

    invoke-virtual {v1, v7, v12}, Lnb/e;->o(II)Z

    move-result v12

    invoke-virtual {v0, v2, v3, v5, v12}, Lnb/d;->k(Ljava/lang/Long;Ljava/lang/Long;Lcom/google/android/gms/internal/measurement/r7;Z)Z

    move-result v12

    if-eqz v12, :cond_46

    invoke-virtual {v1, v6}, Lnb/e;->n(Ljava/lang/Integer;)Lnb/df;

    move-result-object v2

    invoke-virtual {v2, v0}, Lnb/df;->a(Lnb/c;)V

    move-object/from16 v0, p3

    move-object/from16 v3, p6

    move-object/from16 v2, v16

    goto/16 :goto_4d

    :cond_46
    iget-object v0, v1, Lnb/e;->e:Ljava/util/Set;

    invoke-interface {v0, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_53

    :cond_47
    :goto_51
    invoke-virtual {v13}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->r()Lnb/u5;

    move-result-object v0

    iget-object v2, v1, Lnb/e;->d:Ljava/lang/String;

    invoke-static {v2}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/h4;->F()Z

    move-result v3

    if-eqz v3, :cond_48

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/h4;->G()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_52

    :cond_48
    const/4 v3, 0x0

    :goto_52
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v7, "Invalid property filter ID. appId, id"

    invoke-virtual {v0, v7, v2, v3}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_54

    :cond_49
    move-object/from16 p3, v0

    move-object/from16 v16, v2

    move-object/from16 p6, v3

    :goto_53
    if-nez v12, :cond_4a

    :goto_54
    iget-object v0, v1, Lnb/e;->e:Ljava/util/Set;

    invoke-interface {v0, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_4a
    move-object/from16 v0, p3

    move-object/from16 v3, p6

    move-object/from16 v2, v16

    goto/16 :goto_4c

    :cond_4b
    :goto_55
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, v1, Lnb/e;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    iget-object v3, v1, Lnb/e;->e:Ljava/util/Set;

    invoke-interface {v0, v3}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4c
    :goto_56
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    iget-object v5, v1, Lnb/e;->f:Ljava/util/Map;

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lnb/df;

    invoke-static {v5}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5, v4}, Lnb/df;->b(I)Lcom/google/android/gms/internal/measurement/c6;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v5, v1, Lnb/td;->b:Lnb/me;

    invoke-virtual {v5}, Lnb/me;->F0()Lnb/t;

    move-result-object v5

    iget-object v6, v1, Lnb/e;->d:Ljava/lang/String;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/c6;->H()Lcom/google/android/gms/internal/measurement/f7;

    move-result-object v4

    invoke-virtual {v5}, Lnb/xd;->j()V

    invoke-virtual {v5}, Lnb/j8;->h()V

    invoke-static {v6}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {v4}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/r9;->d()[B

    move-result-object v4

    new-instance v7, Landroid/content/ContentValues;

    invoke-direct {v7}, Landroid/content/ContentValues;-><init>()V

    const-string v8, "app_id"

    invoke-virtual {v7, v8, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v11, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-virtual {v7, v9, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    :try_start_24
    invoke-virtual {v5}, Lnb/t;->u0()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v4, "audience_filter_values"
    :try_end_24
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_24 .. :try_end_24} :catch_18

    const/4 v8, 0x5

    const/4 v10, 0x0

    :try_start_25
    invoke-virtual {v0, v4, v10, v7, v8}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    move-result-wide v7

    const-wide/16 v12, -0x1

    cmp-long v0, v7, v12

    if-nez v0, :cond_4c

    iget-object v0, v5, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    const-string v4, "Failed to insert filter results (got -1). appId"

    invoke-static {v6}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v0, v4, v7}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_25
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_25 .. :try_end_25} :catch_17

    goto :goto_56

    :catch_17
    move-exception v0

    goto :goto_57

    :catch_18
    move-exception v0

    const/4 v10, 0x0

    :goto_57
    iget-object v4, v5, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v4}, Lnb/g7;->a()Lnb/w5;

    move-result-object v4

    invoke-virtual {v4}, Lnb/w5;->o()Lnb/u5;

    move-result-object v4

    invoke-static {v6}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    const-string v6, "Error storing filter results. appId"

    invoke-virtual {v4, v6, v5, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_56

    :cond_4d
    return-object v2

    :cond_4e
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0

    :goto_58
    if-eqz v5, :cond_4f

    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    :cond_4f
    throw v0
.end method

.method public final n(Ljava/lang/Integer;)Lnb/df;
    .locals 3

    iget-object v0, p0, Lnb/e;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnb/e;->f:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnb/df;

    return-object p1

    :cond_0
    new-instance v0, Lnb/df;

    iget-object v1, p0, Lnb/e;->d:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lnb/df;-><init>(Lnb/e;Ljava/lang/String;[B)V

    iget-object v1, p0, Lnb/e;->f:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final o(II)Z
    .locals 1

    iget-object v0, p0, Lnb/e;->f:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnb/df;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Lnb/df;->c()Ljava/util/BitSet;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/util/BitSet;->get(I)Z

    move-result p1

    return p1
.end method
