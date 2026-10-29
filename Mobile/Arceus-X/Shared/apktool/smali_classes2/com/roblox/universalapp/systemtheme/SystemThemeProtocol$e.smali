.class public final Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$e;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->onCreate(Landroidx/lifecycle/s;)V
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
    c = "com.roblox.universalapp.systemtheme.SystemThemeProtocol$onCreate$2"
    f = "SystemThemeProtocol.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public t:I


# direct methods
.method public constructor <init>(Lnt/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$e;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 0
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

    new-instance p1, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$e;

    invoke-direct {p1, p2}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$e;-><init>(Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$e;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$e;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$e;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$e;->t:I

    if-nez v0, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    invoke-static {}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->k()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object p1

    sget-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->a:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;

    invoke-static {v0}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->n(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrm/j;

    invoke-direct {v2, v0}, Lrm/j;-><init>(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;)V

    invoke-virtual {p1, v1, v2}, Lcom/roblox/universalapp/messagebus/MessageBus;->t(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    invoke-static {p1}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->u(Lcom/roblox/universalapp/messagebus/Connection;)V

    invoke-static {}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->k()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object p1

    invoke-static {v0}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->m(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrm/k;

    invoke-direct {v2, v0}, Lrm/k;-><init>(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;)V

    invoke-virtual {p1, v1, v2}, Lcom/roblox/universalapp/messagebus/MessageBus;->t(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    invoke-static {p1}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->t(Lcom/roblox/universalapp/messagebus/Connection;)V

    invoke-static {}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->k()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object p1

    invoke-static {v0}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->l(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrm/l;

    invoke-direct {v2, v0}, Lrm/l;-><init>(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;)V

    invoke-virtual {p1, v1, v2}, Lcom/roblox/universalapp/messagebus/MessageBus;->t(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    invoke-static {p1}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->s(Lcom/roblox/universalapp/messagebus/Connection;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
