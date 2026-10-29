.class public final Lcom/withpersona/sdk2/inquiry/internal/network/e$m;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/internal/network/e;->t(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Lnt/b;)Ljava/lang/Object;
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
    c = "com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper$updateInquiryInternal$updateInquiryError$1"
    f = "InquiryApiHelper.kt"
    l = {
        0x176
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lcom/withpersona/sdk2/inquiry/internal/network/e;

.field public final synthetic v:Ljava/lang/String;

.field public final synthetic w:Ltq/a;

.field public final synthetic x:Lxn/a;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/network/e;Ljava/lang/String;Ltq/a;Lxn/a;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
            "Ljava/lang/String;",
            "Ltq/a;",
            "Lxn/a;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/internal/network/e$m;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$m;->u:Lcom/withpersona/sdk2/inquiry/internal/network/e;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$m;->v:Ljava/lang/String;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$m;->w:Ltq/a;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$m;->x:Lxn/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Lnt/b;)Lnt/b;
    .locals 6
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

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/network/e$m;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$m;->u:Lcom/withpersona/sdk2/inquiry/internal/network/e;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$m;->v:Ljava/lang/String;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$m;->w:Ltq/a;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$m;->x:Lxn/a;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/internal/network/e$m;-><init>(Lcom/withpersona/sdk2/inquiry/internal/network/e;Ljava/lang/String;Ltq/a;Lxn/a;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnt/b;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/network/e$m;->q(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$m;->t:I

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

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$m;->u:Lcom/withpersona/sdk2/inquiry/internal/network/e;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/internal/network/e;->b(Lcom/withpersona/sdk2/inquiry/internal/network/e;)Lgp/w;

    move-result-object p1

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$m;->v:Ljava/lang/String;

    sget-object v3, Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;->b:Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$a;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$m;->w:Ltq/a;

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ltq/a;->a()Landroid/location/Location;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Landroid/location/Location;->getLatitude()D

    move-result-wide v6

    invoke-static {v6, v7}, Lpt/b;->b(D)Ljava/lang/Double;

    move-result-object v4

    goto :goto_0

    :cond_2
    move-object v4, v5

    :goto_0
    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$m;->w:Ltq/a;

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Ltq/a;->a()Landroid/location/Location;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Landroid/location/Location;->getLongitude()D

    move-result-wide v6

    invoke-static {v6, v7}, Lpt/b;->b(D)Ljava/lang/Double;

    move-result-object v6

    goto :goto_1

    :cond_3
    move-object v6, v5

    :goto_1
    iget-object v7, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$m;->w:Ltq/a;

    if-eqz v7, :cond_4

    invoke-virtual {v7}, Ltq/a;->b()Ltq/b;

    move-result-object v7

    if-eqz v7, :cond_4

    invoke-static {v7}, Ltq/c;->a(Ltq/b;)Ljava/lang/String;

    move-result-object v7

    goto :goto_2

    :cond_4
    move-object v7, v5

    :goto_2
    iget-object v8, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$m;->x:Lxn/a;

    if-eqz v8, :cond_7

    invoke-virtual {v8}, Lxn/a;->b()Ljava/util/Map;

    move-result-object v8

    if-eqz v8, :cond_7

    new-instance v5, Ljava/util/ArrayList;

    invoke-interface {v8}, Ljava/util/Map;->size()I

    move-result v9

    invoke-direct {v5, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v8}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map$Entry;

    new-instance v10, Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$AppdomeThreatEvent;

    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lxn/a$b;

    invoke-virtual {v12}, Lxn/a$b;->b()Ljava/lang/String;

    move-result-object v12

    const-string v13, ""

    if-nez v12, :cond_5

    move-object v12, v13

    :cond_5
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lxn/a$b;

    invoke-virtual {v9}, Lxn/a$b;->a()Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_6

    goto :goto_4

    :cond_6
    move-object v13, v9

    :goto_4
    invoke-direct {v10, v11, v12, v13}, Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$AppdomeThreatEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v5, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    invoke-virtual {v3, v6, v4, v7, v5}, Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest$a;->d(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;

    move-result-object v3

    iput v2, p0, Lcom/withpersona/sdk2/inquiry/internal/network/e$m;->t:I

    invoke-interface {p1, v1, v3, p0}, Lgp/w;->i(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/UpdateInquirySessionRequest;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    return-object v0

    :cond_8
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

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/network/e$m;->create(Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/network/e$m;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/withpersona/sdk2/inquiry/internal/network/e$m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
