.class public final Lzp/k0$h;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzp/k0;->X(Lzp/k0;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;Lfn/g;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;)V
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
    c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$takePhoto$1"
    f = "CameraScreenRunner.kt"
    l = {
        0x158,
        0x15d
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public u:I

.field public synthetic v:Ljava/lang/Object;

.field public final synthetic w:Lzp/k0;

.field public final synthetic x:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;

.field public final synthetic y:Lfn/g;

.field public final synthetic z:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;


# direct methods
.method public constructor <init>(Lzp/k0;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;Lfn/g;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzp/k0;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;",
            "Lfn/g;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;",
            "Lnt/b<",
            "-",
            "Lzp/k0$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lzp/k0$h;->w:Lzp/k0;

    iput-object p2, p0, Lzp/k0$h;->x:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;

    iput-object p3, p0, Lzp/k0$h;->y:Lfn/g;

    iput-object p4, p0, Lzp/k0$h;->z:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 6
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

    new-instance v0, Lzp/k0$h;

    iget-object v1, p0, Lzp/k0$h;->w:Lzp/k0;

    iget-object v2, p0, Lzp/k0$h;->x:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;

    iget-object v3, p0, Lzp/k0$h;->y:Lfn/g;

    iget-object v4, p0, Lzp/k0$h;->z:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lzp/k0$h;-><init>(Lzp/k0;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;Lfn/g;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;Lnt/b;)V

    iput-object p1, v0, Lzp/k0$h;->v:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lzp/k0$h;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lzp/k0$h;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lzp/k0$h;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lzp/k0$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lzp/k0$h;->v:Ljava/lang/Object;

    check-cast v0, Lku/p0;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lzp/k0$h;->u:I

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v5, :cond_1

    if-ne v2, v3, :cond_0

    iget v1, p0, Lzp/k0$h;->t:I

    :try_start_0
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    check-cast p1, Ljt/n;

    invoke-virtual {p1}, Ljt/n;->j()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception p1

    goto/16 :goto_6

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v2, p0, Lzp/k0$h;->t:I

    :try_start_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    :try_start_2
    iget-object p1, p0, Lzp/k0$h;->w:Lzp/k0;

    invoke-static {p1, v5}, Lzp/k0;->A(Lzp/k0;Z)V

    iget-object p1, p0, Lzp/k0$h;->x:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;->L()Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lzp/k0$h;->x:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;->J()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lzp/k0$h;->x:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;->K()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    move v2, v4

    goto :goto_1

    :cond_4
    :goto_0
    move v2, v5

    :goto_1
    if-eqz v2, :cond_5

    iget-object p1, p0, Lzp/k0$h;->w:Lzp/k0;

    invoke-static {p1, v5}, Lzp/k0;->y(Lzp/k0;Z)V

    iput-object v0, p0, Lzp/k0$h;->v:Ljava/lang/Object;

    iput v2, p0, Lzp/k0$h;->t:I

    iput v5, p0, Lzp/k0$h;->u:I

    const-wide/16 v5, 0x3e8

    invoke-static {v5, v6, p0}, Lku/z0;->b(JLnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    invoke-static {v0}, Lku/q0;->h(Lku/p0;)V

    iget-object p1, p0, Lzp/k0$h;->y:Lfn/g;

    iput-object v0, p0, Lzp/k0$h;->v:Ljava/lang/Object;

    iput v2, p0, Lzp/k0$h;->t:I

    iput v3, p0, Lzp/k0$h;->u:I

    invoke-interface {p1, p0}, Lfn/g;->k(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_3
    return-object v1

    :cond_6
    move v1, v2

    :goto_4
    invoke-static {v0}, Lku/q0;->h(Lku/p0;)V

    iget-object v0, p0, Lzp/k0$h;->z:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;

    invoke-static {p1}, Ljt/n;->h(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    move-object v2, p1

    check-cast v2, Ljava/io/File;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$e;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$e;->d()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    const-string v3, "getAbsolutePath(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    iget-object v0, p0, Lzp/k0$h;->z:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;

    invoke-static {p1}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_9

    instance-of v2, p1, Lhn/o0;

    if-eqz v2, :cond_8

    goto :goto_5

    :cond_8
    check-cast v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$e;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$e;->c()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    :goto_5
    if-eqz v1, :cond_a

    iget-object p1, p0, Lzp/k0$h;->w:Lzp/k0;

    invoke-static {p1, v4}, Lzp/k0;->y(Lzp/k0;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_a
    iget-object p1, p0, Lzp/k0$h;->w:Lzp/k0;

    invoke-static {p1, v4}, Lzp/k0;->A(Lzp/k0;Z)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :goto_6
    iget-object v0, p0, Lzp/k0$h;->w:Lzp/k0;

    invoke-static {v0, v4}, Lzp/k0;->A(Lzp/k0;Z)V

    throw p1
.end method
