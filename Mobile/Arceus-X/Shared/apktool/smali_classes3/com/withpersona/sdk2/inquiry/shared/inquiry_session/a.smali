.class public final Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001a\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0086@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Landroid/content/Context;",
        "context",
        "Ltq/a;",
        "a",
        "(Landroid/content/Context;Lnt/b;)Ljava/lang/Object;",
        "",
        "b",
        "(Landroid/content/Context;)Z",
        "shared_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Landroid/content/Context;Lnt/b;)Ljava/lang/Object;
    .locals 8
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lnt/b<",
            "-",
            "Ltq/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/a$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/a$a;

    iget v1, v0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/a$a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/a$a;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/a$a;

    invoke-direct {v0, p1}, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/a$a;-><init>(Lnt/b;)V

    :goto_0
    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/a$a;->x:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/a$a;->y:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget p0, v0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/a$a;->w:I

    iget v1, v0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/a$a;->v:I

    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/a$a;->u:Ljava/lang/Object;

    check-cast v2, Llb/b;

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/a$a;->t:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    :try_start_0
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    invoke-static {p0}, Llb/f;->a(Landroid/content/Context;)Llb/b;

    move-result-object p1

    const-string v2, "getFusedLocationProviderClient(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_1
    const-string v2, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {p0, v2}, Ll2/b;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    const/4 v5, 0x0

    if-nez v2, :cond_3

    move v2, v4

    goto :goto_1

    :cond_3
    move v2, v5

    :goto_1
    const-string v6, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {p0, v6}, Ll2/b;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v6

    if-nez v6, :cond_4

    move v5, v4

    :cond_4
    if-nez v2, :cond_6

    if-eqz v5, :cond_5

    goto :goto_2

    :cond_5
    move-object p1, v3

    goto :goto_4

    :cond_6
    :goto_2
    invoke-interface {p1}, Llb/b;->getLastLocation()Lcom/google/android/gms/tasks/Task;

    move-result-object v6

    const-string v7, "getLastLocation(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    iput-object p0, v0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/a$a;->t:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    iput-object p0, v0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/a$a;->u:Ljava/lang/Object;

    iput v2, v0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/a$a;->v:I

    iput v5, v0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/a$a;->w:I

    iput v4, v0, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/a$a;->y:I

    invoke-static {v6, v0}, Lvu/b;->a(Lcom/google/android/gms/tasks/Task;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    return-object v1

    :cond_7
    move v1, v2

    move p0, v5

    :goto_3
    check-cast p1, Landroid/location/Location;

    move v5, p0

    move v2, v1

    :goto_4
    if-eqz v2, :cond_8

    sget-object p0, Ltq/b;->b:Ltq/b;

    goto :goto_5

    :cond_8
    if-eqz v5, :cond_9

    sget-object p0, Ltq/b;->a:Ltq/b;

    goto :goto_5

    :cond_9
    move-object p0, v3

    :goto_5
    if-eqz p1, :cond_a

    if-eqz p0, :cond_a

    new-instance v0, Ltq/a;

    invoke-direct {v0, p1, p0}, Ltq/a;-><init>(Landroid/location/Location;Ltq/b;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    :catch_0
    :cond_a
    return-object v3
.end method

.method public static final b(Landroid/content/Context;)Z
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type android.location.LocationManager"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroid/location/LocationManager;

    const-string v0, "gps"

    invoke-virtual {p0, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method
