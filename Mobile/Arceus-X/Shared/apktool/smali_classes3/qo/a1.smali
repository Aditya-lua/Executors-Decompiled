.class public final synthetic Lqo/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

.field public final synthetic c:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;


# direct methods
.method public synthetic constructor <init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqo/a1;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iput-object p2, p0, Lqo/a1;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    iput-object p3, p0, Lqo/a1;->c:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lqo/a1;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iget-object v1, p0, Lqo/a1;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    iget-object v2, p0, Lqo/a1;->c:Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;

    invoke-static {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->C(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
