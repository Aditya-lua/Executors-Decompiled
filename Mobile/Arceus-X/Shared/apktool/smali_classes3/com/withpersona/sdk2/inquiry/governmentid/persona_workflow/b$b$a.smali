.class public final Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnu/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lnu/i;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V
    .locals 0

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$b$a;->a:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lnt/b;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$b$a;->a:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;

    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v1

    invoke-virtual {v1}, Lvr/f;->i()Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    if-nez v1, :cond_0

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_0
    invoke-static {v0, p1, v1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->W(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$b$a;->b(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
