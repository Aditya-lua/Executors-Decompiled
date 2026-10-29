.class public final Lcom/withpersona/sdk2/inquiry/document/network/c$f;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/document/network/c;->run()Lnu/h;
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
        "Lcom/withpersona/sdk2/inquiry/document/network/c$b;",
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
        "Lcom/withpersona/sdk2/inquiry/document/network/c$b;",
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
    c = "com.withpersona.sdk2.inquiry.document.network.DocumentFileUploadWorker$run$1"
    f = "DocumentFileUploadWorker.kt"
    l = {
        0x42,
        0x45,
        0xb1
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public final synthetic A:Lcom/withpersona/sdk2/inquiry/document/network/c;

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public y:I

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/document/network/c;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/document/network/c;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/document/network/c$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->A:Lcom/withpersona/sdk2/inquiry/document/network/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lpt/m;-><init>(ILnt/b;)V

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

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->A:Lcom/withpersona/sdk2/inquiry/document/network/c;

    invoke-direct {v0, v1, p2}, Lcom/withpersona/sdk2/inquiry/document/network/c$f;-><init>(Lcom/withpersona/sdk2/inquiry/document/network/c;Lnt/b;)V

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->z:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnu/i;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->q(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->z:Ljava/lang/Object;

    check-cast v1, Lnu/i;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v2

    iget v3, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->y:I

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v3, :cond_3

    if-eq v3, v6, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->x:Ljava/lang/Object;

    check-cast v1, Lnu/h;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->w:Ljava/lang/Object;

    check-cast v1, Lnu/h;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->v:Ljava/lang/Object;

    check-cast v1, Lku/w0;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->u:Ljava/lang/Object;

    check-cast v1, Lbo/d;

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->t:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->u:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->t:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->t:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    move-object/from16 v7, p1

    goto :goto_0

    :cond_3
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->A:Lcom/withpersona/sdk2/inquiry/document/network/c;

    invoke-static {v3}, Lcom/withpersona/sdk2/inquiry/document/network/c;->g(Lcom/withpersona/sdk2/inquiry/document/network/c;)Ljq/k;

    move-result-object v3

    iget-object v7, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->A:Lcom/withpersona/sdk2/inquiry/document/network/c;

    invoke-static {v7}, Lcom/withpersona/sdk2/inquiry/document/network/c;->h(Lcom/withpersona/sdk2/inquiry/document/network/c;)Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    move-result-object v7

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;->g()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v3, v7}, Ljq/k;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v7, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->A:Lcom/withpersona/sdk2/inquiry/document/network/c;

    invoke-static {v7}, Lcom/withpersona/sdk2/inquiry/document/network/c;->l(Lcom/withpersona/sdk2/inquiry/document/network/c;)Z

    move-result v7

    if-eqz v7, :cond_6

    iget-object v7, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->A:Lcom/withpersona/sdk2/inquiry/document/network/c;

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->z:Ljava/lang/Object;

    iput-object v3, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->t:Ljava/lang/Object;

    iput v6, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->y:I

    invoke-static {v7, v0}, Lcom/withpersona/sdk2/inquiry/document/network/c;->e(Lcom/withpersona/sdk2/inquiry/document/network/c;Lnt/b;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v2, :cond_4

    goto/16 :goto_2

    :cond_4
    :goto_0
    check-cast v7, Ljava/util/List;

    move-object v8, v7

    check-cast v8, Ljava/util/Collection;

    if-eqz v8, :cond_6

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_5

    goto :goto_1

    :cond_5
    iget-object v8, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->A:Lcom/withpersona/sdk2/inquiry/document/network/c;

    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData;

    invoke-virtual {v9}, Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData;->b()Ljava/lang/String;

    move-result-object v9

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->z:Ljava/lang/Object;

    iput-object v3, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->t:Ljava/lang/Object;

    invoke-static {v7}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->u:Ljava/lang/Object;

    iput v5, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->y:I

    invoke-static {v8, v9, v0}, Lcom/withpersona/sdk2/inquiry/document/network/c;->d(Lcom/withpersona/sdk2/inquiry/document/network/c;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v2, :cond_6

    goto/16 :goto_2

    :cond_6
    :goto_1
    new-instance v7, Lbo/d;

    new-instance v8, Ljava/io/File;

    iget-object v9, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->A:Lcom/withpersona/sdk2/inquiry/document/network/c;

    invoke-static {v9}, Lcom/withpersona/sdk2/inquiry/document/network/c;->h(Lcom/withpersona/sdk2/inquiry/document/network/c;)Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    move-result-object v9

    invoke-virtual {v9}, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;->g()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    sget-object v9, Lokhttp3/MediaType;->Companion:Lokhttp3/MediaType$Companion;

    invoke-virtual {v9, v3}, Lokhttp3/MediaType$Companion;->parse(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v9

    invoke-direct {v7, v8, v9}, Lbo/d;-><init>(Ljava/io/File;Lokhttp3/MediaType;)V

    iget-object v8, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->A:Lcom/withpersona/sdk2/inquiry/document/network/c;

    invoke-static {v8}, Lcom/withpersona/sdk2/inquiry/document/network/c;->j(Lcom/withpersona/sdk2/inquiry/document/network/c;)Lku/p0;

    move-result-object v9

    invoke-static {}, Lku/g1;->b()Lku/l0;

    move-result-object v10

    new-instance v12, Lcom/withpersona/sdk2/inquiry/document/network/c$f$c;

    iget-object v8, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->A:Lcom/withpersona/sdk2/inquiry/document/network/c;

    const/4 v15, 0x0

    invoke-direct {v12, v8, v7, v15}, Lcom/withpersona/sdk2/inquiry/document/network/c$f$c;-><init>(Lcom/withpersona/sdk2/inquiry/document/network/c;Lbo/d;Lnt/b;)V

    const/4 v13, 0x2

    const/4 v14, 0x0

    const/4 v11, 0x0

    invoke-static/range {v9 .. v14}, Lku/i;->b(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/w0;

    move-result-object v8

    new-instance v9, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;

    iget-object v10, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->A:Lcom/withpersona/sdk2/inquiry/document/network/c;

    invoke-direct {v9, v8, v10, v15}, Lcom/withpersona/sdk2/inquiry/document/network/c$f$d;-><init>(Lku/w0;Lcom/withpersona/sdk2/inquiry/document/network/c;Lnt/b;)V

    invoke-static {v9}, Lnu/j;->w(Lkotlin/jvm/functions/Function2;)Lnu/h;

    move-result-object v9

    new-instance v10, Lcom/withpersona/sdk2/inquiry/document/network/c$f$b;

    invoke-direct {v10, v7, v15}, Lcom/withpersona/sdk2/inquiry/document/network/c$f$b;-><init>(Lbo/d;Lnt/b;)V

    invoke-static {v10}, Lnu/j;->w(Lkotlin/jvm/functions/Function2;)Lnu/h;

    move-result-object v10

    new-array v5, v5, [Lnu/h;

    const/4 v11, 0x0

    aput-object v9, v5, v11

    aput-object v10, v5, v6

    invoke-static {v5}, Lnu/j;->C([Lnu/h;)Lnu/h;

    move-result-object v5

    new-instance v6, Lcom/withpersona/sdk2/inquiry/document/network/c$f$a;

    invoke-direct {v6, v1}, Lcom/withpersona/sdk2/inquiry/document/network/c$f$a;-><init>(Lnu/i;)V

    invoke-static {v1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->z:Ljava/lang/Object;

    invoke-static {v3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->t:Ljava/lang/Object;

    invoke-static {v7}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->u:Ljava/lang/Object;

    invoke-static {v8}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->v:Ljava/lang/Object;

    invoke-static {v9}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->w:Ljava/lang/Object;

    invoke-static {v10}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->x:Ljava/lang/Object;

    iput v4, v0, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->y:I

    invoke-interface {v5, v6, v0}, Lnu/h;->collect(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_7

    :goto_2
    return-object v2

    :cond_7
    :goto_3
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v1
.end method

.method public final q(Lnu/i;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/i<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/document/network/c$b;",
            ">;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/network/c$f;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/document/network/c$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
