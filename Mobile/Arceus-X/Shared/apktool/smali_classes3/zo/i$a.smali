.class public final Lzo/i$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzo/i;->f(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Lku/d2;
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
    c = "com.withpersona.sdk2.inquiry.internal.ErrorReportingManager$reportError$1"
    f = "ErrorReportingManager.kt"
    l = {
        0x25
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lzo/i;

.field public final synthetic v:Ljava/lang/String;

.field public final synthetic w:Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;


# direct methods
.method public constructor <init>(Lzo/i;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzo/i;",
            "Ljava/lang/String;",
            "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;",
            "Lnt/b<",
            "-",
            "Lzo/i$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lzo/i$a;->u:Lzo/i;

    iput-object p2, p0, Lzo/i$a;->v:Ljava/lang/String;

    iput-object p3, p0, Lzo/i$a;->w:Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

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

    new-instance p1, Lzo/i$a;

    iget-object v0, p0, Lzo/i$a;->u:Lzo/i;

    iget-object v1, p0, Lzo/i$a;->v:Ljava/lang/String;

    iget-object v2, p0, Lzo/i$a;->w:Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    invoke-direct {p1, v0, v1, v2, p2}, Lzo/i$a;-><init>(Lzo/i;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lzo/i$a;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lzo/i$a;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lzo/i$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lzo/i$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lzo/i$a;->t:I

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

    iget-object p1, p0, Lzo/i$a;->u:Lzo/i;

    invoke-static {p1}, Lzo/i;->a(Lzo/i;)Lgp/w;

    move-result-object p1

    iget-object v1, p0, Lzo/i$a;->v:Ljava/lang/String;

    new-instance v3, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest;

    iget-object v4, p0, Lzo/i$a;->w:Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    invoke-static {v4}, Lcom/withpersona/sdk2/inquiry/internal/network/c;->a(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;

    move-result-object v4

    iget-object v5, p0, Lzo/i$a;->u:Lzo/i;

    invoke-static {v5}, Lzo/i;->c(Lzo/i;)Lum/w;

    move-result-object v5

    const-class v6, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    invoke-virtual {v5, v6}, Lum/w;->c(Ljava/lang/Class;)Lum/h;

    move-result-object v5

    iget-object v6, p0, Lzo/i$a;->w:Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    invoke-virtual {v5, v6}, Lum/h;->toJsonValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest;-><init>(Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;Ljava/lang/Object;)V

    iput v2, p0, Lzo/i$a;->t:I

    invoke-interface {p1, v1, v3, p0}, Lgp/w;->c(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
