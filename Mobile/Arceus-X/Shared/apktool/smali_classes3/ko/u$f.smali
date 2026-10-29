.class public final Lko/u$f;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lko/u;->t(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Lan/y;)V
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
    c = "com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner$showRendering$2$1"
    f = "CameraScreenRunner.kt"
    l = {
        0xd1
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public A:Ljava/lang/Object;

.field public B:I

.field public final synthetic C:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

.field public final synthetic D:Lko/u;

.field public t:I

.field public u:I

.field public v:I

.field public w:I

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Lko/u;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;",
            "Lko/u;",
            "Lnt/b<",
            "-",
            "Lko/u$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lko/u$f;->C:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

    iput-object p2, p0, Lko/u$f;->D:Lko/u;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 2
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

    new-instance p1, Lko/u$f;

    iget-object v0, p0, Lko/u$f;->C:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

    iget-object v1, p0, Lko/u$f;->D:Lko/u;

    invoke-direct {p1, v0, v1, p2}, Lko/u$f;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;Lko/u;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lko/u$f;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lko/u$f;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lko/u$f;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lko/u$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lko/u$f;->B:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    iget v1, p0, Lko/u$f;->u:I

    iget v4, p0, Lko/u$f;->t:I

    iget-object v5, p0, Lko/u$f;->A:Ljava/lang/Object;

    check-cast v5, Ljava/util/ArrayList;

    iget-object v6, p0, Lko/u$f;->z:Ljava/lang/Object;

    check-cast v6, Ljava/util/ArrayList;

    iget-object v7, p0, Lko/u$f;->y:Ljava/lang/Object;

    check-cast v7, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

    iget-object v8, p0, Lko/u$f;->x:Ljava/lang/Object;

    check-cast v8, Lko/u;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    check-cast p1, Ljt/n;

    invoke-virtual {p1}, Ljt/n;->j()Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lko/u$f;->C:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;->I()I

    move-result p1

    iget-object v1, p0, Lko/u$f;->D:Lko/u;

    iget-object v4, p0, Lko/u$f;->C:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, p1}, Ljava/util/ArrayList;-><init>(I)V

    move-object v8, v1

    move v1, v2

    move-object v7, v4

    move v4, p1

    :goto_0
    if-ge v1, v4, :cond_5

    invoke-static {v8}, Lko/u;->h(Lko/u;)Lfn/g;

    move-result-object p1

    iput-object v8, p0, Lko/u$f;->x:Ljava/lang/Object;

    iput-object v7, p0, Lko/u$f;->y:Ljava/lang/Object;

    iput-object v5, p0, Lko/u$f;->z:Ljava/lang/Object;

    iput-object v5, p0, Lko/u$f;->A:Ljava/lang/Object;

    iput v4, p0, Lko/u$f;->t:I

    iput v1, p0, Lko/u$f;->u:I

    iput v1, p0, Lko/u$f;->v:I

    iput v2, p0, Lko/u$f;->w:I

    iput v3, p0, Lko/u$f;->B:I

    invoke-interface {p1, p0}, Lfn/g;->k(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v6, v5

    :goto_1
    invoke-static {p1}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

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
    instance-of p1, v9, Lhn/o0;

    if-eqz p1, :cond_4

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_4
    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;->E()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    invoke-interface {p1, v9}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_5
    iget-object p1, p0, Lko/u$f;->D:Lko/u;

    invoke-static {p1}, Lko/u;->m(Lko/u;)Lko/w;

    move-result-object p1

    invoke-interface {p1}, Lko/w;->e()V

    iget-object p1, p0, Lko/u$f;->C:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;->y()Lkotlin/jvm/functions/Function2;

    move-result-object p1

    iget-object v0, p0, Lko/u$f;->D:Lko/u;

    invoke-static {v0}, Lko/u;->h(Lko/u;)Lfn/g;

    move-result-object v0

    invoke-interface {v0}, Lfn/g;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v0

    invoke-interface {p1, v5, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
