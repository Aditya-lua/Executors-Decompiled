.class public final Lcom/withpersona/sdk2/inquiry/document/step/b$f;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/document/step/b;->U0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V
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
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
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
    c = "com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager$run$4"
    f = "DocumentStepStateManager.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lcom/withpersona/sdk2/inquiry/document/step/b;

.field public final synthetic v:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/document/step/b;",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/document/step/b$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/step/b$f;->u:Lcom/withpersona/sdk2/inquiry/document/step/b;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/document/step/b$f;->v:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Lnt/b;)Lnt/b;
    .locals 3
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

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/step/b$f;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/document/step/b$f;->u:Lcom/withpersona/sdk2/inquiry/document/step/b;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/step/b$f;->v:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;

    invoke-direct {v0, v1, v2, p1}, Lcom/withpersona/sdk2/inquiry/document/step/b$f;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnt/b;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/step/b$f;->q(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/withpersona/sdk2/inquiry/document/step/b$f;->t:I

    if-nez v0, :cond_1

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/step/b$f;->u:Lcom/withpersona/sdk2/inquiry/document/step/b;

    invoke-virtual {p1}, Lvr/c;->d()Lvr/f;

    move-result-object p1

    invoke-virtual {p1}, Lvr/f;->i()Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    if-nez v0, :cond_0

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_0
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/step/b$f;->u:Lcom/withpersona/sdk2/inquiry/document/step/b;

    invoke-virtual {p1}, Lvr/c;->d()Lvr/f;

    move-result-object p1

    new-instance v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/step/b$f;->v:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;

    check-cast v2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;-><init>(Ljava/lang/String;)V

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->i(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object v0

    invoke-virtual {p1, v0}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final q(Lnt/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/step/b$f;->create(Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/step/b$f;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/withpersona/sdk2/inquiry/document/step/b$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
