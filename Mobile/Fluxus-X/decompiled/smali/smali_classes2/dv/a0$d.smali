.class public final Ldv/a0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldv/i;


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
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ldv/i;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lkotlin/jvm/internal/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/c0<",
            "TR;>;"
        }
    .end annotation
.end field

.field public final synthetic b:Lpu/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpu/n<",
            "TR;TT;",
            "Leu/b<",
            "-TR;>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic c:Ldv/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldv/i<",
            "TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/c0;Lpu/n;Ldv/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/c0<",
            "TR;>;",
            "Lpu/n<",
            "-TR;-TT;-",
            "Leu/b<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Ldv/i<",
            "-TR;>;)V"
        }
    .end annotation

    iput-object p1, p0, Ldv/a0$d;->a:Lkotlin/jvm/internal/c0;

    iput-object p2, p0, Ldv/a0$d;->b:Lpu/n;

    iput-object p3, p0, Ldv/a0$d;->c:Ldv/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Ldv/a0$d$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ldv/a0$d$a;

    iget v1, v0, Ldv/a0$d$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ldv/a0$d$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Ldv/a0$d$a;

    invoke-direct {v0, p0, p2}, Ldv/a0$d$a;-><init>(Ldv/a0$d;Leu/b;)V

    :goto_0
    iget-object p2, v0, Ldv/a0$d$a;->v:Ljava/lang/Object;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Ldv/a0$d$a;->x:I

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
    iget-object p1, v0, Ldv/a0$d$a;->u:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/c0;

    iget-object v2, v0, Ldv/a0$d$a;->t:Ljava/lang/Object;

    check-cast v2, Ldv/a0$d;

    invoke-static {p2}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Ldv/a0$d;->a:Lkotlin/jvm/internal/c0;

    iget-object v2, p0, Ldv/a0$d;->b:Lpu/n;

    iget-object v5, p2, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    iput-object p0, v0, Ldv/a0$d$a;->t:Ljava/lang/Object;

    iput-object p2, v0, Ldv/a0$d$a;->u:Ljava/lang/Object;

    iput v4, v0, Ldv/a0$d$a;->x:I

    invoke-interface {v2, v5, p1, v0}, Lpu/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v2, p2

    move-object p2, p1

    move-object p1, v2

    move-object v2, p0

    :goto_1
    iput-object p2, p1, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    iget-object p1, v2, Ldv/a0$d;->c:Ldv/i;

    iget-object p2, v2, Ldv/a0$d;->a:Lkotlin/jvm/internal/c0;

    iget-object p2, p2, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    const/4 v2, 0x0

    iput-object v2, v0, Ldv/a0$d$a;->t:Ljava/lang/Object;

    iput-object v2, v0, Ldv/a0$d$a;->u:Ljava/lang/Object;

    iput v3, v0, Ldv/a0$d$a;->x:I

    invoke-interface {p1, p2, v0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
