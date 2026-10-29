.class public final Loo/a$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnu/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loo/a$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lnu/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnu/i<",
            "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnu/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/i<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loo/a$d$a;->a:Lnu/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Loo/a$c;Lnt/b;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loo/a$c;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Loo/a$d$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Loo/a$d$a$a;

    iget v1, v0, Loo/a$d$a$a;->w:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Loo/a$d$a$a;->w:I

    goto :goto_0

    :cond_0
    new-instance v0, Loo/a$d$a$a;

    invoke-direct {v0, p0, p2}, Loo/a$d$a$a;-><init>(Loo/a$d$a;Lnt/b;)V

    :goto_0
    iget-object p2, v0, Loo/a$d$a$a;->u:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Loo/a$d$a$a;->w:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Loo/a$d$a$a;->t:Ljava/lang/Object;

    check-cast p1, Loo/a$c;

    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Loo/a$d$a$a;->t:Ljava/lang/Object;

    check-cast p1, Loo/a$c;

    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Loo/a$d$a;->a:Lnu/i;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Loo/a$c;->a()Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;

    move-result-object v2

    goto :goto_1

    :cond_4
    const/4 v2, 0x0

    :goto_1
    iput-object p1, v0, Loo/a$d$a$a;->t:Ljava/lang/Object;

    iput v4, v0, Loo/a$d$a$a;->w:I

    invoke-interface {p2, v2, v0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_4

    :cond_5
    :goto_2
    if-eqz p1, :cond_6

    invoke-virtual {p1}, Loo/a$c;->b()J

    move-result-wide v4

    goto :goto_3

    :cond_6
    const-wide/16 v4, 0x0

    :goto_3
    const-wide/16 v6, 0x21

    invoke-static {v4, v5, v6, v7}, Lkotlin/ranges/d;->d(JJ)J

    move-result-wide v4

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Loo/a$d$a$a;->t:Ljava/lang/Object;

    iput v3, v0, Loo/a$d$a$a;->w:I

    invoke-static {v4, v5, v0}, Lku/z0;->b(JLnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_4
    return-object v1

    :cond_7
    :goto_5
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Loo/a$c;

    invoke-virtual {p0, p1, p2}, Loo/a$d$a;->b(Loo/a$c;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
