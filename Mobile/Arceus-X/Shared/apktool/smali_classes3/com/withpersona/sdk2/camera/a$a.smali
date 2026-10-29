.class public final Lcom/withpersona/sdk2/camera/a$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lzt/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/camera/a;->a(Lnu/p0;)Lnu/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lzt/n<",
        "Lnu/i<",
        "-",
        "Lcom/withpersona/sdk2/camera/d;",
        ">;",
        "Lcom/withpersona/sdk2/camera/d;",
        "Lnt/b<",
        "-",
        "Ljava/lang/Boolean;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u0003*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lnu/i;",
        "Lcom/withpersona/sdk2/camera/d;",
        "state",
        "",
        "<anonymous>",
        "(Lnu/i;Lcom/withpersona/sdk2/camera/d;)Z"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.withpersona.sdk2.camera.CameraControllerKt$completeWhenClosed$1"
    f = "CameraController.kt"
    l = {
        0x64
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public synthetic u:Ljava/lang/Object;

.field public synthetic v:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lnt/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/camera/a$a;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnu/i;

    check-cast p2, Lcom/withpersona/sdk2/camera/d;

    check-cast p3, Lnt/b;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/camera/a$a;->q(Lnu/i;Lcom/withpersona/sdk2/camera/d;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/withpersona/sdk2/camera/a$a;->u:Ljava/lang/Object;

    check-cast v0, Lnu/i;

    iget-object v1, p0, Lcom/withpersona/sdk2/camera/a$a;->v:Ljava/lang/Object;

    check-cast v1, Lcom/withpersona/sdk2/camera/d;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v2

    iget v3, p0, Lcom/withpersona/sdk2/camera/a$a;->t:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/camera/a$a;->u:Ljava/lang/Object;

    iput-object v1, p0, Lcom/withpersona/sdk2/camera/a$a;->v:Ljava/lang/Object;

    iput v4, p0, Lcom/withpersona/sdk2/camera/a$a;->t:I

    invoke-interface {v0, v1, p0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_2

    return-object v2

    :cond_2
    :goto_0
    instance-of p1, v1, Lcom/withpersona/sdk2/camera/d$a;

    if-eqz p1, :cond_4

    check-cast v1, Lcom/withpersona/sdk2/camera/d$a;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/camera/d$a;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    :cond_4
    :goto_1
    invoke-static {v4}, Lpt/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final q(Lnu/i;Lcom/withpersona/sdk2/camera/d;Lnt/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/i<",
            "-",
            "Lcom/withpersona/sdk2/camera/d;",
            ">;",
            "Lcom/withpersona/sdk2/camera/d;",
            "Lnt/b<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/camera/a$a;

    invoke-direct {v0, p3}, Lcom/withpersona/sdk2/camera/a$a;-><init>(Lnt/b;)V

    iput-object p1, v0, Lcom/withpersona/sdk2/camera/a$a;->u:Ljava/lang/Object;

    iput-object p2, v0, Lcom/withpersona/sdk2/camera/a$a;->v:Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {v0, p1}, Lcom/withpersona/sdk2/camera/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
