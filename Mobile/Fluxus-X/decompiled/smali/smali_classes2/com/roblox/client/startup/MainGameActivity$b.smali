.class public final Lcom/roblox/client/startup/MainGameActivity$b;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/startup/MainGameActivity;->P2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lav/p0;",
        "Leu/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.roblox.client.startup.MainGameActivity$updateNativeSettingsBeforeFlags$1"
    f = "MainGameActivity.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lav/p0;",
        "",
        "<anonymous>",
        "(Lav/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lcom/roblox/client/startup/MainGameActivity;


# direct methods
.method public constructor <init>(Lcom/roblox/client/startup/MainGameActivity;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roblox/client/startup/MainGameActivity;",
            "Leu/b<",
            "-",
            "Lcom/roblox/client/startup/MainGameActivity$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/startup/MainGameActivity$b;->u:Lcom/roblox/client/startup/MainGameActivity;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method

.method public static synthetic m(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/MainGameActivity$b;->p(Ljava/lang/String;)V

    return-void
.end method

.method public static final p(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lok/c;->c:Lpe/e0;

    invoke-virtual {v0, p0}, Lpe/e0;->D(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 1
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

    new-instance p1, Lcom/roblox/client/startup/MainGameActivity$b;

    iget-object v0, p0, Lcom/roblox/client/startup/MainGameActivity$b;->u:Lcom/roblox/client/startup/MainGameActivity;

    invoke-direct {p1, v0, p2}, Lcom/roblox/client/startup/MainGameActivity$b;-><init>(Lcom/roblox/client/startup/MainGameActivity;Leu/b;)V

    return-object p1
.end method

.method public final invoke(Lav/p0;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lav/p0;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/startup/MainGameActivity$b;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/startup/MainGameActivity$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/roblox/client/startup/MainGameActivity$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/startup/MainGameActivity$b;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/roblox/client/startup/MainGameActivity$b;->t:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    invoke-static {}, Lok/c;->g()Lok/c;

    move-result-object p1

    iget-object v0, p0, Lcom/roblox/client/startup/MainGameActivity$b;->u:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lik/j1;

    invoke-direct {v1}, Lik/j1;-><init>()V

    invoke-virtual {p1, v0, v1}, Lok/c;->f(Landroid/content/Context;Lok/a$a;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
