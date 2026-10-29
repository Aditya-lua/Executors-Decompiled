.class public final Lcom/withpersona/sdk2/inquiry/internal/network/e$k;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/internal/network/e;->s(Ljava/lang/String;Lyn/c;Lnt/b;)Ljava/lang/Object;
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
        "Ljv/x<",
        "Lokhttp3/ResponseBody;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Ljv/x;",
        "Lokhttp3/ResponseBody;",
        "<anonymous>",
        "()Ljv/x;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$updateInquiryDeviceMetrics$updateInquiryError$1"
    f = "InquiryApiHelper.kt"
    l = {
        0x10e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lcom/withpersona/sdk2/inquiry/internal/network/e;

.field public final synthetic v:Ljava/lang/String;

.field public final synthetic w:Lyn/c;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/network/e;Ljava/lang/String;Lyn/c;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
            "Ljava/lang/String;",
            "Lyn/c;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/internal/network/e$k;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$k;->u:Lcom/withpersona/sdk2/inquiry/internal/network/e;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$k;->v:Ljava/lang/String;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$k;->w:Lyn/c;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Lnt/b;)Lnt/b;
    .locals 4
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

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$k;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$k;->u:Lcom/withpersona/sdk2/inquiry/internal/network/e;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$k;->v:Ljava/lang/String;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$k;->w:Lyn/c;

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/withpersona/sdk2/inquiry/internal/network/e$k;-><init>(Lcom/withpersona/sdk2/inquiry/internal/network/e;Ljava/lang/String;Lyn/c;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnt/b;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/network/e$k;->q(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$k;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$k;->u:Lcom/withpersona/sdk2/inquiry/internal/network/e;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/internal/network/e;->b(Lcom/withpersona/sdk2/inquiry/internal/network/e;)Lgp/w;

    move-result-object p1

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$k;->v:Ljava/lang/String;

    sget-object v3, Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;->b:Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$a;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$k;->w:Lyn/c;

    invoke-virtual {v4}, Lyn/c;->c()Ljava/lang/Long;

    move-result-object v4

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$k;->w:Lyn/c;

    invoke-virtual {v5}, Lyn/c;->d()Ljava/lang/Long;

    move-result-object v5

    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$k;->w:Lyn/c;

    invoke-virtual {v6}, Lyn/c;->a()Ljava/lang/Long;

    move-result-object v6

    iget-object v7, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$k;->w:Lyn/c;

    invoke-virtual {v7}, Lyn/c;->b()Lyn/n;

    move-result-object v7

    if-eqz v7, :cond_2

    invoke-virtual {v7}, Lyn/n;->b()Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    :cond_2
    const/4 v7, 0x0

    :goto_0
    invoke-virtual {v3, v4, v5, v6, v7}, Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$a;->a(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;

    move-result-object v3

    iput v2, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$k;->t:I

    invoke-interface {p1, v1, v3, p0}, Lgp/w;->i(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    return-object p1
.end method

.method public final q(Lnt/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Ljv/x<",
            "Lokhttp3/ResponseBody;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/network/e$k;->create(Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/network/e$k;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/withpersona/sdk2/inquiry/internal/network/e$k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
