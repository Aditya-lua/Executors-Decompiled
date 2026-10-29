.class public final Lcom/withpersona/sdk2/inquiry/internal/network/e$e;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/internal/network/e;->l(Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/lang/Integer;",
        "Lnt/b<",
        "-",
        "Ljava/lang/Boolean;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "attempt",
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
    c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$makeInquiryCallWithRetry$2"
    f = "InquiryApiHelper.kt"
    l = {
        0x18f,
        0x193
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public synthetic u:I

.field public final synthetic v:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lnt/b<",
            "-",
            "Ljv/x<",
            "Lokhttp3/ResponseBody;",
            ">;>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic w:Lkotlin/jvm/internal/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/c0<",
            "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/c0;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lnt/b<",
            "-",
            "Ljv/x<",
            "Lokhttp3/ResponseBody;",
            ">;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/internal/c0<",
            "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;",
            ">;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/internal/network/e$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$e;->v:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$e;->w:Lkotlin/jvm/internal/c0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lpt/m;-><init>(ILnt/b;)V

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

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$e;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$e;->v:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$e;->w:Lkotlin/jvm/internal/c0;

    invoke-direct {v0, v1, v2, p2}, Lcom/withpersona/sdk2/inquiry/internal/network/e$e;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/c0;Lnt/b;)V

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iput p1, v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$e;->u:I

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/network/e$e;->q(ILnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$e;->u:I

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$e;->t:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    :try_start_0
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    if-lez v0, :cond_3

    iput v0, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$e;->u:I

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$e;->t:I

    const-wide/16 v5, 0x3e8

    invoke-static {v5, v6, p0}, Lku/z0;->b(JLnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    :try_start_1
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$e;->v:Lkotlin/jvm/functions/Function1;

    iput v0, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$e;->u:I

    iput v3, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$e;->t:I

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    :goto_1
    return-object v1

    :cond_4
    :goto_2
    check-cast p1, Ljv/x;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    invoke-virtual {p1}, Ljv/x;->g()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->toErrorInfo(Ljv/x;)Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    move-result-object p1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$e;->w:Lkotlin/jvm/internal/c0;

    iput-object p1, v0, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;->isRecoverable()Z

    move-result p1

    invoke-static {p1}, Lpt/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_5
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$e;->w:Lkotlin/jvm/internal/c0;

    const/4 v0, 0x0

    iput-object v0, p1, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-static {p1}, Lpt/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :goto_3
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$e;->w:Lkotlin/jvm/internal/c0;

    new-instance v5, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v7

    const/16 v10, 0x8

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;-><init>(ILjava/lang/String;ZLcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v5, v0, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    invoke-static {v4}, Lpt/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final q(ILnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lnt/b<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/network/e$e;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/network/e$e;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/network/e$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
