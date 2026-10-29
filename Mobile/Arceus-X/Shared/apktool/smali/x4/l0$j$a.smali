.class public final Lx4/l0$j$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx4/l0$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx4/l0$j$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lx4/f0<",
        "Lkotlin/Unit;",
        ">;",
        "Lnt/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lx4/f0;",
        "",
        "<anonymous>",
        "(Lx4/f0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1"
    f = "InvalidationTracker.kt"
    l = {
        0x13e,
        0x13f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public final synthetic A:[Lx4/k$a;

.field public final synthetic B:Lx4/l0;

.field public final synthetic C:Lx4/g0;

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:I

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>([Lx4/k$a;Lx4/l0;Lx4/g0;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lx4/k$a;",
            "Lx4/l0;",
            "Lx4/g0;",
            "Lnt/b<",
            "-",
            "Lx4/l0$j$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lx4/l0$j$a;->A:[Lx4/k$a;

    iput-object p2, p0, Lx4/l0$j$a;->B:Lx4/l0;

    iput-object p3, p0, Lx4/l0$j$a;->C:Lx4/g0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lnt/b<",
            "*>;)",
            "Lnt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lx4/l0$j$a;

    iget-object v0, p0, Lx4/l0$j$a;->A:[Lx4/k$a;

    iget-object v1, p0, Lx4/l0$j$a;->B:Lx4/l0;

    iget-object v2, p0, Lx4/l0$j$a;->C:Lx4/g0;

    invoke-direct {p1, v0, v1, v2, p2}, Lx4/l0$j$a;-><init>([Lx4/k$a;Lx4/l0;Lx4/g0;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx4/f0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lx4/l0$j$a;->q(Lx4/f0;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lx4/l0$j$a;->z:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_0

    if-ne v1, v2, :cond_1

    :cond_0
    iget v1, p0, Lx4/l0$j$a;->y:I

    iget v4, p0, Lx4/l0$j$a;->x:I

    iget v5, p0, Lx4/l0$j$a;->w:I

    iget-object v6, p0, Lx4/l0$j$a;->v:Ljava/lang/Object;

    check-cast v6, Lx4/g0;

    iget-object v7, p0, Lx4/l0$j$a;->u:Ljava/lang/Object;

    check-cast v7, Lx4/l0;

    iget-object v8, p0, Lx4/l0$j$a;->t:Ljava/lang/Object;

    check-cast v8, [Lx4/k$a;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lx4/l0$j$a;->A:[Lx4/k$a;

    iget-object v1, p0, Lx4/l0$j$a;->B:Lx4/l0;

    iget-object v4, p0, Lx4/l0$j$a;->C:Lx4/g0;

    array-length v5, p1

    const/4 v6, 0x0

    move-object v8, p1

    move-object v7, v1

    move-object p1, v4

    move v1, v5

    move v4, v6

    :goto_0
    if-ge v4, v1, :cond_7

    aget-object v5, v8, v4

    add-int/lit8 v9, v6, 0x1

    sget-object v10, Lx4/l0$j$a$a;->a:[I

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v5, v10, v5

    if-eq v5, v3, :cond_6

    if-eq v5, v2, :cond_5

    const/4 v10, 0x3

    if-ne v5, v10, :cond_4

    iput-object v8, p0, Lx4/l0$j$a;->t:Ljava/lang/Object;

    iput-object v7, p0, Lx4/l0$j$a;->u:Ljava/lang/Object;

    iput-object p1, p0, Lx4/l0$j$a;->v:Ljava/lang/Object;

    iput v9, p0, Lx4/l0$j$a;->w:I

    iput v4, p0, Lx4/l0$j$a;->x:I

    iput v1, p0, Lx4/l0$j$a;->y:I

    iput v2, p0, Lx4/l0$j$a;->z:I

    invoke-static {v7, p1, v6, p0}, Lx4/l0;->i(Lx4/l0;Lx4/m;ILnt/b;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_3

    goto :goto_2

    :cond_3
    move-object v6, p1

    move v5, v9

    :goto_1
    move-object p1, v6

    move v6, v5

    goto :goto_3

    :cond_4
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1

    :cond_5
    iput-object v8, p0, Lx4/l0$j$a;->t:Ljava/lang/Object;

    iput-object v7, p0, Lx4/l0$j$a;->u:Ljava/lang/Object;

    iput-object p1, p0, Lx4/l0$j$a;->v:Ljava/lang/Object;

    iput v9, p0, Lx4/l0$j$a;->w:I

    iput v4, p0, Lx4/l0$j$a;->x:I

    iput v1, p0, Lx4/l0$j$a;->y:I

    iput v3, p0, Lx4/l0$j$a;->z:I

    invoke-static {v7, p1, v6, p0}, Lx4/l0;->h(Lx4/l0;Lx4/m;ILnt/b;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_3

    :goto_2
    return-object v0

    :cond_6
    move v6, v9

    :goto_3
    add-int/2addr v4, v3

    goto :goto_0

    :cond_7
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final q(Lx4/f0;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx4/f0<",
            "Lkotlin/Unit;",
            ">;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lx4/l0$j$a;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lx4/l0$j$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lx4/l0$j$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
