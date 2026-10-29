.class public final Lcom/roblox/universalapp/achievement/JNIAchievement$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/universalapp/achievement/JNIAchievement;->grantAchievementForNativeAsync(Ljava/lang/String;J)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lku/p0;",
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lku/p0;",
        "",
        "<anonymous>",
        "(Lku/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.roblox.universalapp.achievement.JNIAchievement$grantAchievementForNativeAsync$1"
    f = "JNIAchievement.kt"
    l = {
        0x37
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:I

.field public v:I

.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:J


# direct methods
.method public constructor <init>(Ljava/lang/String;JLnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Lnt/b<",
            "-",
            "Lcom/roblox/universalapp/achievement/JNIAchievement$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/universalapp/achievement/JNIAchievement$a;->x:Ljava/lang/String;

    iput-wide p2, p0, Lcom/roblox/universalapp/achievement/JNIAchievement$a;->y:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 4
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

    new-instance v0, Lcom/roblox/universalapp/achievement/JNIAchievement$a;

    iget-object v1, p0, Lcom/roblox/universalapp/achievement/JNIAchievement$a;->x:Ljava/lang/String;

    iget-wide v2, p0, Lcom/roblox/universalapp/achievement/JNIAchievement$a;->y:J

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/roblox/universalapp/achievement/JNIAchievement$a;-><init>(Ljava/lang/String;JLnt/b;)V

    iput-object p1, v0, Lcom/roblox/universalapp/achievement/JNIAchievement$a;->w:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/roblox/universalapp/achievement/JNIAchievement$a;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lku/p0;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/roblox/universalapp/achievement/JNIAchievement$a;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/roblox/universalapp/achievement/JNIAchievement$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/roblox/universalapp/achievement/JNIAchievement$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lcom/roblox/universalapp/achievement/JNIAchievement$a;->w:Ljava/lang/Object;

    check-cast v0, Lku/p0;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lcom/roblox/universalapp/achievement/JNIAchievement$a;->v:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_1

    if-ne v2, v4, :cond_0

    iget-object v0, p0, Lcom/roblox/universalapp/achievement/JNIAchievement$a;->t:Ljava/lang/Object;

    check-cast v0, Lku/p0;

    :try_start_0
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/roblox/universalapp/achievement/JNIAchievement$a;->x:Ljava/lang/String;

    :try_start_1
    sget-object v2, Ljt/n;->b:Ljt/n$a;

    sget-object v2, Lcom/roblox/universalapp/achievement/b;->a:Lcom/roblox/universalapp/achievement/b;

    invoke-virtual {v2}, Lcom/roblox/universalapp/achievement/b;->a()Lsl/b;

    move-result-object v2

    if-eqz v2, :cond_3

    new-instance v6, Lsl/l;

    const/4 v7, 0x2

    invoke-direct {v6, p1, v5, v7, v5}, Lsl/l;-><init>(Ljava/lang/String;Ljava/time/Instant;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/universalapp/achievement/JNIAchievement$a;->w:Ljava/lang/Object;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/universalapp/achievement/JNIAchievement$a;->t:Ljava/lang/Object;

    iput v3, p0, Lcom/roblox/universalapp/achievement/JNIAchievement$a;->u:I

    iput v4, p0, Lcom/roblox/universalapp/achievement/JNIAchievement$a;->v:I

    invoke-interface {v2, v6, p0}, Lsl/b;->f(Lsl/l;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Long;

    goto :goto_1

    :cond_3
    move-object p1, v5

    :goto_1
    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :goto_2
    sget-object v0, Ljt/n;->b:Ljt/n$a;

    invoke-static {p1}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_3
    iget-wide v0, p0, Lcom/roblox/universalapp/achievement/JNIAchievement$a;->y:J

    invoke-static {p1}, Ljt/n;->h(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    move-object v2, p1

    check-cast v2, Ljava/lang/Long;

    sget-object v6, Lcom/roblox/universalapp/achievement/JNIAchievement;->a:Lcom/roblox/universalapp/achievement/JNIAchievement;

    if-eqz v2, :cond_4

    move v3, v4

    :cond_4
    invoke-static {v6, v0, v1, v3}, Lcom/roblox/universalapp/achievement/JNIAchievement;->b(Lcom/roblox/universalapp/achievement/JNIAchievement;JZ)Z

    :cond_5
    iget-wide v0, p0, Lcom/roblox/universalapp/achievement/JNIAchievement$a;->y:J

    invoke-static {p1}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_9

    sget-object v2, Lcom/roblox/universalapp/achievement/JNIAchievement;->a:Lcom/roblox/universalapp/achievement/JNIAchievement;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_7

    invoke-static {v3}, Lkotlin/text/StringsKt;->p0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_4

    :cond_6
    move-object v5, v3

    :goto_4
    if-nez v5, :cond_8

    :cond_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    :cond_8
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v2, v0, v1, v5}, Lcom/roblox/universalapp/achievement/JNIAchievement;->a(Lcom/roblox/universalapp/achievement/JNIAchievement;JLjava/lang/String;)Z

    :cond_9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
