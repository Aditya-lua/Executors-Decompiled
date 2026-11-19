.class public final Lsn/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lsn/m;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "",
        "b",
        "(Landroid/content/Context;Leu/b;)Ljava/lang/Object;",
        "camera_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lsn/m;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lsn/m;

    invoke-direct {v0}, Lsn/m;-><init>()V

    sput-object v0, Lsn/m;->a:Lsn/m;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lpe/x;)Ld1/k;
    .locals 0

    invoke-static {p0}, Lsn/m;->c(Lpe/x;)Ld1/k;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lpe/x;)Ld1/k;
    .locals 0

    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ld1/k;

    return-object p0
.end method


# virtual methods
.method public final b(Landroid/content/Context;Leu/b;)Ljava/lang/Object;
    .locals 9
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p2, Lsn/m$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lsn/m$a;

    iget v1, v0, Lsn/m$a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lsn/m$a;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lsn/m$a;

    invoke-direct {v0, p0, p2}, Lsn/m$a;-><init>(Lsn/m;Leu/b;)V

    :goto_0
    iget-object p2, v0, Lsn/m$a;->w:Ljava/lang/Object;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lsn/m$a;->y:I

    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lsn/m$a;->v:Ljava/lang/Object;

    check-cast p1, Ld1/k;

    iget-object p1, v0, Lsn/m$a;->u:Ljava/lang/Object;

    check-cast p1, Lpe/x;

    iget-object p1, v0, Lsn/m$a;->t:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    invoke-static {p2}, Lzt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lsn/m$a;->u:Ljava/lang/Object;

    check-cast p1, Lpe/x;

    iget-object v2, v0, Lsn/m$a;->t:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    invoke-static {p2}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object p1, v0, Lsn/m$a;->t:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    invoke-static {p2}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lzt/o;->b(Ljava/lang/Object;)V

    invoke-static {}, Lav/g1;->c()Lav/n2;

    move-result-object p2

    new-instance v2, Lsn/m$c;

    invoke-direct {v2, p1, v3}, Lsn/m$c;-><init>(Landroid/content/Context;Leu/b;)V

    invoke-static {p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v0, Lsn/m$a;->t:Ljava/lang/Object;

    iput v6, v0, Lsn/m$a;->y:I

    invoke-static {p2, v2, v0}, Lav/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_1
    check-cast p2, Lpe/x;

    invoke-static {}, Lav/g1;->b()Lav/l0;

    move-result-object v2

    new-instance v6, Lsn/l;

    invoke-direct {v6, p2}, Lsn/l;-><init>(Lpe/x;)V

    invoke-static {p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v0, Lsn/m$a;->t:Ljava/lang/Object;

    invoke-static {p2}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v0, Lsn/m$a;->u:Ljava/lang/Object;

    iput v5, v0, Lsn/m$a;->y:I

    invoke-static {v2, v6, v0}, Lav/a2;->b(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;Leu/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_6

    goto :goto_3

    :cond_6
    move-object v8, v2

    move-object v2, p1

    move-object p1, p2

    move-object p2, v8

    :goto_2
    check-cast p2, Ld1/k;

    invoke-static {}, Lav/g1;->c()Lav/n2;

    move-result-object v5

    new-instance v6, Lsn/m$b;

    invoke-direct {v6, p2, v3}, Lsn/m$b;-><init>(Ld1/k;Leu/b;)V

    invoke-static {v2}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lsn/m$a;->t:Ljava/lang/Object;

    invoke-static {p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lsn/m$a;->u:Ljava/lang/Object;

    invoke-static {p2}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lsn/m$a;->v:Ljava/lang/Object;

    iput v4, v0, Lsn/m$a;->y:I

    invoke-static {v5, v6, v0}, Lav/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    :goto_4
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
