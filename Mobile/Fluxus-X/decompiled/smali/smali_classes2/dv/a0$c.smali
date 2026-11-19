.class public final Ldv/a0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldv/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldv/a0;->c(Ldv/h;Ljava/lang/Object;Lpu/n;)Ldv/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldv/h<",
        "TR;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "dv/a0$c",
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
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Ldv/h;

.field public final synthetic c:Lpu/n;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ldv/h;Lpu/n;)V
    .locals 0

    iput-object p1, p0, Ldv/a0$c;->a:Ljava/lang/Object;

    iput-object p2, p0, Ldv/a0$c;->b:Ldv/h;

    iput-object p3, p0, Ldv/a0$c;->c:Lpu/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public collect(Ldv/i;Leu/b;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldv/i<",
            "-TR;>;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Ldv/a0$c$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ldv/a0$c$a;

    iget v1, v0, Ldv/a0$c$a;->u:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ldv/a0$c$a;->u:I

    goto :goto_0

    :cond_0
    new-instance v0, Ldv/a0$c$a;

    invoke-direct {v0, p0, p2}, Ldv/a0$c$a;-><init>(Ldv/a0$c;Leu/b;)V

    :goto_0
    iget-object p2, v0, Ldv/a0$c$a;->t:Ljava/lang/Object;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Ldv/a0$c$a;->u:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Ldv/a0$c$a;->y:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/c0;

    iget-object v2, v0, Ldv/a0$c$a;->x:Ljava/lang/Object;

    check-cast v2, Ldv/i;

    iget-object v4, v0, Ldv/a0$c$a;->w:Ljava/lang/Object;

    check-cast v4, Ldv/a0$c;

    invoke-static {p2}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lzt/o;->b(Ljava/lang/Object;)V

    new-instance p2, Lkotlin/jvm/internal/c0;

    invoke-direct {p2}, Lkotlin/jvm/internal/c0;-><init>()V

    iget-object v2, p0, Ldv/a0$c;->a:Ljava/lang/Object;

    iput-object v2, p2, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    iput-object p0, v0, Ldv/a0$c$a;->w:Ljava/lang/Object;

    iput-object p1, v0, Ldv/a0$c$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Ldv/a0$c$a;->y:Ljava/lang/Object;

    iput v4, v0, Ldv/a0$c$a;->u:I

    invoke-interface {p1, v2, v0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v4, p0

    move-object v2, p1

    move-object p1, p2

    :goto_1
    iget-object p2, v4, Ldv/a0$c;->b:Ldv/h;

    new-instance v5, Ldv/a0$d;

    iget-object v4, v4, Ldv/a0$c;->c:Lpu/n;

    invoke-direct {v5, p1, v4, v2}, Ldv/a0$d;-><init>(Lkotlin/jvm/internal/c0;Lpu/n;Ldv/i;)V

    const/4 p1, 0x0

    iput-object p1, v0, Ldv/a0$c$a;->w:Ljava/lang/Object;

    iput-object p1, v0, Ldv/a0$c$a;->x:Ljava/lang/Object;

    iput-object p1, v0, Ldv/a0$c$a;->y:Ljava/lang/Object;

    iput v3, v0, Ldv/a0$c$a;->u:I

    invoke-interface {p2, v5, v0}, Ldv/h;->collect(Ldv/i;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
