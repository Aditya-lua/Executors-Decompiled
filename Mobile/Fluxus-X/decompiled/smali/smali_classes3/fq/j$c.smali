.class public final Lfq/j$c;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfq/j;->run()Ldv/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Ldv/i<",
        "-",
        "Lfq/j$b;",
        ">;",
        "Leu/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorker$run$1"
    f = "DeviceFeatureRequestWorker.kt"
    l = {
        0x67,
        0x3e,
        0x44,
        0x4d,
        0x55
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Ldv/i;",
        "Lfq/j$b;",
        "",
        "<anonymous>",
        "(Ldv/i;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field public A:I

.field public synthetic B:Ljava/lang/Object;

.field public final synthetic C:Lfq/j;

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:I


# direct methods
.method public constructor <init>(Lfq/j;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfq/j;",
            "Leu/b<",
            "-",
            "Lfq/j$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfq/j$c;->C:Lfq/j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Leu/b<",
            "*>;)",
            "Leu/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lfq/j$c;

    iget-object v1, p0, Lfq/j$c;->C:Lfq/j;

    invoke-direct {v0, v1, p2}, Lfq/j$c;-><init>(Lfq/j;Leu/b;)V

    iput-object p1, v0, Lfq/j$c;->B:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldv/i;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lfq/j$c;->m(Ldv/i;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lfq/j$c;->B:Ljava/lang/Object;

    check-cast v0, Ldv/i;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lfq/j$c;->A:I

    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v2, :cond_5

    if-eq v2, v7, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lfq/j$c;->y:Ljava/lang/Object;

    check-cast v0, Landroid/content/IntentSender$SendIntentException;

    iget-object v0, p0, Lfq/j$c;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    iget-object v0, p0, Lfq/j$c;->v:Ljava/lang/Object;

    check-cast v0, Lmb/i;

    iget-object v0, p0, Lfq/j$c;->u:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/location/LocationSettingsRequest;

    iget-object v0, p0, Lfq/j$c;->t:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/location/LocationRequest;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v2, p0, Lfq/j$c;->y:Ljava/lang/Object;

    check-cast v2, Lg/i;

    iget-object v2, p0, Lfq/j$c;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Throwable;

    iget-object v4, p0, Lfq/j$c;->w:Ljava/lang/Object;

    iget-object v5, p0, Lfq/j$c;->v:Ljava/lang/Object;

    check-cast v5, Lmb/i;

    iget-object v6, p0, Lfq/j$c;->u:Ljava/lang/Object;

    check-cast v6, Lcom/google/android/gms/location/LocationSettingsRequest;

    iget-object v7, p0, Lfq/j$c;->t:Ljava/lang/Object;

    check-cast v7, Lcom/google/android/gms/location/LocationRequest;

    :try_start_0
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_3

    :catch_0
    move-exception p1

    goto/16 :goto_4

    :cond_2
    iget-object v0, p0, Lfq/j$c;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    iget-object v0, p0, Lfq/j$c;->v:Ljava/lang/Object;

    check-cast v0, Lmb/i;

    iget-object v0, p0, Lfq/j$c;->u:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/location/LocationSettingsRequest;

    iget-object v0, p0, Lfq/j$c;->t:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/location/LocationRequest;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_3
    iget-object v0, p0, Lfq/j$c;->v:Ljava/lang/Object;

    check-cast v0, Lmb/i;

    iget-object v0, p0, Lfq/j$c;->u:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/location/LocationSettingsRequest;

    iget-object v0, p0, Lfq/j$c;->t:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/location/LocationRequest;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_4
    iget-object v2, p0, Lfq/j$c;->v:Ljava/lang/Object;

    check-cast v2, Lmb/i;

    iget-object v7, p0, Lfq/j$c;->u:Ljava/lang/Object;

    check-cast v7, Lcom/google/android/gms/location/LocationSettingsRequest;

    iget-object v8, p0, Lfq/j$c;->t:Ljava/lang/Object;

    check-cast v8, Lcom/google/android/gms/location/LocationRequest;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_5
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    new-instance p1, Lcom/google/android/gms/location/LocationRequest$Builder;

    const-wide/16 v8, 0x2710

    invoke-direct {p1, v8, v9}, Lcom/google/android/gms/location/LocationRequest$Builder;-><init>(J)V

    const/16 v2, 0x64

    invoke-virtual {p1, v2}, Lcom/google/android/gms/location/LocationRequest$Builder;->setPriority(I)Lcom/google/android/gms/location/LocationRequest$Builder;

    move-result-object p1

    const-wide/16 v8, 0x1388

    invoke-virtual {p1, v8, v9}, Lcom/google/android/gms/location/LocationRequest$Builder;->setMinUpdateIntervalMillis(J)Lcom/google/android/gms/location/LocationRequest$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/location/LocationRequest$Builder;->build()Lcom/google/android/gms/location/LocationRequest;

    move-result-object p1

    const-string v2, "build(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, Lcom/google/android/gms/location/LocationSettingsRequest$a;

    invoke-direct {v8}, Lcom/google/android/gms/location/LocationSettingsRequest$a;-><init>()V

    invoke-virtual {v8, p1}, Lcom/google/android/gms/location/LocationSettingsRequest$a;->a(Lcom/google/android/gms/location/LocationRequest;)Lcom/google/android/gms/location/LocationSettingsRequest$a;

    move-result-object v8

    invoke-virtual {v8, v7}, Lcom/google/android/gms/location/LocationSettingsRequest$a;->c(Z)Lcom/google/android/gms/location/LocationSettingsRequest$a;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/location/LocationSettingsRequest$a;->b()Lcom/google/android/gms/location/LocationSettingsRequest;

    move-result-object v8

    invoke-static {v8, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lfq/j$c;->C:Lfq/j;

    invoke-static {v2}, Lfq/j;->d(Lfq/j;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lmb/f;->b(Landroid/content/Context;)Lmb/i;

    move-result-object v2

    const-string v9, "getSettingsClient(...)"

    invoke-static {v2, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lfq/j$c;->B:Ljava/lang/Object;

    invoke-static {p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, p0, Lfq/j$c;->t:Ljava/lang/Object;

    iput-object v8, p0, Lfq/j$c;->u:Ljava/lang/Object;

    iput-object v2, p0, Lfq/j$c;->v:Ljava/lang/Object;

    const/4 v9, 0x0

    iput v9, p0, Lfq/j$c;->z:I

    iput v7, p0, Lfq/j$c;->A:I

    new-instance v9, Lav/p;

    invoke-static {p0}, Lfu/b;->c(Leu/b;)Leu/b;

    move-result-object v10

    invoke-direct {v9, v10, v7}, Lav/p;-><init>(Leu/b;I)V

    invoke-virtual {v9}, Lav/p;->G()V

    invoke-interface {v2, v8}, Lmb/i;->checkLocationSettings(Lcom/google/android/gms/location/LocationSettingsRequest;)Lcom/google/android/gms/tasks/Task;

    move-result-object v7

    const-string v10, "checkLocationSettings(...)"

    invoke-static {v7, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v10, Lfq/j$c$b;

    invoke-direct {v10, v9}, Lfq/j$c$b;-><init>(Lav/n;)V

    new-instance v11, Lfq/j$d;

    invoke-direct {v11, v10}, Lfq/j$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v7, v11}, Lcom/google/android/gms/tasks/Task;->g(Ltb/g;)Lcom/google/android/gms/tasks/Task;

    new-instance v10, Lfq/j$c$c;

    invoke-direct {v10, v9}, Lfq/j$c$c;-><init>(Lav/n;)V

    invoke-virtual {v7, v10}, Lcom/google/android/gms/tasks/Task;->e(Ltb/f;)Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v9}, Lav/p;->y()Ljava/lang/Object;

    move-result-object v7

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v9

    if-ne v7, v9, :cond_6

    invoke-static {p0}, Lgu/h;->c(Leu/b;)V

    :cond_6
    if-ne v7, v1, :cond_7

    goto/16 :goto_5

    :cond_7
    move-object v12, v8

    move-object v8, p1

    move-object p1, v7

    move-object v7, v12

    :goto_0
    check-cast p1, Lzt/n;

    invoke-virtual {p1}, Lzt/n;->j()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lzt/n;->h(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    sget-object v3, Lfq/j$b$c;->a:Lfq/j$b$c;

    invoke-static {v0}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, p0, Lfq/j$c;->B:Ljava/lang/Object;

    invoke-static {v8}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, p0, Lfq/j$c;->t:Ljava/lang/Object;

    invoke-static {v7}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, p0, Lfq/j$c;->u:Ljava/lang/Object;

    invoke-static {v2}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lfq/j$c;->v:Ljava/lang/Object;

    invoke-static {p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lfq/j$c;->w:Ljava/lang/Object;

    iput v6, p0, Lfq/j$c;->A:I

    invoke-interface {v0, v3, p0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto/16 :goto_5

    :cond_8
    :goto_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_9
    invoke-static {p1}, Lzt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v6

    instance-of v9, v6, Ll9/n;

    if-nez v9, :cond_b

    sget-object v3, Lfq/j$b$b;->a:Lfq/j$b$b;

    invoke-static {v0}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, p0, Lfq/j$c;->B:Ljava/lang/Object;

    invoke-static {v8}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, p0, Lfq/j$c;->t:Ljava/lang/Object;

    invoke-static {v7}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, p0, Lfq/j$c;->u:Ljava/lang/Object;

    invoke-static {v2}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lfq/j$c;->v:Ljava/lang/Object;

    invoke-static {p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lfq/j$c;->w:Ljava/lang/Object;

    invoke-static {v6}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lfq/j$c;->x:Ljava/lang/Object;

    iput v5, p0, Lfq/j$c;->A:I

    invoke-interface {v0, v3, p0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    goto/16 :goto_5

    :cond_a
    :goto_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_b
    :try_start_1
    new-instance v5, Lg/i$a;

    move-object v9, v6

    check-cast v9, Ll9/n;

    invoke-virtual {v9}, Ll9/n;->c()Landroid/app/PendingIntent;

    move-result-object v9

    const-string v10, "getResolution(...)"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v5, v9}, Lg/i$a;-><init>(Landroid/app/PendingIntent;)V

    invoke-virtual {v5}, Lg/i$a;->a()Lg/i;

    move-result-object v5

    iget-object v9, p0, Lfq/j$c;->C:Lfq/j;

    invoke-static {v9}, Lfq/j;->e(Lfq/j;)Lg/d;

    move-result-object v9

    invoke-virtual {v9, v5}, Lg/d;->b(Ljava/lang/Object;)V

    new-instance v9, Laq/g0;

    invoke-direct {v9}, Laq/g0;-><init>()V

    new-instance v10, Lfq/j$c$a;

    invoke-direct {v10, v0}, Lfq/j$c$a;-><init>(Ldv/i;)V

    iput-object v0, p0, Lfq/j$c;->B:Ljava/lang/Object;

    invoke-static {v8}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, p0, Lfq/j$c;->t:Ljava/lang/Object;

    invoke-static {v7}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, p0, Lfq/j$c;->u:Ljava/lang/Object;

    invoke-static {v2}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, p0, Lfq/j$c;->v:Ljava/lang/Object;

    invoke-static {p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, p0, Lfq/j$c;->w:Ljava/lang/Object;

    invoke-static {v6}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, p0, Lfq/j$c;->x:Ljava/lang/Object;

    invoke-static {v5}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, p0, Lfq/j$c;->y:Ljava/lang/Object;

    iput v4, p0, Lfq/j$c;->A:I

    invoke-virtual {v9, v10, p0}, Laq/g0;->collect(Ldv/i;Leu/b;)Ljava/lang/Object;

    move-result-object v4
    :try_end_1
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_1 .. :try_end_1} :catch_1

    if-ne v4, v1, :cond_c

    goto :goto_5

    :cond_c
    move-object v4, p1

    move-object v5, v2

    move-object v2, v6

    move-object v6, v7

    move-object v7, v8

    :goto_3
    :try_start_2
    new-instance p1, Lzt/d;

    invoke-direct {p1}, Lzt/d;-><init>()V

    throw p1
    :try_end_2
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_1
    move-exception v4

    move-object v5, v4

    move-object v4, p1

    move-object p1, v5

    move-object v5, v2

    move-object v2, v6

    move-object v6, v7

    move-object v7, v8

    :goto_4
    sget-object v8, Lfq/j$b$b;->a:Lfq/j$b$b;

    invoke-static {v0}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, p0, Lfq/j$c;->B:Ljava/lang/Object;

    invoke-static {v7}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, p0, Lfq/j$c;->t:Ljava/lang/Object;

    invoke-static {v6}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Lfq/j$c;->u:Ljava/lang/Object;

    invoke-static {v5}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, p0, Lfq/j$c;->v:Ljava/lang/Object;

    invoke-static {v4}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, p0, Lfq/j$c;->w:Ljava/lang/Object;

    invoke-static {v2}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lfq/j$c;->x:Ljava/lang/Object;

    invoke-static {p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lfq/j$c;->y:Ljava/lang/Object;

    iput v3, p0, Lfq/j$c;->A:I

    invoke-interface {v0, v8, p0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_d

    :goto_5
    return-object v1

    :cond_d
    :goto_6
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final m(Ldv/i;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldv/i<",
            "-",
            "Lfq/j$b;",
            ">;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lfq/j$c;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lfq/j$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lfq/j$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
