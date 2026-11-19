.class public final Lwi/d$a;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwi/d;->a(JLjava/lang/String;Leu/b;)Ljava/lang/Object;
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
        "Ljava/lang/Boolean;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.roblox.client.job.ChatJobsKt$markConversationAsRead$2"
    f = "ChatJobs.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lav/p0;",
        "",
        "<anonymous>",
        "(Lav/p0;)Z"
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

.field public final synthetic u:Ljava/lang/String;

.field public final synthetic v:J


# direct methods
.method public constructor <init>(Ljava/lang/String;JLeu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Leu/b<",
            "-",
            "Lwi/d$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lwi/d$a;->u:Ljava/lang/String;

    iput-wide p2, p0, Lwi/d$a;->v:J

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

    new-instance p1, Lwi/d$a;

    iget-object v0, p0, Lwi/d$a;->u:Ljava/lang/String;

    iget-wide v1, p0, Lwi/d$a;->v:J

    invoke-direct {p1, v0, v1, v2, p2}, Lwi/d$a;-><init>(Ljava/lang/String;JLeu/b;)V

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
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lwi/d$a;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lwi/d$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lwi/d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lwi/d$a;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    iget v0, p0, Lwi/d$a;->t:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->A2()Z

    move-result p1

    const-string v0, "status"

    const-string v1, "success"

    if-eqz p1, :cond_0

    iget-object p1, p0, Lwi/d$a;->u:Ljava/lang/String;

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lcl/g;->d()Lcl/d;

    move-result-object v2

    invoke-interface {v2}, Lcl/d;->c()Lcom/roblox/platform/http/interfaces/PlatformChatInterface;

    move-result-object v2

    new-instance v3, Lll/a;

    invoke-direct {v3, p1}, Lll/a;-><init>([Ljava/lang/String;)V

    invoke-interface {v2, v3}, Lcom/roblox/platform/http/interfaces/PlatformChatInterface;->markConversations(Lll/a;)Lsw/d;

    move-result-object p1

    invoke-interface {p1}, Lsw/d;->j()Lsw/x;

    move-result-object p1

    invoke-virtual {p1}, Lsw/x;->a()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p1, Lmv/i0;

    invoke-virtual {p1}, Lmv/i0;->h()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_0
    iget-wide v2, p0, Lwi/d$a;->v:J

    const/4 p1, 0x1

    new-array p1, p1, [J

    const/4 v4, 0x0

    aput-wide v2, p1, v4

    invoke-static {}, Lcl/g;->d()Lcl/d;

    move-result-object v2

    invoke-interface {v2}, Lcl/d;->c()Lcom/roblox/platform/http/interfaces/PlatformChatInterface;

    move-result-object v2

    new-instance v3, Lll/b;

    invoke-direct {v3, p1}, Lll/b;-><init>([J)V

    invoke-interface {v2, v3}, Lcom/roblox/platform/http/interfaces/PlatformChatInterface;->markConversations(Lll/b;)Lsw/d;

    move-result-object p1

    invoke-interface {p1}, Lsw/d;->j()Lsw/x;

    move-result-object p1

    invoke-virtual {p1}, Lsw/x;->a()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p1, Lmv/i0;

    invoke-virtual {p1}, Lmv/i0;->h()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    :goto_0
    invoke-static {p1}, Lgu/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
