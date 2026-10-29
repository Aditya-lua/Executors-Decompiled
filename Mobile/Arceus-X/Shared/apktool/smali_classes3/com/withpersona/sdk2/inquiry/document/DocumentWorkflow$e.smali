.class public final Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$e;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->V0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lym/k$a;)Ljava/lang/Object;
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
    c = "com.withpersona.sdk2.inquiry.document.DocumentWorkflow$render$4"
    f = "DocumentWorkflow.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lym/k$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lym/k<",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;",
            "Ljava/lang/Object;",
            ">.a;"
        }
    .end annotation
.end field

.field public final synthetic v:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;

.field public final synthetic w:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Ljava/lang/String;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;",
            "Ljava/lang/String;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$e;->u:Lym/k$a;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$e;->v:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$e;->w:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method

.method public static synthetic q(Ljava/lang/String;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$e;->r(Ljava/lang/String;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final r(Ljava/lang/String;Lym/r$c;)Lkotlin/Unit;
    .locals 11

    invoke-virtual {p1}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_1
    new-instance v4, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;

    invoke-direct {v4, p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;->m()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;->q()Ljava/lang/String;

    move-result-object v8

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    const/16 v9, 0x74

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p0

    invoke-direct/range {v0 .. v10}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;-><init>(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v0}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
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

    new-instance p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$e;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$e;->u:Lym/k$a;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$e;->v:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$e;->w:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$e;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Ljava/lang/String;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$e;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$e;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$e;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$e;->t:I

    if-nez v0, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$e;->u:Lym/k$a;

    invoke-virtual {p1}, Lym/k$a;->d()Lym/h;

    move-result-object p1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$e;->v:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$e;->w:Ljava/lang/String;

    new-instance v2, Lzn/j2;

    invoke-direct {v2, v1}, Lzn/j2;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v3, v2, v1, v3}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object v0

    invoke-interface {p1, v0}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
