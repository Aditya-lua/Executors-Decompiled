.class public final Lcom/roblox/universalapp/achievement/a$e;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/universalapp/achievement/a;->i(Ljava/util/List;Lnt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function1<",
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
        "\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        ""
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lpt/f;
    c = "com.roblox.universalapp.achievement.AchievementDao_Impl$replicateRemoteAchievements$2"
    f = "AchievementDao_Impl.kt"
    l = {
        0x57
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lcom/roblox/universalapp/achievement/a;

.field public final synthetic v:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lsl/u;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/roblox/universalapp/achievement/a;Ljava/util/List;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roblox/universalapp/achievement/a;",
            "Ljava/util/List<",
            "Lsl/u;",
            ">;",
            "Lnt/b<",
            "-",
            "Lcom/roblox/universalapp/achievement/a$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/universalapp/achievement/a$e;->u:Lcom/roblox/universalapp/achievement/a;

    iput-object p2, p0, Lcom/roblox/universalapp/achievement/a$e;->v:Ljava/util/List;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Lnt/b;)Lnt/b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "*>;)",
            "Lnt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/roblox/universalapp/achievement/a$e;

    iget-object v1, p0, Lcom/roblox/universalapp/achievement/a$e;->u:Lcom/roblox/universalapp/achievement/a;

    iget-object v2, p0, Lcom/roblox/universalapp/achievement/a$e;->v:Ljava/util/List;

    invoke-direct {v0, v1, v2, p1}, Lcom/roblox/universalapp/achievement/a$e;-><init>(Lcom/roblox/universalapp/achievement/a;Ljava/util/List;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnt/b;

    invoke-virtual {p0, p1}, Lcom/roblox/universalapp/achievement/a$e;->q(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/roblox/universalapp/achievement/a$e;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/roblox/universalapp/achievement/a$e;->u:Lcom/roblox/universalapp/achievement/a;

    iget-object v1, p0, Lcom/roblox/universalapp/achievement/a$e;->v:Ljava/util/List;

    iput v2, p0, Lcom/roblox/universalapp/achievement/a$e;->t:I

    invoke-static {p1, v1, p0}, Lcom/roblox/universalapp/achievement/a;->t(Lcom/roblox/universalapp/achievement/a;Ljava/util/List;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final q(Lnt/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/roblox/universalapp/achievement/a$e;->create(Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/roblox/universalapp/achievement/a$e;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/roblox/universalapp/achievement/a$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
