.class public final Lnp/q0$d;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnp/q0;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lav/p0;",
        "Leu/b<",
        "-",
        "Ljava/util/List<",
        "+",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$restoreComponentConfigs$2"
    f = "UiStepSavedStateHelper.kt"
    l = {
        0x81,
        0xa2
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lav/p0;",
        "",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;",
        "<anonymous>",
        "(Lav/p0;)Ljava/util/List;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:I

.field public final synthetic w:Lnp/q0;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lnp/q0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnp/q0;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Leu/b<",
            "-",
            "Lnp/q0$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lnp/q0$d;->w:Lnp/q0;

    iput-object p2, p0, Lnp/q0$d;->x:Ljava/lang/String;

    iput-object p3, p0, Lnp/q0$d;->y:Ljava/lang/String;

    iput-object p4, p0, Lnp/q0$d;->z:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 6
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

    new-instance v0, Lnp/q0$d;

    iget-object v1, p0, Lnp/q0$d;->w:Lnp/q0;

    iget-object v2, p0, Lnp/q0$d;->x:Ljava/lang/String;

    iget-object v3, p0, Lnp/q0$d;->y:Ljava/lang/String;

    iget-object v4, p0, Lnp/q0$d;->z:Ljava/lang/String;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lnp/q0$d;-><init>(Lnp/q0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Leu/b;)V

    return-object v0
.end method

.method public final invoke(Lav/p0;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lav/p0;",
            "Leu/b<",
            "-",
            "Ljava/util/List<",
            "+",
            "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lnp/q0$d;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lnp/q0$d;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lnp/q0$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lnp/q0$d;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    const-class v0, Lnp/q0$b;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lnp/q0$d;->v:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lnp/q0$d;->u:Ljava/lang/Object;

    check-cast v0, Lnp/q0$b;

    iget-object v1, p0, Lnp/q0$d;->t:Ljava/lang/Object;

    check-cast v1, Landroid/os/Parcel;

    :try_start_0
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto/16 :goto_5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v2, p0, Lnp/q0$d;->t:Ljava/lang/Object;

    check-cast v2, Landroid/os/Parcel;

    :try_start_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lnp/q0$d;->w:Lnp/q0;

    invoke-static {p1}, Lnp/q0;->a(Lnp/q0;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p1

    if-nez p1, :cond_3

    return-object v5

    :cond_3
    :try_start_2
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v2

    const-string p1, "obtain(...)"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :try_start_3
    invoke-static {}, Lav/g1;->b()Lav/l0;

    move-result-object p1

    new-instance v6, Lnp/q0$d$b;

    iget-object v7, p0, Lnp/q0$d;->w:Lnp/q0;

    invoke-direct {v6, v7, v2, v5}, Lnp/q0$d$b;-><init>(Lnp/q0;Landroid/os/Parcel;Leu/b;)V

    iput-object v2, p0, Lnp/q0$d;->t:Ljava/lang/Object;

    iput v4, p0, Lnp/q0$d;->v:I

    invoke-static {p1, v6, p0}, Lav/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_4

    :cond_4
    :goto_0
    const/4 p1, 0x0

    invoke-virtual {v2, p1}, Landroid/os/Parcel;->setDataPosition(I)V

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/os/Parcel;->readBundle(Ljava/lang/ClassLoader;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_5

    const-string v4, "data"

    invoke-static {p1, v4, v0}, Lu2/c;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnp/q0$b;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :cond_5
    move-object p1, v5

    :goto_1
    :try_start_4
    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    move-object v0, p1

    goto :goto_3

    :goto_2
    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    throw p1

    :catch_0
    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    move-object v0, v5

    :goto_3
    if-nez v0, :cond_6

    return-object v5

    :cond_6
    invoke-virtual {v0}, Lnp/q0$b;->A()Ljava/lang/String;

    move-result-object p1

    iget-object v4, p0, Lnp/q0$d;->x:Ljava/lang/String;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-virtual {v0}, Lnp/q0$b;->a()Ljava/lang/String;

    move-result-object p1

    iget-object v4, p0, Lnp/q0$d;->y:Ljava/lang/String;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-virtual {v0}, Lnp/q0$b;->f()Ljava/lang/String;

    move-result-object p1

    iget-object v4, p0, Lnp/q0$d;->z:Ljava/lang/String;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_6

    :cond_7
    invoke-static {}, Lav/g1;->c()Lav/n2;

    move-result-object p1

    new-instance v4, Lnp/q0$d$a;

    iget-object v6, p0, Lnp/q0$d;->w:Lnp/q0;

    invoke-direct {v4, v6, v0, v5}, Lnp/q0$d$a;-><init>(Lnp/q0;Lnp/q0$b;Leu/b;)V

    invoke-static {v2}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lnp/q0$d;->t:Ljava/lang/Object;

    iput-object v0, p0, Lnp/q0$d;->u:Ljava/lang/Object;

    iput v3, p0, Lnp/q0$d;->v:I

    invoke-static {p1, v4, p0}, Lav/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_4
    return-object v1

    :cond_8
    :goto_5
    invoke-virtual {v0}, Lnp/q0$b;->g()Ljava/util/List;

    move-result-object v5
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    nop

    :catch_1
    :cond_9
    :goto_6
    return-object v5
.end method
