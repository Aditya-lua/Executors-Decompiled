.class public final Lip/j$a;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lip/j;->i(Lvo/d2$a;Lvo/j0$e;Lln/k$a;Lip/l;)Ljava/lang/Object;
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
    c = "com.withpersona.sdk2.inquiry.governmentid.video_capture.LocalVideoCaptureRenderer$renderFinalizeVideoCapture$1"
    f = "LocalVideoCaptureRenderer.kt"
    l = {
        0x2d
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

.field public final synthetic u:Lvo/j0$e;

.field public final synthetic v:Lln/k$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lln/k<",
            "Lvo/d2$a;",
            "Lvo/j0;",
            "Lvo/d2$b;",
            "Ljava/lang/Object;",
            ">.a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lvo/j0$e;Lln/k$a;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvo/j0$e;",
            "Lln/k<",
            "-",
            "Lvo/d2$a;",
            "Lvo/j0;",
            "+",
            "Lvo/d2$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;",
            "Leu/b<",
            "-",
            "Lip/j$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lip/j$a;->u:Lvo/j0$e;

    iput-object p2, p0, Lip/j$a;->v:Lln/k$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method

.method public static synthetic m(Lln/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lip/j$a;->p(Lln/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final p(Lln/r$c;)Lkotlin/Unit;
    .locals 15

    invoke-virtual {p0}, Lln/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lvo/j0$e;

    if-eqz v1, :cond_0

    check-cast v0, Lvo/j0$e;

    :goto_0
    move-object v1, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    if-nez v1, :cond_1

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_1
    const/16 v13, 0x1ff

    const/4 v14, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x1

    invoke-static/range {v1 .. v14}, Lvo/j0$e;->H(Lvo/j0$e;Lvo/d3;Ljava/util/List;Lvo/i3;Ljava/util/List;ILvo/j0;Ljava/lang/String;Ldp/c;JZILjava/lang/Object;)Lvo/j0$e;

    move-result-object v0

    invoke-virtual {p0, v0}, Lln/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
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

    new-instance p1, Lip/j$a;

    iget-object v0, p0, Lip/j$a;->u:Lvo/j0$e;

    iget-object v1, p0, Lip/j$a;->v:Lln/k$a;

    invoke-direct {p1, v0, v1, p2}, Lip/j$a;-><init>(Lvo/j0$e;Lln/k$a;Leu/b;)V

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
    invoke-virtual {p0, p1, p2}, Lip/j$a;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lip/j$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lip/j$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lip/j$a;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lip/j$a;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lip/j$a;->u:Lvo/j0$e;

    invoke-virtual {p1}, Lvo/j0$e;->L()J

    move-result-wide v3

    iput v2, p0, Lip/j$a;->t:I

    invoke-static {v3, v4, p0}, Lav/z0;->b(JLeu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Lip/j$a;->v:Lln/k$a;

    invoke-virtual {p1}, Lln/k$a;->d()Lln/h;

    move-result-object p1

    new-instance v0, Lip/i;

    invoke-direct {v0}, Lip/i;-><init>()V

    const/4 v1, 0x0

    invoke-static {v1, v0, v2, v1}, Lln/w;->f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lln/r;

    move-result-object v0

    invoke-interface {p1, v0}, Lln/h;->a(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
