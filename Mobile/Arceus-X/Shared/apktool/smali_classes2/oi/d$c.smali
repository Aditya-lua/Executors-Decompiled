.class public final Loi/d$c;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loi/d;->b(JLjava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;
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
        "Ljt/n<",
        "+",
        "Ljava/lang/String;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lku/p0;",
        "Ljt/n;",
        "",
        "<anonymous>",
        "(Lku/p0;)Ljt/n;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.roblox.client.job.ChatJobsKt$sendChatMessage$2"
    f = "ChatJobs.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Ljava/lang/String;

.field public final synthetic v:Ljava/lang/String;

.field public final synthetic w:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JLnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "J",
            "Lnt/b<",
            "-",
            "Loi/d$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loi/d$c;->u:Ljava/lang/String;

    iput-object p2, p0, Loi/d$c;->v:Ljava/lang/String;

    iput-wide p3, p0, Loi/d$c;->w:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 6
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

    new-instance v0, Loi/d$c;

    iget-object v1, p0, Loi/d$c;->u:Ljava/lang/String;

    iget-object v2, p0, Loi/d$c;->v:Ljava/lang/String;

    iget-wide v3, p0, Loi/d$c;->w:J

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Loi/d$c;-><init>(Ljava/lang/String;Ljava/lang/String;JLnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Loi/d$c;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
            "Ljt/n<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Loi/d$c;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Loi/d$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Loi/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    iget v0, p0, Loi/d$c;->t:I

    if-nez v0, :cond_3

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Loi/d$c;->u:Ljava/lang/String;

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->s2()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lvk/g;->d()Lvk/d;

    move-result-object v0

    invoke-interface {v0}, Lvk/d;->d()Lzk/k;

    move-result-object v0

    new-instance v1, Lbl/c;

    iget-object v2, p0, Loi/d$c;->v:Ljava/lang/String;

    invoke-direct {v1, v2, p1}, Lbl/c;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lzk/k;->d(Lbl/c;)Ljv/d;

    move-result-object p1

    invoke-interface {p1}, Ljv/d;->execute()Ljv/x;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lvk/g;->d()Lvk/d;

    move-result-object v0

    invoke-interface {v0}, Lvk/d;->d()Lzk/k;

    move-result-object v0

    new-instance v1, Lbl/d;

    iget-wide v2, p0, Loi/d$c;->w:J

    invoke-direct {v1, v2, v3, p1}, Lbl/d;-><init>(J[Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lzk/k;->a(Lbl/d;)Ljv/d;

    move-result-object p1

    invoke-interface {p1}, Ljv/d;->execute()Ljv/x;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Ljv/x;->a()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p1, Lokhttp3/ResponseBody;

    invoke-virtual {p1}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "messages"

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_2

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object p1

    const-string v0, "status"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "success"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v0, Ljt/n;->b:Ljt/n$a;

    const-string v0, "id"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_1
    sget-object p1, Ljt/n;->b:Ljt/n$a;

    new-instance p1, Loi/e;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string v1, "Send Failed"

    invoke-direct {p1, v0, v1}, Loi/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_1

    :cond_2
    sget-object p1, Ljt/n;->b:Ljt/n$a;

    new-instance p1, Loi/e;

    const-string v0, "failed"

    const-string v1, "No messages in the response"

    invoke-direct {p1, v0, v1}, Loi/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_1
    invoke-static {p1}, Ljt/n;->a(Ljava/lang/Object;)Ljt/n;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
