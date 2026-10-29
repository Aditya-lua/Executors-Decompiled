.class public final Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->run()Lnu/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lnu/i<",
        "-",
        "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;",
        ">;",
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lnu/i;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;",
        "",
        "<anonymous>",
        "(Lnu/i;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker$run$1"
    f = "AutoClassifyWorker.kt"
    l = {
        0x5e,
        0x60,
        0x8c,
        0x9a,
        0xa0,
        0xab,
        0xb4,
        0xbd,
        0xc3,
        0xc7
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public A:I

.field public B:I

.field public C:I

.field public synthetic D:Ljava/lang/Object;

.field public final synthetic E:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:I


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->E:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method

.method public static final r(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;Lcom/withpersona/sdk2/inquiry/governmentid/Frame;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lokhttp3/MultipartBody$Part;",
            ">;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/Frame;",
            ")V"
        }
    .end annotation

    sget-object v0, Lokhttp3/MultipartBody$Part;->Companion:Lokhttp3/MultipartBody$Part$Companion;

    new-instance v1, Ljava/io/File;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/governmentid/Frame;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lokhttp3/RequestBody;->Companion:Lokhttp3/RequestBody$Companion;

    new-instance v3, Ljava/io/File;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/governmentid/Frame;->a()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sget-object v4, Lokhttp3/MediaType;->Companion:Lokhttp3/MediaType$Companion;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/governmentid/Frame;->f()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lokhttp3/MediaType$Companion;->parse(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lokhttp3/RequestBody$Companion;->create(Ljava/io/File;Lokhttp3/MediaType;)Lokhttp3/RequestBody;

    move-result-object v2

    const-string v3, "data[attributes][image]"

    invoke-virtual {v0, v3, v1, v2}, Lokhttp3/MultipartBody$Part$Companion;->createFormData(Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Part;

    move-result-object v1

    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->e(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->i(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;)Lfn/u0;

    move-result-object p1

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/governmentid/Frame;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lfn/u0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string p2, "data[attributes][client_extracted_text]"

    invoke-virtual {v0, p2, p1}, Lokhttp3/MultipartBody$Part$Companion;->createFormData(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/MultipartBody$Part;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 2
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

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->E:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;

    invoke-direct {v0, v1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;Lnt/b;)V

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->D:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnu/i;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->q(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->D:Ljava/lang/Object;

    check-cast v0, Lnu/i;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->C:I

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->v:Ljava/lang/Object;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->u:Ljava/lang/Object;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->t:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_1
    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->w:Ljava/lang/Object;

    check-cast v2, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;

    :pswitch_2
    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->v:Ljava/lang/Object;

    check-cast v2, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->u:Ljava/lang/Object;

    check-cast v2, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->t:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_3
    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->t:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    move-object v3, v2

    goto/16 :goto_2

    :pswitch_4
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->w:Ljava/lang/Object;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/governmentid/Frame;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->u:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->t:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_5
    iget v2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->A:I

    iget v6, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->z:I

    iget-object v7, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->y:Ljava/lang/Object;

    check-cast v7, Lcom/withpersona/sdk2/inquiry/governmentid/Frame;

    iget-object v8, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->x:Ljava/lang/Object;

    iget-object v9, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->w:Ljava/lang/Object;

    check-cast v9, Ljava/util/Iterator;

    iget-object v10, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->v:Ljava/lang/Object;

    check-cast v10, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;

    iget-object v11, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->u:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Iterable;

    iget-object v12, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->t:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    check-cast p1, Ljt/n;

    invoke-virtual {p1}, Ljt/n;->j()Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_0

    :pswitch_6
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    sget-object p1, Lokhttp3/MultipartBody$Part;->Companion:Lokhttp3/MultipartBody$Part$Companion;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->E:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;

    invoke-static {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->k(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;)Ljava/lang/String;

    move-result-object v2

    const-string v6, "data[id]"

    invoke-virtual {p1, v6, v2}, Lokhttp3/MultipartBody$Part$Companion;->createFormData(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/MultipartBody$Part;

    move-result-object v2

    const-string v6, "data[type]"

    const-string v7, "inquiry"

    invoke-virtual {p1, v6, v7}, Lokhttp3/MultipartBody$Part$Companion;->createFormData(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/MultipartBody$Part;

    move-result-object v6

    iget-object v7, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->E:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;

    invoke-static {v7}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->f(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "meta[from_component]"

    invoke-virtual {p1, v8, v7}, Lokhttp3/MultipartBody$Part$Companion;->createFormData(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/MultipartBody$Part;

    move-result-object v7

    iget-object v8, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->E:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;

    invoke-static {v8}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->g(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "meta[from_step]"

    invoke-virtual {p1, v9, v8}, Lokhttp3/MultipartBody$Part$Companion;->createFormData(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/MultipartBody$Part;

    move-result-object p1

    filled-new-array {v2, v6, v7, p1}, [Lokhttp3/MultipartBody$Part;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/p;->p([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->E:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;

    invoke-static {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->h(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;

    move-result-object v2

    invoke-interface {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;->d3()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->E:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move-object v12, p1

    move-object v11, v2

    move-object v10, v6

    move-object v9, v7

    move v6, v4

    :cond_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v7, v8

    check-cast v7, Lcom/withpersona/sdk2/inquiry/governmentid/Frame;

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/governmentid/Frame;->f()Ljava/lang/String;

    move-result-object p1

    const-string v2, "image/"

    invoke-static {p1, v2, v4, v3, v5}, Lkotlin/text/x;->T(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {v10}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->j(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;)Lrq/a;

    move-result-object p1

    new-instance v2, Ljava/io/File;

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/governmentid/Frame;->a()Ljava/lang/String;

    move-result-object v13

    invoke-direct {v2, v13}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->D:Ljava/lang/Object;

    iput-object v12, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->t:Ljava/lang/Object;

    invoke-static {v11}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    iput-object v13, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->u:Ljava/lang/Object;

    iput-object v10, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->v:Ljava/lang/Object;

    iput-object v9, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->w:Ljava/lang/Object;

    invoke-static {v8}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    iput-object v13, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->x:Ljava/lang/Object;

    invoke-static {v7}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    iput-object v13, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->y:Ljava/lang/Object;

    iput v6, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->z:I

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->A:I

    const/4 v13, 0x1

    iput v13, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->C:I

    invoke-interface {p1, v2, p0}, Lrq/a;->a(Ljava/io/File;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_1

    goto/16 :goto_4

    :cond_1
    move v2, v4

    :goto_0
    invoke-static {p1}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v9, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$a;

    new-instance v10, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;

    const-string v13, "Error processing image file in AutoClassifyWorker."

    invoke-direct {v10, v13}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;-><init>(Ljava/lang/String;)V

    invoke-direct {v9, v10}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->D:Ljava/lang/Object;

    invoke-static {v12}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->t:Ljava/lang/Object;

    invoke-static {v11}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->u:Ljava/lang/Object;

    invoke-static {v8}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->v:Ljava/lang/Object;

    invoke-static {v7}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->w:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->x:Ljava/lang/Object;

    iput-object v5, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->y:Ljava/lang/Object;

    iput v6, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->z:I

    iput v2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->A:I

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->B:I

    iput v3, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->C:I

    invoke-interface {v0, v9, p0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    goto/16 :goto_4

    :cond_2
    :goto_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_3
    sget-object p1, Lokhttp3/MultipartBody$Part;->Companion:Lokhttp3/MultipartBody$Part$Companion;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->E:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;

    invoke-static {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->h(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;

    move-result-object v2

    invoke-interface {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;->a3()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "data[attributes][files][][capture_method]"

    invoke-virtual {p1, v3, v2}, Lokhttp3/MultipartBody$Part$Companion;->createFormData(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/MultipartBody$Part;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {v12, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->E:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->h(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;

    move-result-object v2

    invoke-interface {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;->d3()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/governmentid/Frame;

    invoke-static {v12, p1, v2}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->r(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;Lcom/withpersona/sdk2/inquiry/governmentid/Frame;)V

    new-instance p1, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d$a;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->E:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;

    invoke-direct {p1, v2, v12, v5}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d$a;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;Ljava/util/List;Lnt/b;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->D:Ljava/lang/Object;

    invoke-static {v12}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->t:Ljava/lang/Object;

    iput-object v5, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->u:Ljava/lang/Object;

    iput-object v5, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->v:Ljava/lang/Object;

    iput-object v5, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->w:Ljava/lang/Object;

    iput-object v5, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->x:Ljava/lang/Object;

    iput-object v5, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->y:Ljava/lang/Object;

    const/4 v2, 0x3

    iput v2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->C:I

    invoke-static {p1, p0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->enqueueVerificationRequestWithRetry(Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto/16 :goto_4

    :cond_4
    move-object v3, v12

    :goto_2
    move-object v2, p1

    check-cast v2, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->E:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;

    instance-of v6, v2, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;

    if-eqz v6, :cond_b

    move-object v6, v2

    check-cast v6, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;->getResponse()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse;

    const-string v7, "Unexpected network response."

    if-eqz v6, :cond_a

    instance-of v8, v6, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdAcceptedResponse;

    if-eqz v8, :cond_6

    move-object v8, v6

    check-cast v8, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdAcceptedResponse;

    invoke-virtual {v8}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdAcceptedResponse;->g()Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;

    move-result-object v9

    invoke-virtual {v8}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdAcceptedResponse;->a()Ljava/lang/String;

    move-result-object v10

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->d(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;)J

    move-result-wide v11

    invoke-static {v9, v10, v11, v12}, Lcom/withpersona/sdk2/inquiry/governmentid/d;->o(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;Ljava/lang/String;J)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;

    move-result-object p1

    if-nez p1, :cond_5

    new-instance v8, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$a;

    new-instance v9, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;

    invoke-direct {v9, v7}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;-><init>(Ljava/lang/String;)V

    invoke-direct {v8, v9}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->D:Ljava/lang/Object;

    invoke-static {v3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->t:Ljava/lang/Object;

    iput-object v2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->u:Ljava/lang/Object;

    invoke-static {v6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->v:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->w:Ljava/lang/Object;

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->z:I

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->A:I

    const/4 p1, 0x4

    iput p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->C:I

    invoke-interface {v0, v8, p0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    goto/16 :goto_4

    :cond_5
    new-instance v7, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$b;

    new-instance v9, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$a;

    invoke-virtual {v8}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdAcceptedResponse;->a()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v9, v8, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$a;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;)V

    invoke-direct {v7, v9}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$b;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->D:Ljava/lang/Object;

    invoke-static {v3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->t:Ljava/lang/Object;

    iput-object v2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->u:Ljava/lang/Object;

    invoke-static {v6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->v:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->w:Ljava/lang/Object;

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->z:I

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->A:I

    const/4 p1, 0x5

    iput p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->C:I

    invoke-interface {v0, v7, p0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    goto/16 :goto_4

    :cond_6
    instance-of v8, v6, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$ClassificationFailedResponse;

    if-eqz v8, :cond_7

    new-instance v7, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$b;

    new-instance v8, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$c;

    move-object v9, v6

    check-cast v9, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$ClassificationFailedResponse;

    invoke-virtual {v9}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$ClassificationFailedResponse;->a()Ljava/util/List;

    move-result-object v9

    invoke-static {p1, v9}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->o(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v8, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$c;-><init>(Ljava/util/List;)V

    invoke-direct {v7, v8}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$b;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->D:Ljava/lang/Object;

    invoke-static {v3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->t:Ljava/lang/Object;

    iput-object v2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->u:Ljava/lang/Object;

    invoke-static {v6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->v:Ljava/lang/Object;

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->z:I

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->A:I

    const/4 p1, 0x6

    iput p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->C:I

    invoke-interface {v0, v7, p0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    goto/16 :goto_4

    :cond_7
    instance-of v8, v6, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdRejectedResponse;

    if-eqz v8, :cond_8

    new-instance v7, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$b;

    new-instance v8, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$b;

    move-object v9, v6

    check-cast v9, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdRejectedResponse;

    invoke-virtual {v9}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$IdRejectedResponse;->a()Ljava/util/List;

    move-result-object v9

    invoke-static {p1, v9}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;->o(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v8, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a$b;-><init>(Ljava/util/List;)V

    invoke-direct {v7, v8}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$b;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$a;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->D:Ljava/lang/Object;

    invoke-static {v3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->t:Ljava/lang/Object;

    iput-object v2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->u:Ljava/lang/Object;

    invoke-static {v6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->v:Ljava/lang/Object;

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->z:I

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->A:I

    const/4 p1, 0x7

    iput p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->C:I

    invoke-interface {v0, v7, p0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    goto/16 :goto_4

    :cond_8
    sget-object p1, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$Unknown;->a:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyResponse$Unknown;

    invoke-static {v6, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    new-instance p1, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$a;

    new-instance v8, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;

    invoke-direct {v8, v7}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v8}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->D:Ljava/lang/Object;

    invoke-static {v3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->t:Ljava/lang/Object;

    iput-object v2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->u:Ljava/lang/Object;

    invoke-static {v6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->v:Ljava/lang/Object;

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->z:I

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->A:I

    const/16 v6, 0x8

    iput v6, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->C:I

    invoke-interface {v0, p1, p0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    goto :goto_4

    :cond_9
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1

    :cond_a
    new-instance p1, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$a;

    new-instance v8, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;

    invoke-direct {v8, v7}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v8}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->D:Ljava/lang/Object;

    invoke-static {v3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->t:Ljava/lang/Object;

    iput-object v2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->u:Ljava/lang/Object;

    invoke-static {v6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->v:Ljava/lang/Object;

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->z:I

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->A:I

    const/16 v6, 0x9

    iput v6, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->C:I

    invoke-interface {v0, p1, p0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    goto :goto_4

    :cond_b
    :goto_3
    instance-of p1, v2, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;

    if-eqz p1, :cond_c

    move-object p1, v2

    check-cast p1, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;->getNetworkErrorInfo()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    move-result-object p1

    new-instance v6, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$a;

    invoke-direct {v6, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->D:Ljava/lang/Object;

    invoke-static {v3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->t:Ljava/lang/Object;

    iput-object v2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->u:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->v:Ljava/lang/Object;

    iput-object v5, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->w:Ljava/lang/Object;

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->z:I

    iput v4, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->A:I

    const/16 p1, 0xa

    iput p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->C:I

    invoke-interface {v0, v6, p0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_c

    :goto_4
    return-object v1

    :cond_c
    :goto_5
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Lnu/i;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/i<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$c;",
            ">;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
