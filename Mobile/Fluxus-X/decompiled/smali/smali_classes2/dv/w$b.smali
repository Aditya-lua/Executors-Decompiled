.class public final Ldv/w$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldv/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldv/w;->b(Ldv/h;I)Ldv/h;
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
.field public final synthetic a:Lkotlin/jvm/internal/a0;

.field public final synthetic b:I

.field public final synthetic c:Ldv/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldv/i<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/a0;ILdv/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/a0;",
            "I",
            "Ldv/i<",
            "-TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Ldv/w$b;->a:Lkotlin/jvm/internal/a0;

    iput p2, p0, Ldv/w$b;->b:I

    iput-object p3, p0, Ldv/w$b;->c:Ldv/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;
    .locals 5
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

    instance-of v0, p2, Ldv/w$b$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ldv/w$b$a;

    iget v1, v0, Ldv/w$b$a;->v:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ldv/w$b$a;->v:I

    goto :goto_0

    :cond_0
    new-instance v0, Ldv/w$b$a;

    invoke-direct {v0, p0, p2}, Ldv/w$b$a;-><init>(Ldv/w$b;Leu/b;)V

    :goto_0
    iget-object p2, v0, Ldv/w$b$a;->t:Ljava/lang/Object;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Ldv/w$b$a;->v:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Ldv/w$b;->a:Lkotlin/jvm/internal/a0;

    iget v2, p2, Lkotlin/jvm/internal/a0;->a:I

    iget v4, p0, Ldv/w$b;->b:I

    if-lt v2, v4, :cond_4

    iget-object p2, p0, Ldv/w$b;->c:Ldv/i;

    iput v3, v0, Ldv/w$b$a;->v:I

    invoke-interface {p2, p1, v0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_4
    add-int/2addr v2, v3

    iput v2, p2, Lkotlin/jvm/internal/a0;->a:I

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
