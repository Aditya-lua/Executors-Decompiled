.class public final Lnu/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnu/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnu/g;->collect(Lnu/i;Lnt/b;)Ljava/lang/Object;
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
        "Lnu/i;"
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
.field public final synthetic a:Lnu/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnu/g<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic b:Lkotlin/jvm/internal/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/c0<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic c:Lnu/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnu/i<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnu/g;Lkotlin/jvm/internal/c0;Lnu/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/g<",
            "TT;>;",
            "Lkotlin/jvm/internal/c0<",
            "Ljava/lang/Object;",
            ">;",
            "Lnu/i<",
            "-TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lnu/g$a;->a:Lnu/g;

    iput-object p2, p0, Lnu/g$a;->b:Lkotlin/jvm/internal/c0;

    iput-object p3, p0, Lnu/g$a;->c:Lnu/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lnu/g$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lnu/g$a$a;

    iget v1, v0, Lnu/g$a$a;->v:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lnu/g$a$a;->v:I

    goto :goto_0

    :cond_0
    new-instance v0, Lnu/g$a$a;

    invoke-direct {v0, p0, p2}, Lnu/g$a$a;-><init>(Lnu/g$a;Lnt/b;)V

    :goto_0
    iget-object p2, v0, Lnu/g$a$a;->t:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lnu/g$a$a;->v:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lnu/g$a;->a:Lnu/g;

    iget-object p2, p2, Lnu/g;->b:Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    iget-object v2, p0, Lnu/g$a;->b:Lkotlin/jvm/internal/c0;

    iget-object v2, v2, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    sget-object v4, Lou/t;->a:Lqu/e0;

    if-eq v2, v4, :cond_4

    iget-object v4, p0, Lnu/g$a;->a:Lnu/g;

    iget-object v4, v4, Lnu/g;->c:Lkotlin/jvm/functions/Function2;

    invoke-interface {v4, v2, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_4
    :goto_1
    iget-object v2, p0, Lnu/g$a;->b:Lkotlin/jvm/internal/c0;

    iput-object p2, v2, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    iget-object p2, p0, Lnu/g$a;->c:Lnu/i;

    iput v3, v0, Lnu/g$a$a;->v:I

    invoke-interface {p2, p1, v0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
