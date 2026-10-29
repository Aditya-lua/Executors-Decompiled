.class public final Lnb/ef;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lcom/google/android/gms/internal/measurement/o6;

.field public b:Ljava/lang/Long;

.field public c:J

.field public final synthetic d:Lnb/e;


# direct methods
.method public synthetic constructor <init>(Lnb/e;[B)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/ef;->d:Lnb/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/o6;)Lcom/google/android/gms/internal/measurement/o6;
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-object/from16 v8, p2

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/o6;->J()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/o6;->F()Ljava/util/List;

    move-result-object v9

    iget-object v2, v1, Lnb/ef;->d:Lnb/e;

    iget-object v4, v2, Lnb/td;->b:Lnb/me;

    invoke-virtual {v4}, Lnb/me;->K0()Lnb/re;

    const-string v5, "_eid"

    invoke-static {v8, v5}, Lnb/re;->u(Lcom/google/android/gms/internal/measurement/o6;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Long;

    if-eqz v6, :cond_e

    const-string v7, "_ep"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    const-wide/16 v10, 0x0

    if-eqz v7, :cond_c

    invoke-static {v6}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4}, Lnb/me;->K0()Lnb/re;

    const-string v0, "_en"

    invoke-static {v8, v0}, Lnb/re;->u(Lcom/google/android/gms/internal/measurement/o6;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/lang/String;

    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v7, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->p()Lnb/u5;

    move-result-object v0

    const-string v2, "Extra parameter without an event name. eventId"

    invoke-virtual {v0, v2, v6}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v7

    :cond_0
    iget-object v0, v1, Lnb/ef;->a:Lcom/google/android/gms/internal/measurement/o6;

    if-eqz v0, :cond_1

    iget-object v0, v1, Lnb/ef;->b:Ljava/lang/Long;

    if-eqz v0, :cond_1

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    iget-object v0, v1, Lnb/ef;->b:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v15

    cmp-long v0, v13, v15

    if-eqz v0, :cond_5

    :cond_1
    invoke-virtual {v4}, Lnb/me;->F0()Lnb/t;

    move-result-object v2

    invoke-virtual {v2}, Lnb/j8;->h()V

    invoke-virtual {v2}, Lnb/xd;->j()V

    :try_start_0
    invoke-virtual {v2}, Lnb/t;->u0()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v4, "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v13

    filled-new-array {v3, v13}, [Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0, v4, v13}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-interface {v4}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    const-string v13, "Main event not found"

    invoke-virtual {v0, v13}, Lnb/u5;->a(Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    :cond_2
    move-object v0, v7

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :try_start_2
    invoke-interface {v4, v0}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v0

    const/4 v13, 0x1

    invoke-interface {v4, v13}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-static {}, Lcom/google/android/gms/internal/measurement/o6;->R()Lcom/google/android/gms/internal/measurement/n6;

    move-result-object v14

    invoke-static {v14, v0}, Lnb/re;->W(Lcom/google/android/gms/internal/measurement/nc;[B)Lcom/google/android/gms/internal/measurement/nc;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/n6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/o6;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-static {v0, v13}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    goto :goto_3

    :catch_1
    move-exception v0

    :try_start_5
    iget-object v13, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v13}, Lnb/g7;->a()Lnb/w5;

    move-result-object v13

    invoke-virtual {v13}, Lnb/w5;->o()Lnb/u5;

    move-result-object v13

    const-string v14, "Failed to merge main event. appId, eventId"

    invoke-static {v3}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v13, v14, v15, v6, v0}, Lnb/u5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_0

    :goto_1
    move-object v7, v4

    goto/16 :goto_8

    :catchall_1
    move-exception v0

    goto/16 :goto_8

    :catch_2
    move-exception v0

    move-object v4, v7

    :goto_2
    :try_start_6
    iget-object v2, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->o()Lnb/u5;

    move-result-object v2

    const-string v13, "Error selecting main event"

    invoke-virtual {v2, v13, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-eqz v4, :cond_2

    goto :goto_0

    :goto_3
    if-eqz v0, :cond_a

    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    if-nez v2, :cond_4

    goto/16 :goto_7

    :cond_4
    check-cast v2, Lcom/google/android/gms/internal/measurement/o6;

    iput-object v2, v1, Lnb/ef;->a:Lcom/google/android/gms/internal/measurement/o6;

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    iput-wide v13, v1, Lnb/ef;->c:J

    iget-object v0, v1, Lnb/ef;->d:Lnb/e;

    iget-object v0, v0, Lnb/td;->b:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->K0()Lnb/re;

    iget-object v0, v1, Lnb/ef;->a:Lcom/google/android/gms/internal/measurement/o6;

    invoke-static {v0, v5}, Lnb/re;->u(Lcom/google/android/gms/internal/measurement/o6;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    iput-object v0, v1, Lnb/ef;->b:Ljava/lang/Long;

    :cond_5
    iget-wide v4, v1, Lnb/ef;->c:J

    const-wide/16 v13, -0x1

    add-long/2addr v4, v13

    iput-wide v4, v1, Lnb/ef;->c:J

    cmp-long v0, v4, v10

    if-gtz v0, :cond_6

    iget-object v0, v1, Lnb/ef;->d:Lnb/e;

    iget-object v0, v0, Lnb/td;->b:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->F0()Lnb/t;

    move-result-object v2

    invoke-virtual {v2}, Lnb/j8;->h()V

    iget-object v0, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    const-string v4, "Clearing complex main event info. appId"

    invoke-virtual {v0, v4, v3}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_7
    invoke-virtual {v2}, Lnb/t;->u0()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v4, "delete from main_event_params where app_id=?"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v4, v3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_7
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_7 .. :try_end_7} :catch_3

    goto :goto_4

    :catch_3
    move-exception v0

    iget-object v2, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->o()Lnb/u5;

    move-result-object v2

    const-string v3, "Error clearing complex main event"

    invoke-virtual {v2, v3, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_4

    :cond_6
    iget-object v0, v1, Lnb/ef;->d:Lnb/e;

    iget-object v0, v0, Lnb/td;->b:Lnb/me;

    invoke-virtual {v0}, Lnb/me;->F0()Lnb/t;

    move-result-object v2

    move-object v4, v6

    iget-wide v5, v1, Lnb/ef;->c:J

    iget-object v7, v1, Lnb/ef;->a:Lcom/google/android/gms/internal/measurement/o6;

    invoke-virtual/range {v2 .. v7}, Lnb/t;->F(Ljava/lang/String;Ljava/lang/Long;JLcom/google/android/gms/internal/measurement/o6;)Z

    :goto_4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, v1, Lnb/ef;->a:Lcom/google/android/gms/internal/measurement/o6;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/o6;->F()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_7
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/measurement/s6;

    iget-object v4, v1, Lnb/ef;->d:Lnb/e;

    iget-object v4, v4, Lnb/td;->b:Lnb/me;

    invoke-virtual {v4}, Lnb/me;->K0()Lnb/re;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/measurement/s6;->G()Ljava/lang/String;

    move-result-object v4

    invoke-static {v8, v4}, Lnb/re;->r(Lcom/google/android/gms/internal/measurement/o6;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/s6;

    move-result-object v4

    if-nez v4, :cond_7

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_8
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_9

    invoke-interface {v0, v9}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    move-object v9, v0

    goto :goto_6

    :cond_9
    iget-object v0, v1, Lnb/ef;->d:Lnb/e;

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->p()Lnb/u5;

    move-result-object v0

    const-string v2, "No unique parameters in main event. eventName"

    invoke-virtual {v0, v2, v12}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_6
    move-object v0, v12

    goto :goto_9

    :cond_a
    :goto_7
    iget-object v0, v1, Lnb/ef;->d:Lnb/e;

    iget-object v0, v0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->p()Lnb/u5;

    move-result-object v0

    const-string v2, "Extra parameter without existing main event. eventName, eventId"

    invoke-virtual {v0, v2, v12, v6}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v7

    :goto_8
    if-eqz v7, :cond_b

    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    :cond_b
    throw v0

    :cond_c
    iput-object v6, v1, Lnb/ef;->b:Ljava/lang/Long;

    iput-object v8, v1, Lnb/ef;->a:Lcom/google/android/gms/internal/measurement/o6;

    invoke-virtual {v4}, Lnb/me;->K0()Lnb/re;

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v5, "_epc"

    invoke-static {v8, v5, v3}, Lnb/re;->v(Lcom/google/android/gms/internal/measurement/o6;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    iput-wide v12, v1, Lnb/ef;->c:J

    cmp-long v3, v12, v10

    if-gtz v3, :cond_d

    iget-object v2, v2, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v2}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->p()Lnb/u5;

    move-result-object v2

    const-string v3, "Complex event with zero extra param count. eventName"

    invoke-virtual {v2, v3, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_9

    :cond_d
    invoke-virtual {v4}, Lnb/me;->F0()Lnb/t;

    move-result-object v2

    invoke-static {v6}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/Long;

    iget-wide v5, v1, Lnb/ef;->c:J

    move-object/from16 v3, p1

    move-object v7, v8

    invoke-virtual/range {v2 .. v7}, Lnb/t;->F(Ljava/lang/String;Ljava/lang/Long;JLcom/google/android/gms/internal/measurement/o6;)Z

    :cond_e
    :goto_9
    invoke-virtual/range {p2 .. p2}, Lcom/google/android/gms/internal/measurement/gb;->q()Lcom/google/android/gms/internal/measurement/cb;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/n6;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/measurement/n6;->P(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/n6;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/n6;->K()Lcom/google/android/gms/internal/measurement/n6;

    invoke-virtual {v2, v9}, Lcom/google/android/gms/internal/measurement/n6;->J(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/n6;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/o6;

    return-object v0
.end method
