.class public final Lxo/u$f;
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
    c = "com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner$showRendering$2$1"
    f = "CameraScreenRunner.kt"
    l = {
        0xd1
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
.field public A:Ljava/lang/Object;

.field public B:I

.field public final synthetic C:Lvo/y3$b;

.field public final synthetic D:Lxo/u;

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
            "Lxo/u$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lxo/u$f;->C:Lvo/y3$b;

    iput-object p2, p0, Lxo/u$f;->D:Lxo/u;

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

    new-instance p1, Lxo/u$f;

    iget-object v0, p0, Lxo/u$f;->C:Lvo/y3$b;

    iget-object v1, p0, Lxo/u$f;->D:Lxo/u;

    invoke-direct {p1, v0, v1, p2}, Lxo/u$f;-><init>(Lvo/y3$b;Lxo/u;Leu/b;)V

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
    invoke-virtual {p0, p1, p2}, Lxo/u$f;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lxo/u$f;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lxo/u$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lxo/u$f;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lxo/u$f;->B:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    iget v1, p0, Lxo/u$f;->u:I

    iget v4, p0, Lxo/u$f;->t:I

    iget-object v5, p0, Lxo/u$f;->A:Ljava/lang/Object;

    check-cast v5, Ljava/util/ArrayList;

    iget-object v6, p0, Lxo/u$f;->z:Ljava/lang/Object;

    check-cast v6, Ljava/util/ArrayList;

    iget-object v7, p0, Lxo/u$f;->y:Ljava/lang/Object;

    check-cast v7, Lvo/y3$b;

    iget-object v8, p0, Lxo/u$f;->x:Ljava/lang/Object;

    check-cast v8, Lxo/u;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    check-cast p1, Lzt/n;

    invoke-virtual {p1}, Lzt/n;->j()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lxo/u$f;->C:Lvo/y3$b;

    invoke-virtual {p1}, Lvo/y3$b;->I()I

    move-result p1

    iget-object v1, p0, Lxo/u$f;->D:Lxo/u;

    iget-object v4, p0, Lxo/u$f;->C:Lvo/y3$b;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, p1}, Ljava/util/ArrayList;-><init>(I)V

    move-object v8, v1

    move v1, v2

    move-object v7, v4

    move v4, p1

    :goto_0
    if-ge v1, v4, :cond_5

    invoke-static {v8}, Lxo/u;->h(Lxo/u;)Lsn/i;

    move-result-object p1

    iput-object v8, p0, Lxo/u$f;->x:Ljava/lang/Object;

    iput-object v7, p0, Lxo/u$f;->y:Ljava/lang/Object;

    iput-object v5, p0, Lxo/u$f;->z:Ljava/lang/Object;

    iput-object v5, p0, Lxo/u$f;->A:Ljava/lang/Object;

    iput v4, p0, Lxo/u$f;->t:I

    iput v1, p0, Lxo/u$f;->u:I

    iput v1, p0, Lxo/u$f;->v:I

    iput v2, p0, Lxo/u$f;->w:I

    iput v3, p0, Lxo/u$f;->B:I

    invoke-interface {p1, p0}, Lsn/i;->g(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v6, v5

    :goto_1
    invoke-static {p1}, Lzt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v9

    if-nez v9, :cond_3

    check-cast p1, Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/2addr v1, v3

    move-object v5, v6

    goto :goto_0

    :cond_3
    instance-of p1, v9, Lun/o0;

    if-eqz p1, :cond_4

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_4
    invoke-virtual {v7}, Lvo/y3$b;->E()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    invoke-interface {p1, v9}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_5
    iget-object p1, p0, Lxo/u$f;->D:Lxo/u;

    invoke-static {p1}, Lxo/u;->m(Lxo/u;)Lxo/w;

    move-result-object p1

    invoke-interface {p1}, Lxo/w;->f()V

    iget-object p1, p0, Lxo/u$f;->C:Lvo/y3$b;

    invoke-virtual {p1}, Lvo/y3$b;->y()Lkotlin/jvm/functions/Function2;

    move-result-object p1

    iget-object v0, p0, Lxo/u$f;->D:Lxo/u;

    invoke-static {v0}, Lxo/u;->h(Lxo/u;)Lsn/i;

    move-result-object v0

    invoke-interface {v0}, Lsn/i;->f()Lsn/v;

    move-result-object v0

    invoke-interface {p1, v5, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
