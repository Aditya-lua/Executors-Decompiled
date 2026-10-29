.class public final Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$f;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment;->G2(Lcom/withpersona/sdk2/inquiry/governmentid/Screen;Lkotlin/jvm/functions/Function0;)V
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
    c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$finalizeVideoCaptureThenBind$1"
    f = "GovernmentIdStepFragment.kt"
    l = {
        0x157
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lfn/g;

.field public final synthetic v:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic w:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment;

.field public final synthetic x:Lcom/withpersona/sdk2/inquiry/governmentid/Screen;


# direct methods
.method public constructor <init>(Lfn/g;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment;Lcom/withpersona/sdk2/inquiry/governmentid/Screen;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfn/g;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$f;->u:Lfn/g;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$f;->v:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$f;->w:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$f;->x:Lcom/withpersona/sdk2/inquiry/governmentid/Screen;

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

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$f;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$f;->u:Lfn/g;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$f;->v:Lkotlin/jvm/functions/Function0;

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$f;->w:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$f;->x:Lcom/withpersona/sdk2/inquiry/governmentid/Screen;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$f;-><init>(Lfn/g;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment;Lcom/withpersona/sdk2/inquiry/governmentid/Screen;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$f;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$f;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$f;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$f;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    check-cast p1, Ljt/n;

    invoke-virtual {p1}, Ljt/n;->j()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$f;->u:Lfn/g;

    if-eqz p1, :cond_4

    iput v2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$f;->t:I

    invoke-interface {p1, p0}, Lfn/g;->i(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$f;->w:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$f;->u:Lfn/g;

    invoke-static {p1}, Ljt/n;->h(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    move-object v2, p1

    check-cast v2, Ljava/io/File;

    invoke-static {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment;->u2(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment;)Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/d;->e()Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;

    move-result-object v0

    invoke-interface {v1}, Lfn/g;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->f0(Ljava/io/File;Lcom/withpersona/sdk2/camera/CameraProperties;)V

    :cond_3
    invoke-static {p1}, Ljt/n;->a(Ljava/lang/Object;)Ljt/n;

    :cond_4
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$f;->v:Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$f;->w:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment;->r2(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$f;->w:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$f;->x:Lcom/withpersona/sdk2/inquiry/governmentid/Screen;

    invoke-static {p1, v0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment;->v2(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment;Lcom/withpersona/sdk2/inquiry/governmentid/Screen;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
