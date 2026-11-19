.class public final Lnq/k0$f;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnq/k0;->H(Lmq/q5$d$a;Ljr/a;)V
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
    c = "com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner$showRendering$2"
    f = "CameraScreenRunner.kt"
    l = {
        0xc0,
        0xc2
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
.field public t:I

.field public final synthetic u:Lsn/i;

.field public final synthetic v:Lnq/k0;

.field public final synthetic w:Lmq/q5$d$a$a;

.field public final synthetic x:Lmq/q5$d$a;


# direct methods
.method public constructor <init>(Lsn/i;Lnq/k0;Lmq/q5$d$a$a;Lmq/q5$d$a;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsn/i;",
            "Lnq/k0;",
            "Lmq/q5$d$a$a;",
            "Lmq/q5$d$a;",
            "Leu/b<",
            "-",
            "Lnq/k0$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lnq/k0$f;->u:Lsn/i;

    iput-object p2, p0, Lnq/k0$f;->v:Lnq/k0;

    iput-object p3, p0, Lnq/k0$f;->w:Lmq/q5$d$a$a;

    iput-object p4, p0, Lnq/k0$f;->x:Lmq/q5$d$a;

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

    new-instance v0, Lnq/k0$f;

    iget-object v1, p0, Lnq/k0$f;->u:Lsn/i;

    iget-object v2, p0, Lnq/k0$f;->v:Lnq/k0;

    iget-object v3, p0, Lnq/k0$f;->w:Lmq/q5$d$a$a;

    iget-object v4, p0, Lnq/k0$f;->x:Lmq/q5$d$a;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lnq/k0$f;-><init>(Lsn/i;Lnq/k0;Lmq/q5$d$a$a;Lmq/q5$d$a;Leu/b;)V

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
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lnq/k0$f;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lnq/k0$f;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lnq/k0$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lnq/k0$f;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lnq/k0$f;->t:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lnq/k0$f;->u:Lsn/i;

    invoke-interface {p1}, Lsn/i;->b()Ldv/p0;

    move-result-object p1

    new-instance v1, Lnq/k0$f$a;

    const/4 v4, 0x0

    invoke-direct {v1, v4}, Lnq/k0$f$a;-><init>(Leu/b;)V

    invoke-static {p1, v1}, Ldv/j;->O(Ldv/h;Lkotlin/jvm/functions/Function2;)Ldv/h;

    move-result-object p1

    iput v3, p0, Lnq/k0$f;->t:I

    invoke-static {p1, p0}, Ldv/j;->i(Ldv/h;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    invoke-static {}, Lav/g1;->c()Lav/n2;

    move-result-object p1

    new-instance v3, Lnq/k0$f$b;

    iget-object v4, p0, Lnq/k0$f;->u:Lsn/i;

    iget-object v5, p0, Lnq/k0$f;->v:Lnq/k0;

    iget-object v6, p0, Lnq/k0$f;->w:Lmq/q5$d$a$a;

    iget-object v7, p0, Lnq/k0$f;->x:Lmq/q5$d$a;

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v8}, Lnq/k0$f$b;-><init>(Lsn/i;Lnq/k0;Lmq/q5$d$a$a;Lmq/q5$d$a;Leu/b;)V

    iput v2, p0, Lnq/k0$f;->t:I

    invoke-static {p1, v3, p0}, Lav/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    :goto_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
