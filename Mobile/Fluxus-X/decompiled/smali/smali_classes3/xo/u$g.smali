.class public final Lxo/u$g;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxo/u;->t(Lvo/y3$b;Lnn/z;)V
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
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner$showRendering$6"
    f = "CameraScreenRunner.kt"
    l = {
        0xf9,
        0x101
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lav/p0;",
        "",
        "<anonymous>",
        "(Lav/p0;)V"
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

.field public final synthetic B:Lvo/y3$b;

.field public final synthetic C:Lxo/u;

.field public t:I

.field public u:I

.field public v:I

.field public w:I

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lvo/y3$b;Lxo/u;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvo/y3$b;",
            "Lxo/u;",
            "Leu/b<",
            "-",
            "Lxo/u$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lxo/u$g;->B:Lvo/y3$b;

    iput-object p2, p0, Lxo/u$g;->C:Lxo/u;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lgu/m;-><init>(ILeu/b;)V

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

    new-instance p1, Lxo/u$g;

    iget-object v0, p0, Lxo/u$g;->B:Lvo/y3$b;

    iget-object v1, p0, Lxo/u$g;->C:Lxo/u;

    invoke-direct {p1, v0, v1, p2}, Lxo/u$g;-><init>(Lvo/y3$b;Lxo/u;Leu/b;)V

    return-object p1
.end method

.method public final invoke(Lav/p0;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lav/p0;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lxo/u$g;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lxo/u$g;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lxo/u$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lxo/u$g;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lxo/u$g;->A:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v5, :cond_1

    if-ne v1, v3, :cond_0

    iget-object v0, p0, Lxo/u$g;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v1, p0, Lxo/u$g;->u:I

    iget v6, p0, Lxo/u$g;->t:I

    iget-object v7, p0, Lxo/u$g;->z:Ljava/lang/Object;

    check-cast v7, Ljava/util/ArrayList;

    iget-object v8, p0, Lxo/u$g;->y:Ljava/lang/Object;

    check-cast v8, Ljava/util/ArrayList;

    iget-object v9, p0, Lxo/u$g;->x:Ljava/lang/Object;

    check-cast v9, Lxo/u;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    check-cast p1, Lzt/n;

    invoke-virtual {p1}, Lzt/n;->j()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lxo/u$g;->B:Lvo/y3$b;

    invoke-virtual {p1}, Lvo/y3$b;->I()I

    move-result p1

    iget-object v1, p0, Lxo/u$g;->C:Lxo/u;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6, p1}, Ljava/util/ArrayList;-><init>(I)V

    move-object v9, v1

    move v1, v2

    :goto_0
    if-ge v1, p1, :cond_5

    invoke-static {v9}, Lxo/u;->h(Lxo/u;)Lsn/i;

    move-result-object v7

    iput-object v9, p0, Lxo/u$g;->x:Ljava/lang/Object;

    iput-object v6, p0, Lxo/u$g;->y:Ljava/lang/Object;

    iput-object v6, p0, Lxo/u$g;->z:Ljava/lang/Object;

    iput p1, p0, Lxo/u$g;->t:I

    iput v1, p0, Lxo/u$g;->u:I

    iput v1, p0, Lxo/u$g;->v:I

    iput v2, p0, Lxo/u$g;->w:I

    iput v5, p0, Lxo/u$g;->A:I

    invoke-interface {v7, p0}, Lsn/i;->g(Leu/b;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v0, :cond_3

    goto :goto_3

    :cond_3
    move-object v8, v6

    move v6, p1

    move-object p1, v7

    move-object v7, v8

    :goto_1
    invoke-static {p1}, Lzt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v10

    if-nez v10, :cond_4

    check-cast p1, Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_4
    move-object p1, v4

    :goto_2
    invoke-virtual {v7, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/2addr v1, v5

    move p1, v6

    move-object v6, v8

    goto :goto_0

    :cond_5
    iget-object p1, p0, Lxo/u$g;->C:Lxo/u;

    invoke-static {p1}, Lxo/u;->m(Lxo/u;)Lxo/w;

    move-result-object p1

    invoke-interface {p1}, Lxo/w;->f()V

    iget-object p1, p0, Lxo/u$g;->C:Lxo/u;

    invoke-static {p1}, Lxo/u;->m(Lxo/u;)Lxo/w;

    move-result-object p1

    iput-object v6, p0, Lxo/u$g;->x:Ljava/lang/Object;

    iput-object v4, p0, Lxo/u$g;->y:Ljava/lang/Object;

    iput-object v4, p0, Lxo/u$g;->z:Ljava/lang/Object;

    iput v3, p0, Lxo/u$g;->A:I

    invoke-interface {p1, p0}, Lxo/w;->d(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_3
    return-object v0

    :cond_6
    move-object v0, v6

    :goto_4
    iget-object p1, p0, Lxo/u$g;->B:Lvo/y3$b;

    invoke-virtual {p1}, Lvo/y3$b;->d()Lkotlin/jvm/functions/Function2;

    move-result-object p1

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->a0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lxo/u$g;->C:Lxo/u;

    invoke-static {v1}, Lxo/u;->h(Lxo/u;)Lsn/i;

    move-result-object v1

    invoke-interface {v1}, Lsn/i;->f()Lsn/v;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
