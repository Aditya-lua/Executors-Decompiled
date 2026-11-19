.class public final Ly4/l0$j$a;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly4/l0$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly4/l0$j$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Ly4/f0<",
        "Lkotlin/Unit;",
        ">;",
        "Leu/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1"
    f = "InvalidationTracker.kt"
    l = {
        0x13e,
        0x13f
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Ly4/f0;",
        "",
        "<anonymous>",
        "(Ly4/f0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic A:[Ly4/k$a;

.field public final synthetic B:Ly4/l0;

.field public final synthetic C:Ly4/g0;

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:I

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>([Ly4/k$a;Ly4/l0;Ly4/g0;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ly4/k$a;",
            "Ly4/l0;",
            "Ly4/g0;",
            "Leu/b<",
            "-",
            "Ly4/l0$j$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ly4/l0$j$a;->A:[Ly4/k$a;

    iput-object p2, p0, Ly4/l0$j$a;->B:Ly4/l0;

    iput-object p3, p0, Ly4/l0$j$a;->C:Ly4/g0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lgu/m;-><init>(ILeu/b;)V

    return-void
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

    new-instance p1, Ly4/l0$j$a;

    iget-object v0, p0, Ly4/l0$j$a;->A:[Ly4/k$a;

    iget-object v1, p0, Ly4/l0$j$a;->B:Ly4/l0;

    iget-object v2, p0, Ly4/l0$j$a;->C:Ly4/g0;

    invoke-direct {p1, v0, v1, v2, p2}, Ly4/l0$j$a;-><init>([Ly4/k$a;Ly4/l0;Ly4/g0;Leu/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly4/f0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Ly4/l0$j$a;->m(Ly4/f0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ly4/l0$j$a;->z:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_0

    if-ne v1, v2, :cond_1

    :cond_0
    iget v1, p0, Ly4/l0$j$a;->y:I

    iget v4, p0, Ly4/l0$j$a;->x:I

    iget v5, p0, Ly4/l0$j$a;->w:I

    iget-object v6, p0, Ly4/l0$j$a;->v:Ljava/lang/Object;

    check-cast v6, Ly4/g0;

    iget-object v7, p0, Ly4/l0$j$a;->u:Ljava/lang/Object;

    check-cast v7, Ly4/l0;

    iget-object v8, p0, Ly4/l0$j$a;->t:Ljava/lang/Object;

    check-cast v8, [Ly4/k$a;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ly4/l0$j$a;->A:[Ly4/k$a;

    iget-object v1, p0, Ly4/l0$j$a;->B:Ly4/l0;

    iget-object v4, p0, Ly4/l0$j$a;->C:Ly4/g0;

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

    sget-object v10, Ly4/l0$j$a$a;->a:[I

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v5, v10, v5

    if-eq v5, v3, :cond_6

    if-eq v5, v2, :cond_5

    const/4 v10, 0x3

    if-ne v5, v10, :cond_4

    iput-object v8, p0, Ly4/l0$j$a;->t:Ljava/lang/Object;

    iput-object v7, p0, Ly4/l0$j$a;->u:Ljava/lang/Object;

    iput-object p1, p0, Ly4/l0$j$a;->v:Ljava/lang/Object;

    iput v9, p0, Ly4/l0$j$a;->w:I

    iput v4, p0, Ly4/l0$j$a;->x:I

    iput v1, p0, Ly4/l0$j$a;->y:I

    iput v2, p0, Ly4/l0$j$a;->z:I

    invoke-static {v7, p1, v6, p0}, Ly4/l0;->i(Ly4/l0;Ly4/m;ILeu/b;)Ljava/lang/Object;

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
    new-instance p1, Lzt/l;

    invoke-direct {p1}, Lzt/l;-><init>()V

    throw p1

    :cond_5
    iput-object v8, p0, Ly4/l0$j$a;->t:Ljava/lang/Object;

    iput-object v7, p0, Ly4/l0$j$a;->u:Ljava/lang/Object;

    iput-object p1, p0, Ly4/l0$j$a;->v:Ljava/lang/Object;

    iput v9, p0, Ly4/l0$j$a;->w:I

    iput v4, p0, Ly4/l0$j$a;->x:I

    iput v1, p0, Ly4/l0$j$a;->y:I

    iput v3, p0, Ly4/l0$j$a;->z:I

    invoke-static {v7, p1, v6, p0}, Ly4/l0;->h(Ly4/l0;Ly4/m;ILeu/b;)Ljava/lang/Object;

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

.method public final m(Ly4/f0;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly4/f0<",
            "Lkotlin/Unit;",
            ">;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Ly4/l0$j$a;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Ly4/l0$j$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Ly4/l0$j$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
