.class public final Ldi/m$e;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldi/m;->m(Lnt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lku/p0;",
        "Lnt/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lku/p0;",
        "",
        "<anonymous>",
        "(Lku/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.roblox.client.googleplaygames.StreakTracker$updateStreak$2"
    f = "StreakTracker.kt"
    l = {
        0x34,
        0x37
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public t:J

.field public u:Ljava/lang/Object;

.field public v:I

.field public final synthetic w:Ldi/m;


# direct methods
.method public constructor <init>(Ldi/m;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldi/m;",
            "Lnt/b<",
            "-",
            "Ldi/m$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldi/m$e;->w:Ldi/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lnt/b<",
            "*>;)",
            "Lnt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Ldi/m$e;

    iget-object v0, p0, Ldi/m$e;->w:Ldi/m;

    invoke-direct {p1, v0, p2}, Ldi/m$e;-><init>(Ldi/m;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Ldi/m$e;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lku/p0;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Ldi/m$e;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Ldi/m$e;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Ldi/m$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Ldi/m$e;->v:I

    const-string v3, "new"

    const-string v4, ". now is "

    const-string v5, "login_streak"

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v8, 0x1

    const-string v9, "rbx.achievements.streak_tracker"

    if-eqz v2, :cond_3

    if-eq v2, v8, :cond_1

    if-ne v2, v6, :cond_0

    iget-wide v1, v0, Ldi/m$e;->t:J

    iget-object v6, v0, Ldi/m$e;->u:Ljava/lang/Object;

    check-cast v6, Ldi/c;

    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    move-wide v13, v1

    move-object/from16 v2, p1

    goto :goto_2

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-wide v10, v0, Ldi/m$e;->t:J

    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    :cond_2
    move-wide v13, v10

    goto :goto_0

    :cond_3
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object v2, v0, Ldi/m$e;->w:Ldi/m;

    invoke-static {v2}, Ldi/m;->a(Ldi/m;)J

    move-result-wide v10

    iget-object v2, v0, Ldi/m$e;->w:Ldi/m;

    iput-wide v10, v0, Ldi/m$e;->t:J

    iput v8, v0, Ldi/m$e;->v:I

    invoke-static {v2, v0}, Ldi/m;->f(Ldi/m;Lnt/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    goto :goto_1

    :goto_0
    move-object v10, v2

    check-cast v10, Ldi/c;

    if-nez v10, :cond_9

    iget-object v2, v0, Ldi/m$e;->w:Ldi/m;

    invoke-static {v10}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v0, Ldi/m$e;->u:Ljava/lang/Object;

    iput-wide v13, v0, Ldi/m$e;->t:J

    iput v6, v0, Ldi/m$e;->v:I

    invoke-static {v2, v5, v0}, Ldi/m;->e(Ldi/m;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    :goto_1
    return-object v1

    :cond_4
    :goto_2
    check-cast v2, Ldi/c;

    if-eqz v2, :cond_5

    iget-object v1, v0, Ldi/m$e;->w:Ldi/m;

    invoke-static {v1, v2, v13, v14}, Ldi/m;->b(Ldi/m;Ldi/c;J)Ldi/c;

    move-result-object v1

    goto :goto_3

    :cond_5
    const/4 v1, 0x0

    :goto_3
    if-eqz v1, :cond_7

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->D()Z

    move-result v2

    if-eqz v2, :cond_6

    sget-object v2, Lsl/t;->a:Lsl/t;

    const-string v3, "migrated"

    invoke-virtual {v2, v3}, Lsl/t;->p(Ljava/lang/String;)V

    :cond_6
    invoke-virtual {v1}, Ldi/c;->d()J

    move-result-wide v2

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Continuing migrated streak started at "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v9, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v8}, Lpt/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v1, v2}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    goto/16 :goto_4

    :cond_7
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->D()Z

    move-result v1

    if-eqz v1, :cond_8

    sget-object v1, Lsl/t;->a:Lsl/t;

    invoke-virtual {v1, v3}, Lsl/t;->p(Ljava/lang/String;)V

    :cond_8
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Starting a new current time streak at "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v9, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v1, Ldi/c;

    invoke-direct {v1, v13, v14, v13, v14}, Ldi/c;-><init>(JJ)V

    invoke-static {v7}, Lpt/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v1, v2}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    goto/16 :goto_4

    :cond_9
    invoke-virtual {v10}, Ldi/c;->c()J

    move-result-wide v1

    sub-long v1, v13, v1

    iget-object v6, v0, Ldi/m$e;->w:Ldi/m;

    invoke-static {v6}, Ldi/m;->d(Ldi/m;)J

    move-result-wide v11

    cmp-long v1, v1, v11

    if-lez v1, :cond_b

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->D()Z

    move-result v1

    if-eqz v1, :cond_a

    sget-object v1, Lsl/t;->a:Lsl/t;

    invoke-virtual {v1, v3}, Lsl/t;->p(Ljava/lang/String;)V

    :cond_a
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Starting a new streak at "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v9, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v1, Ldi/c;

    invoke-direct {v1, v13, v14, v13, v14}, Ldi/c;-><init>(JJ)V

    invoke-static {v7}, Lpt/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v1, v2}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    goto :goto_4

    :cond_b
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v1

    invoke-interface {v1}, Lth/i;->D()Z

    move-result v1

    if-eqz v1, :cond_c

    sget-object v1, Lsl/t;->a:Lsl/t;

    const-string v2, "continued"

    invoke-virtual {v1, v2}, Lsl/t;->p(Ljava/lang/String;)V

    :cond_c
    invoke-virtual {v10}, Ldi/c;->d()J

    move-result-wide v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Continuing existing streak started at "

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v9, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v15, 0x1

    const/16 v16, 0x0

    const-wide/16 v11, 0x0

    invoke-static/range {v10 .. v16}, Ldi/c;->b(Ldi/c;JJILjava/lang/Object;)Ldi/c;

    move-result-object v1

    invoke-static {v7}, Lpt/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v1, v2}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    :goto_4
    invoke-virtual {v1}, Lkotlin/Pair;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ldi/c;

    invoke-virtual {v1}, Lkotlin/Pair;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iget-object v3, v0, Ldi/m$e;->w:Ldi/m;

    invoke-static {v3}, Ldi/m;->c(Ldi/m;)Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    const-string v4, "login_streak_current_time"

    invoke-static {v2}, Lgk/n;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v4, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    if-eqz v1, :cond_d

    invoke-interface {v3, v5}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    :cond_d
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v1
.end method
