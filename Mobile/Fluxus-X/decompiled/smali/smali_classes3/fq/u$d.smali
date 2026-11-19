.class public final Lfq/u$d;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfq/u;->u(Lfq/u$c;Lfq/u$a;Lln/k$a;)Ljava/lang/Object;
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
    c = "com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow$render$1"
    f = "DeviceFeatureRequestWorkflow.kt"
    l = {}
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

.field public final synthetic u:Lfq/u;

.field public final synthetic v:Lln/k$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lln/k<",
            "Lfq/u$c;",
            "Lfq/u$a;",
            "Lfq/u$b;",
            "Ljava/lang/Object;",
            ">.a;"
        }
    .end annotation
.end field

.field public final synthetic w:Lfq/u$c;


# direct methods
.method public constructor <init>(Lfq/u;Lln/k$a;Lfq/u$c;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfq/u;",
            "Lln/k<",
            "-",
            "Lfq/u$c;",
            "Lfq/u$a;",
            "Lfq/u$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;",
            "Lfq/u$c;",
            "Leu/b<",
            "-",
            "Lfq/u$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfq/u$d;->u:Lfq/u;

    iput-object p2, p0, Lfq/u$d;->v:Lln/k$a;

    iput-object p3, p0, Lfq/u$d;->w:Lfq/u$c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method

.method public static synthetic m(Lln/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lfq/u$d;->r(Lln/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lfq/u;Lfq/u$c;Lln/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lfq/u$d;->q(Lfq/u;Lfq/u$c;Lln/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final q(Lfq/u;Lfq/u$c;Lln/r$c;)Lkotlin/Unit;
    .locals 2

    new-instance v0, Lfq/y;

    invoke-virtual {p1}, Lfq/u$c;->a()Lfq/z;

    move-result-object p1

    sget-object v1, Lfq/a0;->a:Lfq/a0;

    invoke-direct {v0, p1, v1}, Lfq/y;-><init>(Lfq/z;Lfq/a0;)V

    invoke-static {p0, p2, v0}, Lfq/u;->p(Lfq/u;Lln/r$c;Lfq/y;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final r(Lln/r$c;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lfq/u$a$d;->a:Lfq/u$a$d;

    invoke-virtual {p0, v0}, Lln/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 3
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

    new-instance p1, Lfq/u$d;

    iget-object v0, p0, Lfq/u$d;->u:Lfq/u;

    iget-object v1, p0, Lfq/u$d;->v:Lln/k$a;

    iget-object v2, p0, Lfq/u$d;->w:Lfq/u$c;

    invoke-direct {p1, v0, v1, v2, p2}, Lfq/u$d;-><init>(Lfq/u;Lln/k$a;Lfq/u$c;Leu/b;)V

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
    invoke-virtual {p0, p1, p2}, Lfq/u$d;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lfq/u$d;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lfq/u$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lfq/u$d;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    iget v0, p0, Lfq/u$d;->t:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lfq/u$d;->u:Lfq/u;

    invoke-static {p1}, Lfq/u;->q(Lfq/u;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lhr/f;->b(Landroid/content/Context;)Z

    move-result p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lfq/u$d;->v:Lln/k$a;

    invoke-virtual {p1}, Lln/k$a;->d()Lln/h;

    move-result-object p1

    iget-object v2, p0, Lfq/u$d;->u:Lfq/u;

    iget-object v3, p0, Lfq/u$d;->w:Lfq/u$c;

    new-instance v4, Lfq/v;

    invoke-direct {v4, v2, v3}, Lfq/v;-><init>(Lfq/u;Lfq/u$c;)V

    invoke-static {v2, v1, v4, v0, v1}, Lln/w;->g(Lln/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lln/r;

    move-result-object v0

    invoke-interface {p1, v0}, Lln/h;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lfq/u$d;->v:Lln/k$a;

    invoke-virtual {p1}, Lln/k$a;->d()Lln/h;

    move-result-object p1

    iget-object v2, p0, Lfq/u$d;->u:Lfq/u;

    new-instance v3, Lfq/w;

    invoke-direct {v3}, Lfq/w;-><init>()V

    invoke-static {v2, v1, v3, v0, v1}, Lln/w;->g(Lln/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lln/r;

    move-result-object v0

    invoke-interface {p1, v0}, Lln/h;->a(Ljava/lang/Object;)V

    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
