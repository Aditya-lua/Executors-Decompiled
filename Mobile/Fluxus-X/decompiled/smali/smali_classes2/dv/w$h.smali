.class public final Ldv/w$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldv/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldv/w;->f(Ldv/h;Lkotlin/jvm/functions/Function2;)Ldv/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldv/h<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "dv/w$h",
        "Ldv/h;",
        "Ldv/i;",
        "collector",
        "",
        "collect",
        "(Ldv/i;Leu/b;)Ljava/lang/Object;",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Ldv/h;

.field public final synthetic b:Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(Ldv/h;Lkotlin/jvm/functions/Function2;)V
    .locals 0

    iput-object p1, p0, Ldv/w$h;->a:Ldv/h;

    iput-object p2, p0, Ldv/w$h;->b:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public collect(Ldv/i;Leu/b;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldv/i<",
            "-TT;>;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Ldv/w$h$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ldv/w$h$a;

    iget v1, v0, Ldv/w$h$a;->u:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ldv/w$h$a;->u:I

    goto :goto_0

    :cond_0
    new-instance v0, Ldv/w$h$a;

    invoke-direct {v0, p0, p2}, Ldv/w$h$a;-><init>(Ldv/w$h;Leu/b;)V

    :goto_0
    iget-object p2, v0, Ldv/w$h$a;->t:Ljava/lang/Object;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Ldv/w$h$a;->u:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Ldv/w$h$a;->w:Ljava/lang/Object;

    check-cast p1, Ldv/w$i;

    :try_start_0
    invoke-static {p2}, Lzt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lev/a; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p2

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Ldv/w$h;->a:Ldv/h;

    new-instance v2, Ldv/w$i;

    iget-object v4, p0, Ldv/w$h;->b:Lkotlin/jvm/functions/Function2;

    invoke-direct {v2, v4, p1}, Ldv/w$i;-><init>(Lkotlin/jvm/functions/Function2;Ldv/i;)V

    :try_start_1
    iput-object v2, v0, Ldv/w$h$a;->w:Ljava/lang/Object;

    iput v3, v0, Ldv/w$h$a;->u:I

    invoke-interface {p2, v2, v0}, Ldv/h;->collect(Ldv/i;Leu/b;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Lev/a; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p1, v1, :cond_3

    return-object v1

    :catch_1
    move-exception p2

    move-object p1, v2

    :goto_1
    invoke-static {p2, p1}, Lev/p;->a(Lev/a;Ljava/lang/Object;)V

    invoke-interface {v0}, Leu/b;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    invoke-static {p1}, Lav/g2;->i(Lkotlin/coroutines/CoroutineContext;)V

    :cond_3
    :goto_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
