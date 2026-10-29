.class public final Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler$b;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->acquireProof(JLcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;)V
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
    c = "com.roblox.protocols.externalidentity.ExternalIdentityHandler$acquireProof$1"
    f = "ExternalIdentityHandler.kt"
    l = {
        0x67
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lj/b;

.field public final synthetic v:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;

.field public final synthetic w:J


# direct methods
.method public constructor <init>(Lj/b;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;JLnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/b;",
            "Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;",
            "J",
            "Lnt/b<",
            "-",
            "Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler$b;->u:Lj/b;

    iput-object p2, p0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler$b;->v:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;

    iput-wide p3, p0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler$b;->w:J

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

    new-instance v0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler$b;

    iget-object v1, p0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler$b;->u:Lj/b;

    iget-object v2, p0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler$b;->v:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;

    iget-wide v3, p0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler$b;->w:J

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler$b;-><init>(Lj/b;Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;JLnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler$b;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler$b;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler$b;->t:I

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

    new-instance p1, Lfm/f;

    iget-object v1, p0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler$b;->u:Lj/b;

    invoke-direct {p1, v1}, Lfm/f;-><init>(Lj/b;)V

    iget-object v1, p0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler$b;->v:Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;

    invoke-virtual {v1}, Lcom/roblox/protocols/externalidentityplatforminterface/generated/ExternalIdentityRequest;->getNonce()Ljava/lang/String;

    move-result-object v1

    const-string v3, "getNonce(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lfm/f;->c(Ljava/lang/String;)Lnu/h;

    move-result-object p1

    new-instance v1, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler$b$a;

    iget-wide v3, p0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler$b;->w:J

    invoke-direct {v1, v3, v4}, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler$b$a;-><init>(J)V

    iput v2, p0, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler$b;->t:I

    invoke-interface {p1, v1, p0}, Lnu/h;->collect(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
